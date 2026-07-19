/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int[][] field_c;
    static int field_b;
    static String field_a;

    final static void a(int param0, byte param1, ei param2) {
        la var6 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var6 = ra.field_C;
            var6.c(param0, 7);
            var6.field_k = var6.field_k + 1;
            var4 = var6.field_k;
            var6.a(1, (byte) -75);
            if (param2.field_l == null) {
                var6.a(0, (byte) -81);
            } else {
                var6.a(param2.field_l.length, (byte) -102);
                var6.a(param2.field_l.length, 96, 0, param2.field_l);
            }
            discarded$0 = var6.a(var4, false);
            var6.field_k = var6.field_k - 4;
            param2.field_n = var6.e((byte) 113);
            int var5 = -14 / ((param1 - -66) / 49);
            var6.a(true, -var4 + var6.field_k);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "kc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        la var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        cf var11 = null;
        la var12 = null;
        int[] var13 = null;
        th var14 = null;
        th var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -83) {
                break L1;
              } else {
                field_c = (int[][]) null;
                break L1;
              }
            }
            var12 = ne.field_a;
            var2 = var12.h(16383);
            if (var2 != 0) {
              if (var2 != 1) {
                if (var2 != 2) {
                  hb.a((Throwable) null, 0, "A1: " + jc.b(96));
                  lj.a((byte) 120);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  var15 = (th) ((Object) fh.field_b.b(2));
                  if (var15 == null) {
                    lj.a((byte) 125);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var15.field_k = lc.b(false);
                    var15.field_m = var15.field_k[0];
                    var15.field_j = true;
                    var15.a(-54);
                    return;
                  }
                }
              } else {
                var11 = (cf) ((Object) kd.field_b.b(2));
                if (var11 != null) {
                  var11.a(-77);
                  return;
                } else {
                  lj.a((byte) 114);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              var10 = lc.b(false);
              var16 = var10;
              var13 = var16;
              var3 = var13;
              var9 = var10;
              var4 = var9;
              var5 = var12;
              var6 = ((be) ((Object) var5)).h(16383);
              var7 = 0;
              L2: while (true) {
                if (var6 <= var7) {
                  var14 = (th) ((Object) fh.field_b.b(2));
                  if (var14 == null) {
                    lj.a((byte) 116);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var14.field_m = var16[0];
                    var14.field_k = var3;
                    var14.field_j = true;
                    var14.a(-67);
                    return;
                  }
                } else {
                  var9[var7] = ((be) ((Object) var5)).e((byte) 113);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "kc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = (int[][]) null;
        field_a = null;
        if (param0 != 2) {
            field_a = (String) null;
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            try {
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
            } catch (RuntimeException runtimeException) {
                throw sl.a((Throwable) ((Object) runtimeException), "kc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = 256;
        field_a = "Orb points: <%0>";
    }
}
