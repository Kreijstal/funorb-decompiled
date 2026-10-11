/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class in {
    static int[] field_c;
    static bd field_d;
    static String field_a;
    static int field_b;

    abstract int a(byte param0, long param1);

    final static boolean a(boolean param0, int param1, int param2, CharSequence param3) {
        int var9 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1 >= 2 &&
            36 >= param1) {
            var4_int = 0;
            var5 = 0;
            var6 = 104 / ((16 - param2) / 50);
            var7 = 0;
            var8 = param3.length();
            for (var9 = 0; var9 < var8; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param3.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (43 != var10 ||
                !param0))) {
                if (48 <= var10 &&
                  57 >= var10) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  var10 <= 90) {
                  var10 -= 55;
                } else if (var10 >= 97 &&
                  122 >= var10) {
                  var10 -= 87;
                } else {
                  return false;
                }
                if (var10 >= param1) {
                  return false;
                }
                if (var4_int != 0) {
                  var10 = -var10;
                }
                var11 = param1 * var7 + var10;
                if (var7 != var11 / param1) {
                  return false;
                }
                var7 = var11;
                var5 = 1;
              }
            }
            stackIn_41_0 = var5;
            return stackIn_41_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("in.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final static void a(int param0, p param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_e / param0;
          if (var4_int >= 0 &&
            id.field_p.length > var4_int) {
            id.field_p[var4_int].a(true, 128, (int)param1.field_c, param3, param2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("in.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(double param0, p param1, byte param2, int[] param3, int param4, double param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        og var9 = null;
        int var10 = 0;
        oc var11 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param2 != 29) {
            return;
          }
          var11 = new oc(param1.field_j);
          var9 = new og(param1.field_l);
          param1.field_e = 0;
          param3[param4] = 0;
          while (param1.field_e == 0) {
            param1.field_l.a(2, (byte) 94, param1.field_c);
            param1.a(8573);
            if (2 == param3[param1.field_j.b(-4)]) {
              param1.field_e = 1;
            }
            if (!param1.a(param0, param5, 29821)) {
              continue;
            }
            param1.field_i = 13;
            param1.field_e = 0;
            param1.field_j.a((byte) 46, var11);
            param1.field_l.a(var9, -28860);
            break;
          }
          param3[param4] = 3;
          if (param1.field_i != 13) {
            param1.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("in.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    abstract void b(boolean param0);

    abstract long a(byte param0);

    final int a(long param0, int param1) {
        if (param1 < 90) {
          field_a = (String) null;
        }
        long var4 = this.a((byte) -78);
        if (var4 > 0L) {
          vj.a(var4, (byte) -49);
        }
        return this.a((byte) -125, param0);
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -86 % ((param0 + 24) / 52);
        field_d = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        int var10 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0;
        int stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        int stackIn_66_4;
        nc stackIn_85_0;
        String stackIn_85_1;
        int stackIn_85_2;
        int stackIn_85_3;
        int stackIn_86_4;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4 = new String[8];
          var4[0] = pc.field_b;
          var4[1] = Integer.toString(kh.field_ib[an.field_r[1]]);
          var4[2] = Integer.toString((9 + kh.field_ib[an.field_r[2]]) / 10);
          var4[3] = Integer.toString((kh.field_ib[an.field_r[3]] + 49) / 50);
          var4[4] = Integer.toString((kh.field_ib[an.field_r[4]] + 4) / 5);
          var4[5] = Integer.toString(kh.field_ib[an.field_r[5]]);
          var4[6] = Integer.toString(kh.field_ib[an.field_r[6]]);
          var4[7] = Integer.toString(kh.field_ib[an.field_r[7]]);
          for (var1_int = 0; var1_int < 2; var1_int++) {
            var2 = 8;
            if (1 == var1_int) {
              var2 = 632 - qa.field_g[0].field_u;
            }
            var3 = 8;
            var5 = kh.field_U[var1_int];
            if (var5 >= 0) {
              var6 = 16772608;
              var7 = an.field_r[var5];
              if (var7 >= 0 &&
                kh.field_ib[var7] <= 0) {
                var6 = 16728128;
              }
              if (var1_int == 0) {
                oc.field_c.e(0, 0);
                dn.a(var2, -112, var5, var3 - 16, var6);
              } else {
                oc.field_c.d(640 - oc.field_c.field_z, 0);
                pf.a(var2, -16 + var3, 0, var5, var6);
              }
              if (var1_int != 0) {
                si.d(515, 0, 640, 480);
                si.c();
              } else {
                si.d(0, 0, 125, 480);
                si.c();
              }
              if (var7 != -1) {
                if (var1_int == 0) {
                  var2 = var2 + (8 + qa.field_g[0].field_u);
                  hh.field_a[var7].e(46, 5 + var3);
                } else {
                  if (var1_int == 1) {
                    var2 -= 24;
                    hh.field_a[var7].e(562, 5 + var3);
                  }
                }
              }
              if (var5 >= 0) {
                var8_ref_String = var4[var5];
                if (0 <= var7 &&
                  kh.field_ib[var7] <= 0) {
                  var8_ref_String = nf.field_p.toUpperCase();
                }
                if (var1_int != 0) {
                  if (var1_int == 1) {
                    var2 -= 24;
                    if (var5 == 0) {
                      of.field_e.c(var8_ref_String, 572, 32 + var3, 16772608, 0);
                    } else {
                      kb.a(7, 42 + var3, var6, 0, var8_ref_String, al.field_Z, 572);
                    }
                  }
                } else {
                  if (var5 == 0) {
                    of.field_e.a(var8_ref_String, 68, var3 + 32, 16772608, 0);
                  } else {
                    ec.a(7, var3 + 42, false, al.field_Z, 68, var6, var8_ref_String);
                  }
                  var2 += 24;
                }
              }
            }
          }
          var5Lifetime1 = 150;
          var6Lifetime1 = 5;
          for (var1_intLifetime1 = 0; var1_intLifetime1 < kh.field_Q.length; var1_intLifetime1++) {
            if (kh.field_Q[var1_intLifetime1] &&
              an.field_r[var1_intLifetime1] >= 0) {
            }
          }
          if (param0) {
            field_b = 104;
          }
          for (var1_intLifetime2 = 0; var1_intLifetime2 < 8; var1_intLifetime2++) {
            if (kh.field_Q[var1_intLifetime2]) {
              if ((5 & el.field_m) == 0 &&
                j.field_c >= -7 + var5Lifetime1 &&
                j.field_c < ti.field_j.field_z + var5Lifetime1 + 9 &&
                rb.field_m < ti.field_j.field_A + var6Lifetime1) {
                ri.field_h = var1_intLifetime2;
              }
              var7Lifetime1 = 0;
              if (var1_intLifetime2 == ri.field_h) {
                stackIn_63_0 = (0 == (el.field_m & 5)) ? 0 : 1;
                var7Lifetime1 = stackIn_63_0;
                stackIn_65_0 = var5Lifetime1 + 2;
                stackIn_65_1 = var6Lifetime1 + 2;
                stackIn_65_2 = -7 + ti.field_j.field_z;
                stackIn_65_3 = ti.field_j.field_A - 6;
                if (var7Lifetime1 != 0) {
                  stackIn_66_4 = 16776960;
                } else {
                  stackIn_66_4 = 8421504;
                }
                si.c(stackIn_65_0, stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_66_4);
              }
              ti.field_j.e(var5Lifetime1, var6Lifetime1);
              if (var1_intLifetime2 > 0 &&
                kh.field_ib[an.field_r[var1_intLifetime2]] <= 0) {
                var8 = 0;
                for (var9 = 0; di.field_b[var1_intLifetime2].field_A > var9; var9 += 2) {
                  for (var10 = 0; di.field_b[var1_intLifetime2].field_z > var10; var10 += 2) {
                    var11 = di.field_b[var1_intLifetime2].field_D[var8 + var10];
                    var11 = (255 & var11 >> 16) / 4;
                    var11 = var11 * 262401;
                    si.a(4 + var10 / 2 + var5Lifetime1, var9 / 2 + var6Lifetime1, var11);
                  }
                  var8 = var8 + di.field_b[var1_intLifetime2].field_u * 2;
                }
              } else {
                di.field_b[var1_intLifetime2].b(var5Lifetime1 + 4, var6Lifetime1, di.field_b[var1_intLifetime2].field_z / 2, di.field_b[var1_intLifetime2].field_A / 2, 256);
              }
              if (kh.field_cb[var1_intLifetime2]) {
                var8Lifetime1 = 12 + var5Lifetime1;
                var9Lifetime1 = var6Lifetime1 + 3;
                of.field_e.a('2', var8Lifetime1 - 1, var9Lifetime1, 65793);
                of.field_e.a('2', var8Lifetime1 + 1, var9Lifetime1, 65793);
                of.field_e.a('2', var8Lifetime1, -1 + var9Lifetime1, 65793);
                of.field_e.a('2', var8Lifetime1, 1 + var9Lifetime1, 65793);
                of.field_e.a('2', var8Lifetime1, var9Lifetime1, 16772608);
              }
              if (hf.field_i == var1_intLifetime2) {
                var7Lifetime1 = 1;
              }
              if (var7Lifetime1 != 0) {
                si.c(var5Lifetime1 + 24, var6Lifetime1 + 16, 9, 10, 16776960);
              }
              stackIn_85_0 = al.field_Z;
              stackIn_85_1 = Integer.toString(1 + var1_intLifetime2);
              stackIn_85_2 = var5Lifetime1 + 29;
              stackIn_85_3 = var6Lifetime1 + 26;
              if (var7Lifetime1 != 0) {
                stackIn_86_4 = 0;
              } else {
                stackIn_86_4 = 16776960;
              }
              ((nc) (Object) stackIn_85_0).b(stackIn_85_1, stackIn_85_2, stackIn_85_3, stackIn_86_4, -1);
            }
            var5Lifetime1 += 46;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "in.F(" + param0 + ')');
        }
    }

    static {
        field_c = new int[8192];
        field_b = 838899712;
        field_a = "Loading fonts";
    }
}
