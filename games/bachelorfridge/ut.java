/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ut extends tia {
    private int field_k;
    static int field_o;
    private dha field_i;
    private gw field_j;
    static kv[] field_r;
    static sna field_q;
    private eaa field_n;
    static int field_l;
    static n field_m;
    private int field_p;

    final static void d(int param0) {
        int var1 = -117;
    }

    ut(gj param0, ad param1, int param2, int param3) {
        super(param0, param1);
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        dha var8 = null;
        dha var9 = null;
        dha var10 = null;
        dha var11 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              ((ut) this).field_k = param2;
              ((ut) this).field_p = 1 + param3;
              ((ut) this).field_n = new eaa();
              var5_int = 128 * ((ut) this).field_p >> 1;
              var6 = ((ut) this).field_p * 64 >> 1;
              var7 = 20 * ((ut) this).field_p;
              if (((ut) this).field_k != 1) {
                if (((ut) this).field_k == 3) {
                  var5_int = var5_int * -1;
                  break L1;
                } else {
                  if (((ut) this).field_k != 2) {
                    break L1;
                  } else {
                    var6 = var6 * -1;
                    var5_int = var5_int * -1;
                    break L1;
                  }
                }
              } else {
                var6 = var6 * -1;
                break L1;
              }
            }
            var8 = new dha(0, 0);
            var9 = new dha(var5_int, var6);
            var10 = new dha(0, -var7);
            var11 = new dha(var5_int, var6 + -var7);
            ((ut) this).field_j = new gw(var8, var10, var11, var9, 65793);
            ((ut) this).field_g = 64;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("ut.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 != -8696) {
            field_o = -3;
        }
        field_r = null;
        field_m = null;
    }

    final void a(int param0, int param1, int param2) {
        qq.a(((ut) this).field_n, param2, param0, param1 ^ -28638);
        if (param1 != 25415) {
            Object var5 = null;
            int discarded$0 = ut.a((String[]) null, 124, (String) null, (po) null, 98);
        }
    }

    final static int a(String[] args, int param1, String param2, po param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = param3.a(param2);
              var6 = -36 / ((param4 - 69) / 55);
              if (param1 < var5_int) {
                break L1;
              } else {
                if (param2.indexOf("<br>") == -1) {
                  args[0] = (String) (Object) args;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            var7 = (param1 + (var5_int + -1)) / param1;
            param1 = var5_int / var7;
            var7 = 0;
            var8 = 0;
            var9 = param2.length();
            var10 = 0;
            L2: while (true) {
              if (var9 <= var10) {
                L3: {
                  if (var8 < var9) {
                    int incrementValue$2 = var7;
                    var7++;
                    args[incrementValue$2] = param2.substring(var8, var9).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_19_0 = var7;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var11 = param2.charAt(var10);
                    if (var11 == 32) {
                      break L5;
                    } else {
                      if (var11 != 45) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var12 = param2.substring(var8, var10 + 1).trim();
                  var13 = param3.a(var12);
                  if (param1 > var13) {
                    break L4;
                  } else {
                    int incrementValue$3 = var7;
                    var7++;
                    args[incrementValue$3] = var12;
                    var8 = 1 + var10;
                    break L4;
                  }
                }
                L6: {
                  if (62 != var11) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("ut.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (args == null) {
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
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param4 + 41);
        }
        return stackIn_20_0;
    }

    final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        lh var6 = null;
        int var7 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          ((ut) this).field_g = ((ut) this).field_g - 1;
          if (((ut) this).field_g <= 0) {
            break L0;
          } else {
            if (((ut) this).field_g < 64) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= (120 + -((ut) this).field_g) / 32) {
                  break L0;
                } else {
                  ((ut) this).field_i = ((ut) this).field_j.a((double)(64 - ((ut) this).field_g) / 64.0, 68);
                  var3 = -15 + (((ut) this).field_i.field_c << 4) + kla.a(30, ((ut) this).field_f, -2147483648);
                  var4 = -15 + (((ut) this).field_i.field_a << 4) + kla.a(30, ((ut) this).field_f, -2147483648);
                  var5 = 0;
                  var6 = new lh(var3, var5, var4);
                  int discarded$1 = kla.a(100, ((ut) this).field_f, -2147483648);
                  var6.field_p = 16 + -kla.a(32, ((ut) this).field_f, -2147483648);
                  var6.field_k = 16 + -kla.a(32, ((ut) this).field_f, -2147483648);
                  var6.field_g = -kla.a(32, ((ut) this).field_f, -2147483648) + 16;
                  var6.field_m = -1;
                  var6.field_o = 32;
                  var6.field_l = 0;
                  ((ut) this).field_n.a((bw) (Object) var6, true);
                  var2++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        oma.a(((ut) this).field_g, ((ut) this).field_f, ((ut) this).field_n, ((ut) this).field_j, -72, ((ut) this).field_i);
        if (param0 < 0) {
          L2: {
            L3: {
              if (((ut) this).field_g >= 0) {
                break L3;
              } else {
                if (((ut) this).field_n.e(12917)) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L2;
          }
          return stackIn_13_0 != 0;
        } else {
          return false;
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            eu.field_b = new js(8);
            var1_int = 0;
            L1: while (true) {
              if (ra.field_k.length <= var1_int) {
                break L0;
              } else {
                eu.field_b.a((long)ra.field_k[var1_int].toLowerCase().hashCode(), (byte) -81, (bw) (Object) new ji(var1_int));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "ut.E(" + -22021 + 41);
        }
    }

    static {
    }
}
