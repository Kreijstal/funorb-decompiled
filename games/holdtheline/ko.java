/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    static int[] field_c;
    static int field_b;
    static String field_a;

    public static void b(int param0) {
        if (param0 <= 108) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = HoldTheLine.field_D;
          var2 = 0L;
          var4 = param0.length();
          if (param1 == -13820) {
            break L0;
          } else {
            var8 = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var4 <= var5) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-65 + (var6 + 1));
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (var6 > 122) {
                      break L5;
                    } else {
                      var2 = var2 + (long)(1 - (-var6 + 97));
                      break L3;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (var6 > 57) {
                    break L3;
                  } else {
                    var2 = var2 + (long)(-21 + var6);
                    break L3;
                  }
                }
              }
              if (-177917621779460414L >= (var2 ^ -1L)) {
                break L2;
              } else {
                var5++;
                continue L1;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (-1L != (var2 % 37L ^ -1L)) {
                break L7;
              } else {
                if (var2 == 0L) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    final static mf[] a(int param0) {
        int var1 = -36 % ((param0 - -55) / 43);
        return new mf[]{ja.field_Wb, gj.field_s, ho.field_n};
    }

    final static hj[] a(boolean param0) {
        int var1 = 0;
        int var4 = HoldTheLine.field_D;
        hj[] var2 = new hj[28];
        hj var3 = dl.a(fb.field_i, "overlayfont", param0, "");
        for (var1 = 0; (var1 ^ -1) > -11; var1++) {
            var2[var1 + 0] = fj.a(0, 30 * var1, var3, 50, 0, 30);
        }
        var2[24] = fj.a(0, 300, var3, 20, 0, 40);
        var2[26] = fj.a(0, 340, var3, 20, 0, 40);
        for (var1 = 0; -11 < (var1 ^ -1); var1++) {
            var2[var1 + 10] = fj.a(0, 20 * var1, var3, 20, 60, 20);
        }
        var2[27] = fj.a(0, 300, var3, 20, 70, 15);
        var2[25] = fj.a(0, 320, var3, 30, 60, 75);
        for (var1 = 0; (var1 ^ -1) > -5; var1++) {
            var2[20 - -var1] = fj.a(0, var1 * 60, var3, 30, 90, 60);
        }
        return var2;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (10 > pf.field_d) {
            L1: {
              var3 = 0;
              if (cg.field_a) {
                cg.field_a = false;
                var3 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            jd.a(q.b((byte) 118), dm.field_d, ni.a((byte) -120), 300, var3 != 0);
            break L0;
          } else {
            if (!ge.a(true)) {
              tc.c();
              vb.a(-76, 240, 320);
              hi.a(param1, 0, true, 0);
              break L0;
            } else {
              if (bk.field_w != 0) {
                ck.a((byte) -97, param1);
                break L0;
              } else {
                vk.a(param2, false, 86);
                hi.a(param1, 0, true, 0);
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 < -19) {
            break L2;
          } else {
            field_a = null;
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "<col=2>You are not currently logged in.</col><br><br>To store your score, progress or achievements, you must log in or register by clicking <col=1>Log in/Register</col> above.<br><br>Otherwise, click <col=1>Discard</col> to lose them and continue.";
        field_c = fc.a(-117, 25, 4);
    }
}
