/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf implements jca {
    int[] field_g;
    static tv[][] field_b;
    float[] field_e;
    static String field_f;
    int field_c;
    static int field_a;
    private ita field_h;
    int field_d;

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            return;
        }
        field_b = null;
    }

    bf(sfa param0, nh param1, ita param2) {
        vqa var5 = null;
        raa var6 = null;
        L0: {
          if (param1 instanceof raa) {
            var6 = (raa) (Object) param1;
            ((bf) this).field_g = var6.field_E;
            ((bf) this).field_d = var6.field_f;
            ((bf) this).field_c = var6.field_a;
            break L0;
          } else {
            if (!(param1 instanceof vqa)) {
              throw new RuntimeException();
            } else {
              var5 = (vqa) (Object) param1;
              ((bf) this).field_c = var5.field_a;
              ((bf) this).field_d = var5.field_f;
              ((bf) this).field_g = var5.field_E;
              break L0;
            }
          }
        }
        L1: {
          if (param2 == null) {
            break L1;
          } else {
            L2: {
              ((bf) this).field_h = param2;
              if (((bf) this).field_c != ((bf) this).field_h.field_d) {
                break L2;
              } else {
                if (((bf) this).field_d == ((bf) this).field_h.field_b) {
                  ((bf) this).field_e = ((bf) this).field_h.field_h;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            throw new RuntimeException();
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_f = "Water Spray";
    }
}
