/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends he {
    int field_k;
    int field_p;
    int field_q;
    int field_l;
    static vg field_m;
    int field_o;
    int field_n;

    final static boolean b(byte param0) {
        CharSequence var2;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 == 34) {
          if ((cd.field_e ^ -1) <= -11) {
            if (vg.field_d) {
              return false;
            } else {
              L0: {
                if (g.j(param0 + -27)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          var2 = (CharSequence) null;
          ie.a(false, (CharSequence) null);
          if ((cd.field_e ^ -1) <= -11) {
            if (vg.field_d) {
              return false;
            } else {
              L1: {
                if (g.j(param0 + -27)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 != -11) {
            ie.e(75);
        }
    }

    final static void a(byte param0, long param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 10) {
                    break L1;
                  } else {
                    field_m = (vg) null;
                    break L1;
                  }
                }
                Thread.sleep(param1);
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                ie.a(false, (CharSequence) null);
                break L1;
              }
            }
            stackIn_3_0 = bd.a(true, param1, (byte) 122, 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ie.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void f(int param0) {
        if (param0 != -11) {
            ie.b((byte) 44);
        }
    }

    ie() {
    }

    static {
    }
}
