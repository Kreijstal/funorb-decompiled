/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    private ol field_i;
    private vj field_e;
    static int[] field_f;
    static java.awt.Image field_h;
    static ec field_b;
    static sj[] field_d;
    static he[] field_g;
    static int[] field_j;
    private vj field_c;
    static int field_a;

    public static void a(byte param0) {
        int discarded$2 = 0;
        field_d = null;
        field_b = null;
        field_j = null;
        field_h = null;
        if (param0 >= -52) {
          discarded$2 = ac.a(115);
          field_g = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_f = null;
          return;
        }
    }

    final ai a(int param0, byte param1) {
        ai var3 = null;
        byte[] var4 = null;
        ai var5 = null;
        var3 = (ai) (this.field_i.a(true, (long)param0));
        if (var3 == null) {
          L0: {
            if (32768 <= param0) {
              var4 = this.field_e.a(1, 32767 & param0, (byte) 35);
              break L0;
            } else {
              var4 = this.field_c.a(1, param0, (byte) 35);
              break L0;
            }
          }
          var5 = new ai();
          if (var4 == null) {
            if (32768 > param0) {
              if (param1 != -74) {
                return (ai) null;
              } else {
                this.field_i.a(var5, (long)param0, 117);
                return var5;
              }
            } else {
              var5.a((byte) 5);
              if (param1 != -74) {
                return (ai) null;
              } else {
                this.field_i.a(var5, (long)param0, 117);
                return var5;
              }
            }
          } else {
            var5.a(new od(var4), param1 + 74);
            if (32768 <= param0) {
              var5.a((byte) 5);
              if (param1 != -74) {
                return (ai) null;
              } else {
                this.field_i.a(var5, (long)param0, 117);
                return var5;
              }
            } else {
              if (param1 != -74) {
                return (ai) null;
              } else {
                this.field_i.a(var5, (long)param0, 117);
                return var5;
              }
            }
          }
        } else {
          return var3;
        }
    }

    final static int a(int param0) {
        if (param0 != -1) {
            field_h = (java.awt.Image) null;
            return ub.field_b;
        }
        return ub.field_b;
    }

    private ac() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        field_f = new int[128];
        field_j = new int[]{-1, -1, -1, -1, -1, 21, -1, 29, -1, -1, -1, 33, -1, -1, -1, 47, 51, 55, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_d = new sj[255];
        for (var0 = 0; field_d.length > var0; var0++) {
            field_d[var0] = new sj();
        }
    }
}
