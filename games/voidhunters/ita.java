/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ita extends vq {
    private boolean field_F;
    static String field_A;
    static String field_D;
    private uf field_E;
    private uf field_B;
    private uf field_C;

    private final void a(shb param0, int param1, String param2, int param3, int param4) {
        web.field_o.a(param2, (param0.field_h >> 1225728129) + (param4 - -param0.field_g), param1 + param0.field_r + -5, 16777215, -1);
        if (param3 != 1225728129) {
            boolean discarded$0 = ((ita) this).d(108);
        }
    }

    ita(wwa param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((ita) this).a(param2, param4, param5, 1, param3);
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, 66, param3);
        if (param2 < 47) {
            field_D = null;
            if (!(0 == param1)) {
                return;
            }
            param0 = param0 + ((ita) this).field_g;
            param3 = param3 + ((ita) this).field_r;
            this.a((shb) (Object) ((ita) this).field_E, param3, gu.field_q, 1225728129, param0);
            this.a((shb) (Object) ((ita) this).field_B, param3, jm.field_o, 1225728129, param0);
            this.a((shb) (Object) ((ita) this).field_C, param3, rta.field_q, 1225728129, param0);
            return;
        }
        if (!(0 == param1)) {
            return;
        }
        param0 = param0 + ((ita) this).field_g;
        param3 = param3 + ((ita) this).field_r;
        this.a((shb) (Object) ((ita) this).field_E, param3, gu.field_q, 1225728129, param0);
        this.a((shb) (Object) ((ita) this).field_B, param3, jm.field_o, 1225728129, param0);
        this.a((shb) (Object) ((ita) this).field_C, param3, rta.field_q, 1225728129, param0);
    }

    final int f(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == 3476) {
          try {
            stackOut_2_0 = Integer.parseInt(((ita) this).field_C.field_j);
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return 3;
        }
        return 0;
    }

    final boolean d(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          L0: {
            if (null == ((ita) this).field_E.field_j) {
              break L0;
            } else {
              if (((ita) this).field_E.field_j.length() == 0) {
                break L0;
              } else {
                if (((ita) this).field_B.field_j != null) {
                  if (0 != ((ita) this).field_B.field_j.length()) {
                    L1: {
                      if (((ita) this).field_C.field_j == null) {
                        break L1;
                      } else {
                        if (((ita) this).field_C.field_j.length() == 0) {
                          break L1;
                        } else {
                          return false;
                        }
                      }
                    }
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            }
          }
          return true;
        } else {
          var3 = null;
          ((ita) this).a(41, (wta) null);
          if (null != ((ita) this).field_E.field_j) {
            if (((ita) this).field_E.field_j.length() != 0) {
              if (((ita) this).field_B.field_j != null) {
                if (0 != ((ita) this).field_B.field_j.length()) {
                  if (((ita) this).field_C.field_j != null) {
                    if (((ita) this).field_C.field_j.length() == 0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final int e(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == -5) {
          try {
            stackOut_2_0 = Integer.parseInt(((ita) this).field_E.field_j);
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return -67;
        }
        return 0;
    }

    final static no a(int param0, int param1) {
        if (param1 != 7988) {
            field_D = null;
            return lhb.field_a;
        }
        return lhb.field_a;
    }

    final String d(byte param0) {
        String var2 = ((ita) this).field_B.d(param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!(!((ita) this).field_e)) {
            return null == ((ita) this).field_p ? ((ita) this).field_j : ((ita) this).field_p;
        }
        return null;
    }

    final void a(int param0, wta param1) {
        super.a(75, param1);
        ((ita) this).field_E.field_l = (sba) (Object) param1;
        ((ita) this).field_B.field_l = (sba) (Object) param1;
        ((ita) this).field_C.field_l = (sba) (Object) param1;
        if (param0 <= 73) {
            boolean discarded$0 = ((ita) this).d(-83);
        }
    }

    final int c(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0) {
          try {
            stackOut_2_0 = Integer.parseInt(((ita) this).field_B.field_j) - 1;
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return 37;
        }
        return 0;
    }

    private ita(wwa param0, boolean param1) {
        super(0, 0, 0, 0, (wwa) null);
        ((ita) this).field_E = (uf) (Object) new tga("", (sba) null, 2);
        ((ita) this).field_B = (uf) (Object) new tga("", (sba) null, 2);
        ((ita) this).field_C = (uf) (Object) new tga("", (sba) null, 4);
        ((ita) this).field_C.field_q = param0;
        ((ita) this).field_B.field_q = param0;
        ((ita) this).field_E.field_q = param0;
        ((ita) this).field_F = param1 ? true : false;
        if (!((ita) this).field_F) {
            ((ita) this).b(-18756, (shb) (Object) ((ita) this).field_E);
            ((ita) this).b(-18756, (shb) (Object) ((ita) this).field_B);
        } else {
            ((ita) this).b(-18756, (shb) (Object) ((ita) this).field_B);
            ((ita) this).b(-18756, (shb) (Object) ((ita) this).field_E);
        }
        ((ita) this).b(-18756, (shb) (Object) ((ita) this).field_C);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: {
          super.a(param0, param1, param2, param3 ^ 0, param4);
          if (param3 == 1) {
            break L0;
          } else {
            boolean discarded$1 = ((ita) this).d(-41);
            break L0;
          }
        }
        var6 = param1 - 130 >> 1542941825;
        if (((ita) this).field_F) {
          ((ita) this).field_B.a(var6, 25, param2, 1, 0);
          ((ita) this).field_E.a(var6 - -45, 25, param2, 1, 0);
          ((ita) this).field_C.a(90 + var6, 40, param2, param3 + 0, 0);
          return;
        } else {
          ((ita) this).field_E.a(var6, 25, param2, param3 + 0, 0);
          ((ita) this).field_B.a(var6 + 45, 25, param2, param3 + 0, 0);
          ((ita) this).field_C.a(90 + var6, 40, param2, param3 + 0, 0);
          return;
        }
    }

    public static void j(byte param0) {
        field_A = null;
        field_D = null;
        if (param0 <= 71) {
            field_A = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Next";
        field_A = "Hide chat";
    }
}
