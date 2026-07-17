/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends hn {
    private nn field_R;
    private nn field_W;
    static int[] field_Y;
    private nn field_V;
    static jb field_S;
    static long field_T;
    static String[] field_Z;
    static int[] field_X;
    private boolean field_U;

    final int f(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 61) {
              stackOut_3_0 = Integer.parseInt(((od) this).field_V.field_A);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 115;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_4_0;
    }

    private od(kg param0, boolean param1) {
        super(0, 0, 0, 0, (kg) null);
        try {
            ((od) this).field_R = (nn) (Object) new fo("", (dn) null, 2);
            ((od) this).field_W = (nn) (Object) new fo("", (dn) null, 2);
            ((od) this).field_V = (nn) (Object) new fo("", (dn) null, 4);
            ((od) this).field_U = param1 ? true : false;
            ((od) this).field_V.field_H = param0;
            ((od) this).field_W.field_H = param0;
            ((od) this).field_R.field_H = param0;
            if (!((od) this).field_U) {
                ((od) this).c((na) (Object) ((od) this).field_R, 10);
                ((od) this).c((na) (Object) ((od) this).field_W, 10);
            } else {
                ((od) this).c((na) (Object) ((od) this).field_W, 10);
                ((od) this).c((na) (Object) ((od) this).field_R, 10);
            }
            ((od) this).c((na) (Object) ((od) this).field_V, 10);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    od(kg param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((od) this).a(param5, param3, 11, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final void a(na param0, byte param1, int param2, int param3, String param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              dh.field_d.a(param4, param2 + (param0.field_t - -(param0.field_F >> 1)), param3 - -param0.field_w - 5, 16777215, -1);
              if (param1 == 33) {
                break L1;
              } else {
                field_X = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("od.CA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final String e(int param0) {
        String var2 = ((od) this).field_W.e(param0 + param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!(!((od) this).field_r)) {
            return ((od) this).field_C == null ? ((od) this).field_A : ((od) this).field_C;
        }
        return null;
    }

    final static ig a(ah param0, String param1, ah param2, String param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        ig stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_int = param0.a(param4 ^ -96, param3);
            var6 = param0.a(var5_int, false, param1);
            if (param4 == 95) {
              stackOut_3_0 = un.a(-29082, param2, var5_int, var6, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ig) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("od.GA(");
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, 23, param3, param4);
        int var7 = -20 / ((-61 - param2) / 51);
        int var6 = param4 + -130 >> 1;
        if (!((od) this).field_U) {
            ((od) this).field_R.a(param0, 0, 77, var6, 25);
            ((od) this).field_W.a(param0, 0, -121, 45 + var6, 25);
        } else {
            ((od) this).field_W.a(param0, 0, -125, var6, 25);
            ((od) this).field_R.a(param0, 0, 43, var6 + 45, 25);
        }
        ((od) this).field_V.a(param0, 0, -121, var6 - -90, 40);
    }

    final int g(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            int discarded$2 = ((od) this).g((byte) -78);
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = Integer.parseInt(((od) this).field_R.field_A);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final void a(int param0, qh param1) {
        try {
            super.a(param0, param1);
            ((od) this).field_R.field_s = (dn) (Object) param1;
            ((od) this).field_W.field_s = (dn) (Object) param1;
            ((od) this).field_V.field_s = (dn) (Object) param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "od.W(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (!param0) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(((od) this).field_W.field_A) - 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return -14;
        }
    }

    final boolean h(int param0) {
        if (((od) this).field_R.field_A == null) {
          return true;
        } else {
          if (0 != ((od) this).field_R.field_A.length()) {
            L0: {
              if (((od) this).field_W.field_A == null) {
                break L0;
              } else {
                if (0 == ((od) this).field_W.field_A.length()) {
                  break L0;
                } else {
                  L1: {
                    if (((od) this).field_V.field_A == null) {
                      break L1;
                    } else {
                      if (0 != ((od) this).field_V.field_A.length()) {
                        L2: {
                          if (param0 == -30886) {
                            break L2;
                          } else {
                            field_X = null;
                            break L2;
                          }
                        }
                        return false;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return true;
                }
              }
            }
            return true;
          } else {
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0 ^ param0, param1, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        param2 = param2 + ((od) this).field_w;
        param1 = param1 + ((od) this).field_t;
        this.a((na) (Object) ((od) this).field_R, (byte) 33, param1, param2, ja.field_k);
        this.a((na) (Object) ((od) this).field_W, (byte) 33, param1, param2, lg.field_Z);
        this.a((na) (Object) ((od) this).field_V, (byte) 33, param1, param2, me.field_h);
    }

    final static int a(byte param0, String param1, hb param2, int param3, int param4, boolean param5, hb param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int stackIn_6_0 = 0;
        bh stackIn_18_0 = null;
        bh stackIn_19_0 = null;
        bh stackIn_20_0 = null;
        String stackIn_20_1 = null;
        bh stackIn_21_0 = null;
        bh stackIn_22_0 = null;
        bh stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        bh stackOut_17_0 = null;
        bh stackOut_19_0 = null;
        String stackOut_19_1 = null;
        bh stackOut_18_0 = null;
        String stackOut_18_1 = null;
        bh stackOut_20_0 = null;
        bh stackOut_22_0 = null;
        String stackOut_22_1 = null;
        bh stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_32_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var16 = null;
        var13 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 98) {
                break L1;
              } else {
                var14 = null;
                ig discarded$2 = od.a((ah) null, (String) null, (ah) null, (String) null, (byte) -75);
                break L1;
              }
            }
            L2: {
              var15 = param2.a((byte) -54);
              var8 = param6.a((byte) -66);
              if (wa.field_e != null) {
                break L2;
              } else {
                if (om.a(false, (byte) -85)) {
                  break L2;
                } else {
                  stackOut_5_0 = -1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              }
            }
            L3: {
              if (bc.field_z == qi.field_p) {
                L4: {
                  ui.field_b = null;
                  nd.field_Lb.field_t = 0;
                  if (param1 == null) {
                    L5: {
                      tb.field_j.field_t = 0;
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      stackOut_17_0 = tb.field_j;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (!param2.a(0)) {
                        stackOut_19_0 = (bh) (Object) stackIn_19_0;
                        stackOut_19_1 = "";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L5;
                      } else {
                        stackOut_18_0 = (bh) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) var15;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L5;
                      }
                    }
                    L6: {
                      ((bh) (Object) stackIn_20_0).a(stackIn_20_1, (byte) 103);
                      stackOut_20_0 = tb.field_j;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (!param6.a(0)) {
                        stackOut_22_0 = (bh) (Object) stackIn_22_0;
                        stackOut_22_1 = "";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L6;
                      } else {
                        stackOut_21_0 = (bh) (Object) stackIn_21_0;
                        stackOut_21_1 = (String) var8;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        break L6;
                      }
                    }
                    ((bh) (Object) stackIn_23_0).a(stackIn_23_1, (byte) 103);
                    nd.field_Lb.a(16, false);
                    nd.field_Lb.field_t = nd.field_Lb.field_t + 1;
                    var9 = nd.field_Lb.field_t;
                    ae.a(ki.field_c, (bh) (Object) nd.field_Lb, tb.field_j, jg.field_c, 104);
                    nd.field_Lb.b(-var9 + nd.field_Lb.field_t, -2);
                    break L4;
                  } else {
                    L7: {
                      var9 = 0;
                      if (param5) {
                        var9 = var9 | 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      tb.field_j.field_t = 0;
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.a(var15, (byte) 103);
                      tb.field_j.a(var8, (byte) 103);
                      var17 = (CharSequence) (Object) param1;
                      tb.field_j.a(h.a(var17, (byte) 56), (byte) 103);
                      tb.field_j.b(param3, false);
                      tb.field_j.a(param4, false);
                      tb.field_j.a(var9, false);
                      nd.field_Lb.a(18, false);
                      nd.field_Lb.field_t = nd.field_Lb.field_t + 2;
                      var10 = nd.field_Lb.field_t;
                      var11_ref_String = dd.a(lk.q(13), (byte) 99);
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    nd.field_Lb.a(var11_ref_String, 0);
                    ae.a(ki.field_c, (bh) (Object) nd.field_Lb, tb.field_j, jg.field_c, 123);
                    nd.field_Lb.a((byte) 59, -var10 + nd.field_Lb.field_t);
                    break L4;
                  }
                }
                ak.a((byte) -114, -1);
                qi.field_p = ha.field_a;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (ha.field_a != qi.field_p) {
                break L9;
              } else {
                if (en.b(99, 1)) {
                  L10: {
                    var9 = kb.field_q.d((byte) -99);
                    kb.field_q.field_t = 0;
                    if (var9 < 100) {
                      break L10;
                    } else {
                      if (var9 <= 105) {
                        og.field_h = new String[-100 + var9];
                        qi.field_p = oa.field_v;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (99 != var9) {
                      qi.field_p = pb.field_d;
                      ua.field_c = var9;
                      rl.field_d = -1;
                      break L9;
                    } else {
                      boolean discarded$3 = en.b(96, bb.a(param0 + 31934));
                      ui.field_b = new Boolean(bg.a((bh) (Object) kb.field_q, (byte) 55));
                      kb.field_q.field_t = 0;
                      break L9;
                    }
                  } else {
                    ei.a(lk.q(13), 60);
                    tg.field_d = k.field_d;
                    mk.a(false);
                    vb.field_j = false;
                    stackOut_32_0 = var9;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (qi.field_p == oa.field_v) {
                var9 = 2;
                if (en.b(param0 ^ 23, var9)) {
                  var10 = kb.field_q.e(127);
                  kb.field_q.field_t = 0;
                  if (en.b(108, var10)) {
                    var11 = og.field_h.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var12 >= var11) {
                        mk.a(false);
                        vb.field_j = false;
                        stackOut_47_0 = 100 + var11;
                        stackIn_48_0 = stackOut_47_0;
                        return stackIn_48_0;
                      } else {
                        og.field_h[var12] = kb.field_q.a(true);
                        var12++;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L13: {
              if (pb.field_d != qi.field_p) {
                break L13;
              } else {
                if (!ua.b(72)) {
                  break L13;
                } else {
                  L14: {
                    if (255 == ua.field_c) {
                      var9_ref_String = kb.field_q.i(param0 + -208);
                      if (var9_ref_String != null) {
                        qi.a(var9_ref_String, -7011, lk.q(13));
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      tg.field_d = kb.field_q.g((byte) 81);
                      break L14;
                    }
                  }
                  mk.a(false);
                  vb.field_j = false;
                  stackOut_56_0 = ua.field_c;
                  stackIn_57_0 = stackOut_56_0;
                  return stackIn_57_0;
                }
              }
            }
            L15: {
              if (wa.field_e == null) {
                if (!vb.field_j) {
                  var9 = ko.field_t;
                  ko.field_t = oi.field_m;
                  vb.field_j = true;
                  oi.field_m = var9;
                  break L15;
                } else {
                  L16: {
                    if (ib.a((byte) 127) <= 30000L) {
                      tg.field_d = ja.field_d;
                      break L16;
                    } else {
                      tg.field_d = wc.field_G;
                      break L16;
                    }
                  }
                  vb.field_j = false;
                  stackOut_64_0 = 249;
                  stackIn_65_0 = stackOut_64_0;
                  return stackIn_65_0;
                }
              } else {
                break L15;
              }
            }
            stackOut_67_0 = -1;
            stackIn_68_0 = stackOut_67_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("od.HA(").append(param0).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L17;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L17;
            }
          }
          L18: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param2 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L18;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L18;
            }
          }
          L19: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param6 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L19;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L19;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 41);
        }
        return stackIn_68_0;
    }

    public static void e(boolean param0) {
        field_X = null;
        field_S = null;
        field_Z = null;
        field_Y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new int[]{2, 14, 15, 6, 5, 16, 17, 12};
        field_Z = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = new int[8192];
    }
}
