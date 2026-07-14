/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends v implements pi {
    static int field_L;
    static int[] field_I;
    private rm field_K;
    static char field_M;
    static h field_N;
    static lo field_G;
    private rm field_P;
    private rm field_F;
    static va field_O;
    static fg field_H;
    static String field_J;

    final boolean a(n param0, int param1, byte param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (param1 != 98) {
            if (param1 == 99) {
              return ((pk) this).b(param0, param2 ^ -51);
            } else {
              return false;
            }
          } else {
            return ((pk) this).c(param0, -1);
          }
        } else {
          return true;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public pk() {
        super(0, 0, 476, 225, (dh) null);
        ((pk) this).field_K = new rm(fo.field_m, (tb) null);
        ((pk) this).field_P = new rm(um.field_c, (tb) null);
        ((pk) this).field_F = new rm(ue.field_a, (tb) null);
        mo var1 = new mo();
        ((pk) this).field_K.field_l = (dh) (Object) var1;
        ((pk) this).field_P.field_l = (dh) (Object) var1;
        ((pk) this).field_F.field_l = (dh) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -420194047;
        ((pk) this).field_P.a(-var3 + ((pk) this).field_x >> 242728801, (byte) 122, -var2 + (-48 + ((pk) this).field_u), 30, var4);
        ((pk) this).field_F.a((-var3 + ((pk) this).field_x >> 1029805697) - -var4 + var2, (byte) 122, -48 + (((pk) this).field_u - var2), 30, var4);
        ((pk) this).field_K.a(((pk) this).field_x + -var3 >> -283029759, (byte) 122, -(2 * var2) + -78 + ((pk) this).field_u, 30, var3);
        ((pk) this).field_P.field_t = (tb) this;
        ((pk) this).field_K.field_t = (tb) this;
        ((pk) this).field_K.field_z = ml.field_b;
        ((pk) this).field_F.field_t = (tb) this;
        ((pk) this).field_F.field_z = wc.field_j;
        ((pk) this).a(true, (n) (Object) ((pk) this).field_P);
        ((pk) this).a(true, (n) (Object) ((pk) this).field_K);
        ((pk) this).a(true, (n) (Object) ((pk) this).field_F);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((pk) this).field_k - -param2;
        int var6 = param1 + ((pk) this).field_o;
        int discarded$0 = hl.field_g.a(de.field_P, var5 - -20, 20 + var6, ((pk) this).field_x - 40, ((pk) this).field_u - 50, 16777215, -1, 1, 0, hl.field_g.field_G);
        super.a(param0, param1, param2, param3);
    }

    public static void h(int param0) {
        if (param0 != -25335) {
            return;
        }
        field_N = null;
        field_H = null;
        field_O = null;
        field_G = null;
        field_J = null;
        field_I = null;
    }

    final static sh a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        var2 = param1.length();
        if (0 == var2) {
          return fo.field_k;
        } else {
          if (63 < var2) {
            return wb.field_h;
          } else {
            var3 = 0;
            var4 = 43 / ((param0 - -45) / 35);
            L0: while (true) {
              if (var2 > var3) {
                var5 = param1.charAt(var3);
                if (45 != var5) {
                  if (0 == (rc.field_e.indexOf(var5) ^ -1)) {
                    return qj.field_F;
                  } else {
                    var3++;
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (0 == var3) {
                      break L1;
                    } else {
                      if (-1 + var2 == var3) {
                        break L1;
                      } else {
                        var3++;
                        var3++;
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return qj.field_F;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        if (param2 == -4) {
          if (param1 != ((pk) this).field_P) {
            if (param1 != ((pk) this).field_K) {
              if (param1 == ((pk) this).field_F) {
                rl.h(0);
                return;
              } else {
                return;
              }
            } else {
              qj.h((byte) 83);
              return;
            }
          } else {
            rm.h(param2 + 88);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[128];
        field_N = new h();
        field_J = "Email is valid";
    }
}
