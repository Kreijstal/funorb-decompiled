/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends lq {
    private int[][] field_j;
    private qm[] field_p;
    static String field_m;
    ru[] field_k;
    int[] field_n;
    private int[] field_l;
    int field_o;
    private int[] field_i;

    final int d() {
        return 2;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        L0: {
          if (param2 == -85) {
            break L0;
          } else {
            this.field_l = (int[]) null;
            break L0;
          }
        }
        L1: {
          if ((param0 ^ -1) > -1) {
            break L1;
          } else {
            if (this.field_o <= param0) {
              break L1;
            } else {
              L2: {
                if (-1 < (param1 ^ -1)) {
                  break L2;
                } else {
                  if (256 >= param1) {
                    this.field_l[param0] = param1;
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              throw new IllegalArgumentException("Illegal volume: " + param1);
            }
          }
        }
        throw new IllegalArgumentException("Illegal midiplayer: " + param0);
    }

    final void a(int[] param0, int param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            var4_int = 1;
            var5 = 0;
            L1: while (true) {
              if (this.field_l.length <= var5) {
                if (var4_int == 0) {
                  var5 = 0;
                  var6_int = 0;
                  L2: while (true) {
                    if (var6_int >= this.field_p.length) {
                      var12 = 0;
                      var6_int = var12;
                      L3: while (true) {
                        if (var12 >= this.field_n.length) {
                          var14 = new int[this.field_o];
                          var13 = var14;
                          var6 = var13;
                          var7 = 0;
                          L4: while (true) {
                            if (var7 >= var14.length) {
                              if (var5 != 0) {
                                L5: {
                                  if (!uh.field_o) {
                                    stackOut_34_0 = param2;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L5;
                                  } else {
                                    stackOut_33_0 = param2 << 645111105;
                                    stackIn_35_0 = stackOut_33_0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  L7: {
                                    var7 = stackIn_35_0;
                                    if (this.field_j[0] == null) {
                                      break L7;
                                    } else {
                                      if (var7 <= this.field_j[0].length) {
                                        var8 = 0;
                                        L8: while (true) {
                                          if (this.field_j.length <= var8) {
                                            break L6;
                                          } else {
                                            dv.a(this.field_j[var8], 0, var7);
                                            var8++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var8 = 0;
                                  L9: while (true) {
                                    if (var8 >= this.field_j.length) {
                                      break L6;
                                    } else {
                                      array$1 = new int[var7];
                                      this.field_j[var8] = array$1;
                                      var8++;
                                      continue L9;
                                    }
                                  }
                                }
                                var8 = 0;
                                L10: while (true) {
                                  if (var8 >= this.field_p.length) {
                                    L11: {
                                      if (uh.field_o) {
                                        param1 = param1 << 1;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var8 >= var7) {
                                        decompiledRegionSelector0 = 2;
                                        break L0;
                                      } else {
                                        var9 = 0;
                                        var10 = 0;
                                        L13: while (true) {
                                          if (this.field_j.length <= var10) {
                                            param0[var8 + param1] = param0[var8 + param1] + (var9 >> 2041165448);
                                            var8++;
                                            continue L12;
                                          } else {
                                            L14: {
                                              if (null != this.field_p[var10]) {
                                                var9 = var9 + this.field_j[var10][var8] * var14[var10];
                                                break L14;
                                              } else {
                                                break L14;
                                              }
                                            }
                                            var10++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L15: {
                                      if (this.field_p[var8] == null) {
                                        break L15;
                                      } else {
                                        this.field_k[var8].a(this.field_j[var8], param1, param2);
                                        break L15;
                                      }
                                    }
                                    var8++;
                                    continue L10;
                                  }
                                }
                              } else {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              }
                            } else {
                              var6[var7] = (this.field_i[var7] >> 2008699340) * this.field_l[var7] / 256;
                              var7++;
                              continue L4;
                            }
                          }
                        } else {
                          L16: {
                            if (-1 != (this.field_n[var12] ^ -1)) {
                              L17: {
                                this.field_i[var12] = this.field_i[var12] + this.field_n[var12] * param2;
                                if ((this.field_i[var12] ^ -1) <= -1048577) {
                                  this.field_i[var12] = 1048576;
                                  this.field_n[var12] = 0;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              if (-1 <= (this.field_i[var12] ^ -1)) {
                                L18: {
                                  this.field_i[var12] = 0;
                                  this.field_n[var12] = 0;
                                  if (this.field_p[var12] == null) {
                                    break L18;
                                  } else {
                                    this.field_k[var12].b(21404);
                                    break L18;
                                  }
                                }
                                this.field_p[var12] = null;
                                break L16;
                              } else {
                                break L16;
                              }
                            } else {
                              break L16;
                            }
                          }
                          var12++;
                          continue L3;
                        }
                      }
                    } else {
                      if (this.field_p[var6_int] != null) {
                        var5++;
                        var6_int++;
                        continue L2;
                      } else {
                        var6_int++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  this.a(param2);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (this.field_l[var5] != 0) {
                  var4_int = 0;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) (var4);
            stackOut_62_1 = new StringBuilder().append("jj.E(");
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L19;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L19;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param1 + ',' + param2 + ')');
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

    final lq b() {
        return null;
    }

    final void a(boolean param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (-1 < (param4 ^ -1)) {
                break L1;
              } else {
                if (this.field_o <= param4) {
                  break L1;
                } else {
                  L2: {
                    if (null != this.field_p[param4]) {
                      this.field_k[param4].b(21404);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    this.field_p[param4] = param2;
                    if (param2 != null) {
                      this.field_n[param4] = param5;
                      this.field_k[param4].d(-1, -1, param6);
                      this.field_k[param4].a(param0, 19134, param2);
                      this.field_k[param4].c(param1, 107342216);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param3 == -9017) {
                      break L4;
                    } else {
                      field_m = (String) null;
                      break L4;
                    }
                  }
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("Illegal midiplayer: " + param4);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var8);
            stackOut_13_1 = new StringBuilder().append("jj.D(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        for (var4 = param0; this.field_k.length > var4; var4++) {
            this.field_k[var4].b(param2, param1, (byte) -73);
        }
    }

    final static byte[] a(int param0, byte[] param1, byte param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        m var6 = null;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var5 = 34 / ((param2 - -65) / 52);
              if (param3 <= 0) {
                var4 = param1;
                break L1;
              } else {
                var9 = new byte[param0];
                var4 = var9;
                var6_int = 0;
                L2: while (true) {
                  if (param0 <= var6_int) {
                    break L1;
                  } else {
                    var9[var6_int] = param1[param3 + var6_int];
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
            var6 = new m();
            var6.a(true);
            var6.a((byte) 126, (long)(param0 * 8), var4);
            var7 = new byte[64];
            var6.a(var7, 21024, 0);
            stackOut_6_0 = (byte[]) (var7);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4_ref);
            stackOut_8_1 = new StringBuilder().append("jj.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0) {
        int var2_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        var4 = Kickabout.field_G;
        var2_int = 0;
        L0: while (true) {
          if (this.field_k.length <= var2_int) {
            var8 = new int[this.field_o];
            var7 = var8;
            var5 = var7;
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var8.length) {
                var6 = 0;
                var3 = var6;
                L2: while (true) {
                  if (this.field_n.length <= var6) {
                    return;
                  } else {
                    if (0 != this.field_n[var6]) {
                      L3: {
                        this.field_i[var6] = this.field_i[var6] + param0 * this.field_n[var6];
                        if ((this.field_i[var6] ^ -1) <= -1048577) {
                          this.field_i[var6] = 1048576;
                          this.field_n[var6] = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (this.field_i[var6] <= 0) {
                        L4: {
                          this.field_i[var6] = 0;
                          this.field_n[var6] = 0;
                          if (this.field_p[var6] == null) {
                            break L4;
                          } else {
                            this.field_k[var6].b(21404);
                            break L4;
                          }
                        }
                        this.field_p[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                var5[var3] = (this.field_i[var3] >> 24392780) * this.field_l[var3] / 256;
                var3++;
                continue L1;
              }
            }
          } else {
            if (null != this.field_p[var2_int]) {
              this.field_k[var2_int].a(param0);
              var2_int++;
              continue L0;
            } else {
              var2_int++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        if (param0 > -77) {
            field_m = (String) null;
        }
    }

    final lq c() {
        return null;
    }

    jj(int param0) {
        int var2 = 0;
        this.field_o = 3;
        this.field_o = param0;
        this.field_l = new int[param0];
        for (var2 = 0; var2 < this.field_l.length; var2++) {
            this.field_l[var2] = 256;
        }
        this.field_i = new int[this.field_o];
        this.field_j = new int[this.field_o][];
        this.field_k = new ru[this.field_o];
        this.field_n = new int[this.field_o];
        this.field_p = new qm[this.field_o];
        int var4 = 0;
        var2 = var4;
        while (var4 < this.field_k.length) {
            if (var4 == 0) {
                this.field_k[var4] = new ru();
            } else {
                this.field_k[var4] = new ru(this.field_k[-1 + var4]);
            }
            this.field_i[var4] = 1048576;
            var4++;
        }
    }

    static {
        field_m = "<%0> has left the lobby.";
    }
}
