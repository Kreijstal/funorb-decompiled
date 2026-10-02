/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static la field_b;
    static boolean field_d;
    static String nextText;
    static String createAccountSuccessText;

    final static void a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var1;
        int var2;
        var2 = Geoblox.field_C;
        if (param0 <= -78) {
          if (null != ArchiveRequest.pendingActionMarkers.firstForIteration(0)) {
            var1 = kj.field_J;
            if (var1 == 0) {
              eh.pendingActionPanelTop = eh.pendingActionPanelTop - 1;
              if (eh.pendingActionPanelTop <= -10 - (tl.pendingActionPanelHeight - 480)) {
                h.field_d = 0;
                kj.field_J = 1;
                return;
              }
            } else {
              if (var1 == 1) {
                fieldTemp$4 = h.field_d;
                h.field_d = h.field_d + 1;
                if (fieldTemp$4 <= 450) {
                  return;
                }
                kj.field_J = 2;
                return;
              }
              if (var1 == 2) {
                fieldTemp$5 = eh.pendingActionPanelTop;
                eh.pendingActionPanelTop = eh.pendingActionPanelTop + 1;
                if (fieldTemp$5 > 480) {
                  ArchiveRequest.pendingActionMarkers.removeFirst((byte) -118);
                  gf.preparePendingActionPanel((byte) -12);
                  return;
                }
              }
            }
          }
          return;
        }
        lh.b(-5);
        if (null == ArchiveRequest.pendingActionMarkers.firstForIteration(0)) {
          return;
        }
        var1 = kj.field_J;
        if (var1 == 0) {
          eh.pendingActionPanelTop = eh.pendingActionPanelTop - 1;
          if (eh.pendingActionPanelTop > -10 - (tl.pendingActionPanelHeight - 480)) {
            return;
          }
          h.field_d = 0;
          kj.field_J = 1;
          return;
        }
        if (var1 == 1) {
          fieldTemp$6 = h.field_d;
          h.field_d = h.field_d + 1;
          if (fieldTemp$6 <= 450) {
            return;
          }
          kj.field_J = 2;
          return;
        }
        if (var1 != 2) {
          return;
        }
        {
          fieldTemp$7 = eh.pendingActionPanelTop;
          eh.pendingActionPanelTop = eh.pendingActionPanelTop + 1;
          if (fieldTemp$7 <= 480) {
            return;
          }
          ArchiveRequest.pendingActionMarkers.removeFirst((byte) -118);
          gf.preparePendingActionPanel((byte) -12);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -481) {
            lh.a(90);
            nextText = null;
            createAccountSuccessText = null;
            return;
        }
        nextText = null;
        createAccountSuccessText = null;
    }

    static {
        nextText = "Next";
        createAccountSuccessText = "Account created successfully!";
    }
}
