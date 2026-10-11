/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pka implements qda {
    static sna[] field_b;
    private int field_d;
    static boolean field_f;
    private po field_c;
    static String field_a;
    private int field_e;

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
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
        lu var12 = null;
        var11 = BachelorFridge.field_y;
        try {
          if (!param1.field_t &&
            !param1.e(param2 - 31656)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          this.field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_w + "</u>", param0 + param1.field_s, param3 + param1.field_v, param1.field_p, param1.field_q, var6_int, -1, this.field_d, this.field_e, this.field_c.field_u + this.field_c.field_B);
          if (param1.e(1023)) {
            var7 = this.field_c.a(param1.field_w);
            var8 = this.field_c.field_u + this.field_c.field_B;
            var9 = param1.field_s + param0;
            var10 = param3 + param1.field_v;
            if (2 != this.field_d) {
              if (this.field_d == 1) {
                var9 = var9 + (param1.field_p - var7 >> 1);
              }
            } else {
              var9 = var9 + (param1.field_p - var7);
            }
            if (this.field_e != 2) {
              if (this.field_e == 1) {
                var10 = var10 + (param1.field_q - var8 >> 1);
              }
            } else {
              var10 = var10 + (param1.field_q - var8);
            }
            uv.a(var7 + 4, var10 + 2, var8, var9 - 2, false);
          }
          if (param2 == 32679) {
            return;
          }
          var12 = (lu) null;
          pka.a((lu) null, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("pka.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static nga a(lu param0, boolean param1) {
        RuntimeException var2 = null;
        nga stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_a = (String) null;
          }
          stackIn_3_0 = new nga(param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.c((byte) -85), param0.a(3), param0.b(16711935));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pka.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(kia param0, boolean param1, byte param2) {
        try {
          hda.a(-1, param0, param1, 256);
          if (param2 != 73) {
            lu var4 = (lu) null;
            pka.a((lu) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pka.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -8155) {
          field_f = false;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = -19 / ((9 - param0) / 54);
        if (param1) {
          iea.field_d = new eaa();
          mg.field_m.field_a = mg.field_m.field_a - dea.field_n;
          dea.field_n = 0;
          gu.field_d = 0;
          rs.a(true);
          lg.a(true, -3, true);
          gs.field_f.a(-65);
        }
    }

    public pka() {
        this.field_d = 1;
        this.field_c = jca.field_a;
        this.field_e = 1;
    }

    pka(po param0, int param1, int param2) {
        try {
          this.field_c = param0;
          this.field_e = param2;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_f = true;
        field_a = "This password is part of your Player Name, and would be easy to guess";
    }
}
