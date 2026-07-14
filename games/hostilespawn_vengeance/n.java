/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends hi {
    static vl field_v;
    static boolean field_o;
    private boolean field_r;
    static cb field_t;
    private String field_u;
    static int field_s;
    static bd field_q;
    static String[] field_p;

    final bm a(String param0, byte param1) {
        int var3 = 0;
        jj var3_ref = null;
        CharSequence var4 = null;
        bm stackIn_7_0 = null;
        bm stackIn_14_0 = null;
        bm stackOut_13_0 = null;
        bm stackOut_12_0 = null;
        bm stackOut_6_0 = null;
        bm stackOut_5_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (!oc.a(var4, 1)) {
          return bi.field_d;
        } else {
          if (!param0.equals((Object) (Object) ((n) this).field_u)) {
            var3_ref = ph.a(param0, -79);
            if (var3_ref != null) {
              if (null != var3_ref.field_l) {
                return m.field_n;
              } else {
                L0: {
                  ((n) this).field_u = param0;
                  ((n) this).field_r = var3_ref.field_b;
                  var3 = -71 % ((param1 - 3) / 42);
                  if (((n) this).field_r) {
                    stackOut_13_0 = nd.field_d;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    stackOut_12_0 = bi.field_d;
                    stackIn_14_0 = stackOut_12_0;
                    break L0;
                  }
                }
                return stackIn_14_0;
              }
            } else {
              return m.field_n;
            }
          } else {
            L1: {
              var3 = -71 % ((param1 - 3) / 42);
              if (((n) this).field_r) {
                stackOut_6_0 = nd.field_d;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = bi.field_d;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0;
          }
        }
    }

    public static void d(byte param0) {
        field_t = null;
        field_p = null;
        field_q = null;
        if (param0 != -69) {
            n.d((byte) 14);
            field_v = null;
            return;
        }
        field_v = null;
    }

    n(ig param0) {
        super(param0);
        ((n) this).field_r = false;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        int var4 = 0;
        jj var5 = null;
        CharSequence var6 = null;
        var6 = (CharSequence) (Object) param1;
        var3 = ml.a((byte) -110, var6);
        var4 = -71 / ((param0 - -24) / 35);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (!param1.equals((Object) (Object) ((n) this).field_u)) {
              var5 = ph.a(param1, -86);
              if (var5 != null) {
                if (null == var5.field_l) {
                  ((n) this).field_u = param1;
                  ((n) this).field_r = var5.field_b;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((n) this).field_r) {
            return om.field_f;
          } else {
            return kj.field_a;
          }
        }
    }

    final static void b(boolean param0, byte param1) {
        if (param1 < -86) {
          mb.field_s.a(500, 8000);
          if (-2 == (jh.field_ab ^ -1)) {
            jn.l(0);
            if (!param0) {
              db.a(false, 256, dg.field_tb);
              return;
            } else {
              db.a(true, 256, vg.field_h);
              db.a(false, 256, dg.field_tb);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(int param0) {
        ((n) this).field_u = null;
        if (param0 != -2) {
            n.d((byte) 54);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
        field_v = new vl();
        field_p = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
