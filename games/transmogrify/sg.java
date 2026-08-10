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
        byte[] var3;
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
          sg.a(97, (byte) 55, 108, (byte[]) null);
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
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            var6 = 36 / ((36 - param1) / 45);
            L1: while (true) {
              if (param2 <= var5) {
                var4_int = var4_int ^ -1;
                stackIn_5_0 = var4_int;
                break L0;
              } else {
                var4_int = var4_int >>> 1447584872 ^ hi.field_f[255 & (param3[var5] ^ var4_int)];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("sg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    public static void a(byte param0) {
        byte[] var2;
        field_p = null;
        field_o = null;
        if (param0 > -87) {
          var2 = (byte[]) null;
          sg.a(27, (byte) 105, -29, (byte[]) null);
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
        this.field_g = a.field_bb;
        this.field_i = kd.field_a;
        this.field_l = u.field_d;
        this.field_m = fd.field_i;
        if (param0) {
            this.field_j = a.field_T;
        } else {
            this.field_j = null;
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
