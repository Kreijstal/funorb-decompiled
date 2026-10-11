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
          return (am) null;
        }
        return ta.field_Db;
    }

    final static void e(int param0) {
        if (param0 <= -4) {
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
    }

    public static void f(int param0) {
        field_c = null;
        field_e = null;
        field_h = (int[][]) null;
        if (param0 != 61) {
          field_h = (int[][]) null;
        }
    }

    final static bc c(boolean param0) {
        if (ni.field_d == null) {
          ni.field_d = new bc(ug.field_f, 20, 0, 0, 0, 11579568, -1, 0, 0, ug.field_f.field_x, -1, 2147483647, true);
        }
        if (!param0) {
          return ni.field_d;
        }
        return (bc) null;
    }

    final static void a(int param0, int param1) {
        pa var2 = dk.field_s;
        var2.d(25, param0);
        var2.d(1, (byte) 122);
        var2.d(0, (byte) 122);
        if (param1 <= -106) {
          return;
        }
        field_j = 43;
    }

    final void a(uf param0, int param1) {
        try {
          param0.a((byte) 28, this.field_f);
          param0.b(this.field_g, (byte) -110);
          if (param1 >= -29) {
            kk.c(true);
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(uf param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.b((byte) 24);
            if (var3_int > param2) {
              var3_int = param2;
            }
            var4 = new byte[var3_int];
            param0.field_q = param0.field_q + ai.field_b.a(25790, param0.field_q, 0, var3_int, var4, param0.field_m);
            if (param1 > -70) {
              stackIn_5_0 = (String) null;
              return stackIn_5_0;
            }
            var5 = r.a(var3_int, 0, var4, (byte) 8);
            stackIn_7_0 = var5;
            return stackIn_7_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("kk.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(qe param0, int param1) {
        if (!g.a(105, param1)) {
          return;
        }
        if (param0.field_F != 1) {
          return;
        }
        if (!(param0.field_db <= 0)) {
          return;
        }
        try {
          qh.field_J = qh.field_J + 1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kk.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    kk(String param0, String param1) {
        try {
          this.field_g = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static eb b(int param0, int param1) {
        eb var2 = new eb();
        ga.field_w.a(var2, param1 ^ 6153);
        if (param1 == -6262) {
          kk.a(param0, -122);
          return var2;
        }
        kk.f(83);
        kk.a(param0, -122);
        return var2;
    }

    static {
        field_i = 0;
        field_h = new int[][]{new int[]{4, 4, 4}, new int[]{6, 4, 7}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{1, 0, 0}, new int[]{1, 1, 1}, new int[]{6, 6, 6}, new int[]{0, 5, 0}, new int[]{0, 4, 0}, new int[]{5, 0, 0}, new int[]{0, 0, 6}, new int[]{1, 0, 0}, new int[]{0, 7, 0}, new int[]{0, 0, 6}};
        field_c = "Mouse over an icon for details";
    }
}
