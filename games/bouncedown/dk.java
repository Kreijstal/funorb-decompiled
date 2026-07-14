/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static int field_a;
    static String field_b;
    static int field_c;

    final static void a(int param0, int param1, wi param2, int param3, java.math.BigInteger param4, java.math.BigInteger param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Bounce.field_N;
          var7 = ca.a(param0, (byte) 27);
          if (null == ug.field_g) {
            ug.field_g = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if ((var9 ^ -1) <= -5) {
            L2: {
              L3: {
                if (ae.field_a == null) {
                  break L3;
                } else {
                  if (var7 <= ae.field_a.field_i.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ae.field_a = new wi(var7);
              break L2;
            }
            L4: {
              L5: {
                ae.field_a.field_h = 0;
                ae.field_a.a(param1, true, param0, param6);
                ae.field_a.a(var7, false);
                ae.field_a.a(var15, 4);
                if (null == fb.field_jb) {
                  break L5;
                } else {
                  if ((fb.field_jb.field_i.length ^ -1) <= -101) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              fb.field_jb = new wi(100);
              break L4;
            }
            fb.field_jb.field_h = 0;
            fb.field_jb.a(10, (byte) 54);
            var11 = param3;
            var9 = var11;
            L6: while (true) {
              if (4 <= var11) {
                fb.field_jb.e(param3 ^ -750655096, param0);
                fb.field_jb.a((byte) 50, param5, param4);
                param2.a(0, true, fb.field_jb.field_h, fb.field_jb.field_i);
                param2.a(0, true, ae.field_a.field_h, ae.field_a.field_i);
                return;
              } else {
                fb.field_jb.b(var15[var11], (byte) -46);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = ug.field_g.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static lj a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        var2 = param1.length();
        if (-1 == (var2 ^ -1)) {
          return uc.field_E;
        } else {
          if ((var2 ^ -1) >= param0) {
            var3 = 0;
            L0: while (true) {
              if (var2 > var3) {
                var4 = param1.charAt(var3);
                if (var4 == 45) {
                  L1: {
                    if (0 == var3) {
                      break L1;
                    } else {
                      if (var3 == -1 + var2) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return mh.field_R;
                } else {
                  if (0 == (vh.field_g.indexOf(var4) ^ -1)) {
                    return mh.field_R;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return lk.field_t;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        if (param0) {
            field_a = 1;
        }
        int var3 = 1 << param1;
        if (0 != (ui.field_g & var3)) {
            return;
        }
        kb.field_a = kb.field_a | var3;
        ui.field_g = ui.field_g | var3;
        ci.field_F.a(1, (ai) (Object) new ab(param1));
        if (jh.b(767564065)) {
            m.field_c.a(1, (ai) (Object) new ke(param1, param2, qf.field_c, vg.field_j, nb.field_a, ve.field_a));
        } else {
            ke discarded$0 = hc.a(param1, vg.field_j, param2, qf.field_c, 4, (byte) -127, ve.field_a, nb.field_a);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for graphics";
        field_a = 0;
    }
}
