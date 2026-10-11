/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static boolean field_h;
    static boolean[][] field_d;
    static volatile int field_c;
    static ll field_j;
    static String field_g;
    static int[] field_i;
    static String field_a;
    static boolean field_f;
    static boolean field_e;
    static int field_b;

    final static boolean a(int param0, boolean param1, int[] param2, byte param3, int[] param4, int[] param5) {
        int var7 = 0;
        int var10 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var8 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var18 = null;
        var11 = SteelSentinels.field_G;
        try {
          var6_int = param0;
          if (var6_int == 34) {
            return false;
          }
          if (var6_int != 27 &&
            var6_int != 33 &&
            var6_int != 32) {
            if (var6_int == 24) {
              stackIn_12_0 = bj.a(param5, 84, param1, (byte) 125);
              return stackIn_12_0;
            }
            var15 = n.field_z;
            var13 = var15;
            var12 = var13;
            var6 = var12;
            if (param3 != 84) {
              ad.a(-38);
            }
            for (var7 = 0; var7 < var15.length; var7++) {
              var8 = var15[var7];
              if (t.a(param5, var8, -20370) ||
                bj.a(param5, var8, param1, (byte) 96)) {
                var18 = nl.a(var8, (byte) 123);
                for (var10 = var18.length - 8; var10 < var18.length; var10++) {
                  if (param0 == var18[var10]) {
                    return true;
                  }
                }
              }
            }
            return false;
          }
          stackIn_10_0 = bj.a(param5, 62, param1, (byte) 115);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("ad.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param5 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        kj var2 = mm.field_g;
        var2.a(param1, (byte) -117);
        var2.field_p = var2.field_p + 1;
        int var3 = var2.field_p;
        var2.a((byte) 126, 5);
        var2.a((byte) 114, nf.field_b.field_Ub);
        int var4 = nf.field_b.field_Nc + (nf.field_b.field_sc << 6);
        var2.a((byte) 127, var4);
        var2.a(nf.field_b.field_Sb.length, (byte) -122, param0, nf.field_b.field_Sb);
        var2.b((byte) -113, var2.field_p - var3);
    }

    final static void a(boolean param0, byte param1) {
        if (qf.field_e != null &&
          qf.field_e.b(param0, (byte) -128)) {
          qf.field_e = null;
        }
        if (param1 != -76) {
          field_b = -64;
        }
    }

    final static void a(int param0, nk param1, int param2) {
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        boolean stackIn_57_2 = false;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int[] var5 = null;
        int var6_int = 0;
        wk var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var17 = null;
        var7 = SteelSentinels.field_G;
        try {
          if (param0 >= 0 &&
            param0 < ue.field_c.length) {
            if (param1 == null) {
              if (0 <= param0 &&
                ue.field_c.length > param0) {
                var12 = ue.field_c[param0];
                var8 = var12;
                var3 = var8;
                if (var3 == null) {
                  ue.field_g[param0] = null;
                  return;
                }
                var14 = new int[8];
                var10 = var14;
                var4_ref_int__ = var10;
                var13 = new int[-8 + var12.length];
                var9 = var13;
                var5 = var9;
                ii.a(var3, 0, var5, 0, var13.length);
                ii.a(var3, var13.length, var4_ref_int__, 0, var14.length);
                param1 = ji.a(var13, (byte) 97, var14);
              } else {
                return;
              }
            }
            if (null != ue.field_g[param0]) {
              ue.field_g[param0].d();
              pb.a(0, 0, 62, 74, 0);
            } else {
              ue.field_g[param0] = new wk(62, 74);
              ue.field_g[param0].d();
            }
            var3_int = hj.field_w;
            if (param2 <= 23) {
              ad.a(true, (byte) -104);
            }
            if (param1.field_N == 0) {
              hj.field_w = 1200;
            }
            if (55 == param1.field_N) {
              hj.field_w = 1200;
            }
            if (param1.field_N == 57) {
              hj.field_w = 1300;
            }
            if (param1.field_N == 62) {
              hj.field_w = 1400;
            }
            if (param1.field_N == 65) {
              hj.field_w = 1000;
            }
            if (param1.field_N == 69) {
              hj.field_w = 1400;
            }
            if (param1.field_N == 72) {
              hj.field_w = 1000;
            }
            if (param1.field_N == 75) {
              hj.field_w = 1000;
            }
            if (param1.field_N == 79) {
              hj.field_w = 1000;
            }
            if (param1.field_N == 84) {
              hj.field_w = 1000;
            }
            if (88 == param1.field_N) {
              hj.field_w = 1000;
            }
            if (param1.field_N == 92) {
              hj.field_w = 700;
            }
            param1.a(0, false, 31, 74, (byte) 49, 0);
            hj.field_w = var3_int;
            if (!nk.f((byte) -19)) {
              var4 = 0;
              var17 = ue.field_c[param0];
              var6_int = 0;
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var17.length > var6_int) {
                  if (var17[var6_int] != -1) {
                    stackIn_56_0 = var17[var6_int];
                    stackIn_56_1 = -68;
                    stackIn_57_2 = !(-8 + var17.length > var6_int);
                    if (oc.a(stackIn_56_0, stackIn_56_1, stackIn_57_2)) {
                      var4 = 1;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var6_int++;
                    continue;
                  }
                }
                if (var4 == 0) {
                  break;
                }
                pb.c(0, 0, 62, 74, 0, 128);
                var6 = sj.field_F;
                var6.a((-var6.field_z + 62) / 2, (-var6.field_B + 74) / 2);
                break;
              }
            }
            sb.field_bb.b((byte) 123);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_67_0 = var3_ref;
          stackIn_67_1 = new StringBuilder().append("ad.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        field_a = null;
        field_d = (boolean[][]) null;
        if (param0 != 0) {
          return;
        }
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 < 103) {
          return 2;
        }
        int var3 = param1 >>> 31;
        return (param1 + var3) / param2 - var3;
    }

    static {
        field_c = 0;
        field_g = "Names cannot start or end with space or underscore";
        field_e = true;
        field_a = "Friends";
        field_b = 0;
    }
}
