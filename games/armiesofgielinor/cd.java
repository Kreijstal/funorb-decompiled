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
        int var2 = 0;
        vg var3_ref_vg = null;
        int var3 = 0;
        li var4 = null;
        int var4_int = 0;
        li var4_ref = null;
        byte[] var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        bv var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        li var13 = null;
        vg var14 = null;
        bv var15 = null;
        byte[] var16 = null;
        Object var32 = null;
        Object var35 = null;
        Object var37 = null;
        li var37_ref = null;
        Object var39 = null;
        bv var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var47 = null;
        var32 = null;
        var35 = null;
        var37 = null;
        var39 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= -17) {
          var40 = mg.field_e;
          var2 = var40.k(0);
          if (var2 != 0) {
            if (var2 == 1) {
              var3 = var40.i(1);
              var4 = (li) (Object) s.field_e.e((byte) 92);
              L0: while (true) {
                L1: {
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (var4.field_o == var3) {
                      break L1;
                    } else {
                      var4 = (li) (Object) s.field_e.a((byte) 123);
                      continue L0;
                    }
                  }
                }
                if (var4 == null) {
                  dj.a((byte) -125);
                  return;
                } else {
                  var4.d(-102);
                  return;
                }
              }
            } else {
              af.a((Throwable) null, 76, "A1: " + cm.b(false));
              dj.a((byte) -128);
              return;
            }
          } else {
            var14 = (vg) (Object) oe.field_Bb.e((byte) 98);
            if (var14 != null) {
              L2: {
                var4_int = var40.k(0);
                if (var4_int != 0) {
                  var47 = new byte[var4_int];
                  var41 = var47;
                  var10 = var41;
                  var9 = var10;
                  var7 = var9;
                  var5 = var7;
                  var40.a(0, var4_int, 0, var47);
                  break L2;
                } else {
                  var5 = null;
                  break L2;
                }
              }
              var40.field_q = var40.field_q + 4;
              if (!var40.j(4215)) {
                dj.a((byte) -126);
                return;
              } else {
                var14.field_n = true;
                var14.field_s = var5;
                var14.d(29);
                return;
              }
            } else {
              dj.a((byte) -126);
              return;
            }
          }
        } else {
          field_c = -14;
          var15 = mg.field_e;
          var8 = var15;
          var2 = var15.k(0);
          if (var2 != 0) {
            if (var2 == 1) {
              var3 = var15.i(1);
              var37_ref = (li) (Object) s.field_e.e((byte) 92);
              var4_ref = var37_ref;
              L3: while (true) {
                if (var37_ref != null) {
                  if (var37_ref.field_o != var3) {
                    var13 = (li) (Object) s.field_e.a((byte) 123);
                    continue L3;
                  } else {
                    if (var4_ref == null) {
                      dj.a((byte) -125);
                      return;
                    } else {
                      var37_ref.d(-102);
                      return;
                    }
                  }
                } else {
                  if (var37_ref == null) {
                    dj.a((byte) -125);
                    return;
                  } else {
                    var37_ref.d(-102);
                    return;
                  }
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
                var4_int = var15.k(0);
                if (var4_int != 0) {
                  var42 = new byte[var4_int];
                  var16 = var42;
                  var10 = var16;
                  var9 = var10;
                  var7 = var9;
                  var5 = var7;
                  var15.a(0, var4_int, 0, var42);
                  break L4;
                } else {
                  var5 = null;
                  break L4;
                }
              }
              var15.field_q = var15.field_q + 4;
              if (!var15.j(4215)) {
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
    }

    final static void a(int param0) {
        gp.field_e = null;
        if (param0 != 12) {
            field_b = null;
            lf.field_g = null;
            return;
        }
        lf.field_g = null;
    }

    final static boolean a(int param0, int param1, boolean param2) {
        int stackIn_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        if (!param2) {
          if (rs.field_q != 13) {
            if ((rs.field_q ^ -1) == -103) {
              qd.field_I.f((byte) -106);
              return true;
            } else {
              L0: {
                L1: {
                  if (qd.field_I == null) {
                    break L1;
                  } else {
                    if (!qd.field_I.a(param2, param0, param1)) {
                      break L1;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L0;
                    }
                  }
                }
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
              return stackIn_21_0 != 0;
            }
          } else {
            qu.e(-3);
            return true;
          }
        } else {
          field_a = null;
          if (rs.field_q != 13) {
            if ((rs.field_q ^ -1) == -103) {
              qd.field_I.f((byte) -106);
              return true;
            } else {
              if (qd.field_I != null) {
                if (!qd.field_I.a(param2, param0, param1)) {
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
    }

    final static boolean c(int param0) {
        if (param0 == 9501) {
          if (ee.field_v != null) {
            if (null == ee.field_v.a((byte) 89)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = null;
          if (ee.field_v != null) {
            if (null == ee.field_v.a((byte) 89)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        lf.field_h[uc.field_d[param0][param3]].h(48 + param1, param2 + 12);
        km.field_h[0].h(param1 + 46, param2 + 10);
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
          field_d = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          return;
        }
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
