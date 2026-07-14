/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ce extends vja {
    static int field_t;
    static int[][] field_w;
    int field_v;
    static volatile int field_x;
    static boolean field_y;
    static int[] field_u;

    ce(int param0, nq param1, int param2, boolean param3, boolean param4, boolean param5, int param6) {
        super(param0, param1, param2, param6, param3, param4, param5);
        ((ce) this).field_v = param6;
    }

    ce(int param0, lu param1) {
        super(param0, param1);
        if (!((ce) this).field_n) {
            ((ce) this).field_v = param1.b(16711935);
        }
    }

    public static void e(byte param0) {
        field_u = null;
        if (param0 <= 17) {
            return;
        }
        field_w = null;
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new rja(param1, (ce) this);
    }

    final static void a(boolean param0, int param1, int param2, String param3, int param4, boolean param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        k.c(3685);
        var14 = dg.field_e;
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var6 = var10;
        var7 = dg.field_i;
        var8 = dg.field_c;
        if (sca.field_a != null) {
          if (lo.field_b != null) {
            L0: {
              param2 = param2 - (lo.field_b.field_u + -lo.field_b.field_B);
              var9 = lo.field_b.a(param3);
              var9 += 10;
              sca.field_a.b();
              if (-2 == (1 & var9 ^ -1)) {
                var9++;
                break L0;
              } else {
                break L0;
              }
            }
            dg.d();
            if (param0) {
              lo.field_b.c(param3, 5, 3 + lo.field_b.field_u, 0, -1);
              dg.a(var14, var7, var8);
              fk.d((byte) 69);
              if (!param5) {
                fn.a(param1, (byte) 11, var9, param4, param2, sca.field_a);
                return;
              } else {
                fw.a(param4, sca.field_a, var9, param1, true, ap.field_c, param2);
                return;
              }
            } else {
              field_x = 120;
              lo.field_b.c(param3, 5, 3 + lo.field_b.field_u, 0, -1);
              dg.a(var14, var7, var8);
              fk.d((byte) 69);
              if (!param5) {
                fn.a(param1, (byte) 11, var9, param4, param2, sca.field_a);
                return;
              } else {
                fw.a(param4, sca.field_a, var9, param1, true, ap.field_c, param2);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(op param0, boolean param1) {
        aga var3 = null;
        t var4 = null;
        int var5 = 0;
        int var6 = 0;
        if (!((ce) this).field_r) {
          if (!((ce) this).field_n) {
            var3 = ((ce) this).field_l.a(69, param0);
            var4 = (t) (Object) al.a(120, ((ce) this).field_k);
            var5 = 0;
            if (var4.field_u != 15) {
              if (var4.field_u == 45) {
                var5 = 1;
                var6 = om.a(((ce) this).field_q, (byte) 25, var3.field_J, var5 != 0, ((ce) this).field_v, var3, var3.field_x, param0);
                ((ce) this).field_v = var6;
                var3.a(param1, ((ce) this).field_v, ((ce) this).field_q);
                this.a(param0, false);
                return;
              } else {
                L0: {
                  if (-47 == (var4.field_u ^ -1)) {
                    var5 = 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = om.a(((ce) this).field_q, (byte) 25, var3.field_J, var5 != 0, ((ce) this).field_v, var3, var3.field_x, param0);
                ((ce) this).field_v = var6;
                var3.a(param1, ((ce) this).field_v, ((ce) this).field_q);
                this.a(param0, false);
                return;
              }
            } else {
              var5 = 1;
              var6 = om.a(((ce) this).field_q, (byte) 25, var3.field_J, var5 != 0, ((ce) this).field_v, var3, var3.field_x, param0);
              ((ce) this).field_v = var6;
              var3.a(param1, ((ce) this).field_v, ((ce) this).field_q);
              this.a(param0, false);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(vr param0, int param1) {
        int var2 = 0;
        int var4 = 0;
        Object var5 = null;
        ft var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        Object var10 = null;
        ika var13 = null;
        ika var15 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        lr stackIn_6_0 = null;
        lr stackIn_7_0 = null;
        lr stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        lr stackIn_15_0 = null;
        lr stackIn_16_0 = null;
        lr stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        lr stackOut_14_0 = null;
        lr stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        lr stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        lr stackOut_5_0 = null;
        lr stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        lr stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        var5 = null;
        var9 = BachelorFridge.field_y;
        var2 = param0.a("", false);
        if (param1 != 15) {
          var10 = null;
          ce.a(false, -81, -123, (String) null, 28, false);
          var13 = new ika(param0.a((byte) 123, "", "manifest"));
          rn.field_u = var13.field_c;
          rs.field_g = new lr[rn.field_u];
          var4 = 0;
          var5_ref = (ft) (Object) var13.field_b.b((byte) 90);
          L0: while (true) {
            if (var5_ref == null) {
              vj.field_o = new Random();
              return;
            } else {
              L1: {
                var6 = var5_ref.field_g;
                var7 = var5_ref.field_f ? 1 : 0;
                var17 = param0.b(-102, var2, var6);
                rs.field_g[var4] = new lr(new lu(var17));
                if (var7 != 0) {
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                stackOut_14_0 = rs.field_g[var4];
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (var7 == 0) {
                  stackOut_16_0 = (lr) (Object) stackIn_16_0;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L2;
                } else {
                  stackOut_15_0 = (lr) (Object) stackIn_15_0;
                  stackOut_15_1 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L2;
                }
              }
              ((lr) (Object) stackIn_17_0).field_i = stackIn_17_1 != 0;
              var4++;
              rs.field_g[var4].field_g = var4;
              var5_ref = (ft) (Object) var13.field_b.c(0);
              continue L0;
            }
          }
        } else {
          var15 = new ika(param0.a((byte) 123, "", "manifest"));
          rn.field_u = var15.field_c;
          rs.field_g = new lr[rn.field_u];
          var4 = 0;
          var5_ref = (ft) (Object) var15.field_b.b((byte) 90);
          L3: while (true) {
            if (var5_ref == null) {
              vj.field_o = new Random();
              return;
            } else {
              L4: {
                var6 = var5_ref.field_g;
                var7 = var5_ref.field_f ? 1 : 0;
                var18 = param0.b(-102, var2, var6);
                rs.field_g[var4] = new lr(new lu(var18));
                if (var7 != 0) {
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                stackOut_5_0 = rs.field_g[var4];
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var7 == 0) {
                  stackOut_7_0 = (lr) (Object) stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L5;
                } else {
                  stackOut_6_0 = (lr) (Object) stackIn_6_0;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L5;
                }
              }
              ((lr) (Object) stackIn_8_0).field_i = stackIn_8_1 != 0;
              var4++;
              rs.field_g[var4].field_g = var4;
              var5_ref = (ft) (Object) var15.field_b.c(0);
              continue L3;
            }
          }
        }
    }

    final void a(byte param0, lu param1) {
        Object var4 = null;
        if (param0 < -12) {
          this.a((byte) -95, param1);
          if (!((ce) this).field_n) {
            param1.d(((ce) this).field_v, 0);
            return;
          } else {
            return;
          }
        } else {
          var4 = null;
          ce.a(false, -33, 20, (String) null, -110, true);
          this.a((byte) -95, param1);
          if (((ce) this).field_n) {
            return;
          } else {
            param1.d(((ce) this).field_v, 0);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[11][];
        field_w[1] = new int[3];
        field_w[2] = new int[3];
        field_w[6] = new int[3];
        field_w[0] = new int[3];
        field_w[5] = new int[3];
        field_w[4] = new int[3];
        field_w[3] = new int[3];
        field_t = 0;
        field_x = 0;
        field_u = new int[]{45, 32, 28, 33, 14};
    }
}
