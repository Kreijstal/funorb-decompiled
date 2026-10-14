/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    private String field_c;
    static RgbSprite field_b;
    static IndexedSprite[] field_a;
    static int[][] field_e;
    static boolean[] field_f;
    static PcmStream alternateActivityLoop;

    final void a(int param0, java.applet.Applet param1) {
        try {
          if (param0 < 92) {
            me.b(-113);
          }
          sj.a(param1, (byte) 122, this.field_c, "jagex-last-login-method", 31536000L);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "me.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = (int[][]) null;
        field_f = null;
        field_a = null;
        field_b = null;
        alternateActivityLoop = null;
        if (param0 != 100) {
          field_a = (IndexedSprite[]) null;
        }
    }

    final static boolean b(int param0) {
        int var1 = 0 % ((param0 - 66) / 35);
        return sm.field_b != sm.field_a ? true : false;
    }

    final static String requestAddIgnoredPlayer(String name, int opcode, int expectedLoginStage) {
        RuntimeException var3 = null;
        int bodyStart = 0;
        BitPacketBuffer packet = null;
        CharSequence nameCharacters = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          nameCharacters = (CharSequence) ((Object) name);
          if (!DualLinkNode.isValidSocialName(nameCharacters, false)) {
            stackIn_2_0 = LobbyGame.field_Xb;
            return stackIn_2_0;
          }
          if (SpaceBackground.isLocalPlayerName(name, -26)) {
            stackIn_5_0 = rj.field_a;
            return stackIn_5_0;
          }
          if (expectedLoginStage != LevelMetadata.field_m) {
            stackIn_9_0 = df.field_c;
            return stackIn_9_0;
          }
          if (AchievementBrowserScreen.isIgnoredPlayer(124, name)) {
            stackIn_12_0 = rd.a(DraggableWidget.field_J, new String[]{name}, (byte) 103);
            return stackIn_12_0;
          }
          if (IsaacGenerator.ignoreCount >= 100) {
            stackIn_15_0 = ap.field_d;
            return stackIn_15_0;
          }
          if (LevelPack.isFriend(expectedLoginStage - 2, name)) {
            stackIn_19_0 = rd.a(tq.field_a, new String[]{name}, (byte) 103);
            return stackIn_19_0;
          }
          packet = TextFieldValidator.outgoingPackets;
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          bodyStart = packet.position;
          packet.writeByte(84, 2);
          packet.writeCp1252String(name, expectedLoginStage ^ -3);
          packet.backfillByteLength((byte) 119, -bodyStart + packet.position);
          stackIn_21_0 = null;
          return (String) (stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("me.F(");
          if (name == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(opcode).append(',').append(expectedLoginStage).append(')').toString());
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + AccountResponse.a((byte) 13, "\n", param0, "%0a"));
        if (param1 > -73) {
          field_f = (boolean[]) null;
        }
    }

    final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 56) {
            field_b = (RgbSprite) null;
          }
          stackIn_3_0 = this.field_c.equals(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("me.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    me(String param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new RgbSprite(540, 140);
    }
}
