/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    int[] field_e;
    int field_a;
    static String field_d;
    int field_b;
    static int field_c;

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        nj var4_ref_nj = null;
        int var5 = 0;
        ai var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        mg var27 = null;
        var26 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 >= 48) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              var27 = nk.field_N;
              var2 = var27.f(255);
              if (0 != var2) {
                if (var2 == 1) {
                  var3 = var27.j(-14477);
                  var4 = var27.e((byte) 0);
                  var6 = (ai) ((Object) fh.field_t.b((byte) 109));
                  L3: while (true) {
                    L4: {
                      if (var6 == null) {
                        break L4;
                      } else {
                        if (var3 == var6.field_i) {
                          break L4;
                        } else {
                          var6 = (ai) ((Object) fh.field_t.d(8192));
                          continue L3;
                        }
                      }
                    }
                    if (var6 == null) {
                      ql.a(-102);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var6.field_n = var4;
                      var6.a(false);
                      break L2;
                    }
                  }
                } else {
                  rg.a((Throwable) null, "HS1: " + ni.c(6), -562);
                  ql.a(-48);
                  break L2;
                }
              } else {
                var3 = var27.j(-14477);
                var4_ref_nj = (nj) ((Object) pc.field_l.b((byte) 116));
                L5: while (true) {
                  L6: {
                    if (var4_ref_nj == null) {
                      break L6;
                    } else {
                      if (var4_ref_nj.field_l != var3) {
                        var4_ref_nj = (nj) ((Object) pc.field_l.d(8192));
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var4_ref_nj == null) {
                    ql.a(-101);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L7: {
                      var5 = var27.f(255);
                      if (var5 != 0) {
                        var6_int = var4_ref_nj.field_j;
                        f.field_a[0].field_g = d.field_a;
                        var7 = var4_ref_nj.field_o;
                        f.field_a[0].field_h = false;
                        f.field_a[0].field_d = null;
                        var8_int = 1;
                        L8: while (true) {
                          if (var5 <= var8_int) {
                            dupTemp$0 = new String[3][var6_int];
                            var4_ref_nj.field_n = dupTemp$0;
                            var8 = dupTemp$0;
                            var9 = new String[3][var6_int];
                            dupTemp$1 = new long[3][var6_int];
                            var4_ref_nj.field_q = dupTemp$1;
                            var10 = dupTemp$1;
                            dupTemp$2 = new int[3][var6_int * var7];
                            var4_ref_nj.field_i = dupTemp$2;
                            var11 = dupTemp$2;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.f(255);
                            if ((var18 ^ -1) >= -1) {
                              break L7;
                            } else {
                              var19 = 0;
                              L9: while (true) {
                                if (var18 <= var19) {
                                  break L7;
                                } else {
                                  L10: {
                                    var20 = var27.f(255);
                                    var21 = f.field_a[var20].field_g;
                                    var22 = var27.e((byte) 0);
                                    var24 = var27.field_m;
                                    if (var19 >= var6_int) {
                                      break L10;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = f.field_a[var20].field_d;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var7 <= var25) {
                                          break L10;
                                        } else {
                                          incrementValue$3 = var15;
                                          var15++;
                                          var11[0][incrementValue$3] = var27.i(255);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var21 == null) {
                                      break L12;
                                    } else {
                                      if (!qj.a(var21, 107)) {
                                        break L12;
                                      } else {
                                        var8[1][var13] = d.field_a;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var27.field_m = var24;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var7 <= var25) {
                                            break L12;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var11[1][incrementValue$4] = var27.i(255);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var6_int <= var14) {
                                      break L14;
                                    } else {
                                      if (!f.field_a[var20].field_h) {
                                        f.field_a[var20].field_h = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = f.field_a[var20].field_d;
                                        var10[2][var14] = var22;
                                        var27.field_m = var24;
                                        var14++;
                                        var25 = 0;
                                        L15: while (true) {
                                          if (var7 <= var25) {
                                            break L14;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var11[2][incrementValue$5] = var27.i(255);
                                            var25++;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L9;
                                }
                              }
                            }
                          } else {
                            L16: {
                              f.field_a[var8_int].field_g = var27.d(0);
                              f.field_a[var8_int].field_h = false;
                              if (-2 != (var27.f(255) ^ -1)) {
                                f.field_a[var8_int].field_d = null;
                                break L16;
                              } else {
                                f.field_a[var8_int].field_d = var27.d(0);
                                break L16;
                              }
                            }
                            var8_int++;
                            continue L8;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    var4_ref_nj.field_m = true;
                    var4_ref_nj.a(false);
                    break L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "fg.E(" + param0 + ')');
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

    public static void b(int param0) {
        field_d = null;
        if (param0 != 0) {
            fg.a((byte) -91);
        }
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.field_e = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_e == null) {
              break L2;
            } else {
              if (-1 == (this.field_e.length ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = this.field_e[-1 + this.field_e.length];
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (kl.a(param0, true)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = oe.field_c;
                var2 = var6;
                var3 = param1;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = pf.field_e;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 >= var2.length) {
                        stackIn_22_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param0 == var4) {
                          stackIn_19_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if ((var4 ^ -1) != (param0 ^ -1)) {
                      var3++;
                      continue L1;
                    } else {
                      stackIn_12_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2_ref), "fg.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    fg(int param0, int param1, int param2) {
        this.field_e = new int[param2 + 1];
        this.field_a = param0;
        this.field_b = param1;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        if (null == this.field_e || 0 == this.field_e.length) {
            return 0;
        }
        if (param0 != -1) {
            fg.a((byte) -28);
        }
        for (var3 = 1; var3 < this.field_e.length; var3++) {
            if (!((param1 ^ -1) <= (this.field_e[var3 - 1] + this.field_e[var3] >> -1327339679 ^ -1))) {
                return var3 - 1;
            }
        }
        return -1 + this.field_e.length;
    }

    static {
        field_d = "Error connecting to server. Please try using a different server.";
    }
}
