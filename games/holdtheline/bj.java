/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends v implements qa, pi {
    private vm field_K;
    static String field_I;
    private cj field_F;
    static ah field_O;
    private rm field_M;
    static int[] field_L;
    static String field_J;
    static String field_N;
    static int field_G;

    public static void h(int param0) {
        field_N = null;
        field_L = null;
        field_J = null;
        field_O = null;
        field_I = null;
        if (param0 != -9251) {
            field_L = null;
        }
    }

    public final void a(cj param0, int param1, byte param2, int param3) {
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        if (param2 == -106) {
          if (param1 != -1) {
            if (-2 != param1) {
              if (2 == param1) {
                oc.a(16711680, "conduct.ws");
                return;
              } else {
                return;
              }
            } else {
              oc.a(16711680, "privacy.ws");
              return;
            }
          } else {
            oc.a(param2 + 16711786, "terms.ws");
            return;
          }
        } else {
          ((bj) this).field_F = null;
          if (param1 != -1) {
            if (-2 != param1) {
              if (2 != param1) {
                return;
              } else {
                oc.a(16711680, "conduct.ws");
                return;
              }
            } else {
              oc.a(16711680, "privacy.ws");
              return;
            }
          } else {
            oc.a(param2 + 16711786, "terms.ws");
            return;
          }
        }
    }

    private final String a(byte param0) {
        int var2 = 35 / ((-66 - param0) / 52);
        return "</col></u>";
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        if (param2 != -4) {
          L0: {
            String discarded$4 = this.g((byte) 9);
            if (((bj) this).field_M == param1) {
              hk.a(true);
              ((bj) this).field_K.h((byte) -103);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((bj) this).field_M == param1) {
              hk.a(true);
              ((bj) this).field_K.h((byte) -103);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final String g(byte param0) {
        if (param0 >= -84) {
            ((bj) this).field_M = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    bj(vm param0) {
        super(0, 0, 288, 0, (dh) null);
        ((bj) this).field_K = param0;
        ((bj) this).field_M = new rm(sf.field_j, (tb) null);
        ((bj) this).field_M.field_l = (dh) (Object) new mo();
        String var7 = sd.a(ta.field_b, new String[2], true);
        int var3 = 20;
        dk var4 = new dk(hl.field_g, 0, 0, 0, 0, 16777215, -1, 3, 0, hl.field_g.field_G, -1, 2147483647, true);
        ((bj) this).field_F = new cj(var7, (dh) (Object) var4);
        ((bj) this).field_F.field_z = "";
        ((bj) this).field_F.a(0, m.field_d, true);
        ((bj) this).field_F.a(1, m.field_d, true);
        ((bj) this).field_F.field_t = (tb) this;
        ((bj) this).field_F.field_x = -40 + ((bj) this).field_x;
        ((bj) this).field_F.a(-40 + ((bj) this).field_x, (byte) -64, var3, 26);
        var3 = var3 + (((bj) this).field_F.field_u - -15);
        ((bj) this).a(true, (n) (Object) ((bj) this).field_F);
        int var5 = 4;
        int var6 = 200;
        ((bj) this).field_M.a(300 + -var6 >> 172202081, (byte) 122, var3, 40, var6);
        ((bj) this).field_M.field_t = (tb) this;
        ((bj) this).a(true, (n) (Object) ((bj) this).field_M);
        ((bj) this).a(0, (byte) 122, 0, 55 + (var3 + var5), 300);
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (98 != param1) {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((bj) this).b(param0, 121);
            }
          } else {
            return ((bj) this).c(param0, -1);
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Best: ";
        field_O = new ah();
        field_J = "Mine";
        field_L = new int[4];
        field_N = "Use this alternative as your account name";
    }
}
