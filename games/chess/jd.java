/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd {
    static String field_d;
    static String field_a;
    private String field_f;
    static String field_g;
    static String field_e;
    static ci field_b;
    static String field_h;
    static int[] field_i;
    static rk[] field_c;

    final void a(int param0, java.applet.Applet param1) {
        vm.a(((jd) this).field_f, 11440, param1, 31536000L, "jagex-last-login-method");
        if (param0 != 25799) {
            field_e = null;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0) {
          field_i = null;
          field_g = null;
          field_e = null;
          field_h = null;
          field_c = null;
          field_i = null;
          return;
        } else {
          field_g = null;
          field_e = null;
          field_h = null;
          field_c = null;
          field_i = null;
          return;
        }
    }

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = Chess.field_G;
              if (qh.field_c != null) {
                qh.field_c.a((byte) -103);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (null != ba.field_O) {
                ba.field_O.a(3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -91) {
                break L2;
              } else {
                field_e = null;
                break L2;
              }
            }
            L3: {
              if (kj.field_a == null) {
                break L3;
              } else {
                try {
                  L4: {
                    kj.field_a.a((byte) -87);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              }
            }
            if (null != hj.field_n) {
              var1 = 0;
              L6: while (true) {
                if (hj.field_n.length > var1) {
                  if (hj.field_n[var1] != null) {
                    try {
                      L7: {
                        hj.field_n[var1].a((byte) -87);
                        var1++;
                        var1++;
                        break L7;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        var2 = (IOException) (Object) decompiledCaughtException;
                        var1++;
                        break L8;
                      }
                    }
                    continue L6;
                  } else {
                    var1++;
                    var1++;
                    continue L6;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String b(boolean param0) {
        if (il.field_a >= 2) {
          if (qa.field_c != null) {
            if (!qa.field_c.c((byte) 122)) {
              return uk.field_a;
            } else {
              return e.field_T;
            }
          } else {
            if (fl.field_m.c((byte) 121)) {
              if (fl.field_m.b("commonui", 100)) {
                if (Chess.field_B.c((byte) 119)) {
                  if (Chess.field_B.b("commonui", 100)) {
                    if (bi.field_a.c((byte) 120)) {
                      if (bi.field_a.b((byte) -40)) {
                        if (param0) {
                          return null;
                        } else {
                          return m.field_c;
                        }
                      } else {
                        return wn.field_g + " - " + bi.field_a.a((byte) -91) + "%";
                      }
                    } else {
                      return ld.field_a;
                    }
                  } else {
                    return nc.field_P + " - " + Chess.field_B.c("commonui", 0) + "%";
                  }
                } else {
                  return sn.field_d;
                }
              } else {
                return k.field_V + " - " + fl.field_m.c("commonui", 0) + "%";
              }
            } else {
              return gb.field_o;
            }
          }
        } else {
          return ob.field_z;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            String var2 = param1.getDocumentBase().getFile();
            if (param0 != -117) {
                return;
            }
            try {
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (!(var3 < 0)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(rh.a(var5, param1, (byte) -87), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0, String param1) {
        if (param0 <= 42) {
            return true;
        }
        return ((jd) this).field_f.equals((Object) (Object) param1);
    }

    jd(String param0) {
        ((jd) this).field_f = param0;
    }

    final static boolean b(byte param0) {
        if (param0 != 75) {
          field_a = null;
          return kn.a(ec.field_f, re.field_p, param0 ^ 29787);
        } else {
          return kn.a(ec.field_f, re.field_p, param0 ^ 29787);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This is <%0>'s RuneScape clan if they have one.";
        field_g = "Just play";
        field_h = "Unrated game";
        field_a = "Suggest muting this player";
        field_i = new int[8192];
    }
}
