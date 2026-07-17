/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ip extends kj {
    static kv[] field_f;
    private int field_g;

    ip(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = ((ip) this).field_g * (int)((double)param0 / 30.0);
        if (param1 != 0) {
          field_f = null;
          il.field_a.a((-((ip) this).field_g + 30 << 1) + param2, var4, 128 + -(30 - ((ip) this).field_g << 1), 64);
          return;
        } else {
          il.field_a.a((-((ip) this).field_g + 30 << 1) + param2, var4, 128 + -(30 - ((ip) this).field_g << 1), 64);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((ip) this).a(-90, true, -97);
        }
    }

    final static String a(String param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        pf var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_19_0 = null;
        String stackOut_17_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param0;
            if (!wc.a(0, var6)) {
              stackOut_2_0 = mk.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!wb.a((byte) 52, param0)) {
                if (2 == um.field_c) {
                  if (!bna.a((byte) 5, param0)) {
                    if (100 > bda.field_l) {
                      if (!gl.a(3, param0)) {
                        var5 = sja.field_fb;
                        var5.c(param2, (byte) 107);
                        var5.field_g = var5.field_g + 1;
                        var4 = var5.field_g;
                        var5.d(2, 0);
                        var5.a((byte) -50, param0);
                        var5.b((byte) 105, var5.field_g - var4);
                        stackOut_19_0 = null;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        stackOut_17_0 = lga.a(true, new String[1], fja.field_b);
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      stackOut_14_0 = c.field_i;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    stackOut_11_0 = lga.a(true, new String[1], nu.field_d);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  stackOut_8_0 = bt.field_q;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = cea.field_a;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("ip.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + -80 + 44 + param2 + 41);
        }
        return (String) (Object) stackIn_20_0;
    }

    public static void c() {
        field_f = null;
    }

    final boolean b(int param0) {
        L0: {
          if (0 == ((ip) this).field_g) {
            wf.a(69, (byte) -91);
            break L0;
          } else {
            break L0;
          }
        }
        int fieldTemp$2 = ((ip) this).field_g + 1;
        ((ip) this).field_g = ((ip) this).field_g + 1;
        if (30 > fieldTemp$2) {
          if (param0 <= 21) {
            ((ip) this).a(-86, -98, -122);
            return false;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == 22) {
          var2 = param1;
          if (var2 == 0) {
            ala.a(26219, wc.field_p);
            return;
          } else {
            if (var2 != 12) {
              if (-3 != var2) {
                if (var2 != -2) {
                  return;
                } else {
                  ala.a(26219, pm.field_z);
                  tla.d(-80);
                  return;
                }
              } else {
                ala.a(26219, eda.field_i);
                return;
              }
            } else {
              ala.a(26219, jga.field_z);
              return;
            }
          }
        } else {
          ip.a((byte) 109, 122);
          var2 = param1;
          if (var2 == 0) {
            ala.a(26219, wc.field_p);
            return;
          } else {
            if (var2 != 12) {
              if (-3 != var2) {
                if (var2 == -2) {
                  ala.a(26219, pm.field_z);
                  tla.d(-80);
                  return;
                } else {
                  return;
                }
              } else {
                ala.a(26219, eda.field_i);
                return;
              }
            } else {
              ala.a(26219, jga.field_z);
              return;
            }
          }
        }
    }

    static {
    }
}
