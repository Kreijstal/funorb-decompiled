/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static String fsButtonTryagain;
    static UiComponent field_c;
    static int field_a;

    final static void a(String param0, boolean param1) {
        try {
          if (!param1) {
            hg.getTopLevelContainer(true);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        int var4Lifetime1;
        if (param0 == 0) {
          UiComponentNode.field_C.draw(param1, param3);
          if (!param2) {
            return;
          }
          var4 = PoolMatchController.field_X % UiComponentNode.field_C.field_z * 2;
          if (var4 >= UiComponentNode.field_C.field_z) {
            var4 = UiComponentNode.field_C.field_z + (-var4 + UiComponentNode.field_C.field_z);
          }
          if (10 > var4) {
            var4 = 10;
          } else {
            if (-40 + UiComponentNode.field_C.field_z < var4) {
              var4 = -40 + UiComponentNode.field_C.field_z;
            }
          }
          wf.a(-68, 80, 0, UiComponentNode.field_C, var4, 0, param1, 30, param3);
          return;
        }
        fsButtonTryagain = (String) null;
        UiComponentNode.field_C.draw(param1, param3);
        if (!param2) {
          return;
        }
        var4Lifetime1 = PoolMatchController.field_X % UiComponentNode.field_C.field_z * 2;
        if (var4Lifetime1 >= UiComponentNode.field_C.field_z) {
          var4Lifetime1 = UiComponentNode.field_C.field_z + (-var4Lifetime1 + UiComponentNode.field_C.field_z);
        }
        if (10 > var4Lifetime1) {
          var4Lifetime1 = 10;
        } else {
          if (-40 + UiComponentNode.field_C.field_z < var4Lifetime1) {
            var4Lifetime1 = -40 + UiComponentNode.field_C.field_z;
          }
        }
        wf.a(-68, 80, 0, UiComponentNode.field_C, var4Lifetime1, 0, param1, 30, param3);
    }

    final static java.awt.Container getTopLevelContainer(boolean param0) {
        if (param0) {
          String var2 = (String) null;
          hg.a((String) null, true);
          if (null != op.field_e) {
            return (java.awt.Container) ((Object) op.field_e);
          }
          return (java.awt.Container) ((Object) NanoTickClock.getApplet(95));
        }
        if (null != op.field_e) {
          return (java.awt.Container) ((Object) op.field_e);
        }
        return (java.awt.Container) ((Object) NanoTickClock.getApplet(95));
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        fsButtonTryagain = null;
        if (param0) {
          field_c = (UiComponent) null;
        }
    }

    static {
        fsButtonTryagain = "Try again";
    }
}
