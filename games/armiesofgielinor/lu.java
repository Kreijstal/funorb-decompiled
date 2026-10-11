/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lu extends lk {
    static je field_u;
    static String field_v;

    lu(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    public static void a(int param0) {
        field_v = null;
        field_u = null;
        if (param0 != 1) {
          field_v = (String) null;
        }
    }

    lu(int param0) {
        this(ArmiesOfGielinor.field_J, param0);
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = vl.field_n;
        var2.writeCipheredOpcode(32161, param1);
        if (param0 < -99) {
          var2.writeByte(1, 1);
          var2.writeByte(1, 1);
          return;
        }
        field_u = (je) null;
        var2.writeByte(1, 1);
        var2.writeByte(1, 1);
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            StateChangeEvent.a(param0.field_l, param0.field_B + param1, param0.field_w, 94, param4 + param0.field_p);
          }
          super.a(param0, param1, -120, param3, param4);
          if (param2 <= -79) {
            return;
          }
          lu.a(-66, -37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("lu.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_v = "<%0> / <%1> (+<%2>)";
    }
}
