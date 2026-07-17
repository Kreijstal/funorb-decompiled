/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    int[] field_i;
    static int field_c;
    static String field_b;
    static int[] field_f;
    int field_e;
    static String field_h;
    static int field_a;
    static int field_g;
    int field_d;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Chess.field_G;
        if (param1 == -1) {
          if (((fj) this).field_i == null) {
            return 0;
          } else {
            if (((fj) this).field_i.length != 0) {
              var3 = 1;
              L0: while (true) {
                if (var3 >= ((fj) this).field_i.length) {
                  return ((fj) this).field_i.length + -1;
                } else {
                  if (((fj) this).field_i[var3] + ((fj) this).field_i[-1 + var3] >> 1 > param0) {
                    return var3 - 1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              return 0;
            }
          }
        } else {
          return 55;
        }
    }

    public static void a() {
        int var1 = 0;
        field_f = null;
        field_h = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        nk var3 = qn.field_U;
        var3.f(param0, -109);
        var3.c(param1, (byte) -79);
        var3.c(8, (byte) -113);
        var3.b(param2, 116);
    }

    final static void a(String param0, int param1, int param2, String param3, int param4) {
        try {
            eg.field_f.field_S = param3;
            eg.field_f.field_ib = param4;
            eg.field_f.field_M = eg.field_f.field_M + uc.field_c.field_M;
            eg.field_f.field_db = param0;
            uc.field_c.field_mb = uc.field_c.field_mb + uc.field_c.field_M;
            uc.field_c.field_M = 0;
            eg.field_f.field_M = eg.field_f.field_M - uc.field_c.field_M;
            uc.field_c.field_mb = uc.field_c.field_mb - uc.field_c.field_M;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "fj.F(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + -1 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void a(int param0) {
        fi.a(-393711775);
        int discarded$0 = 16777215;
        bk.a();
        pj.field_h = null;
        int discarded$1 = 0;
        rc.b();
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ld discarded$2 = fj.a(117, 25, -75, -73);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((fj) this).field_i) {
              break L2;
            } else {
              if (0 != ((fj) this).field_i.length) {
                stackOut_6_0 = ((fj) this).field_i[((fj) this).field_i.length + -1];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    fj(int param0, int param1, int param2) {
        ((fj) this).field_d = param0;
        ((fj) this).field_i = new int[1 + param2];
        ((fj) this).field_e = param1;
    }

    final static ld a(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ld var8_ref_ld = null;
        int var9 = 0;
        ld var9_ref_ld = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        L0: {
          var13 = Chess.field_G;
          ac.field_j.field_Kb.field_I.e(-31023);
          var4 = null;
          var5 = 0;
          if (param3 == 8) {
            break L0;
          } else {
            fj.a(71, 83, -95);
            break L0;
          }
        }
        var6 = 0;
        var7 = qf.field_c - 1;
        L1: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L2: while (true) {
              if (var8 >= qf.field_c) {
                L3: {
                  var8 = ac.field_j.field_Kb.field_pb - -ac.field_j.field_Kb.field_N - (-var6 + var7);
                  ac.field_j.field_Kb.field_V = ac.field_j.field_Kb.field_V + var8;
                  ac.field_j.field_Kb.field_pb = ac.field_j.field_Kb.field_pb - var8;
                  if (tj.field_l) {
                    ac.field_j.field_Kb.field_pb = var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ac.field_j.field_Kb.field_N = var7 + -ac.field_j.field_Kb.field_pb;
                  if (tj.field_l) {
                    tj.field_l = false;
                    ac.field_j.field_Kb.field_V = -ac.field_j.field_Kb.field_pb + ac.field_j.field_Jb.field_pb;
                    fl.field_j = true;
                    ac.field_j.field_Kb.field_vb = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!kn.field_L) {
                    break L5;
                  } else {
                    if (ac.field_l != null) {
                      fl.field_j = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var9 = -ac.field_j.field_Kb.field_pb + -ac.field_j.field_Kb.field_N + ac.field_j.field_Jb.field_pb;
                  if (!fl.field_j) {
                    break L6;
                  } else {
                    ac.field_j.field_Kb.field_vb = var9 + -ac.field_j.field_Kb.field_V;
                    break L6;
                  }
                }
                L7: {
                  ac.field_j.a((byte) -109, param2, true, param1 * 2 * param2);
                  if (ac.field_j.field_Kb.field_V + ac.field_j.field_Kb.field_vb != var9) {
                    stackOut_43_0 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    break L7;
                  } else {
                    stackOut_42_0 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    break L7;
                  }
                }
                fl.field_j = stackIn_44_0 != 0;
                return (ld) var4;
              } else {
                var9_ref_ld = ik.field_i[var8];
                if (var9_ref_ld.field_f != null) {
                  ac.field_j.field_Kb.a((byte) 124, var9_ref_ld.field_f);
                  var9_ref_ld.field_f.a(param0, var9_ref_ld.field_f.e((byte) 89), param3 + 2147483640, param2, var7);
                  var7 = var7 + param2;
                  if (var9_ref_ld.field_f.field_L != 0) {
                    var4 = (Object) (Object) var9_ref_ld;
                    var8++;
                    continue L2;
                  } else {
                    var8++;
                    continue L2;
                  }
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            L8: {
              var8_ref_ld = ik.field_i[var7];
              var9 = 0;
              if (qf.field_b) {
                break L8;
              } else {
                if (fh.field_b > var5) {
                  var10_int = lg.a(param3 ^ -43, var8_ref_ld.field_k);
                  if (var10_int <= var8_ref_ld.b(2)) {
                    L9: {
                      if (var8_ref_ld.field_d) {
                        break L9;
                      } else {
                        int discarded$1 = -19554;
                        if (va.a(var8_ref_ld.field_i)) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var9 = 1;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
            }
            if (var9 != 0) {
              L10: {
                var5++;
                if (null == var8_ref_ld.field_f) {
                  break L10;
                } else {
                  if (tj.field_l) {
                    break L10;
                  } else {
                    var7--;
                    continue L1;
                  }
                }
              }
              L11: {
                if (var8_ref_ld.field_f == null) {
                  s.field_O = s.field_O + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              var10 = mn.a((byte) -30, var8_ref_ld);
              var11 = var10 + lh.a(var8_ref_ld.field_n);
              var12 = wh.a(param3 ^ -9, var8_ref_ld);
              var8_ref_ld.field_f = new ci(0L, eh.field_M, var11);
              var8_ref_ld.field_f.field_ib = var12;
              var8_ref_ld.field_f.field_xb = sc.field_a;
              var6 = var6 + param2;
              var8_ref_ld.field_f.field_P = -(8355711 & var12 >> 1) + var12 - -((eh.field_M.field_P & 16711423) >> 1);
              var8_ref_ld.field_f.field_O = var12 + -((16711423 & var12) >> 1) - -((16711422 & eh.field_M.field_O) >> 1);
              var7--;
              continue L1;
            } else {
              var8_ref_ld.field_f = null;
              var7--;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_b = "This option cannot be combined with the current '<%0>' setting.";
        field_c = 0;
    }
}
