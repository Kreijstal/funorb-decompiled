/*
 * Decompiled by CFR-JS 0.4.0.
 */
class of {
    static String field_a;

    final static cn a(boolean param0, int param1) {
        cn stackIn_5_0 = null;
        cn stackOut_3_0 = null;
        if (!param0) {
          if (ck.field_a == null) {
            if (param1 == -1) {
              return ck.field_a;
            } else {
              return nt.a(param1, 1, 5200, false, true, true);
            }
          } else {
            stackOut_3_0 = ck.field_a;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0;
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 27 % ((34 - param0) / 50);
    }

    final static String a(int param0) {
        if (!kda.field_pd) {
          if (bda.field_m <= fr.field_c) {
            if (fr.field_c >= bda.field_m - -gaa.field_p) {
              if (param0 == 1) {
                return null;
              } else {
                String discarded$6 = of.a(97);
                return null;
              }
            } else {
              return hn.field_F;
            }
          } else {
            if (param0 == 1) {
              return null;
            } else {
              String discarded$7 = of.a(97);
              return null;
            }
          }
        } else {
          if (param0 == 1) {
            return null;
          } else {
            String discarded$8 = of.a(97);
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Ignore";
    }
}
