/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static String field_b;
    static int field_a;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        var1 = je.field_b[0];
        var2 = param0;
        L0: while (true) {
          if (je.field_b.length > var2) {
            var3 = je.field_b[var2];
            gp.a(uf.field_o, var2 << 1400888196, uf.field_o, var1, var3);
            var1 = var1 + var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final static void b(int param0) {
        le var1 = null;
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        var1 = kn.field_L.b((byte) 26);
        L0: while (true) {
          if (!(var1 instanceof tm)) {
            var1 = se.field_m.b((byte) 26);
            L1: while (true) {
              if (!(var1 instanceof tm)) {
                if (param0 == 1400888196) {
                  var1 = rm.field_e.b((byte) 26);
                  L2: while (true) {
                    if (var1 instanceof tm) {
                      pc.a((byte) 13, ((tm) (Object) var1).field_j);
                      var1 = var1.field_b;
                      continue L2;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                pc.a((byte) 13, ((tm) (Object) var1).field_j);
                var1 = var1.field_b;
                continue L1;
              }
            }
          } else {
            pc.a((byte) 13, ((tm) (Object) var1).field_j);
            var1 = var1.field_b;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 42) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "UK Expansion";
        field_a = 70;
    }
}
