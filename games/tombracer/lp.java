/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    int field_b;
    boolean field_a;
    int field_d;
    int field_e;
    int field_c;
    boolean field_i;
    int field_f;
    static ko field_h;
    static int field_g;

    final void a(int param0, int param1, uia param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 == -1) {
            L0: while (true) {
              var4_int = param2.h(255);
              if (var4_int != 0) {
                this.a(param2, param1, (byte) -124, var4_int);
                continue L0;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("lp.A(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static vna a(byte param0, String param1) {
        vna var2 = null;
        RuntimeException var2_ref = null;
        in var3 = null;
        int var4 = 0;
        int var5 = 0;
        vna stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        vna stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = new vna();
            var3 = new in(param1);
            L1: while (true) {
              if (var3.a(0)) {
                stackOut_15_0 = (vna) var2;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                var4 = var3.b(21098);
                if (Character.isWhitespace((char) var4)) {
                  continue L1;
                } else {
                  L2: {
                    if (var4 == 34) {
                      break L2;
                    } else {
                      if (var4 == 39) {
                        break L2;
                      } else {
                        if (var4 == 40) {
                          var2.b((byte) -90, (vg) (Object) new mi(lna.field_a, -1 + var3.field_b));
                          continue L1;
                        } else {
                          if (var4 == 41) {
                            var2.b((byte) -112, (vg) (Object) new mi(rs.field_a, var3.field_b - 1));
                            continue L1;
                          } else {
                            if (44 == var4) {
                              var2.b((byte) -107, (vg) (Object) new mi(qba.field_c, var3.field_b + -1));
                              continue L1;
                            } else {
                              var2.b((byte) -75, (vg) (Object) ska.a(-45, var3));
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                  }
                  var2.b((byte) -81, (vg) (Object) hb.a(var3, false));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2_ref;
            stackOut_17_1 = new StringBuilder().append("lp.B(").append(48).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    private final void a(uia param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (1 != param3) {
            if (param3 == 2) {
              ((lp) this).field_d = 1 + param0.d(123);
              ((lp) this).field_b = 1 + param0.d(122);
              return;
            } else {
              if (param3 != 3) {
                if (param3 == 4) {
                  ((lp) this).field_e = param0.h(255);
                  return;
                } else {
                  if (param3 != 5) {
                    if (param3 == 6) {
                      ((lp) this).field_a = true;
                      return;
                    } else {
                      if (param3 == 7) {
                        ((lp) this).field_i = true;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((lp) this).field_c = param0.h(255);
                    return;
                  }
                }
              } else {
                byte discarded$2 = param0.c((byte) 64);
                return;
              }
            }
          } else {
            ((lp) this).field_f = param0.d(126);
            if (((lp) this).field_f == 65535) {
              ((lp) this).field_f = -1;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("lp.D(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L0;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + -124 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
    }

    lp() {
        ((lp) this).field_e = 2;
        ((lp) this).field_a = false;
        ((lp) this).field_i = false;
        ((lp) this).field_b = 64;
        ((lp) this).field_d = 64;
        ((lp) this).field_f = -1;
        ((lp) this).field_c = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ko(1);
        field_g = 0;
    }
}
