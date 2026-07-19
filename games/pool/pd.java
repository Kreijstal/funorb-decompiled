/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd implements fp {
    private int field_h;
    static int[] field_a;
    static int[] field_f;
    static char[] field_d;
    static boolean field_g;
    static long field_i;
    private int field_c;
    private lr field_b;
    static String field_e;

    final static void a(int param0) {
        int var1 = 0;
        if (nk.field_h <= 32) {
          ap.a(0, param0 + 3815994);
          if (param0 == 0) {
            return;
          } else {
            pd.a(false);
            return;
          }
        } else {
          L0: {
            var1 = nk.field_h % 32;
            if (0 == var1) {
              var1 = 32;
              break L0;
            } else {
              break L0;
            }
          }
          ap.a(nk.field_h + -var1, 3815994);
          if (param0 == 0) {
            return;
          } else {
            pd.a(false);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_d = null;
        if (!param0) {
          field_g = false;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_s) {
                  break L2;
                } else {
                  if (!param4.d(-60)) {
                    stackOut_5_0 = 2188450;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_6_0;
              discarded$1 = this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_m + "</u>", param1 - -param4.field_C, param3 - -param4.field_D, param4.field_l, param4.field_y, var6_int, -1, this.field_h, this.field_c, this.field_b.field_w + this.field_b.field_C);
              if (param4.d(-52)) {
                L4: {
                  var7 = this.field_b.b(param4.field_m);
                  var8 = this.field_b.field_C + this.field_b.field_w;
                  var9 = param4.field_C + param1;
                  var10 = param3 + param4.field_D;
                  if (this.field_h == 2) {
                    var9 = var9 + (-var7 + param4.field_l);
                    break L4;
                  } else {
                    if (1 == this.field_h) {
                      var9 = var9 + (param4.field_l + -var7 >> 177227489);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (2 != this.field_c) {
                    if ((this.field_c ^ -1) == -2) {
                      var10 = var10 + (param4.field_y - var8 >> 314356097);
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    var10 = var10 + (-var8 + param4.field_y);
                    break L5;
                  }
                }
                bj.a(var10 - -2, var8, var7 + 4, -2 + var9, 2187);
                break L3;
              } else {
                break L3;
              }
            }
            var7 = 88 / ((param2 - 2) / 41);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("pd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public pd() {
        this.field_h = 1;
        this.field_c = 1;
        this.field_b = lc.field_O;
    }

    pd(lr param0, int param1, int param2) {
        try {
            this.field_h = param1;
            this.field_b = param0;
            this.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_g = false;
        field_i = 0L;
    }
}
