/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPhasedEnergyBeamAimspeed extends ConsoleCommand {
    static int field_q;
    static java.awt.Image field_p;
    static String field_o;

    public static void clearSharedReferences(int param0) {
        field_p = null;
        if (param0 != 0) {
          SetPhasedEnergyBeamAimspeed.a(48, false);
          field_o = null;
          return;
        }
        field_o = null;
    }

    SetPhasedEnergyBeamAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(124, 62, arguments[0].intValue(93));
          if (obfuscationGuard > -119) {
            SetPhasedEnergyBeamAimspeed.clearSharedReferences(-23);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nda.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        Widget stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        Widget stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        Widget stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        Widget stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        Widget stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        Widget stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        Widget stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        Widget stackIn_46_0 = null;
        boolean stackIn_47_1 = false;
        Widget stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        Widget stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        Widget stackIn_66_0 = null;
        boolean stackIn_67_1 = false;
        Widget stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        Widget stackIn_79_0 = null;
        boolean stackIn_80_1 = false;
        Widget stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        Widget stackIn_88_0 = null;
        boolean stackIn_89_1 = false;
        Widget stackIn_92_0 = null;
        boolean stackIn_93_1 = false;
        if (param0 < -111) {
          SelectableIconLabelWidget.pushClip(SoftwareRasterizer2D.width + 640 >> 1, SoftwareRasterizer2D.height, SoftwareRasterizer2D.width - 640 >> 1, true, 0);
          if (0 < SoftwareTransform3D.field_b) {
            if (null != kl.field_c) {
              kl.field_c.drawOpaque(tb.field_a.x, 0);
            }
            stackIn_66_0 = tb.field_a;
            stackIn_67_1 = (param1) && (!TutorialController.field_d);
            ((Widget) (Object) stackIn_66_0).draw(stackIn_67_1, -109);
            stackIn_70_0 = ModelFaceAttachment.field_d;
            stackIn_71_1 = (param1) && (!TutorialController.field_d);
            ((Widget) (Object) stackIn_70_0).draw(stackIn_71_1, 113);
          }
          if (!(CarouselPlayerEventFactory.field_a <= 0) ||
            !(SetExplosionPushMultiplier.field_p <= 0)) {
            if (null == kl.field_c) {
              stackIn_79_0 = WaterTextures.field_g;
              stackIn_80_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
              ((Widget) (Object) stackIn_79_0).draw(stackIn_80_1, 101);
              stackIn_83_0 = vva.field_r;
              stackIn_84_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
              ((Widget) (Object) stackIn_83_0).draw(stackIn_84_1, 101);
            } else {
              kl.field_c.drawOpaque(WaterTextures.field_g.x, 0);
              stackIn_88_0 = WaterTextures.field_g;
              stackIn_89_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
              ((Widget) (Object) stackIn_88_0).draw(stackIn_89_1, 101);
              stackIn_92_0 = vva.field_r;
              stackIn_93_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
              ((Widget) (Object) stackIn_92_0).draw(stackIn_93_1, 101);
            }
          }
        } else {
          field_p = (java.awt.Image) null;
          SelectableIconLabelWidget.pushClip(SoftwareRasterizer2D.width + 640 >> 1, SoftwareRasterizer2D.height, SoftwareRasterizer2D.width - 640 >> 1, true, 0);
          if (0 < SoftwareTransform3D.field_b) {
            if (null != kl.field_c) {
              kl.field_c.drawOpaque(tb.field_a.x, 0);
            }
            stackIn_9_0 = tb.field_a;
            stackIn_10_1 = (param1) && (!TutorialController.field_d);
            ((Widget) (Object) stackIn_9_0).draw(stackIn_10_1, -109);
            stackIn_13_0 = ModelFaceAttachment.field_d;
            stackIn_14_1 = (param1) && (!TutorialController.field_d);
            ((Widget) (Object) stackIn_13_0).draw(stackIn_14_1, 113);
          }
          if (CarouselPlayerEventFactory.field_a > 0) {
            if (null == kl.field_c) {
              stackIn_20_0 = WaterTextures.field_g;
              stackIn_21_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
              ((Widget) (Object) stackIn_20_0).draw(stackIn_21_1, 101);
              stackIn_24_0 = vva.field_r;
              stackIn_25_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
              ((Widget) (Object) stackIn_24_0).draw(stackIn_25_1, 101);
            } else {
              kl.field_c.drawOpaque(WaterTextures.field_g.x, 0);
              stackIn_29_0 = WaterTextures.field_g;
              stackIn_30_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
              ((Widget) (Object) stackIn_29_0).draw(stackIn_30_1, 101);
              stackIn_33_0 = vva.field_r;
              stackIn_34_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
              ((Widget) (Object) stackIn_33_0).draw(stackIn_34_1, 101);
            }
          } else {
            if (SetExplosionPushMultiplier.field_p > 0) {
              if (null == kl.field_c) {
                stackIn_42_0 = WaterTextures.field_g;
                stackIn_43_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
                ((Widget) (Object) stackIn_42_0).draw(stackIn_43_1, 101);
                stackIn_46_0 = vva.field_r;
                stackIn_47_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
                ((Widget) (Object) stackIn_46_0).draw(stackIn_47_1, 101);
              } else {
                kl.field_c.drawOpaque(WaterTextures.field_g.x, 0);
                stackIn_51_0 = WaterTextures.field_g;
                stackIn_52_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
                ((Widget) (Object) stackIn_51_0).draw(stackIn_52_1, 101);
                stackIn_55_0 = vva.field_r;
                stackIn_56_1 = (param1) && (!GetTorpedoProjectileDamage.field_o);
                ((Widget) (Object) stackIn_55_0).draw(stackIn_56_1, 101);
              }
            }
          }
        }
        bia.popRasterState((byte) 124);
    }

    static {
        field_q = 0;
        field_o = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
