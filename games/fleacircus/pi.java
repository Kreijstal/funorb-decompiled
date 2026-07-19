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
        int discarded$7 = 0;
        if (param0 == -42) {
          if (null != this.field_d) {
            if (this.field_d.length == 0) {
              return 0;
            } else {
              return this.field_d[this.field_d.length + -1];
            }
          } else {
            return 0;
          }
        } else {
          discarded$7 = this.a(85, 27);
          if (null != this.field_d) {
            if (this.field_d.length == 0) {
              return 0;
            } else {
              return this.field_d[this.field_d.length + -1];
            }
          } else {
            return 0;
          }
        }
    }

    final static void c(byte param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        if (param0 != 15) {
          pi.a((byte) -9);
          b.field_e = ae.field_a.h(0);
          var2 = (CharSequence) ((Object) b.field_e);
          ma.field_a = uk.a(param0 + -127, var2);
          return;
        } else {
          b.field_e = ae.field_a.h(0);
          var3 = (CharSequence) ((Object) b.field_e);
          ma.field_a = uk.a(param0 + -127, var3);
          return;
        }
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
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (this.field_d != null) {
          if (this.field_d.length != 0) {
            if (param0 == 6759) {
              var3 = 1;
              L0: while (true) {
                if (var3 < this.field_d.length) {
                  stackOut_10_0 = param1;
                  stackOut_10_1 = this.field_d[var3 + -1] + this.field_d[var3] >> -1248493535;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (var4 == 0) {
                    if (stackIn_12_0 >= stackIn_12_1) {
                      var3++;
                      continue L0;
                    } else {
                      return var3 + -1;
                    }
                  } else {
                    return stackIn_11_0 + stackIn_11_1;
                  }
                } else {
                  return this.field_d.length + -1;
                }
              }
            } else {
              return -64;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
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
