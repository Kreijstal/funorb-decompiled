/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static vn field_f;
    static tl field_d;
    private float field_a;
    private float field_c;
    private float field_e;
    private float field_b;
    static String field_g;

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != -14311) {
            return;
        }
        field_f = null;
    }

    final static of b(int param0) {
        if (hc.field_b != null) {
          if (param0 != 0) {
            return null;
          } else {
            return hc.field_b;
          }
        } else {
          hc.field_b = new of();
          hc.field_b.a(param0 ^ 4, ia.field_e);
          hc.field_b.field_t = 14;
          hc.field_b.field_q = 0;
          hc.field_b.field_e = 5;
          hc.field_b.field_i = 7697781;
          hc.field_b.field_k = 2763306;
          hc.field_b.field_h = 4;
          hc.field_b.field_c = ii.field_a;
          hc.field_b.field_r = 6;
          if (param0 != 0) {
            return null;
          } else {
            return hc.field_b;
          }
        }
    }

    final void a(vn param0, int param1, int param2, int param3, int param4, int param5) {
        param0.b((int)((oj) this).field_a + param5 + -16, -16 + ((int)((oj) this).field_b + param2), param1);
        if (param4 > -92) {
          of discarded$2 = oj.b(-16);
          param0.e(-16 + param5 + (int)((oj) this).field_a, (int)((oj) this).field_b + (param2 - 16), param3);
          return;
        } else {
          param0.e(-16 + param5 + (int)((oj) this).field_a, (int)((oj) this).field_b + (param2 - 16), param3);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 == 18463) {
          ((oj) this).field_a = ((oj) this).field_a + ((oj) this).field_c;
          ((oj) this).field_b = ((oj) this).field_b + ((oj) this).field_e;
          if (((oj) this).field_c == 0.0f) {
            if (0.0f != ((oj) this).field_e) {
              if (!dj.field_e.field_H.a((int)(((oj) this).field_a + (float)param2), (int)(((oj) this).field_b + (float)param0), 82)) {
                ((oj) this).field_e = 0.0f;
                ((oj) this).field_c = 0.0f;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (!dj.field_e.field_H.a((int)(((oj) this).field_a + (float)param2), (int)(((oj) this).field_b + (float)param0), 82)) {
              ((oj) this).field_e = 0.0f;
              ((oj) this).field_c = 0.0f;
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    oj(float param0, float param1) {
        ((oj) this).field_c = param0;
        ((oj) this).field_e = param1;
        ((oj) this).field_b = 0.0f;
        ((oj) this).field_a = 0.0f;
    }

    final static lp a(int param0, dj param1, int param2, dj param3, int param4) {
        if (ph.a(param2, 31043, param0, param3)) {
          if (param4 != 0) {
            return null;
          } else {
            return oh.a(param4 + 29506, param1.a((byte) 51, param2, param0));
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Service unavailable";
    }
}
