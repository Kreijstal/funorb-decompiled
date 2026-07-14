/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static int field_c;
    static String field_b;
    static sh field_a;

    final static void a(nc param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        th var8 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        var7 = ed.field_q;
        var8 = var7;
        if (param2 <= 71) {
          return;
        } else {
          var8.h(param1, 0);
          var8.field_h = var8.field_h + 1;
          var4 = var8.field_h;
          var8.c(1, -1);
          var8.e(96, param0.field_j);
          var8.e(105, param0.field_k);
          var8.e(111, param0.field_l);
          var8.f(param0.field_i, -32287);
          var8.f(param0.field_q, -32287);
          var8.f(param0.field_o, -32287);
          var8.f(param0.field_s, -32287);
          var8.c(param0.field_m.length, -1);
          var5 = 0;
          L0: while (true) {
            if (param0.field_m.length <= var5) {
              int discarded$2 = var8.a(var4, (byte) 29);
              var8.d(-var4 + var8.field_h, (byte) -124);
              return;
            } else {
              var7.f(param0.field_m[var5], -32287);
              var5++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (-11 >= (wf.field_i ^ -1)) {
          if (og.a(23440)) {
            if (-1 != (ta.field_g ^ -1)) {
              uj.a(param0 + -126, param2);
              if (param0 != 57) {
                field_b = null;
                return;
              } else {
                return;
              }
            } else {
              tg.a(param1, false, param0 + 49);
              lj.a(0, param2, 0, (byte) -128);
              if (param0 != 57) {
                field_b = null;
                return;
              } else {
                return;
              }
            }
          } else {
            lf.a();
            ra.a(320, 150, 240);
            lj.a(0, param2, 0, (byte) -128);
            if (param0 == 57) {
              return;
            } else {
              field_b = null;
              return;
            }
          }
        } else {
          L0: {
            var3 = 0;
            if (dl.field_b) {
              dl.field_b = false;
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          hd.a(aa.a((byte) 92), (byte) -90, ik.a((byte) 94), var3 != 0, te.field_E);
          if (param0 == 57) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        di.field_x.b(123, (w) (Object) new mh());
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            Object var2 = null;
            ga.a((byte) -81, true, (java.awt.Canvas) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "GAME OVER";
    }
}
