/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ab extends IOException {
    static int field_c;
    static String field_d;
    static int field_b;
    static bd field_a;

    final static void a(int param0, boolean param1, oc param2, oc param3, int param4, double param5, oc param6, oj param7, double param8, int param9, int param10) {
        og dupTemp$0 = null;
        og dupTemp$1 = null;
        og dupTemp$2 = null;
        og dupTemp$3 = null;
        og dupTemp$4 = null;
        og dupTemp$5 = null;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_144_2 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_147_2 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_150_2 = null;
        StringBuilder stackIn_152_1 = null;
        String stackIn_153_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        double var18_double = 0.0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        double var21_double = 0.0;
        int var23 = 0;
        int var24 = 0;
        oj var25 = null;
        oj var26 = null;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var24 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (bm.field_c == 1 &&
            3 == rl.field_c &&
            0 == r.field_a) {
            return;
          }
          var15 = 0;
          if (param7.field_I > 0) {
            if (param7.field_h == 0) {
              if (ln.field_a.field_y[-param0 - 1 + (param4 - 2)] == 81) {
                var15 = 0;
              }
              if (81 == ln.field_a.field_y[param4 + (-1 - param0) + param0 * 2]) {
                var15 = 64;
              }
              if (81 == ln.field_a.field_y[2 + (-param0 + param4) - 1]) {
                var15 = 128;
              }
              if (81 == ln.field_a.field_y[-(param0 * 2) + param4 + (-1 - param0)]) {
                var15 = 192;
              }
              if (ln.field_a.field_y[-2 - param0 + (-1 + param4)] == 29) {
                var15 = 0;
              }
              if (ln.field_a.field_y[param0 * 2 - param0 + (-1 + param4)] == 29) {
                var15 = 64;
              }
              if (ln.field_a.field_y[-param0 - 1 + param4 + 2] == 29) {
                var15 = 128;
              }
              if (ln.field_a.field_y[-param0 + param4 + (-1 - 2 * param0)] == 29) {
                var15 = 192;
              }
              var15 += 64;
            } else {
              if (1 != param7.field_h) {
                if (param7.field_h != 2) {
                  if (3 != param7.field_h) {
                    if (param7.field_h == 4) {
                      var15 = 64;
                    }
                  } else {
                    var15 = 128;
                  }
                } else {
                  var15 = 192;
                }
              } else {
                var15 = 0;
              }
            }
          }
          if (param1) {
            field_c = 26;
          }
          if (param7.field_I > 0 &&
            param7.field_i == 5) {
            param7.a(225, (double)(int)(64.0 * Math.random() + (double)var15 - 32.0), 5);
          }
          if (param7.field_F > 1) {
            param7.field_F = param7.field_F - 1;
          }
          if (param7.field_F > 200) {
            if (param7.field_I <= 0) {
              return;
            }
            if ((sg.field_i & 3) == 0 &&
              20 > param7.field_I) {
              param7.field_I = param7.field_I + 1;
            }
            param6.a((byte) 46, param2);
            param6.b(param3, 24161);
            if (param7.field_e > 0) {
              param7.field_e = param7.field_e - 1;
            }
            if (param7.field_i != 5) {
              if (param7.field_i == 22) {
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted0 = true;
                var16 = 0;
                var17 = param3.field_e;
                var18 = param3.field_e;
                var19 = param3.field_g;
                var20 = param3.field_g;
                var21 = var15;
                if (var21 == 0) {
                  var18 += 2;
                  var19 -= 4;
                  var17 -= 3;
                } else {
                  if (var21 != 64) {
                    if (128 == var21) {
                      var20 += 4;
                      var17 -= 2;
                      var18 += 3;
                    } else {
                      if (var21 != 192) {
                        for (var21 = 0; var21 < rc.field_e; var21++) {
                          var25 = re.field_n[var21];
                          if ((0 == var25.field_i ||
                            var25.field_b &&
                            (var25.field_i != 27 ||
                            var25.field_s)) && (var25.field_j.field_e >= var17 &&
                            var18 >= var25.field_j.field_e &&
                            var25.field_j.field_g >= var19 &&
                            var20 >= var25.field_j.field_g)) {
                            param6.a((byte) 46, var25.field_j);
                            var16 = 1;
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var20 += 3;
                        var19 -= 2;
                        var18 += 4;
                      }
                    }
                  } else {
                    var20 += 2;
                    var17 -= 4;
                    var19 -= 3;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted0)) {
                  for (var21Lifetime4 = 0; var21Lifetime4 < rc.field_e; var21Lifetime4++) {
                    var26 = re.field_n[var21Lifetime4];
                    if ((0 == var26.field_i ||
                      var26.field_b &&
                      (var26.field_i != 27 ||
                      var26.field_s)) && (var26.field_j.field_e >= var17 &&
                      var18 >= var26.field_j.field_e &&
                      var26.field_j.field_g >= var19 &&
                      var20 >= var26.field_j.field_g)) {
                      param6.a((byte) 46, var26.field_j);
                      var16 = 1;
                      break;
                    }
                  }
                }
                if (var16 == 0) {
                  var21Lifetime1 = 7 * param3.field_e - (-(3 * param3.field_g) - ng.field_u / 2) & 127;
                  if (var15 == 64 ||
                    var15 == 0) {
                    var21Lifetime1 = 127 - var21Lifetime1;
                  }
                  if (var21Lifetime1 > 64) {
                    var21Lifetime1 = -var21Lifetime1 + 127;
                  }
                  if (16 > var21Lifetime1) {
                    var21Lifetime1 = 16;
                  }
                  if (var21Lifetime1 > 48) {
                    var21Lifetime1 = 48;
                  }
                  param7.a(225, (double)(var21Lifetime1 + (-32 + var15)), 2);
                } else {
                  var21_double = el.a((double)param3.field_e, (double)param6.field_e, 16, (double)param3.field_g, (double)param6.field_g);
                  var23 = -var15 + (int)var21_double;
                  if (128 <= var23) {
                    var23 -= 256;
                  }
                  if (var23 <= -128) {
                    var23 += 256;
                  }
                  if (var23 <= -32) {
                    var23 = -31;
                  }
                  if (var23 >= 32) {
                    var23 = 31;
                  }
                  param7.a(225, (double)(var15 + var23), 5);
                }
                if (param7.field_e > 0) {
                  param7.field_e = param7.field_e - 1;
                  return;
                }
                if (var16 == 0) {
                  return;
                }
                param7.field_e = 32;
                for (var21Lifetime2 = -10; var21Lifetime2 <= 10; var21Lifetime2 += 2) {
                  jn.field_F[ib.field_c].field_c = param7.field_c + 1.5 * (double)var21Lifetime2;
                  jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                  jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                  jn.field_F[ib.field_c].field_e = 0;
                  jn.field_F[ib.field_c].field_h = 0;
                  jn.field_F[ib.field_c].field_i = 9;
                  jn.field_F[ib.field_c].field_l.a(20, (byte) 94, jn.field_F[ib.field_c].field_c);
                  ib.field_c = ib.field_c + 1;
                }
                jn.field_F[ib.field_c].field_c = param7.field_c;
                jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                jn.field_F[ib.field_c].field_e = 1;
                jn.field_F[ib.field_c].field_h = 0;
                jn.field_F[ib.field_c].field_i = 21;
                jn.field_F[ib.field_c].field_l.a(6, (byte) 94, 64.0 + jn.field_F[ib.field_c].field_c);
                jn.field_F[ib.field_c].field_l.a(60, (byte) 94, jn.field_F[ib.field_c].field_c);
                ib.field_c = ib.field_c + 1;
                jn.field_F[ib.field_c].field_c = param7.field_c;
                jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                jn.field_F[ib.field_c].field_e = 1;
                jn.field_F[ib.field_c].field_h = 0;
                jn.field_F[ib.field_c].field_i = 21;
                jn.field_F[ib.field_c].field_l.a(6, (byte) 94, jn.field_F[ib.field_c].field_c + 192.0);
                jn.field_F[ib.field_c].field_l.a(60, (byte) 94, jn.field_F[ib.field_c].field_c);
                ib.field_c = ib.field_c + 1;
                if (uj.field_l != 1) {
                  return;
                }
                var13_int = (int)(((double)(-param3.field_e) + (param8 + (double)param10) - param7.field_l.field_f) * 24.0);
                var14 = (int)(24.0 * ((double)(-param3.field_g) + (param5 + (double)param9) - param7.field_l.field_a));
                var21Lifetime3 = -(int)Math.sqrt((double)(var14 * var14 + var13_int * var13_int)) + 256;
                if (var21Lifetime3 > 128) {
                  var21Lifetime3 = 128;
                }
                if (0 < var21Lifetime3) {
                  jh.a(uh.field_i * var21Lifetime3 / 128, (byte) 120, 41, sf.field_V, 5);
                  return;
                }
              }
            } else {
              if (param7.field_e % 5 == 0) {
                param7.field_e = 10;
                if (uj.field_l == 1) {
                  var13_int = (int)(24.0 * ((double)(-param3.field_e) + (param8 + (double)param10) - param7.field_l.field_f));
                  var14 = (int)((-param7.field_l.field_a + ((double)(-param3.field_g) + (param5 + (double)param9))) * 24.0);
                  var16 = 256 - (int)Math.sqrt((double)(var14 * var14 + var13_int * var13_int));
                  if (var16 > 128) {
                    var16 = 128;
                  }
                  if (var16 > 0) {
                    jh.a(var16 * uh.field_i / 256, (byte) 51, 46, sf.field_V, 5);
                  }
                }
                var16_double = 1.25;
                var18_double = 1.0;
                jn.field_F[ib.field_c].field_c = param7.field_c;
                var20 = 48;
                jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                dupTemp$0 = jn.field_F[ib.field_c].field_l;
                dupTemp$0.field_f = dupTemp$0.field_f + var16_double;
                dupTemp$1 = jn.field_F[ib.field_c].field_l;
                dupTemp$1.field_a = dupTemp$1.field_a + var18_double;
                jn.field_F[ib.field_c].field_e = 0;
                jn.field_F[ib.field_c].field_h = 0;
                jn.field_F[ib.field_c].field_i = 9;
                jn.field_F[ib.field_c].field_l.a(var20, (byte) 94, jn.field_F[ib.field_c].field_c);
                jn.field_F[ib.field_c].a(225, jn.field_F[ib.field_c].field_c + 5.0 * Math.random() - 2.5, 50);
                ib.field_c = ib.field_c + 1;
                jn.field_F[ib.field_c].field_c = param7.field_c;
                jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                dupTemp$2 = jn.field_F[ib.field_c].field_l;
                dupTemp$2.field_f = dupTemp$2.field_f + var16_double;
                dupTemp$3 = jn.field_F[ib.field_c].field_l;
                dupTemp$3.field_a = dupTemp$3.field_a + var18_double;
                jn.field_F[ib.field_c].field_e = 1;
                jn.field_F[ib.field_c].field_h = 0;
                jn.field_F[ib.field_c].field_i = 1;
                jn.field_F[ib.field_c].field_l.a(6, (byte) 94, 64.0 + jn.field_F[ib.field_c].field_c);
                jn.field_F[ib.field_c].field_l.a(var20, (byte) 94, jn.field_F[ib.field_c].field_c);
                ib.field_c = ib.field_c + 1;
                jn.field_F[ib.field_c].field_c = param7.field_c;
                jn.field_F[ib.field_c].field_j.a((byte) 46, param3);
                jn.field_F[ib.field_c].field_l.a(param7.field_l, -28860);
                dupTemp$4 = jn.field_F[ib.field_c].field_l;
                dupTemp$4.field_f = dupTemp$4.field_f + var16_double;
                dupTemp$5 = jn.field_F[ib.field_c].field_l;
                dupTemp$5.field_a = dupTemp$5.field_a + var18_double;
                jn.field_F[ib.field_c].field_e = 1;
                jn.field_F[ib.field_c].field_h = 0;
                jn.field_F[ib.field_c].field_i = 1;
                jn.field_F[ib.field_c].field_l.a(6, (byte) 94, jn.field_F[ib.field_c].field_c + 192.0);
                jn.field_F[ib.field_c].field_l.a(var20, (byte) 94, jn.field_F[ib.field_c].field_c);
                ib.field_c = ib.field_c + 1;
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_143_0 = var13;
          stackIn_143_1 = new StringBuilder().append("ab.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_144_2 = "null";
          } else {
            stackIn_144_2 = "{...}";
          }
          stackIn_146_1 = ((StringBuilder) (Object) stackIn_143_1).append(stackIn_144_2).append(',');
          if (param3 == null) {
            stackIn_147_2 = "null";
          } else {
            stackIn_147_2 = "{...}";
          }
          stackIn_149_1 = ((StringBuilder) (Object) stackIn_146_1).append(stackIn_147_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_150_2 = "null";
          } else {
            stackIn_150_2 = "{...}";
          }
          stackIn_152_1 = ((StringBuilder) (Object) stackIn_149_1).append(stackIn_150_2).append(',');
          if (param7 == null) {
            stackIn_153_2 = "null";
          } else {
            stackIn_153_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_143_0), ((StringBuilder) (Object) stackIn_152_1).append(stackIn_153_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -127) {
          return;
        }
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, gb param1, gb param2, gb param3) {
        bd var17 = null;
        pg[] var5 = null;
        pg[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        pg[] var14 = null;
        int var11_int = 0;
        bd var15 = null;
        bd var18 = null;
        bd var11 = null;
        bd var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = HostileSpawn.field_I ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          bh.field_a = jd.a((byte) 33, "commonui", param3, "frame_top");
          g.field_G = jd.a((byte) 33, "commonui", param3, "frame_bottom");
          sf.field_ab = ci.a("commonui", 116, "jagex_logo_grey", param3);
          km.field_y = jd.a((byte) 33, "commonui", param3, "button");
          cf.field_u = ei.a(param3, 113, "commonui", "validation");
          jn.field_G = (vm) ((Object) th.a(param3, -107, "arezzo12", param1, "commonui"));
          jd.field_s = (vm) ((Object) th.a(param3, 25, "arezzo14", param1, "commonui"));
          pe.field_eb = (vm) ((Object) th.a(param3, 9, "arezzo14bold", param1, "commonui"));
          var17 = new bd(param2.a("", "button.gif", param0 ^ 0), (java.awt.Component) ((Object) se.field_h));
          qm.a("commonui", 0, "dropdown", param3);
          var5 = sg.a(true, "commonui", param3, "screen_options");
          ak.field_h = new pg[4];
          nl.field_e = new pg[4];
          dd.field_n = new pg[4];
          var6 = new pg[][]{nl.field_e, ak.field_h, dd.field_n};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_k;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_j[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            pg[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
              var14[var11_int] = kb.a(var5[var9], var19[var11_int], (byte) 115);
            }
          }
          var9Lifetime1 = var17.field_A;
          pf.b(511);
          var17.a();
          si.g(0, 0, si.field_e, si.field_k);
          var15 = new bd(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.a();
          var17.c(0, 0);
          var11 = new bd(var9Lifetime1, var9Lifetime1);
          var11.a();
          var17.c(-var17.field_z + var9Lifetime1, 0);
          var12 = new bd(var17.field_z - var9Lifetime1 * 2, var9Lifetime1);
          var12.a();
          var17.c(-var9Lifetime1, param0);
          eh.b(false);
          km.field_y = new bd[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ab.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    ab(String param0) {
        super(param0);
    }

    static {
        field_d = "These grenades should be able to take out any locked doors.";
    }
}
