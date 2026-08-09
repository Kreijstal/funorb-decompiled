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
        if (param0) {
            field_m = (String) null;
        }
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
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = Class.forName("jw");
                      if (param3 <= -83) {
                        break L2;
                      } else {
                        field_m = (String) null;
                        break L2;
                      }
                    }
                    var5 = (ce) (var4.newInstance());
                    var5.a(param2, param1, param0, 122);
                    stackIn_3_0 = (ce) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new li();
                  ((ce) ((Object) var5_ref)).a(param2, param1, param0, -108);
                  stackIn_5_0 = (li) (var5_ref);
                  return (ce) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("id.A(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    id(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_n = param2;
            this.field_q = param6;
            fieldTemp$0 = ld.field_D;
            ld.field_D = ld.field_D + 1;
            this.field_r = 65535 & fieldTemp$0;
            this.field_t = param1;
            this.field_p = param4;
            this.field_o = param3;
            this.field_k = param5;
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "id.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Return to game";
    }
}
