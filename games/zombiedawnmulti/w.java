/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends gq {
    private int field_s;
    private int[] field_r;
    private int[] field_w;
    private gd field_j;
    private int field_u;
    private ug field_p;
    static String field_n;
    private int field_k;
    private ug field_o;
    private boolean field_y;
    static fm field_A;
    private boolean field_l;
    private gd field_t;
    private ug field_x;
    private gd field_v;
    static ri field_z;
    static int field_m;
    private int field_q;

    private final void a(gd param0, int param1, int param2, int param3) {
        try {
            param0.a(param2, param1, false);
            param0.a((byte) -116, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "w.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(ug param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_33_0 = 0;
        gd stackIn_41_0 = null;
        ug stackIn_41_1 = null;
        gd stackIn_42_0 = null;
        ug stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        gd stackIn_50_0 = null;
        ug stackIn_50_1 = null;
        gd stackIn_51_0 = null;
        ug stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_y) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (0 >= this.field_q) {
                        break L3;
                      } else {
                        L4: {
                          if (null == this.field_p) {
                            break L4;
                          } else {
                            this.field_j.g(2);
                            break L4;
                          }
                        }
                        this.field_p = param0;
                        if (param0 == null) {
                          break L2;
                        } else {
                          this.field_j.a(param0, false, 8361407);
                          this.a(this.field_j, -1, param3, param1);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (this.field_o == null) {
                        break L5;
                      } else {
                        this.field_v.g(2);
                        break L5;
                      }
                    }
                    this.field_o = param0;
                    if (param0 != null) {
                      this.field_v.a(param0, false, 8361407);
                      this.a(this.field_v, -1, param3, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L6: {
              stackIn_17_0 = this;

              if (!param2) {
                stackIn_18_0 = this;
                stackIn_18_1 = 0;
                break L6;
              } else {
                stackIn_18_0 = this;
                stackIn_18_1 = 1;
                break L6;
              }
            }
            ((w) (this)).field_y = stackIn_18_1 != 0;
            if (param5) {
              if (this.field_p == param0) {
                this.field_q = param4;
                this.a(this.field_j, -1, param3, param1);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (param0 != this.field_o) {
                  L7: {
                    L8: {
                      if (this.field_p != null) {
                        break L8;
                      } else {
                        var7_int = 1;
                        if (var8 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (this.field_o != null) {
                        break L9;
                      } else {
                        var7_int = 0;
                        if (var8 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (524288 <= this.field_s) {
                        stackIn_33_0 = 0;
                        break L10;
                      } else {
                        stackIn_33_0 = 1;
                        break L10;
                      }
                    }
                    var7_int = stackIn_33_0;
                    break L7;
                  }
                  L11: {
                    L12: {
                      if (var7_int == 0) {
                        break L12;
                      } else {
                        L13: {
                          if (this.field_p == null) {
                            break L13;
                          } else {
                            this.field_j.g(2);
                            break L13;
                          }
                        }
                        L14: {
                          this.field_p = param0;
                          if (param0 != null) {
                            L15: {
                              stackIn_41_0 = this.field_j;

                              stackIn_41_1 = (ug) (param0);

                              if (param2) {
                                stackIn_42_0 = (gd) ((Object) stackIn_41_0);
                                stackIn_42_1 = (ug) ((Object) stackIn_41_1);
                                stackIn_42_2 = 0;
                                break L15;
                              } else {
                                stackIn_42_0 = (gd) ((Object) stackIn_41_0);
                                stackIn_42_1 = (ug) ((Object) stackIn_41_1);
                                stackIn_42_2 = 1;
                                break L15;
                              }
                            }
                            ((gd) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2 != 0, 8361407);
                            this.a(this.field_j, -1, param3, param1);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        this.field_q = param4;
                        if (var8 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L16: {
                      if (null == this.field_o) {
                        break L16;
                      } else {
                        this.field_v.g(2);
                        break L16;
                      }
                    }
                    L17: {
                      this.field_o = param0;
                      if (param0 != null) {
                        L18: {
                          stackIn_50_0 = this.field_v;

                          stackIn_50_1 = (ug) (param0);

                          if (param2) {
                            stackIn_51_0 = (gd) ((Object) stackIn_50_0);
                            stackIn_51_1 = (ug) ((Object) stackIn_50_1);
                            stackIn_51_2 = 0;
                            break L18;
                          } else {
                            stackIn_51_0 = (gd) ((Object) stackIn_50_0);
                            stackIn_51_1 = (ug) ((Object) stackIn_50_1);
                            stackIn_51_2 = 1;
                            break L18;
                          }
                        }
                        ((gd) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2 != 0, 8361407);
                        this.a(this.field_v, -1, param3, param1);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    this.field_q = -param4;
                    break L11;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  this.field_q = -param4;
                  this.a(this.field_v, -1, param3, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var7);

            stackIn_56_1 = new StringBuilder().append("w.C(");

            if (param0 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L19;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L19;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final gq d() {
        return null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 94 % ((param3 - -10) / 35);
        ia.a(param0, param1, param2, 0);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        L0: {
          if (pk.field_b == null) {
            break L0;
          } else {
            if (!pk.field_b.a(false)) {
              break L0;
            } else {
              q.b(124);
              return true;
            }
          }
        }
        if (param3 == 18663) {
          L1: {
            if (bk.field_i == null) {
              break L1;
            } else {
              if (!bk.field_i.k(param3 ^ 18562)) {
                break L1;
              } else {
                bk.field_i = null;
                q.b(46);
                return true;
              }
            }
          }
          if (vc.a(param3 ^ 5010853)) {
            return true;
          } else {
            if (sd.a(param2, (byte) 122, param0, param1)) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if ((this.field_s ^ -1) >= -1) {
            if (this.field_s >= 1048576) {
              break L0;
            } else {
              if (this.field_o == null) {
                break L0;
              } else {
                this.field_v.a(param0);
                break L0;
              }
            }
          } else {
            if (this.field_s >= 1048576) {
              break L0;
            } else {
              if (this.field_o == null) {
                break L0;
              } else {
                this.field_v.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= this.field_u) {
            break L1;
          } else {
            if (this.field_x != null) {
              this.field_t.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_y) {
            break L2;
          } else {
            L3: {
              if (-1 <= (this.field_q ^ -1)) {
                break L3;
              } else {
                if (this.field_j.c(-106)) {
                  break L3;
                } else {
                  this.field_p = null;
                  this.field_q = -this.field_q;
                  this.field_y = false;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if ((this.field_q ^ -1) <= -1) {
              break L2;
            } else {
              if (!this.field_v.c(-61)) {
                this.field_o = null;
                this.field_q = -this.field_q;
                this.field_y = false;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (this.field_q != 0) {
            L5: {
              this.field_s = this.field_s + param0 * this.field_q;
              if ((this.field_s ^ -1) <= -1048577) {
                break L5;
              } else {
                if (0 >= this.field_s) {
                  this.field_s = 0;
                  if (!this.field_y) {
                    this.field_q = 0;
                    if (!this.field_l) {
                      L6: {
                        if (this.field_p == null) {
                          break L6;
                        } else {
                          this.field_j.g(2);
                          break L6;
                        }
                      }
                      this.field_p = null;
                      if (var3 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            this.field_s = 1048576;
            if (!this.field_y) {
              this.field_q = 0;
              if (this.field_l) {
                break L4;
              } else {
                L7: {
                  if (null != this.field_o) {
                    this.field_v.g(2);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_o = null;
                break L4;
              }
            } else {
              break L4;
            }
          } else {
            break L4;
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 18813) {
            this.a();
        }
        this.field_k = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (uf.field_g <= var1_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        uk.field_M[var1_int] = null;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        uf.field_g = param0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "w.I(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final gq b() {
        return null;
    }

    public static void a(byte param0) {
        if (param0 >= -81) {
            return;
        }
        field_z = null;
        field_n = null;
        field_A = null;
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_k > 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(param2);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (this.field_y) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (0 >= this.field_q) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (this.field_j.c(-54)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_p = null;
                        this.field_y = false;
                        this.field_q = -this.field_q;
                        if (var11 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.field_q >= 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!this.field_v.c(-103)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_o = null;
                        this.field_q = -this.field_q;
                        this.field_y = false;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = (this.field_s >> 292573932) * this.field_k / 256;
                        var5 = -var4_int + this.field_k;
                        if (this.field_q != 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_s = this.field_s + this.field_q * param2;
                        if (-1048577 >= (this.field_s ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 < this.field_s) {
                            statePc = 30;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_s = 0;
                        if (this.field_y) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_q = 0;
                        if (this.field_l) {
                            statePc = 30;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (null != this.field_p) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_j.g(2);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_p = null;
                        if (var11 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_s = 1048576;
                        if (this.field_y) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_q = 0;
                        if (!this.field_l) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == this.field_o) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_v.g(2);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_o = null;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (gp.field_j) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = param2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = param2 << -1305592351;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = stackIn_33_0;
                        if ((this.field_u ^ -1) > -257) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null != this.field_p) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (this.field_o == null) {
                            statePc = 57;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var4_int ^ -1) == -257) {
                            statePc = 56;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (256 == var5) {
                            statePc = 54;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_w == null) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (this.field_w.length < var6) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        d.a(this.field_w, 0, var6);
                        d.a(this.field_r, 0, var6);
                        if (var11 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.field_w = new int[var6];
                        this.field_r = new int[var6];
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_j.b(this.field_w, 0, param2);
                        this.field_v.b(this.field_r, 0, param2);
                        if (!gp.field_j) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        param1 = param1 << 1;
                        stackIn_48_0 = param1 << 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = param1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7 = stackIn_48_0;
                        var8 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var6 <= var8) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        param0[var7 + var8] = param0[var7 + var8] + (this.field_r[var8] * var5 + var4_int * this.field_w[var8] >> 468994792);
                        var8++;
                        if (var11 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var11 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var11 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        this.field_v.b(param0, param1, param2);
                        if (var11 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.field_j.b(param0, param1, param2);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (this.field_x == null) {
                            statePc = 79;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (this.field_u != 0) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (null == this.field_w) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (this.field_w.length >= var6) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_r = new int[var6];
                        this.field_w = new int[var6];
                        if (var11 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        d.a(this.field_w, 0, var6);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_t.b(this.field_w, 0, param2);
                        if (!gp.field_j) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        param1 = param1 << 1;
                        stackIn_69_0 = param1 << 1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = param1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var7 = stackIn_69_0;
                        var8 = this.field_u * this.field_k / 256;
                        var9 = -var8 + this.field_k;
                        var10 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var6 <= var10) {
                            statePc = 79;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        param0[var10 + var7] = var8 * this.field_w[var10] + param0[var10 + var7] * var9 >> 1756589480;
                        var10++;
                        if (var11 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var11 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_77_0 = (RuntimeException) (var4);
                    stackIn_76_0 = stackIn_77_0;
                    stackIn_77_1 = new StringBuilder().append("w.F(");
                    stackIn_76_1 = stackIn_77_1;
                    if (param0 == null) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    throw fa.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 79: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private w() throws Throwable {
        throw new Error();
    }

    static {
        field_n = "Ready";
    }
}
