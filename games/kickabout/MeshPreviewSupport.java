/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshPreviewSupport {
    static String field_b;
    static String field_c;
    static String field_a;

    final static int getCommonUiLoadProgress(byte param0) {
        if (DateInputValidator.field_d < 2) {
          return 0;
        }
        if (ArchiveRequest.field_r == 0) {
          if (!SceneSpriteFactory.field_b.ensureIndex(-93)) {
            return 20;
          }
          if (!SceneSpriteFactory.field_b.ensurePackedGroupByName(false, "commonui")) {
            return 40;
          }
          if (!SelectionMarkerSupport.field_c.ensureIndex(-58)) {
            return 50;
          }
          if (!SelectionMarkerSupport.field_c.ensurePackedGroupByName(false, "commonui")) {
            return 60;
          }
          if (!PlayerStats.field_k.ensureIndex(param0 - 179)) {
            return 70;
          }
          if (!PlayerStats.field_k.ensureAllGroupsAvailable(false)) {
            return 80;
          }
        } else {
          if (null != LoginRequiredDialog.field_H) {
            if (!LoginRequiredDialog.field_H.ensureIndex(-94)) {
              return 14;
            }
            if (!LoginRequiredDialog.field_H.hasGroupName("", (byte) -120)) {
              return 29;
            }
            if (!LoginRequiredDialog.field_H.ensurePackedGroupByName(false, "")) {
              return 29;
            }
          }
          if (!SceneSpriteFactory.field_b.ensureIndex(-107)) {
            return 43;
          }
          if (!SceneSpriteFactory.field_b.ensurePackedGroupByName(false, "commonui")) {
            return 57;
          }
          if (!SelectionMarkerSupport.field_c.ensureIndex(-66)) {
            return 71;
          }
          if (!SelectionMarkerSupport.field_c.ensurePackedGroupByName(false, "commonui")) {
            return 80;
          }
          if (!PlayerStats.field_k.ensureIndex(-106)) {
            return 82;
          }
          if (!PlayerStats.field_k.ensureAllGroupsAvailable(false)) {
            return 86;
          }
        }
        if (param0 != 92) {
          return -43;
        }
        return 100;
    }

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          if (!ArchiveManager.hasActiveModal(false)) {
            if (null != SplashScreen.field_m &&
              SplashScreen.field_m.field_b) {
              UiWidget.leaveFullscreen(0);
              ValidatedTextWidget.field_Z.pushModal(new FullscreenErrorDialog(ValidatedTextWidget.field_Z, PainterStyle.field_a), false);
            }
            return;
          }
          ValidatedTextWidget.field_Z.processPointerFrame(HuffmanTextSupport.field_c, 31947, TournamentChampionDialog.field_J, true);
          if (param0 <= 104) {
            MeshPreviewSupport.b(104);
          }
          ValidatedTextWidget.field_Z.advanceModalAnimations(2);
          while (TexturedPanelPainter.$cfr$intArgs$b$c4997cb15529(-59)) {
            ValidatedTextWidget.field_Z.dispatchKeyInput(ClassDescriptorSupport.field_c, (byte) -91, FixedQuaternion.field_e);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "pe.H(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        GameOverView.field_R = false;
        if (param0 != 0) {
          field_a = (String) null;
        }
    }

    final static boolean isInsideAnyArea(PlayArea[] param0, byte param1, int[] param2) {
        PlayArea[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        PlayArea var5 = null;
        int var6 = 0;
        PlayArea[] var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          if (param0 == null) {
            return true;
          }
          if (param1 >= -52) {
            return true;
          }
          var7 = param0;
          var3 = var7;
          var4 = 0;
          while (true) {
            if (var7.length <= var4) {
              return false;
            }
            var5 = var7[var4];
            if (!var5.containsPoint(param2[0], param2[1], 703166480, param2[2])) {
              var4++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("pe.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void renderMeshPreview(ModelMesh param0, Sprite param1, int param2, int param3) {
        try {
          PacketBuffer.a(-51, param1);
          SoftwareRasterizer.clearFramebuffer();
          if (param3 != 40) {
            int[] var5 = (int[]) null;
            MeshPreviewSupport.isInsideAnyArea((PlayArea[]) null, (byte) 103, (int[]) null);
          }
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setProjectionCenter(SoftwareRasterizer.field_g >> 1, 198);
          param0.a(0, 0, 0, 0, 0, 0, 0, 700);
          TeamManagementScreen.e(param3 + 77);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pe.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void setSharedAnimationFrameset(byte param0, AnimationFrameset param1) {
        if (param0 != 82) {
          return;
        }
        try {
          ModalStack.field_C = param1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        Trinket.setSoundEffectVolume(param0, (byte) -32);
        if (param1 >= -114) {
          Sprite var3 = (Sprite) null;
          MeshPreviewSupport.renderMeshPreview((ModelMesh) null, (Sprite) null, -104, -61);
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 7) {
          field_a = (String) null;
        }
    }

    static {
        field_b = "Instructions";
        field_a = "buy this pitch for <%0>";
        field_c = "This game ended too early. Rewards are reduced.";
    }
}
