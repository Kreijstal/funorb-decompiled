/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    static boolean field_g;
    static String field_f;
    static String field_b;
    static long field_d;
    static String field_c;
    static String field_e;
    static String[] field_a;

    final static long a(long param0, int param1) {
        int var3 = 99 / ((-59 - param1) / 58);
        return param0 + 1L;
    }

    final static int b(byte param0) {
        if (param0 != 46) {
          field_c = (String) null;
        }
        return bh.field_l - ka.field_a;
    }

    final static void a(int param0, int param1, int param2, byte param3, String param4, int param5) {
        if (param3 != 32) {
          return;
        }
        try {
          ul.a(param1, 1, param2, false, (byte) 117, param5, 16, param0, 1, param4);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wq.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        int stackIn_42_0 = 0;
        String stackIn_70_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        String var3_ref_String = null;
        int var4 = 0;
        long var5_long = 0L;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        var8 = Kickabout.field_G;
        try {
          var1_int = 0;
          if (hr.field_k) {
            var1_int++;
          }
          if (gd.field_a) {
            var1_int++;
          }
          if (gk.field_e) {
            var1_int++;
          }
          if (pq.field_K) {
            var1_int++;
          }
          if (wp.field_f) {
            var1_int++;
          }
          if (wl.field_g) {
            var1_int++;
          }
          if (fa.field_j != 0) {
            var1_int++;
          }
          if (pb.field_B) {
            var1_int++;
          }
          if (wl.field_o &&
            null != um.field_e) {
            var1_int = var1_int + um.field_e.field_o.field_I;
          }
          if (var1_int == 0) {
            return;
          }
          var1_int = var1_int * 20 + 10;
          on.a(470, 10, 160, var1_int, 34);
          on.e(470, 10, 160, var1_int, 3355477);
          on.e(471, 11, 158, -2 + var1_int, 11184844);
          on.e(472, 12, 156, var1_int - 4, 5592439);
          if (param0 < 13) {
            return;
          }
          var2 = 30;
          if (gd.field_a) {
            var3_long = Runtime.getRuntime().totalMemory();
            var5_long = Runtime.getRuntime().freeMemory();
            var7 = (-var5_long + var3_long) / 1024L + " kB / " + var3_long / 1024L + " kB";
            pb.field_C.c(var7, 620, var2, 16777215, 0);
            var2 += 20;
          }
          if (hr.field_k) {
            var9 = nk.field_h + " fps / " + fb.field_T + " lps";
            pb.field_C.c(var9, 620, var2, 16777215, 0);
            var2 += 20;
          }
          if (wl.field_o &&
            null != um.field_e) {
            for (var3 = 0; var3 < um.field_e.field_o.field_I; var3++) {
              stackIn_42_0 = (~var3 == ~um.field_e.field_h) ? 16777215 : 11184812;
              var4 = stackIn_42_0;
              var10 = um.field_e.field_o.field_S[var3] + ": " + um.field_e.field_z[var3] + "ms / team " + um.field_e.field_o.field_g[var3].field_p;
              pb.field_C.c(var10, 620, var2, var4, 0);
              var2 += 20;
            }
          }
          if (pq.field_K) {
            var11 = "Synchronisation disabled";
            pb.field_C.c(var11, 620, var2, 16777215, 0);
            var2 += 20;
          }
          if (pb.field_B) {
            var12 = "Camera boundary disabled";
            pb.field_C.c(var12, 620, var2, 16777215, 0);
            var2 += 20;
          }
          if (gk.field_e) {
            var13 = "Response Filter disabled";
            pb.field_C.c(var13, 620, var2, 16777215, 0);
            var2 += 20;
          }
          if (wp.field_f) {
            var14 = "Smoothing disabled";
            pb.field_C.c(var14, 620, var2, 16777215, 0);
            var2 += 20;
          }
          if (fa.field_j != 0) {
            var15 = "Range:";
            var3_ref_String = var15;
            if (1 == fa.field_j) {
              var3_ref_String = var15 + " Ball";
            }
            if (fa.field_j == 2) {
              var3_ref_String = var3_ref_String + " Player";
            }
            if (fa.field_j == 3) {
              var3_ref_String = var3_ref_String + " Ball & Player";
            }
            pb.field_C.c(var3_ref_String, 620, var2, 16777215, 0);
            var2 += 20;
          }
          if (wl.field_g) {
            var3Lifetime1 = pq.field_J / 5;
            var4Lifetime1 = pq.field_J % 5;
            if (var4Lifetime1 != 0) {
              stackIn_70_0 = Integer.toString(var4Lifetime1);
            } else {
              stackIn_70_0 = "all";
            }
            var16 = stackIn_70_0;
            var5 = var16;
            var6 = "Viewing AI: " + var3Lifetime1 + "," + var16;
            pb.field_C.c(var6, 620, var2, 16777215, 0);
            var2 += 20;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "wq.F(" + param0 + ')');
        }
    }

    final static boolean c(byte param0) {
        int var1 = 42 % ((param0 + 20) / 57);
        return jn.a(17, so.a(71));
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_f = null;
        field_b = null;
        if (param0 >= -102) {
          wq.a(-76);
        }
    }

    static {
        field_c = "You need to play <%0> more rated games to unlock this option.";
        field_b = "Cancel draw";
        field_f = "<lt>";
        field_e = "rematch! ";
        field_g = false;
        field_a = new String[]{"Circle", "Square", "Triangle", "Diamond"};
    }
}
