/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class mj extends pi {
    static int[] field_n;
    static fj field_o;
    int field_r;
    static int field_p;
    int field_q;

    final static void a(boolean param0, bj param1, int param2, bj param3, bj param4) {
        wm.field_f = al.a(-10218, "");
        try {
            wm.field_f.a(false, false);
            jf.a(param1, param3, (byte) 18, param4);
            im.a((byte) 79);
            bd.field_h = mc.field_t;
            ic.field_l = mc.field_t;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "mj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + 43 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_n = null;
    }

    final static java.net.URL a(String param0, int param1, boolean param2, String param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_40_0 = null;
            java.net.URL stackIn_42_0 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            java.net.URL stackOut_41_0 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            var9 = MinerDisturbance.field_ab;
            try {
              var5_ref = param4.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (0 > var7_int) {
                        break L2;
                      } else {
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L3;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        if (param3 == null) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param0 == null) {
                        break L1;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                    if (param3 == null) {
                      break L7;
                    } else {
                      if (param3.length() > 0) {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param3);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param0 == null) {
                      break L8;
                    } else {
                      if (param0.length() > 0) {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param0);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var6 < var5_ref.length()) {
                      StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append('/');
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_39_0 = new java.net.URL(param4, var7.toString());
                      stackIn_40_0 = stackOut_39_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_41_0 = (java.net.URL) param4;
                    stackIn_42_0 = stackOut_41_0;
                    return stackIn_42_0;
                  }
                  return stackIn_40_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_43_0 = (RuntimeException) var5;
                stackOut_43_1 = new StringBuilder().append("mj.C(");
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param0 == null) {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L11;
                } else {
                  stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                  stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L11;
                }
              }
              L12: {
                stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(-1).append(',').append(false).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param3 == null) {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L12;
                } else {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L12;
                }
              }
              L13: {
                stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param4 == null) {
                  stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                  stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L13;
                } else {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L13;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private mj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
    }
}
