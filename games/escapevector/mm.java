/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static hl field_b;
    static String field_c;
    static String field_a;

    final static boolean a(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = EscapeVector.field_A;
          if (mj.field_d == 0) {
            sj.a(8192, (byte) 51);
            break L0;
          } else {
            break L0;
          }
        }
        var1 = 0;
        de.field_j = true;
        if (param0 <= -13) {
          L1: {
            if (0 == mj.field_d) {
              rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
              break L1;
            } else {
              break L1;
            }
          }
          if (10 != mj.field_d) {
            L2: {
              if (-1001 < (mj.field_d ^ -1)) {
                mj.field_d = mj.field_d + 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: while (true) {
              if (!pn.p(-126)) {
                di.field_d.a(gb.a(sf.field_c, ng.field_ob, 8158), (byte) 126, gb.a(dh.field_d, bj.field_y, 8158));
                if (fn.a(true, 0)) {
                  var1 = 1;
                  return var1 != 0;
                } else {
                  return var1 != 0;
                }
              } else {
                di.field_d.c((byte) 6);
                if (!fn.a(false, 0)) {
                  continue L3;
                } else {
                  var1 = 1;
                  return var1 != 0;
                }
              }
            }
          } else {
            L4: {
              rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
              if (-1001 < (mj.field_d ^ -1)) {
                mj.field_d = mj.field_d + 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: while (true) {
              if (!pn.p(-126)) {
                di.field_d.a(gb.a(sf.field_c, ng.field_ob, 8158), (byte) 126, gb.a(dh.field_d, bj.field_y, 8158));
                if (fn.a(true, 0)) {
                  var1 = 1;
                  return var1 != 0;
                } else {
                  return var1 != 0;
                }
              } else {
                di.field_d.c((byte) 6);
                if (!fn.a(false, 0)) {
                  continue L5;
                } else {
                  var1 = 1;
                  return var1 != 0;
                }
              }
            }
          }
        } else {
          L6: {
            field_a = null;
            if (0 == mj.field_d) {
              rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
              break L6;
            } else {
              break L6;
            }
          }
          if (10 == mj.field_d) {
            L7: {
              rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
              if (-1001 < (mj.field_d ^ -1)) {
                mj.field_d = mj.field_d + 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: while (true) {
              if (!pn.p(-126)) {
                di.field_d.a(gb.a(sf.field_c, ng.field_ob, 8158), (byte) 126, gb.a(dh.field_d, bj.field_y, 8158));
                if (fn.a(true, 0)) {
                  var1 = 1;
                  return var1 != 0;
                } else {
                  return var1 != 0;
                }
              } else {
                di.field_d.c((byte) 6);
                if (!fn.a(false, 0)) {
                  continue L8;
                } else {
                  var1 = 1;
                  return var1 != 0;
                }
              }
            }
          } else {
            L9: {
              if (-1001 < (mj.field_d ^ -1)) {
                mj.field_d = mj.field_d + 1;
                break L9;
              } else {
                break L9;
              }
            }
            L10: while (true) {
              if (!pn.p(-126)) {
                di.field_d.a(gb.a(sf.field_c, ng.field_ob, 8158), (byte) 126, gb.a(dh.field_d, bj.field_y, 8158));
                if (fn.a(true, 0)) {
                  var1 = 1;
                  return var1 != 0;
                } else {
                  return var1 != 0;
                }
              } else {
                di.field_d.c((byte) 6);
                if (!fn.a(false, 0)) {
                  continue L10;
                } else {
                  var1 = 1;
                  return var1 != 0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        he.field_x = param2;
        int var5 = -76 % ((-35 - param0) / 47);
        ok.field_a = param4;
        je.field_b = param1;
        vk.field_t = param3;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param0 != 64) {
            field_b = null;
            return dj.a(param0 + 6381);
        }
        return dj.a(param0 + 6381);
    }

    final static boolean a(int param0, int param1) {
        int var3 = 0;
        mf var4 = null;
        var3 = EscapeVector.field_A;
        if (param0 == 4) {
          if (!fa.field_c[param1]) {
            var4 = fi.field_j;
            if (5 != param1) {
              if (param1 == 4) {
                if (se.field_b == null) {
                  fn.a((byte) 53);
                  return true;
                } else {
                  sl.field_b[param1] = se.field_b.field_g;
                  pf.field_g[param1] = se.field_b.field_d;
                  fa.field_c[param1] = true;
                  fn.a((byte) 53);
                  return true;
                }
              } else {
                if (!var4.a(param0 + -4, da.field_d[param1])) {
                  return false;
                } else {
                  tk.field_a[param1] = fe.a(da.field_d[param1], var4, "texture", true);
                  dd.field_a[param1] = fe.a(da.field_d[param1], var4, "frosting", true);
                  dd.field_a[param1].c();
                  dm.a(var4, param1, false);
                  fa.field_c[param1] = true;
                  fn.a((byte) 53);
                  return true;
                }
              }
            } else {
              en.a(var4, 5);
              fn.a((byte) 53);
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = EscapeVector.field_A;
          var2 = param1.length();
          if (-21 <= (var2 ^ -1)) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = param0;
        L1: while (true) {
          if (var2 <= var4) {
            return new String(var8);
          } else {
            L2: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L2;
              } else {
                if (90 < var5) {
                  break L2;
                } else {
                  var3[var4] = (char)(-65 + var5 - -97);
                  var4++;
                  var4++;
                  continue L1;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (var5 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var5 < 48) {
                  break L5;
                } else {
                  if (var5 <= 57) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L1;
          }
        }
    }

    public static void b(int param0) {
        int var1 = -15 % ((param0 - -35) / 55);
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Logging in...";
        field_c = "Create your own free Jagex account";
    }
}
