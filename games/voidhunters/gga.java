/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gga extends UiSingleChildContainer {
    private gga(int param0, int param1, int param2, int param3, UiRenderer param4, UiListener param5, UiComponent param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.child = param6;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gga.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void handleMouseRelease(byte param0, int param1, int param2, int param3, UiComponent param4, int param5) {
        ef var9 = null;
        try {
          super.handleMouseRelease((byte) -124, param1, param2, param3, param4, param5);
          var9 = SetBombletSprayRandomness.field_p;
          int var8 = 123 % ((52 - param0) / 52);
          if (var9 != null &&
            this.containsPoint(param2, param1, param5, param3, (byte) 22)) {
            if (!(this.listener instanceof ol)) {
              if (!(var9.listener instanceof ol)) {
                return;
              }
              ((ol) (var9.listener)).a((byte) -70, var9, this);
              SetBombletSprayRandomness.field_p = null;
              return;
            }
            ((ol) (this.listener)).a((byte) -70, var9, this);
            SetBombletSprayRandomness.field_p = null;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gga.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
    }
}
