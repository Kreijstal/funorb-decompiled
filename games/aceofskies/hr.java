/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hr extends or {
    static lt field_e;
    static RenderSprite[][] aircraftSprites;

    private hr() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        aircraftSprites = (RenderSprite[][]) null;
        if (!param0) {
          return;
        }
        field_e = null;
    }

    abstract go a(int param0);

    final static void a(boolean param0, String param1, boolean param2, byte param3) {
        try {
          gg.b((byte) -98);
          vn.field_f.e((byte) 74);
          vr.field_b = new ce(se.field_a, (String) null, nf.field_a, param2, param0);
          ClientException.field_d = new ad(vn.field_f, vr.field_b);
          if (param3 != -61) {
            String var5 = (String) null;
            hr.a(0.47493258118629456f, 21, false, (String) null);
          }
          vn.field_f.a(ClientException.field_d, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hr.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static GraphicsRenderer a(ResourceArchive param0, d param1, int param2, int param3, java.awt.Canvas param4, int param5) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var6_int = 123 % ((param2 - 23) / 53);
          int var7 = 0;
          int var8 = 0;
          if (param4 != null) {
            java.awt.Dimension var9 = param4.getSize();
            var8 = var9.height;
            var7 = var9.width;
          }
          GraphicsRenderer stackIn_3_0 = GraphicsRenderer.a(var7, param0, param5, param4, param3, 5, var8, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hr.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(float param0, int param1, boolean param2, String param3) {
        try {
          if (param1 != 0) {
            java.awt.Canvas var5 = (java.awt.Canvas) null;
            hr.a((ResourceArchive) null, (d) null, -124, -29, (java.awt.Canvas) null, -9);
          }
          if (null == fu.field_d) {
            fu.field_d = new ng(vn.field_f, uf.field_e);
            vn.field_f.a(fu.field_d, 0);
          }
          fu.field_d.a(param2, -111, param3, param0);
          SoftwareRasterizer.clearFramebuffer();
          si.a(true, -32106);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hr.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
