/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends g implements oi {
    static int field_G;
    static pb field_B;
    private String[] field_E;
    static String field_H;
    private rf field_F;
    private ig[] field_C;
    static int field_D;

    ul(rf param0) {
        super(0, 0, 0, 0, (uk) null);
        ((ul) this).field_F = param0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param0 ^ -1))) {
            return;
        }
        bd var5 = si.field_V;
        if (!(null == ((ul) this).field_E)) {
            int discarded$0 = var5.a(ic.field_b, param3 + ((ul) this).field_w, ((ul) this).field_k + param2, ((ul) this).field_p, 20, 16777215, -1, 0, 0, var5.field_r + var5.field_N);
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        var6 = 0;
        L0: while (true) {
          if (((ul) this).field_E.length <= var6) {
            L1: {
              if (!param3) {
                break L1;
              } else {
                field_G = -28;
                break L1;
              }
            }
            L2: {
              if (((ul) this).field_C[((ul) this).field_E.length] != param2) {
                break L2;
              } else {
                ((ul) this).field_F.a(-103);
                break L2;
              }
            }
            return;
          } else {
            if (param2 == ((ul) this).field_C[var6]) {
              ((ul) this).field_F.a((byte) -121, ((ul) this).field_E[var6]);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (-99 == (param1 ^ -1)) {
            return ((ul) this).a(param3, -8666);
        }
        if ((param1 ^ -1) == -100) {
            return ((ul) this).a(param3, (byte) 100);
        }
        return false;
    }

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        ll var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = stellarshard.field_B;
          ((ul) this).field_y.a((byte) -8);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 0) {
              var3 = param1.length;
              ((ul) this).field_E = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  L2: {
                    if (param0 == 2178) {
                      break L2;
                    } else {
                      field_G = 43;
                      break L2;
                    }
                  }
                  var4 = new ll(si.field_V, 0, 1);
                  ((ul) this).field_C = new ig[1 + var3];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((ul) this).field_C[var3] = new ig(ch.field_b, (lf) this);
                      ((ul) this).field_C[var3].field_u = (uk) (Object) var4;
                      ((ul) this).field_C[var3].b(100, 0, 16 * (1 + var3) + 20, 15, param0 ^ 21809);
                      ((ul) this).b(4, (rj) (Object) ((ul) this).field_C[var3]);
                      return;
                    } else {
                      ((ul) this).field_C[var5] = new ig(((ul) this).field_E[var5], (lf) this);
                      ((ul) this).field_C[var5].field_u = (uk) (Object) var4;
                      ((ul) this).field_C[var5].field_x = bl.field_c;
                      ((ul) this).field_C[var5].b(80, 0, 20 + var5 * 16, 15, 23987);
                      ((ul) this).b(param0 + -2174, (rj) (Object) ((ul) this).field_C[var5]);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((ul) this).field_E[var4_int] = jf.b((CharSequence) (Object) param1[var4_int], true).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((ul) this).field_E = null;
    }

    public static void a(int param0) {
        field_H = null;
        field_B = null;
        if (param0 != 160) {
            ul.a(117);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Logging in...";
        field_D = 250;
    }
}
