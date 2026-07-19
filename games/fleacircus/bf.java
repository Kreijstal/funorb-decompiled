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
        int var2 = 0;
        pa var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (param0 < 4) {
          return 77;
        } else {
          var2 = 0;
          var3 = this.field_c.field_p;
          L0: while (true) {
            L1: {
              if (var3 == this.field_c) {
                break L1;
              } else {
                var3 = var3.field_p;
                var2++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        }
    }

    public static void a(boolean param0) {
        int discarded$0 = 0;
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0) {
            discarded$0 = bf.a(false, 51);
        }
    }

    final pa b(byte param0) {
        pa var2 = null;
        var2 = this.field_c.field_p;
        if (var2 == this.field_c) {
          this.field_g = null;
          return null;
        } else {
          this.field_g = var2.field_p;
          if (param0 <= 104) {
            return (pa) null;
          } else {
            return var2;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = ib.a(param1, var4, param0 ^ -26699).getFile();
                    discarded$6 = eb.a("updatelinks", new Object[]{"home", var3 + "home.ws"}, -11745, param1);
                    discarded$7 = eb.a("updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, -11745, param1);
                    discarded$8 = eb.a("updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0 + -43755, param1);
                    discarded$9 = eb.a("updatelinks", new Object[]{"options", var3 + "options.ws"}, -11745, param1);
                    discarded$10 = eb.a("updatelinks", new Object[]{"terms", var3 + "terms.ws"}, -11745, param1);
                    if (param0 == 32010) {
                      break L1;
                    } else {
                      field_d = (sf) null;
                      break L1;
                    }
                  }
                  discarded$11 = eb.a("updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param0 + -43755, param1);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("bf.D(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
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
        dd[] var2 = null;
        dd[] var3 = null;
        var3 = new dd[9];
        var2 = var3;
        var3[4] = oh.c(-81, param1, 64);
        if (param0 != 2885) {
          field_b = 93;
          return var2;
        } else {
          return var2;
        }
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
        } else {
          return param1 + 1;
        }
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
        pa var2 = null;
        var2 = this.field_c.field_p;
        if (var2 != this.field_c) {
          var2.e(-127);
          if (param0 >= -115) {
            field_f = (String) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static byte[] a(ih param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        byte[] stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
                L4: {
                  L5: {
                    var5 = param0.b(3, (byte) -87);
                    var6 = (byte)param0.b(param1, (byte) -87);
                    if ((var5 ^ -1) < -1) {
                      break L5;
                    } else {
                      var7 = 0;
                      L6: while (true) {
                        if (var4_int <= var7) {
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          param2[var7] = (byte)var6;
                          var7++;
                          if (var8 != 0) {
                            break L4;
                          } else {
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L7: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      stackOut_17_0 = (byte[]) (param2);
                      stackIn_21_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        stackIn_18_0[var7] = (byte)(param0.b(var5, (byte) -87) + var6);
                        var7++;
                        continue L7;
                      }
                    }
                  }
                }
                stackOut_20_0 = (byte[]) (param2);
                stackIn_21_0 = stackOut_20_0;
                break L3;
              }
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("bf.G(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
        return stackIn_21_0;
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
