/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends nv {
    static int field_p;
    private fsa field_r;
    private int field_v;
    private fsa field_A;
    private int field_s;
    private fsa field_o;
    private int field_q;
    private int field_y;
    private boolean field_u;
    private int field_x;
    static boolean field_n;
    private int field_t;
    private hj field_z;
    private int field_w;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((vd) this).field_u) {
              if (null == ((vd) this).field_z) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var8_int = ((vd) this).field_g.d(3) - ((vd) this).field_g.c(-29) / 2;
                  var9 = ((vd) this).field_g.e(9648) + -(((vd) this).field_g.a((byte) 55) / 2);
                  param3 = param3 - (((vd) this).field_y + param1 / 2);
                  param4 = param4 - (((vd) this).field_w + param0 / 2);
                  var10 = -var8_int + param3;
                  var11 = param1 + (param3 + -var8_int);
                  var12 = -var9 + param4;
                  var13 = -var9 + (param4 + param0);
                  if (0 > var10) {
                    var10 = var10 - (((vd) this).field_t - 1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var12 >= 0) {
                    break L2;
                  } else {
                    var12 = var12 - (((vd) this).field_t - 1);
                    break L2;
                  }
                }
                L3: {
                  if (var11 < 0) {
                    var11 = var11 - (((vd) this).field_t + -1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var12 = var12 / ((vd) this).field_t;
                  var10 = var10 / ((vd) this).field_t;
                  if (0 <= var13) {
                    break L4;
                  } else {
                    var13 = var13 - (-1 + ((vd) this).field_t);
                    break L4;
                  }
                }
                var11 = var11 / ((vd) this).field_t;
                var13 = var13 / ((vd) this).field_t;
                var10 = za.a(0, (byte) 113, ((vd) this).field_z.field_f - param2, var10);
                var11 = za.a(0, (byte) 99, ((vd) this).field_z.field_f + -1, var11);
                var14 = var10;
                L5: while (true) {
                  if (var11 < var14) {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    break L0;
                  } else {
                    var15 = var12;
                    L6: while (true) {
                      if (var13 < var15) {
                        var14++;
                        continue L5;
                      } else {
                        L7: {
                          if (((vd) this).field_z.a(var14, var15, (byte) -128)) {
                            if (((vd) this).field_z.b((byte) -5, var15, var14) <= 0) {
                              break L7;
                            } else {
                              stackOut_25_0 = 1;
                              stackIn_26_0 = stackOut_25_0;
                              return stackIn_26_0 != 0;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var15++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var8;
            stackOut_31_1 = new StringBuilder().append("vd.HA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return stackIn_30_0 != 0;
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1);
              if (((vd) this).b(true).field_E < 4) {
                param1.h(4, 0);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vd.Q(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static int b(int param0, int param1) {
        if (!(param1 >= 0)) {
            param1 = -param1;
        }
        int var2 = 0;
        if (!(param1 <= 65535)) {
            var2 = var2 | 16;
            param1 = param1 >>> 16;
        }
        if (!(param1 <= 255)) {
            param1 = param1 >>> 8;
            var2 = var2 | 8;
        }
        if (param1 > 15) {
            var2 = var2 | 4;
            param1 = param1 >>> 4;
        }
        if (param1 > 3) {
            var2 = var2 | 2;
            param1 = param1 >>> 2;
        }
        if (param1 > param0) {
            var2 = var2 | 1;
            param1 = param1 >>> 1;
        }
        return var2;
    }

    final void a(fsa param0, byte param1) {
        try {
            ((vd) this).field_r = param0;
            int var3_int = -100 % ((param1 - -10) / 56);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vd.EA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(fsa param0, int param1) {
        if (param1 != 2) {
            return;
        }
        try {
            ((vd) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vd.JA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((vd) this).field_t = 114;
        }
        return 11;
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, pc param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            var7_int = 16;
            if (!param0) {
              var8 = hm.a(param4.field_a, (byte) -15, param2, param2 + param5, param1 + param3, var7_int, param4.field_e, param4.field_k, param4.field_d, param3);
              if (var8 <= 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var9 = wm.a(1 << var7_int, var8, -75);
                param4.a(var9, (byte) 47);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("vd.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param5 + 41);
        }
        return stackIn_7_0 != 0;
    }

    private final boolean a(pc param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ((vd) this).field_g.d(param1 + 4) + -(((vd) this).field_g.c(param1 + -54) / 2);
              var4 = ((vd) this).field_g.e(9648) - ((vd) this).field_g.a((byte) 55) / 2;
              var5 = -((vd) this).field_y + (-var3_int + param0.field_d);
              var6 = param0.field_e + -var3_int - ((vd) this).field_y;
              var7 = param0.field_k - (((vd) this).field_w + var4);
              var8 = param0.field_a + -((vd) this).field_w + -var4;
              if (param1 == -1) {
                break L1;
              } else {
                var18 = null;
                boolean discarded$1 = ((vd) this).a(10, -109, (pc) null, 116);
                break L1;
              }
            }
            var9 = new nf();
            var9.a(var6, var7, ((vd) this).field_z.field_a, ((vd) this).field_t, var5, 0, ((vd) this).field_z.field_f, var8);
            L2: while (true) {
              if (var9.field_d) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L3: {
                  var10 = var9.b((byte) 75);
                  var11 = var9.b(2);
                  if (((vd) this).field_z.b((byte) -5, var11, var10) <= 0) {
                    break L3;
                  } else {
                    var12 = 16;
                    var13 = ((vd) this).field_t * var10;
                    var14 = ((vd) this).field_t * var11;
                    var15 = hm.a(var8, (byte) -15, var13, ((vd) this).field_t + var13, var14 + ((vd) this).field_t, var12, var6, var7, var5, var14);
                    if (var15 > 0) {
                      var16 = wm.a(1 << var12, var15, -51);
                      param0.a(var16, (byte) 47);
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    } else {
                      break L3;
                    }
                  }
                }
                var9.d(param1 ^ -102);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("vd.DA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
            ((vd) this).field_x = 97;
        }
        ((vd) this).field_v = param1;
    }

    private final void c(int param0) {
        qea var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        loa var12_ref_loa = null;
        int var13 = 0;
        int[][] var13_ref_int____ = null;
        int var14 = 0;
        Object var15 = null;
        Object var16 = null;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        av var24 = null;
        int[][] var25 = null;
        la var26 = null;
        kh var27 = null;
        kh var28 = null;
        kh var29 = null;
        int[][] var32 = null;
        int[][] var35 = null;
        int[][] var38 = null;
        int[][] var39 = null;
        int[][] var40 = null;
        var22 = TombRacer.field_G ? 1 : 0;
        if (((vd) this).field_g == null) {
          return;
        } else {
          L0: {
            var26 = ((vd) this).b(true);
            var3 = ((vd) this).o((byte) 46);
            var4 = ((vd) this).field_g.c(-34) / ((vd) this).field_t;
            var5 = ((vd) this).field_g.a((byte) 55) / ((vd) this).field_t;
            if (~(var4 / 2 * 2) != ~var4) {
              break L0;
            } else {
              var4--;
              break L0;
            }
          }
          L1: {
            if (~var5 == ~(2 * (var5 / 2))) {
              var5--;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!((vd) this).field_u) {
              break L2;
            } else {
              if (~(((vd) this).field_t * var4) >= ~(((vd) this).field_g.c(-109) - 2097152)) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            var6 = var4 / 2;
            var7 = -2 + var5;
            if (~var6 == ~(2 * (var6 / 2))) {
              if (((vd) this).b(true).h((byte) -77)) {
                var6++;
                break L3;
              } else {
                var6--;
                break L3;
              }
            } else {
              break L3;
            }
          }
          var8 = 1;
          if (var4 < 3) {
            return;
          } else {
            if (var5 < 3) {
              return;
            } else {
              var9 = 0;
              var10 = 0;
              var11 = null;
              L4: while (true) {
                L5: {
                  if (var9 != 0) {
                    break L5;
                  } else {
                    var12_ref_loa = lba.a((byte) 27, var3, ((vd) this).field_s);
                    ((vd) this).field_z = var12_ref_loa.a(var5, var6, var4, -122, var8);
                    ((vd) this).field_z.a(1 + var7, 0, 0, var6);
                    ((vd) this).field_z.a(0, 0, 0, var6);
                    var24 = new av(((vd) this).field_z);
                    var11 = (Object) (Object) var24;
                    var24.a(var7 - -1, 0, var6, 124, var6);
                    var38 = var24.b((byte) 125);
                    var35 = var38;
                    var32 = var35;
                    var25 = var32;
                    var13_ref_int____ = var25;
                    if (var13_ref_int____ == null) {
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          if (var5 < 5) {
                            break L7;
                          } else {
                            if (5 > var4) {
                              break L7;
                            } else {
                              if (var5 >= var38.length) {
                                var9 = 0;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        L8: {
                          if (0 == ((vd) this).field_x) {
                            break L8;
                          } else {
                            if (var38.length < -(var10 * 2) + ((vd) this).field_x) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (0 == ((vd) this).field_q) {
                            break L9;
                          } else {
                            if (~(var10 * 2 + ((vd) this).field_q) < ~var38.length) {
                              break L9;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var9 = 1;
                        break L6;
                      }
                      var10++;
                      continue L4;
                    }
                  }
                }
                ((vd) this).field_y = (((vd) this).field_g.c(-30) + -(((vd) this).field_t * ((vd) this).field_z.field_f)) / 2;
                ((vd) this).field_w = (((vd) this).field_g.a((byte) 55) + -(((vd) this).field_z.field_a * ((vd) this).field_t)) / 2;
                var12 = ((vd) this).field_y + -(((vd) this).field_g.c(-12) / 2) + ((vd) this).field_t / 2;
                var13 = ((vd) this).field_w + -(((vd) this).field_g.a((byte) 55) / 2) - -(((vd) this).field_t / 2);
                if (!((vd) this).field_u) {
                  L10: {
                    var14 = var26.field_E;
                    var26.field_E = 26;
                    var15 = null;
                    var16 = null;
                    var17 = null;
                    if (((vd) this).field_r == null) {
                      break L10;
                    } else {
                      if (!((vd) this).field_r.J(90)) {
                        var27 = new kh(30000);
                        var15 = (Object) (Object) var27;
                        var27.i(8);
                        ((vd) this).field_r.a(var27, 125);
                        var27.k(-1826190686);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (null == ((vd) this).field_A) {
                      break L11;
                    } else {
                      if (!((vd) this).field_A.J(51)) {
                        var28 = new kh(30000);
                        var16 = (Object) (Object) var28;
                        var28.i(8);
                        ((vd) this).field_A.a(var28, 84);
                        var28.k(-1826190686);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (null == ((vd) this).field_o) {
                      break L12;
                    } else {
                      if (!((vd) this).field_o.J(73)) {
                        var29 = new kh(30000);
                        var17 = (Object) (Object) var29;
                        var29.i(8);
                        ((vd) this).field_o.a(var29, -112);
                        var29.k(-1826190686);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var18 = 0;
                  L13: while (true) {
                    if (((vd) this).field_z.field_f <= var18) {
                      L14: {
                        if (((vd) this).field_v > 0) {
                          var39 = ((av) var11).a((byte) -72);
                          var40 = new int[((vd) this).field_v][2];
                          var20 = 0;
                          L15: while (true) {
                            if (~var20 <= ~((vd) this).field_v) {
                              var23 = 0;
                              var20 = var23;
                              L16: while (true) {
                                if (((vd) this).field_v <= var23) {
                                  break L14;
                                } else {
                                  this.a(var40[var23][0], var13, var40[var23][1], -113, (kh) var17, var12);
                                  var23++;
                                  continue L16;
                                }
                              }
                            } else {
                              L17: {
                                if (var39.length <= var20) {
                                  L18: while (true) {
                                    if (0 == ((vd) this).field_z.b((byte) -5, var40[var20][1], var40[var20][0])) {
                                      break L17;
                                    } else {
                                      var40[var20][0] = 1 - -var3.a(-2 + ((vd) this).field_z.field_f, 0);
                                      var40[var20][1] = 1 - -var3.a(-2 + ((vd) this).field_z.field_a, 0);
                                      continue L18;
                                    }
                                  }
                                } else {
                                  var21 = var3.a(var39.length, 0);
                                  L19: while (true) {
                                    if (var39[var21][0] != -1) {
                                      var40[var20][0] = var39[var21][0];
                                      var40[var20][1] = var39[var21][1];
                                      var39[var21][0] = -1;
                                      break L17;
                                    } else {
                                      var21++;
                                      if (var21 < var39.length) {
                                        continue L19;
                                      } else {
                                        var21 = 0;
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                              }
                              var20++;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                      var26.field_E = var14;
                      return;
                    } else {
                      var19 = 0;
                      L20: while (true) {
                        if (((vd) this).field_z.field_a <= var19) {
                          var18++;
                          continue L13;
                        } else {
                          L21: {
                            if (((vd) this).field_z.b((byte) -5, var19, var18) > 0) {
                              this.a(var18, var13, var19, -58, (kh) var15, var12);
                              break L21;
                            } else {
                              this.a(var18, var13, var19, -44, (kh) var16, var12);
                              break L21;
                            }
                          }
                          var19++;
                          continue L20;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    vd(la param0, boolean param1) {
        super(param0, param1);
        ((vd) this).field_u = false;
        ((vd) this).field_t = 2097152;
        try {
            ((vd) this).field_r = new fsa(param0, false);
            wd.a((byte) -98, 1, true, param0, ((vd) this).field_r, false);
            ((vd) this).field_r.b(false, 11468);
            ((vd) this).field_A = new fsa(param0, false);
            ((vd) this).field_o = new fsa(param0, false);
            this.d(true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (((vd) this).field_u) {
              if (null == ((vd) this).field_z) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                L1: {
                  var5_int = 0;
                  if (0 >= ((vd) this).field_y) {
                    break L1;
                  } else {
                    L2: {
                      var6 = ((vd) this).field_g.d(3) - ((vd) this).field_g.c(-49) / 2;
                      var7 = ((vd) this).field_g.e(9648) - (((vd) this).field_g.a((byte) 55) / 2 - ((vd) this).field_w);
                      var8 = ((vd) this).field_t * ((vd) this).field_z.field_f;
                      var9 = ((vd) this).field_z.field_a * ((vd) this).field_t;
                      var10 = ((vd) this).field_y + var8;
                      if (!this.a(false, var9, var6, var7, param2, ((vd) this).field_y)) {
                        if (var5_int != 0) {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        } else {
                          stackOut_11_0 = 0;
                          stackIn_14_0 = stackOut_11_0;
                          break L2;
                        }
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_14_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var5_int = stackIn_14_0;
                      if (!this.a(false, var9, var10 + var6, var7, param2, ((vd) this).field_g.c(-45) + -var10)) {
                        if (var5_int != 0) {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L3;
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_20_0 = stackOut_17_0;
                          break L3;
                        }
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_20_0 = stackOut_15_0;
                        break L3;
                      }
                    }
                    var5_int = stackIn_20_0;
                    break L1;
                  }
                }
                L4: {
                  if (param1 == 1) {
                    break L4;
                  } else {
                    var11 = null;
                    boolean discarded$1 = ((vd) this).a(-49, 56, -14, 110, -69, 19, (ffa) null);
                    break L4;
                  }
                }
                L5: {
                  if (this.a(param2, param1 ^ -2)) {
                    stackOut_27_0 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    break L5;
                  } else {
                    if (var5_int != 0) {
                      stackOut_26_0 = 1;
                      stackIn_29_0 = stackOut_26_0;
                      break L5;
                    } else {
                      stackOut_25_0 = 0;
                      stackIn_29_0 = stackOut_25_0;
                      break L5;
                    }
                  }
                }
                var5_int = stackIn_29_0;
                stackOut_29_0 = var5_int;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("vd.K(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param3 + 41);
        }
        return stackIn_30_0 != 0;
    }

    private final void a(int param0, int param1, int param2, int param3, kh param4, int param5) {
        fsa var8 = null;
        if (!(param4 != null)) {
            return;
        }
        la var7 = ((vd) this).b(true);
        param4.field_h = 0;
        if (param3 >= -41) {
            return;
        }
        try {
            param4.h((byte) 123);
            var8 = new fsa(var7, param4, true);
            param4.i((byte) 98);
            var8.d((byte) -97, true);
            var8.m(1, param5 - -(((vd) this).field_t * param0));
            var8.c(param1 + ((vd) this).field_t * param2, -19879);
            ((vd) this).field_g.a(-97, var8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vd.AA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    vd(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        ((vd) this).field_u = false;
        ((vd) this).field_t = 2097152;
        try {
          L0: {
            L1: {
              ((vd) this).field_s = param1.b((byte) 44, 2);
              if (param0.field_E >= 4) {
                L2: {
                  ((vd) this).field_t = param1.b((byte) 44, 10) << 16;
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (1 == param1.b((byte) 44, 1)) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L2;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L2;
                  }
                }
                ((vd) this).field_u = stackIn_6_1 != 0;
                break L1;
              } else {
                ((vd) this).field_t = 2097152;
                ((vd) this).field_u = true;
                break L1;
              }
            }
            L3: {
              if (param0.field_E < 11) {
                break L3;
              } else {
                ((vd) this).field_x = param1.b((byte) 44, 7);
                ((vd) this).field_q = param1.b((byte) 44, 7);
                ((vd) this).field_v = param1.b((byte) 44, 3);
                break L3;
              }
            }
            L4: {
              ((vd) this).field_o = null;
              if (((vd) this).field_u) {
                ((vd) this).field_r = new fsa(param0, false);
                wd.a((byte) -120, 1, true, param0, ((vd) this).field_r, false);
                ((vd) this).field_A = new fsa(param0, false);
                break L4;
              } else {
                ((vd) this).field_r = new fsa(param0, param1, false);
                ((vd) this).field_A = new fsa(param0, param1, false);
                if (((vd) this).field_v <= 0) {
                  break L4;
                } else {
                  if (14 > param0.field_E) {
                    break L4;
                  } else {
                    ((vd) this).field_o = new fsa(param0, param1, false);
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (((vd) this).field_o == null) {
                ((vd) this).field_o = new fsa(param0, false);
                wd.a((byte) -93, 7, true, param0, ((vd) this).field_o, false);
                this.d(true);
                break L5;
              } else {
                this.d(true);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("vd.<init>(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 41);
        }
    }

    private final void d(boolean param0) {
        if (1048576 > ((vd) this).field_t) {
            ((vd) this).field_t = 1048576;
        }
        ((vd) this).field_r.c((byte) 77, false);
        ((vd) this).field_r.b((byte) -11, ((vd) this).field_t, ((vd) this).field_t);
        ((vd) this).field_A.c((byte) 59, false);
        ((vd) this).field_A.b((byte) -11, ((vd) this).field_t, ((vd) this).field_t);
    }

    final void a(byte param0, fsa param1) {
        if (param0 > -115) {
            return;
        }
        try {
            ((vd) this).field_A = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vd.FA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, int param1) {
        ((vd) this).field_s = param1;
        if (param0) {
            ((vd) this).n((byte) 51);
        }
    }

    final void h(int param0) {
        super.h(param0);
    }

    final void a(boolean param0, kh param1) {
        RuntimeException var3 = null;
        kh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              param1.a((byte) -41, ((vd) this).field_s, 2);
              param1.a((byte) 42, ((vd) this).field_t >> 16, 10);
              stackOut_0_0 = (kh) param1;
              stackOut_0_1 = 125;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (!((vd) this).field_u) {
                stackOut_2_0 = (kh) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (kh) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
              param1.a((byte) -128, ((vd) this).field_x, 7);
              param1.a((byte) 113, ((vd) this).field_q, 7);
              param1.a((byte) -127, ((vd) this).field_v, 3);
              if (((vd) this).field_u) {
                break L2;
              } else {
                ((vd) this).field_r.a(param1, 85);
                ((vd) this).field_A.a(param1, 126);
                if (((vd) this).field_v <= 0) {
                  break L2;
                } else {
                  ((vd) this).field_o.a(param1, -10);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("vd.F(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void b(byte param0, boolean param1) {
        ((vd) this).field_u = param1 ? true : false;
        if (param0 < 60) {
            ((vd) this).field_A = null;
        }
    }

    final static void b(int param0) {
        if (!una.a((byte) 105)) {
            return;
        }
        qna.a(1, false, 4);
    }

    final void k(int param0) {
        if (param0 != 5418) {
            Object var3 = null;
            boolean discarded$0 = this.a(false, -81, 38, -44, (pc) null, -15);
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            ((vd) this).field_A = null;
        }
        return param0;
    }

    final void n(byte param0) {
        super.n((byte) 105);
        this.c(127);
        if (param0 <= 68) {
            ((vd) this).field_r = null;
        }
    }

    static {
    }
}
