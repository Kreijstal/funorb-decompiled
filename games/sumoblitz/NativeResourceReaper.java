/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeResourceReaper {
    private static IntrusiveDeque field_b;
    private static int field_a;
    private static boolean field_c;

    final synchronized static void a(int param0) {
        IntrusiveDeque stackIn_4_0 = null;
        DeferredNativeResource var1;
        if (param0 >= -119) {
          return;
        }
        stackIn_4_0 = (IntrusiveDeque) (field_b);
        while (true) {
          var1 = (DeferredNativeResource) (((IntrusiveDeque) (Object) stackIn_4_0).removeFirst(9));
          if (var1 == null) {
            return;
          }
          var1.resource.disposeNativeResource(true);
          var1.unlink(false);
          stackIn_4_0 = (IntrusiveDeque) (field_b);
        }
    }

    final synchronized static void b(byte param0) {
        field_a = field_a + 1;
        if (param0 < -113) {
          return;
        }
        field_b = (IntrusiveDeque) null;
    }

    final synchronized static void a(NativeResource param0, byte param1) {
        DeferredNativeResource var2 = null;
        DeferredNativeResource var2Lifetime1;
        if (field_c) {
          return;
        }
        if (param1 == -37) {
          if (field_a <= 0) {
            param0.disposeNativeResource(false);
          } else {
            var2 = new DeferredNativeResource();
            var2.resource = param0;
            field_b.addLast((IntrusiveNode) (var2), (byte) 39);
          }
          return;
        }
        NativeResourceReaper.a(-21);
        if (field_a <= 0) {
          param0.disposeNativeResource(false);
        } else {
          var2Lifetime1 = new DeferredNativeResource();
          var2Lifetime1.resource = param0;
          field_b.addLast((IntrusiveNode) (var2Lifetime1), (byte) 39);
        }
    }

    final synchronized static void a(byte param0) {
        field_a = field_a - 1;
        if (0 == field_a) {
          NativeResourceReaper.a(-121);
          if (param0 > -93) {
            field_c = false;
            return;
          }
          return;
        }
        if (param0 > -93) {
          field_c = false;
          return;
        }
    }

    static {
        field_a = 0;
        field_c = false;
        field_b = new IntrusiveDeque();
    }
}
