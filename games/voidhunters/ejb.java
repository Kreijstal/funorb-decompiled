/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ejb extends rqa {
    static int field_p;
    static String field_o;

    ejb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ifa var4 = null;
        qn var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
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
        faa var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = VoidHunters.field_G;
        try {
          if (param0 != 1) {
            ejb.e(-77);
          }
          var27 = qga.field_b;
          var2 = var27.e((byte) -93);
          if (0 == var2) {
            var3 = var27.e(param0 + 1868);
            var4_ref = (qn) (md.field_j.d(0));
            while (var4_ref != null) {
              if (var3 != var4_ref.field_e) {
                var4_ref = (qn) (md.field_j.a((byte) 17));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              ifb.l(-116);
              return;
            }
            var5 = var27.e((byte) -97);
            if (0 != var5) {
              var6 = var4_ref.field_i;
              dda.field_d[0].field_b = null;
              dda.field_d[0].field_a = kca.field_a;
              var7 = var4_ref.field_g;
              dda.field_d[0].field_c = false;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                dda.field_d[var8_int].field_a = var27.a(param0 - 2);
                dda.field_d[var8_int].field_c = false;
                if (var27.e((byte) -119) == 1) {
                  dda.field_d[var8_int].field_b = var27.a(param0 ^ -2);
                } else {
                  dda.field_d[var8_int].field_b = null;
                }
              }
              var8 = new String[3][var6];
              var9 = new String[3][var6];
              var34 = new long[3][var6];
              var35 = new int[3][var7 * var6];
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.e((byte) -97);
              if (0 < var18) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var27.e((byte) -114);
                  var21 = dda.field_d[var20].field_a;
                  var22 = var27.k(255);
                  var24 = var27.field_e;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = dda.field_d[var20].field_b;
                    var34[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$0 = var15;
                      var15++;
                      var35[0][incrementValue$0] = var27.h(mgb.a(param0, 75));
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    qja.a((byte) -75, var21)) {
                    var8[1][var13] = kca.field_a;
                    var9[1][var13] = null;
                    var34[1][var13] = var22;
                    var13++;
                    var27.field_e = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$1 = var16;
                      var16++;
                      var35[1][incrementValue$1] = var27.h(param0 + 20);
                    }
                  }
                  if (var14 < var6 &&
                    !dda.field_d[var20].field_c) {
                    dda.field_d[var20].field_c = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = dda.field_d[var20].field_b;
                    var34[2][var14] = var22;
                    var14++;
                    var27.field_e = var24;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$2 = var17;
                      var17++;
                      var35[2][incrementValue$2] = var27.h(21);
                    }
                  }
                }
                var4_ref.b(-3846);
                return;
              }
            }
            var4_ref.b(-3846);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.e(1869);
            var27.k(param0 ^ 254);
            var4 = (ifa) (hga.field_p.d(param0 - 1));
            while (var4 != null) {
              if (var3Lifetime1 != var4.field_i) {
                var4 = (ifa) (hga.field_p.a((byte) 10));
                continue;
              }
              break;
            }
            if (var4 == null) {
              ifb.l(-126);
              return;
            }
            var4.b(-3846);
            return;
          }
          gna.a((Throwable) null, "HS1: " + hm.e(-13514), 0);
          ifb.l(-119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ejb.C(" + param0 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(119, 122));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ejb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 <= 92) {
          ejb.a(-87);
        }
    }

    static {
        field_o = "From <%0>: ";
        field_p = 0;
    }
}
