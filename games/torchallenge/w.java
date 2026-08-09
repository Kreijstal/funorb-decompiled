/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends da {
    static String field_n;
    long field_l;
    w field_i;
    static String field_j;
    static int field_m;
    static boolean field_o;
    w field_k;

    final static int a(int param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            var5 = 74 % ((param0 - 75) / 36);
            var6 = 0;
            L1: while (true) {
              if (var4 <= var6) {
                stackIn_8_0 = var3_int;
                break L0;
              } else {
                L2: {
                  if (param1.charAt(var6) == param2) {
                    var3_int++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("w.AC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    public static void b(byte param0) {
        if (param0 != 68) {
            w.c(46);
        }
        field_n = null;
        field_j = null;
    }

    final static ge a(byte param0, int param1, int param2, lj param3) {
        RuntimeException var4 = null;
        ge stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lk.a(160, param3, param1, param2)) {
              L1: {
                if (param0 == 61) {
                  break L1;
                } else {
                  field_n = (String) null;
                  break L1;
                }
              }
              stackIn_6_0 = sh.d(-128);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("w.CC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0) {
        if (this.field_i == null) {
            return;
        }
        this.field_i.field_k = this.field_k;
        this.field_k.field_i = this.field_i;
        this.field_i = null;
        this.field_k = null;
        if (param0 != 12695) {
            w.b((byte) -41);
        }
    }

    protected w() {
    }

    final static void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ka var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ka var6 = null;
        ka var7 = null;
        ka var8 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            qg.b(243, 197, 369, 143, 16777215);
            qg.f(244, 198, 367, 141, 0);
            if (null != gi.field_f) {
              L1: {
                var6 = gi.field_f[oi.field_j];
                var7 = var6;
                var7 = var6;
                var1 = var6;
                if (var6 != null) {
                  var6.g(245, 199);
                  break L1;
                } else {
                  if (ek.field_G == null) {
                    break L1;
                  } else {
                    ek.field_G.a(wb.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  }
                }
              }
              L2: {
                if (eh.field_k > ll.field_d) {
                  var7 = gi.field_f[p.field_b];
                  if (var7 == null) {
                    break L2;
                  } else {
                    var2 = (60 + var7.field_q) * ll.field_d / eh.field_k;
                    var3 = var2 + -30;
                    if (!bh.field_r) {
                      c.a(-256 * var3 / 30, 199, 245, 256 * (var7.field_q + -var3) / 30, var7, 107);
                      break L2;
                    } else {
                      c.a((var7.field_q + -var3) * 256 / 30, 199, 245, var3 * -256 / 30, var7, 121);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (null != ek.field_G) {
                  var2_ref = null;
                  var5 = 0;
                  var3 = var5;
                  L4: while (true) {
                    if (var5 >= gi.field_f.length) {
                      if (var2_ref != null) {
                        ek.field_G.a("Screenshot(s) " + (String) (var2_ref) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      var8 = gi.field_f[var5];
                      if (var8 != null) {
                        L5: {
                          L6: {
                            if (365 != var8.field_q) {
                              break L6;
                            } else {
                              if (var8.field_v != 139) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (var2_ref != null) {
                            var2_ref = (String) (var2_ref) + ", " + var5;
                            break L5;
                          } else {
                            var2_ref = Integer.toString(var5);
                            break L5;
                          }
                        }
                        var5++;
                        continue L4;
                      } else {
                        var5++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              var2 = 106 / ((param0 - 2) / 44);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L7: {
                if (ek.field_G == null) {
                  break L7;
                } else {
                  ek.field_G.a(wb.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L7;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "w.BC(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_n = "(Including <%0>)";
        field_o = false;
        field_j = "Time: ";
    }
}
