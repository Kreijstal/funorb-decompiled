/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends fc {
    int field_i;
    int field_j;
    static String field_m;
    int field_k;
    int field_o;
    static int[] field_p;
    int field_l;
    int field_n;

    final static boolean a(byte param0) {
        if (param0 != 41) {
            field_p = null;
        }
        return oe.field_b == rk.field_X ? true : false;
    }

    public static void d(int param0) {
        if (param0 != 29211) {
            return;
        }
        field_m = null;
        field_p = null;
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        bf var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          if ((param0 ^ -1) >= -1) {
            var4 = param1;
            break L0;
          } else {
            var8 = new byte[param2];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param2) {
                break L0;
              } else {
                var8[var5_int] = param1[var5_int + param0];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param3 == -6196) {
            break L2;
          } else {
            field_m = null;
            break L2;
          }
        }
        var5 = new bf();
        var5.a(param3 + 6185);
        var5.a(var4, (long)(param2 * 8), 30654);
        var10 = new byte[64];
        var9 = var10;
        var6 = var9;
        var5.a(var10, 0, -513);
        return var6;
    }

    cf(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((cf) this).field_n = param3;
        ((cf) this).field_j = param0;
        ((cf) this).field_o = param5;
        ((cf) this).field_l = param4;
        ((cf) this).field_k = param1;
        ((cf) this).field_i = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Error connecting to server. Please try using a different server.";
    }
}
