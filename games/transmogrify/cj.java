/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cj {
    static String[] field_e;
    int field_d;
    static ci field_c;
    static q field_b;
    int[] field_a;
    java.awt.Image field_f;
    int field_g;

    abstract void a(int param0, int param1, java.awt.Component param2, byte param3);

    final static void a(boolean param0, int param1) {
        if (param1 != 793) {
          return;
        }
        ec.a(true, param0, 106);
    }

    public static void a(byte param0) {
        int var1 = 89 % ((param0 - 40) / 50);
        field_c = null;
        field_e = null;
        field_b = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void a(int param0) {
        sb.a(this.field_a, this.field_d, this.field_g);
        if (param0 <= 102) {
          java.awt.Graphics var3 = (java.awt.Graphics) null;
          this.a(-68, -104, (java.awt.Graphics) null, 18);
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13861) {
            var3 = (java.awt.Canvas) null;
            cj.a((java.awt.Canvas) null, -52);
          }
          hj.a((java.awt.Component) ((Object) param0), param1 - 13863);
          jl.a((java.awt.Component) ((Object) param0), 0);
          if (null == ga.field_a) {
            return;
          }
          ga.field_a.a(false, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cj.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_b = new q();
    }
}
