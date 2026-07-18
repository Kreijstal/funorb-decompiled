/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int field_c;
    static cf[] field_a;
    static String field_e;
    static String field_b;
    static String field_d;

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        vg var3_ref_vg = null;
        int var3 = 0;
        li var4 = null;
        int var4_int = 0;
        byte[] var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        bv var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -17) {
                break L1;
              } else {
                field_c = -14;
                break L1;
              }
            }
            var8 = mg.field_e;
            var2 = var8.k(0);
            if (var2 != 0) {
              if (var2 == 1) {
                var3 = var8.i(1);
                var4 = (li) (Object) s.field_e.e((byte) 92);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_o == var3) {
                        break L3;
                      } else {
                        var4 = (li) (Object) s.field_e.a((byte) 123);
                        continue L2;
                      }
                    }
                  }
                  if (var4 == null) {
                    dj.a((byte) -125);
                    return;
                  } else {
                    var4.d(-102);
                    break L0;
                  }
                }
              } else {
                af.a((Throwable) null, 76, "A1: " + cm.b(false));
                dj.a((byte) -128);
                return;
              }
            } else {
              var3_ref_vg = (vg) (Object) oe.field_Bb.e((byte) 98);
              if (var3_ref_vg != null) {
                L4: {
                  var4_int = var8.k(0);
                  if (var4_int != 0) {
                    var12 = new byte[var4_int];
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var7 = var9;
                    var5 = var7;
                    var8.a(0, var4_int, 0, var12);
                    break L4;
                  } else {
                    var5 = null;
                    break L4;
                  }
                }
                var8.field_q = var8.field_q + 4;
                if (!var8.j(4215)) {
                  dj.a((byte) -126);
                  return;
                } else {
                  var3_ref_vg.field_n = true;
                  var3_ref_vg.field_s = var5;
                  var3_ref_vg.d(29);
                  return;
                }
              } else {
                dj.a((byte) -126);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "cd.D(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        gp.field_e = null;
        lf.field_g = null;
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (rs.field_q != 13) {
          if (rs.field_q == 102) {
            qd.field_I.f((byte) -106);
            return true;
          } else {
            if (qd.field_I != null) {
              if (!qd.field_I.a(false, param0, param1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          qu.e(-3);
          return true;
        }
    }

    final static boolean c(int param0) {
        if (ee.field_v == null) {
            return false;
        }
        if (null == ee.field_v.a((byte) 89)) {
            return false;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        lf.field_h[uc.field_d[param0][2]].h(48 + param1, param2 + 12);
        km.field_h[0].h(param1 + 46, param2 + 10);
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 2;
        field_a = new cf[3];
        field_b = "You have declined the invitation.";
        field_d = "Off";
    }
}
