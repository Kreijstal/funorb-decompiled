/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BroadcastServerCommand extends ConsoleCommand {
    static int[][] field_E;
    static FriendsListPanel field_D;
    static String field_A;
    static String field_C;
    static String field_F;

    final static Sprite createSolidSprite(int param0, byte param1, int param2) {
        Sprite var6 = null;
        Sprite var3 = null;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (param1 == -96) {
          var6 = new Sprite(param2, param2);
          var3 = var6;
          for (var4 = 0; var3.field_y.length > var4; var4++) {
            var6.field_y[var4] = param0;
          }
          return var3;
        }
        return (Sprite) null;
    }

    BroadcastServerCommand(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(int param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param2);
          if (!AnimationFrameset.isAllowedDisplayName(var6, param1 - 10007)) {
            stackIn_2_0 = SquadSlotWidget.field_Ib;
            return stackIn_2_0;
          }
          if (PitchCoordinateSupport.field_d != 2) {
            stackIn_6_0 = UiKeyRoutingSupport.field_h;
            return stackIn_6_0;
          }
          if (SumIntegersCommand.a((byte) 82, param2)) {
            stackIn_10_0 = LoginText.field_g;
            return stackIn_10_0;
          }
          if (IntKeyLookup.isFriend(param2, -64)) {
            stackIn_13_0 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, GameAppletShell.field_m, new String[]{param2});
            return stackIn_13_0;
          }
          if (param1 <= ListingRow.field_d &&
            WeightedLruCache.field_d <= 0) {
            stackIn_17_0 = DraggableWidget.field_A;
            return stackIn_17_0;
          }
          if (ListingRow.field_d >= 200) {
            stackIn_20_0 = DraggableWidget.field_A;
            return stackIn_20_0;
          }
          if (DiskCacheRequest.a(0, param2)) {
            stackIn_24_0 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, TrinketTile.field_Gb, new String[]{param2});
            return stackIn_24_0;
          }
          var5 = FootballerAiOverlaySupport.field_d;
          var5.writeIsaacByte(param0, (byte) 93);
          var5.field_n = var5.field_n + 1;
          var4 = var5.field_n;
          var5.writeByte(123, 0);
          var5.writeString(param1 ^ 14090, param2);
          var5.backpatchByteLength(62, -var4 + var5.field_n);
          stackIn_26_0 = null;
          return (String) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("lh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_A = null;
        field_C = null;
        if (param0 != 96) {
          return;
        }
        field_F = null;
        field_D = null;
        field_E = (int[][]) null;
    }

    final ConsoleValue execute(byte param0, ConsoleValue[] param1) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 84) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          TextHotspotWidget.sendModeratorCommand(-28153, (String) (param1[0].field_d));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static ListingRow a(PacketBuffer param0, int param1) {
        ListingRow var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        ListingRow stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 18653) {
            var3 = (String) null;
            BroadcastServerCommand.a(8, 73, (String) null);
          }
          var2 = new ListingRow();
          var2.readFromPacket(param0, 62);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("lh.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_C = "Amateur Teams";
        field_F = "Go to Auctions";
    }
}
