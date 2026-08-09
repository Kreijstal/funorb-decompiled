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
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_a = (hr) null;
                break L1;
              }
            }
            param3--;
            L2: while (true) {
              if ((param3 ^ -1) > -1) {
                break L0;
              } else {
                var9 = param4;
                var5 = var9;
                var6 = param1;
                var7 = param2;
                var9[var6] = eb.a(8355711, var9[var6] >> -816598271) + var7;
                param1++;
                param3--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("wm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        ms var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int[] var4 = null;
        db var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = (db) ((Object) jj.field_a.b(72));
            L1: while (true) {
              if (var5 == null) {
                var2 = no.field_d.b(-87);
                L2: while (true) {
                  if (var2 == null) {
                    if (!param0) {
                      break L0;
                    } else {
                      var4 = (int[]) null;
                      wm.a(-1, 109, 92, -119, (int[]) null);
                      return;
                    }
                  } else {
                    jg.b(11044, param1);
                    var2 = no.field_d.d((byte) 18);
                    continue L2;
                  }
                }
              } else {
                mn.a(var5, -112, param1);
                var5 = (db) ((Object) jj.field_a.d((byte) 18));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "wm.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        if (param0) {
            return;
        }
        field_f = (boolean[]) null;
    }

    private wm() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new boolean[25];
    }
}
