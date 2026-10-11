/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends vi {
    static long field_q;
    static jp[] field_r;
    private int field_u;
    vl field_p;
    static String field_s;
    int field_t;

    public static void b(boolean param0) {
        field_r = null;
        if (!param0) {
          cl.b(true);
          field_s = null;
          return;
        }
        field_s = null;
    }

    final int a(int param0, StringBuilder param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ee var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = -1437511254;
          var3_int = var3_int + (73 + this.field_u * 71 << 3);
          var3_int = var3_int ^ this.field_t * 21 + 29298 << 9;
          if (param0 < 79) {
            this.field_u = 98;
          }
          var4 = (ee) (this.field_p.d(-103));
          while (var4 != null) {
            var3_int = var3_int ^ var4.a(92, param1);
            var4 = (ee) (this.field_p.a((byte) 116));
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("cl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    cl() {
        super(0, 0, 0, 0, 0);
        this.field_p = new vl();
    }

    final void a(int param0, wq param1) {
        int var3_int = 0;
        ee var4 = null;
        int var5 = 0;
        wq var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          this.field_u = param1.l(255);
          this.field_p.c((byte) -72);
          this.field_t = 0;
          var3_int = 0;
          if (param0 < 89) {
            var6 = (wq) null;
            this.a(-40, (wq) null);
          }
          while (this.field_u > var3_int) {
            var4 = new ee();
            var4.a(91, param1);
            this.field_p.a(var4, (byte) 3);
            this.field_t = this.field_t + var4.field_t;
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("cl.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_s = "The invitation has been withdrawn.";
    }
}
