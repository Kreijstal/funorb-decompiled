/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends lc implements rc {
    private String[] field_D;
    static int[] field_F;
    private wd[] field_z;
    static int field_E;
    static String field_G;
    private rf field_C;
    static bj field_A;

    final boolean a(lk param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (!(-99 != (param2 ^ -1))) {
            return ((nd) this).a((byte) -126, param0);
        }
        if (99 == param2) {
            return ((nd) this).a(param0, param3 ^ -30160);
        }
        return false;
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Bounce.field_N;
        var2 = 0;
        L0: while (true) {
          if (param0.length() <= var2) {
            if (param1 >= 34) {
              return false;
            } else {
              var5 = null;
              boolean discarded$1 = nd.a(true, (java.applet.Applet) null);
              return false;
            }
          } else {
            var3 = param0.charAt(var2);
            if (!j.a((char) var3, (byte) 56)) {
              if (!kf.a(-49, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    nd(rf param0) {
        super(0, 0, 0, 0, (fc) null);
        ((nd) this).field_C = param0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 8192) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(ag.a(param0, var2, false), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0) {
        if (param0 != -21065) {
            field_A = null;
        }
        return ef.field_a;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, 48, param3);
        if (param0 != 0) {
            return;
        }
        tj var5 = sg.field_a;
        if (!(((nd) this).field_D == null)) {
            int discarded$0 = var5.a(nk.field_e, param3 + ((nd) this).field_r, param1 + ((nd) this).field_i, ((nd) this).field_k, 20, 16777215, -1, 0, 0, var5.field_s + var5.field_x);
        }
        if (param2 < 33) {
            field_F = null;
        }
    }

    final void a(byte param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        r var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Bounce.field_N;
          ((nd) this).field_w.b(-77);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length == 0) {
              break L0;
            } else {
              L1: {
                if (param0 <= -66) {
                  break L1;
                } else {
                  ((nd) this).field_C = null;
                  break L1;
                }
              }
              var3 = param1.length;
              ((nd) this).field_D = new String[var3];
              var4_int = 0;
              L2: while (true) {
                if (var3 <= var4_int) {
                  var4 = new r(sg.field_a, 0, 1);
                  ((nd) this).field_z = new wd[1 + var3];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((nd) this).field_z[var3] = new wd(kj.field_g, (sk) this);
                      ((nd) this).field_z[var3].field_j = (fc) (Object) var4;
                      ((nd) this).field_z[var3].b(15, 80, 100, 0, var3 * 16 - -36);
                      ((nd) this).b((lk) (Object) ((nd) this).field_z[var3], true);
                      return;
                    } else {
                      ((nd) this).field_z[var5] = new wd(((nd) this).field_D[var5], (sk) this);
                      ((nd) this).field_z[var5].field_j = (fc) (Object) var4;
                      ((nd) this).field_z[var5].field_q = eg.field_p;
                      ((nd) this).field_z[var5].b(15, 80, 80, 0, var5 * 16 + 20);
                      ((nd) this).b((lk) (Object) ((nd) this).field_z[var5], true);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((nd) this).field_D[var4_int] = qa.a((CharSequence) (Object) param1[var4_int], true).replace(' ', ' ');
                  var4_int++;
                  continue L2;
                }
              }
            }
          }
        }
        ((nd) this).field_D = null;
    }

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            int stackIn_8_0 = 0;
            int stackIn_17_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            var7 = Bounce.field_N;
            if (!oh.field_e) {
              try {
                var2 = "tuhstatbut";
                var3 = (String) ac.a(param1, "getcookies", -31185);
                var4 = di.a(-112, ';', var3);
                var5 = 0;
                L0: while (true) {
                  if (var4.length <= var5) {
                    break L0;
                  } else {
                    L1: {
                      var6 = var4[var5].indexOf('=');
                      if ((var6 ^ -1) > -1) {
                        break L1;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    var5++;
                    continue L0;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  var8 = null;
                  boolean discarded$1 = nd.a(true, (java.applet.Applet) null);
                  break L2;
                }
              }
              L3: {
                if (null == param1.getParameter("tuhstatbut")) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                }
              }
              return stackIn_17_0 != 0;
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_G = null;
        field_F = null;
        if (!param0) {
            Object var2 = null;
            boolean discarded$0 = nd.a((String) null, 51);
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Bounce.field_N;
        if (param0 > 6) {
          var6 = 0;
          L0: while (true) {
            if (((nd) this).field_D.length <= var6) {
              L1: {
                if (((nd) this).field_z[((nd) this).field_D.length] == param4) {
                  ((nd) this).field_C.a(-3814);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              if (((nd) this).field_z[var6] == param4) {
                ((nd) this).field_C.a(((nd) this).field_D[var6], (byte) 43);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[8192];
        field_G = "Visit the Account Management section on the main site to view.";
    }
}
