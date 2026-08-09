/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static ba field_a;
    static String field_c;
    static vd field_b;

    final static mi a(byte param0, String param1) {
        RuntimeException var2 = null;
        mi stackIn_2_0 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -75) {
              L1: {
                if (!bd.field_u.a(false)) {
                  break L1;
                } else {
                  if (param1.equals(bd.field_u.a(-80))) {
                    break L1;
                  } else {
                    bd.field_u = hg.a(param1, (byte) 113);
                    break L1;
                  }
                }
              }
              stackIn_7_0 = bd.field_u;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("cj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(int param0) {
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
        if (param0 <= 51) {
            field_b = (vd) null;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 1280) {
            field_a = (ba) null;
        }
    }

    static {
        field_a = new ba(4, 1, 1, 1);
        field_c = "Loading...";
    }
}
