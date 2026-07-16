/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static vc field_e;
    private pa field_c;
    static wh field_a;
    static int field_b;
    private pa field_g;
    static sf field_d;
    static int field_h;
    static String field_f;

    final void a(pa param0, int param1) {
        if (!(param0.field_m == null)) {
            param0.e(67);
        }
        if (param1 != -1089421886) {
            return;
        }
        param0.field_p = ((bf) this).field_c;
        param0.field_m = ((bf) this).field_c.field_m;
        param0.field_m.field_p = param0;
        param0.field_p.field_m = param0;
    }

    final int a(byte param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 < 4) {
            return 77;
        }
        int var2 = 0;
        pa var3 = ((bf) this).field_c.field_p;
        while (var3 != ((bf) this).field_c) {
            var3 = var3.field_p;
            var2++;
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0) {
            int discarded$0 = bf.a(false, 51);
        }
    }

    final pa b(byte param0) {
        pa var2 = ((bf) this).field_c.field_p;
        if (!(var2 != ((bf) this).field_c)) {
            ((bf) this).field_g = null;
            return null;
        }
        ((bf) this).field_g = var2.field_p;
        if (param0 <= 104) {
            return null;
        }
        return var2;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var4 = param1.getCodeBase();
                  var3 = ib.a(param1, var4, param0 ^ -26699).getFile();
                  Object discarded$6 = eb.a("updatelinks", new Object[2], -11745, param1);
                  Object discarded$7 = eb.a("updatelinks", new Object[2], -11745, param1);
                  Object discarded$8 = eb.a("updatelinks", new Object[2], param0 + -43755, param1);
                  Object discarded$9 = eb.a("updatelinks", new Object[2], -11745, param1);
                  Object discarded$10 = eb.a("updatelinks", new Object[2], -11745, param1);
                  if (param0 == 32010) {
                    break L1;
                  } else {
                    field_d = null;
                    break L1;
                  }
                }
                Object discarded$11 = eb.a("updatelinks", new Object[2], param0 + -43755, param1);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static dd[] a(int param0, int param1) {
        dd[] var3 = new dd[9];
        dd[] var2 = var3;
        var3[4] = oh.c(-81, param1, 64);
        if (param0 != 2885) {
            field_b = 93;
        }
        return var2;
    }

    final static int a(boolean param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1156219201;
        param1 = param1 | param1 >>> -1089421886;
        param1 = param1 | param1 >>> -1300739132;
        param1 = param1 | param1 >>> 655408648;
        param1 = param1 | param1 >>> 1995812080;
        if (!param0) {
            return -122;
        }
        return param1 + 1;
    }

    final pa c(byte param0) {
        pa var2 = ((bf) this).field_g;
        if (param0 <= 65) {
            return null;
        }
        if (!(((bf) this).field_c != var2)) {
            ((bf) this).field_g = null;
            return null;
        }
        ((bf) this).field_g = var2.field_p;
        return var2;
    }

    final pa a(int param0) {
        pa var2 = ((bf) this).field_c.field_p;
        if (var2 == ((bf) this).field_c) {
            return null;
        }
        var2.e(-127);
        if (param0 >= -115) {
            field_f = null;
        }
        return var2;
    }

    final static byte[] a(ih param0, int param1, byte[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        var4 = param0.b(param3, (byte) -87);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param2 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param0.b(3, (byte) -87);
            var6 = (byte)param0.b(param1, (byte) -87);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param2[var7] = (byte)(param0.b(var5, (byte) -87) + var6);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param2[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    public bf() {
        ((bf) this).field_c = new pa();
        ((bf) this).field_c.field_m = ((bf) this).field_c;
        ((bf) this).field_c.field_p = ((bf) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new vc();
        field_b = 0;
        field_a = new wh("");
        field_f = "Waiting for graphics";
    }
}
