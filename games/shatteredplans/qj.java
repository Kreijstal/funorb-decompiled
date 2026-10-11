/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static int field_g;
    static byte[] field_f;
    static String field_c;
    static int field_e;
    static String field_a;
    static int field_b;
    static String field_d;

    final static void a(sq param0, int param1) {
        int var8 = 0;
        bi[] array$0 = null;
        bi[] array$1 = null;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        int var6 = 0;
        int var7 = 0;
        lm var9 = null;
        int var11 = 0;
        String[] var12 = null;
        String[] var13 = null;
        String var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          te.field_c = 0;
          if (param0 == null) {
            sp.field_m = (bi[][]) null;
            eh.field_L = null;
            oi.field_i = (bi[][]) null;
            rg.field_f = null;
            return;
          }
          var2_int = rs.field_Cb.field_J + rs.field_Cb.field_q;
          var3 = -6 + param0.field_j - 20;
          var4 = uq.field_m.a(5607, param0.field_c);
          var12 = vi.a(rs.field_Cb, (byte) 109, var4, new int[]{var3});
          var6 = var12.length;
          ra.a(-106);
          if (0 < var6) {
            eh.field_L = new bi[var6];
            eh.field_L[0] = new bi(var3, var2_int);
            eh.field_L[0].e();
            rs.field_Cb.d(var12[0], 0, rs.field_Cb.field_J, 16777215, -1);
            for (var7 = 1; var7 < var6; var7++) {
              eh.field_L[var7] = new bi(var3, var2_int);
              eh.field_L[var7].e();
              rs.field_Cb.d(var12[var7], 0, rs.field_Cb.field_J, 16777215, -1);
            }
          } else {
            eh.field_L = null;
          }
          if (param1 != -1) {
            return;
          }
          if (param0.field_f != null) {
            var7Lifetime1 = param0.field_f.length;
            rg.field_f = new int[var7Lifetime1];
            sp.field_m = new bi[var7Lifetime1][];
            oi.field_i = new bi[var7Lifetime1][];
            for (var8 = 0; var7Lifetime1 > var8; var8++) {
              var9 = param0.field_f[var8];
              var4Lifetime1 = uq.field_m.a(5607, var9.field_b);
              var13 = vi.a(rs.field_Cb, (byte) 121, var4Lifetime1, new int[]{var3});
              var6Lifetime1 = var13.length;
              array$0 = new bi[var6Lifetime1];
              oi.field_i[var8] = array$0;
              array$1 = new bi[var6Lifetime1];
              sp.field_m[var8] = array$1;
              for (var10 = 0; var10 < var6Lifetime1; var10++) {
                oi.field_i[var8][var10] = new bi(var3, var2_int);
                oi.field_i[var8][var10].e();
                rs.field_Cb.d(var13[var10], 0, rs.field_Cb.field_J, 16777215, -1);
                sp.field_m[var8][var10] = oi.field_i[var8][var10].g();
                sp.field_m[var8][var10].e();
                gf.b(1, 1, 0, 0, var3, var2_int);
              }
            }
          } else {
            rg.field_f = null;
            oi.field_i = (bi[][]) null;
            sp.field_m = (bi[][]) null;
          }
          cg.i(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("qj.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -20) {
          qj.a((byte) 115);
        }
        field_d = null;
        field_a = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(boolean param0, CharSequence param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = param2.length();
          var4 = param1.length();
          if (var4 > var3_int) {
            return false;
          }
          var5 = 0;
          if (!param0) {
            var9 = (CharSequence) null;
            qj.a(true, (CharSequence) null, (CharSequence) null);
          }
          while (var5 < var4) {
            var6 = param2.charAt(var5);
            var7 = param1.charAt(var5);
            if (var7 != var6 &&
              Character.toLowerCase((char) var6) != Character.toLowerCase((char) var7) &&
              Character.toUpperCase((char) var6) != Character.toUpperCase((char) var7)) {
              return false;
            }
            var5++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("qj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        int var1 = -31 / ((param0 + 8) / 53);
    }

    final static void a(byte param0, int param1) {
        if (param0 != -127) {
          return;
        }
        cr.field_b = param1;
    }

    final static qa a(byte param0, dc param1, ob param2) {
        ln var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -63) {
            qj.a((byte) 55);
          }
          var3 = mg.a(param1, param2, 20);
          var4 = param2.f(-20976);
          stackIn_3_0 = new qa(var3, var4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("qj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_e = 0;
        field_c = "Click or press F10 to open Quick Chat";
        field_a = "Encouraging rule breaking";
        field_d = "Our territory is currently short of <%0>, so to build more fleets we should concentrate on acquiring ";
    }
}
