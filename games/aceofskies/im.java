/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im extends za {
    static int field_f;
    jaclib.memory.heap.NativeHeap field_g;
    static boolean field_e;

    final void a(int param0) {
        if (param0 >= -116) {
          return;
        }
        this.field_g.a();
    }

    final static byte[] a(int param0, String param1) {
        String stackIn_7_2 = null;
        try {
          if (param0 < 33) {
            field_e = false;
          }
          byte[] stackIn_3_0 = q.field_q.a("", (byte) -71, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("im.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    im(int param0) {
        this.field_g = new jaclib.memory.heap.NativeHeap(param0);
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          im.a(false);
          if (bl.field_c < 20) {
            return true;
          }
          if (!jr.a((byte) 32)) {
            return true;
          }
          if (un.field_c <= 0) {
            return false;
          }
          if (!ur.b(-111)) {
            return true;
          }
          return false;
        }
        if (bl.field_c < 20) {
          return true;
        }
        if (!jr.a((byte) 32)) {
          return true;
        }
        if (un.field_c <= 0) {
          return false;
        }
        if (!ur.b(-111)) {
          return true;
        }
        return false;
    }

    static {
        field_f = 9;
    }
}
