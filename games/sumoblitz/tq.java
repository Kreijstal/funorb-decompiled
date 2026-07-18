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
              int discarded$4 = 124;
              mp.a(mb.field_b);
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
            throw qo.a((Throwable) (Object) runtimeException, "tq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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

    public static void a() {
        field_a = null;
    }

    final static boolean a(int param0, boolean param1, int param2) {
        return (param2 & 256) != 0;
    }

    final static void a(byte param0, ah param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (oc.field_e > in.field_z) {
                break L1;
              } else {
                int discarded$2 = -1;
                hb.a(param1);
                oc.field_e = (int)((double)oc.field_e + 1.5 * (double)oc.field_e);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("tq.G(").append(-106).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
    }
}
