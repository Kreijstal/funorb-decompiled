/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateValidator extends DebouncedFieldValidator implements TextFieldListener, we {
    static int field_i;
    bf field_j;
    static int field_g;
    static ci field_k;
    static String field_h;

    final String evaluateValidationMessage(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        if (param0 <= 40) {
          return (String) null;
        }
        try {
          var2_int = this.field_j.c(false);
          var3 = this.field_j.h(-1);
          var4 = this.field_j.i(93);
          var5 = ca.a(13421568);
          if (1890 <= var4 &&
            var4 <= -3 + var5) {
            if (tn.a(var2_int, var3, -25042, var4)) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
          } else {
            stackIn_6_0 = MatchingFieldValidator.a(od.field_X, new String[]{"1890", Integer.toString(-3 + var5)}, (byte) -59);
            return stackIn_6_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return oj.field_g;
    }

    final static void g(int param0) {
        jh.field_e.closeAllDialogs(0);
        if (mk.field_e == null) {
          mk.field_e = new ch(jh.field_e, qf.field_g);
          jh.field_e.showDialog(mk.field_e, (byte) -65);
          if (param0 <= 119) {
            field_h = (String) null;
            return;
          }
          return;
        }
        jh.field_e.showDialog(mk.field_e, (byte) -65);
        if (param0 > 119) {
          return;
        }
        field_h = (String) null;
    }

    final mk evaluateValidationStatus(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        EditableTextField var6 = null;
        mk stackIn_5_0 = null;
        mk stackIn_8_0 = null;
        mk stackIn_11_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_j.c(false);
          var3 = this.field_j.h(-1);
          var4 = this.field_j.i(110);
          var5 = ca.a(13421568);
          if (param0 != 4) {
            var6 = (EditableTextField) null;
            this.onTextChanged((EditableTextField) null, -75);
          }
          if (var4 < 1890) {
            stackIn_5_0 = qk.field_b;
            return stackIn_5_0;
          }
          if (var4 > var5 - 3) {
            stackIn_8_0 = qk.field_b;
            return stackIn_8_0;
          }
          if (!tn.a(var2_int, var3, param0 - 25046, var4)) {
            stackIn_11_0 = qk.field_b;
            return stackIn_11_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return qk.field_b;
        }
        return ProxyAuthenticationRequiredException.field_a;
    }

    public static void h(int param0) {
        if (param0 != 1) {
          BirthDateValidator.a(94, (byte) 26);
          field_k = null;
          field_h = null;
          return;
        }
        field_k = null;
        field_h = null;
    }

    public final boolean hasMissingInput(int param0) {
        if (param0 != 14496) {
          return false;
        }
        return this.field_j.h((byte) -123);
    }

    final static void a(int param0, pa param1, int param2) {
        BitPacketBuffer var3 = null;
        try {
          var3 = EditableTextField.field_U;
          var3.writeCipheredByte(param2, -106);
          var3.writeByte(2, (byte) -56);
          var3.writeByte(0, (byte) -112);
          if (param0 != -1281) {
            field_g = 45;
          }
          var3.writeByte(param1.field_p, (byte) 78);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ri.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void onTextSubmitted(EditableTextField param0, int param1) {
        try {
          if (param1 != 3) {
            field_i = -5;
          }
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ri.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public BirthDateValidator() {
    }

    public final void onTextChanged(EditableTextField param0, int param1) {
        if (param1 != 10999) {
          return;
        }
        try {
          this.recordInputChange(true);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ri.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ResourceArchive a(int param0, byte param1) {
        if (param1 < 126) {
          return (ResourceArchive) null;
        }
        return ci.a(-17288, param0, 1, false, false, true);
    }

    static {
        field_h = "Exploiting a bug";
    }
}
