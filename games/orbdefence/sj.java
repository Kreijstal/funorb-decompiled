/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends jc {
    static int field_x;
    static String[] field_u;
    private sa field_w;
    private sa[] field_v;

    final static String b(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (String) null;
                }
                case 2: {
                    var6 = "(" + lh.field_c + " " + fe.field_b + " " + ce.field_d + ") " + ab.field_l;
                    var1 = var6;
                    if (0 >= tf.field_c) {
                        statePc = 17;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = var6 + ":";
                    var2 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (tf.field_c <= var2) {
                        statePc = 15;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_16_0 = var1 + ' ';
                    stackIn_6_0 = stackIn_16_0;
                    if (var5 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var7 = stackIn_6_0;
                    var3 = 255 & cd.field_t.field_j[var2];
                    var4 = var3 >> -506037628;
                    if ((var4 ^ -1) > -11) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 += 55;
                    if (var5 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 += 48;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var3 = var3 & 15;
                    var8 = var7 + (char)var4;
                    if (-11 >= (var3 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var3 += 48;
                    if (var5 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var3 += 55;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var1 = var8 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (String) (var1);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public sj() {
        this.field_v = new sa[6];
        this.field_w = new sa();
        sa dupTemp$0 = new sa();
        this.field_v[0] = dupTemp$0;
        sa var1 = dupTemp$0;
        var1.b((byte) -31);
    }

    final void a(int param0, hj param1) {
        RuntimeException runtimeException = null;
        sa[] var3 = null;
        int var4 = 0;
        sa var5 = null;
        int var6 = 0;
        sj var7 = null;
        sa[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var7 = (sj) null;
                this.a(true, -7, (sj) null);
                break L1;
              }
            }
            var8 = this.field_v;
            var3 = var8;
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var8.length <= var4) {
                  break L3;
                } else {
                  var5 = var8[var4];
                  if (var6 == 0) {
                    L4: {
                      if (var5 != null) {
                        var5.field_e = param1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L3;
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
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("sj.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final void a(boolean param0, int param1, sj param2) {
        sa dupTemp$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        sa var5 = null;
        sa var6 = null;
        int var7 = 0;
        sa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        sa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        sa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        sa stackIn_11_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        super.a((byte) 81, param2);
                        if (param1 == -19056) {
                            statePc = 3;
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
                    return;
                }
                case 3: {
                    try {
                        if (!param0) {
                            statePc = 15;
                        } else {
                            statePc = 4;
                        }
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
                        var5 = this.field_v[var4_int];
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
                        var6 = param2.field_v[var4_int];
                        stackIn_10_0 = (sa) (var5);
                        stackIn_9_0 = stackIn_10_0;
                        stackIn_10_1 = -110;
                        stackIn_9_1 = stackIn_10_1;
                        if (var6 != null) {
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
                        dupTemp$2 = new sa();
                        param2.field_v[var4_int] = dupTemp$2;
                        stackIn_11_0 = (sa) ((Object) stackIn_9_0);
                        stackIn_11_1 = stackIn_9_1;
                        stackIn_11_2 = (sa) (dupTemp$2);
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
                        stackIn_11_0 = (sa) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = (sa) (var6);
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
                        ((sa) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2);
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
                        param2.field_v[var4_int] = null;
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
                        if (var7 == 0) {
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
                        mk.a(this.field_v, 0, param2.field_v, 0, 6);
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
                    stackIn_19_1 = new StringBuilder().append("sj.GA(").append(param0).append(',').append(param1).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param2 == null) {
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
                    throw dd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static sh a(boolean param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        sh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param0) {
                break L1;
              } else {
                var7 = (String) null;
                sj.a(true, (String) null, false, (String) null);
                break L1;
              }
            }
            L2: {
              var6 = null;
              if (param1.indexOf('@') == -1) {
                var8 = (CharSequence) ((Object) param1);
                var4_long = bk.a(125, var8);
                break L2;
              } else {
                var6 = param1;
                break L2;
              }
            }
            stackIn_6_0 = f.a(param2, var4_long, (String) (var6), 17470, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("sj.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, hj[] param1, int param2) {
        int var4_int = 0;
        if (param2 <= 85) {
            return;
        }
        try {
            var4_int = param0;
            if (null == this.field_v[var4_int]) {
                this.field_v[var4_int] = new sa();
            }
            this.field_v[param0].field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "sj.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    sj(sj param0, boolean param1) {
        this();
        try {
            param0.a(param1, -19056, (sj) (this));
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, hj[] param1) {
        RuntimeException runtimeException = null;
        sa[] var3 = null;
        int var4 = 0;
        sa var5 = null;
        int var6 = 0;
        sa[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 >= 34) {
              var7 = this.field_v;
              var3 = var7;
              var4 = 0;
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
                          var5.field_b = param1;
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

            stackIn_13_1 = new StringBuilder().append("sj.FA(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final sa a(int param0, boolean param1) {
        if (!param1) {
            return (sa) null;
        }
        sa dupTemp$0 = new sa();
        this.field_v[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public static void b(byte param0) {
        field_u = null;
        int var1 = 8 % ((-5 - param0) / 61);
    }

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        pj stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        sa var7 = null;
        sa var9 = null;
        String var10 = null;
        s var11 = null;
        sa var12 = null;
        sa var13 = null;
        sa var14 = null;
        sa var15 = null;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof s)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (pj) (param2);
                break L1;
              }
            }
            L2: {
              var11 = (s) ((Object) stackIn_3_0);
              id.a(param2.field_s + (param1 + param2.field_m), param2.field_s + param1, param2.field_r + param0 + param2.field_n, param0 - -param2.field_n, param3 ^ -5112);
              if (var11 == null) {
                break L2;
              } else {
                param4 = param4 & var11.field_F;
                break L2;
              }
            }
            L3: {
              var7 = this.field_v[0];
              this.field_w.b((byte) -31);
              var7.a(false, param0, param1, this.field_w, (sj) (this), param2);
              if (param3 == -4394) {
                break L3;
              } else {
                var10 = (String) null;
                sj.a(true, (String) null, false, (String) null);
                break L3;
              }
            }
            L4: {
              if (var11 != null) {
                L5: {
                  if (!var11.field_D) {
                    break L5;
                  } else {
                    var12 = this.field_v[1];
                    if (var12 == null) {
                      break L5;
                    } else {
                      var12.a(false, param0, param1, this.field_w, (sj) (this), param2);
                      break L5;
                    }
                  }
                }
                if (!var11.field_t) {
                  break L4;
                } else {
                  L6: {
                    L7: {
                      var13 = this.field_v[3];
                      if (-1 == (var11.field_v ^ -1)) {
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
                      var9 = this.field_v[2];
                      if (var9 != null) {
                        var9.a(false, param0, param1, this.field_w, (sj) (this), param2);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (!OrbDefence.field_D) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  var13.a(false, param0, param1, this.field_w, (sj) (this), param2);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L9: {
              if (param2.d(param3 ^ 4473)) {
                var14 = this.field_v[5];
                if (var14 == null) {
                  break L9;
                } else {
                  var14.a(false, param0, param1, this.field_w, (sj) (this), param2);
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (param4) {
                break L10;
              } else {
                var15 = this.field_v[4];
                if (var15 != null) {
                  var15.a(false, param0, param1, this.field_w, (sj) (this), param2);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            this.field_w.a((sj) (this), param0, param1, param2, param3 + 28577);
            oc.g((byte) -105);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
