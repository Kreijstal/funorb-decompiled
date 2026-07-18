/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends wk {
    private boolean field_U;
    private String field_P;
    static String field_O;
    static int field_S;
    static int field_R;
    private ll field_N;
    static String field_T;
    private boolean field_Q;
    static int field_V;
    private String field_W;

    final void b(int param0, int param1, int param2) {
        super.b(param0, -57, param2);
        if (param1 >= -6) {
          return;
        } else {
          L0: {
            ne.field_v.a(((db) this).field_W, param2 + (((db) this).field_k >> 1), 103 + param0, 16777215, -1);
            if (null != ((db) this).field_P) {
              na.a(20 + param2, -7 + param0 - -120, 260, 8421504);
              int discarded$1 = ne.field_v.a(((db) this).field_P, 20 + param2, param0 + 128, 260, 100, 16777215, -1, 1, 0, ne.field_v.field_s);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void m(int param0) {
        ((db) this).field_N.field_C = false;
        if (param0 != 65536) {
            field_O = null;
            ((db) this).field_Q = true;
            return;
        }
        ((db) this).field_Q = true;
    }

    final void a(boolean param0, float param1, String param2, int param3) {
        try {
            if (param0 != ((db) this).field_U) {
                ((db) this).field_U = param0 ? true : false;
                if (((db) this).field_U) {
                    ((db) this).field_N.a(4210752, (byte) 126, 8405024);
                    ((db) this).field_N.field_C = true;
                } else {
                    ((db) this).field_N.a(4210752, (byte) 126, 2113632);
                    if (((db) this).field_Q) {
                        ((db) this).field_N.field_C = false;
                    }
                }
            }
            ((db) this).field_W = param2;
            ((db) this).field_N.field_F = (int)(param1 / 100.0f * (float)param3);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "db.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    db(pf param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((db) this).field_P = param1;
            if (null != ((db) this).field_P) {
                var3_int = ne.field_v.b(((db) this).field_P, 260, ne.field_v.field_s);
                ((db) this).c(-463076575, 300, var3_int + 150);
            }
            ((db) this).field_N = new ll(13, 50, 274, 30, 15, 2113632, 4210752);
            ((db) this).field_N.field_C = true;
            ((db) this).field_U = false;
            ((db) this).field_Q = false;
            ((db) this).b((lk) (Object) ((db) this).field_N, true);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(CharSequence param0) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
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
            int discarded$2 = 0;
            stackOut_0_0 = vd.a((byte) 88, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("db.B(");
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
          throw ii.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 8351 + ')');
        }
        return stackIn_1_0;
    }

    public static void n() {
        field_T = null;
        field_O = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Unable to connect to the data server. Please check any firewall you are using.";
        field_S = 56;
        field_T = "Discard";
        field_R = 0;
    }
}
