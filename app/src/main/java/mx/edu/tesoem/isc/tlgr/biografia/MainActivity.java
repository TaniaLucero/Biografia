package mx.edu.tesoem.isc.tlgr.biografia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnespañol, btnenglish, btnchino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnespañol = (Button) findViewById(R.id.btnes);
        btnenglish = (Button) findViewById(R.id.btnen);
        btnchino = (Button) findViewById(R.id.btnch);

        español();

        btnespañol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                español();
            }
        });
        btnenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                english();
            }
        });
        btnchino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chino();
            }
        });
    }

    private void español() {
        TextView h = (TextView) findViewById(R.id.txtho);
        h.setText("\nHOLA");
        TextView s = (TextView) findViewById(R.id.txtso);
        s.setText("\nMi nombre es Tania Lucero. Soy estudiante de Ingenieria en Sistemas Computacionales en el Tecnologico de Estudios Superiores del Oriente del Estado de México (TESOEM).");

        TextView a = (TextView) findViewById(R.id.txtap);
        a.setText("\nCosas que quiero aprender\n");
        TextView and = (TextView) findViewById(R.id.txtand);
        and.setText("Android Studio");
        TextView inart = (TextView) findViewById(R.id.txtiart);
        inart.setText("Inteligencia Artificial");
        TextView idichino = (TextView) findViewById(R.id.txtidich);
        idichino.setText("Idioma Chino");

        TextView co = (TextView) findViewById(R.id.txtco);
        co.setText("\nCosas que me gustan\n");
        TextView seri = (TextView) findViewById(R.id.txtse);
        seri.setText("Ver series");
        TextView leer = (TextView) findViewById(R.id.txtle);
        leer.setText("Leer libros");
        TextView can = (TextView) findViewById(R.id.txtca);
        can.setText("Cantar");
        TextView musi = (TextView) findViewById(R.id.txtmu);
        musi.setText("Escuchar \nmusica");

        TextView cur = (TextView) findViewById(R.id.txtcur);
        cur.setText("\nCursos tomados\n");
        TextView asiwe = (TextView) findViewById(R.id.txtaw);
        asiwe.setText("Asistente web");
        TextView tecinfor = (TextView) findViewById(R.id.txtti);
        tecinfor.setText("Técnico en informatica");
        TextView curdat = (TextView) findViewById(R.id.txtcd);
        curdat.setText("Curador de datos");
        TextView descontdig = (TextView) findViewById(R.id.txtdcd);
        descontdig.setText("Desarrollador de\ncontenido digital");
        TextView fin = (TextView) findViewById(R.id.txtf);
        fin.setText("Finder");
        TextView gestimaw = (TextView) findViewById(R.id.txtgiw);
        gestimaw.setText("Gestor de\nimagen web");
        TextView tes = (TextView) findViewById(R.id.txtt);
        tes.setText("Tester");
        TextView logpro = (TextView) findViewById(R.id.txtlp);
        logpro.setText("Lógica de\nprogramación");
        TextView pekuni = (TextView) findViewById(R.id.txtpu);
        pekuni.setText("Chino para\nprincipiantes");

        TextView diplo = (TextView) findViewById(R.id.txtdip);
        diplo.setText("\nDiplomados\n");
        TextView diptecintweb = (TextView) findViewById(R.id.txtdtiw);
        diptecintweb.setText("Diplomado técnico en integridad web");
    }

    private void english() {
        TextView h = (TextView) findViewById(R.id.txtho);
        h.setText("\nHELLO");
        TextView s = (TextView) findViewById(R.id.txtso);
        s.setText("\nMy name is Tania Lucero. I am a student of Engineering in Computational Systems at the Technological Institute of Superior Studies of the East of the State of Mexico (TESOEM).");

        TextView a = (TextView) findViewById(R.id.txtap);
        a.setText("\nThings I want to learn\n");
        TextView and = (TextView) findViewById(R.id.txtand);
        and.setText("Android Studio");
        TextView inart = (TextView) findViewById(R.id.txtiart);
        inart.setText("Artificial Intelligence");
        TextView idichino = (TextView) findViewById(R.id.txtidich);
        idichino.setText("Chinese language");

        TextView co = (TextView) findViewById(R.id.txtco);
        co.setText("\nThings I like\n");
        TextView seri = (TextView) findViewById(R.id.txtse);
        seri.setText("Watch\nseries");
        TextView leer = (TextView) findViewById(R.id.txtle);
        leer.setText("Read\nbooks");
        TextView can = (TextView) findViewById(R.id.txtca);
        can.setText("Sing");
        TextView musi = (TextView) findViewById(R.id.txtmu);
        musi.setText("Listen to \nmusic");

        TextView cur = (TextView) findViewById(R.id.txtcur);
        cur.setText("\nCourses taken\n");
        TextView asiwe = (TextView) findViewById(R.id.txtaw);
        asiwe.setText("Web assistant");
        TextView tecinfor = (TextView) findViewById(R.id.txtti);
        tecinfor.setText("Technician in computing");
        TextView curdat = (TextView) findViewById(R.id.txtcd);
        curdat.setText("Data curator");
        TextView descontdig = (TextView) findViewById(R.id.txtdcd);
        descontdig.setText("Digital content\ndeveloper");
        TextView fin = (TextView) findViewById(R.id.txtf);
        fin.setText("Finder");
        TextView gestimaw = (TextView) findViewById(R.id.txtgiw);
        gestimaw.setText("Web image\nmanager");
        TextView tes = (TextView) findViewById(R.id.txtt);
        tes.setText("Tester");
        TextView logpro = (TextView) findViewById(R.id.txtlp);
        logpro.setText("Programmation\nlogic");
        TextView pekuni = (TextView) findViewById(R.id.txtpu);
        pekuni.setText("Chinese for\nbeginners");

        TextView diplo = (TextView) findViewById(R.id.txtdip);
        diplo.setText("\nGraduates\n");
        TextView diptecintweb = (TextView) findViewById(R.id.txtdtiw);
        diptecintweb.setText("Technical diploma in web integrity");
    }

    private void chino() {
        TextView h = (TextView) findViewById(R.id.txtho);
        h.setText("\n你好");
        TextView s = (TextView) findViewById(R.id.txtso);
        s.setText("\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     我叫 Tania Lucero 我是墨西哥州东部高级研究技术学院（TESOEM）计算系统工程专业的学生。");

        TextView a = (TextView) findViewById(R.id.txtap);
        a.setText("\n我想学的东西\n");
        TextView and = (TextView) findViewById(R.id.txtand);
        and.setText("Android Studio");
        TextView inart = (TextView) findViewById(R.id.txtiart);
        inart.setText("人工智能");
        TextView idichino = (TextView) findViewById(R.id.txtidich);
        idichino.setText("中文语言");

        TextView co = (TextView) findViewById(R.id.txtco);
        co.setText("\n我喜欢的东西\n");
        TextView seri = (TextView) findViewById(R.id.txtse);
        seri.setText("看系列");
        TextView leer = (TextView) findViewById(R.id.txtle);
        leer.setText("看书");
        TextView can = (TextView) findViewById(R.id.txtca);
        can.setText("唱歌");
        TextView musi = (TextView) findViewById(R.id.txtmu);
        musi.setText("听音乐");

        TextView cur = (TextView) findViewById(R.id.txtcur);
        cur.setText("\n所修课程\n");
        TextView asiwe = (TextView) findViewById(R.id.txtaw);
        asiwe.setText("网络助手");
        TextView tecinfor = (TextView) findViewById(R.id.txtti);
        tecinfor.setText("电脑技术员");
        TextView curdat = (TextView) findViewById(R.id.txtcd);
        curdat.setText("数据策展人");
        TextView descontdig = (TextView) findViewById(R.id.txtdcd);
        descontdig.setText("数字内容开发商");
        TextView fin = (TextView) findViewById(R.id.txtf);
        fin.setText("发现者");
        TextView gestimaw = (TextView) findViewById(R.id.txtgiw);
        gestimaw.setText("网页图片管理器");
        TextView tes = (TextView) findViewById(R.id.txtt);
        tes.setText("测试仪");
        TextView logpro = (TextView) findViewById(R.id.txtlp);
        logpro.setText("编程逻辑");
        TextView pekuni = (TextView) findViewById(R.id.txtpu);
        pekuni.setText("初学者中文");

        TextView diplo = (TextView) findViewById(R.id.txtdip);
        diplo.setText("\n应届毕业生\n");
        TextView diptecintweb = (TextView) findViewById(R.id.txtdtiw);
        diptecintweb.setText("网站完整性技术文凭");
    }

}
