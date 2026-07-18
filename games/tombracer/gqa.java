/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gqa {
    String field_g;
    long field_i;
    String field_b;
    int[] field_h;
    String field_f;
    static String field_a;
    jea field_l;
    int field_n;
    int field_o;
    static String field_k;
    int field_c;
    boolean field_m;
    int field_d;
    String field_j;
    int field_e;

    final int a(boolean param0) {
        if (!((gqa) this).field_m) {
          if (((gqa) this).field_d != 2) {
            if (~((gqa) this).field_i != ~rb.field_r) {
              L0: {
                if (ae.field_g != 2) {
                  break L0;
                } else {
                  if (!dda.a(false, ((gqa) this).field_j)) {
                    break L0;
                  } else {
                    return 1;
                  }
                }
              }
              if (param0) {
                return 11;
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            if (((gqa) this).field_n <= 0) {
              if (~((gqa) this).field_i != ~rb.field_r) {
                L1: {
                  if (ae.field_g != 2) {
                    break L1;
                  } else {
                    if (!dda.a(false, ((gqa) this).field_j)) {
                      break L1;
                    } else {
                      return 1;
                    }
                  }
                }
                if (param0) {
                  return 11;
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = param0 >> 16;
        int var4 = 65535 & param0;
        int var5 = param2 >> 16;
        int var6 = param2 & 65535;
        return var3 * param2 - (-(var5 * var4) + -(var6 * var4 >> 16));
    }

    final static void a(byte param0) {
        um.field_l.a(75, (ae) (Object) new tha());
        if (param0 < 0) {
            field_k = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5) {
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
              int discarded$3 = 0;
              via.a(param4, param0, 0, param5, param3, param2, 51);
              if (param1 == -83584144) {
                break L1;
              } else {
                field_a = null;
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
            stackOut_3_1 = new StringBuilder().append("gqa.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param5 + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_k = null;
    }

    gqa(boolean param0) {
        ((gqa) this).field_i = cca.field_z;
        ((gqa) this).field_d = gja.field_x;
        ((gqa) this).field_m = sb.field_b;
        ((gqa) this).field_o = ega.field_b;
        ((gqa) this).field_f = hi.field_p;
        ((gqa) this).field_g = esa.field_c;
        ((gqa) this).field_c = gb.field_a;
        ((gqa) this).field_n = jda.field_m;
        ((gqa) this).field_e = era.field_a;
        if (!param0) {
            ((gqa) this).field_h = null;
        } else {
            ((gqa) this).field_h = qra.field_e;
        }
        ((gqa) this).field_b = dga.field_a;
        ((gqa) this).field_j = gia.field_q;
    }

    gqa(int param0, String param1, int param2, String param3, String param4) {
        try {
            ((gqa) this).field_g = param1;
            ((gqa) this).field_o = 0;
            ((gqa) this).field_f = param4;
            ((gqa) this).field_c = 0;
            ((gqa) this).field_e = param2;
            ((gqa) this).field_n = 0;
            ((gqa) this).field_i = 0L;
            ((gqa) this).field_j = param1;
            ((gqa) this).field_m = true;
            ((gqa) this).field_d = param0;
            ((gqa) this).field_b = param3;
            ((gqa) this).field_h = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gqa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Searching for an opponent";
        field_a = "Shotgun";
    }
}
