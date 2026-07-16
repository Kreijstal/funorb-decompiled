/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class en extends na implements nf {
    static wh field_L;
    na field_J;
    static String field_I;
    static int field_K;
    static String field_M;

    void a(na param0, int param1, int param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        if (!(null == ((en) this).field_J)) {
            ((en) this).field_J.a(param0, ((en) this).field_t + param1, ((en) this).field_w + param2, true);
        }
    }

    final int d(int param0) {
        if (param0 > -114) {
            field_K = 50;
        }
        return null != ((en) this).field_J ? ((en) this).field_J.d(-127) : 0;
    }

    final static wd a(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            wd var5 = null;
            wm var5_ref = null;
            Object var6 = null;
            wd stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            wd stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  var4 = Class.forName("di");
                  if (param3 == -103) {
                    break L1;
                  } else {
                    var6 = null;
                    wd discarded$2 = en.a(-5, (java.awt.Component) null, 72, (byte) -86);
                    break L1;
                  }
                }
                var5 = (wd) var4.newInstance();
                var5.a(param1, 42, param2, param0);
                stackOut_2_0 = (wd) var5;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new wm();
              ((wd) (Object) var5_ref).a(param1, param3 ^ -77, param2, param0);
              return (wd) (Object) var5_ref;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_I = null;
        field_M = null;
        field_L = null;
        if (param0 <= 56) {
            Object var2 = null;
            int discarded$0 = en.a(117, 'h', (CharSequence) null);
        }
    }

    void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        if (!(((en) this).field_J == null)) {
            ((en) this).field_J.a(param0, false, param2, param3 - -((en) this).field_w, param4, param5 - -((en) this).field_t);
        }
        if (param1) {
            field_M = null;
        }
    }

    en(int param0, int param1, int param2, int param3, kg param4, dn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static boolean b(int param0, int param1) {
        try {
            if (param1 <= kb.field_q.field_t) {
                return true;
            }
            if (wa.field_e == null) {
                return false;
            }
            if (param0 <= 93) {
                return true;
            }
            int var2_int = wa.field_e.f(0);
            if (-1 > (var2_int ^ -1)) {
                if (var2_int > -kb.field_q.field_t + param1) {
                    var2_int = param1 + -kb.field_q.field_t;
                }
                wa.field_e.a(kb.field_q.field_t, var2_int, kb.field_q.field_u, 0);
                sj.field_k = k.a(0);
                kb.field_q.field_t = kb.field_q.field_t + var2_int;
                if (param1 > kb.field_q.field_t) {
                    return false;
                }
                kb.field_q.field_t = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (var2_int >= 0) {
                    if (ib.a((byte) 127) <= 30000L) {
                        return false;
                    }
                }
                mk.a(false);
            } catch (IOException iOException) {
                mk.a(false);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f(int param0) {
        if (!(null == ((en) this).field_J)) {
            ((en) this).field_J.f(-98);
        }
        if (param0 >= -63) {
            field_I = null;
        }
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var3 = 0;
        var4 = param2.length();
        var5 = 0;
        L0: while (true) {
          if (var5 >= var4) {
            if (param0 > 85) {
              return var3;
            } else {
              return 117;
            }
          } else {
            if (param2.charAt(var5) == param1) {
              var3++;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    String e(int param0) {
        String var3 = null;
        String var2 = super.e(param0);
        if (null != ((en) this).field_J) {
            var3 = ((en) this).field_J.e(param0 ^ 0);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        if (param3 != -372494750) {
            return null;
        }
        if (((en) this).a(param0, param2, 119, param1)) {
            ((en) this).a(-108, param1, param0, param2);
            ((en) this).a(-31857, param2, param1, param0);
        }
        return param1;
    }

    final boolean a(na param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -384169950) {
            break L0;
          } else {
            field_I = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((en) this).field_J == null) {
              break L2;
            } else {
              if (!((en) this).field_J.a(param0, -384169950)) {
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

    boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param4 == -32738) {
          L0: {
            L1: {
              if (((en) this).field_J == null) {
                break L1;
              } else {
                if (!((en) this).field_J.a(param0, param1 - -((en) this).field_t, param2, param3 - -((en) this).field_w, param4 + 0, param5, param6)) {
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

    final boolean c(int param0) {
        if (param0 != 3) {
            boolean discarded$0 = ((en) this).c(-34);
        }
        return null != ((en) this).a(param0 ^ 10) ? true : false;
    }

    final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        StringBuilder discarded$5 = param2.append(10);
        if (param0 != -31857) {
            return;
        }
        for (var5 = 0; param1 >= var5; var5++) {
            StringBuilder discarded$6 = param2.append(32);
        }
        if (null == ((en) this).field_J) {
            StringBuilder discarded$8 = param2.append("null");
        } else {
            StringBuilder discarded$9 = ((en) this).field_J.a(param3, param2, param1 + 1, -372494750);
        }
    }

    final boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -19137) {
          L0: {
            L1: {
              if (((en) this).field_J == null) {
                break L1;
              } else {
                if (!((en) this).field_J.c(3)) {
                  break L1;
                } else {
                  if (!((en) this).field_J.a(param0 + 0, param1, param2, param3, param4, param5, param6)) {
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

    na a(int param0) {
        na var2 = ((en) this).field_J;
        if (param0 != 9) {
            na discarded$0 = ((en) this).a(125);
        }
        if (var2 == null) {
            return null;
        }
        if (!(!var2.c(param0 + -6))) {
            return var2;
        }
        return null;
    }

    private final boolean b(na param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 < -7) {
            break L0;
          } else {
            field_I = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((en) this).field_J == null) {
              break L2;
            } else {
              if (((en) this).field_J.c(3)) {
                break L2;
              } else {
                if (!((en) this).field_J.a(param0, -384169950)) {
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

    private final boolean c(na param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            ((en) this).field_J = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((en) this).field_J) {
              break L2;
            } else {
              if (((en) this).field_J.c(3)) {
                break L2;
              } else {
                if (!((en) this).field_J.a(param0, -384169950)) {
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

    final static kh a(int param0, byte param1, ah param2, int param3) {
        if (param1 != -50) {
            field_I = null;
        }
        if (!ia.a(param0, param2, param3, -114)) {
            return null;
        }
        return ai.b((byte) 89);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (-1 == (param3 ^ -1)) {
            if (((en) this).field_H != null) {
                ((en) this).field_H.a((na) this, param1, param2, true, true);
            }
        }
        if (!(((en) this).field_J == null)) {
            ((en) this).field_J.a(0, param1 - -((en) this).field_t, ((en) this).field_w + param2, param3);
        }
        if (param0 != 0) {
            field_I = null;
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        if (((en) this).field_J != null) {
            if (((en) this).field_J.c(3)) {
                if (((en) this).field_J.a(param0, param1, 1, param3)) {
                    return true;
                }
            }
        }
        int var5 = param0;
        if (!(var5 != 80)) {
            return !sn.field_a[81] ? this.b(param3, -62) : this.c(param3, 0);
        }
        if (param2 != 1) {
            field_M = null;
            return false;
        }
        return false;
    }

    void d(byte param0) {
        if (((en) this).field_J != null) {
            ((en) this).field_J.b((byte) 118);
        }
        if (param0 <= 116) {
            field_I = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, -126, param3, param4);
        int var6 = 111 / ((-61 - param2) / 51);
        ((en) this).d((byte) 123);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "3D";
        field_M = "Sound: ";
    }
}
