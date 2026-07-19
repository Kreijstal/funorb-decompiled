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
        int discarded$1 = 0;
        byte[] var3 = null;
        if (param0) {
          if (!this.field_g) {
            L0: {
              if (-3 != (this.field_i ^ -1)) {
                break L0;
              } else {
                if (-1 <= (this.field_b ^ -1)) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if ((this.field_c ^ -1L) != (ua.field_e ^ -1L)) {
              if ((kl.field_c ^ -1) == -3) {
                if (b.a(this.field_m, (byte) 24)) {
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
          var3 = (byte[]) null;
          discarded$1 = sg.a(97, (byte) 55, 108, (byte[]) null);
          if (!this.field_g) {
            if (-3 == (this.field_i ^ -1)) {
              if (-1 <= (this.field_b ^ -1)) {
                if ((this.field_c ^ -1L) != (ua.field_e ^ -1L)) {
                  if ((kl.field_c ^ -1) == -3) {
                    if (b.a(this.field_m, (byte) 24)) {
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
              if ((this.field_c ^ -1L) != (ua.field_e ^ -1L)) {
                if ((kl.field_c ^ -1) == -3) {
                  if (b.a(this.field_m, (byte) 24)) {
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
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            var6 = 36 / ((36 - param1) / 45);
            L1: while (true) {
              L2: {
                if (param2 <= var5) {
                  var4_int = var4_int ^ -1;
                  break L2;
                } else {
                  var4_int = var4_int >>> 1447584872 ^ hi.field_f[255 & (param3[var5] ^ var4_int)];
                  var5++;
                  if (var7 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_7_0 = var4_int;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("sg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    public static void a(byte param0) {
        int discarded$2 = 0;
        byte[] var2 = null;
        field_p = null;
        field_o = null;
        if (param0 > -87) {
          var2 = (byte[]) null;
          discarded$2 = sg.a(27, (byte) 105, -29, (byte[]) null);
          field_k = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_k = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    sg(boolean param0) {
        L0: {
          L1: {
            this.field_g = a.field_bb;
            this.field_i = kd.field_a;
            this.field_l = u.field_d;
            this.field_m = fd.field_i;
            if (!param0) {
              break L1;
            } else {
              this.field_j = a.field_T;
              if (!Transmogrify.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_j = null;
          break L0;
        }
        this.field_f = jd.field_b;
        this.field_h = l.field_c;
        this.field_c = sj.field_m;
        this.field_b = sh.field_b;
    }

    static {
        field_o = "Friends can be added in multiplayer<nbsp>games";
        field_e = -1;
        field_k = "Variety bonus:";
        field_a = new int[8192];
    }
}
