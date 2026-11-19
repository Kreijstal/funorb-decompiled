/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationIndicator extends TextButton {
    static int field_G;
    static sa field_M;
    static tk field_H;
    private Validator field_I;
    private int field_K;
    static PlatformTask field_N;
    static boolean field_L;
    static int field_J;

    public static void clearSharedReferences(byte param0) {
        field_N = null;
        field_H = null;
        field_M = null;
        if (param0 <= 33) {
          ValidationIndicator.clearSharedReferences((byte) -35);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        fd var8;
        int var9;
        int var10;
        int var11;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        var11 = HoldTheLine.field_D;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        var5 = (this.field_x >> 1) + (param2 + this.field_k);
        var6 = param1 + this.field_o + (this.field_u >> 1);
        var8 = this.field_I.b(-7447);
        if (hh.field_d == var8) {
          var16 = FullscreenFocusCanvas.field_i[0];
          var9 = var16.field_o << 1;
          var10 = var16.field_v << 1;
          if (le.field_m == null) {
            le.field_m = new Sprite(var9, var10);
            ProxySocketConnector.a(le.field_m, -1);
          } else {
            if (var9 > le.field_m.field_s) {
              le.field_m = new Sprite(var9, var10);
              ProxySocketConnector.a(le.field_m, -1);
            } else {
              if (le.field_m.field_y >= var10) {
                ProxySocketConnector.a(le.field_m, -1);
                SoftwareRasterizer.c();
              } else {
                le.field_m = new Sprite(var9, var10);
                ProxySocketConnector.a(le.field_m, -1);
              }
            }
          }
          var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -this.field_K << 10, 4096);
          dm.b((byte) -10);
          le.field_m.b(-var16.field_o + var5, -var16.field_v + var6, 256);
        } else {
          if (var8 != um.field_a) {
            if (g.field_k == var8) {
              var13 = FullscreenFocusCanvas.field_i[2];
              var13.b(-(var13.field_s >> 1) + var5, -(var13.field_y >> 1) + var6, 256);
            } else {
              if (tg.field_d == var8) {
                var14 = FullscreenFocusCanvas.field_i[1];
                var14.b(-(var14.field_s >> 1) + var5, var6 - (var14.field_y >> 1), 256);
              }
            }
          } else {
            var15 = FullscreenFocusCanvas.field_i[0];
            var9 = var15.field_o << 1;
            var10 = var15.field_v << 1;
            if (le.field_m == null) {
              le.field_m = new Sprite(var9, var10);
              ProxySocketConnector.a(le.field_m, -1);
            } else {
              if (var9 > le.field_m.field_s) {
                le.field_m = new Sprite(var9, var10);
                ProxySocketConnector.a(le.field_m, -1);
              } else {
                if (le.field_m.field_y >= var10) {
                  ProxySocketConnector.a(le.field_m, -1);
                  SoftwareRasterizer.c();
                } else {
                  le.field_m = new Sprite(var9, var10);
                  ProxySocketConnector.a(le.field_m, -1);
                }
              }
            }
            var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -this.field_K << 10, 4096);
            dm.b((byte) -10);
            le.field_m.b(-var15.field_o + var5, -var15.field_v + var6, 256);
          }
        }
    }

    final String f(int param0) {
        if (param0 != 0) {
          UiWidget var3 = (UiWidget) null;
          this.a(103, (UiWidget) null, 21, (byte) -77);
          if (this.field_p) {
            return this.field_I.b((byte) -59);
          }
          return null;
        }
        if (this.field_p) {
          return this.field_I.b((byte) -59);
        }
        return null;
    }

    final boolean a(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -25823) {
            return false;
          }
          this.f(84);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gg.NB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, UiWidget param1, int param2, byte param3) {
        try {
          this.field_K = this.field_K + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "gg.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    ValidationIndicator(Validator param0) {
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = 200;
        field_M = new sa();
        field_J = 0;
    }
}
