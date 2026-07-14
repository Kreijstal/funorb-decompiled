/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static int field_d;
    private ji field_f;
    private la field_a;
    private ji field_b;
    static a field_c;
    static int field_e;

    final static int a(jg param0, jg param1, int param2) {
        int var3 = -118 / ((-48 - param2) / 32);
        Object var4 = null;
        return qb.a(false, 0, param0, 100, 0, param1, (String) null);
    }

    final static ck a(byte param0, int param1, int param2) {
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        var3 = new ck(param1, param1);
        var4 = 0;
        if (param0 < -96) {
          L0: while (true) {
            if (var3.field_D.length <= var4) {
              return var3;
            } else {
              var3.field_D[var4] = param2;
              var4++;
              continue L0;
            }
          }
        } else {
          field_e = 97;
          L1: while (true) {
            if (var3.field_D.length <= var4) {
              return var3;
            } else {
              var3.field_D[var4] = param2;
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 30553) {
            field_e = 92;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != -65) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(gn.a(var2, -1, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0) {
        if (param0 > -63) {
            field_e = 90;
            return jk.field_e;
        }
        return jk.field_e;
    }

    final static boolean b(int param0) {
        if (param0 != 1) {
            return false;
        }
        return cf.field_i;
    }

    sm(int param0, ji param1, ji param2, lh param3) {
        ((sm) this).field_a = new la(64);
        ((sm) this).field_f = param1;
        ((sm) this).field_b = param2;
        if (null != ((sm) this).field_f) {
            int discarded$0 = ((sm) this).field_f.b(-5228, 1);
        }
        if (null == ((sm) this).field_b) {
        }
        int discarded$1 = ((sm) this).field_b.b(-5228, 1);
    }

    final me a(int param0, int param1) {
        me var3 = null;
        byte[] var4 = null;
        var3 = (me) ((sm) this).field_a.a((long)param1, (byte) -63);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (-32769 >= (param1 ^ -1)) {
              var4 = ((sm) this).field_b.a(32767 & param1, -112, 1);
              break L0;
            } else {
              var4 = ((sm) this).field_f.a(param1, 88, 1);
              break L0;
            }
          }
          L1: {
            var3 = new me();
            if (var4 != null) {
              var3.a((byte) 80, new wl(var4));
              break L1;
            } else {
              break L1;
            }
          }
          if (32768 > param1) {
            ((sm) this).field_a.a((Object) (Object) var3, (long)param1, 125);
            if (param0 < 123) {
              int discarded$4 = sm.a((byte) 69);
              return var3;
            } else {
              return var3;
            }
          } else {
            var3.d(19423);
            ((sm) this).field_a.a((Object) (Object) var3, (long)param1, 125);
            if (param0 >= 123) {
              return var3;
            } else {
              int discarded$5 = sm.a((byte) 69);
              return var3;
            }
          }
        }
    }

    static {
    }
}
