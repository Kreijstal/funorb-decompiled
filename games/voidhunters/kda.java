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
            if (null == this.field_k) {
              break L0;
            } else {
              if (param1 >= this.field_k.length) {
                break L0;
              } else {
                if (param0) {
                  return this.field_k[param1];
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
        this.field_a = false;
        int var2 = -6 % ((param0 - -48) / 43);
    }

    final int a(boolean param0, int param1) {
        this.field_a = false;
        this.field_o = false;
        this.field_c.e(110);
        int var3 = this.field_n;
        this.field_n = 0;
        this.field_i = new ij();
        if (param1 != -13027) {
            this.field_m = (um) null;
        }
        iva.a(-6940, "Called Carousel_clientgame.start_game(), resetting any buffered events");
        this.field_b = 0;
        this.field_h = 2147483647;
        if (!(param0)) {
            this.field_k = null;
            this.field_d = 0;
        }
        this.field_f = 0;
        this.field_p = false;
        this.field_e = false;
        return var3;
    }

    private final void a(byte param0, int param1) {
        if (param0 != 85) {
            this.field_i = (ij) null;
        }
        this.field_d = param1;
    }

    final byte[] b(faa param0, int param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_m.a(param0, param1 ^ 900, nia.field_o);
              if (param1 == 1000) {
                break L1;
              } else {
                this.a(-52);
                break L1;
              }
            }
            this.field_a = true;
            var4 = this.field_m.b(-30223);
            var3 = var4;
            stackIn_3_0 = (byte[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("kda.BA(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(mib param0, int param1, int param2, int param3, boolean param4) {
        mib stackIn_22_0 = null;
        mib stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
            if (this.field_h < param3) {
              L2: {
                var6_int = -param0.field_g + param3;
                var7 = this.c(param2 + -1000) / 2;
                var8 = ela.field_p * var7 / param2;
                var9 = foa.field_q / 2 - -(2 * var8);
                if (-var9 > var6_int) {
                  var10 = -var6_int + shb.field_k;
                  if (var10 >= param0.c((byte) 114)) {
                    iva.a(param2 ^ -6388, "Carousel_clientgame_Info.check_servercrc_against_clientcrc was going to look " + var10 + " steps back");
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var11 = (uqb) ((Object) param0.field_f.d(0));
                    L3: while (true) {
                      if (var11 == null) {
                        L4: {
                          var11_ref = param0.a(var10, param2 ^ -949);
                          var12 = tmb.a(var11_ref, (byte) -70);
                          stackIn_22_0 = (mib) (param0);

                          if (var12 == param1) {
                            stackIn_23_0 = (mib) ((Object) stackIn_22_0);
                            stackIn_23_1 = 0;
                            break L4;
                          } else {
                            stackIn_23_0 = (mib) ((Object) stackIn_22_0);
                            stackIn_23_1 = 1;
                            break L4;
                          }
                        }
                        stackIn_23_0.field_k = stackIn_23_1 != 0;
                        if (!param0.field_k) {
                          break L2;
                        } else {
                          if (this.field_e) {
                            break L2;
                          } else {
                            if (lw.field_f) {
                              L5: {
                                this.field_e = true;
                                iva.a(-6940, "Carousel_clientgame: Now out of sync for server tick " + param3 + ", which is " + -var6_int + " ticks back, so dumping state");
                                if (null == this.field_j) {
                                  this.field_j = new ova(kha.field_v);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              if (!this.field_j.a(param2 + -1000)) {
                                break L2;
                              } else {
                                iva.a(-6940, "Carousel_clientgame: Sending the state dump to the server");
                                var13 = new bhb(-var10 + param0.field_g, bk.field_w);
                                var14 = new lla();
                                var14.a(84, 0, var13.field_d, var13.field_d.length);
                                var20 = wi.a((byte) 10, var14.field_f);
                                this.field_j.a(var20, 0);
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
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var11 = (uqb) ((Object) param0.field_f.a((byte) 36));
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var6);

            stackIn_35_1 = new StringBuilder().append("kda.U(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L7;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final boolean a(mib param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = this.c(0) * ela.field_p / param1;
            var4 = wsb.field_f + -var3_int;
            if (param0.field_c <= var4) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kda.K(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(byte param0, mib param1, int param2, faa param3) {
        uqb var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_l) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (!this.field_p) {
                    iva.a(-6940, "Carousel_clientgame: Sending ready packet");
                    var5 = (uqb) ((Object) wc.field_a.a((byte) 77));
                    var5.field_e = param1.field_g;
                    var5.a(param2, -125);
                    this.a(var5, param3, 1000);
                    this.field_p = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 == 110) {
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("kda.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void a(int param0, faa param1) {
        whb var3 = null;
        if (param0 != -32339) {
            return;
        }
        try {
            var3 = new whb();
            var3.field_b = (ub) ((Object) new mo("<RequestNewestBlackBox>"));
            rkb.a(0, var3, param1, fk.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kda.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, uqb param1, mib param2, boolean param3, boolean param4, int param5, faa param6) {
        uqb stackIn_8_0 = null;
        uqb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        uqb var8 = null;
        RuntimeException var8_ref = null;
        mib var9 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!param4) {
                  break L2;
                } else {
                  if (!this.field_l) {
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
                  stackIn_8_0 = (uqb) (param1);

                  if (param4) {
                    stackIn_9_0 = (uqb) ((Object) stackIn_8_0);
                    stackIn_9_1 = 0;
                    break L3;
                  } else {
                    stackIn_9_0 = (uqb) ((Object) stackIn_8_0);
                    stackIn_9_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  stackIn_9_0.field_f = stackIn_9_1 != 0;
                  if (param0) {
                    break L4;
                  } else {
                    var9 = (mib) null;
                    this.b((mib) null, 33);
                    break L4;
                  }
                }
                L5: {
                  param1.field_e = -param5 + param2.field_g;
                  if ((hna.field_s ^ -1) != -2) {
                    break L5;
                  } else {
                    if (this.field_f >= param1.field_e) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                }
                if (!this.a(param2, 1000)) {
                  L6: {
                    this.field_f = param1.field_e;
                    if (param4) {
                      if (param3) {
                        var8 = (uqb) ((Object) wc.field_a.a((byte) 49));
                        param1.b((byte) 75, var8);
                        this.field_i.b(-10258, var8);
                        break L6;
                      } else {
                        this.a(param1, param6, 1000);
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
                      tfb.a((byte) -101, "Carousel_clientgame: Added an action off your own carousel! " + param1);
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var8_ref);

            stackIn_27_1 = new StringBuilder().append("kda.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void a(uqb param0, faa param1, int param2) {
        try {
            if (param2 != 1000) {
                this.field_a = true;
            }
            em.field_o = false;
            rkb.a(0, param0, param1, pra.field_o);
            em.field_o = true;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kda.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
            field_g = (String) null;
        }
        return this.field_d;
    }

    final boolean a(faa param0, faa param1, boolean param2, byte param3, int param4, mib param5) {
        boolean discarded$0 = false;
        int stackIn_6_0 = 0;
        Object stackIn_22_0;
        mib stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        Object stackIn_23_0;
        mib stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        mib stackIn_73_0 = null;
        int stackIn_76_0 = 0;
        int stackIn_89_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] var7 = null;
        int var7_int = 0;
        RuntimeException var7_ref = null;
        int var8_int = 0;
        faa var8 = null;
        int var9_int = 0;
        Exception var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mib var14 = null;
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
                    stackIn_6_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L2: {
                if (param5 == null) {
                  break L2;
                } else {
                  if (this.field_a) {
                    break L2;
                  } else {
                    if (!this.field_o) {
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
                        if (this.field_l) {
                          L4: {
                            stackIn_22_0 = this;

                            stackIn_22_1 = (mib) (param5);

                            stackIn_22_2 = var16.field_g;

                            stackIn_22_3 = param3 ^ 1007;

                            stackIn_22_4 = var16.field_f;

                            if (param2) {
                              stackIn_23_0 = this;
                              stackIn_23_1 = (mib) ((Object) stackIn_22_1);
                              stackIn_23_2 = stackIn_22_2;
                              stackIn_23_3 = stackIn_22_3;
                              stackIn_23_4 = stackIn_22_4;
                              stackIn_23_5 = 0;
                              break L4;
                            } else {
                              stackIn_23_0 = this;
                              stackIn_23_1 = (mib) ((Object) stackIn_22_1);
                              stackIn_23_2 = stackIn_22_2;
                              stackIn_23_3 = stackIn_22_3;
                              stackIn_23_4 = stackIn_22_4;
                              stackIn_23_5 = 1;
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
                          if (!this.field_l) {
                            iva.a(-6940, "Carousel_clientgame: Is ready");
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_h = param5.field_g;
                        this.field_l = true;
                        break L2;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackIn_25_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (pr.field_d == param4) {
                L6: {
                  var17_ref = (uqb) ((Object) wc.field_a.a((byte) -126));
                  param1.p(-23497);
                  var17_ref.a(param1, false);
                  param1.f((byte) -114);
                  if (param5 == null) {
                    break L6;
                  } else {
                    if (param5.f(1)) {
                      stackIn_32_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
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
                      if (this.field_a) {
                        break L8;
                      } else {
                        if (this.field_o) {
                          break L8;
                        } else {
                          if (!param5.a(1, var17_ref)) {
                            L9: {
                              var9_int = -1;
                              if (!(var17_ref instanceof pca)) {
                                break L9;
                              } else {
                                var9_int = ((pca) ((Object) var17_ref)).field_k;
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
                  this.field_c.b(-10258, var17_ref);
                  break L7;
                }
                stackIn_46_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L11: {
                  if (param3 == 7) {
                    break L11;
                  } else {
                    var14 = (mib) null;
                    discarded$0 = this.a((mib) null, -70);
                    break L11;
                  }
                }
                if (ehb.field_g != param4) {
                  if (iva.field_o != param4) {
                    if (param4 == qha.field_o) {
                      L12: {
                        this.field_m.a(param1, 90, nia.field_o);
                        var22 = this.field_m.b(param3 ^ -30218);
                        var19 = var22;
                        var7 = var19;
                        if (var7 == null) {
                          break L12;
                        } else {
                          var8 = wl.a(9, var22);
                          try {
                            L13: {
                              L14: {
                                var20 = new whb();
                                var8.p(-23497);
                                var20.a(var8, false);
                                var8.f((byte) -33);
                                if (var20.field_b instanceof af) {
                                  iva.a(param3 + -6947, "Received black box recording");
                                  var15 = (af) ((Object) var20.field_b);
                                  param5.field_d = var15;
                                  this.b(param5, -125);
                                  break L14;
                                } else {
                                  if (var20.field_b instanceof mo) {
                                    var21_ref = (mo) ((Object) var20.field_b);
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
                      stackIn_89_0 = 1;
                      decompiledRegionSelector0 = 6;
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
                            if (this.field_a) {
                              break L17;
                            } else {
                              if (this.field_o) {
                                break L17;
                              } else {
                                stackIn_73_0 = (mib) (param5);
                                if (((mib) (Object) stackIn_73_0).f(1)) {
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
                        stackIn_76_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var11 = param1.h(95);
                        var12 = param1.h(95);
                        if (param5 != null) {
                          if (!this.field_a) {
                            if (!this.field_o) {
                              L18: {
                                if (!param5.f(1)) {
                                  this.a(var12, false, var11);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              var10++;
                              continue L16;
                            } else {
                              var10++;
                              continue L16;
                            }
                          } else {
                            var10++;
                            continue L16;
                          }
                        } else {
                          var10++;
                          continue L16;
                        }
                      }
                    }
                  }
                } else {
                  L19: {
                    var7_int = param1.h(94);
                    if (param5 == null) {
                      break L19;
                    } else {
                      if (this.field_a) {
                        break L19;
                      } else {
                        if (this.field_o) {
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
                  stackIn_55_0 = 1;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L20: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_92_0 = (RuntimeException) (var7_ref);

            stackIn_92_1 = new StringBuilder().append("kda.D(");

            if (param0 == null) {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "null";
              break L20;
            } else {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_95_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(',');

            if (param1 == null) {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L21;
            } else {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_98_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "null";
              break L22;
            } else {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "{...}";
              break L22;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_93_0), stackIn_99_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_46_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_55_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_76_0 != 0;
                  } else {
                    return stackIn_89_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final boolean b(byte param0) {
        int var2 = this.field_q ? 1 : 0;
        this.field_q = false;
        int var3 = -118 / ((-41 - param0) / 55);
        return var2 != 0;
    }

    final void a(int param0, int param1) {
        if (param0 != -29804) {
            return;
        }
        this.field_n = param1;
    }

    final void c(byte param0) {
        this.field_o = true;
        if (param0 != -94) {
            faa var3 = (faa) null;
            this.a(-3, (faa) null);
        }
    }

    final void a(boolean param0) {
        if (this.field_a) {
            this.field_q = true;
        }
        if (!param0) {
            this.field_k = (int[]) null;
        }
    }

    final boolean a(int param0) {
        if (param0 != -28208) {
            this.field_h = 115;
        }
        return this.field_a;
    }

    final void a(int param0, boolean param1, mib param2) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ksa var6 = null;
        umb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uqb var12 = null;
        uqb var13 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!this.field_l) {
                break L1;
              } else {
                iva.a(-6940, "Carousel_clientgame:Not ready");
                break L1;
              }
            }
            this.field_l = false;
            this.field_h = 2147483647;
            var4_int = 0;
            var5 = 0;
            var6 = this.field_c.d(param0);
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
                        var7 = (umb) ((Object) var6);
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
                      var12 = (uqb) ((Object) var6);
                      var13 = var12;
                      if (osa.field_e) {
                        var13.field_g = false;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4_int++;
                    param2.a(param0 ^ 1, (uqb) ((Object) var6));
                    break L3;
                  }
                }
                var6 = this.field_c.a((byte) 62);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("kda.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final void a(faa param0, int param1, String param2) {
        whb var4 = null;
        try {
            var4 = new whb();
            var4.field_b = (ub) ((Object) new mo("<SetCarouselConstant>" + param2));
            rkb.a(param1 ^ param1, var4, param0, fk.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kda.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        var6 = VoidHunters.field_G;
        if (param2 >= 0) {
          L0: {
            if (!param1) {
              break L0;
            } else {
              this.field_d = 52;
              break L0;
            }
          }
          L1: {
            if (null == this.field_k) {
              this.field_k = new int[1 + param2];
              break L1;
            } else {
              if (this.field_k.length <= param2) {
                var7 = new int[param2 - -1];
                var4 = var7;
                var5 = 0;
                L2: while (true) {
                  if (this.field_k.length <= var5) {
                    this.field_k = var4;
                    break L1;
                  } else {
                    var7[var5] = this.field_k[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          this.field_k[param2] = param0;
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
            var4.field_b = (ub) ((Object) new mo(param1));
            rkb.a(0, var4, param2, fk.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kda.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(faa param0, int param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        uqb var4 = null;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!wh.g(-121)) {
                L2: {
                  if (this.field_l) {
                    iva.a(-6940, "Carousel_clientgame: Not ready");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_l = false;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              var3_int = 80 / ((-42 - param1) / 46);
              if (this.field_a) {
                L4: {
                  if (!this.field_l) {
                    break L4;
                  } else {
                    iva.a(-6940, "Carousel_clientgame: Not ready");
                    break L4;
                  }
                }
                this.field_l = false;
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if (null == this.field_j) {
                break L5;
              } else {
                this.field_j.a(param0, nia.field_o, 126);
                if (this.field_j.a(0)) {
                  this.field_j = null;
                  iva.a(-6940, "Carousel_clientgame: Finished sending from Carousel_clientgame.dataSender");
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              this.field_b = (1 + this.field_b) % 5;
              if ((this.field_i.c(3) ^ -1) < -1) {
                if (-1 == (this.field_b ^ -1)) {
                  var4 = (uqb) ((Object) this.field_i.d(0));
                  L7: while (true) {
                    if (var4 == null) {
                      break L6;
                    } else {
                      this.a(var4, param0, 1000);
                      var4.b(-3846);
                      var4 = (uqb) ((Object) this.field_i.a((byte) 100));
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
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("kda.M(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
    }

    final void b(mib param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param1 < -117) {
              L1: {
                if (param0.field_d != null) {
                  param0.field_d.a(108).b((byte) 96, param0);
                  param0.c(-64);
                  param0.field_h = true;
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("kda.O(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public kda() {
        this.field_h = 2147483647;
        this.field_c = new ij();
        this.field_m = new um();
        this.field_o = true;
        this.field_l = false;
        this.field_a = false;
        this.field_i = new ij();
        this.field_b = 0;
        this.field_q = false;
        this.field_f = 0;
        this.field_p = false;
    }

    static {
        field_g = "Click";
    }
}
