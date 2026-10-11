/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static String field_c;
    static cb field_e;
    static boolean field_a;
    static int field_b;
    static int field_g;
    static String field_d;
    static int field_f;

    final static void a(int param0) {
        m var1 = (m) (on.field_nb.c(1504642273));
        if (var1 == null) {
          na.a(true);
          return;
        }
        pc var2 = vi.field_o;
        var2.k(0);
        var2.k(0);
        var2.k(0);
        var2.k(0);
        var1.c(2779);
        if (param0 != -14439) {
          ef.b(false);
        }
    }

    final static void b(boolean param0) {
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
        ue var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        rh var6_ref_rh = null;
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
        pc var28 = null;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Pixelate.field_H ? 1 : 0;
        try {
          var28 = vi.field_o;
          var2 = var28.f(255);
          if (var2 == 0) {
            var3 = var28.a((byte) 86);
            var4 = (ue) (f.field_c.c(1504642273));
            while (var4 != null) {
              if (var4.field_o != var3) {
                var4 = (ue) (f.field_c.f(1504642273));
                continue;
              }
              break;
            }
            if (var4 == null) {
              na.a(true);
              return;
            }
            var5 = var28.f(255);
            if (0 != var5) {
              var6 = var4.field_m;
              rh.field_u[0].field_e = kn.field_J;
              rh.field_u[0].field_f = null;
              var7 = var4.field_s;
              rh.field_u[0].field_c = false;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                rh.field_u[var8_int].field_e = var28.h(5);
                rh.field_u[var8_int].field_c = false;
                if (1 == var28.f(255)) {
                  rh.field_u[var8_int].field_f = var28.h(5);
                } else {
                  rh.field_u[var8_int].field_f = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_r = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_k = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_l = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.f(255);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var28.f(255);
                  var21 = rh.field_u[var20].field_e;
                  var22 = var28.a(false);
                  var24 = var28.field_m;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = rh.field_u[var20].field_f;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.k(0);
                    }
                  }
                  if (var21 != null &&
                    sm.a(var21, -1)) {
                    var8[1][var13] = kn.field_J;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.field_m = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.k(0);
                    }
                  }
                  if (var6 > var14 &&
                    !rh.field_u[var20].field_c) {
                    rh.field_u[var20].field_c = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = rh.field_u[var20].field_f;
                    var10[2][var14] = var22;
                    var28.field_m = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.k(0);
                    }
                  }
                }
              }
            }
            var4.field_n = true;
            var4.c(2779);
          } else if (var2 == 1) {
            var3 = var28.a((byte) -125);
            var4_long = var28.a(false);
            var6_ref_rh = (rh) (de.field_b.c(1504642273));
            while (var6_ref_rh != null) {
              if (var3 != var6_ref_rh.field_o) {
                var6_ref_rh = (rh) (de.field_b.f(1504642273));
                continue;
              }
              break;
            }
            if (var6_ref_rh == null) {
              na.a(!param0);
              return;
            }
            var6_ref_rh.field_q = var4_long;
            var6_ref_rh.c(2779);
          } else {
            jo.a(1, "HS1: " + jm.b(-63), (Throwable) null);
            na.a(!param0);
          }
          if (param0) {
            ef.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ef.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_b = 0;
        field_c = "GFX: Low Detail";
        field_d = "Chat is currently disabled.";
        field_f = 1;
    }
}
