/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jd {
    static boolean field_a;
    static String field_b;
    static String field_c;

    abstract void a(int param0, byte[] param1);

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param1 <= -113) {
                      var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                      param0.getAppletContext().showDocument(ai.a(var2, (byte) -114, param0), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("jd.F(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract byte[] a(int param0);

    final static void a(byte param0, boolean param1, boolean param2) {
        String var4;
        if (param0 >= -11) {
          field_a = false;
          var4 = (String) null;
          hn.a(param1, (String) null, 65, param2);
          return;
        } else {
          var4 = (String) null;
          hn.a(param1, (String) null, 65, param2);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        int var1 = -52 / ((-36 - param0) / 47);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = dj.a(param1 + 6381, param2);
            if (param1 == -6270) {
              if (0 != (param0.indexOf(param2) ^ -1)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.indexOf(var3) == -1) {
                  L1: {
                    L2: {
                      if (param0.startsWith(param2)) {
                        break L2;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L2;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L2;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackIn_15_0 = 0;
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    stackIn_15_0 = 1;
                    break L1;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("jd.D(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    static {
        field_b = "You need to play <%0> more rated games to unlock this option.";
        field_c = "Reject <%0> from this game";
    }
}
