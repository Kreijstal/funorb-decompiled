/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ik {
    private n[] field_v;
    static int field_u;
    static boolean field_w;
    private n field_t;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        w stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        n var7 = null;
        n var9 = null;
        kf var10 = null;
        n var11 = null;
        n var12 = null;
        n var13 = null;
        n var14 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof kf)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (w) (param3);
                break L1;
              }
            }
            L2: {
              var10 = (kf) ((Object) stackIn_3_0);
              ca.a(param3.field_t + (param1 + param3.field_j), param3.field_o + param0, param3.field_t + param1, param3.field_v + (param3.field_o + param0), false);
              if (var10 == null) {
                break L2;
              } else {
                param2 = param2 & var10.field_D;
                break L2;
              }
            }
            L3: {
              var7 = this.field_v[0];
              this.field_t.a(param4 + 3389);
              var7.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (var10.field_C) {
                    var11 = this.field_v[1];
                    if (var11 != null) {
                      var11.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var10.field_m) {
                  L5: {
                    var12 = this.field_v[3];
                    if (0 == var10.field_h) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                        if (!Lexicominos.field_L) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var9 = this.field_v[2];
                  if (var9 != null) {
                    var9.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (param3.a(18337)) {
                var13 = this.field_v[5];
                if (var13 == null) {
                  break L6;
                } else {
                  var13.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param2) {
                var14 = this.field_v[4];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param4 == -3284) {
                break L8;
              } else {
                this.field_v = (n[]) null;
                break L8;
              }
            }
            this.field_t.a((lh) (this), param3, param1, param4 ^ 3254, param0);
            pd.a(param4 + -19665);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("lh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param4 + ')');
        }
    }

    public lh() {
        this.field_v = new n[6];
        this.field_t = new n();
        n dupTemp$0 = new n();
        this.field_v[0] = dupTemp$0;
        n var1 = dupTemp$0;
        var1.a(109);
    }

    private final void a(boolean param0, lh param1, int param2) {
        n dupTemp$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        n var5 = null;
        n var6 = null;
        int var7 = 0;
        n stackIn_9_0 = null;
        n stackIn_10_0 = null;
        n stackIn_11_0 = null;
        n stackIn_11_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        super.a(param1, false);
                        if (!param0) {
                            statePc = 14;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-7 >= (var4_int ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = this.field_v[var4_int];
                        if (var7 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 != null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param1.field_v[var4_int] = null;
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = param1.field_v[var4_int];
                        stackIn_10_0 = (n) (var5);
                        stackIn_9_0 = stackIn_10_0;
                        if (var6 != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        dupTemp$2 = new n();
                        param1.field_v[var4_int] = dupTemp$2;
                        stackIn_11_0 = (n) ((Object) stackIn_9_0);
                        stackIn_11_1 = (n) (dupTemp$2);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (n) ((Object) stackIn_10_0);
                        stackIn_11_1 = (n) (var6);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((n) (Object) stackIn_11_0).a(stackIn_11_1, param2 ^ -25688);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_int++;
                        if (var7 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        o.a(this.field_v, 0, param1.field_v, 0, 6);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param2 == 6) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        field_u = 31;
                        return;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var4);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("lh.FA(").append(param0).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(db[] param0, byte param1) {
        RuntimeException runtimeException = null;
        n[] var3 = null;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == -112) {
              var7 = this.field_v;
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
                        if (var5 != null) {
                          var5.field_f = param0;
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
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("lh.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    lh(lh param0, boolean param1) {
        this();
        try {
            param0.a(param1, (lh) (this), 6);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 == -24921) {
          if (wf.field_i >= 20) {
            if (ha.a(126)) {
              if (-1 > (be.field_l ^ -1)) {
                if (ca.d(true)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_w = false;
          if (wf.field_i >= 20) {
            if (ha.a(126)) {
              if (-1 > (be.field_l ^ -1)) {
                if (ca.d(true)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, db param1) {
        RuntimeException runtimeException = null;
        n[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var7 = this.field_v;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 >= var7.length) {
                  break L2;
                } else {
                  L3: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_j = param1;
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
                }
              }
              var3_int = 45 / ((param0 - -58) / 39);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("lh.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final n a(boolean param0, int param1) {
        if (param0) {
            return (n) null;
        }
        n dupTemp$0 = new n();
        this.field_v[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(db[] param0, boolean param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param2;
            if (this.field_v[var4_int] == null) {
                this.field_v[var4_int] = new n();
            }
            if (param1) {
                this.field_v = (n[]) null;
            }
            this.field_v[param2].field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(wf param0, int param1) {
        int var2_int = 0;
        try {
            ki.field_g = param0.b(-1698573656) << 2051500101;
            var2_int = param0.d(true);
            ki.field_g = ki.field_g + (var2_int >> -88380445);
            sg.field_a = 1835008 & var2_int << 606181778;
            sg.field_a = sg.field_a + (param0.b(-1698573656) << 1599213154);
            var2_int = param0.d(true);
            hh.field_I = (63 & var2_int) << 14035983;
            sg.field_a = sg.field_a + (var2_int >> -723920378);
            hh.field_I = hh.field_I + (param0.d(true) << -953531545);
            if (param1 != -95) {
                wf var3 = (wf) null;
                lh.a((wf) null, 6);
            }
            var2_int = param0.d(true);
            hh.field_I = hh.field_I + (var2_int >> 436105121);
            th.field_s = var2_int << 15324528 & 65536;
            th.field_s = th.field_s + param0.b(-1698573656);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_u = 0;
        field_w = false;
    }
}
