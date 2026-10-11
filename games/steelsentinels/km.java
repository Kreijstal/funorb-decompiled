/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static lg field_m;
    static volatile int field_f;
    static int field_i;
    static int[] field_h;
    static int field_c;
    static int field_g;
    static wk[] field_e;
    static String field_a;
    static ql field_j;
    static String field_d;
    String[] field_b;
    static int field_l;
    static pn field_k;

    final static boolean a(int param0) {
        if (param0 > -97) {
          return true;
        }
        return 250 < vn.field_h ? true : false;
    }

    final static void a(boolean param0) {
        wc.field_f = null;
        if (param0) {
          field_c = -88;
        }
        ll.field_j = null;
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
        var6 = SteelSentinels.field_G;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          if (param0 > -12) {
            field_k = (pn) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((var5 <= 0 ||
                128 <= var5) && (var5 < 160 ||
                255 < var5)) {
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
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
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
          stackIn_72_1 = new StringBuilder().append("km.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_j = null;
        field_e = null;
        field_d = null;
        field_k = null;
        if (param0 != -27) {
          field_j = (ql) null;
        }
        field_h = null;
    }

    final static void a(byte param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        try {
          uc.field_e[param6] = param2;
          uc.field_k[param6] = param3;
          if (param0 != -44) {
            field_e = (wk[]) null;
          }
          uc.field_d[param6] = param1;
          uc.field_c[param6] = param5;
          uc.field_f[param6] = param4;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "km.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private km() throws Throwable {
        throw new Error();
    }

    final static String a(int param0, int param1) {
        int var9 = 0;
        int var3;
        int var4_int;
        String var4;
        int var5;
        int var6;
        int var7;
        int var10;
        nk var13;
        int[] var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int var5Lifetime1;
        int var7Lifetime1;
        var10 = SteelSentinels.field_G;
        var13 = ul.a(param0, (byte) 67);
        if (param1 <= 29) {
          field_c = 12;
        }
        boolean decompiledFrameRemainder0 = true;
        var3 = var13.field_Q;
        if (var3 == 2) {
          for (var3 = 0; n.field_z.length > var3; var3++) {
            var4_int = n.field_z[var3];
            var22 = nl.a(var4_int, (byte) 127);
            for (var6 = 0; var22.length - 8 > var6; var6++) {
              if (var22[var6] == param0) {
                return db.a(si.field_F, -66, new String[]{cd.field_c[var3]});
              }
            }
          }
        } else {
          if ((4 != var3 &&
            var3 != 2048) &&
            (decompiledFrameRemainder0 = (var3 == 8))) {
            var3 = 0;
            for (var4_int = 0; var4_int < n.field_z.length; var4_int++) {
              var5 = n.field_z[var4_int];
              var24 = nl.a(var5, (byte) 124);
              for (var7 = 0; var7 < -8 + var24.length; var7++) {
                if (var24[var7] != param0) {
                  continue;
                }
                var3++;
                break;
              }
            }
            var4 = lj.field_g[0];
            var5Lifetime1 = 0;
            for (var6 = 0; var6 < n.field_z.length; var6++) {
              var7Lifetime1 = n.field_z[var6];
              var25 = nl.a(var7Lifetime1, (byte) 123);
              for (var9 = 0; -8 + var25.length > var9; var9++) {
                if (var25[var9] != param0) {
                  continue;
                }
                var5Lifetime1++;
                if (var5Lifetime1 >= var3 - 1) {
                  if (-1 + var3 != var5Lifetime1) {
                    if (var3 <= 1) {
                      return var4 + cd.field_c[var6] + lj.field_g[3];
                    }
                    return var4 + cd.field_c[var6] + lj.field_g[4];
                  }
                  var4 = var4 + cd.field_c[var6] + lj.field_g[2];
                } else {
                  var4 = var4 + cd.field_c[var6] + lj.field_g[1];
                }
                break;
              }
            }
            return null;
          }
          if (decompiledFrameRemainder0) {
            for (var3 = 0; n.field_z.length > var3; var3++) {
              var4_int = n.field_z[var3];
              var23 = nl.a(var4_int, (byte) 126);
              for (var6 = 0; -8 + var23.length > var6; var6++) {
                if (var23[var6] == param0) {
                  return db.a(nj.field_T, -54, new String[]{cd.field_c[var3]});
                }
              }
            }
          }
        }
        return null;
    }

    static {
        field_m = null;
        field_h = new int[8192];
        field_d = "Withdraw request to join <%0>'s game";
        field_a = null;
        field_f = 0;
    }
}
