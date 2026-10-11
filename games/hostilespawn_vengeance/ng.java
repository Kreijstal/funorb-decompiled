/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends am {
    byte[][][] field_o;
    static int field_u;
    static boolean field_k;
    int[] field_n;
    static int[] field_l;
    static bd field_v;
    int[] field_q;
    kk[] field_j;
    static bd field_s;
    static bd field_i;
    static bd[][] field_p;
    kk[] field_r;
    int[] field_m;
    int field_t;
    int field_h;

    final static boolean a(mk param0, int param1, boolean param2, String param3, String param4, int param5, String param6) {
        RuntimeException var7 = null;
        wg var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -8625) {
            ng.c(-53);
          }
          if (od.field_I != e.field_q) {
            return false;
          }
          var8 = new wg(im.field_e, param0);
          im.field_e.c(var8, param5 ^ -8686);
          if (fc.i(-1)) {
            var8.r(-104);
            return true;
          }
          cg.field_e = param4;
          fj.field_Sb = param6;
          qi.field_G = param3;
          od.field_I = ti.field_b;
          wj.field_H = null;
          uh.field_o = param2;
          ia.field_h = param1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("ng.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 10448) {
          return;
        }
        field_v = null;
        field_i = null;
        field_p = (bd[][]) null;
        field_l = null;
        field_s = null;
    }

    final static void a(byte param0, p param1, int param2, int param3, int[] param4) {
        int dupTemp$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var5_double = 0.0;
        RuntimeException var5 = null;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        Object var17 = null;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        int var32 = 0;
        int var33 = 0;
        oj var33_ref_oj = null;
        int var34 = 0;
        double var35 = 0.0;
        int var37 = 0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int var43 = 0;
        double var44 = 0.0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        String var49 = null;
        oj var50 = null;
        int var32Lifetime1;
        var48 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1.field_e == 0) {
            var7 = param1.field_l.field_f + (double)param1.field_j.field_e;
            var9 = (double)param1.field_j.field_g + param1.field_l.field_a;
            var11 = 0;
            stackIn_5_0 = (4 != param3) ? 64 : 32;
            var12 = stackIn_5_0;
            while (param1.field_e == 0) {
              var11++;
              if (var11 > var12) {
                param1.field_e = 1;
                param1.field_i = -1;
              }
              param1.field_l.a(2, (byte) 94, param1.field_c);
              param1.a(8573);
              param4[param2] = 0;
              if (param4[param1.field_j.b(-4)] == 2) {
                param1.field_e = 1;
                param1.field_i = -1;
                param1.field_c = 255.0 * Math.random();
              }
              param4[param2] = 3;
            }
            var13 = param1.field_l.field_f + (double)param1.field_j.field_e;
            var15 = param1.field_l.field_a + (double)param1.field_j.field_g;
            var17 = null;
            var18 = (-var13 + var7) * (-var13 + var7) + (var9 - var15) * (var9 - var15);
            for (var32 = 1; rc.field_e > var32; var32++) {
              var33_ref_oj = re.field_n[var32];
              var17 = var33_ref_oj;
              var17 = var33_ref_oj;
              var34 = var33_ref_oj.field_i;
              if (var33_ref_oj.field_I > 0 && (var34 < 12 ||
                18 <= var34)) {
                var35 = 1.0;
                var28 = (double)var33_ref_oj.field_j.field_e + var33_ref_oj.field_l.field_f;
                if (var34 == 20) {
                  var35 = 0.5;
                }
                var30 = var33_ref_oj.field_l.field_a + (double)var33_ref_oj.field_j.field_g;
                if (var34 == 8 ||
                  var34 == 27) {
                  var35 = 1.5;
                  var28 = var28 - 0.5;
                  var30 = var30 - 0.5;
                }
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted0 = true;
                var22 = -var35 + var30;
                var20 = -var35 + var28;
                var26 = var30 + var35;
                var24 = var35 + var28;
                var37 = 0;
                if (null != var33_ref_oj.field_u) {
                  var38 = var13 - var7;
                  var40 = -var9 + var15;
                  var42 = -(var33_ref_oj.field_u.field_z >> 1) + (int)(24.0 * var28);
                  var43 = (int)(24.0 * var30) - (var33_ref_oj.field_u.field_A >> 1);
                  var44 = 0.0;
                  while (1.0 > var44) {
                    if (var37 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var46 = (int)(24.0 * (var38 * var44 + var7));
                    var47 = (int)(24.0 * (var9 + var44 * var40));
                    stackIn_36_0 = (!var33_ref_oj.field_u.d(var42, var43, var46, var47)) ? 0 : 1;
                    var37 = stackIn_36_0;
                    if (var37 != 0) {
                      var9 = var9 + var44 * var40;
                      var7 = var7 + var38 * var44;
                    }
                    var44 = var44 + 0.05;
                  }
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted0)) {
                  if (!fb.a(var22, (byte) 43, var26, var13, var20, var9, var24, var15, var7)) {
                    stackIn_47_0 = (fb.a(var26, (byte) 43, var22, var13, var20, var9, var24, var15, var7)) ? 1 : 0;
                  } else {
                    stackIn_47_0 = 1;
                  }
                  var37 = stackIn_47_0;
                }
                if (var37 != 0) {
                  var5_double = (-var30 + var9) * (-var30 + var9) + (-var28 + var7) * (var7 - var28);
                  if (var18 > var5_double) {
                    var17 = var33_ref_oj;
                    var18 = var5_double;
                  }
                }
              }
            }
            if (var17 == null) {
              var50 = (oj) null;
              nh.a((oj) null, -29966);
            } else {
              stackIn_60_0 = (param1.field_i == 28) ? 2 : 1;
              var32Lifetime1 = stackIn_60_0;
              param1.field_i = 4;
              stackIn_63_0 = (0 >= ((oj) (var17)).field_I) ? 0 : 1;
              var33 = stackIn_63_0;
              if (((oj) (var17)).a(4, -122)) {
                if (((oj) (var17)).field_i == 8) {
                  param1.field_i = -1;
                  ((oj) (var17)).field_I = ((oj) (var17)).field_I - var32Lifetime1 * 12;
                } else {
                  if (((oj) (var17)).field_i != 5 &&
                    ((oj) (var17)).field_i != 22) {
                    ((oj) (var17)).field_I = ((oj) (var17)).field_I - 3 * var32Lifetime1;
                  }
                }
              }
              param1.field_i = -1;
              if (((oj) (var17)).field_I < 0) {
                ((oj) (var17)).field_I = 0;
              }
              ((oj) (var17)).field_F = 255;
              param1.field_e = 1;
              param1.field_c = 255.0 * Math.random();
              param1.field_j.field_g = ((oj) (var17)).field_j.field_g;
              param1.field_j.field_e = ((oj) (var17)).field_j.field_e;
              param1.field_l.field_f = ((oj) (var17)).field_l.field_f + Math.random() - 0.5;
              param1.field_l.field_a = -0.5 + (((oj) (var17)).field_l.field_a + Math.random());
              if (((oj) (var17)).field_I <= 0) {
                param1.field_i = 3;
                if (var33 != 0 &&
                  ((oj) (var17)).field_b &&
                  ((oj) (var17)).field_i != 27) {
                  dupTemp$0 = al.field_U[1] + 1;
                  al.field_U[1] = dupTemp$0;
                  if (dupTemp$0 == 30) {
                    ti.a(249, (byte) 10, 6);
                  }
                }
              }
              nh.a((oj) (var17), param0 ^ -30020);
            }
          }
          if (param0 != 78) {
            var49 = (String) null;
            ng.a((mk) null, -5, true, (String) null, (String) null, 31, (String) null);
          }
          param1.field_e = param1.field_e + 1;
          stackIn_85_0 = (param1.field_i != 28) ? 32 : 64;
          if (stackIn_85_0 < param1.field_e) {
            param1.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_90_0 = var5;
          stackIn_90_1 = new StringBuilder().append("ng.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          stackIn_93_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(')').toString());
        }
    }

    ng() {
    }

    static {
        field_k = false;
        field_l = new int[256];
    }
}
