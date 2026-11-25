/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameAvailabilityValidator extends TextFieldValidator {
    private String field_n;
    private boolean field_o;
    static boolean[] field_r;
    static GameRules field_s;
    static int field_q;
    static long field_p;
    static String[] field_v;
    static String field_t;
    static String field_u;

    final static void a(int param0, int[] param1, int param2) {
        try {
          TutorialVictoryChecker.field_p[param2] = param1;
          if (param0 != -1) {
            field_t = (String) null;
          }
          LobbyPlayerEntry.field_Hb[param2] = new GameMenuController(param2);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ec.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final ValidationState computeStateFor(int param0, String param1) {
        AccountRequestResult var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        CharSequence var5 = null;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_9_0 = null;
        ValidationState stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          if (!UiWidget.a(var5, (byte) -89)) {
            stackIn_3_0 = ArchiveSourceManager.field_b;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_n)) {
            var3 = DateInputWidget.a(param0 + 3780, param1);
            if (var3 != null &&
              var3.field_g == null) {
              this.field_o = var3.field_h;
              this.field_n = param1;
            } else {
              stackIn_9_0 = TutorialConditionalText.field_d;
              return stackIn_9_0;
            }
          }
          if (param0 != -11196) {
            var4 = (int[]) null;
            UsernameAvailabilityValidator.a(30, (int[]) null, 29);
          }
          if (!this.field_o) {
            stackIn_16_0 = ArchiveSourceManager.field_b;
          } else {
            stackIn_16_0 = CachedArchiveSource.field_g;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ec.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void e(byte param0) {
        LobbyPlayerEntry var3 = null;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          IntNode.field_p = null;
          MenuInputState.field_a = null;
          TurnEventLog.field_i = false;
          if (null != PlayerRankingRequest.field_p) {
            PlayerRankingRequest.field_p.clear(param0 + 66);
            PlayerRankingRequest.field_p = null;
          }
          if (param0 != -66) {
            field_v = (String[]) null;
          }
          ShatteredPlansClient.field_H = null;
          if (null != AccountRequestResult.field_a) {
            AccountRequestResult.field_a.clear(param0 + 66);
            AccountRequestResult.field_a = null;
          }
          IsaacBackedRandom.field_b = null;
          if (LobbyRoomInteractionSupport.field_a != null) {
            LobbyRoomInteractionSupport.field_a.clear(0);
            LobbyRoomInteractionSupport.field_a = null;
          }
          SpriteStripButtonPainter.field_w = null;
          if (ShatteredPlansClient.field_H != null) {
            var3 = (LobbyPlayerEntry) (ShatteredPlansClient.field_H.startTraversal((byte) -102));
            while (var3 != null) {
              var3.unlinkSecondary(16);
              var3 = (LobbyPlayerEntry) (ShatteredPlansClient.field_H.nextInTraversal((byte) -107));
            }
            ShatteredPlansClient.field_H = null;
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ec.S(" + param0 + ')');
        }
    }

    public static void clearStatics(boolean param0) {
        field_u = null;
        field_s = null;
        if (!param0) {
          UsernameAvailabilityValidator.a(-25, -13, false);
        }
        field_t = null;
        field_v = null;
        field_r = null;
    }

    final static Sprite a(int param0, int param1, boolean param2) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = (-(3 * ClientPacketFlushSupport.field_b[param0].field_z / 4) + 130) * param1 / 5;
        int var5Lifetime1;
        int var5Lifetime2;
        if (var3 <= 0) {
          var3 = 1;
        }
        Sprite var4 = new Sprite(var3, -6 + ClientPacketFlushSupport.field_b[param0].field_w);
        RandomAccessCacheFile.a(-104);
        var4.bindAsRenderTarget();
        for (var5 = 0; var4.field_z > var5; var5++) {
          SoftwareRasterizer.drawVerticalLine(var5, 0, var4.field_w, SolVictoryChecker.blendColours(0, SoundPlayback.field_k[param0], -81, 128 + 128 * var5 / var4.field_z));
        }
        for (var5Lifetime1 = 0; -1 + var4.field_z > var5Lifetime1; var5Lifetime1++) {
          var4.field_B[var5Lifetime1] = SolVictoryChecker.blendColours(0, var4.field_B[var5Lifetime1], -92, 128);
          var4.field_B[var4.field_z * (var4.field_w - 1) + var5Lifetime1] = SolVictoryChecker.blendColours(0, var4.field_B[var4.field_z * (var4.field_w - 1) + var5Lifetime1], -118, 64);
        }
        for (var5Lifetime2 = 0; var5Lifetime2 < var4.field_w; var5Lifetime2++) {
          var4.field_B[var4.field_z - 1 + var5Lifetime2 * var4.field_z] = SolVictoryChecker.blendColours(0, var4.field_B[var5Lifetime2 * var4.field_z + (-1 + var4.field_z)], -86, 128);
        }
        var4.field_B[var4.field_z * var4.field_w - 1] = SolVictoryChecker.blendColours(0, var4.field_B[-1 + var4.field_w * var4.field_z], -85, 190);
        OpacityWidget.popLegacyRasterState(0);
        if (!param2) {
          field_r = (boolean[]) null;
        }
        return var4;
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        if (param0 != -1) {
          field_p = -46L;
        }
        var3 = LobbyOptionSupport.field_j;
        if (var3 < 5) {
          var2 = 8192 * var3 * var3 / 1100;
        } else {
          if (105 <= var3) {
            if (var3 < 120) {
              var3 = 120 - var3;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
            }
          } else {
            var2 = (-40960 + var3 * 16384) / 220;
          }
        }
        var4 = 1;
        var5 = 0;
        if (param1 == 1) {
          var5 = 1;
        }
        if (3 == param1) {
          var4 = -1;
        }
        if (4 == param1) {
          var4 = 1;
          var5 = 1;
        }
        if (5 == param1) {
          var5 = 1;
          var4 = -1;
        }
        if (param1 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (param1 == 7 ||
          param1 == 8) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 11) {
          var4 = -1;
        }
        if (param1 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (14 == param1) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 15) {
          var5 = 1;
          var4 = 1;
        }
        MouseWheelInput.field_a = TutorialOverlaySupport.createRotationMatrix(var4 * var2, (byte) 80, var5 * var2);
    }

    UsernameAvailabilityValidator(TextFieldWidget param0) {
        super(param0);
        this.field_o = false;
    }

    final void d(int param0) {
        this.field_n = null;
        if (param0 != 0) {
          int[] var3 = (int[]) null;
          UsernameAvailabilityValidator.a(-117, (int[]) null, 13);
        }
    }

    final static MeshData a(CipherPacketBuffer param0, byte param1) {
        int var8 = 0;
        MeshData stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        MeshData var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param0.b((byte) 126, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = PacketBooleanSupport.readBoolean(param0, (byte) -95) ? 1 : 0;
          var4 = PacketBooleanSupport.readBoolean(param0, (byte) -95) ? 1 : 0;
          var5 = new MeshData();
          var5.field_x = (short)param0.b((byte) 115, 16);
          var5.field_w = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_w);
          var5.field_z = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_z);
          var5.field_f = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_f);
          var5.field_u = (short)param0.b((byte) 99, 16);
          var5.field_s = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_s);
          var6 = 99 % ((-48 - param1) / 42);
          var5.field_i = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_i);
          var5.field_B = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_B);
          if (var3 != 0) {
            var5.field_e = (short)param0.b((byte) 82, 16);
            var5.field_I = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_I);
            var5.field_y = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_y);
            var5.field_v = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_v);
            var5.field_M = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_M);
            var5.field_P = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_P);
            var5.field_n = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_n);
          }
          if (var4 != 0) {
            param0.b((byte) 98, 16);
            var5.field_C = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_C);
            var5.field_g = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_g);
            var5.field_L = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_L);
            var5.field_J = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_J);
            var5.field_G = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_G);
          }
          if (PacketBooleanSupport.readBoolean(param0, (byte) -95)) {
            var5.field_b = NotificationEntry.readPackedShortArray((byte) 39, param0, 16, var5.field_b);
          }
          if (PacketBooleanSupport.readBoolean(param0, (byte) -95)) {
            var5.field_p = DualLinkNode.a(16, false, param0, var5.field_p);
            var7 = 0;
            for (var8 = 0; var5.field_p.length > var8; var8++) {
              if ((255 & var5.field_p[var8]) > var7) {
                var7 = 255 & var5.field_p[var8];
              }
            }
            if (var7 == 0) {
              var5.field_p = null;
            } else {
              var5.field_o = (byte)(1 + var7);
            }
          }
          stackIn_24_0 = var5;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ec.V(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        if (param0 != -8) {
          UsernameAvailabilityValidator.e((byte) 84);
        }
        if (param1 != 50) {
          throw new IllegalArgumentException();
        }
    }

    final String computeMessageFor(boolean param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountRequestResult var4 = null;
        CharSequence var5 = null;
        String stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_n = (String) null;
          }
          var5 = (CharSequence) ((Object) param1);
          var3 = PlayerOverlaySupport.validateAccountName(var5, (byte) -123);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (!param1.equals(this.field_n)) {
            var4 = DateInputWidget.a(-7416, param1);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_g) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.field_n = param1;
            this.field_o = var4.field_h;
          }
          if (this.field_o) {
            stackIn_17_0 = GameAssetSetupSupport.field_f;
            return stackIn_17_0;
          }
          stackIn_15_0 = ClientDrawingSupport.field_d;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ec.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_q = 480;
        field_t = "Animations speed is normal. Click to double.";
        field_s = new GameRules(true, true, false, true, false, false, false, 0);
        field_u = "Confirm Email:";
    }
}
