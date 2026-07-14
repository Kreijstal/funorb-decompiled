/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static int field_b;
    static String field_c;
    static int[] field_a;

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        hn.field_n = true;
        if (param1 != -1230) {
          field_a = null;
          ol.field_N = null;
          var3 = dh.field_b;
          rc.field_a = new ak(param2, var3);
          var4 = rc.field_a.h(param1 ^ -1209);
          di.field_d = new wc(var4);
          di.field_d.a(100, param0, rc.field_a.c(dh.field_d, -1, bj.field_y), id.a(0));
          return;
        } else {
          ol.field_N = null;
          var3 = dh.field_b;
          rc.field_a = new ak(param2, var3);
          var4 = rc.field_a.h(param1 ^ -1209);
          di.field_d = new wc(var4);
          di.field_d.a(100, param0, rc.field_a.c(dh.field_d, -1, bj.field_y), id.a(0));
          return;
        }
    }

    final static int a(String param0, int param1, String param2, String param3, boolean param4, int param5, int param6) {
        sn var7 = null;
        sn var8 = null;
        if (param6 != 0) {
          field_c = null;
          var7 = new sn(param0);
          var8 = new sn(param2);
          return od.a((byte) -32, param4, param3, var8, var7, param1, param5);
        } else {
          var7 = new sn(param0);
          var8 = new sn(param2);
          return od.a((byte) -32, param4, param3, var8, var7, param1, param5);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != 65) {
            field_b = -91;
        }
    }

    final static ed[] a(mf param0, byte param1, String param2, String param3) {
        int var6 = 21 / ((param1 - 62) / 60);
        int var4 = param0.b(-1, param2);
        int var5 = param0.a(var4, param3, true);
        return cc.a(var4, param0, var5, (byte) 75);
    }

    final static String a(int param0, char param1, byte param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = EscapeVector.field_A;
        var6 = new char[param0];
        var3 = var6;
        if (param2 < 4) {
          kh.a((byte) -54);
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (param0 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = (255 & rl.field_k.field_k[param2]) + param1;
        rl.field_k.field_k[param2] = (byte)lb.a(var3, var3 << -1923269097 >> -1794459329);
        int var4 = -46 % ((-11 - param0) / 34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = new int[12];
    }
}
