/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class EmailSyntaxValidator extends TextFieldValidator {
    static BitmapFont field_k;
    static ModelMesh[] field_l;
    static String field_j;

    final static IntrusiveDeque d(byte param0) {
        IntrusiveDeque var1 = new IntrusiveDeque();
        var1.addLast(new SumIntegersCommand("sumIntegers", new Class[]{int[].class}, (String) null), 3);
        var1.addLast(new WriteIntegersCommand("writeIntegers", new Class[]{int[].class}, (String) null), 3);
        var1.addLast(new DemoIntegersCommand("demoIntegers", new Class[]{}, (String) null), 3);
        var1.addLast(new DoSomethingCommand("doSomething", new Class[]{String.class}, "Do something clever to a string to annoy TdR."), param0 - 23);
        var1.addLast(new ThreeCommand("three", new Class[]{}, (String) null), param0 ^ 25);
        var1.addLast(new IsSixCommand("isSix", new Class[]{Integer.TYPE}, (String) null), param0 - 23);
        if (param0 != 26) {
          EmailSyntaxValidator.multiplyFixed16(42, -71L, -88L);
        }
        var1.addLast(new NotCommand("not", new Class[]{Boolean.TYPE}, (String) null), param0 - 23);
        var1.addLast(new IntDoubleCommand("intDouble", new Class[]{Integer.TYPE}, (String) null), 3);
        var1.addLast(new IntTripleCommand("intTriple", new Class[]{Integer.TYPE}, (String) null), param0 - 23);
        var1.addLast(new LongPlusOneCommand("LongPlusOne", new Class[]{Long.TYPE}, "Returns a long value. Useful for testing the auto-casts."), 3);
        var1.addLast(new BytePlusOneCommand("BytePlusOne", new Class[]{Byte.TYPE}, "Returns a byte. Should lose precision."), 3);
        var1.addLast(new BigCommand("big", new Class[]{}, (String) null), param0 - 23);
        var1.addLast(new SetLagCommand("set_lag", new Class[]{Integer.TYPE}, (String) null), param0 ^ 25);
        var1.addLast(new BroadcastServerCommand("broadcast_server", new Class[]{String.class}, "Send a broadcast to ALL players in games and the lobby. Only for emergencies, it's filtered too incase someone tries to swear."), 3);
        return var1;
    }

    final ValidationState validateText(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != ModelMaterial.validateEmailParts(64, param0)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param1 != -5) {
            EmailSyntaxValidator.c((byte) -62);
          }
          if (var3_int != 0) {
            stackIn_9_0 = LobbyPlayerRow.field_yb;
            return stackIn_9_0;
          }
          stackIn_7_0 = PitchOptionTile.field_Bb;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("qo.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int multiplyFixed16(int param0, long param1, long param2) {
        if (param0 != -8905) {
          EmailSyntaxValidator.e((byte) 58);
        }
        return (int)(param1 * param2 >> 16);
    }

    final static ArgbSprite g(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = Kickabout.field_G;
        Sprite var6 = new Sprite(108, 108);
        int var3Lifetime1;
        PacketBuffer.pushSpriteRaster(-110, var6);
        SoftwareRasterizer.fillCircle(54, 54, 51, 204);
        for (var2_int = 43; var2_int > 0; var2_int--) {
          var3 = 119 * var2_int / 43 + 34;
          SoftwareRasterizer.fillCircle(54, 54, var2_int, var3);
        }
        if (param0 != -22976) {
          EmailSyntaxValidator.g(126);
        }
        TeamManagementScreen.e(param0 ^ -22987);
        ArgbSprite var2 = new ArgbSprite(54, 54);
        PacketBuffer.pushSpriteRaster(param0 ^ -23017, var2);
        var6.drawHalfSize(0, 0);
        TeamManagementScreen.e(125);
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < var2.field_y.length) {
          var2.field_y[var5] = PainterStyle.bitwiseOr(var2.field_y[var5] << 24, 16777215);
          var5++;
        }
        return var2;
    }

    final String describeText(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validateText(param1, param0 ^ -30) == PitchOptionTile.field_Bb) {
            stackIn_2_0 = ScrollContainer.field_Cb;
            return stackIn_2_0;
          }
          if (param0 != 25) {
            field_j = (String) null;
          }
          stackIn_6_0 = LookupQuery.field_g;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qo.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_k = null;
        field_l = null;
        if (param0 != -126) {
          return;
        }
        field_j = null;
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          CipherPacketBuffer var2_ref_ml = null;
          if (ArrayWidgetContainer.field_A == null) {
            ArrayWidgetContainer.field_A = LoginMethod.field_c.requestSocketOpen(true, IntTripleCommand.field_E, PlayerArchetypeSortCriterion.field_o);
          }
          if (ArrayWidgetContainer.field_A.field_a == 0) {
            return false;
          }
          long dupTemp$0 = MonotonicClock.monotonicMillis(-100);
          BlobSubmission.field_i = dupTemp$0;
          IterableDualLinkDeque.field_c = dupTemp$0;
          if (1 != ArrayWidgetContainer.field_A.field_a) {
            ByteArrayPool.field_c = AudioService.field_h;
          } else {
            try {
              SpriteButtonPainter.field_y = new BufferedSocket((java.net.Socket) (ArrayWidgetContainer.field_A.field_b), LoginMethod.field_c);
              FootballerAiOverlaySupport.field_d.field_n = 0;
              var2_ref_ml = ByteArrayPool.field_e;
              ByteArrayPool.field_c = SpriteBackgroundSupport.field_d;
              var2_ref_ml.field_n = 0;
              PagedHelpScreen.field_A = param0 ? -2 : -1;
              TeamSelectionView.field_n = param0 ? -2 : -1;
              SquadSlotWidget.field_Ab = param0 ? -2 : -1;
              ImageProducerRasterBuffer.a(AuctionItem.field_g, ClassDescriptorSupport.field_g, FootballerAiOverlaySupport.field_d, -3210, RotaryDialWidget.field_E);
              ClientPacketFlushSupport.flushPackets(-1, false);
            } catch (IOException iOException) {
              ByteArrayPool.field_c = AudioService.field_h;
            }
          }
          ArrayWidgetContainer.field_A = null;
          int var2 = -53 / ((-57 - param1) / 43);
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    EmailSyntaxValidator(TextInputWidget param0) {
        super(param0);
    }

    final static boolean c(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -42) {
          return true;
        }
        stackIn_6_0 = (null != PlatformTaskState.field_c) && (PlatformTaskState.field_c.field_l);
        return stackIn_6_0;
    }

    final static int e(byte param0) {
        if (param0 != 18) {
          field_j = (String) null;
        }
        return NameSuggestionsPanel.field_G;
    }

    static {
        field_l = new ModelMesh[9];
        field_j = "You have been removed from <%0>'s game.";
    }
}
