/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class td extends al implements je {
    ja field_B;

    final StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!(!((td) this).a((byte) 122, param3, param2, param1))) {
            ((td) this).a(34, param2, param3, param1);
            this.a((byte) -62, param3, param1, param2);
        }
        if (param0) {
            return null;
        }
        return param2;
    }

    td(int param0, int param1, int param2, int param3, t param4) {
        super(param0, param1, param2, param3, param4, (tg) null);
        ((td) this).field_B = new ja();
    }

    final boolean a(al param0, int param1) {
        ue var6 = null;
        al var7 = null;
        int var8 = TrackController.field_F ? 1 : 0;
        if (!(!((td) this).field_B.b(false))) {
            return false;
        }
        ue var9 = new ue(((td) this).field_B);
        int var4 = 61 % ((53 - param1) / 47);
        al var5 = (al) (Object) var9.a(53);
        while (var5 != null) {
            if (!(!var5.h(-118))) {
                var6 = new ue(((td) this).field_B);
                fc discarded$0 = var6.a(true, (fc) (Object) var5);
                var7 = (al) (Object) var6.c(-114);
                while (var7 != null) {
                    if (!(!var7.a((byte) -127, param0))) {
                        return true;
                    }
                    var7 = (al) (Object) var6.c(-128);
                }
            }
            var5 = (al) (Object) var9.c(-106);
        }
        return false;
    }

    final boolean a(al param0, boolean param1) {
        ue var5 = null;
        al var6 = null;
        int var7 = TrackController.field_F ? 1 : 0;
        if (((td) this).field_B.b(false)) {
            return false;
        }
        ue var3 = new ue(((td) this).field_B);
        al var4 = (al) (Object) var3.d(-47);
        while (var4 != null) {
            if (var4.h(-92)) {
                var5 = new ue(((td) this).field_B);
                fc discarded$0 = var5.a((byte) -37, (fc) (Object) var4);
                var6 = (al) (Object) var5.e(37);
                while (var6 != null) {
                    if (var6.a((byte) -123, param0)) {
                        return true;
                    }
                    var6 = (al) (Object) var5.e(37);
                }
            }
            var4 = (al) (Object) var3.e(37);
        }
        if (!param1) {
            ((td) this).field_B = null;
            return false;
        }
        return false;
    }

    private final void i(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 != 0) {
            ((td) this).a(67, 29, 21, 61, -112);
        }
        ue var2 = new ue(((td) this).field_B);
        al var3 = (al) (Object) var2.d(120);
        while (var3 != null) {
            var3.g(119);
            var3 = (al) (Object) var2.e(param0 ^ 37);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(0);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, al param5, byte param6) {
        ue var8 = null;
        al var9 = null;
        int var10 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        var8 = new ue(((td) this).field_B);
        var9 = (al) (Object) var8.d(81);
        if (param6 == 127) {
          L0: while (true) {
            L1: {
              if (var9 == null) {
                break L1;
              } else {
                if (!var9.b(param6 + 10000409)) {
                  break L1;
                } else {
                  L2: {
                    if (!var9.h(-85)) {
                      break L2;
                    } else {
                      if (var9.a(param0, param1, param2, param3, param4, param5, (byte) 127)) {
                        return true;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var9 = (al) (Object) var8.e(37);
                  continue L0;
                }
              }
            }
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ue var8 = null;
        al var9 = null;
        int var10 = 0;
        L0: {
          var10 = TrackController.field_F ? 1 : 0;
          var8 = new ue(((td) this).field_B);
          if (param4 == 0) {
            break L0;
          } else {
            ((td) this).field_B = null;
            break L0;
          }
        }
        var9 = (al) (Object) var8.d(-126);
        L1: while (true) {
          L2: {
            if (var9 == null) {
              break L2;
            } else {
              if (!var9.b(10000536)) {
                break L2;
              } else {
                if (!var9.a(param0, param1, param2, param3, param4 ^ 0, param5 + ((td) this).field_p, ((td) this).field_m + param6)) {
                  var9 = (al) (Object) var8.e(37);
                  continue L1;
                } else {
                  return true;
                }
              }
            }
          }
          return false;
        }
    }

    final int c(byte param0) {
        int var5 = 0;
        int var6 = TrackController.field_F ? 1 : 0;
        int var2 = 0;
        ue var3 = new ue(((td) this).field_B);
        al var4 = (al) (Object) var3.d(0);
        while (var4 != null) {
            var5 = var4.c((byte) -14);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (al) (Object) var3.e(37);
        }
        if (param0 != -14) {
            ((td) this).a(123, 7, -116, -2);
        }
        return var2;
    }

    al d(byte param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ue var2 = new ue(((td) this).field_B);
        al var3 = (al) (Object) var2.d(124);
        while (var3 != null) {
            if (!(!var3.h(-94))) {
                return var3;
            }
            var3 = (al) (Object) var2.e(37);
        }
        if (param0 < -124) {
            return null;
        }
        ((td) this).field_B = null;
        return null;
    }

    final void a(boolean param0, al param1) {
        if (param0) {
            ((td) this).field_B = null;
        }
        ((td) this).field_B.a((byte) -125, (fc) (Object) param1);
    }

    final String e(int param0) {
        ue var2 = null;
        al var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            var6 = null;
            boolean discarded$2 = ((td) this).a((al) null, -92, 62, 7, -56, 58, -36);
            break L0;
          }
        }
        var2 = new ue(((td) this).field_B);
        var3 = (al) (Object) var2.d(86);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.e(0);
            if (var4 == null) {
              var3 = (al) (Object) var2.e(param0 + 37);
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        ue var7 = null;
        al var8 = null;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        var7 = new ue(((td) this).field_B);
        var8 = (al) (Object) var7.d(127);
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              if (!var8.b(10000536)) {
                break L1;
              } else {
                var8.a(param0, param1, param2, param3 + ((td) this).field_m, param4, param5 + ((td) this).field_p);
                var8 = (al) (Object) var7.e(37);
                continue L0;
              }
            }
          }
          L2: {
            if (!param1) {
              break L2;
            } else {
              ((td) this).f(77);
              break L2;
            }
          }
          return;
        }
    }

    final void f(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ue var2 = new ue(((td) this).field_B);
        al var3 = (al) (Object) var2.d(-58);
        while (var3 != null) {
            var3.f(-24174);
            var3 = (al) (Object) var2.e(param0 ^ -24137);
        }
        if (param0 != -24174) {
            ((td) this).a(73, -81, 6, -13, -113);
        }
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        ue var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        al var9 = null;
        boolean stackIn_12_0 = false;
        boolean stackOut_11_0 = false;
        boolean stackOut_10_0 = false;
        var8 = TrackController.field_F ? 1 : 0;
        var6 = -126 % ((17 - param0) / 51);
        var5 = new ue(((td) this).field_B);
        var9 = (al) (Object) var5.d(125);
        L0: while (true) {
          L1: {
            if (var9 == null) {
              break L1;
            } else {
              if (!var9.b(10000536)) {
                break L1;
              } else {
                L2: {
                  if (!var9.h(-119)) {
                    break L2;
                  } else {
                    if (!var9.a((byte) 103, param1, param2, param3)) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
                var9 = (al) (Object) var5.e(37);
                continue L0;
              }
            }
          }
          var7 = param3;
          if (var7 == 80) {
            L3: {
              if (!ni.field_m[81]) {
                stackOut_11_0 = ((td) this).a(param2, true);
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = ((td) this).a(param2, -27);
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            return stackIn_12_0;
          } else {
            return false;
          }
        }
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        int var7 = 0;
        int var8 = TrackController.field_F ? 1 : 0;
        if (param0 != -62) {
            ((td) this).field_B = null;
        }
        ue var5 = new ue(((td) this).field_B);
        al var6 = (al) (Object) var5.d(-99);
        while (var6 != null) {
            StringBuilder discarded$0 = param3.append(10);
            for (var7 = 0; var7 <= param1; var7++) {
                StringBuilder discarded$1 = param3.append(32);
            }
            StringBuilder discarded$2 = var6.a(false, param2, param3, param1 + 1);
            var6 = (al) (Object) var5.e(37);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = TrackController.field_F ? 1 : 0;
        if (0 == param0) {
            if (!(null == ((td) this).field_y)) {
                ((td) this).field_y.a(-24969, (al) this, param2, true, param1);
            }
        }
        ue var5 = new ue(((td) this).field_B);
        al var6 = (al) (Object) var5.a(79);
        while (var6 != null) {
            var6.a(param0, ((td) this).field_p + param1, ((td) this).field_m + param2, 29221);
            var6 = (al) (Object) var5.c(param3 ^ -29291);
        }
        if (param3 != 29221) {
            ((td) this).field_B = null;
        }
    }

    final boolean a(byte param0, al param1) {
        int var5 = TrackController.field_F ? 1 : 0;
        ue var3 = new ue(((td) this).field_B);
        al var4 = (al) (Object) var3.d(-122);
        if (param0 >= -104) {
            Object var6 = null;
            ((td) this).a(false, (al) null);
        }
        while (var4 != null) {
            if (var4.a((byte) -114, param1)) {
                return true;
            }
            var4 = (al) (Object) var3.e(37);
        }
        return false;
    }

    final boolean h(int param0) {
        if (param0 > -83) {
            return true;
        }
        return ((td) this).d((byte) -127) != null ? true : false;
    }

    void a(int param0, int param1, byte param2, al param3) {
        ue var5 = null;
        al var6 = null;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        var5 = new ue(((td) this).field_B);
        var6 = (al) (Object) var5.d(-66);
        L0: while (true) {
          L1: {
            if (var6 == null) {
              break L1;
            } else {
              if (!var6.b(10000536)) {
                break L1;
              } else {
                var6.a(param0 - -((td) this).field_m, ((td) this).field_p + param1, (byte) -124, param3);
                var6 = (al) (Object) var5.e(param2 ^ -95);
                continue L0;
              }
            }
          }
          return;
        }
    }

    static {
    }
}
