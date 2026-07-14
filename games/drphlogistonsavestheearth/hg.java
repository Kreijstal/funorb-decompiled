/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends hc {
    String field_V;
    static int field_sb;
    String field_qb;
    int field_tb;
    static qb field_ub;
    static int field_pb;
    static k field_S;
    static String[] field_ob;
    static int field_rb;

    final static boolean a(String param0, boolean param1, int param2, byte param3, String param4, String param5, v param6) {
        qd var7 = null;
        qd var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param3 == -38) {
          if (fk.field_q == pj.field_D) {
            var8 = new qd(ng.field_c, param6);
            var7 = var8;
            ng.field_c.a((byte) -109, (vg) (Object) var8);
            if (!wh.a(false)) {
              L0: {
                ol.field_j = param0;
                jj.field_d = null;
                bg.field_q = param4;
                if (!param1) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L0;
                }
              }
              rh.field_i = stackIn_17_0 != 0;
              ue.field_d = param5;
              rd.field_z = param2;
              fk.field_q = field_ub;
              return true;
            } else {
              var8.p(248);
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_pb = -128;
          if (fk.field_q == pj.field_D) {
            var8 = new qd(ng.field_c, param6);
            var7 = var8;
            ng.field_c.a((byte) -109, (vg) (Object) var8);
            if (!wh.a(false)) {
              L1: {
                ol.field_j = param0;
                jj.field_d = null;
                bg.field_q = param4;
                if (!param1) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              rh.field_i = stackIn_8_0 != 0;
              ue.field_d = param5;
              rd.field_z = param2;
              fk.field_q = field_ub;
              return true;
            } else {
              var8.p(248);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void h(int param0) {
        field_ob = null;
        int var1 = -51 / ((71 - param0) / 47);
        field_S = null;
        field_ub = null;
    }

    final static a d(byte param0) {
        String var1 = null;
        L0: {
          var1 = vd.f(-120);
          if (var1 == null) {
            break L0;
          } else {
            if ((var1.indexOf('@') ^ -1) > -1) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 > -11) {
          int discarded$2 = hg.a(-53, 13, (byte) 24);
          return new a(vd.f(-52), bh.b((byte) -94));
        } else {
          return new a(vd.f(-52), bh.b((byte) -94));
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            ml.field_h = param2;
            try {
                var3 = param0.getParameter("cookieprefix");
                var4 = param0.getParameter("cookiehost");
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (!((param2.length() ^ -1) != param1)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                pb.a(true, "document.cookie=\"" + var5 + "\"", param0);
            } catch (Throwable throwable) {
            }
            ti.a((byte) -101, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    hg() {
        super(0L, (hc) null);
    }

    final static void e(byte param0) {
        cd.a(bg.field_q, param0 + -170, (String) null);
        if (param0 != 47) {
            hg.h(105);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param2 != -82) {
          field_pb = -26;
          var3 = 0;
          L0: while (true) {
            if (param0 <= 0) {
              return var3;
            } else {
              var3 = param1 & 1 | var3 << -676123039;
              param0--;
              param1 = param1 >>> 1;
              continue L0;
            }
          }
        } else {
          var3 = 0;
          L1: while (true) {
            if (param0 <= 0) {
              return var3;
            } else {
              var3 = param1 & 1 | var3 << -676123039;
              param0--;
              param1 = param1 >>> 1;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = 0;
        field_ub = new qb();
        field_ob = new String[40];
    }
}
