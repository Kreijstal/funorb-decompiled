/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_b;
    static String field_a;
    static String field_e;
    static byte[] field_c;
    static ln field_d;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 != -77) {
            field_a = (String) null;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                  var3 = 3 / ((12 - param1) / 37);
                  param0.getAppletContext().showDocument(jg.a(param0, false, var2), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("id.A(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0) {
        int var1 = -6 / ((-56 - param0) / 40);
        if (ln.field_o == null) {
            return "";
        }
        return ln.field_o;
    }

    final static bi a(int param0, bc param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_d = (ln) null;
                break L1;
              }
            }
            var4_int = param1.a(125, param2);
            var5 = param1.a(var4_int, (byte) 106, param3);
            stackIn_3_0 = ga.a(param1, var5, var4_int, -20487);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("id.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String[] args, int param1, sq param2) {
        lm var7 = null;
        lm var3 = null;
        int var5 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder var4 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            var7 = new lm();
            var3 = var7;
            var7.field_c = args[param1];
            if (-3 > (args.length ^ -1)) {
                var4 = new StringBuilder(args[1]);
                for (var5 = 2; args.length > var5; var5++) {
                    discarded$0 = var4.append(", ");
                    discarded$1 = var4.append(args[var5]);
                }
                var3.field_b = var4.toString();
            } else {
                var7.field_b = args[1];
            }
            param2.a((byte) 33, var3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "id.C(" + (args != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        String var3;
        L0: {
          var2 = 0;
          if (-1 != (param1 ^ -1)) {
            break L0;
          } else {
            var2 = vm.field_Bb;
            break L0;
          }
        }
        L1: {
          if ((param1 ^ -1) == -2) {
            var2 = sq.field_a;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((param1 ^ -1) != -3) {
            break L2;
          } else {
            var2 = ul.field_Hb;
            break L2;
          }
        }
        if (param0 != -7019) {
          var3 = (String) null;
          id.a(20, (bc) null, (String) null, (String) null);
          return var2;
        } else {
          return var2;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        field_b = param4;
        e.field_d = param0;
        if (param2 != 26883) {
          field_b = 22;
          dp.field_v = param1;
          je.field_g = param3;
          return;
        } else {
          dp.field_v = param1;
          je.field_g = param3;
          return;
        }
    }

    static {
        field_a = "Clan";
        field_e = "Hide players in <%0>'s game";
    }
}
