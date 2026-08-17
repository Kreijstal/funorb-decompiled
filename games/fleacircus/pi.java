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
        var4.field_m = new int[param1];
        lk.field_O.a(false, var4);
        int var5 = 109 / ((72 - param3) / 46);
        rd.a(param2, var4, (byte) -99);
        return var4;
    }

    final int b(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -42) {
            break L0;
          } else {
            this.a(85, 27);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_d) {
              break L2;
            } else {
              if (this.field_d.length == 0) {
                break L2;
              } else {
                stackIn_6_0 = this.field_d[this.field_d.length + -1];
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final static void c(byte param0) {
        if (param0 != 15) {
            pi.a((byte) -9);
        }
        b.field_e = ae.field_a.h(0);
        CharSequence var2 = (CharSequence) ((Object) b.field_e);
        ma.field_a = uk.a(param0 + -127, var2);
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_g = null;
        field_e = null;
        if (param0 < 1) {
            field_e = (String) null;
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        if (this.field_d == null) {
          return 0;
        } else {
          if (this.field_d.length != 0) {
            if (param0 == 6759) {
              var3 = 1;
              L0: while (true) {
                if (var3 >= this.field_d.length) {
                  return this.field_d.length + -1;
                } else {
                  if (param1 >= this.field_d[var3 + -1] + this.field_d[var3] >> -1248493535) {
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
        this.field_d = new int[1 + param2];
        this.field_a = param0;
        this.field_c = param1;
    }

    static {
        field_f = "Open in popup window";
        field_g = new ed();
        field_b = new t[11];
    }
}
