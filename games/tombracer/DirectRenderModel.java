/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectRenderModel extends TrapModel {
    static String field_m;

    DirectRenderModel(int param0, Room param1, BitPacketBuffer param2) {
        super(param0, param1, param2);
    }

    DirectRenderModel(int param0) {
        super(param0);
    }

    final void drawAt(Camera param0, int param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        if (this.body == null) {
          return;
        }
        try {
          var6_int = this.body.getWidth(-53) / 2;
          int var8 = -77 / ((param4 + 38) / 47);
          var7 = this.body.getHeight((byte) 55) / 2;
          oq.a(-var6_int + param2, -var7 + param1, param3, 160, var6_int + param2, 16777215, var7 + param1, true);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ao.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void attach(TrapPart param0, WorldBody param1, byte param2) {
        try {
          super.attach(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ao.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > -113) {
          DirectRenderModel.releaseStatics(100);
          field_m = null;
          return;
        }
        field_m = null;
    }

    static {
        field_m = "Add <%0> to friend list";
    }
}
