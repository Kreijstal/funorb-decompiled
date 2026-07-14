/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends qb {
    int field_i;
    static int field_k;
    int field_h;
    static String field_o;
    static String field_g;
    int field_j;
    static long field_m;
    int field_n;
    int field_p;
    int field_l;

    public static void b(byte param0) {
        field_o = null;
        field_g = null;
        if (param0 != -36) {
            field_m = -63L;
        }
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param0) {
          if (!param3) {
            if (param1 > -86) {
              return (String) null;
            } else {
              L0: {
                if (param2) {
                  var4++;
                  break L0;
                } else {
                  break L0;
                }
              }
              return ek.field_a[var4];
            }
          } else {
            var4 += 2;
            if (param1 > -86) {
              return (String) null;
            } else {
              L1: {
                if (param2) {
                  var4++;
                  break L1;
                } else {
                  break L1;
                }
              }
              return ek.field_a[var4];
            }
          }
        } else {
          var4 += 4;
          if (param3) {
            var4 += 2;
            if (param1 > -86) {
              return (String) null;
            } else {
              L2: {
                if (param2) {
                  var4++;
                  break L2;
                } else {
                  break L2;
                }
              }
              return ek.field_a[var4];
            }
          } else {
            if (param1 > -86) {
              return (String) null;
            } else {
              L3: {
                if (param2) {
                  var4++;
                  break L3;
                } else {
                  break L3;
                }
              }
              return ek.field_a[var4];
            }
          }
        }
    }

    dh(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((dh) this).field_j = param2;
        ((dh) this).field_n = param0;
        ((dh) this).field_l = param1;
        ((dh) this).field_i = param3;
        ((dh) this).field_p = param4;
        ((dh) this).field_h = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You have 1 unread message!";
        field_m = 0L;
        field_o = "Loading music";
    }
}
