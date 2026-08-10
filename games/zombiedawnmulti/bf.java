/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends br {
    static tq field_n;
    static ja field_f;
    private th field_p;
    private int[][] field_k;
    static boolean field_m;
    static String field_j;
    int field_l;
    static String field_q;
    int field_i;
    int field_o;
    static cj field_h;
    static int field_g;

    final boolean a(lm param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ui var5 = null;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.c(-49);
                break L1;
              }
            }
            var3_int = param0.e((byte) -112);
            var4 = param0.g(param1 ^ 1829947600);
            var5 = (ui) ((Object) this.field_p.c(69));
            L2: while (true) {
              if (var5 == null) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var5.a(param1 + 40, var3_int, var4)) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var5 = (ui) ((Object) this.field_p.b(6));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("bf.G(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static void a(ka param0, int param1) {
        int var2_int = 0;
        ka var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_d) {
              L1: {
                L2: {
                  if (param0.field_i != 0) {
                    break L2;
                  } else {
                    if (param0.field_o == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (uf.field_g <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = uk.field_M[var2_int];
                      if (-3 != (var3.field_l ^ -1)) {
                        break L4;
                      } else {
                        if (var3.field_i != param0.field_i) {
                          break L4;
                        } else {
                          if (param0.field_o != var3.field_o) {
                            break L4;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
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
                if (param0.field_r != null) {
                  ld.field_Kb = param0.field_a;
                  bq.field_f = param0.field_e;
                  tb.field_t = param0.field_r;
                  en.field_c = param0.field_l;
                  break L5;
                } else {
                  break L5;
                }
              }
              var2_int = 98 % ((param1 - -13) / 35);
              vk.a(param0, (byte) 83);
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
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("bf.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
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

    public static void d(int param0) {
        field_f = null;
        if (param0 != 29919) {
            return;
        }
        field_n = null;
        field_j = null;
        field_h = null;
        field_q = null;
    }

    final boolean a(int param0, int param1, byte param2) {
        int var5;
        String var6;
        ui var7;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = (ui) ((Object) this.field_p.c(param2 ^ 100));
        L0: while (true) {
          if (var7 == null) {
            if (param2 != 29) {
              var6 = (String) null;
              bf.a(false, -90, (String) null);
              return false;
            } else {
              return false;
            }
          } else {
            if (!var7.a(param2 + -146, param0, param1)) {
              var7 = (ui) ((Object) this.field_p.b(6));
              continue L0;
            } else {
              return true;
            }
          }
        }
    }

    final void c(int param0) {
        int var3;
        ui var4;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 0) {
          return;
        } else {
          var4 = (ui) ((Object) this.field_p.c(43));
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              var4.c(9307);
              var4 = (ui) ((Object) this.field_p.b(6));
              continue L0;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = -43 / ((param0 - -32) / 47);
        this.a(true);
    }

    final static void a(boolean param0, int param1, String param2) {
        int var3_int = 0;
        try {
            nj.field_f = false;
            ud.field_ab = false;
            if (!param0) {
                field_j = (String) null;
            }
            if (null != h.field_L && h.field_L.field_R) {
                var3_int = 1;
                if (-9 == (param1 ^ -1)) {
                    if (!ch.field_e) {
                        param2 = f.field_b;
                    } else {
                        param2 = ql.field_f;
                    }
                    param1 = 2;
                    b.field_c.a(-120, fa.field_Ib);
                }
                if ((param1 ^ -1) == -11) {
                    var3_int = 0;
                    ua.i(-2);
                }
                if (var3_int != 0) {
                    if (ud.field_ab) {
                        param2 = vl.a(cj.field_Eb, new String[]{param2}, 2);
                    }
                    if (!(!bl.field_h)) {
                        param2 = wg.field_c;
                    }
                    h.field_L.a(param2, 125, param1);
                }
                if (256 != param1) {
                    if ((param1 ^ -1) == -11) {
                        return;
                    }
                    if (!ch.field_e) {
                        b.field_c.g((byte) 106);
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "bf.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    bf(fh param0, int param1, int param2, int param3) {
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[][] var5 = null;
        RuntimeException var5_ref = null;
        boolean[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[][] var10_ref_boolean____ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean[][] var15 = null;
        int var16 = 0;
        boolean[][] var17 = null;
        boolean[][] var18 = null;
        try {
          L0: {
            this.field_k = param0.field_i.field_k;
            this.field_l = param3;
            this.field_i = param2;
            this.field_o = param1;
            param3 = param3 / 24;
            param2 = param2 / 24;
            var18 = new boolean[oi.field_i * 2 - -1][1 + 2 * oi.field_i];
            var17 = var18;
            var15 = var17;
            var5 = var15;
            var6 = new boolean[var18.length][var18[0].length];
            var7 = param2 - oi.field_i;
            var8 = param3 + -oi.field_i;
            var15[oi.field_i][oi.field_i] = true;
            var9 = 0;
            L1: while (true) {
              if (oi.field_i <= var9) {
                this.field_p = new th();
                var9 = 0;
                L2: while (true) {
                  if (var5.length <= var9) {
                    break L0;
                  } else {
                    var16 = 0;
                    var10 = var16;
                    L3: while (true) {
                      if (var5[0].length <= var16) {
                        var9++;
                        continue L2;
                      } else {
                        var11 = var7 + var16;
                        var12 = var9 - -var8;
                        var13 = (param3 + -var12) * (-var12 + param3) + (param2 + -var11) * (param2 - var11);
                        if (64 <= var13) {
                          var16++;
                          continue L3;
                        } else {
                          if (!var5[var9][var16]) {
                            var16++;
                            continue L3;
                          } else {
                            this.field_p.a(new ui(var11, var12, var13), false);
                            var16++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var10 = 0;
                L4: while (true) {
                  if (var5.length <= var10) {
                    var10_ref_boolean____ = var5;
                    var5 = var6;
                    var6 = var10_ref_boolean____;
                    var9++;
                    continue L1;
                  } else {
                    var11 = 0;
                    L5: while (true) {
                      if (var5[0].length <= var11) {
                        var10++;
                        continue L4;
                      } else {
                        var12 = var11 - -var7;
                        var13 = var10 - -var8;
                        if (var12 <= 0) {
                          var11++;
                          continue L5;
                        } else {
                          if (-1 <= (var13 ^ -1)) {
                            var11++;
                            continue L5;
                          } else {
                            if (var12 >= this.field_k[0].length) {
                              var11++;
                              continue L5;
                            } else {
                              if (this.field_k.length <= var13) {
                                var11++;
                                continue L5;
                              } else {
                                if ((this.field_k[var13][var12] & 1) == 0) {
                                  var11++;
                                  continue L5;
                                } else {
                                  L6: {
                                    if (var5[var10][var11]) {
                                      break L6;
                                    } else {
                                      L7: {
                                        if (-1 <= (var11 ^ -1)) {
                                          break L7;
                                        } else {
                                          if (var5[var10][var11 - 1]) {
                                            break L6;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      L8: {
                                        if (-1 <= (var10 ^ -1)) {
                                          break L8;
                                        } else {
                                          if (var5[var10 - 1][var11]) {
                                            break L6;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (var11 >= var5[0].length - 1) {
                                          break L9;
                                        } else {
                                          if (var5[var10][var11 + 1]) {
                                            break L6;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (var10 >= -1 + var5.length) {
                                        var11++;
                                        continue L5;
                                      } else {
                                        if (!var5[1 + var10][var11]) {
                                          var11++;
                                          continue L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  var6[var10][var11] = true;
                                  var11++;
                                  continue L5;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5_ref = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var5_ref);

            stackIn_46_1 = new StringBuilder().append("bf.<init>(");

            if (param0 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L10;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_m = false;
        field_j = "Full";
        field_q = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
