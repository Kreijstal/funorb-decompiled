/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static gl field_h;
    static nl field_a;
    static vh[] field_b;
    static dd field_e;
    static int field_c;
    static ko field_i;
    static dd[][] field_d;
    static int field_f;
    static tq field_g;

    final static void a(byte param0, int param1, int param2, int param3) {
        tm.field_f = param3;
        vn.field_c = param2;
        ch.field_H = param1;
        int var4 = 5 / ((param0 + 30) / 63);
    }

    final static void a(int param0) {
        if (d.field_d != null) {
          d.field_d.k(17);
        }
        tg.field_a = new jp();
        if (param0 == -984040272) {
          tn.field_n.d(tg.field_a, param0 + 984040302);
          return;
        }
        field_c = 99;
        tn.field_n.d(tg.field_a, param0 + 984040302);
    }

    public static void b(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        if (param0 == 24470) {
          field_e = null;
          field_d = (dd[][]) null;
          field_b = null;
          field_i = null;
          return;
        }
        ta.a(false, -31);
        field_e = null;
        field_d = (dd[][]) null;
        field_b = null;
        field_i = null;
    }

    final static int[] a(int[] param0, int param1) {
        int var7 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8Lifetime1;
        try {
          if ((param0.length & 1) != 0) {
            throw new IllegalArgumentException("Must have an even number of arguments or array elements.");
          }
          var2_int = param0[param0.length - 2];
          var3 = new int[var2_int];
          var4 = param0[0];
          var5 = var4;
          var6 = param0[1];
          for (var7 = 2; var7 < param0.length; var7 += 2) {
            var8 = param0[var7];
            var9 = param0[var7 + 1];
            var10 = var8 - var4;
            var11 = var6 >> 16 & 255;
            var12 = var6 >> 8 & 255;
            var13 = var6 & 255;
            var14 = (var9 & 16711680) >> 16;
            var15 = (var9 & 65280) >> 8;
            var16 = var9 & 255;
            while (var8 > var5) {
              var17 = -var5 + var8;
              var18 = var5 - var4;
              var3[var5] = md.a((var13 * var17 + var18 * var16) / var10, md.a((var15 * var18 + var12 * var17) / var10 << 8, (var18 * var14 + var11 * var17) / var10 << 16));
              var5++;
            }
            var4 = var8;
            var6 = var9;
          }
          var8Lifetime1 = -108 % ((-60 - param1) / 59);
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ta.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static wc a(boolean param0, int param1) {
        wc var2 = new wc(true);
        var2.field_e = param0 ? true : false;
        if (param1 == -30914) {
          return var2;
        }
        field_g = (tq) null;
        return var2;
    }

    final static kl a(int param0, byte[] param1) {
        kl var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        kl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (kl) (stackIn_2_0);
          }
          var2 = new kl(param1, el.field_I, ih.field_d, pd.field_a, rc.field_f, ma.field_h, v.field_b);
          if (param0 != 16908) {
            field_f = -3;
          }
          sh.h(-1);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ta.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        if (param6 < param13) {
          if (param13 < param1) {
            tl.a(param10, param13, param6, param15, param3, param11, param14, param2, param7, param5, (byte) -49, param4, param12, param9, param1, param8, qh.field_d);
          } else {
            if (param6 >= param1) {
              tl.a(param3, param6, param1, param10, param15, param2, param11, param14, param12, param9, (byte) -49, param7, param4, param8, param13, param5, qh.field_d);
            } else {
              tl.a(param15, param1, param6, param10, param3, param14, param11, param2, param4, param8, (byte) -49, param7, param12, param9, param13, param5, qh.field_d);
            }
          }
        } else {
          if (param6 < param1) {
            tl.a(param3, param6, param13, param15, param10, param2, param14, param11, param12, param9, (byte) -49, param4, param7, param5, param1, param8, qh.field_d);
          } else {
            if (param13 >= param1) {
              tl.a(param10, param13, param1, param3, param15, param11, param2, param14, param7, param5, (byte) -49, param12, param4, param8, param6, param9, qh.field_d);
            } else {
              tl.a(param15, param1, param13, param3, param10, param14, param2, param11, param4, param8, (byte) -49, param12, param7, param5, param6, param9, qh.field_d);
            }
          }
        }
        if (param0 <= -124) {
          return;
        }
        field_i = (ko) null;
    }

    static {
        field_a = new nl();
        field_i = new ko();
    }
}
