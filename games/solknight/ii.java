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
        gg var4 = null;
        gg var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_3_0 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        var4 = this.field_b[(int)((long)(this.field_e + -1) & param0)];
        this.field_d = var4.field_d;
        if (param1 >= -83) {
          ii.a(-1);
          L0: while (true) {
            if (var4 != this.field_d) {
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (var6 == 0) {
                if ((((ii) (this)).field_d.field_g ^ -1L) == (param0 ^ -1L)) {
                  var5 = this.field_d;
                  this.field_d = this.field_d.field_d;
                  return var5;
                } else {
                  this.field_d = this.field_d.field_d;
                  continue L0;
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
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var6 == 0) {
                if ((((ii) (this)).field_d.field_g ^ -1L) == (param0 ^ -1L)) {
                  var5 = this.field_d;
                  this.field_d = this.field_d.field_d;
                  return var5;
                } else {
                  this.field_d = this.field_d.field_d;
                  continue L1;
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < mi.field_b) {
                param4 = param4 - (mi.field_b + -param1);
                param1 = mi.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (mi.field_k < param4 + param1) {
                param4 = mi.field_k + -param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (mi.field_l > param2) {
                param0 = param0 - (-param2 + mi.field_l);
                param2 = mi.field_l;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (mi.field_e >= param2 + param0) {
                break L4;
              } else {
                param0 = -param2 + mi.field_e;
                break L4;
              }
            }
            L5: {
              if ((param4 ^ -1) >= -1) {
                break L5;
              } else {
                if (-1 <= (param0 ^ -1)) {
                  break L5;
                } else {
                  if (param5) {
                    var6_int = param1 - -(param2 * mi.field_a);
                    var7 = -param4 + mi.field_a;
                    param2 = -param0;
                    L6: while (true) {
                      if ((param2 ^ -1) <= -1) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (var12 == 0) {
                          param1 = -param4;
                          L7: while (true) {
                            L8: {
                              if (param1 >= 0) {
                                stackOut_32_0 = var6_int;
                                stackOut_32_1 = var7;
                                stackIn_33_0 = stackOut_32_0;
                                stackIn_33_1 = stackOut_32_1;
                                break L8;
                              } else {
                                var8 = mi.field_f[var6_int];
                                stackOut_24_0 = param3 ^ -1;
                                stackOut_24_1 = 255 & var8 >> -1285462040 ^ -1;
                                stackIn_33_0 = stackOut_24_0;
                                stackIn_33_1 = stackOut_24_1;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                if (var12 != 0) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (stackIn_25_0 <= stackIn_25_1) {
                                      break L9;
                                    } else {
                                      if ((16711680 & var8) >> -1806599120 > (255 & var8 >> -246100408)) {
                                        break L9;
                                      } else {
                                        L10: {
                                          var9 = ((16711680 & var8) >> -1993520561) - 60;
                                          if (255 < var9) {
                                            var9 = 255;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        var10 = var8 & 65280;
                                        var10 = 65280 & (var10 >> -1582855103) - (var10 >> 632857093);
                                        var11 = var8 >> 1169275331 & 31;
                                        mi.field_f[var6_int] = qk.a(var11, qk.a(var10, var9 << 432109712));
                                        break L9;
                                      }
                                    }
                                  }
                                  var6_int++;
                                  param1++;
                                  continue L7;
                                }
                              }
                            }
                            var6_int = stackIn_33_0 + stackIn_33_1;
                            param2++;
                            continue L6;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var6), "ii.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
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
        RuntimeException var6 = null;
        uj[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        uj[] var10 = null;
        nj var11 = null;
        java.awt.Frame stackIn_3_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_25_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_33_0 = null;
        java.awt.Frame stackOut_2_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
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
                    var6_array = var10;
                    if (var6_array != null) {
                      var7_int = 0;
                      var8 = 0;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (var8 >= var10.length) {
                              break L4;
                            } else {
                              stackOut_13_0 = param5;
                              stackIn_26_0 = stackOut_13_0;
                              stackIn_14_0 = stackOut_13_0;
                              if (var9 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (stackIn_14_0 != var10[var8].field_c) {
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
                          stackOut_25_0 = var7_int;
                          stackIn_26_0 = stackOut_25_0;
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
                      stackOut_37_0 = null;
                      stackIn_38_0 = stackOut_37_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_33_0 = null;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                return null;
              }
            } else {
              stackOut_2_0 = (java.awt.Frame) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var6);
            stackOut_39_1 = new StringBuilder().append("ii.F(").append(param0).append(',').append(param1).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
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
