/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static String field_a;

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kc.a((java.awt.Component) ((Object) param1), 0);
              df.a(false, (java.awt.Component) ((Object) param1));
              if (param0 == -2) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (null == vc.field_f) {
              break L0;
            } else {
              vc.field_f.a((java.awt.Component) ((Object) param1), (byte) 83);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("nb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        ja var6;
        double var7;
        double var9;
        int var11;
        int var12;
        ja stackIn_17_0;
        int stackIn_17_1;
        float stackIn_17_2;
        int stackIn_17_3;
        float stackIn_17_4;
        ja stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        float stackIn_18_2 = 0.0f;
        int stackIn_18_3 = 0;
        float stackIn_18_4 = 0.0f;
        int stackIn_18_5 = 0;
        int stackIn_21_6;
        float stackIn_21_7;
        float stackIn_21_8;
        float stackIn_21_9;
        ja stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        float stackIn_23_2 = 0.0f;
        int stackIn_23_3 = 0;
        float stackIn_23_4 = 0.0f;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        float stackIn_23_7 = 0.0f;
        float stackIn_23_8 = 0.0f;
        float stackIn_23_9 = 0.0f;
        int stackIn_23_10 = 0;
        if (param0 == -28195) {
          var6 = (ja) ((Object) ra.field_a.e(1));
          if (var6 != null) {
            var7 = (double)(-320 + param1);
            var9 = (double)(-240 + param3);
            param1 = (int)(320.0 + (var7 * Math.cos((double)(-el.field_o.field_J)) - var9 * Math.sin((double)(-el.field_o.field_J))));
            param3 = (int)(Math.sin((double)(-el.field_o.field_J)) * var7 + Math.cos((double)(-el.field_o.field_J)) * var9 + 240.0);
            if (param5) {
              L0: {
                var11 = (param4 - -param2) % 4;
                var12 = 0;
                if (-1 != (var11 ^ -1)) {
                  break L0;
                } else {
                  var12 = 2;
                  break L0;
                }
              }
              L1: {
                if (-2 != (var11 ^ -1)) {
                  break L1;
                } else {
                  var12 = 4;
                  break L1;
                }
              }
              L2: {
                if (var11 != 2) {
                  break L2;
                } else {
                  var12 = 3;
                  break L2;
                }
              }
              L3: {
                if (3 == var11) {
                  var12 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                stackIn_17_0 = (ja) (var6);

                stackIn_17_1 = param0 + 28113;

                stackIn_17_2 = (float)param1;

                stackIn_17_3 = var12;

                stackIn_17_4 = (float)(320 - param1);

                if (var12 != 2) {
                  stackIn_18_0 = (ja) ((Object) stackIn_17_0);
                  stackIn_18_1 = stackIn_17_1;
                  stackIn_18_2 = stackIn_17_2;
                  stackIn_18_3 = stackIn_17_3;
                  stackIn_18_4 = stackIn_17_4;
                  stackIn_18_5 = -1;
                  break L4;
                } else {
                  stackIn_18_0 = (ja) ((Object) stackIn_17_0);
                  stackIn_18_1 = stackIn_17_1;
                  stackIn_18_2 = stackIn_17_2;
                  stackIn_18_3 = stackIn_17_3;
                  stackIn_18_4 = stackIn_17_4;
                  stackIn_18_5 = param4;
                  break L4;
                }
              }
              L5: {
                L6: {
                  stackIn_18_0 = (ja) ((Object) stackIn_18_0);

                  stackIn_21_6 = 0;

                  stackIn_21_7 = 0.0f;

                  stackIn_21_8 = (float)param3;

                  stackIn_21_9 = (float)(-param3 + 240);

                  if ((var12 ^ -1) == -3) {
                    break L6;
                  } else {




















                    if (1 != var12) {
                      stackIn_23_0 = (ja) ((Object) stackIn_18_0);
                      stackIn_23_1 = stackIn_18_1;
                      stackIn_23_2 = stackIn_18_2;
                      stackIn_23_3 = stackIn_18_3;
                      stackIn_23_4 = stackIn_18_4;
                      stackIn_23_5 = stackIn_18_5;
                      stackIn_23_6 = stackIn_21_6;
                      stackIn_23_7 = stackIn_21_7;
                      stackIn_23_8 = stackIn_21_8;
                      stackIn_23_9 = stackIn_21_9;
                      stackIn_23_10 = -1;
                      break L5;
                    } else {
                      stackIn_18_0 = (ja) ((Object) stackIn_18_0);









                      break L6;
                    }
                  }
                }
                stackIn_23_0 = (ja) ((Object) stackIn_18_0);
                stackIn_23_1 = stackIn_18_1;
                stackIn_23_2 = stackIn_18_2;
                stackIn_23_3 = stackIn_18_3;
                stackIn_23_4 = stackIn_18_4;
                stackIn_23_5 = stackIn_18_5;
                stackIn_23_6 = stackIn_21_6;
                stackIn_23_7 = stackIn_21_7;
                stackIn_23_8 = stackIn_21_8;
                stackIn_23_9 = stackIn_21_9;
                stackIn_23_10 = param2;
                break L5;
              }
              ((ja) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, stackIn_23_8, stackIn_23_9, stackIn_23_10, 0.0f);
              var6.field_K = null;
              ji.field_r.a(param0 ^ 28286, var6);
              return;
            } else {
              var6.a(-75, (float)param1, 0, (float)(-param1 + 320), param4, 0, 0.0f, (float)param3, (float)(-param3 + 240), param2, 0.0f);
              var6.field_K = null;
              ji.field_r.a(param0 ^ 28286, var6);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Geoblox.field_C;
        if (param10 == -2) {
          if (param4 > param7) {
            if (param4 >= param15) {
              if (param15 <= param7) {
                wh.a(param12, param2, param8, param1, param4, param5, param11, param0, param15, param14, param6, vb.field_c, param3, param13, param9, param7, -1275583984);
                return;
              } else {
                wh.a(param12, param6, param14, param3, param4, param5, param11, param9, param7, param8, param2, vb.field_c, param1, param13, param0, param15, -1275583984);
                return;
              }
            } else {
              wh.a(param3, param6, param14, param12, param15, param9, param2, param5, param7, param13, param11, vb.field_c, param1, param8, param0, param4, param10 ^ 1275583982);
              return;
            }
          } else {
            if (param15 <= param7) {
              if (param15 <= param4) {
                wh.a(param1, param2, param8, param12, param7, param0, param6, param5, param15, param13, param11, vb.field_c, param3, param14, param9, param4, -1275583984);
                return;
              } else {
                wh.a(param1, param11, param13, param3, param7, param0, param6, param9, param4, param8, param2, vb.field_c, param12, param14, param5, param15, -1275583984);
                return;
              }
            } else {
              wh.a(param3, param11, param13, param1, param15, param9, param2, param0, param4, param14, param6, vb.field_c, param12, param8, param5, param7, -1275583984);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (rb.field_d != null) {
            if (!rb.field_d.a(-119)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = (String) null;
          if (rb.field_d != null) {
            if (!rb.field_d.a(-119)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        if (param0 >= -80) {
            nb.a(108);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = "Loading fonts";
    }
}
