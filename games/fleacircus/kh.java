/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    char[][] field_c;
    byte field_e;
    static mk field_a;
    byte field_f;
    static int field_d;
    static int field_g;
    static int field_b;

    final static Object a(boolean param0, byte[] param1, int param2) {
        qe var3 = null;
        RuntimeException var3_ref = null;
        qe stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (~param1.length < param2) {
            var3 = new qe();
            ((hd) ((Object) var3)).a(param2 + 13, param1);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (!param0) {
            stackIn_11_0 = (byte[]) (param1);
            return stackIn_11_0;
          }
          stackIn_9_0 = rl.a(1, param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -34) {
          return;
        }
        field_a = null;
    }

    kh(byte[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = 3;
          this.field_f = param0[1];
          this.field_e = param0[2];
          this.field_c = new char[40][21];
          for (var3 = 0; var3 < 40; var3++) {
            for (var4 = 0; var4 < 21; var4++) {
              this.field_c[var3][var4] = (char)param0[var2_int];
              var2_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("kh.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (rl.field_e == null ||
          !(rl.field_e.length >= param1)) {
          rl.field_e = new int[param1 * 2];
        }
        if (null == jl.field_b ||
          !(param1 <= jl.field_b.length)) {
          jl.field_b = new int[param1 * 2];
        }
        if (null == kk.field_b ||
          !(param1 <= kk.field_b.length)) {
          kk.field_b = new int[param1 * 2];
        }
        if (hg.field_q == null ||
          !(param1 <= hg.field_q.length)) {
          hg.field_q = new int[param1 * 2];
        }
        if (vh.field_i == null ||
          !(vh.field_i.length >= param1)) {
          vh.field_i = new int[2 * param1];
        }
        if (null == uj.field_a ||
          !(uj.field_a.length >= param1)) {
          uj.field_a = new int[2 * param1];
        }
        if (param2 != 26721) {
          kh.a(-42, -43, 83);
        }
        if (mh.field_y == null ||
          !(param0 + param1 <= mh.field_y.length)) {
          mh.field_y = new int[(param1 + param0) * 2];
        }
        if (null == se.field_d ||
          !(se.field_d.length >= param1)) {
          se.field_d = new boolean[param1 * 2];
        }
        lc.field_u = -2147483648;
        ok.field_L = -2147483648;
        ak.field_f = 2147483647;
        ea.field_a = 2147483647;
        qh.field_D = 0;
    }

    static {
    }
}
