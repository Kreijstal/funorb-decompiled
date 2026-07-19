/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends nv {
    private int field_s;
    static String field_p;
    private int field_r;
    private int field_n;
    private int field_o;
    static int[] field_q;

    final void k(int param0) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        ffa[] var3 = null;
        fsa var4 = null;
        int var5 = 0;
        ffa var6 = null;
        int var7 = 0;
        npa var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == 5418) {
            break L0;
          } else {
            discarded$4 = this.p((byte) 4);
            break L0;
          }
        }
        this.b(0);
        var8 = this.b(true).field_u;
        var3 = var8.a((byte) -26, this.field_g);
        var4 = this.e(6);
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var3.length <= var5) {
              break L2;
            } else {
              var6 = var3[var5];
              if (var7 != 0) {
                break L2;
              } else {
                L3: {
                  if (!var6.a(-77)) {
                    break L3;
                  } else {
                    if (var6 == var4) {
                      break L3;
                    } else {
                      if (io.a(var6.c(param0 + -5435), this.field_g.e(9648), (byte) -55, var6.a((byte) 55), this.field_g.d(param0 + -5415), var6.e(9648), this.field_g.a((byte) 55), this.field_g.c(-21), var6.d(3))) {
                        discarded$5 = var6.a(100, true, 1, this.field_o, this.field_n, 0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5++;
                if (var7 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void b(int param0) {
        int var2 = hua.a((byte) 111, this.field_g.g(-25787) >> 1303228386);
        int var3 = bua.a(param0, this.field_g.g(-25787) >> -1936018174);
        this.field_n = -gqa.a(this.field_r, (byte) 24, var2) - -gqa.a(this.field_s, (byte) 24, var3);
        this.field_o = -gqa.a(this.field_s, (byte) 24, var2) + gqa.a(this.field_r, (byte) 24, var3);
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            this.field_o = -40;
        }
        return param0;
    }

    public static void c(int param0) {
        field_q = null;
        if (param0 != 6) {
            field_p = (String) null;
        }
        field_p = null;
    }

    final int a(boolean param0) {
        if (param0) {
            return -20;
        }
        return 1;
    }

    final static iu[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        int var9 = 0;
        iu[] var10 = null;
        iu[] var11_ref_iu__ = null;
        int var11 = 0;
        int var12 = 0;
        iu var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          var9 = param1 + (param5 - -param3);
          var10 = new iu[]{new iu(var9, var9), new iu(param6, var9), new iu(var9, var9), new iu(var9, param6), new iu(64, 64), new iu(var9, param6), new iu(var9, var9), new iu(param6, var9), new iu(var9, var9)};
          if (param7) {
            break L0;
          } else {
            hi.c(-100);
            break L0;
          }
        }
        var11_ref_iu__ = var10;
        var12 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var11_ref_iu__.length <= var12) {
                break L3;
              } else {
                var13 = var11_ref_iu__[var12];
                stackOut_4_0 = 0;
                stackIn_13_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var15 != 0) {
                  break L2;
                } else {
                  var14 = stackIn_5_0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var14 >= var13.field_r.length) {
                          break L6;
                        } else {
                          var13.field_r[var14] = param2;
                          var14++;
                          if (var15 != 0) {
                            break L5;
                          } else {
                            if (var15 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var12++;
                      break L5;
                    }
                    if (var15 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L2;
          }
          var11 = stackIn_13_0;
          L7: while (true) {
            L8: {
              if (var11 >= param5) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L8;
              } else {
                stackOut_15_0 = 0;
                stackIn_24_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (var15 != 0) {
                  break L8;
                } else {
                  var12 = stackIn_16_0;
                  L9: while (true) {
                    L10: {
                      if (var9 <= var12) {
                        var11++;
                        break L10;
                      } else {
                        var10[6].field_r[(-var11 + var9 - 1) * var9 + var12] = param8;
                        var10[8].field_r[var9 * (-1 + (-var11 + var9)) + var12] = param8;
                        var10[2].field_r[var12 * var9 + var9 + -1 - var11] = param8;
                        var10[8].field_r[var12 * var9 - -var9 + (-1 + -var11)] = param8;
                        var12++;
                        if (var15 != 0) {
                          break L10;
                        } else {
                          continue L9;
                        }
                      }
                    }
                    continue L7;
                  }
                }
              }
            }
            var11 = stackIn_24_0;
            L11: while (true) {
              stackOut_25_0 = var11;
              stackOut_25_1 = param5;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              L12: while (true) {
                L13: {
                  if (stackIn_26_0 >= stackIn_26_1) {
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    break L13;
                  } else {
                    stackOut_27_0 = 0;
                    stackIn_33_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (var15 != 0) {
                      break L13;
                    } else {
                      var12 = stackIn_28_0;
                      if (var12 >= var9) {
                        var11++;
                        continue L11;
                      } else {
                        var10[0].field_r[var9 * var11 + var12] = param4;
                        var10[0].field_r[var12 * var9 - -var11] = param4;
                        stackOut_29_0 = -var11 + var9;
                        stackOut_29_1 = var12;
                        stackIn_26_0 = stackOut_29_0;
                        stackIn_26_1 = stackOut_29_1;
                        continue L12;
                      }
                    }
                  }
                }
                var11 = stackIn_33_0;
                L14: while (true) {
                  L15: {
                    if (var11 >= param6) {
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L15;
                    } else {
                      stackOut_35_0 = 0;
                      stackIn_44_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (var15 != 0) {
                        break L15;
                      } else {
                        var12 = stackIn_36_0;
                        L16: while (true) {
                          L17: {
                            if (param5 <= var12) {
                              var11++;
                              break L17;
                            } else {
                              var10[7].field_r[param6 * (-var12 + (var9 + -1)) - -var11] = param8;
                              var10[5].field_r[-1 - -var9 - (var12 - var11 * var9)] = param8;
                              var10[1].field_r[param6 * var12 - -var11] = param4;
                              var10[3].field_r[var9 * var11 + var12] = param4;
                              var12++;
                              if (var15 != 0) {
                                break L17;
                              } else {
                                continue L16;
                              }
                            }
                          }
                          continue L14;
                        }
                      }
                    }
                  }
                  var11 = stackIn_44_0;
                  L18: while (true) {
                    L19: {
                      if (var11 >= param6 >> -125971551) {
                        break L19;
                      } else {
                        var12 = 0;
                        L20: while (true) {
                          L21: {
                            if (param1 <= var12) {
                              var11++;
                              break L21;
                            } else {
                              var10[1].field_r[param6 * (-1 + -var12 + var9) + var11] = param0;
                              var10[3].field_r[var11 * var9 - (var12 + -var9 - -1)] = param0;
                              var10[7].field_r[param6 * var12 + var11] = param0;
                              var10[5].field_r[var9 * var11 - -var12] = param0;
                              var12++;
                              if (var15 != 0) {
                                break L21;
                              } else {
                                continue L20;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          }
        }
    }

    final void h(int param0) {
        if (param0 != 28701) {
            return;
        }
        super.h(param0 + 0);
        this.field_s = -this.field_s;
    }

    hi(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_s = bla.a(true, 4, param1.b((byte) 44, 4)) << 1174170448;
            this.field_r = bla.a(true, 4, param1.b((byte) 44, 4)) << 1509249904;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            kh var3 = (kh) null;
            this.a(false, (kh) null);
        }
        return true;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            param1.b((byte) 60, 3);
            this.b(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hi.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, dqa.a(true, this.field_s >> -1206818288, 4), 4);
            param1.a((byte) -127, dqa.a(true, this.field_r >> -1420745040, 4), 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hi.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new int[]{15, 35, 12, 18, 33};
    }
}
