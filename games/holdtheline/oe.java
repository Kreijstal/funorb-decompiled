/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends tg {
    static int[] field_h;
    qm field_k;
    qm field_l;
    static gn field_j;
    qm field_m;
    static va field_i;

    final qm a(boolean param0, float param1) {
        int var3 = 0;
        int var4 = 0;
        if (param0) {
          oe.a(-65);
          var3 = (int)((float)((oe) this).field_m.field_h * param1 * param1 + (param1 * ((-param1 + 1.0f) * (float)(((oe) this).field_l.field_h * 2)) + (-param1 + 1.0f) * (float)((oe) this).field_k.field_h * (1.0f - param1)));
          var4 = (int)(param1 * ((float)((oe) this).field_m.field_f * param1) + ((1.0f - param1) * (float)(2 * ((oe) this).field_l.field_f) * param1 + (-param1 + 1.0f) * ((float)((oe) this).field_k.field_f * (-param1 + 1.0f))));
          return new qm(var3, var4);
        } else {
          var3 = (int)((float)((oe) this).field_m.field_h * param1 * param1 + (param1 * ((-param1 + 1.0f) * (float)(((oe) this).field_l.field_h * 2)) + (-param1 + 1.0f) * (float)((oe) this).field_k.field_h * (1.0f - param1)));
          var4 = (int)(param1 * ((float)((oe) this).field_m.field_f * param1) + ((1.0f - param1) * (float)(2 * ((oe) this).field_l.field_f) * param1 + (-param1 + 1.0f) * ((float)((oe) this).field_k.field_f * (-param1 + 1.0f))));
          return new qm(var3, var4);
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        Object var2 = null;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var1 = 0;
        if (param0 > 101) {
          int discarded$2 = 0;
          if (!ol.d()) {
            if (of.a(-969)) {
              if (hf.a(wi.field_b, 0)) {
                L0: {
                  em.a(-29486, true);
                  if (null == kf.field_U) {
                    stackOut_26_0 = 3;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    stackOut_25_0 = 2;
                    stackIn_27_0 = stackOut_25_0;
                    break L0;
                  }
                }
                var1 = stackIn_27_0;
                pe.a(var1, true, (byte) -107);
                return;
              } else {
                L1: {
                  if (null == kf.field_U) {
                    stackOut_22_0 = 3;
                    stackIn_23_0 = stackOut_22_0;
                    break L1;
                  } else {
                    stackOut_21_0 = 2;
                    stackIn_23_0 = stackOut_21_0;
                    break L1;
                  }
                }
                var1 = stackIn_23_0;
                pe.a(var1, true, (byte) -107);
                return;
              }
            } else {
              pe.a(var1, true, (byte) -107);
              return;
            }
          } else {
            var1 = 1;
            pe.a(var1, true, (byte) -107);
            return;
          }
        } else {
          var2 = null;
          oe.a(-1.8653900623321533f, -111, (ei) null, (byte) 86, 0.6255527138710022f, (ei) null);
          int discarded$3 = 0;
          if (!ol.d()) {
            if (of.a(-969)) {
              if (!hf.a(wi.field_b, 0)) {
                L2: {
                  if (null == kf.field_U) {
                    stackOut_12_0 = 3;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = 2;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                var1 = stackIn_13_0;
                pe.a(var1, true, (byte) -107);
                return;
              } else {
                L3: {
                  em.a(-29486, true);
                  if (null == kf.field_U) {
                    stackOut_8_0 = 3;
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = 2;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                var1 = stackIn_9_0;
                pe.a(var1, true, (byte) -107);
                return;
              }
            } else {
              pe.a(var1, true, (byte) -107);
              return;
            }
          } else {
            var1 = 1;
            pe.a(var1, true, (byte) -107);
            return;
          }
        }
    }

    final static boolean a(char param0) {
        if (65 > param0) {
          if (param0 >= 97) {
            if (param0 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (90 < param0) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final static int a(int param0, int param1) {
        return li.field_e[param0 & 2047];
    }

    final static void a(float param0, int param1, ei param2, byte param3, float param4, ei param5) {
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        ha var10 = null;
        ha var11 = null;
        ha var12 = null;
        ha var13 = null;
        ha var14 = null;
        ha var15 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var8 = param1;
              if (var8 == 0) {
                if (param0 <= param4) {
                  break L1;
                } else {
                  var11 = new ha(false, param4);
                  var10 = new ha(false, param0);
                  var11.field_s = var10;
                  var10.field_s = var11;
                  param5.a((Object) (Object) var11, (byte) 6);
                  param5.a((Object) (Object) var10, (byte) 6);
                  break L1;
                }
              } else {
                if (var8 != 1) {
                  if (var8 == 2) {
                    if (param4 >= param0) {
                      break L1;
                    } else {
                      var15 = new ha(true, param4);
                      var14 = new ha(true, param0);
                      var15.field_s = var14;
                      var14.field_s = var15;
                      param2.a((Object) (Object) var15, (byte) 6);
                      param2.a((Object) (Object) var14, (byte) 6);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  var13 = new ha(false, param4);
                  var12 = new ha(true, param0);
                  var13.field_s = var12;
                  var12.field_s = var13;
                  param5.a((Object) (Object) var13, (byte) 6);
                  param2.a((Object) (Object) var12, (byte) 6);
                  break L1;
                }
              }
            }
            if (param3 > 40) {
              break L0;
            } else {
              field_i = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("oe.H(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_j = null;
    }

    oe(float param0, int param1, boolean param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[8192];
    }
}
