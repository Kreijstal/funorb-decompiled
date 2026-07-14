/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qc {
    static byte[][] field_b;
    static int field_c;
    static jj field_a;
    static java.util.zip.CRC32 field_d;
    static ci[] field_f;
    static String field_e;

    final static boolean a(byte param0) {
        if (param0 > -125) {
            return true;
        }
        return a.field_b == null ? uk.field_c : true;
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Terraphoenix.field_V;
        if (param7 != 16711680) {
          return;
        } else {
          var11 = -param6;
          L0: while (true) {
            if (0 <= var11) {
              return;
            } else {
              var12 = -param9;
              L1: while (true) {
                if (0 <= var12) {
                  param10 = param10 + param1;
                  param3 = param3 + param5;
                  var11++;
                  continue L0;
                } else {
                  param3++;
                  param8 = param2[param3];
                  if (-1 == (param8 ^ -1)) {
                    param10++;
                    var12++;
                    var12++;
                    continue L1;
                  } else {
                    var13 = param4 * (16711935 & param8) & -16711936;
                    var14 = 16711680 & (65280 & param8) * param4;
                    param10++;
                    param0[param10] = ei.b(ei.b(var13, var14) >>> 1233298696, 1);
                    var12++;
                    var12++;
                    var12++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        if (am.a(param1, true)) {
            return false;
        }
        if (!(!ef.a((byte) -77, param1))) {
            return false;
        }
        if (f.a(param1, -113)) {
            return false;
        }
        if (param2.length() == 0) {
            return true;
        }
        if (param0 != 80) {
            Object var4 = null;
            String discarded$6 = qc.a((String) null, (fa) null, (String) null, (byte) -43);
            if (!(!ak.a(param1, param2, false))) {
                return false;
            }
            if (!(!a.a(param1, param0 + -136, param2))) {
                return false;
            }
            if (oh.a((byte) -88, param2, param1)) {
                return false;
            }
            return true;
        }
        if (!(!ak.a(param1, param2, false))) {
            return false;
        }
        if (!(!a.a(param1, param0 + -136, param2))) {
            return false;
        }
        return !oh.a((byte) -88, param2, param1) ? true : false;
    }

    public static void b(int param0) {
        Object var2 = null;
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0 != 16711680) {
          var2 = null;
          qc.a(-108, (eg) null, (byte) -24);
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, eg param1, byte param2) {
        uc var6 = di.field_l;
        var6.k(-17410, param0);
        var6.field_k = var6.field_k + 1;
        int var4 = var6.field_k;
        var6.i(1, -125);
        var6.i(param1.field_o, -18);
        var6.i(param1.field_l, -99);
        var6.e(param1.field_q, 8959);
        var6.e(param1.field_m, 8959);
        var6.e(param1.field_i, 8959);
        var6.e(param1.field_j, 8959);
        int var5 = 5 / ((param2 - 34) / 34);
        int discarded$0 = var6.d(var4, 8600);
        var6.j(var6.field_k - var4, -119);
    }

    final static vc a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return (vc) (Object) new jd();
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        sj.a(param1, (byte) 68, param0, (String) null);
        if (param2 <= 104) {
            qc.a(false, true, 19);
        }
    }

    final static String a(String param0, fa param1, String param2, byte param3) {
        if (!param1.a(0)) {
          return param2;
        } else {
          if (param3 <= 76) {
            return null;
          } else {
            return param0 + " - " + param1.a((byte) 127) + "%";
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = new jj();
        field_d = new java.util.zip.CRC32();
        field_e = "Continue saved game";
    }
}
