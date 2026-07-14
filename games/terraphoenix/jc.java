/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jc extends gl implements sf {
    static String field_E;
    gl field_F;
    static ci[] field_G;
    static String field_B;
    static int field_D;
    static dh field_z;
    static String[] field_C;

    String f(int param0) {
        String var3 = null;
        if (param0 <= 70) {
            field_D = 117;
        }
        String var2 = super.f(125);
        if (null != ((jc) this).field_F) {
            var3 = ((jc) this).field_F.f(119);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    void a(int param0) {
        if (null != ((jc) this).field_F) {
            ((jc) this).field_F.c(0);
        }
        if (param0 != 0) {
            field_D = 14;
        }
    }

    jc(int param0, int param1, int param2, int param3, cj param4, sc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 45) {
            Object var7 = null;
            boolean discarded$0 = ((jc) this).a((byte) -18, (gl) null);
        }
        super.a(param0, (byte) 72, param2, param3, param4);
        ((jc) this).a(0);
    }

    gl e(byte param0) {
        if (param0 != 82) {
            return null;
        }
        gl var2 = ((jc) this).field_F;
        if (var2 == null) {
            return null;
        }
        if (!var2.d(-116)) {
            return null;
        }
        return var2;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0) {
            if (!(null == ((jc) this).field_l)) {
                ((jc) this).field_l.a(param3, (gl) this, param0, -24381, true);
            }
        }
        if (null != ((jc) this).field_F) {
            ((jc) this).field_F.a(((jc) this).field_w + param0, -124, param2, ((jc) this).field_u + param3);
        }
        if (param1 >= -106) {
            ((jc) this).a(25, (byte) -75, -102, -86, -98);
        }
    }

    public static void f(byte param0) {
        field_z = null;
        field_B = null;
        field_E = null;
        field_G = null;
        field_C = null;
        if (param0 <= 32) {
            jc.f((byte) -46);
        }
    }

    final boolean d(int param0) {
        if (param0 > -103) {
            Object var3 = null;
            boolean discarded$0 = ((jc) this).a((byte) -109, (gl) null);
        }
        return null != ((jc) this).e((byte) 82) ? true : false;
    }

    private final boolean a(int param0, gl param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 > 45) {
          L0: {
            L1: {
              if (((jc) this).field_F == null) {
                break L1;
              } else {
                if (((jc) this).field_F.d(-125)) {
                  break L1;
                } else {
                  if (!((jc) this).field_F.a((byte) 76, param1)) {
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

    void a(gl param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, 75);
        if (param3 <= 25) {
            return;
        }
        if (null != ((jc) this).field_F) {
            ((jc) this).field_F.a(param0, param1 - -((jc) this).field_u, ((jc) this).field_w + param2, 57);
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        if (param0 < 36) {
            field_E = null;
        }
        if (!(null == ((jc) this).field_F)) {
            ((jc) this).field_F.a(47, param1, ((jc) this).field_u + param2, param3 + ((jc) this).field_w, param4, param5);
        }
    }

    final int d(byte param0) {
        if (param0 < 23) {
            field_C = null;
        }
        return ((jc) this).field_F == null ? 0 : ((jc) this).field_F.d((byte) 93);
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        if (((jc) this).field_F != null) {
            if (((jc) this).field_F.d(param2 ^ -100)) {
                if (!(!((jc) this).field_F.a(param0, param1, 30, param3))) {
                    return true;
                }
            }
        }
        if (param2 != 30) {
            return false;
        }
        int var5 = param3;
        if (80 == var5) {
            return !bh.field_e[81] ? this.a(param1, 0) : this.a(param2 + 87, param1);
        }
        return false;
    }

    private final boolean a(gl param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            ((jc) this).a(-84, (byte) -45, -88, 119, -105);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((jc) this).field_F) {
              break L2;
            } else {
              if (((jc) this).field_F.d(-109)) {
                break L2;
              } else {
                if (!((jc) this).field_F.a((byte) 48, param0)) {
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

    final void e(int param0) {
        if (param0 >= 0) {
            field_G = null;
        }
        if (((jc) this).field_F != null) {
            ((jc) this).field_F.e(-87);
        }
    }

    final void b(StringBuilder param0, Hashtable param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Terraphoenix.field_V;
        StringBuilder discarded$0 = param0.append(10);
        for (var5 = param3; var5 <= param2; var5++) {
            StringBuilder discarded$1 = param0.append(32);
        }
        if (null != ((jc) this).field_F) {
            StringBuilder discarded$3 = ((jc) this).field_F.a(34, param0, param2 + 1, param1);
        } else {
            StringBuilder discarded$4 = param0.append("null");
        }
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (!param0) {
          L0: {
            L1: {
              if (null == ((jc) this).field_F) {
                break L1;
              } else {
                if (!((jc) this).field_F.a(false, param1, ((jc) this).field_u + param2, param3 - -((jc) this).field_w, param4, param5, param6)) {
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

    final boolean a(byte param0, gl param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 2) {
          L0: {
            L1: {
              if (null == ((jc) this).field_F) {
                break L1;
              } else {
                if (!((jc) this).field_F.a((byte) 120, param1)) {
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

    final boolean a(gl param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param6 >= 6) {
          L0: {
            L1: {
              if (((jc) this).field_F == null) {
                break L1;
              } else {
                if (!((jc) this).field_F.d(-120)) {
                  break L1;
                } else {
                  if (!((jc) this).field_F.a(param0, param1, param2, param3, param4, param5, (byte) 69)) {
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

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        if (param0 != 34) {
            Object var6 = null;
            ((jc) this).b((StringBuilder) null, (Hashtable) null, -47, -58);
        }
        if (!(!((jc) this).a(param1, param3, -88, param2))) {
            ((jc) this).a(param3, param2, (byte) 27, param1);
            ((jc) this).b(param1, param3, param2, param0 + -34);
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Click to continue";
        field_C = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_E = "Your scientists need more alien resources to continue their research. Recover alien equipment to gain access to more topics.";
    }
}
