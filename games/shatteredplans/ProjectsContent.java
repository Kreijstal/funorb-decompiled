/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProjectsContent implements MenuContent {
    static String field_a;
    MenuLabel[] field_b;
    MenuList[] field_c;
    static mp field_g;
    static int[] field_f;
    static double field_e;
    static double field_d;

    final static void b(byte param0) {
        int var2 = 0;
        nf var1 = null;
        tm var2_ref_tm = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = DialWidget.i(0);
          if (var1 != null &&
            var1 != StandardMapGenerator.field_j) {
            no.a(StandardMapGenerator.field_j, 1);
            StandardMapGenerator.field_j = var1;
          }
          if (RasterBuffer.field_a < 18) {
            RasterBuffer.field_a = RasterBuffer.field_a + 1;
          }
          if (RasterBuffer.field_a >= 18) {
            RasterBuffer.field_a = 18;
            var2_ref_tm = (tm) (ld.field_p.pollFirst(35));
            if (var2_ref_tm != null) {
              NanoFrameTimer.a(var2_ref_tm, true);
            }
          }
          if (param0 > -126) {
            field_g = (mp) null;
          }
          for (var2 = 0; var2 < PlacementEvent.field_l.length; var2++) {
            if (PlacementEvent.field_l[var2] != null) {
              PlacementEvent.field_l[var2].a(256);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1_ref), "rh.B(" + param0 + ')');
        }
    }

    public static void clearStatics(int param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        if (param0 != 5) {
          field_e = 0.9834237462567611;
        }
    }

    final static void a(byte param0) {
        ai.a(3);
        if (param0 > -119) {
          return;
        }
        DerelictMapGenerator.c(-113);
        DialogRoot.field_G = null;
        jp.g((byte) 122);
    }

    public ProjectsContent() {
        this.field_b = new MenuLabel[4];
        this.field_c = new MenuList[4];
    }

    static {
        field_a = "New Game";
        field_f = new int[]{0, 5, 39, 72, 67, 33};
        field_g = new mp();
        field_e = Math.cos(0.5235987755982988);
        field_d = 1.0 / field_e;
    }
}
