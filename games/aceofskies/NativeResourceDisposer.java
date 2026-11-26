/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeResourceDisposer {
    private static IntrusiveDeque field_c;
    private static boolean field_b;
    private static int field_a;

    final synchronized static void drainQueue(byte param0) {
        while (true) {
          NativeResourceDisposalNode var1 = (NativeResourceDisposalNode) (field_c.removeFirst(125));
          if (var1 == null) {
            int var1_int = 47 % ((84 - param0) / 32);
            return;
          }
          var1.field_e.dispose(true);
          var1.unlink(-123);
        }
    }

    final synchronized static void disposeOrEnqueue(NativeResource param0, int param1) {
        int var2 = -29 % ((-59 - param1) / 51);
        if (field_b) {
          return;
        }
        if (0 < field_a) {
          NativeResourceDisposalNode var3 = new NativeResourceDisposalNode();
          var3.field_e = param0;
          field_c.addLast(79, var3);
        } else {
          param0.dispose(false);
        }
    }

    final synchronized static void retainRenderer(boolean param0) {
        if (param0) {
          return;
        }
        field_a = field_a + 1;
    }

    final synchronized static void releaseRenderer(boolean param0) {
        if (param0) {
          return;
        }
        field_a = field_a - 1;
        if (0 == field_a) {
          NativeResourceDisposer.drainQueue((byte) 119);
        }
    }

    static {
        field_b = false;
        field_a = 0;
        field_c = new IntrusiveDeque();
    }
}
