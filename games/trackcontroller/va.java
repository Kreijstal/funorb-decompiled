/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    int field_c;
    int[] field_b;
    static ik[] field_d;
    static String field_a;
    static int[] field_e;
    int field_f;

    final static int a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 == -47) {
          param0 = param0 & 8191;
          if (-4097 >= param0) {
            L0: {
              if (-6145 > param0) {
                stackOut_18_0 = -ta.field_b[param0 - 4096];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -ta.field_b[-param0 + 8192];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param0 ^ -1) > -2049) {
                stackOut_14_0 = ta.field_b[param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = ta.field_b[4096 - param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_d = null;
          param0 = param0 & 8191;
          if (-4097 >= param0) {
            L2: {
              if (-6145 > param0) {
                stackOut_8_0 = -ta.field_b[param0 - 4096];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -ta.field_b[-param0 + 8192];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param0 ^ -1) > -2049) {
                stackOut_4_0 = ta.field_b[param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = ta.field_b[4096 - param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final int b(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 0) {
          if (null != ((va) this).field_b) {
            if (((va) this).field_b.length == 0) {
              return 0;
            } else {
              return ((va) this).field_b[((va) this).field_b.length - 1];
            }
          } else {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0;
          }
        } else {
          return -61;
        }
    }

    final int b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (null != ((va) this).field_b) {
          if (0 != ((va) this).field_b.length) {
            var3 = 1;
            if (param1 == -85) {
              L0: while (true) {
                if (((va) this).field_b.length > var3) {
                  if (param0 < ((va) this).field_b[var3 - 1] + ((va) this).field_b[var3] >> -1111895295) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return ((va) this).field_b.length + -1;
                }
              }
            } else {
              return -105;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 != 20300) {
          int discarded$2 = va.a(92, (byte) -42);
          field_a = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          return;
        }
    }

    va(int param0, int param1, int param2) {
        ((va) this).field_f = param1;
        ((va) this).field_c = param0;
        ((va) this).field_b = new int[param2 + 1];
    }

    final static byte[] a(int param0, String param1) {
        if (param0 != 0) {
            return null;
        }
        return fk.field_e.a("", -1, param1);
    }

    final static int a(int param0) {
        if (param0 < 70) {
            field_a = null;
            return 1;
        }
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Move to the indicated square and push the block to the right.";
        field_d = new ik[13];
    }
}
