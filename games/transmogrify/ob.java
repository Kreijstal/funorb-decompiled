/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends le {
    static long field_G;
    private String field_J;
    private int field_K;
    static String field_I;
    private wa field_L;
    static String field_M;
    private ti field_H;
    static String field_F;

    final void a(int param0, byte param1, qg param2, int param3) {
        ((ob) this).field_K = ((ob) this).field_K + 1;
        super.a(param0, param1, param2, param3);
    }

    final String f(int param0) {
        if (param0 == 4) {
            return null;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        String var5 = null;
        rc var6 = null;
        int var7 = 0;
        m var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ti var15 = null;
        ti var16 = null;
        ti var17 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var14 = Transmogrify.field_A ? 1 : 0;
                var6 = ((ob) this).field_L.a(27835);
                if (var6 == ek.field_a) {
                  break L3;
                } else {
                  if (fi.field_u != var6) {
                    var5 = ((ob) this).field_L.c(30523);
                    if (var5 == null) {
                      var5 = ((ob) this).field_J;
                      break L2;
                    } else {
                      if (!var5.equals((Object) (Object) ((ob) this).field_k)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = bj.field_X;
              break L2;
            }
            if (!var5.equals((Object) (Object) ((ob) this).field_k)) {
              break L1;
            } else {
              break L0;
            }
          }
          ((ob) this).field_k = var5;
          ((ob) this).j(-108);
          break L0;
        }
        L4: {
          L5: {
            var7 = 97 % ((77 - param3) / 34);
            super.a(param0, param1, param2, (byte) 111);
            var6 = ((ob) this).field_L.a(27835);
            var9 = (m) (Object) ((ob) this).field_q;
            var10 = param0 + ((ob) this).field_p;
            var11 = var9.a((qg) this, 68, param1) - -(var9.a((qg) this, -2).a(126) >> -678446239);
            if (ek.field_a == var6) {
              break L5;
            } else {
              if (fi.field_u != var6) {
                if (ec.field_d != var6) {
                  if (hi.field_b != var6) {
                    break L4;
                  } else {
                    var17 = ai.field_b[1];
                    var17.c(var10, -(var17.field_m >> 454651233) + var11, 256);
                    break L4;
                  }
                } else {
                  var16 = ai.field_b[2];
                  var16.c(var10, var11 - (var16.field_m >> -1794552927), 256);
                  break L4;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            L7: {
              var15 = ai.field_b[0];
              var12 = var15.field_r << 836923905;
              var13 = var15.field_s << 908056673;
              if (null == ((ob) this).field_H) {
                break L7;
              } else {
                if (((ob) this).field_H.field_n < var12) {
                  break L7;
                } else {
                  if (var13 <= ((ob) this).field_H.field_m) {
                    oj.a(((ob) this).field_H, 256);
                    sb.c();
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
            ((ob) this).field_H = new ti(var12, var13);
            oj.a(((ob) this).field_H, 256);
            break L6;
          }
          var15.a(112, 144, var15.field_r << -306217724, var15.field_s << -172847676, -((ob) this).field_K << 2001662346, 4096);
          fi.c(true);
          ((ob) this).field_H.c(var10 - (var15.field_r >> 263659009), var11 + -var15.field_s, 256);
          break L4;
        }
    }

    ob(wa param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ui) (Object) rj.b(true));
        ((ob) this).field_J = param1;
        ((ob) this).field_L = param0;
        ((ob) this).a(62, param3, param2, param4, param5);
    }

    final static void a(int param0, int param1, sj param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Transmogrify.field_A ? 1 : 0;
        if (null == ue.field_c[param1]) {
            ue.field_c[param1] = new ii(wl.field_K.field_n, wl.field_K.field_m, 256);
            ue.field_c[param1].field_h = hk.field_a.field_y;
        }
        if (!(null != tj.field_s)) {
            tj.field_s = new ti(wl.field_K.field_n, wl.field_K.field_m);
        }
        tj.field_s.e();
        sb.c();
        param2.a(param3, -param2.field_q, 1, -param2.field_j);
        ii var11 = ue.field_c[param1];
        ii var12 = var11;
        var11.field_j[0] = 0;
        int var5 = param0;
        for (var6 = 0; var6 < sb.field_h.length; var6++) {
            var7 = sb.field_h[var6];
            var8 = -1;
            for (var9 = 0; var5 > var9; var9++) {
                if (!(var12.field_j[var9] != var7)) {
                    var8 = var9;
                    break;
                }
            }
            if (!(var8 != -1)) {
                var8 = var5;
                var5++;
                var12.field_j[var5] = var7;
            }
            var12.field_i[var6] = (byte)var8;
        }
        ri.field_k.a(104);
    }

    final boolean a(qg param0, int param1) {
        if (param1 >= -11) {
            ((ob) this).field_L = null;
            return false;
        }
        return false;
    }

    public static void k(int param0) {
        field_M = null;
        int var1 = -3 % ((-60 - param0) / 57);
        field_F = null;
        field_I = null;
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Transmogrify.field_A ? 1 : 0;
          var2 = param1.length();
          if (20 < var2) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            var5 = -67 / ((50 - param0) / 38);
            return new String(var8);
          } else {
            L2: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L2;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(97 + (-65 + var5));
                  var4++;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (122 >= var5) {
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
                  if (var5 > 57) {
                    break L5;
                  } else {
                    break L3;
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

    final static void l(int param0) {
        int var1 = -55 / ((16 - param0) / 35);
        wg.field_f = new qj();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Passwords must be between 5 and 20 characters long";
        field_M = "Previous";
    }
}
