/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_c;
    static int field_a;
    static wd field_b;

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            try {
              L0: {
                lj.field_g = param2;
                try {
                  L1: {
                    L2: {
                      if (param0 == 376) {
                        break L2;
                      } else {
                        field_b = (wd) null;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var6 = param1.getParameter("cookieprefix");
                        var5 = var6;
                        var5 = var6;
                        var4 = param1.getParameter("cookiehost");
                        var5 = var4;
                        var5 = var4;
                        var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                        var5 = var7;
                        var5 = var7;
                        var5 = var7;
                        if (0 != param2.length()) {
                          break L4;
                        } else {
                          var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          if (!fleas.field_A) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = var5 + "; Expires=" + wd.a((byte) -116, lj.a((byte) -75) - -94608000000L) + "; Max-Age=" + 94608000L;
                      break L3;
                    }
                    eb.a("document.cookie=\"" + var5 + "\"", -28924, param1);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = decompiledCaughtException;
                    break L5;
                  }
                }
                bf.a(32010, param1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var3_ref);

                stackIn_13_1 = new StringBuilder().append("ea.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L6;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

                if (param2 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L7;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L7;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = -85 % ((-40 - param1) / 46);
        param4 = param4 * 16;
        param5 = param5 * 16;
        param2 = param2 * 16;
        param3 = param3 * 16;
        gb.g(param5 + -4, param2 + -4, param4, param3, 16711680, param0 + 96);
        gb.e(param5 + -4, param2 - 4, param4, param3, 16711680, param0 + 128);
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        if (param0 < 111) {
            return;
        }
        try {
            param1.addKeyListener(rh.field_f);
            param1.addFocusListener(rh.field_f);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -25 % ((-34 - param0) / 53);
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            String var4 = null;
            Object[] var5 = null;
            L0: {
              if (param0 == 8216) {
                break L0;
              } else {
                var4 = (String) null;
                ea.a(50, (java.applet.Applet) null, (String) null);
                break L0;
              }
            }
            try {
              var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (var1 != null) {
                try {
                  L1: {
                    var2 = Runtime.getRuntime();
                    var5 = (Object[]) null;
                    var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                    kf.field_k = 1 + (int)(var3.longValue() / 1048576L);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        byte[] stackIn_97_0 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        if (param0 == -18428) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ea.a(107, (byte) 40, -41, 107, -6, 86);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = new byte[var2_int];
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= var2_int) {
                            statePc = 96;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = param1.charAt(var4);
                        if (0 >= var5) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var5 < 128) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (160 > var5) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 > 255) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3[var4] = (byte)var5;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5 != 8364) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3[var4] = (byte)-128;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var5 != 8218) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3[var4] = (byte)-126;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var5 != 402) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3[var4] = (byte)-125;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var5 != 8222) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3[var4] = (byte)-124;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var5 != 8230) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var3[var4] = (byte)-123;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (8224 != var5) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var3[var4] = (byte)-122;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var5 == 8225) {
                            statePc = 94;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (710 == var5) {
                            statePc = 92;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var5 == 8240) {
                            statePc = 90;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var5 != 352) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3[var4] = (byte)-118;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var5 == 8249) {
                            statePc = 88;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var5 != 338) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3[var4] = (byte)-116;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5 == 381) {
                            statePc = 86;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (8216 == var5) {
                            statePc = 84;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var5 == 8217) {
                            statePc = 82;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var5 != 8220) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3[var4] = (byte)-109;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var5 == 8221) {
                            statePc = 80;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var5 == 8226) {
                            statePc = 78;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var5 != 8211) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var3[var4] = (byte)-106;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var5 == 8212) {
                            statePc = 76;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var5 == 732) {
                            statePc = 74;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var5 == 8482) {
                            statePc = 72;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var5 != 353) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var3[var4] = (byte)-102;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (8250 == var5) {
                            statePc = 70;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var5 != 339) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var3[var4] = (byte)-100;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (382 == var5) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var5 != 376) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var3[var4] = (byte)-97;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var3[var4] = (byte)63;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var3[var4] = (byte)-98;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var3[var4] = (byte)-101;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var3[var4] = (byte)-103;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var3[var4] = (byte)-104;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var3[var4] = (byte)-105;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var3[var4] = (byte)-107;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var3[var4] = (byte)-108;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var3[var4] = (byte)-110;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var3[var4] = (byte)-111;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var3[var4] = (byte)-114;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var3[var4] = (byte)-117;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var3[var4] = (byte)-119;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var3[var4] = (byte)-120;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3[var4] = (byte)-121;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_97_0 = (byte[]) (var3);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    return stackIn_97_0;
                }
                case 98: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_100_0 = (RuntimeException) (var2);
                    stackIn_99_0 = stackIn_100_0;
                    stackIn_100_1 = new StringBuilder().append("ea.C(").append(param0).append(',');
                    stackIn_99_1 = stackIn_100_1;
                    if (param1 == null) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_101_0 = (RuntimeException) ((Object) stackIn_99_0);
                    stackIn_101_1 = (StringBuilder) ((Object) stackIn_99_1);
                    stackIn_101_2 = "{...}";
                    statePc = 101;
                    continue stateLoop;
                }
                case 100: {
                    stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
                    stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
                    stackIn_101_2 = "null";
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    throw pf.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = "They cannot be placed where any fleas are standing. Hold the mouse button, and the tile will be placed as soon as the fleas have gone.";
        field_b = new wd();
    }
}
