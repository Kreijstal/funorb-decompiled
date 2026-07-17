/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends gh {
    static int[] field_cc;
    private gh field_Yb;
    static String field_Sb;
    static String field_Wb;
    static String field_Tb;
    private gh field_Vb;
    static String field_Ub;
    static int field_ac;
    static String field_Zb;
    static String field_Xb;
    static cm field_bc;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((id) this).a(0, param0, param5, param4, param1);
        int var7 = 36 / ((param3 - -7) / 47);
        this.a(false, param2);
    }

    private final void a(boolean param0, int param1) {
        ((id) this).field_Yb.a(0, 0, ((id) this).field_Lb, 0, ((id) this).field_Yb.g(-2147483648));
        int var3 = ((id) this).field_Yb.field_zb - -param1;
        ((id) this).field_Vb.a(0, 0, ((id) this).field_Lb, var3, ((id) this).field_zb - var3);
    }

    public static void j() {
        field_Wb = null;
        field_Ub = null;
        field_Zb = null;
        field_Xb = null;
        field_bc = null;
        field_Sb = null;
        field_cc = null;
        field_Tb = null;
    }

    final int c(int param0, int param1) {
        if (param0 > -46) {
            return 30;
        }
        return param1 + ((id) this).field_Yb.g(-2147483648) + ((id) this).field_Vb.g(-2147483648);
    }

    id(long param0, id param1, String param2) {
        this(param0, param1.field_Yb, param1.field_Vb, param2);
    }

    final static void d(byte param0) {
        ci.field_a.c((lh) (Object) new pd(), -22908735);
        int var1 = -48 % ((param0 - -48) / 47);
    }

    id(long param0, wk param1, wk param2, int param3, gh param4, String param5) {
        this(param0, (gh) null, param4, param5);
        try {
            ((id) this).field_Yb.field_Fb = param3;
            ((id) this).field_Yb.field_Pb = param2;
            ((id) this).field_Yb.field_Hb = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "id.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(String param0, int param1, String param2, int param3, String param4, boolean param5, int param6) {
        ik var7 = null;
        RuntimeException var7_ref = null;
        ik var8 = null;
        int stackIn_3_0 = 0;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var7 = new ik(param2);
            var8 = new ik(param4);
            stackOut_2_0 = ka.a(param0, param5, param6, (byte) -124, param3, var7, var8);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("id.D(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(0).append(44);
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0;
    }

    private id(long param0, gh param1, gh param2, String param3) {
        super(param0, (gh) null);
        try {
            ((id) this).field_Yb = new gh(0L, param1);
            ((id) this).field_Vb = new gh(0L, param2);
            ((id) this).field_Vb.field_S = param3;
            ((id) this).a(((id) this).field_Yb, 127);
            ((id) this).a(((id) this).field_Vb, 127);
            ((id) this).h(46);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "id.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        int stackIn_4_0 = 0;
        String stackIn_6_0 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        String stackOut_20_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                stackOut_3_0 = param0.length();
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_int = stackIn_4_0;
            if (var2_int != 0) {
              var11 = new char[var2_int];
              var10 = var11;
              var9 = var10;
              var8 = var9;
              var3 = var8;
              var4 = 0;
              var5 = 0;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var2_int) {
                  stackOut_20_0 = new String(var11);
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L3: {
                    var3[var6] = param0.charAt(var6);
                    if (60 != var11[var6]) {
                      L4: {
                        if (var11[var6] != 62) {
                          break L4;
                        } else {
                          if (var4 > 0) {
                            var4--;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (0 != var4) {
                        break L3;
                      } else {
                        if (var5 != 0) {
                          break L3;
                        } else {
                          if (Character.isWhitespace(var11[var6])) {
                            break L3;
                          } else {
                            var5 = 1;
                            var3[var6] = Character.toUpperCase(var11[var6]);
                            break L3;
                          }
                        }
                      }
                    } else {
                      var4++;
                      break L3;
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
            } else {
              stackOut_5_0 = (String) param0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("id.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 0 + 41);
        }
        return stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Sb = "No";
        field_Wb = null;
        field_Tb = "Log in or create a free account to save your progress.";
        field_Ub = "Security";
        field_Xb = "Mute this player for 48 hours";
        field_cc = new int[]{40, 33, 46, 7};
        field_Zb = "DROP";
    }
}
