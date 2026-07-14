/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class to extends ea implements vm {
    ea field_s;
    static ga field_r;
    static int field_t;

    final static boolean b(int param0, int param1, int param2) {
        if (param0 != -7493) {
            return true;
        }
        return (param1 & 16) != 0 ? true : false;
    }

    to(int param0, int param1, int param2, int param3, ir param4, no param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    ea i(int param0) {
        ea var2 = ((to) this).field_s;
        if (param0 != 0) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            ha discarded$0 = to.a(6, (d) null, (java.awt.Canvas) null, 19, -80);
        }
        if (var2 == null) {
            return null;
        }
        if (!(!var2.e(28660))) {
            return var2;
        }
        return null;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (-1 == (param1 ^ -1)) {
            if (null != ((to) this).field_e) {
                ((to) this).field_e.a(true, -7592, param3, (ea) this, param2);
            }
        }
        if (!(((to) this).field_s == null)) {
            ((to) this).field_s.a((byte) 104, param1, param2 + ((to) this).field_h, ((to) this).field_p + param3);
        }
        if (param0 <= 64) {
            field_t = 58;
        }
    }

    void a(byte param0) {
        int var2 = 111 / ((-13 - param0) / 50);
        if (((to) this).field_s != null) {
            ((to) this).field_s.a(false);
        }
    }

    final void d(int param0) {
        if (param0 != 7398) {
            return;
        }
        if (!(null == ((to) this).field_s)) {
            ((to) this).field_s.d(7398);
        }
    }

    final void a(StringBuilder param0, Hashtable param1, byte param2, int param3) {
        int var6 = AceOfSkies.field_G ? 1 : 0;
        StringBuilder discarded$0 = param0.append(10);
        int var5 = 0;
        if (param2 != -24) {
            ((to) this).a((byte) -47, 125, 23, 0);
        }
        while (var5 <= param3) {
            StringBuilder discarded$1 = param0.append(32);
            var5++;
        }
        if (null != ((to) this).field_s) {
            StringBuilder discarded$3 = ((to) this).field_s.a(param0, 32462, 1 + param3, param1);
        } else {
            StringBuilder discarded$4 = param0.append("null");
        }
    }

    final boolean e(int param0) {
        if (param0 != 28660) {
            return false;
        }
        return null != ((to) this).i(0) ? true : false;
    }

    void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        if (param5 != 91) {
            ((to) this).a((byte) -52);
        }
        if (((to) this).field_s != null) {
            ((to) this).field_s.a(param0 - -((to) this).field_p, ((to) this).field_h + param1, param2, param3, param4, (byte) 91);
        }
    }

    final static void g(int param0) {
        um.field_j = false;
        if (param0 != 0) {
            field_t = -91;
        }
        int discarded$0 = nm.field_c.g(param0 + -43);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        if (((to) this).field_s != null) {
            if (((to) this).field_s.e(28660)) {
                if (!(!((to) this).field_s.a(-93, param1, param2, param3))) {
                    return true;
                }
            }
        }
        int var5 = 61 % ((-53 - param0) / 33);
        int var6 = param1;
        if ((var6 ^ -1) != -81) {
            return false;
        }
        return lp.field_a[81] ? this.a((byte) -112, param3) : this.a(-98, param3);
    }

    void a(byte param0, ea param1, int param2, int param3) {
        this.a((byte) 117, param1, param2, param3);
        if (param0 <= 13) {
            return;
        }
        if (!(((to) this).field_s == null)) {
            ((to) this).field_s.a((byte) 50, param1, param2 - -((to) this).field_h, ((to) this).field_p + param3);
        }
    }

    private final boolean a(byte param0, ea param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -67) {
            break L0;
          } else {
            field_t = 88;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((to) this).field_s) {
              break L2;
            } else {
              if (((to) this).field_s.e(28660)) {
                break L2;
              } else {
                if (!((to) this).field_s.a(param1, (byte) -42)) {
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

    String c(byte param0) {
        String var3 = null;
        if (param0 > -41) {
            Hashtable var4 = (Hashtable) null;
            StringBuilder discarded$0 = ((to) this).a((StringBuilder) null, -79, 77, (Hashtable) null);
        }
        String var2 = this.c((byte) -65);
        if (!(null == ((to) this).field_s)) {
            var3 = ((to) this).field_s.c((byte) -117);
            if (!(var3 == null)) {
                return var3;
            }
        }
        return var2;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 34) {
            break L0;
          } else {
            ((to) this).a(-36, 37, 20, -53, (byte) -115);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((to) this).field_s == null) {
              break L2;
            } else {
              if (!((to) this).field_s.a(34, ((to) this).field_p + param1, param2, param3, ((to) this).field_h + param4, param5, param6)) {
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

    final int f(int param0) {
        if (param0 != 0) {
            return -36;
        }
        return ((to) this).field_s != null ? ((to) this).field_s.f(0) : 0;
    }

    private final boolean a(int param0, ea param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -37) {
            break L0;
          } else {
            field_r = (ga) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((to) this).field_s) {
              break L2;
            } else {
              if (((to) this).field_s.e(28660)) {
                break L2;
              } else {
                if (!((to) this).field_s.a(param1, (byte) -42)) {
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

    final static ha a(int param0, d param1, java.awt.Canvas param2, int param3, int param4) {
        if (param0 != 16) {
            boolean discarded$0 = to.b(-16, -37, 49);
        }
        return (ha) (Object) new kj(param2, param1, param4, param3);
    }

    public static void a(int param0) {
        field_r = null;
        if (param0 != 0) {
            field_t = -14;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        this.a(param0, param1, param2, param3, (byte) 126);
        ((to) this).a((byte) -94);
        if (param4 < 122) {
            field_t = 94;
        }
    }

    final static void h(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null != ho.field_b) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) ho.field_b;
                    // monitorenter ho.field_b
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ho.field_b = null;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    if (param0 == 1) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    field_t = 37;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(ea param0, byte param1) {
        ea var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -42) {
            break L0;
          } else {
            var4 = (ea) null;
            ((to) this).a((byte) -27, (ea) null, 12, -44);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((to) this).field_s) {
              break L2;
            } else {
              if (!((to) this).field_s.a(param0, (byte) -42)) {
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

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, boolean param6) {
        ea var9 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (!param6) {
            break L0;
          } else {
            var9 = (ea) null;
            boolean discarded$2 = ((to) this).a(-108, -17, '', (ea) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((to) this).field_s) {
              break L2;
            } else {
              if (!((to) this).field_s.e(28660)) {
                break L2;
              } else {
                if (!((to) this).field_s.a(param0, param1, param2, param3, param4, param5, false)) {
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

    StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        if (param1 != 32462) {
            return (StringBuilder) null;
        }
        if (!(!((to) this).a(param0, param2, false, param3))) {
            ((to) this).a(param0, 0, param3, param2);
            ((to) this).a(param0, param3, (byte) -24, param2);
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = null;
    }
}
