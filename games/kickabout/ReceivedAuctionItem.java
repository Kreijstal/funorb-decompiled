/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReceivedAuctionItem extends AuctionItem {
    private static int[] field_F;
    static String field_z;
    static int field_y;
    static int[] field_E;
    static String[] field_D;
    static String field_A;
    static int field_B;
    static String field_H;
    static bt field_x;

    final static ReceivedAuctionItem readAuctionItem(int param0, PacketBuffer param1) {
        ReceivedAuctionItem stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        ReceivedAuctionItem var4 = null;
        try {
          var4 = new ReceivedAuctionItem();
          var4.field_a = param1.readLong((byte) -124);
          var3 = param1.readUnsignedByte((byte) -115);
          if (1 != (var3 & 1)) {
          }
          if ((var3 & 65) >> 6 == 1) {
            var4.field_j = true;
          }
          if (1 == (23 & var3) >> 4) {
            var4.field_r = true;
          }
          if ((1 & var3 >> 1) != 1) {
          }
          if ((var3 >> 2 & 1) != 1) {
          }
          if ((var3 >> 3 & 1) == 1) {
            var4.field_h = true;
          }
          if ((var3 & 63) >> 5 == 1) {
            var4.field_q = true;
          }
          var4.field_i = param1.readInt(4);
          if (param0 != -21832) {
            ReceivedAuctionItem.b(20);
          }
          var4.field_v = param1.readInt(4);
          var4.field_t = param1.readInt(4);
          var4.field_s = param1.readUnsignedByte((byte) -108);
          var4.playerStats = new PlayerStats();
          var4.playerStats.readFromPacket(28, param1);
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("vc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 != -1) {
            field_H = (String) null;
          }
          SingleChildContainer.field_x = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vc.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private ReceivedAuctionItem() {
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 != -72) {
          ReceivedAuctionItem.f((byte) 120);
        }
        int var3 = param1 >>> 31;
        return -var3 + (var3 + param1) / param0;
    }

    final static void f(byte param0) {
        MusicPatchNode.b(67);
        GameModesHelpScreen.i((byte) -90);
        ck.field_b = null;
        fa.b(47);
        if (param0 != 119) {
          ReceivedAuctionItem.b(104);
        }
    }

    final static void h(byte param0) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        FootballerAgent var2_ref_nl = null;
        FootballerAgent var3 = null;
        int var3_int = 0;
        PlayArea[] var4 = null;
        PlayArea var6 = null;
        int var7 = 0;
        String var8 = null;
        BallAgent var9 = null;
        var7 = Kickabout.field_G;
        try {
          if (param0 != 125) {
            var8 = (String) null;
            ReceivedAuctionItem.a((String) null, 94);
          }
          if (sl.field_Eb) {
            return;
          }
          var9 = et.field_d.field_V;
          if (ic.field_i) {
            var2 = et.field_d.participantStatus[0].controlledSlot;
            if (var9.possessorTeam == 1) {
              var9.possessorTeam = -1;
            }
            if (0 == var9.possessorTeam &&
              var2 != var9.possessorSlot) {
              var9.possessorTeam = -1;
            }
            if (0 == var9.possessorTeam &&
              var9.possessorSlot == var2) {
              ic.field_i = false;
              return;
            }
            var3 = et.field_d.field_P[0][var2];
            if (!RasterStateSnapshot.a(2235, var3.positionY, 20, var3.positionX)) {
              var9.uncatchable = 3;
            } else {
              var9.uncatchable = 0;
              if (var3.action != 0) {
                var3.setAction((byte) -31, 0);
              }
            }
          } else {
            if (var9.possessorTeam == -1 &&
              var9.positionY > 0) {
              if (var9.positionY >= 88080384) {
                return;
              }
              var2_ref_nl = et.field_d.getControlledFootballer((byte) 120, 0);
              var3_int = 0;
              var4 = et.field_d.field_x;
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5];
                var3_int = var3_int != 0 | var6.containsPoint(var2_ref_nl.positionX, var2_ref_nl.positionY, 703166480, var2_ref_nl.height) ? 1 : 0;
              }
              if (var3_int == 0) {
                if (262144 <= var9.horizontalSpeedSquared(-111)) {
                  return;
                }
                ic.field_i = true;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "vc.A(" + param0 + ')');
        }
    }

    public static void g(byte param0) {
        field_A = null;
        field_D = null;
        field_F = null;
        int var1 = -118 % ((param0 + 81) / 42);
        field_x = null;
        field_z = null;
        field_E = null;
        field_H = null;
    }

    final static void i(byte param0) {
        int var1_int = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        RenderedFootballer var2 = null;
        int var3 = 0;
        var4 = Kickabout.field_G;
        try {
          wo.a(ar.field_c, (RenderedFootballer) (NotCommand.field_F.getBallCarrier((byte) -96)), (byte) 118, 256);
          if (param0 != 45) {
            ReceivedAuctionItem.i((byte) 21);
          }
          for (var1_int = 0; var1_int < NotCommand.field_F.playerCount; var1_int++) {
            if (NotCommand.field_F.participantStatus[var1_int].isActive(3511) &&
              wp.field_c == NotCommand.field_F.field_g[var1_int].field_p) {
              var2 = (RenderedFootballer) (NotCommand.field_F.getControlledFootballer((byte) -60, var1_int));
              stackIn_14_0 = (RegistrationRequestDialog.field_kb != var1_int) ? 160 : 256;
              var3 = stackIn_14_0;
              wo.a(MusicPatchNode.field_u[PlayingView.field_J], var2, (byte) -17, var3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "vc.F(" + param0 + ')');
        }
    }

    final static int b(int param0) {
        if (tc.field_s) {
          return -1;
        }
        if (!bo.field_Cb.a(false, "beach")) {
          return bo.field_Cb.a("beach", -16248);
        }
        tc.field_s = true;
        wn.field_a = ng.a("deckchairs", "beach", 2, bo.field_Cb);
        st.field_q = QuickChatPhraseDefinition.a("beach", bo.field_Cb, (byte) 45, "parasol");
        ns.field_c = QuickChatPhraseDefinition.a("beach", bo.field_Cb, (byte) 92, "ball");
        AnimationSkeleton.field_h = QuickChatPhraseDefinition.a("beach", bo.field_Cb, (byte) 68, "bucket");
        c.field_e = QuickChatPhraseDefinition.a("beach", bo.field_Cb, (byte) 76, "palmtree");
        FullscreenFocusCanvas.field_a = QuickChatPhraseDefinition.a("beach", bo.field_Cb, (byte) 76, "starfish");
        BytePlusOneCommand.field_D = QuickChatPhraseDefinition.a("beach", bo.field_Cb, (byte) 93, "icecream");
        int var1 = 88 % ((65 - param0) / 42);
        tv.field_b = ng.a("stains", "beach", 2, bo.field_Cb);
        return -1;
    }

    static {
        int var0 = 0;
        field_z = "Decline invitation to <%0>'s game";
        field_A = "left ";
        field_y = 0;
        field_E = new int[6];
        field_F = new int[6];
        field_E[2] = 64;
        field_E[4] = 20;
        field_E[0] = 32;
        field_E[1] = 32;
        field_E[5] = 16;
        field_E[3] = 32;
        for (var0 = 0; var0 < field_E.length; var0++) {
          field_F[var0] = field_E[var0];
        }
        field_H = "The <col=ccccff>Trinkets Expansion Pack</col> is accessible to subscribing FunOrb members. It allows you to customise your team with special abilities, immunities, stat boosts, and cheat<nbsp>codes!";
    }
}
