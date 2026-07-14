/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ig extends gg implements pe {
    private sl field_l;
    static String field_k;
    static dd field_i;
    static so field_h;
    static qr field_j;

    public final void a(sl param0, int param1) {
        ((ig) this).b(11755);
        int var3 = -31 % ((-43 - param1) / 35);
    }

    final String f(int param0) {
        int var2 = -69 % ((param0 - -30) / 45);
        return ((ig) this).a(((ig) this).field_l.field_m, 0);
    }

    public final boolean d(int param0) {
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -3) {
          if (((ig) this).field_l.field_m != null) {
            if (((ig) this).field_l.field_m.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = null;
          ((ig) this).a((sl) null, false);
          if (((ig) this).field_l.field_m == null) {
            return true;
          } else {
            L0: {
              if (((ig) this).field_l.field_m.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    abstract na a(String param0, boolean param1);

    public final void a(sl param0, boolean param1) {
        if (param1) {
            field_k = null;
        }
    }

    ig(sl param0) {
        ((ig) this).field_l = param0;
    }

    abstract String a(String param0, int param1);

    final static void a(dd param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        if ((3 & (param0.field_z | param0.field_A | param0.field_G | param0.field_B)) == 0) {
          return;
        } else {
          if (param1 != -12) {
            return;
          } else {
            var2 = (param0.field_G & 3) + param0.field_z;
            var2 = 4 - (3 & var2) + var2;
            var3 = (param0.field_B & 3) + param0.field_A;
            var3 = -(var3 & 3) - -4 + var3;
            var4 = new int[var3 * var2];
            var5 = 0;
            var6 = var2 * (3 & param0.field_B) + (3 & param0.field_G);
            var7 = 0;
            L0: while (true) {
              if (param0.field_A <= var7) {
                param0.field_G = param0.field_G & -4;
                param0.field_B = param0.field_B & -4;
                param0.field_D = var4;
                param0.field_z = var2;
                param0.field_A = var3;
                return;
              } else {
                var8 = 0;
                L1: while (true) {
                  if (param0.field_z <= var8) {
                    var6 = var6 + (var2 - param0.field_z);
                    var7++;
                    continue L0;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = param0.field_D[var5];
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_k = null;
        field_j = null;
        if (param0 < 85) {
            return;
        }
        field_h = null;
    }

    final na g(int param0) {
        Object var3 = null;
        if (param0 != -14836) {
          var3 = null;
          ((ig) this).a((sl) null, 41);
          return ((ig) this).a(((ig) this).field_l.field_m, true);
        } else {
          return ((ig) this).a(((ig) this).field_l.field_m, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Unable to delete name - system busy";
    }
}
