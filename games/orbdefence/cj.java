/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static ba field_a;
    static String field_c;
    static vd field_b;

    final static mi a(byte param0, String param1) {
        if (param0 <= -75) {
          if (bd.field_u.a(false)) {
            if (param1.equals((Object) (Object) bd.field_u.a(-80))) {
              return bd.field_u;
            } else {
              bd.field_u = hg.a(param1, (byte) 113);
              return bd.field_u;
            }
          } else {
            return bd.field_u;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        L0: {
          hi.field_g[0].d();
          ul.h(0, 0, 160, 120, 0);
          ul.a(1280, 960, 960, 255, ki.field_f);
          hg.field_ab.c(40, 20);
          ab.field_g[0].d(10, 50);
          ab.field_g[1].d(100, 50);
          ab.field_g[2].d(55, 70);
          cb.field_a.a(-40);
          hi.field_g[1].d();
          ul.h(0, 0, 160, 120, 0);
          ab.field_g[24].d(80, 0);
          ab.field_g[24].d(110, 10);
          ul.a(960, 800, 640, 255, ki.field_f);
          hg.field_ab.d(40, 30);
          ul.a(1600, 1120, 640, 255, ki.field_f);
          hg.field_ab.d(80, 50);
          ab.field_g[12].d(10, 50);
          ab.field_g[12].d(40, 60);
          ab.field_g[12].d(20, 70);
          cb.field_a.a(-40);
          hi.field_g[2].d();
          ul.h(0, 0, 160, 120, 0);
          ab.field_g[60].c(30, 10);
          ul.a(480, 1040, 480, 255, ki.field_f);
          hg.field_ab.d(10, 45);
          ul.a(2080, 1040, 480, 255, ki.field_f);
          hg.field_ab.d(110, 45);
          cb.field_a.a(-40);
          hi.field_g[3].d();
          ul.h(0, 0, 160, 120, 0);
          ab.field_g[86].c(30, 0);
          ul.a(480, 1040, 240, 255, ki.field_f);
          hg.field_ab.a(20, 55);
          ul.a(2080, 1040, 240, 255, ki.field_f);
          hg.field_ab.a(120, 55);
          ul.a(880, 1360, 240, 255, ki.field_f);
          hg.field_ab.a(45, 75);
          ul.a(1680, 1360, 240, 255, ki.field_f);
          hg.field_ab.a(95, 75);
          ul.a(1280, 1440, 240, 255, ki.field_f);
          hg.field_ab.a(70, 80);
          cb.field_a.a(-40);
          hi.field_g[4].d();
          ul.h(0, 0, 160, 120, 0);
          ul.a(640, 1520, 240, 255, ki.field_f);
          hg.field_ab.a(30, 85);
          ul.a(1920, 1520, 240, 255, ki.field_f);
          hg.field_ab.a(110, 85);
          ul.a(1920, 560, 240, 255, ki.field_f);
          hg.field_ab.a(110, 25);
          ab.field_g[99].d(20, 20);
          hf.field_g[0].d(75, 55);
          hf.field_g[2].b(2093920872, 3000, 50, 85, 62);
          hf.field_g[1].d(75, 55);
          cb.field_a.a(-40);
          hi.field_g[5].d();
          ul.h(0, 0, 160, 120, 0);
          ul.a(640, 640, 640, 255, ki.field_f);
          hg.field_ab.d(20, 20);
          ul.a(1280, 960, 960, 255, ki.field_f);
          hg.field_ab.c(40, 20);
          ul.a(1920, 1280, 640, 255, ki.field_f);
          hg.field_ab.d(100, 60);
          cb.field_a.a(-40);
          if (param0 > 51) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 1280) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ba(4, 1, 1, 1);
        field_c = "Loading...";
    }
}
