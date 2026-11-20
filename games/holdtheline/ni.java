/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_b;
    static PaletteBitmapFont field_a;

    final static String repeatCharacter(char param0, byte param1, int param2) {
        int var5 = HoldTheLine.field_D;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        int var4 = 0;
        if (param1 != -125) {
          return (String) null;
        }
        while (var4 < param2) {
          var6[var4] = param0;
          var4++;
        }
        return new String(var6);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          ni.clearSharedReferences(87);
        }
        field_a = null;
    }

    final static int a(byte param0) {
        if (param0 >= -54) {
          ni.a((byte) -3);
        }
        if (PolarSortVector.field_d < 2) {
          return 0;
        }
        if (WidgetContainer.field_C != 0) {
          if (null != ml.field_a) {
            if (!ml.field_a.ensureIndexLoaded((byte) -107)) {
              return 14;
            }
            if (!ml.field_a.containsGroup("", true)) {
              return 29;
            }
            if (!ml.field_a.tryLoadNamedGroup("", 93)) {
              return 29;
            }
          }
          if (!IntrusiveDeque.field_d.ensureIndexLoaded((byte) -92)) {
            return 43;
          }
          if (!IntrusiveDeque.field_d.tryLoadNamedGroup("commonui", 104)) {
            return 57;
          }
          if (!LinkWidgetRenderer.field_d.ensureIndexLoaded((byte) -104)) {
            return 71;
          }
          if (!LinkWidgetRenderer.field_d.tryLoadNamedGroup("commonui", 59)) {
            return 80;
          }
          if (!ArchiveRequest.field_p.ensureIndexLoaded((byte) -76)) {
            return 82;
          }
          if (!ArchiveRequest.field_p.tryLoadAllGroups((byte) 77)) {
            return 86;
          }
        } else {
          if (!IntrusiveDeque.field_d.ensureIndexLoaded((byte) -92)) {
            return 20;
          }
          if (!IntrusiveDeque.field_d.tryLoadNamedGroup("commonui", -91)) {
            return 40;
          }
          if (!LinkWidgetRenderer.field_d.ensureIndexLoaded((byte) -66)) {
            return 50;
          }
          if (!LinkWidgetRenderer.field_d.tryLoadNamedGroup("commonui", 110)) {
            return 60;
          }
          if (!ArchiveRequest.field_p.ensureIndexLoaded((byte) -122)) {
            return 70;
          }
          if (!ArchiveRequest.field_p.tryLoadAllGroups((byte) -93)) {
            return 80;
          }
        }
        return 100;
    }

    static {
    }
}
