/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static Object field_b;
    static ts field_a;
    private fk field_d;
    static int[] field_c;

    final static void a(int param0) {
        if (param0 != 4) {
          ic.a(7);
          jk.field_b.field_d = 0;
          jk.field_b.field_j = 0;
          return;
        } else {
          jk.field_b.field_d = 0;
          jk.field_b.field_j = 0;
          return;
        }
    }

    final void a(fr param0, boolean param1) {
        if (param1) {
          field_b = null;
          ((ic) this).field_d = param0.a(24, true, (byte) -23, 196584, (byte[]) null);
          jq discarded$6 = new jq(((ic) this).field_d, 5126, 2, 0);
          jq discarded$7 = new jq(((ic) this).field_d, 5126, 3, 8);
          jq discarded$8 = new jq(((ic) this).field_d, 5121, 4, 20);
          return;
        } else {
          ((ic) this).field_d = param0.a(24, true, (byte) -23, 196584, (byte[]) null);
          jq discarded$9 = new jq(((ic) this).field_d, 5126, 2, 0);
          jq discarded$10 = new jq(((ic) this).field_d, 5126, 3, 8);
          jq discarded$11 = new jq(((ic) this).field_d, 5121, 4, 20);
          return;
        }
    }

    public static void b(int param0) {
        int var1 = -37 % ((param0 - 64) / 32);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static int b(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param0 = param0 & 8191;
        if (param1 == -431) {
          if (param0 < 4096) {
            L0: {
              if (param0 >= 2048) {
                stackOut_18_0 = ce.field_p[-param0 + 4096];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = ce.field_p[param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param0 ^ -1) <= -6145) {
                stackOut_14_0 = -ce.field_p[8192 - param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -ce.field_p[-4096 + param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = null;
          if (param0 < 4096) {
            L2: {
              if (param0 >= 2048) {
                stackOut_8_0 = ce.field_p[-param0 + 4096];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = ce.field_p[param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param0 ^ -1) <= -6145) {
                stackOut_4_0 = -ce.field_p[8192 - param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -ce.field_p[-4096 + param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        if (param2 < -127) {
          L0: while (true) {
            var6 = param0.indexOf("<%", var5);
            if (0 <= var6) {
              var5 = var6 + 2;
              L1: while (true) {
                L2: {
                  if (var3 <= var5) {
                    break L2;
                  } else {
                    if (!ea.a((byte) -54, param0.charAt(var5))) {
                      break L2;
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
                var7_ref = param0.substring(var6 + 2, var5);
                if (jf.a(-13181, (CharSequence) (Object) var7_ref)) {
                  if (var3 <= var5) {
                    continue L0;
                  } else {
                    if (param0.charAt(var5) != 62) {
                      continue L0;
                    } else {
                      var5++;
                      var8 = no.a((byte) -127, (CharSequence) (Object) var7_ref);
                      var4 = var4 + (-var5 + var6 + param1[var8].length());
                      continue L0;
                    }
                  }
                } else {
                  continue L0;
                }
              }
            } else {
              var12 = new StringBuilder(var4);
              var5 = 0;
              var7 = 0;
              L3: while (true) {
                var8 = param0.indexOf("<%", var5);
                if (var8 < 0) {
                  StringBuilder discarded$3 = var12.append(param0.substring(var7));
                  return var12.toString();
                } else {
                  var5 = var8 - -2;
                  L4: while (true) {
                    L5: {
                      if (var3 <= var5) {
                        break L5;
                      } else {
                        if (!ea.a((byte) -54, param0.charAt(var5))) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    var9 = param0.substring(2 + var8, var5);
                    if (jf.a(-13181, (CharSequence) (Object) var9)) {
                      if (var3 <= var5) {
                        continue L3;
                      } else {
                        if (param0.charAt(var5) != 62) {
                          continue L3;
                        } else {
                          var5++;
                          var10 = no.a((byte) -128, (CharSequence) (Object) var9);
                          StringBuilder discarded$4 = var12.append(param0.substring(var7, var8));
                          var7 = var5;
                          StringBuilder discarded$5 = var12.append(param1[var10]);
                          continue L3;
                        }
                      }
                    } else {
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                            param1.getAppletContext().showDocument(td.a((byte) 126, param1, var2), "_top");
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (!param0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        ic.a(111);
                        return;
                    }
                    case 5: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ic() {
        cw discarded$0 = new cw(786336);
        int discarded$1 = mr.a(1600, (byte) -115);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ts(14, 0, 4, 1);
    }
}
