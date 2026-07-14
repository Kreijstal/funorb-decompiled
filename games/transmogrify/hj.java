/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends oa {
    private ug field_p;
    private int field_n;
    static String field_o;

    final static void a(java.awt.Component param0, int param1) {
        if (param1 != -2) {
            hj.m(75);
        }
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener((java.awt.event.KeyListener) (Object) el.field_n);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) el.field_n);
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        for (var5 = 0; var5 < param1; var5++) {
            ((hj) this).field_h = ((hj) this).field_h + 1;
            param0[param2 + var5] = (byte)(((hj) this).field_g[((hj) this).field_h] + -((hj) this).field_p.a(-88));
        }
        if (param3 != 18570) {
            field_o = null;
        }
    }

    hj(byte[] param0) {
        super(param0);
    }

    hj(int param0) {
        super(param0);
    }

    final int l(int param0) {
        if (param0 != -12135) {
            return 41;
        }
        ((hj) this).field_h = ((hj) this).field_h + 1;
        return 255 & ((hj) this).field_g[((hj) this).field_h] + -((hj) this).field_p.a(-108);
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!uf.a(param1.charAt(var2), (byte) -108)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!uf.a(param1.charAt(var3 - 1), (byte) -56)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = var3 - var2;
              if ((var4 ^ -1) <= -2) {
                if ((var4 ^ -1) >= -13) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L4: while (true) {
                    if (var3 <= var6) {
                      L5: {
                        if (param0 <= -124) {
                          break L5;
                        } else {
                          var10 = null;
                          ii[] discarded$2 = hj.a((ci) null, (byte) 75, -121, -92);
                          break L5;
                        }
                      }
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param1.charAt(var6);
                      if (ci.a((char) var7, 0)) {
                        var8 = jk.a((char) var7, false);
                        if (0 != var8) {
                          StringBuilder discarded$3 = var5.append(var8);
                          var6++;
                          continue L4;
                        } else {
                          var6++;
                          continue L4;
                        }
                      } else {
                        var6++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static ii[] a(ci param0, byte param1, int param2, int param3) {
        if (param1 != -62) {
            hj.m(-31);
        }
        if (!rl.a(param2, 0, param3, param0)) {
            return null;
        }
        return pd.a((byte) 113);
    }

    final void a(byte param0, int[] param1) {
        int var3 = 113 % ((-12 - param0) / 36);
        ((hj) this).field_p = new ug(param1);
    }

    final void a(boolean param0, int param1) {
        ((hj) this).field_h = ((hj) this).field_h + 1;
        ((hj) this).field_g[((hj) this).field_h] = (byte)(((hj) this).field_p.a(-50) + param1);
        if (param0) {
            field_o = null;
        }
    }

    final void n(int param0) {
        if (param0 != 0) {
            return;
        }
        ((hj) this).field_h = (7 + ((hj) this).field_n) / 8;
    }

    final int k(int param0, int param1) {
        int var6 = Transmogrify.field_A ? 1 : 0;
        int var3 = ((hj) this).field_n >> 1522829539;
        int var4 = -(((hj) this).field_n & 7) + 8;
        ((hj) this).field_n = ((hj) this).field_n + param0;
        int var5 = 0;
        while (param0 > var4) {
            var3++;
            var5 = var5 + ((((hj) this).field_g[var3] & kb.field_m[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (((hj) this).field_g[var3] >> -param0 + var4 & kb.field_m[param0]);
        } else {
            var5 = var5 + (kb.field_m[var4] & ((hj) this).field_g[var3]);
        }
        if (param1 != 1522829539) {
            ((hj) this).h((byte) -80);
        }
        return var5;
    }

    public static void m(int param0) {
        field_o = null;
        if (param0 != 255) {
            field_o = null;
        }
    }

    final void h(byte param0) {
        ((hj) this).field_n = 8 * ((hj) this).field_h;
        if (param0 < 53) {
            ((hj) this).field_n = 54;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
