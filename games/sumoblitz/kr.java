/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    static String[] field_f;
    static ri[] field_b;
    static tf field_a;
    static int[] field_d;
    static int field_c;
    static int field_e;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 > -58) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static wb[] a(int param0, ki param1, int param2, int param3) {
        if (param0 == 19889) {
          if (!k.a(param1, param2, param3, param0 + -42935)) {
            return null;
          } else {
            return bw.b(-124);
          }
        } else {
          field_d = null;
          if (!k.a(param1, param2, param3, param0 + -42935)) {
            return null;
          } else {
            return bw.b(-124);
          }
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (!param2) {
          if (param1 > -16) {
            L0: {
              kr.a(28);
              if (param0) {
                jj.field_d = jj.field_d + 1;
                o.a((byte) -56);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (param0) {
                jj.field_d = jj.field_d + 1;
                o.a((byte) -56);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          Sumoblitz.field_H = Sumoblitz.field_H + 1;
          rb.a(-129);
          if (param1 <= -16) {
            L2: {
              if (param0) {
                jj.field_d = jj.field_d + 1;
                o.a((byte) -56);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              kr.a(28);
              if (param0) {
                jj.field_d = jj.field_d + 1;
                o.a((byte) -56);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = new tf();
        field_e = 0;
        field_c = 256;
    }
}
