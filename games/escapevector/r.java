/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class r extends hm implements ba {
    static String[] field_A;
    static int field_B;
    hm field_C;
    static boolean field_y;
    static int field_z;

    private final boolean a(hm param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == -812) {
          L0: {
            L1: {
              if (null == ((r) this).field_C) {
                break L1;
              } else {
                if (((r) this).field_C.h(param1 + 812)) {
                  break L1;
                } else {
                  if (!((r) this).field_C.a(-4659, param0)) {
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

    void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        int var7 = 76 / ((param5 - -39) / 45);
        if (!(((r) this).field_C == null)) {
            ((r) this).field_C.a(param0, param1 - -((r) this).field_k, param2, param3 + ((r) this).field_j, param4, (byte) 117);
        }
    }

    private final boolean b(int param0, hm param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 <= -67) {
            break L0;
          } else {
            var4 = null;
            boolean discarded$2 = this.a((hm) null, -59);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((r) this).field_C) {
              break L2;
            } else {
              if (((r) this).field_C.h(0)) {
                break L2;
              } else {
                if (!((r) this).field_C.a(-4659, param1)) {
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

    final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        StringBuilder discarded$0 = param3.append(10);
        for (var5 = 0; param0 >= var5; var5++) {
            StringBuilder discarded$1 = param3.append(32);
        }
        if (param1 < 61) {
            ((r) this).field_C = null;
        }
        if (((r) this).field_C == null) {
            StringBuilder discarded$3 = param3.append("null");
        } else {
            StringBuilder discarded$4 = ((r) this).field_C.a(0, param2, param3, 1 + param0);
        }
    }

    void k(int param0) {
        if (param0 != -6844) {
            return;
        }
        if (!(null == ((r) this).field_C)) {
            ((r) this).field_C.i(param0 ^ -6844);
        }
    }

    r(int param0, int param1, int param2, int param3, db param4, wn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int e(int param0) {
        if (param0 != 12050) {
            Object var3 = null;
            boolean discarded$0 = ((r) this).a(-87, (hm) null);
        }
        return null != ((r) this).field_C ? ((r) this).field_C.e(12050) : 0;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 3) {
            break L0;
          } else {
            ((r) this).field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((r) this).field_C) {
              break L2;
            } else {
              if (!((r) this).field_C.a(((r) this).field_j + param0, param1, (byte) 3, param3, param4 - -((r) this).field_k, param5, param6)) {
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

    final boolean a(int param0, hm param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -4659) {
          L0: {
            L1: {
              if (null == ((r) this).field_C) {
                break L1;
              } else {
                if (!((r) this).field_C.a(-4659, param1)) {
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

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param0 != 0) {
            Object var6 = null;
            boolean discarded$0 = this.b(71, (hm) null);
        }
        if (((r) this).a(param3, param1, param2, false)) {
            ((r) this).a(param1, param2, param3, 1);
            ((r) this).a(param3, (byte) 91, param1, param2);
        }
        return param2;
    }

    final static String a(String param0, int param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = EscapeVector.field_A;
          var3 = param0.length();
          if (param1 == -63) {
            break L0;
          } else {
            var12 = null;
            r.a(-19, (bd) null, 121);
            break L0;
          }
        }
        var4 = var3;
        var5 = 0;
        L1: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (-1 < (var6_int ^ -1)) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L2: while (true) {
              var8 = param0.indexOf("<%", var5);
              if (-1 < (var8 ^ -1)) {
                StringBuilder discarded$3 = var6.append(param0.substring(var7));
                return var6.toString();
              } else {
                var5 = var8 - -2;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3) {
                      break L4;
                    } else {
                      if (!on.a(param0.charAt(var5), false)) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param0.substring(2 + var8, var5);
                  if (!fk.a(false, (CharSequence) (Object) var9)) {
                    continue L2;
                  } else {
                    if (var3 <= var5) {
                      continue L2;
                    } else {
                      if (param0.charAt(var5) != 62) {
                        continue L2;
                      } else {
                        var5++;
                        var10 = gn.a(16777215, (CharSequence) (Object) var9);
                        StringBuilder discarded$4 = var6.append(param0.substring(var7, var8));
                        StringBuilder discarded$5 = var6.append(param2[var10]);
                        var7 = var5;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var5 = var6_int - -2;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
                  break L6;
                } else {
                  if (!on.a(param0.charAt(var5), false)) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param0.substring(var6_int - -2, var5);
              if (!fk.a(false, (CharSequence) (Object) var7_ref)) {
                continue L1;
              } else {
                if (var3 <= var5) {
                  continue L1;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = gn.a(16777215, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (param2[var8].length() - (var5 - var6_int));
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((r) this).k(-6844);
    }

    final boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        Object var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param2 <= -103) {
            break L0;
          } else {
            var9 = null;
            String discarded$2 = r.a((String) null, -44, (String[]) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((r) this).field_C) {
              break L2;
            } else {
              if (!((r) this).field_C.h(0)) {
                break L2;
              } else {
                if (!((r) this).field_C.b(param0, param1, (byte) -115, param3, param4, param5, param6)) {
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

    void a(int param0, int param1, int param2, hm param3) {
        super.a(param0 ^ 0, param1, param2, param3);
        if (!(((r) this).field_C == null)) {
            ((r) this).field_C.a(param0 + 0, ((r) this).field_j + param1, ((r) this).field_k + param2, param3);
        }
        if (param0 != -14472) {
            Object var6 = null;
            String discarded$0 = r.a((String) null, 17, (String[]) null);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (0 == param2) {
            if (null != ((r) this).field_s) {
                ((r) this).field_s.a(param3, param0, -33, (hm) this, true);
            }
        }
        if (null != ((r) this).field_C) {
            ((r) this).field_C.a(param0 + ((r) this).field_j, (byte) 112, param2, param3 - -((r) this).field_k);
        }
        if (param1 <= 85) {
            field_y = false;
        }
    }

    hm j(int param0) {
        hm var2 = ((r) this).field_C;
        if (var2 != null) {
            if (!(!var2.h(0))) {
                return var2;
            }
        }
        if (param0 == 0) {
            return null;
        }
        return null;
    }

    final static void a(int param0, bd param1, int param2) {
        c var5 = om.field_c;
        var5.a(param2, true);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.f(1, -123);
        if (param1.field_j == null) {
            var5.f(0, -123);
        } else {
            var5.f(param1.field_j.length, -123);
            var5.a(param1.field_j.length, (byte) 21, 0, param1.field_j);
        }
        int discarded$0 = var5.c(var4, -38);
        var5.field_m = var5.field_m - 4;
        param1.field_i = var5.g(-5053);
        var5.e(-80, -var4 + var5.field_m);
        if (param0 >= -80) {
            r.a((byte) 12);
        }
    }

    String d(int param0) {
        String var3 = null;
        String var2 = super.d(param0);
        if (((r) this).field_C != null) {
            var3 = ((r) this).field_C.d(1);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    public static void a(byte param0) {
        field_A = null;
        if (param0 != 58) {
            Object var2 = null;
            r.a(-124, (bd) null, 82);
        }
    }

    final void f(int param0) {
        if (((r) this).field_C != null) {
            ((r) this).field_C.f(61);
        }
        if (param0 <= 46) {
            ((r) this).a(-54, (byte) 0, -102, 84);
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        if (param3 < 0) {
            ((r) this).field_C = null;
        }
        if (((r) this).field_C != null) {
            if (((r) this).field_C.h(0)) {
                if (((r) this).field_C.a(param0, param1, param2, 35)) {
                    return true;
                }
            }
        }
        int var5 = param2;
        if (-81 != (var5 ^ -1)) {
            return false;
        }
        return !ik.field_h[81] ? this.a(param0, -812) : this.b(-106, param0);
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            boolean discarded$0 = this.b(-85, (hm) null);
        }
        return null != ((r) this).j(0) ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13202) {
            return;
        }
        em.a(param0, param2 - -7, param3 - 1, 2, param4);
        em.a(param3 + param0, param2, 4, 16, param4);
        em.a(param3 + (param0 - -5), 7 + param2, 63 - param3, 2, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 480;
        field_A = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
