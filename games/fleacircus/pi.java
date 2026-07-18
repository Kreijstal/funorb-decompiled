/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    int field_c;
    int field_a;
    static ed field_g;
    static String field_f;
    int[] field_d;
    static String field_e;
    static t[] field_b;

    final static fi a(int param0, int param1, int param2, int param3) {
        fi var4 = new fi();
        var4.field_i = param0;
        var4.field_m = new int[1];
        lk.field_O.a(false, (lh) (Object) var4);
        int var5 = -109;
        rd.a(5, var4, (byte) -99);
        return var4;
    }

    final int b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -42) {
            break L0;
          } else {
            int discarded$2 = ((pi) this).a(85, 27);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((pi) this).field_d) {
              break L2;
            } else {
              if (((pi) this).field_d.length == 0) {
                break L2;
              } else {
                stackOut_4_0 = ((pi) this).field_d[((pi) this).field_d.length + -1];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final static void c(byte param0) {
        b.field_e = ae.field_a.h(0);
        CharSequence var2 = (CharSequence) (Object) b.field_e;
        ma.field_a = uk.a(-112, var2);
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_g = null;
        field_e = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (((pi) this).field_d == null) {
          return 0;
        } else {
          if (((pi) this).field_d.length != 0) {
            if (param0 == 6759) {
              var3 = 1;
              L0: while (true) {
                if (var3 >= ((pi) this).field_d.length) {
                  return ((pi) this).field_d.length + -1;
                } else {
                  if (param1 >= ((pi) this).field_d[var3 + -1] + ((pi) this).field_d[var3] >> 1) {
                    var3++;
                    continue L0;
                  } else {
                    return var3 + -1;
                  }
                }
              }
            } else {
              return -64;
            }
          } else {
            return 0;
          }
        }
    }

    pi(int param0, int param1, int param2) {
        ((pi) this).field_d = new int[1 + param2];
        ((pi) this).field_a = param0;
        ((pi) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Open in popup window";
        field_g = new ed();
        field_b = new t[11];
    }
}
