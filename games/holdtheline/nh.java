/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends v implements pi {
    private qi field_I;
    private rm[] field_G;
    static String field_K;
    private int[] field_J;
    static String field_H;
    private String field_M;
    private int field_L;
    private ab field_F;

    public static void a(byte param0) {
        if (param0 != 25) {
            field_H = null;
            field_K = null;
            field_H = null;
            return;
        }
        field_K = null;
        field_H = null;
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        var6 = 0;
        L0: while (true) {
          if (((nh) this).field_L <= var6) {
            if (param2 != -4) {
              nh.a((byte) -38);
              return;
            } else {
              return;
            }
          } else {
            if (((nh) this).field_G[var6] == param1) {
              var7 = ((nh) this).field_J[var6];
              if (-1 != var7) {
                L1: {
                  go.a(0, ((nh) this).field_J[var6]);
                  if (param2 == -4) {
                    break L1;
                  } else {
                    nh.a((byte) -38);
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  ((nh) this).field_F.h((byte) -115);
                  if (param2 == -4) {
                    break L2;
                  } else {
                    nh.a((byte) -38);
                    break L2;
                  }
                }
                return;
              }
            } else {
              var6++;
              var6++;
              continue L0;
            }
          }
        }
    }

    final rm a(int param0, tb param1, String param2) {
        rm var4 = null;
        int var5 = 0;
        Object var6 = null;
        var4 = new rm(param2, param1);
        var4.field_l = (dh) (Object) new mo();
        var5 = -2 + ((nh) this).field_u;
        ((nh) this).a(0, (byte) 122, 0, 34 + ((nh) this).field_u, ((nh) this).field_x);
        var4.a(7, (byte) 122, var5, 30, -14 + ((nh) this).field_x);
        if (param0 < 43) {
          var6 = null;
          ((nh) this).a(-64, (rm) null, 28, 127, 42);
          ((nh) this).a(true, (n) (Object) var4);
          return var4;
        } else {
          ((nh) this).a(true, (n) (Object) var4);
          return var4;
        }
    }

    nh(ab param0, qi param1, String param2) {
        super(0, 0, 288, 0, (dh) null);
        ((nh) this).field_L = 0;
        ((nh) this).field_I = param1;
        ((nh) this).field_F = param0;
        ((nh) this).field_M = param2;
        int var4 = ((nh) this).field_M == null ? 0 : ((nh) this).field_I.b(((nh) this).field_M, 260, ((nh) this).field_I.field_G);
        ((nh) this).a(0, (byte) 122, 0, 22 - -var4, 288);
    }

    final static void h(int param0) {
        ol.field_f = param0;
        va.field_k = false;
        a.field_I = -1;
    }

    private final void a(int param0, byte param1) {
        rm[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        rm[] var7 = null;
        var6 = HoldTheLine.field_D;
        if (((nh) this).field_L >= param0) {
          return;
        } else {
          var7 = new rm[param0];
          var3 = var7;
          var4 = new int[param0];
          var5 = 0;
          L0: while (true) {
            if (((nh) this).field_L <= var5) {
              ((nh) this).field_L = param0;
              ((nh) this).field_J = var4;
              if (param1 <= 125) {
                return;
              } else {
                ((nh) this).field_G = var3;
                return;
              }
            } else {
              var7[var5] = ((nh) this).field_G[var5];
              var4[var5] = ((nh) this).field_J[var5];
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((nh) this).field_I.a(((nh) this).field_M, 14 + (((nh) this).field_k + param2), 10 + (((nh) this).field_o + param1), ((nh) this).field_x + -28, ((nh) this).field_u, 16777215, -1, 0, 0, ((nh) this).field_I.field_G);
    }

    final void a(int param0, String param1, byte param2) {
        int var4 = 0;
        var4 = ((nh) this).field_L;
        this.a(var4 - -1, (byte) 127);
        ((nh) this).field_G[var4] = ((nh) this).a(76, (tb) this, param1);
        if (param2 <= 52) {
          ((nh) this).field_G = null;
          ((nh) this).field_J[var4] = param0;
          return;
        } else {
          ((nh) this).field_J[var4] = param0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Achievements";
        field_H = "Account created successfully!";
    }
}
