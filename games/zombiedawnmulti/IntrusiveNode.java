/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode next;
    IntrusiveNode previous;
    static int field_a;
    long key;
    static cj field_c;

    final void unlink(boolean clearLinks) {
        if (this.next == null) {
          return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        if (clearLinks) {
          this.next = null;
          this.previous = null;
          return;
        }
        IntrusiveNode.a(false, 40, -48, -58);
        this.next = null;
        this.previous = null;
    }

    final boolean b(int param0) {
        if (param0 != 4) {
          return true;
        }
        if (this.next != null) {
          return true;
        }
        return false;
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (!(param1 + param2 + param3 > SoftwareRasterizer.field_l)) {
          return param2 + param1;
        }
        if (-param3 + param1 >= 0) {
          return param1 - param3;
        }
        if (param0) {
          return SoftwareRasterizer.field_l - param3;
        }
        IntrusiveNode.a(false, -49, -96, 42);
        return SoftwareRasterizer.field_l - param3;
    }

    final static void a(boolean param0, int param1) {
        if (cr.a((byte) 27)) {
          param0 = false;
        }
        gg.a(124, param0);
        TextWidgetPainter.b((byte) 117);
        if (param1 != 2) {
          field_a = -119;
          return;
        }
    }

    final static void a(int param0, byte[] param1, int param2, int param3) {
        param1[param0 * 4] = (byte)(param3 >>> 24);
        if (param2 >= -71) {
          return;
        }
        try {
          param1[param0 * 4 + 1] = (byte)(param3 >>> 16);
          param1[4 * param0 + 2] = (byte)(param3 >>> 8);
          param1[3 + 4 * param0] = (byte)param3;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "br.OB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != 48) {
          return;
        }
        field_c = null;
    }

    static {
        field_a = 250;
    }
}
