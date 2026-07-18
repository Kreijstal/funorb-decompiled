/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends de {
    private uo field_l;
    private int field_n;
    static String field_m;

    final void a(int param0, int[] param1) {
        try {
            ((am) this).field_l = new uo(param1);
            int var3_int = 35 % ((-7 - param0) / 53);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "am.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int i(byte param0) {
        if (param0 <= 122) {
            return 95;
        }
        int fieldTemp$0 = ((am) this).field_j;
        ((am) this).field_j = ((am) this).field_j + 1;
        return ((am) this).field_h[fieldTemp$0] + -((am) this).field_l.a(92) & 255;
    }

    final void h(byte param0) {
        if (param0 != 75) {
            ((am) this).i(13);
        }
        ((am) this).field_n = ((am) this).field_j * 8;
    }

    final void i(int param0) {
        ((am) this).field_j = (7 + ((am) this).field_n) / param0;
    }

    final static void k(int param0) {
        if (ej.field_x != -mj.field_b) {
            if (ej.field_x == -mj.field_b + 250) {
            }
            return;
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = param0.length();
            if (param1 == 1) {
              var3 = new char[var2_int];
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackOut_7_0 = new String(var3);
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var3[var2_int - (1 + var4)] = param0.charAt(var4);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("am.K(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            var5_int = param3;
            L1: while (true) {
              if (param0 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((am) this).field_j;
                ((am) this).field_j = ((am) this).field_j + 1;
                param1[var5_int - -param2] = (byte)(((am) this).field_h[fieldTemp$5] + -((am) this).field_l.a(96));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("am.I(").append(param0).append(',');
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
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    am(int param0) {
        super(param0);
    }

    final int k(int param0, int param1) {
        int var6 = ZombieDawn.field_J;
        int var3 = ((am) this).field_n >> 3;
        int var4 = 8 + -(7 & ((am) this).field_n);
        int var5 = 0;
        ((am) this).field_n = ((am) this).field_n + param1;
        if (param0 < 10) {
            field_m = null;
        }
        while (param1 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((am) this).field_h[incrementValue$0] & jd.field_e[var4]) << param1 + -var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (((am) this).field_h[var3] >> var4 + -param1 & jd.field_e[param1]);
        } else {
            var5 = var5 + (jd.field_e[var4] & ((am) this).field_h[var3]);
        }
        return var5;
    }

    am(byte[] param0) {
        super(param0);
    }

    public static void j(int param0) {
        int var1 = 0;
        field_m = null;
    }

    final void j(int param0, int param1) {
        int fieldTemp$0 = ((am) this).field_j;
        ((am) this).field_j = ((am) this).field_j + 1;
        ((am) this).field_h[fieldTemp$0] = (byte)(param1 + ((am) this).field_l.a(124));
        if (param0 != 11) {
            ((am) this).field_n = -62;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (11 != fl.field_a) {
                break L1;
              } else {
                qo.c(29756);
                break L1;
              }
            }
            L2: {
              qh.a(mm.field_k, ka.field_a, (byte) -92, ma.field_p);
              uh.a(-113, 0, 0, param0);
              if (param1 <= -79) {
                break L2;
              } else {
                var3 = null;
                String discarded$2 = am.a((String) null, 84);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("am.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Unpacking sound effects";
    }
}
