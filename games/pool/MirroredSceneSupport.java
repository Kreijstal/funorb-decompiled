/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MirroredSceneSupport {
    static UiComponent field_b;
    static String youCanNotSpectate;
    static PcmSample field_a;
    static String youAreOnYourLastLife;

    final static void buildMirroredSceneEntries(SceneNode[] param0, boolean param1, int param2, int param3, MeshBuilder param4, int param5, int param6) {
        MeshBuilder var8 = null;
        int[] var19 = null;
        int[] var14 = null;
        int[] var10 = null;
        int[] var7 = null;
        int[] var20 = null;
        int[] var16 = null;
        int[] var12 = null;
        int[] var7Lifetime1;
        try {
          var8 = Cp1252DecodingSupport.mirrorVertically(true, new MeshBuilder(param4, false, false, false, false));
          var19 = TransformSupport.identityTransform(-31121);
          var19[0] = param5;
          var19[1] = param2;
          var19[2] = param3;
          param0[0 + param6] = SceneNodeFactory.createSceneNode(new MeshBuilder(param4, false, false, false, false), var19, (byte) 101);
          var14 = TransformSupport.identityTransform(-31121);
          var10 = var14;
          var7 = var10;
          var14[2] = param3;
          var7[1] = -param2;
          var14[0] = param5;
          param0[param6 + 1] = SceneNodeFactory.createSceneNode(new MeshBuilder(var8, false, false, param1, false), var14, (byte) 101);
          var20 = TransformSupport.identityTransform(-31121);
          var20[0] = param5;
          var20[1] = param2;
          var20[2] = param3;
          TransformRotationSupport.rotateTransformHalfTurnZ((byte) 53, var20);
          param0[param6 + 2] = SceneNodeFactory.createSceneNode(new MeshBuilder(param4, false, false, false, false), var20, (byte) 101);
          var16 = TransformSupport.identityTransform(-31121);
          var12 = var16;
          var7Lifetime1 = var12;
          var16[2] = param3;
          var7Lifetime1[1] = -param2;
          var16[0] = param5;
          TransformRotationSupport.rotateTransformHalfTurnZ((byte) -115, var16);
          param0[param6 + 3] = SceneNodeFactory.createSceneNode(var8, var16, (byte) 101);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "bh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void showDefaultLoginForm(boolean obfuscationGuard) {
        String var2 = (String) null;
        AccountDisplayNameSupport.showLoginForm((String) null, -128, LoginPayload.field_d);
        if (obfuscationGuard) {
          field_a = (PcmSample) null;
        }
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_b = null;
        youAreOnYourLastLife = null;
        if (param0) {
          MirroredSceneSupport.releaseStatics(true);
          youCanNotSpectate = null;
          return;
        }
        youCanNotSpectate = null;
    }

    static {
        youAreOnYourLastLife = "You are on your last life!";
        youCanNotSpectate = "No spectators";
    }
}
