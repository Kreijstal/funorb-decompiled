/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChooseRewardFactory implements BitDecodableFactory {
    static float field_a;

    final static boolean a(int param0, boolean param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var60;
        String var61;
        String var62;
        String var63;
        String var64;
        String var65;
        String var66;
        String var67;
        String var68;
        String var69;
        Object var70;
        Object var71;
        Object var72;
        CharSequence var73;
        int var5Lifetime1;
        var70 = null;
        var71 = null;
        var72 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        var3 = param1 ? 1 : 0;
        if (!CrossedSineBandsOperator.field_v &&
          SimpleMoveLocomotor.field_s == null) {
          var3 = 0;
        }
        if (OpenGlUnderwaterEffect.field_q == 0 &&
          WaveformOperator.field_n != null) {
          var3 = 0;
        }
        if (OpenGlUnderwaterEffect.field_q == 2 &&
          !DisplaySettingsDialog.f(24316)) {
          var3 = 0;
        }
        if (MenuEntry.field_h == 84) {
          if (var3 == 0) {
            if (OpenGlUnderwaterEffect.field_q == 0) {
              return true;
            }
            PlayerProfile.a(true);
            return true;
          }
          if (WeaveOperator.field_n.length() <= 0) {
            PlayerProfile.a(true);
            return true;
          }
          var4_ref_String = WeaveOperator.field_n.toString();
          if (lt.containsFilterText(var4_ref_String, -1)) {
            var13 = (String) null;
            var12 = (String) null;
            TreasureValuesOverlay.a(0, param1, (String) null, InvertOperator.field_m, (String) null, 2);
            var15 = (String) null;
            var14 = (String) null;
            TreasureValuesOverlay.a(0, true, (String) null, mm.field_f, (String) null, 2);
            PlayerProfile.a(true);
            return true;
          }
          var5 = OpenGlUnderwaterEffect.field_q;
          if (var5 == 0 &&
            null != C2SChooseRewardPacket.field_a) {
            var5 = 1;
          }
          if (Transform3D.a(var5, -20011) == 2) {
            MazeGenerator.a(var5, param2, (byte) 108, 1);
          }
          ResultsPhase.a(OpenGlUnderwaterEffect.field_q, var4_ref_String, param0, 32371, wp.field_a, -1);
          PlayerProfile.a(true);
          return true;
        }
        if (MenuEntry.field_h == 85) {
          if (var3 == 0) {
            return true;
          }
          if (WeaveOperator.field_n.length() <= 0) {
            return true;
          }
          DarknessBehaviour.padTo(-1 + WeaveOperator.field_n.length(), ' ', -11, WeaveOperator.field_n);
          return true;
        }
        var4 = HardwareOpenGlToolkit.field_td;
        if (!RasterShape.isPrintableCharacter((byte) -126, (char) var4)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (WeaveOperator.field_n.length() >= 80) {
          return true;
        }
        discarded$0 = WeaveOperator.field_n.append((char) var4);
        var5Lifetime1 = 485;
        var60 = MenuEntry.field_k;
        var16 = ima.prefixRightsIcon(var60, (byte) 8);
        var64 = var16;
        if (OpenGlUnderwaterEffect.field_q != 2) {
          var7 = "";
          if (0 == OpenGlUnderwaterEffect.field_q) {
            if (null == C2SChooseRewardPacket.field_a) {
              if (!PlayerInputQueue.field_c) {
                if (C2SChooseRewardPacket.field_a != null) {
                  if (kp.field_c &&
                    tla.field_f != null) {
                    var63 = "[" + tla.field_f + "] ";
                    var65 = var63 + var64 + ": ";
                    var5Lifetime1 = var5Lifetime1 - PlatformBehaviour.field_s.stringWidth(var65);
                    if (var5Lifetime1 >= PlatformBehaviour.field_s.stringWidth(WeaveOperator.field_n.toString())) {
                      return true;
                    }
                    DarknessBehaviour.padTo(WeaveOperator.field_n.length() - 1, ' ', -11, WeaveOperator.field_n);
                    return true;
                  }
                  var7 = "[" + LegacyOpenGlFlowingWaterEffect.formatText(94, UiComponent.field_nb, new String[]{C2SChooseRewardPacket.field_a.field_tb}) + "] ";
                }
                var66 = var7 + var64 + ": ";
                var5Lifetime1 = var5Lifetime1 - PlatformBehaviour.field_s.stringWidth(var66);
                if (var5Lifetime1 >= PlatformBehaviour.field_s.stringWidth(WeaveOperator.field_n.toString())) {
                  return true;
                }
                DarknessBehaviour.padTo(WeaveOperator.field_n.length() - 1, ' ', -11, WeaveOperator.field_n);
                return true;
              }
              var7 = "[" + cla.field_o + "] ";
            }
            if (C2SChooseRewardPacket.field_a != null) {
              if (kp.field_c &&
                tla.field_f != null) {
                var67 = "[" + tla.field_f + "] ";
                var68 = var67 + var64 + ": ";
                var5Lifetime1 = var5Lifetime1 - PlatformBehaviour.field_s.stringWidth(var68);
                if (var5Lifetime1 >= PlatformBehaviour.field_s.stringWidth(WeaveOperator.field_n.toString())) {
                  return true;
                }
                DarknessBehaviour.padTo(WeaveOperator.field_n.length() - 1, ' ', -11, WeaveOperator.field_n);
                return true;
              }
              var7 = "[" + LegacyOpenGlFlowingWaterEffect.formatText(94, UiComponent.field_nb, new String[]{C2SChooseRewardPacket.field_a.field_tb}) + "] ";
            }
          }
          var69 = var7 + var64 + ": ";
          var5Lifetime1 = var5Lifetime1 - PlatformBehaviour.field_s.stringWidth(var69);
        } else {
          var73 = (CharSequence) ((Object) wp.field_a);
          var61 = LegacyOpenGlFlowingWaterEffect.formatText(115, TrackMountComponent.field_G, new String[]{wt.normalizeBase37Name(30433, var73)});
          var62 = LegacyOpenGlFlowingWaterEffect.formatText(102, li.field_a, new String[]{var16});
          var9 = PlatformBehaviour.field_s.stringWidth(var61);
          var10 = PlatformBehaviour.field_s.stringWidth(var62);
          if (var9 > var10) {
            var5Lifetime1 = var5Lifetime1 - var9;
          } else {
            var5Lifetime1 = var5Lifetime1 - var10;
          }
        }
        if (var5Lifetime1 >= PlatformBehaviour.field_s.stringWidth(WeaveOperator.field_n.toString())) {
          return true;
        }
        DarknessBehaviour.padTo(WeaveOperator.field_n.length() - 1, ' ', -11, WeaveOperator.field_n);
        return true;
    }

    public final BitDecodable[] createArray(int param0, int param1) {
        if (param1 != -26955) {
          this.create((byte) -119);
          return (BitDecodable[]) ((Object) new CommonChooseReward[param0]);
        }
        return (BitDecodable[]) ((Object) new CommonChooseReward[param0]);
    }

    public final BitDecodable create(byte param0) {
        if (param0 > -17) {
          return (BitDecodable) null;
        }
        return (BitDecodable) ((Object) new CommonChooseReward());
    }

    static {
    }
}
