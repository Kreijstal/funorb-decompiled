/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lh extends km {
    static String field_r;
    static String field_t;
    static tg field_s;

    lh(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void f(byte param0) {
        mh discarded$0 = null;
        field_t = null;
        if (param0 >= -64) {
            discarded$0 = lh.f(72);
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
        var2 = this.field_m[0];
        if (param0 <= 34) {
          field_t = (String) null;
          var4 = this.field_m[this.field_h.field_r + -1];
          im.a(30 + (-this.field_j + this.field_l), 0, -var2.field_a + var4.field_d + (var4.field_a + 30), 0, -15 + var2.field_a, (byte) -88, -15 + this.field_j);
          return;
        } else {
          var5 = this.field_m[this.field_h.field_r + -1];
          im.a(30 + (-this.field_j + this.field_l), 0, -var2.field_a + var5.field_d + (var5.field_a + 30), 0, -15 + var2.field_a, (byte) -88, -15 + this.field_j);
          return;
        }
    }

    final static mh f(int param0) {
        if (param0 <= 94) {
            field_t = (String) null;
            return f.field_c.field_Xb;
        }
        return f.field_c.field_Xb;
    }

    final static java.net.URL a(String param0, byte param1, String param2, int param3, java.net.URL param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
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
                L1: {
                  var5_ref = param4.getFile();
                  var6 = 0;
                  if (param1 == 60) {
                    break L1;
                  } else {
                    lh.f((byte) 78);
                    break L1;
                  }
                }
                L2: while (true) {
                  L3: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int < 0) {
                        break L3;
                      } else {
                        if (0 <= param3) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int < 0) {
                        break L4;
                      } else {
                        var6 = var7_int;
                        continue L2;
                      }
                    }
                  }
                  L5: {
                    if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (0 <= var7_int) {
                        if (param0 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L7;
                      } else {
                        if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if ((var7_int ^ -1) <= -1) {
                      if (param2 == null) {
                        var6 = var7_int;
                        continue L2;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L2;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    var7 = new StringBuilder(var6);
                    discarded$9 = var7.append(var5_ref.substring(0, var6));
                    if (0 < param3) {
                      discarded$10 = var7.append("/l=");
                      discarded$11 = var7.append(Integer.toString(param3));
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param0 == null) {
                      break L9;
                    } else {
                      if (-1 <= (param0.length() ^ -1)) {
                        break L9;
                      } else {
                        discarded$12 = var7.append("/p=");
                        discarded$13 = var7.append(param0);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (param2 == null) {
                      break L10;
                    } else {
                      if (-1 > (param2.length() ^ -1)) {
                        discarded$14 = var7.append("/s=");
                        discarded$15 = var7.append(param2);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var6 >= var5_ref.length()) {
                      discarded$16 = var7.append('/');
                      break L11;
                    } else {
                      discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      stackOut_40_0 = new java.net.URL(param4, var7.toString());
                      stackIn_41_0 = stackOut_40_0;
                      break L12;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_42_0 = (java.net.URL) (param4);
                    stackIn_43_0 = stackOut_42_0;
                    return stackIn_43_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_44_0 = (RuntimeException) (var5);
                stackOut_44_1 = new StringBuilder().append("lh.KA(");
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param0 == null) {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L13;
                } else {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L13;
                }
              }
              L14: {
                stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param2 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L14;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L14;
                }
              }
              L15: {
                stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',');
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param4 == null) {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L15;
                } else {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L15;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
            }
            return stackIn_41_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    int b(int param0, int param1) {
        int var3 = super.b(param0, param1);
        if (param0 == -1 + this.field_h.field_r) {
            var3 = var3 + this.field_q / 2;
        }
        return var3;
    }

    final static int g(byte param0) {
        if (param0 != -44) {
            return 92;
        }
        return ki.field_d;
    }

    static {
        field_r = "Account created successfully!";
        field_t = "Level <%0>";
    }
}
