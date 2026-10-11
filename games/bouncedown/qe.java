/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends ng {
    static String field_c;
    static String field_j;
    static int[] field_g;
    static long field_k;
    static int field_f;
    private String field_d;
    private String field_h;
    static String field_e;
    static int field_i;

    final sb b(byte param0) {
        if (param0 > -57) {
          field_c = (String) null;
        }
        return jf.field_h;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Bounce.field_N;
        try {
          var3_int = 0;
          if (param1 >= -91) {
            field_j = (String) null;
          }
          var4 = jl.field_a;
          while (var3_int < se.field_E.length) {
            var5 = m.field_a[var3_int];
            if (var5 < 0) {
              var4 = var4 + k.field_D;
            } else {
              var6 = vh.a(true, se.field_E[var3_int], true);
              var4 = var4 + hj.field_a;
              var7 = bi.field_h - (var6 >> 1);
              if (ef.a(var4, -kk.field_z + var7, -78, (cl.field_m << 1) + pb.field_j, (kk.field_z << 1) + var6, param0, param2)) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (pb.field_j + (cl.field_m << 1) + hj.field_a);
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "qe.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        hf.a(false);
        int var2 = 66 / ((13 - param0) / 36);
    }

    final void a(boolean param0, wi param1) {
        try {
          param1.a(this.field_h, (byte) -67);
          if (param0) {
            field_j = (String) null;
          }
          param1.b(this.field_d, (byte) -103);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "qe.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static lj a(int param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        lj var7 = null;
        int var8 = 0;
        lj stackIn_3_0 = null;
        lj stackIn_6_0 = null;
        lj stackIn_9_0 = null;
        lj stackIn_15_0 = null;
        lj stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Bounce.field_N;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_3_0 = uc.field_E;
            return stackIn_3_0;
          }
          if (var2_int > param0) {
            stackIn_6_0 = lk.field_t;
            return stackIn_6_0;
          }
          var3 = di.a(-108, '.', param1);
          if (var3.length < 2) {
            stackIn_9_0 = uc.field_E;
            return stackIn_9_0;
          }
          var4 = var3;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = dk.a(-64, var6);
            if (var7 != null) {
              stackIn_15_0 = var7;
              return stackIn_15_0;
            }
          }
          stackIn_18_0 = uk.a(-58, var3[var3.length - 1]);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("qe.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static ie a(int param0, gk param1, int param2, int param3, gk param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ie stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!c.a(param1, false, param2, param3)) {
            stackIn_2_0 = null;
            return (ie) (stackIn_2_0);
          }
          var5_int = 9 / ((param0 + 58) / 59);
          stackIn_4_0 = ea.a(param4.b(-122, param3, param2), (byte) 71);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qe.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_e = null;
        field_g = null;
        field_c = null;
        field_j = null;
        if (param0 > -7) {
          field_c = (String) null;
        }
    }

    qe(String param0, String param1) {
        try {
          this.field_h = param0;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 443111233) {
          qe.a((byte) -62, -23);
        }
        pa.field_a = null;
        nb.field_b = null;
    }

    static {
        field_j = "Instructions";
        field_c = "Log in / Create account";
        field_g = new int[8192];
        field_f = 0;
    }
}
