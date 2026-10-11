/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends tj implements tb {
    static String field_jb;
    static String field_lb;
    static int field_ib;
    static int field_hb;
    private fe field_gb;
    static boolean field_kb;

    private final void j(byte param0) {
        if (!this.field_R) {
          return;
        }
        this.field_R = false;
        if (param0 != -59) {
          field_jb = (String) null;
        }
    }

    final static boolean a(byte param0, oq param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 118) {
            gk.i((byte) 80);
          }
          stackIn_5_0 = (param1.e(1, 63) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("gk.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    gk(lq param0, he param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ei var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != ic.field_c) {
            if (el.field_K == param1) {
              var3 = wh.field_i;
              this.field_y = this.field_y + 10;
              if (je.b((byte) 124)) {
                this.field_y = this.field_y + 20;
                var3 = rk.field_g;
              }
            } else {
              if (param1 == ni.field_eb) {
                var3 = de.field_c;
                this.field_y = this.field_y + 30;
              }
            }
          } else {
            var3 = lc.field_T;
          }
          var4 = new ei((String) (var3), (cc) null);
          var4.field_y = 80;
          var4.field_C = 0;
          var4.field_D = 50;
          var4.field_l = this.field_l;
          var4.field_z = (fp) ((Object) new am(qk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(true, var4);
          this.field_gb = this.a(2391, hi.field_i, (cc) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gk.<init>(");
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
          throw wm.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void i(byte param0) {
        if (param0 >= -44) {
          gk.i((byte) -8);
          field_jb = null;
          field_lb = null;
          return;
        }
        field_jb = null;
        field_lb = null;
    }

    private final fe a(int param0, String param1, cc param2) {
        fe var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fe stackIn_2_0 = null;
        fe stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fe(param1, param2);
          var4.field_z = (fp) ((Object) new ng());
          var5 = -6 + this.field_y;
          this.field_y = this.field_y + 38;
          var4.a(-14 + this.field_l - 16, 15, 30, false, var5);
          if (param0 != 2391) {
            stackIn_2_0 = (fe) null;
            return stackIn_2_0;
          }
          this.a(true, var4);
          this.e((byte) -126);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("gk.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == this.field_gb) {
            this.j((byte) -59);
          }
          if (param0) {
            return;
          }
          field_lb = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("gk.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_lb = "Use the mouse wheel <img=1>, drag <img=11><img=0>, or <img=7>/<img=8>, or <img=12>/<img=14> to set the power.";
        field_jb = "<%0> and <%1> have won!";
        field_kb = true;
    }
}
