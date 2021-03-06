package com.example.estudiosoapp23;

import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


class TesteNavigationH extends AppCompatActivity {
    public DrawerLayout d1;
    public ActionBarDrawerToggle t;
    private NavigationView nv;
    String tela;


    public void navigationDrawer() {

       d1 = (DrawerLayout) findViewById(R.id.activity_ciclo);
        t = new ActionBarDrawerToggle(this, d1, R.string.Open, R.string.Close);
        d1.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNv((NavigationView) findViewById(R.id.nav_view));
        menuPrincipal();
    }

    public void navigationDrawerConsCiclo() {

        d1 = (DrawerLayout) findViewById(R.id.activity_cons_ciclo);
        t = new ActionBarDrawerToggle(this, d1, R.string.Open, R.string.Close);
        d1.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNv((NavigationView) findViewById(R.id.nav_viewConsCiclo));
        menuPrincipal();
        }


    public void navigationDrawerQuestoes() {
        d1 = (DrawerLayout) findViewById(R.id.activity_questoes);
        t = new ActionBarDrawerToggle(this, d1, R.string.Open, R.string.Close);
        d1.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNv((NavigationView) findViewById(R.id.nav_viewCadQuestoes));
        menuPrincipal();
    }

    public void navigationDrawerRevisoes() {
        d1 = (DrawerLayout) findViewById(R.id.activity_revisoes);
        t = new ActionBarDrawerToggle(this, d1, R.string.Open, R.string.Close);
        d1.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNv((NavigationView) findViewById(R.id.nav_viewCadRevisoes));
        menuPrincipal();
    }

    public void navigationDrawerCadCronograma() {
        d1 = (DrawerLayout) findViewById(R.id.activity_cronograma);
        t = new ActionBarDrawerToggle(this, d1, R.string.Open, R.string.Close);
        d1.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNv((NavigationView) findViewById(R.id.nav_viewCadCronograma));
        menuPrincipal();
    }


    public void navigationDrawerConsCronograma() {
        d1 = (DrawerLayout) findViewById(R.id.activity_cons_cronograma);
        t = new ActionBarDrawerToggle(this, d1, R.string.Open, R.string.Close);
        d1.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNv((NavigationView) findViewById(R.id.nav_viewConsCronograma));
        menuPrincipal();
    }

    public void navigationDrawerCadSessao() {
        d1 = (DrawerLayout) findViewById(R.id.activity_nova_sessao);
        t = new ActionBarDrawerToggle(this, d1, R.string.Open, R.string.Close);
        d1.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNv((NavigationView) findViewById(R.id.nav_viewNovaSessao));
        menuPrincipal();
    }

    public void navigationDrawerCadMateria() {
        d1 = (DrawerLayout) findViewById(R.id.activity_materia);
        t = new ActionBarDrawerToggle(this, d1, R.string.Open, R.string.Close);
        d1.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNv((NavigationView) findViewById(R.id.nav_viewCadMateria));
        menuPrincipal();
    }

    public void menuPrincipal(){
        getNv().setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                switch (id) {
                    case R.id.inicio:
                        abreTelaTeste();
                        break;

                    case R.id.ciclo:
                        abreTelaCiclo();
                        break;

                    case R.id.cronograma:
                        abreTelaCronogramaCons();
                        break;

                    case R.id.materia:
                        abreTelaMateria();
                        break;
                    case R.id.sessao:
                        abreTelaSessao();
                        break;

                    case R.id.questoes:
                        abreTelaQuestoes();
                        break;

                    case R.id.revisao:
                        abreTelaRevisao();
                        break;

                    default:
                        return true;
                }
                return true;
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }


    public NavigationView getNv() {
        return nv;
    }

    public void setNv(NavigationView nv) {
        this.nv = nv;
    }

    private void abreTelaTeste(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
       // finish();
    }
    private void abreTelaRevisao(){
        Intent intent = new Intent(this, RevisoesActivity.class);
        startActivity(intent);
        finish();
    }

    private void abreTelaQuestoes(){
        Intent intent = new Intent(this, QuestoesActivity.class);
        //intent.putExtra("tela","CadQuestoes");
        startActivity(intent);
        finish();
    }


    private void abreTelaMateria(){
        Intent intent = new Intent(this, MateriaActivity.class);
        startActivity(intent);
    }

    private void abreTelaCiclo(){
        Intent intent = new Intent(this, ConsCicloActivity.class);
        intent.putExtra("tela", "ConsCiclo");
        startActivity(intent);
    }

    private void abreTelaCronogramaCons(){
        Intent intent = new Intent(this, ConsCronogramaActivity.class);
        startActivity(intent);
        finish();
    }

    private void abreTelaSessao(){
        Intent intent = new Intent(this, NovaSessaoActivity.class);
        startActivity(intent);
    }
}
