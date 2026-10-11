/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          var3_int = 117 % ((param0 + 35) / 33);
          if (10 > we.field_c) {
            var4 = 0;
            if (ve.field_f) {
              var4 = 1;
              ve.field_f = false;
            }
            vg.a(ul.k(0), var4 != 0, ib.a((byte) 109), m.field_k, false);
            return;
          }
          if (!hl.a((byte) 27)) {
            fn.d();
            jf.a(256, 320, 240);
            ll.a(0, 0, param1, -96);
            return;
          }
          if (rk.field_e != 0) {
            wb.a(param1, 0);
            return;
          }
          dl.a(param2, true, false);
          ll.a(0, 0, param1, -115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != 1) {
            stackIn_3_0 = 36;
            return stackIn_3_0;
          }
          var3_int = 0;
          while (param1 > 0) {
            var3_int = var3_int << 1 | 1 & param2;
            param2 = param2 >>> 1;
            param1--;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "wf.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
