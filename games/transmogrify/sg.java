/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static sj field_p;
    int field_f;
    static String field_o;
    static sj field_d;
    int field_i;
    static char field_n;
    String field_h;
    static String field_k;
    static int field_e;
    private String field_m;
    private int field_b;
    private boolean field_g;
    int[] field_j;
    private long field_c;
    int field_l;
    static int[] field_a;

    final int a(boolean param0) {
        Object var3 = null;
        if (param0) {
          if (!((sg) this).field_g) {
            L0: {
              if (-3 != ((sg) this).field_i) {
                break L0;
              } else {
                if (((sg) this).field_b <= 0) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if (~((sg) this).field_c != ~ua.field_e) {
              if (kl.field_c == 2) {
                if (b.a(((sg) this).field_m, (byte) 24)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          var3 = null;
          int discarded$1 = sg.a(97, (byte) 55, 108, (byte[]) null);
          if (!((sg) this).field_g) {
            if (((sg) this).field_i == 2) {
              if (-1 >= ((sg) this).field_b) {
                if (~((sg) this).field_c != ~ua.field_e) {
                  if (kl.field_c == -3) {
                    if (b.a(((sg) this).field_m, (byte) 24)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                return 2;
              }
            } else {
              if (~((sg) this).field_c != ~ua.field_e) {
                if (kl.field_c == -3) {
                  if (b.a(((sg) this).field_m, (byte) 24)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
          } else {
            return 2;
          }
        }
    }

    final static int a(int param0, byte param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            var6 = 36 / ((36 - param1) / 45);
            L1: while (true) {
              if (param2 <= var5) {
                var4_int = ~var4_int;
                stackOut_4_0 = var4_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var4_int = var4_int >>> 8 ^ hi.field_f[255 & (param3[var5] ^ var4_int)];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("sg.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        field_k = null;
        field_a = null;
        field_d = null;
    }

    sg(boolean param0) {
        ((sg) this).field_g = a.field_bb;
        ((sg) this).field_i = kd.field_a;
        ((sg) this).field_l = u.field_d;
        ((sg) this).field_m = fd.field_i;
        if (param0) {
            ((sg) this).field_j = a.field_T;
        } else {
            ((sg) this).field_j = null;
        }
        ((sg) this).field_f = jd.field_b;
        ((sg) this).field_h = l.field_c;
        ((sg) this).field_c = sj.field_m;
        ((sg) this).field_b = sh.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Friends can be added in multiplayer<nbsp>games";
        field_e = -1;
        field_k = "Variety bonus:";
        field_a = new int[8192];
    }
}
