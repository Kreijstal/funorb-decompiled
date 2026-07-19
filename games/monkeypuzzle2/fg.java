/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fg {
    static int field_b;
    static int field_a;

    final int a(long param0, int param1) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        long var4 = 0L;
        var4 = this.a(-43);
        if ((var4 ^ -1L) >= -1L) {
          if (param1 != -128) {
            discarded$4 = this.a(31L, -83);
            return this.a(param0, (byte) 37);
          } else {
            return this.a(param0, (byte) 37);
          }
        } else {
          em.a(var4, false);
          if (param1 == -128) {
            return this.a(param0, (byte) 37);
          } else {
            discarded$5 = this.a(31L, -83);
            return this.a(param0, (byte) 37);
          }
        }
    }

    abstract int a(long param0, byte param1);

    abstract long a(int param0);

    abstract void a(boolean param0);

    final static char a(int param0, byte param1) {
        char discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        var2 = param1 & 255;
        if (param0 == 16) {
          if (-1 == (var2 ^ -1)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (128 <= var2) {
              if (var2 >= 160) {
                return (char)var2;
              } else {
                L0: {
                  var3 = sb.field_n[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          }
        } else {
          discarded$1 = fg.a(-100, (byte) -72);
          if (-1 == (var2 ^ -1)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (128 > var2) {
              return (char)var2;
            } else {
              L1: {
                if (var2 < 160) {
                  L2: {
                    var3 = sb.field_n[-128 + var2];
                    if (var3 == 0) {
                      var3 = 63;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var2 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (char)var2;
            }
          }
        }
    }

    static {
    }
}
