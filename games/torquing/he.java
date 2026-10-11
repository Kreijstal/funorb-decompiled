/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static boolean field_a;
    private String field_c;
    static la field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
          String var2 = (String) null;
          he.a(-37, (String) null);
        }
    }

    final static boolean a(hc param0, double param1, double[] param2, int param3, double param4) {
        int var9 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        double var10 = 0.0;
        int var12 = 0;
        double[] var13 = null;
        double[] var14 = null;
        double[] var15 = null;
        var12 = Torquing.field_u;
        try {
          kp.a(0.0, param3 - 16777300, param4, param2, param0);
          ee.a(false, new double[3], param2, param4, param1, 106);
          if (param3 != 16777215) {
            field_b = (la) null;
          }
          var15 = ll.a(mg.field_a, vf.field_e, (byte) 121);
          var14 = var15;
          var13 = var14;
          var7 = var13;
          var8 = 0;
          if (var13 != null) {
            for (var9 = 0; var9 < ia.field_i; var9++) {
              var10 = var15[var9];
              if (var10 > 1e-7) {
                var10 = var10 * param1;
                param2[0] = param2[0] + var10 * bn.field_f[var9][6];
                param2[1] = param2[1] + var10 * bn.field_f[var9][7];
                param2[2] = param2[2] + var10 * bn.field_f[var9][8];
                var8 = 1;
              }
            }
          }
          stackIn_12_0 = var8;
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("he.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean b(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_c = (String) null;
          }
          stackIn_3_0 = this.field_c.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("he.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    he(String param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Torquing.field_u;
        try {
          var5_int = param4 + param0;
          var6 = param1 + param2;
          if (param3 != 2) {
            return;
          }
          if (ph.field_k < param0) {
            stackIn_6_0 = param0;
          } else {
            stackIn_6_0 = ph.field_k;
          }
          var7 = stackIn_6_0;
          if (param2 > ph.field_c) {
            stackIn_9_0 = param2;
          } else {
            stackIn_9_0 = ph.field_c;
          }
          var8 = stackIn_9_0;
          if (ph.field_a <= var5_int) {
            stackIn_12_0 = ph.field_a;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (ph.field_h > var6) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = ph.field_h;
          }
          var10 = stackIn_15_0;
          if (param0 >= ph.field_k &&
            ph.field_a > param0) {
            var11 = param0 + ph.field_j * var8;
            var12 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              ph.field_e[var11] = 16777215;
              var11 = var11 + 2 * ph.field_j;
            }
          }
          if (param2 >= ph.field_c &&
            ph.field_h > var6) {
            var11Lifetime1 = var7 + param2 * ph.field_j;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              ph.field_e[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= ph.field_k &&
            ph.field_a > var5_int) {
            var11Lifetime2 = ((1 & var5_int - param0) + var8) * ph.field_j + var5_int;
            var12Lifetime2 = var10 + (1 - var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              ph.field_e[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + ph.field_j * 2;
            }
          }
          if (ph.field_c <= param2) {
            if (var6 >= ph.field_h) {
              return;
            }
            var11Lifetime3 = ph.field_j * var6 + var7 + (var6 - param2 & 1);
            var12Lifetime3 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              ph.field_e[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "he.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static dn a(int param0, String param1) {
        RuntimeException var2 = null;
        dn stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            he.a(-116);
          }
          if (kh.field_o == mg.field_b) {
            return null;
          }
          if (ag.field_c == kh.field_o &&
            param1.equals(on.field_b)) {
            kh.field_o = tp.field_h;
            stackIn_8_0 = qi.field_d;
            return stackIn_8_0;
          }
          kh.field_o = mg.field_b;
          qi.field_d = null;
          on.field_b = param1;
          stackIn_10_0 = null;
          return (dn) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("he.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(java.applet.Applet param0, boolean param1) {
        try {
          if (param1) {
            he.a(90);
          }
          ni.a((byte) 102, param0, this.field_c, 31536000L, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "he.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = false;
    }
}
