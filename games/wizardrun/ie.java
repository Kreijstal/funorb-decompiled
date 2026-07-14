/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends wl {
    int field_k;
    static oi field_l;
    byte[] field_i;
    static int field_j;

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (param0 < -11) {
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (var2 >= 128) {
              if (-161 >= (var2 ^ -1)) {
                return (char)var2;
              } else {
                L0: {
                  var3 = ki.field_G[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          }
        } else {
          field_j = 101;
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (var2 >= 128) {
              if (-161 >= (var2 ^ -1)) {
                return (char)var2;
              } else {
                L1: {
                  var3 = ki.field_G[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 != -3870) {
          L0: {
            field_l = null;
            if (aa.field_lb != null) {
              aa.field_lb.l(-27697);
              break L0;
            } else {
              break L0;
            }
          }
          ik.field_G = new tb();
          td.field_f.c((ub) (Object) ik.field_G, -128);
          return;
        } else {
          L1: {
            if (aa.field_lb != null) {
              aa.field_lb.l(-27697);
              break L1;
            } else {
              break L1;
            }
          }
          ik.field_G = new tb();
          td.field_f.c((ub) (Object) ik.field_G, -128);
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            ca[] discarded$0 = ie.a(35, (mg) null);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static ca[] a(int param0, mg param1) {
        int var2 = 0;
        int var3 = 0;
        ca[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ca var6_ref = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        var2 = param1.g(8, -11719);
        if (var2 > 0) {
          return null;
        } else {
          var3 = param1.g(param0, -11719);
          var4 = new ca[var3];
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              if (!oe.a((byte) -55, param1)) {
                var6 = param1.g(da.a(var5 + -1, true), -11719);
                var4[var5] = var4[var6];
                var5++;
                var5++;
                continue L0;
              } else {
                var6_ref = new ca();
                int discarded$6 = param1.g(24, -11719);
                int discarded$7 = param1.g(24, -11719);
                var6_ref.field_b = param1.g(24, param0 + -11731);
                int discarded$8 = param1.g(9, -11719);
                int discarded$9 = param1.g(12, -11719);
                int discarded$10 = param1.g(12, param0 ^ -11723);
                int discarded$11 = param1.g(12, -11719);
                var4[var5] = var6_ref;
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    private ie() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new oi();
    }
}
