/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mha {
    static int field_a;

    final static gla a(int param0, byte[] param1, int param2, jp param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        gla stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param2, var4_int);
          jaggl.OpenGL.glProgramRawARB(param2, 34933, param1);
          jaggl.OpenGL.glGetIntegerv(34379, VoidHunters.field_E, 0);
          if (-1 == VoidHunters.field_E[0]) {
            jaggl.OpenGL.glBindProgramARB(param2, param0);
            stackIn_7_0 = new gla(param3, param2, var4_int);
            return stackIn_7_0;
          }
          jaggl.OpenGL.glBindProgramARB(param2, 0);
          stackIn_5_0 = null;
          return (gla) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mha.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
    }
}
