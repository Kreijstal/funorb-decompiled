/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArenaDefinitionCodec {
    static LruNodeCache field_a;
    static ToolkitSprite field_d;
    static String passwordText;
    static int field_e;
    static ResourceArchive field_c;
    static String field_b;
    static String yourEmailAddressIsText;

    public static void releaseStatics(int param0) {
        passwordText = null;
        field_b = null;
        field_c = null;
        field_a = null;
        yourEmailAddressIsText = null;
        if (param0 == 20437) {
          field_d = null;
          return;
        }
        ArenaDefinitionCodec.releaseStatics(-26);
        field_d = null;
    }

    final static void requestLoginBack(byte guard) {
        ReflectionCheck.setAccountDialogResult(4, -66);
        if (guard > -86) {
          field_e = -49;
        }
    }

    final static ArenaDefinition decodeArena(PacketBuffer packet, boolean keepPosition, int guard) {
        int var8 = 0;
        ArenaDefinition stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        IntrusiveDeque var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ArenaPad var13 = null;
        int var14 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!keepPosition) {
            packet.position = 0;
          }
          var3_int = packet.readUnsignedByte(-31302);
          var4 = 0;
          if (1 < var3_int) {
            var4 = packet.readUnsignedByte(-31302);
          }
          var5 = new IntrusiveDeque();
          if (guard <= 50) {
            ArenaDefinitionCodec.releaseStatics(116);
          }
          var6 = packet.readUnsignedByte(-31302);
          var7 = 1;
          for (var8 = 0; var6 > var8; var8++) {
            var9 = packet.readUnsignedByte(-31302);
            var10 = packet.readInt(true);
            var11 = packet.readInt(true);
            packet.readInt(true);
            packet.readInt(true);
            var12 = 0;
            if (var3_int > 2) {
              var12 = packet.readInt(true);
            }
            var13 = FullscreenCanvas.createArenaPad(var12, var10 >> 8, var11 >> 8, var9, (byte) -113);
            if (var9 == 2) {
              var13.field_s = var7;
              var7++;
            }
            var5.addLast((IntrusiveNode) (var13), (byte) 39);
          }
          stackIn_17_0 = new ArenaDefinition(var5, var4);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("pi.B(");
          if (packet == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(keepPosition).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_a = new LruNodeCache(16);
        passwordText = "Password: ";
        field_e = 0;
        yourEmailAddressIsText = "Your email address is used to identify this account";
    }
}
