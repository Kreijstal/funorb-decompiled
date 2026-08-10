/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd {
    static db field_f;
    int field_c;
    static String field_d;
    int[] field_b;
    java.awt.Image field_e;
    int field_a;

    abstract void a(boolean param0, int param1, int param2, java.awt.Component param3);

    final static void a(int param0, int param1) {
        th var2 = ed.field_q;
        var2.h(param1, 0);
        if (param0 <= 32) {
            return;
        }
        var2.c(1, -1);
        var2.c(0, -1);
    }

    final static int a(byte param0, int param1) {
        int var2;
        L0: {
          if (param0 == 34) {
            break L0;
          } else {
            dd.a(true, false, true, -68);
            break L0;
          }
        }
        if (0 == param1) {
          return 0;
        } else {
          if ((param1 ^ -1) >= -1) {
            L1: {
              var2 = 2;
              if (param1 < -65536) {
                var2 += 16;
                param1 = param1 >> 16;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (255 >= (param1 ^ -1)) {
                break L2;
              } else {
                param1 = param1 >> 8;
                var2 += 8;
                break L2;
              }
            }
            L3: {
              if (15 < (param1 ^ -1)) {
                var2 += 4;
                param1 = param1 >> 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((param1 ^ -1) > 3) {
                param1 = param1 >> 2;
                var2 += 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (1 >= (param1 ^ -1)) {
                break L5;
              } else {
                var2++;
                param1 = param1 >> 1;
                break L5;
              }
            }
            return var2;
          } else {
            L6: {
              var2 = 1;
              if (param1 > 65535) {
                param1 = param1 >> 16;
                var2 += 16;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((param1 ^ -1) < -256) {
                var2 += 8;
                param1 = param1 >> 8;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((param1 ^ -1) < -16) {
                var2 += 4;
                param1 = param1 >> 4;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((param1 ^ -1) >= -4) {
                break L9;
              } else {
                param1 = param1 >> 2;
                var2 += 2;
                break L9;
              }
            }
            L10: {
              if (-2 <= (param1 ^ -1)) {
                break L10;
              } else {
                param1 = param1 >> 1;
                var2++;
                break L10;
              }
            }
            return var2;
          }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        if (param3 != -11902) {
            field_d = (String) null;
        }
        return sb.field_c[var4];
    }

    abstract void a(int param0, java.awt.Graphics param1, byte param2, int param3);

    public static void a(int param0) {
        field_d = null;
        if (param0 != 1) {
            dd.a(false, false, false, -79);
        }
        field_f = null;
    }

    final static void a(int[] param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int >= param0.length) {
                L2: {
                  var2_int = var2_int / 3;
                  if (param1 == -23588) {
                    break L2;
                  } else {
                    dd.a((byte) 112, 61);
                    break L2;
                  }
                }
                L3: while (true) {
                  if ((var2_int ^ -1) >= -1) {
                    break L0;
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= var2_int) {
                        var2_int = var2_int / 3;
                        continue L3;
                      } else {
                        vh.a((byte) -42, var2_int, param0, var3);
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var2_int = 1 + 3 * var2_int;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("dd.H(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            return;
        }
        lf.a(this.field_b, this.field_a, this.field_c);
    }

    static {
    }
}
