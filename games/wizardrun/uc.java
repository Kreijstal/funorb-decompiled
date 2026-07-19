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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            L1: {
              od.field_f = param2;
              pc.field_r = param1;
              if (param0 == -1) {
                break L1;
              } else {
                uc.a((byte) 54);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("uc.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(boolean param0) {
        sa var2 = null;
        int var3 = 0;
        sa var4 = null;
        var3 = wizardrun.field_H;
        if (param0) {
          L0: while (true) {
            if (this.field_f < this.field_c) {
              var4 = this.field_h[this.field_f];
              var2 = var4;
              if (!var4.field_a.b(17820)) {
                this.a((byte) -7, var4, 0);
                return false;
              } else {
                L1: {
                  if (-1 < (var4.field_c ^ -1)) {
                    break L1;
                  } else {
                    if (var4.field_a.a(false, var4.field_c)) {
                      break L1;
                    } else {
                      this.a((byte) -68, var2, var4.field_a.b((byte) -105, var4.field_c));
                      return false;
                    }
                  }
                }
                L2: {
                  if (var4.field_f == null) {
                    break L2;
                  } else {
                    if (var4.field_a.a((byte) 29, var4.field_f)) {
                      break L2;
                    } else {
                      this.a((byte) -53, var2, var4.field_a.a(0, var4.field_f));
                      return false;
                    }
                  }
                }
                L3: {
                  if ((var4.field_c ^ -1) <= -1) {
                    break L3;
                  } else {
                    if (var4.field_f != null) {
                      break L3;
                    } else {
                      if (var4.field_h == null) {
                        break L3;
                      } else {
                        if (!var4.field_a.d(61)) {
                          this.a((byte) -10, var2, var4.field_a.a((byte) 75));
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                this.field_f = this.field_f + 1;
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
                java.awt.Canvas var3 = (java.awt.Canvas) null;
                uc.a(true, (java.awt.Canvas) null);
            }
            if (11 == ml.field_t) {
                hh.a((byte) 124);
            }
            p.a((byte) 67, dg.field_a, cb.field_c, ok.field_b);
            fc.a((byte) 80, 0, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "uc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        if (param0 != 37) {
            return;
        }
        field_b = null;
    }

    private final void a(byte param0, sa param1, int param2) {
        float var4_float = (float)param2 / 100.0f + (float)(1 + this.field_f);
        if (param0 > -5) {
            return;
        }
        try {
            if (param2 == 0) {
                this.field_i = param1.field_d;
            } else {
                this.field_i = param1.field_h + " - " + param2 + "%";
            }
            this.field_k = var4_float * (float)this.field_j / (float)(this.field_c - -1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "uc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private uc() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "That name is not available";
        field_b = new oi();
        field_d = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = -1;
    }
}
