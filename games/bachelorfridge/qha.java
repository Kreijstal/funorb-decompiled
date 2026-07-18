/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qha {
    private ap[] field_f;
    private int field_g;
    static int[] field_c;
    String field_d;
    float field_b;
    private int field_e;
    private int field_a;
    static String field_h;

    public static void a(int param0) {
        field_c = null;
        field_h = null;
    }

    private final void a(ap param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          var4_float = (float)(((qha) this).field_a - -1) + (float)param2 / 100.0f;
          ((qha) this).field_b = (float)((qha) this).field_e * var4_float / (float)(((qha) this).field_g + 1);
          if (param2 == 0) {
            ((qha) this).field_d = param0.field_a;
            return;
          } else {
            ((qha) this).field_d = param0.field_b + " - " + param2 + "%";
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qha.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, vr param1) {
        try {
            wha.field_a = param1;
            vj.field_p = wfa.a("logo", param1, "minimal", (byte) -86);
            if (param0 < 114) {
                Object var3 = null;
                qha.a(-41, (vr) null);
            }
            em.field_S = wfa.a("loading", param1, "minimal", (byte) -74);
            ml.field_a = ch.a(param1, -1, "minimal", "fridgedoor2d");
            ada.field_p = ch.a(param1, -1, "minimal", "fridge_left");
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qha.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private qha() throws Throwable {
        throw new Error();
    }

    final boolean a(byte param0) {
        ap var2 = null;
        int var3 = 0;
        ap var4 = null;
        var3 = BachelorFridge.field_y;
        L0: while (true) {
          if (((qha) this).field_g <= ((qha) this).field_a) {
            if (param0 != 49) {
              field_h = null;
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((qha) this).field_f[((qha) this).field_a];
            var2 = var4;
            if (var4.field_e.a(0)) {
              L1: {
                if (var4.field_d < 0) {
                  break L1;
                } else {
                  if (var4.field_e.c(var4.field_d, -734)) {
                    break L1;
                  } else {
                    this.a(var2, -1, var4.field_e.b(var4.field_d, (byte) -87));
                    return false;
                  }
                }
              }
              L2: {
                if (null == var4.field_f) {
                  break L2;
                } else {
                  if (!var4.field_e.a(var4.field_f, 20637)) {
                    this.a(var2, -1, var4.field_e.a(0, var4.field_f));
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_d >= 0) {
                  break L3;
                } else {
                  if (var4.field_f != null) {
                    break L3;
                  } else {
                    if (var4.field_b == null) {
                      break L3;
                    } else {
                      if (var4.field_e.b((byte) 111)) {
                        break L3;
                      } else {
                        this.a(var2, -1, var4.field_e.a(true));
                        return false;
                      }
                    }
                  }
                }
              }
              ((qha) this).field_a = ((qha) this).field_a + 1;
              continue L0;
            } else {
              this.a(var4, -1, 0);
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Create your own free Jagex account";
    }
}
