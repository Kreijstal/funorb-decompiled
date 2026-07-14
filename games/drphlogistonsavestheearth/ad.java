/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends ei {
    static String field_r;
    static nh field_t;
    static ok field_q;
    static String field_p;
    private kl field_u;
    private kl field_w;
    static he[] field_v;
    static he[] field_s;

    final static boolean a(vj param0, byte param1, vj param2, vj param3) {
        if (param3.a(0)) {
          if (param3.a(255, "commonui")) {
            if (param1 <= -53) {
              L0: {
                if (!param2.a(0)) {
                  break L0;
                } else {
                  if (!param2.a(255, "commonui")) {
                    break L0;
                  } else {
                    if (param0.a(0)) {
                      if (!param0.a(255, "button.gif")) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
              return false;
            } else {
              L1: {
                field_v = null;
                if (!param2.a(0)) {
                  break L1;
                } else {
                  if (!param2.a(255, "commonui")) {
                    break L1;
                  } else {
                    if (param0.a(0)) {
                      if (!param0.a(255, "button.gif")) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    ad(kl param0, kl param1, kl param2) {
        super(param0);
        ((ad) this).field_u = param1;
        ((ad) this).field_w = param2;
    }

    final String a(byte param0, String param1) {
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        var6 = ((ad) this).field_u.field_p.toLowerCase();
        if (param0 > 47) {
          var9 = param1.toLowerCase();
          if (var9.length() != 0) {
            var10 = var9;
            if (!kj.a(var10, (byte) 59)) {
              if (oi.a(8975, var10)) {
                return field_p;
              } else {
                if (g.b((byte) 111, var10)) {
                  return rg.field_b;
                } else {
                  if (!this.b(-113, param1)) {
                    if (-1 > (var6.length() ^ -1)) {
                      if (!rb.a(var6, var10, -1)) {
                        if (gk.a(-1, var6, var10)) {
                          return vg.field_x;
                        } else {
                          if (pc.a((byte) -115, var6, var10)) {
                            return nj.field_c;
                          } else {
                            return nj.field_e;
                          }
                        }
                      } else {
                        return nj.field_c;
                      }
                    } else {
                      return ae.field_jb;
                    }
                  } else {
                    return rd.field_E;
                  }
                }
              }
            } else {
              return nj.field_e;
            }
          } else {
            return null;
          }
        } else {
          field_q = null;
          var7 = param1.toLowerCase();
          if (var7.length() != 0) {
            var8 = var7;
            if (!kj.a(var8, (byte) 59)) {
              if (oi.a(8975, var8)) {
                return field_p;
              } else {
                if (g.b((byte) 111, var8)) {
                  return rg.field_b;
                } else {
                  if (!this.b(-113, param1)) {
                    if (-1 > (var6.length() ^ -1)) {
                      if (!rb.a(var6, var8, -1)) {
                        if (gk.a(-1, var6, var8)) {
                          return vg.field_x;
                        } else {
                          if (pc.a((byte) -115, var6, var8)) {
                            return nj.field_c;
                          } else {
                            return nj.field_e;
                          }
                        }
                      } else {
                        return nj.field_c;
                      }
                    } else {
                      return ae.field_jb;
                    }
                  } else {
                    return rd.field_E;
                  }
                }
              }
            } else {
              return nj.field_e;
            }
          } else {
            return null;
          }
        }
    }

    final static hg a(String param0, int param1) {
        String var2 = null;
        hg var3 = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null != vg.field_j) {
          L0: {
            var6 = (CharSequence) (Object) param0;
            var2 = rh.a(-115, var6);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var6;
              break L0;
            }
          }
          var3 = (hg) (Object) vg.field_j.a((long)var2.hashCode(), -122);
          L1: while (true) {
            if (var3 != null) {
              L2: {
                var7 = (CharSequence) (Object) var3.field_V;
                var4 = rh.a(125, var7);
                if (var4 != null) {
                  break L2;
                } else {
                  var4 = var3.field_V;
                  break L2;
                }
              }
              if (!var4.equals((Object) (Object) var2)) {
                var3 = (hg) (Object) vg.field_j.b(-1);
                continue L1;
              } else {
                return var3;
              }
            } else {
              var4_int = -26 / ((25 - param1) / 55);
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final vh a(int param0, String param1) {
        String var3 = null;
        String var4 = null;
        if (param0 != 8192) {
            Object var5 = null;
            boolean discarded$0 = ad.a((vj) null, (byte) -70, (vj) null, (vj) null);
            var3 = ((ad) this).field_u.field_p.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() == 0) {
                return u.field_b;
            }
            if (!u.a(var4, false, var3)) {
                return u.field_b;
            }
            if (!(!this.b(116, param1))) {
                return u.field_b;
            }
            return ce.field_e;
        }
        var3 = ((ad) this).field_u.field_p.toLowerCase();
        var4 = param1.toLowerCase();
        if (var4.length() == 0) {
            return u.field_b;
        }
        if (!u.a(var4, false, var3)) {
            return u.field_b;
        }
        if (!(!this.b(116, param1))) {
            return u.field_b;
        }
        return ce.field_e;
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        var3 = ((ad) this).field_w.field_p.toLowerCase();
        var4 = 88 % ((param0 - 35) / 57);
        var5 = param1.toLowerCase();
        if (var3.length() > 0) {
          if ((var5.length() ^ -1) < -1) {
            var6 = var3.lastIndexOf("@");
            if ((var6 ^ -1) <= -1) {
              if (-1 + var3.length() > var6) {
                var7 = var3.substring(0, var6);
                var8 = var3.substring(1 + var6);
                if (0 <= var5.indexOf(var7)) {
                  return true;
                } else {
                  if ((var5.indexOf(var8) ^ -1) > -1) {
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

    public static void e(int param0) {
        field_t = null;
        field_r = null;
        field_q = null;
        field_v = null;
        field_p = null;
        field_s = null;
        if (param0 != 0) {
            field_s = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Type your email address again to make sure it's correct";
        field_t = null;
        field_p = "Passwords can only contain letters and numbers";
    }
}
