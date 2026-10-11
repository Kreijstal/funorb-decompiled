/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static int field_a;

    final static void a(int param0) {
        lb.field_O = le.a(-1461);
        if (param0 >= -54) {
          return;
        }
        gl.field_E = new vl();
        nk.a(true, 41, true);
    }

    final static int a(oh param0, String param1, int param2, boolean param3) {
        int var7 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          var4_int = 0;
          if (param3) {
            jh.a(91);
          }
          var5 = 0;
          var6 = param1.length();
          for (var7 = 0; var7 < var6; var7++) {
            var8 = param1.charAt(var7);
            var5 = var5 + param0.a((char) var8);
            if (param2 <= var5) {
              if (var8 == 32) {
                var5 = var5 - param0.a((char) var8);
              }
              if (var8 == 32 ||
                var8 == 45) {
                if (var4_int < var5) {
                  var4_int = var5;
                }
                var5 = 0;
              }
            }
          }
          if (var4_int < var5) {
            var4_int = var5;
          }
          stackIn_23_0 = var4_int;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("jh.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
