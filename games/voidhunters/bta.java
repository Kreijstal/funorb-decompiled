/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bta extends rqa {
    static dka field_r;
    static int field_q;
    static String field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_q = -88;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(38, 82));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bta.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    bta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1) {
        ksa var2 = null;
        int var3 = 0;
        ea var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            var4 = (ea) ((Object) oaa.field_k.d(0));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == 50) {
                    break L2;
                  } else {
                    field_p = -54;
                    break L2;
                  }
                }
                var2 = klb.field_q.d(0);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    uaa.b(-105, param1);
                    var2 = klb.field_q.a((byte) 9);
                    continue L3;
                  }
                }
              } else {
                hs.a(var4, 1, param1);
                var4 = (ea) ((Object) oaa.field_k.a((byte) 28));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2_ref), "bta.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void e(byte param0) {
        field_r = null;
        if (param0 > -31) {
            return;
        }
        field_o = null;
    }

    static {
        field_q = 1;
        field_r = new dka(3);
        field_o = "Attempt to build blueprint";
        field_p = 50;
    }
}
