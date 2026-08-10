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
        try {
            param0.field_p = this.field_c;
            param0.field_m = this.field_c.field_m;
            param0.field_m.field_p = param0;
            param0.field_p.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(byte param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 < 4) {
            return 77;
        }
        int var2 = 0;
        pa var3 = this.field_c.field_p;
        while (var3 != this.field_c) {
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
            bf.a(false, 51);
        }
    }

    final pa b(byte param0) {
        pa var2 = this.field_c.field_p;
        if (!(var2 != this.field_c)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_p;
        if (param0 <= 104) {
            return (pa) null;
        }
        return var2;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      var3 = ib.a(param1, var4, param0 ^ -26699).getFile();
                      eb.a("updatelinks", new Object[]{"home", var3 + "home.ws"}, -11745, param1);
                      eb.a("updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, -11745, param1);
                      eb.a("updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0 + -43755, param1);
                      eb.a("updatelinks", new Object[]{"options", var3 + "options.ws"}, -11745, param1);
                      eb.a("updatelinks", new Object[]{"terms", var3 + "terms.ws"}, -11745, param1);
                      if (param0 == 32010) {
                        break L2;
                      } else {
                        field_d = (sf) null;
                        break L2;
                      }
                    }
                    eb.a("updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param0 + -43755, param1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("bf.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
        pa var2 = this.field_g;
        if (param0 <= 65) {
            return (pa) null;
        }
        if (!(this.field_c != var2)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_p;
        return var2;
    }

    final pa a(int param0) {
        pa var2 = this.field_c.field_p;
        if (var2 == this.field_c) {
            return null;
        }
        var2.e(-127);
        if (param0 >= -115) {
            field_f = (String) null;
        }
        return var2;
    }

    final static byte[] a(ih param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param0.b(param3, (byte) -87);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (param2.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param2 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param0.b(3, (byte) -87);
                var6 = (byte)param0.b(param1, (byte) -87);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (byte)(param0.b(var5, (byte) -87) + var6);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (byte[]) (param2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("bf.G(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    public bf() {
        this.field_c = new pa();
        this.field_c.field_m = this.field_c;
        this.field_c.field_p = this.field_c;
    }

    static {
        field_e = new vc();
        field_b = 0;
        field_a = new wh("");
        field_f = "Waiting for graphics";
    }
}
