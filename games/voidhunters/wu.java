/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wu extends GpuMaterialEffect {
    private float field_f;
    static Sprite field_h;
    static String field_e;
    private rga field_g;

    final void applyRenderState(int param0, boolean param1) {
        if (param0 != 5) {
          return;
        }
        this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, OpenGlGlyphMask.field_a);
    }

    final void setParameters(int param0, int param1, int param2) {
        int var4;
        int var5;
        GpuTexture var6;
        int var4Lifetime1;
        var5 = VoidHunters.field_G;
        this.toolkit.setActiveTextureUnit(1, -124);
        if (param2 == 5) {
          if ((128 & param1) != 0) {
            this.toolkit.setTexture((GpuTexture) null, -123);
            this.toolkit.setActiveTextureUnit(0, -64);
            return;
          }
          if ((1 & param0) != 1) {
            if (!this.field_g.field_b) {
              this.toolkit.setTexture(this.field_g.field_a[0], -128);
            } else {
              this.toolkit.setTexture(this.field_g.field_d, -122);
            }
            this.toolkit.setActiveTextureUnit(0, -64);
            return;
          }
          if (this.field_g.field_b) {
            this.field_f = (float)(this.toolkit.field_pc % 4000) / 4000.0f;
            this.toolkit.setTexture(this.field_g.field_d, -118);
            this.toolkit.setActiveTextureUnit(0, -64);
            return;
          }
          var4 = this.toolkit.field_pc % 4000 * 16 / 4000;
          this.toolkit.setTexture(this.field_g.field_a[var4], param2 - 126);
          this.toolkit.setActiveTextureUnit(0, -64);
          return;
        }
        var6 = (GpuTexture) null;
        this.setTexture((byte) -1, -12, (GpuTexture) null);
        if ((128 & param1) != 0) {
          this.toolkit.setTexture((GpuTexture) null, -123);
        } else {
          if ((1 & param0) != 1) {
            if (!this.field_g.field_b) {
              this.toolkit.setTexture(this.field_g.field_a[0], -128);
            } else {
              this.toolkit.setTexture(this.field_g.field_d, -122);
            }
          } else {
            if (this.field_g.field_b) {
              this.field_f = (float)(this.toolkit.field_pc % 4000) / 4000.0f;
              this.toolkit.setTexture(this.field_g.field_d, -118);
            } else {
              var4Lifetime1 = this.toolkit.field_pc % 4000 * 16 / 4000;
              this.toolkit.setTexture(this.field_g.field_a[var4Lifetime1], param2 - 126);
            }
          }
        }
        this.toolkit.setActiveTextureUnit(0, -64);
        return;
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = 93 % ((-34 - param0) / 63);
        field_h = null;
        field_e = null;
    }

    wu(GpuToolkit param0, rga param1) {
        super(param0);
        this.field_f = 0.0f;
        try {
          this.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "wu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void enable(int param0, boolean param1) {
        this.toolkit.setActiveTextureUnit(1, param0 ^ -72);
        this.toolkit.setTextureCombineOperations(MissionVariable.field_c, true, je.field_c);
        this.toolkit.setRgbCombineSource(true, param0 ^ -21120, false, SetGrapplingHookMaxExtension8Force.field_q, 0);
        this.toolkit.setAlphaCombineSource(0, (byte) -101, pja.field_l);
        this.toolkit.setTextureCoordinateIndex(-34, 0);
        this.toolkit.setActiveTextureUnit(0, -79);
        this.toolkit.setTextureConstantColor(-128, -16777216);
        this.toolkit.setAlphaCombineSource(0, (byte) -111, pea.field_d);
        if (param0 == 5) {
          this.onTextureTransformChanged(param0 + 3);
          return;
        }
        this.onTextureTransformChanged(-88);
        this.onTextureTransformChanged(param0 + 3);
    }

    final boolean isSupported(byte param0) {
        int var2 = -105 % ((param0 - 34) / 63);
        return this.field_g.c((byte) 85);
    }

    final void disable(int param0) {
        this.toolkit.setActiveTextureUnit(1, -59);
        this.toolkit.setTextureCombineOperations(OpenGlGlyphMask.field_a, true, OpenGlGlyphMask.field_a);
        this.toolkit.setRgbCombineSource(0, SetGrapplingHookMaxExtension8Force.field_q, param0 ^ 2536);
        this.toolkit.setAlphaCombineSource(0, (byte) -101, SetGrapplingHookMaxExtension8Force.field_q);
        this.toolkit.setTextureCoordinateIndex(-70, 1);
        this.toolkit.setTexture((GpuTexture) null, -124);
        this.toolkit.setActiveTextureUnit(0, -62);
        this.toolkit.setAlphaCombineSource(0, (byte) -76, SetGrapplingHookMaxExtension8Force.field_q);
        if (param0 != 2543) {
          field_h = (Sprite) null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        int stackIn_22_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_77_0 = 0;
        String var2;
        String[] var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        int var6Lifetime1;
        int var5Lifetime2;
        int var6Lifetime2;
        var2 = IntIndexTable.field_a;
        if (var2 == null) {
          var2 = "You";
        }
        var3 = new String[]{var2};
        if (SetMissionResnetResourceTickTime.field_p == 1) {
          var3 = new String[]{var2, null, null, null, null, null};
        }
        var4 = 2;
        if (ssa.b(2)) {
          if (!SetMachineGunEnergyUsed.field_o[81]) {
            if (ssa.b(2) &&
              SetMachineGunEnergyUsed.field_o[82]) {
              var4 = 1;
            }
            if (!ssa.b(2)) {
              var5 = hob.a(new Random(), 2147483647, 117);
              if (param0) {
                var4 = 3;
                qqa.a(true, (byte) -41);
              }
              vqa.field_g = new GameSession(false, var3, 0, false, var4, var5, param0);
              GpuSprite.field_e = param1;
              di.field_l.a(false, -13027);
              var6 = mnb.field_d ? 1 : 0;
              stackIn_34_0 = (bqa.a(false)) ? 7 : 0;
              GetNebulaFadesOutWhenClose.a(stackIn_34_0, var6 != 0, (byte) -85, -1);
              SetMassDriverFireForce.field_o = false;
              GetSniperCannonProjectiles.field_p = false;
              GetMessageFadetime.field_o = true;
              GetThrusterSmallForce.field_o = true;
              if (SocketNetworkArchiveClient.g(-120)) {
                RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 71);
                SecondaryNodeQueue.field_b = GetRepairModePower.field_o;
              }
              return;
            }
            if (SetMachineGunEnergyUsed.field_o[86]) {
              param0 = true;
            }
            var5Lifetime2 = hob.a(new Random(), 2147483647, 117);
            if (param0) {
              var4 = 3;
              qqa.a(true, (byte) -41);
            }
            vqa.field_g = new GameSession(false, var3, 0, false, var4, var5Lifetime2, param0);
            GpuSprite.field_e = param1;
            di.field_l.a(false, -13027);
            var6Lifetime2 = mnb.field_d ? 1 : 0;
            stackIn_22_0 = (bqa.a(false)) ? 7 : 0;
            GetNebulaFadesOutWhenClose.a(stackIn_22_0, var6Lifetime2 != 0, (byte) -85, -1);
            SetMassDriverFireForce.field_o = false;
            GetSniperCannonProjectiles.field_p = false;
            GetMessageFadetime.field_o = true;
            GetThrusterSmallForce.field_o = true;
            if (SocketNetworkArchiveClient.g(-120)) {
              RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 71);
              SecondaryNodeQueue.field_b = GetRepairModePower.field_o;
            }
            return;
          }
          var4 = 0;
        }
        if (ssa.b(2) &&
          SetMachineGunEnergyUsed.field_o[82]) {
          var4 = 1;
        }
        if (!ssa.b(2)) {
          var5Lifetime1 = hob.a(new Random(), 2147483647, 117);
          if (param0) {
            var4 = 3;
            qqa.a(true, (byte) -41);
          }
          vqa.field_g = new GameSession(false, var3, 0, false, var4, var5Lifetime1, param0);
          GpuSprite.field_e = param1;
          di.field_l.a(false, -13027);
          var6Lifetime1 = mnb.field_d ? 1 : 0;
          stackIn_52_0 = (bqa.a(false)) ? 7 : 0;
          GetNebulaFadesOutWhenClose.a(stackIn_52_0, var6Lifetime1 != 0, (byte) -85, -1);
        } else {
          if (!SetMachineGunEnergyUsed.field_o[86]) {
            var5Lifetime1 = hob.a(new Random(), 2147483647, 117);
            if (param0) {
              var4 = 3;
              qqa.a(true, (byte) -41);
            }
            vqa.field_g = new GameSession(false, var3, 0, false, var4, var5Lifetime1, param0);
            GpuSprite.field_e = param1;
            di.field_l.a(false, -13027);
            var6Lifetime1 = mnb.field_d ? 1 : 0;
            stackIn_77_0 = (bqa.a(false)) ? 7 : 0;
            GetNebulaFadesOutWhenClose.a(stackIn_77_0, var6Lifetime1 != 0, (byte) -85, -1);
          } else {
            param0 = true;
            var5Lifetime1 = hob.a(new Random(), 2147483647, 117);
            if (param0) {
              var4 = 3;
              qqa.a(true, (byte) -41);
            }
            vqa.field_g = new GameSession(false, var3, 0, false, var4, var5Lifetime1, param0);
            GpuSprite.field_e = param1;
            di.field_l.a(false, -13027);
            var6Lifetime1 = mnb.field_d ? 1 : 0;
            stackIn_65_0 = (bqa.a(false)) ? 7 : 0;
            GetNebulaFadesOutWhenClose.a(stackIn_65_0, var6Lifetime1 != 0, (byte) -85, -1);
          }
        }
        SetMassDriverFireForce.field_o = false;
        GetSniperCannonProjectiles.field_p = false;
        GetMessageFadetime.field_o = true;
        GetThrusterSmallForce.field_o = true;
        if (SocketNetworkArchiveClient.g(-120)) {
          RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 71);
          SecondaryNodeQueue.field_b = GetRepairModePower.field_o;
        }
    }

    final void onTextureTransformChanged(int param0) {
        GpuTransform3D var2 = null;
        GpuTransform3D var3 = null;
        if (0 == this.toolkit.getActiveTextureUnit((byte) 9)) {
          var2 = this.toolkit.getTextureTransform(0);
          this.toolkit.setActiveTextureUnit(1, -90);
          var3 = this.toolkit.getTextureTransform((byte) 82);
          var3.set(var2, 16383);
          var3.scale(-3286, 0.125f, 0.125f, 1.0f);
          var3.translate(this.field_f, 0.0f, 0.0f, (byte) 13);
          this.toolkit.setTextureTransformMode(LoadSettings.field_o, true);
          this.toolkit.setActiveTextureUnit(0, -52);
        }
        if (param0 == 8) {
          return;
        }
        GpuTexture var4 = (GpuTexture) null;
        this.setTexture((byte) -37, 101, (GpuTexture) null);
    }

    final void setTexture(byte param0, int param1, GpuTexture param2) {
        try {
          this.toolkit.setTexture(param2, -124);
          if (param0 <= 42) {
            field_h = (Sprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "wu.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "<%0> has entered another game.";
    }
}
