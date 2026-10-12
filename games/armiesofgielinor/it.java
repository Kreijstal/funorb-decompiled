/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class it {
    static RgbSprite field_a;
    static boolean field_b;

    final static RgbSprite[] a(int param0, RgbSprite param1) {
        RgbSprite[] var2 = null;
        RuntimeException var2_ref = null;
        PacketBuffer var3 = null;
        RgbSprite[] var4 = null;
        RgbSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17) {
            var3 = (PacketBuffer) null;
            it.a(-86, true, 3, (PacketBuffer) null, -126);
          }
          var4 = new RgbSprite[9];
          var2 = var4;
          var4[4] = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("it.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static nc a(String param0, kl param1, kl param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(param4, 110);
          var6 = param1.a((byte) -15, var5_int, param0);
          if (param3 != -87) {
            field_a = (RgbSprite) null;
          }
          stackIn_3_0 = ue.a(param1, var5_int, param2, (byte) -118, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("it.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, PacketBuffer param3, int param4) {
        if (param1) {
          return;
        }
        try {
          param3.writeByte(1, 12);
          param3.writeShort(true, 17);
          param3.writeShort(true, param2);
          param3.writeShort(!param1 ? true : false, param4);
          param3.writeByte(1, param0);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "it.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, String param5) {
        CipherPacketBuffer var9 = null;
        int var7 = 0;
        try {
          var9 = vl.outgoingPacket;
          CipherPacketBuffer var6 = var9;
          if (param1 > -71) {
            String var8 = (String) null;
            it.a((String) null, (kl) null, (kl) null, (byte) -14, (String) null);
          }
          var9.writeCipheredOpcode(32161, param4);
          var9.position = var9.position + 1;
          var7 = var9.position;
          var9.writeByte(1, param2);
          if (param2 == 2) {
            var9.b(param3, 13851);
          }
          if (param5 != null) {
            sf.a(15901, param5, var9);
          } else {
            var9.writeShort(true, param0);
          }
          var9.e(-var7 + var9.position, 5930);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "it.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
          field_b = true;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
