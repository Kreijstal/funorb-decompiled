/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends vk implements ga {
    private qk field_A;
    static String field_D;
    static boolean field_E;
    static int field_C;
    private dk[] field_y;
    static bb field_B;
    private String[] field_z;

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        wa var4 = null;
        int var5 = 0;
        L0: {
          ((kd) this).field_u.b(23505);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 0) {
              var3 = param1.length;
              ((kd) this).field_z = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  L2: {
                    var4 = new wa(nb.field_c, 0, 1);
                    ((kd) this).field_y = new dk[1 + var3];
                    if (param0 == 1891) {
                      break L2;
                    } else {
                      field_C = -29;
                      break L2;
                    }
                  }
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((kd) this).field_y[var3] = new dk(ci.field_d, (qg) this);
                      ((kd) this).field_y[var3].field_o = (de) (Object) var4;
                      ((kd) this).field_y[var3].a(0, 100, (byte) 118, 15, 20 + var3 * 16 - -16);
                      ((kd) this).a(true, (uj) (Object) ((kd) this).field_y[var3]);
                      return;
                    } else {
                      ((kd) this).field_y[var5] = new dk(((kd) this).field_z[var5], (qg) this);
                      ((kd) this).field_y[var5].field_o = (de) (Object) var4;
                      ((kd) this).field_y[var5].field_p = fb.field_d;
                      ((kd) this).field_y[var5].a(0, 80, (byte) 119, 15, 20 + var5 * 16);
                      ((kd) this).a(true, (uj) (Object) ((kd) this).field_y[var5]);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((kd) this).field_z[var4_int] = hf.a((CharSequence) (Object) param1[var4_int], false).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((kd) this).field_z = null;
    }

    kd(qk param0) {
        super(0, 0, 0, 0, (de) null);
        ((kd) this).field_A = param0;
    }

    public static void a(int param0) {
        if (param0 != -16) {
            return;
        }
        field_D = null;
        field_B = null;
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (98 == param3) {
            return ((kd) this).b(36, param0);
        }
        if (param3 == 99) {
            return ((kd) this).a((byte) -103, param0);
        }
        return false;
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = StarCannon.field_A;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((kd) this).field_z.length) {
            L1: {
              if (((kd) this).field_y[((kd) this).field_z.length] == param0) {
                ((kd) this).field_A.a(-12920);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                var8 = null;
                ((kd) this).a(53, (String[]) null);
                break L2;
              }
            }
            return;
          } else {
            if (param0 == ((kd) this).field_y[var6]) {
              ((kd) this).field_A.a(((kd) this).field_z[var6], (byte) -125);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        qe var5 = nb.field_c;
        if (null != ((kd) this).field_z) {
            int discarded$0 = var5.a(ca.field_X, ((kd) this).field_s + param1, param3 + ((kd) this).field_j, ((kd) this).field_i, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_p);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = null;
        field_D = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_E = false;
    }
}
