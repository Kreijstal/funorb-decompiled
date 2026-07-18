/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj implements uj {
    static int field_d;
    static int field_e;
    static long field_c;
    static int field_f;
    static boolean field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != 3) {
            field_f = 89;
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final void a(boolean param0) {
        if (param0) {
            rj.a(50);
            tb.field_a = 2;
            bc.field_a = 1;
            return;
        }
        tb.field_a = 2;
        bc.field_a = 1;
    }

    public final String a(byte param0) {
        int var2 = 111 / ((param0 - -33) / 62);
        return "Make Rock Rock";
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        if (!il.e(-31391)) {
          if (ke.field_V) {
            pl.field_h = param1;
            var2 = param1;
            if (4 == var2) {
              ne.a(3, -100);
              cm.field_r = 0;
              return;
            } else {
              if (var2 != 2) {
                if (var2 != 1) {
                  if (var2 != 11) {
                    if (var2 != 7) {
                      if (var2 != 10) {
                        if (3 == var2) {
                          ne.a(4, -90);
                          cm.field_r = 0;
                          return;
                        } else {
                          if (12 == var2) {
                            ne.a(4, -90);
                            cm.field_r = 0;
                            return;
                          } else {
                            cm.field_r = 0;
                            return;
                          }
                        }
                      } else {
                        ke.field_V = false;
                        ne.a(4, -90);
                        cm.field_r = 0;
                        return;
                      }
                    } else {
                      ke.field_V = false;
                      ne.a(4, -90);
                      cm.field_r = 0;
                      return;
                    }
                  } else {
                    ne.a(6, -101);
                    cm.field_r = 0;
                    return;
                  }
                } else {
                  ne.a(6, -101);
                  cm.field_r = 0;
                  return;
                }
              } else {
                ne.a(7, -96);
                cm.field_r = 0;
                return;
              }
            }
          } else {
            gm.field_a = true;
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 20000000L;
        field_b = false;
        field_a = "Super Volcano";
    }
}
