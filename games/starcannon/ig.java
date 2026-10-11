/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static int field_h;
    int field_e;
    static int field_i;
    static String field_c;
    static int field_b;
    String[] field_a;
    String field_d;
    boolean field_f;
    boolean field_g;

    final static void a(byte param0, int param1, boolean param2) {
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_41_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String stackIn_47_2 = null;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        boolean stackIn_89_2 = false;
        int stackIn_113_0 = 0;
        int stackIn_114_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        try {
          m.field_c = true;
          bh.field_a = param1;
          if (param0 < 59) {
            field_b = 5;
          }
          if (0 == bh.field_a) {
            var3_int = lb.a(qa.field_c, gi.field_f, mg.field_m, rh.field_h, -80);
            var4 = 3 + var3_int;
            eg.field_a = new int[var4];
            uh.field_h = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              eg.field_a[var5] = -1;
            }
            od.field_h = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              uh.field_h[var5] = gi.field_f[var5];
            }
            uh.field_h[var4 - 3] = "";
            uh.field_h[-2 + var4] = oi.field_j;
            eg.field_a[-2 + var4] = 0;
            od.field_h[0] = 4;
            uh.field_h[-1 + var4] = mc.field_e;
            eg.field_a[var4 - 1] = 1;
            od.field_h[1] = 5;
          } else if (1 == bh.field_a) {
            var3_int = lb.a(qa.field_c, gi.field_f, mg.field_m, rh.field_h, -128);
            var4 = var3_int + 2;
            uh.field_h = new String[var4];
            eg.field_a = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              eg.field_a[var5] = -1;
            }
            od.field_h = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              uh.field_h[var5] = gi.field_f[var5];
            }
            uh.field_h[-2 + var4] = "";
            uh.field_h[var4 - 1] = mc.field_e;
            eg.field_a[var4 - 1] = 0;
            od.field_h[0] = 5;
          } else if (bh.field_a != 2) {
            if (bh.field_a == 3) {
              if (!nb.field_e.field_n) {
                var3_int = lb.a(qa.field_c, gi.field_f, wc.field_h, rh.field_h, -110);
              } else {
                var3_int = lb.a(qa.field_c, gi.field_f, lc.field_fb, rh.field_h, -101);
              }
              var4 = 2 + var3_int;
              uh.field_h = new String[var4];
              eg.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                eg.field_a[var5] = -1;
              }
              od.field_h = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                uh.field_h[var5] = gi.field_f[var5];
              }
              uh.field_h[var4 - 2] = "";
              uh.field_h[-1 + var4] = mc.field_e;
              eg.field_a[-1 + var4] = 0;
              od.field_h[0] = 5;
            } else if (bh.field_a == 4) {
              var3_int = lb.a(qa.field_c, gi.field_f, kd.field_D, rh.field_h, -62);
              var4 = 2 + var3_int;
              eg.field_a = new int[var4];
              uh.field_h = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                eg.field_a[var5] = -1;
              }
              od.field_h = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                uh.field_h[var5] = gi.field_f[var5];
              }
              uh.field_h[-2 + var4] = "";
              uh.field_h[var4 - 1] = mc.field_e;
              eg.field_a[var4 - 1] = 0;
              od.field_h[0] = 5;
            } else {
              if (bh.field_a != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = lb.a(qa.field_c, gi.field_f, mc.field_a, rh.field_h, -105);
              var4 = var3_int + 3;
              uh.field_h = new String[var4];
              eg.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                eg.field_a[var5] = -1;
              }
              od.field_h = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                uh.field_h[var5] = gi.field_f[var5];
              }
              uh.field_h[-3 + var4] = "";
              uh.field_h[var4 - 2] = o.field_c;
              eg.field_a[-2 + var4] = 0;
              od.field_h[0] = 3;
              uh.field_h[var4 - 1] = mc.field_e;
              eg.field_a[-1 + var4] = 1;
              od.field_h[1] = 5;
            }
          } else {
            var3_int = lb.a(qa.field_c, gi.field_f, fb.a(ph.field_gb, 110, new String[]{"<br><%0><br>"}), rh.field_h, -82);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(gi.field_f[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            se.field_n = new String[var4];
            ug.a(gi.field_f, 0, se.field_n, 0, var4);
            fb.field_c = new String[-1 + var3_int - var4];
            ug.a(gi.field_f, 1 + var4, fb.field_c, 0, -1 + (-var4 + var3_int));
            var3_int = lb.a(qa.field_c, gi.field_f, fb.a(dg.field_j, 125, new String[]{"<br><%0><br>"}), rh.field_h, -64);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(gi.field_f[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            ri.field_b = new String[var4];
            ug.a(gi.field_f, 0, ri.field_b, 0, var4);
            rd.field_q = new String[var3_int - var4 - 1];
            ug.a(gi.field_f, 1 + var4, rd.field_q, 0, var3_int + (-var4 - 1));
            if (se.field_n.length < ri.field_b.length) {
              stackIn_30_0 = ri.field_b.length;
            } else {
              stackIn_30_0 = se.field_n.length;
            }
            var5 = stackIn_30_0;
            if (fb.field_c.length >= rd.field_q.length) {
              stackIn_33_0 = fb.field_c.length;
            } else {
              stackIn_33_0 = rd.field_q.length;
            }
            var6 = stackIn_33_0;
            var7 = var6 + (var5 + 7);
            uh.field_h = new String[var7];
            eg.field_a = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              eg.field_a[var8] = -1;
            }
            uh.field_h[0] = fb.field_f;
            uh.field_h[1] = ac.field_g;
            od.field_h = new int[2];
            eg.field_a[1] = 0;
            uh.field_h[4] = sh.field_s;
            od.field_h[0] = 5;
            uh.field_h[5] = "";
            uh.field_h[2] = og.field_e;
            uh.field_h[3] = rj.field_m;
            od.field_h[1] = 2;
            eg.field_a[3] = 1;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_40_0 = uh.field_h;
              stackIn_40_1 = var8Lifetime2 + 6;
              if (var8Lifetime2 + ri.field_b.length - var5 < 0) {
                stackIn_41_2 = "";
              } else {
                stackIn_41_2 = ri.field_b[-var5 + (var8Lifetime2 + ri.field_b.length)];
              }
              stackIn_40_0[stackIn_40_1] = stackIn_41_2;
            }
            uh.field_h[var5 + 6] = null;
            eg.field_a[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_46_0 = uh.field_h;
              stackIn_46_1 = 7 + var5 + var8Lifetime3;
              if (var8Lifetime3 >= rd.field_q.length) {
                stackIn_47_2 = "";
              } else {
                stackIn_47_2 = rd.field_q[var8Lifetime3];
              }
              stackIn_46_0[stackIn_46_1] = stackIn_47_2;
            }
            af.field_x = dd.b(124);
          }
          ja.field_c.field_b = od.field_h.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; uh.field_h.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_88_0 = uh.field_h[var4Lifetime1];
            stackIn_88_1 = 26;
            stackIn_89_2 = !(eg.field_a[var4Lifetime1] < 0);
            var5Lifetime1 = fb.$cfr$intArgs$a$1694234bddb3(stackIn_88_0, stackIn_88_1, stackIn_89_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (bh.field_a == 2) {
            var9 = se.field_n;
            for (var5Lifetime2 = 0; var9.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var9[var5Lifetime2];
              var7Lifetime1 = fb.$cfr$intArgs$a$1694234bddb3(var11, 26, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var10 = fb.field_c;
            for (var5Lifetime2Lifetime1 = 0; var10.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var10[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = fb.$cfr$intArgs$a$1694234bddb3(var12, 26, false);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          kl.field_d = ee.field_b + var3_intLifetime1 - (var3_intLifetime1 >> 1);
          ef.field_b = ja.field_c.field_b * (mc.field_h + kc.field_S << 1);
          p.field_g = -(var3_intLifetime1 >> 1) + ee.field_b;
          for (var4Lifetime2 = 0; var4Lifetime2 < uh.field_h.length; var4Lifetime2++) {
            stackIn_113_0 = ef.field_b;
            if (eg.field_a[var4Lifetime2] >= 0) {
              stackIn_114_1 = pk.field_c;
            } else {
              stackIn_114_1 = sg.field_e;
            }
            ef.field_b = stackIn_113_0 + stackIn_114_1;
          }
          nd.field_m = th.field_c - (ef.field_b >> 1);
          oh.field_e = new int[uh.field_h.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = nd.field_m;
          while (uh.field_h.length > var4Lifetime3) {
            var6Lifetime1 = eg.field_a[var4Lifetime3];
            if (0 <= var6Lifetime1) {
              var7Lifetime2 = fb.$cfr$intArgs$a$1694234bddb3(uh.field_h[var4Lifetime3], 26, true);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + ee.field_b;
              var5Lifetime3 = var5Lifetime3 + mc.field_h;
              oh.field_e[var4Lifetime3] = new int[4];
              oh.field_e[var4Lifetime3][0] = var8Lifetime1 - rh.field_i;
              oh.field_e[var4Lifetime3][1] = var5Lifetime3;
              oh.field_e[var4Lifetime3][2] = var7Lifetime2 + (rh.field_i << 1);
              oh.field_e[var4Lifetime3][3] = (kc.field_S << 1) + pk.field_c;
              var5Lifetime3 = var5Lifetime3 + (pk.field_c + (mc.field_h + (kc.field_S << 1)));
            } else {
              var5Lifetime3 = var5Lifetime3 + sg.field_e;
            }
            var4Lifetime3++;
          }
          if (bh.field_a != 2) {
            ja.field_c.a(false, param2, 0, ja.a(la.field_c, pe.field_d, 95));
          } else {
            ja.field_c.a(false, param2, -1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "ig.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ma b(int param0) {
        String var1 = ff.g(param0 ^ -1006262947);
        if (param0 != -1006263007) {
          field_h = -54;
        }
        if (var1 != null &&
          0 <= var1.indexOf('@')) {
          var1 = "";
        }
        return new ma(ff.g(119), wf.d(-15200));
    }

    public static void a(int param0) {
        if (param0 != -1) {
          ig.a(-126);
        }
        field_c = null;
    }

    final static java.net.URL a(String param0, int param1, String param2, java.net.URL param3, int param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_39_0 = null;
          java.net.URL stackIn_41_0 = null;
          RuntimeException stackIn_44_0 = null;
          StringBuilder stackIn_44_1 = null;
          String stackIn_45_2 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          try {
            var5 = param3.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (param1 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                decompiledFrameRemainder0 = !(0 <= var7_int);
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if ((var7_int >= 0) &&
                    (decompiledFrameRemainder0 = (param0 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (param1 > 0) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param1));
                  }
                  if (param0 != null &&
                    0 < param0.length()) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param0);
                  }
                  if (param2 != null &&
                    param2.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param2);
                  }
                  if (var5.length() > var6) {
                    discarded$7 = var7.append(var5.substring(var6, var5.length()));
                  } else {
                    discarded$8 = var7.append('/');
                  }
                  if (param4 != 1) {
                    field_h = -40;
                  }
                  try {
                    stackIn_39_0 = new java.net.URL(param3, var7.toString());
                    return stackIn_39_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_41_0 = (java.net.URL) (param3);
                    return stackIn_41_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_44_0 = var5_ref;
            stackIn_44_1 = new StringBuilder().append("ig.C(");
            if (param0 == null) {
              stackIn_45_2 = "null";
            } else {
              stackIn_45_2 = "{...}";
            }
            stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
            if (param3 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ig(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_c = "Attacking fleet destroyed<br><br>Level 2<br>Engage the Paragulan fleet<br>defending the Proxima system";
    }
}
