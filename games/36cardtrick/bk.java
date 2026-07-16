/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    qb field_a;
    static String field_f;
    static String field_e;
    static String[] field_c;
    static String field_b;
    private qb field_d;

    final qb a(byte param0) {
        qb var2 = null;
        var2 = ((bk) this).field_a.field_d;
        if (param0 == 74) {
          if (var2 == ((bk) this).field_a) {
            ((bk) this).field_d = null;
            return null;
          } else {
            ((bk) this).field_d = var2.field_d;
            return var2;
          }
        } else {
          ((bk) this).field_d = null;
          if (var2 == ((bk) this).field_a) {
            ((bk) this).field_d = null;
            return null;
          } else {
            ((bk) this).field_d = var2.field_d;
            return var2;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
            if (param1 != -25573) {
                return;
            }
            if (le.field_m.startsWith("win")) {
                if (!(!gl.a(param2, 873140897))) {
                    return;
                }
            }
            try {
                param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                k.a((Throwable) null, (byte) -120, "MGR1: " + param2);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final qb d(int param0) {
        qb var2 = null;
        Object var3 = null;
        var2 = ((bk) this).field_a.field_d;
        if (param0 < -58) {
          if (var2 == ((bk) this).field_a) {
            return null;
          } else {
            var2.c(111);
            return var2;
          }
        } else {
          var3 = null;
          ((bk) this).a((qb) null, -66);
          if (var2 == ((bk) this).field_a) {
            return null;
          } else {
            var2.c(111);
            return var2;
          }
        }
    }

    final qb b(byte param0) {
        qb var2 = null;
        var2 = ((bk) this).field_d;
        if (((bk) this).field_a == var2) {
          ((bk) this).field_d = null;
          return null;
        } else {
          if (param0 > -91) {
            return null;
          } else {
            ((bk) this).field_d = var2.field_d;
            return var2;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2220) {
          L0: {
            field_c = null;
            if (((bk) this).field_a != ((bk) this).field_a.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((bk) this).field_a != ((bk) this).field_a.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final qb b(int param0) {
        qb var2 = null;
        if (param0 < -6) {
          var2 = ((bk) this).field_a.field_a;
          if (((bk) this).field_a == var2) {
            return null;
          } else {
            var2.c(126);
            return var2;
          }
        } else {
          field_f = null;
          var2 = ((bk) this).field_a.field_a;
          if (((bk) this).field_a == var2) {
            return null;
          } else {
            var2.c(126);
            return var2;
          }
        }
    }

    final void a(int param0, qb param1) {
        Object var4 = null;
        L0: {
          if (null != param1.field_a) {
            param1.c(109);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_a = ((bk) this).field_a;
        if (param0 > -119) {
          var4 = null;
          bk.a((java.applet.Applet) null, 44, (String) null, true);
          param1.field_d = ((bk) this).field_a.field_d;
          param1.field_a.field_d = param1;
          param1.field_d.field_a = param1;
          return;
        } else {
          param1.field_d = ((bk) this).field_a.field_d;
          param1.field_a.field_d = param1;
          param1.field_d.field_a = param1;
          return;
        }
    }

    public bk() {
        ((bk) this).field_a = new qb();
        ((bk) this).field_a.field_d = ((bk) this).field_a;
        ((bk) this).field_a.field_a = ((bk) this).field_a;
    }

    final void a(qb param0, int param1) {
        Object var4 = null;
        L0: {
          if (param0.field_a != null) {
            param0.c(107);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_a = ((bk) this).field_a.field_a;
        param0.field_d = ((bk) this).field_a;
        param0.field_a.field_d = param0;
        param0.field_d.field_a = param0;
        if (param1 != 27362) {
          var4 = null;
          bk.a((java.applet.Applet) null, -120, (String) null, false);
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        qb var2 = null;
        int var3 = 0;
        var3 = Main.field_T;
        L0: while (true) {
          var2 = ((bk) this).field_a.field_d;
          if (var2 == ((bk) this).field_a) {
            if (param0 != 29026) {
              field_c = null;
              ((bk) this).field_d = null;
              return;
            } else {
              ((bk) this).field_d = null;
              return;
            }
          } else {
            var2.c(param0 ^ 28988);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Account created successfully!";
        field_b = "Email address is unavailable";
        field_f = "Loading graphics";
    }
}
