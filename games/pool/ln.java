/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends IntrusiveNode {
    static String tutorialHide;
    static UiComponent field_q;
    static String[] field_r;
    static DualLinkNodeHashTable field_n;
    static UiComponent[] field_v;
    static int field_o;
    static Sprite[] field_s;
    static int field_t;
    static boolean field_p;
    static int[] field_m;
    static SceneNode[] field_u;

    private ln() throws Throwable {
        throw new Error();
    }

    final static Sprite[] a(int param0, byte param1, ResourceArchive param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!TextLineLayout.a(param0, param2, param3, (byte) 121)) {
            return null;
          }
          var4_int = -39 / ((param1 + 12) / 57);
          stackIn_4_0 = ThemeSelectScreen.h(152);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ln.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void recenterModel(int[] param0, int param1, MeshBuilder param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var7 = Pool.field_O;
        try {
          d.computeMeshBounds(param2, -23109);
          var4 = (param2.field_D + param2.field_w) / 2;
          var5 = (param2.field_y + param2.field_S) / 2;
          var6 = (param2.field_x + param2.field_V) / 2;
          for (var3_int = 0; param2.vertexX.length > var3_int; var3_int++) {
            param2.vertexX[var3_int] = param2.vertexX[var3_int] - var4;
          }
          for (var3_intLifetime1 = param1; var3_intLifetime1 < param2.vertexY.length; var3_intLifetime1++) {
            param2.vertexY[var3_intLifetime1] = param2.vertexY[var3_intLifetime1] - var5;
          }
          for (var3_intLifetime2 = 0; param2.vertexZ.length > var3_intLifetime2; var3_intLifetime2++) {
            param2.vertexZ[var3_intLifetime2] = param2.vertexZ[var3_intLifetime2] - var6;
          }
          param0[0] = var4;
          param0[2] = var6;
          param0[1] = var5;
          param2.clearCaches();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ln.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        field_q = null;
        field_r = null;
        field_u = null;
        field_v = null;
        field_s = null;
        field_n = null;
        tutorialHide = null;
        if (param0 != 27817) {
          field_m = (int[]) null;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
          tutorialHide = (String) null;
        }
        ph.a((byte) 118);
    }

    static {
        tutorialHide = "Hide";
        field_m = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_t = 0;
    }
}
