/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends nc {
    private int[] field_y;
    private int field_x;
    private int field_v;
    private int field_m;
    private int[] field_r;
    private int field_E;
    private int field_n;
    private int[] field_A;
    private int field_p;
    private int field_w;
    static double field_C;
    static String field_D;
    private cb[] field_u;
    private int field_s;
    private String field_l;
    private kb field_z;
    private int field_t;
    private int field_B;
    private int field_q;
    private boolean field_o;

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -118) {
          L0: {
            var4 = ((si) this).field_j.length;
            if (var4 == 1) {
              var3 = 1;
              break L0;
            } else {
              if (var4 != 2) {
                var3 = param1;
                break L0;
              } else {
                L1: {
                  if (0 == param1) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 2;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                var3 = stackIn_9_0;
                break L0;
              }
            }
          }
          var4 = var3;
          if (0 == var4) {
            return 50;
          } else {
            if (1 != var4) {
              if (var4 != 2) {
                return super.a((byte) -118, param1);
              } else {
                return 430;
              }
            } else {
              return 240;
            }
          }
        } else {
          return 5;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, kb param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rp var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int[] stackIn_14_1 = null;
        int stackIn_21_0 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_12_0 = null;
        int[] stackOut_12_1 = null;
        Object stackOut_13_0 = null;
        int[] stackOut_13_1 = null;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ((si) this).field_t = param0;
              ((si) this).field_B = param1;
              ((si) this).field_x = 50;
              ((si) this).field_z = param4;
              we.field_g[42] = u.field_j;
              ((si) this).field_q = param2;
              we.field_g[43] = ec.field_a;
              ((si) this).field_n = 0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (fb.field_e.field_M >= 0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((si) this).field_o = stackIn_4_1 != 0;
              if (fb.field_e.field_M != ((si) this).field_q) {
                if (!((si) this).field_o) {
                  ((si) this).field_l = gf.field_c;
                  break L2;
                } else {
                  ((si) this).field_l = "";
                  break L2;
                }
              } else {
                ((si) this).field_l = nh.field_h;
                break L2;
              }
            }
            L3: {
              gj.a(6962);
              if (((si) this).field_o) {
                ((si) this).field_j = cq.field_c;
                break L3;
              } else {
                L4: {
                  L5: {
                    stackOut_10_0 = this;
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (!((si) this).field_z.field_i) {
                      break L5;
                    } else {
                      stackOut_11_0 = this;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (((si) this).field_t <= 0) {
                        break L5;
                      } else {
                        stackOut_12_0 = this;
                        stackOut_12_1 = ga.field_s;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L4;
                      }
                    }
                  }
                  stackOut_13_0 = this;
                  stackOut_13_1 = wk.field_L;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L4;
                }
                ((si) this).field_j = stackIn_14_1;
                break L3;
              }
            }
            ((si) this).field_g.a(-9049, true, ((si) this).a(-6003, bo.field_d, bd.field_g));
            ((si) this).field_g.field_c = ((si) this).field_j.length;
            ((si) this).field_y = (int[]) param3.clone();
            var6_int = 0;
            L6: while (true) {
              if (((si) this).field_y.length <= var6_int) {
                ((si) this).field_w = 1;
                ((si) this).field_p = ((si) this).field_z.field_H * 20 / 1000;
                ((si) this).field_A = new int[((si) this).field_y.length];
                var6_int = 0;
                L7: while (true) {
                  if (var6_int >= param3.length) {
                    L8: {
                      ((si) this).field_v = 0;
                      if (!gf.field_h) {
                        var13 = ll.field_k;
                        var7 = var13.g((byte) -32);
                        var8 = 0;
                        L9: while (true) {
                          if (var7 <= var8) {
                            var8 = 0;
                            L10: while (true) {
                              if (var8 >= 3) {
                                if (0 < ((si) this).field_v) {
                                  ((si) this).field_r = new int[((si) this).field_v];
                                  var8 = ((si) this).field_t;
                                  var9 = 0;
                                  L11: while (true) {
                                    if (var9 >= ((si) this).field_v) {
                                      th.b((byte) -61);
                                      break L8;
                                    } else {
                                      var10 = var8 / (((si) this).field_v - var9);
                                      var11 = ((si) this).field_u[var9].field_m;
                                      ll.field_k.a(-126, var10, var11);
                                      ((si) this).field_u[var9].a(0, var10);
                                      var8 = var8 - var10;
                                      ((si) this).field_r[var9] = var10;
                                      var9++;
                                      continue L11;
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              } else {
                                L12: {
                                  if (255 != ll.field_k.field_s[var8]) {
                                    this.e(ll.field_k.field_s[var8], 4);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            L13: {
                              if (ll.field_k.field_m[var8] != 255) {
                                this.e(ll.field_k.field_m[var8], param1 + 4);
                                if (255 != ll.field_k.field_g[var8]) {
                                  this.e(ll.field_k.field_g[var8], 4);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            var8++;
                            continue L9;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    break L0;
                  } else {
                    L14: {
                      var7 = ((si) this).field_y[var6_int];
                      stackOut_27_0 = this;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var7 < ((si) this).field_w) {
                        stackOut_29_0 = this;
                        stackOut_29_1 = ((si) this).field_w;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        break L14;
                      } else {
                        stackOut_28_0 = this;
                        stackOut_28_1 = var7;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        break L14;
                      }
                    }
                    ((si) this).field_w = stackIn_30_1;
                    ((si) this).field_A[var6_int] = var6_int;
                    var8 = -1 + var6_int;
                    L15: while (true) {
                      L16: {
                        if (var8 < 0) {
                          break L16;
                        } else {
                          if (((si) this).field_y[var6_int] < ((si) this).field_y[((si) this).field_A[var8]]) {
                            break L16;
                          } else {
                            ((si) this).field_A[var8 + 1] = ((si) this).field_A[var8];
                            var8--;
                            continue L15;
                          }
                        }
                      }
                      ((si) this).field_A[var8 - -1] = var6_int;
                      var6_int++;
                      continue L7;
                    }
                  }
                }
              } else {
                L17: {
                  if ((1 << var6_int & ((si) this).field_z.field_F) == 0) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L17;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L17;
                  }
                }
                L18: {
                  var7 = stackIn_21_0;
                  if (var7 != 0) {
                    ((si) this).field_y[var6_int] = 0;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                var6_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var6 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var6;
            stackOut_58_1 = new StringBuilder().append("si.BA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param3 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L19;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L19;
            }
          }
          L20: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param4 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L20;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L20;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 41);
        }
    }

    private final String e(int param0) {
        int var2 = ((si) this).field_p / 60;
        int var3 = ((si) this).field_p % 60;
        return var2 + ":" + (10 > var3 ? "0" : "") + var3;
    }

    final static void a(boolean param0, boolean param1, ul param2, ul param3, ul param4) {
        try {
            tg.field_g = tg.a("", !param0 ? true : false);
            tg.field_g.a(-17853, param0);
            qe.a(param4, -8995, param3, param2);
            dg.i(4);
            id.field_B = mp.field_b;
            ta.field_hb = mp.field_b;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "si.P(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 23697) {
            return 127;
        }
        return 430;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -64) {
            break L0;
          } else {
            ((si) this).field_v = -63;
            break L0;
          }
        }
        L1: {
          var4 = ((si) this).field_j[param2];
          var5 = var4;
          if (var5 == 43) {
            if (((si) this).field_g.c(-85)) {
              if (!((si) this).field_o) {
                L2: {
                  if (((si) this).field_B != 0) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  stackOut_12_0 = stackIn_12_0;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (((si) this).field_n <= 0) {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L3;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L3;
                  }
                }
                if ((stackIn_15_0 ^ stackIn_15_1) != 0) {
                  this.b(false, 1);
                  break L1;
                } else {
                  this.b(false, 0);
                  break L1;
                }
              } else {
                return;
              }
            } else {
              break L1;
            }
          } else {
            if (var5 == 42) {
              if (((si) this).field_g.c(-85)) {
                ma.field_a.b((byte) -35, 61);
                break L1;
              } else {
                break L1;
              }
            } else {
              super.b(-110, param1, param2);
              break L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 255) {
                break L1;
              } else {
                field_C = 1.243267543236342;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (hl.field_e.length <= var5_int) {
                break L0;
              } else {
                param4 = hl.field_e[var5_int];
                var6 = var5_int << 4;
                L3: while (true) {
                  int incrementValue$12 = param4;
                  param4--;
                  if (0 == incrementValue$12) {
                    var5_int++;
                    continue L2;
                  } else {
                    int incrementValue$13 = var6;
                    var6++;
                    param0 = ah.field_f[incrementValue$13];
                    param3[param2[param0]] = param3[param2[param0]] + 1;
                    ah.field_f[param3[param2[param0]]] = param0;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("si.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    si(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, wk.field_L);
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        ((si) this).field_B = 0;
        try {
          L0: {
            ((si) this).field_u = new cb[13];
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= ((si) this).field_u.length) {
                break L0;
              } else {
                ((si) this).field_u[var8_int] = new cb();
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("si.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
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
        ja var25 = null;
        int var26 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        sl stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        sl stackIn_33_0 = null;
        String stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        sl stackIn_34_0 = null;
        String stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        sl stackIn_39_0 = null;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        sl stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        sl stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        ef stackIn_57_0 = null;
        String stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        ef stackIn_58_0 = null;
        String stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        ef stackIn_59_0 = null;
        String stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        int stackIn_80_0 = 0;
        int stackIn_92_0 = 0;
        ef stackIn_104_0 = null;
        String stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        ef stackIn_105_0 = null;
        String stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        ef stackIn_106_0 = null;
        String stackIn_106_1 = null;
        int stackIn_106_2 = 0;
        int stackIn_106_3 = 0;
        int stackIn_106_4 = 0;
        ef stackIn_111_0 = null;
        String stackIn_111_1 = null;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        ef stackIn_112_0 = null;
        String stackIn_112_1 = null;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        ef stackIn_113_0 = null;
        String stackIn_113_1 = null;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        int stackIn_113_4 = 0;
        ef stackIn_127_0 = null;
        String stackIn_127_1 = null;
        int stackIn_127_2 = 0;
        int stackIn_127_3 = 0;
        ef stackIn_128_0 = null;
        String stackIn_128_1 = null;
        int stackIn_128_2 = 0;
        int stackIn_128_3 = 0;
        ef stackIn_129_0 = null;
        String stackIn_129_1 = null;
        int stackIn_129_2 = 0;
        int stackIn_129_3 = 0;
        int stackIn_129_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        sl stackOut_31_0 = null;
        String stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        sl stackOut_33_0 = null;
        String stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        sl stackOut_32_0 = null;
        String stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        sl stackOut_38_0 = null;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        sl stackOut_40_0 = null;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        sl stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        int stackOut_44_5 = 0;
        ef stackOut_56_0 = null;
        String stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        ef stackOut_58_0 = null;
        String stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        ef stackOut_57_0 = null;
        String stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        ef stackOut_126_0 = null;
        String stackOut_126_1 = null;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        ef stackOut_128_0 = null;
        String stackOut_128_1 = null;
        int stackOut_128_2 = 0;
        int stackOut_128_3 = 0;
        int stackOut_128_4 = 0;
        ef stackOut_127_0 = null;
        String stackOut_127_1 = null;
        int stackOut_127_2 = 0;
        int stackOut_127_3 = 0;
        int stackOut_127_4 = 0;
        ef stackOut_103_0 = null;
        String stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        ef stackOut_105_0 = null;
        String stackOut_105_1 = null;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_105_4 = 0;
        ef stackOut_104_0 = null;
        String stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_104_4 = 0;
        ef stackOut_110_0 = null;
        String stackOut_110_1 = null;
        int stackOut_110_2 = 0;
        int stackOut_110_3 = 0;
        ef stackOut_112_0 = null;
        String stackOut_112_1 = null;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        ef stackOut_111_0 = null;
        String stackOut_111_1 = null;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        L0: {
          var26 = ZombieDawnMulti.field_E ? 1 : 0;
          super.a(param0);
          var2 = 378;
          var3 = 0;
          var4 = ah.field_e.field_C + ah.field_e.field_r;
          ((si) this).field_E = 255;
          if (((si) this).field_n == 0) {
            stackOut_2_0 = 255;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((si) this).field_n * 255 / 33;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = stackIn_3_0;
            if (0 == ((si) this).field_B) {
              break L2;
            } else {
              if (((si) this).field_n <= 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (((si) this).field_B == 0) {
              stackOut_8_0 = var5;
              stackIn_9_0 = stackOut_8_0;
              break L3;
            } else {
              stackOut_7_0 = 255 - var5;
              stackIn_9_0 = stackOut_7_0;
              break L3;
            }
          }
          var6 = stackIn_9_0;
          var7 = 94;
          if (null == ((si) this).field_l) {
            return;
          } else {
            L4: {
              qp.field_w.a(dj.field_o, 90, 134, 16777215, 1, var6);
              qp.field_w.a(qm.field_N, 478, 134, 16777215, 1, var6);
              var8_int = 555;
              if (((si) this).field_z.field_i) {
                qp.field_w.a(th.field_d, var8_int, 122, 16777215, 1, var6);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              qp.field_w.a(bo.field_c, var8_int, 134, 16777215, 1, var6);
              var7 = var7 + (-5 + (1 - -pb.field_e.a(((si) this).field_l, 0, 90, 640, 240, 65280, var3, var6, 1, 0, 30)) * var4);
              if (205 <= var7) {
                break L5;
              } else {
                var7 = 205;
                break L5;
              }
            }
            var9 = qb.field_h.field_e;
            var10 = 150;
            var11 = 0;
            var12 = 0;
            L6: while (true) {
              if (var12 >= ((si) this).field_z.field_t) {
                L7: {
                  var7 = var7 + (1 + var4);
                  if (!((si) this).field_o) {
                    pb.field_e.a(vl.a(wi.field_o, new String[1], 2), 320, 380, 16556032, var3, var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (((si) this).field_n <= 0) {
                    var7 = var2;
                    break L8;
                  } else {
                    var7 = (255 - var6) * 120 / 256 + var6 * var2 / 256;
                    break L8;
                  }
                }
                L9: {
                  if (((si) this).field_o) {
                    break L9;
                  } else {
                    if (((si) this).field_z.field_i) {
                      pb.field_e.a(vl.a(ig.field_g, new String[1], 2), 320, 365, 16776960, var3, var6);
                      break L9;
                    } else {
                      pb.field_e.a(aa.field_p, 320, 410, 16777096, var3, var6);
                      break L9;
                    }
                  }
                }
                this.f(var6, 96);
                break L1;
              } else {
                L10: {
                  var13 = ((si) this).field_A[var12];
                  if (wp.field_h.field_M != var13) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L10;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L10;
                  }
                }
                L11: {
                  var14 = stackIn_22_0;
                  var15 = var9 * ((si) this).field_y[var13] / ((si) this).field_w;
                  if (-1 == (((si) this).field_z.field_F & 1 << var13)) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L11;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L11;
                  }
                }
                L12: {
                  var16 = stackIn_25_0;
                  if (-1 == (op.field_m.field_j & 1 << var13)) {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L12;
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    break L12;
                  }
                }
                L13: {
                  var17 = stackIn_28_0;
                  if (var9 >= var15) {
                    stackOut_30_0 = var15;
                    stackIn_31_0 = stackOut_30_0;
                    break L13;
                  } else {
                    stackOut_29_0 = var9;
                    stackIn_31_0 = stackOut_29_0;
                    break L13;
                  }
                }
                L14: {
                  var15 = stackIn_31_0;
                  stackOut_31_0 = ah.field_e;
                  stackOut_31_1 = ((si) this).field_z.field_b[var13];
                  stackOut_31_2 = 280;
                  stackOut_31_3 = var10;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  if (var14 == 0) {
                    stackOut_33_0 = (sl) (Object) stackIn_33_0;
                    stackOut_33_1 = (String) (Object) stackIn_33_1;
                    stackOut_33_2 = stackIn_33_2;
                    stackOut_33_3 = stackIn_33_3;
                    stackOut_33_4 = 6;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    stackIn_34_4 = stackOut_33_4;
                    break L14;
                  } else {
                    stackOut_32_0 = (sl) (Object) stackIn_32_0;
                    stackOut_32_1 = (String) (Object) stackIn_32_1;
                    stackOut_32_2 = stackIn_32_2;
                    stackOut_32_3 = stackIn_32_3;
                    stackOut_32_4 = 0;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_34_4 = stackOut_32_4;
                    break L14;
                  }
                }
                L15: {
                  ((sl) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, var3, var6);
                  if (var17 != 0) {
                    oo.e(33, var10 - 14, qp.field_w.a(ak.field_d) - -14, 15, 7, 16777215);
                    oo.b(33, -15 + var10, qp.field_w.a(ak.field_d) + 16, 17, 7, 65793);
                    qp.field_w.b(ak.field_d, 40, var10 + -2, 65793, -1, var6);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var16 != 0) {
                    qp.field_w.a(io.field_d, 90, var10 - -24, 11184810, 1, var6);
                    break L16;
                  } else {
                    L17: {
                      stackOut_38_0 = ah.field_e;
                      stackOut_38_1 = Integer.toString(((si) this).field_y[var13]);
                      stackOut_38_2 = 90;
                      stackOut_38_3 = var10 + 28;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      stackIn_40_3 = stackOut_38_3;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      stackIn_39_2 = stackOut_38_2;
                      stackIn_39_3 = stackOut_38_3;
                      if (var14 == 0) {
                        stackOut_40_0 = (sl) (Object) stackIn_40_0;
                        stackOut_40_1 = (String) (Object) stackIn_40_1;
                        stackOut_40_2 = stackIn_40_2;
                        stackOut_40_3 = stackIn_40_3;
                        stackOut_40_4 = 6;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        stackIn_41_3 = stackOut_40_3;
                        stackIn_41_4 = stackOut_40_4;
                        break L17;
                      } else {
                        stackOut_39_0 = (sl) (Object) stackIn_39_0;
                        stackOut_39_1 = (String) (Object) stackIn_39_1;
                        stackOut_39_2 = stackIn_39_2;
                        stackOut_39_3 = stackIn_39_3;
                        stackOut_39_4 = 0;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        stackIn_41_3 = stackOut_39_3;
                        stackIn_41_4 = stackOut_39_4;
                        break L17;
                      }
                    }
                    ((sl) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4, var3, var6);
                    break L16;
                  }
                }
                L18: {
                  qb.field_h.a(135, 4 + var10, var6);
                  oo.h(138, 0, var15 + 138, 480);
                  stackOut_43_0 = 140;
                  stackOut_43_1 = 9 + var10;
                  stackOut_43_2 = qb.field_h.field_e - 10;
                  stackOut_43_3 = 16;
                  stackOut_43_4 = 7;
                  stackIn_45_0 = stackOut_43_0;
                  stackIn_45_1 = stackOut_43_1;
                  stackIn_45_2 = stackOut_43_2;
                  stackIn_45_3 = stackOut_43_3;
                  stackIn_45_4 = stackOut_43_4;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  stackIn_44_3 = stackOut_43_3;
                  stackIn_44_4 = stackOut_43_4;
                  if (var14 != 0) {
                    stackOut_45_0 = stackIn_45_0;
                    stackOut_45_1 = stackIn_45_1;
                    stackOut_45_2 = stackIn_45_2;
                    stackOut_45_3 = stackIn_45_3;
                    stackOut_45_4 = stackIn_45_4;
                    stackOut_45_5 = 16711680;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    stackIn_46_2 = stackOut_45_2;
                    stackIn_46_3 = stackOut_45_3;
                    stackIn_46_4 = stackOut_45_4;
                    stackIn_46_5 = stackOut_45_5;
                    break L18;
                  } else {
                    stackOut_44_0 = stackIn_44_0;
                    stackOut_44_1 = stackIn_44_1;
                    stackOut_44_2 = stackIn_44_2;
                    stackOut_44_3 = stackIn_44_3;
                    stackOut_44_4 = stackIn_44_4;
                    stackOut_44_5 = 65535;
                    stackIn_46_0 = stackOut_44_0;
                    stackIn_46_1 = stackOut_44_1;
                    stackIn_46_2 = stackOut_44_2;
                    stackIn_46_3 = stackOut_44_3;
                    stackIn_46_4 = stackOut_44_4;
                    stackIn_46_5 = stackOut_44_5;
                    break L18;
                  }
                }
                oo.b(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4, stackIn_46_5, var6 / 2);
                oo.h(0, 0, 640, 480);
                var18 = 436;
                var19 = 0;
                L19: while (true) {
                  if (var19 >= 63) {
                    L20: {
                      var19 = op.field_m.field_o[var13];
                      var20 = op.field_m.field_v[var13];
                      if (((si) this).field_z.field_i) {
                        L21: {
                          qp.field_w.a(Integer.toString(var20), var8_int, 15 + var10, 16777215, 1, var6);
                          stackOut_56_0 = qp.field_w;
                          stackOut_56_1 = eb.a(var20 - var19, true, param0);
                          stackOut_56_2 = var8_int - 2;
                          stackOut_56_3 = 30 + var10;
                          stackIn_58_0 = stackOut_56_0;
                          stackIn_58_1 = stackOut_56_1;
                          stackIn_58_2 = stackOut_56_2;
                          stackIn_58_3 = stackOut_56_3;
                          stackIn_57_0 = stackOut_56_0;
                          stackIn_57_1 = stackOut_56_1;
                          stackIn_57_2 = stackOut_56_2;
                          stackIn_57_3 = stackOut_56_3;
                          if (var19 < var20) {
                            stackOut_58_0 = (ef) (Object) stackIn_58_0;
                            stackOut_58_1 = (String) (Object) stackIn_58_1;
                            stackOut_58_2 = stackIn_58_2;
                            stackOut_58_3 = stackIn_58_3;
                            stackOut_58_4 = 65280;
                            stackIn_59_0 = stackOut_58_0;
                            stackIn_59_1 = stackOut_58_1;
                            stackIn_59_2 = stackOut_58_2;
                            stackIn_59_3 = stackOut_58_3;
                            stackIn_59_4 = stackOut_58_4;
                            break L21;
                          } else {
                            stackOut_57_0 = (ef) (Object) stackIn_57_0;
                            stackOut_57_1 = (String) (Object) stackIn_57_1;
                            stackOut_57_2 = stackIn_57_2;
                            stackOut_57_3 = stackIn_57_3;
                            stackOut_57_4 = 16711680;
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_59_1 = stackOut_57_1;
                            stackIn_59_2 = stackOut_57_2;
                            stackIn_59_3 = stackOut_57_3;
                            stackIn_59_4 = stackOut_57_4;
                            break L21;
                          }
                        }
                        ((ef) (Object) stackIn_59_0).a(stackIn_59_1, stackIn_59_2, stackIn_59_3, stackIn_59_4, 1, var6);
                        break L20;
                      } else {
                        qp.field_w.a(Integer.toString(var20), var8_int, var10 + 22, 16777215, 1, var6);
                        break L20;
                      }
                    }
                    L22: {
                      var21 = op.field_m.field_D[var13][0];
                      var22 = op.field_m.field_D[var13][1];
                      var23 = 4;
                      var24 = wf.field_m / gg.field_b[var23];
                      var24 = var24 % gg.field_j[var23];
                      var24 = var24 + gg.field_l[var23];
                      am.a(var24, var22, var11, 1, var21).c(8, var10 - 11, var6);
                      var25 = am.a(var24, var22, -var11 + 1, 1, var21);
                      var25.e();
                      var11 = -var11 + 1;
                      var25.c(575, -11 + var10, var6);
                      if (var17 == 0) {
                        break L22;
                      } else {
                        oo.g(44, 4 + var10, 47, var10 + 1, 16777215);
                        oo.g(43, 4 + var10, 46, var10 - -1, 16777215);
                        oo.g(45, var10 - -4, 48, var10 + 1, 16777215);
                        oo.g(42, var10 - -4, 45, var10 - -1, 65793);
                        oo.g(46, var10 - -4, 49, var10 - -1, 65793);
                        break L22;
                      }
                    }
                    var7 = var7 + (var4 + 1);
                    var10 += 58;
                    var12++;
                    continue L6;
                  } else {
                    if (((si) this).field_z.b((byte) -121, var19, var13)) {
                      wa.field_b[-18 + var19].c(var18, var10 + 5, var6);
                      if (wa.field_b[var19 - 18].b(var18, 5 + var10, bd.field_g, bo.field_d)) {
                        ((si) this).field_E = var19;
                        var18 += 28;
                        var19++;
                        continue L19;
                      } else {
                        var18 += 28;
                        var19++;
                        continue L19;
                      }
                    } else {
                      var19++;
                      continue L19;
                    }
                  }
                }
              }
            }
          }
        }
        L23: {
          L24: {
            if (((si) this).field_B == 1) {
              break L24;
            } else {
              if (-1 <= ((si) this).field_n) {
                break L23;
              } else {
                break L24;
              }
            }
          }
          L25: {
            if (-2 == ((si) this).field_B) {
              stackOut_79_0 = var5;
              stackIn_80_0 = stackOut_79_0;
              break L25;
            } else {
              stackOut_78_0 = 255 - var5;
              stackIn_80_0 = stackOut_78_0;
              break L25;
            }
          }
          var6 = stackIn_80_0;
          rg.field_C.a(-40, 233, var6);
          var7 = 0;
          var8 = new int[]{30, 239, 448};
          var9 = 0;
          L26: while (true) {
            if (5 <= var9) {
              var9 = 0;
              L27: while (true) {
                if (var9 >= 3) {
                  oo.h(0, 0, var7, 480);
                  var9 = 0;
                  L28: while (true) {
                    if (var9 >= 64) {
                      oo.c();
                      rq.field_l.a(30, 231, var6);
                      rq.field_l.a(239, 231, var6);
                      rq.field_l.a(448, 231, var6);
                      var9 = 0;
                      var10 = ll.field_k.g((byte) 125);
                      var11 = 0;
                      L29: while (true) {
                        if (var11 >= var10) {
                          var11 = 0;
                          L30: while (true) {
                            if (var11 >= 3) {
                              ul.field_f.a(93, 231, var6);
                              ul.field_f.a(209, 231, var6);
                              ul.field_f.a(329, 231, var6);
                              ul.field_f.a(573, 231, var6);
                              break L23;
                            } else {
                              var12 = ll.field_k.field_s[var11];
                              if (var12 != 255) {
                                qj.field_m.a(38 + 209 * var11, 244, var6);
                                oo.h(0, 0, 640, 366);
                                var13 = 0;
                                L31: while (true) {
                                  if (16 <= var13) {
                                    var13 = 0;
                                    L32: while (true) {
                                      if (var13 >= 8) {
                                        L33: {
                                          pm.field_N.a(var11 * 209 + 38, 244, var6);
                                          oo.c();
                                          qh.a(var12, -29990, ll.field_k, 280, var11 * 209 + 91, var6);
                                          var13 = ll.field_k.field_t[var12];
                                          var14 = cr.a(var12, -95);
                                          int incrementValue$3 = var9;
                                          var9++;
                                          stackOut_126_0 = qp.field_w;
                                          stackOut_126_1 = eb.a(((si) this).field_r[incrementValue$3], true, true);
                                          stackOut_126_2 = 209 * var11 + 166;
                                          stackOut_126_3 = 295;
                                          stackIn_128_0 = stackOut_126_0;
                                          stackIn_128_1 = stackOut_126_1;
                                          stackIn_128_2 = stackOut_126_2;
                                          stackIn_128_3 = stackOut_126_3;
                                          stackIn_127_0 = stackOut_126_0;
                                          stackIn_127_1 = stackOut_126_1;
                                          stackIn_127_2 = stackOut_126_2;
                                          stackIn_127_3 = stackOut_126_3;
                                          if (var13 < var14) {
                                            stackOut_128_0 = (ef) (Object) stackIn_128_0;
                                            stackOut_128_1 = (String) (Object) stackIn_128_1;
                                            stackOut_128_2 = stackIn_128_2;
                                            stackOut_128_3 = stackIn_128_3;
                                            stackOut_128_4 = 16777215;
                                            stackIn_129_0 = stackOut_128_0;
                                            stackIn_129_1 = stackOut_128_1;
                                            stackIn_129_2 = stackOut_128_2;
                                            stackIn_129_3 = stackOut_128_3;
                                            stackIn_129_4 = stackOut_128_4;
                                            break L33;
                                          } else {
                                            stackOut_127_0 = (ef) (Object) stackIn_127_0;
                                            stackOut_127_1 = (String) (Object) stackIn_127_1;
                                            stackOut_127_2 = stackIn_127_2;
                                            stackOut_127_3 = stackIn_127_3;
                                            stackOut_127_4 = 16711680;
                                            stackIn_129_0 = stackOut_127_0;
                                            stackIn_129_1 = stackOut_127_1;
                                            stackIn_129_2 = stackOut_127_2;
                                            stackIn_129_3 = stackOut_127_3;
                                            stackIn_129_4 = stackOut_127_4;
                                            break L33;
                                          }
                                        }
                                        ((ef) (Object) stackIn_129_0).b(stackIn_129_1, stackIn_129_2, stackIn_129_3, stackIn_129_4, 1, var6);
                                        var11++;
                                        continue L30;
                                      } else {
                                        oo.a(((var13 / 5 + 19) * wf.field_m + var13 * 300) % 720 + 8 + (209 * var11 + 48 << 4), 5744, 112, var6 * 125 >> 8, wp.field_f);
                                        var13++;
                                        continue L32;
                                      }
                                    }
                                  } else {
                                    oo.a((48 + 209 * var11 << 4) + 8, 4000 + (wf.field_m * (var13 / 5 + 19) + 300 * var13) % 1920, 112, 125 * var6 >> 8, wp.field_f);
                                    var13++;
                                    continue L31;
                                  }
                                }
                              } else {
                                wk.field_J.a(38 - -(209 * var11), 244, var6);
                                hn.field_i.a(var11 * 209 + 91, 280, var6);
                                var11++;
                                continue L30;
                              }
                            }
                          }
                        } else {
                          L34: {
                            var12 = ll.field_k.field_m[var11];
                            var13 = ll.field_k.field_g[var11];
                            na.field_I.a(-32 + ga.field_v[var11], 126, var6);
                            if (255 == var12) {
                              break L34;
                            } else {
                              if (63 <= var12) {
                                break L34;
                              } else {
                                pq.field_o.a(ga.field_v[var11], 166, var6);
                                var14 = 0;
                                L35: while (true) {
                                  if (var14 >= 8) {
                                    L36: {
                                      w.field_z.a(ga.field_v[var11], 166, var6);
                                      mg.a(var12, var13, (byte) 46, 106, ll.field_k, var6, -28 + ga.field_v[var11]);
                                      var14 = ll.field_k.field_t[var12];
                                      var15 = cr.a(var12, -107);
                                      int incrementValue$4 = var9;
                                      var9++;
                                      stackOut_103_0 = qp.field_w;
                                      stackOut_103_1 = eb.a(((si) this).field_r[incrementValue$4], true, true);
                                      stackOut_103_2 = ga.field_v[var11] - 50;
                                      stackOut_103_3 = 123;
                                      stackIn_105_0 = stackOut_103_0;
                                      stackIn_105_1 = stackOut_103_1;
                                      stackIn_105_2 = stackOut_103_2;
                                      stackIn_105_3 = stackOut_103_3;
                                      stackIn_104_0 = stackOut_103_0;
                                      stackIn_104_1 = stackOut_103_1;
                                      stackIn_104_2 = stackOut_103_2;
                                      stackIn_104_3 = stackOut_103_3;
                                      if (var14 < var15) {
                                        stackOut_105_0 = (ef) (Object) stackIn_105_0;
                                        stackOut_105_1 = (String) (Object) stackIn_105_1;
                                        stackOut_105_2 = stackIn_105_2;
                                        stackOut_105_3 = stackIn_105_3;
                                        stackOut_105_4 = 16777215;
                                        stackIn_106_0 = stackOut_105_0;
                                        stackIn_106_1 = stackOut_105_1;
                                        stackIn_106_2 = stackOut_105_2;
                                        stackIn_106_3 = stackOut_105_3;
                                        stackIn_106_4 = stackOut_105_4;
                                        break L36;
                                      } else {
                                        stackOut_104_0 = (ef) (Object) stackIn_104_0;
                                        stackOut_104_1 = (String) (Object) stackIn_104_1;
                                        stackOut_104_2 = stackIn_104_2;
                                        stackOut_104_3 = stackIn_104_3;
                                        stackOut_104_4 = 16711680;
                                        stackIn_106_0 = stackOut_104_0;
                                        stackIn_106_1 = stackOut_104_1;
                                        stackIn_106_2 = stackOut_104_2;
                                        stackIn_106_3 = stackOut_104_3;
                                        stackIn_106_4 = stackOut_104_4;
                                        break L36;
                                      }
                                    }
                                    ((ef) (Object) stackIn_106_0).b(stackIn_106_1, stackIn_106_2, stackIn_106_3, stackIn_106_4, 1, var6);
                                    if (255 != var13) {
                                      if (var13 < 63) {
                                        L37: {
                                          var14 = ll.field_k.field_t[var13];
                                          var15 = cr.a(var13, -101);
                                          int incrementValue$5 = var9;
                                          var9++;
                                          stackOut_110_0 = qp.field_w;
                                          stackOut_110_1 = eb.a(((si) this).field_r[incrementValue$5], true, true);
                                          stackOut_110_2 = -73 + ga.field_v[var11];
                                          stackOut_110_3 = 111;
                                          stackIn_112_0 = stackOut_110_0;
                                          stackIn_112_1 = stackOut_110_1;
                                          stackIn_112_2 = stackOut_110_2;
                                          stackIn_112_3 = stackOut_110_3;
                                          stackIn_111_0 = stackOut_110_0;
                                          stackIn_111_1 = stackOut_110_1;
                                          stackIn_111_2 = stackOut_110_2;
                                          stackIn_111_3 = stackOut_110_3;
                                          if (var14 >= var15) {
                                            stackOut_112_0 = (ef) (Object) stackIn_112_0;
                                            stackOut_112_1 = (String) (Object) stackIn_112_1;
                                            stackOut_112_2 = stackIn_112_2;
                                            stackOut_112_3 = stackIn_112_3;
                                            stackOut_112_4 = 16711680;
                                            stackIn_113_0 = stackOut_112_0;
                                            stackIn_113_1 = stackOut_112_1;
                                            stackIn_113_2 = stackOut_112_2;
                                            stackIn_113_3 = stackOut_112_3;
                                            stackIn_113_4 = stackOut_112_4;
                                            break L37;
                                          } else {
                                            stackOut_111_0 = (ef) (Object) stackIn_111_0;
                                            stackOut_111_1 = (String) (Object) stackIn_111_1;
                                            stackOut_111_2 = stackIn_111_2;
                                            stackOut_111_3 = stackIn_111_3;
                                            stackOut_111_4 = 16777215;
                                            stackIn_113_0 = stackOut_111_0;
                                            stackIn_113_1 = stackOut_111_1;
                                            stackIn_113_2 = stackOut_111_2;
                                            stackIn_113_3 = stackOut_111_3;
                                            stackIn_113_4 = stackOut_111_4;
                                            break L37;
                                          }
                                        }
                                        ((ef) (Object) stackIn_113_0).b(stackIn_113_1, stackIn_113_2, stackIn_113_3, stackIn_113_4, 1, var6);
                                        var11++;
                                        continue L29;
                                      } else {
                                        var11++;
                                        continue L29;
                                      }
                                    } else {
                                      var11++;
                                      continue L29;
                                    }
                                  } else {
                                    oo.a(10 + ga.field_v[var11] << 4, -(((var14 / 5 + 19) * wf.field_m - -(var14 * 300)) % 960) + 3728, 96, 125 * var6 >> 8, wp.field_f);
                                    var14++;
                                    continue L35;
                                  }
                                }
                              }
                            }
                          }
                          tm.field_f.a(ga.field_v[var11], 166, var6);
                          var11++;
                          continue L29;
                        }
                      }
                    } else {
                      oo.a(-176 + ((var9 / 11 + 25) * wf.field_m + 1000 * var9) % 10560, 3952, 176, var6 * 125 >> 8, wp.field_f);
                      var9++;
                      continue L28;
                    }
                  }
                } else {
                  var10 = ll.field_k.field_s[var9];
                  if (255 != var10) {
                    L38: {
                      if (var7 <= var8[var9]) {
                        stackOut_91_0 = var8[var9];
                        stackIn_92_0 = stackOut_91_0;
                        break L38;
                      } else {
                        stackOut_90_0 = var7;
                        stackIn_92_0 = stackOut_90_0;
                        break L38;
                      }
                    }
                    var7 = stackIn_92_0;
                    var9++;
                    continue L27;
                  } else {
                    var9++;
                    continue L27;
                  }
                }
              }
            } else {
              var10 = ll.field_k.field_m[var9];
              if (255 != var10) {
                var7 = ga.field_v[var9];
                var9++;
                continue L26;
              } else {
                var9++;
                continue L26;
              }
            }
          }
        }
    }

    public static void d(boolean param0) {
        field_D = null;
    }

    private final void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          if (((si) this).field_E != 255) {
            L1: {
              if (((si) this).field_m != 0) {
                break L1;
              } else {
                if (10 >= b.a(true)) {
                  break L1;
                } else {
                  ((si) this).field_m = ((si) this).field_m + 1;
                  break L1;
                }
              }
            }
            if (((si) this).field_m > 0) {
              L2: {
                ((si) this).field_m = ((si) this).field_m + 2;
                if (((si) this).field_m > 255) {
                  ((si) this).field_m = 255;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var7 = gh.field_f[((si) this).field_E];
                var8 = qp.field_w.a(var7);
                var9 = param0 * (((si) this).field_m * 8) >> 8;
                var5 = qp.field_w.field_w;
                if (255 < var9) {
                  var9 = 255;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: while (true) {
                if (var8 <= 300) {
                  L5: {
                    var6 = var8 - -16;
                    var3 = bd.field_g;
                    var5 += 16;
                    if (0 > var3) {
                      var3 = 0;
                      break L5;
                    } else {
                      if (var3 - -var6 <= 635) {
                        break L5;
                      } else {
                        var3 = 640 + -var6 - 5;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    var4 = 32 + bo.field_d;
                    if (var9 > 250) {
                      oo.b(var3 - -2, var4 + 2, var6, var5, 4, 0, var9 / 2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  oo.b(var3, var4, var6, var5, 4, 10061892, var9);
                  int discarded$1 = qp.field_w.a(var7, var3, var4, var6, var5, 16777215, 0, var9, 1, 1, 0);
                  break L0;
                } else {
                  var5 = var5 + qp.field_w.field_w;
                  var8 = var8 / 2;
                  continue L4;
                }
              }
            } else {
              break L0;
            }
          } else {
            ((si) this).field_m = 0;
            break L0;
          }
        }
    }

    private final void e(int param0, int param1) {
        ((si) this).field_u[((si) this).field_v].a(((si) this).field_v / 4 * 75 + 130, 35 - -(640 * (((si) this).field_v % param1) / 5), param0, 70);
        ((si) this).field_v = ((si) this).field_v + 1;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (((si) this).field_n > 0) {
            ((si) this).field_n = 33 + -((si) this).field_n;
            ((si) this).field_B = ((si) this).field_s;
            break L0;
          } else {
            ((si) this).field_n = 33;
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            ((si) this).field_l = null;
            break L1;
          }
        }
        L2: {
          ((si) this).field_s = param1;
          var3 = ((si) this).field_s;
          if (var3 != 1) {
            if (var3 != 0) {
              break L2;
            } else {
              we.field_g[43] = ec.field_a;
              break L2;
            }
          } else {
            we.field_g[43] = ip.field_c;
            break L2;
          }
        }
    }

    final int d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= -65) {
          L0: {
            var4 = ((si) this).field_j.length;
            if (var4 != 1) {
              if (var4 == 2) {
                L1: {
                  if (param1 != 0) {
                    stackOut_9_0 = 2;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                var3 = stackIn_10_0;
                break L0;
              } else {
                var3 = param1;
                break L0;
              }
            } else {
              var3 = 1;
              break L0;
            }
          }
          var4 = var3;
          if (0 != var4) {
            if (var4 == 1) {
              return 400;
            } else {
              if (var4 != 2) {
                return super.d(-93, param1);
              } else {
                return 560;
              }
            }
          } else {
            return 210;
          }
        } else {
          return -1;
        }
    }

    final void f(int param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 != (op.field_m.field_j & 1 << fb.field_e.field_M)) {
            we.field_g[42] = ih.field_c;
        } else {
            if (cm.a(op.field_m.field_j, true) > 0) {
                we.field_g[42] = ih.field_c;
            } else {
                we.field_g[42] = u.field_j;
            }
        }
        if (param0 <= 123) {
            ((si) this).field_w = -88;
        }
    }

    final void a(int param0) {
        cb[] var2 = null;
        int var3 = 0;
        int var5 = 0;
        cb[] var6 = null;
        cb[] var7 = null;
        int var8 = 0;
        cb var9 = null;
        cb var10 = null;
        L0: {
          L1: {
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            super.a(0);
            if (((si) this).field_n > param0) {
              ((si) this).field_n = ((si) this).field_n - 1;
              if (((si) this).field_n <= 0) {
                ((si) this).field_B = ((si) this).field_s;
                if (((si) this).field_B == 0) {
                  var7 = ((si) this).field_u;
                  var2 = var7;
                  var8 = 0;
                  var3 = var8;
                  L2: while (true) {
                    if (var7.length > var8) {
                      var10 = var7[var8];
                      var10.c((byte) 99);
                      var8++;
                      continue L2;
                    } else {
                      if (((si) this).field_g.field_d != 0) {
                        break L0;
                      } else {
                        if (39 != ((si) this).field_j[0]) {
                          break L0;
                        } else {
                          ((si) this).field_g.a(1, ~param0);
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              if (((si) this).field_B == 1) {
                if (0 == wf.field_m % 2) {
                  var6 = ((si) this).field_u;
                  var2 = var6;
                  var3 = 0;
                  L3: while (true) {
                    if (var6.length > var3) {
                      var9 = var6[var3];
                      var10 = var9;
                      var10 = var9;
                      var9.d((byte) -102);
                      var3++;
                      continue L3;
                    } else {
                      if (((si) this).field_g.field_d != 0) {
                        break L0;
                      } else {
                        if (39 != ((si) this).field_j[0]) {
                          break L0;
                        } else {
                          ((si) this).field_g.a(1, ~param0);
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                if (((si) this).field_g.field_d != 0) {
                  break L0;
                } else {
                  if (39 != ((si) this).field_j[0]) {
                    break L0;
                  } else {
                    ((si) this).field_g.a(1, ~param0);
                    break L0;
                  }
                }
              }
            }
          }
          if (((si) this).field_g.field_d != 0) {
            break L0;
          } else {
            if (39 != ((si) this).field_j[0]) {
              break L0;
            } else {
              ((si) this).field_g.a(1, ~param0);
              break L0;
            }
          }
        }
        int fieldTemp$1 = ((si) this).field_x - 1;
        ((si) this).field_x = ((si) this).field_x - 1;
        if (fieldTemp$1 <= 0) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = 0.0;
        field_D = "Advertising websites";
    }
}
