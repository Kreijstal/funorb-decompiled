/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String field_e;
    static qc field_d;
    static dm[] field_g;
    static double field_a;
    static dm[] field_b;
    static volatile boolean field_f;
    static int field_c;

    final static void a(int param0) {
        ja var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Geoblox.field_C;
        pf.field_D = true;
        var1 = (ja) (Object) a.field_d.g(0);
        L0: while (true) {
          if (var1 == null) {
            var2 = 12 % ((-69 - param0) / 38);
            var1 = (ja) (Object) bh.field_c.g(0);
            L1: while (true) {
              if (var1 == null) {
                return;
              } else {
                L2: {
                  L3: {
                    var1.b(true);
                    if (5 == var1.field_z) {
                      break L3;
                    } else {
                      if ((var1.field_z ^ -1) == -8) {
                        break L3;
                      } else {
                        if ((var1.field_z ^ -1) == -9) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  pf.field_D = false;
                  if (var1.field_G < 3) {
                    break L2;
                  } else {
                    ra.field_a.a(-115, (hf) (Object) var1);
                    break L2;
                  }
                }
                var1 = (ja) (Object) bh.field_c.d(1);
                continue L1;
              }
            }
          } else {
            L4: {
              var1.b(true);
              if (6 == var1.field_z) {
                pf.field_D = false;
                if (var1.field_G < 3) {
                  break L4;
                } else {
                  ra.field_a.a(-67, (hf) (Object) var1);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            var1 = (ja) (Object) a.field_d.d(1);
            continue L0;
          }
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        L0: {
          if ((hj.field_a ^ -1) == -12) {
            w.a(31);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          qc.a(pb.field_s, oi.field_e, lb.field_a, (byte) -40);
          i.a(0, (byte) 117, param1, 0);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        if (param0 >= -79) {
          fc.a(-17);
          field_d = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Music: ";
        field_d = new qc(256);
        field_a = 0.0;
        field_f = false;
    }
}
