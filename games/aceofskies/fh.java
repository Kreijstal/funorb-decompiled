/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends vo {
    static String field_f;
    private bm field_i;
    private bm field_h;
    static String field_g;
    static boolean[] field_e;

    final static void a(int param0, float param1, String param2) {
        dq.field_b = param2;
        ct.field_I = param1;
        if (param0 >= -23) {
            field_g = (String) null;
        }
    }

    final static boolean e(int param0) {
        if (param0 != 31574) {
            field_f = (String) null;
            return nf.field_a;
        }
        return nf.field_a;
    }

    final static String c(byte param0) {
        int var1 = 106 / ((-51 - param0) / 60);
        if (ht.field_g) {
            return null;
        }
        if (jp.field_b > ok.field_o) {
            return null;
        }
        if (!(ok.field_o >= ct.field_B + jp.field_b)) {
            return qj.field_s;
        }
        return null;
    }

    private final boolean b(String param0, int param1) {
        int var5 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        if (param1 == -1) {
          var12 = ((fh) this).field_h.field_f.toLowerCase();
          var13 = param0.toLowerCase();
          if (0 < var12.length()) {
            if ((var13.length() ^ -1) < -1) {
              var5 = var12.lastIndexOf("@");
              if (var5 >= 0) {
                if (var5 < -1 + var12.length()) {
                  var14 = var12.substring(0, var5);
                  var15 = var12.substring(1 + var5);
                  if ((var13.indexOf(var14) ^ -1) <= -1) {
                    return true;
                  } else {
                    if ((var13.indexOf(var15) ^ -1) > -1) {
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
          field_e = (boolean[]) null;
          var8 = ((fh) this).field_h.field_f.toLowerCase();
          var9 = param0.toLowerCase();
          if (0 < var8.length()) {
            if ((var9.length() ^ -1) < -1) {
              var5 = var8.lastIndexOf("@");
              if (var5 >= 0) {
                if (var5 < -1 + var8.length()) {
                  var10 = var8.substring(0, var5);
                  var11 = var8.substring(1 + var5);
                  if ((var9.indexOf(var10) ^ -1) <= -1) {
                    return true;
                  } else {
                    if ((var9.indexOf(var11) ^ -1) > -1) {
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

    public static void c(boolean param0) {
        field_e = null;
        field_f = null;
        if (!param0) {
            field_f = (String) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final String a(String param0, byte param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var6 = ((fh) this).field_i.field_f.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 != var4.length()) {
          if (param1 == 72) {
            var5 = var4;
            if (vr.a(var5, param1 ^ 74)) {
              return co.field_a;
            } else {
              if (!ul.a(var5, (byte) -115)) {
                if (kc.a(var5, 26035)) {
                  return mh.field_j;
                } else {
                  if (this.b(param0, -1)) {
                    return fj.field_b;
                  } else {
                    if (var6.length() > 0) {
                      if (ol.a(var6, -128, var5)) {
                        return mr.field_a;
                      } else {
                        if (!cr.a(var5, var6, (byte) 52)) {
                          if (lb.a(var6, var5, -115)) {
                            return mr.field_a;
                          } else {
                            return co.field_a;
                          }
                        } else {
                          return qa.field_c;
                        }
                      }
                    } else {
                      return lk.field_g;
                    }
                  }
                }
              } else {
                return ii.field_g;
              }
            }
          } else {
            return (String) null;
          }
        } else {
          return null;
        }
    }

    final pt a(String param0, int param1) {
        String var3 = null;
        String var4 = null;
        if (param1 == 8192) {
          var3 = ((fh) this).field_i.field_f.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            return bt.field_a;
          } else {
            if (bu.a(118, var4, var3)) {
              if (this.b(param0, -1)) {
                return bt.field_a;
              } else {
                return fd.field_a;
              }
            } else {
              return bt.field_a;
            }
          }
        } else {
          return (pt) null;
        }
    }

    fh(bm param0, bm param1, bm param2) {
        super(param0);
        ((fh) this).field_i = param1;
        ((fh) this).field_h = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new boolean[64];
        field_g = "???";
        field_f = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
