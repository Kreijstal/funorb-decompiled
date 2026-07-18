/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class vj {
    long field_c;
    static String field_a;
    static int field_d;
    static boolean[] field_f;
    private jc field_e;
    static ia field_g;
    static String field_b;

    final static java.net.URL a(java.net.URL param0, String param1, String param2) {
        try {
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            int var8 = 0;
            Exception var9 = null;
            java.net.URL stackIn_31_0 = null;
            java.net.URL stackIn_33_0 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_30_0 = null;
            java.net.URL stackOut_32_0 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            try {
              var5 = param0.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                    break L1;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 > var7_int) {
                      break L1;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L2: {
                  if (var5.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (var7_int < 0) {
                      break L3;
                    } else {
                      if (param1 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                }
                L4: {
                  L5: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int >= 0) {
                    if (param2 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  var7 = new StringBuilder(var6);
                  var8 = 0;
                  StringBuilder discarded$7 = var7.append(var5.substring(0, var6));
                  if (param1 == null) {
                    break L6;
                  } else {
                    if (param1.length() >= -1) {
                      break L6;
                    } else {
                      StringBuilder discarded$8 = var7.append("/p=");
                      StringBuilder discarded$9 = var7.append(param1);
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param2 == null) {
                    break L7;
                  } else {
                    if (-1 >= param2.length()) {
                      break L7;
                    } else {
                      StringBuilder discarded$10 = var7.append("/s=");
                      StringBuilder discarded$11 = var7.append(param2);
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var5.length() <= var6) {
                    StringBuilder discarded$12 = var7.append('/');
                    break L8;
                  } else {
                    StringBuilder discarded$13 = var7.append(var5.substring(var6, var5.length()));
                    break L8;
                  }
                }
                try {
                  L9: {
                    stackOut_30_0 = new java.net.URL(param0, var7.toString());
                    stackIn_31_0 = stackOut_30_0;
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var9 = (Exception) (Object) decompiledCaughtException;
                  var9.printStackTrace();
                  stackOut_32_0 = (java.net.URL) param0;
                  stackIn_33_0 = stackOut_32_0;
                  return stackIn_33_0;
                }
                return stackIn_31_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var5_ref;
                stackOut_34_1 = new StringBuilder().append("vj.A(");
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L10;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L10;
                }
              }
              L11: {
                stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param1 == null) {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L11;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L11;
                }
              }
              L12: {
                stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                if (param2 == null) {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "null";
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  break L12;
                } else {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "{...}";
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  break L12;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + 122 + ',' + -1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    protected final void finalize() throws Throwable {
        ((vj) this).field_e.a(-25160, ((vj) this).field_c);
        super.finalize();
    }

    vj(jc param0, long param1, int param2) {
        try {
            ((vj) this).field_c = param1;
            ((vj) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "vj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = "Player";
        field_f = new boolean[8];
        field_g = new ia();
        field_b = "Password: ";
    }
}
