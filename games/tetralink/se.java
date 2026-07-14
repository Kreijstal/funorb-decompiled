/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se {
    static int field_b;
    static String field_a;
    static wf field_c;

    abstract void a(int param0, java.awt.Component param1);

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        hc var4_ref_hc = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        km var8 = null;
        bc var9 = null;
        bc var13 = null;
        Object var18 = null;
        Object var20 = null;
        km var20_ref = null;
        bc var21 = null;
        Object var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        km var27 = null;
        var18 = null;
        var20 = null;
        var23 = null;
        var6 = TetraLink.field_J;
        if (!param0) {
          var21 = kb.field_q;
          var9 = var21;
          var2 = var21.d((byte) -99);
          if (0 == var2) {
            var27 = (km) (Object) ph.field_F.c(false);
            if (var27 == null) {
              mk.a(false);
              return;
            } else {
              L0: {
                var4 = var21.d((byte) -99);
                if (0 == var4) {
                  var5 = null;
                  break L0;
                } else {
                  var25 = new byte[var4];
                  var21.b(var4, 0, var25, 126);
                  break L0;
                }
              }
              var21.field_t = var21.field_t + 4;
              if (!var21.h(4)) {
                mk.a(param0);
                return;
              } else {
                var27.b(false);
                return;
              }
            }
          } else {
            if ((var2 ^ -1) == -2) {
              var3 = var21.f(-122);
              var4_ref_hc = (hc) (Object) nc.field_f.c(false);
              L1: while (true) {
                if (var4_ref_hc != null) {
                  if (var4_ref_hc.field_t != var3) {
                    var4_ref_hc = (hc) (Object) nc.field_f.a((byte) -70);
                    continue L1;
                  } else {
                    if (var4_ref_hc == null) {
                      mk.a(false);
                      return;
                    } else {
                      var4_ref_hc.b(param0);
                      return;
                    }
                  }
                } else {
                  if (var4_ref_hc == null) {
                    mk.a(false);
                    return;
                  } else {
                    var4_ref_hc.b(param0);
                    return;
                  }
                }
              }
            } else {
              fk.a(-83, (Throwable) null, "A1: " + hc.a(false));
              mk.a(false);
              return;
            }
          }
        } else {
          field_c = null;
          var13 = kb.field_q;
          var9 = var13;
          var2 = var13.d((byte) -99);
          if (0 == var2) {
            var20_ref = (km) (Object) ph.field_F.c(false);
            var8 = var20_ref;
            if (var20_ref == null) {
              mk.a(false);
              return;
            } else {
              L2: {
                var4 = var13.d((byte) -99);
                if (0 == var4) {
                  var5 = null;
                  break L2;
                } else {
                  var24 = new byte[var4];
                  var13.b(var4, 0, var24, 126);
                  break L2;
                }
              }
              var13.field_t = var13.field_t + 4;
              if (!var13.h(4)) {
                mk.a(param0);
                return;
              } else {
                var20_ref.b(false);
                return;
              }
            }
          } else {
            if ((var2 ^ -1) == -2) {
              var3 = var13.f(-122);
              var4_ref_hc = (hc) (Object) nc.field_f.c(false);
              L3: while (true) {
                if (var4_ref_hc != null) {
                  if (var4_ref_hc.field_t != var3) {
                    var4_ref_hc = (hc) (Object) nc.field_f.a((byte) -70);
                    continue L3;
                  } else {
                    if (var4_ref_hc == null) {
                      mk.a(false);
                      return;
                    } else {
                      var4_ref_hc.b(param0);
                      return;
                    }
                  }
                } else {
                  if (var4_ref_hc == null) {
                    mk.a(false);
                    return;
                  } else {
                    var4_ref_hc.b(param0);
                    return;
                  }
                }
              }
            } else {
              fk.a(-83, (Throwable) null, "A1: " + hc.a(false));
              mk.a(false);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for music";
        field_b = -1;
    }
}
