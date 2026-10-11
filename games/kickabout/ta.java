/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends qt {
    static int field_A;
    static String field_D;
    static String field_E;
    static String[] field_C;
    static dg field_B;

    ta() {
    }

    final static void a(iw param0, java.math.BigInteger param1, int param2, int param3, byte[] param4, int param5, java.math.BigInteger param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Kickabout.field_G;
        try {
          var7_int = ql.a(param2, (byte) 122);
          if (jb.field_g == null) {
            jb.field_g = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = jb.field_g.nextInt();
          }
          if (df.field_I == null ||
            !(df.field_I.field_f.length >= var7_int)) {
            df.field_I = new iw(var7_int);
          }
          df.field_I.field_n = 0;
          df.field_I.a(param3, param2, 1991220144, param4);
          df.field_I.a((byte) 114, var7_int);
          df.field_I.a(var13, (byte) 53);
          if (uf.field_c == null ||
            !(uf.field_c.field_f.length >= 100)) {
            uf.field_c = new iw(100);
          }
          uf.field_c.field_n = 0;
          uf.field_c.a(111, param5);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            uf.field_c.b(param5 ^ -103, var13[var11]);
            var11++;
          }
          uf.field_c.g(param5 - 1207444482, param2);
          uf.field_c.a(param1, param6, param5 ^ 44);
          param0.a(0, uf.field_c.field_n, 1991220144, uf.field_c.field_f);
          param0.a(0, df.field_I.field_n, 1991220144, df.field_I.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("ta.GA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    void a(int param0, int param1, boolean param2) {
        super.a(param0 + param0, param1, param2);
        ic.field_h.a(tu.field_E, (byte) 120);
        da.field_h.b(22997);
        kc.a(ic.field_h.field_x, 415422632);
    }

    final static void e(int param0) {
        qg var1 = (qg) (ik.field_C.h(-126));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        if (param0 < 116) {
          java.math.BigInteger var2 = (java.math.BigInteger) null;
          ta.a((iw) null, (java.math.BigInteger) null, -77, 44, (byte[]) null, -52, (java.math.BigInteger) null);
        }
        on.a(var1.field_h, var1.field_g, var1.field_j);
        on.e(var1.field_e, var1.field_l, var1.field_i, var1.field_f);
        var1.field_h = null;
        tk.field_Ab.a(var1, 3);
    }

    void a(byte param0, boolean param1) {
        super.a((byte) -36, param1);
        int var3 = 31 / ((38 - param0) / 60);
        tc.a(ic.field_h.field_x, 5464);
    }

    public static void g(byte param0) {
        field_D = null;
        field_C = null;
        field_B = null;
        field_E = null;
        int var1 = 38 / ((param0 + 18) / 47);
    }

    static {
        field_C = new String[16];
        field_E = "Return to game";
        field_D = "Drawn";
    }
}
