/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends rb {
    static String field_l;
    static int field_k;
    private jb field_m;
    private int field_j;

    final static void a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ne.a(false, param1, param0, 150);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ia.J(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
    }

    final int m(int param0) {
        if (param0 != 255) {
            Object var3 = null;
            ia.a((rf) null, (rf) null, (byte) -73);
            int fieldTemp$0 = ((ia) this).field_g;
            ((ia) this).field_g = ((ia) this).field_g + 1;
            return ((ia) this).field_f[fieldTemp$0] - ((ia) this).field_m.d(param0 ^ 252) & 255;
        }
        int fieldTemp$1 = ((ia) this).field_g;
        ((ia) this).field_g = ((ia) this).field_g + 1;
        return ((ia) this).field_f[fieldTemp$1] - ((ia) this).field_m.d(param0 ^ 252) & 255;
    }

    final void d(byte param0, int param1) {
        int fieldTemp$0 = ((ia) this).field_g;
        ((ia) this).field_g = ((ia) this).field_g + 1;
        ((ia) this).field_f[fieldTemp$0] = (byte)(param1 + ((ia) this).field_m.d(3));
        if (param0 >= 14) {
            return;
        }
        field_l = null;
    }

    final static void a(rf param0, rf param1, byte param2) {
        try {
            if (param2 != 57) {
                field_l = null;
            }
            if (param0.field_d != null) {
                param0.b(4);
            }
            param0.field_a = param1.field_a;
            param0.field_d = param1;
            param0.field_d.field_a = param0;
            param0.field_a.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ia.G(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void l(int param0) {
        int var2 = -5 / ((58 - param0) / 56);
        ((ia) this).field_g = (((ia) this).field_j - -7) / 8;
    }

    public static void k(int param0) {
        field_l = null;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 112 / ((param1 - -62) / 42);
                param2 = s.a(param2, '_', "", (byte) -10);
                var3 = vh.a(param0, 0);
                if (param2.indexOf(param0) != -1) {
                  break L2;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("ia.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final void a(int[] param0, byte param1) {
        try {
            ((ia) this).field_m = new jb(param0);
            int var3_int = -76 / ((param1 - -5) / 46);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ia.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void b(int param0, byte param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            var5_int = 0;
            if (param1 == -54) {
              L1: while (true) {
                if (var5_int >= param0) {
                  break L0;
                } else {
                  int fieldTemp$5 = ((ia) this).field_g;
                  ((ia) this).field_g = ((ia) this).field_g + 1;
                  param2[param3 + var5_int] = (byte)(((ia) this).field_f[fieldTemp$5] + -((ia) this).field_m.d(dg.a((int) param1, -55)));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ia.E(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final void c(boolean param0) {
        if (!param0) {
            return;
        }
        ((ia) this).field_j = ((ia) this).field_g * 8;
    }

    final int e(int param0, int param1) {
        int var6 = StarCannon.field_A;
        int var3 = ((ia) this).field_j >> 3;
        int var4 = -(((ia) this).field_j & 7) + param0;
        int var5 = 0;
        ((ia) this).field_j = ((ia) this).field_j + param1;
        while (param1 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((wh.field_e[var4] & ((ia) this).field_f[incrementValue$0]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (var4 == param1) {
            var5 = var5 + (wh.field_e[var4] & ((ia) this).field_f[var3]);
        } else {
            var5 = var5 + (((ia) this).field_f[var3] >> -param1 + var4 & wh.field_e[param1]);
        }
        return var5;
    }

    ia(int param0) {
        super(param0);
    }

    ia(byte[] param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Loading music";
    }
}
