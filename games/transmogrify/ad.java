/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ad {
    String[][] field_c;
    private byte[][] field_a;
    private byte[][] field_g;
    private byte[][] field_h;
    static boolean field_e;
    int field_d;
    static String field_f;
    static volatile int field_b;

    private final boolean b(byte param0, char[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= param1.length + -2) {
            var3 = -1 + param1.length;
            if (param0 < -15) {
              L1: while (true) {
                if (var3 < 2) {
                  return true;
                } else {
                  var4 = 1;
                  var7 = var3;
                  var5 = var7;
                  L2: while (true) {
                    if (-1 >= (var7 ^ -1)) {
                      var4 = this.a(0, var4, de.a(106, param1[var7]), ((ad) this).field_g);
                      if (var4 != 0) {
                        if (!this.a(var4, ((ad) this).field_g, true)) {
                          var7--;
                          continue L2;
                        } else {
                          return false;
                        }
                      } else {
                        var3--;
                        continue L1;
                      }
                    } else {
                      var3--;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            var4 = 1;
            var5 = var3;
            L3: while (true) {
              if (param1.length > var5) {
                var4 = this.a(0, var4, de.a(33, param1[var5]), ((ad) this).field_g);
                if (var4 != 0) {
                  if (!this.a(var4, ((ad) this).field_g, true)) {
                    var5++;
                    continue L3;
                  } else {
                    return false;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean a(byte param0, char[] param1) {
        if (param0 <= 34) {
            field_f = null;
        }
        return this.a(0, param1, (byte) -118) == param1.length ? true : false;
    }

    private final boolean a(int param0, byte[][] param1, boolean param2) {
        if (!param2) {
            int discarded$0 = this.a(-77, 118, (byte) -37, (byte[][]) null);
        }
        return (param1[param0][0] ^ -1) == 0 ? true : false;
    }

    final static ti[] a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -101 / ((param3 - 78) / 48);
        ti[] var6 = new ti[9];
        var6[6] = cd.a(param1, param4, (byte) -20);
        var6[3] = cd.a(param1, param4, (byte) -20);
        var6[2] = cd.a(param1, param4, (byte) -20);
        var6[1] = cd.a(param1, param4, (byte) -20);
        var6[0] = cd.a(param1, param4, (byte) -20);
        var6[8] = cd.a(param2, param4, (byte) -31);
        var6[7] = cd.a(param2, param4, (byte) -31);
        var6[5] = cd.a(param2, param4, (byte) -31);
        if (!(-1 == (param0 ^ -1))) {
            var6[4] = cd.a(param0, 64, (byte) -103);
        }
        return var6;
    }

    final void a(oa param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        int var5 = 0;
        byte[] var4 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        ((ad) this).field_h = new byte[param0.i(17783)][];
        for (var3 = 0; ((ad) this).field_h.length > var3; var3++) {
            var4_int = (byte)param0.d((byte) 84);
            var5 = param0.c((byte) -124);
            ((ad) this).field_h[var3] = new byte[1 + var5];
            ((ad) this).field_h[var3][0] = (byte)var4_int;
            ji.a(param0.field_g, param0.field_h, ((ad) this).field_h[var3], 1, var5);
            param0.field_h = param0.field_h + var5;
        }
        ((ad) this).field_g = new byte[param0.i(17783)][];
        for (var3 = 0; ((ad) this).field_g.length > var3; var3++) {
            var4_int = (byte)param0.d((byte) 104);
            var5 = param0.c((byte) -117);
            ((ad) this).field_g[var3] = new byte[1 + var5];
            ((ad) this).field_g[var3][0] = (byte)var4_int;
            ji.a(param0.field_g, param0.field_h, ((ad) this).field_g[var3], 1, var5);
            param0.field_h = param0.field_h + var5;
        }
        var3 = 0;
        if (param1 != 1) {
            return;
        }
        while (((ad) this).field_a.length > var3) {
            ((ad) this).field_a[var3] = new byte[param0.c((byte) -109)];
            var4 = new byte[param0.c((byte) -109)];
            param0.a(var4.length, param1 + 1, var4, 0);
            var3++;
        }
    }

    ad(int param0, int param1) {
        ((ad) this).field_a = new byte[257][];
        ((ad) this).field_d = param0;
        ((ad) this).field_c = new String[param1][2];
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_e = true;
        }
        field_f = null;
    }

    private final int a(int param0, int param1, byte param2, byte[][] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            ((ad) this).field_h = null;
            break L0;
          }
        }
        L1: {
          if (param1 != 1) {
            break L1;
          } else {
            if (1 == param3.length) {
              return 0;
            } else {
              break L1;
            }
          }
        }
        am.field_q.field_g = param3[param1];
        am.field_q.field_h = 1;
        var5 = 255 & param2;
        var6 = -1;
        var7 = -1;
        L2: while (true) {
          if (var5 <= var6) {
            return var7;
          } else {
            var7 = am.field_q.i(param0 ^ 17783);
            if (var7 == 0) {
              var6 = var6 + (am.field_q.i(param0 ^ 17783) - -1);
              continue L2;
            } else {
              var6++;
              continue L2;
            }
          }
        }
    }

    final void a(char[] param0, Random param1, boolean param2, int param3) {
        int var6 = 0;
        byte[] var7 = null;
        int var8 = Transmogrify.field_A ? 1 : 0;
        if (param0.length == 0) {
            return;
        }
        int var5 = 256;
        for (var6 = 0; param0.length > var6; var6++) {
            var7 = ((ad) this).field_a[param2 ? 256 : var5];
            var5 = var7[li.a(var7.length, param1, false)] & 255;
            param0[var6] = di.a(68, (byte)var5);
        }
        // ifeq L11
        if (param3 != 3670) {
            boolean discarded$0 = this.a(-50, (byte[][]) null, true);
        }
    }

    private final int a(int param0, char[] param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        var4 = 0;
        var5 = 1;
        var6 = param0;
        if (param2 < -112) {
          L0: while (true) {
            L1: {
              if (var6 >= param1.length) {
                break L1;
              } else {
                L2: {
                  var7 = 0;
                  if (-1 == (param1[var6] ^ -1)) {
                    break L2;
                  } else {
                    var7 = de.a(11, param1[var6]);
                    break L2;
                  }
                }
                var5 = this.a(0, var5, (byte) var7, ((ad) this).field_h);
                if (var5 != 0) {
                  if (this.a(var5, ((ad) this).field_h, true)) {
                    var4 = var6 - param0 + 1;
                    var6++;
                    continue L0;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            return var4;
          }
        } else {
          return 92;
        }
    }

    final static void a(jc param0, int param1, int param2, ci param3) {
        tf.field_a = wi.b(-125) * param1 / 1000;
        kf.a(param3, (byte) -80);
        sd.a(param3, true);
        v.a((byte) 118, param3);
        if (param2 != 22313) {
            field_f = null;
        }
        rd.a(true);
        ra.a(0);
        si.field_l = -tf.field_a + 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_f = "To server list";
        field_b = 0;
    }
}
