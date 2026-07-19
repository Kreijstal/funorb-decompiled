/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends ka {
    static boolean field_r;
    static int field_t;
    static char field_p;
    static ds field_u;
    static String field_s;
    static ap field_q;

    hg(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 6);
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10, boolean param11) {
        so.a(0, param8, 16777215, param9, param2, param6, param11, param5, param0, param4, param10, param1, param7, param3);
    }

    final int a(int param0, int param1, fs param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln[] var8_ref_ln__ = null;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        int var13 = 0;
        ln var14 = null;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.field_x;
              if (this.field_n == param2) {
                break L1;
              } else {
                if (this.field_n.field_h[var4_int]) {
                  break L1;
                } else {
                  if ((1 << var4_int & this.field_g.field_w) != 0) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5 = this.field_g.field_v[this.field_g.field_m[-1 + this.field_g.field_r]];
                    if (param2 == var5) {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var6 = param1;
                      var7 = 0;
                      var8_ref_ln__ = this.field_g.field_g.field_e;
                      var9 = 0;
                      L2: while (true) {
                        if (var8_ref_ln__.length <= var9) {
                          if (var7 * 2 < var6) {
                            stackOut_30_0 = -1;
                            stackIn_31_0 = stackOut_30_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            L3: {
                              var8 = lc.a(param1 + 12330, (1 << this.field_g.field_r) - 1 ^ this.field_g.field_w);
                              if (var8 * var6 >= var7) {
                                break L3;
                              } else {
                                if (this.field_g.field_D[this.field_n.field_x] > this.field_g.field_D[var4_int] * var8) {
                                  stackOut_35_0 = 4;
                                  stackIn_36_0 = stackOut_35_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L4: {
                              if (var5 != this.field_n) {
                                stackOut_39_0 = -2;
                                stackIn_40_0 = stackOut_39_0;
                                break L4;
                              } else {
                                stackOut_38_0 = -3;
                                stackIn_40_0 = stackOut_38_0;
                                break L4;
                              }
                            }
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          L5: {
                            var10 = var8_ref_ln__[var9];
                            if (var10.field_y == this.field_n) {
                              var11 = 0;
                              var12 = var10.field_D;
                              var13 = 0;
                              L6: while (true) {
                                if (var13 >= var12.length) {
                                  if (var11 != 0) {
                                    var7 = var7 + var10.field_x;
                                    break L5;
                                  } else {
                                    var9++;
                                    continue L2;
                                  }
                                } else {
                                  L7: {
                                    var14 = var12[var13];
                                    if (var14.field_y == param2) {
                                      var11 = 1;
                                      var6 = var6 + var14.field_x;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var13++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                          var9++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var4);
            stackOut_41_1 = new StringBuilder().append("hg.UA(").append(param0).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L8;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_31_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0;
                } else {
                  return stackIn_40_0;
                }
              }
            }
          }
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; this.field_g.field_r > var2; var2++) {
            this.field_b[var2] = this.a(0, 0, this.field_g.field_v[var2]);
        }
        if (param0 != -18484) {
            hg.a(-92, true, -31, false, 87, 112, -41, 4, true, false, 96, false);
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_u = null;
        field_q = null;
        field_s = null;
    }

    final int[] b(int param0) {
        int var2 = -114 % ((-48 - param0) / 61);
        return new int[]{17, 18};
    }

    final static String a(boolean param0, nf param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_34_0 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        String stackOut_2_0 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        Object stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              L1: {
                var2 = null;
                if (param1.field_d == null) {
                  break L1;
                } else {
                  L2: {
                    var5 = param1.field_d;
                    var2 = var5;
                    var2 = var5;
                    var2 = var5;
                    if (-2 == (param1.field_c ^ -1)) {
                      var2 = "<img=0>" + var5;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if ((param1.field_c ^ -1) != -3) {
                    break L1;
                  } else {
                    var2 = "<img=1>" + (String) (var2);
                    break L1;
                  }
                }
              }
              L3: {
                var3 = "";
                if ((param1.field_n ^ -1) == -3) {
                  if (!param1.field_h) {
                    L4: {
                      if (-1 != (param1.field_l ^ -1)) {
                        break L4;
                      } else {
                        if (-1 == (param1.field_e ^ -1)) {
                          var3 = re.a(fj.field_q, 4371, new String[]{(String) (var2)});
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3 = re.a(cf.field_M, 4371, new String[]{(String) (var2)});
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  L5: {
                    if (param1.field_n != 0) {
                      break L5;
                    } else {
                      if (!je.field_e) {
                        break L5;
                      } else {
                        var3 = "[" + ds.field_a + "] ";
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if ((param1.field_n ^ -1) == -2) {
                      var3 = "[" + re.a(he.field_q, 4371, new String[]{param1.field_o}) + "] ";
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((param1.field_n ^ -1) != -5) {
                      break L7;
                    } else {
                      if (wf.field_m != null) {
                        var3 = "[" + wf.field_m + "] ";
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param1.field_n == 3) {
                      var3 = "[#" + param1.field_o + "] ";
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (param1.field_h) {
                    break L3;
                  } else {
                    var3 = var3 + (String) (var2) + ": ";
                    break L3;
                  }
                }
              }
              stackOut_33_0 = (String) (var3);
              stackIn_34_0 = stackOut_33_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = var2;
            stackOut_35_1 = new StringBuilder().append("hg.C(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = stackIn_37_0;
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_36_0 = stackIn_36_0;
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_34_0;
        }
    }

    public final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (this.field_g.field_o.field_i) {
            if (this.field_n.field_m.e(27650)) {
              this.a(false, param0 ^ 6898);
              break L0;
            } else {
              break L0;
            }
          } else {
            if (!this.field_n.field_i.g(param0 ^ 80)) {
              break L0;
            } else {
              this.a(false, -6861);
              break L0;
            }
          }
        }
        L1: {
          var2 = this.field_g.field_m[this.field_g.field_r - 1];
          if (param0 == -63) {
            break L1;
          } else {
            field_q = (ap) null;
            break L1;
          }
        }
        var3 = this.field_g.field_D[var2];
        var4 = 0;
        L2: while (true) {
          if (var4 >= this.field_g.field_r) {
            L3: {
              if (!this.c((byte) -116)) {
                break L3;
              } else {
                this.g(-18484);
                var4 = 0;
                L4: while (true) {
                  if (this.field_g.field_r <= var4) {
                    break L3;
                  } else {
                    if (this.field_b[var4] < 0) {
                      L5: {
                        var5 = this.field_g.field_v[var4];
                        if ((this.field_c[var4] ^ -1) < -1) {
                          break L5;
                        } else {
                          L6: {
                            var9 = this.field_b[var4];
                            if (var9 == -1) {
                              var6 = 7;
                              break L6;
                            } else {
                              if (1 != (var9 ^ -1)) {
                                if (var9 != -3) {
                                  var6 = -1;
                                  break L6;
                                } else {
                                  var7 = this.field_g.field_m[-1 + this.field_g.field_r];
                                  var6 = 9;
                                  var8 = this.field_g.field_m[-2 + this.field_g.field_r];
                                  if (var7 == this.field_n.field_x) {
                                    break L6;
                                  } else {
                                    if (var7 != var4) {
                                      if (this.field_g.field_D[var7] * 2 > this.field_g.field_D[var8] * 3) {
                                        var6 = 8;
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                var6 = 8;
                                break L6;
                              }
                            }
                          }
                          if (var6 == -1) {
                            break L5;
                          } else {
                            this.field_j.a(0, (byte) -118, var5, this.field_n, var6);
                            this.field_c[var4] = rg.a(6, 3, (byte) 118);
                            break L5;
                          }
                        }
                      }
                      this.field_j.a((byte) -63, this.field_n, var5);
                      var4++;
                      continue L4;
                    } else {
                      var4++;
                      continue L4;
                    }
                  }
                }
              }
            }
            return;
          } else {
            this.field_c[var4] = this.field_c[var4] - 1;
            if (var2 != var4) {
              if (this.field_g.field_D[var4] * 2 < var3) {
                this.field_i[var4] = 0;
                var4++;
                continue L2;
              } else {
                this.field_i[var4] = this.field_i[var4] - 1;
                var4++;
                continue L2;
              }
            } else {
              this.field_i[var4] = 3;
              var4++;
              continue L2;
            }
          }
        }
    }

    static {
        field_p = '/';
        field_u = new ds(3);
        field_s = "<%0> points per turn";
    }
}
