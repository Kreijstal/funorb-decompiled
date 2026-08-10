/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    private da field_c;
    static java.awt.Frame field_a;
    private da field_b;
    static String field_e;
    private v field_d;

    final ba a(byte param0, int param1) {
        ba var3;
        byte[] var4;
        ba var5;
        var3 = (ba) (this.field_d.a(0, (long)param1));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if ((param1 ^ -1) <= -32769) {
              var4 = this.field_b.b(1, 12257, param1 & 32767);
              break L0;
            } else {
              var4 = this.field_c.b(1, param0 + 12366, param1);
              break L0;
            }
          }
          var5 = new ba();
          if (param0 == -109) {
            if (var4 == null) {
              if (32768 <= param1) {
                var5.g(39);
                this.field_d.a(87, var5, (long)param1);
                return var5;
              } else {
                this.field_d.a(87, var5, (long)param1);
                return var5;
              }
            } else {
              var5.a(new gb(var4), false);
              if (32768 > param1) {
                this.field_d.a(87, var5, (long)param1);
                return var5;
              } else {
                var5.g(39);
                this.field_d.a(87, var5, (long)param1);
                return var5;
              }
            }
          } else {
            return (ba) null;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 255) {
            field_e = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(boolean param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var12;
        String var13;
        String var14;
        String var15;
        var5 = SolKnight.field_L ? 1 : 0;
        var6 = "(" + nf.field_U + " " + kl.field_b + " " + jg.field_e + ") " + ob.field_h;
        var1 = var6;
        if (!param0) {
          if ((te.field_O ^ -1) >= -1) {
            return var1;
          } else {
            var1 = var6 + ":";
            var2 = 0;
            L0: while (true) {
              if (te.field_O <= var2) {
                return var1;
              } else {
                L1: {
                  var14 = var1 + ' ';
                  var3 = te.field_N.field_l[var2] & 255;
                  var4 = var3 >> -1918280092;
                  var3 = var3 & 15;
                  if (10 <= var4) {
                    var4 += 55;
                    break L1;
                  } else {
                    var4 += 48;
                    break L1;
                  }
                }
                L2: {
                  var15 = var14 + (char)var4;
                  if ((var3 ^ -1) <= -11) {
                    var3 += 55;
                    break L2;
                  } else {
                    var3 += 48;
                    break L2;
                  }
                }
                var1 = var15 + (char)var3;
                var2++;
                continue L0;
              }
            }
          }
        } else {
          field_a = (java.awt.Frame) null;
          if ((te.field_O ^ -1) < -1) {
            var1 = var6 + ":";
            var2 = 0;
            L3: while (true) {
              if (te.field_O > var2) {
                L4: {
                  var12 = var1 + ' ';
                  var3 = te.field_N.field_l[var2] & 255;
                  var4 = var3 >> -1918280092;
                  var3 = var3 & 15;
                  if (10 <= var4) {
                    var4 += 55;
                    break L4;
                  } else {
                    var4 += 48;
                    break L4;
                  }
                }
                L5: {
                  var13 = var12 + (char)var4;
                  if ((var3 ^ -1) <= -11) {
                    var3 += 55;
                    break L5;
                  } else {
                    var3 += 48;
                    break L5;
                  }
                }
                var1 = var13 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    private oc() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
