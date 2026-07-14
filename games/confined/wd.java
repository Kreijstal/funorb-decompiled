/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static byte[][] field_d;
    private jl field_b;
    private jl field_a;
    static ej field_f;
    static String field_e;
    static int field_c;

    final jl a(byte param0) {
        int var3 = 29 / ((-69 - param0) / 34);
        jl var2 = ((wd) this).field_a;
        if (!(((wd) this).field_b != var2)) {
            ((wd) this).field_a = null;
            return null;
        }
        ((wd) this).field_a = var2.field_o;
        return var2;
    }

    final jl a(int param0) {
        jl var2 = null;
        if (param0 == 0) {
          var2 = ((wd) this).field_a;
          if (var2 == ((wd) this).field_b) {
            ((wd) this).field_a = null;
            return null;
          } else {
            ((wd) this).field_a = var2.field_q;
            return var2;
          }
        } else {
          field_e = null;
          var2 = ((wd) this).field_a;
          if (var2 == ((wd) this).field_b) {
            ((wd) this).field_a = null;
            return null;
          } else {
            ((wd) this).field_a = var2.field_q;
            return var2;
          }
        }
    }

    final jl d(int param0) {
        jl var2 = ((wd) this).field_b.field_o;
        int var3 = -78 / ((param0 - -30) / 50);
        if (!(((wd) this).field_b != var2)) {
            ((wd) this).field_a = null;
            return null;
        }
        ((wd) this).field_a = var2.field_o;
        return var2;
    }

    final jl c(boolean param0) {
        jl var2 = null;
        jl stackIn_4_0 = null;
        jl stackIn_5_0 = null;
        jl stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jl stackIn_10_0 = null;
        jl stackIn_11_0 = null;
        jl stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        jl stackOut_9_0 = null;
        jl stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        jl stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        jl stackOut_3_0 = null;
        jl stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jl stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (!param0) {
          var2 = ((wd) this).field_b.field_o;
          if (var2 == ((wd) this).field_b) {
            return null;
          } else {
            L0: {
              stackOut_9_0 = (jl) var2;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (param0) {
                stackOut_11_0 = (jl) (Object) stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L0;
              } else {
                stackOut_10_0 = (jl) (Object) stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L0;
              }
            }
            ((jl) (Object) stackIn_12_0).b(stackIn_12_1 != 0);
            return var2;
          }
        } else {
          jl discarded$2 = ((wd) this).a(-10);
          var2 = ((wd) this).field_b.field_o;
          if (var2 != ((wd) this).field_b) {
            L1: {
              stackOut_3_0 = (jl) var2;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param0) {
                stackOut_5_0 = (jl) (Object) stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              } else {
                stackOut_4_0 = (jl) (Object) stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L1;
              }
            }
            ((jl) (Object) stackIn_6_0).b(stackIn_6_1 != 0);
            return var2;
          } else {
            return null;
          }
        }
    }

    final void a(boolean param0) {
        jl var2 = null;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          var2 = ((wd) this).field_b.field_o;
          if (var2 == ((wd) this).field_b) {
            if (!param0) {
              field_d = null;
              ((wd) this).field_a = null;
              return;
            } else {
              ((wd) this).field_a = null;
              return;
            }
          } else {
            var2.b(true);
            continue L0;
          }
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        jl var3 = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (!param0) {
          field_f = null;
          var2 = 0;
          var3 = ((wd) this).field_b.field_o;
          L0: while (true) {
            if (((wd) this).field_b == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_o;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = ((wd) this).field_b.field_o;
          L1: while (true) {
            if (((wd) this).field_b == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_o;
              continue L1;
            }
          }
        }
    }

    public wd() {
        ((wd) this).field_b = new jl();
        ((wd) this).field_b.field_o = ((wd) this).field_b;
        ((wd) this).field_b.field_q = ((wd) this).field_b;
    }

    final static void a(long param0, int param1) {
        int var3_int = 0;
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          Thread.sleep(param0);
          var3_int = -14 / ((81 - param1) / 34);
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (InterruptedException) (Object) decompiledCaughtException;
    }

    final jl c(int param0) {
        jl var2 = null;
        var2 = ((wd) this).field_b.field_q;
        if (((wd) this).field_b != var2) {
          ((wd) this).field_a = var2.field_q;
          if (param0 >= -81) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((wd) this).field_a = null;
          return null;
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        if (!lc.a(true, param2)) {
          if (wc.a(param2, param0 ^ -14)) {
            return false;
          } else {
            if (!ef.a(96, param2)) {
              if (param1.length() == param0) {
                return true;
              } else {
                if (!nm.a(param1, (byte) -89, param2)) {
                  if (!qd.a(param1, param2, false)) {
                    if (ig.a(param1, 0, param2)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final void a(jl param0, byte param1) {
        if (!(null == param0.field_q)) {
            param0.b(true);
        }
        param0.field_q = ((wd) this).field_b.field_q;
        int var3 = 121 / ((67 - param1) / 46);
        param0.field_o = ((wd) this).field_b;
        param0.field_q.field_o = param0;
        param0.field_o.field_q = param0;
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_f = null;
        if (param0 != -17765) {
            wd.a(34L, 30);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new byte[1000][];
        field_f = new ej();
        field_e = "Power shots";
        field_c = 2;
    }
}
