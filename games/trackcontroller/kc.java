/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int[][] field_c;
    static int field_b;
    static String field_a;

    final static void a(int param0, byte param1, ei param2) {
        int var4 = 0;
        int var5 = 0;
        la var6 = null;
        var6 = ra.field_C;
        var6.c(param0, 7);
        var6.field_k = var6.field_k + 1;
        var4 = var6.field_k;
        var6.a(1, (byte) -75);
        if (param2.field_l == null) {
          var6.a(0, (byte) -81);
          int discarded$4 = var6.a(var4, false);
          var6.field_k = var6.field_k - 4;
          param2.field_n = var6.e((byte) 113);
          var5 = -14 / ((param1 - -66) / 49);
          var6.a(true, -var4 + var6.field_k);
          return;
        } else {
          var6.a(param2.field_l.length, (byte) -102);
          var6.a(param2.field_l.length, 96, 0, param2.field_l);
          int discarded$5 = var6.a(var4, false);
          var6.field_k = var6.field_k - 4;
          param2.field_n = var6.e((byte) 113);
          var5 = -14 / ((param1 - -66) / 49);
          var6.a(true, -var4 + var6.field_k);
          return;
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        la var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var13 = null;
        int[] var16 = null;
        la var17 = null;
        int[] var18 = null;
        Object var19 = null;
        th var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        cf var21_ref = null;
        Object var22 = null;
        Object var23 = null;
        th var23_ref = null;
        Object var24 = null;
        la var25 = null;
        int[] var26 = null;
        Object var27 = null;
        th var27_ref = null;
        Object var28 = null;
        cf var28_ref = null;
        Object var29 = null;
        th var29_ref = null;
        int[] var30 = null;
        int[] var31 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        var24 = null;
        var27 = null;
        var28 = null;
        var29 = null;
        var8 = TrackController.field_F ? 1 : 0;
        if (param0 <= -83) {
          var25 = ne.field_a;
          var2 = var25.h(16383);
          if (var2 != 0) {
            if (var2 != 1) {
              if (var2 == 2) {
                var29_ref = (th) (Object) fh.field_b.b(2);
                if (var29_ref == null) {
                  lj.a((byte) 125);
                  return;
                } else {
                  var29_ref.field_k = lc.b(false);
                  var29_ref.field_m = var29_ref.field_k[0];
                  var29_ref.field_j = true;
                  var29_ref.a(-54);
                  return;
                }
              } else {
                hb.a((Throwable) null, 0, "A1: " + jc.b(96));
                lj.a((byte) 120);
                return;
              }
            } else {
              var28_ref = (cf) (Object) kd.field_b.b(2);
              if (var28_ref == null) {
                lj.a((byte) 114);
                return;
              } else {
                var28_ref.a(-77);
                return;
              }
            }
          } else {
            var10 = lc.b(false);
            var31 = var10;
            var26 = var31;
            var16 = var26;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var25;
            var6 = ((be) (Object) var5).h(16383);
            var7 = 0;
            L0: while (true) {
              if (var6 <= var7) {
                var27_ref = (th) (Object) fh.field_b.b(2);
                if (var27_ref == null) {
                  lj.a((byte) 116);
                  return;
                } else {
                  var27_ref.field_m = var31[0];
                  var27_ref.field_k = var3;
                  var27_ref.field_j = true;
                  var27_ref.a(-67);
                  return;
                }
              } else {
                var9[var7] = ((be) (Object) var5).e((byte) 113);
                var7++;
                continue L0;
              }
            }
          }
        } else {
          field_c = null;
          var17 = ne.field_a;
          var2 = var17.h(16383);
          if (var2 != 0) {
            if (var2 != 1) {
              if (var2 == 2) {
                var23_ref = (th) (Object) fh.field_b.b(2);
                if (var23_ref == null) {
                  lj.a((byte) 125);
                  return;
                } else {
                  var23_ref.field_k = lc.b(false);
                  var23_ref.field_m = var23_ref.field_k[0];
                  var23_ref.field_j = true;
                  var23_ref.a(-54);
                  return;
                }
              } else {
                hb.a((Throwable) null, 0, "A1: " + jc.b(96));
                lj.a((byte) 120);
                return;
              }
            } else {
              var21_ref = (cf) (Object) kd.field_b.b(2);
              if (var21_ref == null) {
                lj.a((byte) 114);
                return;
              } else {
                var21_ref.a(-77);
                return;
              }
            }
          } else {
            var10 = lc.b(false);
            var30 = var10;
            var18 = var30;
            var16 = var18;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var17;
            var6 = ((be) (Object) var5).h(16383);
            var7 = 0;
            L1: while (true) {
              if (var6 <= var7) {
                var19_ref = (th) (Object) fh.field_b.b(2);
                if (var19_ref == null) {
                  lj.a((byte) 116);
                  return;
                } else {
                  var19_ref.field_m = var30[0];
                  var19_ref.field_k = var3;
                  var19_ref.field_j = true;
                  var19_ref.a(-67);
                  return;
                }
              } else {
                var9[var7] = ((be) (Object) var5).e((byte) 113);
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 2) {
            field_a = null;
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            sa.field_P = param2;
            try {
                var3 = param0.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (-1 == (param2.length() ^ -1)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                if (param1 != 1263) {
                    kc.b(-38);
                }
                sj.a(param0, "document.cookie=\"" + var5 + "\"", -24531);
            } catch (Throwable throwable) {
            }
            rj.a(param0, (byte) -128);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 256;
        field_a = "Orb points: <%0>";
    }
}
