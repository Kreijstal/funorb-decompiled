/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends a {
    static int field_r;
    static le[] field_t;
    static int field_v;
    static int[] field_u;
    private hc[] field_s;
    private hc field_q;

    public ak() {
        this.field_s = new hc[6];
        this.field_q = new hc();
        hc dupTemp$0 = new hc();
        this.field_s[0] = dupTemp$0;
        hc var1 = dupTemp$0;
        var1.a(0);
    }

    ak(ak param0, boolean param1) {
        this();
        try {
            param0.a(124, (ak) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(le[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param1 != 4986) {
                this.field_q = (hc) null;
            }
            var4_int = param2;
            if (this.field_s[var4_int] == null) {
                this.field_s[var4_int] = new hc();
            }
            this.field_s[param2].field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ak.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(le[] param0, int param1) {
        RuntimeException runtimeException = null;
        hc[] var3 = null;
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 250) {
              var7 = this.field_s;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var7.length <= var4) {
                    break L2;
                  } else {
                    var5 = var7[var4];
                    if (var6 == 0) {
                      L3: {
                        if (var5 == null) {
                          break L3;
                        } else {
                          var5.field_e = param0;
                          break L3;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("ak.CA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, ak param1, boolean param2) {
        hc dupTemp$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        hc var5 = null;
        hc var6 = null;
        int var7 = 0;
        hc stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        hc stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        hc stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        hc stackIn_11_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        super.a(false, param1);
                        if (param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gl.a(this.field_s, 0, param1.field_s, 0, 6);
                        if (var7 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (6 <= var4_int) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = this.field_s[var4_int];
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 == null) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = param1.field_s[var4_int];
                        stackIn_10_0 = (hc) (var5);
                        stackIn_9_0 = stackIn_10_0;
                        stackIn_10_1 = 124;
                        stackIn_9_1 = stackIn_10_1;
                        if (var6 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_11_0 = (hc) ((Object) stackIn_9_0);
                        stackIn_11_1 = stackIn_9_1;
                        stackIn_11_2 = (hc) (var6);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        dupTemp$2 = new hc();
                        param1.field_s[var4_int] = dupTemp$2;
                        stackIn_11_0 = (hc) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = (hc) (dupTemp$2);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((hc) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                        if (var7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param1.field_s[var4_int] = null;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 >= 100) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ak.a((byte) -47);
                        return;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var4);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("ak.BA(").append(param0).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param1 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 <= (param1 ^ -1)) {
                  break L2;
                } else {
                  if (128 > param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (255 >= param1) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (param1 == 0) {
                    break L5;
                  } else {
                    var6 = sb.field_n;
                    var2 = var6;
                    var3 = 0;
                    L6: while (true) {
                      if (var6.length <= var3) {
                        break L5;
                      } else {
                        var4 = var6[var3];
                        stackIn_18_0 = var4 ^ -1;

                        if (var5 != 0) {
                          break L4;
                        } else {
                          if (stackIn_18_0 != (param1 ^ -1)) {
                            var3++;
                            if (var5 == 0) {
                              continue L6;
                            } else {
                              break L5;
                            }
                          } else {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_18_0 = 0;
                break L4;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
            stackIn_8_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "ak.DA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
            ak.a((byte) -46);
            field_u = null;
            field_t = null;
            return;
        }
        field_u = null;
        field_t = null;
    }

    final void a(byte param0, le param1) {
        RuntimeException runtimeException = null;
        hc[] var3 = null;
        int var4 = 0;
        hc var5 = null;
        int var6 = 0;
        hc[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            if (param0 == 1) {
              L1: while (true) {
                L2: {
                  if (var4 >= var7.length) {
                    break L2;
                  } else {
                    var5 = var7[var4];
                    if (var6 == 0) {
                      L3: {
                        if (var5 != null) {
                          var5.field_a = param1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("ak.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        if (uj.field_i != -ea.field_b + 0) {
          if (uj.field_i == -ea.field_b + 250) {
            if (param0 != 99) {
              return;
            } else {
              uj.field_i = uj.field_i + 1;
              return;
            }
          } else {
            if (param0 != 99) {
              return;
            } else {
              uj.field_i = uj.field_i + 1;
              return;
            }
          }
        } else {
          if (param0 != 99) {
            return;
          } else {
            uj.field_i = uj.field_i + 1;
            return;
          }
        }
    }

    final hc a(byte param0, int param1) {
        hc dupTemp$2 = null;
        hc dupTemp$3 = null;
        if (param0 != -102) {
          field_t = (le[]) null;
          dupTemp$2 = new hc();
          this.field_s[param1] = dupTemp$2;
          return dupTemp$2;
        } else {
          dupTemp$3 = new hc();
          this.field_s[param1] = dupTemp$3;
          return dupTemp$3;
        }
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        we stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        hc var7 = null;
        hc var9 = null;
        ak var10 = null;
        t var11 = null;
        hc var12 = null;
        hc var13 = null;
        hc var14 = null;
        hc var15 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof t) {
                stackIn_3_0 = (we) (param1);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var11 = (t) ((Object) stackIn_3_0);
              qi.a(param1.field_r + param3 + param1.field_l, true, param1.field_p + param1.field_e + param2, param1.field_r + param3, param2 + param1.field_e);
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_w;
                break L2;
              }
            }
            L3: {
              if (param4 >= 19) {
                break L3;
              } else {
                var10 = (ak) null;
                this.a(123, (ak) null, false);
                break L3;
              }
            }
            L4: {
              var7 = this.field_s[0];
              this.field_q.a(0);
              var7.a(param3, (ak) (this), param2, 84, param1, this.field_q);
              if (var11 == null) {
                break L4;
              } else {
                L5: {
                  if (var11.field_u) {
                    var12 = this.field_s[1];
                    if (var12 == null) {
                      break L5;
                    } else {
                      var12.a(param3, (ak) (this), param2, 112, param1, this.field_q);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (var11.field_g) {
                  L6: {
                    L7: {
                      var13 = this.field_s[3];
                      if (var11.field_t == 0) {
                        break L7;
                      } else {
                        if (var13 != null) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var9 = this.field_s[2];
                      if (var9 != null) {
                        var9.a(param3, (ak) (this), param2, 115, param1, this.field_q);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (!MonkeyPuzzle2.field_F) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  var13.a(param3, (ak) (this), param2, 100, param1, this.field_q);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L9: {
              if (!param1.b((byte) 56)) {
                break L9;
              } else {
                var14 = this.field_s[5];
                if (var14 != null) {
                  var14.a(param3, (ak) (this), param2, 114, param1, this.field_q);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (param0) {
                break L10;
              } else {
                var15 = this.field_s[4];
                if (var15 != null) {
                  var15.a(param3, (ak) (this), param2, 120, param1, this.field_q);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            this.field_q.a((ak) (this), param1, (byte) -2, param2, param3);
            tj.b(653);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("ak.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_r = 0;
        field_v = 2;
    }
}
