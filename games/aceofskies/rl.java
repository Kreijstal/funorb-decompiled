/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private la field_h;
    private int field_d;
    static rl field_b;
    int field_l;
    int field_f;
    static rl field_m;
    static rl field_c;
    static rl field_k;
    static rl field_j;
    static rl field_g;
    static rl field_n;
    static int field_e;
    static boolean field_p;
    static String field_i;
    static int[] field_a;
    static st field_o;

    final static rl a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var2 = 24;
        var3 = param0;
        if (var3 == 0) {
          return field_b;
        } else {
          if (var3 == 1) {
            return field_m;
          } else {
            if (2 != var3) {
              if (var3 != 3) {
                if (4 != var3) {
                  if (var3 != 5) {
                    if (var3 == 6) {
                      return field_n;
                    } else {
                      return null;
                    }
                  } else {
                    return field_g;
                  }
                } else {
                  return field_j;
                }
              } else {
                return field_k;
              }
            } else {
              return field_c;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_k = null;
        if (param0 != -12785) {
          return;
        } else {
          field_o = null;
          field_j = null;
          field_a = null;
          field_g = null;
          field_m = null;
          field_i = null;
          field_n = null;
          field_c = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1) {
        if (param1 != 6406) {
          if (6409 != param1) {
            if (param1 == 32841) {
              return 1;
            } else {
              if (param1 != 6410) {
                if (param1 != 6407) {
                  if (param1 == 6408) {
                    return 4;
                  } else {
                    throw new IllegalArgumentException("");
                  }
                } else {
                  return 3;
                }
              } else {
                return 2;
              }
            }
          } else {
            return 1;
          }
        } else {
          return 1;
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 >= param5) {
          if (param1 < param5 + param3) {
            if (param6 <= param2) {
              if (param6 + param4 <= param2) {
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
        } else {
          return false;
        }
    }

    final static void a(byte param0) {
        gg.b((byte) -98);
        nm.field_a = true;
        nf.field_a = true;
        vn.field_f.e((byte) 89);
        ua.a(wo.field_e, false, (byte) 104);
    }

    private rl(int param0, int param1, la param2) {
        RuntimeException var4 = null;
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
            ((rl) this).field_h = param2;
            ((rl) this).field_f = param0;
            ((rl) this).field_d = param1;
            ((rl) this).field_l = ((rl) this).field_h.field_c * ((rl) this).field_d;
            if (((rl) this).field_f < 16) {
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("rl.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new rl(0, 3, la.field_i);
        field_m = new rl(1, 3, la.field_i);
        field_c = new rl(2, 4, la.field_h);
        field_k = new rl(3, 1, la.field_i);
        field_j = new rl(4, 2, la.field_i);
        field_g = new rl(5, 3, la.field_i);
        field_n = new rl(6, 4, la.field_i);
        field_e = ek.a((byte) 108, 16);
        field_p = false;
        field_i = "Unfortunately you are not eligible to create an account.";
        field_a = new int[4];
        field_o = new st();
    }
}
