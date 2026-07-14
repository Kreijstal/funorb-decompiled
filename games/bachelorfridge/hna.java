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
        ((hna) this).field_g = "";
        ((hna) this).field_i = false;
        ((hna) this).field_j = new hb(param0, param1);
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
        Object var4 = null;
        jg stackIn_10_0 = null;
        jg stackIn_16_0 = null;
        jg stackIn_23_0 = null;
        jg stackIn_29_0 = null;
        jg stackOut_22_0 = null;
        jg stackOut_21_0 = null;
        jg stackOut_28_0 = null;
        jg stackOut_27_0 = null;
        jg stackOut_9_0 = null;
        jg stackOut_8_0 = null;
        jg stackOut_15_0 = null;
        jg stackOut_14_0 = null;
        if (((hna) this).field_j.a(param0, param1) == jt.field_f) {
          return jt.field_f;
        } else {
          if (!param1) {
            if (!param0.equals((Object) (Object) ((hna) this).field_g)) {
              var3 = cca.b(-26869, param0);
              if (!var3.a(false)) {
                return ji.field_f;
              } else {
                L0: {
                  ((hna) this).field_g = param0;
                  ((hna) this).field_i = var3.a(-7750);
                  if (!((hna) this).field_i) {
                    stackOut_22_0 = jt.field_f;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = cm.field_u;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                return (jg) (Object) stackIn_23_0;
              }
            } else {
              L1: {
                if (!((hna) this).field_i) {
                  stackOut_28_0 = jt.field_f;
                  stackIn_29_0 = stackOut_28_0;
                  break L1;
                } else {
                  stackOut_27_0 = cm.field_u;
                  stackIn_29_0 = stackOut_27_0;
                  break L1;
                }
              }
              return (jg) (Object) stackIn_29_0;
            }
          } else {
            var4 = null;
            jg discarded$1 = ((hna) this).a((String) null, false);
            if (!param0.equals((Object) (Object) ((hna) this).field_g)) {
              var3 = cca.b(-26869, param0);
              if (!var3.a(false)) {
                return ji.field_f;
              } else {
                L2: {
                  ((hna) this).field_g = param0;
                  ((hna) this).field_i = var3.a(-7750);
                  if (!((hna) this).field_i) {
                    stackOut_9_0 = jt.field_f;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = cm.field_u;
                    stackIn_10_0 = stackOut_8_0;
                    break L2;
                  }
                }
                return (jg) (Object) stackIn_10_0;
              }
            } else {
              L3: {
                if (!((hna) this).field_i) {
                  stackOut_15_0 = jt.field_f;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = cm.field_u;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return (jg) (Object) stackIn_16_0;
            }
          }
        }
    }

    final String a(byte param0, String param1) {
        int var3 = 0;
        var3 = -92 / ((param0 - -8) / 45);
        if (((hna) this).field_j.a(param1, false) == jt.field_f) {
          return ((hna) this).field_j.a((byte) 66, param1);
        } else {
          if (((hna) this).a(param1, false) == jt.field_f) {
            return ija.field_p;
          } else {
            return bv.field_j;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            if (param1 < 61) {
                field_h = null;
            }
            if (dma.field_b != null) {
                // if_icmpgt L49
                // if_acmpne L41
            } else {
                sja.field_fb.field_g = 0;
                return;
            }
            if (0 == sja.field_fb.field_g) {
                if ((f.b((byte) 73) ^ -1L) < (vla.field_v + 10000L ^ -1L)) {
                    sja.field_fb.c(param0, (byte) 99);
                }
            }
            if (!((sja.field_fb.field_g ^ -1) >= -1)) {
                try {
                    dma.field_b.a(0, sja.field_fb.field_h, false, sja.field_fb.field_g);
                    vla.field_v = f.b((byte) 73);
                } catch (IOException iOException) {
                    vc.a((byte) -118);
                }
                sja.field_fb.field_g = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
