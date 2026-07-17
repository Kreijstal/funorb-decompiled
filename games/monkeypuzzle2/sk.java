/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends ua implements ql {
    static int field_G;
    private t[] field_B;
    private int[] field_z;
    private String field_E;
    private ha field_H;
    private int field_C;
    private ta field_A;
    static int[] field_D;
    static String field_F;

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 7) {
                break L1;
              } else {
                ((sk) this).a(-78, -17, -121, 56);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (var6_int >= ((sk) this).field_C) {
                  break L3;
                } else {
                  if (((sk) this).field_B[var6_int] != param4) {
                    var6_int++;
                    continue L2;
                  } else {
                    var7 = ((sk) this).field_z[var6_int];
                    if (var7 == -1) {
                      ((sk) this).field_H.g((byte) -75);
                      break L3;
                    } else {
                      qh.a(((sk) this).field_z[var6_int], true);
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("sk.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(byte param0, int param1, String param2) {
        int var4_int = 0;
        try {
            var4_int = ((sk) this).field_C;
            this.a(var4_int - -1, -101);
            int var5 = -96 / ((param0 - 55) / 36);
            ((sk) this).field_B[var4_int] = ((sk) this).a(0, (of) this, param2);
            ((sk) this).field_z[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "sk.J(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c(boolean param0) {
        field_D = null;
        field_F = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((sk) this).field_A.a(((sk) this).field_E, 14 + param3 - -((sk) this).field_r, 10 + param2 + ((sk) this).field_e, ((sk) this).field_l - 28, ((sk) this).field_p, 16777215, -1, 0, 0, ((sk) this).field_A.field_C);
    }

    final static kc a(String param0, long param1, boolean param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        od stackIn_8_0 = null;
        rc stackIn_10_0 = null;
        f stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        rc stackOut_9_0 = null;
        od stackOut_7_0 = null;
        f stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                sk.b(true);
                break L1;
              }
            }
            L2: {
              if (param1 != 0L) {
                break L2;
              } else {
                if (param4 != null) {
                  stackOut_9_0 = new rc(param4, param0);
                  stackIn_10_0 = stackOut_9_0;
                  return (kc) (Object) stackIn_10_0;
                } else {
                  break L2;
                }
              }
            }
            if (param2) {
              stackOut_7_0 = new od(param1, param0);
              stackIn_8_0 = stackOut_7_0;
              return (kc) (Object) stackIn_8_0;
            } else {
              stackOut_11_0 = new f(param1, param0);
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("sk.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return (kc) (Object) stackIn_12_0;
    }

    final static void b(boolean param0) {
        field_D = null;
        if (!ha.field_db) {
            throw new IllegalStateException();
        }
        cf.field_c = true;
        hl.a((byte) -60, true);
        k.field_g = 0;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((sk) this).field_C >= param0) {
            return;
        }
        t[] var7 = new t[param0];
        t[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; ((sk) this).field_C > var5; var5++) {
            var7[var5] = ((sk) this).field_B[var5];
            var4[var5] = ((sk) this).field_z[var5];
        }
        ((sk) this).field_C = param0;
        ((sk) this).field_z = var4;
        ((sk) this).field_B = var3;
    }

    sk(ha param0, ta param1, String param2) {
        super(0, 0, 288, 0, (ml) null);
        int var4_int = 0;
        ((sk) this).field_C = 0;
        try {
            ((sk) this).field_H = param0;
            ((sk) this).field_E = param2;
            ((sk) this).field_A = param1;
            var4_int = null != ((sk) this).field_E ? ((sk) this).field_A.a(((sk) this).field_E, 260, ((sk) this).field_A.field_C) : 0;
            ((sk) this).a(22 + var4_int, 13361, 0, 288, 0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "sk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final t a(int param0, of param1, String param2) {
        t var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        t stackIn_1_0 = null;
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
        t stackOut_0_0 = null;
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
            var4 = new t(param2, param1);
            var4.field_h = (ml) (Object) new hd();
            var5 = -2 + ((sk) this).field_p;
            ((sk) this).a(((sk) this).field_p + 34, 13361, 0, ((sk) this).field_l, param0);
            var4.a(30, 13361, 7, ((sk) this).field_l - 14, var5);
            ((sk) this).b((byte) -78, (we) (Object) var4);
            stackOut_0_0 = (t) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("sk.M(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_G = 0;
        field_D = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = 3 * var0;
            if (var1 > 255) {
                var1 = 255;
            }
            field_D[var0] = bd.a(bd.a(ch.a(var1, 251723775) << 8, ch.a(var1 << 16, 16738534)), ch.a(var1, 16777215));
        }
        field_F = "to return to the normal view.";
    }
}
