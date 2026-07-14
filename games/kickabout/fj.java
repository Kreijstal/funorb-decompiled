/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static int field_a;
    static volatile int field_c;
    static hu field_b;

    public static void b(boolean param0) {
        field_b = null;
        if (!param0) {
            Object var2 = null;
            tf discarded$0 = fj.a(true, (String) null);
        }
    }

    final static void a(boolean param0, boolean param1) {
        dg.field_e = !param1 ? true : false;
        if (param0) {
            field_c = -78;
            return;
        }
    }

    final static String a(boolean param0) {
        if (param0) {
            return null;
        }
        return un.field_e.a(-108);
    }

    final static int a(int param0, int param1) {
        if (param0 != -40) {
          fj.a(true, false);
          return param1 >>> -771544996 | param1 << 762932996;
        } else {
          return param1 >>> -771544996 | param1 << 762932996;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        L0: {
          wd.field_l.k(119);
          if (nm.field_d == null) {
            nm.field_d = new oj(wd.field_l, st.field_m);
            break L0;
          } else {
            break L0;
          }
        }
        wd.field_l.a((fd) (Object) nm.field_d, false);
        if (param0 != -45) {
          var2 = null;
          tf discarded$2 = fj.a(true, (String) null);
          return;
        } else {
          return;
        }
    }

    final static tf a(boolean param0, String param1) {
        tf var2 = null;
        sb var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var2 = new tf();
        if (param0) {
          return null;
        } else {
          var3 = new sb(param1);
          L0: while (true) {
            if (var3.a((byte) 62)) {
              return var2;
            } else {
              var4 = var3.b(-78);
              if (!Character.isWhitespace((char) var4)) {
                L1: {
                  if (34 == var4) {
                    break L1;
                  } else {
                    if (var4 == 39) {
                      break L1;
                    } else {
                      if (40 == var4) {
                        var2.a((gn) (Object) new lk(si.field_g, -1 + var3.field_c), 3);
                        continue L0;
                      } else {
                        if (41 == var4) {
                          var2.a((gn) (Object) new lk(og.field_c, var3.field_c + -1), 3);
                          continue L0;
                        } else {
                          if (var4 == 44) {
                            var2.a((gn) (Object) new lk(bp.field_Gb, -1 + var3.field_c), 3);
                            continue L0;
                          } else {
                            var2.a((gn) (Object) tl.a(var3, false), 3);
                            continue L0;
                          }
                        }
                      }
                    }
                  }
                }
                var2.a((gn) (Object) cf.a(-9323, var3), 3);
                continue L0;
              } else {
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
