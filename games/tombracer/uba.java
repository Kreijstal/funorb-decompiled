/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends DebouncedValidationSource implements TextInputListener, eaa {
    static int field_f;
    DateInputWidget field_i;
    static String[] loadingQuipsShort;
    static String field_h;

    final String computeMessage(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_i.a(param0 - 1780);
          var3 = this.field_i.getYear(param0 + 20939);
          var4 = this.field_i.getDay((byte) 110);
          var5 = ResourceArchive.currentYear((byte) 60);
          if (var4 >= param0 &&
            -3 + var5 >= var4) {
            if (fa.a(var3, var2_int, true, var4)) {
              stackIn_7_0 = null;
              return (String) (stackIn_7_0);
            }
          } else {
            stackIn_4_0 = LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(91, era.field_b, new String[]{"1890", Integer.toString(var5 - 3)});
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return MaskBlendOperator.field_m;
    }

    public final boolean isEmpty(boolean param0) {
        if (!param0) {
          this.field_i = (DateInputWidget) null;
          return this.field_i.i((byte) 64);
        }
        return this.field_i.i((byte) 64);
    }

    public static void releaseStatics(byte param0) {
        loadingQuipsShort = null;
        field_h = null;
        if (param0 != -128) {
          uba.releaseStatics((byte) -33);
        }
    }

    public final void onTextChanged(TextInputWidget param0, int param1) {
        try {
          this.markEdited(-65);
          if (param1 != -10) {
            TextInputWidget var4 = (TextInputWidget) null;
            this.onTextChanged((TextInputWidget) null, -90);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uba.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final it computeState(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        it stackIn_3_0 = null;
        it stackIn_6_0 = null;
        it stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_i.a(111);
          var3 = this.field_i.getYear(22829);
          var4 = this.field_i.getDay((byte) 110);
          var5 = ResourceArchive.currentYear((byte) 125);
          if (~var4 > param0) {
            stackIn_3_0 = fp.field_c;
            return stackIn_3_0;
          }
          if (var4 > -3 + var5) {
            stackIn_6_0 = fp.field_c;
            return stackIn_6_0;
          }
          if (!fa.a(var3, var2_int, true, var4)) {
            stackIn_10_0 = fp.field_c;
            return stackIn_10_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return fp.field_c;
        }
        return LightSource.field_k;
    }

    public final void a(int param0, DropdownList param1) {
        if (param0 != -3) {
          return;
        }
        try {
          this.markEdited(-81);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uba.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public uba() {
    }

    public final void onEnterPressed(int param0, TextInputWidget param1) {
        try {
          if (param0 != -6038) {
            field_f = -61;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uba.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        loadingQuipsShort = new String[]{"Building tombs", "Setting traps", "Scattering bones", "Poking snakes", "Carving statues", "Drawing maps", "Lighting torches", "Inviting archaeologists", "Rolling boulders", "Looking for Tom Bracer...", "Twiddling Thumbs"};
        field_h = "You are on <%0>";
    }
}
