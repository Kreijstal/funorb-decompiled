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
            throw oi.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    od(kg param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((od) this).a(param5, param3, 11, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(na param0, byte param1, int param2, int param3, String param4) {
        RuntimeException var6 = null;
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
            dh.field_d.a(param4, param2 + (param0.field_t - -(param0.field_F >> 1)), param3 - -param0.field_w - 5, 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("od.CA(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(33).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
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
        ig stackIn_3_0 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_2_0 = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5_int = param0.a(-1, param3);
            var6 = param0.a(var5_int, false, param1);
            stackOut_2_0 = un.a(-29082, param2, var5_int, var6, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("od.GA(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 95 + ')');
        }
        return stackIn_3_0;
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
            throw oi.a((Throwable) (Object) runtimeException, "od.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_4_0 = 0;
        bh stackIn_16_0 = null;
        bh stackIn_17_0 = null;
        bh stackIn_18_0 = null;
        String stackIn_18_1 = null;
        bh stackIn_19_0 = null;
        bh stackIn_20_0 = null;
        bh stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_31_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        bh stackOut_15_0 = null;
        bh stackOut_17_0 = null;
        String stackOut_17_1 = null;
        bh stackOut_16_0 = null;
        String stackOut_16_1 = null;
        bh stackOut_18_0 = null;
        bh stackOut_20_0 = null;
        String stackOut_20_1 = null;
        bh stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_30_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var13 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var14 = param2.a((byte) -54);
              var8 = param6.a((byte) -66);
              if (wa.field_e != null) {
                break L1;
              } else {
                if (om.a(false, (byte) -85)) {
                  break L1;
                } else {
                  stackOut_3_0 = -1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                }
              }
            }
            L2: {
              if (bc.field_z == qi.field_p) {
                L3: {
                  ui.field_b = null;
                  nd.field_Lb.field_t = 0;
                  if (param1 == null) {
                    L4: {
                      tb.field_j.field_t = 0;
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      stackOut_15_0 = tb.field_j;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (!param2.a(0)) {
                        stackOut_17_0 = (bh) (Object) stackIn_17_0;
                        stackOut_17_1 = "";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        break L4;
                      } else {
                        stackOut_16_0 = (bh) (Object) stackIn_16_0;
                        stackOut_16_1 = (String) var14;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        break L4;
                      }
                    }
                    L5: {
                      ((bh) (Object) stackIn_18_0).a(stackIn_18_1, (byte) 103);
                      stackOut_18_0 = tb.field_j;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (!param6.a(0)) {
                        stackOut_20_0 = (bh) (Object) stackIn_20_0;
                        stackOut_20_1 = "";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L5;
                      } else {
                        stackOut_19_0 = (bh) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) var8;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        break L5;
                      }
                    }
                    ((bh) (Object) stackIn_21_0).a(stackIn_21_1, (byte) 103);
                    nd.field_Lb.a(16, false);
                    nd.field_Lb.field_t = nd.field_Lb.field_t + 1;
                    var9 = nd.field_Lb.field_t;
                    ae.a(ki.field_c, (bh) (Object) nd.field_Lb, tb.field_j, jg.field_c, 104);
                    nd.field_Lb.b(-var9 + nd.field_Lb.field_t, -2);
                    break L3;
                  } else {
                    L6: {
                      var9 = 0;
                      if (param5) {
                        var9 = var9 | 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      tb.field_j.field_t = 0;
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.a(var14, (byte) 103);
                      tb.field_j.a(var8, (byte) 103);
                      var15 = (CharSequence) (Object) param1;
                      tb.field_j.a(h.a(var15, (byte) 56), (byte) 103);
                      tb.field_j.b(param3, false);
                      tb.field_j.a(param4, false);
                      tb.field_j.a(var9, false);
                      nd.field_Lb.a(18, false);
                      nd.field_Lb.field_t = nd.field_Lb.field_t + 2;
                      var10 = nd.field_Lb.field_t;
                      var11_ref_String = dd.a(lk.q(13), (byte) 99);
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    nd.field_Lb.a(var11_ref_String, 0);
                    ae.a(ki.field_c, (bh) (Object) nd.field_Lb, tb.field_j, jg.field_c, 123);
                    nd.field_Lb.a((byte) 59, -var10 + nd.field_Lb.field_t);
                    break L3;
                  }
                }
                ak.a((byte) -114, -1);
                qi.field_p = ha.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (ha.field_a != qi.field_p) {
                break L8;
              } else {
                if (en.b(99, 1)) {
                  L9: {
                    var9 = kb.field_q.d((byte) -99);
                    kb.field_q.field_t = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        og.field_h = new String[-100 + var9];
                        qi.field_p = oa.field_v;
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (99 != var9) {
                      qi.field_p = pb.field_d;
                      ua.field_c = var9;
                      rl.field_d = -1;
                      break L8;
                    } else {
                      boolean discarded$1 = en.b(96, bb.a(32032));
                      ui.field_b = new Boolean(bg.a((bh) (Object) kb.field_q, (byte) 55));
                      kb.field_q.field_t = 0;
                      break L8;
                    }
                  } else {
                    ei.a(lk.q(13), 60);
                    tg.field_d = k.field_d;
                    mk.a(false);
                    vb.field_j = false;
                    stackOut_30_0 = var9;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (qi.field_p == oa.field_v) {
                var9 = 2;
                if (en.b(117, var9)) {
                  var10 = kb.field_q.e(127);
                  kb.field_q.field_t = 0;
                  if (en.b(108, var10)) {
                    var11 = og.field_h.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        mk.a(false);
                        vb.field_j = false;
                        stackOut_45_0 = 100 + var11;
                        stackIn_46_0 = stackOut_45_0;
                        return stackIn_46_0;
                      } else {
                        og.field_h[var12] = kb.field_q.a(true);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (pb.field_d != qi.field_p) {
                break L12;
              } else {
                if (!ua.b(72)) {
                  break L12;
                } else {
                  L13: {
                    if (255 == ua.field_c) {
                      var9_ref_String = kb.field_q.i(-110);
                      if (var9_ref_String != null) {
                        qi.a(var9_ref_String, -7011, lk.q(13));
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      tg.field_d = kb.field_q.g((byte) 81);
                      break L13;
                    }
                  }
                  mk.a(false);
                  vb.field_j = false;
                  stackOut_54_0 = ua.field_c;
                  stackIn_55_0 = stackOut_54_0;
                  return stackIn_55_0;
                }
              }
            }
            L14: {
              if (wa.field_e == null) {
                if (!vb.field_j) {
                  var9 = ko.field_t;
                  ko.field_t = oi.field_m;
                  vb.field_j = true;
                  oi.field_m = var9;
                  break L14;
                } else {
                  L15: {
                    if (ib.a((byte) 127) <= 30000L) {
                      tg.field_d = ja.field_d;
                      break L15;
                    } else {
                      tg.field_d = wc.field_G;
                      break L15;
                    }
                  }
                  vb.field_j = false;
                  stackOut_62_0 = 249;
                  stackIn_63_0 = stackOut_62_0;
                  return stackIn_63_0;
                }
              } else {
                break L14;
              }
            }
            stackOut_65_0 = -1;
            stackIn_66_0 = stackOut_65_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("od.HA(").append(98).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L16;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L16;
            }
          }
          L17: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L17;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L17;
            }
          }
          L18: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param6 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L18;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ')');
        }
        return stackIn_66_0;
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
