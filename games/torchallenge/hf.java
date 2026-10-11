/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf implements j {
    static ka field_a;
    static int field_c;
    static byte[] field_d;
    static int[][] field_f;
    static int field_e;
    static ne field_b;

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 4) {
          return true;
        }
        stackIn_6_0 = (qf.field_a != null) && (qc.field_d == aj.field_c);
        return stackIn_6_0;
    }

    final static void a(byte param0, boolean param1, int param2, String param3, String param4, boolean param5) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != -73) {
            field_c = -14;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 && (param4 != null ||
            param3 != null)) {
            if (param4 != param3 &&
              param3 != null) {
              param2--;
              if (!(param2 > 0)) {
                param3 = param4;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (30 > param2) {
                param2++;
              }
              param3 = param4;
            }
          }
          if (!param5) {
            cd.field_c = param2;
            ci.field_q = param3;
            gf.field_v = param4;
          } else {
            pi.field_c = param3;
            ng.field_I = param2;
            rj.field_d = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("hf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 < 11) {
          return;
        }
        int var3 = 1 << param2;
        if (0 != (var3 & jj.field_c)) {
          return;
        }
        ac.field_d = ac.field_d ^ 4;
        ae.field_z = ae.field_z ^ 4;
        jj.field_c = jj.field_c | var3;
        eh.field_l = eh.field_l | var3;
        db.field_D.a(new ul(param2), -83);
        if (!bh.field_p) {
          wc.field_g.a(new rd(param2, param0, al.field_z, pi.field_a, pi.field_f, ub.field_j), -53);
        }
    }

    final static byte[] a(int param0, byte[] param1, int param2, pa param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var4_int = param3.e(param2, 119);
          if (~var4_int == param0) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new byte[var4_int];
          }
          var5 = param3.e(3, param0 + 5);
          var6 = (byte)param3.e(8, 100);
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)(param3.e(var5, 119) + var6);
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          }
          stackIn_16_0 = (byte[]) (param1);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("hf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 19199) {
          return;
        }
        field_f = (int[][]) null;
    }

    final static void a(byte param0) {
        ba.c((byte) 15);
        if (param0 >= -105) {
          return;
        }
        fk.a(true, 4);
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ka var8 = null;
        try {
          var6_int = param0.field_m + param2;
          if (param3 != 97) {
            field_c = -88;
          }
          var7 = param1 + param0.field_i;
          v.b(var6_int, 12105912, param0.field_p, var7, param0.field_l);
          var8 = ub.field_f[1];
          if (param0 instanceof ng &&
            ((ng) (param0)).field_D) {
            var8.b(var6_int + 1 + (param0.field_p - var8.field_q >> 1), (-var8.field_v + param0.field_l >> 1) + (var7 + 1), 256);
          }
          if (param0.c(param3 - 11)) {
            jc.a((byte) -115, var6_int + 2, param0.field_l - 4, param0.field_p - 4, 2 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("hf.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_c = 0;
        field_f = new int[][]{new int[]{222, 147}, new int[]{198, 144}, new int[]{235, 151}};
        field_b = new ne();
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$759f676cf37b(int param0, boolean param1, int param2, String param3, String param4, boolean param5) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != -73) {
            field_c = -14;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 && (param4 != null ||
            param3 != null)) {
            if (param4 != param3 &&
              param3 != null) {
              param2--;
              if (!(param2 > 0)) {
                param3 = param4;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (30 > param2) {
                param2++;
              }
              param3 = param4;
            }
          }
          if (!param5) {
            cd.field_c = param2;
            ci.field_q = param3;
            gf.field_v = param4;
          } else {
            pi.field_c = param3;
            ng.field_I = param2;
            rj.field_d = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("hf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(')').toString());
        }
    }
}
