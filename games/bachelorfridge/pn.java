/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pn {
    static String field_e;
    static int field_d;
    static int field_f;
    private pa[] field_c;
    ee[] field_b;
    kv[] field_a;

    private final ee a(int param0, byte param1) {
        if (param0 < 0) {
            return null;
        }
        if (param0 > 31) {
            return null;
        }
        return ((pn) this).field_b[param0 - -120];
    }

    private final ee b(int param0, int param1, int param2) {
        if (param1 > 5) {
            return null;
        }
        int var4 = 127;
        if (param0 == 0) {
            return nca.field_a[param1];
        }
        if (param0 == 1) {
            return nca.field_a[32 + param1];
        }
        if (!(param0 != 2)) {
            return nca.field_a[96 + param1];
        }
        return null;
    }

    final void a(jo param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (-1 == param0.field_F) {
                break L1;
              } else {
                this.a(param0, -1);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (param0.field_z <= var4) {
                var4 = 0;
                L3: while (true) {
                  if (var4 >= 2 + param0.field_z) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= param0.field_z) {
                        L5: {
                          if (param1 >= 97) {
                            break L5;
                          } else {
                            ((pn) this).field_c = null;
                            break L5;
                          }
                        }
                        break L0;
                      } else {
                        var5 = 0;
                        L6: while (true) {
                          if (param0.field_a <= var5) {
                            var4++;
                            continue L4;
                          } else {
                            L7: {
                              var9 = param0.a(var4, (byte) 48, var5);
                              if (param0.field_I[var5][var4].field_a == -1) {
                                break L7;
                              } else {
                                if (param0.field_I[var5][var4].field_d) {
                                  break L7;
                                } else {
                                  this.a(var4, var9, var5, (byte) -35, param0);
                                  break L7;
                                }
                              }
                            }
                            this.a(var5, 79, var4, param0, var9.field_c, var9.field_a);
                            var5++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var5 = 0;
                    L8: while (true) {
                      if (var5 >= 2 + param0.field_a) {
                        var4++;
                        continue L3;
                      } else {
                        L9: {
                          var8 = param0.a(var4, (byte) -103, var5);
                          if (param0.field_j[var5][var4].field_n != 1) {
                            break L9;
                          } else {
                            this.a(var5, false, var8.field_c, var4, param0, -32 + var8.field_a);
                            break L9;
                          }
                        }
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                L10: while (true) {
                  if (var5 >= param0.field_a) {
                    var4++;
                    continue L2;
                  } else {
                    var7 = param0.a(var4, (byte) 45, var5);
                    this.a(var5, var4, param0, var7.field_a, var7.field_c, false);
                    var5++;
                    continue L10;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("pn.H(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 41);
        }
    }

    private final void a(jo param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ee[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        kv var7 = null;
        kv var8 = null;
        int var9 = 0;
        kv stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        kv stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (1 == param0.field_F) {
                wf.a(54, (byte) -57);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0.field_F > 80) {
                var3_int = 8 * (-80 + param0.field_F);
                if (var3_int > 255) {
                  var3_int = 255;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var4 = iw.field_b;
            var5 = var4.length;
            ((pn) this).field_c = new pa[var5];
            var6 = 0;
            L3: while (true) {
              if (~var6 <= ~var5) {
                break L0;
              } else {
                L4: {
                  if (var6 == 0) {
                    stackOut_13_0 = null;
                    stackIn_14_0 = (kv) (Object) stackOut_13_0;
                    break L4;
                  } else {
                    stackOut_12_0 = iw.field_b[var6 + -1].a();
                    stackIn_14_0 = stackOut_12_0;
                    break L4;
                  }
                }
                var7 = stackIn_14_0;
                var8 = iw.field_b[var6].a();
                ((pn) this).field_c[var6] = this.a(var8, var7, false, var3_int);
                var6++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("pn.N(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + -1 + 41);
        }
    }

    private final ee a(int param0, int param1) {
        if (param1 > 5) {
            return null;
        }
        if (param0 != 21160) {
            return null;
        }
        return ((pn) this).field_b[96 + param1];
    }

    private final void a(int param0, aj param1, int param2, byte param3, jo param4) {
        ee var9 = null;
        wia var10 = param4.field_i.field_h.field_a[param2][param0];
        int var7 = var10.field_n;
        if (param3 != -35) {
            field_e = null;
        }
        int var8 = var10.field_j;
        if (37 == var7) {
            return;
        }
        try {
            var9 = this.a(var7, param0, param2, (byte) -122, var8, param4.field_i.field_h.field_E);
            if (!(var9 == null)) {
                var9.a(param1.field_c, param1.field_a, 104);
            }
            this.a(param2, (byte) 100, var8, param0, var7).a(param1.field_c, param1.field_a);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pn.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final ee d(int param0, int param1) {
        if (!(param1 != 0)) {
            return nca.field_a[15];
        }
        int var3 = 57 % ((param0 - -41) / 36);
        if (param1 == 1) {
            return nca.field_a[63];
        }
        if (param1 != 2) {
            return null;
        }
        return nca.field_a[111];
    }

    private final ee b(int param0, int param1) {
        if (param0 == ~param1) {
            return nca.field_a[14];
        }
        if (!(param1 != 1)) {
            return nca.field_a[62];
        }
        if (!(param1 != 2)) {
            return nca.field_a[110];
        }
        return null;
    }

    private final ee a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = 0;
        L0: {
          if (param0 == 6) {
            break L0;
          } else {
            if (param0 == 8) {
              break L0;
            } else {
              if (10 == param0) {
                break L0;
              } else {
                if (param0 == 12) {
                  break L0;
                } else {
                  if (param0 != 14) {
                    if (20 != param0) {
                      var7 = 39 / ((49 - param3) / 58);
                      return null;
                    } else {
                      return this.b(-1, param5);
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        return this.b(param5, (param2 + param1 * 2) % 4, -85);
    }

    void b(jo param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -13319) {
                break L1;
              } else {
                ee discarded$2 = this.a(45, -37, 115, (byte) 34, -102, -47);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pn.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, jo param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pa var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        wia var23 = null;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var22 = BachelorFridge.field_y;
        try {
          L0: {
            if (param3.field_I[param0][param2].field_d) {
              return;
            } else {
              L1: {
                L2: {
                  var8 = 32 / ((-62 - param1) / 45);
                  var23 = param3.field_i.field_h.field_a[param0][param2];
                  var9 = var23.field_n;
                  if (var9 != 21) {
                    break L2;
                  } else {
                    if (param3.field_I[param0][param2].field_i) {
                      break L2;
                    } else {
                      ((pn) this).field_b[109].a(param4, param5);
                      break L1;
                    }
                  }
                }
                L3: {
                  if (var9 != 21) {
                    break L3;
                  } else {
                    if (!param3.field_I[param0][param2].field_i) {
                      break L3;
                    } else {
                      ((pn) this).field_b[108].a(param4, param5);
                      break L1;
                    }
                  }
                }
                if (var9 != 22) {
                  L4: {
                    if (var9 == 23) {
                      break L4;
                    } else {
                      if (var9 == 24) {
                        break L4;
                      } else {
                        if (25 == var9) {
                          break L4;
                        } else {
                          if (26 != var9) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  this.a(param0, (byte) 83, 0, param2, 20).a(param4, param5);
                  break L1;
                } else {
                  this.d(-79, param3.field_i.field_h.field_E).a(param4, param5, 104);
                  ((pn) this).field_b[103].a(param4, param5);
                  break L1;
                }
              }
              L5: {
                if (var9 == 34) {
                  ge.field_K.a(param4, param5);
                  break L5;
                } else {
                  if (var9 == 35) {
                    il.field_b.a(param4, param5);
                    break L5;
                  } else {
                    if (var9 == 28) {
                      if (~var23.field_h <= ~od.field_w[var9].field_e) {
                        kka.field_f.a(param4, param5 + -64);
                        break L5;
                      } else {
                        hna.field_h.a(param4, param5 + -64);
                        break L5;
                      }
                    } else {
                      if (27 == var9) {
                        L6: {
                          var10 = var23.field_j - 1;
                          if (var10 < 0) {
                            break L6;
                          } else {
                            L7: {
                              if (~iw.field_b.length >= ~var10) {
                                var10 = iw.field_b.length - 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var11 = ((pn) this).field_c[var10];
                            var11.e(param4, param5);
                            break L6;
                          }
                        }
                        break L5;
                      } else {
                        if (var9 != 36) {
                          if (30 != var9) {
                            if (var9 == 29) {
                              pk.field_b[(param2 + param0) % 7].a(param4, param5);
                              break L5;
                            } else {
                              if (var9 == 39) {
                                ip.field_f[0].e(32 + param4, -32 + param5);
                                break L5;
                              } else {
                                if (var9 != 37) {
                                  break L5;
                                } else {
                                  L8: {
                                    var10 = (param0 - -(47 * param2)) % 3;
                                    var11_int = (param0 * 342 - -(98 * param2)) % 32;
                                    var12 = (231 * param0 - -(167 * param2)) % 32;
                                    var13 = param4 - (-var11_int - (var12 + -32));
                                    var14 = -var12 + (param5 + var11_int);
                                    var15 = 32 + (1212 * param2 + 4642 * param0 & 31);
                                    var16 = 16 + (31 & param2 * 464 + 57 * param0);
                                    var17 = vr.field_b % var15;
                                    var18 = var17 * (4 * (var16 * (var15 + -var17))) / (var15 * var15);
                                    var19 = 32;
                                    var20 = 24;
                                    if (~(var17 << 1) < ~var15) {
                                      stackOut_31_0 = 1;
                                      stackIn_32_0 = stackOut_31_0;
                                      break L8;
                                    } else {
                                      stackOut_30_0 = 0;
                                      stackIn_32_0 = stackOut_30_0;
                                      break L8;
                                    }
                                  }
                                  var21 = stackIn_32_0;
                                  var20 = var20 - (3 * var18 >> 4);
                                  var19 = var19 - (var18 >> 2);
                                  nk.a(param3.field_y, -(var19 >> 1) + 64 + var13, -(var20 >> 1) + 36 + var14, var19, var20);
                                  eka.field_g[var10][var21].a(var13, -var18 + var14);
                                  break L5;
                                }
                              }
                            }
                          } else {
                            ld.field_l[(param2 + param0) % 7].a(param4, param5);
                            break L5;
                          }
                        } else {
                          pfa.field_g.a(param4, -64 + param5);
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var7;
            stackOut_47_1 = new StringBuilder().append("pn.O(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param3 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L9;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L9;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final pa a(kv param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pa var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        pa stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        pa stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param0.g();
              var4_int = param0.field_v.length;
              if (param2 < -75) {
                break L1;
              } else {
                var10 = null;
                ((pn) this).a((jo) null, (byte) 45);
                break L1;
              }
            }
            var5 = new pa(param0.field_n, param0.field_o);
            var6 = var5.field_v;
            var7 = 0;
            L2: while (true) {
              if (var4_int <= var7) {
                stackOut_9_0 = (pa) var5;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L3: {
                  var8 = 16777215 & param0.field_v[var7];
                  if (var8 == 0) {
                    var6[var7] = 0;
                    break L3;
                  } else {
                    var6[var7] = mp.a(var8, param1 << 24);
                    break L3;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("pn.BA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    private final void a(int param0, int param1, jo param2, int param3, int param4, boolean param5) {
        try {
            this.c(26728, (param0 + param1 * (param2.field_a - -2)) % 24).a(param4, param3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pn.K(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + 0 + 41);
        }
    }

    final static String a(byte param0, int param1, String[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
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
              var3_int = -29 % ((param0 - -48) / 46);
              if (0 > param1) {
                break L1;
              } else {
                if (param1 >= param2.length) {
                  break L1;
                } else {
                  if (param2[param1] == null) {
                    break L1;
                  } else {
                    stackOut_3_0 = param2[param1];
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0;
                  }
                }
              }
            }
            stackOut_5_0 = "Unknown: " + param1;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("pn.W(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    private final pa a(kv param0, kv param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        pa var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        pa stackIn_5_0 = null;
        pa stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        pa stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        pa stackOut_6_0 = null;
        pa stackOut_4_0 = null;
        pa stackOut_25_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1 == null) {
              stackOut_6_0 = this.a(param0, param3, -108);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (param0 == null) {
                stackOut_4_0 = this.a(param1, 255 + -param3, -115);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              } else {
                param1.g();
                param0.g();
                if (!param2) {
                  var5_int = param1.field_v.length;
                  if (param0.field_v.length != var5_int) {
                    throw new RuntimeException();
                  } else {
                    var6 = new pa(param1.field_n, param1.field_o);
                    var19 = var6.field_v;
                    var18 = var19;
                    var17 = var18;
                    var16 = var17;
                    var7 = var16;
                    var8 = 0;
                    L1: while (true) {
                      if (var5_int <= var8) {
                        stackOut_25_0 = (pa) var6;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        L2: {
                          L3: {
                            var9 = param1.field_v[var8] & 16777215;
                            var10 = 16777215 & param0.field_v[var8];
                            if (var9 != 0) {
                              break L3;
                            } else {
                              if (var10 != 0) {
                                break L3;
                              } else {
                                var19[var8] = 0;
                                break L2;
                              }
                            }
                          }
                          if (var9 != 0) {
                            if (var10 != 0) {
                              var11 = var9 & 16711935;
                              var12 = 65280 & var9;
                              var13 = var10 & 16711935;
                              var12 = var12 * (256 - param3);
                              var14 = var10 & 65280;
                              var13 = var13 * param3;
                              var11 = var11 * (-param3 + 256);
                              var11 = var11 & -16711936;
                              var12 = var12 & 16711680;
                              var13 = var13 & -16711936;
                              var14 = var14 * param3;
                              var14 = var14 & 16711680;
                              var7[var8] = mp.a(mp.a(var11 + var13, var14 + var12) >>> 8, -16777216);
                              break L2;
                            } else {
                              var7[var8] = mp.a(-param3 + 255 << 24, var9);
                              break L2;
                            }
                          } else {
                            var7[var8] = mp.a(var10, param3 << 24);
                            break L2;
                          }
                        }
                        var8++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (pa) (Object) stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("pn.S(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L4;
            }
          }
          L5: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_26_0;
    }

    private final ee a(int param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var6 = 27 / ((-28 - param1) / 40);
        if (param4 != 6) {
            if (param4 != 8) {
                if (10 != param4) {
                    if (param4 != 12) {
                        if (param4 != 14) {
                            if (param4 != 7) {
                                if (param4 != 9) {
                                    if (param4 != 11) {
                                        if (param4 != 13) {
                                            if (param4 != 15) {
                                                if (20 != param4) {
                                                    if (38 != param4) {
                                                        if (param4 != 33) {
                                                            return null;
                                                        }
                                                        return fw.field_f;
                                                    }
                                                    var7 = param3 * param0 % 3;
                                                    return cba.field_c[var7];
                                                }
                                                return ((pn) this).field_b[102];
                                            }
                                        }
                                    }
                                }
                            }
                            return this.a(21160, (param0 + param3 * 2) % 4);
                        }
                    }
                }
            }
        }
        return this.a((byte) -18, (param0 + 2 * param3) % 4);
    }

    private final void a(int param0, boolean param1, int param2, int param3, jo param4, int param5) {
        Object var7_ref = null;
        RuntimeException var7 = null;
        int var8 = 0;
        ee var9 = null;
        ee var10 = null;
        ee var11 = null;
        ee var12 = null;
        ee var13 = null;
        ee var14 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var7_ref = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param4.field_j[param0][param3].field_n != 1) {
                break L1;
              } else {
                var7_ref = null;
                if (param4.field_j[param0][param3].field_k != 5) {
                  if (param4.field_j[param0][param3].field_k != 10) {
                    if (param4.field_j[param0][param3].field_k == 15) {
                      L2: {
                        stackOut_50_0 = this;
                        stackOut_50_1 = param4.field_i.field_h.field_E;
                        stackIn_52_0 = stackOut_50_0;
                        stackIn_52_1 = stackOut_50_1;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        if (!param4.field_j[param0][param3].field_o) {
                          stackOut_52_0 = this;
                          stackOut_52_1 = stackIn_52_1;
                          stackOut_52_2 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          stackIn_53_2 = stackOut_52_2;
                          break L2;
                        } else {
                          stackOut_51_0 = this;
                          stackOut_51_1 = stackIn_51_1;
                          stackOut_51_2 = 16;
                          stackIn_53_0 = stackOut_51_0;
                          stackIn_53_1 = stackOut_51_1;
                          stackIn_53_2 = stackOut_51_2;
                          break L2;
                        }
                      }
                      L3: {
                        var14 = this.a(stackIn_53_1, stackIn_53_2 + (param0 - -param3) % 4 * 5, 15392);
                        if (var14 != null) {
                          var14.a(param2, param5, 104);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        stackOut_56_0 = this;
                        stackOut_56_1 = 5 * ((param0 - -param3) % 4);
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        if (param4.field_j[param0][param3].field_o) {
                          stackOut_58_0 = this;
                          stackOut_58_1 = stackIn_58_1;
                          stackOut_58_2 = 16;
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          stackIn_59_2 = stackOut_58_2;
                          break L4;
                        } else {
                          stackOut_57_0 = this;
                          stackOut_57_1 = stackIn_57_1;
                          stackOut_57_2 = 0;
                          stackIn_59_0 = stackOut_57_0;
                          stackIn_59_1 = stackOut_57_1;
                          stackIn_59_2 = stackOut_57_2;
                          break L4;
                        }
                      }
                      this.a(stackIn_59_1 - -stackIn_59_2, (byte) -78).a(param2, param5);
                      break L1;
                    } else {
                      L5: {
                        stackOut_40_0 = this;
                        stackOut_40_1 = param4.field_i.field_h.field_E;
                        stackOut_40_2 = param4.field_j[param0][param3].field_k;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_42_2 = stackOut_40_2;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        if (!param4.field_j[param0][param3].field_o) {
                          stackOut_42_0 = this;
                          stackOut_42_1 = stackIn_42_1;
                          stackOut_42_2 = stackIn_42_2;
                          stackOut_42_3 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          stackIn_43_2 = stackOut_42_2;
                          stackIn_43_3 = stackOut_42_3;
                          break L5;
                        } else {
                          stackOut_41_0 = this;
                          stackOut_41_1 = stackIn_41_1;
                          stackOut_41_2 = stackIn_41_2;
                          stackOut_41_3 = 16;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          stackIn_43_2 = stackOut_41_2;
                          stackIn_43_3 = stackOut_41_3;
                          break L5;
                        }
                      }
                      L6: {
                        var13 = this.a(stackIn_43_1, stackIn_43_2 + stackIn_43_3, 15392);
                        if (var13 != null) {
                          var13.a(param2, param5, 104);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        stackOut_46_0 = this;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_47_0 = stackOut_46_0;
                        if (param4.field_j[param0][param3].field_o) {
                          stackOut_48_0 = this;
                          stackOut_48_1 = 16;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          break L7;
                        } else {
                          stackOut_47_0 = this;
                          stackOut_47_1 = 0;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          break L7;
                        }
                      }
                      this.a(stackIn_49_1 + param4.field_j[param0][param3].field_k, (byte) -78).a(param2, param5);
                      break L1;
                    }
                  } else {
                    L8: {
                      stackOut_22_0 = this;
                      stackOut_22_1 = param4.field_i.field_h.field_E;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      if (!param4.field_j[param0][param3].field_o) {
                        stackOut_24_0 = this;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        break L8;
                      } else {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 16;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        break L8;
                      }
                    }
                    L9: {
                      var11 = this.a(stackIn_25_1, stackIn_25_2 + 8, 15392);
                      if (var11 == null) {
                        break L9;
                      } else {
                        var11.a(param2, param5, 104);
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_27_0 = this;
                      stackOut_27_1 = param4.field_i.field_h.field_E;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      if (param4.field_j[param0][param3].field_o) {
                        stackOut_29_0 = this;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = 16;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        stackIn_30_2 = stackOut_29_2;
                        break L10;
                      } else {
                        stackOut_28_0 = this;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = 0;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        stackIn_30_2 = stackOut_28_2;
                        break L10;
                      }
                    }
                    L11: {
                      var12 = this.a(stackIn_30_1, stackIn_30_2 + 2, 15392);
                      if (var12 == null) {
                        break L11;
                      } else {
                        var12.a(param2, param5, 104);
                        break L11;
                      }
                    }
                    L12: {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 8;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      if (param4.field_j[param0][param3].field_o) {
                        stackOut_34_0 = this;
                        stackOut_34_1 = stackIn_34_1;
                        stackOut_34_2 = 16;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        stackIn_35_2 = stackOut_34_2;
                        break L12;
                      } else {
                        stackOut_33_0 = this;
                        stackOut_33_1 = stackIn_33_1;
                        stackOut_33_2 = 0;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_35_2 = stackOut_33_2;
                        break L12;
                      }
                    }
                    L13: {
                      this.a(stackIn_35_1 + stackIn_35_2, (byte) -78).a(param2, param5);
                      stackOut_35_0 = this;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (!param4.field_j[param0][param3].field_o) {
                        stackOut_37_0 = this;
                        stackOut_37_1 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L13;
                      } else {
                        stackOut_36_0 = this;
                        stackOut_36_1 = 16;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L13;
                      }
                    }
                    this.a(stackIn_38_1 + 2, (byte) -78).a(param2, param5);
                    break L1;
                  }
                } else {
                  L14: {
                    stackOut_3_0 = this;
                    stackOut_3_1 = param4.field_i.field_h.field_E;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (!param4.field_j[param0][param3].field_o) {
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L14;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 16;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L14;
                    }
                  }
                  L15: {
                    var9 = this.a(stackIn_6_1, stackIn_6_2 + 4, 15392);
                    if (var9 != null) {
                      var9.a(param2, param5, 104);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    stackOut_9_0 = this;
                    stackOut_9_1 = param4.field_i.field_h.field_E;
                    stackOut_9_2 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    if (param4.field_j[param0][param3].field_o) {
                      stackOut_11_0 = this;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = stackIn_11_2;
                      stackOut_11_3 = 16;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      break L16;
                    } else {
                      stackOut_10_0 = this;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = stackIn_10_2;
                      stackOut_10_3 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = this.a(stackIn_12_1, stackIn_12_2 + stackIn_12_3, 15392);
                    if (var10 == null) {
                      break L17;
                    } else {
                      var10.a(param2, param5, 104);
                      break L17;
                    }
                  }
                  L18: {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 4;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (param4.field_j[param0][param3].field_o) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = 16;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      break L18;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = 0;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      break L18;
                    }
                  }
                  L19: {
                    this.a(stackIn_17_1 - -stackIn_17_2, (byte) -78).a(param2, param5);
                    stackOut_17_0 = this;
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (!param4.field_j[param0][param3].field_o) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      break L19;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = 16;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      break L19;
                    }
                  }
                  this.a(stackIn_20_1 + stackIn_20_2, (byte) -78).a(param2, param5);
                  break L1;
                }
              }
            }
            L20: {
              if (param4.field_j[param0][param3].field_n != 29) {
                break L20;
              } else {
                if (param4.field_j[param0][param3].field_k == 5) {
                  pk.field_b[4].a(param2, param5);
                  pk.field_b[1].a(param2, param5);
                  break L20;
                } else {
                  if (10 != param4.field_j[param0][param3].field_k) {
                    if (15 != param4.field_j[param0][param3].field_k) {
                      pk.field_b[param4.field_j[param0][param3].field_k].a(param2, param5);
                      break L20;
                    } else {
                      pk.field_b[5 * ((param3 + param0) % 4)].a(param2, param5);
                      break L20;
                    }
                  } else {
                    pk.field_b[8].a(param2, param5);
                    pk.field_b[2].a(param2, param5);
                    break L20;
                  }
                }
              }
            }
            L21: {
              if (!param1) {
                break L21;
              } else {
                ((pn) this).field_c = null;
                break L21;
              }
            }
            L22: {
              if (30 == param4.field_j[param0][param3].field_n) {
                if (param4.field_j[param0][param3].field_k == 5) {
                  ld.field_l[4].a(param2, param5);
                  ld.field_l[1].a(param2, param5);
                  break L22;
                } else {
                  if (10 == param4.field_j[param0][param3].field_k) {
                    ld.field_l[8].a(param2, param5);
                    ld.field_l[2].a(param2, param5);
                    break L22;
                  } else {
                    if (param4.field_j[param0][param3].field_k != 15) {
                      ld.field_l[param4.field_j[param0][param3].field_k].a(param2, param5);
                      break L22;
                    } else {
                      ld.field_l[(param3 + param0) % 4 * 5].a(param2, param5);
                      break L22;
                    }
                  }
                }
              } else {
                break L22;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var7;
            stackOut_80_1 = new StringBuilder().append("pn.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param4 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L23;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L23;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + 44 + param5 + 41);
        }
    }

    private final ee c(int param0, int param1) {
        if (param1 < 0) {
            return null;
        }
        if (param1 > 23) {
            return null;
        }
        if (param0 != 26728) {
            return null;
        }
        return ((pn) this).field_b[param1 - -64];
    }

    private final ee a(int param0, int param1, int param2) {
        if (param2 != 15392) {
            return null;
        }
        if (1 != param0) {
            return null;
        }
        return nca.field_a[64 + param1];
    }

    private final ee a(byte param0, int param1) {
        if (param1 > 5) {
            return null;
        }
        if (param0 != -18) {
            Object var4 = null;
            this.a(-77, false, -85, -1, (jo) null, -104);
        }
        return ((pn) this).field_b[param1 + 88];
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Chat";
        field_f = 0;
    }
}
