/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static String field_b;
    static boolean field_a;

    final static String a(k param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            var3_int = param0.h((byte) -109);
            if (var3_int > param1) {
              var3_int = param1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var4 = new byte[var3_int];
            param0.field_j = param0.field_j + r.field_a.a(var3_int, param2 + -3574, 0, param0.field_m, var4, param0.field_j);
            if (param2 == 3460) {
              break L1;
            } else {
              jg.b(43);
              break L1;
            }
          }
          var5 = oe.a(var3_int, var4, false, 0);
          stackOut_5_0 = (String) var5;
          stackIn_6_0 = stackOut_5_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_6_0;
        }
        return null;
    }

    final static fc a(int param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var10 = new byte[24 + param1.length];
        var9 = var10;
        var8 = var9;
        var7 = var8;
        var3 = var7;
        var2 = 0;
        L0: while (true) {
          if (-5 >= (var2 ^ -1)) {
            var2++;
            var4 = ql.a(true, var2, param1);
            var2++;
            var5 = ql.a(true, var2, param1);
            nn.a(-114, 4, var10, var4);
            nn.a(-128, 5, var10, var5);
            nn.a(-111, 6, var10, var4);
            nn.a(-118, 7, var10, var5);
            nn.a(-113, 8, var10, var4);
            nn.a(-106, 9, var10, var5);
            nn.a(-123, 10, var10, var4);
            nn.a(-127, 11, var10, var5);
            var2 = 6;
            if (param0 == 30270) {
              L1: while (true) {
                if (param1.length / 4 <= var2) {
                  return gi.a(var10, -113);
                } else {
                  nn.a(param0 ^ -30281, var2 - -6, var3, ql.a(true, var2, param1));
                  var2++;
                  continue L1;
                }
              }
            } else {
              field_b = null;
              L2: while (true) {
                if (param1.length / 4 <= var2) {
                  return gi.a(var10, -113);
                } else {
                  nn.a(param0 ^ -30281, var2 - -6, var3, ql.a(true, var2, param1));
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            nn.a(-128, var2, var3, ql.a(true, var2, param1));
            var2++;
            continue L0;
          }
        }
    }

    final static sm[] a(int param0, go param1) {
        int[] var3 = null;
        sm[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        sm var7 = null;
        int var8 = 0;
        di var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1.a(-36)) {
          var9 = param1.c(0);
          L0: while (true) {
            if (0 != var9.field_f) {
              if (2 == var9.field_f) {
                return new sm[]{};
              } else {
                var13 = (int[]) var9.field_d;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var3 = var10;
                var5 = 88 % ((27 - param0) / 55);
                var4 = new sm[var13.length >> 1476197698];
                var6 = 0;
                L1: while (true) {
                  if (var4.length <= var6) {
                    return var4;
                  } else {
                    var7 = new sm();
                    var4[var6] = var7;
                    var7.field_e = var3[var6 << -1537884766];
                    var7.field_a = var3[(var6 << -1854007262) - -1];
                    var7.field_c = var3[(var6 << -1472796862) + 2];
                    var7.field_d = var3[(var6 << -1820917502) + 3];
                    var6++;
                    continue L1;
                  }
                }
              }
            } else {
              vd.a(false, 10L);
              continue L0;
            }
          }
        } else {
          return new sm[]{};
        }
    }

    final static void a(int param0) {
        if (!og.field_N) {
            throw new IllegalStateException();
        }
        hh.field_m = true;
        sc.a(param0 ^ -75, true);
        a.field_b = param0;
    }

    public static void b(int param0) {
        if (param0 != 7) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_a = false;
    }
}
