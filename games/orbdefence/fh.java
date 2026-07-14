/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fh {
    static String field_b;
    int field_f;
    java.awt.Image field_a;
    int[] field_d;
    static boolean field_c;
    int field_e;

    final void a(int param0) {
        if (param0 != -40) {
          ((fh) this).field_e = -67;
          ul.a(((fh) this).field_d, ((fh) this).field_e, ((fh) this).field_f);
          return;
        } else {
          ul.a(((fh) this).field_d, ((fh) this).field_e, ((fh) this).field_f);
          return;
        }
    }

    final static gj a(int param0, int param1, int param2, int param3, byte param4) {
        gj var5 = null;
        gj var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        var5 = (gj) (Object) cb.field_b.b((byte) -106);
        L0: while (true) {
          if (var5 != null) {
            if (var5_ref.field_o == param2) {
              return var5_ref;
            } else {
              var5 = (gj) (Object) cb.field_b.d(853);
              continue L0;
            }
          } else {
            var5_ref = new gj();
            var5_ref.field_o = param2;
            var6 = 102 / ((41 - param4) / 45);
            var5_ref.field_m = param3;
            var5_ref.field_n = param0;
            cb.field_b.a(-92, (ca) (Object) var5_ref);
            se.a(var5_ref, param1, -38);
            return var5_ref;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param0 == 17489) {
                Object discarded$1 = gm.a(true, "resizing", new Object[1], uj.b((byte) -120));
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, boolean param3);

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -26) {
            field_c = true;
        }
    }

    final static void a(ki param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        se var8 = null;
        int var9 = 0;
        se var10 = null;
        wd var11 = null;
        int[] var12 = null;
        wd var13 = null;
        wd var13_ref = null;
        int[] var14 = null;
        wd var15 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        var8 = new se(param0.a("", 1, "logo.fo3d"));
        var10 = var8;
        var3 = var10.b((byte) 90);
        var10.n(9471);
        cg.field_c = mc.a(12, var10);
        if (param1 == -237) {
          tc.field_a = new wd[var3];
          ne.field_a = new int[var3][];
          var4 = 0;
          L0: while (true) {
            if (var3 <= var4) {
              var10.m(param1 ^ -236);
              var9 = 0;
              var4 = var9;
              L1: while (true) {
                if (var3 <= var9) {
                  return;
                } else {
                  var11 = tc.field_a[var9];
                  var13 = var11;
                  var15 = var13;
                  var13 = var11;
                  var11.a(3940, 6, 6, 6, 1);
                  var11.a(2);
                  var12 = new int[]{var11.field_d + var11.field_P >> -1872967935, var11.field_J + var11.field_F >> -1580754783, var11.field_v - -var11.field_z >> -619516767};
                  ne.field_a[var9] = var12;
                  var11.a((byte) 7, -var12[1], -var12[2], -var12[0]);
                  var9++;
                  continue L1;
                }
              }
            } else {
              tc.field_a[var4] = f.a(var8, 16);
              var4++;
              continue L0;
            }
          }
        } else {
          fh.a((byte) -39);
          tc.field_a = new wd[var3];
          ne.field_a = new int[var3][];
          var4 = 0;
          L2: while (true) {
            if (var3 <= var4) {
              var10.m(param1 ^ -236);
              var9 = 0;
              var4 = var9;
              L3: while (true) {
                if (var3 <= var9) {
                  return;
                } else {
                  var13_ref = tc.field_a[var9];
                  var15 = var13_ref;
                  var15 = var13_ref;
                  var13_ref.a(3940, 6, 6, 6, 1);
                  var13_ref.a(2);
                  var14 = new int[]{var13_ref.field_d + var13_ref.field_P >> -1872967935, var13_ref.field_J + var13_ref.field_F >> -1580754783, var13_ref.field_v - -var13_ref.field_z >> -619516767};
                  ne.field_a[var9] = var14;
                  var13_ref.a((byte) 7, -var14[1], -var14[2], -var14[0]);
                  var9++;
                  continue L3;
                }
              }
            } else {
              tc.field_a[var4] = f.a(var8, 16);
              var4++;
              continue L2;
            }
          }
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        Object var5 = null;
        L0: {
          bl.field_n.c(param3, param1);
          if (param0 == 8) {
            break L0;
          } else {
            var5 = null;
            fh.a((ki) null, 88);
            break L0;
          }
        }
        if (param2) {
          L1: {
            var4 = 2 * (le.field_c % bl.field_n.field_o);
            if (bl.field_n.field_o > var4) {
              break L1;
            } else {
              var4 = -var4 + bl.field_n.field_o + bl.field_n.field_o;
              break L1;
            }
          }
          if (10 <= var4) {
            if (-40 + bl.field_n.field_o >= var4) {
              hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
              return;
            } else {
              var4 = -40 + bl.field_n.field_o;
              hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
              return;
            }
          } else {
            var4 = 10;
            hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
            return;
          }
        } else {
          return;
        }
    }

    final static hj[] a(ki param0, int param1, byte param2, int param3) {
        Object var5 = null;
        if (param2 <= -74) {
          if (!pk.a(-128, param3, param0, param1)) {
            return null;
          } else {
            return lm.a(-127);
          }
        } else {
          var5 = null;
          hj[] discarded$7 = fh.a((ki) null, -76, (byte) -18, -119);
          if (!pk.a(-128, param3, param0, param1)) {
            return null;
          } else {
            return lm.a(-127);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_c = true;
    }
}
