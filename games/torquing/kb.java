/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb implements el {
    static h field_f;
    static boolean field_h;
    static int field_b;
    static db field_g;
    static la field_a;
    static String field_c;
    static uh field_d;
    static int[][] field_e;

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_e = null;
        field_a = null;
        if (param0 != 2) {
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          return;
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int var6 = 0;
        int var7 = 0;
        t var9 = null;
        t var10 = null;
        var6 = param4.field_w + param2;
        var7 = param4.field_k + param1;
        if (param0 >= 89) {
          tk.a(var7, var6, param4.field_o, param4.field_p, false);
          var10 = wj.field_h[1];
          if (param4 instanceof lg) {
            if (!((lg) (Object) param4).field_A) {
              L0: {
                if (param4.g(2)) {
                  he.a(2 + var6, param4.field_o + -4, 2 + var7, 2, param4.field_p - 4);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.a((-var10.field_w + param4.field_p >> -1961921247) + 1 + var6, (-var10.field_u + param4.field_o >> -871371327) + var7 - -1, 256);
                if (param4.g(2)) {
                  he.a(2 + var6, param4.field_o + -4, 2 + var7, 2, param4.field_p - 4);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param4.g(2)) {
                he.a(2 + var6, param4.field_o + -4, 2 + var7, 2, param4.field_p - 4);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          int[] discarded$1 = kb.a((byte) -45);
          tk.a(var7, var6, param4.field_o, param4.field_p, false);
          var9 = wj.field_h[1];
          if (param4 instanceof lg) {
            if (!((lg) (Object) param4).field_A) {
              L3: {
                if (param4.g(2)) {
                  he.a(2 + var6, param4.field_o + -4, 2 + var7, 2, param4.field_p - 4);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var9.a((-var9.field_w + param4.field_p >> -1961921247) + 1 + var6, (-var9.field_u + param4.field_o >> -871371327) + var7 - -1, 256);
                if (param4.g(2)) {
                  he.a(2 + var6, param4.field_o + -4, 2 + var7, 2, param4.field_p - 4);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              if (param4.g(2)) {
                he.a(2 + var6, param4.field_o + -4, 2 + var7, 2, param4.field_p - 4);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final static int[] a(byte param0) {
        if (param0 > -65) {
            field_a = null;
            return new int[8];
        }
        return new int[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = true;
        field_f = null;
        field_c = "Loading models";
        field_g = new db(1);
    }
}
