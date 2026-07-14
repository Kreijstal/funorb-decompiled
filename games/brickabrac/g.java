/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends k {
    private vb field_p;
    private vb field_k;
    static String field_m;
    static mh field_n;
    static jp[] field_l;
    static String field_q;
    static int[] field_o;

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_o = null;
        field_l = null;
        field_q = null;
        field_n = null;
        field_m = null;
    }

    final static void e(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0;
        int stackOut_6_0;
        int stackOut_3_0;
        int stackOut_2_0;
        if (param0 > -77) {
          L0: {
            field_m = null;
            um.field_e = false;
            if (jl.field_e.l(255) != 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          qo.field_I = stackIn_8_0 != 0;
          return;
        } else {
          L1: {
            um.field_e = false;
            if (jl.field_e.l(255) != 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          qo.field_I = stackIn_4_0 != 0;
          return;
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var7 = param1;
        if (param0 == 0) {
          var3 = ((g) this).field_k.field_A.toLowerCase();
          var4 = param1.toLowerCase();
          if (-1 > (var3.length() ^ -1)) {
            if (var4.length() > 0) {
              var5 = var3.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var3.length() - 1) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(1 + var5);
                  if (var4.indexOf(var6) < 0) {
                    if (var4.indexOf(var7) < 0) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
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
          g.b(true);
          var3 = ((g) this).field_k.field_A.toLowerCase();
          var4 = param1.toLowerCase();
          if (-1 > (var3.length() ^ -1)) {
            if (var4.length() > 0) {
              var5 = var3.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var3.length() - 1) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(1 + var5);
                  if (var4.indexOf(var6) < 0) {
                    if (var4.indexOf(var7) >= 0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
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
    }

    final static void a(pn param0, int param1, byte param2) {
        qa.field_t.a((nm) (Object) param0, (byte) 3);
        kp.a(param1, (byte) -99, param0);
        int var3 = -88 % ((param2 - -37) / 48);
    }

    final String a(int param0, String param1) {
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var7 = ((g) this).field_p.field_A.toLowerCase();
        var4 = param1.toLowerCase();
        var5 = -62 % ((-16 - param0) / 50);
        if (var4.length() != 0) {
          var6 = var4;
          if (pp.a(var6, true)) {
            return sc.field_a;
          } else {
            if (ab.a(var6, 0)) {
              return fk.field_c;
            } else {
              if (gp.a((byte) 65, var6)) {
                return eq.field_i;
              } else {
                if (this.b(0, param1)) {
                  return ni.field_Tb;
                } else {
                  if (var7.length() > 0) {
                    if (q.a(var6, 0, var7)) {
                      return fd.field_b;
                    } else {
                      if (ll.a(var6, (byte) 125, var7)) {
                        return ij.field_f;
                      } else {
                        if (ep.a(var6, (byte) 73, var7)) {
                          return fd.field_b;
                        } else {
                          return sc.field_a;
                        }
                      }
                    }
                  } else {
                    return l.field_k;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    g(vb param0, vb param1, vb param2) {
        super(param0);
        ((g) this).field_p = param1;
        ((g) this).field_k = param2;
    }

    final qh a(String param0, byte param1) {
        String var3 = null;
        String var4 = null;
        if (param1 == 106) {
          var3 = ((g) this).field_p.field_A.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 != var4.length()) {
            if (!ab.a((byte) -120, var4, var3)) {
              return lp.field_xb;
            } else {
              if (this.b(0, param0)) {
                return lp.field_xb;
              } else {
                return ae.field_c;
              }
            }
          } else {
            return lp.field_xb;
          }
        } else {
          field_q = null;
          var3 = ((g) this).field_p.field_A.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 != var4.length()) {
            if (!ab.a((byte) -120, var4, var3)) {
              return lp.field_xb;
            } else {
              if (this.b(0, param0)) {
                return lp.field_xb;
              } else {
                return ae.field_c;
              }
            }
          } else {
            return lp.field_xb;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = null;
        field_q = "Members";
        field_o = new int[]{0, 27, 1, 5, 32, 4, 3, 22, 19};
    }
}
