/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends o {
    int field_i;
    int field_j;
    int field_g;
    static String field_k;
    int field_l;
    int field_h;

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 0) {
            field_k = (String) null;
        }
        return mi.a(-120, param0, false);
    }

    final void a(int param0, int param1, int param2, int param3, kc param4) {
        ((qf) this).field_d.a(param4, true);
        ((qf) this).field_l = param2;
        if (param1 < 99) {
            qf.a((byte) -97, true);
        }
        ((qf) this).field_g = param0;
        ((qf) this).field_i = 10;
        ((qf) this).field_h = qq.a(20, es.field_b.length);
        ((qf) this).field_j = param3;
    }

    public qf() {
        super(new kc());
        ((qf) this).field_h = 0;
    }

    final void a(int param0, kc param1, int param2, int param3) {
        ((qf) this).field_d.a(param1, true);
        ((qf) this).field_l = param2;
        ((qf) this).field_g = param3;
        int var5 = 68 / ((43 - param0) / 61);
        ((qf) this).field_i = 10;
        ((qf) this).field_h = qq.a(20, es.field_b.length);
        ((qf) this).field_j = 92;
    }

    final static String a(String param0, int param1, String param2, gk param3, int param4) {
        if (param4 <= 65) {
            qf.b(-73);
        }
        if (!(param3.b((byte) -77))) {
            return param2;
        }
        return param0 + " - " + param3.a(param1, 100) + "%";
    }

    final static void a(byte[] param0, rb param1, int param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = AceOfSkies.field_G ? 1 : 0;
          var7 = dq.a(param4, -70);
          if (null == lp.field_b) {
            lp.field_b = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var15 = new int[4];
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var8 = var12;
          if (param2 == 25215) {
            break L1;
          } else {
            qf.a((byte) 115, false);
            break L1;
          }
        }
        var9 = 0;
        L2: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L3: {
              L4: {
                if (wt.field_l == null) {
                  break L4;
                } else {
                  if (var7 > wt.field_l.field_f.length) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              wt.field_l = new rb(var7);
              break L3;
            }
            L5: {
              L6: {
                wt.field_l.field_g = 0;
                wt.field_l.a(true, param4, param6, param0);
                wt.field_l.a(var7, (byte) 88);
                wt.field_l.a(var15, 2097272037);
                if (ke.field_a == null) {
                  break L6;
                } else {
                  if (-101 >= (ke.field_a.field_f.length ^ -1)) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              ke.field_a = new rb(100);
              break L5;
            }
            ke.field_a.field_g = 0;
            ke.field_a.b(-1336879960, 10);
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if ((var11 ^ -1) <= -5) {
                ke.field_a.a(param4, 23385);
                ke.field_a.a(0, param5, param3);
                param1.a(true, ke.field_a.field_g, 0, ke.field_a.field_f);
                param1.a(true, wt.field_l.field_g, 0, wt.field_l.field_f);
                return;
              } else {
                ke.field_a.a((byte) 87, var15[var11]);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = lp.field_b.nextInt();
            var9++;
            continue L2;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            qf.a((byte) 104, true);
        }
        field_k = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 77) {
            return;
        }
        gm.field_x.a(false, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "OK";
    }
}
