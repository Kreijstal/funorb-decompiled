/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends td {
    static String field_p;
    static sna field_r;
    static int field_q;

    ui(int param0, aga param1) {
        super(param0, param1);
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_q = -19;
        }
        field_r = null;
        field_p = null;
    }

    final static void a(byte param0, kv param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var9 = BachelorFridge.field_y;
        if (((param1.field_p | param1.field_q | param1.field_t | param1.field_u) & 3) == 0) {
          return;
        } else {
          L0: {
            var2 = (param1.field_t & 3) + param1.field_q;
            if (param0 == -33) {
              break L0;
            } else {
              var10 = null;
              ui.a((byte) -45, (kv) null);
              break L0;
            }
          }
          var3 = param1.field_p + (3 & param1.field_u);
          var2 = -(3 & var2) + (4 + var2);
          var3 = 4 - ((var3 & 3) - var3);
          var4 = new int[var2 * var3];
          var5 = 0;
          var6 = (3 & param1.field_t) - -((3 & param1.field_u) * var2);
          var7 = 0;
          L1: while (true) {
            if (param1.field_p <= var7) {
              param1.field_t = param1.field_t & -4;
              param1.field_p = var3;
              param1.field_u = param1.field_u & -4;
              param1.field_v = var4;
              param1.field_q = var2;
              return;
            } else {
              var8 = 0;
              L2: while (true) {
                if (var8 >= param1.field_q) {
                  var6 = var6 + (var2 - param1.field_q);
                  var7++;
                  continue L1;
                } else {
                  var6++;
                  var5++;
                  var4[var6] = param1.field_v[var5];
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = ((ui) this).field_h.a(75, param0);
        wfa var4 = new wfa(((ui) this).field_g, new nq(var3));
        if (param1 != 3) {
            return null;
        }
        var4.field_o.a((bw) (Object) new iv(new nq(var3), false, 1, -var3.field_t, 0), true);
        return (ii) (Object) var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Kick";
    }
}
