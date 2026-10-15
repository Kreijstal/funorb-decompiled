/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ak {
    static String field_c;
    static int field_a;
    static String[] field_b;
    static int[] field_f;
    static km[] field_d;
    static mg field_e;

    final static void a(int param0, km param1) {
        km var5 = null;
        km var2 = null;
        int var3 = Virogrid.field_F ? 1 : 0;
        km var2Lifetime1;
        try {
          var5 = (km) (param1.field_W.a((byte) -89));
          var2 = var5;
          while (var5 != null) {
            var5.field_ub = 0;
            var5.field_Cb = 0;
            var5.field_kb = 0;
            var5.field_F = 0;
            var5 = (km) (param1.field_W.a(param0 - 164));
            var2Lifetime1 = var5;
          }
          if (param0 != 16377) {
            km var4 = (km) null;
            ak.a(97, (km) null);
          }
          param1.field_F = 0;
          param1.field_kb = 0;
          param1.field_ub = 0;
          param1.field_Cb = 0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ak.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          if (0 >= param0) {
            throw new IllegalArgumentException();
          }
          if (am.a((byte) -56, param0)) {
            stackIn_5_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 32);
            return stackIn_5_0;
          }
          var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
          if (param1 >= -56) {
            field_f = (int[]) null;
          }
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          stackIn_10_0 = bj.b(param0, var4, 1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ak.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != -31609) {
          field_b = (String[]) null;
        }
        oc.field_l = true;
        hc.field_a = 15000L + hc.a(-9986);
        return j.field_l == 11 ? true : false;
    }

    final static mg[] a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        mg[] var8 = new mg[9];
        mg[] var4 = var8;
        var8[0] = eg.a(param2, (byte) 29, param0);
        for (var5 = 1; var5 < 9; var5++) {
          var8[var5] = var8[0];
        }
        if (param3 <= 114) {
          Random var7 = (Random) null;
          ak.a(-24, (byte) 98, (Random) null);
        }
        var4[4] = eg.a(64, (byte) 63, param1);
        return var4;
    }

    final static void c(int param0) {
        se.field_f = new String[ad.field_c];
        se.field_f[19] = rk.field_d;
        se.field_f[13] = ej.field_H;
        se.field_f[16] = el.field_f;
        se.field_f[5] = eg.field_G;
        se.field_f[4] = s.field_h;
        if (param0 != -7597) {
          field_d = (km[]) null;
        }
        se.field_f[11] = ql.field_e;
        se.field_f[18] = wm.field_Q;
        se.field_f[7] = kd.field_n;
        se.field_f[17] = cg.field_g;
        se.field_f[9] = ld.field_a;
        se.field_f[15] = mk.field_fb;
        se.field_f[20] = gf.field_D;
        se.field_f[6] = pm.field_s;
        se.field_f[21] = kn.field_F;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 4472) {
          return;
        }
        field_c = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          if (param0 != 1514) {
            field_a = 33;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((var5 <= 0 ||
                128 <= var5) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("ak.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final static void a(int param0, oc param1, int param2) {
        hg var3 = null;
        try {
          var3 = gk.field_g;
          var3.g(param2, param0 + 26047);
          if (param0 != -26039) {
            field_c = (String) null;
          }
          var3.a(5, 56);
          var3.a(0, -114);
          var3.a((byte) -126, param1.field_j);
          var3.a(param1.field_g, -90);
          var3.a(param1.field_m, -96);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ak.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = 1;
        field_b = new String[]{"Play five Rated games", "Capture eight pieces in one move", "Win five Rated games", "Win by capturing all opposing pieces", "Win five Rated games in a row", "Lose five Rated games in a row", "Win by leaving the opponent unable to move", "Win a game using only jumps", "Play 55 Rated games", "Find the ghost during Hallowe'en"};
        field_c = "Open";
        field_f = new int[]{2, 14, 15, 6, 5, 16, 17, 12};
    }
}
