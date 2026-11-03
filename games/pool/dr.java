/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr {
    static int field_f;
    static int field_b;
    static int field_c;
    static nl field_a;
    static Sprite field_d;
    static String tutorialEightBallBreak;

    final static void loadFinalFrame(byte param0, ResourceArchive param1) {
        Sprite var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new Sprite(param1.getFileByName(false, "", "final_frame.jpg"), (java.awt.Component) ((Object) TimeTrialSelectScreen.field_K));
          var3 = var2.field_z;
          var4 = var2.field_A;
          uc.pushRasterSnapshot((byte) -6);
          SpaceObject.field_k = new Sprite(var3, 3 * var4 / 4);
          SpaceObject.field_k.bindAsRenderTarget();
          var2.a(0, 0);
          ArchiveLoadStep.field_k = new Sprite(var3, -SpaceObject.field_k.field_A + var4);
          ArchiveLoadStep.field_k.bindAsRenderTarget();
          var2.a(0, -SpaceObject.field_k.field_A);
          ArchiveLoadStep.field_k.field_B = SpaceObject.field_k.field_A;
          TriangleMesh.a(125);
          if (param0 <= -48) {
            return;
          }
          tutorialEightBallBreak = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("dr.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void openPlayerContextMenu(String param0, int param1, long param2, int param3, ScrollPane param4, String param5, int param6, UiComponent param7, int[] param8) {
        try {
          WidgetStyleLayer.field_c = param4;
          if (param6 != 32540) {
            tutorialEightBallBreak = (String) null;
          }
          PlasmaBallSkin.field_m = new PlayerContextMenu(param7, param2, param5, param0, param3, param1, param8);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dr.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, int param2, int param3, String param4) {
        TimeTrialSelectScreen.field_J.width = TimeTrialSelectScreen.field_J.width + NineBallRules.field_j.width;
        if (param1 != 11468) {
          return;
        }
        try {
          TimeTrialSelectScreen.field_J.textColor = param2;
          TimeTrialSelectScreen.field_J.text = param4;
          TimeTrialSelectScreen.field_J.textSuffix = param0;
          NineBallRules.field_j.localX = NineBallRules.field_j.localX + NineBallRules.field_j.width;
          NineBallRules.field_j.width = param3;
          TimeTrialSelectScreen.field_J.width = TimeTrialSelectScreen.field_J.width - NineBallRules.field_j.width;
          NineBallRules.field_j.localX = NineBallRules.field_j.localX - NineBallRules.field_j.width;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "dr.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 11468) {
          return;
        }
        field_d = null;
        field_a = null;
        tutorialEightBallBreak = null;
    }

    static {
        field_b = 11468;
        field_f = NameEntryPopup.a(6429081, false, field_b);
        field_a = new nl();
        tutorialEightBallBreak = "Now let's \"break\": Shoot the cue ball at the rack (the triangle of balls) now.";
    }
}
