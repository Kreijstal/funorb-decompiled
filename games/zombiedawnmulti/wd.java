/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends se implements in {
    static ri field_P;
    static id field_G;
    static int[] field_Q;
    private String field_O;
    static gd field_L;
    private ne field_R;
    private int[] field_N;
    private gn[] field_H;
    private int field_J;
    static String field_I;
    private fm field_M;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((wd) this).field_M.a(((wd) this).field_O, ((wd) this).field_y + param3 - -14, param1 + (((wd) this).field_i + 10), -28 + ((wd) this).field_n, ((wd) this).field_w, 16777215, -1, 0, 0, ((wd) this).field_M.field_C);
    }

    public static void a(byte param0) {
        field_I = null;
        field_P = null;
        field_L = null;
        field_Q = null;
        field_G = null;
        if (param0 > -23) {
            Object var2 = null;
            wd.a(11, 88, 108, -22, (ga) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ga param4) {
        try {
            ok.a(param1 + -126, param1, param4, param3, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wd.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((wd) this).field_J >= param1) {
            return;
        }
        gn[] var7 = new gn[param1];
        gn[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((wd) this).field_J; var5++) {
            var7[var5] = ((wd) this).field_H[var5];
            var4[var5] = ((wd) this).field_N[var5];
        }
        ((wd) this).field_J = param1;
        ((wd) this).field_H = var3;
        ((wd) this).field_N = var4;
    }

    final static void a(int param0, int param1, ga param2, int param3, int param4, int param5) {
        if (op.field_m.field_c) {
            return;
        }
        if (param4 < 21) {
            return;
        }
        if (df.field_I) {
            boolean discarded$0 = cf.field_s.a(0, param3, param5, param0, false);
            return;
        }
        try {
            param2.b((byte) -35, 58);
            param2.a(param1, (byte) -110);
            param2.a(param0, (byte) -125);
            param2.a(param3, (byte) -47);
            param2.a(param5, (byte) -109);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wd.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    wd(ne param0, fm param1, String param2) {
        super(0, 0, 288, 0, (nl) null);
        int var4_int = 0;
        ((wd) this).field_J = 0;
        try {
            ((wd) this).field_R = param0;
            ((wd) this).field_O = param2;
            ((wd) this).field_M = param1;
            var4_int = ((wd) this).field_O != null ? ((wd) this).field_M.a(((wd) this).field_O, 260, ((wd) this).field_M.field_C) : 0;
            ((wd) this).b(0, 0, 28972, 288, 22 - -var4_int);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final gn a(String param0, int param1, bj param2) {
        gn var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        gn stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        gn stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new gn(param0, param2);
              var4.field_h = (nl) (Object) new oq();
              var5 = ((wd) this).field_w - 2;
              ((wd) this).b(0, 0, 28972, ((wd) this).field_n, ((wd) this).field_w - -34);
              var4.b(7, var5, 28972, -14 + ((wd) this).field_n, 30);
              if (param1 < -59) {
                break L1;
              } else {
                wd.a((byte) -6);
                break L1;
              }
            }
            ((wd) this).b((byte) 122, (cf) (Object) var4);
            stackOut_2_0 = (gn) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("wd.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(String param0, int param1, boolean param2) {
        int var4_int = 0;
        try {
            var4_int = ((wd) this).field_J;
            if (!param2) {
                ((wd) this).field_N = null;
            }
            this.a(-3481, 1 + var4_int);
            ((wd) this).field_H[var4_int] = ((wd) this).a(param0, -108, (bj) this);
            ((wd) this).field_N[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wd.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
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
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (var6_int >= ((wd) this).field_J) {
                  break L2;
                } else {
                  if (param2 != ((wd) this).field_H[var6_int]) {
                    var6_int++;
                    continue L1;
                  } else {
                    var7 = ((wd) this).field_N[var6_int];
                    if (var7 == -1) {
                      ((wd) this).field_R.m(-7435);
                      break L2;
                    } else {
                      fb.a(((wd) this).field_N[var6_int], 111);
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param3 < -83) {
                  break L3;
                } else {
                  ((wd) this).a(115, -39, -122, -67);
                  break L3;
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
            stackOut_11_1 = new StringBuilder().append("wd.E(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Use this alternative as your account name";
    }
}
