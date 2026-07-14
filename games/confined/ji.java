/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    private nf[] field_c;
    static in field_d;
    static String field_b;
    static jb field_e;
    static bi field_a;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        di.a(param3, ((ji) this).field_c, (byte) -38, param1, param4, param0);
        if (param2 != 103) {
            ((ji) this).a(40, -110, (byte) -1, -54, 112);
        }
    }

    ji(nf[] param0) {
        ((ji) this).field_c = param0;
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ca var4_ref_ca = null;
        int var4 = 0;
        om var5_ref_om = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        hb var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var8 = Confined.field_J ? 1 : 0;
          var10 = e.field_c;
          var2 = var10.c(32);
          var3 = var10.c(32);
          if (var2 == 0) {
            var4_ref_ca = (ca) (Object) dl.field_b.a(-117);
            if (var4_ref_ca == null) {
              dc.d(107);
              return;
            } else {
              L1: {
                var5 = ai.field_i - var10.field_n;
                var14 = var4_ref_ca.field_p;
                var13 = var14;
                var12 = var13;
                var11 = var12;
                var6 = var11;
                if (var5 <= var14.length << 1966147426) {
                  break L1;
                } else {
                  var5 = var14.length << -1998254462;
                  break L1;
                }
              }
              var7 = 0;
              L2: while (true) {
                if (var7 >= var5) {
                  var4_ref_ca.a(true);
                  break L0;
                } else {
                  var6[var7 >> -507586014] = var6[var7 >> -507586014] + (var10.c(32) << va.a(768, var7 << -745540088));
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if ((var2 ^ -1) == -2) {
              var4 = var10.b(1647);
              var5_ref_om = (om) (Object) jd.field_f.a(-116);
              L3: while (true) {
                L4: {
                  if (var5_ref_om == null) {
                    break L4;
                  } else {
                    L5: {
                      if (var3 != var5_ref_om.field_n) {
                        break L5;
                      } else {
                        if (var4 == var5_ref_om.field_v) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5_ref_om = (om) (Object) jd.field_f.d(2123);
                    continue L3;
                  }
                }
                if (var5_ref_om != null) {
                  var5_ref_om.a(true);
                  break L0;
                } else {
                  dc.d(101);
                  return;
                }
              }
            } else {
              mb.a("LR1: " + ui.a(10), true, (Throwable) null);
              dc.d(121);
              break L0;
            }
          }
        }
        var4 = 68 % ((-55 - param0) / 52);
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 <= 51) {
            field_a = null;
        }
        field_e = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
