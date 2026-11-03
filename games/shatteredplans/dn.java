/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends hb {
    static String field_k;
    static vd field_h;
    private DualLinkDeque field_i;
    static String field_g;
    static int field_l;
    static qr field_f;
    static String field_j;

    final static String a(String param0, boolean param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          if (!param1) {
            field_j = (String) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-var4 + var2_int - 1] = param0.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("dn.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, ByteArrayNode param1, byte param2) {
        CipherPacketBuffer var5 = null;
        int var4 = 0;
        try {
          if (param2 != 13) {
            field_f = (qr) null;
          }
          var5 = js.field_f;
          CipherPacketBuffer var3 = var5;
          var5.h(param0, 255);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, (byte) -60);
          if (param1.field_n != null) {
            var5.writeByte(param1.field_n.length, (byte) -66);
            var5.writeBytes(0, param1.field_n.length, param1.field_n, 22186);
          } else {
            var5.writeByte(0, (byte) -76);
          }
          var5.writeChecksum(var4, param2 ^ -40);
          var5.position = var5.position - 4;
          param1.field_j = var5.readInt(16711680);
          var5.patchLengthByte(var5.position - var4, (byte) 119);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "dn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static gq[] a(int param0) {
        if (param0 == 4) {
          return new gq[]{IntrusiveDequeCursor.field_g, nd.field_c, SliderWidget.field_O, ss.field_c, cl.field_p, GameApplet.field_c, CheckboxPainter.field_j, na.field_I, ld.field_h, ArchiveSource.field_b, StrongCacheEntry.field_A, WeightedCacheEntry.field_r, ks.field_a, ro.field_c};
        }
        return (gq[]) null;
    }

    public static void d(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 == -107) {
          field_j = null;
          field_g = null;
          field_h = null;
          return;
        }
        field_h = (vd) null;
        field_j = null;
        field_g = null;
        field_h = null;
    }

    final IntrusiveNode a(boolean param0) {
        if (param0) {
          this.a((byte) -124);
          return (IntrusiveNode) ((Object) this.field_i.nextForward(32));
        }
        return (IntrusiveNode) ((Object) this.field_i.nextForward(32));
    }

    final IntrusiveNode a(byte param0) {
        if (param0 < 99) {
          field_k = (String) null;
          return (IntrusiveNode) ((Object) this.field_i.startForward(-127));
        }
        return (IntrusiveNode) ((Object) this.field_i.startForward(-127));
    }

    final int b(byte param0) {
        if (param0 != -61) {
          return -111;
        }
        return this.field_i.size((byte) -73);
    }

    dn(DualLinkDeque param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "dn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Email is valid";
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
