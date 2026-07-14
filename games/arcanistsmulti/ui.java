/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends rl {
    static String field_u;
    private rn field_t;
    static String field_q;
    private rn field_r;
    static boolean field_v;
    static boolean field_s;
    static String field_w;

    final String a(String param0, byte param1) {
        String var4 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var6 = ((ui) this).field_t.field_g.toLowerCase();
        var4 = param0.toLowerCase();
        if (param1 <= -114) {
          if (0 != var4.length()) {
            var8 = var4;
            if (bd.a((byte) -68, var8)) {
              return ji.field_i;
            } else {
              if (!ko.a(-128, var8)) {
                if (!e.b(-12055, var8)) {
                  if (!this.a(52, param0)) {
                    if (var6.length() > 0) {
                      if (hm.a(var8, var6, -1)) {
                        return rg.field_f;
                      } else {
                        if (sm.a(22230, var8, var6)) {
                          return cj.field_e;
                        } else {
                          if (w.a(var6, var8, 0)) {
                            return rg.field_f;
                          } else {
                            return ji.field_i;
                          }
                        }
                      }
                    } else {
                      return hk.field_r;
                    }
                  } else {
                    return wj.field_c;
                  }
                } else {
                  return ko.field_g;
                }
              } else {
                return cm.field_h;
              }
            }
          } else {
            return null;
          }
        } else {
          field_u = null;
          if (0 != var4.length()) {
            var7 = var4;
            if (bd.a((byte) -68, var7)) {
              return ji.field_i;
            } else {
              if (!ko.a(-128, var7)) {
                if (!e.b(-12055, var7)) {
                  if (!this.a(52, param0)) {
                    if (var6.length() > 0) {
                      if (hm.a(var7, var6, -1)) {
                        return rg.field_f;
                      } else {
                        if (sm.a(22230, var7, var6)) {
                          return cj.field_e;
                        } else {
                          if (w.a(var6, var7, 0)) {
                            return rg.field_f;
                          } else {
                            return ji.field_i;
                          }
                        }
                      }
                    } else {
                      return hk.field_r;
                    }
                  } else {
                    return wj.field_c;
                  }
                } else {
                  return ko.field_g;
                }
              } else {
                return cm.field_h;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        mn.a(param1, param0 + -95);
        le.c(param0 ^ 1, param1);
        if (param0 != 0) {
            ui.a(115, false);
        }
    }

    public static void d(int param0) {
        field_u = null;
        field_w = null;
        if (param0 < 15) {
            field_w = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    ui(rn param0, rn param1, rn param2) {
        super(param0);
        ((ui) this).field_t = param1;
        ((ui) this).field_r = param2;
    }

    final eh a(String param0, int param1) {
        int var3 = -18 / ((-50 - param1) / 36);
        String var4 = ((ui) this).field_t.field_g.toLowerCase();
        String var5 = param0.toLowerCase();
        if (var5.length() == 0) {
            return ra.field_k;
        }
        if (!dd.a(99, var5, var4)) {
            return ra.field_k;
        }
        if (!(!this.a(49, param0))) {
            return ra.field_k;
        }
        return nn.field_s;
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        var4 = -117 % ((5 - param0) / 36);
        var3 = ((ui) this).field_r.field_g.toLowerCase();
        var5 = param1.toLowerCase();
        if (var3.length() > 0) {
          if (-1 > (var5.length() ^ -1)) {
            var6 = var3.lastIndexOf("@");
            if ((var6 ^ -1) <= -1) {
              if (var6 < -1 + var3.length()) {
                var7 = var3.substring(0, var6);
                var8 = var3.substring(var6 - -1);
                if (-1 < var5.indexOf(var7)) {
                  if (-1 > var5.indexOf(var8)) {
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
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = param3.length();
        if (param2 == -38) {
          var5 = param1.length();
          var6 = param0.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          } else {
            var7 = var4;
            var8 = -var5 + var6;
            if (0 != var8) {
              var9_int = 0;
              L0: while (true) {
                var9_int = param3.indexOf(param1, var9_int);
                if (-1 >= (var9_int ^ -1)) {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L0;
                } else {
                  var9 = new StringBuilder(var7);
                  var10 = 0;
                  L1: while (true) {
                    var11 = param3.indexOf(param1, var10);
                    if (0 > var11) {
                      StringBuilder discarded$12 = var9.append(param3.substring(var10));
                      return var9.toString();
                    } else {
                      StringBuilder discarded$13 = var9.append(param3.substring(var10, var11));
                      var10 = var5 + var11;
                      StringBuilder discarded$14 = var9.append(param0);
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var9 = new StringBuilder(var7);
              var10 = 0;
              L2: while (true) {
                var11 = param3.indexOf(param1, var10);
                if (0 > var11) {
                  StringBuilder discarded$15 = var9.append(param3.substring(var10));
                  return var9.toString();
                } else {
                  StringBuilder discarded$16 = var9.append(param3.substring(var10, var11));
                  var10 = var5 + var11;
                  StringBuilder discarded$17 = var9.append(param0);
                  continue L2;
                }
              }
            }
          }
        } else {
          field_w = null;
          var5 = param1.length();
          var6 = param0.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          } else {
            var7 = var4;
            var8 = -var5 + var6;
            if (0 != var8) {
              var9_int = 0;
              L3: while (true) {
                var9_int = param3.indexOf(param1, var9_int);
                if (-1 >= (var9_int ^ -1)) {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L3;
                } else {
                  var9 = new StringBuilder(var7);
                  var10 = 0;
                  L4: while (true) {
                    var11 = param3.indexOf(param1, var10);
                    if (0 > var11) {
                      StringBuilder discarded$18 = var9.append(param3.substring(var10));
                      return var9.toString();
                    } else {
                      StringBuilder discarded$19 = var9.append(param3.substring(var10, var11));
                      var10 = var5 + var11;
                      StringBuilder discarded$20 = var9.append(param0);
                      continue L4;
                    }
                  }
                }
              }
            } else {
              var9 = new StringBuilder(var7);
              var10 = 0;
              L5: while (true) {
                var11 = param3.indexOf(param1, var10);
                if (0 > var11) {
                  StringBuilder discarded$21 = var9.append(param3.substring(var10));
                  return var9.toString();
                } else {
                  StringBuilder discarded$22 = var9.append(param3.substring(var10, var11));
                  var10 = var5 + var11;
                  StringBuilder discarded$23 = var9.append(param0);
                  continue L5;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Rating";
        field_s = true;
        field_u = "Only two targets left! Destroy the target at the base of the cliff to the left first.";
        field_w = "<%0> has withdrawn the request to join.";
    }
}
