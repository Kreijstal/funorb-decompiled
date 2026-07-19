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
        RuntimeException var2 = null;
        cn[] var2_array = null;
        int var3 = 0;
        cn var4 = null;
        int var6 = 0;
        cn var7 = null;
        cn var8 = null;
        cn var9 = null;
        cn var10 = null;
        cn[] stackIn_10_0 = null;
        cn[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cn[] stackOut_11_0 = null;
        cn[] stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var2_array = new cn[param0.length];
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
                          var2_array[var3] = var4;
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
                stackOut_11_0 = (cn[]) (var2_array);
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_9_0 = (cn[]) null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("p.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        cn var8 = null;
        cn var9 = null;
        String var10 = null;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
                stackOut_4_0 = (String) (param3);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (String) (param1);
                stackIn_5_0 = stackOut_3_0;
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
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("p.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            stackOut_0_0 = new gd(var9, var10, var12, var11, var13, param2, (-var8 + 30 >> -1250999007) + param4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("p.R(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ac var4 = null;
        cp var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        if (param0 != 26) {
          return;
        } else {
          this.field_v = new cp[gh.field_i.length];
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            L1: {
              if (var3 >= gh.field_i.length) {
                break L1;
              } else {
                var4 = gh.field_i[var3];
                if (var6 != 0) {
                  break L1;
                } else {
                  L2: {
                    if (var4 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (0 != (var4.field_j ^ -1)) {
                          break L3;
                        } else {
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (0 == var4.field_g) {
                        break L2;
                      } else {
                        if (var4.field_z == null) {
                          break L2;
                        } else {
                          if (var4.field_i > gm.field_d.field_m) {
                            break L2;
                          } else {
                            var5 = new cp(10, var2, var4);
                            var2 = var2 + (var5.field_x + 10);
                            this.field_v[var3] = var5;
                            this.field_R.a((gd) (var5), (byte) -20);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var3++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        lb var5 = null;
        int var6 = 0;
        int var7 = 0;
        cn var7_ref_cn = null;
        int var8 = 0;
        int var9 = 0;
        lb var10 = null;
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
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        L0: {
          var15 = DungeonAssault.field_K;
          super.a(param0);
          this.field_e.b(0, 0);
          var2 = null;
          if (-1 != this.field_F) {
            var2 = qj.field_c[this.field_F];
            if (var2 == null) {
              var2 = gm.field_d.field_L[this.field_F];
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          var3 = null;
          if (var2 == null) {
            if (this.field_R.field_l != null) {
              var3 = ((cp) ((Object) this.field_R.field_l)).field_S;
              break L1;
            } else {
              break L1;
            }
          } else {
            var3 = ((ai) (var2)).field_h;
            break L1;
          }
        }
        L2: {
          L3: {
            p.a(200, 65, (ac) (var3));
            if (var2 == null) {
              break L3;
            } else {
              p.a(488, 54, (ai) (var2));
              if (var15 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          p.a(488, 54, this.field_H, kc.field_V);
          break L2;
        }
        this.a(false, 484, 327);
        var4 = (rj) ((Object) this.field_p.e(-24172));
        L4: while (true) {
          L5: {
            L6: {
              if (var4 == null) {
                break L6;
              } else {
                var4.a(68);
                var4 = (rj) ((Object) this.field_p.a(4));
                if (var15 != 0) {
                  break L5;
                } else {
                  if (var15 == 0) {
                    continue L4;
                  } else {
                    break L6;
                  }
                }
              }
            }
            ad.field_e.h(187, 48);
            ad.field_e.i(187, -ad.field_e.field_b + 40);
            ad.field_e.f(604 - ad.field_e.field_d, 40 + -ad.field_e.field_b);
            oe.field_m.h(171, 382);
            oe.field_m.j(580, 99);
            break L5;
          }
          L7: {
            L8: {
              if (!gl.field_Lb) {
                break L8;
              } else {
                this.field_u.b((byte) -55);
                if (var15 == 0) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            this.a(8, 80, 394);
            break L7;
          }
          L9: {
            if (null != this.field_b) {
              this.field_b.a((byte) -91);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            L11: {
              p.e();
              this.field_q.a((byte) -61);
              if (gl.field_Lb) {
                break L11;
              } else {
                L12: {
                  var5 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 128.0);
                  wm.field_c.b(205, 83, 256);
                  wm.field_c.b(205, 83, var5);
                  if (this.field_w.field_B) {
                    ec.a(95, 205, (byte) -95, im.field_e, 16744448, 192);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (var15 == 0) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            var5 = (int)(128.0 * (1.0 + Math.cos((double)((float)mo.field_a / 20.0f))));
            wm.field_c.b(-(im.field_e.field_y >> -803529567) + 356, -(im.field_e.field_v >> 1526787905) + 267, 256);
            wm.field_c.b(356 + -(im.field_e.field_y >> 462478177), 267 - (im.field_e.field_v >> -123892703), var5);
            if (this.field_w.field_B) {
              ec.a(-(im.field_e.field_v >> 741506017) + 265, -(im.field_e.field_y >> 427309537) + 354, (byte) -86, im.field_e, 16744448, 96);
              break L10;
            } else {
              break L10;
            }
          }
          var4 = (rj) ((Object) this.field_p.e(-24172));
          L13: while (true) {
            L14: {
              L15: {
                if (var4 == null) {
                  break L15;
                } else {
                  var4.d(0);
                  var4 = (rj) ((Object) this.field_p.a(4));
                  if (var15 != 0) {
                    break L14;
                  } else {
                    if (var15 == 0) {
                      continue L13;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              L16: {
                if (this.field_F == -1) {
                  break L16;
                } else {
                  if (null != this.field_R.field_l) {
                    L17: {
                      L18: {
                        var5 = 0;
                        if (qj.field_c[this.field_F] != null) {
                          break L18;
                        } else {
                          if (null == gm.field_d.field_L[this.field_F]) {
                            break L17;
                          } else {
                            var5 = gm.field_d.field_L[this.field_F].field_h.field_c >> 37723553;
                            if (var15 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      var5 = qj.field_c[this.field_F].field_h.field_c;
                      break L17;
                    }
                    if (var5 == 0) {
                      break L16;
                    } else {
                      L19: {
                        var6 = this.field_F / 7;
                        var7 = this.field_F % 7;
                        var8 = 421 - (189 + -((var7 + var6) * 27));
                        var9 = 80 - -(20 * (-var7 + (var6 + 7)));
                        if (gl.field_Lb) {
                          var16 = this.field_u.b(this.field_F, -15390);
                          var8 = -1 + var16.field_f;
                          var9 = 7 + var16.field_b;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        L21: {
                          if (t.field_a == var5) {
                            break L21;
                          } else {
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
                            L22: while (true) {
                              if (var14 >= var19.length) {
                                t.field_a = var5;
                                break L21;
                              } else {
                                var13[var14] = nb.a(var19[var14], 255);
                                stackOut_54_0 = -1;
                                stackOut_54_1 = var19[var14] ^ -1;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_56_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (var15 == 0) {
                                  L23: {
                                    if (stackIn_56_0 != stackIn_56_1) {
                                      break L23;
                                    } else {
                                      var19[var14] = 1;
                                      break L23;
                                    }
                                  }
                                  var14++;
                                  continue L22;
                                } else {
                                  var10 = stackIn_55_0 - stackIn_55_1;
                                  break L20;
                                }
                              }
                            }
                          }
                        }
                        var10 = var8 - (jn.field_a.field_y >> 1661823649);
                        break L20;
                      }
                      var11 = -jn.field_a.field_v + var9;
                      bp.a(var11, dm.field_f, var10, (byte) 99);
                      jn.field_a.h(var10, var11);
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
              }
              this.field_N.d();
              this.field_I.d();
              break L14;
            }
            L24: {
              if (null == this.field_b) {
                break L24;
              } else {
                var5 = 0;
                L25: while (true) {
                  if (var5 >= gf.field_b.length) {
                    this.field_b.b(112);
                    break L24;
                  } else {
                    gf.field_b[var5] = nb.a(gf.field_b[var5] >>> 2070201730, 1061109567);
                    var5++;
                    if (var15 != 0) {
                      break L24;
                    } else {
                      continue L25;
                    }
                  }
                }
              }
            }
            L26: {
              if (!kn.field_g) {
                break L26;
              } else {
                ab.a(0);
                break L26;
              }
            }
            oh.a((byte) 54);
            return;
          }
        }
    }

    final static void a(nh param0, int param1, nh param2, nh param3) {
        q discarded$1 = null;
        RuntimeException var4 = null;
        q[] var5 = null;
        q[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        q[] var10 = null;
        cn var11 = null;
        int var11_int = 0;
        cn var12 = null;
        int var13 = 0;
        q[] var14 = null;
        cn var15 = null;
        int[][] var16 = null;
        cn var17 = null;
        cn var18 = null;
        int[][] var19 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            gn.field_i = kn.a(param3, "commonui", "frame_top", -62);
            di.field_l = kn.a(param3, "commonui", "frame_bottom", -91);
            bl.field_e = oh.a(param3, "commonui", 11091, "jagex_logo_grey");
            na.field_C = kn.a(param3, "commonui", "button", -94);
            sl.field_c = da.a("commonui", "validation", 0, param3);
            ta.field_e = (se) ((Object) kk.a(param2, param3, "arezzo12", 0, "commonui"));
            lp.field_C = (se) ((Object) kk.a(param2, param3, "arezzo14", 0, "commonui"));
            hc.field_f = (se) ((Object) kk.a(param2, param3, "arezzo14bold", 0, "commonui"));
            var17 = new cn(param0.a("button.gif", "", (byte) -116), (java.awt.Component) ((Object) c.field_h));
            discarded$1 = pa.a((byte) -94, param3, "commonui", "dropdown");
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
            L1: while (true) {
              L2: {
                L3: {
                  if (var19.length <= var8) {
                    break L3;
                  } else {
                    var7[var8] = (int[]) ((Object) var19[0].clone());
                    var8++;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var8 = var5[0].field_j[0];
                var19[2][var8] = 16777215;
                var19[1][var8] = 2394342;
                var19[3][var8] = 4767999;
                break L2;
              }
              var9 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if ((var9 ^ -1) <= -4) {
                      break L6;
                    } else {
                      var14 = var6[var9];
                      var10 = var14;
                      stackOut_9_0 = 0;
                      stackIn_18_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var13 != 0) {
                        break L5;
                      } else {
                        var11_int = stackIn_10_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var11_int >= var14.length) {
                                break L9;
                              } else {
                                var14[var11_int] = pi.a(1, var5[var9], var19[var11_int]);
                                var11_int++;
                                if (var13 != 0) {
                                  break L8;
                                } else {
                                  if (var13 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var9++;
                            break L8;
                          }
                          if (var13 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  var9 = var17.field_v;
                  ie.a(95);
                  var17.e();
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L5;
                }
                gf.d(stackIn_18_0, 0, gf.field_i, gf.field_c);
                var15 = new cn(var9, var9);
                var18 = var15;
                var18.e();
                var17.c(0, 0);
                var11 = new cn(var9, var9);
                var11.e();
                if (param1 >= 2) {
                  var17.c(-var17.field_y + var9, 0);
                  var12 = new cn(var17.field_y + -(var9 * 2), var9);
                  var12.e();
                  var17.c(-var9, 0);
                  ti.c(true);
                  na.field_C = new cn[]{var15, var12, var11};
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("p.Q(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          L12: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static vk a(int param0, String param1, int param2) {
        vk var3 = null;
        RuntimeException var3_ref = null;
        vk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = (vk) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("p.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var4 = param2 + (8 - -la.field_b.field_H);
          db.field_v.b(pb.field_I, 7 + param1, var4, 16777215, -1);
          db.field_v.a(Integer.toString(gm.field_d.field_s / 10), 133 + param1, var4, 16777215, -1);
          if (-1 > (jj.field_c ^ -1)) {
            stackOut_2_0 = jj.field_c / 10;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
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
              stackOut_6_0 = 16777215;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 16711680;
              stackIn_7_0 = stackOut_5_0;
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
        o discarded$2 = null;
        int discarded$3 = 0;
        ai var2_ref_ai = null;
        int var2 = 0;
        ac var3 = null;
        int var4 = 0;
        ac var5 = null;
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
                                                        discarded$2 = gd.a(64, var3.field_a);
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
              discarded$3 = this.b(-120, -24, -127);
              break L26;
            }
          }
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        cp[] var5 = null;
        int var6 = 0;
        cp var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackOut_61_0 = null;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          var8 = DungeonAssault.field_K;
                          var11 = new int[gh.field_i.length];
                          var10 = var11;
                          var9 = var10;
                          var3 = var9;
                          var4 = param1;
                          if (0 != var4) {
                            break L8;
                          } else {
                            if (var8 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var4 != 1) {
                            break L9;
                          } else {
                            if (var8 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if ((var4 ^ -1) == -3) {
                          break L5;
                        } else {
                          L10: {
                            if (3 != var4) {
                              break L10;
                            } else {
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (4 != var4) {
                            break L2;
                          } else {
                            if (var8 == 0) {
                              var9 = var3;
                              var11 = var10;
                              var4 = 0;
                              L11: while (true) {
                                if (var11.length <= var4) {
                                  break L2;
                                } else {
                                  if (var8 != 0) {
                                    break L1;
                                  } else {
                                    L12: {
                                      if (gh.field_i[var4] != null) {
                                        var9[var4] = gh.field_i[var4].field_r;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    var4++;
                                    if (var8 == 0) {
                                      continue L11;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var9 = var3;
                      var11 = var10;
                      var4 = 0;
                      L13: while (true) {
                        L14: {
                          if (var4 >= var11.length) {
                            break L14;
                          } else {
                            if (var8 != 0) {
                              break L2;
                            } else {
                              L15: {
                                if (null == gh.field_i[var4]) {
                                  break L15;
                                } else {
                                  var9[var4] = gh.field_i[var4].field_c;
                                  break L15;
                                }
                              }
                              var4++;
                              if (var8 == 0) {
                                continue L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var9 = var3;
                    var11 = var10;
                    var4 = 0;
                    L16: while (true) {
                      if (var11.length <= var4) {
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      } else {
                        if (var8 != 0) {
                          break L2;
                        } else {
                          L17: {
                            if (gh.field_i[var4] == null) {
                              break L17;
                            } else {
                              var9[var4] = gh.field_i[var4].field_A;
                              break L17;
                            }
                          }
                          var4++;
                          continue L16;
                        }
                      }
                    }
                  }
                  var9 = var3;
                  var11 = var10;
                  var4 = 0;
                  L18: while (true) {
                    if (var11.length <= var4) {
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L19: {
                          if (null != gh.field_i[var4]) {
                            var9[var4] = gh.field_i[var4].field_k;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        var4++;
                        continue L18;
                      }
                    }
                  }
                }
                var9 = var3;
                var11 = var10;
                var4 = 0;
                L20: while (true) {
                  if (var4 >= var11.length) {
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L21: {
                        if (gh.field_i[var4] != null) {
                          var9[var4] = gh.field_i[var4].field_y;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var4++;
                      continue L20;
                    }
                  }
                }
              }
              var4 = 0;
              L22: while (true) {
                if (var11.length <= var4) {
                  break L2;
                } else {
                  if (var8 != 0) {
                    break L1;
                  } else {
                    L23: {
                      if (gh.field_i[var4] != null) {
                        var9[var4] = gh.field_i[var4].field_r;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    var4++;
                    if (var8 == 0) {
                      continue L22;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            if (this.field_z == param1) {
              break L1;
            } else {
              this.field_s = false;
              if (var8 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L24: {
            stackOut_61_0 = this;
            stackIn_63_0 = stackOut_61_0;
            stackIn_62_0 = stackOut_61_0;
            if (this.field_s) {
              stackOut_63_0 = this;
              stackOut_63_1 = 0;
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              break L24;
            } else {
              stackOut_62_0 = this;
              stackOut_62_1 = 1;
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              break L24;
            }
          }
          ((p) (this)).field_s = stackIn_64_1 != 0;
          break L0;
        }
        L25: {
          L26: {
            this.field_z = param1;
            if (!this.field_s) {
              var4 = 0;
              L27: while (true) {
                if (var4 >= var11.length) {
                  break L26;
                } else {
                  var9[var4] = -var11[var4];
                  var4++;
                  if (var8 != 0) {
                    break L25;
                  } else {
                    continue L27;
                  }
                }
              }
            } else {
              break L26;
            }
          }
          if (this.field_v == null) {
            break L25;
          } else {
            this.field_D = (cp[]) ((Object) this.field_v.clone());
            ik.a(this.field_D, -111, var11);
            break L25;
          }
        }
        L28: {
          if (param0 < -42) {
            break L28;
          } else {
            this.field_R = (nn) null;
            break L28;
          }
        }
        hf.field_nb.field_J = null;
        hf.field_nb.e(true);
        var4 = 0;
        var5 = this.field_D;
        var6 = 0;
        L29: while (true) {
          L30: {
            if (var6 >= var5.length) {
              break L30;
            } else {
              var7 = var5[var6];
              if (var8 != 0) {
                break L30;
              } else {
                L31: {
                  if (var7 == null) {
                    break L31;
                  } else {
                    ((gd) ((Object) var7)).b(10, var4, (byte) 4);
                    var4 = var4 + (8 + ((gd) ((Object) var7)).field_x);
                    hf.field_nb.a(var7, (byte) -48);
                    break L31;
                  }
                }
                var6++;
                continue L29;
              }
            }
          }
          return;
        }
    }

    final void c(boolean param0) {
        ai[] var2 = null;
        int var3 = 0;
        ai var4 = null;
        int var5 = 0;
        ai[] var6 = null;
        lf var7 = null;
        ai var8 = null;
        ai var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_17_0 = false;
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
                    stackOut_4_0 = mm.field_t;
                    stackIn_18_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        if (stackIn_5_0 != 13) {
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
                stackOut_17_0 = kn.field_g;
                stackIn_18_0 = stackOut_17_0 ? 1 : 0;
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
        int var4 = 0;
        int var5 = 0;
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
        var3 = DungeonAssault.field_K;
        var2 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= 49) {
              jj.field_c = 0;
              break L1;
            } else {
              qj.field_c[var2] = null;
              var2++;
              if (var3 != 0) {
                break L1;
              } else {
                continue L0;
              }
            }
          }
          L2: {
            if (param0 == -76) {
              break L2;
            } else {
              this.b(-63);
              break L2;
            }
          }
          this.c((byte) 34);
          return;
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
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
        gd stackIn_1_0 = null;
        gd stackIn_2_0 = null;
        gd stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        gd stackOut_0_0 = null;
        gd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        gd stackOut_1_0 = null;
        int stackOut_1_1 = 0;
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
          stackOut_0_0 = this.field_t;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (gl.field_Lb) {
            stackOut_2_0 = (gd) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (gd) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
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
        int var2 = 0;
        int var3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_55_0 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          if (param0 >= 56) {
            break L0;
          } else {
            this.a(-105, -4, 26);
            break L0;
          }
        }
        L1: {
          if (gm.field_d.field_s >= jj.field_c) {
            L2: {
              L3: {
                L4: {
                  L5: {
                    if (!ed.c(true)) {
                      ac.field_B.d((byte) -127, 57);
                      var2 = 0;
                      L6: while (true) {
                        if (var2 >= 49) {
                          break L5;
                        } else {
                          stackOut_8_0 = 0;
                          stackOut_8_1 = var2;
                          stackIn_24_0 = stackOut_8_0;
                          stackIn_24_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var3 == 0) {
                            L7: {
                              if (stackIn_24_0 == stackIn_24_1) {
                                break L7;
                              } else {
                                if (6 == var2) {
                                  break L7;
                                } else {
                                  if (-25 == (var2 ^ -1)) {
                                    break L7;
                                  } else {
                                    if (var2 == 42) {
                                      break L7;
                                    } else {
                                      L8: {
                                        if (-49 != (var2 ^ -1)) {
                                          break L8;
                                        } else {
                                          if (var3 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      if (null != qj.field_c[var2]) {
                                        ac.field_B.a(6, qj.field_c[var2].field_a);
                                        if (var3 == 0) {
                                          break L7;
                                        } else {
                                          ac.field_B.a(6, 0);
                                          break L7;
                                        }
                                      } else {
                                        ac.field_B.a(6, 0);
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var2++;
                            continue L6;
                          } else {
                            if (stackIn_9_0 <= stackIn_9_1) {
                              break L3;
                            } else {
                              stackOut_10_0 = -1;
                              stackIn_56_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var3 != 0) {
                                break L2;
                              } else {
                                L9: {
                                  if (stackIn_11_0 == (var2 ^ -1)) {
                                    break L9;
                                  } else {
                                    if ((var2 ^ -1) == -7) {
                                      break L9;
                                    } else {
                                      if (24 == var2) {
                                        break L9;
                                      } else {
                                        if (var2 == 42) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (var2 != 48) {
                                              break L10;
                                            } else {
                                              if (var3 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          if (null != qj.field_c[var2]) {
                                            gm.field_d.field_L[var2] = new ai(qj.field_c[var2].field_a);
                                            gm.field_d.field_L[var2].field_c = qj.field_c[var2].field_c;
                                            qj.field_c[var2] = null;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var2++;
                                if (var3 == 0) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  L11: {
                    if (jj.field_c > 0) {
                      gm.field_d.field_s = gm.field_d.field_s - jj.field_c;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var2 = 0;
                  break L4;
                }
                L12: while (true) {
                  if (49 <= var2) {
                    break L3;
                  } else {
                    stackOut_43_0 = -1;
                    stackIn_56_0 = stackOut_43_0;
                    stackIn_44_0 = stackOut_43_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L13: {
                        if (stackIn_44_0 == (var2 ^ -1)) {
                          break L13;
                        } else {
                          if ((var2 ^ -1) == -7) {
                            break L13;
                          } else {
                            if (24 == var2) {
                              break L13;
                            } else {
                              if (var2 == 42) {
                                break L13;
                              } else {
                                L14: {
                                  if (var2 != 48) {
                                    break L14;
                                  } else {
                                    if (var3 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                if (null != qj.field_c[var2]) {
                                  gm.field_d.field_L[var2] = new ai(qj.field_c[var2].field_a);
                                  gm.field_d.field_L[var2].field_c = qj.field_c[var2].field_c;
                                  qj.field_c[var2] = null;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L12;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackOut_55_0 = 0;
              stackIn_56_0 = stackOut_55_0;
              break L2;
            }
            jj.field_c = stackIn_56_0;
            this.c((byte) -91);
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, cn param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var20 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var6_int = 256;
              if (0 == gm.field_d.field_L[param2].field_a) {
                var6_int = 128;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = 10066329;
              var8 = var6_int * (192 - -((var7 & 16711680) >> -151077806)) / 255;
              var9 = (((var7 & 65280) >> -100822870) + 192) * var6_int / 255;
              var10 = (((var7 & 255) >> 1038778018) + 192) * var6_int / 255;
              var11 = 0;
              var12 = (param4.field_A + param3) * gf.field_i + (param0 - -param4.field_w);
              var13 = -param4.field_y + gf.field_i;
              var15 = -param4.field_v;
              if (param1 > 54) {
                break L2;
              } else {
                this.a((gd) null, (String) null, (byte) -123, (String) null, (String) null);
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if (var15 >= 0) {
                  break L4;
                } else {
                  if (var20 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var14 = -param4.field_y;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (-1 >= (var14 ^ -1)) {
                            break L7;
                          } else {
                            var16 = param4.field_B[var11];
                            stackOut_10_0 = 0;
                            stackOut_10_1 = var16;
                            stackIn_15_0 = stackOut_10_0;
                            stackIn_15_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (var20 != 0) {
                              break L6;
                            } else {
                              L8: {
                                if (stackIn_11_0 == stackIn_11_1) {
                                  break L8;
                                } else {
                                  var17 = var16 & 16711680;
                                  var18 = var16 & 65280;
                                  var19 = var16 & 255;
                                  var18 = var18 * var9;
                                  var17 = var17 * var8;
                                  var19 = var19 * var10;
                                  var16 = var17 & -16777216 | var18 & 16711680 | var19 & 65280;
                                  gf.field_b[var12] = var16 >>> -859178296;
                                  break L8;
                                }
                              }
                              var12++;
                              var11++;
                              var14++;
                              if (var20 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_14_0 = var12;
                        stackOut_14_1 = var13;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        break L6;
                      }
                      var12 = stackIn_15_0 + stackIn_15_1;
                      var15++;
                      if (var20 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var6);
            stackOut_17_1 = new StringBuilder().append("p.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L9;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
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
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        L0: {
          var13 = DungeonAssault.field_K;
          bd.field_g.h(-(bd.field_g.field_y >> 1050842529) + param2 - -2, param1 + 12);
          var14 = gm.field_d;
          if (param0 == 8) {
            break L0;
          } else {
            field_x = (int[]) null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 > 140) {
              var5 = 0;
              break L2;
            } else {
              gf.b(-(var5 * 4 / 3) + param2, var5 + 18 + param1, var5 * 8 / 3, 0);
              gf.b(param2 + -(var5 * 4 / 3), -var5 + 280 + param1 - -18, var5 * 8 / 3, 0);
              var5++;
              if (var13 != 0) {
                break L2;
              } else {
                continue L1;
              }
            }
          }
          L3: while (true) {
            stackOut_8_0 = var5;
            stackOut_8_1 = 7;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            L4: while (true) {
              L5: {
                if (stackIn_9_0 >= stackIn_9_1) {
                  stackOut_39_0 = 7;
                  stackIn_40_0 = stackOut_39_0;
                  break L5;
                } else {
                  var6 = param2 - (1 + var5) * 27;
                  var7 = 20 * var5 + param1;
                  var8 = 6 + -var5;
                  stackOut_10_0 = 0;
                  stackIn_40_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var13 != 0) {
                    break L5;
                  } else {
                    var9 = stackIn_11_0;
                    L6: while (true) {
                      L7: {
                        if (var9 >= 1 + var5) {
                          break L7;
                        } else {
                          stackOut_13_0 = -1;
                          stackOut_13_1 = var9 ^ -1;
                          stackIn_9_0 = stackOut_13_0;
                          stackIn_9_1 = stackOut_13_1;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          if (var13 != 0) {
                            continue L4;
                          } else {
                            L8: {
                              L9: {
                                if (stackIn_14_0 != stackIn_14_1) {
                                  break L9;
                                } else {
                                  if (0 == var8) {
                                    break L8;
                                  } else {
                                    if (var8 == 6) {
                                      break L8;
                                    } else {
                                      this.a(var6, 92, var8, var7 - -4, rl.field_d[5]);
                                      if (var13 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                              L10: {
                                var10 = var14.field_k.a(35 + var8, (byte) 109) ? 1 : 0;
                                var11 = 5;
                                if (var10 == 0) {
                                  break L10;
                                } else {
                                  L11: {
                                    var12 = 0;
                                    if (var12 != 0) {
                                      stackOut_22_0 = 1;
                                      stackIn_23_0 = stackOut_22_0;
                                      break L11;
                                    } else {
                                      stackOut_21_0 = 3;
                                      stackIn_23_0 = stackOut_21_0;
                                      break L11;
                                    }
                                  }
                                  var11 = stackIn_23_0;
                                  break L10;
                                }
                              }
                              this.a(var6, 97, var8, 4 + var7, rl.field_d[var11]);
                              break L8;
                            }
                            L12: {
                              L13: {
                                if (var5 != var9) {
                                  break L13;
                                } else {
                                  if (var8 == 6) {
                                    break L12;
                                  } else {
                                    if (var8 != 48) {
                                      this.a(27 + var6, 119, var8, var7 + 4, rl.field_d[4]);
                                      if (var13 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              L14: {
                                var10 = var14.field_k.a(var8 + -(var8 / 7), (byte) 125) ? 1 : 0;
                                var11 = 4;
                                if (var10 != 0) {
                                  L15: {
                                    var12 = 0;
                                    if (var12 != 0) {
                                      stackOut_34_0 = 0;
                                      stackIn_35_0 = stackOut_34_0;
                                      break L15;
                                    } else {
                                      stackOut_33_0 = 2;
                                      stackIn_35_0 = stackOut_33_0;
                                      break L15;
                                    }
                                  }
                                  var11 = stackIn_35_0;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              this.a(27 + var6, 110, var8, 4 + var7, rl.field_d[var11]);
                              break L12;
                            }
                            this.a(var7, var6, (byte) 127, var8);
                            var6 += 54;
                            var9++;
                            var8 += 8;
                            if (var13 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var5++;
                      continue L3;
                    }
                  }
                }
              }
              var5 = stackIn_40_0;
              L16: while (true) {
                stackOut_41_0 = 13;
                stackIn_42_0 = stackOut_41_0;
                L17: while (true) {
                  L18: {
                    if (stackIn_42_0 <= var5) {
                      break L18;
                    } else {
                      var6 = -((13 - var5) * 27) + param2;
                      var7 = param1 + var5 * 20;
                      var8 = 7 * var5 + -42;
                      if (var13 != 0) {
                        break L18;
                      } else {
                        var9 = 0;
                        L19: while (true) {
                          L20: {
                            if (13 + -var5 <= var9) {
                              break L20;
                            } else {
                              var10 = var14.field_k.a(var8 - -35, (byte) 86) ? 1 : 0;
                              var11 = 5;
                              stackOut_46_0 = var10;
                              stackIn_42_0 = stackOut_46_0;
                              stackIn_47_0 = stackOut_46_0;
                              if (var13 != 0) {
                                continue L17;
                              } else {
                                L21: {
                                  if (stackIn_47_0 == 0) {
                                    break L21;
                                  } else {
                                    L22: {
                                      var12 = 0;
                                      if (var12 != 0) {
                                        stackOut_50_0 = 1;
                                        stackIn_51_0 = stackOut_50_0;
                                        break L22;
                                      } else {
                                        stackOut_49_0 = 3;
                                        stackIn_51_0 = stackOut_49_0;
                                        break L22;
                                      }
                                    }
                                    var11 = stackIn_51_0;
                                    break L21;
                                  }
                                }
                                L23: {
                                  this.a(var6, 57, var8, 4 + var7, rl.field_d[var11]);
                                  var10 = var14.field_k.a(var8 - var8 / 7, (byte) 110) ? 1 : 0;
                                  var11 = 4;
                                  if (var10 != 0) {
                                    L24: {
                                      var12 = 0;
                                      if (var12 == 0) {
                                        stackOut_56_0 = 2;
                                        stackIn_57_0 = stackOut_56_0;
                                        break L24;
                                      } else {
                                        stackOut_55_0 = 0;
                                        stackIn_57_0 = stackOut_55_0;
                                        break L24;
                                      }
                                    }
                                    var11 = stackIn_57_0;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                L25: {
                                  this.a(27 + var6, 124, var8, var7 + 4, rl.field_d[var11]);
                                  this.a(var7, var6, (byte) 127, var8);
                                  if (0 == var9) {
                                    if (var8 != 0) {
                                      if (42 != var8) {
                                        rl.field_d[4].h(var6, 20 + (4 + var7));
                                        if (-var5 + 12 != var9) {
                                          break L25;
                                        } else {
                                          if (42 == var8) {
                                            break L25;
                                          } else {
                                            if (var8 == 48) {
                                              break L25;
                                            } else {
                                              rl.field_d[5].h(27 + var6, 24 + var7);
                                              break L25;
                                            }
                                          }
                                        }
                                      } else {
                                        if (-var5 + 12 != var9) {
                                          break L25;
                                        } else {
                                          if (42 == var8) {
                                            break L25;
                                          } else {
                                            if (var8 == 48) {
                                              break L25;
                                            } else {
                                              rl.field_d[5].h(27 + var6, 24 + var7);
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (-var5 + 12 != var9) {
                                        break L25;
                                      } else {
                                        if (42 == var8) {
                                          break L25;
                                        } else {
                                          if (var8 == 48) {
                                            break L25;
                                          } else {
                                            rl.field_d[5].h(27 + var6, 24 + var7);
                                            break L25;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (-var5 + 12 != var9) {
                                      break L25;
                                    } else {
                                      if (42 == var8) {
                                        break L25;
                                      } else {
                                        if (var8 == 48) {
                                          break L25;
                                        } else {
                                          rl.field_d[5].h(27 + var6, 24 + var7);
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                }
                                var8 += 8;
                                var6 += 54;
                                var9++;
                                if (var13 == 0) {
                                  continue L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          var5++;
                          if (var13 == 0) {
                            continue L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
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
