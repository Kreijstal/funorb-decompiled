/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static long field_b;
    static ResourceArchive field_a;
    static fj field_c;

    final static void a(boolean param0, om param1) {
        om var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!param0) {
            field_b = 8L;
          }
          param1.unlink((byte) 111);
          var2 = (om) (rq.field_a.first(-76));
          while (var2 != null) {
            if (var2.a(param1, true)) {
              var2 = (om) (rq.field_a.next((byte) 116));
              continue;
            }
            break;
          }
          if (var2 == null) {
            rq.field_a.addLast(param1, (byte) 3);
            return;
          }
          BubbleDistortion.insertNodeBefore(param1, -90, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("ic.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          return;
        }
        field_c = null;
    }

    final static void disableKeyboardInput(byte obfuscationGuard) {
        Object var1 = null;
        Throwable var2 = null;
        om var3 = null;
        Throwable decompiledCaughtException = null;
        if (DualLinkDeque.keyboardInput != null) {
          var1 = DualLinkDeque.keyboardInput;
          synchronized (var1) {
            DualLinkDeque.keyboardInput = null;
          }
        }
        if (obfuscationGuard > -63) {
          var3 = (om) null;
          ic.a(true, (om) null);
        }
    }

    static {
    }
}
