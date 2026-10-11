/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends li {
    int[][] field_p;
    private boolean[] field_n;
    int field_o;
    int[] field_r;
    static nj field_v;
    int field_x;
    int[] field_u;
    static String[] field_t;
    static ub field_y;
    static int[] field_w;
    static String[] field_q;
    static int field_s;

    final static ri a(int param0, int param1, byte param2, int param3) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        ri var4 = (ri) (ob.field_M.a((byte) 100));
        while (var4 != null) {
          if (var4.field_w == param0) {
            return var4;
          }
          var4 = (ri) (ob.field_M.b(96));
        }
        var4 = new ri();
        var4.field_n = param1;
        var4.field_w = param0;
        ob.field_M.a(var4, false);
        if (param2 > -70) {
          mb.b((byte) 6);
        }
        tg.a(param3, var4, 0);
        return var4;
    }

    public static void e(int param0) {
        field_w = null;
        if (param0 != -26523) {
          field_v = (nj) null;
        }
        field_q = null;
        field_t = null;
        field_y = null;
        field_v = null;
    }

    final static boolean a(byte param0) {
        if (param0 >= -88) {
          mb.a(-100);
        }
        return null != rc.field_d ? true : false;
    }

    final static void b(byte param0) {
        if (param0 != -110) {
          mb.b((byte) 10);
        }
        lj.a((byte) -116);
    }

    final static String a(int param0) {
        String var1 = "";
        if (eb.field_d != null) {
          var1 = eb.field_d.j(param0 ^ 5607);
        }
        if (var1.length() == 0) {
          var1 = vb.c(-15381);
        }
        if (var1.length() == 0) {
          var1 = dh.field_a;
        }
        if (param0 != 0) {
          field_s = -111;
        }
        return var1;
    }

    mb(int param0, byte[] param1) {
        int[] array$0 = null;
        int var5 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ed var7 = null;
        ed var8 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        try {
          this.field_x = param0;
          var7 = new ed(param1);
          var8 = var7;
          this.field_o = var8.h(-11);
          this.field_p = new int[this.field_o][];
          this.field_r = new int[this.field_o];
          this.field_n = new boolean[this.field_o];
          this.field_u = new int[this.field_o];
          for (var4 = 0; this.field_o > var4; var4++) {
            this.field_r[var4] = var7.h(-11);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_o; var4Lifetime1++) {
            stackIn_8_0 = this.field_n;
            stackIn_8_1 = var4Lifetime1;
            stackIn_9_2 = (var8.h(-11) == 1);
            stackIn_8_0[stackIn_8_1] = stackIn_9_2;
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < this.field_o; var4Lifetime2++) {
            this.field_u[var4Lifetime2] = var7.a((byte) -11);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < this.field_o; var4Lifetime3++) {
            array$0 = new int[var7.h(-11)];
            this.field_p[var4Lifetime3] = array$0;
          }
          for (var4Lifetime4 = 0; var4Lifetime4 < this.field_o; var4Lifetime4++) {
            for (var5 = 0; this.field_p[var4Lifetime4].length > var5; var5++) {
              this.field_p[var4Lifetime4][var5] = var7.h(-11);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("mb.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_v = new nj();
        field_y = null;
        field_w = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
    }
}
