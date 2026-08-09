/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    long field_c;
    static String field_a;
    static int field_d;
    static boolean[] field_f;
    private jc field_e;
    static ia field_g;
    static String field_b;

    final static java.net.URL a(java.net.URL param0, String param1, String param2, int param3, int param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_35_0 = null;
            java.net.URL stackIn_37_0 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            StringBuilder stackIn_43_1 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_44_2 = null;
            StringBuilder stackIn_46_1 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            int var8 = 0;
            Exception var9 = null;
            try {
              L0: {
                var5 = param0.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L2;
                      } else {
                        if (param4 < 0) {
                          var6 = var7_int;
                          continue L1;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      }
                    }
                  }
                  L3: {
                    if (var5.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (var7_int < 0) {
                        break L3;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if ((var7_int ^ -1) > -1) {
                        break L4;
                      } else {
                        if (param1 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (var5.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7_int = var5.indexOf('/', var6 - -1);
                    if ((var7_int ^ -1) <= -1) {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    var8 = -76 % ((param3 - 88) / 32);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (-1 <= (param4 ^ -1)) {
                      break L7;
                    } else {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param4));
                      break L7;
                    }
                  }
                  L8: {
                    if (param1 == null) {
                      break L8;
                    } else {
                      if ((param1.length() ^ -1) >= -1) {
                        break L8;
                      } else {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param1);
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (param2 == null) {
                      break L9;
                    } else {
                      if (-1 <= (param2.length() ^ -1)) {
                        break L9;
                      } else {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param2);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var5.length() <= var6) {
                      discarded$7 = var7.append('/');
                      break L10;
                    } else {
                      discarded$8 = var7.append(var5.substring(var6, var5.length()));
                      break L10;
                    }
                  }
                  try {
                    L11: {
                      stackIn_35_0 = new java.net.URL(param0, var7.toString());
                      break L11;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var9 = (Exception) (Object) decompiledCaughtException;
                    var9.printStackTrace();
                    stackIn_37_0 = (java.net.URL) (param0);
                    return stackIn_37_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_40_0 = (RuntimeException) (var5_ref);

                stackIn_40_1 = new StringBuilder().append("vj.A(");

                if (param0 == null) {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "null";
                  break L12;
                } else {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "{...}";
                  break L12;
                }
              }
              L13: {


                stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');

                if (param1 == null) {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                  stackIn_44_2 = "null";
                  break L13;
                } else {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                  stackIn_44_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_46_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');

                if (param2 == null) {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackIn_47_2 = "null";
                  break L14;
                } else {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackIn_47_2 = "{...}";
                  break L14;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_41_0), stackIn_47_2 + ',' + param3 + ',' + param4 + ')');
            }
            return stackIn_35_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 1) {
            return;
        }
        field_b = null;
        field_g = null;
        field_a = null;
    }

    protected final void finalize() throws Throwable {
        this.field_e.a(-25160, this.field_c);
        super.finalize();
    }

    vj(jc param0, long param1, int param2) {
        try {
            this.field_c = param1;
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = 0;
        field_a = "Player";
        field_f = new boolean[8];
        field_g = new ia();
        field_b = "Password: ";
    }
}
