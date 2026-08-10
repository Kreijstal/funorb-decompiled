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
        gg var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        gg var4 = this.field_b[(int)((long)(this.field_e + -1) & param0)];
        this.field_d = var4.field_d;
        if (param1 >= -83) {
            ii.a(-1);
        }
        while (var4 != this.field_d) {
            if (!((this.field_d.field_g ^ -1L) != (param0 ^ -1L))) {
                var5 = this.field_d;
                this.field_d = this.field_d.field_d;
                return var5;
            }
            this.field_d = this.field_d.field_d;
        }
        this.field_d = null;
        return null;
    }

    final static int a(int param0, int param1) {
        if (param1 <= 125) {
            field_f = (o[]) null;
        }
        param0 = (param0 & 1431655765) + ((-1431655766 & param0) >>> 628365249);
        param0 = (858993459 & param0) + ((-858993458 & param0) >>> 958966498);
        param0 = 252645135 & (param0 >>> -1843594364) + param0;
        param0 = param0 + (param0 >>> -944494904);
        param0 = param0 + (param0 >>> -2034665808);
        return 255 & param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
                        param1 = -param4;
                        L7: while (true) {
                          if (param1 >= 0) {
                            var6_int = var6_int + var7;
                            param2++;
                            continue L6;
                          } else {
                            var8 = mi.field_f[var6_int];
                            if ((param3 ^ -1) > (255 & var8 >> -1285462040 ^ -1)) {
                              if ((16711680 & var8) >> -1806599120 <= (255 & var8 >> -246100408)) {
                                L8: {
                                  var9 = ((16711680 & var8) >> -1993520561) - 60;
                                  if (255 < var9) {
                                    var9 = 255;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var10 = var8 & 65280;
                                var10 = 65280 & (var10 >> -1582855103) - (var10 >> 632857093);
                                var11 = var8 >> 1169275331 & 31;
                                mi.field_f[var6_int] = qk.a(var11, qk.a(var10, var9 << 432109712));
                                var6_int++;
                                param1++;
                                continue L7;
                              } else {
                                var6_int++;
                                param1++;
                                continue L7;
                              }
                            } else {
                              var6_int++;
                              param1++;
                              continue L7;
                            }
                          }
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
        java.awt.Frame stackIn_3_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
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
                        if (var8 >= var10.length) {
                          if (var7_int != 0) {
                            break L1;
                          } else {
                            return null;
                          }
                        } else {
                          if (param5 == var10[var8].field_c) {
                            L3: {
                              if (param3 == var10[var8].field_d) {
                                L4: {
                                  if (param1 == 0) {
                                    break L4;
                                  } else {
                                    if (param1 == var10[var8].field_a) {
                                      break L4;
                                    } else {
                                      var8++;
                                      continue L2;
                                    }
                                  }
                                }
                                L5: {
                                  if (var7_int == 0) {
                                    break L5;
                                  } else {
                                    if (var10[var8].field_e > param4) {
                                      break L5;
                                    } else {
                                      var8++;
                                      continue L2;
                                    }
                                  }
                                }
                                param4 = var10[var8].field_e;
                                var7_int = 1;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      return null;
                    }
                  }
                }
                var11 = param2.a(param5, param3, param4, (byte) -106, param1);
                L6: while (true) {
                  if (0 != var11.field_c) {
                    var7 = (java.awt.Frame) (var11.field_e);
                    if (var7 != null) {
                      if (var11.field_c == 2) {
                        de.a(param2, var7, (byte) 119);
                        stackIn_39_0 = null;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        return var7;
                      }
                    } else {
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    i.a((byte) 89, 10L);
                    continue L6;
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
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var6_ref);

            stackIn_42_1 = new StringBuilder().append("ii.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L7;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_35_0);
          } else {
            return (java.awt.Frame) ((Object) stackIn_39_0);
          }
        }
    }

    static {
        field_a = "Mega Power";
        field_c = "This entry doesn't match";
        field_i = "Aiming: Mouse";
    }
}
