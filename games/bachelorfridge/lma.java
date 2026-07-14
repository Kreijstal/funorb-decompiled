/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lma extends ana {
    static String field_z;
    private taa field_v;
    static ee field_y;
    static String field_A;
    static int field_x;
    private bea field_w;

    private final void e(int param0) {
        int var2 = 28 % ((51 - param0) / 62);
    }

    private final void d(int param0) {
        aga var2 = null;
        pp var3 = null;
        ad var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = ((lma) this).field_w.field_l.a(56, ((lma) this).field_q.field_h);
        if (var2.i(-109)) {
          return;
        } else {
          var3 = (pp) (Object) ((lma) this).field_w.field_o.b((byte) 90);
          if (param0 != 6) {
            return;
          } else {
            oha discarded$1 = al.a(param0 ^ -103, ((lma) this).field_w.field_k);
            L0: while (true) {
              if (var3 == null) {
                return;
              } else {
                var4 = var3.field_h.a(param0 ^ -27455, ((lma) this).field_q);
                var4.b(-1, 6);
                var3.a(var2, ((lma) this).field_q.field_h, 12);
                var3 = (pp) (Object) ((lma) this).field_w.field_o.c(param0 + -6);
                continue L0;
              }
            }
          }
        }
    }

    private final void f(int param0) {
        hd var2 = null;
        op var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hd var8 = null;
        var7 = BachelorFridge.field_y;
        var8 = (hd) (Object) al.a(-79, ((lma) this).field_w.field_k);
        var2 = var8;
        var3 = ((lma) this).field_q.field_h;
        aga discarded$5 = ((lma) this).field_w.field_l.a(90, ((lma) this).field_q.field_h);
        int[][] discarded$6 = ((lma) this).field_w.c(false);
        var4 = param0;
        L0: while (true) {
          if (((lma) this).field_w.field_r.length <= var4) {
            ((lma) this).field_w.a(((lma) this).field_q.field_h, false);
            return;
          } else {
            var5 = ((lma) this).field_w.field_r[var4][0];
            var6 = ((lma) this).field_w.field_r[var4][1];
            if ((var5 ^ -1) <= -1) {
              if (var3.field_z > var5) {
                if (var6 >= 0) {
                  if (var6 < var3.field_B) {
                    uea discarded$7 = new uea(((lma) this).field_q, var5, var6, gma.field_e[var8.field_q].field_a);
                    var4++;
                    continue L0;
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                var4++;
                continue L0;
              }
            } else {
              var4++;
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void g(int param0) {
        if (param0 != -1111) {
            return;
        }
        field_y = null;
        field_A = null;
        field_z = null;
    }

    final boolean c(byte param0) {
        int var2 = -119 / ((param0 - 71) / 47);
        if (((lma) this).field_m.a((byte) -106)) {
            return false;
        }
        if (((lma) this).field_v.a((byte) -106)) {
            return false;
        }
        ((lma) this).field_l = ((lma) this).field_l - 1;
        if (!(0 > ((lma) this).field_l - 1)) {
            if (((lma) this).field_l == 25) {
                this.f(0);
                this.d(6);
                return false;
            }
            return false;
        }
        this.e(118);
        return true;
    }

    final static nv a(sna param0, int[] param1, sna param2, int param3, sna param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        nv[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        pda var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = BachelorFridge.field_y;
                    var5 = param1.length;
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    var8 = new nv[var5];
                    var9 = 49;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = param3;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 <= var10_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = cea.field_h.a(param3 ^ -22834, param1[var10_int]);
                        var6[var10_int] = var11.d((byte) 80);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 6: {
                    return new nv(0L, param0, param4, param2, var8, param1, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    lma(gj param0, bea param1) {
        super(param0, (bca) (Object) param1);
        ((lma) this).field_w = param1;
        ((lma) this).field_v = new taa(((lma) this).field_q, ((lma) this).field_w.field_q, ((lma) this).field_w.field_t);
        ((lma) this).a(27799, (at) (Object) ((lma) this).field_v);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Fly immunity!";
        field_z = "Add name";
        field_x = 0;
    }
}
