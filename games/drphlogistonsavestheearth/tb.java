/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static he field_d;
    static int field_c;
    static he[] field_b;
    static int field_a;

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeKeyListener(ji.field_c);
          param1.removeFocusListener(ji.field_c);
          gm.field_O = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "tb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String b(byte param0) {
        if (hj.field_f < 2) {
          return a.field_c;
        }
        if (DiskArchiveRequest.field_I != null) {
          if (!DiskArchiveRequest.field_I.ensureIndexLoaded(0)) {
            return TextLineMetrics.field_d;
          }
          return LabeledWidgetContainer.field_J;
        }
        if (!AccountCreationResultPanel.field_Jb.ensureIndexLoaded(0)) {
          return td.field_o;
        }
        if (!AccountCreationResultPanel.field_Jb.tryLoadGroupByName(255, "commonui")) {
          return sa.field_b + " - " + AccountCreationResultPanel.field_Jb.getGroupLoadPercentByName(10461, "commonui") + "%";
        }
        if (!sb.field_i.ensureIndexLoaded(0)) {
          return ByteStorage.field_d;
        }
        if (param0 != -81) {
          return (String) null;
        }
        if (!sb.field_i.tryLoadGroupByName(255, "commonui")) {
          return ij.field_a + " - " + sb.field_i.getGroupLoadPercentByName(param0 + 10542, "commonui") + "%";
        }
        if (!ig.field_t.ensureIndexLoaded(0)) {
          return ia.field_b;
        }
        if (!ig.field_t.tryLoadAllGroups((byte) 68)) {
          return PcmOutputWorker.field_a + " - " + ig.field_t.getArchiveLoadPercent((byte) 95) + "%";
        }
        return tl.field_J;
    }

    public static void clearStaticReferences(byte param0) {
        field_b = null;
        field_d = null;
        int var1 = 78 / ((param0 + 6) / 36);
    }

    static {
    }
}
