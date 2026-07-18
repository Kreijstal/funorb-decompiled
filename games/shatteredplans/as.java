/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends oh {
    int field_p;
    int[] field_u;
    static String[] field_y;
    int field_w;
    int field_x;
    static ro field_t;
    int field_n;
    int field_j;
    static String field_i;
    ln field_s;
    int field_z;
    int[] field_o;
    int field_r;
    int field_v;
    int[] field_l;
    fs field_m;
    ln field_q;
    int field_k;
    static String field_h;

    final static vd a(pf param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        vd var5 = null;
        int var6 = 0;
        int var7 = 0;
        vd var8 = null;
        vd stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vd stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != null) {
            var8 = (vd) (Object) param0.d(0);
            var6 = -44 / ((47 - param2) / 57);
            L0: while (true) {
              if (var8 != null) {
                L1: {
                  var5 = var8.b((byte) 105, param1, param3);
                  if (var5 == null) {
                    break L1;
                  } else {
                    if (!var5.field_s) {
                      break L1;
                    } else {
                      stackOut_9_0 = (vd) var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  }
                }
                var8 = (vd) (Object) param0.a((byte) -71);
                continue L0;
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("as.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, v param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          nr.field_h = param3;
          dn.field_l = param0;
          qi.field_j = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("as.B(").append(param0).append(',').append(20).append(',').append(param2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    public static void a(int param0) {
        field_t = null;
        if (param0 != 20) {
          field_h = null;
          field_h = null;
          field_y = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_y = null;
          field_i = null;
          return;
        }
    }

    as(mg param0) {
        try {
            ((as) this).field_m = param0.field_G;
            ((as) this).field_x = param0.field_z;
            ((as) this).field_s = param0.field_y;
            ((as) this).field_q = param0.field_B;
            ((as) this).field_n = ((as) this).field_s.field_S;
            ((as) this).field_k = ((as) this).field_q.field_S;
            ((as) this).field_r = ((as) this).field_s.field_A;
            ((as) this).field_l = new int[20];
            ((as) this).field_w = ((as) this).field_s.field_z;
            ((as) this).field_o = new int[20];
            ((as) this).field_u = new int[20];
            ((as) this).field_p = ((as) this).field_q.field_z;
            ((as) this).field_j = ((as) this).field_q.field_A;
            ((as) this).field_v = (int)Math.sqrt((double)((-((as) this).field_r + ((as) this).field_j) * (((as) this).field_j + -((as) this).field_r) - -((((as) this).field_k + -((as) this).field_n) * (-((as) this).field_n + ((as) this).field_k)))) / 2;
            ((as) this).field_z = -1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "as.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_i = "Names can only contain letters, numbers, spaces and underscores";
        field_h = "You must play <%1> more rated games before playing with the current options.";
        field_t = new ro();
    }
}
