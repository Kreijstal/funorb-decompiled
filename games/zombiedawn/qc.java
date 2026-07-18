/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static String field_b;
    static int field_a;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            var1_int = je.field_b[0];
            var2 = 1;
            L1: while (true) {
              if (je.field_b.length <= var2) {
                break L0;
              } else {
                var3 = je.field_b[var2];
                gp.a(uf.field_o, var2 << 4, uf.field_o, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "qc.B(" + 1 + ')');
        }
    }

    final static void b(int param0) {
        le var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawn.field_J;
        try {
          L0: {
            var1 = kn.field_L.b((byte) 26);
            L1: while (true) {
              if (!(var1 instanceof tm)) {
                var1 = se.field_m.b((byte) 26);
                L2: while (true) {
                  if (!(var1 instanceof tm)) {
                    break L0;
                  } else {
                    pc.a((byte) 13, ((tm) (Object) var1).field_j);
                    var1 = var1.field_b;
                    continue L2;
                  }
                }
              } else {
                pc.a((byte) 13, ((tm) (Object) var1).field_j);
                var1 = var1.field_b;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, "qc.A(" + 1400888196 + ')');
        }
    }

    public static void a(byte param0) {
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
