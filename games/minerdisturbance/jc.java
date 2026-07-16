/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jc extends fe implements rk {
    static int field_E;
    static ea field_G;
    fe field_I;
    static int[] field_F;
    static int field_H;
    static String field_D;

    final static void a(boolean param0, int param1, int param2) {
        df.a(param2, 5494, oj.field_J);
        if (param1 >= -104) {
            field_F = null;
        }
    }

    final boolean k(int param0) {
        int var2 = -5 % ((param0 - -33) / 45);
        return null != ((jc) this).m(-21923) ? true : false;
    }

    jc(int param0, int param1, int param2, int param3, ad param4, rm param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int b(byte param0) {
        if (param0 >= -88) {
            field_H = 87;
        }
        return null != ((jc) this).field_I ? ((jc) this).field_I.b((byte) -124) : 0;
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        if (null != ((jc) this).field_I) {
            if (((jc) this).field_I.k(-82)) {
                if (!(!((jc) this).field_I.a(param0, param1, (byte) -79, param3))) {
                    return true;
                }
            }
        }
        if (param2 != -79) {
            return true;
        }
        int var5 = param3;
        if (var5 != 80) {
            return false;
        }
        return qd.field_O[81] ? this.a(-13, param1) : this.a(param1, (byte) 77);
    }

    void a(int param0, int param1, byte param2, fe param3) {
        if (param2 < 49) {
            field_D = null;
        }
        super.a(param0, param1, (byte) 101, param3);
        if (null != ((jc) this).field_I) {
            ((jc) this).field_I.a(((jc) this).field_t + param0, ((jc) this).field_u + param1, (byte) 113, param3);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, -48, param2, param3, param4);
        ((jc) this).a((byte) -12);
        if (param1 > -33) {
            field_D = null;
        }
    }

    String h(int param0) {
        String var3 = null;
        String var2 = super.h(param0);
        if (null != ((jc) this).field_I) {
            var3 = ((jc) this).field_I.h(-27867);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    private final boolean a(fe param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == 77) {
            break L0;
          } else {
            field_D = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jc) this).field_I == null) {
              break L2;
            } else {
              if (((jc) this).field_I.k(53)) {
                break L2;
              } else {
                if (!((jc) this).field_I.a(param0, 124)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static int a(byte param0, we param1, String[] param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = MinerDisturbance.field_ab;
          var5 = param1.a(param4);
          if (var5 > param3) {
            break L0;
          } else {
            if (-1 != param4.indexOf("<br>")) {
              break L0;
            } else {
              param2[0] = (String) (Object) param2;
              return 1;
            }
          }
        }
        var6 = (-1 + (var5 + param3)) / param3;
        param3 = var5 / var6;
        var6 = 0;
        var7 = 0;
        if (param0 == 106) {
          var8 = param4.length();
          var9 = 0;
          L1: while (true) {
            if (var8 <= var9) {
              L2: {
                if (var7 < var8) {
                  int incrementValue$3 = var6;
                  var6++;
                  param2[incrementValue$3] = param4.substring(var7, var8).trim();
                  break L2;
                } else {
                  break L2;
                }
              }
              return var6;
            } else {
              L3: {
                L4: {
                  var10 = param4.charAt(var9);
                  if (var10 == 32) {
                    break L4;
                  } else {
                    if (var10 != 45) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var11 = param4.substring(var7, 1 + var9).trim();
                var12 = param1.a(var11);
                if (var12 < param3) {
                  break L3;
                } else {
                  var7 = 1 + var9;
                  int incrementValue$4 = var6;
                  var6++;
                  param2[incrementValue$4] = var11;
                  break L3;
                }
              }
              if (62 == var10) {
                if (param4.regionMatches(var9 + -3, "<br>", 0, 4)) {
                  int incrementValue$5 = var6;
                  var6++;
                  param2[incrementValue$5] = param4.substring(var7, -3 + var9).trim();
                  var7 = 1 + var9;
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return 62;
        }
    }

    final boolean a(fe param0, int param1) {
        Object var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 >= 119) {
            break L0;
          } else {
            var4 = null;
            boolean discarded$2 = ((jc) this).a('ﾻ', (fe) null, (byte) -61, 127);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((jc) this).field_I) {
              break L2;
            } else {
              if (!((jc) this).field_I.a(param0, 126)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    fe m(int param0) {
        fe var2 = ((jc) this).field_I;
        if (var2 != null) {
            if (!(!var2.k(-95))) {
                return var2;
            }
        }
        if (param0 == -21923) {
            return null;
        }
        field_G = null;
        return null;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, fe param5, int param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param4 <= -53) {
            break L0;
          } else {
            var9 = null;
            boolean discarded$2 = this.a((fe) null, (byte) 0);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jc) this).field_I == null) {
              break L2;
            } else {
              if (!((jc) this).field_I.k(73)) {
                break L2;
              } else {
                if (!((jc) this).field_I.a(param0, param1, param2, param3, (byte) -119, param5, param6)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0, boolean param1) {
        wm.field_f.a(false, param1);
        int var2 = -20 / ((param0 - -33) / 35);
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        StringBuilder discarded$4 = param2.append(10);
        if (param3 > -24) {
            field_D = null;
        }
        for (var5 = 0; var5 <= param1; var5++) {
            StringBuilder discarded$5 = param2.append(32);
        }
        if (null == ((jc) this).field_I) {
            StringBuilder discarded$7 = param2.append("null");
        } else {
            StringBuilder discarded$8 = ((jc) this).field_I.a((byte) -70, param0, 1 + param1, param2);
        }
    }

    final void g(int param0) {
        if (!(((jc) this).field_I == null)) {
            ((jc) this).field_I.g(param0 ^ 0);
        }
        if (param0 != 4966) {
            field_E = 81;
        }
    }

    public static void a(int param0) {
        field_D = null;
        field_F = null;
        field_G = null;
        if (param0 != 0) {
            field_E = 103;
        }
    }

    void a(byte param0) {
        if (((jc) this).field_I != null) {
            ((jc) this).field_I.i(-5257);
        }
        if (param0 != -12) {
            Object var3 = null;
            boolean discarded$0 = ((jc) this).a(-6, -98, -123, 122, (byte) 54, (fe) null, 2);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 0) {
            break L0;
          } else {
            field_H = -37;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jc) this).field_I == null) {
              break L2;
            } else {
              if (!((jc) this).field_I.a(param0, param1 + ((jc) this).field_t, 0, param3, param4, param5, ((jc) this).field_u + param6)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        if (param0 != -70) {
            jc.a(50, -27, 49, 55, true, 1, 91);
        }
        if (!(!((jc) this).a(param3, true, param2, param1))) {
            ((jc) this).a(param1, param3, 34, param2);
            ((jc) this).a(param1, param2, param3, -33);
        }
        return param3;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var15 = MinerDisturbance.field_ab;
        if (param0 < param6) {
          if (1 + param0 >= param2) {
            return;
          } else {
            L0: {
              if (param2 <= 5 + param0) {
                break L0;
              } else {
                if (param1 != param5) {
                  var7 = (param5 & param1 & 1) + ((param1 >> -1140025855) + (param5 >> -406524703));
                  var8 = param0;
                  var9 = param1;
                  var10 = param5;
                  var11 = -63 / ((-74 - param3) / 45);
                  var12 = param0;
                  L1: while (true) {
                    if (var12 >= param2) {
                      jc.a(param0, param1, var8, 87, param4, var9, param6);
                      jc.a(var8, var10, param2, -123, param4, param5, param6);
                      return;
                    } else {
                      L2: {
                        var13 = an.field_a[var12];
                        if (!param4) {
                          stackOut_21_0 = cc.field_L[var13];
                          stackIn_22_0 = stackOut_21_0;
                          break L2;
                        } else {
                          stackOut_20_0 = pi.field_h[var13];
                          stackIn_22_0 = stackOut_20_0;
                          break L2;
                        }
                      }
                      var14 = stackIn_22_0;
                      if (var14 <= var7) {
                        if (var14 > var10) {
                          var10 = var14;
                          var12++;
                          continue L1;
                        } else {
                          var12++;
                          continue L1;
                        }
                      } else {
                        an.field_a[var12] = an.field_a[var8];
                        int incrementValue$1 = var8;
                        var8++;
                        an.field_a[incrementValue$1] = var13;
                        if (var14 < var9) {
                          var9 = var14;
                          var12++;
                          continue L1;
                        } else {
                          var12++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            var7 = -1 + param2;
            L3: while (true) {
              if (var7 <= param0) {
                return;
              } else {
                var8 = param0;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = an.field_a[var8];
                    var10 = an.field_a[1 + var8];
                    if (ri.a(20021, param4, var9, var10)) {
                      an.field_a[var8] = var10;
                      an.field_a[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 4) {
            field_D = null;
        }
        if (-1 == (param3 ^ -1)) {
            if (((jc) this).field_A != null) {
                ((jc) this).field_A.a(12088, param1, (fe) this, param2, true);
            }
        }
        if (null != ((jc) this).field_I) {
            ((jc) this).field_I.a((byte) 4, param1 - -((jc) this).field_u, param2 + ((jc) this).field_t, param3);
        }
    }

    private final boolean a(int param0, fe param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -5) {
            break L0;
          } else {
            ((jc) this).g(103);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jc) this).field_I == null) {
              break L2;
            } else {
              if (((jc) this).field_I.k(-88)) {
                break L2;
              } else {
                if (!((jc) this).field_I.a(param1, 120)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        if (!(null == ((jc) this).field_I)) {
            ((jc) this).field_I.a(param0 + ((jc) this).field_u, param1, param2, ((jc) this).field_t + param3, param4, 0);
        }
        if (param5 != 0) {
            jc.a(false, 113, 39);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[8192];
        field_H = 0;
        field_D = "Options";
    }
}
