/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static String field_c;
    static dl field_h;
    static int field_g;
    static String field_b;
    static int field_d;
    static int[] field_f;
    static int field_e;
    static String field_a;

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        int var2 = param1.length();
        if (param0 != 6) {
            field_b = null;
        }
        int var3 = 0;
        for (var4 = 0; var2 > var4; var4++) {
            var3 = ij.a(param1.charAt(var4), 4290) + (var3 << -1939856251) - var3;
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = Virogrid.field_F ? 1 : 0;
          var6 = 8 + param3 + param5 + 495;
          wc.field_k.a(3, -6 + we.field_c.field_ub, var6 + -6, (byte) -46, 3);
          var7 = -5 + wc.field_k.field_ub;
          qa.field_d.a(5, param2, param3 + (485 + param5 - -2), (byte) -48, -param2 + var7);
          di.field_n.a(param5, param2, -wa.field_I.field_K + (qa.field_d.field_K + -param5), (byte) -88, 0);
          var7 = var7 - (2 + param2);
          var8 = -68 % ((72 - param4) / 40);
          wa.field_I.a(param5 - -di.field_n.field_K, param2, wa.field_I.field_K, (byte) -97, 0);
          ne.field_c.a(5, -126, 2 + (485 + param5) + param3, 2, var7 + -5, 5, param3);
          if (null != fh.field_c) {
            fh.field_c.a(ne.field_c.field_ub, true, ne.field_c.field_F, ne.field_c.field_tb, ne.field_c.field_K);
            break L0;
          } else {
            break L0;
          }
        }
        var9 = -param5 + (we.field_c.field_K + -var6);
        var10 = var9 / 2;
        var11 = var10 + (param1 - -param5);
        var12 = 0;
        var13 = 0;
        L1: while (true) {
          if (var13 >= 6) {
            return;
          } else {
            L2: {
              if (-6 >= (var13 ^ -1)) {
                break L2;
              } else {
                if (null != ln.field_i[var13]) {
                  break L2;
                } else {
                  var13++;
                  continue L1;
                }
              }
            }
            var14 = 3 + var12 * (-6 + we.field_c.field_ub + 2) / (1 + tn.field_h);
            var12++;
            var7 = 3 - -((2 + (we.field_c.field_ub - 6)) * var12 / (1 + tn.field_h)) - 2 + -var14;
            if (-6 < (var13 ^ -1)) {
              ln.field_i[var13].a(var6, var7, var9, (byte) -48, var14);
              ak.field_d[var13].a(param5, var7, var10 - param5, (byte) -72, 0);
              og.field_g[var13].a(var10, -param0 + (var7 + -param0), param1, (byte) -122, param0);
              th.field_o[var13].a(var11, -param0 + -param0 + var7, -var11 + -param5 + var9, (byte) -112, param0);
              var13++;
              continue L1;
            } else {
              af.field_d.a(var6, var7, var9, (byte) -73, var14);
              var13++;
              continue L1;
            }
          }
        }
    }

    final static String a(int param0, byte param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        var11 = new char[param0];
        var10 = var11;
        var4 = var10;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (param0 <= var6) {
            L1: {
              if (param1 <= -93) {
                break L1;
              } else {
                nf.a((byte) -118);
                break L1;
              }
            }
            return new String(var11, 0, var5);
          } else {
            var7 = 255 & param3[var6 + param2];
            if (var7 != 0) {
              L2: {
                if (var7 < 128) {
                  break L2;
                } else {
                  if ((var7 ^ -1) > -161) {
                    L3: {
                      var8 = cg.field_f[var7 - 128];
                      if (0 == var8) {
                        var8 = 63;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -28637) {
            int discarded$0 = nf.a(-2, 2);
        }
        field_h = null;
        field_c = null;
        field_f = null;
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != 21855) {
            return -30;
        }
        if (4096 > param1) {
            return -2049 >= (param1 ^ -1) ? -af.field_h[-2048 + param1] : af.field_h[-param1 + 2048];
        }
        return (param1 ^ -1) > -6145 ? -af.field_h[-param1 + 6144] : af.field_h[-6144 + param1];
    }

    final static void a(byte param0) {
        int var1 = 83 / ((-71 - param0) / 39);
        if (!(!ac.field_e)) {
            f.a((byte) -55);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = new int[4];
        field_c = "Enter name of player to add to list";
        field_h = new dl();
        field_a = "<%0> has left.";
    }
}
