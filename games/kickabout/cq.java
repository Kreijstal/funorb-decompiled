/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends gn {
    int field_l;
    static int field_g;
    static js field_h;
    static double field_f;
    static hu field_e;
    long field_i;
    static ut field_j;
    static int field_n;
    int field_k;
    static StringBuilder field_m;

    public static void b(int param0) {
        field_h = null;
        field_j = null;
        if (param0 <= 46) {
            field_j = null;
        }
        field_m = null;
        field_e = null;
    }

    public final String toString() {
        String var1 = null;
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        L0: {
          var2 = Kickabout.field_G;
          var3 = "Auction Log [";
          var1 = var3;
          var1 = var3;
          if (-1 != (((cq) this).field_k ^ -1)) {
            if (((cq) this).field_k != 1) {
              if ((((cq) this).field_k ^ -1) == -3) {
                var1 = var3 + "Own]";
                break L0;
              } else {
                if ((((cq) this).field_k ^ -1) == -4) {
                  var1 = var3 + "Outbid]";
                  break L0;
                } else {
                  var1 = var3 + "NO TYPE]";
                  break L0;
                }
              }
            } else {
              var1 = var3 + "Buy]";
              break L0;
            }
          } else {
            var1 = var3 + "Bid]";
            break L0;
          }
        }
        var4 = var1 + ", [INDEX==" + ((cq) this).field_l + "]";
        var1 = var4 + ", [ID==" + ((cq) this).field_i + "]\n";
        return var1;
    }

    final static int a(int param0) {
        if (param0 != 1315216324) {
            int discarded$0 = cq.a(0);
        }
        return fc.field_a + (q.field_b << -763402398) + (ng.field_a << 1315216324);
    }

    final static uo a(int param0, sj param1, int param2, int param3, sj param4) {
        if (!cu.a(param2, param4, param3, 123)) {
            return null;
        }
        if (param0 != 10) {
            Object var6 = null;
            cq.a((java.applet.Applet) null, (byte) -14);
        }
        return tt.a(12015, param1.b(param3, -32669, param2));
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 126) {
                field_h = null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                param0.getAppletContext().showDocument(qr.a(param0, var2, 3), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, String param1, byte param2) {
        if ((param0 ^ -1) == -4) {
            return ol.field_E;
        }
        if (6 == param0) {
            return bg.field_s;
        }
        if (!((param0 ^ -1) != -8)) {
            return fv.field_a;
        }
        if (param0 == -9) {
            return rc.field_e;
        }
        if (!(-10 != param0)) {
            return cv.field_g;
        }
        if (!(param0 != 10)) {
            return vs.field_c;
        }
        if (!(param0 != 11)) {
            return go.field_a;
        }
        if (param2 < 101) {
            cq.b(68);
        }
        if ((param0 ^ -1) != -15) {
            return null;
        }
        return vo.a((byte) -18, nm.field_a, new String[1]);
    }

    final static void a(boolean param0, int param1) {
        ir.a(param0, param1 + 16355);
        if (param1 != 0) {
            field_m = null;
        }
        rg.a((byte) -125, param0);
    }

    final static ut[] a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var7 = Kickabout.field_G;
        ut[] var8 = new ut[9];
        ut[] var4 = var8;
        var8[0] = lh.a(param2, (byte) -96, param0);
        for (var5 = 1; (var5 ^ -1) > -10; var5++) {
            var8[var5] = var8[0];
        }
        int var6 = -119 % ((param3 - 38) / 60);
        var8[4] = lh.a(param1, (byte) -96, 64);
        return var4;
    }

    cq(int param0, int param1, long param2) {
        ((cq) this).field_i = param2;
        ((cq) this).field_l = param1;
        ((cq) this).field_k = param0;
    }

    cq(iw param0) {
        int discarded$0 = param0.h((byte) -126);
        int var2 = param0.h((byte) -124);
        ((cq) this).field_k = var2 & 15;
        ((cq) this).field_l = (15 & var2 >> -660378780) + -1;
        ((cq) this).field_i = param0.i((byte) -124);
    }

    final static boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 15137) {
          L0: {
            L1: {
              if (la.a(100)) {
                break L1;
              } else {
                if (2 > tk.field_Ib) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static Object a(byte[] param0, boolean param1, int param2) {
        ll var3 = null;
        if (param0 == null) {
            return null;
        }
        if (!(param2 >= param0.length)) {
            var3 = new ll();
            ((pf) (Object) var3).a(param0, 21820);
            return (Object) (Object) var3;
        }
        if (param1) {
            return (Object) (Object) vq.a(82, param0);
        }
        return (Object) (Object) param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = (js) (Object) new hj();
        field_m = new StringBuilder(80);
    }
}
