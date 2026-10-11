/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls extends rqa {
    static int field_p;
    static int field_o;
    static int field_r;
    static boolean field_q;

    ls(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        phb var1 = null;
        phb var2 = null;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        try {
          var1 = new phb(540, 140);
          de.a(29, var1);
          bfb.e();
          dma.a();
          nd.field_r = 0;
          pw.a((byte) 74);
          var2 = var1.d();
          for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            dma.a(4, 4, 0, 0, 540, 140);
          }
          if (param0 <= 54) {
            field_q = false;
          }
          db.field_p.b();
          var1.d(0, 0);
          bia.a((byte) 124);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ls.C(" + param0 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 < 120) {
            ls.a(94);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ls.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_r = -80;
          }
          stackIn_3_0 = new nc(frb.a(63, 86));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ls.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = 1280;
        field_r = 128;
        field_q = false;
    }
}
