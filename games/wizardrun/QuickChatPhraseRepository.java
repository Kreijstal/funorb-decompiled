/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseRepository {
    private ResourceArchive globalArchive;
    private WeightedLruCache phrases;
    static Sprite field_b;
    private ResourceArchive localArchive;

    final QuickChatPhraseDefinition getPhrase(byte param0, int param1) {
        byte[] var4 = null;
        QuickChatPhraseDefinition var3 = (QuickChatPhraseDefinition) (this.phrases.get((byte) 70, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 27) {
          return (QuickChatPhraseDefinition) null;
        }
        if (param1 >= 32768) {
          var4 = this.globalArchive.getFile(param1 & 32767, 1, 1);
        } else {
          var4 = this.localArchive.getFile(param1, 1, 1);
        }
        var3 = new QuickChatPhraseDefinition();
        if (var4 != null) {
          var3.decode(new PacketBuffer(var4), 72);
        }
        if (param1 >= 32768) {
          var3.markGlobalPhraseIds((byte) -127);
        }
        this.phrases.put((long)param1, 1, var3);
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = wizardrun.field_H;
        try {
          if (!param7) {
            return;
          }
          while (true) {
            param0--;
            if (0 > param0) {
              return;
            }
            var17 = param6;
            var10 = var17;
            var11 = param4;
            var12 = param3;
            var13 = param8;
            var14 = param9;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = (ResourceArchive.bitAnd(var13, 33423632) >> 9) + ((ResourceArchive.bitAnd(33423361, var12) >> 1) - (-ResourceArchive.bitAnd(255, var14 >> 17) - var15));
            param3 = param3 + param1;
            param9 = param9 + param2;
            param4++;
            param8 = param8 + param5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void setTickRate(byte param0, int param1) {
        NameSuggestionsPanel.field_E = 1000000000L / (long)param1;
        if (param0 != 91) {
          field_b = (Sprite) null;
        }
    }

    final static void showLoginForm(int param0) {
        if (!DialogLayer.field_J) {
          throw new IllegalStateException();
        }
        if (param0 != 19702) {
          field_b = (Sprite) null;
        }
        if (FriendEntry.field_lb != null) {
          FriendEntry.field_lb.closeProgressDialog(-27697);
        }
        String var1 = AgeValidator.getLoginIdentifierPrefill((byte) 77);
        TimedValidator.field_b = new LoginForm(var1, (String) null, true, false, false);
        GameShell.field_A.showDialog((UiWidget) (KeyboardShutdownHelpers.field_f), (byte) 62);
        KeyboardShutdownHelpers.field_f.transitionToContent(TimedValidator.field_b, -114);
        KeyboardShutdownHelpers.field_f.finishResize((byte) -3);
    }

    final static LoginCredentials selectLoginCredentials(String param0, int param1, long param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        AlternateUsernameLoginCredentials stackIn_5_0 = null;
        EmailLoginCredentials stackIn_7_0 = null;
        UsernameLoginCredentials stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0L &&
            param0 != null) {
            stackIn_7_0 = new EmailLoginCredentials(param0, param4);
            return (LoginCredentials) ((Object) stackIn_7_0);
          }
          if (param3) {
            stackIn_5_0 = new AlternateUsernameLoginCredentials(param2, param4);
            return (LoginCredentials) ((Object) stackIn_5_0);
          }
          if (param1 != 8355711) {
            field_b = (Sprite) null;
          }
          stackIn_11_0 = new UsernameLoginCredentials(param2, param4);
          return (LoginCredentials) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("uk.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void drawMenuOverlay(byte param0, boolean param1, boolean param2) {
        if (param2) {
          SoftwareRasterizer.fillRectangleBlended(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 192);
        } else {
          SoftwareRasterizer.clear();
        }
        WidgetTheme.drawDialogLayer(param0 ^ 4, param2);
        if (param0 != -123) {
          field_b = (Sprite) null;
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -44) {
          QuickChatPhraseRepository.showLoginForm(108);
        }
        field_b = null;
    }

    private QuickChatPhraseRepository() throws Throwable {
        throw new Error();
    }

    final static void loadLogoMeshes(int param0, ResourceArchive param1) {
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        IsaacPacketBuffer var8 = null;
        int var9 = 0;
        IsaacPacketBuffer var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = wizardrun.field_H;
        try {
          var8 = new IsaacPacketBuffer(param1.getNamedFile(93, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.readUnsignedByte(255);
          var10.beginBitAccess(19967);
          SpriteFilterHelpers.field_a = SavedDataSubmission.readMeshMaterials(12, var10);
          BeveledFrameFactory.field_d = new int[var3][];
          NanoTickClock.field_f = new TriangleMesh[var3];
          for (var4 = 0; var4 < var3; var4++) {
            NanoTickClock.field_f[var4] = AccountProgressDialog.readPackedMesh((byte) -117, var8);
          }
          var10.finishBitAccess((byte) -31);
          if (param0 <= 115) {
            QuickChatPhraseRepository.releaseStatics((byte) -19);
          }
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5 = NanoTickClock.field_f[var9];
            var5.a(6, (byte) 108, 6, 6, 1);
            var5.b(-109);
            var6 = new int[]{var5.field_g + var5.field_r >> 1, var5.field_D + var5.field_K >> 1, var5.field_E + var5.field_M >> 1};
            BeveledFrameFactory.field_d[var9] = var6;
            var5.a(-var6[2], -var6[1], -var6[0], 0);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("uk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
    }
}
