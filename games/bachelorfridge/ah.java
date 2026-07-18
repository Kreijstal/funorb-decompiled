/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ah extends tia {
    private double field_m;
    private int field_i;
    private eaa field_n;
    static int field_l;
    private int field_j;
    private double field_k;

    private final int[] b() {
        int[] var3 = new int[2];
        int[] var2 = var3;
        var3[1] = (int)(((ah) this).field_m * (double)(128 + -(((ah) this).field_g * 2)));
        var3[0] = (int)(((ah) this).field_k * (double)(128 - ((ah) this).field_g * 2));
        return var3;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 25415) {
            return;
        }
        lr.a(65280, param2, 100, ((ah) this).field_n, param1 + 265923678, param0);
    }

    final boolean a(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var6 = 0;
        int var7 = 0;
        lh var8 = null;
        int var9 = 0;
        int[] var13 = null;
        var9 = BachelorFridge.field_y;
        int fieldTemp$4 = ((ah) this).field_g - 1;
        ((ah) this).field_g = ((ah) this).field_g - 1;
        if (fieldTemp$4 > 0) {
          L0: {
            if (param0 <= 0) {
              break L0;
            } else {
              boolean discarded$5 = ((ah) this).a(-70);
              break L0;
            }
          }
          L1: {
            if (((ah) this).field_g > 32) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= 2) {
                  break L1;
                } else {
                  var3 = -(3.141592653589793 * (double)((kla.a(50, ((ah) this).field_f, -2147483648) + 50 * (-1 + ((ah) this).field_j)) * 2) / 200.0 - 1.5707963267948966);
                  int discarded$6 = 64;
                  var13 = this.b();
                  var6 = var13[0] - -(kla.a(30, ((ah) this).field_f, -2147483648) + -15 >> 1);
                  var7 = var13[1] - -(kla.a(30, ((ah) this).field_f, -2147483648) - 15 >> 1);
                  var8 = new lh(var6 << 4, 0, var7 << 4);
                  int discarded$7 = kla.a(30, ((ah) this).field_f, -2147483648);
                  var8.field_p = 4 - kla.a(8, ((ah) this).field_f, -2147483648);
                  var8.field_k = -kla.a(8, ((ah) this).field_f, -2147483648) + 4;
                  var8.field_g = 4 + -kla.a(8, ((ah) this).field_f, -2147483648);
                  var8.field_m = -1;
                  var8.field_o = 32;
                  var8.field_l = 0;
                  var8.field_r = var3;
                  ((ah) this).field_n.a((bw) (Object) var8, true);
                  var2++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          gj.a((byte) 116, ((ah) this).field_n, ((ah) this).field_f, ((ah) this).field_g);
          return true;
        } else {
          return false;
        }
    }

    ah(gj param0, ad param1, int param2, int param3) {
        super(param0, param1);
        RuntimeException var5 = null;
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
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            L1: {
              ((ah) this).field_i = param3;
              ((ah) this).field_j = param2;
              ((ah) this).field_g = 64;
              ((ah) this).field_n = new eaa();
              ((ah) this).field_k = (double)(128 * ((ah) this).field_i / 64);
              ((ah) this).field_m = (double)(((ah) this).field_i * 64 / 64);
              if (((ah) this).field_j == 1) {
                ((ah) this).field_m = ((ah) this).field_m * -1.0;
                break L1;
              } else {
                if (((ah) this).field_j == 3) {
                  ((ah) this).field_k = ((ah) this).field_k * -1.0;
                  break L1;
                } else {
                  if (((ah) this).field_j != 2) {
                    break L1;
                  } else {
                    ((ah) this).field_m = ((ah) this).field_m * -1.0;
                    ((ah) this).field_k = ((ah) this).field_k * -1.0;
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ah.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(gs param0) {
        Object var4_ref = null;
        Object var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_32_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var4_ref = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3 = 0;
              var2 = null;
              if (param0.field_e == null) {
                break L1;
              } else {
                L2: {
                  var6 = param0.field_e;
                  var2 = (Object) (Object) var6;
                  var4_ref = var2;
                  var2 = (Object) (Object) var6;
                  if (param0.field_b == 1) {
                    var2 = (Object) (Object) ("<img=0>" + var6);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (2 != param0.field_b) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + (String) var2);
                  var4_ref = var2;
                  var4_ref = var2;
                  break L1;
                }
              }
            }
            L3: {
              var4 = "";
              if (param0.field_p != 2) {
                L4: {
                  if (param0.field_p != 0) {
                    break L4;
                  } else {
                    if (am.field_O) {
                      var4 = "[" + cja.field_r + "] ";
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (1 == param0.field_p) {
                    var4 = "[" + lga.a(true, new String[1], fq.field_r) + "] ";
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (4 != param0.field_p) {
                    break L6;
                  } else {
                    if (jc.field_n != null) {
                      var4 = "[" + jc.field_n + "] ";
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param0.field_p != 3) {
                    break L7;
                  } else {
                    var4 = "[#" + param0.field_k + "] ";
                    break L7;
                  }
                }
                if (!param0.field_i) {
                  var4 = var4 + (String) var2 + ": ";
                  break L3;
                } else {
                  break L3;
                }
              } else {
                if (!param0.field_i) {
                  L8: {
                    if (param0.field_m != 0) {
                      break L8;
                    } else {
                      if (param0.field_j == 0) {
                        var4 = lga.a(true, new String[1], iia.field_q);
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var4 = lga.a(true, new String[1], wla.field_n);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_31_0 = (String) var4;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_33_0 = var2;
            stackOut_33_1 = new StringBuilder().append("ah.E(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + -118 + ')');
        }
        return stackIn_32_0;
    }

    final static void a() {
        pf var2 = sja.field_fb;
        var2.c(4, (byte) 118);
        var2.d(1, 0);
        var2.d(2, 0);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 71 / ((param1 - 52) / 45);
        uc.d(107);
        dg.c(param3, param2, param0, param4);
    }

    static {
    }
}
