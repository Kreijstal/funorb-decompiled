/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ik extends uh {
    volatile boolean field_r;
    boolean field_o;
    boolean field_n;
    static String field_q;
    static char[] field_s;
    static long field_p;

    final static hh a(String param0, int param1, long param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        cl stackIn_6_0 = null;
        vd stackIn_8_0 = null;
        od stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0L != param2) {
                break L1;
              } else {
                if (param3 != null) {
                  stackIn_8_0 = new vd(param3, param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param4) {
              stackIn_6_0 = new cl(param2, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1 == -66) {
                  break L2;
                } else {
                  ik.g(-104);
                  break L2;
                }
              }
              stackIn_12_0 = new od(param2, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ik.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hh) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hh) ((Object) stackIn_8_0);
          } else {
            return (hh) ((Object) stackIn_12_0);
          }
        }
    }

    abstract int e(int param0);

    final static void g(int param0) {
        fd.a(param0, 0);
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_18_0 = 0L;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            var6 = 14 % ((-35 - param1) / 34);
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var7 = param0.charAt(var5);
                      if (var7 < 65) {
                        break L4;
                      } else {
                        if (90 < var7) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(-65 + (var7 + 1));
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var7 < 97) {
                        break L5;
                      } else {
                        if (122 < var7) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 + (var7 - 97));
                          break L3;
                        }
                      }
                    }
                    if (var7 < 48) {
                      break L3;
                    } else {
                      if (var7 > 57) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(27 - (-var7 + 48));
                        break L3;
                      }
                    }
                  }
                  if (177917621779460413L <= var2_long) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (var2_long % 37L != 0L) {
                    break L7;
                  } else {
                    if (var2_long == 0L) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                stackIn_18_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("ik.H(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    abstract byte[] f(int param0);

    ik() {
        this.field_r = true;
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 != 0) {
            return;
        }
        field_s = null;
    }

    static {
        field_s = new char[128];
    }
}
