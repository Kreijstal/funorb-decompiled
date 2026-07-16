/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends wl {
    int field_i;
    static String field_m;
    int field_j;
    static String field_l;
    static String[] field_k;

    final static db a(kl param0, int param1, byte param2, int param3) {
        Object var5 = null;
        if (param2 == -128) {
          if (!h.a(param3, param1, param0, -128)) {
            return null;
          } else {
            return md.c((byte) -92);
          }
        } else {
          var5 = null;
          db discarded$7 = of.a((kl) null, 20, (byte) -110, 17);
          if (!h.a(param3, param1, param0, -128)) {
            return null;
          } else {
            return md.c((byte) -92);
          }
        }
    }

    final static boolean a(kl param0, kl param1, byte param2, kl param3) {
        if (param2 == -1) {
          if (param0.b(17820)) {
            if (param0.a((byte) 29, "commonui")) {
              if (param3.b(param2 ^ -17821)) {
                if (param3.a((byte) 29, "commonui")) {
                  if (param1.b(17820)) {
                    if (!param1.a((byte) 29, "button.gif")) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_m = null;
          if (param0.b(17820)) {
            if (param0.a((byte) 29, "commonui")) {
              if (param3.b(param2 ^ -17821)) {
                if (param3.a((byte) 29, "commonui")) {
                  if (param1.b(17820)) {
                    if (!param1.a((byte) 29, "button.gif")) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_m = null;
        if (param0 < 109) {
            field_k = null;
        }
    }

    final static void d(int param0) {
        he.field_s[46] = 72;
        he.field_s[44] = 71;
        he.field_s[61] = 27;
        he.field_s[59] = 57;
        he.field_s[91] = 42;
        he.field_s[45] = 26;
        if (param0 != 0) {
          return;
        } else {
          he.field_s[93] = 43;
          he.field_s[192] = 28;
          he.field_s[222] = 58;
          he.field_s[520] = 59;
          he.field_s[47] = 73;
          he.field_s[92] = 74;
          return;
        }
    }

    private of() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 != 72) {
          return;
        } else {
          var1 = pf.c((byte) -89);
          var2 = lb.a((byte) 47);
          tl.field_c.a(pf.field_f - ic.field_c, var2 + (ic.field_c << 263268321), var1 + (ii.field_c << -1219837279), 1, fe.field_l - ii.field_c);
          nf.a(99);
          return;
        }
    }

    final static void c(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = wizardrun.field_H;
        var7 = t.field_a;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        if (param0 != 45) {
          of.a(-105);
          var2 = 0;
          var3 = var7.length;
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$32 = var2;
              var2++;
              var5[incrementValue$32] = 0;
              int incrementValue$33 = var2;
              var2++;
              var5[incrementValue$33] = 0;
              int incrementValue$34 = var2;
              var2++;
              var5[incrementValue$34] = 0;
              int incrementValue$35 = var2;
              var2++;
              var5[incrementValue$35] = 0;
              int incrementValue$36 = var2;
              var2++;
              var5[incrementValue$36] = 0;
              int incrementValue$37 = var2;
              var2++;
              var5[incrementValue$37] = 0;
              int incrementValue$38 = var2;
              var2++;
              var5[incrementValue$38] = 0;
              int incrementValue$39 = var2;
              var2++;
              var5[incrementValue$39] = 0;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = var7.length;
          L1: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$40 = var2;
              var2++;
              var5[incrementValue$40] = 0;
              int incrementValue$41 = var2;
              var2++;
              var5[incrementValue$41] = 0;
              int incrementValue$42 = var2;
              var2++;
              var5[incrementValue$42] = 0;
              int incrementValue$43 = var2;
              var2++;
              var5[incrementValue$43] = 0;
              int incrementValue$44 = var2;
              var2++;
              var5[incrementValue$44] = 0;
              int incrementValue$45 = var2;
              var2++;
              var5[incrementValue$45] = 0;
              int incrementValue$46 = var2;
              var2++;
              var5[incrementValue$46] = 0;
              int incrementValue$47 = var2;
              var2++;
              var5[incrementValue$47] = 0;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "You have <%0> unread messages!";
        field_k = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_l = "FULL ACCESS";
    }
}
