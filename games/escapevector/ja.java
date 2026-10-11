/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String[] field_e;
    int field_d;
    int field_f;
    static fk field_a;
    int field_c;
    int field_g;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 113) {
          field_b = (String) null;
        }
        field_e = null;
    }

    final static void a(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ij var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        ik var6_ref_ik = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        c var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = EscapeVector.field_A;
        try {
          var28 = om.field_g;
          var2 = var28.e(0);
          if (var2 == 0) {
            var3 = var28.f(1952);
            var4 = (ij) (qd.field_n.a(false));
            while (var4 != null) {
              if (~var4.field_n != ~var3) {
                var4 = (ij) (qd.field_n.b((byte) 70));
                continue;
              }
              break;
            }
            if (var4 == null) {
              nm.a(16);
              return;
            }
            var5 = var28.e(0);
            if (var5 != 0) {
              var6 = var4.field_h;
              var7 = var4.field_j;
              bg.field_a[0].field_h = ck.field_r;
              bg.field_a[0].field_e = false;
              bg.field_a[0].field_a = null;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                bg.field_a[var8_int].field_h = var28.c(false);
                bg.field_a[var8_int].field_e = false;
                if (var28.e(0) != 1) {
                  bg.field_a[var8_int].field_a = null;
                } else {
                  bg.field_a[var8_int].field_a = var28.c(false);
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_m = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_k = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var7 * var6];
              var4.field_o = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.e(0);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var28.e(0);
                  var21 = bg.field_a[var20].field_h;
                  var22 = var28.i(-800509813);
                  var24 = var28.field_m;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = bg.field_a[var20].field_a;
                    var10[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.g(-5053);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    ic.a(var21, (byte) 112)) {
                    var8[1][var13] = ck.field_r;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.field_m = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.g(-5053);
                    }
                  }
                  if (var14 < var6 &&
                    !bg.field_a[var20].field_e) {
                    bg.field_a[var20].field_e = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = bg.field_a[var20].field_a;
                    var10[2][var14] = var22;
                    var28.field_m = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.g(-5053);
                    }
                  }
                }
              }
            }
            var4.field_l = true;
            var4.c((byte) -90);
          } else if (var2 == 1) {
            var3 = var28.f(1952);
            var4_long = var28.i(-800509813);
            var6_ref_ik = (ik) (vj.field_d.a(false));
            while (var6_ref_ik != null) {
              if (var6_ref_ik.field_i != var3) {
                var6_ref_ik = (ik) (vj.field_d.b((byte) 70));
                continue;
              }
              break;
            }
            if (var6_ref_ik == null) {
              nm.a(16);
              return;
            }
            var6_ref_ik.field_l = var4_long;
            var6_ref_ik.c((byte) -85);
          } else {
            pf.a(false, "HS1: " + hf.b((byte) 115), (Throwable) null);
            nm.a(16);
          }
          var3Lifetime1 = -111 / ((-41 - param0) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ja.C(" + param0 + ')');
        }
    }

    final static d a(String param0, boolean param1) {
        RuntimeException var2 = null;
        d stackIn_6_0 = null;
        d stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (di.field_g.b(0) &&
            !param0.equals(di.field_g.a(-100))) {
            di.field_g = vn.a((byte) 83, param0);
          }
          if (param1) {
            stackIn_8_0 = di.field_g;
            return stackIn_8_0;
          }
          stackIn_6_0 = (d) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ja.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        field_e = new String[]{"original", "classic", "retribution", "simulator"};
        field_b = "Previous";
        field_a = new fk(2);
    }
}
