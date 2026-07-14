/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e extends cb {
    private ui field_j;
    private ui field_k;
    static String[][][] field_i;

    final static byte[] a(int param0, String param1) {
        int var2 = 87 / ((param0 - -43) / 60);
        return hb.field_e.a(param1, 0, "");
    }

    final String a(byte param0, String param1) {
        String var7 = ((e) this).field_j.field_s.toLowerCase();
        String var4 = param1.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (!(!ek.a(-78, var5))) {
            return q.field_a;
        }
        if (bi.a(0, var5)) {
            return bk.field_b;
        }
        if (nj.a(var5, (byte) 126)) {
            return ra.field_d;
        }
        int var6 = -127 % ((param0 - 49) / 56);
        if (!(!this.b(0, param1))) {
            return sj.field_e;
        }
        if (0 >= var7.length()) {
            return gj.field_c;
        }
        if (im.a(var5, 0, var7)) {
            return tc.field_r;
        }
        if (!(!a.a((byte) 121, var5, var7))) {
            return rb.field_f;
        }
        if (!(!lm.a(var7, var5, 14965))) {
            return tc.field_r;
        }
        return q.field_a;
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        fg.field_h.setTime(new Date(param0));
        var3 = fg.field_h.get(7);
        var4 = fg.field_h.get(5);
        var5 = fg.field_h.get(2);
        var6 = fg.field_h.get(1);
        var7 = fg.field_h.get(11);
        var8 = fg.field_h.get(12);
        if (param1 > -123) {
          return null;
        } else {
          var9 = fg.field_h.get(13);
          return w.field_P[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + uf.field_w[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    e(ui param0, ui param1, ui param2) {
        super(param0);
        ((e) this).field_k = param2;
        ((e) this).field_j = param1;
    }

    final ag a(String param0, int param1) {
        String var3 = ((e) this).field_j.field_s.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return fg.field_d;
        }
        if (!td.a(var3, (byte) -76, var4)) {
            return fg.field_d;
        }
        if (param1 != 5) {
            Object var5 = null;
            boolean discarded$0 = this.b(3, (String) null);
            if (!(!this.b(0, param0))) {
                return fg.field_d;
            }
            return sc.field_a;
        }
        if (!(!this.b(0, param0))) {
            return fg.field_d;
        }
        return sc.field_a;
    }

    private final boolean b(int param0, String param1) {
        int var5 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        if (param0 == 0) {
          var12 = ((e) this).field_k.field_s.toLowerCase();
          var13 = param1.toLowerCase();
          if (-1 > var12.length()) {
            if (-1 < var13.length()) {
              var5 = var12.lastIndexOf("@");
              if (0 <= var5) {
                if (var12.length() - 1 > var5) {
                  var14 = var12.substring(0, var5);
                  var15 = var12.substring(1 + var5);
                  if (var13.indexOf(var14) >= 0) {
                    return true;
                  } else {
                    if (0 <= var13.indexOf(var15)) {
                      return true;
                    } else {
                      return false;
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
          ((e) this).field_k = null;
          var8 = ((e) this).field_k.field_s.toLowerCase();
          var9 = param1.toLowerCase();
          if (-1 > var8.length()) {
            if (-1 < var9.length()) {
              var5 = var8.lastIndexOf("@");
              if (0 <= var5) {
                if (var8.length() - 1 > var5) {
                  var10 = var8.substring(0, var5);
                  var11 = var8.substring(1 + var5);
                  if (var9.indexOf(var10) >= 0) {
                    return true;
                  } else {
                    if (0 > var9.indexOf(var11)) {
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
        if (param0 != -1) {
            field_i = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
    }
}
