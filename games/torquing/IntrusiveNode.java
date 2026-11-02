/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode next;
    static String field_i;
    long key;
    static ce field_c;
    static int field_g;
    IntrusiveNode previous;
    static int field_d;
    static int[] field_b;
    static cd field_a;

    final static void a(int param0, int param1, int param2, PacketBuffer param3, int param4) {
        try {
          param3.b(90, 12);
          param3.a(17, 124);
          param3.a(param2, 120);
          param3.a(param4, 71);
          param3.b(90, param0);
          if (param1 <= 94) {
            PacketBuffer var6 = (PacketBuffer) null;
            IntrusiveNode.a(-127, 58, -29, (PacketBuffer) null, -68);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "q.GB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void f(int param0) {
        if (null == this.next) {
          return;
        }
        if (param0 == 0) {
          this.next.previous = this.previous;
          this.previous.next = this.next;
          this.next = null;
          this.previous = null;
          return;
        }
        this.previous = (IntrusiveNode) null;
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.next = null;
        this.previous = null;
    }

    final boolean e(int param0) {
        if (this.next == null) {
          return false;
        }
        if (param0 != 17) {
          return true;
        }
        return true;
    }

    public static void b(byte param0) {
        field_b = null;
        field_i = null;
        field_c = null;
        field_a = null;
        if (param0 != 92) {
          PacketBuffer var2 = (PacketBuffer) null;
          IntrusiveNode.a(81, 94, -8, (PacketBuffer) null, -107);
        }
    }

    static {
        field_i = "<col=2>No animals were harmed in the making of this game.</col>";
        field_g = 0;
        field_d = 0;
        field_c = new ce();
        field_a = new cd();
    }
}
