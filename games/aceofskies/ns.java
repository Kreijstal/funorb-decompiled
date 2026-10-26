/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ns {
    static GraphicsRenderer field_a;

    final static void a(DualLinkNode param0, int param1, DualLinkNode param2) {
        if (null != param0.previousSecondaryNode) {
          param0.unlinkSecondaryNode(param1 + 30453);
        }
        param0.nextSecondaryNode = param2.nextSecondaryNode;
        param0.previousSecondaryNode = param2;
        param0.previousSecondaryNode.nextSecondaryNode = param0;
        if (param1 != -30575) {
          return;
        }
        try {
          param0.nextSecondaryNode.previousSecondaryNode = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ns.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -24169) {
          field_a = (GraphicsRenderer) null;
        }
    }

    static {
        field_a = null;
    }
}
