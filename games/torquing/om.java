/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    static int field_h;
    private ei field_a;
    private int field_i;
    private int[][][] field_d;
    private int field_f;
    private int field_g;
    private ka[] field_j;
    static String field_e;
    private int field_c;
    boolean field_b;

    final int[][] a(int param0, int param1) {
        ka var3 = null;
        ka var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var5 = Torquing.field_u;
        if (param0 == 15142) {
          if (((om) this).field_g != ((om) this).field_c) {
            if ((((om) this).field_g ^ -1) == -2) {
              L0: {
                stackOut_15_0 = this;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (param1 == ((om) this).field_f) {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L0;
                } else {
                  stackOut_16_0 = this;
                  stackOut_16_1 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L0;
                }
              }
              ((om) this).field_b = stackIn_18_1 != 0;
              ((om) this).field_f = param1;
              return ((om) this).field_d[0];
            } else {
              L1: {
                var3 = ((om) this).field_j[param1];
                if (var3 != null) {
                  ((om) this).field_b = false;
                  break L1;
                } else {
                  L2: {
                    ((om) this).field_b = true;
                    if (((om) this).field_i < ((om) this).field_g) {
                      var3 = new ka(param1, ((om) this).field_i);
                      ((om) this).field_i = ((om) this).field_i + 1;
                      break L2;
                    } else {
                      var4 = (ka) (Object) ((om) this).field_a.c(-6938);
                      var3 = new ka(param1, var4.field_k);
                      ((om) this).field_j[var4.field_m] = null;
                      var4.f(param0 + -15142);
                      break L2;
                    }
                  }
                  ((om) this).field_j[param1] = var3;
                  break L1;
                }
              }
              ((om) this).field_a.b((byte) 68, (q) (Object) var3);
              return ((om) this).field_d[var3.field_k];
            }
          } else {
            L3: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (null != ((om) this).field_j[param1]) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L3;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L3;
              }
            }
            ((om) this).field_b = stackIn_6_1 != 0;
            ((om) this).field_j[param1] = da.field_b;
            return ((om) this).field_d[param1];
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            rd.field_t = param1;
            try {
                var7 = param2.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                int var6 = -25 / ((-12 - param0) / 45);
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (0 == param1.length()) {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var8 + "; Expires=" + ka.a(94608000000L + km.b(-1), -2) + "; Max-Age=" + 94608000L;
                }
                hp.a("document.cookie=\"" + var5 + "\"", 27476, param2);
            } catch (Throwable throwable) {
            }
            j.a(true, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int[][][] a(boolean param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (((om) this).field_g != ((om) this).field_c) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; ((om) this).field_g > var2; var2++) {
            ((om) this).field_j[var2] = da.field_b;
        }
        if (param0) {
            int[][] discarded$0 = ((om) this).a(-76, 126);
        }
        return ((om) this).field_d;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
            Object var6 = null;
            om.a((byte) 127, (String) null, (java.applet.Applet) null);
        }
        qg.field_z = param2;
        j.field_q = param0;
        kn.field_e = param1;
        qk.field_p = param4;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        for (var2 = 0; var2 < ((om) this).field_g; var2++) {
            ((om) this).field_d[var2][0] = null;
            ((om) this).field_d[var2][1] = null;
            ((om) this).field_d[var2][2] = null;
            ((om) this).field_d[var2] = null;
        }
        ((om) this).field_j = null;
        if (param0 > -17) {
            return;
        }
        ((om) this).field_d = null;
        ((om) this).field_a.a(0);
        ((om) this).field_a = null;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 0) {
            om.a(33, -105, -127, 51, -91);
        }
    }

    om(int param0, int param1, int param2) {
        ((om) this).field_i = 0;
        ((om) this).field_f = -1;
        ((om) this).field_a = new ei();
        ((om) this).field_b = false;
        ((om) this).field_c = param1;
        ((om) this).field_g = param0;
        ((om) this).field_d = new int[((om) this).field_g][3][param2];
        ((om) this).field_j = new ka[((om) this).field_c];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
        field_e = "Your score";
    }
}
