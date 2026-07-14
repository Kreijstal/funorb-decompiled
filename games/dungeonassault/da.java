/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class da extends lm implements aa {
    lm field_D;
    static int field_C;
    static int field_B;
    static String field_E;

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == param0) {
            if (!(null == ((da) this).field_o)) {
                ((da) this).field_o.a((byte) 34, (lm) this, param1, param3, true);
            }
        }
        if (((da) this).field_D != null) {
            ((da) this).field_D.a(param0, ((da) this).field_q + param1, 0, ((da) this).field_v + param3);
        }
    }

    void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        if (!(null == ((da) this).field_D)) {
            ((da) this).field_D.a(((da) this).field_v + param0, true, param2, param3, param4 - -((da) this).field_q, param5);
        }
        if (!param1) {
            field_B = 25;
        }
    }

    final void a(boolean param0, StringBuilder param1, int param2, Hashtable param3) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        StringBuilder discarded$0 = param1.append(10);
        for (var5 = 0; var5 <= param2; var5++) {
            StringBuilder discarded$1 = param1.append(32);
        }
        if (((da) this).field_D == null) {
            StringBuilder discarded$3 = param1.append("null");
        } else {
            StringBuilder discarded$4 = ((da) this).field_D.a(1 + param2, param3, param1, (byte) -110);
        }
        if (!param0) {
            ((da) this).field_D = null;
        }
    }

    String c(byte param0) {
        String var3 = null;
        if (param0 <= 3) {
            Object var4 = null;
            boolean discarded$0 = ((da) this).a((lm) null, 'ￅ', 105, (byte) -45);
        }
        String var2 = super.c((byte) 38);
        if (!(null == ((da) this).field_D)) {
            var3 = ((da) this).field_D.c((byte) 41);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var8 = -114 / ((-80 - param5) / 35);
            if (null == ((da) this).field_D) {
              break L1;
            } else {
              if (!((da) this).field_D.a(param0, param1, param2, ((da) this).field_q + param3, param4, (byte) -117, ((da) this).field_v + param6)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    private final boolean a(lm param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 > 35) {
          L0: {
            L1: {
              if (((da) this).field_D == null) {
                break L1;
              } else {
                if (((da) this).field_D.a((byte) 101)) {
                  break L1;
                } else {
                  if (!((da) this).field_D.a(34, param0)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final int d(int param0) {
        int var2 = 11 % ((param0 - 67) / 58);
        return null == ((da) this).field_D ? 0 : ((da) this).field_D.d(-38);
    }

    private final boolean b(int param0, lm param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 2) {
            break L0;
          } else {
            lm discarded$2 = ((da) this).g(79);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((da) this).field_D) {
              break L2;
            } else {
              if (((da) this).field_D.a((byte) 41)) {
                break L2;
              } else {
                if (!((da) this).field_D.a(34, param1)) {
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

    lm g(int param0) {
        lm var2 = ((da) this).field_D;
        if (var2 != null) {
            if (!(!var2.a((byte) 65))) {
                return var2;
            }
        }
        if (param0 == 1) {
            return null;
        }
        Object var3 = null;
        boolean discarded$0 = ((da) this).a((lm) null, 22, -91, -111, -54, (byte) 90, 48);
        return null;
    }

    final boolean a(int param0, lm param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 34) {
          L0: {
            L1: {
              if (null == ((da) this).field_D) {
                break L1;
              } else {
                if (!((da) this).field_D.a(34, param1)) {
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
          return true;
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        if (((da) this).field_D != null) {
            ((da) this).field_D.a(param0 - -((da) this).field_q, param1 - -((da) this).field_v, param2, true);
        }
    }

    final void e(int param0) {
        if (param0 < 1) {
            field_B = -12;
        }
        if (null != ((da) this).field_D) {
            ((da) this).field_D.e(33);
        }
    }

    da(int param0, int param1, int param2, int param3, ca param4, pg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final boolean a(byte param0) {
        if (param0 < 6) {
            field_E = null;
        }
        return ((da) this).g(1) != null ? true : false;
    }

    final static void a(String param0, int[] param1, int param2, int param3, int param4, se param5) {
        tf var6 = new tf(param5, param0, param1);
        var6.b(-param5.field_H + param4, 32, param2 + -(var6.field_i >> 1917623617));
        if (param3 != 1917623617) {
            field_C = -116;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, lm param5, byte param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param6 == -84) {
            break L0;
          } else {
            var9 = null;
            ai[] discarded$2 = da.a((wm) null, (byte) 48, (Random) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((da) this).field_D) {
              break L2;
            } else {
              if (!((da) this).field_D.a((byte) 82)) {
                break L2;
              } else {
                if (!((da) this).field_D.a(param0, param1, param2, param3, param4, param5, (byte) -84)) {
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

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        if (param3 > -76) {
            field_E = null;
        }
        if (!(!((da) this).a(param1, param0, -66, param2))) {
            ((da) this).a(param0, param2, param1, 1);
            ((da) this).a(true, param2, param0, param1);
        }
        return param2;
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        if (((da) this).field_D != null) {
            if (((da) this).field_D.a((byte) 91)) {
                if (((da) this).field_D.a(param0, param1, param2, (byte) 75)) {
                    return true;
                }
            }
        }
        int var5 = param2;
        if (!(-81 != (var5 ^ -1))) {
            return qk.field_e[81] ? this.b(2, param0) : this.a(param0, (byte) 36);
        }
        if (param3 <= 55) {
            Object var6 = null;
            boolean discarded$0 = ((da) this).a((lm) null, -62, -81, -47, 98, (byte) -16, -14);
            return false;
        }
        return false;
    }

    final static ai[] a(wm param0, byte param1, Random param2) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        var9 = DungeonAssault.field_K;
        me.field_g = new ai[49];
        a.field_o = param0;
        var3 = 0;
        L0: while (true) {
          if (-50 >= (var3 ^ -1)) {
            me.field_g[24] = new ai(2);
            me.field_g[0] = new ai(3);
            me.field_g[6] = new ai(3);
            me.field_g[42] = new ai(3);
            me.field_g[48] = new ai(3);
            mp.a(param2, il.field_d, -127, 0, 2);
            mp.a(param2, il.field_d, -127, 6, 2);
            mp.a(param2, il.field_d, -127, 42, 2);
            mp.a(param2, il.field_d, -128, 48, 2);
            mp.a(param2, oa.field_e, -128, 0, 1);
            var3 = -91 % ((-10 - param1) / 37);
            mp.a(param2, oa.field_e, -127, 6, 1);
            mp.a(param2, oa.field_e, -128, 42, 1);
            mp.a(param2, oa.field_e, -128, 48, 1);
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -50) {
                return me.field_g;
              } else {
                if (uj.a(param2, 37, 5) == -1) {
                  if (-1 == me.field_g[var4].field_a) {
                    var5 = nf.a(a.field_o, var4, (byte) 121);
                    var14 = var5;
                    var13 = var14;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    var7 = 0;
                    L2: while (true) {
                      if (var7 >= var14.length) {
                        L3: {
                          if (uj.a(param2, 37, 2) != 0) {
                            var6 = oa.field_e;
                            break L3;
                          } else {
                            var6 = il.field_d;
                            break L3;
                          }
                        }
                        me.field_g[var4] = new ai(var6[uj.a(param2, 37, var6.length)]);
                        var4++;
                        continue L1;
                      } else {
                        var8 = var14[var7];
                        if (0 != var8) {
                          if (6 != var8) {
                            if (var8 != 42) {
                              if (-49 != (var8 ^ -1)) {
                                var7++;
                                continue L2;
                              } else {
                                var4++;
                                continue L1;
                              }
                            } else {
                              var4++;
                              continue L1;
                            }
                          } else {
                            var4++;
                            continue L1;
                          }
                        } else {
                          var4++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            me.field_g[var3] = new ai(0);
            var3++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 != 6) {
            da.a(38);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0 + param0, param1, param2, param3, param4);
        ((da) this).e((byte) -95);
    }

    final static cn[] a(String param0, String param1, int param2, nh param3) {
        int var4 = param3.a(param0, 1000);
        int var5 = param3.a(param2, param1, var4);
        return li.a(var4, var5, param3, 4);
    }

    void e(byte param0) {
        if (param0 > -4) {
            field_B = -122;
        }
        if (null != ((da) this).field_D) {
            ((da) this).field_D.f(12591);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "The amount of Treasure lost by resets is decreased by 5%";
    }
}
