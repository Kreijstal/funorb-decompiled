/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialWidget extends TextButton {
    int field_ab;
    int field_eb;
    static int[] field_db;
    int field_Y;
    static String field_V;
    static String field_Z;
    int field_W;
    int field_bb;
    static boolean field_X;
    int field_cb;

    final boolean handlePointerPress(int param0, UiComponent param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = SteelSentinels.obfuscationControl;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_cb + (-this.field_o + (-param2 + param3));
          var9 = param0 - this.field_Y - this.field_z - param4;
          if (var8_int * var8_int + var9 * var9 >= this.field_ab * this.field_ab) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - TabbedPanel.field_Xb;
          if (!(0.0 > var10)) {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_bb;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.field_bb;
          }
          this.field_eb = (int)(var10 * (double)this.field_bb / 6.283185307179586);
          while (this.field_eb >= this.field_bb) {
            this.field_eb = this.field_eb - this.field_bb;
          }
          while (this.field_eb < 0) {
            this.field_eb = this.field_eb + this.field_bb;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("nl.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean saveDesignToFreeSlot(int param0) {
        int[] array$1 = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = SteelSentinels.obfuscationControl;
        try {
          for (var1_int = 0; var1_int < LoginHandshakeHelpers.field_c.length; var1_int++) {
            if (LoginHandshakeHelpers.field_c[var1_int] != null) {
              continue;
            }
            break;
          }
          TextAndBitHelpers.field_f.field_Ub.field_eb = -100 + TextAndBitHelpers.field_f.field_Lb - TextAndBitHelpers.field_f.field_Ub.field_Lb;
          RegistrationRequestDialog.field_Ob = 1;
          LoginDialogHelpers.field_k[0] = TextAndBitHelpers.field_f.field_Ub.field_eb;
          if (param0 <= 122) {
            return true;
          }
          DateOfBirthValidator.clearSceneReferences(-31);
          if (var1_int >= LoginHandshakeHelpers.field_c.length) {
            ClientGlobals.field_a = DualNodeDequeIterator.field_i;
            NameValidationHelpers.field_c = SocialRequestHelpers.field_e[0];
            return false;
          }
          DesignerPageTables.field_b = ArchiveLoadSequence.buildComponentLoadout(73, OptionMaskHelpers.field_c, PendingIntArrayRequest.field_v);
          if (null == LoginHandshakeHelpers.field_c[var1_int] ||
            LoginHandshakeHelpers.field_c[var1_int].length != DesignerPageTables.field_b.length) {
            array$1 = new int[DesignerPageTables.field_b.length];
            LoginHandshakeHelpers.field_c[var1_int] = array$1;
          }
          ArraySupport.copy(DesignerPageTables.field_b, 0, LoginHandshakeHelpers.field_c[var1_int], 0, DesignerPageTables.field_b.length);
          LoadoutHelpers.updateSavedLoadout(var1_int, PendingIntArrayRequest.field_v, 55);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1), "nl.Q(" + param0 + ')');
        }
    }

    final static void sendFlaggedBytePayload(int param0, byte[] param1, boolean param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        CipherPacketBuffer var6 = ClockAndCookieHelpers.field_g;
        var6.writeCipheredOpcode(param4, (byte) -117);
        if (param5 <= 30) {
          return;
        }
        try {
          var6.position = var6.position + 1;
          var7 = var6.position;
          var6.writeByte((byte) 115, 4);
          var6.writeByte((byte) 119, param0);
          var8 = param3;
          if (param2) {
            var8 += 128;
          }
          var6.writeByte((byte) 112, var8);
          var6.writeBytes(param1.length, (byte) -122, 0, param1);
          var6.backpatchByteLength((byte) -116, var6.position - var7);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "nl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_db = null;
        field_V = null;
        field_Z = null;
        if (param0 >= -23) {
          DialWidget.createGradientTabSprites(false, 19, true, 116, 99, 62);
        }
    }

    final static RgbSprite[] createGradientTabSprites(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        RgbSprite var13 = null;
        RgbSprite var14 = null;
        int[] var16 = SoftwareRaster.field_g;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = SoftwareRaster.field_c;
        int var8 = SoftwareRaster.field_j;
        RgbSprite var9 = new RgbSprite(16, param4);
        var9.bindRasterTarget();
        SoftwareRaster.fillVerticalGradient(0, 0, 16, param4, param1, param5);
        Object var10 = null;
        Object var11 = null;
        if (param0) {
          var13 = var9.copySprite();
          var10 = var13;
          var13.bindRasterTarget();
          SoftwareRaster.drawHorizontalLine(0, 0, 5, 0);
          SoftwareRaster.drawHorizontalLine(0, 1, 3, 0);
          SoftwareRaster.drawHorizontalLine(0, 2, 2, 0);
          SoftwareRaster.drawHorizontalLine(0, 3, 1, 0);
          SoftwareRaster.drawHorizontalLine(0, 4, 1, 0);
        }
        if (param3 >= -7) {
          field_X = true;
        }
        if (param2) {
          var14 = var9.copySprite();
          var11 = var14;
          var14.bindRasterTarget();
          SoftwareRaster.drawHorizontalLine(11, 0, 5, 0);
          SoftwareRaster.drawHorizontalLine(13, 1, 3, 0);
          SoftwareRaster.drawHorizontalLine(14, 2, 2, 0);
          SoftwareRaster.drawHorizontalLine(15, 3, 1, 0);
          SoftwareRaster.drawHorizontalLine(15, 4, 1, 0);
        }
        SoftwareRaster.setTarget(var16, var7, var8);
        return new RgbSprite[]{null, null, null, (RgbSprite) (var10), var9, (RgbSprite) (var11), null, null, null};
    }

    final static void loadLogoModel(byte param0, ResourceArchive param1) {
        CipherPacketBuffer var8 = null;
        CipherPacketBuffer var10 = null;
        int var3 = 0;
        int var9 = 0;
        TriangleMesh var5_ref_pe = null;
        int[] var6 = null;
        int var4 = 0;
        int var7 = SteelSentinels.obfuscationControl;
        int var4Lifetime1;
        try {
          var8 = new CipherPacketBuffer(param1.getFileByName("", -742, "logo.fo3d"));
          var10 = var8;
          var3 = var10.readUnsignedByte((byte) -119);
          var10.beginBitReading(false);
          LoginForm.field_W = EmailAvailabilityValidator.readMeshMaterialRecords(var10, (byte) 87);
          FullscreenFocusCanvas.field_h = new TriangleMesh[var3];
          LoginResultHelpers.field_f = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            FullscreenFocusCanvas.field_h[var4] = AssetDecoders.decodeMesh(-100, var8);
          }
          var10.endBitReading((byte) -3);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5_ref_pe = FullscreenFocusCanvas.field_h[var9];
            var5_ref_pe.scale(6, 6, 1, 6, 14866);
            var5_ref_pe.computeBounds(32767);
            var6 = new int[]{var5_ref_pe.field_J + var5_ref_pe.field_c >> 1, var5_ref_pe.field_p + var5_ref_pe.field_W >> 1, var5_ref_pe.field_n + var5_ref_pe.field_s >> 1};
            LoginResultHelpers.field_f[var9] = var6;
            var5_ref_pe.translate(0, -var6[1], -var6[2], -var6[0]);
            var9++;
          }
          int var5 = -123 % ((49 - param0) / 35);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "nl.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int componentPresetIndex(int param0, int param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param1 != 26) {
          return 14;
        }
        var2 = param0;
        if (55 == var2) {
          return 2;
        }
        if (0 == var2) {
          return 9;
        }
        if (var2 == 57) {
          return 5;
        }
        if (62 == var2) {
          return 13;
        }
        if (var2 == 65) {
          return 16;
        }
        if (var2 == 69) {
          return 19;
        }
        if (var2 == 72) {
          return 23;
        }
        if (var2 == 75) {
          return 26;
        }
        if (var2 == 79) {
          return 28;
        }
        return -1;
    }

    final static int[] getComponentPreset(int param0, byte param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param1 <= 122) {
          return (int[]) null;
        }
        var2 = param0;
        if (0 == var2) {
          return ReflectionCheck.field_v;
        }
        if (var2 == 55) {
          return ReflectionCheck.field_x;
        }
        if (57 == var2) {
          return ReflectionCheck.field_P;
        }
        if (var2 == 62) {
          return ReflectionCheck.field_z;
        }
        if (var2 == 65) {
          return ReflectionCheck.field_N;
        }
        if (var2 == 69) {
          return ReflectionCheck.field_O;
        }
        if (var2 == 72) {
          return ReflectionCheck.field_D;
        }
        if (var2 == 75) {
          return ReflectionCheck.field_J;
        }
        if (79 == var2) {
          return ReflectionCheck.field_E;
        }
        if (84 == var2) {
          return Js5Transport.field_s;
        }
        if (88 == var2) {
          return PendingIntReplyRequest.field_p;
        }
        if (92 == var2) {
          return CachedTextLayout.field_k;
        }
        return null;
    }

    final static String requestRemoveFriend(String param0, int param1, boolean param2) {
        int var6 = 0;
        SocialListEntry var7 = null;
        SocialListEntry var8 = null;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        CipherPacketBuffer var9 = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!ArchiveProvider.isValidAccountName(param2, var10)) {
            stackIn_4_0 = LoadingScreenHelpers.field_a;
            return stackIn_4_0;
          }
          if (2 != DisplayNameForm.field_P) {
            stackIn_8_0 = SingleChildContainer.field_N;
            return stackIn_8_0;
          }
          var8 = SpriteState.findFriend(param0, (byte) 113);
          if (var8 == null) {
            stackIn_12_0 = SocketConnector.formatTemplate(SolidSpriteHelpers.field_a, -75, new String[]{param0});
            return stackIn_12_0;
          }
          Sprite.field_c.traverseFrom((byte) 125, (IntrusiveNode) (var8));
          while (true) {
            var7 = (SocialListEntry) (Sprite.field_c.next((byte) -102));
            if (var7 != null) {
              var7.field_bc = var7.field_bc - 1;
              continue;
            }
            break;
          }
          var8.unlink(4);
          var8.unlinkDual(480);
          TransitionTimerHelpers.field_h = TransitionTimerHelpers.field_h - 1;
          var9 = ClockAndCookieHelpers.field_g;
          var9.writeCipheredOpcode(param1, (byte) -117);
          var9.position = var9.position + 1;
          var5 = var9.position;
          var9.writeByte((byte) 110, 1);
          var9.writeString(param0, -61);
          var9.backpatchByteLength((byte) -53, -var5 + var9.position);
          stackIn_18_0 = null;
          return (String) (stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("nl.K(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private DialWidget() throws Throwable {
        throw new Error();
    }

    final static void sendSelectedGameId(int param0, int param1, int param2) {
        LobbyGame var6 = null;
        LobbyGame var7 = null;
        CipherPacketBuffer var4 = null;
        if (param2 != 5) {
          field_V = (String) null;
        }
        if (MusicPatchEnvelope.field_j != param0) {
          var6 = (LobbyGame) (QuickChatParameterType.field_a.get((long)MusicPatchEnvelope.field_j, (byte) 92));
          var7 = var6;
          if (var7 != null) {
            var7.field_hc = null;
          }
          MusicPatchEnvelope.field_j = param0;
          var4 = ClockAndCookieHelpers.field_g;
          var4.writeCipheredOpcode(param1, (byte) -117);
          var4.writeByte((byte) 108, 3);
          var4.writeByte((byte) 113, 11);
          var4.writeShort(param0, 21);
        }
    }

    static {
        field_db = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        field_V = "On";
        field_Z = "Accept unrated rematch";
    }
}
