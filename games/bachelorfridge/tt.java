/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends aba {
    private String field_g;
    static String field_h;
    private boolean field_i;

    tt(lka param0) {
        super(param0);
        ((tt) this).field_i = false;
    }

    final void d(int param0) {
        ((tt) this).field_g = null;
        if (param0 >= -106) {
            ((tt) this).field_i = false;
        }
    }

    public static void e(byte param0) {
        field_h = null;
        if (param0 != 84) {
            String discarded$0 = tt.e(110);
        }
    }

    final static String e(int param0) {
        if (!(ola.field_p != kq.field_j)) {
            return sc.field_n;
        }
        if (!(ut.field_m.a(false))) {
            return ut.field_m.b(25477);
        }
        if (param0 != 21240) {
            return null;
        }
        if (!(kq.field_j != dka.field_G)) {
            return ut.field_m.b(25477);
        }
        return dk.field_p;
    }

    final jg a(String param0, boolean param1) {
        eq var3 = null;
        CharSequence var4 = null;
        jg stackIn_14_0 = null;
        jg stackIn_18_0 = null;
        jg stackOut_17_0 = null;
        jg stackOut_16_0 = null;
        jg stackOut_13_0 = null;
        jg stackOut_12_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (!vq.a((byte) -60, var4)) {
          return jt.field_f;
        } else {
          L0: {
            if (!param0.equals((Object) (Object) ((tt) this).field_g)) {
              var3 = du.a(param0, (byte) -43);
              if (var3 != null) {
                if (var3.field_g == null) {
                  ((tt) this).field_g = param0;
                  ((tt) this).field_i = var3.field_e;
                  break L0;
                } else {
                  return ji.field_f;
                }
              } else {
                return ji.field_f;
              }
            } else {
              break L0;
            }
          }
          if (param1) {
            L1: {
              field_h = null;
              if (!((tt) this).field_i) {
                stackOut_17_0 = jt.field_f;
                stackIn_18_0 = stackOut_17_0;
                break L1;
              } else {
                stackOut_16_0 = cm.field_u;
                stackIn_18_0 = stackOut_16_0;
                break L1;
              }
            }
            return (jg) (Object) stackIn_18_0;
          } else {
            L2: {
              if (!((tt) this).field_i) {
                stackOut_13_0 = jt.field_f;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              } else {
                stackOut_12_0 = cm.field_u;
                stackIn_14_0 = stackOut_12_0;
                break L2;
              }
            }
            return (jg) (Object) stackIn_14_0;
          }
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        eq var4_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param1;
        var3 = hp.a(var5, 0);
        if (var3 == null) {
          L0: {
            if (param1.equals((Object) (Object) ((tt) this).field_g)) {
              break L0;
            } else {
              var4_ref = du.a(param1, (byte) -43);
              if (var4_ref != null) {
                if (null == var4_ref.field_g) {
                  ((tt) this).field_i = var4_ref.field_e;
                  ((tt) this).field_g = param1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
          if (!((tt) this).field_i) {
            return uga.field_A;
          } else {
            var4 = -59 % ((-8 - param0) / 45);
            return su.field_a;
          }
        } else {
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Reload game";
    }
}
