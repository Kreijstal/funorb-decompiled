/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends un {
    static String field_u;
    static java.math.BigInteger field_v;
    private boolean field_q;
    private String field_r;
    static int field_s;
    static int[] field_t;

    public static void h(int param0) {
        field_u = null;
        field_t = null;
        if (param0 != 66) {
            tp.h(102);
            field_v = null;
            return;
        }
        field_v = null;
    }

    final re a(boolean param0, String param1) {
        gh var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        re stackIn_13_0 = null;
        re stackIn_17_0 = null;
        re stackOut_16_0 = null;
        re stackOut_15_0 = null;
        re stackOut_12_0 = null;
        re stackOut_11_0 = null;
        var5 = (CharSequence) (Object) param1;
        if (sj.a(var5, 12319)) {
          L0: {
            if (!param1.equals((Object) (Object) ((tp) this).field_r)) {
              var3 = ed.a((byte) 127, param1);
              if (var3 != null) {
                if (null == var3.field_h) {
                  ((tp) this).field_r = param1;
                  ((tp) this).field_q = var3.field_d;
                  break L0;
                } else {
                  return ua.field_I;
                }
              } else {
                return ua.field_I;
              }
            } else {
              break L0;
            }
          }
          if (param0) {
            L1: {
              var4 = null;
              String discarded$8 = ((tp) this).a((String) null, 126);
              if (((tp) this).field_q) {
                stackOut_16_0 = db.field_b;
                stackIn_17_0 = stackOut_16_0;
                break L1;
              } else {
                stackOut_15_0 = jq.field_b;
                stackIn_17_0 = stackOut_15_0;
                break L1;
              }
            }
            return stackIn_17_0;
          } else {
            L2: {
              if (((tp) this).field_q) {
                stackOut_12_0 = db.field_b;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = jq.field_b;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            return stackIn_13_0;
          }
        } else {
          return jq.field_b;
        }
    }

    final String a(String param0, int param1) {
        gh var4 = null;
        CharSequence var6 = (CharSequence) (Object) param0;
        String var3 = vk.a(param1 ^ -1276425052, var6);
        if (!(var3 == null)) {
            return var3;
        }
        if (param1 != -1276425040) {
            Object var5 = null;
            re discarded$4 = ((tp) this).a(true, (String) null);
            if (!(param0.equals((Object) (Object) ((tp) this).field_r))) {
                var4 = ed.a((byte) 127, param0);
                if (var4 == null) {
                    return null;
                }
                if (null != var4.field_h) {
                    return null;
                }
                ((tp) this).field_q = var4.field_d;
                ((tp) this).field_r = param0;
            }
            if (!(((tp) this).field_q)) {
                return wg.field_d;
            }
            return ba.field_j;
        }
        if (!(param0.equals((Object) (Object) ((tp) this).field_r))) {
            var4 = ed.a((byte) 127, param0);
            if (var4 == null) {
                return null;
            }
            if (null != var4.field_h) {
                return null;
            }
            ((tp) this).field_q = var4.field_d;
            ((tp) this).field_r = param0;
        }
        if (!(((tp) this).field_q)) {
            return wg.field_d;
        }
        return ba.field_j;
    }

    tp(pm param0) {
        super(param0);
        ((tp) this).field_q = false;
    }

    final void i(int param0) {
        if (param0 != -22837) {
            tp.h(-36);
            ((tp) this).field_r = null;
            return;
        }
        ((tp) this).field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "This trait will make your powerups last even longer than Expert. Equip both for an extra bonus!";
        field_v = new java.math.BigInteger("65537");
        field_s = 66;
    }
}
