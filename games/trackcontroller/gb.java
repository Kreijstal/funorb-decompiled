/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gb extends fc {
    static aa field_n;
    gb field_j;
    gb field_k;
    long field_m;
    static int field_i;
    static qj[] field_l;

    final static void a(int param0, int param1) {
        fc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ei var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (ei) (Object) fj.field_H.b(2);
            L1: while (true) {
              if (var4 == null) {
                var2 = ne.field_b.b(2);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$8 = 0;
                    int discarded$9 = 6;
                    cj.a();
                    var2 = ne.field_b.a(10);
                    continue L2;
                  }
                }
              } else {
                kc.a(6, (byte) 75, var4);
                var4 = (ei) (Object) fj.field_H.a(10);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2_ref, "gb.OA(" + 4 + 44 + 6 + 41);
        }
    }

    public static void d(int param0) {
        field_l = null;
        field_n = null;
        if (param0 > -111) {
            gb.d(-127);
        }
    }

    protected gb() {
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = si.field_b.a("", -1, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gb.NA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -523 + 41);
        }
        return stackIn_1_0;
    }

    final void e(int param0) {
        if (((gb) this).field_j == null) {
          return;
        } else {
          if (param0 != 0) {
            ((gb) this).e(11);
            ((gb) this).field_j.field_k = ((gb) this).field_k;
            ((gb) this).field_k.field_j = ((gb) this).field_j;
            ((gb) this).field_k = null;
            ((gb) this).field_j = null;
            return;
          } else {
            ((gb) this).field_j.field_k = ((gb) this).field_k;
            ((gb) this).field_k.field_j = ((gb) this).field_j;
            ((gb) this).field_k = null;
            ((gb) this).field_j = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new aa(9, 0, 4, 1);
        field_i = 0;
    }
}
