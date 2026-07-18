/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends vh {
    private vh field_Qb;
    static ko field_Lb;
    private vh field_Pb;
    static int[] field_Nb;
    static String[] field_Mb;
    static String field_Rb;
    static byte[][] field_Sb;
    static String field_Ob;

    public static void f(int param0) {
        if (param0 != -1) {
            wg.f(82);
            field_Nb = null;
            field_Mb = null;
            field_Ob = null;
            field_Rb = null;
            field_Sb = null;
            field_Lb = null;
            return;
        }
        field_Nb = null;
        field_Mb = null;
        field_Ob = null;
        field_Rb = null;
        field_Sb = null;
        field_Lb = null;
    }

    private wg(long param0, vh param1, vh param2, String param3) {
        super(param0, (vh) null);
        try {
            ((wg) this).field_Pb = new vh(0L, param1);
            ((wg) this).field_Qb = new vh(0L, param2);
            ((wg) this).field_Qb.field_nb = param3;
            ((wg) this).a(-93, ((wg) this).field_Pb);
            ((wg) this).a(-127, ((wg) this).field_Qb);
            ((wg) this).d((byte) -127);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1) {
        ((wg) this).field_Pb.b(0, 2147483647, 0, ((wg) this).field_Pb.b(true), ((wg) this).field_Db);
        int var3 = ((wg) this).field_Pb.field_gb - -param1;
        ((wg) this).field_Qb.b(0, 2147483647, var3, -var3 + ((wg) this).field_gb, ((wg) this).field_Db);
    }

    wg(long param0, dd param1, dd param2, int param3, vh param4, String param5) {
        this(param0, (vh) null, param4, param5);
        try {
            ((wg) this).field_Pb.field_yb = param1;
            ((wg) this).field_Pb.field_hb = param2;
            ((wg) this).field_Pb.field_cb = param3;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param1 = o.a('_', "", param1, 1);
                var3 = qa.a(param1, 0);
                if (-1 != param2.indexOf(param1)) {
                  break L2;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("wg.A(").append(23138).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        ((wg) this).b(param0, 2147483647, param1, param4, param2);
        this.a((byte) 96, param5);
        if (param3) {
            wg.f(-5);
        }
    }

    wg(long param0, wg param1, String param2) {
        this(param0, param1.field_Pb, param1.field_Qb, param2);
    }

    final int b(int param0, int param1) {
        if (param1 != 2154) {
          int discarded$2 = ((wg) this).b(-72, 60);
          return ((wg) this).field_Pb.b(true) - (-param0 - ((wg) this).field_Qb.b(true));
        } else {
          return ((wg) this).field_Pb.b(true) - (-param0 - ((wg) this).field_Qb.b(true));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = new ko();
        field_Ob = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_Rb = "Add friend";
    }
}
