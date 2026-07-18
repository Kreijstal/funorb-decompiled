/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_k;
    static String field_j;
    static hl field_l;
    private in[] field_d;
    static int field_i;
    float field_f;
    String field_e;
    static double field_c;
    private int field_h;
    static String field_a;
    private int field_b;
    private int field_g;

    public static void a(boolean param0) {
        field_j = null;
        field_l = null;
        field_a = null;
        if (param0) {
            wh.a(true);
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        in var4 = null;
        var3 = TetraLink.field_J;
        L0: while (true) {
          if (((wh) this).field_b <= ((wh) this).field_h) {
            if (param0 != -1210) {
              field_i = 124;
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((wh) this).field_d[((wh) this).field_h];
            if (!var4.field_b.c(124)) {
              this.a(-1, 0, var4);
              return false;
            } else {
              L1: {
                if (var4.field_f < 0) {
                  break L1;
                } else {
                  if (!var4.field_b.d(var4.field_f, 0)) {
                    this.a(-1, var4.field_b.e(-11337, var4.field_f), var4);
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (null == var4.field_a) {
                  break L2;
                } else {
                  if (var4.field_b.a(var4.field_a, (byte) -98)) {
                    break L2;
                  } else {
                    this.a(param0 ^ 1209, var4.field_b.a(var4.field_a, true), var4);
                    return false;
                  }
                }
              }
              L3: {
                if (var4.field_f >= 0) {
                  break L3;
                } else {
                  if (null != var4.field_a) {
                    break L3;
                  } else {
                    if (var4.field_e == null) {
                      break L3;
                    } else {
                      if (!var4.field_b.a(false)) {
                        this.a(-1, var4.field_b.b(param0 ^ -21414), var4);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((wh) this).field_h = ((wh) this).field_h + 1;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, in param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        Object var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              var5 = null;
              this.a(-72, 55, (in) null);
              break L0;
            }
          }
          var4_float = (float)param1 / 100.0f + (float)(((wh) this).field_h + 1);
          ((wh) this).field_f = var4_float * (float)((wh) this).field_g / (float)(((wh) this).field_b + 1);
          if (param1 != 0) {
            ((wh) this).field_e = param2.field_e + " - " + param1 + "%";
            return;
          } else {
            ((wh) this).field_e = param2.field_h;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("wh.C(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Please check if address is correct";
        field_a = "2D";
        field_i = -1;
    }
}
