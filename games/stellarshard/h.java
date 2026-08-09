/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static wb field_a;
    static int field_d;
    static int field_c;
    static int field_b;

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        var11 = stellarshard.field_B;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (-1 >= (var6_int ^ -1)) {
                stackIn_6_0 = var6_int - -2;
                var5 = stackIn_6_0;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!bh.a(param1 + -1, param0.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (!rg.a((byte) 19, (CharSequence) ((Object) var7_ref_String))) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = pf.a((CharSequence) ((Object) var7_ref_String), (byte) 125);
                        var4 = var4 + (param2[var8].length() - (var5 - var6_int));
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = param1;
                L4: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (-1 < (var8 ^ -1)) {
                    discarded$0 = var6.append(param0.substring(var7));
                    stackIn_27_0 = var6.toString();
                    break L0;
                  } else {
                    var5 = 2 + var8;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3_int) {
                          break L6;
                        } else {
                          if (!bh.a(-1, param0.charAt(var5))) {
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (!rg.a((byte) 19, (CharSequence) ((Object) var9))) {
                        continue L4;
                      } else {
                        if (var5 >= var3_int) {
                          continue L4;
                        } else {
                          if (param0.charAt(var5) == 62) {
                            var5++;
                            var10 = pf.a((CharSequence) ((Object) var9), (byte) 125);
                            discarded$1 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            discarded$2 = var6.append(param2[var10]);
                            continue L4;
                          } else {
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("h.A(");

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


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        return stackIn_27_0;
    }

    final static boolean a(ka param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.f(param1 + -31180);
              if (var2_int == 1) {
                stackIn_3_0 = 1;
                break L1;
              } else {
                stackIn_3_0 = 0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_3_0;
              if (param1 == 31184) {
                break L2;
              } else {
                field_d = 3;
                break L2;
              }
            }
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("h.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static sk a(String param0, byte param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        ka var7 = null;
        CharSequence var8 = null;
        sk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              if (param1 <= -95) {
                break L1;
              } else {
                var7 = (ka) null;
                h.a((ka) null, 24);
                break L1;
              }
            }
            L2: {
              var6 = null;
              if ((param3.indexOf('@') ^ -1) != 0) {
                var6 = param3;
                break L2;
              } else {
                var8 = (CharSequence) ((Object) param3);
                var4_long = nd.a(var8, (byte) -35);
                break L2;
              }
            }
            stackIn_6_0 = wf.a(var4_long, (String) (var6), -79, param0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("h.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 20) {
            field_c = -122;
        }
    }

    final static void a(int param0, int param1) {
        gg var2 = null;
        int var3 = 0;
        String var4 = null;
        le var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = stellarshard.field_B;
        try {
          L0: {
            var5 = (le) ((Object) fg.field_G.b(-126));
            L1: while (true) {
              if (var5 == null) {
                var2 = gg.field_b.b(-109);
                L2: while (true) {
                  if (var2 == null) {
                    L3: {
                      if (param0 <= -25) {
                        break L3;
                      } else {
                        var4 = (String) null;
                        h.a((String) null, (byte) 67, false, (String) null);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    ff.a(1, param1);
                    var2 = gg.field_b.b((byte) 103);
                    continue L2;
                  }
                }
              } else {
                nh.a(var5, (byte) -30, param1);
                var5 = (le) ((Object) fg.field_G.b((byte) -32));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "h.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new wb();
        field_c = -1;
        field_b = 4;
    }
}
