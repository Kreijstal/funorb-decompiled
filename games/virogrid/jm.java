/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String field_a;
    d field_c;
    static km field_b;
    static String field_d;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        ((jm) this).field_c.a(var6, param3, param4, param0 + -22397, var7, param1, param2);
        ee.field_e.a(0, pg.field_e, dg.field_E.field_K, (byte) -90, 0);
        se.field_c.a(0, 18, dg.field_E.field_K + (-oc.field_k - 2 - 82), (byte) -65, pg.field_e + 2);
        if (param0 != 36) {
            boolean discarded$0 = jm.a((byte) 30);
        }
        wb.field_m.a(-80 + -oc.field_k + (dg.field_E.field_K - 2), 18, oc.field_k + 82, (byte) -45, 2 + pg.field_e);
        ve.field_q.a(dg.field_E.field_K, 0, 2, -20 + (-2 + -pg.field_e + dg.field_E.field_ub), oc.field_k, 20 + (2 + pg.field_e), 20, 0);
        lg.field_a.a(oc.field_k, 2, 20, 0);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    final static hh a(boolean param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        int var2 = param1.length();
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (!param0) {
            field_a = null;
        }
        return jj.field_f;
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != -2) {
            field_b = null;
        }
        j.field_b = param0;
        si.field_a = param0;
        tm.field_g = param1;
        si.field_b = param1;
        fk.a(param0, param1);
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 != -102) {
            field_b = null;
        }
        vf.field_c = param0;
        if (!(db.field_D == ve.field_t)) {
            var2 = ve.field_t * ve.field_t;
            var3 = -(db.field_D * db.field_D) + var2;
            param0 = param0 + (-param0 + p.field_h) * var3 / var2;
        }
        we.field_c.a(oh.field_f, 120, 640, (byte) -120, param0);
        ql.a((byte) 117, 5, 640, qi.field_d, 0, -24 + p.field_h, dl.field_b);
    }

    final static boolean a(int param0, int param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          if (2 > param0) {
            break L0;
          } else {
            if (36 >= param0) {
              L1: {
                var4 = 0;
                if (param1 > 85) {
                  break L1;
                } else {
                  jm.a(88);
                  break L1;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (0 == var8) {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param2) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var9 < 97) {
                      return false;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (param0 <= var9) {
                    return false;
                  } else {
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = param0 * var6 - -var9;
                    if (var6 == var10 / param0) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    jm(String param0, km param1) {
        String[] var3 = new String[]{param0, ng.field_Y, tl.field_k};
        km[] var4 = new km[]{param1, dg.field_E, (km) (Object) lg.field_a};
        ((jm) this).field_c = new d(0L, ve.field_w, var3, sl.field_h, var4, 0);
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = -125 / ((58 - param0) / 50);
            if (an.field_b) {
              break L1;
            } else {
              if (!qm.i(20)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, int[] param1, int param2, boolean param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        while (true) {
            param0--;
            if (param0 < 0) {
                break;
            }
            var9 = param1;
            int[] var5 = var9;
            var6 = param2;
            var7 = param4;
            var9[var6] = var7 + rb.a(8355711, var9[var6] >> -857011967);
            param2++;
        }
        if (!param3) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection lost - attempting to reconnect";
        field_d = "Quit";
    }
}
