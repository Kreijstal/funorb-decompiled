/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends mf {
    static int[] field_m;
    private og field_l;
    private og field_k;

    final ok a(int param0, String param1) {
        String var3 = ((rh) this).field_l.field_k.toLowerCase();
        String var4 = param1.toLowerCase();
        if (!(param0 != (var4.length() ^ -1))) {
            return hg.field_c;
        }
        if (!(od.a(var4, var3, 67))) {
            return hg.field_c;
        }
        if (!(!this.a((byte) 38, param1))) {
            return hg.field_c;
        }
        return gf.field_V;
    }

    rh(og param0, og param1, og param2) {
        super(param0);
        ((rh) this).field_l = param1;
        ((rh) this).field_k = param2;
    }

    private final boolean a(byte param0, String param1) {
        String var3 = null;
        int var5 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        var3 = ((rh) this).field_k.field_k.toLowerCase();
        if (param0 == 38) {
          var11 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (-1 > (var11.length() ^ -1)) {
              var5 = var3.lastIndexOf("@");
              if ((var5 ^ -1) <= -1) {
                if (var5 < var3.length() + -1) {
                  var12 = var3.substring(0, var5);
                  var13 = var3.substring(var5 - -1);
                  if (-1 >= (var11.indexOf(var12) ^ -1)) {
                    return true;
                  } else {
                    if (0 > var11.indexOf(var13)) {
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
          rh.f(115);
          var8 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (-1 > (var8.length() ^ -1)) {
              var5 = var3.lastIndexOf("@");
              if ((var5 ^ -1) <= -1) {
                if (var5 < var3.length() + -1) {
                  var9 = var3.substring(0, var5);
                  var10 = var3.substring(var5 - -1);
                  if (-1 >= (var8.indexOf(var9) ^ -1)) {
                    return true;
                  } else {
                    if (0 > var8.indexOf(var10)) {
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

    public static void f(int param0) {
        int var1 = 98 % ((param0 - -57) / 39);
        field_m = null;
    }

    final String a(String param0, int param1) {
        String var4 = null;
        Object var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var7 = ((rh) this).field_l.field_k.toLowerCase();
        var4 = param0.toLowerCase();
        if (var4.length() != 0) {
          if (param1 == -1) {
            var9 = var4;
            if (!ub.a(var9, param1 ^ -125)) {
              if (ri.a((byte) -56, var9)) {
                return dc.field_o;
              } else {
                if (p.a(false, var9)) {
                  return pj.field_L;
                } else {
                  if (!this.a((byte) 38, param0)) {
                    if (0 < var7.length()) {
                      if (pd.a(var7, (byte) -117, var9)) {
                        return fi.field_v;
                      } else {
                        if (!pa.a(0, var7, var9)) {
                          if (id.a(var9, var7, 0)) {
                            return fi.field_v;
                          } else {
                            return bh.field_d;
                          }
                        } else {
                          return gi.field_d;
                        }
                      }
                    } else {
                      return ug.field_F;
                    }
                  } else {
                    return wh.field_c;
                  }
                }
              }
            } else {
              return bh.field_d;
            }
          } else {
            var6 = null;
            ok discarded$1 = ((rh) this).a(126, (String) null);
            var8 = var4;
            if (!ub.a(var8, param1 ^ -125)) {
              if (ri.a((byte) -56, var8)) {
                return dc.field_o;
              } else {
                if (p.a(false, var8)) {
                  return pj.field_L;
                } else {
                  if (!this.a((byte) 38, param0)) {
                    if (0 < var7.length()) {
                      if (pd.a(var7, (byte) -117, var8)) {
                        return fi.field_v;
                      } else {
                        if (!pa.a(0, var7, var8)) {
                          if (id.a(var8, var7, 0)) {
                            return fi.field_v;
                          } else {
                            return bh.field_d;
                          }
                        } else {
                          return gi.field_d;
                        }
                      }
                    } else {
                      return ug.field_F;
                    }
                  } else {
                    return wh.field_c;
                  }
                }
              }
            } else {
              return bh.field_d;
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
