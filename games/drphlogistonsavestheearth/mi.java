/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static String field_h;
    static int field_j;
    int[] field_a;
    int field_b;
    static ge field_f;
    static String field_d;
    static fg[] field_c;
    static int[] field_g;
    int field_e;
    static he[] field_i;

    final int a(int param0, int param1) {
        int discarded$7 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null != this.field_a) {
          if (-1 != (this.field_a.length ^ -1)) {
            var3 = 1;
            if (param0 != -21878) {
              discarded$7 = this.a(84, -16);
              L0: while (true) {
                if (this.field_a.length <= var3) {
                  return -1 + this.field_a.length;
                } else {
                  if (this.field_a[var3] + this.field_a[-1 + var3] >> -1235001183 > param1) {
                    return var3 - 1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              L1: while (true) {
                if (this.field_a.length <= var3) {
                  return -1 + this.field_a.length;
                } else {
                  if (this.field_a[var3] + this.field_a[-1 + var3] >> -1235001183 > param1) {
                    return var3 - 1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final static nh a(int param0, byte param1, int param2) {
        nh var3 = null;
        int var4 = 0;
        int var5 = 0;
        nh var6 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 < -62) {
          var6 = new nh(param0, param0);
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (var3.field_B.length <= var4) {
              return var3;
            } else {
              var6.field_B[var4] = param2;
              var4++;
              continue L0;
            }
          }
        } else {
          mi.b((byte) 48);
          var6 = new nh(param0, param0);
          var3 = var6;
          var4 = 0;
          L1: while (true) {
            if (var3.field_B.length <= var4) {
              return var3;
            } else {
              var6.field_B[var4] = param2;
              var4++;
              continue L1;
            }
          }
        }
    }

    final int a(byte param0) {
        if (param0 > 92) {
          if (null != this.field_a) {
            if (this.field_a.length == 0) {
              return 0;
            } else {
              return this.field_a[this.field_a.length + -1];
            }
          } else {
            return 0;
          }
        } else {
          return 8;
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_h = null;
        field_f = null;
        field_i = null;
        field_c = null;
        field_g = null;
        if (param0 > 61) {
          return;
        } else {
          field_f = (ge) null;
          return;
        }
    }

    mi(int param0, int param1, int param2) {
        this.field_e = param0;
        this.field_b = param1;
        this.field_a = new int[1 + param2];
    }

    static {
        field_h = "Friends can be added in multiplayer<nbsp>games";
    }
}
