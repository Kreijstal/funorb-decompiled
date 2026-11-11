/*
 * Decompiled by CFR-JS 0.4.0.
 */
class of {
    static String field_a;

    final static ResourceArchive getOrOpenArchive(boolean param0, int param1) {
        if (param0) {
          return (ResourceArchive) null;
        }
        if (ck.field_a != null) {
          return ck.field_a;
        }
        if (param1 != -1) {
          return nt.openArchive(param1, 1, 5200, false, true, true);
        }
        return ck.field_a;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        int var1 = 27 % ((34 - param0) / 50);
    }

    final static String getVisibleTooltipText(int param0) {
        if (HardwareOpenGlToolkit.field_pd) {
          if (param0 != 1) {
            of.getVisibleTooltipText(97);
            return null;
          }
          return null;
        }
        if (WhiteNoiseOperator.field_m > fr.field_c) {
          if (param0 != 1) {
            of.getVisibleTooltipText(97);
            return null;
          }
          return null;
        }
        if (fr.field_c < WhiteNoiseOperator.field_m + LightSourceModel.field_p) {
          return MazeComponent.field_F;
        }
        if (param0 != 1) {
          of.getVisibleTooltipText(97);
          return null;
        }
        return null;
    }

    static {
        field_a = "Ignore";
    }
}
