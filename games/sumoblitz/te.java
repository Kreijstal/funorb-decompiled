/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private ms[] field_i;
    static int field_c;
    private int field_b;
    private int field_a;
    static iw field_f;
    private ms field_e;
    private ms field_d;
    static jn field_g;
    static String field_h;

    final ms a(boolean param0) {
        ms var2 = null;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (((te) this).field_b <= 0) {
            break L0;
          } else {
            if (((te) this).field_i[((te) this).field_b - 1] == ((te) this).field_d) {
              break L0;
            } else {
              var2 = ((te) this).field_d;
              ((te) this).field_d = var2.field_b;
              return var2;
            }
          }
        }
        if (param0) {
          L1: while (true) {
            if (((te) this).field_a > ((te) this).field_b) {
              int fieldTemp$2 = ((te) this).field_b;
              ((te) this).field_b = ((te) this).field_b + 1;
              var2 = ((te) this).field_i[fieldTemp$2].field_b;
              if (((te) this).field_i[-1 + ((te) this).field_b] != var2) {
                ((te) this).field_d = var2.field_b;
                return var2;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final ms a(int param0, long param1) {
        ms var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 102) {
            return null;
        }
        ms var4 = ((te) this).field_i[(int)(param1 & (long)(-1 + ((te) this).field_a))];
        ((te) this).field_e = var4.field_b;
        while (((te) this).field_e != var4) {
            if (!(~param1 != ~((te) this).field_e.field_h)) {
                var5 = ((te) this).field_e;
                ((te) this).field_e = ((te) this).field_e.field_b;
                return var5;
            }
            ((te) this).field_e = ((te) this).field_e.field_b;
        }
        ((te) this).field_e = null;
        return null;
    }

    final void c(int param0) {
        int var2 = 0;
        ms var3 = null;
        ms var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 6407) {
            return;
        }
        for (var2 = 0; ((te) this).field_a > var2; var2++) {
            var3 = ((te) this).field_i[var2];
            while (true) {
                var4 = var3.field_b;
                if (var4 == var3) {
                    break;
                }
                var4.b(false);
            }
        }
        ((te) this).field_d = null;
        ((te) this).field_e = null;
    }

    public static void b(int param0) {
        if (param0 != 6406) {
            te.b(41);
        }
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final ms a(int param0) {
        ((te) this).field_b = 0;
        if (param0 < 36) {
            return null;
        }
        return ((te) this).a(true);
    }

    final static boolean a(boolean param0, int param1, int param2) {
        return (is.a(true, param1, param2) | oj.b(param1, param2, -126) | pk.a(param1, param2, 52)) & jf.a(param1, (byte) -91, param2);
    }

    final void a(ms param0, int param1, long param2) {
        ms var5 = null;
        try {
            if (param0.field_g != null) {
                param0.b(false);
            }
            var5 = ((te) this).field_i[(int)(param2 & (long)(param1 + ((te) this).field_a))];
            param0.field_g = var5.field_g;
            param0.field_b = var5;
            param0.field_g.field_b = param0;
            param0.field_b.field_g = param0;
            param0.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "te.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, iw param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          if (param0 == -21339) {
            if (m.field_X != param1) {
              if (nl.field_p != param1) {
                if (field_f != param1) {
                  if (kd.field_b != param1) {
                    if (param1 == ps.field_c) {
                      stackOut_20_0 = 6410;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    } else {
                      if (rg.field_A == param1) {
                        stackOut_18_0 = 6145;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    stackOut_13_0 = 6409;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                } else {
                  stackOut_10_0 = 6406;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = 6408;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = 6407;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = 57;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("te.E(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L0;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L0;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    te(int param0) {
        int var2 = 0;
        ms var3 = null;
        ((te) this).field_b = 0;
        ((te) this).field_a = param0;
        ((te) this).field_i = new ms[param0];
        for (var2 = 0; var2 < param0; var2++) {
            ms dupTemp$0 = new ms();
            var3 = dupTemp$0;
            ((te) this).field_i[var2] = dupTemp$0;
            var3.field_b = var3;
            var3.field_g = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_f = new iw(1);
        field_g = new jn();
        field_h = "Cancel";
    }
}
