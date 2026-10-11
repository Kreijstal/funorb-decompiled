/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pg {
    static int field_b;
    static long[] field_d;
    static o field_a;
    static String field_c;
    static boolean field_e;

    final static void c(byte param0) {
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
        long var4 = 0L;
        sd var4_ref_sd = null;
        int var5 = 0;
        qc var6 = null;
        int var6_int = 0;
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
        jd var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 >= -112) {
            field_d = (long[]) null;
          }
          var27 = te.field_N;
          var2 = var27.j(255);
          if (var2 == 0) {
            var3 = var27.i(-109);
            var4_ref_sd = (sd) (r.field_b.a((byte) 51));
            while (var4_ref_sd != null) {
              if (var3 != var4_ref_sd.field_o) {
                var4_ref_sd = (sd) (r.field_b.b(-125));
                continue;
              }
              break;
            }
            if (var4_ref_sd == null) {
              je.a(false);
              return;
            }
            var5 = var27.j(255);
            if (var5 != 0) {
              var6_int = var4_ref_sd.field_k;
              da.field_a[0].field_c = false;
              da.field_a[0].field_d = ne.field_g;
              var7 = var4_ref_sd.field_l;
              da.field_a[0].field_a = null;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                da.field_a[var8_int].field_d = var27.h(115);
                da.field_a[var8_int].field_c = false;
                if (var27.j(255) != 1) {
                  da.field_a[var8_int].field_a = null;
                } else {
                  da.field_a[var8_int].field_a = var27.h(105);
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_sd.field_n = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_sd.field_m = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var7 * var6_int];
              var4_ref_sd.field_i = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.j(255);
              if (0 < var18) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var27.j(255);
                  var21 = da.field_a[var20].field_d;
                  var22 = var27.a(10526);
                  var24 = var27.field_m;
                  if (var6_int > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = da.field_a[var20].field_a;
                    var10[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.e(true);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    kj.a(var21, (byte) -47)) {
                    var8[1][var13] = ne.field_g;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var27.field_m = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.e(true);
                    }
                  }
                  if (var14 < var6_int &&
                    !da.field_a[var20].field_c) {
                    da.field_a[var20].field_c = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = da.field_a[var20].field_a;
                    var10[2][var14] = var22;
                    var27.field_m = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.e(true);
                    }
                  }
                }
              }
            }
            var4_ref_sd.field_h = true;
            var4_ref_sd.c(10);
            return;
          }
          if (1 == var2) {
            var3Lifetime1 = var27.i(-4);
            var4 = var27.a(10526);
            var6 = (qc) (sb.field_c.a((byte) 51));
            while (var6 != null) {
              if (var6.field_u != var3Lifetime1) {
                var6 = (qc) (sb.field_c.b(-111));
                continue;
              }
              break;
            }
            if (var6 == null) {
              je.a(false);
              return;
            }
            var6.field_n = var4;
            var6.c(10);
            return;
          }
          hi.a((Throwable) null, "HS1: " + oc.a(false), 1);
          je.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "pg.A(" + param0 + ')');
        }
    }

    final static int a(byte param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_25_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          gb var2 = null;
          if (il.field_c.field_l >= 4) {
            if (-1 == il.field_c.field_c) {
              return 3;
            }
            if (il.field_c.field_c != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (0 == ug.field_f) {
              ik.field_b = n.field_a.a(qk.field_o, ue.field_a, -28148);
              ug.field_f = ug.field_f + 1;
            }
            if (ug.field_f == 1) {
              if (2 == ik.field_b.field_c) {
                stackIn_14_0 = ua.a(-1, (byte) -86);
                return stackIn_14_0;
              }
              if (ik.field_b.field_c == 1) {
                ug.field_f = ug.field_f + 1;
              }
            }
            if (ug.field_f == 2) {
              qf.field_a = new ad((java.net.Socket) (ik.field_b.field_e), n.field_a);
              var2 = new gb(13);
              si.a(hj.field_x, (byte) 22, sa.field_o, q.field_a, var2);
              var2.c(param0 + 35, 15);
              var2.b(nc.field_a, false);
              qf.field_a.a(-28748, 0, 13, var2.field_l);
              ug.field_f = ug.field_f + 1;
              cj.field_c = 30000L + je.a(1);
            }
            if (ug.field_f == 3) {
              if (qf.field_a.b(-30119) <= 0) {
                if (cj.field_c < je.a(param0 ^ 82)) {
                  stackIn_29_0 = ua.a(-2, (byte) -86);
                  return stackIn_29_0;
                }
              } else {
                var1_int = qf.field_a.a(-116);
                if (0 != var1_int) {
                  stackIn_25_0 = ua.a(var1_int, (byte) -86);
                  return stackIn_25_0;
                }
                ug.field_f = ug.field_f + 1;
              }
            }
            if (param0 != 83) {
              pg.a((byte) 9);
            }
            if (ug.field_f != 4) {
              stackIn_36_0 = -1;
              return stackIn_36_0;
            }
            il.field_c.a(la.field_n, (byte) 106, qf.field_a);
            ug.field_f = 0;
            ik.field_b = null;
            qf.field_a = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ua.a(-3, (byte) -86);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        uc.field_b = (param0 << 16) / 150;
        if (param1 != 1) {
          field_e = false;
        }
        uc.field_c = param0 * 400 / 150;
        uc.field_e = param0 * 100 / 150;
    }

    public static void b(byte param0) {
        if (param0 <= 112) {
          field_b = -11;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_d = new long[32];
        field_c = "Menu: 'ESC'";
    }
}
