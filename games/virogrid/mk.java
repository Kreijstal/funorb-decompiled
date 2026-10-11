/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends dc implements ta {
    private tg field_db;
    static java.awt.Frame field_cb;
    static int[] field_gb;
    static int[] field_eb;
    static String field_fb;
    static mg field_bb;

    private final void g(boolean param0) {
        if (!this.field_G) {
          return;
        }
        this.field_G = param0 ? true : false;
    }

    private final tg a(String param0, cd param1, byte param2) {
        tg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        tg stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new tg(param0, param1);
          var4.field_w = (ol) ((Object) new hf());
          var5 = -6 + this.field_m;
          this.field_m = this.field_m + 38;
          var4.a(30, true, var5, 15, -14 + this.field_g - 16);
          this.a((fi) (var4), (byte) -78);
          var6 = -20 % ((param2 + 24) / 62);
          this.d(false);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("mk.P(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void k(int param0) {
        if (param0 != -16) {
          return;
        }
        field_gb = null;
        field_fb = null;
        field_cb = null;
        field_eb = null;
        field_bb = null;
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == this.field_db) {
            this.g(false);
          }
          if (param0 == 12085) {
            return;
          }
          field_fb = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("mk.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(jc param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.g(11132);
          if (param1 > -41) {
            mk.k(-49);
          }
          stackIn_5_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("mk.R(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    mk(je param0, ra param1) {
        super(param0, 200, 150);
        Object var3 = null;
        fi var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != bj.field_h) {
            if (rg.field_b == param1) {
              var3 = tl.field_j;
              this.field_m = this.field_m + 10;
              if (pb.a(4)) {
                this.field_m = this.field_m + 20;
                var3 = ob.field_d;
              }
            } else {
              if (param1 == lb.field_a) {
                this.field_m = this.field_m + 30;
                var3 = el.field_i;
              }
            }
          } else {
            var3 = fd.field_x;
          }
          var4 = new fi((String) (var3), (cd) null);
          var4.field_u = 50;
          var4.field_m = 80;
          var4.field_l = 0;
          var4.field_g = this.field_g;
          var4.field_w = (ol) ((Object) new aj(dk.field_j, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var4, (byte) -78);
          this.field_db = this.a(je.field_I, (cd) (this), (byte) 75);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("mk.<init>(");
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
          throw kg.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_fb = "Scamming";
        field_eb = new int[5];
        field_gb = new int[8192];
    }
}
