/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends td {
    static String field_p;

    final static hba a(lu param0, int param1, byte param2) {
        int var3 = 116 % ((param2 - 31) / 60);
        return new hba(param1, param0);
    }

    final static void a(int param0, jc param1) {
        param1.field_o = new char[]{(char)63};
        if (param0 != 0) {
            Object var3 = null;
            hba discarded$0 = nh.a((lu) null, 9, (byte) 2);
        }
        param1.field_q = new int[]{-1};
    }

    public static void c(byte param0) {
        if (param0 != 98) {
            return;
        }
        field_p = null;
    }

    final static void b(int param0) {
        nla.field_f = false;
        int var1 = 50 % ((param0 - -71) / 47);
    }

    final ii a(op param0, int param1) {
        lk var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          var9 = ((nh) this).field_h.a(25, param0);
          var4 = new lk(((nh) this).field_g, new nq(var9));
          var5 = 0;
          if (param1 == 3) {
            break L0;
          } else {
            nh.c((byte) 56);
            break L0;
          }
        }
        L1: while (true) {
          if (var5 >= param0.field_z) {
            return (ii) (Object) var4;
          } else {
            var6 = 0;
            L2: while (true) {
              if (var6 >= param0.field_B) {
                var5++;
                continue L1;
              } else {
                if (null != param0.field_a[var5][var6].field_l) {
                  var7 = param0.field_a[var5][var6].field_l;
                  var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, 0, 17), true);
                  var6++;
                  continue L2;
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    nh(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Enter name of player to add to list";
    }
}
