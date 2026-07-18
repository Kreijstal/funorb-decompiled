/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se {
    static int field_b;
    static String field_a;
    static wf field_c;

    abstract void a(int param0, java.awt.Component param1);

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        hc var4_ref_hc = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        km var8 = null;
        bc var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            var9 = kb.field_q;
            var2 = var9.d((byte) -99);
            if (0 == var2) {
              var8 = (km) (Object) ph.field_F.c(false);
              if (var8 == null) {
                int discarded$4 = 0;
                mk.a();
                return;
              } else {
                L1: {
                  var4 = var9.d((byte) -99);
                  if (0 == var4) {
                    var5 = null;
                    break L1;
                  } else {
                    var13 = new byte[var4];
                    var9.b(var4, 0, var13, 126);
                    break L1;
                  }
                }
                var9.field_t = var9.field_t + 4;
                if (!var9.h(4)) {
                  int discarded$5 = 0;
                  mk.a();
                  return;
                } else {
                  var8.b(false);
                  break L0;
                }
              }
            } else {
              if (var2 == 1) {
                var3 = var9.f(-122);
                var4_ref_hc = (hc) (Object) nc.field_f.c(false);
                L2: while (true) {
                  L3: {
                    if (var4_ref_hc == null) {
                      break L3;
                    } else {
                      if (var4_ref_hc.field_t == var3) {
                        break L3;
                      } else {
                        var4_ref_hc = (hc) (Object) nc.field_f.a((byte) -70);
                        continue L2;
                      }
                    }
                  }
                  if (var4_ref_hc == null) {
                    int discarded$6 = 0;
                    mk.a();
                    return;
                  } else {
                    var4_ref_hc.b(false);
                    return;
                  }
                }
              } else {
                fk.a(-83, (Throwable) null, "A1: " + hc.a(false));
                int discarded$7 = 0;
                mk.a();
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "se.E(" + false + ')');
        }
    }

    abstract void b(int param0, java.awt.Component param1);

    public static void b() {
        field_c = null;
        field_a = null;
    }

    abstract int a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for music";
        field_b = -1;
    }
}
