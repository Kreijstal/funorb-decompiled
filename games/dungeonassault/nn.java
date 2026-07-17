/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends ne {
    static String field_k;
    gd field_l;
    private md field_m;
    private boolean field_i;
    static int[] field_j;

    final void a(byte param0) {
        ie var2 = null;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param0 != 80) {
          return;
        } else {
          var2 = (ie) (Object) ((nn) this).field_m.e(param0 ^ -24124);
          L0: while (true) {
            if (var2 == null) {
              ((nn) this).field_l = null;
              return;
            } else {
              L1: {
                var2.field_m.field_p = mo.field_a;
                var2.field_m.field_m = -256 + mo.field_a;
                if (var2.field_m.field_B) {
                  var2.field_m.field_L = mo.field_a;
                  break L1;
                } else {
                  break L1;
                }
              }
              var2.field_m.field_B = false;
              var2 = (ie) (Object) ((nn) this).field_m.a(4);
              continue L0;
            }
          }
        }
    }

    nn(boolean param0) {
        ((nn) this).field_m = new md();
        ((nn) this).field_i = param0 ? true : false;
    }

    final void a(gd param0, int param1) {
        ie var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var3 = (ie) (Object) ((nn) this).field_m.e(-24172);
              if (param1 == -256) {
                break L1;
              } else {
                ((nn) this).field_l = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 == null) {
                param0.field_C = mo.field_a;
                param0.field_B = true;
                ((nn) this).field_l = param0;
                break L0;
              } else {
                L3: {
                  var3.field_m.field_m = mo.field_a + -256;
                  var3.field_m.field_p = mo.field_a;
                  if (var3.field_m == param0) {
                    break L3;
                  } else {
                    if (var3.field_m.field_B) {
                      var3.field_m.field_B = false;
                      var3.field_m.field_L = mo.field_a;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var3 = (ie) (Object) ((nn) this).field_m.a(4);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("nn.F(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    private final void b(gd param0, int param1) {
        ie var3 = null;
        int var4 = DungeonAssault.field_K;
        try {
            if (!(this == (Object) (Object) param0.field_M)) {
                throw new RuntimeException();
            }
            var3 = (ie) (Object) ((nn) this).field_m.e(-24172);
            while (var3 != null) {
                if (!(var3.field_m != param0)) {
                    var3.a(false);
                }
                var3 = (ie) (Object) ((nn) this).field_m.a(4);
            }
            param0.field_M = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "nn.E(" + (param0 != null ? "{...}" : "null") + 44 + 29339 + 41);
        }
    }

    final void a(gd param0, byte param1) {
        ie var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0.field_M != null) {
                param0.field_M.b(param0, 29339);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_M = (nn) this;
            var3 = (ie) (Object) ((nn) this).field_m.e(param1 ^ 24184);
            L2: while (true) {
              if (var3 == null) {
                ((nn) this).field_m.a((ne) (Object) new ie(param0), false);
                if (param1 == -20) {
                  break L0;
                } else {
                  ((nn) this).field_l = null;
                  return;
                }
              } else {
                if (param0 != var3.field_m) {
                  var3 = (ie) (Object) ((nn) this).field_m.a(param1 + 24);
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("nn.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_j = null;
        if (param0 == -80) {
            return;
        }
        nn.b((byte) 94);
    }

    final void a(byte param0, gd param1) {
        ie var3 = null;
        int var5 = DungeonAssault.field_K;
        if (!((nn) this).field_i) {
            return;
        }
        try {
            var3 = (ie) (Object) ((nn) this).field_m.e(-24172);
            while (var3 != null) {
                var3.field_m.field_m = -256 + mo.field_a;
                var3.field_m.field_p = mo.field_a;
                var3 = (ie) (Object) ((nn) this).field_m.a(4);
            }
            param1.field_L = mo.field_a;
            int var4 = 43 / ((param0 - -7) / 51);
            if (param1 == ((nn) this).field_l) {
                ((nn) this).field_l = null;
            }
            param1.field_B = false;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "nn.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
