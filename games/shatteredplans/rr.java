/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rr extends WidgetTheme {
    static int field_t;

    final static HitRegion a(IntrusiveDeque param0, int param1, int param2, int param3) {
        HitRegion dupTemp$1 = null;
        HitRegion var5 = null;
        int var6 = 0;
        HitRegion var7 = null;
        HitRegion stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            return null;
          }
          var7 = (HitRegion) (param0.startForward(param3 ^ param3));
          while (var7 != null) {
            dupTemp$1 = var7.hitTest(-125, param2, param1);
            var5 = dupTemp$1;
            if (null != dupTemp$1) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
            var7 = (HitRegion) (param0.nextForward((byte) -71));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rr.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    rr(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_J, -1, 2147483647, false);
    }

    public final void paintWidget(UiWidget param0, int param1, boolean param2, int param3, byte param4) {
        try {
          if (param2) {
            ClientException.a((byte) 93, param0.field_q + param3, param0.field_n, param1 + param0.field_m, param0.field_x);
          }
          super.paintWidget(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "rr.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(MenuComponent param0, IntrusiveDeque param1, byte param2) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        MenuComponent var4 = null;
        int var5 = 0;
        IntrusiveDeque var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = param1.startForward(0);
          while (var3 != null) {
            var4 = (MenuComponent) (var3);
            if (var4.isOrContains((byte) -118, param0)) {
              return true;
            }
            var3 = param1.nextForward((byte) -71);
          }
          if (param2 == 64) {
            return false;
          }
          var6 = (IntrusiveDeque) null;
          rr.a((IntrusiveDeque) null, 76, -63, 75);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("rr.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    rr(int param0) {
        this(gn.field_u, param0);
    }

    static {
    }
}
