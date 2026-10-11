/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vb extends bf {
    static String field_i;

    final static void f(int param0) {
        int fieldTemp$0 = 0;
        int var3 = 0;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          fieldTemp$0 = si.field_r;
          si.field_r = si.field_r + 1;
          if ((3 & fieldTemp$0) == 0) {
            bc.field_a = bc.field_a + 1;
            if (5 == bc.field_a) {
              bc.field_a = 0;
            }
            ob.field_r = ob.field_r + 1;
            if (ob.field_r == 5) {
              ob.field_r = 0;
            }
          }
          dd.field_e = dd.field_e + 6;
          hl.field_a = hl.field_a + 1;
          ne.field_b = ne.field_b + 6;
          if (60 < hl.field_a) {
            hl.field_a = 60;
          }
          if ((!(ah.field_d >= 1300) ||
            !(ah.field_d <= 1800)) &&
            (dk.field_j == 0 &&
            Math.random() > 0.99)) {
            stackIn_17_0 = (480 >= ne.field_b) ? 0 : 1;
            var1_int = stackIn_17_0;
            stackIn_20_0 = (dd.field_e <= 480) ? 0 : 1;
            var2 = stackIn_20_0;
            if (var1_int != 0 &&
              var2 != 0) {
              if (Math.random() >= 0.5) {
                var1_int = 0;
              } else {
                var2 = 0;
              }
            }
            if (var2 != 0) {
              dd.field_e = -df.field_q[0].field_n;
            }
            if (var1_int != 0) {
              ne.field_b = -df.field_q[0].field_n;
            }
          }
          ah.field_d = ah.field_d + 2;
          if (ah.field_d > 2000) {
            ah.field_d = 0;
          }
          if (param0 < 15) {
            field_i = (String) null;
          }
          var1_double = Math.random();
          if (var1_double > 0.95) {
            if (var1_double > 0.975) {
              cj.a((byte) 127, ke.field_h[16]);
            } else {
              cj.a((byte) -23, ke.field_h[17]);
            }
          }
          if (0 == (ah.field_d & 3)) {
            if (ah.field_d > 1300 &&
              ah.field_d < 1800) {
              if (ah.field_d < 1305) {
                cj.a((byte) 124, ke.field_h[15]);
              }
              if (!(dk.field_j >= 200)) {
                ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                dk.field_j = dk.field_j + 1;
              }
            } else {
              if (dk.field_j > 0) {
                dk.field_j = dk.field_j - 1;
              }
            }
            for (var3 = 0; var3 < dk.field_j; var3++) {
              dupTemp$1 = ve.field_x[var3];
              dupTemp$1[0] = dupTemp$1[0] + (pf.a((byte) -122, 3) - 1);
              dupTemp$2 = ve.field_x[var3];
              dupTemp$2[1] = dupTemp$2[1] + 2;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "vb.F(" + param0 + ')');
        }
    }

    final static void g(int param0) {
        oa.field_G = -1;
        if (param0 < 65) {
          vb.f(-26);
          pf.field_b = null;
          ka.field_a = 0;
          nj.field_a = -1;
          ac.field_b = false;
          return;
        }
        pf.field_b = null;
        ka.field_a = 0;
        nj.field_a = -1;
        ac.field_b = false;
    }

    final static void a(int param0, bk param1, boolean param2) {
        hb var3 = null;
        try {
          var3 = gf.field_c;
          var3.b(param2, param0);
          var3.b(2, -49152);
          var3.b(0, -49152);
          var3.b(param1.field_e, -49152);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "vb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    vb() {
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 <= 62) {
          return 28;
        }
        if (0 != (7 & param1)) {
          var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 + var2;
        return var3;
    }

    public static void e(int param0) {
        int var1 = -105 % ((param0 - 14) / 34);
        field_i = null;
    }

    final static void a(byte param0) {
        String var1 = null;
        String var1Lifetime1;
        if (!fk.field_a) {
          throw new IllegalStateException();
        }
        if (null != me.field_f) {
          me.field_f.g((byte) -75);
          var1 = hf.b(0);
          j.field_e = new qi(var1, (String) null, true, false, false);
          if (param0 == 28) {
            wg.field_j.b((byte) -54, jh.field_C);
            jh.field_C.c((byte) 119, j.field_e);
            jh.field_C.p(-21);
            return;
          }
          field_i = (String) null;
          wg.field_j.b((byte) -54, jh.field_C);
          jh.field_C.c((byte) 119, j.field_e);
          jh.field_C.p(-21);
          return;
        }
        var1Lifetime1 = hf.b(0);
        j.field_e = new qi(var1Lifetime1, (String) null, true, false, false);
        if (param0 != 28) {
          field_i = (String) null;
          wg.field_j.b((byte) -54, jh.field_C);
          jh.field_C.c((byte) 119, j.field_e);
          jh.field_C.p(-21);
          return;
        }
        wg.field_j.b((byte) -54, jh.field_C);
        jh.field_C.c((byte) 119, j.field_e);
        jh.field_C.p(-21);
    }

    final static boolean a(byte param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (th.a(false, param1)) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (32 == param1) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (param0 >= 109) {
          return false;
        }
        return true;
    }

    static {
        field_i = "Waiting for graphics";
    }
}
