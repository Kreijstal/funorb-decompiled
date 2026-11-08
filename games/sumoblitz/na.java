/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class na extends dw implements TextInputListener {
    static jj field_c;
    private TextInputWidget field_d;

    abstract gf a(byte param0, String param1);

    public final void onTextSubmitted(TextInputWidget source, int guard) {
        try {
          if (guard >= -41) {
            this.field_d = (TextInputWidget) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "na.H(" + (source != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public final boolean b(int param0) {
        if (param0 != -8003) {
          return true;
        }
        if (null == this.field_d.text) {
          return true;
        }
        if (0 != this.field_d.text.length()) {
          return false;
        }
        return true;
    }

    final String d(int param0) {
        if (param0 > -93) {
          return (String) null;
        }
        return this.a(0, this.field_d.text);
    }

    public final void onTextChanged(TextInputWidget source, byte guard) {
        try {
          this.a((byte) -101);
          if (guard > -127) {
            ResourceArchive var4 = (ResourceArchive) null;
            na.a(-98, -50, (ResourceArchive) null, -100);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "na.I(" + (source != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static Sprite a(int param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Sprite stackIn_5_0 = null;
        Sprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!k.a(param2, param0, param3, param1 ^ 30429)) {
            return null;
          }
          if (param1 == -11481) {
            stackIn_7_0 = InstrumentNoteMask.c((byte) -8);
            return stackIn_7_0;
          }
          stackIn_5_0 = (Sprite) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("na.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final gf b(byte param0) {
        if (param0 == 114) {
          return this.a((byte) 26, this.field_d.text);
        }
        field_c = (jj) null;
        return this.a((byte) 26, this.field_d.text);
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
    }

    abstract String a(int param0, String param1);

    na(TextInputWidget param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new jj("");
    }
}
