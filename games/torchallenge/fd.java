/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fd implements Iterable {
    static lj field_c;
    static long field_e;
    da[] field_a;
    static int field_f;
    static int field_g;
    private da field_b;
    static ka field_h;
    int field_d;

    final void a(byte param0, da param1, long param2) {
        da var5 = null;
        if (null == param1.field_h) {
          var5 = ((fd) this).field_a[(int)((long)(((fd) this).field_d - 1) & param2)];
          if (param0 < 2) {
            return;
          } else {
            param1.field_f = var5;
            param1.field_h = var5.field_h;
            param1.field_h.field_f = param1;
            param1.field_d = param2;
            param1.field_f.field_h = param1;
            return;
          }
        } else {
          param1.a(true);
          var5 = ((fd) this).field_a[(int)((long)(((fd) this).field_d - 1) & param2)];
          if (param0 < 2) {
            return;
          } else {
            param1.field_f = var5;
            param1.field_h = var5.field_h;
            param1.field_h.field_f = param1;
            param1.field_d = param2;
            param1.field_f.field_h = param1;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 0) {
            return;
        }
        field_h = null;
    }

    final static void a(byte param0, ka param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        if (-1 != (3 & (param1.field_x | param1.field_u | param1.field_s | param1.field_p) ^ -1)) {
          var2 = (3 & param1.field_s) + param1.field_u;
          var2 = 4 - ((var2 & 3) - var2);
          var3 = param1.field_x - -(param1.field_p & 3);
          var3 = 4 + -(var3 & 3) + var3;
          var4 = new int[var2 * var3];
          var5 = 0;
          if (param0 != -44) {
            field_h = null;
            var6 = (3 & param1.field_p) * var2 + (param1.field_s & 3);
            var7 = 0;
            L0: while (true) {
              if (param1.field_x <= var7) {
                param1.field_x = var3;
                param1.field_u = var2;
                param1.field_p = param1.field_p & -4;
                param1.field_y = var4;
                param1.field_s = param1.field_s & -4;
                return;
              } else {
                var8 = 0;
                L1: while (true) {
                  if (param1.field_u <= var8) {
                    var6 = var6 + (var2 + -param1.field_u);
                    var7++;
                    continue L0;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param1.field_y[var5];
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var6 = (3 & param1.field_p) * var2 + (param1.field_s & 3);
            var7 = 0;
            L2: while (true) {
              if (param1.field_x <= var7) {
                param1.field_x = var3;
                param1.field_u = var2;
                param1.field_p = param1.field_p & -4;
                param1.field_y = var4;
                param1.field_s = param1.field_s & -4;
                return;
              } else {
                var8 = 0;
                L3: while (true) {
                  if (param1.field_u <= var8) {
                    var6 = var6 + (var2 + -param1.field_u);
                    var7++;
                    continue L2;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param1.field_y[var5];
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        bg.field_K.c(0, (ee) (Object) new ih());
        if (param0 != -2068) {
            field_h = null;
        }
    }

    final static boolean a(qk param0, int param1, qk param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param1 > 49) {
            break L0;
          } else {
            var5 = null;
            fd.a((byte) -65, (ka) null);
            break L0;
          }
        }
        L1: {
          var3 = param0.field_ob + -param2.field_ob;
          if (param0.field_mb == me.field_d) {
            // wide iinc 3 -200
            break L1;
          } else {
            if (null == param0.field_mb) {
              // wide iinc 3 200
              break L1;
            } else {
              break L1;
            }
          }
        }
        if (me.field_d != param2.field_mb) {
          if (null != param2.field_mb) {
            L2: {
              if ((var3 ^ -1) >= -1) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              // wide iinc 3 -200
              if ((var3 ^ -1) >= -1) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            return stackIn_16_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if ((var3 ^ -1) >= -1) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    final da a(int param0, long param1) {
        da var4 = null;
        da var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        var4 = ((fd) this).field_a[(int)(param1 & (long)(-1 + ((fd) this).field_d))];
        if (param0 > 72) {
          ((fd) this).field_b = var4.field_f;
          L0: while (true) {
            if (((fd) this).field_b != var4) {
              if (param1 != ((fd) this).field_b.field_d) {
                ((fd) this).field_b = ((fd) this).field_b.field_f;
                continue L0;
              } else {
                var5 = ((fd) this).field_b;
                ((fd) this).field_b = ((fd) this).field_b.field_f;
                return var5;
              }
            } else {
              ((fd) this).field_b = null;
              return null;
            }
          }
        } else {
          var7 = null;
          boolean discarded$1 = fd.a((qk) null, -124, (qk) null);
          ((fd) this).field_b = var4.field_f;
          L1: while (true) {
            if (((fd) this).field_b != var4) {
              if (param1 != ((fd) this).field_b.field_d) {
                ((fd) this).field_b = ((fd) this).field_b.field_f;
                continue L1;
              } else {
                var5 = ((fd) this).field_b;
                ((fd) this).field_b = ((fd) this).field_b.field_f;
                return var5;
              }
            } else {
              ((fd) this).field_b = null;
              return null;
            }
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new md((fd) this);
    }

    final static void a(byte param0) {
        fe var1 = null;
        int var2 = 0;
        var1 = cj.field_h[9];
        var2 = ab.field_g[9];
        var1.field_l = var1.field_k.length;
        if (param0 != -86) {
          return;
        } else {
          pg.field_p = nc.a(var1, 100, var2);
          pg.field_p.e(-1);
          pg.field_p.e(0, var1.field_k.length);
          ok.field_a = we.a(pg.field_p, 6222);
          return;
        }
    }

    private fd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 9;
    }
}
