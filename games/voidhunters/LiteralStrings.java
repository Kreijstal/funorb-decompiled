/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LiteralStrings {
    static byte[][] field_a;

    final static void a(int param0, int param1, int param2) {
        IsaacPacketBuffer var3 = RequestNewestBlackboxRecording.field_p;
        var3.writeIsaacByte(24335, param2);
        var3.writeByte(0, 3);
        var3.writeByte(0, 9);
        var3.writeShort(param0, true);
        if (param1 == -1) {
          return;
        }
        String var4 = (String) null;
        LiteralStrings.replaceLiteral((String) null, (String) null, (String) null, -75);
    }

    final static String replaceLiteral(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var4Lifetime1;
        if (param3 != 0) {
          LiteralStrings.clearSharedReferences((byte) -13);
        } else {
          var4 = param2.indexOf(param1);
          while (-1 != var4) {
            param2 = param2.substring(0, var4) + param0 + param2.substring(param1.length() + var4);
            var4 = param2.indexOf(param1, var4 + param0.length());
          }
          return param2;
        }
        var4Lifetime1 = param2.indexOf(param1);
        while (-1 != var4Lifetime1) {
          param2 = param2.substring(0, var4Lifetime1) + param0 + param2.substring(param1.length() + var4Lifetime1);
          var4Lifetime1 = param2.indexOf(param1, var4Lifetime1 + param0.length());
        }
        return param2;
    }

    final static void expireDebugArrows(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        WorldDebugArrow var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        try {
          if (param0 != 20824) {
            field_a = (byte[][]) null;
          }
          if (null == SocketConnector.debugArrows) {
            return;
          }
          var1 = (WorldDebugArrow) (SocketConnector.debugArrows.first(0));
          while (var1 != null) {
            fieldTemp$0 = var1.remainingTicks;
            var1.remainingTicks = var1.remainingTicks - 1;
            if (fieldTemp$0 == 0) {
              var1.unlink(param0 ^ -24158);
            }
            var1 = (WorldDebugArrow) (SocketConnector.debugArrows.next((byte) 12));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var1_ref), "sh.D(" + param0 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 < 43) {
          return;
        }
        field_a = (byte[][]) null;
    }

    static {
    }
}
