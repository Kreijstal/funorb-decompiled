/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb {
    static int[] field_d;
    private byte[][] field_i;
    private byte[][] field_e;
    static String field_a;
    static ti field_b;
    private byte[][] field_h;
    static ng field_f;
    int field_g;
    String[][] field_c;

    final void a(wf param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        ((eb) this).field_e = new byte[param0.g((byte) -122)][];
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((eb) this).field_e.length) {
            L1: {
              ((eb) this).field_i = new byte[param0.g((byte) -104)][];
              if (param1 >= 26) {
                break L1;
              } else {
                ((eb) this).field_g = 72;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (((eb) this).field_i.length <= var3) {
                var3 = 0;
                L3: while (true) {
                  if (((eb) this).field_h.length <= var3) {
                    return;
                  } else {
                    ((eb) this).field_h[var3] = new byte[param0.d((byte) 19)];
                    var4 = new byte[param0.d((byte) 19)];
                    param0.a(96, var4.length, 0, var4);
                    var3++;
                    continue L3;
                  }
                }
              } else {
                var4_int = (byte)param0.d(true);
                var5 = param0.d((byte) 19);
                ((eb) this).field_i[var3] = new byte[1 + var5];
                ((eb) this).field_i[var3][0] = (byte)var4_int;
                o.a(param0.field_j, param0.field_h, ((eb) this).field_i[var3], 1, var5);
                param0.field_h = param0.field_h + var5;
                var3++;
                continue L2;
              }
            }
          } else {
            var4_int = (byte)param0.d(true);
            var5 = param0.d((byte) 19);
            ((eb) this).field_e[var3] = new byte[var5 - -1];
            ((eb) this).field_e[var3][0] = (byte)var4_int;
            o.a(param0.field_j, param0.field_h, ((eb) this).field_e[var3], 1, var5);
            param0.field_h = param0.field_h + var5;
            var3++;
            continue L0;
          }
        }
    }

    final static String c(byte param0) {
        if (param0 <= 72) {
            db discarded$0 = eb.a((byte) -10);
        }
        if (af.field_b) {
            return null;
        }
        if (dj.field_b > ug.field_m) {
            return null;
        }
        if (!(ik.field_j + dj.field_b <= ug.field_m)) {
            return nc.field_p;
        }
        return null;
    }

    private final boolean a(int param0, byte[][] param1, byte param2) {
        int var4 = -18 % ((51 - param2) / 49);
        return param1[param0][0] == -1 ? true : false;
    }

    final static db a(byte param0) {
        int var4_int = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        int var1 = bd.field_m[0] * pb.field_h[0];
        byte[] var2 = be.field_f[0];
        int[] var3 = new int[var1];
        int var5 = -59 % ((param0 - -55) / 54);
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = ci.field_b[vg.a(255, (int) var2[var4_int])];
        }
        db var4 = new db(uc.field_fb, eh.field_b, mg.field_x[0], rg.field_c[0], pb.field_h[0], bd.field_m[0], var3);
        gk.a(12428);
        return var4;
    }

    private final int a(byte[][] param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (1 != param2) {
            break L0;
          } else {
            if (param0.length == 1) {
              return 0;
            } else {
              break L0;
            }
          }
        }
        ne.field_a.field_j = param0[param2];
        ne.field_a.field_h = param1;
        var5 = 255 & param3;
        var6 = -1;
        var7 = -1;
        L1: while (true) {
          if (var6 >= var5) {
            return var7;
          } else {
            var7 = ne.field_a.g((byte) -109);
            if (var7 != 0) {
              var6++;
              continue L1;
            } else {
              var6 = var6 + (1 + ne.field_a.g((byte) -93));
              continue L1;
            }
          }
        }
    }

    final void a(char[] param0, Random param1, boolean param2, int param3) {
        int var6 = 0;
        byte[] var7 = null;
        int var8 = Lexicominos.field_L ? 1 : 0;
        if (param3 != 256) {
            boolean discarded$0 = this.a(20, (byte[][]) null, (byte) -51);
        }
        if (!(param0.length != 0)) {
            return;
        }
        int var5 = 256;
        for (var6 = 0; param0.length > var6; var6++) {
            var7 = ((eb) this).field_h[param2 ? 256 : var5];
            var5 = 255 & var7[rh.a(param3 + 14561, param1, var7.length)];
            param0[var6] = el.a((byte)var5, (byte) 26);
        }
        // ifeq L41
    }

    final static void a(int param0, oj param1, int param2, db param3, char param4, int param5, int param6) {
        cg.a(param1.field_f, param3, param2, param5, (byte) -72, param1.field_b, param6, param4);
        if (param0 <= 3) {
            Object var8 = null;
            eb.a(121, (oj) null, 17, (db) null, 'ﾍ', 59, 10);
        }
    }

    public static void b(byte param0) {
        if (param0 != -100) {
            Object var2 = null;
            eb.a(-23, (oj) null, -39, (db) null, 'ﾡ', 117, 22);
        }
        field_a = null;
        field_f = null;
        field_b = null;
        field_d = null;
    }

    private final boolean a(char[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= -2 + param0.length) {
            var3 = -1 + param0.length;
            L1: while (true) {
              if (var3 < 2) {
                var3 = -16 % ((-46 - param1) / 46);
                return true;
              } else {
                var4 = 1;
                var7 = var3;
                var5 = var7;
                L2: while (true) {
                  if (-1 >= (var7 ^ -1)) {
                    var4 = this.a(((eb) this).field_i, 1, var4, ua.a(true, param0[var7]));
                    if (var4 != 0) {
                      if (this.a(var4, ((eb) this).field_i, (byte) -35)) {
                        return false;
                      } else {
                        var7--;
                        continue L2;
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
            var4 = 1;
            var5 = var3;
            L3: while (true) {
              if (param0.length > var5) {
                var4 = this.a(((eb) this).field_i, 1, var4, ua.a(true, param0[var5]));
                if (var4 != 0) {
                  if (!this.a(var4, ((eb) this).field_i, (byte) -61)) {
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

    final int a(char[] param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        var4 = 0;
        var5 = 1;
        var6 = param2;
        L0: while (true) {
          L1: {
            if (var6 >= param0.length) {
              break L1;
            } else {
              L2: {
                var7 = 0;
                if (param0[var6] != 0) {
                  var7 = ua.a(true, param0[var6]);
                  break L2;
                } else {
                  break L2;
                }
              }
              var5 = this.a(((eb) this).field_e, 1, var5, (byte) var7);
              if (-1 != (var5 ^ -1)) {
                if (this.a(var5, ((eb) this).field_e, (byte) -113)) {
                  var4 = 1 + (-param2 + var6);
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
          var7 = 25 % ((60 - param1) / 44);
          return var4;
        }
    }

    eb(int param0, int param1) {
        ((eb) this).field_h = new byte[257][];
        ((eb) this).field_c = new String[param1][2];
        ((eb) this).field_g = param0;
    }

    final static int d(byte param0) {
        if (param0 != -6) {
            return 81;
        }
        return ph.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "OF";
    }
}
