/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hs {
    static String field_b;
    static om field_d;
    int field_g;
    nu field_a;
    static int field_e;
    boolean field_f;
    private ko field_i;
    io[] field_c;
    int field_h;

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = Kickabout.field_G;
          if (param2 <= -48) {
            break L0;
          } else {
            this.e(38, -6);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_i.field_a) {
            return -1;
          } else {
            var5 = this.field_c[var4].field_d;
            var6 = this.field_c[var4].field_h;
            var7 = -(var5 >> -1250102591) + this.d(111, var4);
            var8 = this.c(342, var4) - (var6 >> 1812573025);
            if (this.e(var4, 50)) {
              if (var7 <= param0) {
                if (var7 - -var5 > param0) {
                  if (param1 >= var8) {
                    if (param1 < var8 - -var6) {
                      return var4;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    boolean e(int param0, int param1) {
        if (param1 != 50) {
            this.b(2, 47);
        }
        return true;
    }

    int d(int param0, int param1) {
        if (param0 <= 106) {
            return 15;
        }
        return 544;
    }

    final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 13) {
            break L0;
          } else {
            this.d(-24);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_g ^ -1) == 1) {
              break L2;
            } else {
              if (!this.field_a.field_R[this.field_g].d(3511)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static vn a(boolean param0, int param1, int param2, int param3, boolean[][] param4, int param5, boolean[][] param6, byte param7, int param8, boolean param9, int param10) {
        vn stackIn_4_0 = null;
        vn stackIn_13_0 = null;
        int stackIn_57_0 = 0;
        int stackIn_72_0 = 0;
        vn stackIn_80_0 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        int var12_int = 0;
        vn var12 = null;
        int var13 = 0;
        int var14 = 0;
        vn var15 = null;
        int var16 = 0;
        int var17 = 0;
        short[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        vn var27 = null;
        int var28 = 0;
        vn var29 = null;
        short[] var33 = null;
        var26 = Kickabout.field_G;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = pu.a(param9, param2, param4, (byte) -103, param6, param3, param10);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var27 = new vn(new vn[]{wj.field_v[param2][param8]}, 1);
                var29 = var27;
                if (!param9) {
                  break L1;
                } else {
                  var12_int = wc.field_e[param2];
                  var13 = 0;
                  L2: while (true) {
                    if (var13 >= var29.field_H.length) {
                      break L1;
                    } else {
                      var27.field_H[var13] = var27.field_H[var13] * 3;
                      var29.field_l[var13] = 3 * (var27.field_l[var13] + -var12_int) + var12_int;
                      var13++;
                      continue L2;
                    }
                  }
                }
              }
              L3: {
                var12 = new vn(new vn[]{var29, iw.field_m[param2]}, 2);
                var13 = (short)param3;
                var14 = (short)param10;
                var15 = new vn(var12, true, false, true, true);
                if (param4 != null) {
                  break L3;
                } else {
                  if (param6 == null) {
                    stackIn_13_0 = (vn) (var15);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param7 < -39) {
                  break L4;
                } else {
                  field_b = (String) null;
                  break L4;
                }
              }
              L5: {
                var33 = var12.field_p;
                var19 = var15.field_p;
                if (param2 != 4) {
                  var16 = -9284;
                  var20 = gt.field_h[param2][param8][param5].length;
                  var21 = 0;
                  L6: while (true) {
                    if (var33.length <= var21) {
                      var20 = gt.field_h[param2][param8][param5].length;
                      var21 = 0;
                      L7: while (true) {
                        if (var21 >= var20) {
                          var20 = hr.field_m[param2][param8][param1].length;
                          var21 = 0;
                          L8: while (true) {
                            if (var21 >= var20) {
                              if ((param2 ^ -1) == -3) {
                                var16 = (short)ad.field_e[param8][0];
                                var21 = 0;
                                L9: while (true) {
                                  if (var21 >= var33.length) {
                                    break L5;
                                  } else {
                                    L10: {
                                      if ((var33[var21] ^ -1) == (var16 ^ -1)) {
                                        var19[var21] = (short)ad.field_e[param8][param5];
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var21++;
                                    continue L9;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            } else {
                              var16 = (short)hr.field_m[param2][param8][0][var21];
                              var22 = 0;
                              L11: while (true) {
                                if (var33.length <= var22) {
                                  var21++;
                                  continue L8;
                                } else {
                                  L12: {
                                    if ((var33[var22] ^ -1) != (var16 ^ -1)) {
                                      break L12;
                                    } else {
                                      var19[var22] = (short)hr.field_m[param2][param8][param1][var21];
                                      break L12;
                                    }
                                  }
                                  var22++;
                                  continue L11;
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (short)gt.field_h[param2][param8][0][var21];
                          var22 = 0;
                          L13: while (true) {
                            if (var22 >= var33.length) {
                              var21++;
                              continue L7;
                            } else {
                              L14: {
                                if (var16 == var33[var22]) {
                                  var19[var22] = (short)gt.field_h[param2][param8][param5][var21];
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              var22++;
                              continue L13;
                            }
                          }
                        }
                      }
                    } else {
                      L15: {
                        if (var33[var21] == var16) {
                          var19[var21] = (short)gt.field_h[param2][param8][param5][0];
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var21++;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
              L16: {
                if (param4 == null) {
                  break L16;
                } else {
                  var20 = 0;
                  var21 = 0;
                  L17: while (true) {
                    if (param4.length <= var21) {
                      break L16;
                    } else {
                      var22 = 20;
                      var23 = 0;
                      L18: while (true) {
                        if (var23 >= param4[0].length) {
                          var20 += 3;
                          var21++;
                          continue L17;
                        } else {
                          L19: {
                            var24 = var23;
                            if (!param4[-var21 + 12][var24]) {
                              stackIn_57_0 = var13;
                              break L19;
                            } else {
                              stackIn_57_0 = var14;
                              break L19;
                            }
                          }
                          var17 = stackIn_57_0;
                          var16 = ks.a(var22, var20, 114, 7);
                          var25 = 0;
                          L20: while (true) {
                            if (var25 >= var33.length) {
                              var22 += 5;
                              var23++;
                              continue L18;
                            } else {
                              L21: {
                                if ((var16 ^ -1) != (var33[var25] ^ -1)) {
                                  break L21;
                                } else {
                                  var19[var25] = (short)var17;
                                  break L21;
                                }
                              }
                              var25++;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L22: {
                if (param6 == null) {
                  break L22;
                } else {
                  var20 = 0;
                  var21 = 0;
                  L23: while (true) {
                    if (param6.length <= var21) {
                      break L22;
                    } else {
                      var22 = 20;
                      var23 = 0;
                      L24: while (true) {
                        if (var23 >= param6[0].length) {
                          var20 += 3;
                          var21++;
                          continue L23;
                        } else {
                          L25: {
                            var24 = 9 + -var23;
                            if (!param6[-var21 + 12][var24]) {
                              stackIn_72_0 = var13;
                              break L25;
                            } else {
                              stackIn_72_0 = var14;
                              break L25;
                            }
                          }
                          var17 = stackIn_72_0;
                          var16 = ks.a(var22, var20, 110, 6);
                          var28 = 0;
                          var25 = var28;
                          L26: while (true) {
                            if (var33.length <= var28) {
                              var22 += 5;
                              var23++;
                              continue L24;
                            } else {
                              L27: {
                                if (var16 != var33[var28]) {
                                  break L27;
                                } else {
                                  var19[var28] = (short)var17;
                                  break L27;
                                }
                              }
                              var28++;
                              continue L26;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackIn_80_0 = (vn) (var15);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var11 = decompiledCaughtException;
            stackIn_83_0 = (RuntimeException) (var11);

            stackIn_83_1 = new StringBuilder().append("hs.LB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "null";
              break L28;
            } else {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_86_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "null";
              break L29;
            } else {
              stackIn_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "{...}";
              break L29;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_84_0), stackIn_87_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_80_0;
          }
        }
    }

    void a(int param0, boolean param1) {
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Kickabout.field_G;
        if (null != this.field_c) {
          L0: {
            if (param1) {
              this.field_i.a(-21174, this.a(wt.field_x, us.field_j, -74), this.a(dn.field_yb, kf.field_Eb, -106));
              if (-1 < (this.field_i.field_e ^ -1)) {
                break L0;
              } else {
                if (this.field_i.c(-1)) {
                  this.f(111, this.field_c[this.field_i.field_e].field_m);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (this.field_c.length <= var3) {
              L2: {
                if (param0 < -92) {
                  break L2;
                } else {
                  field_b = (String) null;
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (param1) {
                  if (var3 == this.field_i.field_e) {
                    stackIn_16_0 = 1;
                    break L3;
                  } else {
                    stackIn_16_0 = 0;
                    break L3;
                  }
                } else {
                  stackIn_16_0 = 0;
                  break L3;
                }
              }
              L4: {
                var4 = stackIn_16_0;
                if (param1) {
                  if (var4 != 0) {
                    if (this.field_i.c(-1)) {
                      stackIn_24_0 = 1;
                      break L4;
                    } else {
                      stackIn_24_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_24_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_24_0 = 0;
                  break L4;
                }
              }
              L5: {
                var5 = stackIn_24_0;
                if (var4 != 0) {
                  if (this.field_i.a(0)) {
                    stackIn_30_0 = 1;
                    break L5;
                  } else {
                    stackIn_30_0 = 0;
                    break L5;
                  }
                } else {
                  stackIn_30_0 = 0;
                  break L5;
                }
              }
              var6 = stackIn_30_0;
              var7 = wt.field_x - this.d(124, var3);
              this.field_c[var3].a(var4 != 0, var5 != 0, var6 != 0, 16, var7);
              var3++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 != -26254) {
            field_d = (om) null;
        }
        this.field_i = new ko(this.field_c.length);
        this.field_i.a(true, this.a(wt.field_x, us.field_j, -93), (byte) -127);
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        int var1 = 45 % ((22 - param0) / 38);
    }

    abstract void e(int param0);

    final void c(int param0) {
        on.a(10, 50, 620, 320, 20, 65793, 128);
        if (param0 < 43) {
            this.c(-47, -123);
        }
    }

    boolean a(char param0, int param1, int param2) {
        int incrementValue$3 = 0;
        int var4;
        int var5;
        L0: {
          var5 = Kickabout.field_G;
          if (param1 == 1670) {
            break L0;
          } else {
            this.field_i = (ko) null;
            break L0;
          }
        }
        if (null == this.field_i) {
          return false;
        } else {
          L1: {
            this.field_i.a(0, true);
            if (this.field_i.field_e >= 0) {
              var4 = 0;
              L2: while (true) {
                if (this.e(this.field_i.field_e, 50)) {
                  break L1;
                } else {
                  incrementValue$3 = var4;
                  var4++;
                  if (this.field_i.field_a < incrementValue$3) {
                    break L1;
                  } else {
                    if (96 == param2) {
                      this.field_i.field_e = (this.field_i.field_a + this.field_i.field_e + -1) % this.field_i.field_a;
                      continue L2;
                    } else {
                      this.field_i.field_e = (1 + this.field_i.field_e) % this.field_i.field_a;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L3: {
            if ((this.field_i.field_e ^ -1) > -1) {
              break L3;
            } else {
              if (this.field_i.c(-1)) {
                this.f(101, this.field_c[this.field_i.field_e].field_m);
                break L3;
              } else {
                return true;
              }
            }
          }
          return true;
        }
    }

    void a(boolean param0) {
        mj.a(140.0, 60, 448.0, 672.0);
        if (!param0) {
            this.d(69);
        }
    }

    final void b(int param0, int param1) {
        int var3;
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        if (0 == (param1 ^ -1)) {
          return;
        } else {
          L0: {
            var3 = 47;
            var4 = 83;
            var5 = Integer.toString(param1 / 50);
            iw.a(-45, hg.field_G);
            on.b();
            var6 = on.field_g >> 1301340449;
            var7 = on.field_f >> 926497377;
            un.field_d.d(var5, var6, var7, 16777215, -1);
            pw.field_H.c(-16 + var6, var7 - 31);
            ta.e(124);
            var8 = 256;
            if (param0 == -2351) {
              break L0;
            } else {
              this.field_c = (io[]) null;
              break L0;
            }
          }
          L1: {
            if (-11 > (param1 / 50 ^ -1)) {
              break L1;
            } else {
              var8 = var8 + (-200 - -(4 * (this.field_a.field_v % 50)) + 128);
              if (256 <= var8) {
                break L1;
              } else {
                var8 = 256;
                break L1;
              }
            }
          }
          L2: {
            var9 = hg.field_G.field_o;
            var10 = hg.field_G.field_v;
            if (256 == var8) {
              hg.field_G.c(var3 - (var9 >> -1025132031), -(var10 >> -1624295551) + var4);
              break L2;
            } else {
              var10 = var10 * var8 >> -1906217048;
              var9 = var8 * var9 >> -1512780888;
              hg.field_G.e(var3 + (-(var9 >> 1218602561) + -1), -1 + (var4 - (var10 >> 1428940641)), var9, var10, 256);
              break L2;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        int stackIn_21_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var13 = Kickabout.field_G;
          if ((this.field_g ^ -1) != 1) {
            stackIn_3_0 = this.field_a.field_g[this.field_g].field_p;
            break L0;
          } else {
            stackIn_3_0 = 0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          var6 = -1;
          if (param0 != var5) {
            break L1;
          } else {
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (this.field_g <= var7) {
                break L1;
              } else {
                if ((this.field_a.field_g[var7].field_p ^ -1) == (param0 ^ -1)) {
                  var6++;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          stackIn_11_0 = var6;

          stackIn_11_1 = 4;

          if (param0 != 0) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_1 = stackIn_11_1;
            stackIn_12_2 = nu.field_a;
            break L3;
          } else {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_1 = stackIn_11_1;
            stackIn_12_2 = he.field_Ub;
            break L3;
          }
        }
        wj.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, param3, param1, 114);
        param1 += 39;
        if (param2 < -43) {
          var14 = 0;
          var7 = var14;
          L4: while (true) {
            if (var14 >= this.field_a.field_I) {
              return;
            } else {
              if (param0 == this.field_a.field_g[var14].field_p) {
                L5: {
                  b.field_U[this.field_a.field_g[var14].field_f].c(param3, -16 + param1);
                  if (this.field_a.field_R[var14].d(3511)) {
                    stackIn_21_0 = 16777215;
                    break L5;
                  } else {
                    stackIn_21_0 = 11184810;
                    break L5;
                  }
                }
                var8 = stackIn_21_0;
                var9 = this.field_a.field_S[var14].toLowerCase();
                un.field_d.d(var9, param3 - -80, param1, var8, -1);
                if (!this.field_a.field_R[var14].d(3511)) {
                  var10 = un.field_d.a(var9);
                  var11 = param3 - -(-var10 + 160 >> -1971830719);
                  var12 = 10;
                  on.b(var11, -2 + param1 - var12, var10 + var11, param1 + -1, 13382451);
                  on.b(var11, param1 - 1, var10 + var11, -var12 + (param1 - 2), 13382451);
                  param1 += 23;
                  var14++;
                  continue L4;
                } else {
                  param1 += 23;
                  var14++;
                  continue L4;
                }
              } else {
                var14++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(boolean param0, String param1) {
        try {
            on.a(22, 62, 596, 28, 10, 65793, 128);
            if (param0) {
                this.field_a = (nu) null;
            }
            un.field_d.d(param1.toUpperCase(), 320, 83, 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "hs.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    int c(int param0, int param1) {
        if (param0 != 342) {
            return -91;
        }
        return 342 + -(param1 * 29);
    }

    hs(nu param0, int param1, boolean param2, int[] param3) {
        int var5_int = 0;
        try {
            this.field_g = param1;
            this.field_a = param0;
            this.field_h = -2 != this.field_g ? this.field_a.field_g[this.field_g].field_p : 0;
            this.field_f = param2 ? true : false;
            if (param3 != null) {
                this.field_c = new io[param3.length];
                for (var5_int = 0; param3.length > var5_int; var5_int++) {
                    this.field_c[var5_int] = new io(-3, 7126504, param3[var5_int]);
                }
                this.a(-26254);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "hs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void f(int param0, int param1);

    final void d(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Kickabout.field_G;
        if (null != this.field_c) {
          var2 = 90 / ((param0 - 78) / 38);
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_c.length) {
              return;
            } else {
              if (this.e(var3, 50)) {
                this.field_c[var3].a(this.c(342, var3), this.d(124, var3), 13800);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1) {
        int stackIn_8_0 = 0;
        int var3;
        int[] var4;
        int[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        L0: {
          var9 = Kickabout.field_G;
          if (param1 == 17709) {
            break L0;
          } else {
            this.a(-84, 57);
            break L0;
          }
        }
        L1: {
          var3 = 210;
          var4 = new int[]{-160 + -var3 + 640 >> 1264603681, -160 + (640 - -var3) >> -167049151};
          var5 = new int[]{23 + param0, param0 + 23};
          if (1 != (this.field_g ^ -1)) {
            if (1 == this.field_a.field_g[this.field_g].field_p) {
              stackIn_8_0 = 1;
              break L1;
            } else {
              stackIn_8_0 = 0;
              break L1;
            }
          } else {
            stackIn_8_0 = 0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_8_0;
          if (var6 == 0) {
            break L2;
          } else {
            var7 = var4[0];
            var4[0] = var4[1];
            var4[1] = var7;
            break L2;
          }
        }
        this.a(0, param0, (byte) -62, var4[0]);
        this.a(1, param0, (byte) -72, var4[1]);
        var10 = 0;
        var7 = var10;
        L3: while (true) {
          if (this.field_a.field_I <= var10) {
            return;
          } else {
            L4: {
              var8 = this.field_a.field_g[var10].field_p;
              pt.a(640, -22914, 2 + (var4[var8] - -160), 480, 0);
              on.a(var4[var8], var5[var8], 186, 21, 7, 65793, 128);
              ta.e(123);
              if (this.field_a.field_R[var10].field_i) {
                vb.field_l.c(2 + (160 + var4[var8]), -4 + var5[var8]);
                break L4;
              } else {
                break L4;
              }
            }
            var5[var8] = var5[var8] + 23;
            var10++;
            continue L3;
          }
        }
    }

    static {
        field_b = "£";
    }
}
