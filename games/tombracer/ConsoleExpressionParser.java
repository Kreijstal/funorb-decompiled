/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleExpressionParser {
    static double field_a;

    final static void decodeLobbyGame(int param0, LobbyGameWidget param1, boolean param2, PacketBuffer param3) {
        int var8 = 0;
        LobbyGameWidget stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        LobbyGameWidget stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        LobbyGameWidget stackIn_12_0 = null;
        int stackIn_13_1 = 0;
        LobbyGameWidget stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        LobbyGameWidget stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        LobbyGameWidget stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2) {
            param1.field_Mb = param3.readUnsignedByte(255);
          }
          param1.field_Jb = param3.readUnsignedByte(255);
          param1.field_cc = param3.readUnsignedByte(255);
          var4_int = param3.readUnsignedByte(255);
          stackIn_6_0 = (LobbyGameWidget) (param1);
          stackIn_7_1 = ((128 & var4_int) != 0);
          stackIn_6_0.field_Tb = stackIn_7_1;
          stackIn_9_0 = (LobbyGameWidget) (param1);
          stackIn_10_1 = (0 != (var4_int & 64));
          stackIn_9_0.field_ec = stackIn_10_1;
          stackIn_12_0 = (LobbyGameWidget) (param1);
          if (0 != (var4_int & 16)) {
            stackIn_13_1 = 2;
          } else {
            stackIn_13_1 = 1;
          }
          stackIn_12_0.field_yb = stackIn_13_1;
          stackIn_15_0 = (LobbyGameWidget) (param1);
          stackIn_16_1 = ((var4_int & param0) != 0);
          stackIn_15_0.field_Ob = stackIn_16_1;
          stackIn_19_0 = (LobbyGameWidget) (param1);
          stackIn_20_1 = (param1.field_Tb) && (param1.field_Jb > param1.field_Mb);
          stackIn_19_0.field_Bb = stackIn_20_1;
          stackIn_22_0 = (LobbyGameWidget) (param1);
          stackIn_23_1 = ((var4_int & 8) != 0);
          stackIn_22_0.field_Yb = stackIn_23_1;
          stackIn_26_0 = ((4 & var4_int) == 0) ? 0 : 1;
          var5 = stackIn_26_0;
          param3.readBytes(param1.field_ac, 0, -104, param1.field_ac.length);
          stackIn_29_0 = ((2 & var4_int) == 0) ? 0 : 1;
          var6 = stackIn_29_0;
          param1.field_Wb = param3.readUnsignedShort(param0 + 93);
          param1.field_Gb = bva.currentTimeMillis((byte) -107) - (long)param3.readInt(-105);
          if (var5 != 0) {
            param1.field_Kb = param3.readInt(param0 ^ 64);
          } else {
            param1.field_Kb = -1;
          }
          param1.field_Ab = param3.readLong(290646880);
          var7 = param3.position;
          param1.field_tb = param3.readString((byte) -76);
          if (var6 != 0) {
            param3.position = var7;
            param1.field_Cb = new String[param1.field_Mb];
            for (var8 = 0; var8 < param1.field_Mb; var8++) {
              param1.field_Cb[var8] = param3.readString((byte) -76);
            }
            return;
          }
          param1.field_Cb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("ed.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final static ConsoleToken parseExpression(ConsoleTokenStream param0, int param1) throws ConsoleParseException {
        ConsoleToken stackIn_6_0 = null;
        ConsoleToken stackIn_20_0 = null;
        ConsoleToken stackIn_26_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ConsoleToken var4 = null;
        ConsoleToken var5 = null;
        ConsoleToken var6 = null;
        try {
          var4 = param0.next((byte) -127);
          if (var4.kind != LegacyOpenGlReflectionEffect.field_e &&
            LoginMethod.field_d != var4.kind &&
            CrusherModel.field_o != var4.kind &&
            var4.kind != PressureSwitchBehaviour.field_r) {
            if (param1 != -31733) {
              field_a = -1.1603987584850415;
            }
            if (var4.kind != QuickChatPhraseSource.field_f) {
              throw new ConsoleParseException(var4.field_h);
            }
            if (param0.isAtEnd((byte) 100)) {
              throw new ConsoleParseException(var4.field_h);
            }
            var5 = param0.next((byte) -126);
            if (var5.kind != lna.field_a) {
              throw new ConsoleParseException(var5.field_h);
            }
            var4.field_i = new IntrusiveDeque();
            while (true) {
              if (param0.isAtEnd((byte) 127)) {
                throw new ConsoleParseException(var4.field_h);
              }
              if (param0.next((byte) -127).kind == rs.field_a) {
                stackIn_20_0 = var4;
                return stackIn_20_0;
              }
              param0.field_c = param0.field_c - 1;
              var4.field_i.addLast((byte) -127, ConsoleExpressionParser.parseExpression(param0, -31733));
              if (param0.isAtEnd((byte) 125)) {
                throw new ConsoleParseException(var4.field_h);
              }
              var6 = param0.next((byte) -126);
              if (var6.kind == rs.field_a) {
                stackIn_26_0 = var4;
                return stackIn_26_0;
              }
              if (var6.kind != qba.field_c) {
                throw new ConsoleParseException(var6.field_h);
              }
            }
          }
          stackIn_6_0 = var4;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("ed.B(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = -1.0;
    }
}
