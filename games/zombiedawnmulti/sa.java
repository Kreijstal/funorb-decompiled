/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends br {
    private int field_o;
    private rl field_i;
    static ip field_n;
    private int field_k;
    static boolean field_f;
    private int field_j;
    private int field_h;
    private int field_l;
    private int field_p;
    private int field_g;
    private int field_m;

    final static String a(String param0, int param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = param3.length();
              if (param1 > 53) {
                break L1;
              } else {
                sa.a((md) null, (int[]) null, false, (int[]) null, (byte) -11, true, true);
                break L1;
              }
            }
            if (0 != var5) {
              L2: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (-1 != (var8 ^ -1)) {
                  var9_int = 0;
                  L3: while (true) {
                    var9_int = param0.indexOf(param2, var9_int);
                    if (0 > var9_int) {
                      break L2;
                    } else {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                var11 = param0.indexOf(param2, var10);
                if (-1 >= (var11 ^ -1)) {
                  discarded$0 = var9.append(param0.substring(var10, var11));
                  discarded$1 = var9.append(param3);
                  var10 = var5 + var11;
                  continue L4;
                } else {
                  discarded$2 = var9.append(param0.substring(var10));
                  stackIn_20_0 = var9.toString();
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("sa.G(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), stackIn_33_2 + ')');
        }
        return stackIn_20_0;
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.a(-16, -55, 69);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_h < this.field_l) {
                  break L3;
                } else {
                  if ((this.field_k ^ -1) != -1) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "sa.A(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void d(int param0) {
        this.field_k = 0;
        if (param0 >= -89) {
            return;
        }
        try {
            this.field_h = this.field_l;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sa.B(" + param0 + ')');
        }
    }

    final void c(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        br var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        lm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.b(true)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  fieldTemp$0 = this.field_m;
                  this.field_m = this.field_m + 1;
                  if (-11 <= (fieldTemp$0 ^ -1)) {
                    break L2;
                  } else {
                    this.field_m = 0;
                    var2 = this.field_i.field_u.c(87);
                    L3: while (true) {
                      if (!(var2 instanceof ek)) {
                        break L2;
                      } else {
                        stackOut_7_0 = var2 instanceof lm;
                        stackIn_17_0 = stackOut_7_0 ? 1 : 0;
                        stackIn_8_0 = stackOut_7_0;
                        L4: {
                          if (stackIn_8_0) {
                            var3 = (lm) ((Object) var2);
                            var4 = var3.e((byte) -112) + -this.field_p;
                            var5 = var3.g(1829947600) + -this.field_o;
                            if (var4 * var4 - -(var5 * var5) >= 66564) {
                              break L4;
                            } else {
                              var3.a(-12, (sa) (this));
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var2 = var2.field_d;
                        continue L3;
                      }
                    }
                  }
                }
                this.field_g = this.field_g + 7;
                stackIn_17_0 = this.field_l ^ -1;
                break L1;
              }
              L5: {
                if (stackIn_17_0 < (this.field_h ^ -1)) {
                  L6: {
                    if ((this.field_k ^ -1) <= -257) {
                      break L6;
                    } else {
                      this.field_k = this.field_k + this.field_j;
                      break L6;
                    }
                  }
                  this.field_h = this.field_h + 1;
                  break L5;
                } else {
                  this.field_k = this.field_k - this.field_j;
                  break L5;
                }
              }
              L7: {
                if (this.field_g <= 256) {
                  break L7;
                } else {
                  this.field_g = 0;
                  break L7;
                }
              }
              L8: {
                var2_int = -106 % ((param0 - 35) / 42);
                if ((this.field_k ^ -1) >= -257) {
                  break L8;
                } else {
                  this.field_k = 256;
                  break L8;
                }
              }
              L9: {
                if (this.field_k < 0) {
                  this.field_k = 0;
                  break L9;
                } else {
                  break L9;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "sa.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -53) {
            return;
        }
        try {
            field_n = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sa.H(" + param0 + ')');
        }
    }

    final static void a(md param0, int[] param1, boolean param2, int[] param3, byte param4, boolean param5, boolean param6) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param1[3] >> 814923874;
              var22 = param1[4] >> -1747777982;
              var23 = param1[5] >> 1040089954;
              var24 = param1[6] >> -323443870;
              var25 = param1[7] >> -122920350;
              var26 = param1[8] >> 2079065474;
              var27 = param1[9] >> 966690082;
              var28 = param1[10] >> 1581801762;
              var13 = var24 * param3[3] + param3[4] * var25 + param3[5] * var26 >> 1987350670;
              var29 = param1[11] >> 1411848354;
              var12 = var21 * param3[3] - (-(param3[4] * var22) - var23 * param3[5]) >> 311831566;
              var15 = param3[7] * var22 + (param3[6] * var21 - -(param3[8] * var23)) >> -1089221874;
              var20 = var28 * param3[10] + param3[9] * var27 + var29 * param3[11] >> -512560370;
              var16 = var26 * param3[8] + (param3[6] * var24 - -(param3[7] * var25)) >> -1123621202;
              var19 = var26 * param3[11] + param3[9] * var24 - -(param3[10] * var25) >> 857428142;
              var14 = var27 * param3[3] + (var28 * param3[4] + var29 * param3[5]) >> -1554517362;
              var17 = param3[7] * var28 + (var27 * param3[6] - -(param3[8] * var29)) >> 841143342;
              var18 = var22 * param3[10] + (param3[9] * var21 - -(param3[11] * var23)) >> 1070710510;
              var21 = -param1[0] + param3[0];
              var22 = -param1[1] + param3[1];
              var23 = -param1[2] + param3[2];
              var9 = var23 * param1[5] + (var21 * param1[3] - -(var22 * param1[4])) >> 16 + -eq.field_g;
              var10 = param1[8] * var23 + param1[7] * var22 + var21 * param1[6] >> 16 + -eq.field_g;
              var11 = param1[11] * var23 + var22 * param1[10] + var21 * param1[9] >> -448722352;
              var21 = ep.field_d;
              var22 = ep.field_c;
              if (param4 == -121) {
                break L1;
              } else {
                field_n = (ip) null;
                break L1;
              }
            }
            var23 = 0;
            L2: while (true) {
              L3: {
                if (param0.field_n <= var23) {
                  L4: {
                    if (param0.field_t == null) {
                      break L4;
                    } else {
                      if (param0.field_w == null) {
                        break L4;
                      } else {
                        if (param0.field_I == null) {
                          break L4;
                        } else {
                          if (null == param0.field_e) {
                            break L4;
                          } else {
                            if (param0.field_h == null) {
                              break L4;
                            } else {
                              if (param0.field_q == null) {
                                break L4;
                              } else {
                                if (null == param0.field_f) {
                                  break L4;
                                } else {
                                  if (null == param0.field_O) {
                                    break L4;
                                  } else {
                                    if (param0.field_i != null) {
                                      var23 = 0;
                                      L5: while (true) {
                                        if (param0.field_B <= var23) {
                                          break L4;
                                        } else {
                                          var24 = param0.field_t[var23];
                                          var25 = param0.field_w[var23];
                                          var26 = param0.field_I[var23];
                                          nm.field_m[var23] = var9 + (var25 * var15 + var24 * var12 + var18 * var26 >> -329216560);
                                          nh.field_i[var23] = var10 - -(var13 * var24 + var25 * var16 - -(var26 * var19) >> -683618608);
                                          cj.field_F[var23] = (var20 * var26 + (var17 * var25 + var24 * var14) >> 1522631536) + var11;
                                          var24 = param0.field_e[var23];
                                          var25 = param0.field_h[var23];
                                          var26 = param0.field_q[var23];
                                          fk.field_m[var23] = var9 - -(var12 * var24 + var15 * var25 - -(var26 * var18) >> -1459227344);
                                          bh.field_c[var23] = var10 - -(var24 * var13 + (var25 * var16 + var26 * var19) >> 1969555440);
                                          de.field_c[var23] = var11 - -(var20 * var26 + (var17 * var25 + var14 * var24) >> 209888656);
                                          var24 = param0.field_f[var23];
                                          var25 = param0.field_O[var23];
                                          var26 = param0.field_i[var23];
                                          fl.field_c[var23] = (var24 * var12 + var15 * var25 + var18 * var26 >> 1459582480) + var9;
                                          qe.field_o[var23] = (var19 * var26 + (var25 * var16 + var13 * var24) >> -451914416) + var10;
                                          ll.field_f[var23] = (var14 * var24 + var17 * var25 + var26 * var20 >> 812793072) + var11;
                                          var23++;
                                          continue L5;
                                        }
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (!param2) {
                    break L3;
                  } else {
                    var9 = param3[3];
                    var10 = param3[4];
                    var11 = param3[5];
                    var12 = param3[6];
                    var13 = param3[7];
                    var14 = param3[8];
                    var15 = param3[9];
                    var16 = param3[10];
                    var17 = param3[11];
                    var18 = 0;
                    L6: while (true) {
                      stackIn_59_0 = param0.field_o ^ -1;
                      stackIn_59_1 = var18 ^ -1;
                      if (stackIn_59_0 >= stackIn_59_1) {
                        break L3;
                      } else {
                        if (eb.field_J.length <= var18) {
                          break L3;
                        } else {
                          var19 = param0.field_A[var18];
                          var20 = param0.field_p[var18];
                          var21 = param0.field_b[var18];
                          eb.field_J[var18] = var20 * var12 + (var19 * var9 - -(var21 * var15)) >> 1297599664;
                          bq.field_g[var18] = var21 * var16 + var20 * var13 + var10 * var19 >> 1880548624;
                          wp.field_i[var18] = var19 * var11 + var20 * var14 + var21 * var17 >> 432012016;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  var24 = param0.field_k[var23];
                  var25 = param0.field_E[var23];
                  var26 = param0.field_v[var23];
                  var27 = (var15 * var25 + (var24 * var12 + var18 * var26) >> -eq.field_g + 16) + var9;
                  var28 = (var19 * var26 + (var25 * var16 + var24 * var13) >> -eq.field_g + 16) + var10;
                  var29 = var11 + (var20 * var26 + (var17 * var25 + var14 * var24) >> -804483472);
                  stackIn_59_0 = -51;

                  stackIn_59_1 = var29 ^ -1;

                  L8: {
                    if (stackIn_59_0 >= stackIn_59_1) {
                      L9: {
                        lo.field_j[var23] = var21 + var27 / var29;
                        jk.field_k[var23] = var28 / var29 + var22;
                        if ((var8 ^ -1) <= (var29 ^ -1)) {
                          break L9;
                        } else {
                          var8 = var29;
                          break L9;
                        }
                      }
                      L10: {
                        if (var7_int <= var29) {
                          break L10;
                        } else {
                          var7_int = var29;
                          break L10;
                        }
                      }
                      hl.field_f[var23] = var29;
                      break L8;
                    } else {
                      hl.field_f[var23] = -2147483648;
                      break L8;
                    }
                  }
                  L11: {
                    if (!param5) {
                      break L11;
                    } else {
                      vi.field_b[var23] = var27 >> eq.field_g;
                      ok.field_r[var23] = var28 >> eq.field_g;
                      hp.field_s[var23] = var29;
                      break L11;
                    }
                  }
                  var23++;
                  continue L2;
                }
              }
              ho.a(param0, var8, var7_int, param6, 16634);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("sa.F(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L12;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L13;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L14;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_70_0), stackIn_78_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == 121) {
                break L1;
              } else {
                this.field_h = 67;
                break L1;
              }
            }
            this.field_o = param2;
            this.field_p = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "sa.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    sa(ge param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_m = 0;
        try {
          L0: {
            this.field_i = param0.field_A;
            this.field_k = 0;
            this.field_l = param3;
            this.field_p = param1;
            this.field_j = 3;
            this.field_o = param2;
            this.field_g = 0;
            this.field_h = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("sa.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 17310) {
                break L1;
              } else {
                this.c(-105);
                break L1;
              }
            }
            L2: {
              var4_int = -this.field_p + param0;
              var5 = -this.field_o + param2;
              if (var4_int * var4_int + var5 * var5 >= 66564) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "sa.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_f = false;
        field_n = new ip();
    }
}
