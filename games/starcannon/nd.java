/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends qf {
    static hl[] field_j;
    static String field_l;
    static ue field_p;
    static int field_k;
    private String field_n;
    static int field_m;
    private boolean field_o;

    public static void g(int param0) {
        field_l = null;
        field_p = null;
        field_j = null;
        if (param0 == 0) {
            return;
        }
        field_m = 113;
    }

    nd(fe param0) {
        super(param0);
        ((nd) this).field_o = false;
    }

    final p a(String param0, int param1) {
        ig var3 = null;
        CharSequence var4 = (CharSequence) (Object) param0;
        if (!jj.a(200, var4)) {
            return sb.field_n;
        }
        if (param1 != -26188) {
            ((nd) this).field_n = null;
            if (!(param0.equals((Object) (Object) ((nd) this).field_n))) {
                var3 = tg.a(param1 + 26118, param0);
                if (var3 == null) {
                    return cd.field_a;
                }
                if (null != var3.field_d) {
                    return cd.field_a;
                }
                ((nd) this).field_o = var3.field_f;
                ((nd) this).field_n = param0;
            }
            return !((nd) this).field_o ? sb.field_n : bf.field_x;
        }
        if (!(param0.equals((Object) (Object) ((nd) this).field_n))) {
            var3 = tg.a(param1 + 26118, param0);
            if (var3 == null) {
                return cd.field_a;
            }
            if (null != var3.field_d) {
                return cd.field_a;
            }
            ((nd) this).field_o = var3.field_f;
            ((nd) this).field_n = param0;
        }
        return !((nd) this).field_o ? sb.field_n : bf.field_x;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        ud var10 = null;
        ud var11 = null;
        byte[] var15 = null;
        L0: {
          var10 = gf.field_c[param3];
          var11 = var10;
          var5 = var11.field_j * param0 / 1000;
          var6 = var11.field_j * param2 / 1000;
          if ((var11.field_i.length ^ -1) > (var5 + var6 ^ -1)) {
            var6 = var11.field_i.length - var5;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var15 = new byte[var6];
          ug.a(var11.field_i, var5, var15, 0, var6);
          var8 = -var5 + var11.field_h;
          if (var8 < 0) {
            var8 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var8 > var6) {
            var8 = var6;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var9 = var11.field_g + -var5;
          if (-1 >= (var9 ^ -1)) {
            break L3;
          } else {
            var9 = 0;
            break L3;
          }
        }
        L4: {
          if ((var9 ^ -1) >= (var6 ^ -1)) {
            break L4;
          } else {
            var9 = var6;
            break L4;
          }
        }
        if (param1 == -3763) {
          gf.field_c[param3] = new ud(var11.field_j, var15, var8, var9, var10.field_k);
          return;
        } else {
          int discarded$1 = nd.a(false, -9, -79);
          gf.field_c[param3] = new ud(var11.field_j, var15, var8, var9, var10.field_k);
          return;
        }
    }

    final void f(int param0) {
        if (param0 != -18507) {
            field_p = null;
            ((nd) this).field_n = null;
            return;
        }
        ((nd) this).field_n = null;
    }

    final String a(String param0, boolean param1) {
        CharSequence var6 = null;
        String var3 = null;
        ig var4 = null;
        if (param1) {
            Object var5 = null;
            String discarded$0 = ((nd) this).a((String) null, false);
            var6 = (CharSequence) (Object) param0;
            var3 = lj.a((byte) -5, var6);
            if (!(var3 == null)) {
                return var3;
            }
            if (!param0.equals((Object) (Object) ((nd) this).field_n)) {
                var4 = tg.a(-58, param0);
                if (var4 == null) {
                    return null;
                }
                if (null != var4.field_d) {
                    return null;
                }
                ((nd) this).field_n = param0;
                ((nd) this).field_o = var4.field_f;
            }
            if (!((nd) this).field_o) {
                return cf.field_s;
            }
            return ll.field_a;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        var3 = lj.a((byte) -5, var7);
        if (!(var3 == null)) {
            return var3;
        }
        if (!param0.equals((Object) (Object) ((nd) this).field_n)) {
            var4 = tg.a(-58, param0);
            if (var4 == null) {
                return null;
            }
            if (null != var4.field_d) {
                return null;
            }
            ((nd) this).field_n = param0;
            ((nd) this).field_o = var4.field_f;
        }
        if (!((nd) this).field_o) {
            return cf.field_s;
        }
        return ll.field_a;
    }

    final static boolean b(boolean param0) {
        hd.field_p = param0 ? true : false;
        wa.field_a = 15000L + dd.b(109);
        return (bl.field_a ^ -1) == -12 ? true : false;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = StarCannon.field_A;
        if (!param0) {
            field_j = null;
            var3 = 0;
            while (0 < param2) {
                var3 = var3 << -1464204255 | param1 & 1;
                param1 = param1 >>> 1;
                param2--;
            }
            return var3;
        }
        var3 = 0;
        while (0 < param2) {
            var3 = var3 << -1464204255 | param1 & 1;
            param1 = param1 >>> 1;
            param2--;
        }
        return var3;
    }

    final static void b(int param0, byte param1) {
        rf var2 = null;
        int var3 = 0;
        Object var4 = null;
        of var4_ref = null;
        var4 = null;
        var3 = StarCannon.field_A;
        if (param1 == -66) {
          var4_ref = (of) (Object) fi.field_c.c(param1 + -3839);
          L0: while (true) {
            if (var4_ref == null) {
              var2 = ab.field_H.c(param1 + -3839);
              L1: while (true) {
                if (var2 != null) {
                  sc.a(param1 ^ -32459, param0);
                  var2 = ab.field_H.a(-16913);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              bb.a(param1 + 68, param0, var4_ref);
              var4_ref = (of) (Object) fi.field_c.a(param1 ^ 16977);
              continue L0;
            }
          }
        } else {
          field_p = null;
          var4_ref = (of) (Object) fi.field_c.c(param1 + -3839);
          L2: while (true) {
            if (var4_ref == null) {
              var2 = ab.field_H.c(param1 + -3839);
              L3: while (true) {
                if (var2 != null) {
                  sc.a(param1 ^ -32459, param0);
                  var2 = ab.field_H.a(-16913);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              bb.a(param1 + 68, param0, var4_ref);
              var4_ref = (of) (Object) fi.field_c.a(param1 ^ 16977);
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
