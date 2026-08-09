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
        jq discarded$0 = null;
        jq discarded$1 = null;
        jq discarded$2 = null;
        try {
            if (param1) {
                field_b = (Object) null;
            }
            this.field_d = param0.a(24, true, (byte) -23, 196584, (byte[]) null);
            discarded$0 = new jq(this.field_d, 5126, 2, 0);
            discarded$1 = new jq(this.field_d, 5126, 3, 8);
            discarded$2 = new jq(this.field_d, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ic.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        param0 = param0 & 8191;
        if (param1 == -431) {
          if (param0 < 4096) {
            L0: {
              if (param0 >= 2048) {
                stackIn_19_0 = ce.field_p[-param0 + 4096];
                break L0;
              } else {
                stackIn_19_0 = ce.field_p[param0];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param0 ^ -1) <= -6145) {
                stackIn_15_0 = -ce.field_p[8192 - param0];
                break L1;
              } else {
                stackIn_15_0 = -ce.field_p[-4096 + param0];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = (Object) null;
          if (param0 < 4096) {
            L2: {
              if (param0 >= 2048) {
                stackIn_9_0 = ce.field_p[-param0 + 4096];
                break L2;
              } else {
                stackIn_9_0 = ce.field_p[param0];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param0 ^ -1) <= -6145) {
                stackIn_5_0 = -ce.field_p[8192 - param0];
                break L3;
              } else {
                stackIn_5_0 = -ce.field_p[-4096 + param0];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_3_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            if (param2 < -127) {
              L1: while (true) {
                var6_int = param0.indexOf("<%", var5);
                if (0 <= var6_int) {
                  var5 = var6_int + 2;
                  L2: while (true) {
                    L3: {
                      if (var3_int <= var5) {
                        break L3;
                      } else {
                        if (!ea.a((byte) -54, param0.charAt(var5))) {
                          break L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                    var7_ref_String = param0.substring(var6_int + 2, var5);
                    if (jf.a(-13181, (CharSequence) ((Object) var7_ref_String))) {
                      if (var3_int <= var5) {
                        continue L1;
                      } else {
                        if (param0.charAt(var5) != 62) {
                          continue L1;
                        } else {
                          var5++;
                          var8 = no.a((byte) -127, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (-var5 + var6_int + param1[var8].length());
                          continue L1;
                        }
                      }
                    } else {
                      continue L1;
                    }
                  }
                } else {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  L4: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    if (var8 < 0) {
                      discarded$0 = var6.append(param0.substring(var7));
                      stackIn_27_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5 = var8 - -2;
                      L5: while (true) {
                        L6: {
                          if (var3_int <= var5) {
                            break L6;
                          } else {
                            if (!ea.a((byte) -54, param0.charAt(var5))) {
                              break L6;
                            } else {
                              var5++;
                              continue L5;
                            }
                          }
                        }
                        var9 = param0.substring(2 + var8, var5);
                        if (jf.a(-13181, (CharSequence) ((Object) var9))) {
                          if (var3_int <= var5) {
                            continue L4;
                          } else {
                            if (param0.charAt(var5) != 62) {
                              continue L4;
                            } else {
                              var5++;
                              var10 = no.a((byte) -128, (CharSequence) ((Object) var9));
                              discarded$1 = var6.append(param0.substring(var7, var8));
                              var7 = var5;
                              discarded$2 = var6.append(param1[var10]);
                              continue L4;
                            }
                          }
                        } else {
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("ic.A(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_27_0;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    param1.getAppletContext().showDocument(td.a((byte) 126, param1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (!param0) {
                  break L0;
                } else {
                  ic.a(111);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("ic.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ic() {
        cw discarded$0 = new cw(786336);
        mr.a(1600, (byte) -115);
    }

    static {
        field_a = new ts(14, 0, 4, 1);
    }
}
