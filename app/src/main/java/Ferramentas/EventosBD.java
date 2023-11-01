package Ferramentas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class EventosBD extends SQLiteOpenHelper {
    //LOGIN COMPLETO FUNCIONANDO
    private Context contexto;

    public EventosBD(Context cont) {
        super(cont, "usuario", null, 1);
        contexto = cont;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String criarTabelaUsuario = "CREATE TABLE IF NOT EXISTS usuario(nome TEXT PRIMARY KEY, senha INTEGER, emailUsuario TEXT)";
        db.execSQL(criarTabelaUsuario);

        final String criarTabelaReservar = "CREATE TABLE IF NOT EXISTS reservar(nomeLivro TEXT PRIMARY KEY, dataRetirada DATE, dataDevolucao DATE)";
        db.execSQL(criarTabelaReservar);

        final String criarTabelaPesquisar = "CREATE TABLE IF NOT EXISTS pesquisar(livro TEXT PRIMARY KEY, editora TEXT, autor TEXT)";
        db.execSQL(criarTabelaPesquisar);

        final String criarTabelaLivro = "CREATE TABLE IF NOT EXISTS livro(isbn INTEGER PRIMARY KEY, editora TEXT, autor TEXT)";
        db.execSQL(criarTabelaLivro);

        final String criarTabelaEditora = "CREATE TABLE IF NOT EXISTS editora(id INTEGER PRIMARY KEY autoincrement, nomeEditora TEXT, emailEditora TEXT, site TEXT)";
        db.execSQL(criarTabelaEditora);

        final String criarTabelaAutor = "CREATE TABLE IF NOT EXISTS autor(id INTEGER PRIMARY KEY, nomeAutor TEXT, nome_abnt TEXT)";
        db.execSQL(criarTabelaAutor);
    }

    //Dados fakes para usuarios do app
    public void insereUsuario() {
        try{
            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues valores = new ContentValues();
            valores.put("nome", "Maria");
            valores.put("senha", 5005);
            valores.put("emailUsuario", "mariaeduarda@gmail.com");
            db.insert("usuario", null, valores);

            valores = new ContentValues();
            valores.put("nome", "Lorena");
            valores.put("senha", 8001);
            valores.put("emailUsuario", "lorenaebs@gmail.com");
            db.insert("usuario", null, valores);

            valores = new ContentValues();
            valores.put("nome", "Samuel");
            valores.put("senha", 9004);
            valores.put("emailUsuario", "samuelantonio@gmail.com");
            db.insert("usuario", null, valores);

            valores = new ContentValues();
            valores.put("nome", "Pedro");
            valores.put("senha", 4007);
            valores.put("emailUsuario", "pedrohenrique@gmail.com");
            db.insert("usuario", null, valores);

        }catch(SQLiteException ex){
            ex.printStackTrace();
        }
    }

    //Pesquisa se o nome de usuario e senha digitados nos campos existem no banco de dados
    public Usuario PesquisarUsuario(String nome, int senha){
        Usuario usuario = null;

        String sql = "SELECT * FROM usuario WHERE nome = '"+nome+ "' AND senha = "+senha;

        try(SQLiteDatabase db = this.getWritableDatabase()) {
            Cursor tuplas = db.rawQuery(sql, null);
            if(tuplas.moveToFirst()){
                do{
                    String nomeUsuario = tuplas.getString(0);
                    int senhaUsuario = tuplas.getInt(1);
                    String emailUsuario = tuplas.getString(2);

                    usuario = new Usuario(nomeUsuario, emailUsuario, senhaUsuario);

                }while(tuplas.moveToNext());
            }

        }catch (SQLiteException e){
            System.err.println("Ocorreu um erro!");
            e.printStackTrace();
        }
        return usuario;
    }

    public void atualizaUsuario() {

    }

    public void buscaUsuario() {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
