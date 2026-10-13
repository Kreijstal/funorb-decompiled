/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModalDialog extends DequeWidgetContainer {
    static String field_J;
    static RgbSprite groundShadowSprite;
    static String[] field_M;
    static ClientUiComponent field_K;
    static int field_E;
    static NodeDeque currentRoomPlayers;
    private int alpha;
    ModalDialogHost host;
    static String field_I;
    boolean open;

    final static MusicPatch loadMusicPatch(ResourceArchive archive, int patchId, boolean obfuscationGuard) {
        byte[] packedPatch = null;
        RuntimeException failure = null;
        byte[] packedPatchAlias = null;
        Object missingPatch = null;
        MusicPatch guardRejectedPatch = null;
        MusicPatch decodedPatch = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String archiveDescription = null;
        RuntimeException caughtFailure = null;
        try {
          packedPatchAlias = archive.getFlatFile(patchId, (byte) 81);
          packedPatch = packedPatchAlias;
          if (packedPatchAlias == null) {
            missingPatch = null;
            return (MusicPatch) (missingPatch);
          }
          if (obfuscationGuard) {
            decodedPatch = new MusicPatch(packedPatchAlias);
            return decodedPatch;
          }
          guardRejectedPatch = (MusicPatch) null;
          return guardRejectedPatch;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("wl.FA(");
          if (archive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(archiveDescription).append(',').append(patchId).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void setCenteredSize(int width, byte obfuscationGuard, int height) {
        if (obfuscationGuard < 95) {
          field_K = (ClientUiComponent) null;
        }
        this.setBounds(SoundPlaybackHandle.dialogViewportWidth - width >> 1, width, DebugConsole.dialogViewportHeight - height >> 1, 8192, height);
    }

    public static void f(byte param0) {
        field_I = null;
        field_M = null;
        groundShadowSprite = null;
        int var1 = -89 % ((8 - param0) / 57);
        field_K = null;
        currentRoomPlayers = null;
        field_J = null;
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        if (0 == this.alpha) {
          return;
        }
        if (this.alpha >= 256) {
          if (renderLayer != 0) {
            return;
          }
          this.drawDialogBackground(this.x + originX, 1851680193, originY + this.y);
          super.drawWidget(originX, originY, (byte) -121, renderLayer);
          return;
        }
        if (TutorialLayout.field_b == null ||
          !(this.width <= TutorialLayout.field_b.pixelWidth) ||
          !(TutorialLayout.field_b.pixelHeight >= this.height)) {
          TutorialLayout.field_b = new RgbSprite(this.width, this.height);
        }
        CombatSandbox.a(TutorialLayout.field_b, 3);
        SoftwareRaster.b();
        this.drawDialogBackground(0, 1851680193, 0);
        super.drawWidget(-originX - this.x, -originY - this.y, (byte) -106, renderLayer);
        QuickChatPhraseRepository.popRasterState(-18862);
        if (obfuscationGuard >= -82) {
          field_J = (String) null;
        }
        TutorialLayout.field_b.e(this.x + originX, this.y + originY, this.alpha);
    }

    final static int bitLength(int value, int obfuscationGuard) {
        int var2 = 0;
        if (value < 0 ||
          value >= 65536) {
          value = value >>> 16;
          var2 += 16;
        }
        if (value >= 256) {
          value = value >>> 8;
          var2 += 8;
        }
        if (value >= 16) {
          value = value >>> 4;
          var2 += 4;
        }
        if (obfuscationGuard != -13337) {
          field_K = (ClientUiComponent) null;
        }
        if (value >= 4) {
          value = value >>> 2;
          var2 += 2;
        }
        if (value >= 1) {
          var2++;
          value = value >>> 1;
        }
        return var2 + value;
    }

    boolean advanceDialogAnimation(byte obfuscationGuard) {
        int targetAlpha;
        int alphaDelta;
        boolean closedAndHidden = false;
        targetAlpha = this.getTargetAlpha((byte) 122);
        alphaDelta = -this.alpha + targetAlpha;
        if (0 < alphaDelta) {
          this.alpha = this.alpha + (-1 + (alphaDelta + 8)) / 8;
        }
        if (obfuscationGuard != -1) {
          field_K = (ClientUiComponent) null;
        }
        if (alphaDelta < 0) {
          this.alpha = this.alpha + (alphaDelta - 15) / 16;
        }
        closedAndHidden = (this.alpha == 0) && (targetAlpha == 0) && (!this.open);
        return closedAndHidden;
    }

    final Widget getFocusedChild(byte obfuscationGuard) {
        int discarded$0 = 0;
        Widget var2 = super.getFocusedChild((byte) 66);
        if (var2 != null) {
          return var2;
        }
        if (obfuscationGuard < 24) {
          discarded$0 = this.getTargetAlpha((byte) -91);
        }
        return (Widget) (this);
    }

    final static void a(int param0, boolean param1) {
        int var2;
        String var3;
        ResourceArchive var4;
        int stackIn_6_0 = 0;
        boolean stackIn_13_0 = false;
        String stackIn_22_0 = null;
        boolean stackIn_25_0 = false;
        String stackIn_25_1 = null;
        boolean stackIn_26_2 = false;
        if (fj.field_c) {
          stackIn_6_0 = (hf.textChatActive) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        if (param0 < 9) {
          var4 = (ResourceArchive) null;
          ModalDialog.loadMusicPatch((ResourceArchive) null, -105, true);
        }
        stackIn_13_0 = (param1) && (sq.c((byte) -103)) && (var2 == 0);
        tq.a(stackIn_13_0, false);
        if (null != rd.gameplayController) {
          rd.gameplayController.b(0, param1);
        }
        if (null != SectorCacheStore.field_a) {
          SectorCacheStore.field_a.b(0, param1);
        }
        fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, HuffmanCodec.field_i, ConsoleValue.field_b, 0, 0);
        if (var2 != 0) {
          if (!ChannelFadeTimeConsoleCommand.field_F) {
            stackIn_22_0 = CampaignMenu.field_q;
          } else {
            stackIn_22_0 = l.field_d;
          }
          var3 = stackIn_22_0;
          stackIn_25_0 = false;
          stackIn_25_1 = var3;
          stackIn_26_2 = (param1) && (sq.c((byte) -103));
          RevivalEvent.a(stackIn_25_0, stackIn_25_1, stackIn_26_2);
        }
    }

    private final int getTargetAlpha(byte obfuscationGuard) {
        if (obfuscationGuard != 122) {
          this.alpha = -92;
        }
        return !this.open ? 0 : this == this.host.getTopOpenDialog((byte) 89) ? 256 : 0;
    }

    boolean snapDialogAnimation(int obfuscationGuard) {
        int guardQuotient;
        boolean closedAndHidden = false;
        this.alpha = this.getTargetAlpha((byte) 122);
        guardQuotient = -85 / ((obfuscationGuard + 1) / 44);
        closedAndHidden = (this.alpha == 0) && (!this.open);
        return closedAndHidden;
    }

    abstract void drawDialogBackground(int x, int obfuscationGuard, int y);

    ModalDialog(ModalDialogHost host, int width, int height) {
        super(SoundPlaybackHandle.dialogViewportWidth - width >> 1, DebugConsole.dialogViewportHeight - height >> 1, width, height, (WidgetPainter) null);
        try {
          this.host = host;
          this.open = false;
          this.alpha = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wl.<init>(" + (host != null ? "{...}" : "null") + ',' + width + ',' + height + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var1_intLifetime1;
        try {
          qc.field_h.a(param0);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            AiActionCandidate.field_u[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            CampaignMission.field_r[var1_intLifetime1] = 0L;
          }
          Widget.field_A = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wl.GA(" + param0 + ')');
        }
    }

    static {
        field_J = "Use this alternative as your account name";
        field_M = new String[]{"trinket_armour_camouflage", "trinket_armour_dragonscale", "trinket_armour_enchanted", "trinket_armour_padded", "trinket_armour_plate", "trinket_armour_runic", "trinket_armour_sacrificial", "trinket_magic", "trinket_melee", "trinket_ranged", "trinket_aerial_talons", "trinket_flame", "trinket_flag", "trinket_grappling_hook", "trinket_soul_stone", "trinket_waders_and_elidin_boots", "trinket_fortify", "trinket_revolt", "trinket_curse", "trinket_potion", "trinket_cyclops_eyedrops", "trinket_elven_lozenge", "trinket_ogre_charcoal", "trinket_kalphite_eggsack", "trinket_goblin_hallucinogen", "trinket_vampire_blood", "trinket_mitosis", "trinket_prayer", "trinket_prayer_kbd_restore", "trinket_raise_single_dead", "trinket_raise_area_dead", "trinket_spiritual_barrier", "trinket_landscaping_build_bridge", "trinket_landscaping_forest_haven", "trinket_landscaping_mountain_crumble", "trinket_landscaping_river_haven", "trinket_landscaping_swamp_haven", "trinket_spell_harming_magicbolt", "trinket_spell_harming_rain_of_fire", "trinket_prayer_aura", "trinket_prayer_ray", "trinket_teleport", "trinket_interface_collapse", "trinket_interface_expand", "trinket_interface_collapse_short", "trinket_interface_expand_short", "trinket_ring_of_life_reappear"};
    }
}
