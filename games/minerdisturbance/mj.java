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
        if (param2 < 34) {
            return;
        }
        try {
            wm.field_f.a(false, false);
            jf.a(param1, param3, (byte) 18, param4);
            im.a((byte) 79);
            bd.field_h = mc.field_t;
            ic.field_l = mc.field_t;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "mj.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
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
            Object stackIn_3_0 = null;
            java.net.URL stackIn_43_0 = null;
            java.net.URL stackIn_45_0 = null;
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
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_42_0 = null;
            java.net.URL stackOut_44_0 = null;
            Object stackOut_2_0 = null;
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
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            var9 = MinerDisturbance.field_ab;
            try {
              var5_ref = param4.getFile();
              var6 = 0;
              if (!param2) {
                L0: while (true) {
                  L1: {
                    L2: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (0 > var7_int) {
                          break L2;
                        } else {
                          if (param1 < 0) {
                            break L1;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L0;
                          }
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
                      StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                      if (param1 <= 0) {
                        break L7;
                      } else {
                        StringBuilder discarded$10 = var7.append("/l=");
                        StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                        break L7;
                      }
                    }
                    L8: {
                      if (param3 == null) {
                        break L8;
                      } else {
                        if (param3.length() > 0) {
                          StringBuilder discarded$12 = var7.append("/p=");
                          StringBuilder discarded$13 = var7.append(param3);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param0 == null) {
                        break L9;
                      } else {
                        if (param0.length() > 0) {
                          StringBuilder discarded$14 = var7.append("/s=");
                          StringBuilder discarded$15 = var7.append(param0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var6 < var5_ref.length()) {
                        StringBuilder discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L10;
                      } else {
                        StringBuilder discarded$17 = var7.append(47);
                        break L10;
                      }
                    }
                    try {
                      L11: {
                        stackOut_42_0 = new java.net.URL(param4, var7.toString());
                        stackIn_43_0 = stackOut_42_0;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_44_0 = (java.net.URL) param4;
                      stackIn_45_0 = stackOut_44_0;
                      return stackIn_45_0;
                    }
                    return stackIn_43_0;
                  }
                  var6 = var7_int;
                  continue L0;
                }
              } else {
                stackOut_2_0 = null;
                stackIn_3_0 = stackOut_2_0;
                return (java.net.URL) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_46_0 = (RuntimeException) var5;
                stackOut_46_1 = new StringBuilder().append("mj.C(");
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param0 == null) {
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
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param3 == null) {
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
              L14: {
                stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44);
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                stackIn_53_0 = stackOut_52_0;
                stackIn_53_1 = stackOut_52_1;
                if (param4 == null) {
                  stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                  stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                  stackOut_54_2 = "null";
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackIn_55_2 = stackOut_54_2;
                  break L14;
                } else {
                  stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                  stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                  stackOut_53_2 = "{...}";
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  break L14;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
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
