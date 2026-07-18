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
        cn var5 = null;
        int var6 = 0;
        Object stackIn_12_0 = null;
        cn[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn[] stackOut_13_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
                    var4 = param0[var3];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var4 == null) {
                          break L4;
                        } else {
                          var5 = new cn(27 * var4.field_E / 16, var4.field_G * 20 / 12);
                          var5.e();
                          var4.c(-(var4.field_w * 27) / 16, -(var4.field_A * 27) / 16, var5.field_E, var5.field_G);
                          var4 = var5;
                          var5 = new cn(var4.field_E / 2, var4.field_G / 2);
                          var5.e();
                          var4.e(var5.field_E / 2, var5.field_G / 2, 0, 2048);
                          var5.field_A = var4.field_A * 27 >> 437418469;
                          var4 = var5;
                          var5.c();
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
                stackOut_13_0 = (cn[]) var2_array;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (cn[]) (Object) stackIn_12_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("p.K(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
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
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                stackOut_6_0 = (String) param3;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = (String) param1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            var10 = stackIn_7_0;
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
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("p.N(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("p.R(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        ac var4 = null;
        cp var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 == 26) {
              ((p) this).field_v = new cp[gh.field_i.length];
              var2_int = 0;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3 <= ~gh.field_i.length) {
                      break L3;
                    } else {
                      var4 = gh.field_i[var3];
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var4 == null) {
                            break L4;
                          } else {
                            L5: {
                              if (var4.field_j != -1) {
                                break L5;
                              } else {
                                if (var6 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (0 == var4.field_g) {
                              break L4;
                            } else {
                              if (var4.field_z == null) {
                                break L4;
                              } else {
                                if (var4.field_i > gm.field_d.field_m) {
                                  break L4;
                                } else {
                                  var5 = new cp(10, var2_int, var4);
                                  var2_int = var2_int + (var5.field_x + 10);
                                  ((p) this).field_v[var3] = var5;
                                  ((p) this).field_R.a((gd) (Object) var5, (byte) -20);
                                  break L4;
                                }
                              }
                            }
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
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "p.C(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        lb var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        cn var7_ref_cn = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 >= 126) {
              L1: {
                var5_ref = gm.field_d;
                var6 = var5_ref.field_L[param3].field_a;
                if (qj.field_c[param3] != null) {
                  var6 = qj.field_c[param3].field_a;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (var6 == 0) {
                    break L3;
                  } else {
                    this.a(param1, 124, param3, -dm.field_a[var6].field_v + 56 + param0, dm.field_a[var6]);
                    if (gh.field_i[var6].field_g == 2) {
                      L4: {
                        var7_ref_cn = jb.a((byte) -70, var6);
                        if (null == var7_ref_cn) {
                          break L4;
                        } else {
                          var8 = var7_ref_cn.field_E * 5 >> -1724419101;
                          var9 = var7_ref_cn.field_G * 5 >> 15474339;
                          var7_ref_cn.c(param1 + (-var8 + 48 >> -301264703), 40 + param0 - var9, var8, var9);
                          break L4;
                        }
                      }
                      if (DungeonAssault.field_K == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                L5: {
                  var7 = 0;
                  if (param3 % 7 == 0) {
                    break L5;
                  } else {
                    if (!gm.field_d.field_k.a(-1 + param3 + -(param3 / 7), (byte) 72)) {
                      break L5;
                    } else {
                      var7 = var7 | 1;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param3 % 7 == 6) {
                    break L6;
                  } else {
                    if (gm.field_d.field_k.a(param3 - param3 / 7, (byte) 73)) {
                      var7 = var7 | 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param3 <= 6) {
                    break L7;
                  } else {
                    if (gm.field_d.field_k.a(param3 - -35, (byte) 119)) {
                      var7 = var7 | 4;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param3 >= 42) {
                    break L8;
                  } else {
                    if (!gm.field_d.field_k.a(param3 - -42, (byte) 80)) {
                      break L8;
                    } else {
                      var7 = var7 | 8;
                      break L8;
                    }
                  }
                }
                id.field_m[var7].h(param1, param0 + 12);
                break L2;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var5, "p.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        gg var10_ref_gg = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        var15 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              super.a(param0);
              ((p) this).field_e.b(0, 0);
              var2 = null;
              if (-1 != ((p) this).field_F) {
                var2 = (Object) (Object) qj.field_c[((p) this).field_F];
                if (null == var2) {
                  var2 = (Object) (Object) gm.field_d.field_L[((p) this).field_F];
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3 = null;
              if (var2 == null) {
                if (((p) this).field_R.field_l != null) {
                  var3 = (Object) (Object) ((cp) (Object) ((p) this).field_R.field_l).field_S;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3 = (Object) (Object) ((ai) var2).field_h;
                break L2;
              }
            }
            L3: {
              L4: {
                p.a(200, 65, (ac) var3);
                if (null == var2) {
                  break L4;
                } else {
                  p.a(488, 54, (ai) var2);
                  if (var15 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              p.a(488, 54, ((p) this).field_H, kc.field_V);
              break L3;
            }
            this.a(false, 484, 327);
            var4 = (rj) (Object) ((p) this).field_p.e(-24172);
            L5: while (true) {
              L6: {
                L7: {
                  if (var4 == null) {
                    break L7;
                  } else {
                    var4.a(68);
                    var4 = (rj) (Object) ((p) this).field_p.a(4);
                    if (var15 != 0) {
                      break L6;
                    } else {
                      if (var15 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                ad.field_e.h(187, 48);
                ad.field_e.i(187, -ad.field_e.field_b + 40);
                ad.field_e.f(604 - ad.field_e.field_d, 40 + -ad.field_e.field_b);
                oe.field_m.h(171, 382);
                oe.field_m.j(580, 99);
                break L6;
              }
              L8: {
                L9: {
                  if (!gl.field_Lb) {
                    break L9;
                  } else {
                    ((p) this).field_u.b((byte) -55);
                    if (var15 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                this.a(8, 80, 394);
                break L8;
              }
              L10: {
                if (null != ((p) this).field_b) {
                  ((p) this).field_b.a((byte) -91);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                L12: {
                  p.e();
                  ((p) this).field_q.a((byte) -61);
                  if (gl.field_Lb) {
                    break L12;
                  } else {
                    L13: {
                      var5 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 128.0);
                      wm.field_c.b(205, 83, 256);
                      wm.field_c.b(205, 83, var5);
                      if (((p) this).field_w.field_B) {
                        ec.a(95, 205, (byte) -95, im.field_e, 16744448, 192);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (var15 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                var5 = (int)(128.0 * (1.0 + Math.cos((double)((float)mo.field_a / 20.0f))));
                wm.field_c.b(-(im.field_e.field_y >> -803529567) + 356, -(im.field_e.field_v >> 1526787905) + 267, 256);
                wm.field_c.b(356 + -(im.field_e.field_y >> 462478177), 267 - (im.field_e.field_v >> -123892703), var5);
                if (((p) this).field_w.field_B) {
                  ec.a(-(im.field_e.field_v >> 741506017) + 265, -(im.field_e.field_y >> 427309537) + 354, (byte) -86, im.field_e, 16744448, 96);
                  break L11;
                } else {
                  break L11;
                }
              }
              var4 = (rj) (Object) ((p) this).field_p.e(-24172);
              L14: while (true) {
                L15: {
                  L16: {
                    if (null == var4) {
                      break L16;
                    } else {
                      var4.d(0);
                      var4 = (rj) (Object) ((p) this).field_p.a(4);
                      if (var15 != 0) {
                        break L15;
                      } else {
                        if (var15 == 0) {
                          continue L14;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (((p) this).field_F == -1) {
                      break L17;
                    } else {
                      if (null != ((p) this).field_R.field_l) {
                        L18: {
                          L19: {
                            var5 = 0;
                            if (qj.field_c[((p) this).field_F] != null) {
                              break L19;
                            } else {
                              if (null == gm.field_d.field_L[((p) this).field_F]) {
                                break L18;
                              } else {
                                var5 = gm.field_d.field_L[((p) this).field_F].field_h.field_c >> 37723553;
                                if (var15 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          var5 = qj.field_c[((p) this).field_F].field_h.field_c;
                          break L18;
                        }
                        if (var5 == 0) {
                          break L17;
                        } else {
                          L20: {
                            var6 = ((p) this).field_F / 7;
                            var7 = ((p) this).field_F % 7;
                            var8 = 421 - (189 + -((var7 + var6) * 27));
                            var9 = 80 - -(20 * (-var7 + (var6 + 7)));
                            if (gl.field_Lb) {
                              var10_ref_gg = ((p) this).field_u.b(((p) this).field_F, -15390);
                              var8 = -1 + var10_ref_gg.field_f;
                              var9 = 7 + var10_ref_gg.field_b;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L21: {
                            L22: {
                              if (~t.field_a == ~var5) {
                                break L22;
                              } else {
                                var10_ref_String = "+" + var5 / 10;
                                var11 = db.field_v.b(var10_ref_String);
                                var12 = db.field_v.field_E + db.field_v.field_H;
                                jn.field_a = new cn(var11, var12);
                                jh.a(jn.field_a);
                                db.field_v.b(var10_ref_String, 0, db.field_v.field_H, 16744512, -1);
                                jh.b();
                                dm.field_f = dd.a((byte) -112, 12, jn.field_a);
                                var13 = dm.field_f.field_B;
                                var14 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (~var14 <= ~var13.length) {
                                      break L24;
                                    } else {
                                      var13[var14] = nb.a(var13[var14], 255);
                                      stackOut_73_0 = -1;
                                      stackOut_73_1 = ~var13[var14];
                                      stackIn_82_0 = stackOut_73_0;
                                      stackIn_82_1 = stackOut_73_1;
                                      stackIn_74_0 = stackOut_73_0;
                                      stackIn_74_1 = stackOut_73_1;
                                      if (var15 != 0) {
                                        break L21;
                                      } else {
                                        L25: {
                                          if (stackIn_74_0 != stackIn_74_1) {
                                            break L25;
                                          } else {
                                            var13[var14] = 1;
                                            break L25;
                                          }
                                        }
                                        var14++;
                                        if (var15 == 0) {
                                          continue L23;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                  t.field_a = var5;
                                  break L22;
                                }
                              }
                            }
                            stackOut_81_0 = var8;
                            stackOut_81_1 = jn.field_a.field_y >> 1661823649;
                            stackIn_82_0 = stackOut_81_0;
                            stackIn_82_1 = stackOut_81_1;
                            break L21;
                          }
                          var10 = stackIn_82_0 - stackIn_82_1;
                          var11 = -jn.field_a.field_v + var9;
                          bp.a(var11, dm.field_f, var10, (byte) 99);
                          jn.field_a.h(var10, var11);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  ((p) this).field_N.d();
                  ((p) this).field_I.d();
                  break L15;
                }
                L26: {
                  if (null == ((p) this).field_b) {
                    break L26;
                  } else {
                    var5 = 0;
                    L27: while (true) {
                      L28: {
                        if (~var5 <= ~gf.field_b.length) {
                          break L28;
                        } else {
                          gf.field_b[var5] = nb.a(gf.field_b[var5] >>> 2070201730, 1061109567);
                          var5++;
                          if (var15 != 0) {
                            break L26;
                          } else {
                            if (var15 == 0) {
                              continue L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                      ((p) this).field_b.b(112);
                      break L26;
                    }
                  }
                }
                L29: {
                  if (!kn.field_g) {
                    break L29;
                  } else {
                    ab.a(0);
                    break L29;
                  }
                }
                oh.a((byte) 54);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw vk.a((Throwable) var2, "p.F(" + param0 + ')');
        }
    }

    final static void a(nh param0, int param1, nh param2, nh param3) {
        RuntimeException var4 = null;
        cn var4_ref = null;
        q[] var5 = null;
        q[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        q[] var10 = null;
        cn var10_ref = null;
        cn var11 = null;
        int var11_int = 0;
        cn var12 = null;
        int var13 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            gn.field_i = kn.a(param3, "commonui", "frame_top", -62);
            di.field_l = kn.a(param3, "commonui", "frame_bottom", -91);
            bl.field_e = oh.a(param3, "commonui", 11091, "jagex_logo_grey");
            na.field_C = kn.a(param3, "commonui", "button", -94);
            sl.field_c = da.a("commonui", "validation", 0, param3);
            ta.field_e = (se) (Object) kk.a(param2, param3, "arezzo12", 0, "commonui");
            lp.field_C = (se) (Object) kk.a(param2, param3, "arezzo14", 0, "commonui");
            hc.field_f = (se) (Object) kk.a(param2, param3, "arezzo14bold", 0, "commonui");
            var4_ref = new cn(param0.a("button.gif", "", (byte) -116), (java.awt.Component) (Object) c.field_h);
            q discarded$1 = pa.a((byte) -94, param3, "commonui", "dropdown");
            var5 = qa.a(15322, "screen_options", "commonui", param3);
            d.field_c = new q[4];
            nf.field_v = new q[4];
            wo.field_a = new q[4];
            var6 = new q[][]{d.field_c, nf.field_v, wo.field_a};
            var7 = new int[4][];
            var7[0] = var5[0].field_i;
            var8 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7.length <= var8) {
                    break L3;
                  } else {
                    var7[var8] = (int[]) var7[0].clone();
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
                var7[2][var8] = 16777215;
                var7[1][var8] = 2394342;
                var7[3][var8] = 4767999;
                break L2;
              }
              var9 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var9 >= 3) {
                      break L6;
                    } else {
                      var10 = var6[var9];
                      stackOut_10_0 = 0;
                      stackIn_20_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var13 != 0) {
                        break L5;
                      } else {
                        var11_int = stackIn_11_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var11_int >= var10.length) {
                                break L9;
                              } else {
                                var10[var11_int] = pi.a(1, var5[var9], var7[var11_int]);
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
                  var9 = var4_ref.field_v;
                  ie.a(95);
                  var4_ref.e();
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L5;
                }
                gf.d(stackIn_20_0, 0, gf.field_i, gf.field_c);
                var10_ref = new cn(var9, var9);
                var10_ref.e();
                var4_ref.c(0, 0);
                var11 = new cn(var9, var9);
                var11.e();
                if (param1 >= 2) {
                  var4_ref.c(-var4_ref.field_y + var9, 0);
                  var12 = new cn(var4_ref.field_y + -(var9 * 2), var9);
                  var12.e();
                  var4_ref.c(-var9, 0);
                  ti.c(true);
                  na.field_C = new cn[]{var10_ref, var12, var11};
                  break L0;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("p.Q(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L12;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    final static vk a(int param0, String param1, int param2) {
        vk var3 = null;
        RuntimeException var3_ref = null;
        vk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = new vk(false);
              var3.field_g = param1;
              if (param2 == -28323) {
                break L1;
              } else {
                field_G = null;
                break L1;
              }
            }
            var3.field_d = param0;
            stackOut_3_0 = (vk) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("p.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = param2 + (8 - -la.field_b.field_H);
              db.field_v.b(pb.field_I, 7 + param1, var4_int, 16777215, -1);
              db.field_v.a(Integer.toString(gm.field_d.field_s / 10), 133 + param1, var4_int, 16777215, -1);
              if (jj.field_c > 0) {
                stackOut_3_0 = jj.field_c / 10;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var5 = stackIn_4_0;
            var4_int += 37;
            if (!param0) {
              L2: {
                if (gm.field_d.field_s >= jj.field_c) {
                  stackOut_9_0 = 16777215;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_7_0 = 16711680;
                  stackIn_10_0 = stackOut_7_0;
                  break L2;
                }
              }
              var6 = stackIn_10_0;
              db.field_v.b(ef.field_f, 7 + param1, var4_int, var6, -1);
              db.field_v.a(Integer.toString(var5), param1 + 133, var4_int, var6, -1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "p.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        ai var2_ref = null;
        ac var2_ref2 = null;
        int var2_int = 0;
        ac var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              ((p) this).field_F = -1;
              if (kn.field_g) {
                if (!od.a((byte) -91)) {
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            if (super.d()) {
              return;
            } else {
              L2: {
                ((p) this).field_F = this.b(hj.field_S, eh.field_h, 162);
                if (((p) this).field_F != -1) {
                  L3: {
                    var2_ref = qj.field_c[((p) this).field_F];
                    if (var2_ref != null) {
                      break L3;
                    } else {
                      var2_ref = gm.field_d.field_L[((p) this).field_F];
                      break L3;
                    }
                  }
                  if (var2_ref != null) {
                    L4: {
                      if (var2_ref == rd.field_x) {
                        break L4;
                      } else {
                        hh.field_r = (en) (Object) new bd(var2_ref.field_h);
                        rd.field_x = var2_ref;
                        break L4;
                      }
                    }
                    uj.a(hh.field_r, 95);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L5: {
                L6: {
                  if ((Object) (Object) ((p) this).field_Q != (Object) (Object) hh.field_s) {
                    break L6;
                  } else {
                    this.c(param0 + 1380862290);
                    this.a(true, (byte) -27);
                    if (var4 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if ((Object) (Object) ((p) this).field_O == (Object) (Object) hh.field_s) {
                    break L7;
                  } else {
                    L8: {
                      if ((Object) (Object) ((p) this).field_L == (Object) (Object) hh.field_s) {
                        break L8;
                      } else {
                        L9: {
                          if ((Object) (Object) hh.field_s != (Object) (Object) ((p) this).field_A) {
                            break L9;
                          } else {
                            this.a((byte) -47, 0);
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if ((Object) (Object) ((p) this).field_C == (Object) (Object) hh.field_s) {
                            break L10;
                          } else {
                            L11: {
                              if ((Object) (Object) hh.field_s != (Object) (Object) ((p) this).field_y) {
                                break L11;
                              } else {
                                this.a((byte) -88, 4);
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if ((Object) (Object) ((p) this).field_P == (Object) (Object) hh.field_s) {
                                break L12;
                              } else {
                                L13: {
                                  L14: {
                                    if ((Object) (Object) hh.field_s == (Object) (Object) ((p) this).field_w) {
                                      break L14;
                                    } else {
                                      if ((Object) (Object) ((p) this).field_t != (Object) (Object) hh.field_s) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  this.a((byte) -121);
                                  if (var4 == 0) {
                                    break L5;
                                  } else {
                                    break L13;
                                  }
                                }
                                L15: {
                                  if (hh.field_s instanceof cp) {
                                    break L15;
                                  } else {
                                    if (0 == no.field_d) {
                                      break L5;
                                    } else {
                                      L16: {
                                        var2_int = this.b(lc.field_c, hm.field_k, param0 + 1380862337);
                                        if (var2_int == -1) {
                                          break L16;
                                        } else {
                                          if (var2_int == 0) {
                                            break L16;
                                          } else {
                                            if (var2_int == 6) {
                                              break L16;
                                            } else {
                                              if (var2_int == 24) {
                                                break L16;
                                              } else {
                                                if (var2_int == 42) {
                                                  break L16;
                                                } else {
                                                  if (var2_int != 48) {
                                                    L17: {
                                                      L18: {
                                                        if (no.field_d == 1) {
                                                          break L18;
                                                        } else {
                                                          if (2 != no.field_d) {
                                                            break L17;
                                                          } else {
                                                            L19: {
                                                              if (null != qj.field_c[var2_int]) {
                                                                jj.field_c = jj.field_c - qj.field_c[var2_int].field_h.field_c;
                                                                if (gm.field_d.field_L[var2_int] != null) {
                                                                  jj.field_c = jj.field_c + (gm.field_d.field_L[var2_int].field_h.field_c >> -1380862175);
                                                                  break L19;
                                                                } else {
                                                                  break L19;
                                                                }
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                            qj.field_c[var2_int] = null;
                                                            ((p) this).field_H = null;
                                                            if (var4 == 0) {
                                                              break L17;
                                                            } else {
                                                              break L18;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (((p) this).field_R.field_l != null) {
                                                        L20: {
                                                          var3 = ((cp) (Object) ((p) this).field_R.field_l).field_S;
                                                          if (qj.field_c[var2_int] == null) {
                                                            break L20;
                                                          } else {
                                                            if (var3 != qj.field_c[var2_int].field_h) {
                                                              break L20;
                                                            } else {
                                                              break L17;
                                                            }
                                                          }
                                                        }
                                                        L21: {
                                                          L22: {
                                                            if (null == qj.field_c[var2_int]) {
                                                              break L22;
                                                            } else {
                                                              jj.field_c = jj.field_c - qj.field_c[var2_int].field_h.field_c;
                                                              if (var4 == 0) {
                                                                break L21;
                                                              } else {
                                                                break L22;
                                                              }
                                                            }
                                                          }
                                                          if (gm.field_d.field_L[var2_int] != null) {
                                                            jj.field_c = jj.field_c - (gm.field_d.field_L[var2_int].field_h.field_c >> -1721195743);
                                                            break L21;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                        L23: {
                                                          L24: {
                                                            qj.field_c[var2_int] = new ai(var3.field_v);
                                                            if (null == qj.field_c[var2_int].field_c) {
                                                              break L24;
                                                            } else {
                                                              if (qj.field_c[var2_int].field_c.field_i != var3.field_d) {
                                                                break L24;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                          qj.field_c[var2_int].field_c = new wd(var3.field_d);
                                                          break L23;
                                                        }
                                                        jj.field_c = jj.field_c + var3.field_c;
                                                        qh.a(param0 ^ 1380875597, (rj) (Object) ((p) this).field_Q, 19);
                                                        if (var3.field_u != qj.field_c[var2_int].field_c.field_n) {
                                                          L25: {
                                                            if (null != var3.field_u) {
                                                              qj.field_c[var2_int].field_c.a(rf.field_M, var3.field_u, -10872);
                                                              break L25;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                          if (var3.field_a != null) {
                                                            o discarded$2 = gd.a(64, var3.field_a);
                                                            break L17;
                                                          } else {
                                                            break L17;
                                                          }
                                                        } else {
                                                          break L17;
                                                        }
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                    jk.j((byte) 59);
                                                    this.c((byte) -118);
                                                    break L16;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var4 == 0) {
                                        break L5;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                L26: {
                                  var2_ref2 = ((cp) (Object) hh.field_s).field_S;
                                  ((p) this).field_H = new wd(var2_ref2.field_d);
                                  if (null == var2_ref2.field_u) {
                                    break L26;
                                  } else {
                                    ((p) this).field_H.a(rf.field_M, var2_ref2.field_u, -10872);
                                    break L26;
                                  }
                                }
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            this.a((byte) -52, 3);
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.a((byte) -82, 2);
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.a((byte) -50, 1);
                    if (var4 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                this.d((byte) -76);
                this.a(true, (byte) -11);
                break L5;
              }
              L27: {
                if (param0 == -1380862175) {
                  break L27;
                } else {
                  int discarded$3 = this.b(-120, -24, -127);
                  break L27;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "p.W(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        cp[] var5 = null;
        int var6 = 0;
        cp var7 = null;
        int var8 = 0;
        Object stackIn_83_0 = null;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_82_0 = null;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              var3_array = new int[gh.field_i.length];
                              var4 = param1;
                              if (0 != var4) {
                                break L9;
                              } else {
                                if (var8 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var4 != 1) {
                                break L10;
                              } else {
                                if (var8 == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (var4 == 2) {
                              break L6;
                            } else {
                              L11: {
                                if (3 != var4) {
                                  break L11;
                                } else {
                                  if (var8 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (4 != var4) {
                                break L3;
                              } else {
                                if (var8 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var4 = 0;
                          L12: while (true) {
                            L13: {
                              if (~var4 <= ~var3_array.length) {
                                break L13;
                              } else {
                                if (var8 != 0) {
                                  break L3;
                                } else {
                                  L14: {
                                    if (null == gh.field_i[var4]) {
                                      break L14;
                                    } else {
                                      var3_array[var4] = gh.field_i[var4].field_c;
                                      break L14;
                                    }
                                  }
                                  var4++;
                                  if (var8 == 0) {
                                    continue L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var4 = 0;
                        L15: while (true) {
                          L16: {
                            if (var3_array.length <= var4) {
                              break L16;
                            } else {
                              if (var8 != 0) {
                                break L3;
                              } else {
                                L17: {
                                  if (gh.field_i[var4] == null) {
                                    break L17;
                                  } else {
                                    var3_array[var4] = gh.field_i[var4].field_A;
                                    break L17;
                                  }
                                }
                                var4++;
                                if (var8 == 0) {
                                  continue L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var4 = 0;
                      L18: while (true) {
                        L19: {
                          if (var3_array.length <= var4) {
                            break L19;
                          } else {
                            if (var8 != 0) {
                              break L3;
                            } else {
                              L20: {
                                if (null != gh.field_i[var4]) {
                                  var3_array[var4] = gh.field_i[var4].field_k;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              var4++;
                              if (var8 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var4 = 0;
                    L21: while (true) {
                      L22: {
                        if (~var4 <= ~var3_array.length) {
                          break L22;
                        } else {
                          if (var8 != 0) {
                            break L3;
                          } else {
                            L23: {
                              if (gh.field_i[var4] != null) {
                                var3_array[var4] = gh.field_i[var4].field_y;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            var4++;
                            if (var8 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var4 = 0;
                  L24: while (true) {
                    if (var3_array.length <= var4) {
                      break L3;
                    } else {
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L25: {
                          if (gh.field_i[var4] != null) {
                            var3_array[var4] = gh.field_i[var4].field_r;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        var4++;
                        if (var8 == 0) {
                          continue L24;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (~((p) this).field_z == ~param1) {
                  break L2;
                } else {
                  ((p) this).field_s = false;
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L26: {
                stackOut_82_0 = this;
                stackIn_85_0 = stackOut_82_0;
                stackIn_83_0 = stackOut_82_0;
                if (((p) this).field_s) {
                  stackOut_85_0 = this;
                  stackOut_85_1 = 0;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  break L26;
                } else {
                  stackOut_83_0 = this;
                  stackOut_83_1 = 1;
                  stackIn_86_0 = stackOut_83_0;
                  stackIn_86_1 = stackOut_83_1;
                  break L26;
                }
              }
              ((p) this).field_s = stackIn_86_1 != 0;
              break L1;
            }
            L27: {
              L28: {
                ((p) this).field_z = param1;
                if (!((p) this).field_s) {
                  var4 = 0;
                  L29: while (true) {
                    if (~var4 <= ~var3_array.length) {
                      break L28;
                    } else {
                      var3_array[var4] = -var3_array[var4];
                      var4++;
                      if (var8 != 0) {
                        break L27;
                      } else {
                        if (var8 == 0) {
                          continue L29;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                } else {
                  break L28;
                }
              }
              if (((p) this).field_v == null) {
                break L27;
              } else {
                ((p) this).field_D = (cp[]) ((p) this).field_v.clone();
                ik.a((Object[]) (Object) ((p) this).field_D, -111, var3_array);
                break L27;
              }
            }
            L30: {
              if (param0 < -42) {
                break L30;
              } else {
                ((p) this).field_R = null;
                break L30;
              }
            }
            hf.field_nb.field_J = null;
            hf.field_nb.e(true);
            var4 = 0;
            var5 = ((p) this).field_D;
            var6 = 0;
            L31: while (true) {
              L32: {
                L33: {
                  if (var6 >= var5.length) {
                    break L33;
                  } else {
                    var7 = var5[var6];
                    if (var8 != 0) {
                      break L32;
                    } else {
                      L34: {
                        if (var7 == null) {
                          break L34;
                        } else {
                          ((gd) (Object) var7).b(10, var4, (byte) 4);
                          var4 = var4 + (8 + ((gd) (Object) var7).field_x);
                          hf.field_nb.a((rj) (Object) var7, (byte) -48);
                          break L34;
                        }
                      }
                      var6++;
                      if (var8 == 0) {
                        continue L31;
                      } else {
                        break L33;
                      }
                    }
                  }
                }
                break L32;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "p.T(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        lf var2_ref = null;
        ai[] var2_array = null;
        int var3 = 0;
        ai var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_24_0 = false;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              super.c(param0);
              if (kh.field_s) {
                break L1;
              } else {
                if (param0) {
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (!ha.b((byte) 47)) {
                          break L4;
                        } else {
                          stackOut_5_0 = mm.field_t;
                          stackIn_25_0 = stackOut_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          if (var5 != 0) {
                            break L3;
                          } else {
                            L5: {
                              if (stackIn_6_0 != 13) {
                                break L5;
                              } else {
                                this.a(false, (byte) -94);
                                if (var5 == 0) {
                                  continue L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            super.f();
                            if (var5 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L6: {
                        if (null == ((p) this).field_b) {
                          break L6;
                        } else {
                          if (!((p) this).field_b.field_d) {
                            break L6;
                          } else {
                            L7: {
                              L8: {
                                var2_ref = (lf) (Object) ((p) this).field_b;
                                if (var2_ref.field_u) {
                                  break L8;
                                } else {
                                  this.d((byte) -76);
                                  if (var5 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              this.c(65);
                              break L7;
                            }
                            ((p) this).field_b.c(-127);
                            ((p) this).field_b = null;
                            this.a(true, (byte) -11);
                            break L6;
                          }
                        }
                      }
                      this.d(-1380862175);
                      stackOut_24_0 = kn.field_g;
                      stackIn_25_0 = stackOut_24_0 ? 1 : 0;
                      break L3;
                    }
                    L9: {
                      if (stackIn_25_0 != 0) {
                        bl.a(0);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (((p) this).field_H != null) {
                        ((p) this).field_H.a((byte) 109, 20);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var2_array = gm.field_d.field_L;
                    var3 = 0;
                    L11: while (true) {
                      L12: {
                        L13: {
                          if (var3 >= var2_array.length) {
                            break L13;
                          } else {
                            var4 = var2_array[var3];
                            if (var5 != 0) {
                              break L12;
                            } else {
                              L14: {
                                if (null == var4) {
                                  break L14;
                                } else {
                                  var4.field_c.a((byte) 109, 20);
                                  break L14;
                                }
                              }
                              var3++;
                              if (var5 == 0) {
                                continue L11;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        var2_array = qj.field_c;
                        break L12;
                      }
                      var3 = 0;
                      L15: while (true) {
                        L16: {
                          L17: {
                            if (~var3 <= ~var2_array.length) {
                              break L17;
                            } else {
                              var4 = var2_array[var3];
                              if (var5 != 0) {
                                break L16;
                              } else {
                                L18: {
                                  if (var4 == null) {
                                    break L18;
                                  } else {
                                    var4.field_c.a((byte) 109, 20);
                                    break L18;
                                  }
                                }
                                var3++;
                                if (var5 == 0) {
                                  continue L15;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          break L16;
                        }
                        break L0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "p.B(" + param0 + ')');
        }
    }

    public static void d(boolean param0) {
        try {
            field_r = null;
            field_G = null;
            field_K = null;
            field_x = null;
            field_J = null;
            if (!param0) {
                field_K = null;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "p.J(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        pp stackIn_1_0 = null;
        pp stackIn_3_0 = null;
        pp stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        pp stackOut_0_0 = null;
        pp stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        pp stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        try {
          L0: {
            L1: {
              stackOut_0_0 = ((p) this).field_Q;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (gm.field_d.field_s < jj.field_c) {
                stackOut_3_0 = (pp) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = (pp) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_4_0.field_w = stackIn_4_1 != 0;
            var2_int = -29 % ((-32 - param0) / 39);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "p.D(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            if (((p) this).field_u != null) {
              stackOut_3_0 = ((p) this).field_u.b(param0, 19091, param1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param1 -= 98;
                param0 -= 394;
                var4_int = ((189 + param0) * 3 + 560 + -(param1 * 4)) / 162;
                var5 = (3 * param0 + param1 * 4) / param2;
                if (var4_int < 0) {
                  break L1;
                } else {
                  if (var5 < 0) {
                    break L1;
                  } else {
                    if (var4_int >= 7) {
                      break L1;
                    } else {
                      if (var5 >= 7) {
                        break L1;
                      } else {
                        stackOut_15_0 = 7 * var5 + var4_int;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                  }
                }
              }
              stackOut_17_0 = -1;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "p.QB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    private final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 49) {
                    break L3;
                  } else {
                    qj.field_c[var2_int] = null;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                jj.field_c = 0;
                break L2;
              }
              L4: {
                if (param0 == -76) {
                  break L4;
                } else {
                  this.b(-63);
                  break L4;
                }
              }
              this.c((byte) 34);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "p.O(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 <= -3) {
                break L1;
              } else {
                this.c((byte) 76);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_int >= 49) {
                    break L4;
                  } else {
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null == qj.field_c[var3_int]) {
                          break L5;
                        } else {
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3_int++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (var3_int != 49) {
                  break L3;
                } else {
                  L6: {
                    if (ed.c(true)) {
                      break L6;
                    } else {
                      if (!gm.field_d.field_H) {
                        ac.field_B.d((byte) -106, 58);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (!kn.field_g) {
                    gd.a(g.field_Hb, 0, g.field_Hb, param0);
                    break L0;
                  } else {
                    gd.a(g.field_Hb, 0, 5, param0);
                    return;
                  }
                }
              }
              L7: {
                var4 = wj.field_x;
                if (!gm.field_d.field_H) {
                  var4 = var4 + dh.field_c;
                  break L7;
                } else {
                  break L7;
                }
              }
              ((p) this).field_b = (kl) (Object) new lf(oa.field_h, var4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "p.M(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              this.a(((p) this).field_w, dc.field_k, (byte) 125, ob.field_Kb, mm.field_s);
              this.a(((p) this).field_t, dc.field_k, (byte) 122, ob.field_Kb, cf.field_d);
              if (param0 <= -65) {
                break L1;
              } else {
                ((p) this).c();
                break L1;
              }
            }
            L2: {
              if (gl.field_Lb == ((p) this).field_t.field_B) {
                L3: {
                  if (((p) this).field_t.field_B) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L3;
                  }
                }
                gl.field_Lb = stackIn_10_0 != 0;
                this.a(14);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "p.U(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              rl.field_d = p.a(ri.field_d, 400);
              dm.field_a = p.a(i.field_r, 400);
              id.field_m = p.a(mc.field_w, param0 + -2398);
              var2_int = 390;
              var3 = 300;
              bd.field_g = new cn(var2_int, var3);
              if (param0 == 2798) {
                break L1;
              } else {
                ((p) this).field_N = null;
                break L1;
              }
            }
            jh.a(bd.field_g);
            nb.field_d.a(0, 0, var2_int, var3);
            jh.b();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "p.PB(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        gd stackIn_1_0 = null;
        gd stackIn_3_0 = null;
        gd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_0_0 = null;
        gd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        gd stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        try {
          L0: {
            L1: {
              ((p) this).b();
              ((p) this).field_R = new nn(true);
              ((p) this).field_M = new nn(false);
              hf.field_nb = new ed(8, 90, 180, 382);
              ((p) this).field_Q = tn.a(16, 12, (se) (Object) ne.field_c, jm.field_i, param0 ^ -18245, lk.field_P);
              ((p) this).field_O = tn.a(472, 12, (se) (Object) ne.field_c, jm.field_i, param0 ^ -18248, be.field_r.toUpperCase());
              ((p) this).field_A = sj.a(24, 87, 66, uj.field_c, ((p) this).field_M);
              ((p) this).field_L = sj.a(55, 96, 66, gd.field_E, ((p) this).field_M);
              ((p) this).field_C = sj.a(86, 110, 66, jj.field_b, ((p) this).field_M);
              ((p) this).field_P = sj.a(117, 87, 66, tb.field_c, ((p) this).field_M);
              ((p) this).field_y = sj.a(148, 91, 66, kd.field_f, ((p) this).field_M);
              ((p) this).field_p.a((ne) (Object) hf.field_nb, false);
              ((p) this).field_p.a((ne) (Object) ((p) this).field_Q, false);
              ((p) this).field_p.a((ne) (Object) ((p) this).field_O, false);
              ((p) this).field_p.a((ne) (Object) ((p) this).field_A, false);
              ((p) this).field_p.a((ne) (Object) ((p) this).field_L, false);
              ((p) this).field_p.a((ne) (Object) ((p) this).field_C, false);
              ((p) this).field_p.a((ne) (Object) ((p) this).field_P, false);
              ((p) this).field_p.a((ne) (Object) ((p) this).field_y, false);
              ((p) this).field_A.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w, 30496));
              ((p) this).field_L.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w, param0 + 12257));
              ((p) this).field_C.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w, param0 + 12257));
              ((p) this).field_P.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w, 30496));
              ((p) this).field_y.field_n = (en) (Object) new e(jk.a(new String[1], tp.field_w, 30496));
              ((p) this).field_O.field_n = (en) (Object) new e((String) null, pm.field_o, nk.field_Lb);
              ((p) this).field_Q.field_n = (en) (Object) new e((String) null, ud.field_u, oi.field_M);
              this.b((byte) 26);
              ((p) this).field_z = 0;
              ((p) this).field_s = false;
              ((p) this).field_M.a(((p) this).field_A, -256);
              this.a((byte) -124, 0);
              ((p) this).field_w = this.a(ob.field_Kb, mm.field_s, 491, param0 ^ -18240, 438, dc.field_k);
              ((p) this).field_w.field_B = true;
              ((p) this).field_p.a((ne) (Object) ((p) this).field_w, false);
              ((p) this).field_t = this.a(ob.field_Kb, cf.field_d, 491, -1, 401, dc.field_k);
              stackOut_0_0 = ((p) this).field_t;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (gl.field_Lb) {
                stackOut_3_0 = (gd) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = (gd) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_4_0.field_B = stackIn_4_1 != 0;
            ((p) this).field_p.a((ne) (Object) ((p) this).field_t, false);
            if (param0 == 18239) {
              ((p) this).field_q = new sa(186, 401, 288, 71);
              ((p) this).field_q.a(true, f.field_c, (byte) 91, wh.field_c, 16777215);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "p.L(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ol.field_a = new cn[4];
              ol.field_a[0] = me.a(32, param0, 14, 0, 14);
              ol.field_a[1] = me.a(32, 14, 0, 14, 14);
              ol.field_a[2] = me.a(md.b(param0, 46), 0, 14, 14, 14);
              ol.field_a[3] = me.a(32, 14, 14, 14, 0);
              if (gl.field_Lb) {
                break L1;
              } else {
                ol.field_a = p.a(wk.a(ol.field_a, param0 + -14), 400);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!gl.field_Lb) {
                  break L3;
                } else {
                  ((p) this).field_u = (cl) (Object) new sf((go) null, 350, 261);
                  if (DungeonAssault.field_K == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((p) this).field_u = null;
              break L2;
            }
            jk.j((byte) 59);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "p.G(" + param0 + ')');
        }
    }

    final void c() {
        try {
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
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "p.I()");
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_75_0 = 0;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 >= 56) {
                break L1;
              } else {
                this.a(-105, -4, 26);
                break L1;
              }
            }
            L2: {
              if (~gm.field_d.field_s <= ~jj.field_c) {
                L3: {
                  L4: {
                    L5: {
                      if (!ed.c(true)) {
                        ac.field_B.d((byte) -127, 57);
                        var2_int = 0;
                        L6: while (true) {
                          if (var2_int >= 49) {
                            break L5;
                          } else {
                            stackOut_12_0 = 0;
                            stackOut_12_1 = var2_int;
                            stackIn_46_0 = stackOut_12_0;
                            stackIn_46_1 = stackOut_12_1;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            if (var3 != 0) {
                              L7: while (true) {
                                if (stackIn_46_0 <= stackIn_46_1) {
                                  break L4;
                                } else {
                                  stackOut_47_0 = -1;
                                  stackIn_76_0 = stackOut_47_0;
                                  stackIn_48_0 = stackOut_47_0;
                                  if (var3 != 0) {
                                    break L3;
                                  } else {
                                    stackOut_48_0 = stackIn_48_0;
                                    stackIn_50_0 = stackOut_48_0;
                                    L8: {
                                      if (stackIn_50_0 == ~var2_int) {
                                        break L8;
                                      } else {
                                        if (var2_int == 6) {
                                          break L8;
                                        } else {
                                          if (24 == var2_int) {
                                            break L8;
                                          } else {
                                            if (var2_int == 42) {
                                              break L8;
                                            } else {
                                              L9: {
                                                if (var2_int != 48) {
                                                  break L9;
                                                } else {
                                                  if (var3 == 0) {
                                                    break L8;
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                              }
                                              if (null != qj.field_c[var2_int]) {
                                                gm.field_d.field_L[var2_int] = new ai(qj.field_c[var2_int].field_a);
                                                gm.field_d.field_L[var2_int].field_c = qj.field_c[var2_int].field_c;
                                                qj.field_c[var2_int] = null;
                                                break L8;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    if (var3 == 0) {
                                      stackOut_45_0 = 49;
                                      stackOut_45_1 = var2_int;
                                      stackIn_46_0 = stackOut_45_0;
                                      stackIn_46_1 = stackOut_45_1;
                                      continue L7;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            } else {
                              L10: {
                                if (stackIn_13_0 == stackIn_13_1) {
                                  break L10;
                                } else {
                                  if (6 == var2_int) {
                                    break L10;
                                  } else {
                                    if (var2_int == 24) {
                                      break L10;
                                    } else {
                                      if (var2_int == 42) {
                                        break L10;
                                      } else {
                                        L11: {
                                          if (var2_int != 48) {
                                            break L11;
                                          } else {
                                            if (var3 == 0) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (null == qj.field_c[var2_int]) {
                                            break L12;
                                          } else {
                                            ac.field_B.a(6, qj.field_c[var2_int].field_a);
                                            if (var3 == 0) {
                                              break L10;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        ac.field_B.a(6, 0);
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              var2_int++;
                              if (var3 == 0) {
                                continue L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L13: {
                      if (jj.field_c > 0) {
                        gm.field_d.field_s = gm.field_d.field_s - jj.field_c;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var2_int = 0;
                    L14: while (true) {
                      stackOut_45_0 = 49;
                      stackOut_45_1 = var2_int;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      if (stackIn_46_0 <= stackIn_46_1) {
                        break L4;
                      } else {
                        stackOut_47_0 = -1;
                        stackIn_76_0 = stackOut_47_0;
                        stackIn_48_0 = stackOut_47_0;
                        if (var3 != 0) {
                          break L3;
                        } else {
                          stackOut_48_0 = stackIn_48_0;
                          stackIn_50_0 = stackOut_48_0;
                          L15: {
                            if (stackIn_50_0 == ~var2_int) {
                              break L15;
                            } else {
                              if (var2_int == 6) {
                                break L15;
                              } else {
                                if (24 == var2_int) {
                                  break L15;
                                } else {
                                  if (var2_int == 42) {
                                    break L15;
                                  } else {
                                    L16: {
                                      if (var2_int != 48) {
                                        break L16;
                                      } else {
                                        if (var3 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    if (null != qj.field_c[var2_int]) {
                                      gm.field_d.field_L[var2_int] = new ai(qj.field_c[var2_int].field_a);
                                      gm.field_d.field_L[var2_int].field_c = qj.field_c[var2_int].field_c;
                                      qj.field_c[var2_int] = null;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var3 == 0) {
                            continue L14;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_75_0 = 0;
                  stackIn_76_0 = stackOut_75_0;
                  break L3;
                }
                jj.field_c = stackIn_76_0;
                this.c((byte) -91);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "p.V(" + param0 + ')');
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
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                L5: {
                  if (var15 >= 0) {
                    break L5;
                  } else {
                    if (var20 != 0) {
                      break L4;
                    } else {
                      var14 = -param4.field_y;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if (var14 >= 0) {
                              break L8;
                            } else {
                              var16 = param4.field_B[var11];
                              stackOut_12_0 = 0;
                              stackOut_12_1 = var16;
                              stackIn_19_0 = stackOut_12_0;
                              stackIn_19_1 = stackOut_12_1;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              if (var20 != 0) {
                                break L7;
                              } else {
                                L9: {
                                  if (stackIn_13_0 == stackIn_13_1) {
                                    break L9;
                                  } else {
                                    var17 = var16 & 16711680;
                                    var18 = var16 & 65280;
                                    var19 = var16 & 255;
                                    var18 = var18 * var9;
                                    var17 = var17 * var8;
                                    var19 = var19 * var10;
                                    var16 = var17 & -16777216 | var18 & 16711680 | var19 & 65280;
                                    gf.field_b[var12] = var16 >>> -859178296;
                                    break L9;
                                  }
                                }
                                var12++;
                                var11++;
                                var14++;
                                if (var20 == 0) {
                                  continue L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackOut_18_0 = var12;
                          stackOut_18_1 = var13;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          break L7;
                        }
                        var12 = stackIn_19_0 + stackIn_19_1;
                        var15++;
                        if (var20 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("p.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L10;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        lb var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              bd.field_g.h(-(bd.field_g.field_y >> 1050842529) + param2 - -2, param1 + 12);
              var4_ref = gm.field_d;
              if (param0 == 8) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 > 140) {
                    break L4;
                  } else {
                    gf.b(-(var5 * 4 / 3) + param2, var5 + 18 + param1, var5 * 8 / 3, 0);
                    gf.b(param2 + -(var5 * 4 / 3), -var5 + 280 + param1 - -18, var5 * 8 / 3, 0);
                    var5++;
                    if (var13 != 0) {
                      break L3;
                    } else {
                      if (var13 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var5 = 0;
                break L3;
              }
              L5: while (true) {
                stackOut_11_0 = var5;
                stackOut_11_1 = 7;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                L6: while (true) {
                  L7: {
                    L8: {
                      if (stackIn_12_0 >= stackIn_12_1) {
                        break L8;
                      } else {
                        var6 = param2 - (1 + var5) * 27;
                        var7 = 20 * var5 + param1;
                        var8 = 6 + -var5;
                        stackOut_13_0 = 0;
                        stackIn_56_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var13 != 0) {
                          break L7;
                        } else {
                          var9 = stackIn_14_0;
                          L9: while (true) {
                            L10: {
                              if (~var9 <= ~(1 + var5)) {
                                break L10;
                              } else {
                                stackOut_16_0 = -1;
                                stackOut_16_1 = ~var9;
                                stackIn_12_0 = stackOut_16_0;
                                stackIn_12_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (var13 != 0) {
                                  continue L6;
                                } else {
                                  L11: {
                                    L12: {
                                      if (stackIn_17_0 != stackIn_17_1) {
                                        break L12;
                                      } else {
                                        if (0 == var8) {
                                          break L11;
                                        } else {
                                          if (var8 == 6) {
                                            break L11;
                                          } else {
                                            this.a(var6, 92, var8, var7 - -4, rl.field_d[5]);
                                            if (var13 == 0) {
                                              break L11;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L13: {
                                      var10 = var4_ref.field_k.a(35 + var8, (byte) 109) ? 1 : 0;
                                      var11 = 5;
                                      if (var10 == 0) {
                                        break L13;
                                      } else {
                                        L14: {
                                          var12 = 0;
                                          if (var12 != 0) {
                                            stackOut_31_0 = 1;
                                            stackIn_32_0 = stackOut_31_0;
                                            break L14;
                                          } else {
                                            stackOut_29_0 = 3;
                                            stackIn_32_0 = stackOut_29_0;
                                            break L14;
                                          }
                                        }
                                        var11 = stackIn_32_0;
                                        break L13;
                                      }
                                    }
                                    this.a(var6, 97, var8, 4 + var7, rl.field_d[var11]);
                                    break L11;
                                  }
                                  L15: {
                                    L16: {
                                      if (var5 != var9) {
                                        break L16;
                                      } else {
                                        if (var8 == 6) {
                                          break L15;
                                        } else {
                                          if (var8 != 48) {
                                            this.a(27 + var6, 119, var8, var7 + 4, rl.field_d[4]);
                                            if (var13 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    L17: {
                                      var10 = var4_ref.field_k.a(var8 + -(var8 / 7), (byte) 125) ? 1 : 0;
                                      var11 = 4;
                                      if (var10 != 0) {
                                        L18: {
                                          var12 = 0;
                                          if (var12 != 0) {
                                            stackOut_50_0 = 0;
                                            stackIn_51_0 = stackOut_50_0;
                                            break L18;
                                          } else {
                                            stackOut_48_0 = 2;
                                            stackIn_51_0 = stackOut_48_0;
                                            break L18;
                                          }
                                        }
                                        var11 = stackIn_51_0;
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    this.a(27 + var6, 110, var8, 4 + var7, rl.field_d[var11]);
                                    break L15;
                                  }
                                  this.a(var7, var6, (byte) 127, var8);
                                  var6 += 54;
                                  var9++;
                                  var8 += 8;
                                  if (var13 == 0) {
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            var5++;
                            if (var13 == 0) {
                              continue L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    stackOut_55_0 = 7;
                    stackIn_56_0 = stackOut_55_0;
                    break L7;
                  }
                  var5 = stackIn_56_0;
                  L19: while (true) {
                    stackOut_57_0 = 13;
                    stackIn_58_0 = stackOut_57_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (stackIn_58_0 <= var5) {
                            break L22;
                          } else {
                            var6 = -((13 - var5) * 27) + param2;
                            var7 = param1 + var5 * 20;
                            var8 = 7 * var5 + -42;
                            if (var13 != 0) {
                              break L21;
                            } else {
                              var9 = 0;
                              L23: while (true) {
                                L24: {
                                  if (~(13 + -var5) >= ~var9) {
                                    break L24;
                                  } else {
                                    var10 = var4_ref.field_k.a(var8 - -35, (byte) 86) ? 1 : 0;
                                    var11 = 5;
                                    stackOut_62_0 = var10;
                                    stackIn_58_0 = stackOut_62_0;
                                    stackIn_63_0 = stackOut_62_0;
                                    if (var13 != 0) {
                                      continue L20;
                                    } else {
                                      L25: {
                                        if (stackIn_63_0 == 0) {
                                          break L25;
                                        } else {
                                          L26: {
                                            var12 = 0;
                                            if (var12 != 0) {
                                              stackOut_67_0 = 1;
                                              stackIn_68_0 = stackOut_67_0;
                                              break L26;
                                            } else {
                                              stackOut_65_0 = 3;
                                              stackIn_68_0 = stackOut_65_0;
                                              break L26;
                                            }
                                          }
                                          var11 = stackIn_68_0;
                                          break L25;
                                        }
                                      }
                                      L27: {
                                        this.a(var6, 57, var8, 4 + var7, rl.field_d[var11]);
                                        var10 = var4_ref.field_k.a(var8 - var8 / 7, (byte) 110) ? 1 : 0;
                                        var11 = 4;
                                        if (var10 != 0) {
                                          L28: {
                                            var12 = 0;
                                            if (var12 == 0) {
                                              stackOut_75_0 = 2;
                                              stackIn_76_0 = stackOut_75_0;
                                              break L28;
                                            } else {
                                              stackOut_73_0 = 0;
                                              stackIn_76_0 = stackOut_73_0;
                                              break L28;
                                            }
                                          }
                                          var11 = stackIn_76_0;
                                          break L27;
                                        } else {
                                          break L27;
                                        }
                                      }
                                      L29: {
                                        this.a(27 + var6, 124, var8, var7 + 4, rl.field_d[var11]);
                                        this.a(var7, var6, (byte) 127, var8);
                                        if (0 != var9) {
                                          break L29;
                                        } else {
                                          if (var8 == 0) {
                                            break L29;
                                          } else {
                                            if (42 == var8) {
                                              break L29;
                                            } else {
                                              rl.field_d[4].h(var6, 20 + (4 + var7));
                                              break L29;
                                            }
                                          }
                                        }
                                      }
                                      L30: {
                                        if (-var5 + 12 != var9) {
                                          break L30;
                                        } else {
                                          if (42 == var8) {
                                            break L30;
                                          } else {
                                            if (var8 == 48) {
                                              break L30;
                                            } else {
                                              rl.field_d[5].h(27 + var6, 24 + var7);
                                              break L30;
                                            }
                                          }
                                        }
                                      }
                                      var8 += 8;
                                      var6 += 54;
                                      var9++;
                                      if (var13 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                var5++;
                                if (var13 == 0) {
                                  continue L19;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        break L21;
                      }
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "p.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.b(param0);
            fk.a((byte) 121, lf.field_w);
            p.a(((p) this).field_e, 188, 48, 605, 400, 394, 220);
            jh.a(((p) this).field_e);
            p.b(8, 46, 180, 427, 16777215, 32, 128);
            h.a(false, 388, 15, true, 80);
            h.a(false, 426, 617, true, 46);
            p.a(8, 47, 172, 425, 256, 32, 8, 128);
            p.a(8, 8, 172, 32, 256, 64, 4, 128);
            p.a(460, 8, 172, 32, 256, 64, 4, 128);
            p.a(188, 8, 264, 32, 256, 64, 4, 128);
            ((p) this).field_E.b(12, 32, 320 + -(((p) this).field_E.field_i >> 1053984897));
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
            ((p) this).field_H = null;
            ((p) this).field_N = new rh(204, 394, 80, 160, 16711680, 768, 249);
            ((p) this).field_I = new rh(600, 111, 80, 160, 16711680, 768, 249);
            qh.a(-13716, (rj) (Object) ((p) this).field_v[15], 18);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "p.E(" + param0 + ')');
        }
    }

    p() {
        ((p) this).field_E = new tf((se) (Object) ne.field_c, f.field_c, cm.field_M);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Please wait...";
        field_x = new int[8192];
        field_J = new String[]{null, "Each <%raider> has four skills - <%attack>, <%defence>, <%dodge> and <%sneak> - displayed as bars above your party selection. Some raiders also possess a special ability."};
        field_r = "Raids: ";
    }
}
