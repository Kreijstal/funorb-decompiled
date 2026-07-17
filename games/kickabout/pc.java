/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static long field_c;
    static boolean field_e;
    static String field_d;
    static String field_b;
    static pu field_a;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (param0 != 0) {
          if (0 <= param0) {
            if (param0 >= 32768) {
              if (131072 <= param0) {
                if (param0 >= 33554432) {
                  if (param0 >= 536870912) {
                    var2 = 7;
                    param0 = param0 >> (var2 << 1);
                    return ko.field_f[param0 + -32768] << var2;
                  } else {
                    if (134217728 > param0) {
                      var2 = 5;
                      param0 = param0 >> (var2 << 1);
                      return ko.field_f[param0 + -32768] << var2;
                    } else {
                      var2 = 6;
                      param0 = param0 >> (var2 << 1);
                      return ko.field_f[param0 + -32768] << var2;
                    }
                  }
                } else {
                  if (param0 < 2097152) {
                    if (param0 >= 524288) {
                      var2 = 2;
                      param0 = param0 >> (var2 << 1);
                      return ko.field_f[param0 + -32768] << var2;
                    } else {
                      var2 = 1;
                      param0 = param0 >> (var2 << 1);
                      return ko.field_f[param0 + -32768] << var2;
                    }
                  } else {
                    if (8388608 <= param0) {
                      var2 = 4;
                      param0 = param0 >> (var2 << 1);
                      return ko.field_f[param0 + -32768] << var2;
                    } else {
                      var2 = 3;
                      param0 = param0 >> (var2 << 1);
                      return ko.field_f[param0 + -32768] << var2;
                    }
                  }
                }
              } else {
                return ko.field_f[-32768 + param0];
              }
            } else {
              if (param0 >= 128) {
                if (param0 < 2048) {
                  if (param0 >= 512) {
                    var2 = 3;
                    param0 = param0 << (var2 << 1);
                    return ko.field_f[param0 - 32768] >> var2;
                  } else {
                    var2 = 4;
                    param0 = param0 << (var2 << 1);
                    return ko.field_f[param0 - 32768] >> var2;
                  }
                } else {
                  if (param0 >= 8192) {
                    var2 = 1;
                    param0 = param0 << (var2 << 1);
                    return ko.field_f[param0 - 32768] >> var2;
                  } else {
                    var2 = 2;
                    param0 = param0 << (var2 << 1);
                    return ko.field_f[param0 - 32768] >> var2;
                  }
                }
              } else {
                if (param0 < 8) {
                  if (param0 >= 2) {
                    var2 = 7;
                    param0 = param0 << (var2 << 1);
                    return ko.field_f[param0 - 32768] >> var2;
                  } else {
                    return 256;
                  }
                } else {
                  if (32 > param0) {
                    var2 = 6;
                    param0 = param0 << (var2 << 1);
                    return ko.field_f[param0 - 32768] >> var2;
                  } else {
                    var2 = 5;
                    param0 = param0 << (var2 << 1);
                    return ko.field_f[param0 - 32768] >> var2;
                  }
                }
              }
            }
          } else {
            throw new IllegalArgumentException("");
          }
        } else {
          return 0;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0) {
        wc.a((byte) -44, so.a(param0 ^ -536871029));
        if (param0 != 536870912) {
            pc.a(36);
        }
    }

    final static void a(byte param0) {
        if (rk.field_f == null) {
          ki.field_n = new mb();
          if (param0 > -8) {
            pc.a((byte) -11);
            we.field_a.a((byte) -124, (fd) (Object) ki.field_n);
            return;
          } else {
            we.field_a.a((byte) -124, (fd) (Object) ki.field_n);
            return;
          }
        } else {
          rk.field_f.q(-85);
          ki.field_n = new mb();
          if (param0 <= -8) {
            we.field_a.a((byte) -124, (fd) (Object) ki.field_n);
            return;
          } else {
            pc.a((byte) -11);
            we.field_a.a((byte) -124, (fd) (Object) ki.field_n);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_d = "Player";
        field_b = "Match by...";
    }
}
