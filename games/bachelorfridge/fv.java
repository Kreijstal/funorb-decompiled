/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends ana {
    static kv field_y;
    private taa field_z;
    static int field_w;
    static int[] field_x;
    private boolean field_v;

    final static void a(int param0, int param1, int param2, eaa param3, int param4, byte param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        rea var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        eaa var9 = null;
        var8 = BachelorFridge.field_y;
        try {
          var6 = (rea) (param3.b((byte) 90));
          if (param5 > -104) {
            var9 = (eaa) null;
            fv.a(6, 16, -46, (eaa) null, -23, (byte) 95);
          }
          while (var6 != null) {
            var7 = (var6.field_n >> 1) + (630 & (int)var6.field_m * 8357 + 326565 * (int)var6.field_j);
            if (var7 > 256) {
              var7 = 256;
            }
            param1 = var6.field_i;
            dg.f((int)var6.field_m + param4, -2 + (param0 + (int)var6.field_l), (128 - var6.field_n) / 16, param1, 256 - var7 >> 2);
            var6 = (rea) (param3.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("fv.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          if (!param0) {
            field_w = 2;
          }
          ola.field_p = ki.field_w;
          if (255 != param1) {
            if (param1 < 100) {
              sg.field_p = wu.a(param1, (byte) 97, param2);
              return;
            }
            if (param1 > 105) {
              sg.field_p = wu.a(param1, (byte) 97, param2);
              return;
            }
            sg.field_p = kw.a(false, param3);
            return;
          }
          stackIn_11_0 = 120;
          stackIn_12_1 = !(fga.field_f >= 13);
          sg.field_p = nna.$cfr$intArgs$a$262119530e06(stackIn_11_0, stackIn_12_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("fv.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int var2 = -54 % ((param0 - 71) / 47);
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (this.field_z.a((byte) -106)) {
          return false;
        }
        if (!this.field_v) {
          this.field_v = true;
          jja.a(192, -1, 42);
          this.field_q.field_s.field_d = this.field_q.field_s.field_d + 2;
          if (!(this.field_q.field_s.field_d >= 100)) {
            return false;
          }
          this.d(-103);
          return true;
        }
        this.field_q.field_s.field_d = this.field_q.field_s.field_d + 2;
        if (!(this.field_q.field_s.field_d >= 100)) {
          return false;
        }
        this.d(-103);
        return true;
    }

    private final void d(int param0) {
        if (param0 >= -76) {
          return;
        }
        this.field_q.field_s.field_d = 100;
    }

    public static void e(byte param0) {
        field_x = null;
        field_y = null;
        if (param0 == -35) {
          return;
        }
        field_x = (int[]) null;
    }

    fv(gj param0, tl param1) {
        super(param0, param1);
        this.field_v = false;
        try {
          this.field_z = new taa(this.field_q, (this.field_q.field_h.field_z >> 1) - 1, -3);
          this.a(27799, this.field_z);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "fv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = new int[8192];
    }
}
