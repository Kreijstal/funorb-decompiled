/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static long field_a;
    static String field_b;

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        String var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              df.field_o = param0;
              if (param1 == -13) {
                break L1;
              } else {
                var3 = (String) null;
                ld.a((String) null, (byte) -41);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ld.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        RuntimeException runtimeException = null;
        hk var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              vh.field_B.c();
              fc.field_k.c();
              vg.field_J = vg.field_J - 1;
              if (!param0) {
                break L1;
              } else {
                ld.a(126);
                break L1;
              }
            }
            L2: {
              if (-1 != (vg.field_J ^ -1)) {
                break L2;
              } else {
                vg.field_J = 200;
                var1 = (hk) ((Object) bd.field_c.a((byte) -117));
                L3: while (true) {
                  if (var1 == null) {
                    break L2;
                  } else {
                    if (var2 == 0) {
                      L4: {
                        if (var1.field_h.d(-3548)) {
                          break L4;
                        } else {
                          var1.c(-19822);
                          break L4;
                        }
                      }
                      var1 = (hk) ((Object) bd.field_c.d((byte) 63));
                      if (var2 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "ld.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -66) {
            ld.a(73);
        }
    }

    final static boolean a(rb param0, int param1, rb param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param2.field_gb - param0.field_gb;
            if (param1 == -24612) {
              L1: {
                L2: {
                  if (cm.field_G == param2.field_bb) {
                    break L2;
                  } else {
                    if (null != param2.field_bb) {
                      break L1;
                    } else {
                      var3_int += 200;
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var3_int -= 200;
                break L1;
              }
              L3: {
                L4: {
                  if (cm.field_G != param0.field_bb) {
                    break L4;
                  } else {
                    var3_int += 200;
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (null == param0.field_bb) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if ((var3_int ^ -1) >= -1) {
                  stackIn_18_0 = 0;
                  break L5;
                } else {
                  stackIn_18_0 = 1;
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ld.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0) {
          if (10 <= k.field_g) {
            if (ha.field_db) {
              return false;
            } else {
              L0: {
                if (cb.a(false)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_a = 113L;
          if (10 <= k.field_g) {
            if (ha.field_db) {
              return false;
            } else {
              L1: {
                if (cb.a(false)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
