/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static byte[] field_a;
    static i field_b;
    static cc field_c;
    static boolean[] field_d;
    static tf field_e;

    final static jc a(String param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        jc var7 = null;
        int var8 = 0;
        jc stackIn_4_0 = null;
        jc stackIn_7_0 = null;
        jc stackIn_11_0 = null;
        jc stackIn_17_0 = null;
        jc stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_4_0 = hm.field_a;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = ga.field_e;
            return stackIn_7_0;
          }
          var3 = ji.a('.', (byte) 66, param0);
          if (2 > var3.length) {
            stackIn_11_0 = hm.field_a;
            return stackIn_11_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = ga.a(param1 ^ -4549, var6);
            if (var7 != null) {
              stackIn_17_0 = var7;
              return stackIn_17_0;
            }
          }
          if (param1 != -2734) {
            da.a((byte) 4);
          }
          stackIn_22_0 = oe.a((byte) 86, var3[var3.length - 1]);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("da.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != -121) {
          field_d = (boolean[]) null;
        }
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        int var2Lifetime1;
        fl.a(130, 256, 16694016, kc.field_s, 82 + param0, w.field_kb);
        int var2 = 145;
        fb.field_c[0][0].c(82 + param0, var2, 18, 18);
        var2 = var2 + (ga.a(188, 0, var2, cc.field_d, 16, 64, 16777215, se.field_S, (byte) -124, 0, 110 + param0) * 16 + 16);
        fb.field_c[1][3].c(param0 + 82, var2, 18, 18);
        var2 = var2 + (16 + ga.a(188, 0, var2, dn.field_q, 16, 64, 16777215, se.field_S, (byte) -125, 0, 110 + param0) * 16);
        ri.a(var2, kk.field_n, gi.field_c, -115, 190 + param0, nf.field_e, 0);
        hk.g(309 + param0, 117, 242, 263172);
        var2Lifetime1 = 116;
        hk.g(param0 + 310, 117, 242, 6316128);
        fl.a(var2Lifetime1 + 14, 256, 16694016, ug.field_n, 322 + param0, w.field_kb);
        var2Lifetime1 += 29;
        fl.a(13 + var2Lifetime1, 256, 16777215, vk.field_b[0], param0 + 322, se.field_S);
        ph.field_yb[0].c(param0 + 480, var2Lifetime1 + 1);
        var2Lifetime1 += 18;
        fl.a(13 + var2Lifetime1, 256, 16777215, vk.field_b[1], 322 + param0, se.field_S);
        ph.field_yb[1].c(param0 + 480, var2Lifetime1 + 1);
        var2Lifetime1 += 34;
        fl.a(var2Lifetime1 + 13, 256, 16777215, vk.field_b[2], param0 + 322, se.field_S);
        ph.field_yb[3].c(480 + param0, var2Lifetime1 + 1);
        var2Lifetime1 += 18;
        fl.a(var2Lifetime1 + 13, 256, 16777215, vk.field_b[3], param0 + 322, se.field_S);
        ph.field_yb[4].c(param0 + 480, var2Lifetime1 + 1);
        ed.a(16777215, 506 + param0, vk.field_b[4], var2Lifetime1 + 13, (byte) 75, se.field_S);
        ph.field_yb[2].c(516 + param0, var2Lifetime1 + 1);
        var2Lifetime1 += 34;
        fl.a(var2Lifetime1 + 13, 256, 16777215, vk.field_b[5], 322 + param0, se.field_S);
        if (!param1) {
          return;
        }
        ph.field_yb[5].c(param0 + 480, var2Lifetime1 + 1);
        var2Lifetime1 += 34;
        fl.a(14 + var2Lifetime1, 256, 16694016, kc.field_q, param0 + 322, w.field_kb);
        var2Lifetime1 += 29;
        fl.a(13 + var2Lifetime1, 256, 16777215, vk.field_b[6], 322 + param0, se.field_S);
        ph.field_yb[6].c(480 + param0, 1 + var2Lifetime1);
    }

    final static void a(byte param0, String param1, String param2) {
        try {
          if (param0 != -109) {
            da.a((byte) -7);
          }
          db.a(-127, param1, param2, false);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "da.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          var6_int = -param5 + param0;
          var7 = 0;
          if (param2 != -8218) {
            da.a(true, false);
          }
          while (var7 < var6_int) {
            {
              var8 = param3.charAt(param5 + var7);
              if ((0 >= var8 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[param1 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param4[param1 + var7] = (byte)-126;
                    break;
                  case 402:
                    param4[param1 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param4[param1 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param4[param1 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param4[param1 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param4[var7 + param1] = (byte)-121;
                    break;
                  case 710:
                    param4[param1 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param4[param1 + var7] = (byte)-119;
                    break;
                  case 352:
                    param4[param1 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param4[var7 + param1] = (byte)-117;
                    break;
                  case 338:
                    param4[var7 + param1] = (byte)-116;
                    break;
                  case 381:
                    param4[param1 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param4[var7 + param1] = (byte)-111;
                    break;
                  case 8217:
                    param4[var7 + param1] = (byte)-110;
                    break;
                  case 8220:
                    param4[var7 + param1] = (byte)-109;
                    break;
                  case 8221:
                    param4[var7 + param1] = (byte)-108;
                    break;
                  case 8226:
                    param4[param1 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param4[param1 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param4[var7 + param1] = (byte)-105;
                    break;
                  case 732:
                    param4[var7 + param1] = (byte)-104;
                    break;
                  case 8482:
                    param4[param1 + var7] = (byte)-103;
                    break;
                  case 353:
                    param4[param1 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param4[var7 + param1] = (byte)-101;
                    break;
                  case 339:
                    param4[var7 + param1] = (byte)-100;
                    break;
                  case 382:
                    param4[param1 + var7] = (byte)-98;
                    break;
                  case 376:
                    param4[var7 + param1] = (byte)-97;
                    break;
                  default:
                    param4[var7 + param1] = (byte)63;
                    break;
                }
              } else {
                param4[var7 + param1] = (byte)var8;
              }
            }
            var7++;
          }
          stackIn_68_0 = var6_int;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("da.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        he.a(param1, -95);
        if (param0) {
          return;
        }
        if (null != sl.field_g) {
          qd.a(sl.field_g, -2);
        }
    }

    static {
        field_b = new i();
    }
}
