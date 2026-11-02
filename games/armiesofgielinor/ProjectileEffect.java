/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ProjectileEffect {
    static IndexedSprite[] field_c;
    private boolean field_b;
    private int field_k;
    int field_d;
    int remainingTicks;
    private int effectKind;
    private int field_g;
    static String field_a;
    static RgbSprite[] field_h;
    private AnimationPlayer animationPlayer;
    static String[] field_j;

    final static int getCampaignPacketWord0(int obfuscationGuard) {
        if (obfuscationGuard > -46) {
          field_j = (String[]) null;
        }
        return ValidationStatusIcon.campaignPacketWord0;
    }

    final static ClientUiComponent c(int param0) {
        if (param0 != 0) {
          return (ClientUiComponent) null;
        }
        return ListMissionsConsoleCommand.field_E.listContent;
    }

    private final void a(int param0, int param1, boolean param2, byte param3) {
        int var8 = 0;
        int var5;
        int var6;
        int var7;
        int var9;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param3 != -44) {
          this.animationPlayer = (AnimationPlayer) null;
        }
        for (var8 = 0; var8 < 6; var8++) {
          if (var8 * 8 < this.remainingTicks) {
            if (param2) {
              var7 = -((this.remainingTicks - var8 * 4) * 2) + (this.field_k + AttackEvent.nextBoundedInt(false, var8 + 1, li.field_n));
              var5 = -(this.field_g - 5 * (-(4 * var8) + this.remainingTicks)) + AttackEvent.nextBoundedInt(false, var8 + 1, li.field_n);
              var6 = this.field_d;
            } else {
              var7 = this.field_k - 2 * (-24 + var8 * 4 + this.remainingTicks) + AttackEvent.nextBoundedInt(false, 1 + var8, li.field_n);
              var5 = -((var8 * 4 + (-24 + this.remainingTicks)) * 5) + (this.field_g + AttackEvent.nextBoundedInt(false, var8 + 1, li.field_n));
              var6 = this.field_d;
            }
            GrowableIntArray.$cfr$intArgs$a$e0bc7fdb2979(var7, -(var8 * 40) + 400, 56, GradientUiRenderer.particlePalettes[param0 + 1], -(5 * var8) + 63, var5, var6);
            continue;
          }
          break;
        }
    }

    final static nt a(int param0, int param1, int param2, int param3) {
        nt var4;
        int var5;
        nt var4Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = (nt) (s.field_a.first((byte) 112));
        while (var4 != null) {
          if (~var4.field_o == ~param0) {
            return var4;
          }
          var4 = (nt) (s.field_a.next((byte) 123));
        }
        if (param1 < 65) {
          field_j = (String[]) null;
        }
        var4Lifetime1 = new nt();
        var4Lifetime1.field_o = param0;
        var4Lifetime1.field_q = param2;
        s.field_a.addLast((byte) -119, (IntrusiveNode) (var4Lifetime1));
        tf.a(param3, var4Lifetime1, (byte) -64);
        return var4Lifetime1;
    }

    final boolean advance(int obfuscationGuard) {
        if (null != this.animationPlayer) {
          this.animationPlayer.advance(-94);
        }
        int var2 = 36 % ((10 - obfuscationGuard) / 61);
        if (this.remainingTicks > -1) {
          this.remainingTicks = this.remainingTicks - 5;
          if (this.remainingTicks < 0) {
            this.field_b = false;
            return true;
          }
        }
        return false;
    }

    public static void releaseStatics(int obfuscationGuard) {
        if (obfuscationGuard != 5) {
          return;
        }
        field_j = null;
        field_c = null;
        field_h = null;
        field_a = null;
    }

    private final void a(boolean param0, boolean param1, int param2) {
        int stackIn_8_0 = 0;
        ModelMesh stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        int stackIn_22_5;
        int stackIn_23_6 = 0;
        Object var4;
        ModelMesh var4_ref;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var4 = null;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param2 > ~this.remainingTicks) {
          return;
        }
        if (this.animationPlayer != null) {
          var4_ref = (ModelMesh) (this.animationPlayer.applyCurrentFrame(false, true, false, FullscreenConfirmationDialog.field_db[this.effectKind]));
        } else {
          var4_ref = (ModelMesh) (FullscreenConfirmationDialog.field_db[this.effectKind].a(false, false, false));
        }
        stackIn_8_0 = (!param0) ? 140 : 1908;
        var5 = stackIn_8_0;
        var6 = 1536;
        var7 = 0;
        var8 = 150;
        if (this.effectKind == 2) {
          var4_ref.scaleGeometry(256, 256, 256);
        }
        if (!param0) {
          var11 = -(this.remainingTicks * 2) + this.field_k;
          var9 = -(5 * this.remainingTicks) + this.field_g;
          var10 = this.field_d;
        } else {
          var10 = this.field_d;
          if (2 != this.effectKind) {
            var11 = -(2 * this.remainingTicks) + this.field_k;
          } else {
            var11 = this.field_k + 60;
          }
          var9 = -(-(5 * this.remainingTicks) + this.field_g);
        }
        if (param1) {
          ContextActionMenu.a(false, var4_ref);
        }
        stackIn_22_0 = var4_ref;
        stackIn_22_1 = var5;
        stackIn_22_2 = var6;
        stackIn_22_3 = var7;
        stackIn_22_4 = var8;
        stackIn_22_5 = var9;
        if (param1) {
          stackIn_23_6 = 600;
        } else {
          stackIn_23_6 = var11;
        }
        ((ModelMesh) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4, stackIn_22_5, stackIn_23_6, var10);
        return;
    }

    final void draw(boolean flag, int obfuscationGuard, boolean reverse, int paletteIndex) {
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -8) {
          field_j = (String[]) null;
        }
        if (this.field_b) {
          if (this.effectKind != 7) {
            if (this.effectKind < 8) {
              this.a(flag, reverse, obfuscationGuard ^ 299);
            } else {
              if (!reverse) {
                this.a(this.effectKind - 8, paletteIndex, flag, (byte) -44);
              }
            }
          } else {
            if (!reverse) {
              this.a(6, paletteIndex, flag);
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var7 = 0;
        int var4;
        int var5;
        int var6;
        int var8;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 6) {
          ProjectileEffect.getCampaignPacketWord0(52);
        }
        for (var7 = 0; var7 < 6; var7++) {
          if (20 * var7 < this.remainingTicks) {
            if (!param2) {
              var6 = -(2 * (this.remainingTicks - (-(var7 * 10) + 60))) + this.field_k;
              var5 = this.field_d;
              var4 = this.field_g - 5 * (-((-var7 + 6) * 10) + this.remainingTicks);
            } else {
              var4 = -(this.field_g - 5 * (this.remainingTicks - var7 * 10));
              var6 = -(2 * (this.remainingTicks - 10 * var7)) + this.field_k;
              var5 = this.field_d;
            }
            ConsoleEvaluationException.a(var5, ArrayWidgetContainer.field_F[(-var7 + this.remainingTicks / 20) % ArrayWidgetContainer.field_F.length], (-var7 + 6) * 256 / 6, -110, var4, var6);
            continue;
          }
          break;
        }
    }

    final void d(int param0) {
        if (param0 < 8) {
          this.field_b = false;
        }
        if (this.animationPlayer != null) {
          this.animationPlayer.advance(-96);
        }
        this.remainingTicks = this.remainingTicks + 5;
    }

    ProjectileEffect(int param0, int param1, int param2, int param3, int param4) {
        this.field_b = true;
        this.field_g = param0;
        this.remainingTicks = param3;
        this.effectKind = param4;
        this.field_k = param1;
        this.field_d = param2;
        if (this.effectKind == 0) {
          this.animationPlayer = new AnimationPlayer(1);
          this.animationPlayer.selectSequence(-1, AccountNameFoldingSupport.field_a[0][0]);
        }
        if (this.effectKind == 5) {
          this.animationPlayer = new AnimationPlayer(1);
          this.animationPlayer.selectSequence(-1, AccountNameFoldingSupport.field_a[5][0]);
        }
    }

    static {
        field_a = "Please remove <%0> from your ignore list first.";
        field_j = new String[]{"runewars_select_unit", "runewars_select_position", "runewars_errorsound", "runewars_capture_location"};
    }
}
