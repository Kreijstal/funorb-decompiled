/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nm {
    nm field_b;
    nm field_e;
    static th field_c;
    static String field_a;
    static jp[] field_f;
    static jp field_d;
    static int[] field_h;
    long field_g;

    final boolean b(int param0) {
        if (param0 != 0) {
          this.b((byte) 95);
          if (null != this.field_b) {
            return true;
          }
          return false;
        }
        if (null != this.field_b) {
          return true;
        }
        return false;
    }

    final static String a(CharSequence[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = ao.a(0, param0.length, 19166, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("nm.DB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (this.field_b == null) {
          return;
        }
        if (param0 == 111) {
          this.field_b.field_e = this.field_e;
          this.field_e.field_b = this.field_b;
          this.field_b = null;
          this.field_e = null;
          return;
        }
        field_a = (String) null;
        this.field_b.field_e = this.field_e;
        this.field_e.field_b = this.field_b;
        this.field_b = null;
        this.field_e = null;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_c = null;
        if (!param0) {
          return;
        }
        field_h = null;
        field_a = null;
        field_d = null;
    }

    static {
        field_c = new th(1, 2, 2, 0);
        field_a = "Waiting for <%0> to start the game...";
        field_h = new int[]{26679, 10200253, 12658477, 16494651, 16711935};
    }
}
