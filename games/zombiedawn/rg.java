/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends pa {
    static ra field_J;
    static int field_H;
    static String field_L;
    static int field_I;
    static String field_K;
    static int field_E;
    static int field_F;

    final static void a(String param0, int param1, String param2) {
        try {
            if (param1 >= -10) {
                field_F = 94;
            }
            r.a(param2, 126, false, param0);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "rg.DA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 == 0) {
          L0: {
            if (param1 != 0) {
              break L0;
            } else {
              if (null != ((rg) this).field_h) {
                ((rg) this).field_h.a(16777215, true, param0, (ga) this, param2);
                break L0;
              } else {
                if (((rg) this).field_i != 0) {
                  if (((rg) this).field_n == 0) {
                    return;
                  } else {
                    se.field_j.a(((rg) this).field_k + param2, ((rg) this).field_k + (param2 + ((rg) this).field_i), (byte) -75, param0 - -((rg) this).field_j, ((rg) this).field_n + (((rg) this).field_j + param0));
                    ((rg) this).field_z.a(param0 - -((rg) this).field_j, param1, param2 - -((rg) this).field_k, 0);
                    se.field_j.b(3);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (((rg) this).field_i != 0) {
            if (((rg) this).field_n == 0) {
              return;
            } else {
              se.field_j.a(((rg) this).field_k + param2, ((rg) this).field_k + (param2 + ((rg) this).field_i), (byte) -75, param0 - -((rg) this).field_j, ((rg) this).field_n + (((rg) this).field_j + param0));
              ((rg) this).field_z.a(param0 - -((rg) this).field_j, param1, param2 - -((rg) this).field_k, 0);
              se.field_j.b(3);
              return;
            }
          } else {
            return;
          }
        } else {
          field_E = -66;
          if (param1 == 0) {
            L1: {
              if (null != ((rg) this).field_h) {
                ((rg) this).field_h.a(16777215, true, param0, (ga) this, param2);
                break L1;
              } else {
                break L1;
              }
            }
            if (((rg) this).field_i != 0) {
              if (((rg) this).field_n != 0) {
                se.field_j.a(((rg) this).field_k + param2, ((rg) this).field_k + (param2 + ((rg) this).field_i), (byte) -75, param0 - -((rg) this).field_j, ((rg) this).field_n + (((rg) this).field_j + param0));
                ((rg) this).field_z.a(param0 - -((rg) this).field_j, param1, param2 - -((rg) this).field_k, 0);
                se.field_j.b(3);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (((rg) this).field_i != 0) {
              if (((rg) this).field_n == 0) {
                return;
              } else {
                se.field_j.a(((rg) this).field_k + param2, ((rg) this).field_k + (param2 + ((rg) this).field_i), (byte) -75, param0 - -((rg) this).field_j, ((rg) this).field_n + (((rg) this).field_j + param0));
                ((rg) this).field_z.a(param0 - -((rg) this).field_j, param1, param2 - -((rg) this).field_k, 0);
                se.field_j.b(3);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    rg(int param0, int param1, int param2, int param3, io param4, ga param5) {
        super(param0, param1, param2, param3, param4, (sk) null);
        try {
            ((rg) this).field_z = param5;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "rg.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    public static void g(int param0) {
        if (param0 != 13885) {
          rg.g(109);
          field_J = null;
          field_K = null;
          field_L = null;
          return;
        } else {
          field_J = null;
          field_K = null;
          field_L = null;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                field_H = 43;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((rg) this).b(param3, 21224, param2, param4, param0)) {
                  break L3;
                } else {
                  if (!super.a(param0, 1, param2, param3, param4, param5, param6)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("rg.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final void b(boolean param0) {
        ((rg) this).field_z.a(param0);
    }

    final static void a(oi param0, boolean param1) {
        int var2_int = 0;
        vn var3 = null;
        if (hm.field_E == null) {
            return;
        }
        try {
            var2_int = param0.field_I - -param0.field_x;
            var3 = new vn(var2_int, var2_int);
            var3.a();
            hm.field_E.d(0, 0, var2_int, var2_int);
            cn.field_f.b(44);
            hm.field_E = var3;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "rg.BA(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Left-click or 'ESC': Skip cutscene";
        field_H = 4;
        field_J = new ra();
        field_I = 0;
        field_K = "DETONATE";
        field_F = -1;
    }
}
