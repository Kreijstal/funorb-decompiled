/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ie extends ng implements j {
    static jl field_G;
    static String field_F;
    ng field_H;

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_F = null;
        field_G = null;
    }

    private final boolean a(byte param0, ng param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 <= -95) {
            break L0;
          } else {
            ((ie) this).j(110);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ie) this).field_H == null) {
              break L2;
            } else {
              if (((ie) this).field_H.b(true)) {
                break L2;
              } else {
                if (!((ie) this).field_H.a(param1, 27)) {
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

    ng l(int param0) {
        if (param0 <= 48) {
            field_G = null;
        }
        ng var2 = ((ie) this).field_H;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.b(true))) {
            return var2;
        }
        return null;
    }

    boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -58) {
            break L0;
          } else {
            ((ie) this).field_H = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ie) this).field_H) {
              break L2;
            } else {
              if (!((ie) this).field_H.a((byte) -58, param1, param2, param3 + ((ie) this).field_p, param4, param5 - -((ie) this).field_z, param6)) {
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

    void j(int param0) {
        if (!(((ie) this).field_H == null)) {
            ((ie) this).field_H.c((byte) 99);
        }
        if (param0 != 0) {
            ((ie) this).field_H = null;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            ((ie) this).h(43);
        }
        return ((ie) this).l(118) != null ? true : false;
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ng param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 > 61) {
            break L0;
          } else {
            var9 = null;
            boolean discarded$2 = this.a((byte) -50, (ng) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ie) this).field_H) {
              break L2;
            } else {
              if (!((ie) this).field_H.b(true)) {
                break L2;
              } else {
                if (!((ie) this).field_H.a(param0, (byte) 68, param2, param3, param4, param5, param6)) {
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

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = Pixelate.field_H ? 1 : 0;
        if (param4 < param6) {
          if (param0 > param4 + 1) {
            L0: {
              if (param5 >= 8) {
                break L0;
              } else {
                ie.a(-1, -100, false, 25, 54, 90, -71);
                break L0;
              }
            }
            L1: {
              if (param0 <= param4 + 5) {
                break L1;
              } else {
                if (param1 != param3) {
                  var7 = (param1 >> -2021044287) - (-(param3 >> 645197793) + -(1 & (param3 & param1)));
                  var8 = param4;
                  var9 = param3;
                  var10 = param1;
                  var11 = param4;
                  L2: while (true) {
                    if (var11 >= param0) {
                      ie.a(var8, var9, param2, param3, param4, 87, param6);
                      ie.a(param0, param1, param2, var10, var8, 54, param6);
                      return;
                    } else {
                      L3: {
                        var12 = gn.field_A[var11];
                        if (!param2) {
                          stackOut_22_0 = nb.field_c[var12];
                          stackIn_23_0 = stackOut_22_0;
                          break L3;
                        } else {
                          stackOut_21_0 = ep.field_c[var12];
                          stackIn_23_0 = stackOut_21_0;
                          break L3;
                        }
                      }
                      var13 = stackIn_23_0;
                      if (var7 >= var13) {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L2;
                        } else {
                          var11++;
                          continue L2;
                        }
                      } else {
                        gn.field_A[var11] = gn.field_A[var8];
                        int incrementValue$1 = var8;
                        var8++;
                        gn.field_A[incrementValue$1] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L2;
                        } else {
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var7 = -1 + param0;
            L4: while (true) {
              if (var7 <= param4) {
                return;
              } else {
                var8 = param4;
                L5: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = gn.field_A[var8];
                    var10 = gn.field_A[1 + var8];
                    if (tj.a(false, param2, var9, var10)) {
                      gn.field_A[var8] = var10;
                      gn.field_A[var8 - -1] = var9;
                      var8++;
                      continue L5;
                    } else {
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    ie(int param0, int param1, int param2, int param3, eb param4, fn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void h(int param0) {
        if (!(null == ((ie) this).field_H)) {
            ((ie) this).field_H.h(param0 ^ 0);
        }
        if (param0 != 2) {
            Object var3 = null;
            boolean discarded$0 = ((ie) this).a(86, -99, (ng) null, 'ﾻ');
        }
    }

    final static void k(int param0) {
        te.a(4, -2671);
        if (param0 != 8149) {
            field_F = null;
        }
    }

    private final boolean a(int param0, ng param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 11627) {
            break L0;
          } else {
            var4 = null;
            ((ie) this).a(-52, -66, (ng) null, -50, -35, 36);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ie) this).field_H == null) {
              break L2;
            } else {
              if (((ie) this).field_H.b(true)) {
                break L2;
              } else {
                if (!((ie) this).field_H.a(param1, param0 + -11600)) {
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

    String b(byte param0) {
        String var3 = null;
        String var2 = super.b((byte) 115);
        if (param0 <= 16) {
            field_F = null;
        }
        if (((ie) this).field_H != null) {
            var3 = ((ie) this).field_H.b((byte) 84);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(ng param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 27) {
          L0: {
            L1: {
              if (null == ((ie) this).field_H) {
                break L1;
              } else {
                if (!((ie) this).field_H.a(param0, param1 ^ 0)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 19) {
            return;
        }
        super.a(param0, (byte) 113, param2, param3, param4);
        ((ie) this).j(0);
    }

    final int e(int param0) {
        if (param0 < 31) {
            return -41;
        }
        return ((ie) this).field_H != null ? ((ie) this).field_H.e(122) : 0;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = Pixelate.field_H ? 1 : 0;
            if (-1 != param2) {
              if ((param2 ^ -1) == 1) {
                te.b(true, -116);
                break L1;
              } else {
                wo.b(107, param2).c(0);
                if (!pm.field_u) {
                  wo.b(-73, param2).a(11);
                  break L1;
                } else {
                  var3 = 81 % ((-12 - param1) / 42);
                  break L0;
                }
              }
            } else {
              if (ro.field_e == null) {
                if (null == qo.field_r) {
                  break L1;
                } else {
                  qo.field_r.a(param0, 0);
                  break L1;
                }
              } else {
                ro.field_e.a(param0, 0);
                break L1;
              }
            }
          }
          var3 = 81 % ((-12 - param1) / 42);
          break L0;
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        if (param1 == 0) {
            if (((ie) this).field_y != null) {
                ((ie) this).field_y.a((ng) this, (byte) -124, param0, param2, true);
            }
        }
        if (((ie) this).field_H != null) {
            ((ie) this).field_H.a(param0 - -((ie) this).field_p, param1, param2 - -((ie) this).field_z, (byte) -36);
        }
        int var5 = -46 % ((param3 - 70) / 49);
    }

    StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        if (param1) {
            ie.k(-23);
        }
        if (((ie) this).a(-114, param2, param0, param3)) {
            ((ie) this).a(param2, (byte) -2, param3, param0);
            ((ie) this).a(param3, (byte) -80, param0, param2);
        }
        return param0;
    }

    void a(int param0, int param1, int param2, ng param3) {
        if (param0 != 40) {
            ((ie) this).field_H = null;
        }
        super.a(param0 ^ 0, param1, param2, param3);
        if (!(((ie) this).field_H == null)) {
            ((ie) this).field_H.a(40, ((ie) this).field_p + param1, param2 - -((ie) this).field_z, param3);
        }
    }

    void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        if (param3 != 0) {
            return;
        }
        if (!(((ie) this).field_H == null)) {
            ((ie) this).field_H.a(param0, ((ie) this).field_z + param1, param2, 0, param4 + ((ie) this).field_p, param5);
        }
    }

    final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        int var6 = Pixelate.field_H ? 1 : 0;
        StringBuilder discarded$0 = param2.append(10);
        int var5 = 0;
        if (param1 >= -79) {
            return;
        }
        while (var5 <= param3) {
            StringBuilder discarded$1 = param2.append(32);
            var5++;
        }
        if (((ie) this).field_H != null) {
            StringBuilder discarded$3 = ((ie) this).field_H.a(param2, false, param3 - -1, param0);
        } else {
            StringBuilder discarded$4 = param2.append("null");
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        if (null != ((ie) this).field_H) {
            if (((ie) this).field_H.b(true)) {
                if (((ie) this).field_H.a(param0, param1 + 0, param2, param3)) {
                    return true;
                }
            }
        }
        if (param1 != 3) {
            ((ie) this).field_H = null;
        }
        int var5 = param0;
        if (var5 != 80) {
            return false;
        }
        return !bc.field_m[81] ? this.a(11627, param2) : this.a((byte) -127, param2);
    }

    static {
    }
}
