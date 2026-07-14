/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends lk {
    static pb field_k;
    static String field_m;
    static String field_o;
    private ae field_n;
    private ae field_l;
    static String field_p;

    final cg a(byte param0, String param1) {
        String var3 = ((lc) this).field_l.field_m.toLowerCase();
        String var4 = param1.toLowerCase();
        if (!(var4.length() != 0)) {
            return qj.field_c;
        }
        if (param0 <= 10) {
            return null;
        }
        if (!(rd.a(true, var4, var3))) {
            return qj.field_c;
        }
        if (!(!this.a(-1, param1))) {
            return qj.field_c;
        }
        return lg.field_c;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2 = -53 / ((6 - param1) / 62);
        return sk.a(false, 0, param0);
    }

    private final boolean a(int param0, String param1) {
        int var5 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        if (param0 == -1) {
          var12 = ((lc) this).field_n.field_m.toLowerCase();
          var13 = param1.toLowerCase();
          if (0 < var12.length()) {
            if (-1 > (var13.length() ^ -1)) {
              var5 = var12.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < -1 + var12.length()) {
                  var14 = var12.substring(0, var5);
                  var15 = var12.substring(var5 + 1);
                  if (0 <= var13.indexOf(var14)) {
                    return true;
                  } else {
                    if (var13.indexOf(var15) < 0) {
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
          ((lc) this).field_n = null;
          var8 = ((lc) this).field_n.field_m.toLowerCase();
          var9 = param1.toLowerCase();
          if (0 < var8.length()) {
            if (-1 > (var9.length() ^ -1)) {
              var5 = var8.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < -1 + var8.length()) {
                  var10 = var8.substring(0, var5);
                  var11 = var8.substring(var5 + 1);
                  if (0 <= var9.indexOf(var10)) {
                    return true;
                  } else {
                    if (var9.indexOf(var11) < 0) {
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
        }
    }

    lc(ae param0, ae param1, ae param2) {
        super(param0);
        ((lc) this).field_n = param2;
        ((lc) this).field_l = param1;
    }

    final static li[] e(byte param0) {
        if (param0 != 33) {
          return null;
        } else {
          return new li[]{ua.field_a, de.field_d, il.field_u, g.field_z, g.field_A, ok.field_c, bb.field_m, va.field_b, kf.field_a, ef.field_n, ui.field_C, s.field_f, be.field_c, tf.field_b};
        }
    }

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param1) {
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L0: {
              if (2048 <= param0) {
                stackOut_18_0 = -fh.field_h[-2048 + param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = fh.field_h[-param0 + 2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (6144 > param0) {
                stackOut_14_0 = -fh.field_h[6144 - param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = fh.field_h[param0 - 6144];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_k = null;
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L2: {
              if (2048 <= param0) {
                stackOut_8_0 = -fh.field_h[-2048 + param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = fh.field_h[-param0 + 2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (6144 > param0) {
                stackOut_4_0 = -fh.field_h[6144 - param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = fh.field_h[param0 - 6144];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final String b(byte param0, String param1) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var3 = 23 / ((param0 - 20) / 40);
        var4 = ((lc) this).field_l.field_m.toLowerCase();
        var5 = param1.toLowerCase();
        if (var5.length() != 0) {
          var6 = var5;
          if (!rd.a(var6, -121)) {
            if (lg.a(-124, var6)) {
              return pk.field_f;
            } else {
              if (fl.a(var6, (byte) 19)) {
                return pe.field_b;
              } else {
                if (this.a(-1, param1)) {
                  return el.field_H;
                } else {
                  if (0 < var4.length()) {
                    if (!rb.a(var6, -85, var4)) {
                      if (ji.a(var6, 95, var4)) {
                        return ge.field_l;
                      } else {
                        if (mb.a(var6, (byte) 118, var4)) {
                          return vf.field_D;
                        } else {
                          return wi.field_b;
                        }
                      }
                    } else {
                      return vf.field_D;
                    }
                  } else {
                    return k.field_e;
                  }
                }
              }
            }
          } else {
            return wi.field_b;
          }
        } else {
          return null;
        }
    }

    public static void f(int param0) {
        field_k = null;
        field_p = null;
        if (param0 != 3988) {
          lc.f(16);
          field_m = null;
          field_o = null;
          return;
        } else {
          field_m = null;
          field_o = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_o = "This entry doesn't match";
    }
}
