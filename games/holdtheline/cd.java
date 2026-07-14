/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cd {
    static uf field_d;
    static String field_c;
    static int field_b;
    static int[] field_f;
    static hj[] field_a;
    static byte[][] field_e;

    final static String a(int param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kn.field_f.setTime(new Date(param1));
        var3 = kn.field_f.get(7);
        var4 = kn.field_f.get(5);
        var5 = kn.field_f.get(2);
        var6 = kn.field_f.get(1);
        if (param0 <= 43) {
          return null;
        } else {
          var7 = kn.field_f.get(11);
          var8 = kn.field_f.get(12);
          var9 = kn.field_f.get(13);
          return tm.field_b[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + eb.field_n[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        hk.field_c = new int[4][];
        d.field_c = new int[4];
        on.field_v = new int[4][];
        ha.field_j = new int[4][];
        for (var1 = 0; -5 < (var1 ^ -1); var1++) {
            var2 = pc.field_l[var1];
            hk.field_c[var1] = new int[var2];
            on.field_v[var1] = new int[var2];
            ha.field_j[var1] = new int[var2];
            for (var3 = 0; var2 > var3; var3++) {
                hk.field_c[var1][var3] = -1;
                on.field_v[var1][var3] = -1;
                ha.field_j[var1][var3] = 3;
            }
            d.field_c[var1] = -1;
        }
        ao.field_b = 0;
        on.field_s = true;
        ad.field_a = false;
        nd.field_e = true;
        if (param0 < 100) {
            field_a = null;
        } else {
            hk.field_d = 0;
            ij.field_l = true;
            return;
        }
        hk.field_d = 0;
        ij.field_l = true;
    }

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_c = null;
        field_a = null;
        if (param0 != 1) {
          String discarded$2 = cd.a(93, -81L);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + vn.a("\n", "%0a", param0 + -75, param1));
        if (param0 != 12) {
            cd.b(-37);
        }
    }

    final static void a(hj param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -param7 + param2 + param8 + param0.field_u;
        var10 = param4 + (param0.field_u + (param8 + param2));
        var11 = param3 + param0.field_x + (param0.field_y >> -1214942943);
        tc.e(var9, 0, var10, var11 - -param5);
        param0.b(-1 + param8, -1 + param3, param6);
        param0.b(param8 - 1, 1 + param3, param6);
        tc.a(bd.field_R);
        tc.e(var9 + 1, 0, var10 - -1, param5 + var11);
        param0.b(param8 - -1, param3 + -1, param6);
        param0.b(1 + param8, param3 - -1, param6);
        tc.a(bd.field_R);
        var9 = param8 + (param0.field_u + param0.field_s) - (param2 + param4);
        var10 = -param2 + param8 + (param0.field_u + param0.field_s) - param7;
        tc.e(var9, var11 + -param5, var10, 480);
        if (param1 <= 111) {
          return;
        } else {
          param0.b(-1 + param8, param3 + -1, param6);
          param0.b(param8 + -1, 1 + param3, param6);
          tc.a(bd.field_R);
          tc.e(1 + var9, var11 + -param5, 1 + var10, 480);
          param0.b(param8 + 1, -1 + param3, param6);
          param0.b(1 + param8, param3 + 1, param6);
          tc.a(bd.field_R);
          return;
        }
    }

    final static float a(wc[] param0, int param1, float param2) {
        if (param1 != 1) {
            return -0.11478078365325928f;
        }
        return tf.a((byte) 117, param2, param0) / ce.a(-1, param0);
    }

    final static sh a(byte param0, String param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        sh var8 = null;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        var2 = param1.length();
        if (var2 == 0) {
          return fo.field_k;
        } else {
          if (-256 <= var2) {
            var3 = fl.a(param1, (byte) -126, '.');
            if (-3 > var3.length) {
              return fo.field_k;
            } else {
              var5 = -111 / ((param0 - -56) / 44);
              var4 = var3;
              var6 = 0;
              L0: while (true) {
                if (var4.length > var6) {
                  var7 = var4[var6];
                  var8 = pk.a((byte) -102, var7);
                  if (var8 != null) {
                    return var8;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  return qg.a(var3[-1 + var3.length], 124);
                }
              }
            }
          } else {
            return wb.field_h;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Click to add or remove AI racers";
        field_e = new byte[250][];
    }
}
