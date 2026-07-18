/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static String field_b;
    static String field_c;
    static String[] field_e;
    static volatile long field_d;
    static String field_a;

    final static boolean a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_18_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        try {
          L0: {
            L1: {
              if (null == ej.field_n) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0;
              if (sj.field_p != 9) {
                break L2;
              } else {
                if (tn.a(bq.field_f, ld.field_Kb, (byte) -81, en.field_c, tb.field_t)) {
                  L3: {
                    if (en.field_c == 2) {
                      break L3;
                    } else {
                      if (var3_int != 0) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_18_0 = na.a(tb.field_t, (byte) -46, bq.field_f, ld.field_Kb, en.field_c);
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                } else {
                  break L2;
                }
              }
            }
            if (sj.field_p == 10) {
              if (var3_int != 0) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                return stackIn_27_0 != 0;
              } else {
                q.a(13151);
                stackOut_28_0 = 1;
                stackIn_29_0 = stackOut_28_0;
                return stackIn_29_0 != 0;
              }
            } else {
              L4: {
                if (11 != sj.field_p) {
                  break L4;
                } else {
                  if (vh.field_Hb) {
                    L5: {
                      if (fh.field_n != 2) {
                        break L5;
                      } else {
                        if (pd.a(da.field_c, v.field_a, 2)) {
                          break L5;
                        } else {
                          stackOut_40_0 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          return stackIn_41_0 != 0;
                        }
                      }
                    }
                    L6: {
                      if (fh.field_n == 2) {
                        break L6;
                      } else {
                        if (var3_int != 0) {
                          stackOut_48_0 = 0;
                          stackIn_49_0 = stackOut_48_0;
                          return stackIn_49_0 != 0;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (ob.d((byte) 88)) {
                        kb.a(mi.field_Gb, v.field_a, param0, (String) null, fh.field_n, 29602);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    stackOut_54_0 = 1;
                    stackIn_55_0 = stackOut_54_0;
                    return stackIn_55_0 != 0;
                  } else {
                    break L4;
                  }
                }
              }
              if (param1) {
                stackOut_59_0 = 0;
                stackIn_60_0 = stackOut_59_0;
                break L0;
              } else {
                stackOut_57_0 = 0;
                stackIn_58_0 = stackOut_57_0;
                return stackIn_58_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "eo.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_60_0 != 0;
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              param0.setFocusTraversalKeysEnabled(false);
              if (param1 == 11) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            param0.addKeyListener((java.awt.event.KeyListener) (Object) um.field_c);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) um.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("eo.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              rp.field_l.a(param6, param2, param5, param4, -3344);
              if (mj.field_Ib == null) {
                break L1;
              } else {
                mj.field_Ib.a(-ti.field_Y + param0, param6, param3 ^ 77, param1, param0, param6);
                break L1;
              }
            }
            L2: {
              if (param3 == -10) {
                break L2;
              } else {
                eo.a(114, -96, -86, -58, 125, -101, 21);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var7, "eo.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_e = null;
            field_c = null;
            field_b = null;
            field_a = null;
            int var1_int = -49 / ((21 - param0) / 36);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "eo.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Open new routes for your zombies to attack from.";
        field_a = "Month";
        field_d = 0L;
    }
}
