/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    private boolean field_d;
    private int field_g;
    private int field_l;
    static String field_a;
    static int[] field_f;
    private int field_j;
    static volatile boolean field_h;
    static String field_k;
    private int field_c;
    private int field_e;
    static String field_b;
    static ri field_i;

    final void a(boolean param0) {
        int fieldTemp$4 = ((hn) this).field_l + 1;
        ((hn) this).field_l = ((hn) this).field_l + 1;
        if (((hn) this).field_c < fieldTemp$4) {
          if (!((hn) this).field_d) {
            if (((hn) this).field_d) {
              ((hn) this).field_l = 0;
              if (param0) {
                ((hn) this).field_e = 11;
                return;
              } else {
                return;
              }
            } else {
              int fieldTemp$5 = ((hn) this).field_g - 1;
              ((hn) this).field_g = ((hn) this).field_g - 1;
              if (fieldTemp$5 >= ((hn) this).field_j) {
                ((hn) this).field_l = 0;
                if (param0) {
                  ((hn) this).field_e = 11;
                  return;
                } else {
                  return;
                }
              } else {
                ((hn) this).field_g = ((hn) this).field_e;
                ((hn) this).field_l = 0;
                if (!param0) {
                  return;
                } else {
                  ((hn) this).field_e = 11;
                  return;
                }
              }
            }
          } else {
            int fieldTemp$6 = ((hn) this).field_g + 1;
            ((hn) this).field_g = ((hn) this).field_g + 1;
            if (fieldTemp$6 > ((hn) this).field_j) {
              ((hn) this).field_g = ((hn) this).field_e;
              ((hn) this).field_l = 0;
              if (param0) {
                ((hn) this).field_e = 11;
                return;
              } else {
                return;
              }
            } else {
              if (((hn) this).field_d) {
                ((hn) this).field_l = 0;
                if (!param0) {
                  return;
                } else {
                  ((hn) this).field_e = 11;
                  return;
                }
              } else {
                int fieldTemp$7 = ((hn) this).field_g - 1;
                ((hn) this).field_g = ((hn) this).field_g - 1;
                if (fieldTemp$7 >= ((hn) this).field_j) {
                  ((hn) this).field_l = 0;
                  if (!param0) {
                    return;
                  } else {
                    ((hn) this).field_e = 11;
                    return;
                  }
                } else {
                  ((hn) this).field_g = ((hn) this).field_e;
                  ((hn) this).field_l = 0;
                  if (!param0) {
                    return;
                  } else {
                    ((hn) this).field_e = 11;
                    return;
                  }
                }
              }
            }
          }
        } else {
          if (param0) {
            ((hn) this).field_e = 11;
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_b = null;
        field_f = null;
        field_i = null;
        field_a = null;
    }

    hn(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((hn) this).field_j = param2;
        ((hn) this).field_e = param1;
        ((hn) this).field_c = param3;
        ((hn) this).field_d = ((hn) this).field_j > ((hn) this).field_e ? true : false;
        ((hn) this).field_g = ((hn) this).field_e;
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param0 == 0) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = hn.a(-104, (String) null, false);
                break L1;
              }
            }
            if (param2) {
              stackOut_5_0 = m.field_C.a(param1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = uq.field_f.a(param1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("hn.D(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static ii a(byte param0) {
        return (ii) (Object) new aa();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names cannot contain consecutive spaces";
        field_k = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_h = false;
        field_b = "For those who know it all.";
    }
}
