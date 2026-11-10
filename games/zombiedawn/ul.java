/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static boolean field_f;
    static long field_b;
    private lc field_a;
    private Js5Archive field_g;
    private Js5Archive field_c;
    static int field_d;
    static long field_e;

    final static void b(int param0, byte param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        try {
          var2 = new int[1 + rc.field_u.length];
          var3 = 0;
          if (param1 >= -65) {
            field_d = -16;
          }
          while (var3 < rc.field_u.length) {
            var2[var3] = rc.field_u[var3];
            var3++;
          }
          var2[var2.length - 1] = param0;
          rc.field_u = var2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ul.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static Sprite a(boolean param0, String param1) {
        oi var2 = null;
        RuntimeException var2_ref = null;
        Sprite var3 = null;
        Sprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = bj.field_q;
          var3 = new Sprite(var2.textWidth(param1), 27);
          var3.setAsRenderTarget();
          if (param0) {
            ul.a(-121, (byte) 5);
          }
          var2.drawStringCentered(param1, var3.field_w / 2, 17, 16777215, -1);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ul.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final dm a(int param0, int param1) {
        byte[] var4 = null;
        dm var3 = (dm) (this.field_a.a((long)param1, 1431655765));
        if (var3 != null) {
          return var3;
        }
        if (param1 < 32768) {
          var4 = this.field_g.getFile((byte) 51, 1, param1);
        } else {
          var4 = this.field_c.getFile((byte) 51, 1, param1 & 32767);
        }
        var3 = new dm();
        int var5 = 91 / ((-7 - param0) / 53);
        if (var4 != null) {
          var3.decode(new PacketBuffer(var4), 0);
        }
        if (param1 >= 32768) {
          var3.markGlobalPhraseIds((byte) -76);
        }
        this.field_a.a((long)param1, var3, -16709);
        return var3;
    }

    private ul() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, byte param1) {
        int var2 = 53 % ((param1 + 64) / 55);
        return param0 == (-param0 & param0) ? true : false;
    }

    static {
    }
}
