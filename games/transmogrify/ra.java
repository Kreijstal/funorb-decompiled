/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static int field_a;

    final static void a(fe param0, java.awt.Frame param1, int param2) {
        ib var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        java.awt.Frame var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(param1, 100);
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var3.field_c != 0) {
                        break L5;
                      } else {
                        pg.a(10L, param2 + -225);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (1 != var3.field_c) {
                      pg.a(100L, -116);
                      break L4;
                    } else {
                      if (var4 == 0) {
                        break L3;
                      } else {
                        pg.a(100L, -116);
                        break L4;
                      }
                    }
                  }
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  param1.setVisible(false);
                  if (param2 == 100) {
                    break L6;
                  } else {
                    var5 = (java.awt.Frame) null;
                    ra.a((fe) null, (java.awt.Frame) null, 29);
                    break L6;
                  }
                }
                param1.dispose();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("ra.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
    }

    final static String a(byte param0) {
        if (!lk.field_c) {
          if (da.field_y >= bk.field_d) {
            if (da.field_y >= ek.field_g + bk.field_d) {
              if (param0 >= 26) {
                return null;
              } else {
                field_a = -66;
                return null;
              }
            } else {
              return tj.field_v;
            }
          } else {
            if (param0 >= 26) {
              return null;
            } else {
              field_a = -66;
              return null;
            }
          }
        } else {
          if (param0 >= 26) {
            return null;
          } else {
            field_a = -66;
            return null;
          }
        }
    }

    final static void a(int param0) {
        ti var1 = null;
        RuntimeException var1_ref = null;
        ti var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var1 = new ti(540, 140);
            oj.a(var1, 256);
            ka.c();
            sb.c();
            si.field_l = 0;
            f.a((byte) 16);
            var2 = var1.a();
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var3 >= 15) {
                  ac.field_m.e();
                  var1.d(param0, 0);
                  fi.c(true);
                  break L2;
                } else {
                  var2.d(-2, -2, 16777215);
                  sb.a(4, 4, 0, 0, 540, 140);
                  var3++;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ra.B(" + param0 + ')');
        }
    }

    static {
        field_a = 0;
    }
}
