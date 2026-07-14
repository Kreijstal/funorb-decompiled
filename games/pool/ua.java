/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ig {
    static int field_v;
    private boolean field_q;
    static dd field_u;
    static String field_m;
    static dd field_r;
    static int[] field_t;
    static int field_o;
    static String field_n;
    private String field_p;
    static String field_s;

    final String a(String param0, int param1) {
        String var3 = null;
        wc var4 = null;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param0;
        var3 = pk.a(var5, param1 + -89);
        if (var3 == null) {
          if (param1 == 0) {
            L0: {
              if (!param0.equals((Object) (Object) ((ua) this).field_p)) {
                var4 = sm.a(param0, 118);
                if (var4 != null) {
                  if (var4.field_b == null) {
                    ((ua) this).field_p = param0;
                    ((ua) this).field_q = var4.field_f;
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
            if (!((ua) this).field_q) {
              return gi.field_n;
            } else {
              return lb.field_M;
            }
          } else {
            L1: {
              field_u = null;
              if (!param0.equals((Object) (Object) ((ua) this).field_p)) {
                var4 = sm.a(param0, 118);
                if (var4 != null) {
                  if (var4.field_b == null) {
                    ((ua) this).field_p = param0;
                    ((ua) this).field_q = var4.field_f;
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                break L1;
              }
            }
            if (!((ua) this).field_q) {
              return gi.field_n;
            } else {
              return lb.field_M;
            }
          }
        } else {
          return var3;
        }
    }

    final na a(String param0, boolean param1) {
        wc var3 = null;
        CharSequence var4 = null;
        na stackIn_8_0 = null;
        na stackIn_15_0 = null;
        na stackOut_14_0 = null;
        na stackOut_13_0 = null;
        na stackOut_7_0 = null;
        na stackOut_6_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (qi.a((byte) -64, var4)) {
          if (param1) {
            if (!param0.equals((Object) (Object) ((ua) this).field_p)) {
              var3 = sm.a(param0, -51);
              if (var3 != null) {
                if (var3.field_b != null) {
                  return no.field_k;
                } else {
                  L0: {
                    ((ua) this).field_p = param0;
                    ((ua) this).field_q = var3.field_f;
                    if (((ua) this).field_q) {
                      stackOut_14_0 = kr.field_e;
                      stackIn_15_0 = stackOut_14_0;
                      break L0;
                    } else {
                      stackOut_13_0 = gp.field_d;
                      stackIn_15_0 = stackOut_13_0;
                      break L0;
                    }
                  }
                  return stackIn_15_0;
                }
              } else {
                return no.field_k;
              }
            } else {
              L1: {
                if (((ua) this).field_q) {
                  stackOut_7_0 = kr.field_e;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = gp.field_d;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              return stackIn_8_0;
            }
          } else {
            return null;
          }
        } else {
          return gp.field_d;
        }
    }

    ua(sl param0) {
        super(param0);
        ((ua) this).field_q = false;
    }

    final void i(int param0) {
        if (param0 != 18) {
            return;
        }
        ((ua) this).field_p = null;
    }

    public static void h(int param0) {
        field_m = null;
        field_r = null;
        field_u = null;
        if (param0 >= -51) {
          field_m = null;
          field_n = null;
          field_t = null;
          field_s = null;
          return;
        } else {
          field_n = null;
          field_t = null;
          field_s = null;
          return;
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          if (oh.field_h) {
            kh.field_Vb.a((byte) -79, false);
            return;
          } else {
            return;
          }
        } else {
          field_s = null;
          if (!oh.field_h) {
            return;
          } else {
            kh.field_Vb.a((byte) -79, false);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Clan";
        field_v = 0;
        field_t = new int[]{17, 18, 8};
        field_n = "Chat";
        field_o = 0;
        field_s = "Start Game";
    }
}
