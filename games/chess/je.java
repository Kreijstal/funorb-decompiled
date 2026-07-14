/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends vm {
    static int field_l;
    private qn field_m;
    private qn field_n;

    final String a(String param0, int param1) {
        if (param1 != -9316) {
            return null;
        }
        String var6 = ((je) this).field_n.field_v.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (gl.a(0, var5)) {
            return kg.field_T;
        }
        if (!(!ah.a(var5, (byte) -29))) {
            return q.field_a;
        }
        if (!(!pd.a(var5, (byte) 90))) {
            return de.field_b;
        }
        if (!(!this.b((byte) -108, param0))) {
            return ek.field_e;
        }
        if (0 >= var6.length()) {
            return ao.field_f;
        }
        if (!(!ml.a(var6, var5, 0))) {
            return ab.field_t;
        }
        if (ma.a(var6, param1 ^ -9279, var5)) {
            return bi.field_e;
        }
        if (!(!oc.a(var5, -125, var6))) {
            return ab.field_t;
        }
        return kg.field_T;
    }

    final static hl d(boolean param0) {
        if (param0) {
          L0: {
            hl discarded$8 = je.d(false);
            if (ic.field_e == null) {
              ic.field_e = new hl(rc.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_a.field_C, -1, 2147483647, true);
              break L0;
            } else {
              break L0;
            }
          }
          return ic.field_e;
        } else {
          L1: {
            if (ic.field_e == null) {
              ic.field_e = new hl(rc.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_a.field_C, -1, 2147483647, true);
              break L1;
            } else {
              break L1;
            }
          }
          return ic.field_e;
        }
    }

    private final boolean b(byte param0, String param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        if (param0 < -22) {
          var3 = ((je) this).field_m.field_v.toLowerCase();
          var4 = param1.toLowerCase();
          if ((var3.length() ^ -1) < -1) {
            if ((var4.length() ^ -1) < -1) {
              var5 = var3.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var3.length() - 1) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(var5 - -1);
                  if ((var4.indexOf(var6) ^ -1) <= -1) {
                    return true;
                  } else {
                    if (var4.indexOf(var7) < 0) {
                      return false;
                    } else {
                      return true;
                    }
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

    final mk a(byte param0, String param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        var3 = ((je) this).field_n.field_v.toLowerCase();
        var5 = -15 % ((-49 - param0) / 62);
        var4 = param1.toLowerCase();
        if (var4.length() == 0) {
          return qk.field_b;
        } else {
          if (!g.a(83, var3, var4)) {
            return qk.field_b;
          } else {
            if (this.b((byte) -94, param1)) {
              return qk.field_b;
            } else {
              return oa.field_a;
            }
          }
        }
    }

    final static boolean h(int param0) {
        if (param0 == 30065) {
          if (il.field_a <= -21) {
            if (vd.p(-101)) {
              if (-1 < gm.field_d) {
                if (tb.a((byte) 61)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    je(qn param0, qn param1, qn param2) {
        super(param0);
        ((je) this).field_n = param1;
        ((je) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
    }
}
