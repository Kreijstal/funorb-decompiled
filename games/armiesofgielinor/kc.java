/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends oj {
    private int field_y;
    private int field_z;

    final String a(byte param0, boolean param1) {
        if (param1) {
          System.out.println("Turn change: new turn: " + this.field_y + " player: " + this.field_z);
        }
        String var3 = "EventTurnChange: new turn: " + this.field_y + " player: " + this.field_z;
        int var4 = 2 % ((param0 - 53) / 51);
        return var3;
    }

    final static void d(byte param0) {
        vi.a(-76);
        if (param0 != -112) {
          return;
        }
        mw.b(dh.field_n[0].field_A, jn.field_c, mi.field_l, gl.field_c, jn.field_d, 1);
    }

    final void a(ha param0, int param1) {
        try {
          if (param1 != -26661) {
            this.field_y = 68;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kc.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.field_xb.field_X) {
            return false;
          }
          param2.f(this.field_y, this.field_z, 0);
          if (param1 < -84) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("kc.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    kc(int param0, int param1) {
        this.field_z = param1;
        this.field_m = 22;
        this.field_y = param0;
    }

    static {
    }
}
