/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    private int field_b;
    static vn field_a;

    final static void a(int param0, int param1, boolean param2) {
        if (param1 != mb.field_b) {
          L0: {
            mb.field_b = param1;
            if (!param2) {
              gn.a(mb.field_b, true);
              break L0;
            } else {
              mp.a(mb.field_b, 124);
              qv.a(mb.field_b, 4);
              break L0;
            }
          }
          if (param0 > -87) {
            field_a = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            ((tq) this).a(-14, 14);
        }
        jaggl.OpenGL.glEndList();
    }

    tq(fr param0, int param1) {
        try {
            ((tq) this).field_b = jaggl.OpenGL.glGenLists(param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "tq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(byte param0, char param1) {
        jaggl.OpenGL.glCallList(param1 + ((tq) this).field_b);
        if (param0 == 121) {
            return;
        }
        field_a = null;
    }

    final void a(int param0, int param1) {
        jaggl.OpenGL.glNewList(((tq) this).field_b + param0, param1);
    }

    public static void a(byte param0) {
        if (param0 >= -6) {
            field_a = null;
        }
        field_a = null;
    }

    final static boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
            tq.a(34, -21, true);
        }
        return (param2 & 256) != 0 ? true : false;
    }

    final static void a(byte param0, ah param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (oc.field_e > in.field_z) {
                break L1;
              } else {
                hb.a(param1, -1);
                oc.field_e = (int)((double)oc.field_e + 1.5 * (double)oc.field_e);
                break L1;
              }
            }
            L2: {
              if (param0 == -106) {
                break L2;
              } else {
                tq.a((byte) -12);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("tq.G(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    static {
    }
}
