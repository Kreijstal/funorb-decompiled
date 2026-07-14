/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jwa extends le {
    static llb field_k;
    static int field_l;
    private int field_j;
    private int field_i;
    private int field_m;

    public jwa() {
        this(0);
    }

    private final void b(int param0, int param1) {
        ((jwa) this).field_j = (255 & param0) << 1545460644;
        ((jwa) this).field_i = param0 >> 1813042020 & 4080;
        int var3 = -58 % ((param1 - -77) / 41);
        ((jwa) this).field_m = (16711680 & param0) >> 409573676;
    }

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        int[][] var9 = ((jwa) this).field_d.a(param1, (byte) -98);
        int[][] var3 = var9;
        if (!(!((jwa) this).field_d.field_g)) {
            var4 = var9[0];
            var5 = var9[1];
            var6 = var9[2];
            for (var7 = 0; var7 < hob.field_d; var7++) {
                var4[var7] = ((jwa) this).field_m;
                var5[var7] = ((jwa) this).field_i;
                var6[var7] = ((jwa) this).field_j;
            }
        }
        if (param0 != 255) {
            return null;
        }
        return var3;
    }

    private jwa(int param0) {
        super(0, false);
        this.b(param0, -121);
    }

    final void a(int param0, int param1, ds param2) {
        if (param1 > -60) {
            return;
        }
        int var4 = param0;
        if (!(var4 != 0)) {
            this.b(param2.c((byte) -94), -123);
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        if (param1 != null) {
          if (!param0) {
            var2 = 0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                if (var2 >= var3) {
                  break L1;
                } else {
                  if (!fg.a(param1.charAt(var2), 120)) {
                    break L1;
                  } else {
                    var2++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var3 <= var2) {
                    break L3;
                  } else {
                    if (!fg.a(param1.charAt(var3 - 1), 116)) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = var3 + -var2;
                if (var4 >= 1) {
                  if (12 >= var4) {
                    var5 = new StringBuilder(var4);
                    var6 = var2;
                    L4: while (true) {
                      if (var6 >= var3) {
                        if (-1 != (var5.length() ^ -1)) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        var7 = param1.charAt(var6);
                        if (qnb.a((byte) -128, (char) var7)) {
                          var8 = rr.a((char) var7, 102);
                          if (var8 != 0) {
                            StringBuilder discarded$1 = var5.append(var8);
                            var6++;
                            continue L4;
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 > -76) {
            jwa.d(-39);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 2;
    }
}
