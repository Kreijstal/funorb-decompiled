/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    nc field_b;
    static String field_a;
    static String field_g;
    private int field_e;
    private int[] field_f;
    static boolean field_d;
    boolean field_c;

    final void a(ga param0, kq param1, vl param2, int param3, byte param4, vl[] param5) {
        if (param4 > -90) {
            return;
        }
        try {
            int discarded$0 = td.a(param5, ((oi) this).field_b.field_j[((oi) this).field_f[param3 % ((oi) this).field_e]], param1, param2, param0, 10792131);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "oi.G(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0) {
        int var2 = -58 / ((16 - param0) / 35);
        return ((oi) this).field_e;
    }

    final String a(int param0, byte param1) {
        if (param1 >= -117) {
          ((oi) this).field_e = 122;
          return ((oi) this).field_b.field_c[this.a(param0, true)].field_j;
        } else {
          return ((oi) this).field_b.field_c[this.a(param0, true)].field_j;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 == -1) {
          if (null != bm.field_d) {
            if (!bm.field_d.b(param1 ^ -2100)) {
              if (no.field_p != null) {
                if (!no.field_p.d((byte) 119)) {
                  if (!na.j((byte) -60)) {
                    if (qa.a(param3, param0, (byte) 108, param2)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  no.field_p = null;
                  cr.f((byte) -55);
                  return true;
                }
              } else {
                if (!na.j((byte) -60)) {
                  if (qa.a(param3, param0, (byte) 108, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              cr.f((byte) -123);
              return true;
            }
          } else {
            if (no.field_p != null) {
              if (!no.field_p.d((byte) 119)) {
                if (!na.j((byte) -60)) {
                  if (qa.a(param3, param0, (byte) 108, param2)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                no.field_p = null;
                cr.f((byte) -55);
                return true;
              }
            } else {
              if (!na.j((byte) -60)) {
                if (qa.a(param3, param0, (byte) 108, param2)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return true;
        }
    }

    private final int a(int param0, boolean param1) {
        return ((oi) this).field_f[param0 % ((oi) this).field_e];
    }

    final String a(byte param0, int param1) {
        if (param0 <= 94) {
          ((oi) this).field_e = 59;
          return ((oi) this).field_b.field_c[this.a(param1, true)].field_o;
        } else {
          return ((oi) this).field_b.field_c[this.a(param1, true)].field_o;
        }
    }

    oi(nc param0) {
        this(param0, kk.a(false, param0.field_i, (fo) null), param0.field_i);
    }

    oi(nc param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            ((oi) this).field_f = param1;
            ((oi) this).field_b = param0;
            ((oi) this).field_e = param2;
            if (((oi) this).field_e < 0) {
              ((oi) this).field_e = ((oi) this).field_f.length;
              ((oi) this).field_c = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("oi.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = null;
        field_d = true;
        field_a = "Close";
    }
}
