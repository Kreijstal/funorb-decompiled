/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends mf {
    private String field_o;
    static String[] field_k;
    private boolean field_h;
    static boolean field_n;
    static e field_l;
    private lf field_j;
    static String field_m;
    static String field_i;

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 == 2) {
          var4 = 0;
          if (!param3) {
            if (param0) {
              L0: {
                var4 += 2;
                if (param1) {
                  var4++;
                  break L0;
                } else {
                  break L0;
                }
              }
              return hl.field_h[var4];
            } else {
              L1: {
                if (param1) {
                  var4++;
                  break L1;
                } else {
                  break L1;
                }
              }
              return hl.field_h[var4];
            }
          } else {
            var4 += 4;
            if (param0) {
              L2: {
                var4 += 2;
                if (param1) {
                  var4++;
                  break L2;
                } else {
                  break L2;
                }
              }
              return hl.field_h[var4];
            } else {
              L3: {
                if (param1) {
                  var4++;
                  break L3;
                } else {
                  break L3;
                }
              }
              return hl.field_h[var4];
            }
          }
        } else {
          field_n = false;
          var4 = 0;
          if (param3) {
            var4 += 4;
            if (!param0) {
              L4: {
                if (param1) {
                  var4++;
                  break L4;
                } else {
                  break L4;
                }
              }
              return hl.field_h[var4];
            } else {
              L5: {
                var4 += 2;
                if (param1) {
                  var4++;
                  break L5;
                } else {
                  break L5;
                }
              }
              return hl.field_h[var4];
            }
          } else {
            if (param0) {
              L6: {
                var4 += 2;
                if (param1) {
                  var4++;
                  break L6;
                } else {
                  break L6;
                }
              }
              return hl.field_h[var4];
            } else {
              L7: {
                if (param1) {
                  var4++;
                  break L7;
                } else {
                  break L7;
                }
              }
              return hl.field_h[var4];
            }
          }
        }
    }

    qc(ul param0, ul param1) {
        super(param0);
        ((qc) this).field_h = false;
        ((qc) this).field_o = "";
        ((qc) this).field_j = new lf(param0, param1);
    }

    final String a(String param0, boolean param1) {
        if (((qc) this).field_j.a((byte) -60, param0) != fb.field_e) {
          if (((qc) this).a((byte) -95, param0) == fb.field_e) {
            return te.field_d;
          } else {
            if (!param1) {
              String discarded$2 = qc.a(false, true, -100, true);
              return si.field_d;
            } else {
              return si.field_d;
            }
          }
        } else {
          return ((qc) this).field_j.a(param0, true);
        }
    }

    final fi a(byte param0, String param1) {
        if (param0 > -44) {
            return null;
        }
        if (((qc) this).field_j.a((byte) -112, param1) == fb.field_e) {
            return fb.field_e;
        }
        if (param1.equals((Object) (Object) ((qc) this).field_o)) {
            return !((qc) this).field_h ? fb.field_e : nn.field_q;
        }
        vj var3 = uc.a(-112, param1);
        if (!(var3.c(17237))) {
            return qh.field_x;
        }
        ((qc) this).field_o = param1;
        ((qc) this).field_h = var3.b(8909);
        return !((qc) this).field_h ? fb.field_e : nn.field_q;
    }

    public static void e(int param0) {
        if (param0 != -1) {
            return;
        }
        field_k = null;
        field_i = null;
        field_m = null;
        field_l = null;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            wm.field_jb = param0;
            try {
                var6 = param1.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if ((param0.length() ^ -1) != param2) {
                    var5 = var7 + "; Expires=" + ha.a(ri.a(-3) + 94608000000L, 13) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                kf.a(param1, true, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            am.a(param2 + 73, param1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_n = false;
        field_l = new e(0, 2, 2, 1);
        field_i = "Return to Pause Menu";
    }
}
