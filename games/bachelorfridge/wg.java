/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends aba {
    static boolean field_g;
    private lka field_j;
    static String field_h;
    private lka field_k;
    static sna[] field_i;

    final jg a(String param0, boolean param1) {
        String var3 = null;
        String var4 = null;
        var3 = ((wg) this).field_j.field_w.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 == var4.length()) {
          return jt.field_f;
        } else {
          if (bq.a(var4, 20133, var3)) {
            if (this.a(true, param0)) {
              return jt.field_f;
            } else {
              if (param1) {
                return null;
              } else {
                return cm.field_u;
              }
            }
          } else {
            return jt.field_f;
          }
        }
    }

    final static void a(boolean param0) {
        if (!qo.field_c) {
            throw new IllegalStateException();
        }
        if (param0) {
            return;
        }
        lia.field_i = true;
        gq.a(true, 19626);
        jv.field_j = 0;
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != 22753) {
            field_i = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final String a(byte param0, String param1) {
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        var7 = ((wg) this).field_j.field_w.toLowerCase();
        var4 = param1.toLowerCase();
        if (var4.length() != 0) {
          var5 = var4;
          if (eha.a(15, var5)) {
            return fd.field_E;
          } else {
            if (kaa.a(var5, (byte) 63)) {
              return sh.field_D;
            } else {
              var6 = 24 / ((param0 - -8) / 45);
              if (!tfa.a(-124, var5)) {
                if (!this.a(true, param1)) {
                  if (0 < var7.length()) {
                    if (vs.a(-62, var7, var5)) {
                      return me.field_s;
                    } else {
                      if (cw.a(var5, var7, true)) {
                        return pka.field_a;
                      } else {
                        if (db.a(var7, var5, false)) {
                          return me.field_s;
                        } else {
                          return fd.field_E;
                        }
                      }
                    }
                  } else {
                    return nw.field_q;
                  }
                } else {
                  return um.field_b;
                }
              } else {
                return uv.field_k;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final boolean a(boolean param0, String param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var7 = param1;
        if (param0) {
          var3 = ((wg) this).field_k.field_w.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (var4.length() < -1) {
              var5 = var3.lastIndexOf("@");
              if (-1 <= var5) {
                if (-1 + var3.length() > var5) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(var5 + 1);
                  if (0 > var4.indexOf(var6)) {
                    if (0 <= var4.indexOf(var7)) {
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
        } else {
          wg.a(true);
          var3 = ((wg) this).field_k.field_w.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (var4.length() < -1) {
              var5 = var3.lastIndexOf("@");
              if (-1 <= var5) {
                if (-1 + var3.length() > var5) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(var5 + 1);
                  if (0 > var4.indexOf(var6)) {
                    if (0 > var4.indexOf(var7)) {
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
    }

    final static int a(int param0, byte param1) {
        String var2 = null;
        String var2_ref = null;
        if (param1 != 83) {
            wg.a(false, -62);
            var2 = lka.field_E[param0][19];
            var2_ref = var2.trim();
            if (!(!var2_ref.equals((Object) (Object) ""))) {
                return -1;
            }
            return ((ji) (Object) pga.field_b.a(true, (long)var2_ref.hashCode())).field_h;
        }
        var2 = lka.field_E[param0][19];
        var2_ref = var2.trim();
        if (!(!var2_ref.equals((Object) (Object) ""))) {
            return -1;
        }
        return ((ji) (Object) pga.field_b.a(true, (long)var2_ref.hashCode())).field_h;
    }

    wg(lka param0, lka param1, lka param2) {
        super(param0);
        ((wg) this).field_k = param2;
        ((wg) this).field_j = param1;
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -21) {
            return;
        }
        if (jea.field_c != null) {
            if (!jea.field_c.a(param0, (byte) -113)) {
                return;
            }
            jea.field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This is your shopping list. You can click this to be taken to groceout.com, where you can spend your ill-gotten gains on more food!";
        field_g = false;
    }
}
