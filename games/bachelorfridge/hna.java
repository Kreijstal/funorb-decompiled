/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class hna extends aba {
    private hb field_j;
    static ee field_h;
    private String field_g;
    static int field_k;
    private boolean field_i;

    hna(lka param0, lka param1) {
        super(param0);
        ((hna) this).field_g = "";
        ((hna) this).field_i = false;
        try {
            ((hna) this).field_j = new hb(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d() {
        field_h = null;
    }

    final jg a(String param0, boolean param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_2_0 = null;
        jg stackOut_9_0 = null;
        jg stackOut_14_0 = null;
        jg stackOut_13_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (((hna) this).field_j.a(param0, param1) == jt.field_f) {
              stackOut_2_0 = jt.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  var4 = null;
                  jg discarded$2 = ((hna) this).a((String) null, false);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals((Object) (Object) ((hna) this).field_g)) {
                  var3 = cca.b(-26869, param0);
                  if (var3.a(false)) {
                    ((hna) this).field_g = param0;
                    ((hna) this).field_i = var3.a(-7750);
                    break L2;
                  } else {
                    stackOut_9_0 = ji.field_f;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!((hna) this).field_i) {
                  stackOut_14_0 = jt.field_f;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = cm.field_u;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("hna.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_7_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3_int = -92 / ((param0 - -8) / 45);
            if (((hna) this).field_j.a(param1, false) == jt.field_f) {
              stackOut_2_0 = ((hna) this).field_j.a((byte) 66, param1);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (((hna) this).a(param1, false) != jt.field_f) {
                stackOut_7_0 = bv.field_j;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = ija.field_p;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("hna.D(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 >= 61) {
                break L0;
              } else {
                field_h = null;
                break L0;
              }
            }
            L1: {
              if (dma.field_b == null) {
                break L1;
              } else {
                L2: {
                  if (param0 < 0) {
                    break L2;
                  } else {
                    if (eia.field_a != uca.field_a) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 != sja.field_fb.field_g) {
                    break L3;
                  } else {
                    if (~f.b((byte) 73) >= ~(vla.field_v + 10000L)) {
                      break L3;
                    } else {
                      sja.field_fb.c(param0, (byte) 99);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (sja.field_fb.field_g > 0) {
                    {
                      L5: {
                        dma.field_b.a(0, sja.field_fb.field_h, false, sja.field_fb.field_g);
                        vla.field_v = f.b((byte) 73);
                        break L5;
                      }
                    }
                    sja.field_fb.field_g = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
            sja.field_fb.field_g = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
