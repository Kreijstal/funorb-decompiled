/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd extends oh {
    static boolean field_h;
    static ko field_i;
    static un field_g;
    static int field_f;

    final int a(int param0, int param1) {
        Object var4 = null;
        if (param0 != 1843275042) {
          var4 = null;
          jp discarded$2 = rd.a(false, (String) null);
          return q.field_a[ma.field_n[param1]].field_d;
        } else {
          return q.field_a[ma.field_n[param1]].field_d;
        }
    }

    final static jp a(boolean param0, String param1) {
        int var2 = 0;
        String[] var3 = null;
        int var5 = 0;
        jp var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        String var11 = null;
        String[] var12 = null;
        String[] var13 = null;
        String var14 = null;
        var8 = CrazyCrystals.field_B;
        var2 = param1.length();
        if (var2 != 0) {
          if (param0) {
            if ((var2 ^ -1) >= -256) {
              var12 = ik.a(param1, (byte) -76, '.');
              var3 = var12;
              if ((var12.length ^ -1) > -3) {
                return ma.field_m;
              } else {
                var13 = var12;
                var5 = 0;
                L0: while (true) {
                  if (var13.length > var5) {
                    var14 = var13[var5];
                    var7 = w.a((byte) -44, var14);
                    if (var7 == null) {
                      var5++;
                      continue L0;
                    } else {
                      return var7;
                    }
                  } else {
                    return uk.a((byte) 46, var3[var12.length + -1]);
                  }
                }
              }
            } else {
              return hk.field_d;
            }
          } else {
            field_h = false;
            if ((var2 ^ -1) >= -256) {
              var9 = ik.a(param1, (byte) -76, '.');
              var3 = var9;
              if ((var9.length ^ -1) > -3) {
                return ma.field_m;
              } else {
                var10 = var9;
                var5 = 0;
                L1: while (true) {
                  if (var10.length > var5) {
                    var11 = var10[var5];
                    var7 = w.a((byte) -44, var11);
                    if (var7 == null) {
                      var5++;
                      continue L1;
                    } else {
                      return var7;
                    }
                  } else {
                    return uk.a((byte) 46, var3[var9.length + -1]);
                  }
                }
              }
            } else {
              return hk.field_d;
            }
          }
        } else {
          return ma.field_m;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            field_f = -104;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final int a(byte param0, boolean param1) {
        if (param0 > -53) {
            return 1;
        }
        return 16;
    }

    rd() {
    }

    final static hm[] a(md param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        hm[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        hm var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var2 = param0.d((byte) -125, 8);
        if (0 >= var2) {
          var3 = param0.d((byte) -62, 12);
          var4 = new hm[var3];
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              if (param1 > -80) {
                field_i = null;
                return var4;
              } else {
                return var4;
              }
            } else {
              if (fn.a(1, param0)) {
                var6 = new hm();
                int discarded$6 = param0.d((byte) -56, 24);
                int discarded$7 = param0.d((byte) -103, 24);
                var6.field_b = param0.d((byte) -95, 24);
                int discarded$8 = param0.d((byte) -98, 9);
                int discarded$9 = param0.d((byte) -114, 12);
                int discarded$10 = param0.d((byte) -87, 12);
                int discarded$11 = param0.d((byte) -70, 12);
                var4[var5] = var6;
                var5++;
                var5++;
                continue L0;
              } else {
                var6_int = param0.d((byte) -61, bd.a(-1 + var5, (byte) 62));
                var4[var5] = var4[var6_int];
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
    }
}
