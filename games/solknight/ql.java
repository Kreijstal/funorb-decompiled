/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends af {
    static String[] field_s;
    private bf field_w;
    static int[] field_q;
    static o field_p;
    private bf[] field_t;
    static gj field_r;
    static String field_u;
    static int field_v;

    final void a(byte param0, o param1) {
        RuntimeException runtimeException = null;
        bf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = 12 / ((param0 - 14) / 55);
            var8 = this.field_t;
            var3 = var8;
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var8.length <= var5) {
                  break L2;
                } else {
                  var6 = var8[var5];
                  if (var7 == 0) {
                    L3: {
                      if (var6 == null) {
                        break L3;
                      } else {
                        var6.field_k = param1;
                        break L3;
                      }
                    }
                    var5++;
                    if (var7 == 0) {
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

            stackIn_11_1 = new StringBuilder().append("ql.CA(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        rc stackIn_5_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        bf var7 = null;
        bf var9 = null;
        pj var10 = null;
        bf var11 = null;
        bf var12 = null;
        bf var13 = null;
        bf var14 = null;
        try {
          L0: {
            if (param0 >= 113) {
              L1: {
                if (param4 instanceof pj) {
                  stackIn_5_0 = (rc) (param4);
                  break L1;
                } else {
                  stackIn_5_0 = null;
                  break L1;
                }
              }
              L2: {
                var10 = (pj) ((Object) stackIn_5_0);
                kf.a((byte) 97, param3 + param4.field_m, param1 - -param4.field_j, param3 - -param4.field_m - -param4.field_t, param4.field_x + (param4.field_j + param1));
                if (var10 == null) {
                  break L2;
                } else {
                  param2 = param2 & var10.field_B;
                  break L2;
                }
              }
              L3: {
                var7 = this.field_t[0];
                this.field_w.a(36);
                var7.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                if (var10 == null) {
                  break L3;
                } else {
                  L4: {
                    if (!var10.field_F) {
                      break L4;
                    } else {
                      var11 = this.field_t[1];
                      if (var11 == null) {
                        break L4;
                      } else {
                        var11.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                        break L4;
                      }
                    }
                  }
                  if (var10.field_v) {
                    L5: {
                      var12 = this.field_t[3];
                      if (var10.field_u == 0) {
                        break L5;
                      } else {
                        if (var12 == null) {
                          break L5;
                        } else {
                          var12.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                          if (!SolKnight.field_L) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var9 = this.field_t[2];
                    if (var9 == null) {
                      break L3;
                    } else {
                      var9.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (param4.b(true)) {
                  var13 = this.field_t[5];
                  if (var13 != null) {
                    var13.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (!param2) {
                  var14 = this.field_t[4];
                  if (var14 != null) {
                    var14.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              this.field_w.a(108, param1, param3, (ql) (this), param4);
              mf.e(4096);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("ql.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final bf a(byte param0, int param1) {
        if (param0 > -37) {
            return (bf) null;
        }
        bf dupTemp$0 = new bf();
        this.field_t[param1] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(ql param0, boolean param1, int param2) {
        bf dupTemp$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        bf var5 = null;
        bf var6 = null;
        int var7 = 0;
        o[] var8 = null;
        bf stackIn_9_0 = null;
        bf stackIn_10_0 = null;
        bf stackIn_11_0 = null;
        bf stackIn_11_1 = null;
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
                    var7 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        super.a(param0, 6935);
                        if (param1) {
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
                        fk.a(this.field_t, 0, param0.field_t, 0, 6);
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
                        if ((var4_int ^ -1) <= -7) {
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
                        var5 = this.field_t[var4_int];
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
                        var6 = param0.field_t[var4_int];
                        stackIn_10_0 = (bf) (var5);
                        stackIn_9_0 = stackIn_10_0;
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
                        stackIn_11_0 = (bf) ((Object) stackIn_9_0);
                        stackIn_11_1 = (bf) (var6);
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
                        dupTemp$2 = new bf();
                        param0.field_t[var4_int] = dupTemp$2;
                        stackIn_11_0 = (bf) ((Object) stackIn_10_0);
                        stackIn_11_1 = (bf) (dupTemp$2);
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
                        ((bf) (Object) stackIn_11_0).a(stackIn_11_1, 2);
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
                        param0.field_t[var4_int] = null;
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
                        if (param2 == 30089) {
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
                        var8 = (o[]) null;
                        this.a((byte) 62, (o[]) null);
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
                    stackIn_19_1 = new StringBuilder().append("ql.W(");
                    stackIn_18_1 = stackIn_19_1;
                    if (param0 == null) {
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
                    throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, o[] param1) {
        RuntimeException runtimeException = null;
        bf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var8 = this.field_t;
            var3 = var8;
            var4 = -51 % ((param0 - -26) / 48);
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var8.length <= var5) {
                  break L2;
                } else {
                  var6 = var8[var5];
                  if (var7 == 0) {
                    L3: {
                      if (var6 == null) {
                        break L3;
                      } else {
                        var6.field_j = param1;
                        break L3;
                      }
                    }
                    var5++;
                    if (var7 == 0) {
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

            stackIn_11_1 = new StringBuilder().append("ql.BA(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        if (param0 != 1) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    public ql() {
        this.field_t = new bf[6];
        this.field_w = new bf();
        bf dupTemp$0 = new bf();
        this.field_t[0] = dupTemp$0;
        bf var1 = dupTemp$0;
        var1.a(36);
    }

    final static void d(int param0) {
        L0: {
          u.field_b.j(1);
          if (pc.field_b == null) {
            pc.field_b = new lb(u.field_b, v.field_a);
            break L0;
          } else {
            break L0;
          }
        }
        u.field_b.b(pc.field_b, -120);
        if (param0 != 18962) {
          field_p = (o) null;
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, o[] param2) {
        int var4_int = 0;
        if (param0 != -60) {
            return;
        }
        try {
            var4_int = param1;
            if (!(null != this.field_t[var4_int])) {
                this.field_t[var4_int] = new bf();
            }
            this.field_t[param1].field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ql.DA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ql(ql param0, boolean param1) {
        this();
        try {
            param0.a((ql) (this), param1, 30089);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_s = new String[]{"Exciting new weapons", "Fullscreen mode", "No adverts"};
        field_q = new int[4];
        field_u = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_v = -1;
    }
}
