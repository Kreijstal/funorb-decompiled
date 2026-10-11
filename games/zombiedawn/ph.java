/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_b;
    static ka field_a;

    final static void b(int param0) {
        eo.field_f = null;
        if (param0 != 26311) {
          ph.b(64);
        }
        on.field_i = null;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1) {
          jc var2 = (jc) null;
          ph.a((rc) null, (byte) -75, 36, (jc) null);
        }
    }

    final static void a(byte param0, wj param1) {
        try {
          tp.a(75, true, param1);
          if (param0 < 40) {
            jc var3 = (jc) null;
            ph.a((rc) null, (byte) -23, 122, (jc) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ph.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, dj param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        dj var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param3.a((byte) 51, param0, param2);
          var4 = var6;
          if (var6 == null) {
            return false;
          }
          rn.a(var6, 0);
          if (param1 == 31043) {
            return true;
          }
          var5 = (dj) null;
          ph.a(-94, 1, -17, (dj) null);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ph.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int a(rc param0, byte param1, int param2, jc param3) {
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          if (param3 != null &&
            param3.field_k != null &&
            param0 != null &&
            param0.field_o == param3.field_s) {
            var4_int = param0.field_k.length;
            var5 = param3.field_k[param2].length / var4_int;
            var6 = 0;
            if (param1 >= -69) {
              ph.a(-98);
            }
            while (var6 < var5) {
              boolean decompiledFrameCompleted0 = true;
              if (param3.field_i[param2][var6] == param0.field_s &&
                l.a(117, param3.field_m[param2][var6])) {
                for (var7 = 0; var4_int > var7; var7++) {
                  if (param3.field_k[param2][var6 * var4_int + var7] != param0.field_k[var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_19_0 = var6;
                  return stackIn_19_0;
                }
              }
              var6++;
            }
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("ph.D(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_b = null;
    }
}
