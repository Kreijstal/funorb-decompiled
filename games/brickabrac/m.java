/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private String field_l;
    static boolean field_a;
    static int field_j;
    static String field_k;
    static int field_i;
    static int field_b;
    static int field_h;
    private boolean field_g;
    static String field_d;
    static qh field_c;
    static ie field_f;
    static String field_e;

    final static boolean a(int param0) {
        if (param0 == 2) {
          if (wo.field_b != null) {
            if (null == wo.field_b.g(-113)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_h = 108;
          if (wo.field_b != null) {
            if (null == wo.field_b.g(-113)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var9 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (!Character.isISOControl(param1)) {
          if (!rk.a((byte) -125, param1)) {
            if (param0) {
              var13 = ce.field_f;
              var9 = var13;
              var6 = var9;
              var2 = var6;
              var3 = 0;
              L0: while (true) {
                if (var13.length <= var3) {
                  var14 = si.field_n;
                  var3 = 0;
                  L1: while (true) {
                    if (var14.length > var3) {
                      var4 = var14[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L1;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  var4 = var13[var3];
                  if (param1 == var4) {
                    return true;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              boolean discarded$5 = m.a(-100);
              var11 = ce.field_f;
              var7 = var11;
              var6 = var7;
              var2 = var6;
              var3 = 0;
              L2: while (true) {
                if (var11.length <= var3) {
                  var12 = si.field_n;
                  var3 = 0;
                  L3: while (true) {
                    if (var12.length > var3) {
                      var4 = var12[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L3;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  var4 = var11[var3];
                  if (param1 == var4) {
                    return true;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, String param1) {
        CharSequence var3 = null;
        if (ld.field_s) {
          if (ng.field_b == 2) {
            if (kb.field_Qb != null) {
              var3 = (CharSequence) (Object) param1;
              if (!kb.field_Qb.equals((Object) (Object) gb.a(var3, param0 + -13073))) {
                return false;
              } else {
                if (param0 != 13134) {
                  field_e = null;
                  return true;
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
    }

    m(String param0) {
        this(param0, false);
    }

    public static void c(int param0) {
        field_d = null;
        field_k = null;
        if (param0 != 2) {
          m.c(1);
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final String b(int param0) {
        if (param0 != 2) {
            field_k = null;
            return ((m) this).field_l;
        }
        return ((m) this).field_l;
    }

    final boolean a(byte param0) {
        if (param0 <= 24) {
            field_k = null;
            return ((m) this).field_g;
        }
        return ((m) this).field_g;
    }

    m(String param0, boolean param1) {
        ((m) this).field_l = param0;
        if (null == ((m) this).field_l) {
            ((m) this).field_l = "";
        }
        ((m) this).field_g = param1 ? true : false;
        if (((m) this).field_l.length() == 0) {
            ((m) this).field_g = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_k = "Loading fonts";
        field_d = "Unfortunately we are unable to create an account for you at this time.";
        field_e = "Visit the Account Management section on the main site to view.";
        field_c = new qh();
    }
}
