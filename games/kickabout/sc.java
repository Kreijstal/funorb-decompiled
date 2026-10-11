/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends qt {
    static String[] field_B;
    static int field_E;
    private int field_C;
    private hd field_A;
    static int field_D;
    static wp[] field_F;

    final void b(int param0) {
        this.field_A = eo.a("", 7126504, un.field_d, -1, false);
        if (param0 != -38) {
          this.a((byte) -76, false);
        }
    }

    final void a(boolean param0, int param1) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        super.a(param0, 116);
        on.a(this.field_A.field_F - 150, this.field_A.field_T - 150, this.field_A.field_q + 300, this.field_A.field_mb + 160, 8, 65793, this.field_C >> 1);
        this.field_A.a(50, param0);
        String var3 = ct.field_w.toLowerCase();
        int var4 = (int)Math.abs(-(nj.a(-58) / 1000L % 6L) + 3L);
        un.field_d.c(hv.field_d.toUpperCase(), (this.field_A.field_q >> 1) + this.field_A.field_F, this.field_A.field_T + (this.field_A.field_mb >> 1) + 6, 16777215, -1, this.field_C);
        for (var5 = 0; var4 > var5; var5++) {
          var3 = var3 + ".";
        }
        if (param1 >= 99) {
          un.field_d.a(var3, this.field_A.field_F - 150, -150 + this.field_A.field_T, this.field_A.field_q + 300, 130, 16777215, -1, this.field_C, 1, 1, 0);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, -126, param3);
          this.a(false);
          if (param1) {
            this.field_C = param0;
          } else {
            this.field_C = 256 - (param0 << 1);
          }
          if (this.field_C > 256) {
            this.field_C = 256;
          }
          if (this.field_C < 0) {
            this.field_C = 0;
          }
          this.field_A.field_P = this.field_C;
          if (param2 < -28) {
            return;
          }
          field_F = (wp[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("sc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void g(byte param0) {
        if (param0 < -112) {
          eo.b(ug.a(0, (int)wm.field_C), lf.a((byte) -125, (int)cq.field_f), 10, 16711680);
          return;
        }
        sc.e(70);
        eo.b(ug.a(0, (int)wm.field_C), lf.a((byte) -125, (int)cq.field_f), 10, 16711680);
    }

    private final void a(boolean param0) {
        if (!param0) {
          this.field_A.a(true, this.field_A.field_q, (f.field_d >> 1) - (this.field_A.field_q >> 1), 100 + (vc.field_B >> 1), this.field_A.field_mb);
          return;
        }
    }

    sc() {
        this.field_C = 0;
    }

    public static void e(int param0) {
        field_F = null;
        if (param0 != 130) {
          return;
        }
        field_B = null;
    }

    final void a(byte param0, boolean param1) {
        super.a((byte) 122, param1);
        this.field_A.b(0, param1);
        int var3 = -96 % ((param0 - 38) / 60);
        if (1 != this.field_A.field_sb) {
          return;
        }
        ii.a((byte) -120);
        vj.a(-81, true);
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0 + param0, param1, param2);
    }

    static {
        int var0 = 0;
        field_B = new String[255];
        field_F = new wp[255];
        for (var0 = 0; field_F.length > var0; var0++) {
          field_F[var0] = new wp();
        }
    }
}
