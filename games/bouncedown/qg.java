/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends ai {
    int field_i;
    static mf field_g;
    int field_h;

    public static void b(byte param0) {
        field_g = null;
        if (param0 != 57) {
            field_g = null;
        }
    }

    final static int a(int param0, int param1) {
        int var3 = Bounce.field_N;
        ih.field_X = 0;
        if (param0 != -23888) {
            field_g = null;
        }
        md.field_q = null;
        mf.field_a = null;
        int var2 = a.field_a;
        a.field_a = fk.field_d;
        tb.field_p.field_l = tb.field_p.field_l + 1;
        if (param1 == 51) {
            tb.field_p.field_d = 2;
        } else {
            if (param1 == 50) {
                tb.field_p.field_d = 5;
            } else {
                tb.field_p.field_d = 1;
            }
        }
        fk.field_d = var2;
        if (-3 >= (tb.field_p.field_l ^ -1)) {
            if (!(51 != param1)) {
                return 2;
            }
        }
        if ((tb.field_p.field_l ^ -1) <= -3) {
            if (!((param1 ^ -1) != -51)) {
                return 5;
            }
        }
        if (!(tb.field_p.field_l < 4)) {
            return 1;
        }
        return -1;
    }

    final static byte[] a(boolean param0, byte[] param1, int param2, ii param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        if (param0) {
          var4 = param3.f(7, param2);
          if (-1 != (var4 ^ -1)) {
            L0: {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (var4 != param1.length) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              param1 = new byte[var4];
              break L0;
            }
            L2: {
              var5 = param3.f(7, 3);
              var6 = (byte)param3.f(7, 8);
              if ((var5 ^ -1) < -1) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param1[var7] = (byte)(param3.f(7, var5) + var6);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param1[var7] = (byte)var6;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param1;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private qg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new mf();
    }
}
