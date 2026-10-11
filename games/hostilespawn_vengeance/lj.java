/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lj extends dk {
    static String field_r;
    static vm field_u;
    int field_s;
    static int field_q;
    static fd field_t;

    abstract boolean e(int param0);

    abstract Object c(byte param0);

    final static int d(int param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var4Lifetime1;
        long var5Lifetime1;
        int var7Lifetime1;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (jn.e((byte) 73)) {
            mc.field_F.c(0);
            if (mc.field_F.b(0)) {
              var1_int = 1;
            }
            if (13 != pj.field_e) {
              continue;
            }
            var2 = 1;
          }
          mc.field_F.a((byte) -102, sd.a(2, j.field_c, rb.field_m), sd.a(2, ec.field_a, rc.field_b));
          if (mc.field_F.b(0)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            0 <= mc.field_F.field_f) {
            var3 = ue.field_k[mc.field_F.field_f];
            if (var3 != 2 &&
              var3 != 5) {
              var4 = -61 % ((param0 - 31) / 58);
              if (var3 == 0 &&
                be.field_e == 2) {
                var5 = hn.a((byte) 80) - fj.field_Rb;
                var7 = (int)((-var5 + 10999L) / 1000L);
                if (var7 <= 0) {
                  var3 = 2;
                  hh.a(5, 5, true);
                }
              }
              return var3;
            }
            pk.g(-89);
          } else {
            if (var2 != 0 &&
              be.field_e != 2) {
              pk.g(-61);
            }
          }
          var4Lifetime1 = -61 % ((param0 - 31) / 58);
          if (var3 == 0 &&
            be.field_e == 2) {
            var5Lifetime1 = hn.a((byte) 80) - fj.field_Rb;
            var7Lifetime1 = (int)((-var5Lifetime1 + 10999L) / 1000L);
            if (var7Lifetime1 <= 0) {
              var3 = 2;
              hh.a(5, 5, true);
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "lj.O(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        if (param0 != 15) {
          lj.d(-119);
        }
    }

    final static void a(int[] param0, int param1, int param2, p param3) {
        int var26 = 0;
        int dupTemp$0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
        double var6 = 0.0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        Object var13 = null;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        oj var27 = null;
        int var28 = 0;
        double var29 = 0.0;
        int var31 = 0;
        double var32_double = 0.0;
        int var32 = 0;
        double var34 = 0.0;
        int var36 = 0;
        int var37 = 0;
        double var38 = 0.0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        oj var43 = null;
        oj var43Lifetime1;
        oj var43Lifetime2;
        var42 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param2 != 0) {
            return;
          }
          if (param3.field_e == 0) {
            var4_double = param3.field_l.field_f + (double)param3.field_j.field_e;
            var6 = (double)param3.field_j.field_g + param3.field_l.field_a;
            var8 = 0;
            if (19 == param3.field_i) {
              while (param3.field_e == 0) {
                var8++;
                if (var8 > 32) {
                  param3.field_e = 1;
                  param3.field_i = -1;
                }
                param3.field_l.a(2, (byte) 94, param3.field_c);
                param3.a(param2 + 8573);
                param0[param1] = 0;
                if (param0[param3.field_j.b(param2 - 4)] == 2) {
                  param3.field_e = 1;
                  param3.field_c = 255.0 * Math.random();
                }
                param0[param1] = 3;
              }
            }
            var9 = param3.field_l.field_f + (double)param3.field_j.field_e;
            var11 = param3.field_l.field_a + (double)param3.field_j.field_g;
            var13 = null;
            param3.field_i = -1;
            for (var26 = 0; var26 < rc.field_e; var26++) {
              var27 = re.field_n[var26];
              var43 = var27;
              var43Lifetime1 = var27;
              var28 = var27.field_I;
              if (var27.field_i == 0) {
                var28 = eh.field_g;
              }
              if (var28 > 0 &&
                20 != var27.field_i &&
                !var27.a((byte) 54)) {
                var29 = 1.0;
                var24 = var27.field_l.field_a + (double)var27.field_j.field_g;
                if (var27.field_i == 20) {
                  var29 = 0.5;
                }
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted0 = true;
                var22 = var27.field_l.field_f + (double)var27.field_j.field_e;
                var16 = -var29 + var24;
                var14 = var22 - var29;
                var18 = var14 + var29 * 2.0;
                var20 = var29 * 2.0 + var16;
                var31 = 0;
                if (null != var27.field_u) {
                  var32_double = var9 - var4_double;
                  var34 = -var6 + var11;
                  var36 = -(var27.field_u.field_z >> 1) + (int)(var22 * 24.0);
                  var37 = (int)(var24 * 24.0) - (var27.field_u.field_A >> 1);
                  var38 = 0.0;
                  while (1.0 > var38) {
                    if (var31 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var40 = (int)((var38 * var32_double + var4_double) * 24.0);
                    var41 = (int)((var6 + var38 * var34) * 24.0);
                    stackIn_36_0 = (!var27.field_u.d(var36, var37, var40, var41)) ? 0 : 1;
                    var31 = stackIn_36_0;
                    if (var31 != 0) {
                      var4_double = var4_double + var32_double * var38;
                      var6 = var6 + var38 * var34;
                    }
                    var38 = var38 + 0.05;
                  }
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted0)) {
                  if (!fb.a(var16, (byte) 43, var20, var9, var14, var6, var18, var11, var4_double)) {
                    stackIn_46_0 = (fb.a(var20, (byte) 43, var16, var9, var14, var6, var18, var11, var4_double)) ? 1 : 0;
                  } else {
                    stackIn_46_0 = 1;
                  }
                  var31 = stackIn_46_0;
                }
                if (var31 != 0) {
                  var43Lifetime2 = var27;
                  stackIn_53_0 = (var43Lifetime2.field_I <= 0) ? 0 : 1;
                  var32 = stackIn_53_0;
                  if (var26 == 0) {
                    ci.a(5, 58);
                  }
                  if (var26 > 0 &&
                    8 != var43Lifetime2.field_i &&
                    var43Lifetime2.a(19, -100)) {
                    if (var43Lifetime2.field_i == 0) {
                      ci.a(15, 102);
                    } else {
                      var43Lifetime2.field_I = var43Lifetime2.field_I - 15;
                    }
                  }
                  if ((5 == var43Lifetime2.field_i ||
                    22 == var43Lifetime2.field_i) &&
                    16 > param3.field_e) {
                    var43Lifetime2.field_I = 0;
                  }
                  var43Lifetime2.field_F = 255;
                  param3.field_e = 1;
                  if (var43Lifetime2.field_I < 0) {
                    var43Lifetime2.field_I = 0;
                  }
                  param3.field_c = Math.random() * 255.0;
                  param3.field_j.field_g = var43Lifetime2.field_j.field_g;
                  param3.field_j.field_e = var43Lifetime2.field_j.field_e;
                  param3.field_l.field_f = var43Lifetime2.field_l.field_f + Math.random() - 0.5;
                  param3.field_l.field_a = var43Lifetime2.field_l.field_a + Math.random() - 0.5;
                  if (0 >= var43Lifetime2.field_I &&
                    var43Lifetime2.field_i != 0) {
                    param3.field_i = 3;
                    if (var43Lifetime2.field_b &&
                      var32 != 0 &&
                      27 != var43Lifetime2.field_i) {
                      dupTemp$0 = al.field_U[2] + 1;
                      al.field_U[2] = dupTemp$0;
                      if (dupTemp$0 == 30) {
                        ti.a(248, (byte) -18, 7);
                      }
                    }
                  }
                  nh.a(var43Lifetime2, -29966);
                }
              }
            }
          }
          param3.field_e = param3.field_e + 1;
          if (param3.field_e > 32) {
            param3.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_85_0 = var4;
          stackIn_85_1 = new StringBuilder().append("lj.G(");
          if (param0 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_85_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (jc.field_b != null) {
          var1 = jc.field_b;
          synchronized (var1) {
            jc.field_b = null;
          }
        }
        if (param0 != 114) {
          field_q = -64;
        }
    }

    lj(int param0) {
        this.field_s = param0;
    }

    static {
        field_r = "Loading graphics";
        field_q = 0;
    }
}
