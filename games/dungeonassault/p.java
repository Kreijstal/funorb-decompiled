/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends qe {
    private gd field_L;
    private nn field_M;
    private tf field_E;
    private gd field_C;
    private gd field_A;
    private int field_z;
    private gd field_w;
    static String field_K;
    private int field_F;
    private cl field_u;
    private gd field_P;
    private boolean field_s;
    static int[] field_x;
    private gd field_y;
    private gd field_t;
    private pp field_Q;
    private cp[] field_v;
    private pp field_O;
    private cp[] field_D;
    private nn field_R;
    static String[] field_J;
    static cn[] field_G;
    private rh field_N;
    private rh field_I;
    static String field_r;
    private wd field_H;

    private final static cn[] a(cn[] param0, int param1) {
        cn[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        cn var4 = null;
        int var6 = 0;
        cn var7 = null;
        cn var8 = null;
        cn var9 = null;
        cn var10 = null;
        cn[] stackIn_10_0 = null;
        cn[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var2 = new cn[param0.length];
            jh.c();
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var3) {
                    break L3;
                  } else {
                    var7 = param0[var3];
                    var4 = var7;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var4 == null) {
                          break L4;
                        } else {
                          var8 = new cn(27 * var7.field_E / 16, var7.field_G * 20 / 12);
                          var8.e();
                          var4.c(-(var7.field_w * 27) / 16, -(var7.field_A * 27) / 16, var8.field_E, var8.field_G);
                          var9 = var8;
                          var10 = new cn(var9.field_E / 2, var9.field_G / 2);
                          var10.e();
                          var9.e(var10.field_E / 2, var10.field_G / 2, 0, 2048);
                          var10.field_A = var9.field_A * 27 >> 437418469;
                          var4 = var10;
                          var10.c();
                          var2[var3] = var4;
                          break L4;
                        }
                      }
                      var3++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                jh.b();
                break L2;
              }
              if (param1 == 400) {
                stackIn_12_0 = (cn[]) (var2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_10_0 = (cn[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2_ref);

            stackIn_15_1 = new StringBuilder().append("p.K(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_12_0;
        }
    }

    private final void a(gd param0, String param1, byte param2, String param3, String param4) {
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cn var8 = null;
        cn var9 = null;
        String var10 = null;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        try {
          L0: {
            L1: {
              if (param2 >= 109) {
                break L1;
              } else {
                this.a((byte) -82);
                break L1;
              }
            }
            L2: {
              jh.c();
              var6_int = 130;
              var7 = db.field_v.field_H + db.field_v.field_E;
              var8 = new cn(var6_int, var7);
              var8.e();
              db.field_v.b(param4, 0, db.field_v.field_H, 12632256, -1);
              db.field_v.a(param3, var6_int, db.field_v.field_H, 12632256, -1);
              var9 = new cn(var6_int, var7);
              var9.e();
              db.field_v.b(param4, 0, db.field_v.field_H, 12690143, -1);
              db.field_v.a(param3, var6_int, db.field_v.field_H, 12690143, -1);
              if (!param0.field_B) {
                stackIn_5_0 = (String) (param3);
                break L2;
              } else {
                stackIn_5_0 = (String) (param1);
                break L2;
              }
            }
            var10 = stackIn_5_0;
            var11 = new cn(var6_int, var7);
            var11.e();
            db.field_v.b(param4, 0, db.field_v.field_H, 16744448, -1);
            db.field_v.a(var10, var6_int, db.field_v.field_H, 16744448, -1);
            jh.b();
            var12 = rb.a(8, var9, 255, (byte) -13);
            var13 = rb.a(8, var11, 16711680, (byte) 78);
            param0.a(var11, var8, var13, var9, (byte) 126, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("p.N(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_19_2 + ')');
        }
    }

    private final gd a(String param0, String param1, int param2, int param3, int param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        cn var9 = null;
        cn var10 = null;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        gd stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            jh.c();
            var7_int = 130;
            var8 = db.field_v.field_E + db.field_v.field_H;
            var9 = new cn(var7_int, var8);
            var9.e();
            db.field_v.b(param1, 0, db.field_v.field_H, 12632256, -1);
            db.field_v.a(param0, var7_int, db.field_v.field_H, 12632256, param3);
            var10 = new cn(var7_int, var8);
            var10.e();
            db.field_v.b(param1, 0, db.field_v.field_H, 12690143, -1);
            db.field_v.a(param0, var7_int, db.field_v.field_H, 12690143, -1);
            var11 = new cn(var7_int, var8);
            var11.e();
            db.field_v.b(param1, 0, db.field_v.field_H, 16744448, -1);
            db.field_v.a(param5, var7_int, db.field_v.field_H, 16744448, -1);
            jh.b();
            var12 = rb.a(8, var10, 255, (byte) 92);
            var13 = rb.a(8, var11, 16711680, (byte) -8);
            stackIn_1_0 = new gd(var9, var10, var12, var11, var13, param2, (-var8 + 30 >> -1250999007) + param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("p.R(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(byte param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        ac var4 = null;
        cp var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = DungeonAssault.field_K;
                    if (param0 != 26) {
                        statePc = 15;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_v = new cp[gh.field_i.length];
                    var2 = 0;
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var3 >= gh.field_i.length) {
                        statePc = 14;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = gh.field_i[var3];
                    if (var6 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 == null) {
                        statePc = 12;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (0 != (var4.field_j ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var6 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (0 == var4.field_g) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var4.field_z == null) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var4.field_i > gm.field_d.field_m) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var5 = new cp(10, var2, var4);
                    var2 = var2 + (var5.field_x + 10);
                    this.field_v[var3] = var5;
                    this.field_R.a((gd) (var5), (byte) -20);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var3++;
                    if (var6 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        lb var5;
        int var6;
        cn var7_ref_cn;
        int var7;
        int var8;
        int var9;
        lb var10;
        if (param2 < 126) {
          return;
        } else {
          L0: {
            var10 = gm.field_d;
            var5 = var10;
            var6 = var10.field_L[param3].field_a;
            if (qj.field_c[param3] != null) {
              var6 = qj.field_c[param3].field_a;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              if (-1 == (var6 ^ -1)) {
                break L2;
              } else {
                this.a(param1, 124, param3, -dm.field_a[var6].field_v + 56 + param0, dm.field_a[var6]);
                if (-3 == (gh.field_i[var6].field_g ^ -1)) {
                  L3: {
                    var7_ref_cn = jb.a((byte) -70, var6);
                    if (var7_ref_cn == null) {
                      break L3;
                    } else {
                      var8 = var7_ref_cn.field_E * 5 >> -1724419101;
                      var9 = var7_ref_cn.field_G * 5 >> 15474339;
                      var7_ref_cn.c(param1 + (-var8 + 48 >> -301264703), 40 + param0 - var9, var8, var9);
                      break L3;
                    }
                  }
                  if (DungeonAssault.field_K == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
            }
            L4: {
              var7 = 0;
              if (-1 == (param3 % 7 ^ -1)) {
                break L4;
              } else {
                if (!gm.field_d.field_k.a(-1 + param3 + -(param3 / 7), (byte) 72)) {
                  break L4;
                } else {
                  var7 = var7 | 1;
                  break L4;
                }
              }
            }
            L5: {
              if ((param3 % 7 ^ -1) == -7) {
                break L5;
              } else {
                if (gm.field_d.field_k.a(param3 - param3 / 7, (byte) 73)) {
                  var7 = var7 | 2;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (param3 <= 6) {
                break L6;
              } else {
                if (gm.field_d.field_k.a(param3 - -35, (byte) 119)) {
                  var7 = var7 | 4;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (-43 >= (param3 ^ -1)) {
                break L7;
              } else {
                if (!gm.field_d.field_k.a(param3 - -42, (byte) 80)) {
                  break L7;
                } else {
                  var7 = var7 | 8;
                  break L7;
                }
              }
            }
            id.field_m[var7].h(param1, param0 + 12);
            break L1;
          }
          return;
        }
    }

    final void a(boolean param0) {
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int statePc = 0;
        Object var2 = null;
        Object var3 = null;
        rj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        gg var16 = null;
        String var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = DungeonAssault.field_K;
                    super.a(param0);
                    this.field_e.b(0, 0);
                    var2 = null;
                    if (-1 != this.field_F) {
                        statePc = 2;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = qj.field_c[this.field_F];
                    if (var2 == null) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2 = gm.field_d.field_L[this.field_F];
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var3 = null;
                    if (var2 == null) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var3 = ((ai) (var2)).field_h;
                    statePc = 10;
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_R.field_l != null) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var3 = ((cp) ((Object) this.field_R.field_l)).field_S;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    p.a(200, 65, (ac) (var3));
                    if (var2 == null) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    p.a(488, 54, (ai) (var2));
                    if (var15 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    p.a(488, 54, this.field_H, kc.field_V);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    this.a(false, 484, 327);
                    var4 = (rj) ((Object) this.field_p.e(-24172));
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var4 == null) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var4.a(68);
                    var4 = (rj) ((Object) this.field_p.a(4));
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ad.field_e.h(187, 48);
                    ad.field_e.i(187, -ad.field_e.field_b + 40);
                    ad.field_e.f(604 - ad.field_e.field_d, 40 + -ad.field_e.field_b);
                    oe.field_m.h(171, 382);
                    oe.field_m.j(580, 99);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (!gl.field_Lb) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_u.b((byte) -55);
                    if (var15 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.a(8, 80, 394);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (null != this.field_b) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_b.a((byte) -91);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    p.e();
                    this.field_q.a((byte) -61);
                    if (gl.field_Lb) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 128.0);
                    wm.field_c.b(205, 83, 256);
                    wm.field_c.b(205, 83, var5);
                    if (this.field_w.field_B) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ec.a(95, 205, (byte) -95, im.field_e, 16744448, 192);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var15 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var5 = (int)(128.0 * (1.0 + Math.cos((double)((float)mo.field_a / 20.0f))));
                    wm.field_c.b(-(im.field_e.field_y >> -803529567) + 356, -(im.field_e.field_v >> 1526787905) + 267, 256);
                    wm.field_c.b(356 + -(im.field_e.field_y >> 462478177), 267 - (im.field_e.field_v >> -123892703), var5);
                    if (this.field_w.field_B) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    ec.a(-(im.field_e.field_v >> 741506017) + 265, -(im.field_e.field_y >> 427309537) + 354, (byte) -86, im.field_e, 16744448, 96);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var4 = (rj) ((Object) this.field_p.e(-24172));
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var4 == null) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var4.d(0);
                    var4 = (rj) ((Object) this.field_p.a(4));
                    if (var15 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var15 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (this.field_F == -1) {
                        statePc = 61;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (null != this.field_R.field_l) {
                        statePc = 43;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var5 = 0;
                    if (qj.field_c[this.field_F] != null) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (null == gm.field_d.field_L[this.field_F]) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var5 = gm.field_d.field_L[this.field_F].field_h.field_c >> 37723553;
                    if (var15 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var5 = qj.field_c[this.field_F].field_h.field_c;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var5 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var6 = this.field_F / 7;
                    var7 = this.field_F % 7;
                    var8 = 421 - (189 + -((var7 + var6) * 27));
                    var9 = 80 - -(20 * (-var7 + (var6 + 7)));
                    if (gl.field_Lb) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var16 = this.field_u.b(this.field_F, -15390);
                    var8 = -1 + var16.field_f;
                    var9 = 7 + var16.field_b;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (t.field_a == var5) {
                        statePc = 59;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var17 = "+" + var5 / 10;
                    var11 = db.field_v.b(var17);
                    var12 = db.field_v.field_E + db.field_v.field_H;
                    jn.field_a = new cn(var11, var12);
                    jh.a(jn.field_a);
                    db.field_v.b(var17, 0, db.field_v.field_H, 16744512, -1);
                    jh.b();
                    dm.field_f = dd.a((byte) -112, 12, jn.field_a);
                    var19 = dm.field_f.field_B;
                    var18 = var19;
                    var13 = var18;
                    var14 = 0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var14 >= var19.length) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var13[var14] = nb.a(var19[var14], 255);
                    stackIn_60_0 = -1;
                    stackIn_55_0 = stackIn_60_0;
                    stackIn_60_1 = var19[var14] ^ -1;
                    stackIn_55_1 = stackIn_60_1;
                    if (var15 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (stackIn_55_0 != stackIn_55_1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var19[var14] = 1;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var14++;
                    if (var15 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    t.field_a = var5;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = var8;
                    stackIn_60_1 = jn.field_a.field_y >> 1661823649;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var10 = stackIn_60_0 - stackIn_60_1;
                    var11 = -jn.field_a.field_v + var9;
                    bp.a(var11, dm.field_f, var10, (byte) 99);
                    jn.field_a.h(var10, var11);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    this.field_N.d();
                    this.field_I.d();
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (null == this.field_b) {
                        statePc = 69;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var5 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var5 >= gf.field_b.length) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    gf.field_b[var5] = nb.a(gf.field_b[var5] >>> 2070201730, 1061109567);
                    var5++;
                    if (var15 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var15 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    this.field_b.b(112);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (!kn.field_g) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    ab.a(0);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    oh.a((byte) 54);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(nh param0, int param1, nh param2, nh param3) {
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        q[] var5 = null;
        q[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        q[] var10 = null;
        int var11_int = 0;
        cn var11 = null;
        cn var12 = null;
        int var13 = 0;
        q[] var14 = null;
        cn var15 = null;
        int[][] var16 = null;
        cn var17 = null;
        cn var18 = null;
        int[][] var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        gn.field_i = kn.a(param3, "commonui", "frame_top", -62);
                        di.field_l = kn.a(param3, "commonui", "frame_bottom", -91);
                        bl.field_e = oh.a(param3, "commonui", 11091, "jagex_logo_grey");
                        na.field_C = kn.a(param3, "commonui", "button", -94);
                        sl.field_c = da.a("commonui", "validation", 0, param3);
                        ta.field_e = (se) ((Object) kk.a(param2, param3, "arezzo12", 0, "commonui"));
                        lp.field_C = (se) ((Object) kk.a(param2, param3, "arezzo14", 0, "commonui"));
                        hc.field_f = (se) ((Object) kk.a(param2, param3, "arezzo14bold", 0, "commonui"));
                        var17 = new cn(param0.a("button.gif", "", (byte) -116), (java.awt.Component) ((Object) c.field_h));
                        pa.a((byte) -94, param3, "commonui", "dropdown");
                        var5 = qa.a(15322, "screen_options", "commonui", param3);
                        d.field_c = new q[4];
                        nf.field_v = new q[4];
                        wo.field_a = new q[4];
                        var6 = new q[][]{d.field_c, nf.field_v, wo.field_a};
                        var19 = new int[4][];
                        var16 = var19;
                        var7 = var16;
                        var7[0] = var5[0].field_i;
                        var8 = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var19.length <= var8) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7[var8] = (int[]) ((Object) var19[0].clone());
                        var8++;
                        if (var13 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = var5[0].field_j[0];
                        var19[2][var8] = 16777215;
                        var19[1][var8] = 2394342;
                        var19[3][var8] = 4767999;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var9 ^ -1) <= -4) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = var6[var9];
                        var10 = var14;
                        stackIn_18_0 = 0;
                        stackIn_10_0 = stackIn_18_0;
                        if (var13 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11_int = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11_int >= var14.length) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14[var11_int] = pi.a(1, var5[var9], var19[var11_int]);
                        var11_int++;
                        if (var13 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var13 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = var17.field_v;
                        ie.a(95);
                        var17.e();
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        gf.d(stackIn_18_0, 0, gf.field_i, gf.field_c);
                        var15 = new cn(var9, var9);
                        var18 = var15;
                        var18.e();
                        var17.c(0, 0);
                        var11 = new cn(var9, var9);
                        var11.e();
                        if (param1 >= 2) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        var17.c(-var17.field_y + var9, 0);
                        var12 = new cn(var17.field_y + -(var9 * 2), var9);
                        var12.e();
                        var17.c(-var9, 0);
                        ti.c(true);
                        na.field_C = new cn[]{var15, var12, var11};
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var4);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("p.Q(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param2 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param3 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw vk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static vk a(int param0, String param1, int param2) {
        vk var3 = null;
        RuntimeException var3_ref = null;
        vk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new vk(false);
              var3.field_g = param1;
              if (param2 == -28323) {
                break L1;
              } else {
                field_G = (cn[]) null;
                break L1;
              }
            }
            var3.field_d = param0;
            stackIn_3_0 = (vk) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("p.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        L0: {
          var4 = param2 + (8 - -la.field_b.field_H);
          db.field_v.b(pb.field_I, 7 + param1, var4, 16777215, -1);
          db.field_v.a(Integer.toString(gm.field_d.field_s / 10), 133 + param1, var4, 16777215, -1);
          if (-1 > (jj.field_c ^ -1)) {
            stackIn_3_0 = jj.field_c / 10;
            break L0;
          } else {
            stackIn_3_0 = 0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var4 += 37;
        if (param0) {
          return;
        } else {
          L1: {
            if (gm.field_d.field_s >= jj.field_c) {
              stackIn_7_0 = 16777215;
              break L1;
            } else {
              stackIn_7_0 = 16711680;
              break L1;
            }
          }
          var6 = stackIn_7_0;
          db.field_v.b(ef.field_f, 7 + param1, var4, var6, -1);
          db.field_v.a(Integer.toString(var5), param1 + 133, var4, var6, -1);
          return;
        }
    }

    private final void d(int param0) {
        int discarded$0 = 0;
        ai var2_ref_ai;
        int var2;
        ac var3;
        int var4;
        ac var5;
        L0: {
          var4 = DungeonAssault.field_K;
          this.field_F = -1;
          if (kn.field_g) {
            if (!od.a((byte) -91)) {
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        if (super.d()) {
          return;
        } else {
          L1: {
            this.field_F = this.b(hj.field_S, eh.field_h, 162);
            if ((this.field_F ^ -1) != 0) {
              L2: {
                var2_ref_ai = qj.field_c[this.field_F];
                if (var2_ref_ai != null) {
                  break L2;
                } else {
                  var2_ref_ai = gm.field_d.field_L[this.field_F];
                  break L2;
                }
              }
              if (var2_ref_ai != null) {
                L3: {
                  if (var2_ref_ai == rd.field_x) {
                    break L3;
                  } else {
                    hh.field_r = (en) ((Object) new bd(var2_ref_ai.field_h));
                    rd.field_x = var2_ref_ai;
                    break L3;
                  }
                }
                uj.a(hh.field_r, 95);
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          L4: {
            L5: {
              if (this.field_Q != hh.field_s) {
                break L5;
              } else {
                this.c(param0 + 1380862290);
                this.a(true, (byte) -27);
                if (var4 == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (this.field_O == hh.field_s) {
                break L6;
              } else {
                L7: {
                  if (this.field_L == hh.field_s) {
                    break L7;
                  } else {
                    L8: {
                      if (hh.field_s != this.field_A) {
                        break L8;
                      } else {
                        this.a((byte) -47, 0);
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (this.field_C == hh.field_s) {
                        break L9;
                      } else {
                        L10: {
                          if (hh.field_s != this.field_y) {
                            break L10;
                          } else {
                            this.a((byte) -88, 4);
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (this.field_P == hh.field_s) {
                            break L11;
                          } else {
                            L12: {
                              L13: {
                                if (hh.field_s == this.field_w) {
                                  break L13;
                                } else {
                                  if (this.field_t != hh.field_s) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              this.a((byte) -121);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L12;
                              }
                            }
                            L14: {
                              if (hh.field_s instanceof cp) {
                                break L14;
                              } else {
                                if (0 == no.field_d) {
                                  break L4;
                                } else {
                                  L15: {
                                    var2 = this.b(lc.field_c, hm.field_k, param0 + 1380862337);
                                    if ((var2 ^ -1) == 0) {
                                      break L15;
                                    } else {
                                      if (var2 == 0) {
                                        break L15;
                                      } else {
                                        if ((var2 ^ -1) == -7) {
                                          break L15;
                                        } else {
                                          if ((var2 ^ -1) == -25) {
                                            break L15;
                                          } else {
                                            if (-43 == (var2 ^ -1)) {
                                              break L15;
                                            } else {
                                              if ((var2 ^ -1) != -49) {
                                                L16: {
                                                  L17: {
                                                    if (no.field_d == 1) {
                                                      break L17;
                                                    } else {
                                                      if (2 != no.field_d) {
                                                        break L16;
                                                      } else {
                                                        L18: {
                                                          if (null != qj.field_c[var2]) {
                                                            jj.field_c = jj.field_c - qj.field_c[var2].field_h.field_c;
                                                            if (gm.field_d.field_L[var2] != null) {
                                                              jj.field_c = jj.field_c + (gm.field_d.field_L[var2].field_h.field_c >> -1380862175);
                                                              break L18;
                                                            } else {
                                                              break L18;
                                                            }
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                        qj.field_c[var2] = null;
                                                        this.field_H = null;
                                                        if (var4 == 0) {
                                                          break L16;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (this.field_R.field_l != null) {
                                                    L19: {
                                                      var3 = ((cp) ((Object) this.field_R.field_l)).field_S;
                                                      if (qj.field_c[var2] == null) {
                                                        break L19;
                                                      } else {
                                                        if (var3 != qj.field_c[var2].field_h) {
                                                          break L19;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                    }
                                                    L20: {
                                                      L21: {
                                                        if (null == qj.field_c[var2]) {
                                                          break L21;
                                                        } else {
                                                          jj.field_c = jj.field_c - qj.field_c[var2].field_h.field_c;
                                                          if (var4 == 0) {
                                                            break L20;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      if (gm.field_d.field_L[var2] != null) {
                                                        jj.field_c = jj.field_c - (gm.field_d.field_L[var2].field_h.field_c >> -1721195743);
                                                        break L20;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                    L22: {
                                                      L23: {
                                                        qj.field_c[var2] = new ai(var3.field_v);
                                                        if (null == qj.field_c[var2].field_c) {
                                                          break L23;
                                                        } else {
                                                          if (qj.field_c[var2].field_c.field_i != var3.field_d) {
                                                            break L23;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      qj.field_c[var2].field_c = new wd(var3.field_d);
                                                      break L22;
                                                    }
                                                    jj.field_c = jj.field_c + var3.field_c;
                                                    qh.a(param0 ^ 1380875597, this.field_Q, 19);
                                                    if (var3.field_u != qj.field_c[var2].field_c.field_n) {
                                                      L24: {
                                                        if (null != var3.field_u) {
                                                          qj.field_c[var2].field_c.a(rf.field_M, var3.field_u, -10872);
                                                          break L24;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                      if (var3.field_a != null) {
                                                        gd.a(64, var3.field_a);
                                                        break L16;
                                                      } else {
                                                        break L16;
                                                      }
                                                    } else {
                                                      break L16;
                                                    }
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                                jk.j((byte) 59);
                                                this.c((byte) -118);
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var4 == 0) {
                                    break L4;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            L25: {
                              var5 = ((cp) ((Object) hh.field_s)).field_S;
                              this.field_H = new wd(var5.field_d);
                              if (null == var5.field_u) {
                                break L25;
                              } else {
                                this.field_H.a(rf.field_M, var5.field_u, -10872);
                                break L25;
                              }
                            }
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L11;
                            }
                          }
                        }
                        this.a((byte) -52, 3);
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    this.a((byte) -82, 2);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L7;
                    }
                  }
                }
                this.a((byte) -50, 1);
                if (var4 == 0) {
                  break L4;
                } else {
                  break L6;
                }
              }
            }
            this.d((byte) -76);
            this.a(true, (byte) -11);
            break L4;
          }
          L26: {
            if (param0 == -1380862175) {
              break L26;
            } else {
              discarded$0 = this.b(-120, -24, -127);
              break L26;
            }
          }
          return;
        }
    }

    private final void a(byte param0, int param1) {
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int statePc = 0;
        int[] var3 = null;
        int var4 = 0;
        cp[] var5 = null;
        int var6 = 0;
        cp var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = DungeonAssault.field_K;
                    var11 = new int[gh.field_i.length];
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = param1;
                    if (0 != var4) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (var8 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var4 != 1) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var8 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((var4 ^ -1) == -3) {
                        statePc = 27;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (3 != var4) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var8 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (4 != var4) {
                        statePc = 58;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var8 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var9 = var3;
                    var11 = var10;
                    var4 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var4 >= var11.length) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var8 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (null == gh.field_i[var4]) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var9[var4] = gh.field_i[var4].field_c;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var4++;
                    if (var8 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var8 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var9 = var3;
                    var11 = var10;
                    var4 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var11.length <= var4) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var8 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (gh.field_i[var4] == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var9[var4] = gh.field_i[var4].field_A;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var4++;
                    if (var8 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var8 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var9 = var3;
                    var11 = var10;
                    var4 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var11.length <= var4) {
                        statePc = 34;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var8 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (null != gh.field_i[var4]) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var9[var4] = gh.field_i[var4].field_k;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var4++;
                    if (var8 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var8 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var9 = var3;
                    var11 = var10;
                    var4 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var4 >= var11.length) {
                        statePc = 42;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var8 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (gh.field_i[var4] != null) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var9[var4] = gh.field_i[var4].field_y;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var4++;
                    if (var8 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var8 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var9 = var3;
                    var11 = var10;
                    var4 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var11.length <= var4) {
                        statePc = 58;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var8 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (gh.field_i[var4] != null) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var9[var4] = gh.field_i[var4].field_r;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var4++;
                    if (var8 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var4 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var11.length <= var4) {
                        statePc = 58;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var8 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (gh.field_i[var4] != null) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var9[var4] = gh.field_i[var4].field_r;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var4++;
                    if (var8 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (this.field_z == param1) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.field_s = false;
                    if (var8 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_63_0 = this;
                    stackIn_62_0 = stackIn_63_0;
                    if (this.field_s) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_64_0 = this;
                    stackIn_64_1 = 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = this;
                    stackIn_64_1 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    ((p) (this)).field_s = stackIn_64_1 != 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    this.field_z = param1;
                    if (!this.field_s) {
                        statePc = 67;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var4 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var4 >= var11.length) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var9[var4] = -var11[var4];
                    var4++;
                    if (var8 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var8 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (this.field_v == null) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    this.field_D = (cp[]) ((Object) this.field_v.clone());
                    ik.a(this.field_D, -111, var11);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (param0 < -42) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    this.field_R = (nn) null;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    hf.field_nb.field_J = null;
                    hf.field_nb.e(true);
                    var4 = 0;
                    var5 = this.field_D;
                    var6 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (var6 >= var5.length) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var7 = var5[var6];
                    if (var8 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var7 == null) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    ((gd) ((Object) var7)).b(10, var4, (byte) 4);
                    var4 = var4 + (8 + ((gd) ((Object) var7)).field_x);
                    hf.field_nb.a(var7, (byte) -48);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var6++;
                    if (var8 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        int stackIn_18_0 = 0;
        ai[] var2;
        int var3;
        ai var4;
        int var5;
        ai[] var6;
        lf var7;
        ai var8;
        ai var9;
        var5 = DungeonAssault.field_K;
        super.c(param0);
        if (!kh.field_s) {
          if (!param0) {
            return;
          } else {
            L0: while (true) {
              L1: {
                L2: {
                  if (!ha.b((byte) 47)) {
                    break L2;
                  } else {
                    stackIn_18_0 = mm.field_t;

                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        if (stackIn_18_0 != 13) {
                          break L3;
                        } else {
                          this.a(false, (byte) -94);
                          if (var5 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      super.f();
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L4: {
                  if (null == this.field_b) {
                    break L4;
                  } else {
                    if (!this.field_b.field_d) {
                      break L4;
                    } else {
                      L5: {
                        var7 = (lf) ((Object) this.field_b);
                        if (!var7.field_u) {
                          this.d((byte) -76);
                          if (var5 == 0) {
                            break L5;
                          } else {
                            this.c(65);
                            break L5;
                          }
                        } else {
                          this.c(65);
                          break L5;
                        }
                      }
                      this.field_b.c(-127);
                      this.field_b = null;
                      this.a(true, (byte) -11);
                      break L4;
                    }
                  }
                }
                this.d(-1380862175);
                stackIn_18_0 = kn.field_g ? 1 : 0;
                break L1;
              }
              L6: {
                if (stackIn_18_0 != 0) {
                  bl.a(0);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (this.field_H != null) {
                  this.field_H.a((byte) 109, 20);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6 = gm.field_d.field_L;
              var2 = var6;
              var3 = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var3 >= var6.length) {
                      break L10;
                    } else {
                      var8 = var6[var3];
                      if (var5 != 0) {
                        break L9;
                      } else {
                        L11: {
                          if (var8 == null) {
                            break L11;
                          } else {
                            var8.field_c.a((byte) 109, 20);
                            break L11;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  var2 = qj.field_c;
                  break L9;
                }
                var3 = 0;
                L12: while (true) {
                  L13: {
                    if (var3 >= var2.length) {
                      break L13;
                    } else {
                      var9 = var2[var3];
                      var4 = var9;
                      if (var5 != 0) {
                        break L13;
                      } else {
                        L14: {
                          if (var4 == null) {
                            break L14;
                          } else {
                            var9.field_c.a((byte) 109, 20);
                            break L14;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void d(boolean param0) {
        field_r = null;
        field_G = null;
        field_K = null;
        field_x = null;
        field_J = null;
        if (!param0) {
            field_K = (String) null;
        }
    }

    private final void c(byte param0) {
        this.field_Q.field_w = gm.field_d.field_s >= jj.field_c ? true : false;
        int var2 = -29 % ((-32 - param0) / 39);
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        if (this.field_u != null) {
          return this.field_u.b(param0, 19091, param1);
        } else {
          param1 -= 98;
          param0 -= 394;
          var4 = ((189 + param0) * 3 + 560 + -(param1 * 4)) / 162;
          var5 = (3 * param0 + param1 * 4) / param2;
          if (var4 >= 0) {
            if (-1 >= (var5 ^ -1)) {
              if ((var4 ^ -1) > -8) {
                if (var5 < 7) {
                  return 7 * var5 + var4;
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = DungeonAssault.field_K;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= 49) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    qj.field_c[var2] = null;
                    var2++;
                    if (var3 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    jj.field_c = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param0 == -76) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.b(-63);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    this.c((byte) 34);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3;
        String var4;
        int var5;
        String var6;
        L0: {
          var5 = DungeonAssault.field_K;
          var3 = 0;
          if (param1 <= -3) {
            break L0;
          } else {
            this.c((byte) 76);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if (-50 >= (var3 ^ -1)) {
                break L3;
              } else {
                if (var5 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (null == qj.field_c[var3]) {
                      break L4;
                    } else {
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if ((var3 ^ -1) != -50) {
              break L2;
            } else {
              L5: {
                if (ed.c(true)) {
                  break L5;
                } else {
                  if (!gm.field_d.field_H) {
                    ac.field_B.d((byte) -106, 58);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              if (kn.field_g) {
                gd.a(g.field_Hb, 0, 5, param0);
                return;
              } else {
                gd.a(g.field_Hb, 0, g.field_Hb, param0);
                return;
              }
            }
          }
          L6: {
            var6 = wj.field_x;
            var4 = var6;
            if (!gm.field_d.field_H) {
              var4 = var6 + dh.field_c;
              break L6;
            } else {
              break L6;
            }
          }
          this.field_b = (kl) ((Object) new lf(oa.field_h, var4));
          return;
        }
    }

    private final void a(byte param0) {
        this.a(this.field_w, dc.field_k, (byte) 125, ob.field_Kb, mm.field_s);
        this.a(this.field_t, dc.field_k, (byte) 122, ob.field_Kb, cf.field_d);
        if (param0 > -65) {
            this.c();
        }
        if (!(gl.field_Lb != this.field_t.field_B)) {
            gl.field_Lb = !this.field_t.field_B ? true : false;
            this.a(14);
        }
    }

    private final void b(int param0) {
        rl.field_d = p.a(ri.field_d, 400);
        dm.field_a = p.a(i.field_r, 400);
        id.field_m = p.a(mc.field_w, param0 + -2398);
        int var2 = 390;
        int var3 = 300;
        bd.field_g = new cn(var2, var3);
        if (param0 != 2798) {
            this.field_N = (rh) null;
        }
        jh.a(bd.field_g);
        nb.field_d.a(0, 0, var2, var3);
        jh.b();
    }

    private final void e(int param0) {
        gd stackIn_2_0 = null;
        gd stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          this.b();
          this.field_R = new nn(true);
          this.field_M = new nn(false);
          hf.field_nb = new ed(8, 90, 180, 382);
          this.field_Q = tn.a(16, 12, ne.field_c, jm.field_i, param0 ^ -18245, lk.field_P);
          this.field_O = tn.a(472, 12, ne.field_c, jm.field_i, param0 ^ -18248, be.field_r.toUpperCase());
          this.field_A = sj.a(24, 87, 66, uj.field_c, this.field_M);
          this.field_L = sj.a(55, 96, 66, gd.field_E, this.field_M);
          this.field_C = sj.a(86, 110, 66, jj.field_b, this.field_M);
          this.field_P = sj.a(117, 87, 66, tb.field_c, this.field_M);
          this.field_y = sj.a(148, 91, 66, kd.field_f, this.field_M);
          this.field_p.a(hf.field_nb, false);
          this.field_p.a(this.field_Q, false);
          this.field_p.a(this.field_O, false);
          this.field_p.a(this.field_A, false);
          this.field_p.a(this.field_L, false);
          this.field_p.a(this.field_C, false);
          this.field_p.a(this.field_P, false);
          this.field_p.a(this.field_y, false);
          this.field_A.field_n = (en) ((Object) new e(jk.a(new String[]{tn.field_U}, tp.field_w, 30496)));
          this.field_L.field_n = (en) ((Object) new e(jk.a(new String[]{qk.field_d}, tp.field_w, param0 + 12257)));
          this.field_C.field_n = (en) ((Object) new e(jk.a(new String[]{dj.field_c}, tp.field_w, param0 + 12257)));
          this.field_P.field_n = (en) ((Object) new e(jk.a(new String[]{rk.field_a}, tp.field_w, 30496)));
          this.field_y.field_n = (en) ((Object) new e(jk.a(new String[]{eg.field_f}, tp.field_w, 30496)));
          this.field_O.field_n = (en) ((Object) new e((String) null, pm.field_o, nk.field_Lb));
          this.field_Q.field_n = (en) ((Object) new e((String) null, ud.field_u, oi.field_M));
          this.b((byte) 26);
          this.field_z = 0;
          this.field_s = false;
          this.field_M.a(this.field_A, -256);
          this.a((byte) -124, 0);
          this.field_w = this.a(ob.field_Kb, mm.field_s, 491, param0 ^ -18240, 438, dc.field_k);
          this.field_w.field_B = true;
          this.field_p.a(this.field_w, false);
          this.field_t = this.a(ob.field_Kb, cf.field_d, 491, -1, 401, dc.field_k);
          stackIn_2_0 = this.field_t;

          if (gl.field_Lb) {
            stackIn_3_0 = (gd) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (gd) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        stackIn_3_0.field_B = stackIn_3_1 != 0;
        this.field_p.a(this.field_t, false);
        if (param0 != 18239) {
          return;
        } else {
          this.field_q = new sa(186, 401, 288, 71);
          this.field_q.a(true, f.field_c, (byte) 91, wh.field_c, 16777215);
          return;
        }
    }

    private final void a(int param0) {
        L0: {
          ol.field_a = new cn[4];
          ol.field_a[0] = me.a(32, param0, 14, 0, 14);
          ol.field_a[1] = me.a(32, 14, 0, 14, 14);
          ol.field_a[2] = me.a(md.b(param0, 46), 0, 14, 14, 14);
          ol.field_a[3] = me.a(32, 14, 14, 14, 0);
          if (gl.field_Lb) {
            break L0;
          } else {
            ol.field_a = p.a(wk.a(ol.field_a, param0 + -14), 400);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!gl.field_Lb) {
              break L2;
            } else {
              this.field_u = (cl) ((Object) new sf((go) null, 350, 261));
              if (DungeonAssault.field_K == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_u = null;
          break L1;
        }
        jk.j((byte) 59);
    }

    final void c() {
        im.field_e = null;
        rl.field_d = null;
        dm.field_a = null;
        rd.field_x = null;
        jn.field_a = null;
        dm.field_f = null;
        ol.field_a = null;
        wm.field_c = null;
        bd.field_g = null;
        id.field_m = null;
        hh.field_r = null;
        bn.field_f = null;
        super.c();
        System.gc();
    }

    private final void c(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = DungeonAssault.field_K;
                    if (param0 >= 56) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(-105, -4, 26);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (gm.field_d.field_s >= jj.field_c) {
                        statePc = 4;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!ed.c(true)) {
                        statePc = 6;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ac.field_B.d((byte) -127, 57);
                    var2 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var2 >= 49) {
                        statePc = 38;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_23_0 = 0;
                    stackIn_9_0 = stackIn_23_0;
                    stackIn_23_1 = var2;
                    stackIn_9_1 = stackIn_23_1;
                    if (var3 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 == stackIn_9_1) {
                        statePc = 21;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (6 == var2) {
                        statePc = 21;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-25 == (var2 ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var2 == 42) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-49 != (var2 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var3 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (null != qj.field_c[var2]) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ac.field_B.a(6, 0);
                    statePc = 21;
                    continue stateLoop;
                }
                case 18: {
                    ac.field_B.a(6, qj.field_c[var2].field_a);
                    if (var3 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ac.field_B.a(6, 0);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var2++;
                    if (var3 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (stackIn_23_0 <= stackIn_23_1) {
                        statePc = 55;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_56_0 = -1;
                    stackIn_25_0 = stackIn_56_0;
                    if (var3 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 == (var2 ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if ((var2 ^ -1) == -7) {
                        statePc = 35;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (24 == var2) {
                        statePc = 35;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var2 == 42) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var2 != 48) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var3 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (null != qj.field_c[var2]) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    gm.field_d.field_L[var2] = new ai(qj.field_c[var2].field_a);
                    gm.field_d.field_L[var2].field_c = qj.field_c[var2].field_c;
                    qj.field_c[var2] = null;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var2++;
                    if (var3 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (jj.field_c > 0) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    gm.field_d.field_s = gm.field_d.field_s - jj.field_c;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var2 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (49 <= var2) {
                        statePc = 55;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_56_0 = -1;
                    stackIn_44_0 = stackIn_56_0;
                    if (var3 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (stackIn_44_0 == (var2 ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if ((var2 ^ -1) == -7) {
                        statePc = 54;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (24 == var2) {
                        statePc = 54;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var2 == 42) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var2 != 48) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var3 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (null != qj.field_c[var2]) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    gm.field_d.field_L[var2] = new ai(qj.field_c[var2].field_a);
                    gm.field_d.field_L[var2].field_c = qj.field_c[var2].field_c;
                    qj.field_c[var2] = null;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var2++;
                    if (var3 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    jj.field_c = stackIn_56_0;
                    this.c((byte) -91);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, cn param4) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = 256;
                        if (0 == gm.field_d.field_L[param2].field_a) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6_int = 128;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = 10066329;
                        var8 = var6_int * (192 - -((var7 & 16711680) >> -151077806)) / 255;
                        var9 = (((var7 & 65280) >> -100822870) + 192) * var6_int / 255;
                        var10 = (((var7 & 255) >> 1038778018) + 192) * var6_int / 255;
                        var11 = 0;
                        var12 = (param4.field_A + param3) * gf.field_i + (param0 - -param4.field_w);
                        var13 = -param4.field_y + gf.field_i;
                        var15 = -param4.field_v;
                        if (param1 > 54) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a((gd) null, (String) null, (byte) -123, (String) null, (String) null);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var15 >= 0) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var20 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var14 = -param4.field_y;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-1 >= (var14 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var16 = param4.field_B[var11];
                        stackIn_15_0 = 0;
                        stackIn_11_0 = stackIn_15_0;
                        stackIn_15_1 = var16;
                        stackIn_11_1 = stackIn_15_1;
                        if (var20 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == stackIn_11_1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var17 = var16 & 16711680;
                        var18 = var16 & 65280;
                        var19 = var16 & 255;
                        var18 = var18 * var9;
                        var17 = var17 * var8;
                        var19 = var19 * var10;
                        var16 = var17 & -16777216 | var18 & 16711680 | var19 & 65280;
                        gf.field_b[var12] = var16 >>> -859178296;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12++;
                        var11++;
                        var14++;
                        if (var20 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = var12;
                        stackIn_15_1 = var13;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = stackIn_15_0 + stackIn_15_1;
                        var15++;
                        if (var20 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var6);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("p.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param4 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw vk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
                }
                case 21: {
                    return;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int statePc = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        lb var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = DungeonAssault.field_K;
                    bd.field_g.h(-(bd.field_g.field_y >> 1050842529) + param2 - -2, param1 + 12);
                    var14 = gm.field_d;
                    if (param0 == 8) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_x = (int[]) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var5 > 140) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    gf.b(-(var5 * 4 / 3) + param2, var5 + 18 + param1, var5 * 8 / 3, 0);
                    gf.b(param2 + -(var5 * 4 / 3), -var5 + 280 + param1 - -18, var5 * 8 / 3, 0);
                    var5++;
                    if (var13 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var13 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = var5;
                    stackIn_9_1 = 7;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 >= stackIn_9_1) {
                        statePc = 39;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var6 = param2 - (1 + var5) * 27;
                    var7 = 20 * var5 + param1;
                    var8 = 6 + -var5;
                    stackIn_40_0 = 0;
                    stackIn_11_0 = stackIn_40_0;
                    if (var13 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var9 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var9 >= 1 + var5) {
                        statePc = 38;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_9_0 = -1;
                    stackIn_14_0 = stackIn_9_0;
                    stackIn_9_1 = var9 ^ -1;
                    stackIn_14_1 = stackIn_9_1;
                    if (var13 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 != stackIn_14_1) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (0 == var8) {
                        statePc = 25;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var8 == 6) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.a(var6, 92, var8, var7 - -4, rl.field_d[5]);
                    if (var13 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var10 = var14.field_k.a(35 + var8, (byte) 109) ? 1 : 0;
                    var11 = 5;
                    if (var10 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var12 = 0;
                    if (var12 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = 3;
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var11 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    this.a(var6, 97, var8, 4 + var7, rl.field_d[var11]);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var5 != var9) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var8 == 6) {
                        statePc = 37;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var8 != 48) {
                        statePc = 29;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.a(27 + var6, 119, var8, var7 + 4, rl.field_d[4]);
                    if (var13 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10 = var14.field_k.a(var8 + -(var8 / 7), (byte) 125) ? 1 : 0;
                    var11 = 4;
                    if (var10 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var12 = 0;
                    if (var12 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = 2;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var11 = stackIn_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    this.a(27 + var6, 110, var8, 4 + var7, rl.field_d[var11]);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    this.a(var7, var6, (byte) 127, var8);
                    var6 += 54;
                    var9++;
                    var8 += 8;
                    if (var13 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var5++;
                    if (var13 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = 7;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var5 = stackIn_40_0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = 13;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 <= var5) {
                        statePc = 81;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var6 = -((13 - var5) * 27) + param2;
                    var7 = param1 + var5 * 20;
                    var8 = 7 * var5 + -42;
                    if (var13 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var9 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (13 + -var5 <= var9) {
                        statePc = 79;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var10 = var14.field_k.a(var8 - -35, (byte) 86) ? 1 : 0;
                    var11 = 5;
                    stackIn_42_0 = var10;
                    stackIn_47_0 = stackIn_42_0;
                    if (var13 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var12 = 0;
                    if (var12 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_51_0 = 3;
                    statePc = 51;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = 1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var11 = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    this.a(var6, 57, var8, 4 + var7, rl.field_d[var11]);
                    var10 = var14.field_k.a(var8 - var8 / 7, (byte) 110) ? 1 : 0;
                    var11 = 4;
                    if (var10 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var12 = 0;
                    if (var12 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = 2;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var11 = stackIn_57_0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    this.a(27 + var6, 124, var8, var7 + 4, rl.field_d[var11]);
                    this.a(var7, var6, (byte) 127, var8);
                    if (0 == var9) {
                        statePc = 63;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (-var5 + 12 != var9) {
                        statePc = 78;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (42 == var8) {
                        statePc = 78;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var8 == 48) {
                        statePc = 78;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    rl.field_d[5].h(27 + var6, 24 + var7);
                    statePc = 78;
                    continue stateLoop;
                }
                case 63: {
                    if (var8 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (-var5 + 12 != var9) {
                        statePc = 78;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (42 == var8) {
                        statePc = 78;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var8 == 48) {
                        statePc = 78;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    rl.field_d[5].h(27 + var6, 24 + var7);
                    statePc = 78;
                    continue stateLoop;
                }
                case 68: {
                    if (42 != var8) {
                        statePc = 73;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (-var5 + 12 != var9) {
                        statePc = 78;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (42 == var8) {
                        statePc = 78;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var8 == 48) {
                        statePc = 78;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    rl.field_d[5].h(27 + var6, 24 + var7);
                    statePc = 78;
                    continue stateLoop;
                }
                case 73: {
                    rl.field_d[4].h(var6, 20 + (4 + var7));
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (-var5 + 12 != var9) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (42 == var8) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var8 == 48) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    rl.field_d[5].h(27 + var6, 24 + var7);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var8 += 8;
                    var6 += 54;
                    var9++;
                    if (var13 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var5++;
                    if (var13 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        fk.a((byte) 121, lf.field_w);
        p.a(this.field_e, 188, 48, 605, 400, 394, 220);
        jh.a(this.field_e);
        p.b(8, 46, 180, 427, 16777215, 32, 128);
        h.a(false, 388, 15, true, 80);
        h.a(false, 426, 617, true, 46);
        p.a(8, 47, 172, 425, 256, 32, 8, 128);
        p.a(8, 8, 172, 32, 256, 64, 4, 128);
        p.a(460, 8, 172, 32, 256, 64, 4, 128);
        p.a(188, 8, 264, 32, 256, 64, 4, 128);
        this.field_E.b(12, 32, 320 + -(this.field_E.field_i >> 1053984897));
        ke.a(-116, 0, 480, 0);
        ke.a(48, 180, 480, 0);
        ke.a(-93, 605, 480, 48);
        jc.a(32, 452, 8, 1, 2, 1);
        ke.a(-112, -be.field_o.field_d + 640, 480, 0);
        c.a(0, 640, 0, (byte) 53);
        c.a(0, 640, 40, (byte) 91);
        c.a(0, 640, -bk.field_e.field_b + 480, (byte) 102);
        p.a(14, 55, 161, 36);
        p.b(188, 55, 418, 83, 8421504, 128, 128);
        p.a(188, 55, 418, 83, 256, 64, 4, 32);
        p.a(188, 55, 418, 11184810, 255, 128);
        p.a(188, 137, 418, 11184810, 255, 128);
        p.b(186, 400, 418, 87, 8421504, 32, 64);
        p.a(186, 399, 418, 0, 255, 128);
        p.a(186, 400, 418, 11184810, 255, 128);
        p.a(186, 402, 420, 70, 256, 64, 4, 32);
        p.a(484, 327, 144, 30);
        p.a(484, 364, 144, 30);
        p.a(484, 401, 144, 30);
        p.a(484, 438, 144, 30);
        jh.b();
        this.b(2798);
        jj.field_c = 0;
        qj.field_c = new ai[49];
        t.field_a = -1;
        bl.a((byte) 124);
        this.e(18239);
        this.a(14);
        this.field_H = null;
        this.field_N = new rh(204, 394, 80, 160, 16711680, 768, 249);
        this.field_I = new rh(600, 111, 80, 160, 16711680, 768, 249);
        qh.a(-13716, this.field_v[15], 18);
    }

    p() {
        this.field_E = new tf(ne.field_c, f.field_c, cm.field_M);
    }

    static {
        field_K = "Please wait...";
        field_x = new int[8192];
        field_J = new String[]{null, "Each <%raider> has four skills - <%attack>, <%defence>, <%dodge> and <%sneak> - displayed as bars above your party selection. Some raiders also possess a special ability."};
        field_r = "Raids: ";
    }
}
