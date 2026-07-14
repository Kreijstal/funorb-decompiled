/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mha {
    static int field_a;

    final static gla a(int param0, byte[] param1, int param2, jp param3) {
        int var4 = 0;
        if (param1 != null) {
          var4 = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param2, var4);
          jaggl.OpenGL.glProgramRawARB(param2, 34933, param1);
          jaggl.OpenGL.glGetIntegerv(34379, VoidHunters.field_E, 0);
          if (-1 != VoidHunters.field_E[0]) {
            jaggl.OpenGL.glBindProgramARB(param2, 0);
            return null;
          } else {
            jaggl.OpenGL.glBindProgramARB(param2, param0);
            return new gla(param3, param2, var4);
          }
        } else {
          return null;
        }
    }

    static {
    }
}
