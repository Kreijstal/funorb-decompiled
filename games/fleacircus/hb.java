/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends e {
    private te[] field_s;
    static int field_t;
    static String field_q;
    private te field_r;

    private final void a(boolean param0, hb param1, byte param2) {
        te dupTemp$2 = null;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        te var5 = null;
        te var6 = null;
        int var7 = 0;
        te stackIn_12_0 = null;
        te stackIn_13_0 = null;
        te stackIn_14_0 = null;
        te stackIn_14_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        super.a(2, param1);
                        if (param2 == 70) {
                            statePc = 3;
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
                    return;
                }
                case 3: {
                    try {
                        if (param0) {
                            statePc = 6;
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
                        dm.a(this.field_s, 0, param1.field_s, 0, 6);
                        if (var7 == 0) {
                            statePc = 22;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (6 <= var4_int) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = this.field_s[var4_int];
                        if (var7 == 0) {
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
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 == null) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = param1.field_s[var4_int];
                        stackIn_13_0 = (te) (var5);
                        stackIn_12_0 = stackIn_13_0;
                        if (var6 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_14_0 = (te) ((Object) stackIn_12_0);
                        stackIn_14_1 = (te) (var6);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        dupTemp$2 = new te();
                        param1.field_s[var4_int] = dupTemp$2;
                        stackIn_14_0 = (te) ((Object) stackIn_13_0);
                        stackIn_14_1 = (te) (dupTemp$2);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((te) (Object) stackIn_14_0).a(stackIn_14_1, 33);
                        if (var7 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param1.field_s[var4_int] = null;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4_int++;
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (runtimeException);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("hb.O(").append(param0).append(',');
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
                    throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        qa stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        te var7 = null;
        te var9 = null;
        bb var10 = null;
        te var11 = null;
        te var12 = null;
        te var13 = null;
        te var14 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof bb) {
                stackIn_3_0 = (qa) (param3);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var10 = (bb) ((Object) stackIn_3_0);
              mi.a((byte) -52, param1 + (param3.field_y - -param3.field_u), param3.field_y + param1, param4 + (param3.field_z + param3.field_j), param4 + param3.field_z);
              if (var10 != null) {
                param2 = param2 & var10.field_D;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 <= -36) {
                break L3;
              } else {
                this.a(3, 55);
                break L3;
              }
            }
            L4: {
              var7 = this.field_s[0];
              this.field_r.a(0);
              var7.a(this.field_r, param4, param3, (hb) (this), param1, -2);
              if (var10 == null) {
                break L4;
              } else {
                L5: {
                  if (var10.field_G) {
                    var11 = this.field_s[1];
                    if (var11 == null) {
                      break L5;
                    } else {
                      var11.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (var10.field_x) {
                  L6: {
                    L7: {
                      var12 = this.field_s[3];
                      if (0 == var10.field_v) {
                        break L7;
                      } else {
                        if (var12 != null) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var9 = this.field_s[2];
                      if (var9 != null) {
                        var9.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (!fleas.field_A) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  var12.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L9: {
              if (param3.e(1)) {
                var13 = this.field_s[5];
                if (var13 == null) {
                  break L9;
                } else {
                  var13.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (param2) {
                break L10;
              } else {
                var14 = this.field_s[4];
                if (var14 == null) {
                  break L10;
                } else {
                  var14.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                  break L10;
                }
              }
            }
            this.field_r.a((hb) (this), param3, 0, param4, param1);
            ia.a(-85);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("hb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param4 + ')');
        }
    }

    final void a(dd[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param1 > -27) {
                field_t = -122;
            }
            var4_int = param2;
            if (this.field_s[var4_int] == null) {
                this.field_s[var4_int] = new te();
            }
            this.field_s[param2].field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "hb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public hb() {
        this.field_s = new te[6];
        this.field_r = new te();
        te dupTemp$0 = new te();
        this.field_s[0] = dupTemp$0;
        te var1 = dupTemp$0;
        var1.a(0);
    }

    final te a(int param0, int param1) {
        if (param1 != -17562) {
            return (te) null;
        }
        te dupTemp$0 = new te();
        this.field_s[param0] = dupTemp$0;
        return dupTemp$0;
    }

    hb(hb param0, boolean param1) {
        this();
        try {
            param0.a(param1, (hb) (this), (byte) 70);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(dd param0, int param1) {
        RuntimeException runtimeException = null;
        te[] var3 = null;
        int var4 = 0;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              L2: {
                if (var4 >= var7.length) {
                  break L2;
                } else {
                  var5 = var7[var4];
                  if (var6 == 0) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        var5.field_c = param0;
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("hb.P(");

            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_q = null;
        int var1 = -65 / ((param0 - -36) / 56);
    }

    final void a(byte param0, dd[] param1) {
        te[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= var7.length) {
                    break L3;
                  } else {
                    var5 = var7[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5 != null) {
                          var5.field_g = param1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 61) {
                  break L2;
                } else {
                  this.a(77, -61);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("hb.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_q = "From only <%0>/month";
    }
}
