/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends oe {
    private String field_Y;
    static od field_W;
    private boolean field_ab;
    private boolean field_Z;
    private hl field_bb;
    private String field_X;

    rl(ng param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_Y = param1;
            if (this.field_Y != null) {
                var3_int = hh.field_c.b(this.field_Y, 260, hh.field_c.field_o);
                this.c(var3_int + 150, 103, 300);
            }
            this.field_bb = new hl(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_ab = false;
            this.field_bb.field_C = true;
            this.field_Z = false;
            this.b((byte) -98, this.field_bb);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static cg a(int param0, ia param1, int param2) {
        RuntimeException var3 = null;
        cg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1000) {
            rl.n(-33);
          }
          stackIn_3_0 = new cg(param1, param0 * qk.field_j / 1000);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean n(int param0) {
        if (param0 != -1071908447) {
            return false;
        }
        return tf.field_d == si.field_g ? true : false;
    }

    final void m(int param0) {
        this.field_bb.field_C = false;
        this.field_ab = true;
        if (param0 != 23181) {
            ia var3 = (ia) null;
            rl.a(9, (ia) null, 122);
        }
    }

    final static void a(int param0, int param1, ph param2) {
        pk var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = fj.field_q;
          var3.a(param0, (byte) -85);
          var3.d((byte) 123, param2.field_f);
          var3.e(param2.field_h, param1 + 28161);
          if (param1 == 534) {
            return;
          }
          field_W = (od) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("rl.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 != 57) {
            field_W = (od) null;
            field_W = null;
            return;
        }
        field_W = null;
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -51 / ((param2 - 86) / 32);
          stackIn_2_0 = param0;
          if (this.field_Z) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) != stackIn_3_1) {
            this.field_X = param1;
            this.field_bb.field_x = (int)(65536.0f * (param3 / 100.0f));
            return;
          }
          if (!param0) {
            stackIn_8_1 = false;
          } else {
            stackIn_8_1 = true;
          }
          ((rl) (this)).field_Z = stackIn_8_1;
          if (!this.field_Z) {
            this.field_bb.a(4210752, 2113632, (byte) -103);
            if (this.field_ab) {
              this.field_bb.field_C = false;
            }
          } else {
            this.field_bb.a(4210752, 8405024, (byte) -103);
            this.field_bb.field_C = true;
          }
          this.field_X = param1;
          this.field_bb.field_x = (int)(65536.0f * (param3 / 100.0f));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        hh.field_c.b(this.field_X, (this.field_r >> 1) + param0, param2 + 103, 16777215, -1);
        if (this.field_Y != null) {
            vb.c(20 + param0, -7 + param2 + 120, 260, 8421504);
            hh.field_c.a(this.field_Y, param0 + 20, 8 + (120 + param2), 260, 100, 16777215, -1, 1, 0, hh.field_c.field_o);
        }
    }

    static {
        field_W = new od("usename");
    }
}
