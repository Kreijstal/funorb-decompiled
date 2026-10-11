/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends lw {
    static cf field_l;
    static boolean field_m;

    final static void e(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = BachelorFridge.field_y;
        try {
          cma.field_x = new js(256);
          var1_int = -102 / ((-53 - param0) / 51);
          for (var2 = 0; dq.field_a.length > var2; var2++) {
            cma.field_x.a((long)dq.field_a[var2].toLowerCase().hashCode(), (byte) 76, new ji(var2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "li.B(" + param0 + ')');
        }
    }

    final void a(int param0) {
        hp.field_a = true;
        int var2 = 125 / ((59 - param0) / 33);
        this.c(102);
    }

    final static iga a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        iga stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          if (param0 != 26130) {
            var7 = (String) null;
            li.a(51, true, (String) null, (String) null);
          }
          var6 = null;
          if (param2.indexOf('@') != -1) {
            var6 = param2;
          } else {
            var8 = (CharSequence) ((Object) param2);
            var4_long = mp.a(var8, true);
          }
          stackIn_6_0 = ov.a(var4_long, param1, (String) (var6), param3, (byte) 58);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("li.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2 = (int)((-Math.cos((double)(vr.field_b * 4) * 3.141592653589793 / 100.0) + 1.0) * 256.0);
        if (param0 > 103) {
          if (this.field_e == 0) {
            vg.a(sia.field_j, 3360, 22997, 16000, 4096 + var2, 3520, 4096 + var2, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
          }
          return;
        }
    }

    public static void d(int param0) {
        if (param0 != -46) {
          field_l = (cf) null;
          field_l = null;
          return;
        }
        field_l = null;
    }

    li() {
        super(true, new String[]{bga.field_h, ur.field_m}, bp.field_w);
        this.field_c = new int[][]{new int[]{250, 195}, new int[]{320, 400}};
    }

    final void a(int param0, byte param1) {
        if (param0 == 9) {
          this.field_a = 2;
          this.b(1);
          this.c(param1 ^ 1);
        } else {
          if (param0 == 34 &&
            0 != this.field_e) {
            this.b(1);
            if (this.c((byte) 95)) {
              fla.b(23621);
            }
          }
        }
        if (param1 == 73) {
          return;
        }
        field_l = (cf) null;
    }

    static {
        field_l = new cf();
    }
}
