/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static qr field_c;
    static int[] field_a;
    static String field_d;
    static ir field_b;

    final static void a(byte param0, qr param1, qr param2) {
        try {
          if (null == param1.field_M) {
            param1.field_M = new pf();
          }
          if (null == param2.field_M) {
            param2.field_M = new pf();
          }
          if (eg.field_q == null) {
            eg.field_q = new in(64);
          }
          if (sl.field_m == null) {
            sl.field_m = new in(64);
          }
          vd.field_j = param1.field_M;
          fp.field_b = param2.field_M;
          if (param0 <= 42) {
            field_a = (int[]) null;
          }
          an.a(true);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 > -80) {
          return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        lo var2 = null;
        boolean[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        Object var5 = null;
        int var6 = 0;
        Object var6_ref = null;
        int var7_int = 0;
        Object var7 = null;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        fs var12 = null;
        Object var5Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var5_intLifetime2;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var12 = ho.field_d;
          var2 = var12.field_m;
          if (param0 != -31560) {
            sj.a(60);
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = new boolean[4];
          if (var2 != null) {
            var4 = ((sd) ((Object) var2)).field_u[((sd) ((Object) var2)).field_w[3]];
            if (var4 != 0) {
              var5_int = 0;
              for (var6 = 0; var6 < 4; var6++) {
                if (0 == ((sd) ((Object) var2)).field_u[((sd) ((Object) var2)).field_w[var6]]) {
                  var5_int++;
                }
              }
              var6_ref = null;
              var5_intLifetime2 = 0;
              var7_int = 0;
              while (var7_int < 4) {
                var8 = ((sd) ((Object) var2)).field_w[var7_int];
                stackIn_18_0 = -1;
                stackIn_18_1 = ~((sd) ((Object) var2)).field_u[var8];
                if (stackIn_18_0 == stackIn_18_1) {
                  var9 = re.a("<col=<%0>><%1></col>", 4371, new String[]{Integer.toString(gm.field_k[var8], 16), h.field_x[var8]});
                  var6_ref = var9;
                  if (var5_intLifetime2 != 0) {
                    if (var5_intLifetime2 == 1) {
                      var6_ref = var9 + qn.field_d + (String) (var6_ref);
                    } else {
                      var6_ref = var9 + ef.field_d + (String) (var6_ref);
                    }
                  } else {
                    var6_ref = var9;
                  }
                  var5_intLifetime2++;
                }
                var7_int++;
              }
              var6_ref = re.a(qj.field_d, 4371, new String[]{(String) (var6_ref)});
              if (1 != var5_intLifetime2) {
                var6_ref = (String) (var6_ref) + oo.field_f;
              } else {
                var6_ref = (String) (var6_ref) + aq.field_n;
                var7 = var6_ref;
                var5 = var7;
              }
              uq.field_m.a((String) (var6_ref), param0 + 58835, "generateshortfall");
              decompiledFrameRemainder0 = false;
            }
            else {
              uq.field_m.a(cb.field_m, 27275, "generateshortfall");
            }
          }
          var4Lifetime1 = 0;
          for (var5_intLifetime1 = 0; var5_intLifetime1 < 4; var5_intLifetime1++) {
            if (var12.field_u[var5_intLifetime1] > 0) {
              var4Lifetime1++;
            }
          }
          var5Lifetime1 = null;
          var4Lifetime2 = 0;
          var11 = 0;
          var6Lifetime1 = var11;
          while (var11 < 4) {
            if (var12.field_u[var11] > 0 &&
              var3[var11]) {
              var7_ref = re.a("<col=<%0>><%1></col>", param0 ^ -27221, new String[]{Integer.toString(bg.field_e[var11], 16), or.field_d[var11]});
              var5Lifetime1 = var7_ref;
              if (var4Lifetime2 == 0) {
                var5Lifetime1 = var7_ref;
              } else {
                if (var4Lifetime2 != 1) {
                  var5Lifetime1 = var7_ref + ef.field_d + (String) (var5Lifetime1);
                } else {
                  var5Lifetime1 = var7_ref + qn.field_d + (String) (var5Lifetime1);
                }
              }
              var4Lifetime2++;
            }
            var11++;
          }
          uq.field_m.a((String) (var5Lifetime1), 27275, "generateprojectprogress");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "sj.A(" + param0 + ')');
        }
    }

    static {
        field_d = "Show all private chat";
    }
}
