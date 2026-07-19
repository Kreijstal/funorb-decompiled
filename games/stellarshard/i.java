/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class i {
    static th field_d;
    static oj field_c;
    static int field_a;
    static int[] field_e;
    static int field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        try {
            if (!(11 != eg.field_d)) {
                tc.d(1);
            }
            if (param1 >= -96) {
                field_a = 100;
            }
            nb.a(b.field_v, fg.field_K, am.field_i, (byte) -120);
            pd.a(param0, 0, 0, (byte) -79);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "i.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void a(byte[] param0, byte param1);

    final static wb a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        wb var5 = null;
        int var6 = 0;
        wb stackIn_4_0 = null;
        wb stackIn_7_0 = null;
        wb stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_10_0 = null;
        wb stackOut_6_0 = null;
        wb stackOut_3_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 == param1.length()) {
                  break L1;
                } else {
                  var2_int = param1.indexOf('@');
                  if (-1 != var2_int) {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(var2_int + 1);
                    var6 = 35 % ((param0 - 58) / 48);
                    var5 = ok.a(var3, 1);
                    if (var5 != null) {
                      stackOut_10_0 = (wb) (var5);
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return sd.a((byte) -96, var4);
                    }
                  } else {
                    stackOut_6_0 = uj.field_d;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackOut_3_0 = rk.field_c;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("i.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    abstract byte[] a(int param0);

    public static void b(int param0) {
        wb discarded$0 = null;
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != 64) {
            String var2 = (String) null;
            discarded$0 = i.a(76, (String) null);
        }
    }

    static {
        field_d = new th();
        field_e = new int[256];
        field_c = new oj();
    }
}
