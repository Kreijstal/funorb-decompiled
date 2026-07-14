/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends tj {
    private rl field_n;
    static db field_m;
    private rl field_o;
    static String field_l;

    va(rl param0, rl param1, rl param2) {
        super(param0);
        ((va) this).field_n = param2;
        ((va) this).field_o = param1;
    }

    final static int a(char param0, boolean param1) {
        if (!param1) {
            return 107;
        }
        return param0 <= 0 ? -1 : param0;
    }

    public static void d(byte param0) {
        field_m = null;
        field_l = null;
        if (param0 >= -80) {
            field_l = null;
        }
    }

    final String a(byte param0, String param1) {
        Object var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        var7 = ((va) this).field_o.field_u.toLowerCase();
        if (param0 == -126) {
          var10 = param1.toLowerCase();
          if (var10.length() != 0) {
            var11 = var10;
            if (ph.a((byte) 107, var11)) {
              return pe.field_a;
            } else {
              if (sh.d(var11, (byte) 50)) {
                return rg.field_d;
              } else {
                if (hd.a(var11, 17)) {
                  return td.field_b;
                } else {
                  if (!this.a(param1, true)) {
                    if (var7.length() > 0) {
                      if (!bi.a((byte) -124, var7, var11)) {
                        if (pd.a(var7, var11, 95)) {
                          return vf.field_s;
                        } else {
                          if (ni.a((byte) 120, var11, var7)) {
                            return uf.field_l;
                          } else {
                            return pe.field_a;
                          }
                        }
                      } else {
                        return uf.field_l;
                      }
                    } else {
                      return qb.field_a;
                    }
                  } else {
                    return rb.field_e;
                  }
                }
              }
            }
          } else {
            return null;
          }
        } else {
          var6 = null;
          String discarded$1 = ((va) this).a((byte) -44, (String) null);
          var8 = param1.toLowerCase();
          if (var8.length() != 0) {
            var9 = var8;
            if (ph.a((byte) 107, var9)) {
              return pe.field_a;
            } else {
              if (sh.d(var9, (byte) 50)) {
                return rg.field_d;
              } else {
                if (hd.a(var9, 17)) {
                  return td.field_b;
                } else {
                  if (!this.a(param1, true)) {
                    if (var7.length() > 0) {
                      if (!bi.a((byte) -124, var7, var9)) {
                        if (pd.a(var7, var9, 95)) {
                          return vf.field_s;
                        } else {
                          if (ni.a((byte) 120, var9, var7)) {
                            return uf.field_l;
                          } else {
                            return pe.field_a;
                          }
                        }
                      } else {
                        return uf.field_l;
                      }
                    } else {
                      return qb.field_a;
                    }
                  } else {
                    return rb.field_e;
                  }
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    private final boolean a(String param0, boolean param1) {
        String var4 = null;
        int var5 = 0;
        Object var8 = null;
        String var9 = null;
        String var10 = null;
        String var27 = null;
        String var28 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        var9 = ((va) this).field_n.field_u.toLowerCase();
        if (param1) {
          var31 = param0.toLowerCase();
          if (var9.length() > 0) {
            if ((var31.length() ^ -1) < -1) {
              var5 = var9.lastIndexOf("@");
              if (var5 >= 0) {
                if (-1 + var9.length() > var5) {
                  var32 = var9.substring(0, var5);
                  var33 = var9.substring(1 + var5);
                  if (-1 >= (var31.indexOf(var32) ^ -1)) {
                    return true;
                  } else {
                    if (var31.indexOf(var33) < 0) {
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
          var8 = null;
          String discarded$1 = ((va) this).a((byte) 48, (String) null);
          var10 = param0.toLowerCase();
          var4 = var10;
          if (var9.length() > 0) {
            if ((var10.length() ^ -1) < -1) {
              var5 = var9.lastIndexOf("@");
              if (var5 >= 0) {
                if (-1 + var9.length() > var5) {
                  var27 = var9.substring(0, var5);
                  var28 = var9.substring(1 + var5);
                  if (-1 >= (var10.indexOf(var27) ^ -1)) {
                    return true;
                  } else {
                    if (var10.indexOf(var28) < 0) {
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

    final sc a(int param0, String param1) {
        String var3 = ((va) this).field_o.field_u.toLowerCase();
        String var4 = param1.toLowerCase();
        if (!(param0 != var4.length())) {
            return ni.field_b;
        }
        if (!(ui.a(var3, var4, (byte) -118))) {
            return ni.field_b;
        }
        if (!(!this.a(param1, true))) {
            return ni.field_b;
        }
        return rh.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "OK";
    }
}
