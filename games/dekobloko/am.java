/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_d;
    static ke field_a;
    static String field_b;
    static boolean field_c;

    final static kc a(int param0, boolean param1, int param2, int param3, int param4) {
        vj stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        vj stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        Object var5;
        kc var5_ref;
        int var6;
        kc var7;
        kc var8;
        kc var5_refLifetime1;
        var5 = null;
        var6 = client.field_A ? 1 : 0;
        if (!param1) {
          var5_ref = (kc) (dg.field_e.c((byte) 49));
          while (var5_ref != null) {
            if (param3 == var5_ref.field_n) {
              return var5_ref;
            }
            stackIn_18_0 = dg.field_e;
            stackIn_19_1 = !(param1);
            var5_ref = (kc) (((vj) (Object) stackIn_18_0).d(stackIn_19_1));
          }
          var8 = new kc();
          var8.field_n = param3;
          var8.field_o = param4;
          var8.field_v = param2;
          dg.field_e.a(var8, 2777);
          wb.a(var8, param0, 60);
          return var8;
        }
        am.a(9, false, 66, -99, 40);
        var5_refLifetime1 = (kc) (dg.field_e.c((byte) 49));
        while (var5_refLifetime1 != null) {
          if (param3 == var5_refLifetime1.field_n) {
            return var5_refLifetime1;
          }
          stackIn_8_0 = dg.field_e;
          stackIn_9_1 = !(param1);
          var5_refLifetime1 = (kc) (((vj) (Object) stackIn_8_0).d(stackIn_9_1));
        }
        var7 = new kc();
        var7.field_n = param3;
        var7.field_o = param4;
        var7.field_v = param2;
        dg.field_e.a(var7, 2777);
        wb.a(var7, param0, 60);
        return var7;
    }

    final static int b(int param0) {
        if (param0 > 69) {
          return wl.field_o + (wh.field_d << 2) + (qk.field_i << 4);
        }
        am.b(-17);
        return wl.field_o + (wh.field_d << 2) + (qk.field_i << 4);
    }

    public static void a(int param0) {
        if (param0 < 77) {
          return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_b = "The following settings need to be changed:  ";
    }
}
