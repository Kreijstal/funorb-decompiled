/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dl {
    int field_f;
    static ja field_c;
    String field_b;
    static l field_h;
    static cj field_a;
    static long field_e;
    static String field_g;
    static String field_d;

    abstract java.net.Socket b(int param0) throws IOException;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -61) {
          field_d = (String) null;
          field_g = null;
          field_d = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    final static void a(jh param0, boolean param1, k param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jh stackIn_5_0 = null;
        jh stackIn_6_0 = null;
        jh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        jh stackIn_8_0 = null;
        jh stackIn_9_0 = null;
        jh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        jh stackIn_11_0 = null;
        jh stackIn_12_0 = null;
        jh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        jh stackIn_14_0 = null;
        jh stackIn_15_0 = null;
        jh stackIn_16_0 = null;
        jh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        jh stackIn_18_0 = null;
        jh stackIn_19_0 = null;
        jh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        jh stackIn_21_0 = null;
        jh stackIn_22_0 = null;
        jh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        jh stackOut_4_0 = null;
        jh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        jh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jh stackOut_7_0 = null;
        jh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        jh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jh stackOut_10_0 = null;
        jh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        jh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        jh stackOut_13_0 = null;
        jh stackOut_14_0 = null;
        jh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        jh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        jh stackOut_17_0 = null;
        jh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        jh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        jh stackOut_20_0 = null;
        jh stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        jh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                param0.field_cc = param2.g(31365);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_mc = param2.g(31365);
              param0.field_Pb = param2.g(31365);
              var4_int = param2.g(31365);
              stackOut_4_0 = (jh) (param0);
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 == (var4_int & 128)) {
                stackOut_6_0 = (jh) ((Object) stackIn_6_0);
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = (jh) ((Object) stackIn_5_0);
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_Mb = stackIn_7_1 != 0;
              stackOut_7_0 = (jh) (param0);
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if ((var4_int & 64) == 0) {
                stackOut_9_0 = (jh) ((Object) stackIn_9_0);
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = (jh) ((Object) stackIn_8_0);
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              stackIn_10_0.field_Fb = stackIn_10_1 != 0;
              stackOut_10_0 = (jh) (param0);
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (-1 == (32 & var4_int ^ -1)) {
                stackOut_12_0 = (jh) ((Object) stackIn_12_0);
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = (jh) ((Object) stackIn_11_0);
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              L6: {
                stackIn_13_0.field_dc = stackIn_13_1 != 0;
                stackOut_13_0 = (jh) (param0);
                stackIn_16_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (!param0.field_Mb) {
                  break L6;
                } else {
                  stackOut_14_0 = (jh) ((Object) stackIn_14_0);
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (param0.field_cc >= param0.field_mc) {
                    break L6;
                  } else {
                    stackOut_15_0 = (jh) ((Object) stackIn_15_0);
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L5;
                  }
                }
              }
              stackOut_16_0 = (jh) ((Object) stackIn_16_0);
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L5;
            }
            L7: {
              stackIn_17_0.field_Ob = stackIn_17_1 != 0;
              stackOut_17_0 = (jh) (param0);
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if ((var4_int & 8) == 0) {
                stackOut_19_0 = (jh) ((Object) stackIn_19_0);
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L7;
              } else {
                stackOut_18_0 = (jh) ((Object) stackIn_18_0);
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L7;
              }
            }
            L8: {
              stackIn_20_0.field_Wb = stackIn_20_1 != 0;
              stackOut_20_0 = (jh) (param0);
              stackIn_22_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if ((16 & var4_int) == 0) {
                stackOut_22_0 = (jh) ((Object) stackIn_22_0);
                stackOut_22_1 = 1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L8;
              } else {
                stackOut_21_0 = (jh) ((Object) stackIn_21_0);
                stackOut_21_1 = 2;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                break L8;
              }
            }
            L9: {
              stackIn_23_0.field_fc = stackIn_23_1;
              if (-1 == (4 & var4_int ^ -1)) {
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L9;
              } else {
                stackOut_24_0 = 1;
                stackIn_26_0 = stackOut_24_0;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_26_0;
              if (!param3) {
                break L10;
              } else {
                field_d = (String) null;
                break L10;
              }
            }
            L11: {
              param2.a(0, -6351, param0.field_Zb.length, param0.field_Zb);
              if ((var4_int & 2) == 0) {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L11;
              } else {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L11;
              }
            }
            L12: {
              var6 = stackIn_31_0;
              param0.field_Ub = param2.d((byte) 69);
              param0.field_qc = bl.a((byte) 108) - (long)param2.i(-1478490344);
              if (var5 == 0) {
                param0.field_Sb = -1;
                break L12;
              } else {
                param0.field_Sb = param2.i(-1478490344);
                if (var9 == 0) {
                  break L12;
                } else {
                  param0.field_Sb = -1;
                  break L12;
                }
              }
            }
            L13: {
              param0.field_nc = param2.a((byte) -30);
              var7 = param2.field_j;
              param0.field_Nb = param2.f((byte) -74);
              if (var6 == 0) {
                break L13;
              } else {
                param0.field_bc = new String[param0.field_cc];
                param2.field_j = var7;
                var8 = 0;
                L14: while (true) {
                  L15: {
                    L16: {
                      if (var8 >= param0.field_cc) {
                        break L16;
                      } else {
                        param0.field_bc[var8] = param2.f((byte) -91);
                        var8++;
                        if (var9 != 0) {
                          break L15;
                        } else {
                          if (var9 == 0) {
                            continue L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    if (var9 == 0) {
                      break L15;
                    } else {
                      break L13;
                    }
                  }
                  break L0;
                }
              }
            }
            param0.field_bc = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var4);
            stackOut_45_1 = new StringBuilder().append("dl.H(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L17;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L17;
            }
          }
          L18: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param1).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L18;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L18;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (null != field_h) {
              L1: {
                g.c();
                if (param0 < -18) {
                  break L1;
                } else {
                  field_d = (String) null;
                  break L1;
                }
              }
              pk.field_c = new ja(60, 60);
              pk.field_c.a();
              oo.d(30, 30, 28, 4521728);
              wi.field_g = new ja[8];
              var1_int = 0;
              L2: while (true) {
                L3: {
                  if (var1_int >= 8) {
                    g.b();
                    break L3;
                  } else {
                    wi.field_g[var1_int] = new ja(22, 22);
                    wi.field_g[var1_int].a();
                    oo.d(11, 11, var1_int - -2, 5622784);
                    oo.d(11, 11, var1_int, 65793);
                    var1_int++;
                    if (var2 != 0) {
                      break L3;
                    } else {
                      continue L2;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "dl.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static Boolean c(byte param0) {
        Boolean var1 = dd.field_d;
        dd.field_d = null;
        int var2 = -94 % ((-29 - param0) / 60);
        return var1;
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 < 77) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_b, this.field_f);
    }

    static {
        field_d = "Two zombies lurch better than one.";
        field_g = "Type your age in years";
    }
}
