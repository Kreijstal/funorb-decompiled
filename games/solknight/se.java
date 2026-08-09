/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ej {
    private mf field_u;
    private mf field_r;
    private mf field_v;
    private rl field_n;
    private boolean field_m;
    private int[] field_w;
    private int field_A;
    private int field_s;
    private boolean field_o;
    static String field_z;
    static String field_x;
    private rl field_y;
    private int field_p;
    private int[] field_t;
    private int field_l;
    private rl field_q;

    final synchronized void a(int param0, int param1, boolean param2, rl param3, int param4, int param5) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_34_0 = 0;
        mf stackIn_43_0 = null;
        mf stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        mf stackIn_51_0 = null;
        mf stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_o) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (-1 <= (this.field_s ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (null != this.field_n) {
                            this.field_r.a((byte) 97);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_n = param3;
                        if (param3 == null) {
                          break L2;
                        } else {
                          this.field_r.a(false, param3, true);
                          this.a((byte) -113, this.field_r, param4, param5);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (null == this.field_q) {
                        break L5;
                      } else {
                        this.field_v.a((byte) 97);
                        break L5;
                      }
                    }
                    this.field_q = param3;
                    if (param3 != null) {
                      this.field_v.a(false, param3, true);
                      this.a((byte) -71, this.field_v, param4, param5);
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
              stackIn_18_0 = this;

              if (!param2) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L6;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
                break L6;
              }
            }
            L7: {
              ((se) (this)).field_o = stackIn_19_1 != 0;
              if (param1 == 0) {
                break L7;
              } else {
                this.field_A = -21;
                break L7;
              }
            }
            if (this.field_n == param3) {
              this.field_s = param0;
              this.a((byte) -106, this.field_r, param4, param5);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (this.field_q == param3) {
                this.field_s = -param0;
                this.a((byte) -84, this.field_v, param4, param5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L8: {
                  L9: {
                    if (null != this.field_n) {
                      break L9;
                    } else {
                      var7_int = 1;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (null == this.field_q) {
                      break L10;
                    } else {
                      L11: {
                        if (-524289 >= (this.field_l ^ -1)) {
                          stackIn_34_0 = 0;
                          break L11;
                        } else {
                          stackIn_34_0 = 1;
                          break L11;
                        }
                      }
                      var7_int = stackIn_34_0;
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var7_int = 0;
                  break L8;
                }
                L12: {
                  L13: {
                    if (var7_int != 0) {
                      break L13;
                    } else {
                      L14: {
                        if (this.field_q == null) {
                          break L14;
                        } else {
                          this.field_v.a((byte) 97);
                          break L14;
                        }
                      }
                      L15: {
                        this.field_q = param3;
                        if (param3 != null) {
                          L16: {
                            stackIn_43_0 = this.field_v;

                            if (param2) {
                              stackIn_44_0 = (mf) ((Object) stackIn_43_0);
                              stackIn_44_1 = 0;
                              break L16;
                            } else {
                              stackIn_44_0 = (mf) ((Object) stackIn_43_0);
                              stackIn_44_1 = 1;
                              break L16;
                            }
                          }
                          ((mf) (Object) stackIn_44_0).a(stackIn_44_1 != 0, param3, true);
                          this.a((byte) -95, this.field_v, param4, param5);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      this.field_s = -param0;
                      if (var8 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L17: {
                    if (null == this.field_n) {
                      break L17;
                    } else {
                      this.field_r.a((byte) 97);
                      break L17;
                    }
                  }
                  L18: {
                    this.field_n = param3;
                    if (param3 == null) {
                      break L18;
                    } else {
                      L19: {
                        stackIn_51_0 = this.field_r;

                        if (param2) {
                          stackIn_52_0 = (mf) ((Object) stackIn_51_0);
                          stackIn_52_1 = 0;
                          break L19;
                        } else {
                          stackIn_52_0 = (mf) ((Object) stackIn_51_0);
                          stackIn_52_1 = 1;
                          break L19;
                        }
                      }
                      ((mf) (Object) stackIn_52_0).a(stackIn_52_1 != 0, param3, true);
                      this.a((byte) -84, this.field_r, param4, param5);
                      break L18;
                    }
                  }
                  this.field_s = param0;
                  break L12;
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var7);

            stackIn_57_1 = new StringBuilder().append("se.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L20;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L20;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param4 + ',' + param5 + ')');
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
              return;
            }
          }
        }
    }

    final synchronized void b(int param0, int param1) {
        if (param0 != -15705) {
            field_z = (String) null;
        }
        this.field_p = param1;
    }

    final synchronized void a(int param0) {
        int var3;
        L0: {
          var3 = SolKnight.field_L ? 1 : 0;
          if ((this.field_l ^ -1) >= -1) {
            if (1048576 > this.field_l) {
              if (null == this.field_q) {
                break L0;
              } else {
                this.field_v.a(param0);
                break L0;
              }
            } else {
              if (1048576 <= this.field_l) {
                break L0;
              } else {
                if (null == this.field_q) {
                  break L0;
                } else {
                  this.field_v.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (1048576 > this.field_l) {
              if (null == this.field_q) {
                break L0;
              } else {
                this.field_v.a(param0);
                break L0;
              }
            } else {
              if (1048576 <= this.field_l) {
                break L0;
              } else {
                if (null == this.field_q) {
                  break L0;
                } else {
                  this.field_v.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (this.field_A <= 0) {
            break L1;
          } else {
            if (null != this.field_y) {
              this.field_u.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_o) {
            break L2;
          } else {
            L3: {
              L4: {
                if (this.field_s <= 0) {
                  break L4;
                } else {
                  if (!this.field_r.d(144)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (-1 >= (this.field_s ^ -1)) {
                break L2;
              } else {
                if (this.field_v.d(144)) {
                  break L2;
                } else {
                  this.field_o = false;
                  this.field_s = -this.field_s;
                  this.field_q = null;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            this.field_o = false;
            this.field_s = -this.field_s;
            this.field_n = null;
            break L2;
          }
        }
        L5: {
          if (this.field_s == 0) {
            break L5;
          } else {
            L6: {
              this.field_l = this.field_l + this.field_s * param0;
              if ((this.field_l ^ -1) <= -1048577) {
                break L6;
              } else {
                if (0 < this.field_l) {
                  break L5;
                } else {
                  this.field_l = 0;
                  if (!this.field_o) {
                    this.field_s = 0;
                    if (!this.field_m) {
                      L7: {
                        if (null != this.field_n) {
                          this.field_r.a((byte) 97);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.field_n = null;
                      if (var3 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_l = 1048576;
            if (this.field_o) {
              break L5;
            } else {
              this.field_s = 0;
              if (this.field_m) {
                break L5;
              } else {
                L8: {
                  if (null == this.field_q) {
                    break L8;
                  } else {
                    this.field_v.a((byte) 97);
                    break L8;
                  }
                }
                this.field_q = null;
                break L5;
              }
            }
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
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
                    var11 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 <= (this.field_p ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.a(param2);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (!this.field_o) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.field_s <= 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (this.field_r.d(144)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_n = null;
                        this.field_s = -this.field_s;
                        this.field_o = false;
                        if (var11 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((this.field_s ^ -1) <= -1) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (this.field_v.d(144)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_q = null;
                        this.field_o = false;
                        this.field_s = -this.field_s;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = (this.field_l >> 263738636) * this.field_p / 256;
                        var5 = this.field_p + -var4_int;
                        if (this.field_s != 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_l = this.field_l + param2 * this.field_s;
                        if ((this.field_l ^ -1) <= -1048577) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 >= this.field_l) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_l = 0;
                        if (this.field_o) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_s = 0;
                        if (this.field_m) {
                            statePc = 30;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_n != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_r.a((byte) 97);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_n = null;
                        if (var11 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_l = 1048576;
                        if (this.field_o) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_s = 0;
                        if (this.field_m) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (this.field_q != null) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_v.a((byte) 97);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_q = null;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!gj.field_u) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = param2 << -76864383;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = param2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = stackIn_33_0;
                        if (this.field_A >= 256) {
                            statePc = 57;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null != this.field_n) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (this.field_q == null) {
                            statePc = 57;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (-257 == (var4_int ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var5 != 256) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_v.a(param0, param1, param2);
                        if (var11 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (this.field_w == null) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (this.field_w.length >= var6) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.field_w = new int[var6];
                        this.field_t = new int[var6];
                        if (var11 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        fk.a(this.field_w, 0, var6);
                        fk.a(this.field_t, 0, var6);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_r.a(this.field_w, 0, param2);
                        this.field_v.a(this.field_t, 0, param2);
                        if (gj.field_u) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_50_0 = param1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param1 = param1 << 1;
                        stackIn_50_0 = param1 << 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var7 = stackIn_50_0;
                        var8 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var6 <= var8) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param0[var7 + var8] = param0[var7 + var8] + (this.field_t[var8] * var5 + this.field_w[var8] * var4_int >> -450835704);
                        var8++;
                        if (var11 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var11 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var11 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.field_r.a(param0, param1, param2);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (this.field_y == null) {
                            statePc = 78;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (0 == this.field_A) {
                            statePc = 78;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (null == this.field_w) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (this.field_w.length >= var6) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_w = new int[var6];
                        this.field_t = new int[var6];
                        if (var11 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        fk.a(this.field_w, 0, var6);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.field_u.a(this.field_w, 0, param2);
                        if (!gj.field_u) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param1 = param1 << 1;
                        stackIn_68_0 = param1 << 1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = param1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var7 = stackIn_68_0;
                        var8 = this.field_A * this.field_p / 256;
                        var9 = this.field_p + -var8;
                        var10 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var6 <= var10) {
                            statePc = 78;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        param0[var7 - -var10] = param0[var10 + var7] * var9 + this.field_w[var10] * var8 >> 15817128;
                        var10++;
                        if (var11 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var11 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_76_0 = (RuntimeException) (var4);
                    stackIn_75_0 = stackIn_76_0;
                    stackIn_76_1 = new StringBuilder().append("se.AA(");
                    stackIn_75_1 = stackIn_76_1;
                    if (param0 == null) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    throw fc.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 78: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, mf param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.b(param3, -1, -129);
              param1.b(param2, (byte) -110);
              if (param0 <= -61) {
                break L1;
              } else {
                this.b();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("se.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ej b() {
        return null;
    }

    final ej a() {
        return null;
    }

    public static void b(boolean param0) {
        field_x = null;
        field_z = null;
        if (param0) {
            field_x = (String) null;
        }
    }

    private se() throws Throwable {
        throw new Error();
    }

    final synchronized int d() {
        return 2;
    }

    static {
        field_z = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_x = "Invalid password.";
    }
}
