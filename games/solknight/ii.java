/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterable {
    static String field_a;
    static String field_c;
    static o[] field_g;
    private gg field_d;
    gg[] field_b;
    static o[] field_f;
    static int field_h;
    int field_e;
    static String field_i;

    public static void a(int param0) {
        if (param0 != 7903) {
            return;
        }
        field_f = null;
        field_g = null;
        field_i = null;
        field_c = null;
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new n((ii) (this)));
    }

    final gg a(long param0, int param1) {
        gg var4;
        gg var5;
        int var6;
        Object stackIn_5_0 = null;
        Object stackIn_15_0 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        var4 = this.field_b[(int)((long)(this.field_e + -1) & param0)];
        this.field_d = var4.field_d;
        if (param1 >= -83) {
          ii.a(-1);
          L0: while (true) {
            if (var4 != this.field_d) {
              stackIn_15_0 = this;

              if (var6 == 0) {
                if ((((ii) (this)).field_d.field_g ^ -1L) == (param0 ^ -1L)) {
                  var5 = this.field_d;
                  this.field_d = this.field_d.field_d;
                  return var5;
                } else {
                  this.field_d = this.field_d.field_d;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.field_d = null;
                    return null;
                  }
                }
              } else {
                ((ii) (this)).field_d = null;
                return null;
              }
            } else {
              this.field_d = null;
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var4 != this.field_d) {
              stackIn_5_0 = this;

              if (var6 == 0) {
                if ((((ii) (this)).field_d.field_g ^ -1L) == (param0 ^ -1L)) {
                  var5 = this.field_d;
                  this.field_d = this.field_d.field_d;
                  return var5;
                } else {
                  this.field_d = this.field_d.field_d;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    this.field_d = null;
                    return null;
                  }
                }
              } else {
                ((ii) (this)).field_d = null;
                return null;
              }
            } else {
              this.field_d = null;
              return null;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param1 <= 125) {
          field_f = (o[]) null;
          param0 = (param0 & 1431655765) + ((-1431655766 & param0) >>> 628365249);
          param0 = (858993459 & param0) + ((-858993458 & param0) >>> 958966498);
          param0 = 252645135 & (param0 >>> -1843594364) + param0;
          param0 = param0 + (param0 >>> -944494904);
          param0 = param0 + (param0 >>> -2034665808);
          return 255 & param0;
        } else {
          param0 = (param0 & 1431655765) + ((-1431655766 & param0) >>> 628365249);
          param0 = (858993459 & param0) + ((-858993458 & param0) >>> 958966498);
          param0 = 252645135 & (param0 >>> -1843594364) + param0;
          param0 = param0 + (param0 >>> -944494904);
          param0 = param0 + (param0 >>> -2034665808);
          return 255 & param0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 < mi.field_b) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param4 = param4 - (mi.field_b + -param1);
                        param1 = mi.field_b;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (mi.field_k < param4 + param1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param4 = mi.field_k + -param1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (mi.field_l > param2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param0 = param0 - (-param2 + mi.field_l);
                        param2 = mi.field_l;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (mi.field_e >= param2 + param0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param0 = -param2 + mi.field_e;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((param4 ^ -1) >= -1) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 <= (param0 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        if (param5) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        var6_int = param1 - -(param2 * mi.field_a);
                        var7 = -param4 + mi.field_a;
                        param2 = -param0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((param2 ^ -1) <= -1) {
                            statePc = 36;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        return;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param1 = -param4;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param1 >= 0) {
                            statePc = 32;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8 = mi.field_f[var6_int];
                        stackIn_33_0 = param3 ^ -1;
                        stackIn_25_0 = stackIn_33_0;
                        stackIn_33_1 = 255 & var8 >> -1285462040 ^ -1;
                        stackIn_25_1 = stackIn_33_1;
                        if (var12 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 <= stackIn_25_1) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((16711680 & var8) >> -1806599120 > (255 & var8 >> -246100408)) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = ((16711680 & var8) >> -1993520561) - 60;
                        if (255 < var9) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = 255;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = var8 & 65280;
                        var10 = 65280 & (var10 >> -1582855103) - (var10 >> 632857093);
                        var11 = var8 >> 1169275331 & 31;
                        mi.field_f[var6_int] = qk.a(var11, qk.a(var10, var9 << 432109712));
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6_int++;
                        param1++;
                        if (var12 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = var6_int;
                        stackIn_33_1 = var7;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6_int = stackIn_33_0 + stackIn_33_1;
                        param2++;
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var6), "ii.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    final void a(int param0, long param1, gg param2) {
        gg var5 = null;
        try {
            if (null != param2.field_a) {
                param2.c(10);
            }
            var5 = this.field_b[(int)(param1 & (long)(-1 + this.field_e))];
            param2.field_d = var5;
            param2.field_a = var5.field_a;
            param2.field_a.field_d = param2;
            param2.field_g = param1;
            if (param0 != -858993458) {
                field_g = (o[]) null;
            }
            param2.field_d.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ii.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(boolean param0, int param1, dl param2, int param3, int param4, int param5) {
        java.awt.Frame stackIn_3_0 = null;
        int stackIn_26_0 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        uj[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        uj[] var10 = null;
        nj var11 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0) {
              if (param2.b((byte) 98)) {
                L1: {
                  if (param4 != 0) {
                    break L1;
                  } else {
                    var10 = dc.a((byte) 124, param2);
                    var6 = var10;
                    if (var6 != null) {
                      var7_int = 0;
                      var8 = 0;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (var8 >= var10.length) {
                              break L4;
                            } else {
                              stackIn_26_0 = param5;

                              if (var9 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (stackIn_26_0 != var10[var8].field_c) {
                                    break L5;
                                  } else {
                                    if (param3 == var10[var8].field_d) {
                                      L6: {
                                        if (param1 == 0) {
                                          break L6;
                                        } else {
                                          if (param1 != var10[var8].field_a) {
                                            break L5;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      L7: {
                                        if (var7_int == 0) {
                                          break L7;
                                        } else {
                                          if (var10[var8].field_e <= param4) {
                                            break L5;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      param4 = var10[var8].field_e;
                                      var7_int = 1;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var8++;
                                if (var9 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackIn_26_0 = var7_int;
                          break L3;
                        }
                        if (stackIn_26_0 != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      return null;
                    }
                  }
                }
                var11 = param2.a(param5, param3, param4, (byte) -106, param1);
                L8: while (true) {
                  L9: {
                    if (0 != var11.field_c) {
                      break L9;
                    } else {
                      i.a((byte) 89, 10L);
                      if (var9 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var7 = (java.awt.Frame) (var11.field_e);
                  if (var7 != null) {
                    if (var11.field_c == 2) {
                      de.a(param2, var7, (byte) 119);
                      stackIn_38_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackIn_34_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                return null;
              }
            } else {
              stackIn_3_0 = (java.awt.Frame) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var6_ref);

            stackIn_41_1 = new StringBuilder().append("ii.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L10;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_34_0);
          } else {
            return (java.awt.Frame) ((Object) stackIn_38_0);
          }
        }
    }

    static {
        field_a = "Mega Power";
        field_c = "This entry doesn't match";
        field_i = "Aiming: Mouse";
    }
}
