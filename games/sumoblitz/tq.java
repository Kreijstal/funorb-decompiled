/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    private int field_b;
    static vn field_a;

    final static void a(int param0, int param1, boolean param2) {
        if (param1 == mb.field_b) {
          return;
        }
        mb.field_b = param1;
        if (param2) {
          mp.a(mb.field_b, 124);
          qv.a(mb.field_b, 4);
          if (param0 > -87) {
            field_a = (vn) null;
            return;
          }
          return;
        }
        gn.a(mb.field_b, true);
        if (param0 > -87) {
          field_a = (vn) null;
          return;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          this.a(-14, 14);
        } else {
          jaggl.OpenGL.glEndList();
          return;
        }
        jaggl.OpenGL.glEndList();
    }

    tq(fr param0, int param1) {
        try {
          this.field_b = jaggl.OpenGL.glGenLists(param1);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "tq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, char param1) {
        jaggl.OpenGL.glCallList(param1 + this.field_b);
        if (param0 != 121) {
          field_a = (vn) null;
        }
    }

    final void a(int param0, int param1) {
        jaggl.OpenGL.glNewList(this.field_b + param0, param1);
    }

    public static void a(byte param0) {
        if (param0 >= -6) {
          field_a = (vn) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0, boolean param1, int param2) {
        if (param1) {
          return (param2 & 256) != 0 ? true : false;
        }
        tq.a(34, -21, true);
        return (param2 & 256) != 0 ? true : false;
    }

    final static void a(byte param0, ah param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (oc.field_e <= in.field_z) {
            hb.a(param1, -1);
            oc.field_e = (int)((double)oc.field_e + 1.5 * (double)oc.field_e);
          }
          if (param0 == -106) {
            return;
          }
          tq.a((byte) -12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("tq.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
