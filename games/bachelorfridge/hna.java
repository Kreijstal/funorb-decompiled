/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hna extends aba {
    private hb field_j;
    static ee field_h;
    private String field_g;
    static int field_k;
    private boolean field_i;

    hna(lka param0, lka param1) {
        super(param0);
        this.field_g = "";
        this.field_i = false;
        try {
            this.field_j = new hb(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 <= 28) {
            hna.a(-7, 97);
            field_h = null;
            return;
        }
        field_h = null;
    }

    final jg a(String param0, boolean param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_j.a(param0, param1) == jt.field_f) {
              stackIn_3_0 = jt.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a((String) null, false);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals(this.field_g)) {
                  var3 = cca.b(-26869, param0);
                  if (var3.a(false)) {
                    this.field_g = param0;
                    this.field_i = var3.a(-7750);
                    break L2;
                  } else {
                    stackIn_10_0 = ji.field_f;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!this.field_i) {
                  stackIn_15_0 = jt.field_f;
                  break L3;
                } else {
                  stackIn_15_0 = cm.field_u;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("hna.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -92 / ((param0 - -8) / 45);
            if (this.field_j.a(param1, false) == jt.field_f) {
              stackIn_3_0 = this.field_j.a((byte) 66, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(param1, false) != jt.field_f) {
                stackIn_8_0 = bv.field_j;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = ija.field_p;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("hna.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 >= 61) {
                break L0;
              } else {
                field_h = (ee) null;
                break L0;
              }
            }
            L1: {
              if (dma.field_b == null) {
                break L1;
              } else {
                L2: {
                  if ((param0 ^ -1) > -1) {
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
                    if ((f.b((byte) 73) ^ -1L) >= (vla.field_v + 10000L ^ -1L)) {
                      break L3;
                    } else {
                      sja.field_fb.c(param0, (byte) 99);
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((sja.field_fb.field_g ^ -1) < -1) {
                    try {
                      L5: {
                        dma.field_b.a(0, sja.field_fb.field_h, false, sja.field_fb.field_g);
                        vla.field_v = f.b((byte) 73);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        vc.a((byte) -118);
                        break L6;
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
