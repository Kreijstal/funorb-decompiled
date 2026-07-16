/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class qg extends lk implements u {
    lk field_y;
    static kc field_z;

    final int f(int param0) {
        if (param0 != -1) {
            return -97;
        }
        return null != ((qg) this).field_y ? ((qg) this).field_y.f(-1) : 0;
    }

    void h(int param0) {
        if (param0 != -18584) {
            Object var3 = null;
            boolean discarded$0 = ((qg) this).a('>', (byte) 35, -64, (lk) null);
        }
        if (null != ((qg) this).field_y) {
            ((qg) this).field_y.g(param0 ^ -8661);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, lk param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param5 == -1) {
            break L0;
          } else {
            ((qg) this).field_y = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((qg) this).field_y == null) {
              break L2;
            } else {
              if (!((qg) this).field_y.d(74)) {
                break L2;
              } else {
                if (!((qg) this).field_y.a(param0, param1, param2, param3, param4, -1, param6)) {
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

    void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        if (param0) {
            return;
        }
        if (null != ((qg) this).field_y) {
            ((qg) this).field_y.a(false, param1, param2, ((qg) this).field_o + param3, param4 - -((qg) this).field_i, param5);
        }
    }

    StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        if (!(!((qg) this).a(param3, param2, param1, param0))) {
            ((qg) this).a(param0, (byte) -16, param3, param2);
            ((qg) this).a(param3, param0, true, param2);
        }
        return param3;
    }

    qg(int param0, int param1, int param2, int param3, ci param4, pl param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    lk a(boolean param0) {
        if (param0) {
            return null;
        }
        lk var2 = ((qg) this).field_y;
        if (var2 == null) {
            return null;
        }
        if (!var2.d(76)) {
            return null;
        }
        return var2;
    }

    final void a(StringBuilder param0, Hashtable param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = Main.field_T;
        StringBuilder discarded$0 = param0.append(10);
        for (var5 = 0; var5 <= param3; var5++) {
            StringBuilder discarded$1 = param0.append(32);
        }
        if (!param2) {
            return;
        }
        if (null != ((qg) this).field_y) {
            StringBuilder discarded$3 = ((qg) this).field_y.a(param1, false, param3 - -1, param0);
        } else {
            StringBuilder discarded$4 = param0.append("null");
        }
    }

    final boolean a(int param0, lk param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 71) {
            break L0;
          } else {
            ((qg) this).field_y = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((qg) this).field_y) {
              break L2;
            } else {
              if (!((qg) this).field_y.a(109, param1)) {
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

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        CharSequence var3 = null;
        if (param1 == 18478) {
          L0: {
            var2 = param0.getParameter("username");
            if (var2 == null) {
              break L0;
            } else {
              var3 = (CharSequence) (Object) var2;
              if (0L != fe.a(var3, param1 ^ 18519)) {
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        if (param0 <= 27) {
            return;
        }
        if (null != ((qg) this).field_y) {
            ((qg) this).field_y.c((byte) 76);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param3 < -14) {
            break L0;
          } else {
            ((qg) this).field_y = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((qg) this).field_y == null) {
              break L2;
            } else {
              if (!((qg) this).field_y.a(param0 + ((qg) this).field_o, ((qg) this).field_i + param1, param2, -58, param4, param5, param6)) {
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

    private final boolean a(lk param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 > 41) {
            break L0;
          } else {
            qg.a(-48);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((qg) this).field_y == null) {
              break L2;
            } else {
              if (((qg) this).field_y.d(97)) {
                break L2;
              } else {
                if (!((qg) this).field_y.a(78, param0)) {
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

    private final boolean a(lk param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == -23) {
          L0: {
            L1: {
              if (null == ((qg) this).field_y) {
                break L1;
              } else {
                if (((qg) this).field_y.d(76)) {
                  break L1;
                } else {
                  if (!((qg) this).field_y.a(120, param0)) {
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

    String b(byte param0) {
        String var3 = null;
        String var2 = super.b(param0);
        if (!(((qg) this).field_y == null)) {
            var3 = ((qg) this).field_y.b((byte) -79);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        super.a(param0, param1, param2, param3, param4);
        ((qg) this).h(-18584);
    }

    final boolean d(int param0) {
        if (param0 <= 44) {
            ((qg) this).field_y = null;
        }
        return ((qg) this).a(false) != null ? true : false;
    }

    void a(int param0, int param1, lk param2, int param3) {
        super.a(param0, param1, param2, param3 ^ 0);
        if (((qg) this).field_y != null) {
            ((qg) this).field_y.a(((qg) this).field_i + param0, param1 + ((qg) this).field_o, param2, param3 + 0);
        }
        if (param3 != 3) {
            field_z = null;
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        if (((qg) this).field_y != null) {
            if (((qg) this).field_y.d(115)) {
                if (((qg) this).field_y.a(param0, (byte) -111, param2, param3)) {
                    return true;
                }
            }
        }
        int var5 = param2;
        if (!(var5 != 80)) {
            return !ge.field_c[81] ? this.a(param3, (byte) -23) : this.a(param3, 47);
        }
        if (param1 > -99) {
            return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_z = null;
        if (param0 != 80) {
            field_z = null;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 != -1) {
            ((qg) this).field_y = null;
        }
        if (param3 == 0) {
            if (((qg) this).field_v != null) {
                ((qg) this).field_v.a(param0, (lk) this, 11447, param1, true);
            }
        }
        if (((qg) this).field_y != null) {
            ((qg) this).field_y.a(((qg) this).field_o + param0, ((qg) this).field_i + param1, -1, param3);
        }
    }

    static {
    }
}
