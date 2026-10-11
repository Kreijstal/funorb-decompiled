/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends kl {
    boolean field_r;
    private pp field_n;
    static cn field_o;
    int field_u;
    static String field_q;
    private String field_p;
    private String field_m;
    private pp field_s;
    static int field_t;

    pk(String param0, String param1, int param2) {
        this(param0, param1, mp.field_e.toUpperCase(), um.field_d.toUpperCase(), param2);
    }

    public static void e(int param0) {
        if (param0 <= 84) {
          pk.d(-81);
          field_o = null;
          field_q = null;
          return;
        }
        field_o = null;
        field_q = null;
    }

    final static void a(int param0, String param1) {
        try {
          ai.a(param1, 14);
          gh.a(23321, sl.field_a, false);
          if (param0 >= -1) {
            pk.d(79);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        wj var6 = null;
        int var7 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        ak var12 = null;
        pe var13 = null;
        pe var14 = null;
        wj var15 = null;
        var9 = DungeonAssault.field_K;
        try {
          var15 = ra.field_c;
          var3 = -99 % ((72 - param0) / 50);
          var2 = var15.c(true);
          if (var2 == 0) {
            var11 = wa.b(-1);
            var4 = var11;
            var10 = var11;
            var5 = var10;
            var6 = var15;
            var7 = ((ec) ((Object) var6)).c(true);
            for (var8 = 0; var7 > var8; var8++) {
              var10[var8] = ((ec) ((Object) var6)).h(-111);
            }
            var13 = (pe) (sf.field_c.e(-24172));
            if (var13 != null) {
              var13.a(false);
              return;
            }
            tl.a(111);
            return;
          }
          if (1 == var2) {
            var12 = (ak) (oh.field_j.e(-24172));
            if (var12 != null) {
              var12.a(false);
              return;
            }
            tl.a(-110);
            return;
          }
          if (var2 != 2) {
            sm.a((Throwable) null, 1, "A1: " + sj.l(192));
            tl.a(-16);
            return;
          }
          var14 = (pe) (sf.field_c.e(-24172));
          if (var14 == null) {
            tl.a(-43);
            return;
          }
          wa.b(-1);
          var14.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "pk.E(" + param0 + ')');
        }
    }

    final void b(int param0) {
        super.b(-81);
        int var2 = 78 / ((41 - param0) / 63);
        int var3 = 60 + this.field_j;
        la.field_b.a(this.field_m, 40 + this.field_k, var3, -80 + this.field_a, -16 + this.field_i + (this.field_j - var3 - (jm.field_i.field_v >> 1)), 16777215, -1, 1, 1, la.field_b.field_H);
    }

    final void b(byte param0) {
        int var3_int = 0;
        ph var16 = null;
        cn var14 = null;
        cn var15 = null;
        int var9 = DungeonAssault.field_K;
        int[] var10 = new int[64];
        int[] var2 = var10;
        for (var3_int = 0; 64 > var3_int; var3_int++) {
          var10[var3_int] = mp.a((24 + var3_int) * 65793, -2147483648);
        }
        cn var3 = te.a(-32 + this.field_a, this.field_i - 28, var10, 16, 8, 0.125);
        int[] var4 = te.b(-32 + this.field_a, -28 + this.field_i, 0.125);
        cn var5 = new cn(0, 0);
        if (param0 == 37) {
          var5.field_y = -32 + this.field_a;
          var5.field_v = this.field_i - 28;
          var5.field_B = var4;
          var16 = new ph(var3, var5);
          var14 = new cn(this.field_a, this.field_i);
          var15 = new cn(this.field_a, this.field_i);
          this.field_l = new ph(var14, var15);
          jh.a(this.field_l);
          var16.b(16, 16);
          qe.a(23, 13, -46 + this.field_a, this.field_i - 34, 256, 32, 8, 128);
          jc.a(-26 + this.field_i, 16, 14, 1, 2, 1);
          jc.a(-26 + this.field_i, this.field_a - 24, 14, 1, 2, 1);
          vd.a(-16 + this.field_a, 2, -14561, 2, 8, 0);
          vd.a(this.field_a, 2, -14561, 2, 0, 6);
          vd.a(this.field_a, 2, param0 ^ -14534, 2, 0, 54);
          vd.a(this.field_a - 16, 2, param0 ^ -14534, 2, 8, this.field_i - 16);
          vd.a(this.field_a, 2, -14561, 2, 0, -22 + this.field_i);
          jc.a(40, 80, 14, 1, 2, 1);
          jc.a(40, -88 + this.field_a, 14, 1, 2, 1);
          oe.field_m.h(8, 21);
          oe.field_m.j(-63 + this.field_a, 21);
          ad.field_e.i(23, -38 + this.field_i);
          ad.field_e.f(this.field_a - 39, this.field_i - 38);
          da.a(this.field_p, cm.field_M, this.field_a >> 1, 1917623617, (36 + ne.field_c.field_H >> 1) + 14, ne.field_c);
          jh.b();
          return;
        }
        field_q = (String) null;
        var5.field_y = -32 + this.field_a;
        var5.field_v = this.field_i - 28;
        var5.field_B = var4;
        ph var13 = new ph(var3, var5);
        cn var11 = new cn(this.field_a, this.field_i);
        cn var12 = new cn(this.field_a, this.field_i);
        this.field_l = new ph(var11, var12);
        jh.a(this.field_l);
        var13.b(16, 16);
        qe.a(23, 13, -46 + this.field_a, this.field_i - 34, 256, 32, 8, 128);
        jc.a(-26 + this.field_i, 16, 14, 1, 2, 1);
        jc.a(-26 + this.field_i, this.field_a - 24, 14, 1, 2, 1);
        vd.a(-16 + this.field_a, 2, -14561, 2, 8, 0);
        vd.a(this.field_a, 2, -14561, 2, 0, 6);
        vd.a(this.field_a, 2, param0 ^ -14534, 2, 0, 54);
        vd.a(this.field_a - 16, 2, param0 ^ -14534, 2, 8, this.field_i - 16);
        vd.a(this.field_a, 2, -14561, 2, 0, -22 + this.field_i);
        jc.a(40, 80, 14, 1, 2, 1);
        jc.a(40, -88 + this.field_a, 14, 1, 2, 1);
        oe.field_m.h(8, 21);
        oe.field_m.j(-63 + this.field_a, 21);
        ad.field_e.i(23, -38 + this.field_i);
        ad.field_e.f(this.field_a - 39, this.field_i - 38);
        da.a(this.field_p, cm.field_M, this.field_a >> 1, 1917623617, (36 + ne.field_c.field_H >> 1) + 14, ne.field_c);
        jh.b();
    }

    pk(String param0, String param1, String param2, String param3, int param4) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          this.field_p = param0;
          this.field_u = param4;
          this.field_m = param1;
          var6_int = 78 + (jm.field_i.field_v + oj.a(this.field_m, -1, new int[]{300}, la.field_b) * la.field_b.field_H);
          this.a(450, 0, var6_int);
          this.field_d = false;
          this.field_n = tn.a(-jm.field_i.field_y + (-10 + (this.field_a >> 1)) + this.field_k, this.field_i + (this.field_j - 16) - (jm.field_i.field_v >> 1), ne.field_c, jm.field_i, -67, param2);
          this.field_s = tn.a(this.field_k - (-(this.field_a >> 1) - 10), -(jm.field_i.field_v >> 1) - 16 + (this.field_j + this.field_i), ne.field_c, jm.field_i, -93, param3);
          this.field_f.a(this.field_n, false);
          this.field_f.a(this.field_s, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_5_0 = var6;
          stackIn_5_1 = new StringBuilder().append("pk.<init>(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          super.a(param0);
          if (hh.field_s != null) {
            this.field_d = true;
            this.field_r = this.field_n == hh.field_s ? true : false;
          }
          return;
        }
        field_o = (cn) null;
        super.a(param0);
        if (hh.field_s != null) {
          this.field_d = true;
          this.field_r = this.field_n == hh.field_s ? true : false;
        }
    }

    static {
        field_q = "Swinging his morningstar wildly, the zealot has been fighting constantly for his cause so long he is no longer sure what it was.";
        field_t = 0;
    }
}
