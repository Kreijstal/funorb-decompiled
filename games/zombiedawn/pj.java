/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pj extends nb {
    static int[] field_u;
    boolean field_t;
    boolean field_r;
    static int[] field_s;
    static java.math.BigInteger field_p;
    volatile boolean field_q;

    final static void a(wj param0, byte param1, int param2, int param3, boolean param4) {
        try {
            nc.field_p.a(param3, !param4 ? true : false, param2, 1000000, -93, param0);
            int var5_int = 2 % ((param1 - -11) / 36);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "pj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param0 == 0) {
          return 0;
        } else {
          if (-1 < (param0 ^ -1)) {
            throw new IllegalArgumentException("");
          } else {
            var2 = 103 % ((12 - param1) / 36);
            if (param0 >= 32768) {
              if (131072 <= param0) {
                if ((param0 ^ -1) > -33554433) {
                  if (2097152 <= param0) {
                    if (8388608 > param0) {
                      var3 = 3;
                      param0 = param0 >> (var3 << 1881480033);
                      return ld.field_n[param0 - 32768] << var3;
                    } else {
                      var3 = 4;
                      param0 = param0 >> (var3 << 1881480033);
                      return ld.field_n[param0 - 32768] << var3;
                    }
                  } else {
                    if (524288 <= param0) {
                      var3 = 2;
                      param0 = param0 >> (var3 << 1881480033);
                      return ld.field_n[param0 - 32768] << var3;
                    } else {
                      var3 = 1;
                      param0 = param0 >> (var3 << 1881480033);
                      return ld.field_n[param0 - 32768] << var3;
                    }
                  }
                } else {
                  if (536870912 > param0) {
                    if (param0 >= 134217728) {
                      var3 = 6;
                      param0 = param0 >> (var3 << 1881480033);
                      return ld.field_n[param0 - 32768] << var3;
                    } else {
                      var3 = 5;
                      param0 = param0 >> (var3 << 1881480033);
                      return ld.field_n[param0 - 32768] << var3;
                    }
                  } else {
                    var3 = 7;
                    param0 = param0 >> (var3 << 1881480033);
                    return ld.field_n[param0 - 32768] << var3;
                  }
                }
              } else {
                return ld.field_n[-32768 + param0];
              }
            } else {
              if (param0 < 128) {
                if ((param0 ^ -1) > -9) {
                  if (param0 >= 2) {
                    var3 = 7;
                    param0 = param0 << (var3 << -832391999);
                    return ld.field_n[param0 - 32768] >> var3;
                  } else {
                    return 256;
                  }
                } else {
                  if (32 > param0) {
                    var3 = 6;
                    param0 = param0 << (var3 << -832391999);
                    return ld.field_n[param0 - 32768] >> var3;
                  } else {
                    var3 = 5;
                    param0 = param0 << (var3 << -832391999);
                    return ld.field_n[param0 - 32768] >> var3;
                  }
                }
              } else {
                if (2048 <= param0) {
                  if ((param0 ^ -1) <= -8193) {
                    var3 = 1;
                    param0 = param0 << (var3 << -832391999);
                    return ld.field_n[param0 - 32768] >> var3;
                  } else {
                    var3 = 2;
                    param0 = param0 << (var3 << -832391999);
                    return ld.field_n[param0 - 32768] >> var3;
                  }
                } else {
                  if (-513 >= (param0 ^ -1)) {
                    var3 = 3;
                    param0 = param0 << (var3 << -832391999);
                    return ld.field_n[param0 - 32768] >> var3;
                  } else {
                    var3 = 4;
                    param0 = param0 << (var3 << -832391999);
                    return ld.field_n[param0 - 32768] >> var3;
                  }
                }
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 < 30) {
          return -120;
        } else {
          L0: {
            var3 = 1024 - so.b((param0 + -240) * (-240 + param0) + (param2 - 320) * (-320 + param2));
            if (-1 < (var3 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = var3 >> 1829753090;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var3 = stackIn_4_0;
          return var3 * ge.field_c / 224;
        }
    }

    abstract int e(int param0);

    abstract byte[] d(int param0);

    pj() {
        this.field_q = true;
    }

    public static void f(int param0) {
        field_p = null;
        field_u = null;
        if (param0 != 32) {
            field_p = (java.math.BigInteger) null;
            field_s = null;
            return;
        }
        field_s = null;
    }

    static {
        field_s = new int[8192];
        field_u = new int[]{135, 135, 90, 120};
        field_p = new java.math.BigInteger("65537");
    }
}
