/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class lk extends ml implements dm {
    static int field_sb;
    private boolean field_ob;
    private boolean field_rb;
    static int field_wb;
    private boolean field_qb;
    private boolean field_vb;
    private jb field_ub;
    static String field_pb;
    private lg field_tb;
    static String field_nb;

    public static void f() {
        int var1 = 33;
        field_nb = null;
        field_pb = null;
    }

    final static le a(int param0, hl param1, hl param2, hl param3, int[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        le[] var8 = null;
        int var9 = 0;
        Exception var10 = null;
        int var10_int = 0;
        j var11 = null;
        int var12 = 0;
        Object var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        char[] var17 = null;
        Object stackIn_9_0 = null;
        le stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        le stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var5_int = param4.length;
              if (param0 <= -26) {
                break L1;
              } else {
                var13 = null;
                le discarded$1 = lk.a(90, (hl) null, (hl) null, (hl) null, (int[]) null);
                break L1;
              }
            }
            var6 = new String[var5_int];
            var17 = new char[var5_int];
            var16 = var17;
            var15 = var16;
            var14 = var15;
            var7 = var14;
            var8 = new le[var5_int];
            var9 = 49;
            try {
              L2: {
                var10_int = 0;
                L3: while (true) {
                  if (var10_int >= var5_int) {
                    break L2;
                  } else {
                    var11 = eh.field_p.a(param4[var10_int], -128);
                    var6[var10_int] = var11.h(-107);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L3;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (le) (Object) stackIn_9_0;
            }
            stackOut_10_0 = new le(0L, param3, param2, param1, var8, param4, var6, var17);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("lk.DA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_11_0;
    }

    lk(pk param0, jb param1, String param2, boolean param3, boolean param4) {
        super(param0, (na) (Object) new ba((lk) null, param1, param2), 77, 10, 10);
        try {
            ((lk) this).field_ob = false;
            ((lk) this).field_qb = false;
            ((lk) this).field_ub = param1;
            ((lk) this).field_rb = param4 ? true : false;
            ((lk) this).field_vb = param3 ? true : false;
            ((lk) this).field_tb = new lg(13, 50, 274, 30, 15, 2113632, 4210752);
            ((lk) this).field_tb.field_K = true;
            ((lk) this).c((na) (Object) ((lk) this).field_tb, 10);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "lk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                java.applet.Applet discarded$2 = lk.q(108);
                break L1;
              }
            }
            if (param0 == 13) {
              ((lk) this).r(-125);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              stackOut_6_0 = super.a(param0, param1, 1, param3);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("lk.DB(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final void p(int param0) {
        if (param0 != 128) {
            Object var3 = null;
            lk.a(false, (byte) -124, 39, (el) null, -11, -14, 32, -111);
        }
        ((lk) this).field_tb.b(param0 ^ 248, 2121792, 4210752);
        ba var2 = new ba((lk) this, ((lk) this).field_ub, oa.field_t);
        var2.a(lm.field_l, 15, param0 ^ -256);
        ((lk) this).e((na) (Object) var2, -27667);
    }

    final static java.applet.Applet q(int param0) {
        if (param0 != 13) {
            field_sb = 60;
        }
        if (!(null == ik.field_c)) {
            return ik.field_c;
        }
        return (java.applet.Applet) (Object) lc.field_a;
    }

    final void r(int param0) {
        if (((lk) this).field_K) {
          L0: {
            ((lk) this).field_K = false;
            if (((lk) this).field_vb) {
              gg.c(-8);
              break L0;
            } else {
              if (((lk) this).field_rb) {
                int discarded$4 = 116;
                aa.d();
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (param0 < -122) {
              break L1;
            } else {
              ((lk) this).r(122);
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (!sj.a(3010, param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 != null) {
                var3_int = param2.length();
                if (12 <= var3_int) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                } else {
                  if (!tk.a((byte) 81, param0)) {
                    stackOut_18_0 = 1;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    if (var3_int == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("lk.R(").append(param0).append(44).append(-1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static void a(boolean param0, byte param1, int param2, el param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        nh[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        nh var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        nh[] var17 = null;
        int[] var18 = null;
        nh[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        nh[][] stackIn_34_0 = null;
        nh[][] stackIn_35_0 = null;
        nh[][] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        nh[][] stackOut_33_0 = null;
        nh[][] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        nh[][] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var15 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param1 < -111) {
                break L1;
              } else {
                var16 = null;
                lk.a(true, (byte) -16, 61, (el) null, -105, 77, -74, -96);
                break L1;
              }
            }
            L2: {
              if (param6 > param2) {
                L3: {
                  stackOut_33_0 = cn.field_e;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if (-1 == param2) {
                    stackOut_35_0 = (nh[][]) (Object) stackIn_35_0;
                    stackOut_35_1 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L3;
                  } else {
                    stackOut_34_0 = (nh[][]) (Object) stackIn_34_0;
                    stackOut_34_1 = param2 + 4;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    break L3;
                  }
                }
                L4: {
                  var17 = stackIn_36_0[stackIn_36_1];
                  var19 = var17;
                  var8_array = var19;
                  var9 = 1;
                  if (!param0) {
                    break L4;
                  } else {
                    if (param2 == -1) {
                      var10 = 0;
                      L5: while (true) {
                        if (cl.field_f.length <= var10) {
                          break L4;
                        } else {
                          if (0 == (km.field_o[var10 / 8] & 1 << (7 & var10))) {
                            var10++;
                            continue L5;
                          } else {
                            var9 = 0;
                            break L4;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L6: while (true) {
                        L7: {
                          if (var10 >= -1 + var17.length) {
                            break L7;
                          } else {
                            if ((lo.field_a[(param4 - -var10) / 8] & 1 << (7 & param4 + var10)) != 0) {
                              var9 = 0;
                              break L7;
                            } else {
                              var10++;
                              continue L6;
                            }
                          }
                        }
                        param4 = param4 + (255 & nn.field_Y[param2]);
                        break L4;
                      }
                    }
                  }
                }
                var10 = 0;
                var11 = 0;
                L8: while (true) {
                  L9: {
                    if (param2 != -1) {
                      stackOut_53_0 = var19.length + -1;
                      stackIn_54_0 = stackOut_53_0;
                      break L9;
                    } else {
                      stackOut_52_0 = cl.field_f.length;
                      stackIn_54_0 = stackOut_52_0;
                      break L9;
                    }
                  }
                  if (stackIn_54_0 <= var11) {
                    if (var10 == 0) {
                      var11 = 0;
                      L10: while (true) {
                        if (-1 + var19.length <= var11) {
                          break L2;
                        } else {
                          L11: {
                            if (param2 == -1) {
                              param5 = var11;
                              break L11;
                            } else {
                              eg.field_K[param2] = (byte)var11;
                              break L11;
                            }
                          }
                          lk.a(param0, (byte) -118, param2 + 1, param3, param4, param5, param6, param7);
                          if (nn.field_R) {
                            return;
                          } else {
                            var11++;
                            continue L10;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L12: {
                      if (-1 == param2) {
                        param5 = var11;
                        break L12;
                      } else {
                        eg.field_K[param2] = (byte)var11;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        if (param2 != -1) {
                          break L14;
                        } else {
                          if (cl.field_f.length != 1) {
                            break L14;
                          } else {
                            var12 = 1;
                            break L13;
                          }
                        }
                      }
                      var13 = var8_array[var11 + 1];
                      if (param0) {
                        L15: {
                          if (!var13.field_zb) {
                            if (var9 != 0) {
                              if (var13.field_S) {
                                stackOut_76_0 = 1;
                                stackIn_78_0 = stackOut_76_0;
                                break L15;
                              } else {
                                stackOut_75_0 = 0;
                                stackIn_78_0 = stackOut_75_0;
                                break L15;
                              }
                            } else {
                              stackOut_73_0 = 0;
                              stackIn_78_0 = stackOut_73_0;
                              break L15;
                            }
                          } else {
                            stackOut_71_0 = 1;
                            stackIn_78_0 = stackOut_71_0;
                            break L15;
                          }
                        }
                        var12 = stackIn_78_0;
                        break L13;
                      } else {
                        L16: {
                          if (param2 == -1) {
                            if (cl.field_f[var11] != qb.field_N.field_rc) {
                              stackOut_68_0 = 0;
                              stackIn_69_0 = stackOut_68_0;
                              break L16;
                            } else {
                              stackOut_67_0 = 1;
                              stackIn_69_0 = stackOut_67_0;
                              break L16;
                            }
                          } else {
                            if (var11 != (255 & qb.field_N.field_sc[param2])) {
                              stackOut_65_0 = 0;
                              stackIn_69_0 = stackOut_65_0;
                              break L16;
                            } else {
                              stackOut_64_0 = 1;
                              stackIn_69_0 = stackOut_64_0;
                              break L16;
                            }
                          }
                        }
                        var12 = stackIn_69_0;
                        break L13;
                      }
                    }
                    L17: {
                      if (var12 != 0) {
                        lk.a(param0, (byte) -120, param2 - -1, param3, param4, param5, param6, param7);
                        var10 = 1;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    if (nn.field_R) {
                      return;
                    } else {
                      var11++;
                      continue L8;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L18: while (true) {
                  if (var9 >= uj.field_s.length) {
                    if (var8_int != 0) {
                      nn.field_R = true;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var22 = uj.field_s[var9];
                    var21 = var22;
                    var20 = var21;
                    var18 = var20;
                    var10_ref_int__ = var18;
                    var11 = 0;
                    var12 = 0;
                    L19: while (true) {
                      L20: {
                        if (var12 >= var22.length) {
                          L21: {
                            if (var11 != 0) {
                              break L21;
                            } else {
                              if (hg.field_k == param2) {
                                break L21;
                              } else {
                                break L20;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L22: while (true) {
                            if (var12 >= var22.length) {
                              break L20;
                            } else {
                              L23: {
                                var13_int = var22[var12];
                                if (var13_int != -1) {
                                  if (param2 > var13_int) {
                                    rh.field_G[var13_int] = true;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                } else {
                                  n.field_P = true;
                                  break L23;
                                }
                              }
                              var12 += 2;
                              continue L22;
                            }
                          }
                        } else {
                          L24: {
                            var13_int = var22[var12];
                            var14 = var10_ref_int__[1 + var12];
                            if (-1 == var13_int) {
                              if (cl.field_f[param5] == var14) {
                                break L24;
                              } else {
                                break L20;
                              }
                            } else {
                              L25: {
                                if (param2 != var13_int) {
                                  break L25;
                                } else {
                                  if (param7 != var14) {
                                    break L25;
                                  } else {
                                    var11 = 1;
                                    break L24;
                                  }
                                }
                              }
                              if (var13_int >= param2) {
                                break L20;
                              } else {
                                if ((255 & eg.field_K[var13_int]) == var14) {
                                  break L24;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          var12 += 2;
                          continue L19;
                        }
                      }
                      var9++;
                      continue L18;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) var8;
            stackOut_98_1 = new StringBuilder().append("lk.GA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param3 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L26;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L26;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        ba var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ba stackIn_12_0 = null;
        ba stackIn_13_0 = null;
        ba stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ba stackOut_11_0 = null;
        ba stackOut_13_0 = null;
        String stackOut_13_1 = null;
        ba stackOut_12_0 = null;
        String stackOut_12_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (!((lk) this).field_qb) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param1 != 256) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                ((lk) this).field_ob = stackIn_6_1 != 0;
                ((lk) this).field_qb = true;
                ((lk) this).field_tb.b(-32, 8405024, 4210752);
                if (param2 == 17) {
                  break L2;
                } else {
                  ((lk) this).r(0);
                  break L2;
                }
              }
              L3: {
                var6 = new ba((lk) this, ((lk) this).field_ub, param0);
                if (5 != param1) {
                  if (param1 == 256) {
                    ae discarded$2 = var6.a((dn) this, param2 ^ -44, mb.field_v);
                    break L3;
                  } else {
                    L4: {
                      stackOut_11_0 = (ba) var6;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (!((lk) this).field_vb) {
                        stackOut_13_0 = (ba) (Object) stackIn_13_0;
                        stackOut_13_1 = nb.field_T;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L4;
                      } else {
                        stackOut_12_0 = (ba) (Object) stackIn_12_0;
                        stackOut_12_1 = mb.field_v;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L4;
                      }
                    }
                    ((ba) (Object) stackIn_14_0).a(stackIn_14_1, -1, param2 ^ 103);
                    break L3;
                  }
                } else {
                  var6.a(ml.field_hb, 11, 94);
                  var6.a(uh.field_a, 17, 91);
                  break L3;
                }
              }
              L5: {
                L6: {
                  if (param1 == 3) {
                    var6.a(hl.field_C, 7, param2 ^ 108);
                    break L6;
                  } else {
                    if (param1 == 4) {
                      var6.a(u.field_d, 8, 97);
                      break L6;
                    } else {
                      if (6 == param1) {
                        var6.a(em.field_c, 9, 81);
                        break L6;
                      } else {
                        if (9 == param1) {
                          ae discarded$3 = var6.a((dn) this, 40, jm.field_d);
                          break L6;
                        } else {
                          ((lk) this).e((na) (Object) var6, -27667);
                          break L5;
                        }
                      }
                    }
                  }
                }
                ((lk) this).e((na) (Object) var6, -27667);
                break L5;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("lk.EA(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public void a(byte param0, ae param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
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
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                ((lk) this).field_rb = false;
                break L1;
              }
            }
            L2: {
              if (((lk) this).field_ob) {
                t.a(3, 0);
                ((lk) this).r(-124);
                break L2;
              } else {
                ha.a(-92, "tochangedisplayname.ws", lk.q(13));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("lk.M(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = -1;
        field_nb = "Remove <%0> from ignore list";
        field_pb = "Start Game";
    }
}
