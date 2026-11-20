/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialAction {
    int field_h;
    static volatile boolean field_a;
    static AccountCreationForm field_b;
    int field_e;
    int field_k;
    int field_d;
    int opcode;
    static long field_g;
    static ll field_f;
    static int[] field_j;
    static int field_i;

    final static void a(byte param0, boolean param1, boolean param2) {
        String var4 = null;
        String var4Lifetime1;
        if (param0 < -87) {
          var4 = (String) null;
          DropTargetWidget.showLoginFormWithIntGuard(param1, 121, (String) null, param2);
          return;
        }
        field_i = -67;
        var4Lifetime1 = (String) null;
        DropTargetWidget.showLoginFormWithIntGuard(param1, 121, (String) null, param2);
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        field_j = null;
        field_f = null;
        if (param0 >= -16) {
          TutorialAction.a((byte) 29, true, false);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        Sprite[] var5 = jc.field_h;
        Sprite var6 = ij.a(param3 - 8137, param2, var5, param4);
        if (param3 == 41) {
          param0 = param0 - (var6.width - param2 >> 1);
          param1 = param1 - (var6.height - param4 >> 1);
          var6.draw(param0, param1);
          return;
        }
        TutorialAction.a(78, -110, -63, (byte) -36, 2);
        param0 = param0 - (var6.width - param2 >> 1);
        param1 = param1 - (var6.height - param4 >> 1);
        var6.draw(param0, param1);
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2113942113) {
            field_f = (ll) null;
          }
          stackIn_5_0 = (LoadProgressDialog.a(param1, 85) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("cg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ArchiveLoadStage.field_d;
        synchronized (var1) {
          RoadStripRenderer.field_f = ResizableDialog.field_R;
          SpriteAsset.field_a = SpriteAsset.field_a + 1;
          NodeHashTableIterator.field_g = Vector2f.field_f;
          FullscreenErrorDialog.field_X = LinearPointPath.field_m;
          PointLight.field_k = LoginCredentials.field_a;
          LoginCredentials.field_a = false;
          ValidationIndicator.field_J = DelegatingCanvas.field_a;
          TrackBoundary.field_x = IterableNodeHashTable.field_e;
          ValidatedTextField.field_U = FullscreenDisplayMode.field_f;
          DelegatingCanvas.field_a = 0;
        }
        if (param0 == 1983) {
          return;
        }
        field_j = (int[]) null;
    }

    static {
        field_a = true;
        field_f = new ll();
        field_i = 20;
        field_j = new int[8192];
    }
}
