/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends jj {
    private kf field_H;
    static int field_J;
    private String field_N;
    private int field_L;
    private le field_I;
    static int[] field_K;
    static le field_M;

    final static boolean c(boolean param0) {
        if (param0) {
            return false;
        }
        if (k.field_g < 10) {
            return false;
        }
        if (mc.field_a < 13) {
            return false;
        }
        return true;
    }

    final String a(byte param0) {
        if (param0 == 54) {
            return null;
        }
        field_K = null;
        return null;
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
            ((vg) this).field_L = ((vg) this).field_L + 1;
            if (param3 > -13) {
                field_M = null;
            }
            super.a(param0, param1, param2, (byte) -89);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "vg.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("vg.AA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    vg(kf param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ml) (Object) bk.a());
        int discarded$0 = 1;
        try {
            ((vg) this).field_N = param1;
            ((vg) this).field_H = param0;
            ((vg) this).a(param5, 13361, param2, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "vg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        na var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        le var16 = null;
        String var17 = null;
        Object var18 = null;
        le var19 = null;
        le var20 = null;
        le var21 = null;
        Object var22 = null;
        le var23 = null;
        le var24 = null;
        le var25 = null;
        le var26 = null;
        Object var28 = null;
        le var29 = null;
        le var30 = null;
        le var31 = null;
        ui var32 = null;
        ui var33 = null;
        ui var34 = null;
        L0: {
          var18 = null;
          var22 = null;
          var28 = null;
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          var6 = ((vg) this).field_H.b(false);
          if (ke.field_d == var6) {
            break L0;
          } else {
            if (var6 != f.field_g) {
              L1: {
                var5 = ((vg) this).field_H.b((byte) -123);
                if (var5 != null) {
                  break L1;
                } else {
                  var5 = ((vg) this).field_N;
                  break L1;
                }
              }
              if (var5.equals((Object) (Object) ((vg) this).field_s)) {
                L2: {
                  super.a(param0, param1, param2, param3);
                  var6 = ((vg) this).field_H.b(false);
                  var34 = (ui) (Object) ((vg) this).field_h;
                  var9 = ((vg) this).field_r + param3;
                  var10 = var34.a((we) this, -73, param2) - -(var34.a(-1, (we) this).b(62) >> 1);
                  if (var6 == ke.field_d) {
                    break L2;
                  } else {
                    if (var6 == f.field_g) {
                      break L2;
                    } else {
                      if (ol.field_h != var6) {
                        if (var6 != wj.field_i) {
                          return;
                        } else {
                          var29 = hk.field_i[1];
                          var29.c(var9, var10 - (var29.field_j >> 1), 256);
                          return;
                        }
                      } else {
                        var30 = hk.field_i[2];
                        var30.c(var9, var10 + -(var30.field_j >> 1), 256);
                        return;
                      }
                    }
                  }
                }
                var31 = hk.field_i[0];
                var11 = var31.field_m << 1;
                var12 = var31.field_n << 1;
                if (((vg) this).field_I != null) {
                  if (((vg) this).field_I.field_k >= var11) {
                    if (((vg) this).field_I.field_j < var12) {
                      ((vg) this).field_I = new le(var11, var12);
                      mc.a(param0 ^ -8495, ((vg) this).field_I);
                      var31.b(112, 144, var31.field_m << 4, var31.field_n << 4, -((vg) this).field_L << 10, 4096);
                      tj.b(param0 ^ 659);
                      ((vg) this).field_I.c(-(var31.field_m >> 1) + var9, var10 + -var31.field_n, 256);
                      return;
                    } else {
                      mc.a(-8497, ((vg) this).field_I);
                      ge.d();
                      var31.b(112, 144, var31.field_m << 4, var31.field_n << 4, -((vg) this).field_L << 10, 4096);
                      tj.b(param0 ^ 659);
                      ((vg) this).field_I.c(-(var31.field_m >> 1) + var9, var10 + -var31.field_n, 256);
                      return;
                    }
                  } else {
                    ((vg) this).field_I = new le(var11, var12);
                    mc.a(param0 ^ -8495, ((vg) this).field_I);
                    var31.b(112, 144, var31.field_m << 4, var31.field_n << 4, -((vg) this).field_L << 10, 4096);
                    tj.b(param0 ^ 659);
                    ((vg) this).field_I.c(-(var31.field_m >> 1) + var9, var10 + -var31.field_n, 256);
                    return;
                  }
                } else {
                  ((vg) this).field_I = new le(var11, var12);
                  mc.a(param0 ^ -8495, ((vg) this).field_I);
                  var31.b(112, 144, var31.field_m << 4, var31.field_n << 4, -((vg) this).field_L << 10, 4096);
                  tj.b(param0 ^ 659);
                  ((vg) this).field_I.c(-(var31.field_m >> 1) + var9, var10 + -var31.field_n, 256);
                  return;
                }
              } else {
                ((vg) this).field_s = var5;
                ((vg) this).a(true);
                super.a(param0, param1, param2, param3);
                var6 = ((vg) this).field_H.b(false);
                var33 = (ui) (Object) ((vg) this).field_h;
                var9 = ((vg) this).field_r + param3;
                var10 = var33.a((we) this, -73, param2) - -(var33.a(-1, (we) this).b(62) >> 1);
                if (var6 != ke.field_d) {
                  if (var6 == f.field_g) {
                    var26 = hk.field_i[0];
                    var16 = var26;
                    var11 = var26.field_m << 1;
                    var12 = var26.field_n << 1;
                    if (((vg) this).field_I != null) {
                      if (((vg) this).field_I.field_k >= var11) {
                        if (((vg) this).field_I.field_j < var12) {
                          ((vg) this).field_I = new le(var11, var12);
                          mc.a(param0 ^ -8495, ((vg) this).field_I);
                          var26.b(112, 144, var26.field_m << 4, var26.field_n << 4, -((vg) this).field_L << 10, 4096);
                          tj.b(param0 ^ 659);
                          ((vg) this).field_I.c(-(var26.field_m >> 1) + var9, var10 + -var26.field_n, 256);
                          return;
                        } else {
                          mc.a(-8497, ((vg) this).field_I);
                          ge.d();
                          var26.b(112, 144, var26.field_m << 4, var26.field_n << 4, -((vg) this).field_L << 10, 4096);
                          tj.b(param0 ^ 659);
                          ((vg) this).field_I.c(-(var26.field_m >> 1) + var9, var10 + -var26.field_n, 256);
                          return;
                        }
                      } else {
                        ((vg) this).field_I = new le(var11, var12);
                        mc.a(param0 ^ -8495, ((vg) this).field_I);
                        var26.b(112, 144, var26.field_m << 4, var26.field_n << 4, -((vg) this).field_L << 10, 4096);
                        tj.b(param0 ^ 659);
                        ((vg) this).field_I.c(-(var26.field_m >> 1) + var9, var10 + -var26.field_n, 256);
                        return;
                      }
                    } else {
                      ((vg) this).field_I = new le(var11, var12);
                      mc.a(param0 ^ -8495, ((vg) this).field_I);
                      var26.b(112, 144, var26.field_m << 4, var26.field_n << 4, -((vg) this).field_L << 10, 4096);
                      tj.b(param0 ^ 659);
                      ((vg) this).field_I.c(-(var26.field_m >> 1) + var9, var10 + -var26.field_n, 256);
                      return;
                    }
                  } else {
                    if (ol.field_h != var6) {
                      if (var6 == wj.field_i) {
                        var24 = hk.field_i[1];
                        var24.c(var9, var10 - (var24.field_j >> 1), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var25 = hk.field_i[2];
                      var25.c(var9, var10 + -(var25.field_j >> 1), 256);
                      return;
                    }
                  }
                } else {
                  L3: {
                    L4: {
                      var23 = hk.field_i[0];
                      var11 = var23.field_m << 1;
                      var12 = var23.field_n << 1;
                      if (((vg) this).field_I == null) {
                        break L4;
                      } else {
                        if (((vg) this).field_I.field_k < var11) {
                          break L4;
                        } else {
                          if (((vg) this).field_I.field_j < var12) {
                            break L4;
                          } else {
                            mc.a(-8497, ((vg) this).field_I);
                            ge.d();
                            break L3;
                          }
                        }
                      }
                    }
                    ((vg) this).field_I = new le(var11, var12);
                    mc.a(param0 ^ -8495, ((vg) this).field_I);
                    break L3;
                  }
                  var23.b(112, 144, var23.field_m << 4, var23.field_n << 4, -((vg) this).field_L << 10, 4096);
                  tj.b(param0 ^ 659);
                  ((vg) this).field_I.c(-(var23.field_m >> 1) + var9, var10 + -var23.field_n, 256);
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
        L5: {
          var17 = w.field_a;
          if (var17.equals((Object) (Object) ((vg) this).field_s)) {
            break L5;
          } else {
            ((vg) this).field_s = var17;
            ((vg) this).a(true);
            break L5;
          }
        }
        super.a(param0, param1, param2, param3);
        var6 = ((vg) this).field_H.b(false);
        var32 = (ui) (Object) ((vg) this).field_h;
        var9 = ((vg) this).field_r + param3;
        var10 = var32.a((we) this, -73, param2) - -(var32.a(-1, (we) this).b(62) >> 1);
        if (var6 != ke.field_d) {
          if (var6 != f.field_g) {
            if (ol.field_h != var6) {
              if (var6 != wj.field_i) {
                return;
              } else {
                var19 = hk.field_i[1];
                var19.c(var9, var10 - (var19.field_j >> 1), 256);
                return;
              }
            } else {
              var20 = hk.field_i[2];
              var20.c(var9, var10 + -(var20.field_j >> 1), 256);
              return;
            }
          } else {
            L6: {
              L7: {
                var21 = hk.field_i[0];
                var11 = var21.field_m << 1;
                var12 = var21.field_n << 1;
                if (((vg) this).field_I == null) {
                  break L7;
                } else {
                  if (((vg) this).field_I.field_k < var11) {
                    break L7;
                  } else {
                    if (((vg) this).field_I.field_j < var12) {
                      break L7;
                    } else {
                      mc.a(-8497, ((vg) this).field_I);
                      ge.d();
                      break L6;
                    }
                  }
                }
              }
              ((vg) this).field_I = new le(var11, var12);
              mc.a(param0 ^ -8495, ((vg) this).field_I);
              break L6;
            }
            var21.b(112, 144, var21.field_m << 4, var21.field_n << 4, -((vg) this).field_L << 10, 4096);
            tj.b(param0 ^ 659);
            ((vg) this).field_I.c(-(var21.field_m >> 1) + var9, var10 + -var21.field_n, 256);
            return;
          }
        } else {
          L8: {
            L9: {
              var21 = hk.field_i[0];
              var11 = var21.field_m << 1;
              var12 = var21.field_n << 1;
              if (((vg) this).field_I == null) {
                break L9;
              } else {
                if (((vg) this).field_I.field_k < var11) {
                  break L9;
                } else {
                  if (((vg) this).field_I.field_j < var12) {
                    break L9;
                  } else {
                    mc.a(-8497, ((vg) this).field_I);
                    ge.d();
                    break L8;
                  }
                }
              }
            }
            ((vg) this).field_I = new le(var11, var12);
            mc.a(param0 ^ -8495, ((vg) this).field_I);
            break L8;
          }
          var21.b(112, 144, var21.field_m << 4, var21.field_n << 4, -((vg) this).field_L << 10, 4096);
          tj.b(param0 ^ 659);
          ((vg) this).field_I.c(-(var21.field_m >> 1) + var9, var10 + -var21.field_n, 256);
          return;
        }
    }

    final static boolean a(int param0, hb param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 59) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = vg.a(122, (hb) null);
                break L1;
              }
            }
            L2: {
              if (param1.f(8, 1) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("vg.BA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    public static void k(int param0) {
        field_M = null;
        field_K = null;
        if (param0 != -3114) {
            vg.k(-104);
        }
    }

    final static void a() {
        if (ol.field_e <= 32) {
            w.a(-1, 0);
            return;
        }
        w.a(-1, -32 + ol.field_e);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = 200;
        field_K = new int[]{12348480, 16059704, 16770581, 7783495, 4555448};
    }
}
