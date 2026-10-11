/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends hf implements ai {
    private wp field_O;
    static int field_P;

    u(dg param0, vf param1) {
        super(param0, 200, 150);
        Object var3 = null;
        pk var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (ku.field_I != param1) {
            if (am.field_e == param1) {
              this.field_p = this.field_p + 10;
              var3 = sr.field_c;
              if (jt.a((byte) -96)) {
                this.field_p = this.field_p + 20;
                var3 = c.field_t;
              }
            } else {
              if (param1 == ta.field_f) {
                this.field_p = this.field_p + 30;
                var3 = ua.field_i;
              }
            }
          } else {
            var3 = fr.field_lb;
          }
          var4 = new pk((String) (var3), (qm) null);
          var4.field_p = 80;
          var4.field_q = this.field_q;
          var4.field_v = 50;
          var4.field_r = 0;
          var4.field_w = (mh) ((Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var4, 96);
          this.field_O = this.a((byte) -105, (qm) (this), jh.field_I);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("u.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static td a(ki param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        td stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            field_P = 21;
          }
          var4 = param0.c(-14296, param1);
          var3 = var4;
          if (var4 != null) {
            stackIn_6_0 = new td(var4);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (td) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("u.O(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void k(int param0) {
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
        if (param0 != 38) {
          field_P = -104;
        }
    }

    private final wp a(byte param0, qm param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        wp var5 = null;
        int var6 = 0;
        wp stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 112 % ((-21 - param0) / 53);
          var5 = new wp(param2, param1);
          var5.field_w = (mh) ((Object) new ue());
          var6 = this.field_p - 6;
          this.field_p = this.field_p + 38;
          var5.a(104, 15, var6, 30, -30 + this.field_q);
          this.a(var5, 102);
          this.c(false);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("u.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_O == param2) {
            this.k(38);
          }
          if (param1 == 710) {
            return;
          }
          field_P = 55;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("u.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(tv param0, int param1, byte param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        ki var6 = null;
        ud stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        tv stackIn_2_3;
        boolean stackIn_3_4 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = qr.field_b;
          stackIn_2_1 = param2 + 88;
          stackIn_2_2 = 1000000;
          stackIn_2_3 = (tv) (param0);
          stackIn_3_4 = !(param4);
          ((ud) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4, param3, param1);
          if (param2 == -87) {
            return;
          }
          var6 = (ki) null;
          u.a((ki) null, -117, -123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("u.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
