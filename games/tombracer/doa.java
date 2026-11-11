/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class doa {
    private LegacyVertexArray field_a;

    final static jua a(String param0, int param1, byte param2) {
        jua var3 = null;
        RuntimeException var3_ref = null;
        jua stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new jua(false);
          var3.field_b = param0;
          var3.field_f = param1;
          if (param2 != 114) {
            doa.multiplyFixedCoarse(-6, 122, 25);
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("doa.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int multiplyFixedCoarse(int param0, int param1, int param2) {
        if (param0 != 2) {
          return -126;
        }
        return ChatMessage.multiplyFixed(param2, (byte) 24, param1 >> 8) << 8;
    }

    final static RoomDefinition findCourseRoom(int param0, int param1, int param2) {
        int var4 = 0;
        RoomDefinition[] var3;
        RoomDefinition var5;
        int var6;
        RoomDefinition[] var7;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = cm.field_a[param2].field_c;
        var3 = var7;
        for (var4 = param1; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5.field_f == param0) {
            return var5;
          }
        }
        return null;
    }

    doa() {
        FloatPacketBuffer discarded$0 = new FloatPacketBuffer(786336);
        CauldronComponent.bitLength((byte) 93, 1600);
    }

    final void createVertexBuffer(int param0, OpenGlToolkit param1) {
        VertexArrayPointer discarded$0 = null;
        VertexArrayPointer discarded$3 = null;
        VertexArrayPointer discarded$4 = null;
        try {
          this.field_a = param1.createVertexBuffer(196584, (byte[]) null, 24, true, (byte) 88);
          discarded$0 = new VertexArrayPointer(this.field_a, 5126, 2, 0);
          discarded$3 = new VertexArrayPointer(this.field_a, 5126, 3, 8);
          if (param0 != 22091) {
            OpenGlToolkit var4 = (OpenGlToolkit) null;
            this.createVertexBuffer(19, (OpenGlToolkit) null);
          }
          discarded$4 = new VertexArrayPointer(this.field_a, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "doa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
