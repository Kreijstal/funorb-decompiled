/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements io {
    static vn field_b;
    static int field_a;
    static vo field_d;
    static int field_c;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        var6 = 0;
        L0: while (true) {
          if (param3.field_n < var6) {
            L1: {
              var6 = 1;
              if (param0 == 16777215) {
                break L1;
              } else {
                field_a = -128;
                break L1;
              }
            }
            L2: while (true) {
              if ((var6 ^ -1) < -6) {
                return;
              } else {
                L3: {
                  var7 = -5 + (param4 + param3.field_k + param3.field_i) + (-(param3.field_i >> -1152658431) - -var6);
                  var8 = -(var6 * 2) + (param3.field_i >> -1908965599);
                  var9 = var6 + ((param3.field_n - 4 >> -773591327) + param3.field_j) + param2;
                  if (bi.field_l > var9) {
                    break L3;
                  } else {
                    if (bi.field_d <= var9) {
                      break L3;
                    } else {
                      L4: {
                        if (bi.field_g >= var7) {
                          break L4;
                        } else {
                          bi.field_c[var9 * bi.field_f + var7 - 1] = eg.a(bi.field_c[-1 + (var9 * bi.field_f - -var7)], 16711422) >> 968036257;
                          break L4;
                        }
                      }
                      if (var8 + var7 >= bi.field_b) {
                        break L3;
                      } else {
                        bi.field_c[bi.field_f * var9 - (-var7 - var8)] = eg.a(bi.field_c[var8 + (bi.field_f * var9 + var7)] >> 1393669633, 8355711);
                        break L3;
                      }
                    }
                  }
                }
                bi.b(var7, var9, var8, 0);
                var6++;
                continue L2;
              }
            }
          } else {
            var7 = 152 - -(48 * var6 / param3.field_n);
            var8 = var7 | (var7 << 1487286064 | var7 << -1471539416);
            bi.b(param3.field_k + param4, var6 + param2 - -param3.field_j, param3.field_i, var8);
            var6++;
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            Object var2 = null;
            eb.a((int[]) null, 39, 33, 88, 74);
        }
        field_b = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = ZombieDawn.field_J;
        while (true) {
            param2--;
            if (param2 < 0) {
                break;
            }
            var9 = param0;
            int[] var5 = var9;
            var6 = param3;
            var7 = param4;
            var9[var6] = var7 + eg.a(var9[var6] >> 1306761793, 8355711);
            param3++;
        }
        if (param1 != 1393669633) {
            field_c = -108;
        }
    }

    static {
    }
}
