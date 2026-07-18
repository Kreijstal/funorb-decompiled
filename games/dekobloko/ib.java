/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends t implements vn {
    private ek field_lb;
    static w field_mb;
    static String field_pb;
    static ud field_ob;
    static int field_kb;
    static w field_nb;

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException var6 = null;
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
            L1: {
              if (((ib) this).field_lb == param2) {
                this.m((byte) -102);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 67) {
                break L2;
              } else {
                field_nb = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ib.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int[] param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (~qg.field_e < ~param7) {
                  L2: {
                    if (0 <= param0) {
                      break L2;
                    } else {
                      if (0 <= param6) {
                        break L2;
                      } else {
                        if (param2 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~param0 > ~qg.field_a) {
                      break L3;
                    } else {
                      if (~param6 > ~qg.field_a) {
                        break L3;
                      } else {
                        if (qg.field_a > param2) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param3 + -param7;
                    if (param1 == param7) {
                      L5: {
                        if (~param3 != ~param7) {
                          var15 = param3 + -param1;
                          if (param6 <= param0) {
                            var12 = (param2 - param0 << 16) / var14;
                            var11 = (param2 - param6 << 16) / var15;
                            var9_int = param6 << 16;
                            var10 = param0 << 16;
                            break L5;
                          } else {
                            var9_int = param0 << 16;
                            var10 = param6 << 16;
                            var11 = (-param0 + param2 << 16) / var14;
                            var12 = (param2 + -param6 << 16) / var15;
                            break L5;
                          }
                        } else {
                          var11 = 0;
                          var10 = param6 << 16;
                          var12 = 0;
                          var9_int = param0 << 16;
                          break L5;
                        }
                      }
                      var13 = 0;
                      if (param7 < 0) {
                        param7 = Math.min(-param7, param1 + -param7);
                        var10 = var10 + param7 * var12;
                        var9_int = var9_int + param7 * var11;
                        param7 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param0 << 16;
                        var9_int = param0 << 16;
                        var15 = param1 - param7;
                        var12 = (param2 + -param0 << 16) / var14;
                        var11 = (param6 + -param0 << 16) / var15;
                        if (~var11 > ~var12) {
                          var13 = 0;
                          break L6;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param7 >= 0) {
                            break L8;
                          } else {
                            if (param1 >= 0) {
                              param7 = -param7;
                              var9_int = var9_int + param7 * var11;
                              var10 = var10 + param7 * var12;
                              param7 = 0;
                              break L8;
                            } else {
                              param7 = param1 - param7;
                              var10 = var10 + var12 * param7;
                              var9_int = var9_int + var11 * param7;
                              param7 = param1;
                              break L7;
                            }
                          }
                        }
                        var16 = qg.field_d[param7];
                        L9: while (true) {
                          if (~param1 >= ~param7) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9_int >> 16;
                              if (~qg.field_a >= ~var17) {
                                break L10;
                              } else {
                                var18 = (var10 >> 16) + -(var9_int >> 16);
                                if (var18 != 0) {
                                  L11: {
                                    if (~qg.field_a < ~(var18 + var17)) {
                                      break L11;
                                    } else {
                                      var18 = -1 + (-var17 + qg.field_a);
                                      break L11;
                                    }
                                  }
                                  if (var17 < 0) {
                                    cf.a(var16, (byte) 57, param8, param4, var18 - -var17);
                                    break L10;
                                  } else {
                                    cf.a(var16 + var17, (byte) 57, param8, param4, var18);
                                    break L10;
                                  }
                                } else {
                                  if (0 > var17) {
                                    break L10;
                                  } else {
                                    if (qg.field_a <= var17) {
                                      break L10;
                                    } else {
                                      cf.a(var17 + var16, (byte) 57, param8, param4, var18);
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            param7++;
                            if (qg.field_e > param7) {
                              var10 = var10 + var12;
                              var16 = var16 + hk.field_j;
                              var9_int = var9_int + var11;
                              continue L9;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = param3 - param1;
                      if (var16 == 0) {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      } else {
                        L12: {
                          var17 = param2 << 16;
                          if (var13 != 0) {
                            var10 = param6 << 16;
                            break L12;
                          } else {
                            var9_int = param6 << 16;
                            break L12;
                          }
                        }
                        var12 = (-var10 + var17) / var16;
                        var11 = (-var9_int + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (param7 < 0) {
                      param7 = -param7;
                      var10 = var10 + var12 * param7;
                      var9_int = var9_int + param7 * var11;
                      param7 = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var15 = qg.field_d[param7];
                  L14: while (true) {
                    if (param3 <= param7) {
                      break L0;
                    } else {
                      L15: {
                        var16 = var9_int >> 16;
                        if (qg.field_a <= var16) {
                          break L15;
                        } else {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (var17 != 0) {
                            L16: {
                              if (~qg.field_a >= ~(var17 + var16)) {
                                var17 = qg.field_a + -var16 - 1;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            if (var16 < 0) {
                              cf.a(var15, (byte) 57, param8, param4, var16 + var17);
                              break L15;
                            } else {
                              cf.a(var16 - -var15, (byte) 57, param8, param4, var17);
                              break L15;
                            }
                          } else {
                            if (0 > var16) {
                              break L15;
                            } else {
                              if (qg.field_a > var16) {
                                cf.a(var16 - -var15, (byte) 57, param8, param4, var17);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      param7++;
                      if (~qg.field_e < ~param7) {
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        var15 = var15 + hk.field_j;
                        continue L14;
                      } else {
                        return;
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
          L17: {
            var9 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var9;
            stackOut_74_1 = new StringBuilder().append("ib.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(117).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param8 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L17;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L17;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ')');
        }
    }

    private final ek a(kg param0, String param1, byte param2) {
        ek var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ek stackIn_1_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        ek stackOut_0_0 = null;
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
        try {
          L0: {
            var4 = new ek(param1, param0);
            var4.field_p = (gl) (Object) new fk();
            var5 = ((ib) this).field_y + -6;
            ((ib) this).field_y = ((ib) this).field_y + 38;
            var4.b(30, -16 + (((ib) this).field_t + -14), 15, var5, -16555);
            ((ib) this).b(var4, (byte) -55);
            ((ib) this).f(109);
            stackOut_0_0 = (ek) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("ib.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -90 + ')');
        }
        return stackIn_1_0;
    }

    private final void m(byte param0) {
        if (!(((ib) this).field_S)) {
            return;
        }
        ((ib) this).field_S = false;
    }

    final static ke a(byte param0, boolean param1) {
        int var3 = 0;
        ec var4 = null;
        ec var5_ref_ec = null;
        int var5 = 0;
        ke var6 = null;
        ec var7 = null;
        ec var8 = null;
        ke var9 = null;
        ec var10 = null;
        ec var11 = null;
        L0: {
          var6 = new ke(5);
          var9 = var6;
          var3 = 372;
          if (he.field_db) {
            var3 -= 12;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!ph.n(-30146)) {
            var6.a(new ec(22, sf.field_E[0], a.field_t), 123);
            var6.a(new ec(22, sf.field_E[1], a.field_t), 118);
            var6.a(new ec(22, sf.field_E[2], a.field_t), 111);
            var7 = var6.field_f[0];
            var4 = var7;
            var6.field_f[2].field_n = 185;
            var5_ref_ec = var6.field_f[1];
            var5_ref_ec.field_n = 185;
            var7.field_n = 185;
            var6.field_f[0].field_l = 120 + -(var6.field_f[0].field_n / 2);
            var6.field_f[1].field_l = 320 - var6.field_f[1].field_n / 2;
            var6.field_f[2].field_l = 520 + -(var6.field_f[2].field_n / 2);
            var6.field_f[2].field_m = var3;
            var6.field_f[1].field_m = var3;
            var6.field_f[0].field_m = var3;
            break L1;
          } else {
            var8 = new ec(20, qn.field_rb, a.field_t);
            var8.field_m = var3;
            var8.field_l = -(var8.field_n / 2) + 320;
            var9.a(var8, 118);
            break L1;
          }
        }
        L2: {
          var3 += 43;
          if (he.field_db) {
            var10 = new ec(3, oa.field_c, a.field_t);
            var10.field_m = var3;
            var10.field_l = -(var10.field_n / 2) + 320;
            var3 += 28;
            var9.a(var10, 122);
            break L2;
          } else {
            break L2;
          }
        }
        var11 = new ec(13, pc.field_f, a.field_t);
        var11.field_l = 320 - var11.field_n / 2;
        var11.field_m = var3;
        var9.a(var11, 126);
        var9.field_q = 272;
        var9.field_y = 500;
        var9.field_w = 70;
        var9.field_z = 76;
        var9.a(fc.field_e, param1, -129);
        var5 = -87 % ((19 - param0) / 60);
        return var9;
    }

    final static void a(byte param0, ck[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
              var2_int = -40;
              d.field_h = param1;
              if (d.field_h == null) {
                break L1;
              } else {
                if (param1.length >= 3) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ib.J(").append(-108).append(',');
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
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static int l(int param0) {
        sc.field_l.a(-126);
        if (!ta.field_k.a((byte) -56)) {
            return oj.b(0);
        }
        return 0;
    }

    ib(ka param0, ln param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ce var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 != qb.field_s) {
                if (kl.field_p == param1) {
                  var3 = dc.field_g;
                  ((ib) this).field_y = ((ib) this).field_y + 10;
                  if (!wj.r(98)) {
                    break L1;
                  } else {
                    ((ib) this).field_y = ((ib) this).field_y + 20;
                    var3 = wm.field_g;
                    break L1;
                  }
                } else {
                  if (gd.field_c != param1) {
                    break L1;
                  } else {
                    ((ib) this).field_y = ((ib) this).field_y + 30;
                    var3 = gd.field_i;
                    break L1;
                  }
                }
              } else {
                var3 = si.field_c;
                break L1;
              }
            }
            var4 = new ce((String) var3, (kg) null);
            var4.field_t = ((ib) this).field_t;
            var4.field_u = 0;
            var4.field_y = 80;
            var4.field_D = 50;
            var4.field_p = (gl) (Object) new a(bj.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((ib) this).b(var4, (byte) -55);
            ((ib) this).field_lb = this.a((kg) this, og.field_gb, (byte) -90);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("ib.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void m(int param0) {
        field_nb = null;
        field_pb = null;
        field_mb = null;
        field_ob = null;
    }

    static {
        field_kb = 20;
    }
}
