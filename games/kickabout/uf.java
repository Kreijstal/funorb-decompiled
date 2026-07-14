/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static String field_d;
    static String field_a;
    static hd field_b;
    static iw field_c;
    static String[] field_e;

    final static void a(ut[][] param0, sj param1, int[] param2, boolean param3, byte[] param4, kg[] param5, sj param6, int param7, String[][] param8, String[][] param9, sj param10, byte[] param11, String[] param12, int param13, String[] param14, ut[][] param15, int[] param16, int param17, int param18, String[] param19) {
        ri.a(param10, param16, param7 ^ -17016, param5, param6);
        tb.a(-92, param6);
        wp.a(param2, param11, param18, param19, param13, param17, param8, param0, param14, param6, param15, param12, param9, (byte) 117, param4);
        ew.a(param3, param6, param1, 0);
        sb.b((byte) -124);
        if (param7 == 16971) {
          na.h(0);
          tq.g((byte) -47);
          return;
        } else {
          uf.a((byte) -8);
          na.h(0);
          tq.g((byte) -47);
          return;
        }
    }

    final static boolean c(int param0) {
        if (param0 == 608) {
          if ((hl.field_d ^ -1) <= -21) {
            if (hh.b((byte) 97)) {
              if (rl.field_n > 0) {
                if (vr.d(1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          uf.a((ut[][]) null, (sj) null, (int[]) null, true, (byte[]) null, (kg[]) null, (sj) null, 32, (String[][]) null, (String[][]) null, (sj) null, (byte[]) null, (String[]) null, 71, (String[]) null, (ut[][]) null, (int[]) null, -120, 61, (String[]) null);
          if ((hl.field_d ^ -1) <= -21) {
            if (hh.b((byte) 97)) {
              if (rl.field_n > 0) {
                if (vr.d(1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(byte param0) {
        ut var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ut var8 = null;
        var7 = Kickabout.field_G;
        var8 = new ut(76, 92);
        var2 = new ut(76, 92);
        if (param0 != -32) {
          return;
        } else {
          iw.a(119, var2);
          var3 = 0;
          L0: while (true) {
            if (-7 >= (var3 ^ -1)) {
              ta.e(param0 ^ -100);
              return;
            } else {
              var4 = 0;
              L1: while (true) {
                if (6 <= var4) {
                  w.field_f[-var3 + 5] = new ot(38, 46);
                  eo.a(var2, w.field_f[5 - var3]);
                  var3++;
                  continue L0;
                } else {
                  L2: {
                    var5 = 6710886;
                    if (var4 != var3) {
                      break L2;
                    } else {
                      var5 = 16777215;
                      break L2;
                    }
                  }
                  L3: {
                    if (ct.a(97, var4 + -1, 6) == var3) {
                      var5 = 13619151;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (ct.a(param0 + 119, -2 + var4, 6) == var3) {
                      var5 = 11184810;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3 != ct.a(124, -3 + var4, 6)) {
                      break L5;
                    } else {
                      var5 = 8947848;
                      break L5;
                    }
                  }
                  iw.a(-110, var8);
                  on.b();
                  on.a(on.field_g - 6 >> -2105028191, 26, 6, 10, var5);
                  ta.e(120);
                  var6 = (var4 << 569160336) / 6;
                  var8.a(608, 736, 608, 736, var6, 4096);
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 3549) {
            return;
        }
        field_d = null;
        field_c = null;
        field_e = null;
    }

    final static wn a(int param0) {
        if (vj.field_a == wk.field_f) {
          throw new IllegalStateException();
        } else {
          if (param0 == -1460) {
            if (wk.field_f != cr.field_d) {
              return null;
            } else {
              wk.field_f = vj.field_a;
              return kl.field_a;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please wait...";
        field_d = "You are on <%0>";
        field_e = new String[]{"Tank", "Hotshot", "Elite", "Ranger", "Keeper"};
    }
}
