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
        od.field_f = param2;
        pc.field_r = param1;
        if (param0 == -1) {
            return;
        }
        uc.a((byte) 54);
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
                  if (-1 < (var5.field_c ^ -1)) {
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
                  if ((var5.field_c ^ -1) <= -1) {
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
        Object var3 = null;
        if (!param0) {
          if (11 == ml.field_t) {
            hh.a((byte) 124);
            p.a((byte) 67, dg.field_a, cb.field_c, ok.field_b);
            fc.a((byte) 80, 0, param1, 0);
            return;
          } else {
            p.a((byte) 67, dg.field_a, cb.field_c, ok.field_b);
            fc.a((byte) 80, 0, param1, 0);
            return;
          }
        } else {
          var3 = null;
          uc.a(true, (java.awt.Canvas) null);
          if (11 != ml.field_t) {
            p.a((byte) 67, dg.field_a, cb.field_c, ok.field_b);
            fc.a((byte) 80, 0, param1, 0);
            return;
          } else {
            hh.a((byte) 124);
            p.a((byte) 67, dg.field_a, cb.field_c, ok.field_b);
            fc.a((byte) 80, 0, param1, 0);
            return;
          }
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
        float var4 = 0.0f;
        var4 = (float)param2 / 100.0f + (float)(1 + ((uc) this).field_f);
        if (param0 <= -5) {
          if (param2 == 0) {
            ((uc) this).field_i = param1.field_d;
            ((uc) this).field_k = var4 * (float)((uc) this).field_j / (float)(((uc) this).field_c - -1);
            return;
          } else {
            ((uc) this).field_i = param1.field_h + " - " + param2 + "%";
            ((uc) this).field_k = var4 * (float)((uc) this).field_j / (float)(((uc) this).field_c - -1);
            return;
          }
        } else {
          return;
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
