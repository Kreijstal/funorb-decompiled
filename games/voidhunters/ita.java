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
        RuntimeException var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          web.field_o.a(param2, (param0.field_h >> 1) + (param4 - -param0.field_g), param1 + param0.field_r + -5, 16777215, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("ita.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 1225728129 + ',' + param4 + ')');
        }
    }

    ita(wwa param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((ita) this).a(param2, param4, param5, 1, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ita.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
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
            L0: {
              stackOut_2_0 = Integer.parseInt(((ita) this).field_C.field_j);
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return 3;
        }
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
            L0: {
              stackOut_2_0 = Integer.parseInt(((ita) this).field_E.field_j);
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return -67;
        }
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(75, param1);
              ((ita) this).field_E.field_l = (sba) (Object) param1;
              ((ita) this).field_B.field_l = (sba) (Object) param1;
              ((ita) this).field_C.field_l = (sba) (Object) param1;
              if (param0 > 73) {
                break L1;
              } else {
                boolean discarded$2 = ((ita) this).d(-83);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ita.K(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final int c(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(((ita) this).field_B.field_j) - 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return 37;
        }
    }

    private ita(wwa param0, boolean param1) {
        super(0, 0, 0, 0, (wwa) null);
        try {
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
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ita.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: {
          super.a(param0, param1, param2, param3, param4);
          if (param3 == 1) {
            break L0;
          } else {
            boolean discarded$1 = ((ita) this).d(-41);
            break L0;
          }
        }
        var6 = param1 - 130 >> 1;
        if (((ita) this).field_F) {
          ((ita) this).field_B.a(var6, 25, param2, 1, 0);
          ((ita) this).field_E.a(var6 - -45, 25, param2, 1, 0);
          ((ita) this).field_C.a(90 + var6, 40, param2, param3, 0);
          return;
        } else {
          ((ita) this).field_E.a(var6, 25, param2, param3, 0);
          ((ita) this).field_B.a(var6 + 45, 25, param2, param3, 0);
          ((ita) this).field_C.a(90 + var6, 40, param2, param3, 0);
          return;
        }
    }

    public static void j(byte param0) {
        field_A = null;
        field_D = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Next";
        field_A = "Hide chat";
    }
}
