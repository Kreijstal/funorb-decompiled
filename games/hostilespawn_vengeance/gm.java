/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class gm {
    static int field_f;
    static vl field_d;
    private boolean field_b;
    bd[] field_c;
    private int field_i;
    static String[] field_k;
    bd field_a;
    private int field_h;
    static bd field_j;
    static int field_m;
    private int field_l;
    private int field_e;
    private int field_g;

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_5_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              od.field_I = ee.field_b;
              if (255 != param3) {
                if (param3 < 100) {
                  wj.field_H = an.a(param3, -10, param1);
                  break L1;
                } else {
                  if (param3 <= 105) {
                    wj.field_H = vf.a(param2, true);
                    break L1;
                  } else {
                    wj.field_H = an.a(param3, -10, param1);
                    break L1;
                  }
                }
              } else {
                L2: {
                  if (ia.field_h >= 13) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                wj.field_H = qi.a(stackIn_5_0 != 0, false);
                break L1;
              }
            }
            if (param0 == 26991) {
              break L0;
            } else {
              var6 = null;
              gm.a(58, (String) null, (String[]) null, -3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("gm.M(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ')');
        }
    }

    final static int a(CharSequence param0, char param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = param0.length();
              if (param2 == 125) {
                break L1;
              } else {
                var7 = null;
                int discarded$2 = gm.a((CharSequence) null, '7', (byte) 37);
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (var4 <= var5) {
                stackOut_12_0 = var3_int;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L3: {
                  if (param1 == param0.charAt(var5)) {
                    var3_int++;
                    var5++;
                    break L3;
                  } else {
                    var5++;
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("gm.J(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final void b(int param0) {
        ((gm) this).field_g = 0;
        ((gm) this).field_l = -1;
        ((gm) this).field_c = null;
        ((gm) this).field_e = 256;
        ((gm) this).field_i = 0;
        ((gm) this).field_a = null;
        if (param0 < 121) {
          ((gm) this).field_e = 19;
          ((gm) this).field_h = 0;
          return;
        } else {
          ((gm) this).field_h = 0;
          return;
        }
    }

    final gm a(boolean param0, bd[] param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var4 = null;
                String discarded$2 = gm.a((CharSequence) null, 89, true);
                break L1;
              }
            }
            ((gm) this).field_c = param1;
            stackOut_2_0 = this;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gm.L(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return (gm) this;
    }

    final gm a(int param0, boolean param1) {
        ((gm) this).field_i = param0;
        if (!param1) {
            return null;
        }
        return (gm) this;
    }

    final void a(ha param0, int param1, int param2, ag param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        int var7 = 0;
        vm stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        vm stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        vm stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        vm stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        vm stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        vm stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        vm stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        vm stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        vm stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        vm stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        vm stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        vm stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        vm stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        vm stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        vm stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        vm stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        vm stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int stackOut_27_7 = 0;
        int stackOut_27_8 = 0;
        vm stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              hm.a(param3.field_s, ((gm) this).field_c, false, param3.field_x, param3.field_m + param4, param2 + param3.field_v);
              if (null != ((gm) this).field_a) {
                L2: {
                  var6_int = ((gm) this).field_h + (param2 - -param3.field_v);
                  if (param0.field_k != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-((gm) this).field_a.field_u + param3.field_s) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = ((gm) this).field_g + param4 - -param3.field_m;
                  if (param0.field_k != 2) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-((gm) this).field_a.field_u + param3.field_s);
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_b == 1) {
                    var7 = var7 + (param3.field_x - ((gm) this).field_a.field_r) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_b == 2) {
                    var7 = var7 + (param3.field_x + -((gm) this).field_a.field_r);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((gm) this).field_a.e(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 >= 118) {
              L6: {
                var6_ref = param0.c(param3, 3);
                if (var6_ref == null) {
                  break L6;
                } else {
                  if (null == param0.field_g) {
                    break L6;
                  } else {
                    if (((gm) this).field_i >= 0) {
                      L7: {
                        stackOut_19_0 = param0.field_g;
                        stackOut_19_1 = (String) var6_ref;
                        stackOut_19_2 = param2 + (param3.field_v + param0.field_q);
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        if (2147483647 == ((gm) this).field_h) {
                          stackOut_21_0 = (vm) (Object) stackIn_21_0;
                          stackOut_21_1 = (String) (Object) stackIn_21_1;
                          stackOut_21_2 = stackIn_21_2;
                          stackOut_21_3 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          stackIn_22_1 = stackOut_21_1;
                          stackIn_22_2 = stackOut_21_2;
                          stackIn_22_3 = stackOut_21_3;
                          break L7;
                        } else {
                          stackOut_20_0 = (vm) (Object) stackIn_20_0;
                          stackOut_20_1 = (String) (Object) stackIn_20_1;
                          stackOut_20_2 = stackIn_20_2;
                          stackOut_20_3 = ((gm) this).field_h;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_22_2 = stackOut_20_2;
                          stackIn_22_3 = stackOut_20_3;
                          break L7;
                        }
                      }
                      L8: {
                        stackOut_22_0 = (vm) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) (Object) stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2 - -stackIn_22_3;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        if (2147483647 != ((gm) this).field_g) {
                          stackOut_24_0 = (vm) (Object) stackIn_24_0;
                          stackOut_24_1 = (String) (Object) stackIn_24_1;
                          stackOut_24_2 = stackIn_24_2;
                          stackOut_24_3 = ((gm) this).field_g;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          stackIn_25_3 = stackOut_24_3;
                          break L8;
                        } else {
                          stackOut_23_0 = (vm) (Object) stackIn_23_0;
                          stackOut_23_1 = (String) (Object) stackIn_23_1;
                          stackOut_23_2 = stackIn_23_2;
                          stackOut_23_3 = 0;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_25_2 = stackOut_23_2;
                          stackIn_25_3 = stackOut_23_3;
                          break L8;
                        }
                      }
                      L9: {
                        stackOut_25_0 = (vm) (Object) stackIn_25_0;
                        stackOut_25_1 = (String) (Object) stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = stackIn_25_3 + (param0.field_n + param4) + param3.field_m;
                        stackOut_25_4 = -param0.field_p + param3.field_s - param0.field_q;
                        stackOut_25_5 = param3.field_x - (param0.field_n + param0.field_i);
                        stackOut_25_6 = ((gm) this).field_i;
                        stackOut_25_7 = ((gm) this).field_l;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        stackIn_27_2 = stackOut_25_2;
                        stackIn_27_3 = stackOut_25_3;
                        stackIn_27_4 = stackOut_25_4;
                        stackIn_27_5 = stackOut_25_5;
                        stackIn_27_6 = stackOut_25_6;
                        stackIn_27_7 = stackOut_25_7;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
                        stackIn_26_4 = stackOut_25_4;
                        stackIn_26_5 = stackOut_25_5;
                        stackIn_26_6 = stackOut_25_6;
                        stackIn_26_7 = stackOut_25_7;
                        if (((gm) this).field_e != -2147483648) {
                          stackOut_27_0 = (vm) (Object) stackIn_27_0;
                          stackOut_27_1 = (String) (Object) stackIn_27_1;
                          stackOut_27_2 = stackIn_27_2;
                          stackOut_27_3 = stackIn_27_3;
                          stackOut_27_4 = stackIn_27_4;
                          stackOut_27_5 = stackIn_27_5;
                          stackOut_27_6 = stackIn_27_6;
                          stackOut_27_7 = stackIn_27_7;
                          stackOut_27_8 = ((gm) this).field_e;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          stackIn_28_2 = stackOut_27_2;
                          stackIn_28_3 = stackOut_27_3;
                          stackIn_28_4 = stackOut_27_4;
                          stackIn_28_5 = stackOut_27_5;
                          stackIn_28_6 = stackOut_27_6;
                          stackIn_28_7 = stackOut_27_7;
                          stackIn_28_8 = stackOut_27_8;
                          break L9;
                        } else {
                          stackOut_26_0 = (vm) (Object) stackIn_26_0;
                          stackOut_26_1 = (String) (Object) stackIn_26_1;
                          stackOut_26_2 = stackIn_26_2;
                          stackOut_26_3 = stackIn_26_3;
                          stackOut_26_4 = stackIn_26_4;
                          stackOut_26_5 = stackIn_26_5;
                          stackOut_26_6 = stackIn_26_6;
                          stackOut_26_7 = stackIn_26_7;
                          stackOut_26_8 = 256;
                          stackIn_28_0 = stackOut_26_0;
                          stackIn_28_1 = stackOut_26_1;
                          stackIn_28_2 = stackOut_26_2;
                          stackIn_28_3 = stackOut_26_3;
                          stackIn_28_4 = stackOut_26_4;
                          stackIn_28_5 = stackOut_26_5;
                          stackIn_28_6 = stackOut_26_6;
                          stackIn_28_7 = stackOut_26_7;
                          stackIn_28_8 = stackOut_26_8;
                          break L9;
                        }
                      }
                      int discarded$1 = ((vm) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param0.field_k, param0.field_b, param0.field_a);
                      break L6;
                    } else {
                      return;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("gm.G(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param4 + ')');
        }
    }

    final void a(ag param0, gm param1, byte param2, ha param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (!((gm) this).field_b) {
                break L1;
              } else {
                param1.a(param3, 126, param5, param0, param4);
                param1.b(125);
                break L1;
              }
            }
            L2: {
              if (-2147483648 != ((gm) this).field_e) {
                param1.field_e = ((gm) this).field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 > 40) {
                break L3;
              } else {
                ((gm) this).field_g = 72;
                break L3;
              }
            }
            L4: {
              if (((gm) this).field_h == -2147483648) {
                break L4;
              } else {
                param1.field_h = ((gm) this).field_h;
                break L4;
              }
            }
            L5: {
              if (null != ((gm) this).field_a) {
                param1.field_a = ((gm) this).field_a;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((gm) this).field_c != null) {
                param1.field_c = ((gm) this).field_c;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-1 <= ((gm) this).field_l) {
                param1.field_l = ((gm) this).field_l;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((gm) this).field_g == -2147483648) {
                break L8;
              } else {
                param1.field_g = ((gm) this).field_g;
                break L8;
              }
            }
            if (-1 > ((gm) this).field_i) {
              break L0;
            } else {
              param1.field_i = ((gm) this).field_i;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("gm.F(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(gm param0, byte param1) {
        try {
            param0.field_g = ((gm) this).field_g;
            param0.field_b = ((gm) this).field_b;
            param0.field_i = ((gm) this).field_i;
            param0.field_l = ((gm) this).field_l;
            param0.field_e = ((gm) this).field_e;
            param0.field_h = ((gm) this).field_h;
            param0.field_a = ((gm) this).field_a;
            if (param1 != 33) {
                field_m = 89;
            }
            param0.field_c = ((gm) this).field_c;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "gm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final gm a(int param0, int param1) {
        if (param0 != -2147483648) {
            field_f = -11;
            ((gm) this).field_l = param1;
            return (gm) this;
        }
        ((gm) this).field_l = param1;
        return (gm) this;
    }

    public static void a(int param0) {
        field_j = null;
        field_d = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        Object var2 = null;
        String discarded$0 = gm.a((CharSequence) null, 54, false);
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3 = tb.a(param0, -24224, param2);
          if (var3 == null) {
            L0: {
              var4 = 0;
              if (param1 < -115) {
                break L0;
              } else {
                gm.a(-73);
                break L0;
              }
            }
            L1: while (true) {
              if (param0.length() > var4) {
                if (aa.a(param0.charAt(var4), (byte) 108)) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_9_0 = wk.field_e;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = (String) var3;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("gm.I(");
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
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final gm a(byte param0, int param1) {
        ((gm) this).field_g = param1;
        if (param0 < 23) {
            gm discarded$0 = ((gm) this).a((byte) 13, false);
            return (gm) this;
        }
        return (gm) this;
    }

    final gm b(int param0, int param1) {
        ((gm) this).field_h = param0;
        if (param1 != 16802) {
            gm discarded$0 = ((gm) this).a(107, -107);
            return (gm) this;
        }
        return (gm) this;
    }

    final gm a(byte param0, boolean param1) {
        Object var4 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((gm) this).field_b = stackIn_3_1 != 0;
        if (param0 > -26) {
          var4 = null;
          int discarded$2 = gm.a((CharSequence) null, '\'', (byte) -41);
          return (gm) this;
        } else {
          return (gm) this;
        }
    }

    gm() {
        ((gm) this).field_b = false;
        ((gm) this).field_i = -2;
        ((gm) this).field_c = null;
        ((gm) this).field_h = -2147483648;
        ((gm) this).field_a = null;
        ((gm) this).field_l = -2;
        ((gm) this).field_e = -2147483648;
        ((gm) this).field_g = -2147483648;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_k = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
