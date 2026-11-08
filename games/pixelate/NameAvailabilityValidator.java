/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameAvailabilityValidator extends TextFieldValidator {
    static String field_n;
    private boolean accepted;
    static int field_t;
    static String field_m;
    static int field_r;
    static java.awt.Canvas field_u;
    static Sprite field_q;
    private String checkedName;
    static String field_o;

    final String describeText(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        id var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = MusicPatch.validateUsernameText(var5, 0);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (param0 > -76) {
            NameAvailabilityValidator.a(true, 49, -104);
          }
          if (!param1.equals(this.checkedName)) {
            var4 = ig.a(200, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_c != null) {
              return null;
            }
            this.checkedName = param1;
            this.accepted = var4.field_g;
          }
          if (this.accepted) {
            stackIn_17_0 = MusicCrossfadeStream.field_L;
            return stackIn_17_0;
          }
          stackIn_15_0 = ek.field_e;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ec.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void f(int param0) {
        this.checkedName = null;
        int var2 = -118 / ((param0 + 56) / 56);
    }

    NameAvailabilityValidator(EditableTextWidget param0) {
        super(param0);
        this.accepted = false;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = 0;
          var4 = ce.field_c;
          while (var3_int < AccountRegistrationPanel.field_J.length) {
            var5 = ProxyAuthenticationException.field_e[var3_int];
            if (var5 >= 0) {
              var6 = ArchiveProvider.a(AccountRegistrationPanel.field_J[var3_int], 8192, true);
              var4 = var4 + ki.field_e;
              var7 = bq.field_d - (var6 >> 1);
              if (TextLayoutLine.containsPoint(param1, var4, 59, (WidgetStyleLayer.field_b << 1) + dk.field_d, -ProxyAuthenticationException.field_a + var7, param2, (ProxyAuthenticationException.field_a << 1) + var6)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + ((WidgetStyleLayer.field_b << 1) + ki.field_e + dk.field_d);
            } else {
              var4 = var4 + BouncedownBackground.field_m;
            }
            var3_int++;
          }
          if (param0) {
            stackIn_12_0 = true;
            stackIn_12_1 = 50;
            NameAvailabilityValidator.a(stackIn_12_0, stackIn_12_1, 69);
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var3), "ec.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, ResourceArchive param1) {
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new Sprite(param1.getNamedFile((byte) 24, "", "final_frame.jpg"), (java.awt.Component) ((Object) field_u));
          var3 = var2.field_F;
          var4 = var2.field_E;
          MidiPcmStream.pushRasterState(param0);
          th.field_b = new Sprite(var3, 3 * var4 / 4);
          th.field_b.makeRasterTarget();
          var2.drawOpaque(0, 0);
          MusicPatchNode.field_s = new Sprite(var3, var4 - th.field_b.field_E);
          MusicPatchNode.field_s.makeRasterTarget();
          var2.drawOpaque(0, -th.field_b.field_E);
          MusicPatchNode.field_s.field_y = th.field_b.field_E;
          LinkButtonPainter.a((byte) 92);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ec.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_q = null;
        field_n = null;
        field_u = null;
        field_m = null;
        field_o = null;
    }

    final ValidationState validateText(String param0, boolean param1) {
        id var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_12_0 = null;
        ValidationState stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!ResourceArchive.ensureGroupAvailableByName((byte) 63, var4)) {
            stackIn_2_0 = sk.field_a;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_5_0 = (ValidationState) null;
            return stackIn_5_0;
          }
          if (!param0.equals(this.checkedName)) {
            var3 = ig.a(200, param0);
            if (var3 != null &&
              null == var3.field_c) {
              this.checkedName = param0;
              this.accepted = var3.field_g;
            } else {
              stackIn_12_0 = UiTheme.field_j;
              return stackIn_12_0;
            }
          }
          if (this.accepted) {
            stackIn_17_0 = qk.field_g;
          } else {
            stackIn_17_0 = sk.field_a;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ec.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = "Checking";
        field_n = "Hide game chat";
        field_o = "Close";
    }
}
