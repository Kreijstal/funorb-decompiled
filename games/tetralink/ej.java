/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends mc {
    int field_u;
    int field_q;
    static db field_r;
    int field_s;
    boolean field_x;
    int field_n;
    static String field_p;
    static String field_w;
    int field_y;
    static int field_z;
    static String field_t;
    static byte[] field_o;
    static oh field_v;

    final static boolean a(String param0, int param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param1 != 4) {
          field_v = null;
          var3 = (CharSequence) (Object) param0;
          return ik.field_f.equals((Object) (Object) cc.a(var3, (byte) 103));
        } else {
          var4 = (CharSequence) (Object) param0;
          return ik.field_f.equals((Object) (Object) cc.a(var4, (byte) 103));
        }
    }

    final static void a(boolean param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        Object var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        var3 = -22 / ((-38 - param2) / 57);
        if (lf.field_b == null) {
          return;
        } else {
          var4 = lf.field_b.a(param0, (byte) 58);
          if (-1 != (var4 ^ -1)) {
            if ((var4 ^ -1) != -3) {
              ke.field_c = -1;
              lf.field_b = null;
              return;
            } else {
              if (null == lf.field_b.field_jb) {
                ke.field_c = -1;
                lf.field_b = null;
                return;
              } else {
                if (!lf.field_b.field_jb.equals((Object) (Object) "")) {
                  L0: {
                    if (lf.field_b.field_jb.charAt(0) == 91) {
                      var5 = lf.field_b.field_jb;
                      break L0;
                    } else {
                      var8 = (CharSequence) (Object) lf.field_b.field_jb;
                      var5 = cc.a(var8, (byte) 124);
                      break L0;
                    }
                  }
                  L1: {
                    var6 = null;
                    if ((ke.field_c ^ -1) != -1) {
                      break L1;
                    } else {
                      var6 = (Object) (Object) qf.a((byte) 122, var5, param1);
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 != (ke.field_c ^ -1)) {
                      break L2;
                    } else {
                      var6 = (Object) (Object) ma.a(false, var5, param1);
                      break L2;
                    }
                  }
                  L3: {
                    if ((ke.field_c ^ -1) == -3) {
                      var6 = (Object) (Object) li.a(param1, var5, 2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((ke.field_c ^ -1) == -4) {
                      var6 = (Object) (Object) aa.a(var5, param1, 2, var5);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var6 == null) {
                    ke.field_c = -1;
                    lf.field_b = null;
                    return;
                  } else {
                    var7 = null;
                    fi.a(0, 0, var5, 2, (String) var6, (String) null);
                    ke.field_c = -1;
                    lf.field_b = null;
                    return;
                  }
                } else {
                  ke.field_c = -1;
                  lf.field_b = null;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_v = null;
        field_o = null;
        field_p = null;
        field_w = null;
        if (param0 != -1) {
          field_z = -123;
          field_t = null;
          return;
        } else {
          field_t = null;
          return;
        }
    }

    ej(int param0, int param1, boolean param2) {
        ((ej) this).field_y = 0;
        ((ej) this).field_q = 0;
        ((ej) this).field_x = param2 ? true : false;
        ((ej) this).field_u = param1;
        ((ej) this).field_n = param0;
    }

    ej(bi param0, boolean param1) {
        ((ej) this).field_x = param1 ? true : false;
        ((ej) this).field_s = 0;
        ((ej) this).field_q = 0;
        ((ej) this).field_y = 0;
        ((ej) this).field_u = param0.field_f;
        ((ej) this).field_n = param0.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Offer rematch";
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = new db(2, 4, 4, 0);
        field_z = 250;
        field_t = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
