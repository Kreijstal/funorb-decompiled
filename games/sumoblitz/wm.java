/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    boolean field_s;
    boolean field_l;
    int field_p;
    byte field_k;
    byte field_g;
    boolean field_o;
    byte field_c;
    short field_e;
    byte field_u;
    boolean field_n;
    int field_h;
    boolean field_i;
    boolean field_b;
    byte field_j;
    static boolean[] field_f;
    byte field_t;
    boolean field_m;
    byte field_d;
    boolean field_r;
    static hr field_a;
    int field_q;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            param3--;
            L1: while (true) {
              if (param3 < 0) {
                break L0;
              } else {
                var9 = param4;
                var5_array = var9;
                var6 = param1;
                var7 = param2;
                var9[var6] = eb.a(8355711, var9[var6] >> 1) + var7;
                param1++;
                param3--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("wm.C(").append(-1).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void a() {
        ms var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object var4 = null;
        db var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = (db) (Object) jj.field_a.b(72);
          L0: while (true) {
            if (var5 == null) {
              var2 = no.field_d.b(-87);
              L1: while (true) {
                if (var2 == null) {
                  var4 = null;
                  wm.a(-1, 109, 92, -119, (int[]) null);
                  return;
                } else {
                  jg.b(11044, 6);
                  var2 = no.field_d.d((byte) 18);
                  continue L1;
                }
              }
            } else {
              mn.a(var5, -112, 6);
              var5 = (db) (Object) jj.field_a.d((byte) 18);
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2_ref, "wm.A(" + false + ',' + 6 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_f = null;
    }

    private wm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[25];
    }
}
