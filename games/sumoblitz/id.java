/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends ms {
    int field_k;
    int[] field_q;
    int field_n;
    long field_s;
    int field_p;
    int field_o;
    int field_l;
    static String field_m;
    int field_t;
    int field_r;

    public static void c(boolean param0) {
        field_m = null;
    }

    final static ce a(int param0, int param1, java.awt.Canvas param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            ce var5 = null;
            li var5_ref = null;
            ce stackIn_3_0 = null;
            li stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            ce stackOut_2_0 = null;
            li stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var4 = Class.forName("jw");
                  if (param3 <= -83) {
                    break L0;
                  } else {
                    field_m = null;
                    break L0;
                  }
                }
                var5 = (ce) var4.newInstance();
                var5.a(param2, param1, param0, 122);
                stackOut_2_0 = (ce) var5;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new li();
                ((ce) (Object) var5_ref).a(param2, param1, param0, -108);
                stackOut_4_0 = (li) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (ce) (Object) stackIn_5_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("id.A(").append(param0).append(44).append(param1).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param2 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    id(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((id) this).field_n = param2;
            ((id) this).field_q = param6;
            int fieldTemp$0 = ld.field_D;
            ld.field_D = ld.field_D + 1;
            ((id) this).field_r = 65535 & fieldTemp$0;
            ((id) this).field_t = param1;
            ((id) this).field_p = param4;
            ((id) this).field_o = param3;
            ((id) this).field_k = param5;
            ((id) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "id.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Return to game";
    }
}
