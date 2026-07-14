/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends t {
    private String field_g;
    static int field_d;
    static int field_i;
    static String field_c;
    static int[][] field_h;
    static int field_j;
    private String field_f;
    static h field_e;

    final am a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ta.field_Db;
    }

    final static void e(int param0) {
        if (param0 > -4) {
          kk.e(16);
          tf.field_l[222] = 58;
          tf.field_l[192] = 28;
          tf.field_l[520] = 59;
          tf.field_l[45] = 26;
          tf.field_l[59] = 57;
          tf.field_l[61] = 27;
          tf.field_l[47] = 73;
          tf.field_l[46] = 72;
          tf.field_l[92] = 74;
          tf.field_l[93] = 43;
          tf.field_l[91] = 42;
          tf.field_l[44] = 71;
          return;
        } else {
          tf.field_l[222] = 58;
          tf.field_l[192] = 28;
          tf.field_l[520] = 59;
          tf.field_l[45] = 26;
          tf.field_l[59] = 57;
          tf.field_l[61] = 27;
          tf.field_l[47] = 73;
          tf.field_l[46] = 72;
          tf.field_l[92] = 74;
          tf.field_l[93] = 43;
          tf.field_l[91] = 42;
          tf.field_l[44] = 71;
          return;
        }
    }

    public static void f(int param0) {
        field_c = null;
        field_e = null;
        field_h = null;
        if (param0 != 61) {
            field_h = null;
        }
    }

    final static bc c(boolean param0) {
        L0: {
          if (ni.field_d == null) {
            ni.field_d = new bc(ug.field_f, 20, 0, 0, 0, 11579568, -1, 0, 0, ug.field_f.field_x, -1, 2147483647, true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          return null;
        } else {
          return ni.field_d;
        }
    }

    final static void a(int param0, int param1) {
        pa var2 = null;
        var2 = dk.field_s;
        var2.d(25, param0);
        var2.d(1, (byte) 122);
        var2.d(0, (byte) 122);
        if (param1 > -106) {
          field_j = 43;
          return;
        } else {
          return;
        }
    }

    final void a(uf param0, int param1) {
        param0.a((byte) 28, ((kk) this).field_f);
        param0.b(((kk) this).field_g, (byte) -110);
        if (param1 >= -29) {
            bc discarded$0 = kk.c(true);
        }
    }

    final static String a(uf param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        String stackOut_6_0 = null;
        try {
          L0: {
            var3_int = param0.b((byte) 24);
            if (var3_int > param2) {
              var3_int = param2;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param0.field_q = param0.field_q + ai.field_b.a(25790, param0.field_q, 0, var3_int, var4, param0.field_m);
          if (param1 <= -70) {
            return (String) (Object) stackIn_5_0;
          } else {
            stackOut_4_0 = null;
            stackIn_5_0 = stackOut_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var5 = r.a(var3_int, 0, var4, (byte) 8);
          stackOut_6_0 = (String) var5;
          stackIn_7_0 = stackOut_6_0;
        }
        return null;
    }

    final static void a(qe param0, int param1) {
        if (!(g.a(105, param1))) {
            return;
        }
        if (param0.field_F != -2) {
            return;
        }
        if (!(-1 >= param0.field_db)) {
            return;
        }
        qh.field_J = qh.field_J + 1;
    }

    kk(String param0, String param1) {
        ((kk) this).field_g = param1;
        ((kk) this).field_f = param0;
    }

    final static eb b(int param0, int param1) {
        eb var2 = null;
        var2 = new eb();
        ga.field_w.a((da) (Object) var2, param1 ^ 6153);
        if (param1 != -6262) {
          kk.f(83);
          kk.a(param0, -122);
          return var2;
        } else {
          kk.a(param0, -122);
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_h = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_c = "Mouse over an icon for details";
    }
}
