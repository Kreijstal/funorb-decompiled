/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ita extends vq {
    private boolean field_F;
    static String field_A;
    static String field_D;
    private uf field_E;
    private uf field_B;
    private uf field_C;

    private final void a(UiComponent param0, int param1, String param2, int param3, int param4) {
        try {
          SetTorpedoProjectileLife.field_o.drawCentered(param2, (param0.width >> 1) + (param4 + param0.x), param1 + param0.y - 5, 16777215, -1);
          if (param3 != 1225728129) {
            this.d(108);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ita.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    ita(UiRenderer param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds(param2, param4, param5, 1, param3);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ita.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, 66, param3);
        if (param2 < 47) {
          field_D = (String) null;
          if (0 != param1) {
            return;
          }
          param0 = param0 + this.x;
          param3 = param3 + this.y;
          this.a(this.field_E, param3, GetReadyRoomMissionTime.field_q, 1225728129, param0);
          this.a(this.field_B, param3, GetBombletSprayAimspeed.field_o, 1225728129, param0);
          this.a(this.field_C, param3, GetMissileLauncherRandomness.field_q, 1225728129, param0);
          return;
        }
        if (0 != param1) {
          return;
        }
        param0 = param0 + this.x;
        param3 = param3 + this.y;
        this.a(this.field_E, param3, GetReadyRoomMissionTime.field_q, 1225728129, param0);
        this.a(this.field_B, param3, GetBombletSprayAimspeed.field_o, 1225728129, param0);
        this.a(this.field_C, param3, GetMissileLauncherRandomness.field_q, 1225728129, param0);
    }

    final int f(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 3476) {
          return 3;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_C.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean d(int param0) {
        wta var3;
        if (param0 == 0) {
          if (null != this.field_E.text &&
            this.field_E.text.length() != 0) {
            if (this.field_B.text == null) {
              return true;
            }
            if (0 == this.field_B.text.length()) {
              return true;
            }
            if (this.field_C.text != null &&
              this.field_C.text.length() != 0) {
              return false;
            }
            return true;
          }
          return true;
        }
        var3 = (wta) null;
        this.a(41, (wta) null);
        if (null == this.field_E.text) {
          return true;
        }
        if (this.field_E.text.length() == 0) {
          return true;
        }
        if (this.field_B.text == null) {
          return true;
        }
        if (0 == this.field_B.text.length()) {
          return true;
        }
        if (this.field_C.text == null) {
          return true;
        }
        if (this.field_C.text.length() == 0) {
          return true;
        }
        return false;
    }

    final int e(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -5) {
          return -67;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_E.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final static BitmapFont a(int param0, int param1) {
        if (param1 != 7988) {
          field_D = (String) null;
          return GrapplingHookFactory.field_a;
        }
        return GrapplingHookFactory.field_a;
    }

    final String getTooltip(byte param0) {
        String var2 = this.field_B.getTooltip(param0);
        if (var2 != null) {
          return var2;
        }
        if (this.hovered) {
          return null == this.tooltip ? this.text : this.tooltip;
        }
        return null;
    }

    final void a(int param0, wta param1) {
        try {
          super.a(75, param1);
          this.field_E.listener = (UiListener) ((Object) param1);
          this.field_B.listener = (UiListener) ((Object) param1);
          this.field_C.listener = (UiListener) ((Object) param1);
          if (param0 <= 73) {
            this.d(-83);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ita.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          return 37;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_B.text) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    private ita(UiRenderer param0, boolean param1) {
        super(0, 0, 0, 0, (UiRenderer) null);
        try {
          this.field_E = (uf) ((Object) new tga("", (UiListener) null, 2));
          this.field_B = (uf) ((Object) new tga("", (UiListener) null, 2));
          this.field_C = (uf) ((Object) new tga("", (UiListener) null, 4));
          this.field_C.renderer = param0;
          this.field_B.renderer = param0;
          this.field_E.renderer = param0;
          this.field_F = param1 ? true : false;
          if (!this.field_F) {
            this.addChild(-18756, this.field_E);
            this.addChild(-18756, this.field_B);
          } else {
            this.addChild(-18756, this.field_B);
            this.addChild(-18756, this.field_E);
          }
          this.addChild(-18756, this.field_C);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ita.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3 ^ 0, param4);
        if (param3 != 1) {
          this.d(-41);
        }
        int var6 = param1 - 130 >> 1;
        if (!this.field_F) {
          this.field_E.setBounds(var6, 25, param2, param3 + 0, 0);
          this.field_B.setBounds(var6 + 45, 25, param2, param3 + 0, 0);
          this.field_C.setBounds(90 + var6, 40, param2, param3 + 0, 0);
          return;
        }
        this.field_B.setBounds(var6, 25, param2, 1, 0);
        this.field_E.setBounds(var6 + 45, 25, param2, 1, 0);
        this.field_C.setBounds(90 + var6, 40, param2, param3 + 0, 0);
    }

    public static void clearSharedReferences(byte param0) {
        field_A = null;
        field_D = null;
        if (param0 <= 71) {
          field_A = (String) null;
        }
    }

    static {
        field_D = "Next";
        field_A = "Hide chat";
    }
}
