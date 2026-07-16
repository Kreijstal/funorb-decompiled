/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ma extends mf implements ra {
    static ci field_G;
    static boolean field_D;
    static String field_H;
    static String field_F;
    static int[] field_J;
    static long field_E;
    jc field_I;

    private final void b(boolean param0) {
        int var4 = Chess.field_G;
        qj var2 = new qj(((ma) this).field_I);
        if (!param0) {
            return;
        }
        mf var3 = (mf) (Object) var2.c(-20229);
        while (var3 != null) {
            var3.c((byte) 119);
            var3 = (mf) (Object) var2.b(8922);
        }
    }

    final boolean a(mf param0, int param1) {
        qj var5 = null;
        mf var6 = null;
        int var7 = Chess.field_G;
        if (((ma) this).field_I.h(-93)) {
            return false;
        }
        qj var3 = new qj(((ma) this).field_I);
        if (param1 != 27964) {
            ((ma) this).d(-95);
        }
        mf var4 = (mf) (Object) var3.a((byte) -20);
        while (var4 != null) {
            if (!(!var4.d((byte) -67))) {
                var5 = new qj(((ma) this).field_I);
                o discarded$0 = var5.a((o) (Object) var4, (byte) 127);
                var6 = (mf) (Object) var5.b((byte) -69);
                while (var6 != null) {
                    if (var6.a(0, param0)) {
                        return true;
                    }
                    var6 = (mf) (Object) var5.b((byte) -93);
                }
            }
            var4 = (mf) (Object) var3.b((byte) -55);
        }
        return false;
    }

    final void b(mf param0, int param1) {
        if (param1 != 95) {
            field_D = true;
        }
        ((ma) this).field_I.a((o) (Object) param0, (byte) 109);
    }

    mf e(byte param0) {
        qj var2 = null;
        mf var3 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        var2 = new qj(((ma) this).field_I);
        if (param0 == 19) {
          var3 = (mf) (Object) var2.c(param0 + -20248);
          L0: while (true) {
            if (var3 != null) {
              if (!var3.d((byte) -67)) {
                var3 = (mf) (Object) var2.b(param0 + 8903);
                continue L0;
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
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            param0 = qm.a('_', param0, "", (byte) -51);
            var3 = i.a(0, param2);
            var4 = 79 / ((param1 - -66) / 51);
            if (-1 != param0.indexOf(param2)) {
              break L1;
            } else {
              if (-1 == param0.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        qj var7 = null;
        mf var8 = null;
        int var9 = 0;
        var9 = Chess.field_G;
        var7 = new qj(((ma) this).field_I);
        if (param4 == 0) {
          var8 = (mf) (Object) var7.c(-20229);
          L0: while (true) {
            L1: {
              if (var8 == null) {
                break L1;
              } else {
                if (!var8.b(20478)) {
                  break L1;
                } else {
                  var8.a(param0, param1, ((ma) this).field_u + param2, param3, 0, ((ma) this).field_r + param5);
                  var8 = (mf) (Object) var7.b(param4 + 8922);
                  continue L0;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void d(int param0) {
        int var5 = Chess.field_G;
        qj var2 = new qj(((ma) this).field_I);
        mf var3 = (mf) (Object) var2.c(-20229);
        int var4 = -94 % ((param0 - 34) / 57);
        while (var3 != null) {
            var3.d(102);
            var3 = (mf) (Object) var2.b(8922);
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        qj var5 = null;
        mf var6 = null;
        int var7 = 0;
        var7 = Chess.field_G;
        super.a(param0, -89, param2, param3);
        var5 = new qj(((ma) this).field_I);
        var6 = (mf) (Object) var5.c(-20229);
        if (param1 < -6) {
          L0: while (true) {
            L1: {
              if (var6 == null) {
                break L1;
              } else {
                if (!var6.b(20478)) {
                  break L1;
                } else {
                  var6.a(((ma) this).field_u + param0, -54, param2, param3 + ((ma) this).field_r);
                  var6 = (mf) (Object) var5.b(8922);
                  continue L0;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = Chess.field_G;
        if (param1 == 0) {
            if (null != ((ma) this).field_n) {
                ((ma) this).field_n.a((byte) 107, param3, param0, true, (mf) this);
            }
        }
        qj var5 = new qj(((ma) this).field_I);
        mf var6 = (mf) (Object) var5.a((byte) -11);
        if (param2 > -80) {
            return;
        }
        while (var6 != null) {
            var6.a(param0 - -((ma) this).field_r, param1, -91, ((ma) this).field_u + param3);
            var6 = (mf) (Object) var5.b((byte) -121);
        }
    }

    final int a(boolean param0) {
        int var5 = 0;
        int var6 = Chess.field_G;
        int var2 = 0;
        qj var3 = new qj(((ma) this).field_I);
        mf var4 = (mf) (Object) var3.c(-20229);
        while (var4 != null) {
            var5 = var4.a(true);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (mf) (Object) var3.b(8922);
        }
        if (!param0) {
            ((ma) this).d(58);
        }
        return var2;
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
            boolean discarded$0 = ((ma) this).d((byte) -111);
        }
        return ((ma) this).e((byte) 19) != null ? true : false;
    }

    final boolean a(mf param0, byte param1) {
        qj var5 = null;
        mf var6 = null;
        int var7 = Chess.field_G;
        if (((ma) this).field_I.h(-25)) {
            return false;
        }
        qj var3 = new qj(((ma) this).field_I);
        mf var4 = (mf) (Object) var3.c(-20229);
        while (var4 != null) {
            if (!(!var4.d((byte) -67))) {
                var5 = new qj(((ma) this).field_I);
                o discarded$0 = var5.a(false, (o) (Object) var4);
                var6 = (mf) (Object) var5.b(8922);
                while (var6 != null) {
                    if (!(!var6.a(0, param0))) {
                        return true;
                    }
                    var6 = (mf) (Object) var5.b(8922);
                }
            }
            var4 = (mf) (Object) var3.b(8922);
        }
        if (param1 != -73) {
            field_J = null;
            return false;
        }
        return false;
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        if (param3 != 1) {
            Object var6 = null;
            boolean discarded$0 = ma.a((String) null, -112, (String) null);
        }
        if (((ma) this).a(param1, param0, param2, -35)) {
            ((ma) this).a(param0, param2, param1, false);
            this.a(param1, (byte) 26, param0, param2);
        }
        return param2;
    }

    String g(int param0) {
        qj var2 = null;
        mf var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = Chess.field_G;
          var2 = new qj(((ma) this).field_I);
          if (param0 == 0) {
            break L0;
          } else {
            var6 = null;
            this.a(125, (byte) -28, (Hashtable) null, (StringBuilder) null);
            break L0;
          }
        }
        var3 = (mf) (Object) var2.c(-20229);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.g(0);
            if (var4 == null) {
              var3 = (mf) (Object) var2.b(8922);
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        this.b(true);
    }

    ma(int param0, int param1, int param2, int param3, jm param4) {
        super(param0, param1, param2, param3, param4, (rg) null);
        ((ma) this).field_I = new jc();
    }

    final boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        qj var8 = null;
        mf var9 = null;
        int var10 = 0;
        var10 = Chess.field_G;
        var8 = new qj(((ma) this).field_I);
        var9 = (mf) (Object) var8.c(-20229);
        L0: while (true) {
          L1: {
            if (var9 == null) {
              break L1;
            } else {
              if (!var9.b(20478)) {
                break L1;
              } else {
                L2: {
                  if (!var9.d((byte) -67)) {
                    break L2;
                  } else {
                    if (!var9.a(73, param1, param2, param3, param4, param5, param6)) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
                var9 = (mf) (Object) var8.b(8922);
                continue L0;
              }
            }
          }
          if (param0 > 59) {
            return false;
          } else {
            field_D = false;
            return false;
          }
        }
    }

    public static void f(byte param0) {
        if (param0 >= -87) {
            return;
        }
        field_F = null;
        field_J = null;
        field_G = null;
        field_H = null;
    }

    private final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var7 = 0;
        int var8 = Chess.field_G;
        qj var5 = new qj(((ma) this).field_I);
        mf var6 = (mf) (Object) var5.c(-20229);
        if (param1 != 26) {
            return;
        }
        while (var6 != null) {
            StringBuilder discarded$0 = param3.append(10);
            for (var7 = 0; var7 <= param0; var7++) {
                StringBuilder discarded$1 = param3.append(32);
            }
            StringBuilder discarded$2 = var6.a(param2, 1 + param0, param3, 1);
            var6 = (mf) (Object) var5.b(8922);
        }
    }

    final boolean a(int param0, mf param1) {
        int var5 = Chess.field_G;
        qj var3 = new qj(((ma) this).field_I);
        mf var4 = (mf) (Object) var3.c(-20229);
        if (param0 != 0) {
            Object var6 = null;
            boolean discarded$0 = ((ma) this).a(37, 99, -118, (mf) null, -21, 62, -50);
        }
        while (var4 != null) {
            if (var4.a(0, param1)) {
                return true;
            }
            var4 = (mf) (Object) var3.b(8922);
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        qj var8 = null;
        mf var9 = null;
        int var10 = 0;
        var10 = Chess.field_G;
        var8 = new qj(((ma) this).field_I);
        var9 = (mf) (Object) var8.c(-20229);
        L0: while (true) {
          L1: {
            if (var9 == null) {
              break L1;
            } else {
              if (!var9.b(20478)) {
                break L1;
              } else {
                if (var9.a(param0, param1, param2, (byte) 88, param4, param5 - -((ma) this).field_r, ((ma) this).field_u + param6)) {
                  return true;
                } else {
                  var9 = (mf) (Object) var8.b(8922);
                  continue L0;
                }
              }
            }
          }
          if (param3 == 88) {
            return false;
          } else {
            field_F = null;
            return false;
          }
        }
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        qj var5 = null;
        int var6 = 0;
        int var7 = 0;
        mf var8 = null;
        boolean stackIn_14_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_12_0 = false;
        var7 = Chess.field_G;
        var5 = new qj(((ma) this).field_I);
        var8 = (mf) (Object) var5.c(-20229);
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              if (!var8.b(param2 + 20479)) {
                break L1;
              } else {
                L2: {
                  if (!var8.d((byte) -67)) {
                    break L2;
                  } else {
                    if (var8.a(param0, param1, -1, param3)) {
                      return true;
                    } else {
                      break L2;
                    }
                  }
                }
                var8 = (mf) (Object) var5.b(8922);
                continue L0;
              }
            }
          }
          if (param2 == -1) {
            var6 = param1;
            if (80 != var6) {
              return false;
            } else {
              L3: {
                if (!ok.field_Jb[81]) {
                  stackOut_13_0 = ((ma) this).a(param3, (byte) -73);
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = ((ma) this).a(param3, 27964);
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              return stackIn_14_0;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Queen";
        field_F = "The invitation has been withdrawn.";
        field_J = new int[]{200, 100, 200, 500, 500, 100, 200, 200, 300, 500, 100};
    }
}
