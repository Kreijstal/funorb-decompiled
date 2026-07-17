/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    private sa[] field_h;
    static String field_e;
    private int field_j;
    float field_k;
    private int field_c;
    String field_i;
    private int field_f;
    static oi field_b;
    static int field_a;
    static int field_g;
    static String[] field_d;

    final static void a(int param0, String param1, o param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          od.field_f = param2;
          pc.field_r = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("uc.D(").append(-1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final boolean a(boolean param0) {
        sa var2 = null;
        int var3 = 0;
        sa var4 = null;
        sa var5 = null;
        var3 = wizardrun.field_H;
        if (param0) {
          L0: while (true) {
            if (((uc) this).field_f < ((uc) this).field_c) {
              var5 = ((uc) this).field_h[((uc) this).field_f];
              var4 = var5;
              var2 = var4;
              if (!var5.field_a.b(17820)) {
                this.a((byte) -7, var5, 0);
                return false;
              } else {
                L1: {
                  if (var5.field_c < 0) {
                    break L1;
                  } else {
                    if (var5.field_a.a(false, var5.field_c)) {
                      break L1;
                    } else {
                      this.a((byte) -68, var2, var5.field_a.b((byte) -105, var5.field_c));
                      return false;
                    }
                  }
                }
                L2: {
                  if (var5.field_f == null) {
                    break L2;
                  } else {
                    if (var5.field_a.a((byte) 29, var5.field_f)) {
                      break L2;
                    } else {
                      this.a((byte) -53, var2, var5.field_a.a(0, var5.field_f));
                      return false;
                    }
                  }
                }
                L3: {
                  if (var5.field_c >= 0) {
                    break L3;
                  } else {
                    if (var5.field_f != null) {
                      break L3;
                    } else {
                      if (var5.field_h == null) {
                        break L3;
                      } else {
                        if (!var5.field_a.d(61)) {
                          this.a((byte) -10, var2, var5.field_a.a((byte) 75));
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((uc) this).field_f = ((uc) this).field_f + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
            if (param0) {
                Object var3 = null;
                uc.a(true, (java.awt.Canvas) null);
            }
            if (11 == ml.field_t) {
                int discarded$0 = 124;
                hh.a();
            }
            p.a((byte) 67, dg.field_a, cb.field_c, ok.field_b);
            fc.a((byte) 80, 0, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "uc.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_e = null;
        field_b = null;
    }

    private final void a(byte param0, sa param1, int param2) {
        float var4_float = (float)param2 / 100.0f + (float)(1 + ((uc) this).field_f);
        if (param0 > -5) {
            return;
        }
        try {
            if (param2 == 0) {
                ((uc) this).field_i = param1.field_d;
            } else {
                ((uc) this).field_i = param1.field_h + " - " + param2 + "%";
            }
            ((uc) this).field_k = var4_float * (float)((uc) this).field_j / (float)(((uc) this).field_c - -1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "uc.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private uc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "That name is not available";
        field_b = new oi();
        field_d = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = -1;
    }
}
