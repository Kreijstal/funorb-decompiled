/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tda extends iw implements UiActionListener {
    static String field_O;
    private UiFocusableComponent field_P;
    private UiComponent field_J;
    static String field_M;
    private long field_L;
    private UiFocusableComponent field_N;
    static volatile int field_K;

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (VariableConditionFactory.field_c) {
            param3.clearFocus((byte) -34);
          }
          var5_long = -this.field_L + wt.a(false);
          var7 = (int)((-var5_long + 10999L) / 1000L);
          if (var7 > 0) {
            this.field_J.text = "" + var7;
          } else {
            spb.a((byte) -95);
            this.l((byte) -98);
            this.field_v.a(false, new mr(this.field_v, RemoveEventAction.field_a));
          }
          if (this.field_z &&
            psb.field_b == null) {
            this.l((byte) -98);
            this.field_v.a(false, new mr(this.field_v, AdminMessageFactory.field_a));
          }
          if (psb.field_b != null) {
            if (!psb.field_b.focusLost) {
              return;
            }
            this.l((byte) -98);
            this.field_v.a(false, new mr(this.field_v, AdminMessageFactory.field_a));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tda.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    tda(ida param0) {
        super(param0, 200, 200);
        UiComponent var3 = null;
        try {
          this.field_L = wt.a(false);
          var3 = new UiComponent(SoftwareFramebuffer.field_a, (UiListener) null);
          var3.x = 0;
          var3.width = this.width;
          var3.y = 50;
          var3.height = 100;
          var3.renderer = (UiRenderer) ((Object) new UiTextStyle(SetTorpedoProjectileLife.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(-18756, var3);
          this.field_J = new UiComponent(SoftwareFramebuffer.field_a, (UiListener) null);
          this.field_J.y = 20 + var3.y + var3.height;
          this.field_J.x = 0;
          this.field_J.width = this.width;
          this.field_J.height = 80;
          this.field_J.renderer = (UiRenderer) ((Object) new UiTextStyle(GetBoostersCooldown.field_r, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(-18756, this.field_J);
          this.field_N = this.a((byte) -104, (UiListener) (this), ServerInfoFactory.field_b);
          this.field_P = this.a((byte) -73, (UiListener) (this), GetFighterRepairAmount.field_r);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tda.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            field_O = (String) null;
          }
          if (param3 == this.field_N) {
            this.l((byte) -98);
            return;
          }
          if (this.field_P != param3) {
            return;
          }
          spb.a((byte) -95);
          this.l((byte) -98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("tda.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    private final UiFocusableComponent a(byte param0, UiListener param1, String param2) {
        UiFocusableComponent var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        UiFocusableComponent stackIn_2_0 = null;
        UiFocusableComponent stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -21) {
            stackIn_2_0 = (UiFocusableComponent) null;
            return stackIn_2_0;
          }
          var4 = new UiFocusableComponent(param2, param1);
          var4.renderer = (UiRenderer) ((Object) new vva());
          var5 = this.height - 6;
          this.height = this.height + 38;
          var4.setBounds(15, -16 + this.width - 14, 30, 1, var5);
          this.addChild(-18756, var4);
          this.refreshLayout(false);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("tda.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        int var5_int = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 != -15834) {
            this.field_J = (UiComponent) null;
          }
          var5_int = param1;
          if (var5_int == 99) {
            this.field_P.requestFocus(param0 + 15834, (UiComponent) (this));
            return true;
          }
          if (var5_int != 98) {
            stackIn_12_0 = super.handleKey(param0 ^ 0, param1, param2, param3);
            return stackIn_12_0;
          }
          this.field_N.requestFocus(param0 ^ -15834, (UiComponent) (this));
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tda.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_M = null;
        if (param0 != 29914) {
          field_M = (String) null;
          field_O = null;
          return;
        }
        field_O = null;
    }

    private final void l(byte param0) {
        if (!this.field_z) {
          return;
        }
        if (param0 != -98) {
          return;
        }
        this.field_z = false;
    }

    static {
        field_O = "This game is full.";
        field_M = "Hide lobby chat";
        field_K = 0;
    }
}
