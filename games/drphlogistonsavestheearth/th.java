/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static boolean[] field_d;
    static volatile int field_e;
    static ld[] field_a;
    static sf field_c;
    static he[] field_b;

    final static void a(int param0, int param1, int param2, vk param3) {
        if (param0 != -27610) {
          return;
        }
        if (param3 == null) {
          return;
        }
        try {
          od.a(-1630758008, ag.a(param3, 100, param1, param2));
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "th.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(String param0, int param1, java.net.URL param2, int param3, String param4) {
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
          java.net.URL stackIn_41_0 = null;
          java.net.URL stackIn_43_0 = null;
          RuntimeException stackIn_46_0 = null;
          StringBuilder stackIn_46_1 = null;
          String stackIn_47_2 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            var5 = param2.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
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
                decompiledFrameRemainder0 = !(var7_int >= 0);
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if ((0 <= var7_int) &&
                    (decompiledFrameRemainder0 = (param0 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (0 <= var7_int) {
                      if (param4 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (~param1 < param3) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param1));
                  }
                  if (param0 != null &&
                    param0.length() > 0) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param0);
                  }
                  if (param4 != null &&
                    param4.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param4);
                  }
                  if (var5.length() > var6) {
                    discarded$7 = var7.append(var5.substring(var6, var5.length()));
                  } else {
                    discarded$8 = var7.append('/');
                  }
                  try {
                    stackIn_41_0 = new java.net.URL(param2, var7.toString());
                    return stackIn_41_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_43_0 = (java.net.URL) (param2);
                    return stackIn_43_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_46_0 = var5_ref;
            stackIn_46_1 = new StringBuilder().append("th.E(");
            if (param0 == null) {
              stackIn_47_2 = "null";
            } else {
              stackIn_47_2 = "{...}";
            }
            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte[] param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 120) {
            stackIn_4_0 = ml.a(param0, 0, param2, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = 87;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("th.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        wk var4_ref_wk = null;
        int var4 = 0;
        wk var5 = null;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (tl.field_O != ik.field_d) {
            return false;
          }
          var2_long = la.a(param0);
          if (lc.field_v != 0 &&
            dj.field_N < 0) {
            var4_ref_wk = (wk) (og.field_f.h(-11151));
            if (var4_ref_wk != null &&
              var4_ref_wk.field_k < var2_long) {
              var4_ref_wk.a(-16175);
              gf.field_C = var4_ref_wk.field_j.length;
              dh.field_N.field_j = 0;
              for (var5_int = 0; var5_int < gf.field_C; var5_int++) {
                dh.field_N.field_h[var5_int] = var4_ref_wk.field_j[var5_int];
              }
              l.field_q = gg.field_l;
              gg.field_l = ek.field_h;
              ek.field_h = t.field_b;
              t.field_b = var4_ref_wk.field_n;
              return true;
            }
          }
          while (true) {
            if (dj.field_N < 0) {
              dh.field_N.field_j = 0;
              if (!jd.a(1, 5929)) {
                return false;
              }
              dj.field_N = dh.field_N.e((byte) 121);
              dh.field_N.field_j = 0;
              gf.field_C = param1[dj.field_N];
            }
            if (!li.d(-29427)) {
              return false;
            }
            if (lc.field_v == 0) {
              l.field_q = gg.field_l;
              gg.field_l = ek.field_h;
              ek.field_h = t.field_b;
              t.field_b = dj.field_N;
              dj.field_N = -1;
              return true;
            }
            var4 = lc.field_v;
            if (0.0 != cm.field_G) {
              var4 = (int)((double)var4 + cm.field_M.nextGaussian() * cm.field_G);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new wk((long)var4 + var2_long, dj.field_N, new byte[gf.field_C]);
            for (var6 = 0; var6 < gf.field_C; var6++) {
              var5.field_j[var6] = dh.field_N.field_h[var6];
            }
            og.field_f.a(var5, 255);
            dj.field_N = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("th.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = ji.field_c;
        synchronized (var1_ref) {
          if (vb.field_l == rc.field_g) {
            return false;
          }
          var2 = 96 / ((param0 + 57) / 37);
          di.field_c = ac.field_f[rc.field_g];
          sj.field_g = na.field_a[rc.field_g];
          rc.field_g = rc.field_g + 1 & 127;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 111) {
          field_a = (ld[]) null;
        }
        field_d = null;
    }

    static {
        field_e = 0;
        field_d = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false, false, false, false, false, true, true, true, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        field_a = new ld[13];
        field_b = new he[1];
    }
}
