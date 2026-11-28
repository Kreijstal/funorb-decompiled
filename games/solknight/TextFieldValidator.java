/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    private EditableTextField field_f;
    static AccountServiceResult field_h;
    static Sprite field_e;
    static String field_g;
    static int[] field_d;
    static int field_i;

    public final void onTextChanged(EditableTextField param0, byte param1) {
        if (param1 != -79) {
          return;
        }
        try {
          this.recordInputChange((byte) -127);
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "a.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1, float param2) {
        if (param0 != 102) {
          return;
        }
        try {
          pe.field_m = param1;
          SecondaryNodeDequeIterator.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "a.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    abstract qf getValidationStatus(String param0, byte param1);

    final String evaluateValidationMessage(int param0) {
        if (param0 != 8192) {
          return (String) null;
        }
        return this.getValidationMessage(this.field_f.field_i, false);
    }

    abstract String getValidationMessage(String param0, boolean param1);

    public final boolean hasMissingInput(int param0) {
        if (param0 < 82) {
          field_e = (Sprite) null;
          if (this.field_f.field_i != null) {
            return this.field_f.field_i.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.field_f.field_i == null) {
          return true;
        }
        if (this.field_f.field_i.length() != 0) {
          return false;
        }
        return true;
    }

    final qf evaluateValidationStatus(byte param0) {
        int var2 = -63 / ((39 - param0) / 61);
        return this.getValidationStatus(this.field_f.field_i, (byte) -112);
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_h = null;
        field_g = null;
        if (param0 == 30514) {
          field_e = null;
          field_d = null;
          return;
        }
        field_h = (AccountServiceResult) null;
        field_e = null;
        field_d = null;
    }

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(PacketBuffer param0, int param1, boolean param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.readUnsignedSmart(param2);
            if (var3_int > param1) {
              var3_int = param1;
            }
            var4 = new byte[var3_int];
            param0.position = param0.position + v.field_g.a(0, param0.position, 4, var4, var3_int, param0.payload);
            var5 = vd.decodeCp1252String(var4, 0, var3_int, 160);
            stackIn_3_0 = var5;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_5_0 = "Cabbage";
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("a.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void onTextSubmitted(EditableTextField param0, boolean param1) {
        try {
          if (!param1) {
            String var4 = (String) null;
            this.getValidationMessage((String) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "a.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_g = "Play the game without logging in just yet";
    }
}
