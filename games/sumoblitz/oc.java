/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends rq {
    static int field_f;
    static int field_e;
    static long field_g;

    final void a(boolean param0, int param1) {
        if (param1 != 20186) {
            return;
        }
        ((oc) this).field_b.a(true, true);
    }

    oc(aw param0) {
        super(param0);
    }

    final static void a(ah param0, boolean param1) {
        int var2 = 0;
        nm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ah var11 = null;
        cb var12 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (db.field_l <= var2) {
            var12 = new cb(is.field_c);
            var3 = (nm) (Object) var12.b((byte) -80);
            if (!param1) {
              L1: while (true) {
                if (var3 == null) {
                  L2: {
                    if (-param0.field_m + param0.field_C >= 6656) {
                      break L2;
                    } else {
                      param0.field_C = param0.field_C + (26 << 9 - -param0.field_m);
                      break L2;
                    }
                  }
                  L3: {
                    if ((-param0.field_m + param0.field_z ^ -1) > -6657) {
                      param0.field_z = param0.field_z + (26 << param0.field_m + 9);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param0.field_m + param0.field_C <= rj.field_c + -26 << 613162376) {
                      break L4;
                    } else {
                      param0.field_C = param0.field_C - (26 << 9 - -param0.field_m);
                      break L4;
                    }
                  }
                  L5: {
                    if (rl.field_k - 26 << 533514344 >= param0.field_m + param0.field_z) {
                      break L5;
                    } else {
                      param0.field_z = param0.field_z - (26 << 9 - -param0.field_m);
                      break L5;
                    }
                  }
                  var4 = 0;
                  L6: while (true) {
                    if (var4 >= db.field_l) {
                      L7: {
                        if (aa.field_a.length > db.field_l) {
                          db.field_l = db.field_l + 1;
                          aa.field_a[db.field_l] = param0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      return;
                    } else {
                      if (aa.field_a[var4] == null) {
                        if (var4 != 0) {
                          aa.field_a[var4] = param0;
                          return;
                        } else {
                          var4++;
                          continue L6;
                        }
                      } else {
                        var4++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  L8: {
                    var4 = (var3.field_m << 1304536040) + param0.field_m;
                    if (!wn.a(param0.field_z, var4, -114, var3.field_q, param0.field_C, var3.field_l)) {
                      break L8;
                    } else {
                      L9: {
                        var5 = -var3.field_q + param0.field_C;
                        if (var5 == 0) {
                          var5 = -1 + (2 & iw.field_b << -500754367);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        var6 = -var3.field_l + param0.field_z;
                        if (var6 == 0) {
                          var6 = -1 + ((iw.field_b & 1) << 1095891649);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var7 = (int)Math.round(Math.sqrt((double)((float)var6 * (float)var6 + (float)var5 * (float)var5)));
                      if (var4 > var7) {
                        var8 = var5 * (-var7 + var4) / var7;
                        param0.field_C = param0.field_C + (var8 << 326972737);
                        var9 = (var4 - var7) * var6 / var7;
                        param0.field_z = param0.field_z + (var9 << 1467127937);
                        break L8;
                      } else {
                        var3 = (nm) (Object) var12.b(0);
                        continue L1;
                      }
                    }
                  }
                  var3 = (nm) (Object) var12.b(0);
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            var11 = aa.field_a[var2];
            if (var11 != null) {
              var4 = var11.field_m - -param0.field_m;
              if (wn.a(var11.field_z, var4, -104, param0.field_C, var11.field_C, param0.field_z)) {
                L11: {
                  var5 = -var11.field_C + param0.field_C;
                  var6 = param0.field_z + -var11.field_z;
                  if (var5 == 0) {
                    var5 = -1 + (2 & iw.field_b << -973964671);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var6 != 0) {
                    break L12;
                  } else {
                    var6 = ((1 & iw.field_b) << 1213738753) + -1;
                    break L12;
                  }
                }
                var7 = (int)Math.round(Math.sqrt((double)((float)var5 * (float)var5 + (float)var6 * (float)var6)));
                if (var4 > var7) {
                  var8 = var5 * (-var7 + var4) / var7;
                  var9 = (var4 + -var7) * var6 / var7;
                  param0.field_C = param0.field_C + var8;
                  param0.field_z = param0.field_z + var9;
                  var11.field_C = var11.field_C - var8;
                  var11.field_z = var11.field_z - var9;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static int d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          var1 = 0;
          if (param0 == 17079) {
            break L0;
          } else {
            field_f = -57;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 25) {
            return var1;
          } else {
            if (wm.field_f[var2]) {
              var1++;
              var2++;
              continue L1;
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(String param0, boolean param1, byte param2) {
        lc.field_A = true;
        int var3 = -70 % ((param2 - -39) / 44);
        ih.field_c = param1 ? true : false;
        hc.field_c = new gt(rf.field_a, tq.field_a, param0, pg.field_a, ih.field_c);
        rf.field_a.a((byte) 108, (pk) (Object) hc.field_c);
    }

    final void c(boolean param0) {
        ((oc) this).field_b.a(param0, true);
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
            Object var3 = null;
            oc.a((ah) null, false);
        }
        return true;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 == 122) {
            break L0;
          } else {
            int discarded$2 = oc.d(-55);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param3 > param2) {
              break L2;
            } else {
              if (param2 >= param6 + param3) {
                break L2;
              } else {
                if (param5 < param0) {
                  break L2;
                } else {
                  if (param4 + param0 <= param5) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        pn.field_p[se.field_d] = param3;
        pd.field_q[se.field_d] = se.field_d;
        lj.field_a[se.field_d] = param5;
        if (!(param5 >= qu.field_k)) {
            ab.field_c = param5;
        }
        if (!(kc.field_l >= param5)) {
            field_f = param5;
        }
        jf.field_f[se.field_d] = param1;
        ic.field_c[se.field_d] = param4;
        vi.field_z[se.field_d] = param0;
        int var6 = param0 + param4 + param1;
        if (!param2) {
            Object var8 = null;
            oc.a((String) null, false, (byte) 69);
        }
        int var7 = 0 != var6 ? 1000 * param1 / var6 : 0;
        uc.field_c[se.field_d] = var7;
        se.field_d = se.field_d + 1;
        if (ab.field_c > var7) {
            ab.field_c = var7;
        }
        if (var7 > field_f) {
            field_f = var7;
        }
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; param0 > var4; var4++) {
            var6[var4] = param1;
        }
        if (param2 != -1) {
            boolean discarded$0 = oc.a(-114, (byte) 68, -4, 84, 1, -123, 101);
        }
        return new String(var3);
    }

    final void a(int param0, int param1, ed param2) {
        ((oc) this).field_b.a(param2, 106);
        if (param1 != 18834) {
            field_f = -50;
        }
        ((oc) this).field_b.h(109, param0);
    }

    final void a(boolean param0, byte param1) {
        if (param1 > -71) {
            field_g = 53L;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
            Object var5 = null;
            oc.a((String) null, false, (byte) -121);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 1000;
    }
}
