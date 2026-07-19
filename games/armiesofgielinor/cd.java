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
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        bv var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
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
            L2: {
              L3: {
                var8 = mg.field_e;
                var2 = var8.k(0);
                if (var2 != 0) {
                  break L3;
                } else {
                  var3_ref_vg = (vg) ((Object) oe.field_Bb.e((byte) 98));
                  if (var3_ref_vg != null) {
                    L4: {
                      L5: {
                        var4_int = var8.k(0);
                        if (var4_int != 0) {
                          break L5;
                        } else {
                          var5 = null;
                          if (var6 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var10 = new byte[var4_int];
                      var9 = var10;
                      var7 = var9;
                      var5 = var7;
                      var8.a(0, var4_int, 0, var10);
                      break L4;
                    }
                    var8.field_q = var8.field_q + 4;
                    if (!var8.j(4215)) {
                      dj.a((byte) -126);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3_ref_vg.field_n = true;
                      var3_ref_vg.field_s = (byte[]) (var5);
                      var3_ref_vg.d(29);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    dj.a((byte) -126);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L6: {
                if (var2 == 1) {
                  break L6;
                } else {
                  af.a((Throwable) null, 76, "A1: " + cm.b(false));
                  dj.a((byte) -128);
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L6;
                  }
                }
              }
              var3 = var8.i(1);
              var4 = (li) ((Object) s.field_e.e((byte) 92));
              L7: while (true) {
                L8: {
                  L9: {
                    if (var4 == null) {
                      break L9;
                    } else {
                      stackOut_20_0 = var4.field_o;
                      stackIn_26_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var6 != 0) {
                        break L8;
                      } else {
                        if (stackIn_21_0 == var3) {
                          break L9;
                        } else {
                          var4 = (li) ((Object) s.field_e.a((byte) 123));
                          continue L7;
                        }
                      }
                    }
                  }
                  if (var4 == null) {
                    stackOut_25_0 = -125;
                    stackIn_26_0 = stackOut_25_0;
                    break L8;
                  } else {
                    var4.d(-102);
                    break L2;
                  }
                }
                dj.a((byte) stackIn_26_0);
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "cd.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        gp.field_e = null;
        if (param0 != 12) {
            field_b = (String) null;
            lf.field_g = null;
            return;
        }
        lf.field_g = null;
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
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
        } else {
          field_a = (cf[]) null;
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
          field_d = (String) null;
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
          field_d = (String) null;
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
        field_c = 2;
        field_a = new cf[3];
        field_b = "You have declined the invitation.";
        field_d = "Off";
    }
}
