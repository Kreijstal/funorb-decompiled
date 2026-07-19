/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se {
    static int field_b;
    static String field_a;
    static wf field_c;

    abstract void a(int param0, java.awt.Component param1);

    final static void a(boolean param0) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_c = (wf) null;
                break L1;
              }
            }
            var9 = kb.field_q;
            var2 = var9.d((byte) -99);
            if (0 == var2) {
              var8 = (km) ((Object) ph.field_F.c(false));
              if (var8 == null) {
                mk.a(false);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var4 = var9.d((byte) -99);
                  if (0 == var4) {
                    var5 = null;
                    break L2;
                  } else {
                    var13 = new byte[var4];
                    var9.b(var4, 0, var13, 126);
                    break L2;
                  }
                }
                var9.field_t = var9.field_t + 4;
                if (!var9.h(4)) {
                  mk.a(param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var8.b(false);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              if ((var2 ^ -1) == -2) {
                var3 = var9.f(-122);
                var4_ref_hc = (hc) ((Object) nc.field_f.c(false));
                L3: while (true) {
                  L4: {
                    if (var4_ref_hc == null) {
                      break L4;
                    } else {
                      if (var4_ref_hc.field_t == var3) {
                        break L4;
                      } else {
                        var4_ref_hc = (hc) ((Object) nc.field_f.a((byte) -70));
                        continue L3;
                      }
                    }
                  }
                  if (var4_ref_hc == null) {
                    mk.a(false);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var4_ref_hc.b(param0);
                    return;
                  }
                }
              } else {
                fk.a(-83, (Throwable) null, "A1: " + hc.a(false));
                mk.a(false);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "se.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    abstract void b(int param0, java.awt.Component param1);

    public static void b(int param0) {
        field_c = null;
        if (param0 != -1) {
            se.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract int a(int param0);

    static {
        field_a = "Waiting for music";
        field_b = -1;
    }
}
