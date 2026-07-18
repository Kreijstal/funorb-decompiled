/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class tg {
    static int[] field_a;
    static volatile int field_b;

    final static boolean a(byte param0) {
        if (param0 != 49) {
            boolean discarded$0 = tg.a((byte) -3);
            return mc.field_c.a(-26);
        }
        return mc.field_c.a(-26);
    }

    public static void b(byte param0) {
        field_a = null;
    }

    final static java.net.URL a(java.net.URL param0, int param1, String param2, String param3, int param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_37_0 = null;
            java.net.URL stackIn_39_0 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
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
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_36_0 = null;
            java.net.URL stackOut_38_0 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
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
            var9 = stellarshard.field_B;
            try {
              var5_ref = param0.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (0 > var7_int) {
                      break L1;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5_ref.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      if (param2 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', 1 + var6);
                  if (var7_int >= 0) {
                    if (param3 != null) {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L4;
                  }
                }
                var7 = new StringBuilder(var6);
                StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                L6: {
                  if (param2 == null) {
                    break L6;
                  } else {
                    if (param2.length() >= -1) {
                      break L6;
                    } else {
                      StringBuilder discarded$8 = var7.append("/p=");
                      StringBuilder discarded$9 = var7.append(param2);
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param3 == null) {
                    break L7;
                  } else {
                    if (-1 >= param3.length()) {
                      break L7;
                    } else {
                      StringBuilder discarded$10 = var7.append("/s=");
                      StringBuilder discarded$11 = var7.append(param3);
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var6 >= var5_ref.length()) {
                    StringBuilder discarded$12 = var7.append('/');
                    break L8;
                  } else {
                    StringBuilder discarded$13 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L8;
                  }
                }
                try {
                  L9: {
                    stackOut_36_0 = new java.net.URL(param0, var7.toString());
                    stackIn_37_0 = stackOut_36_0;
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_38_0 = (java.net.URL) param0;
                  stackIn_39_0 = stackOut_38_0;
                  return stackIn_39_0;
                }
                return stackIn_37_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_40_0 = (RuntimeException) var5;
                stackOut_40_1 = new StringBuilder().append("tg.A(");
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                if (param0 == null) {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "null";
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  break L10;
                } else {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "{...}";
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  break L10;
                }
              }
              L11: {
                stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(-1).append(',');
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param2 == null) {
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
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
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
              throw ma.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + 30403 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = new int[128];
    }
}
