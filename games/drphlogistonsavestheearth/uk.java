/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk implements cg {
    static int field_g;
    static nh field_f;
    static he[] field_b;
    private rf field_c;
    private int field_a;
    static int field_e;
    private int field_d;
    static he field_h;

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        h var4 = null;
        int var4_int = 0;
        nl var5_ref_nl = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        lh var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var9 = dh.field_N;
          var2 = var9.l(31760);
          var3 = var9.l(31760);
          if (0 == var2) {
            var4 = (h) (Object) eg.field_c.h(-11151);
            if (var4 == null) {
              eg.a((byte) 126);
              return;
            } else {
              L1: {
                var5 = gf.field_C + -var9.field_j;
                var13 = var4.field_j;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var5 > var13.length << -805860862) {
                  var5 = var13.length << 606923970;
                  break L1;
                } else {
                  break L1;
                }
              }
              var7 = 0;
              L2: while (true) {
                if (var7 >= var5) {
                  var4.field_i = true;
                  var4.a(param0 + 14939);
                  break L0;
                } else {
                  var6[var7 >> 55852258] = var6[var7 >> 55852258] + (var9.l(31760) << (rk.a(var7, 3) << -1335338680));
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              gb.a((Throwable) null, "LR1: " + al.a(param0 ^ 31183), 10);
              eg.a((byte) 126);
              break L0;
            } else {
              var4_int = var9.f(param0 + 33464);
              var5_ref_nl = (nl) (Object) gf.field_A.h(-11151);
              L3: while (true) {
                L4: {
                  if (var5_ref_nl == null) {
                    break L4;
                  } else {
                    L5: {
                      if (var3 != var5_ref_nl.field_j) {
                        break L5;
                      } else {
                        if (var5_ref_nl.field_l != var4_int) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var5_ref_nl = (nl) (Object) gf.field_A.e(0);
                    continue L3;
                  }
                }
                if (var5_ref_nl == null) {
                  eg.a((byte) 126);
                  return;
                } else {
                  var5_ref_nl.a(-16175);
                  break L0;
                }
              }
            }
          }
        }
        L6: {
          if (param0 == -31114) {
            break L6;
          } else {
            field_b = null;
            break L6;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_h = null;
        if (param0) {
            uk.a(true);
        }
        field_b = null;
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 >= 94) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2.field_n) {
              break L2;
            } else {
              if (!param2.a(true)) {
                stackOut_6_0 = 2188450;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 3249872;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        L3: {
          var6 = stackIn_7_0;
          int discarded$1 = ((uk) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param2.field_p + "</u>", param4 - -param2.field_o, param2.field_m + param3, param2.field_w, param2.field_k, var6, -1, ((uk) this).field_d, ((uk) this).field_a, ((uk) this).field_c.field_S + ((uk) this).field_c.field_x);
          if (param2.a(true)) {
            L4: {
              var7 = ((uk) this).field_c.b(param2.field_p);
              var8 = ((uk) this).field_c.field_S + ((uk) this).field_c.field_x;
              var9 = param4 + param2.field_o;
              if (2 == ((uk) this).field_d) {
                var9 = var9 + (param2.field_w - var7);
                break L4;
              } else {
                if ((((uk) this).field_d ^ -1) == -2) {
                  var9 = var9 + (-var7 + param2.field_w >> -301236511);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var10 = param2.field_m + param3;
              if (2 != ((uk) this).field_a) {
                if ((((uk) this).field_a ^ -1) != -2) {
                  break L5;
                } else {
                  var10 = var10 + (param2.field_k + -var8 >> -534106591);
                  break L5;
                }
              } else {
                var10 = var10 + (-var8 + param2.field_k);
                break L5;
              }
            }
            ce.a(var8, -2 + var9, -16579, var7 - -4, 2 + var10);
            break L3;
          } else {
            break L3;
          }
        }
    }

    public uk() {
        ((uk) this).field_d = 1;
        ((uk) this).field_a = 1;
        ((uk) this).field_c = uh.field_i;
    }

    uk(rf param0, int param1, int param2) {
        ((uk) this).field_a = param2;
        ((uk) this).field_d = param1;
        ((uk) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 20;
    }
}
