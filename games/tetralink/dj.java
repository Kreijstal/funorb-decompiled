/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private mc field_a;
    static db field_g;
    private mc field_b;
    static String field_c;
    static float field_h;
    private int field_f;
    private int field_i;
    private mc[] field_e;
    static String field_d;

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              if (param0 > 53) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-var4 + (var2_int + -1)] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("dj.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final mc a(long param0, byte param1) {
        mc var4 = null;
        mc var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var4 = ((dj) this).field_e[(int)(param0 & (long)(-1 + ((dj) this).field_f))];
        ((dj) this).field_a = var4.field_j;
        L0: while (true) {
          if (var4 == ((dj) this).field_a) {
            if (param1 != -43) {
              return null;
            } else {
              ((dj) this).field_a = null;
              return null;
            }
          } else {
            if (~param0 == ~((dj) this).field_a.field_c) {
              var5 = ((dj) this).field_a;
              ((dj) this).field_a = ((dj) this).field_a.field_j;
              return var5;
            } else {
              ((dj) this).field_a = ((dj) this).field_a.field_j;
              continue L0;
            }
          }
        }
    }

    final mc b(int param0) {
        ((dj) this).field_i = 0;
        if (param0 < 21) {
            return null;
        }
        return ((dj) this).a(-1);
    }

    final void a(long param0, int param1, mc param2) {
        mc var5 = null;
        try {
            if (!(param2.field_e == null)) {
                param2.b(false);
            }
            var5 = ((dj) this).field_e[(int)((long)(((dj) this).field_f + -1) & param0)];
            if (param1 > -48) {
                ((dj) this).field_e = null;
            }
            param2.field_j = var5;
            param2.field_e = var5.field_e;
            param2.field_e.field_j = param2;
            param2.field_c = param0;
            param2.field_j.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "dj.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final mc a(int param0) {
        mc var2 = null;
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (param0 == -1) {
          L0: {
            if (0 >= ((dj) this).field_i) {
              break L0;
            } else {
              if (((dj) this).field_e[((dj) this).field_i + -1] == ((dj) this).field_b) {
                break L0;
              } else {
                var2 = ((dj) this).field_b;
                ((dj) this).field_b = var2.field_j;
                return var2;
              }
            }
          }
          L1: while (true) {
            if (((dj) this).field_f > ((dj) this).field_i) {
              int fieldTemp$3 = ((dj) this).field_i;
              ((dj) this).field_i = ((dj) this).field_i + 1;
              var2 = ((dj) this).field_e[fieldTemp$3].field_j;
              if (((dj) this).field_e[-1 + ((dj) this).field_i] != var2) {
                ((dj) this).field_b = var2.field_j;
                return var2;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          field_g = null;
          if (0 < ((dj) this).field_i) {
            if (((dj) this).field_e[((dj) this).field_i + -1] == ((dj) this).field_b) {
              L2: while (true) {
                if (((dj) this).field_f > ((dj) this).field_i) {
                  int fieldTemp$4 = ((dj) this).field_i;
                  ((dj) this).field_i = ((dj) this).field_i + 1;
                  var2 = ((dj) this).field_e[fieldTemp$4].field_j;
                  if (((dj) this).field_e[-1 + ((dj) this).field_i] != var2) {
                    ((dj) this).field_b = var2.field_j;
                    return var2;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var2 = ((dj) this).field_b;
              ((dj) this).field_b = var2.field_j;
              return var2;
            }
          } else {
            L3: while (true) {
              if (((dj) this).field_f > ((dj) this).field_i) {
                int fieldTemp$5 = ((dj) this).field_i;
                ((dj) this).field_i = ((dj) this).field_i + 1;
                var2 = ((dj) this).field_e[fieldTemp$5].field_j;
                if (((dj) this).field_e[-1 + ((dj) this).field_i] != var2) {
                  ((dj) this).field_b = var2.field_j;
                  return var2;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    dj(int param0) {
        int var2 = 0;
        mc var3 = null;
        ((dj) this).field_i = 0;
        ((dj) this).field_e = new mc[param0];
        ((dj) this).field_f = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            mc dupTemp$2 = new mc();
            var3 = dupTemp$2;
            ((dj) this).field_e[var2] = dupTemp$2;
            var3.field_j = var3;
            var3.field_e = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final static void a(byte param0, f param1) {
        try {
            int var2_int = 29;
            im.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "dj.F(" + -116 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new db(10, 2, 2, 0);
        field_c = "Create a free account to start using this feature";
        field_d = "Staff impersonation";
    }
}
