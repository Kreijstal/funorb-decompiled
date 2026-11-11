/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeReleaseQueue {
    private static boolean field_b;
    private static int field_c;
    private static IntrusiveDeque field_a;

    final synchronized static void releaseReference(int param0) {
        field_c = field_c - 1;
        if (~field_c == param0) {
          NativeReleaseQueue.flush(true);
        }
    }

    final synchronized static void acquire(boolean param0) {
        if (param0) {
          NativeReleaseQueue.releaseReference(76);
          field_c = field_c + 1;
          return;
        }
        field_c = field_c + 1;
    }

    final synchronized static void queueRelease(int param0, e param1) {
        NativeReleaseNode var2 = null;
        if (!field_b) {
          if (param0 <= ~field_c) {
            param1.w(false);
          } else {
            var2 = new NativeReleaseNode();
            var2.field_f = param1;
            field_a.addLast((byte) -118, var2);
          }
          return;
        }
    }

    final synchronized static void flush(boolean param0) {
        NativeReleaseNode var1;
        RuntimeException var1_ref;
        while (true) {
          var1 = (NativeReleaseNode) (field_a.removeFirst(-113));
          if (var1 != null) {
            var1.field_f.w(true);
            var1.unlink(120);
            continue;
          }
          break;
        }
        if (param0) {
          return;
        }
        NativeReleaseQueue.releaseReference(-115);
        return;
    }

    static {
        field_c = 0;
        field_b = false;
        field_a = new IntrusiveDeque();
    }
}
