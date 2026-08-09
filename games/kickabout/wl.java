/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends mo {
    static boolean field_o;
    private it[] field_k;
    private int field_h;
    static int field_n;
    private up[][] field_i;
    private int[][] field_j;
    private int[][] field_m;
    private gt[] field_f;
    static boolean field_g;
    private boolean field_l;

    final boolean a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var3 = this.field_k[param1].field_p;
        var4 = 0;
        L0: while (true) {
          if (-5 >= (var4 ^ -1)) {
            if (!param0) {
              return true;
            } else {
              this.toString();
              return true;
            }
          } else {
            if (param1 == this.field_m[var3][var4]) {
              if (-1 == this.field_j[var3][var4]) {
                return false;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(ml param0, boolean param1) {
        int var6 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        try {
            for (var3_int = 0; 2 > var3_int; var3_int++) {
                for (var4 = 0; -5 < (var4 ^ -1); var4++) {
                    this.field_j[var3_int][var4] = param0.l(4, 59) - 1;
                }
            }
            this.field_h = param0.l(8, 59);
            param0.l((byte) 112);
            var3_int = 0;
            if (param1) {
                field_g = true;
            }
            while (2 > var3_int) {
                var6 = 0;
                var4 = var6;
                while (-5 < (var6 ^ -1)) {
                    this.field_i[var3_int][var6].a(112, param0);
                    var6++;
                }
                var3_int++;
            }
            param0.p(-104);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        StringBuilder discarded$61 = null;
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        int var2;
        int var3;
        int var4;
        StringBuilder var5;
        var4 = Kickabout.field_G;
        var5 = new StringBuilder("AgentLineup");
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_k.length) {
            return var5.toString();
          } else {
            L1: {
              discarded$61 = var5.append("\t" + var2 + "=");
              if (this.a(-83, var2)) {
                break L1;
              } else {
                discarded$62 = var5.append(".");
                break L1;
              }
            }
            discarded$63 = var5.append("[");
            var3 = 0;
            L2: while (true) {
              if (4 <= var3) {
                discarded$64 = var5.append(" ]");
                var2++;
                continue L0;
              } else {
                if ((this.field_m[this.field_k[var2].field_p][var3] ^ -1) == (var2 ^ -1)) {
                  discarded$65 = var5.append(" " + var3 + "=" + this.field_j[this.field_k[var2].field_p][var3]);
                  var3++;
                  continue L2;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, gr param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (this.field_l) {
                break L1;
              } else {
                if (!param1.field_i[param0].c(-2)) {
                  break L1;
                } else {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (this.field_l) {
                break L2;
              } else {
                if (!param1.a((byte) -113, param0)) {
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L3: {
              if (param3 == 4) {
                break L3;
              } else {
                field_g = false;
                break L3;
              }
            }
            var5_int = this.field_k[param2].field_p;
            var6 = 0;
            L4: while (true) {
              if (var6 >= 4) {
                stackIn_20_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L5: {
                  if (this.field_m[var5_int][var6] != param2) {
                    break L5;
                  } else {
                    if (param0 == this.field_j[var5_int][var6]) {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                }
                var6++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("wl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final void a(gr param0, up[] param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        mo var8 = null;
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
        RuntimeException var6 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param2 <= -70) {
                break L1;
              } else {
                var8 = (mo) null;
                this.a((byte) -51, (mo) null);
                break L1;
              }
            }
            L2: while (true) {
              if (-10 >= (var6_int ^ -1)) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (this.a(var6_int, param0, param4, 4)) {
                  this.a(var6_int - -1 << -1206570558 | param3, 0, param0, param1, param4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("wl.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, gr param2, up[] param3, int param4) {
        up stackIn_22_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        up var9 = null;
        int var10 = 0;
        int var11 = 0;
        mo var12 = null;
        up var13 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var6_int = this.field_k[param4].field_p;
              if (param1 == 0) {
                break L1;
              } else {
                var12 = (mo) null;
                this.a((byte) 13, (mo) null);
                break L1;
              }
            }
            L2: {
              if (-1 == param0) {
                this.field_h = this.field_h ^ 1 << param4;
                break L2;
              } else {
                if (1 != (param0 ^ -1)) {
                  var7 = 3 & param0;
                  var8 = (param0 >> -721346462) + -1;
                  if (this.field_m[var6_int][var7] == param4) {
                    L3: {
                      if (0 < (var8 ^ -1)) {
                        break L3;
                      } else {
                        if (9 > var8) {
                          L4: {
                            if ((var8 ^ -1) == 0) {
                              stackIn_22_0 = null;
                              break L4;
                            } else {
                              stackIn_22_0 = param2.field_i[var8];
                              break L4;
                            }
                          }
                          L5: {
                            var13 = stackIn_22_0;
                            var9 = var13;
                            if (0 == (var8 ^ -1)) {
                              break L5;
                            } else {
                              if (!this.field_l) {
                                if (var13.c(-2)) {
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  if (param2.a((byte) 79, var8)) {
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  } else {
                                    break L5;
                                  }
                                }
                              } else {
                                var9 = param3[var8];
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (-1 == var8) {
                              this.field_i[var6_int][var7].b((byte) -7);
                              break L6;
                            } else {
                              var10 = 0;
                              L7: while (true) {
                                if (-5 >= (var10 ^ -1)) {
                                  this.field_i[var6_int][var7].a((byte) -90, var9);
                                  break L6;
                                } else {
                                  L8: {
                                    if (this.field_m[var6_int][var10] != param4) {
                                      break L8;
                                    } else {
                                      if (this.field_j[var6_int][var10] != var8) {
                                        break L8;
                                      } else {
                                        this.field_j[var6_int][var10] = this.field_j[var6_int][var7];
                                        this.field_i[var6_int][var10].a((byte) -101, this.field_i[var6_int][var7]);
                                        break L8;
                                      }
                                    }
                                  }
                                  var10++;
                                  continue L7;
                                }
                              }
                            }
                          }
                          this.field_j[var6_int][var7] = var8;
                          this.field_h = this.field_h & (1 << param4 ^ -1);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  if (!this.a(false, param4)) {
                    var7 = 0;
                    L9: while (true) {
                      if (4 <= var7) {
                        break L2;
                      } else {
                        L10: {
                          if (this.field_m[var6_int][var7] != param4) {
                            break L10;
                          } else {
                            if ((this.field_j[var6_int][var7] ^ -1) == 0) {
                              this.a(param2, param3, (byte) -78, var7, param4);
                              this.field_h = this.field_h & (1 << param4 ^ -1);
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var7++;
                        continue L9;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var6);

            stackIn_44_1 = new StringBuilder().append("wl.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L11;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

            if (param3 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L12;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L12;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_45_0), stackIn_48_2 + ',' + param4 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, mo param1) {
        wl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        try {
            var3 = (wl) ((Object) param1);
            if (param0 > -52) {
                this.field_m = (int[][]) null;
            }
            for (var4 = 0; -3 < (var4 ^ -1); var4++) {
                for (var5 = 0; (var5 ^ -1) > -5; var5++) {
                    this.field_i[var4][var5].a((byte) -90, var3.field_i[var4][var5]);
                    this.field_j[var4][var5] = var3.field_j[var4][var5];
                }
            }
            this.field_h = var3.field_h;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wl.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        if (param0 < -80) {
          L0: {
            L1: {
              if (!this.field_f[param1].d(3511)) {
                break L1;
              } else {
                if ((1 << param1 & this.field_h) == 0) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    wl(boolean param0, it[] param1, gt[] param2, int[][] param3, int[][] param4, up[][] param5) {
        try {
            this.field_f = param2;
            this.field_k = param1;
            this.field_j = param4;
            this.field_m = param3;
            this.field_i = param5;
            this.field_l = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = false;
        field_n = 0;
        field_g = false;
    }
}
