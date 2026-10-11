/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vi extends be {
    int field_y;
    static wl field_A;
    static ck[] field_z;

    public static void f(byte param0) {
        field_A = null;
        field_z = null;
        if (param0 != 46) {
          String var2 = (String) null;
          vi.a((ji) null, (ji) null, (String) null, (byte) -124, (String) null);
        }
    }

    abstract Object c(int param0);

    abstract boolean g(byte param0);

    vi(int param0) {
        this.field_y = param0;
    }

    final static nj a(ji param0, ji param1, String param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        nj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.b(-1, param2);
          var7 = -37 % ((param3 - 39) / 44);
          var6 = param1.a(var5_int, 13030, param4);
          stackIn_1_0 = e.a(param0, var5_int, var6, (byte) -75, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("vi.I(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int d(int param0) {
        if (param0 != 1) {
          field_z = (ck[]) null;
          return 1;
        }
        return 1;
    }

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        bf var4_ref_bf = null;
        int var4 = 0;
        bf var5 = null;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          if (wf.field_u != ph.field_xb) {
            return false;
          }
          var2_long = ik.a(param1 + 4);
          if (ub.field_a != 0 &&
            dl.field_N < 0) {
            var4_ref_bf = (bf) (ci.field_h.c((byte) -98));
            if (var4_ref_bf != null &&
              var4_ref_bf.field_p < var2_long) {
              var4_ref_bf.b((byte) 112);
              sm.field_e = var4_ref_bf.field_n.length;
              de.field_V.field_n = 0;
              for (var5_int = 0; var5_int < sm.field_e; var5_int++) {
                de.field_V.field_r[var5_int] = var4_ref_bf.field_n[var5_int];
              }
              lg.field_U = bb.field_d;
              bb.field_d = kf.field_L;
              kf.field_L = bh.field_k;
              bh.field_k = var4_ref_bf.field_s;
              return true;
            }
          }
          if (param1 != 0) {
            vi.d(-63);
          }
          while (true) {
            if (0 > dl.field_N) {
              de.field_V.field_n = 0;
              if (!pe.b(param1 + 25973, 1)) {
                return false;
              }
              dl.field_N = de.field_V.i((byte) 81);
              de.field_V.field_n = 0;
              sm.field_e = param0[dl.field_N];
            }
            if (!fh.a((byte) 116)) {
              return false;
            }
            if (ub.field_a == 0) {
              lg.field_U = bb.field_d;
              bb.field_d = kf.field_L;
              kf.field_L = bh.field_k;
              bh.field_k = dl.field_N;
              dl.field_N = -1;
              return true;
            }
            var4 = ub.field_a;
            if (0.0 != pg.field_b) {
              var4 = (int)((double)var4 + gg.field_A.nextGaussian() * pg.field_b);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new bf(var2_long + (long)var4, dl.field_N, new byte[sm.field_e]);
            for (var6 = 0; sm.field_e > var6; var6++) {
              var5.field_n[var6] = de.field_V.field_r[var6];
            }
            ci.field_h.a(var5, param1 ^ 2777);
            dl.field_N = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("vi.L(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_A = new wl(256);
    }
}
