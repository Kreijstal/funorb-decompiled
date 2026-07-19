/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends df {
    static String field_U;
    static String field_ab;
    static cj field_fb;
    private int field_S;
    private int field_Y;
    static String field_cb;
    static String field_W;
    static int field_bb;
    private int field_X;
    private int field_db;
    private int field_V;
    static ul field_eb;
    private int field_T;
    static int field_Z;

    final static void b(boolean param0, int param1) {
        try {
            Object discarded$1 = null;
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            if (param0) {
              try {
                L0: {
                  discarded$1 = fo.a(jl.b(0), "resizing", (byte) 23, new Object[]{new Integer(param1)});
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2 = decompiledCaughtException;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void j(byte param0) {
        if (param0 > -70) {
            field_ab = (String) null;
        }
    }

    boolean i(int param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0 == -27388) {
            break L0;
          } else {
            this.a(-14, (byte) 3, 7, -57);
            break L0;
          }
        }
        L1: {
          if ((this.field_db ^ -1) < -1) {
            L2: {
              L3: {
                var2 = this.field_V;
                var3 = this.field_Y;
                fieldTemp$2 = this.field_S + 1;
                this.field_S = this.field_S + 1;
                if ((fieldTemp$2 ^ -1) <= (this.field_db ^ -1)) {
                  break L3;
                } else {
                  var4 = (this.field_db * 2 - this.field_S) * this.field_S;
                  var5 = this.field_db * this.field_db;
                  var2 = var4 * (-this.field_X + this.field_V) / var5 + this.field_X;
                  var3 = this.field_T - -(var4 * (-this.field_T + this.field_Y) / var5);
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_db = 0;
              this.j((byte) -101);
              break L2;
            }
            this.b(var2, var3, param0 + 27505);
            break L1;
          } else {
            break L1;
          }
        }
        return super.i(-27388);
    }

    final static String k(int param0) {
        if (param0 <= 68) {
            return (String) null;
        }
        return s.field_e.f((byte) -24);
    }

    final static void j(int param0) {
        ch.field_e = false;
        nj.field_f = false;
        fb.a(param0, 99);
        id.field_B = mp.field_b;
        ta.field_hb = mp.field_b;
    }

    public static void i(byte param0) {
        field_U = null;
        field_cb = null;
        int var1 = -15 % ((-22 - param0) / 60);
        field_eb = null;
        field_ab = null;
        field_fb = null;
        field_W = null;
    }

    al(vk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_S = 0;
        this.field_db = 0;
    }

    void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        oo.a(6 + param1, param2 + 35, -12 + this.field_n, this.field_w - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          L1: {
            L2: {
              if ((var4 ^ -1) >= (var7 ^ -1)) {
                break L2;
              } else {
                stackOut_2_0 = oo.field_e;
                stackOut_2_1 = var8;
                stackIn_35_0 = stackOut_2_0;
                stackIn_35_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var16 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 > stackIn_3_1) {
                      break L3;
                    } else {
                      L4: {
                        if (oo.field_d > var8) {
                          break L4;
                        } else {
                          if (var16 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var9 = (-var5 + var6) * var7 / var4 + var5;
                          var10 = 0;
                          var11 = this.field_n;
                          if (var7 <= 20) {
                            L7: while (true) {
                              if (var10 > 20) {
                                break L6;
                              } else {
                                var12 = (-var10 + 20) * (20 - var10) + (-var7 + 20) * (20 + -var7);
                                stackOut_10_0 = var12 ^ -1;
                                stackOut_10_1 = -463;
                                stackIn_18_0 = stackOut_10_0;
                                stackIn_18_1 = stackOut_10_1;
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                if (var16 != 0) {
                                  break L5;
                                } else {
                                  L8: {
                                    if (stackIn_11_0 < stackIn_11_1) {
                                      break L8;
                                    } else {
                                      L9: {
                                        if (var12 >= 420) {
                                          break L9;
                                        } else {
                                          if (var16 == 0) {
                                            break L6;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var13 = var9 * (462 + -var12) / 42;
                                      var13 = var13 | (var13 << 558023208 | var13 << 1956100304);
                                      oo.field_i[param1 + oo.field_b * var8 + var10] = var13;
                                      break L8;
                                    }
                                  }
                                  var10++;
                                  if (var16 == 0) {
                                    continue L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        stackOut_17_0 = var7 ^ -1;
                        stackOut_17_1 = -21;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        break L5;
                      }
                      L10: {
                        L11: {
                          if (stackIn_18_0 < stackIn_18_1) {
                            break L11;
                          } else {
                            var12 = var11;
                            var11 -= 21;
                            var13 = 0;
                            L12: while (true) {
                              L13: {
                                if ((var13 ^ -1) < -21) {
                                  break L13;
                                } else {
                                  var14 = (20 + -var7) * (20 + -var7) + var13 * var13;
                                  stackOut_21_0 = -463;
                                  stackOut_21_1 = var14 ^ -1;
                                  stackIn_32_0 = stackOut_21_0;
                                  stackIn_32_1 = stackOut_21_1;
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  if (var16 != 0) {
                                    break L10;
                                  } else {
                                    L14: {
                                      if (stackIn_22_0 <= stackIn_22_1) {
                                        break L14;
                                      } else {
                                        if (var16 == 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (var14 < 420) {
                                          var12 = 1 + var11;
                                          if (var16 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          break L16;
                                        }
                                      }
                                      var15 = (462 - var14) * var9 / 42;
                                      var15 = var15 | (var15 << -1020322064 | var15 << 1238176072);
                                      oo.field_i[var11 + (param1 + var8 * oo.field_b)] = var15;
                                      break L15;
                                    }
                                    var11++;
                                    var13++;
                                    if (var16 == 0) {
                                      continue L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              var11 = var12;
                              break L11;
                            }
                          }
                        }
                        var9 = var9 | (var9 << 336458792 | var9 << 2118029456);
                        stackOut_31_0 = var10 + param1;
                        stackOut_31_1 = var8;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        break L10;
                      }
                      oo.b(stackIn_32_0, stackIn_32_1, -var10 + var11, var9);
                      break L3;
                    }
                  }
                  var8++;
                  var7++;
                  if (var16 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var7 = 0;
            stackOut_34_0 = param2;
            stackOut_34_1 = -35;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            break L1;
          }
          var8 = stackIn_35_0 - stackIn_35_1;
          L17: while (true) {
            L18: {
              L19: {
                if (var7 >= var4) {
                  break L19;
                } else {
                  var9 = var5 - -(var7 * (-var5 + var6) / var4);
                  var9 = var9 | (var9 << -1091786168 | var9 << -649710544);
                  oo.b(param1, var8, 6, var9);
                  oo.b(param1 + (this.field_n + -6), var8, 6, var9);
                  var8++;
                  var7++;
                  if (var16 != 0) {
                    break L18;
                  } else {
                    if (var16 == 0) {
                      continue L17;
                    } else {
                      break L19;
                    }
                  }
                }
              }
              hq.field_e.g(-90 + param1 - -this.field_n, 10 + param2);
              fk.a(param1 - -5, this.field_n + -10, param0, sn.field_Nb, 35 + param2);
              fk.a(param1, this.field_n, true, jh.field_Hb, this.field_w + param2 + -22);
              var5 = 169;
              var4 = this.field_w - 79;
              var6 = 127;
              var7 = 0;
              break L18;
            }
            var8 = 57 + param2;
            L20: while (true) {
              L21: {
                if ((var7 ^ -1) <= (var4 ^ -1)) {
                  break L21;
                } else {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var9 = var9 | (var9 << -93270328 | var9 << 1585262128);
                  oo.b(param1, var8, 6, var9);
                  oo.b(this.field_n + (param1 + -6), var8, 6, var9);
                  var8++;
                  var7++;
                  if (var16 != 0) {
                    break L21;
                  } else {
                    if (var16 == 0) {
                      continue L20;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final static int c(int param0, int param1, int param2) {
        if (null == er.field_j) {
            return -1;
        }
        if (param2 >= jp.field_d) {
            if ((param2 ^ -1) > (jp.field_d + er.field_j.field_x ^ -1)) {
                if ((param0 ^ -1) <= (cr.field_j ^ -1)) {
                    if ((cr.field_j - -er.field_j.field_w ^ -1) < (param0 ^ -1)) {
                        return 0;
                    }
                }
            }
        }
        if (il.field_k <= param2) {
            if (param2 < il.field_k + er.field_j.field_x) {
                if (param0 >= sq.field_O) {
                    if (!(param0 >= sq.field_O - -er.field_j.field_w)) {
                        return 1;
                    }
                }
            }
        }
        if (param1 != -1) {
            field_eb = (ul) null;
        }
        return -1;
    }

    boolean h(int param0) {
        if (param0 != -6134) {
            field_U = (String) null;
        }
        this.h((byte) 113);
        return super.h(-6134);
    }

    void h(byte param0) {
        if (param0 <= 29) {
            field_cb = (String) null;
        }
        if (!(this.field_db > 0)) {
            return;
        }
        this.b(this.field_V, this.field_Y, 69);
        this.field_db = 0;
        this.j((byte) -116);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (-1 <= (param0 ^ -1)) {
            this.b(param3, param2, 73);
            return;
        }
        this.field_V = param3;
        this.field_Y = param2;
        this.field_S = 0;
        this.field_T = this.field_w;
        if (param1 != -112) {
            discarded$0 = this.h(20);
        }
        this.field_X = this.field_n;
        this.field_db = param0;
    }

    static {
        field_ab = "More suggestions";
        field_W = "Friends";
        field_U = "Impose your will upon enemy zombies.";
        field_cb = "You have <%0> unread messages!";
    }
}
