/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends se {
    static int field_i;
    static int field_p;
    static String field_n;
    static dl[] field_o;
    static ko field_m;
    static int field_q;
    static String field_l;
    static String field_k;
    private ga field_j;
    private ga field_r;

    public static void d(int param0) {
        field_n = null;
        if (param0 != -31737) {
          field_l = null;
          field_l = null;
          field_o = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_o = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    private final boolean a(String param0, boolean param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        Object var8 = null;
        var7 = param0;
        var3 = ((jn) this).field_r.field_o.toLowerCase();
        if (!param1) {
          var4 = param0.toLowerCase();
          if (var3.length() > 0) {
            if (-1 < var4.length()) {
              var5 = var3.lastIndexOf("@");
              if ((var5 ^ -1) <= -1) {
                if (var5 < var3.length() + -1) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(1 + var5);
                  if (-1 < (var4.indexOf(var6) ^ -1)) {
                    if ((var4.indexOf(var7) ^ -1) > -1) {
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
          var8 = null;
          boolean discarded$1 = this.a((String) null, true);
          var4 = param0.toLowerCase();
          if (var3.length() > 0) {
            if (-1 > (var4.length() ^ -1)) {
              var5 = var3.lastIndexOf("@");
              if ((var5 ^ -1) <= -1) {
                if (var5 < var3.length() + -1) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(1 + var5);
                  if (-1 < (var4.indexOf(var6) ^ -1)) {
                    if (var4.indexOf(var7) <= -1) {
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

    private final static boolean a(byte param0, String param1, String param2) {
        int var3 = 0;
        if (lo.a(param2, 59)) {
          return false;
        } else {
          if (!qc.a(param2, -122)) {
            if (bf.a(param2, false)) {
              return false;
            } else {
              if (param1.length() != 0) {
                var3 = 94 / ((param0 - -31) / 58);
                if (wp.a(param2, -1, param1)) {
                  return false;
                } else {
                  if (!dq.a(param2, -83, param1)) {
                    if (tf.a(112, param2, param1)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    jn(ga param0, ga param1, ga param2) {
        super(param0);
        ((jn) this).field_r = param2;
        ((jn) this).field_j = param1;
    }

    final String a(String param0, int param1) {
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        var7 = ((jn) this).field_j.field_o.toLowerCase();
        var4 = param0.toLowerCase();
        if (var4.length() != 0) {
          var5 = var4;
          if (!bf.a(var5, false)) {
            if (!lo.a(var5, 52)) {
              var6 = -39 % ((41 - param1) / 49);
              if (!qc.a(var5, -121)) {
                if (!this.a(param0, false)) {
                  if (0 < var7.length()) {
                    if (wp.a(var5, -1, var7)) {
                      return tp.field_d;
                    } else {
                      if (dq.a(var5, -65, var7)) {
                        return rg.field_c;
                      } else {
                        if (tf.a(81, var5, var7)) {
                          return tp.field_d;
                        } else {
                          return dq.field_G;
                        }
                      }
                    }
                  } else {
                    return sl.field_u;
                  }
                } else {
                  return kd.field_k;
                }
              } else {
                return fk.field_q;
              }
            } else {
              return pb.field_c;
            }
          } else {
            return dq.field_G;
          }
        } else {
          return null;
        }
    }

    final oi a(String param0, byte param1) {
        String var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((jn) this).field_j.field_o.toLowerCase();
        var4 = param0.toLowerCase();
        if (param1 == -122) {
          if (0 != var4.length()) {
            if (!jn.a((byte) 112, var3, var4)) {
              return rk.field_c;
            } else {
              if (this.a(param0, false)) {
                return rk.field_c;
              } else {
                return ih.field_b;
              }
            }
          } else {
            return rk.field_c;
          }
        } else {
          var5 = null;
          oi discarded$5 = ((jn) this).a((String) null, (byte) 73);
          if (0 != var4.length()) {
            if (!jn.a((byte) 112, var3, var4)) {
              return rk.field_c;
            } else {
              if (this.a(param0, false)) {
                return rk.field_c;
              } else {
                return ih.field_b;
              }
            }
          } else {
            return rk.field_c;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Bonus Levels complete";
        field_l = "Right First Time";
        field_k = "Loading fonts";
    }
}
