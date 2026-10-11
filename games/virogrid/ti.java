/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti implements ol {
    private int field_f;
    static String field_a;
    static e field_g;
    private int field_e;
    static String field_c;
    static km field_h;
    static kf field_i;
    private e field_d;
    static int field_b;

    public static void b(int param0) {
        field_i = null;
        int var1 = 108 % ((58 - param0) / 55);
        field_h = null;
        field_g = null;
        field_c = null;
        field_a = null;
    }

    final static void c(int param0) {
        l.field_c = new p();
        int var1 = -112 / ((-57 - param0) / 39);
    }

    final static String a(int param0) {
        int var1 = 89 % ((53 - param0) / 57);
        return sh.field_qb.h(-121);
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (bn.field_d <= 0) {
          if (!qm.i(param1 ^ -1502464331)) {
            var2 = 1;
          } else {
            var2 = 0;
          }
        } else {
          if (null != kk.field_q) {
            ih.field_b = kk.field_q.a(11);
            rj.a(2, (byte) -92);
            if (null != ih.field_b) {
              var2 = 2;
              nn.a(ih.field_b, (byte) -54);
            } else {
              var2 = 3;
            }
          } else {
            ih.field_b = wm.a(640, 0, 480, 0, param1 + 1502469767, ei.field_c);
            if (null != ih.field_b) {
              var2 = 2;
              nn.a(ih.field_b, (byte) -54);
            } else {
              var2 = 3;
            }
          }
        }
        if (kk.field_q == null &&
          ia.field_c) {
          nm.a(param0, var2, (byte) 33);
        }
        if (param1 == -1502464351) {
          return;
        }
        field_g = (e) null;
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (!param1.field_p &&
            !param1.f(true)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          if (param4 != -23294) {
            return;
          }
          this.field_d.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_n + "</u>", param0 + param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, var6_int, -1, this.field_e, this.field_f, this.field_d.field_H + this.field_d.field_G);
          if (param1.f(true)) {
            var7 = this.field_d.a(param1.field_n);
            var8 = this.field_d.field_G + this.field_d.field_H;
            var9 = param0 + param1.field_l;
            var10 = param3 + param1.field_u;
            if (this.field_e != 2) {
              if (this.field_e == 1) {
                var9 = var9 + (param1.field_g - var7 >> 1);
              }
            } else {
              var9 = var9 + (param1.field_g - var7);
            }
            if (this.field_f == 2) {
              var10 = var10 + (-var8 + param1.field_m);
            } else {
              if (this.field_f == 1) {
                var10 = var10 + (param1.field_m - var8 >> 1);
              }
            }
            b.a(2 + var10, (byte) 58, -2 + var9, var7 + 4, var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public ti() {
        this.field_d = dj.field_h;
        this.field_f = 1;
        this.field_e = 1;
    }

    ti(e param0, int param1, int param2) {
        try {
          this.field_e = param1;
          this.field_d = param0;
          this.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Names should contain a maximum of 12 characters";
        field_c = "You have declined the invitation.";
    }
}
