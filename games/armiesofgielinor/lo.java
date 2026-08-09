/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends tc {
    private int field_t;
    private byte[] field_s;
    int field_p;
    private ne[] field_r;
    int field_l;
    static me field_q;
    int field_n;
    int field_k;
    static um field_u;
    static String field_m;
    static String field_o;

    final static void a(mo param0, int param1) {
        int var2_int = 0;
        mo var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_h) {
              L1: {
                L2: {
                  if ((param0.field_a ^ -1) != param1) {
                    break L2;
                  } else {
                    if (0 == param0.field_e) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (lk.field_h <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = an.field_F[var2_int];
                      if (2 != var3.field_b) {
                        break L4;
                      } else {
                        if (param0.field_a != var3.field_a) {
                          break L4;
                        } else {
                          if (var3.field_e == param0.field_e) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == param0.field_d) {
                  break L5;
                } else {
                  ma.field_ab = param0.field_n;
                  rv.field_b = param0.field_d;
                  ge.field_h = param0.field_m;
                  no.field_S = param0.field_b;
                  break L5;
                }
              }
              bc.a(3208, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("lo.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(ne[] param0, vh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jd var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param2 >= 86) {
              if (param0 != null) {
                var4_int = param1.k(0);
                var5 = 0;
                var6 = 0;
                L1: while (true) {
                  if (var4_int <= var6) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var7 = param1.k(0);
                      var8 = param1.k(0);
                      if (-1 < (var7 ^ -1)) {
                        break L2;
                      } else {
                        if (this.field_l <= var7) {
                          break L2;
                        } else {
                          if (var8 < 0) {
                            break L2;
                          } else {
                            if (var8 < this.field_n) {
                              var9 = new jd(var7, var8, 0);
                              var10 = var7 + var8 * this.field_l;
                              if (0 > var10) {
                                break L2;
                              } else {
                                if (var10 > param0.length) {
                                  break L2;
                                } else {
                                  param0[var10].field_c = var9;
                                  param0[var10].field_c.field_O = var5;
                                  var5++;
                                  break L2;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("lo.G(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int[][] e(int param0) {
        int[][] var2;
        vh var3_ref_vh;
        int var4;
        int var5;
        int var6;
        int[][] var7;
        int[][] var8;
        int var3;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var8 = new int[this.field_n][this.field_l];
          var7 = var8;
          var2 = var7;
          if (this.field_r != null) {
            var3 = 0;
            L1: while (true) {
              if (this.field_n <= var3) {
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= this.field_l) {
                    var3++;
                    continue L1;
                  } else {
                    var8[var3][var4] = this.field_r[var4 - -(this.field_l * var3)].field_h;
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var3_ref_vh = this.a((byte) 126);
            var4 = 0;
            L3: while (true) {
              if (this.field_n <= var4) {
                break L0;
              } else {
                var5 = 0;
                L4: while (true) {
                  if (this.field_l <= var5) {
                    var4++;
                    continue L3;
                  } else {
                    var8[var4][var5] = var3_ref_vh.k(0);
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        if (param0 == 28554) {
          return var2;
        } else {
          return (int[][]) null;
        }
    }

    private final ne[] a(int[] param0, int param1, ha param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ne[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ne[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.field_n * this.field_l;
              if (param1 == 22654) {
                break L1;
              } else {
                this.e(117);
                break L1;
              }
            }
            var5 = new ne[var4_int];
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (this.field_n <= var7) {
                stackIn_15_0 = (ne[]) (var5);
                break L0;
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= this.field_l) {
                    var7++;
                    continue L2;
                  } else {
                    L4: {
                      if ((var5.length ^ -1) <= (var6 ^ -1)) {
                        L5: {
                          var5[var6] = new ne(param0[var6], param2);
                          if (-12 != (var5[var6].field_h ^ -1)) {
                            break L5;
                          } else {
                            var5[var6].field_h = 0;
                            break L5;
                          }
                        }
                        var6++;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("lo.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        return stackIn_15_0;
    }

    private final vh a(byte param0) {
        sc var3_ref_sc;
        int var3;
        ne[] var4;
        int var5;
        ne var6;
        int var7;
        bv var8;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-5 >= (this.field_s.length ^ -1)) {
          L0: {
            var8 = new bv(this.field_s);
            this.field_t = bs.a(var8, 3);
            if (param0 == 126) {
              break L0;
            } else {
              this.field_l = 72;
              break L0;
            }
          }
          if ((this.field_t ^ -1) == -3) {
            var3_ref_sc = po.a(var8, param0 + -24046);
            this.field_l = var3_ref_sc.field_k;
            this.field_p = var3_ref_sc.field_a;
            this.field_n = var3_ref_sc.field_e;
            this.field_r = var3_ref_sc.field_c;
            this.field_k = var3_ref_sc.field_j;
            var4 = this.field_r;
            var5 = 0;
            L1: while (true) {
              if (var5 < var4.length) {
                var6 = var4[var5];
                var6.field_m = var6.e(10);
                var5++;
                continue L1;
              } else {
                return null;
              }
            }
          } else {
            L2: {
              this.field_l = var8.k(0);
              this.field_n = var8.k(0);
              if (-2 < (this.field_t ^ -1)) {
                this.field_p = 0;
                break L2;
              } else {
                this.field_p = var8.k(0);
                break L2;
              }
            }
            L3: {
              if ((this.field_t ^ -1) <= -1) {
                this.field_k = var8.k(0);
                break L3;
              } else {
                var3 = this.field_l * this.field_n;
                var8.field_q = var8.field_q + var3;
                this.field_k = var8.k(0);
                var8.field_q = var8.field_q - (var3 + 1);
                break L3;
              }
            }
            return (vh) ((Object) var8);
          }
        } else {
          return null;
        }
    }

    final static void a(va param0, int param1) {
        try {
            param0.field_y = new int[]{-1};
            param0.field_v = new char[]{(char)63};
            if (param1 != 19003) {
                va var3 = (va) null;
                lo.a((va) null, 21);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lo.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            kl var2 = (kl) null;
            lo.a((String) null, 125, (String) null, (kl) null);
        }
        field_u = null;
        field_q = null;
        field_m = null;
    }

    final static ru[] a(String param0, int param1, String param2, kl param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ru[] stackIn_2_0 = null;
        ru[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -28106) {
              var4_int = param3.a(param2, 110);
              var5 = param3.a((byte) -74, var4_int, param0);
              stackIn_4_0 = ak.a(var5, param3, 0, var4_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ru[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("lo.H(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final ne[] a(int param0, ha param1) {
        vh discarded$0 = null;
        ne[] stackIn_11_0 = null;
        ne[] stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ne[] var3 = null;
        RuntimeException var3_ref = null;
        vh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ne var5_ref_ne = null;
        int[] var6 = null;
        int var7_int = 0;
        ne[] var7 = null;
        int var8 = 0;
        tf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        ne var13 = null;
        jd var14 = null;
        int var15 = 0;
        ne[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null == this.field_r) {
              var3_int = 116 % ((param0 - -31) / 60);
              var4 = this.a((byte) 126);
              var5 = this.field_n * this.field_l;
              var18 = new int[var5];
              var17 = var18;
              var6 = var17;
              if (2 + var5 > this.field_s.length) {
                throw new RuntimeException("Problem loading file");
              } else {
                var7_int = 0;
                L1: while (true) {
                  if (var5 <= var7_int) {
                    L2: {
                      var7 = this.a(var18, 22654, param1);
                      if (0 <= this.field_t) {
                        var8 = var4.k(0);
                        var9 = new tf(0, 0);
                        var10 = 0;
                        L3: while (true) {
                          if (var8 <= var10) {
                            break L2;
                          } else {
                            L4: {
                              var11 = var4.k(0);
                              var12 = var11;
                              if (var12 == 0) {
                                var9.field_n = var4.k(0);
                                var9.field_o = var4.k(0);
                                var12 = var4.k(0);
                                var13_int = var4.k(0);
                                var14 = new jd(var9.field_n, var9.field_o, var12);
                                var14.field_O = var13_int;
                                var7[var9.field_o * this.field_l + var9.field_n].field_c = var14;
                                break L4;
                              } else {
                                if (1 != var12) {
                                  throw new RuntimeException("Illegal saved item type: " + var11);
                                } else {
                                  L5: {
                                    var9.field_n = var4.k(0);
                                    var9.field_o = var4.k(0);
                                    var12 = var4.k(0);
                                    var13 = var7[var9.field_n - -(var9.field_o * this.field_l)];
                                    if (var13.a(false)) {
                                      break L5;
                                    } else {
                                      if (var13.e((byte) -125)) {
                                        break L5;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  var13.field_a = var12;
                                  break L4;
                                }
                              }
                            }
                            var10++;
                            continue L3;
                          }
                        }
                      } else {
                        this.a(var7, var4, 105);
                        break L2;
                      }
                    }
                    stackIn_33_0 = (ne[]) (var7);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var6[var7_int] = var4.k(0);
                    var7_int++;
                    continue L1;
                  }
                }
              }
            } else {
              discarded$0 = this.a((byte) 126);
              var16 = this.field_r;
              var3 = var16;
              var4_int = 0;
              L6: while (true) {
                if (var4_int >= var16.length) {
                  stackIn_11_0 = this.field_r;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var5_ref_ne = var16[var4_int];
                  var5_ref_ne.a((byte) -68, param1);
                  if (var5_ref_ne.e((byte) -122)) {
                    L7: {
                      if (var5_ref_ne.a((byte) -107) == 0) {
                        var5_ref_ne.a(true, 1);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var4_int++;
                    continue L6;
                  } else {
                    var4_int++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3_ref);

            stackIn_36_1 = new StringBuilder().append("lo.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L8;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_33_0;
        }
    }

    lo(int param0, byte[] param1) {
        vh discarded$0 = null;
        try {
            this.field_s = param1;
            this.field_r = null;
            discarded$0 = this.a((byte) 126);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "lo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new me(12, 0, 1, 0);
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_o = "Logging in...";
    }
}
