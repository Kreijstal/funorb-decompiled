/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

class lh extends km {
    static String field_r;
    static String field_t;
    static tg field_s;

    lh(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void f(byte param0) {
        field_t = null;
        if (param0 >= -64) {
            mh discarded$0 = lh.f(72);
            field_s = null;
            field_r = null;
            return;
        }
        field_s = null;
        field_r = null;
    }

    final void g(int param0) {
        q var2 = null;
        q var4 = null;
        q var5 = null;
        var2 = ((lh) this).field_m[0];
        if (param0 <= 34) {
          field_t = null;
          var4 = ((lh) this).field_m[((lh) this).field_h.field_r + -1];
          im.a(30 + (-((lh) this).field_j + ((lh) this).field_l), 0, -var2.field_a + var4.field_d + (var4.field_a + 30), 0, -15 + var2.field_a, (byte) -88, -15 + ((lh) this).field_j);
          return;
        } else {
          var5 = ((lh) this).field_m[((lh) this).field_h.field_r + -1];
          im.a(30 + (-((lh) this).field_j + ((lh) this).field_l), 0, -var2.field_a + var5.field_d + (var5.field_a + 30), 0, -15 + var2.field_a, (byte) -88, -15 + ((lh) this).field_j);
          return;
        }
    }

    final static mh f(int param0) {
        if (param0 <= 94) {
            field_t = null;
            return f.field_c.field_Xb;
        }
        return f.field_c.field_Xb;
    }

    final static java.net.URL a(String param0, byte param1, String param2, int param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_41_0 = null;
            java.net.URL stackIn_43_0 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            java.net.URL stackOut_42_0 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            var9 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                var5_ref = param4.getFile();
                var6 = 0;
                if (param1 == 60) {
                  break L0;
                } else {
                  lh.f((byte) 78);
                  break L0;
                }
              }
              L1: while (true) {
                L2: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      if (0 <= param3) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
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
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L3;
                    } else {
                      var6 = var7_int;
                      continue L1;
                    }
                  }
                }
                L4: {
                  if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 + 1);
                    if (0 <= var7_int) {
                      if (param0 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
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
                      if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', 1 + var6);
                  if (var7_int >= 0) {
                    if (param2 == null) {
                      var6 = var7_int;
                      continue L1;
                    } else {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L1;
                    }
                  } else {
                    break L5;
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                  if (0 < param3) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param0 == null) {
                    break L8;
                  } else {
                    if (-1 <= param0.length()) {
                      break L8;
                    } else {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param0);
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param2 == null) {
                    break L9;
                  } else {
                    if (-1 < param2.length()) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var6 >= var5_ref.length()) {
                    StringBuilder discarded$16 = var7.append(47);
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L10;
                  }
                }
                try {
                  L11: {
                    stackOut_40_0 = new java.net.URL(param4, var7.toString());
                    stackIn_41_0 = stackOut_40_0;
                    break L11;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_42_0 = (java.net.URL) param4;
                  stackIn_43_0 = stackOut_42_0;
                  return stackIn_43_0;
                }
                return stackIn_41_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_44_0 = (RuntimeException) var5;
                stackOut_44_1 = new StringBuilder().append("lh.KA(");
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param0 == null) {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L12;
                } else {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L12;
                }
              }
              L13: {
                stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param1).append(44);
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param2 == null) {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L13;
                } else {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L13;
                }
              }
              L14: {
                stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44).append(param3).append(44);
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param4 == null) {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L14;
                } else {
                  stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                  stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L14;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    int b(int param0, int param1) {
        int var3 = super.b(param0, param1);
        if (param0 == -1 + ((lh) this).field_h.field_r) {
            var3 = var3 + ((lh) this).field_q / 2;
        }
        return var3;
    }

    final static int g(byte param0) {
        return ki.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Account created successfully!";
        field_t = "Level <%0>";
    }
}
