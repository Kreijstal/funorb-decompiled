/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends da {
    static String field_n;
    long field_l;
    w field_i;
    static String field_j;
    static int field_m;
    static boolean field_o;
    w field_k;

    final static int a(int param0, CharSequence param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        var3 = 0;
        var4 = param1.length();
        var5 = 74 % ((param0 - 75) / 36);
        var6 = 0;
        L0: while (true) {
          if (var4 <= var6) {
            return var3;
          } else {
            if (param1.charAt(var6) == param2) {
              var3++;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != 68) {
            w.c(46);
        }
        field_n = null;
        field_j = null;
    }

    final static ge a(byte param0, int param1, int param2, lj param3) {
        if (!lk.a(160, param3, param1, param2)) {
            return null;
        }
        if (param0 != 61) {
            field_n = null;
        }
        return sh.d(-128);
    }

    final void a(int param0) {
        if (((w) this).field_i == null) {
            return;
        }
        ((w) this).field_i.field_k = ((w) this).field_k;
        ((w) this).field_k.field_i = ((w) this).field_i;
        ((w) this).field_i = null;
        ((w) this).field_k = null;
        if (param0 != 12695) {
            w.b((byte) -41);
        }
    }

    protected w() {
    }

    final static void c(int param0) {
        ka var1 = null;
        int var2 = 0;
        String var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ka var6 = null;
        ka var7 = null;
        ka var7_ref = null;
        ka var8 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        qg.b(243, 197, 369, 143, 16777215);
        qg.f(244, 198, 367, 141, 0);
        if (null != gi.field_f) {
          L0: {
            var6 = gi.field_f[oi.field_j];
            var7 = var6;
            var7 = var6;
            var1 = var6;
            if (var6 != null) {
              var6.g(245, 199);
              break L0;
            } else {
              if (ek.field_G == null) {
                break L0;
              } else {
                int discarded$3 = ek.field_G.a(wb.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L0;
              }
            }
          }
          L1: {
            if (eh.field_k > ll.field_d) {
              var7_ref = gi.field_f[p.field_b];
              if (var7_ref == null) {
                break L1;
              } else {
                var2 = (60 + var7_ref.field_q) * ll.field_d / eh.field_k;
                var3 = var2 + -30;
                if (!bh.field_r) {
                  c.a(-256 * var3 / 30, 199, 245, 256 * (var7_ref.field_q + -var3) / 30, var7_ref, 107);
                  break L1;
                } else {
                  c.a((var7_ref.field_q + -var3) * 256 / 30, 199, 245, var3 * -256 / 30, var7_ref, 121);
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          L2: {
            if (null != ek.field_G) {
              var2_ref = null;
              var5 = 0;
              var3 = var5;
              L3: while (true) {
                if (var5 >= gi.field_f.length) {
                  if (var2_ref != null) {
                    int discarded$4 = ek.field_G.a("Screenshot(s) " + var2_ref + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var8 = gi.field_f[var5];
                  if (var8 != null) {
                    L4: {
                      if (365 != var8.field_q) {
                        break L4;
                      } else {
                        if (var8.field_v != 139) {
                          break L4;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                    if (var2_ref != null) {
                      var2_ref = var2_ref + ", " + var5;
                      var5++;
                      continue L3;
                    } else {
                      var2_ref = Integer.toString(var5);
                      var5++;
                      continue L3;
                    }
                  } else {
                    var5++;
                    continue L3;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          var2 = 106 / ((param0 - 2) / 44);
          return;
        } else {
          L5: {
            if (ek.field_G == null) {
              break L5;
            } else {
              int discarded$5 = ek.field_G.a(wb.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L5;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "(Including <%0>)";
        field_o = false;
        field_j = "Time: ";
    }
}
