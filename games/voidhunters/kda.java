/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kda {
    private ij field_i;
    private int field_d;
    private boolean field_l;
    private int field_b;
    private int field_n;
    private ij field_c;
    ova field_j;
    private boolean field_o;
    private boolean field_p;
    private boolean field_a;
    private boolean field_e;
    private int[] field_k;
    private int field_h;
    um field_m;
    private boolean field_q;
    private int field_f;
    static String field_g;

    final int b(boolean param0, int param1) {
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (null == ((kda) this).field_k) {
              break L0;
            } else {
              if (param1 >= ((kda) this).field_k.length) {
                break L0;
              } else {
                if (param0) {
                  return ((kda) this).field_k[param1];
                } else {
                  return 123;
                }
              }
            }
          }
        }
        return -1;
    }

    final void a(byte param0) {
        ((kda) this).field_a = false;
        int var2 = -6 % ((param0 - -48) / 43);
    }

    final int a(boolean param0, int param1) {
        ((kda) this).field_a = false;
        ((kda) this).field_o = false;
        ((kda) this).field_c.e(110);
        int var3 = ((kda) this).field_n;
        ((kda) this).field_n = 0;
        ((kda) this).field_i = new ij();
        if (param1 != -13027) {
            ((kda) this).field_m = null;
        }
        iva.a(-6940, "Called Carousel_clientgame.start_game(), resetting any buffered events");
        ((kda) this).field_b = 0;
        ((kda) this).field_h = 2147483647;
        if (!(param0)) {
            ((kda) this).field_k = null;
            ((kda) this).field_d = 0;
        }
        ((kda) this).field_f = 0;
        ((kda) this).field_p = false;
        ((kda) this).field_e = false;
        return var3;
    }

    private final void a(byte param0, int param1) {
        if (param0 != 85) {
            ((kda) this).field_i = null;
        }
        ((kda) this).field_d = param1;
    }

    final byte[] b(faa param0, int param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
              ((kda) this).field_m.a((ds) (Object) param0, param1 ^ 900, nia.field_o);
              if (param1 == 1000) {
                break L1;
              } else {
                boolean discarded$2 = ((kda) this).a(-52);
                break L1;
              }
            }
            ((kda) this).field_a = true;
            var4 = ((kda) this).field_m.b(-30223);
            var3 = var4;
            stackOut_2_0 = (byte[]) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("kda.BA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(mib param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uqb var11 = null;
        tja var11_ref = null;
        int var12 = 0;
        bhb var13 = null;
        lla var14 = null;
        int var16 = 0;
        byte[] var20 = null;
        mib stackIn_21_0 = null;
        mib stackIn_22_0 = null;
        mib stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        mib stackOut_20_0 = null;
        mib stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        mib stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4) {
                param3 = param3 - lla.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            if (((kda) this).field_h < param3) {
              L2: {
                var6_int = -param0.field_g + param3;
                var7 = ((kda) this).c(param2 + -1000) / 2;
                var8 = ela.field_p * var7 / param2;
                var9 = foa.field_q / 2 - -(2 * var8);
                if (-var9 > var6_int) {
                  var10 = -var6_int + shb.field_k;
                  if (var10 >= param0.c((byte) 114)) {
                    iva.a(param2 ^ -6388, "Carousel_clientgame_Info.check_servercrc_against_clientcrc was going to look " + var10 + " steps back");
                    return;
                  } else {
                    var11 = (uqb) (Object) param0.field_f.d(0);
                    L3: while (true) {
                      if (var11 == null) {
                        L4: {
                          var11_ref = param0.a(var10, param2 ^ -949);
                          var12 = tmb.a((tv) (Object) var11_ref, (byte) -70);
                          stackOut_20_0 = (mib) param0;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var12 == param1) {
                            stackOut_22_0 = (mib) (Object) stackIn_22_0;
                            stackOut_22_1 = 0;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            break L4;
                          } else {
                            stackOut_21_0 = (mib) (Object) stackIn_21_0;
                            stackOut_21_1 = 1;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            break L4;
                          }
                        }
                        stackIn_23_0.field_k = stackIn_23_1 != 0;
                        if (!param0.field_k) {
                          break L2;
                        } else {
                          if (((kda) this).field_e) {
                            break L2;
                          } else {
                            if (lw.field_f) {
                              L5: {
                                ((kda) this).field_e = true;
                                iva.a(-6940, "Carousel_clientgame: Now out of sync for server tick " + param3 + ", which is " + -var6_int + " ticks back, so dumping state");
                                if (null == ((kda) this).field_j) {
                                  ((kda) this).field_j = new ova(kha.field_v);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              if (!((kda) this).field_j.a(param2 + -1000)) {
                                break L2;
                              } else {
                                iva.a(-6940, "Carousel_clientgame: Sending the state dump to the server");
                                var13 = new bhb(-var10 + param0.field_g, bk.field_w);
                                var14 = new lla();
                                var14.a(84, 0, var13.field_d, var13.field_d.length);
                                var20 = wi.a((byte) 10, var14.field_f);
                                ((kda) this).field_j.a(var20, 0);
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        L6: {
                          if (var11.a(115)) {
                            break L6;
                          } else {
                            if (-var10 + param0.field_g >= var11.field_e) {
                              iva.a(-6940, "Carousel_clientgame_Info.check_servercrc_against_clientcrc was going to look " + var10 + " steps back when unconfirmed event was back by " + (-var11.field_e + param0.field_g));
                              return;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var11 = (uqb) (Object) param0.field_f.a((byte) 36);
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("kda.U(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(mib param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
            var3_int = ((kda) this).c(0) * ela.field_p / param1;
            var4 = wsb.field_f + -var3_int;
            if (param0.field_c <= var4) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kda.K(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final boolean a(byte param0, mib param1, int param2, faa param3) {
        uqb var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
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
        try {
          L0: {
            L1: {
              if (!((kda) this).field_l) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (!((kda) this).field_p) {
                    iva.a(-6940, "Carousel_clientgame: Sending ready packet");
                    var5 = (uqb) (Object) wc.field_a.a((byte) 77);
                    var5.field_e = param1.field_g;
                    var5.a(param2, -125);
                    int discarded$2 = 1000;
                    this.a(var5, param3);
                    ((kda) this).field_p = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 == 110) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("kda.G(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, faa param1) {
        whb var3 = null;
        if (param0 != -32339) {
            return;
        }
        try {
            var3 = new whb();
            var3.field_b = (ub) (Object) new mo("<RequestNewestBlackBox>");
            rkb.a(0, (tv) (Object) var3, param1, fk.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kda.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, uqb param1, mib param2, boolean param3, boolean param4, int param5, faa param6) {
        RuntimeException var8 = null;
        uqb var8_ref = null;
        Object var9 = null;
        uqb stackIn_7_0 = null;
        uqb stackIn_8_0 = null;
        uqb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        uqb stackOut_6_0 = null;
        uqb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        uqb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
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
            L1: {
              L2: {
                if (!param4) {
                  break L2;
                } else {
                  if (!((kda) this).field_l) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param2.f(1)) {
                break L1;
              } else {
                L3: {
                  stackOut_6_0 = (uqb) param1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (param4) {
                    stackOut_8_0 = (uqb) (Object) stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = (uqb) (Object) stackIn_7_0;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L3;
                  }
                }
                L4: {
                  stackIn_9_0.field_f = stackIn_9_1 != 0;
                  if (param0) {
                    break L4;
                  } else {
                    var9 = null;
                    ((kda) this).b((mib) null, 33);
                    break L4;
                  }
                }
                L5: {
                  param1.field_e = -param5 + param2.field_g;
                  if (hna.field_s != 1) {
                    break L5;
                  } else {
                    if (((kda) this).field_f >= param1.field_e) {
                      return;
                    } else {
                      break L5;
                    }
                  }
                }
                if (!this.a(param2, 1000)) {
                  L6: {
                    ((kda) this).field_f = param1.field_e;
                    if (param4) {
                      if (param3) {
                        var8_ref = (uqb) (Object) wc.field_a.a((byte) 49);
                        param1.b((byte) 75, (tv) (Object) var8_ref);
                        ((kda) this).field_i.b(-10258, (ksa) (Object) var8_ref);
                        break L6;
                      } else {
                        int discarded$1 = 1000;
                        this.a(param1, param6);
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (param2.a(1, param1)) {
                      break L7;
                    } else {
                      tfb.a((byte) -101, "Carousel_clientgame: Added an action off your own carousel! " + (Object) (Object) param1);
                      break L7;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var8;
            stackOut_25_1 = new StringBuilder().append("kda.I(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
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
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    private final void a(uqb param0, faa param1) {
        try {
            em.field_o = false;
            rkb.a(0, (tv) (Object) param0, param1, pra.field_o);
            em.field_o = true;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kda.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 1000 + ')');
        }
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 <= 4) {
            kda.b(-77);
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
            field_g = null;
        }
        return ((kda) this).field_d;
    }

    final boolean a(faa param0, faa param1, boolean param2, byte param3, int param4, mib param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        byte[] var7_array = null;
        int var8_int = 0;
        faa var8 = null;
        Exception var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        af var15 = null;
        umb var16 = null;
        Object var17 = null;
        uqb var17_ref = null;
        String var18 = null;
        byte[] var19 = null;
        whb var20 = null;
        Object var21 = null;
        mo var21_ref = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int stackIn_6_0 = 0;
        Object stackIn_21_0 = null;
        mib stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        Object stackIn_22_0 = null;
        mib stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        Object stackIn_23_0 = null;
        mib stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        Object stackOut_20_0 = null;
        mib stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        Object stackOut_22_0 = null;
        mib stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        Object stackOut_21_0 = null;
        mib stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_54_0 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var17 = null;
        var21 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            if (param4 == vi.field_o) {
              L1: {
                var16 = new umb();
                param1.p(-23497);
                var16.a(param1, false);
                param1.f((byte) -38);
                if (param5 == null) {
                  break L1;
                } else {
                  if (!param5.f(1)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0 != 0;
                  }
                }
              }
              L2: {
                if (param5 == null) {
                  break L2;
                } else {
                  if (((kda) this).field_a) {
                    break L2;
                  } else {
                    if (!((kda) this).field_o) {
                      L3: {
                        var8_int = var16.field_f;
                        if (!param2) {
                          break L3;
                        } else {
                          var8_int = var8_int + foa.field_q;
                          break L3;
                        }
                      }
                      param5.a(var8_int, var16.field_e, 0);
                      if (!var16.field_e) {
                        if (((kda) this).field_l) {
                          L4: {
                            stackOut_20_0 = this;
                            stackOut_20_1 = (mib) param5;
                            stackOut_20_2 = var16.field_g;
                            stackOut_20_3 = param3 ^ 1007;
                            stackOut_20_4 = var16.field_f;
                            stackIn_22_0 = stackOut_20_0;
                            stackIn_22_1 = stackOut_20_1;
                            stackIn_22_2 = stackOut_20_2;
                            stackIn_22_3 = stackOut_20_3;
                            stackIn_22_4 = stackOut_20_4;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            stackIn_21_3 = stackOut_20_3;
                            stackIn_21_4 = stackOut_20_4;
                            if (param2) {
                              stackOut_22_0 = this;
                              stackOut_22_1 = (mib) (Object) stackIn_22_1;
                              stackOut_22_2 = stackIn_22_2;
                              stackOut_22_3 = stackIn_22_3;
                              stackOut_22_4 = stackIn_22_4;
                              stackOut_22_5 = 0;
                              stackIn_23_0 = stackOut_22_0;
                              stackIn_23_1 = stackOut_22_1;
                              stackIn_23_2 = stackOut_22_2;
                              stackIn_23_3 = stackOut_22_3;
                              stackIn_23_4 = stackOut_22_4;
                              stackIn_23_5 = stackOut_22_5;
                              break L4;
                            } else {
                              stackOut_21_0 = this;
                              stackOut_21_1 = (mib) (Object) stackIn_21_1;
                              stackOut_21_2 = stackIn_21_2;
                              stackOut_21_3 = stackIn_21_3;
                              stackOut_21_4 = stackIn_21_4;
                              stackOut_21_5 = 1;
                              stackIn_23_0 = stackOut_21_0;
                              stackIn_23_1 = stackOut_21_1;
                              stackIn_23_2 = stackOut_21_2;
                              stackIn_23_3 = stackOut_21_3;
                              stackIn_23_4 = stackOut_21_4;
                              stackIn_23_5 = stackOut_21_5;
                              break L4;
                            }
                          }
                          this.a(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, stackIn_23_5 != 0);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        L5: {
                          iva.a(param3 ^ -6941, "Carousel_clientgame: Handling catchup packet here, where targettick=" + var8_int + ",(+ " + (-param5.field_g + var8_int) + "), playinggame=" + param2);
                          param5.g(-1);
                          iva.a(-6940, "Carousel_clientgame: Tick is now " + param5.field_g);
                          if (!((kda) this).field_l) {
                            iva.a(-6940, "Carousel_clientgame: Is ready");
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((kda) this).field_h = param5.field_g;
                        ((kda) this).field_l = true;
                        break L2;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_24_0 = 1;
              stackIn_25_0 = stackOut_24_0;
              return stackIn_25_0 != 0;
            } else {
              if (pr.field_d == param4) {
                L6: {
                  var17_ref = (uqb) (Object) wc.field_a.a((byte) -126);
                  param1.p(-23497);
                  var17_ref.a(param1, false);
                  param1.f((byte) -114);
                  if (param5 == null) {
                    break L6;
                  } else {
                    if (param5.f(1)) {
                      stackOut_31_0 = 1;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0 != 0;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  L8: {
                    if (param5 == null) {
                      break L8;
                    } else {
                      if (((kda) this).field_a) {
                        break L8;
                      } else {
                        if (((kda) this).field_o) {
                          break L8;
                        } else {
                          if (!param5.a(1, var17_ref)) {
                            L9: {
                              var9_int = -1;
                              if (!(var17_ref instanceof pca)) {
                                break L9;
                              } else {
                                var9_int = ((pca) (Object) var17_ref).field_k;
                                break L9;
                              }
                            }
                            var18 = param5.e(param3 + 101).a(param3 ^ 6, var9_int);
                            tfb.a((byte) -92, "I'm " + kca.field_a + ", and an action from " + var18 + " is off carousel so dropping connection");
                            ifb.l(-118);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    if (!var17_ref.c(120)) {
                      break L10;
                    } else {
                      if (var17_ref.field_d.field_c) {
                        break L7;
                      } else {
                        break L10;
                      }
                    }
                  }
                  ((kda) this).field_c.b(-10258, (ksa) (Object) var17_ref);
                  break L7;
                }
                stackOut_45_0 = 1;
                stackIn_46_0 = stackOut_45_0;
                return stackIn_46_0 != 0;
              } else {
                L11: {
                  if (param3 == 7) {
                    break L11;
                  } else {
                    var14 = null;
                    boolean discarded$1 = this.a((mib) null, -70);
                    break L11;
                  }
                }
                if (ehb.field_g != param4) {
                  if (iva.field_o != param4) {
                    if (param4 == qha.field_o) {
                      L12: {
                        ((kda) this).field_m.a((ds) (Object) param1, 90, nia.field_o);
                        var24 = ((kda) this).field_m.b(param3 ^ -30218);
                        var23 = var24;
                        var22 = var23;
                        var19 = var22;
                        var7_array = var19;
                        if (var7_array == null) {
                          break L12;
                        } else {
                          var8 = wl.a(9, var24);
                          try {
                            L13: {
                              L14: {
                                var20 = new whb();
                                var8.p(-23497);
                                var20.a(var8, false);
                                var8.f((byte) -33);
                                if (var20.field_b instanceof af) {
                                  iva.a(param3 + -6947, "Received black box recording");
                                  var15 = (af) (Object) var20.field_b;
                                  param5.field_d = var15;
                                  ((kda) this).b(param5, -125);
                                  break L14;
                                } else {
                                  if (var20.field_b instanceof mo) {
                                    var21_ref = (mo) (Object) var20.field_b;
                                    iva.a(-6940, "The newest black box recording=" + var21_ref.field_i);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              break L13;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L15: {
                              var9 = (Exception) (Object) decompiledCaughtException;
                              iva.a(param3 + -6947, "Error reading in debug response");
                              var9.printStackTrace();
                              break L15;
                            }
                          }
                          break L12;
                        }
                      }
                      stackOut_80_0 = 1;
                      stackIn_81_0 = stackOut_80_0;
                      break L0;
                    } else {
                      return false;
                    }
                  } else {
                    var7_int = param1.h(98);
                    var8_int = param1.h(74);
                    var9_int = param1.e((byte) -121);
                    var10 = 0;
                    L16: while (true) {
                      if (var10 >= var9_int) {
                        L17: {
                          if (param5 == null) {
                            break L17;
                          } else {
                            if (((kda) this).field_a) {
                              break L17;
                            } else {
                              if (((kda) this).field_o) {
                                break L17;
                              } else {
                                if (param5.f(1)) {
                                  break L17;
                                } else {
                                  param5.a(false, var7_int);
                                  this.a((byte) 85, var8_int);
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                        stackOut_67_0 = 1;
                        stackIn_68_0 = stackOut_67_0;
                        return stackIn_68_0 != 0;
                      } else {
                        L18: {
                          var11 = param1.h(95);
                          var12 = param1.h(95);
                          if (param5 == null) {
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        var10++;
                        continue L16;
                      }
                    }
                  }
                } else {
                  L19: {
                    var7_int = param1.h(94);
                    if (param5 == null) {
                      break L19;
                    } else {
                      if (((kda) this).field_a) {
                        break L19;
                      } else {
                        if (((kda) this).field_o) {
                          break L19;
                        } else {
                          param0.h(24335, pka.field_o);
                          param0.d(var7_int, 332614536);
                          param0.d(param5.field_g, 332614536);
                          break L19;
                        }
                      }
                    }
                  }
                  stackOut_54_0 = 1;
                  stackIn_55_0 = stackOut_54_0;
                  return stackIn_55_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L20: {
            var7 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) var7;
            stackOut_82_1 = new StringBuilder().append("kda.D(");
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param0 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L20;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L20;
            }
          }
          L21: {
            stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
            stackOut_85_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param1 == null) {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L21;
            } else {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L21;
            }
          }
          L22: {
            stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
            stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param5 == null) {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L22;
            } else {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L22;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_91_0, stackIn_91_2 + ')');
        }
        return stackIn_81_0 != 0;
    }

    final boolean b(byte param0) {
        int var2 = ((kda) this).field_q ? 1 : 0;
        ((kda) this).field_q = false;
        int var3 = -118 / ((-41 - param0) / 55);
        return var2 != 0;
    }

    final void a(int param0, int param1) {
        if (param0 != -29804) {
            return;
        }
        ((kda) this).field_n = param1;
    }

    final void c(byte param0) {
        ((kda) this).field_o = true;
        if (param0 != -94) {
            Object var3 = null;
            ((kda) this).a(-3, (faa) null);
        }
    }

    final void a(boolean param0) {
        if (((kda) this).field_a) {
            ((kda) this).field_q = true;
        }
        if (!param0) {
            ((kda) this).field_k = null;
        }
    }

    final boolean a(int param0) {
        if (param0 != -28208) {
            ((kda) this).field_h = 115;
        }
        return ((kda) this).field_a;
    }

    final void a(int param0, boolean param1, mib param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ksa var6 = null;
        umb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uqb var12 = null;
        uqb var13 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!((kda) this).field_l) {
                break L1;
              } else {
                iva.a(-6940, "Carousel_clientgame:Not ready");
                break L1;
              }
            }
            ((kda) this).field_l = false;
            ((kda) this).field_h = 2147483647;
            var4_int = 0;
            var5 = 0;
            var6 = ((kda) this).field_c.d(param0);
            L2: while (true) {
              if (var6 == null) {
                iva.a(-6940, "Carousel_clientgame: Adding all the way with " + var4_int + " actions, and " + var5 + " server ticks. Tick=" + param2.field_g + ", Ticks behind=" + param2.field_c);
                param2.g(param0 + -1);
                iva.a(-6940, "Carousel_clientgame: Tick is now " + param2.field_g);
                break L0;
              } else {
                L3: {
                  if (!(var6 instanceof uqb)) {
                    if (var6 instanceof umb) {
                      L4: {
                        var7 = (umb) (Object) var6;
                        var8 = var7.field_f;
                        var9 = var8;
                        if (param1) {
                          iva.a(-6940, "Carousel_clientgame: Adding the server follow time...");
                          var9 = var9 + foa.field_q;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (!var7.field_e) {
                          break L5;
                        } else {
                          tfb.a((byte) -122, "Carousel_clientgame: Recieved a client catchup packet which still connecting");
                          break L5;
                        }
                      }
                      var5++;
                      param2.a(var9, false, 0);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    L6: {
                      var12 = (uqb) (Object) var6;
                      var13 = var12;
                      if (osa.field_e) {
                        var13.field_g = false;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4_int++;
                    boolean discarded$1 = param2.a(param0 ^ 1, (uqb) (Object) var6);
                    break L3;
                  }
                }
                var6 = ((kda) this).field_c.a((byte) 62);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("kda.C(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final void a(faa param0, int param1, String param2) {
        whb var4 = null;
        try {
            var4 = new whb();
            var4.field_b = (ub) (Object) new mo("<SetCarouselConstant>" + param2);
            rkb.a(param1 ^ param1, (tv) (Object) var4, param0, fk.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kda.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = VoidHunters.field_G;
        if (param2 >= 0) {
          L0: {
            ((kda) this).field_d = 52;
            if (null == ((kda) this).field_k) {
              ((kda) this).field_k = new int[1 + param2];
              break L0;
            } else {
              if (((kda) this).field_k.length <= param2) {
                var7 = new int[param2 - -1];
                var4 = var7;
                var5 = 0;
                L1: while (true) {
                  if (((kda) this).field_k.length <= var5) {
                    ((kda) this).field_k = var4;
                    break L0;
                  } else {
                    var7[var5] = ((kda) this).field_k[var5];
                    var5++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          ((kda) this).field_k[param2] = param0;
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, String param1, faa param2) {
        whb var4 = null;
        try {
            if (param0 < 63) {
                this.a((byte) -70, -117);
            }
            var4 = new whb();
            var4.field_b = (ub) (Object) new mo(param1);
            rkb.a(0, (tv) (Object) var4, param2, fk.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kda.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(faa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        uqb var4 = null;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!wh.g(-121)) {
                L2: {
                  if (((kda) this).field_l) {
                    iva.a(-6940, "Carousel_clientgame: Not ready");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((kda) this).field_l = false;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              var3_int = 80 / ((-42 - param1) / 46);
              if (((kda) this).field_a) {
                L4: {
                  if (!((kda) this).field_l) {
                    break L4;
                  } else {
                    iva.a(-6940, "Carousel_clientgame: Not ready");
                    break L4;
                  }
                }
                ((kda) this).field_l = false;
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if (null == ((kda) this).field_j) {
                break L5;
              } else {
                ((kda) this).field_j.a(param0, nia.field_o, 126);
                if (((kda) this).field_j.a(0)) {
                  ((kda) this).field_j = null;
                  iva.a(-6940, "Carousel_clientgame: Finished sending from Carousel_clientgame.dataSender");
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              ((kda) this).field_b = (1 + ((kda) this).field_b) % 5;
              if (((kda) this).field_i.c(3) < -1) {
                if (-1 == ((kda) this).field_b) {
                  var4 = (uqb) (Object) ((kda) this).field_i.d(0);
                  L7: while (true) {
                    if (var4 == null) {
                      break L6;
                    } else {
                      int discarded$1 = 1000;
                      this.a(var4, param0);
                      var4.b(-3846);
                      var4 = (uqb) (Object) ((kda) this).field_i.a((byte) 100);
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("kda.M(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ')');
        }
    }

    final void b(mib param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param1 < -117) {
              L1: {
                if (param0.field_d != null) {
                  param0.field_d.a(108).b((byte) 96, (tv) (Object) param0);
                  param0.c(-64);
                  param0.field_h = true;
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("kda.O(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public kda() {
        ((kda) this).field_h = 2147483647;
        ((kda) this).field_c = new ij();
        ((kda) this).field_m = new um();
        ((kda) this).field_o = true;
        ((kda) this).field_l = false;
        ((kda) this).field_a = false;
        ((kda) this).field_i = new ij();
        ((kda) this).field_b = 0;
        ((kda) this).field_q = false;
        ((kda) this).field_f = 0;
        ((kda) this).field_p = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Click";
    }
}
