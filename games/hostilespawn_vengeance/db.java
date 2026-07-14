/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends hi {
    private ig field_q;
    private ig field_p;
    static java.awt.Frame field_r;
    static kk field_o;
    static int[] field_t;
    static String field_u;
    static int[] field_s;

    final String a(byte param0, String param1) {
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var7 = ((db) this).field_q.field_n.toLowerCase();
        var4 = param1.toLowerCase();
        var5 = 114 / ((-24 - param0) / 35);
        if (0 != var4.length()) {
          var6 = var4;
          if (vg.a(true, var6)) {
            return ei.field_k;
          } else {
            if (!nf.a(var6, -29205)) {
              if (pb.a(17032, var6)) {
                return uj.field_i;
              } else {
                if (!this.a(121, param1)) {
                  if (0 < var7.length()) {
                    if (kc.a(var6, true, var7)) {
                      return jc.field_e;
                    } else {
                      if (!vh.a(var7, 29360, var6)) {
                        if (eg.a(false, var7, var6)) {
                          return jc.field_e;
                        } else {
                          return ei.field_k;
                        }
                      } else {
                        return dc.field_c;
                      }
                    }
                  } else {
                    return l.field_b;
                  }
                } else {
                  return hg.field_c;
                }
              }
            } else {
              return g.field_R;
            }
          }
        } else {
          return null;
        }
    }

    final static String a(byte[] param0, int param1, byte param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var12 = new char[param3];
        var11 = var12;
        var10 = var11;
        var4 = var10;
        var5 = 0;
        if (param2 > -113) {
          return null;
        } else {
          var6 = 0;
          L0: while (true) {
            if (param3 <= var6) {
              return new String(var12, 0, var5);
            } else {
              var7 = 255 & param0[param1 + var6];
              if (0 != var7) {
                L1: {
                  if ((var7 ^ -1) > -129) {
                    break L1;
                  } else {
                    if (var7 >= 160) {
                      break L1;
                    } else {
                      L2: {
                        var8 = kh.field_hb[-128 + var7];
                        if (var8 != 0) {
                          break L2;
                        } else {
                          var8 = 63;
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    }
                  }
                }
                var5++;
                var10[var5] = (char)var7;
                var6++;
                var6++;
                continue L0;
              } else {
                var6++;
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    db(ig param0, ig param1, ig param2) {
        super(param0);
        ((db) this).field_q = param1;
        ((db) this).field_p = param2;
    }

    public static void d(byte param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        field_s = null;
        if (param0 > -35) {
            return;
        }
        field_o = null;
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var3 = ((db) this).field_p.field_n.toLowerCase();
        var4 = param1.toLowerCase();
        if (var3.length() < -1) {
          if (-1 < var4.length()) {
            var5 = var3.lastIndexOf("@");
            if (var5 < 0) {
              if (param0 <= 104) {
                return false;
              } else {
                return false;
              }
            } else {
              if (var5 < var3.length() - 1) {
                var6 = var3.substring(0, var5);
                var7 = var3.substring(1 + var5);
                if (0 <= var4.indexOf(var6)) {
                  return true;
                } else {
                  if (var4.indexOf(var7) < 0) {
                    if (param0 <= 104) {
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                if (param0 <= 104) {
                  return false;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (param0 <= 104) {
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param0 <= 104) {
            return false;
          } else {
            return false;
          }
        }
    }

    final bm a(String param0, byte param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        var3 = ((db) this).field_q.field_n.toLowerCase();
        var4 = param0.toLowerCase();
        if (var4.length() != 0) {
          if (ja.a(var4, var3, 0)) {
            var5 = -63 % ((3 - param1) / 42);
            if (this.a(123, param0)) {
              return bi.field_d;
            } else {
              return nd.field_d;
            }
          } else {
            return bi.field_d;
          }
        } else {
          return bi.field_d;
        }
    }

    final static void a(boolean param0, int param1, ji param2) {
        kh.a(param2, param1, (byte) -105, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Type your email address again to make sure it's correct";
    }
}
