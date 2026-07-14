/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends qe {
    private String field_s;
    static int field_o;
    static km field_n;
    private boolean field_p;
    static p field_v;
    static String field_q;
    static boolean[] field_r;
    static String field_t;
    static String field_u;

    final wl a(String param0, boolean param1) {
        ck var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        wl stackIn_7_0 = null;
        wl stackIn_14_0 = null;
        wl stackIn_21_0 = null;
        wl stackIn_28_0 = null;
        wl stackOut_27_0 = null;
        wl stackOut_26_0 = null;
        wl stackOut_20_0 = null;
        wl stackOut_19_0 = null;
        wl stackOut_13_0 = null;
        wl stackOut_12_0 = null;
        wl stackOut_6_0 = null;
        wl stackOut_5_0 = null;
        var5 = (CharSequence) (Object) param0;
        if (ee.a(88, var5)) {
          if (param1) {
            if (!param0.equals((Object) (Object) ((di) this).field_s)) {
              var3 = sh.a(648093968, param0);
              if (var3 != null) {
                if (var3.field_e != null) {
                  return te.field_d;
                } else {
                  L0: {
                    ((di) this).field_s = param0;
                    ((di) this).field_p = var3.field_a;
                    if (((di) this).field_p) {
                      stackOut_27_0 = bm.field_i;
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      stackOut_26_0 = ee.field_c;
                      stackIn_28_0 = stackOut_26_0;
                      break L0;
                    }
                  }
                  return stackIn_28_0;
                }
              } else {
                return te.field_d;
              }
            } else {
              L1: {
                if (((di) this).field_p) {
                  stackOut_20_0 = bm.field_i;
                  stackIn_21_0 = stackOut_20_0;
                  break L1;
                } else {
                  stackOut_19_0 = ee.field_c;
                  stackIn_21_0 = stackOut_19_0;
                  break L1;
                }
              }
              return stackIn_21_0;
            }
          } else {
            var4 = null;
            wl discarded$1 = ((di) this).a((String) null, false);
            if (!param0.equals((Object) (Object) ((di) this).field_s)) {
              var3 = sh.a(648093968, param0);
              if (var3 != null) {
                if (var3.field_e != null) {
                  return te.field_d;
                } else {
                  L2: {
                    ((di) this).field_s = param0;
                    ((di) this).field_p = var3.field_a;
                    if (((di) this).field_p) {
                      stackOut_13_0 = bm.field_i;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = ee.field_c;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  return stackIn_14_0;
                }
              } else {
                return te.field_d;
              }
            } else {
              L3: {
                if (((di) this).field_p) {
                  stackOut_6_0 = bm.field_i;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = ee.field_c;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              return stackIn_7_0;
            }
          }
        } else {
          return ee.field_c;
        }
    }

    final void c(boolean param0) {
        if (param0) {
            return;
        }
        ((di) this).field_s = null;
    }

    final String a(int param0, String param1) {
        String var3 = null;
        ck var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (param0 == -26358) {
          var6 = (CharSequence) (Object) param1;
          var3 = ce.a(-1, var6);
          if (var3 == null) {
            L0: {
              if (param1.equals((Object) (Object) ((di) this).field_s)) {
                break L0;
              } else {
                var4 = sh.a(param0 ^ -648103910, param1);
                if (var4 != null) {
                  if (var4.field_e == null) {
                    ((di) this).field_s = param1;
                    ((di) this).field_p = var4.field_a;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            if (!((di) this).field_p) {
              return dm.field_t;
            } else {
              return sh.field_sb;
            }
          } else {
            return var3;
          }
        } else {
          field_u = null;
          var5 = (CharSequence) (Object) param1;
          var3 = ce.a(-1, var5);
          if (var3 == null) {
            L1: {
              if (param1.equals((Object) (Object) ((di) this).field_s)) {
                break L1;
              } else {
                var4 = sh.a(param0 ^ -648103910, param1);
                if (var4 != null) {
                  if (var4.field_e == null) {
                    ((di) this).field_s = param1;
                    ((di) this).field_p = var4.field_a;
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            if (!((di) this).field_p) {
              return dm.field_t;
            } else {
              return sh.field_sb;
            }
          } else {
            return var3;
          }
        }
    }

    di(wa param0) {
        super(param0);
        ((di) this).field_p = false;
    }

    public static void h(int param0) {
        Object var2 = null;
        field_r = null;
        field_q = null;
        if (param0 < 34) {
          var2 = null;
          di.a((sc) null, -36, true);
          field_v = null;
          field_u = null;
          field_t = null;
          field_n = null;
          return;
        } else {
          field_v = null;
          field_u = null;
          field_t = null;
          field_n = null;
          return;
        }
    }

    final static id c(byte param0) {
        if (null != ca.field_Q) {
          if (param0 != -6) {
            return null;
          } else {
            return ca.field_Q;
          }
        } else {
          ca.field_Q = new id();
          ca.field_Q.a((byte) 119, dj.field_h);
          ca.field_Q.field_n = 5;
          ca.field_Q.field_e = 2763306;
          ca.field_Q.field_g = 6;
          ca.field_Q.field_o = dk.field_j;
          ca.field_Q.field_k = 14;
          ca.field_Q.field_s = 7697781;
          ca.field_Q.field_q = 0;
          ca.field_Q.field_m = 4;
          if (param0 != -6) {
            return null;
          } else {
            return ca.field_Q;
          }
        }
    }

    final static void a(sc param0, int param1, boolean param2) {
        la.a(-1, 256, param2, param0);
        int var3 = -19 / ((param1 - 65) / 42);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new p();
        field_q = "The following settings need to be changed:  ";
        field_r = new boolean[64];
        field_t = "You have <%0> unread messages!";
        field_u = "Decline invitation to <%0>'s game";
    }
}
