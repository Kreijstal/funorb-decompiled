/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug extends ib implements je {
    static int field_I;
    static String field_J;
    private an field_H;
    static String field_K;

    public final ia a(int param0) {
        if (param0 != -11011) {
          this.i(111);
          return (ia) ((Object) this.field_H);
        }
        return (ia) ((Object) this.field_H);
    }

    ug(int param0, int param1, int param2, int param3, ub param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static mh a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, TextFont param8, int param9, int param10, int param11, int param12) {
        mh var13 = null;
        RuntimeException var13_ref = null;
        TextFont var14 = null;
        mh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new mh(0L, (mh) null);
          var13.field_Jb = ByteArrayNode.a(param0, (byte) -18, param3);
          var13.field_Gb = ByteArrayNode.a(param12, (byte) -18, param7);
          var13.field_D = ByteArrayNode.a(param11, (byte) -18, param1);
          var13.field_pb = ByteArrayNode.a(param5, (byte) -18, param4);
          if (param2 < 96) {
            var14 = (TextFont) null;
            ug.a(-26, -58, (byte) 79, 5, 18, -27, 69, 4, (TextFont) null, 4, -79, 47, -32);
          }
          var13.field_Ab = ByteArrayNode.a(param6, (byte) -18, param10);
          var13.field_X = param9;
          var13.field_O = param8;
          stackIn_3_0 = var13;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_6_0 = var13_ref;
          stackIn_6_1 = new StringBuilder().append("ug.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    abstract int i(int param0);

    public static void h(int param0) {
        field_J = null;
        field_K = null;
        if (param0 != 0) {
          TextFont var2 = (TextFont) null;
          ug.a(102, -93, (byte) 33, 30, -107, 27, -54, 36, (TextFont) null, 50, -58, -25, 44);
        }
    }

    void a(an param0, byte param1) {
        try {
          this.field_H = param0;
          this.field_H.field_l = this;
          if (param1 != -12) {
            this.field_H = (an) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ug.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract int i(byte param0);

    abstract int a(byte param0);

    abstract boolean h(byte param0);

    static {
        field_J = "You must be a member to play with the current options.";
        field_K = "<%0> has entered another game.";
    }
}
