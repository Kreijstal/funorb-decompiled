/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pa extends ga implements jf {
    static ul field_y;
    ga field_z;
    static String field_C;
    static va[] field_x;
    static int field_B;
    static String field_A;

    final static void a(int param0) {
        uf var1 = (uf) (Object) rm.field_d.a(0);
        if (var1 == null) {
            throw new IllegalStateException();
        }
        bi.a(var1.field_p, var1.field_l, var1.field_i);
        bi.f(var1.field_j, var1.field_m, var1.field_h, var1.field_k);
        var1.field_p = null;
        ad.field_h.a(0, (le) (Object) var1);
        if (param0 != -21189) {
            field_x = null;
        }
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        StringBuilder discarded$5 = param2.append(10);
        if (param3 != -10643) {
            field_C = null;
        }
        for (var5 = 0; var5 <= param1; var5++) {
            StringBuilder discarded$6 = param2.append(32);
        }
        if (((pa) this).field_z == null) {
            StringBuilder discarded$8 = param2.append("null");
        } else {
            StringBuilder discarded$9 = ((pa) this).field_z.a(param0, param2, true, 1 + param1);
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        if (!(!((pa) this).a(param0, param1, 11098, param3))) {
            ((pa) this).a(param0, param3, 81, param1);
            ((pa) this).a(param0, param3, param1, -10643);
        }
        if (!param2) {
            field_A = null;
        }
        return param1;
    }

    void a(ga param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) 116, param2, param3);
        if (!(((pa) this).field_z == null)) {
            ((pa) this).field_z.a(param0, (byte) 100, param2 - -((pa) this).field_j, param3 - -((pa) this).field_k);
        }
        int var5 = -88 / ((param1 - 46) / 42);
    }

    final boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param5) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((pa) this).field_z == null) {
              break L2;
            } else {
              if (!((pa) this).field_z.e(-17741)) {
                break L2;
              } else {
                if (!((pa) this).field_z.a(param0, param1, param2, param3, param4, param5, param6)) {
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

    final static int a(ji param0, ji param1, byte param2) {
        if (param2 != -90) {
            return 7;
        }
        Object var4 = null;
        return bg.a(105, 0, param1, (String) null, param0, 0, false);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(95, param1, param2, param3, param4);
        int var6 = 116 % ((param0 - -23) / 48);
        ((pa) this).b(true);
    }

    public static void d(byte param0) {
        field_C = null;
        field_A = null;
        field_x = null;
        int var1 = 114 / ((param0 - -38) / 40);
        field_y = null;
    }

    final static void a(String param0, boolean param1) {
        if (param1) {
            Object var3 = null;
            oh discarded$0 = pa.a((String) null, (byte) -10);
        }
        ia.field_b = param0;
    }

    private final boolean a(int param0, ga param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((pa) this).field_z) {
              break L2;
            } else {
              if (((pa) this).field_z.e(-17741)) {
                break L2;
              } else {
                if (!((pa) this).field_z.a((byte) 68, param1)) {
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

    String d(int param0) {
        String var4 = null;
        String var2 = super.d(95);
        int var3 = -23 % ((10 - param0) / 58);
        if (!(((pa) this).field_z == null)) {
            var4 = ((pa) this).field_z.d(119);
            if (!(var4 == null)) {
                return var4;
            }
        }
        return var2;
    }

    final void c(byte param0) {
        if (param0 != 57) {
            field_x = null;
        }
        if (!(null == ((pa) this).field_z)) {
            ((pa) this).field_z.c((byte) 57);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param3 == param1) {
            if (!(null == ((pa) this).field_h)) {
                ((pa) this).field_h.a(param3 ^ 16777215, true, param0, (ga) this, param2);
            }
        }
        if (null != ((pa) this).field_z) {
            ((pa) this).field_z.a(param0 - -((pa) this).field_j, param1, ((pa) this).field_k + param2, 0);
        }
    }

    final boolean e(int param0) {
        if (param0 != -17741) {
            Object var3 = null;
            ((pa) this).a(-104, 60, -60, -9, -111, (ga) null);
        }
        return null != ((pa) this).f(-6) ? true : false;
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        if (null != ((pa) this).field_z) {
            if (((pa) this).field_z.e(-17741)) {
                if (((pa) this).field_z.a(31, param1, param2, param3)) {
                    return true;
                }
            }
        }
        int var5 = param1;
        if (80 == var5) {
            return bo.field_p[81] ? this.a(0, param2) : this.b(-49, param2);
        }
        var5 = 45 % ((-83 - param0) / 32);
        return false;
    }

    private final boolean b(int param0, ga param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < -8) {
          L0: {
            L1: {
              if (((pa) this).field_z == null) {
                break L1;
              } else {
                if (((pa) this).field_z.e(-17741)) {
                  break L1;
                } else {
                  if (!((pa) this).field_z.a((byte) 82, param1)) {
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
          return true;
        }
    }

    pa(int param0, int param1, int param2, int param3, io param4, sk param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    ga f(int param0) {
        if (param0 >= -2) {
            Object var3 = null;
            pa.a((String) null, true);
        }
        ga var2 = ((pa) this).field_z;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.e(-17741))) {
            return var2;
        }
        return null;
    }

    final static oh a(String param0, byte param1) {
        String var2 = null;
        oh var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = ZombieDawn.field_J;
        if (nk.field_a != null) {
          L0: {
            var6 = (CharSequence) (Object) param0;
            var2 = fm.a(var6, -85);
            if (var2 == null) {
              var2 = (String) (Object) var6;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = (oh) (Object) nk.field_a.a(93, (long)var2.hashCode());
          if (param1 == -66) {
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_lb;
                  var4 = fm.a(var7, param1 ^ 44);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3.field_lb;
                    break L2;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3 = (oh) (Object) nk.field_a.b((byte) -117);
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        if (!(null == ((pa) this).field_z)) {
            ((pa) this).field_z.a(((pa) this).field_k + param0, 39, param2, param3, ((pa) this).field_j + param4, param5);
        }
        if (param1 <= 1) {
            field_B = -125;
        }
    }

    final boolean a(byte param0, ga param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 67) {
            break L0;
          } else {
            ((pa) this).a(-106, -102, 57, -16, -81);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((pa) this).field_z == null) {
              break L2;
            } else {
              if (!((pa) this).field_z.a((byte) 105, param1)) {
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

    void b(boolean param0) {
        if (((pa) this).field_z != null) {
            ((pa) this).field_z.a(true);
        }
        if (!param0) {
            boolean discarded$0 = ((pa) this).e(-64);
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            int discarded$0 = pa.a((ji) null, (ji) null, (byte) -97);
        }
        return ((pa) this).field_z == null ? 0 : ((pa) this).field_z.c(param0 ^ 0);
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        Object var9 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == 1) {
            break L0;
          } else {
            var9 = null;
            ((pa) this).a((Hashtable) null, 57, (StringBuilder) null, -16);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((pa) this).field_z) {
              break L2;
            } else {
              if (!((pa) this).field_z.a(param0, param1 ^ 0, ((pa) this).field_j + param2, param3, ((pa) this).field_k + param4, param5, param6)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "QUAKE";
        field_B = 40;
        field_x = new va[]{};
        field_A = "Options";
    }
}
