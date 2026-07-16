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
        return (Iterator) (Object) new n((ii) this);
    }

    final gg a(long param0, int param1) {
        gg var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        gg var4 = ((ii) this).field_b[(int)((long)(((ii) this).field_e + -1) & param0)];
        ((ii) this).field_d = var4.field_d;
        if (param1 >= -83) {
            ii.a(-1);
        }
        while (var4 != ((ii) this).field_d) {
            if (!((((ii) this).field_d.field_g ^ -1L) != (param0 ^ -1L))) {
                var5 = ((ii) this).field_d;
                ((ii) this).field_d = ((ii) this).field_d.field_d;
                return var5;
            }
            ((ii) this).field_d = ((ii) this).field_d.field_d;
        }
        ((ii) this).field_d = null;
        return null;
    }

    final static int a(int param0, int param1) {
        if (param1 <= 125) {
            field_f = null;
        }
        param0 = (param0 & 1431655765) + ((-1431655766 & param0) >>> 628365249);
        param0 = (858993459 & param0) + ((-858993458 & param0) >>> 958966498);
        param0 = 252645135 & (param0 >>> -1843594364) + param0;
        param0 = param0 + (param0 >>> -944494904);
        param0 = param0 + (param0 >>> -2034665808);
        return 255 & param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = SolKnight.field_L ? 1 : 0;
          if (param1 < mi.field_b) {
            param4 = param4 - (mi.field_b + -param1);
            param1 = mi.field_b;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((mi.field_k ^ -1) > (param4 + param1 ^ -1)) {
            param4 = mi.field_k + -param1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((mi.field_l ^ -1) < (param2 ^ -1)) {
            param0 = param0 - (-param2 + mi.field_l);
            param2 = mi.field_l;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((mi.field_e ^ -1) <= (param2 + param0 ^ -1)) {
            break L3;
          } else {
            param0 = -param2 + mi.field_e;
            break L3;
          }
        }
        if ((param4 ^ -1) >= -1) {
          return;
        } else {
          if (-1 <= (param0 ^ -1)) {
            return;
          } else {
            if (param5) {
              var6 = param1 - -(param2 * mi.field_a);
              var7 = -param4 + mi.field_a;
              param2 = -param0;
              L4: while (true) {
                if ((param2 ^ -1) <= -1) {
                  return;
                } else {
                  param1 = -param4;
                  L5: while (true) {
                    if (param1 >= 0) {
                      var6 = var6 + var7;
                      param2++;
                      continue L4;
                    } else {
                      L6: {
                        var8 = mi.field_f[var6];
                        if ((param3 ^ -1) <= (255 & var8 >> -1285462040 ^ -1)) {
                          break L6;
                        } else {
                          if ((16711680 & var8) >> -1806599120 > (255 & var8 >> -246100408)) {
                            break L6;
                          } else {
                            L7: {
                              var9 = ((16711680 & var8) >> -1993520561) - 60;
                              if (255 < var9) {
                                var9 = 255;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var10 = var8 & 65280;
                            var10 = 65280 & (var10 >> -1582855103) - (var10 >> 632857093);
                            var11 = var8 >> 1169275331 & 31;
                            mi.field_f[var6] = qk.a(var11, qk.a(var10, var9 << 432109712));
                            break L6;
                          }
                        }
                      }
                      var6++;
                      param1++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    final void a(int param0, long param1, gg param2) {
        if (null != param2.field_a) {
            param2.c(10);
        }
        gg var5 = ((ii) this).field_b[(int)(param1 & (long)(-1 + ((ii) this).field_e))];
        param2.field_d = var5;
        param2.field_a = var5.field_a;
        param2.field_a.field_d = param2;
        param2.field_g = param1;
        if (param0 != -858993458) {
            field_g = null;
        }
        param2.field_d.field_a = param2;
    }

    final static java.awt.Frame a(boolean param0, int param1, dl param2, int param3, int param4, int param5) {
        uj[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        uj[] var10 = null;
        nj var11 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        if (param0) {
          if (param2.b((byte) 98)) {
            L0: {
              if (param4 != 0) {
                break L0;
              } else {
                var10 = dc.a((byte) 124, param2);
                var6 = var10;
                if (var6 != null) {
                  var7_int = 0;
                  var8 = 0;
                  L1: while (true) {
                    if (var8 >= var10.length) {
                      if (var7_int != 0) {
                        break L0;
                      } else {
                        return null;
                      }
                    } else {
                      if (param5 == var10[var8].field_c) {
                        if (param3 == var10[var8].field_d) {
                          L2: {
                            if (param1 == 0) {
                              break L2;
                            } else {
                              if (param1 == var10[var8].field_a) {
                                break L2;
                              } else {
                                var8++;
                                continue L1;
                              }
                            }
                          }
                          L3: {
                            if (var7_int == 0) {
                              break L3;
                            } else {
                              if (var10[var8].field_e > param4) {
                                break L3;
                              } else {
                                var8++;
                                continue L1;
                              }
                            }
                          }
                          param4 = var10[var8].field_e;
                          var7_int = 1;
                          var8++;
                          continue L1;
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  return null;
                }
              }
            }
            var11 = param2.a(param5, param3, param4, (byte) -106, param1);
            L4: while (true) {
              if (0 != var11.field_c) {
                var7 = (java.awt.Frame) var11.field_e;
                if (var7 != null) {
                  if (var11.field_c == 2) {
                    de.a(param2, var7, (byte) 119);
                    return null;
                  } else {
                    return var7;
                  }
                } else {
                  return null;
                }
              } else {
                i.a((byte) 89, 10L);
                continue L4;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Mega Power";
        field_c = "This entry doesn't match";
        field_i = "Aiming: Mouse";
    }
}
