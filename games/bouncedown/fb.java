/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ih {
    int field_mb;
    static boolean field_nb;
    static wi field_jb;
    String field_kb;
    static gi field_lb;
    String field_ob;
    static eh field_pb;

    final static boolean e(byte param0) {
        hh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        hh var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            if (param0 == 102) {
              var4 = (hh) ((Object) ob.field_c.a((byte) -46));
              var1 = var4;
              if (var1 == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= var1.field_j) {
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L2: {
                      if (null == var4.field_n[var2]) {
                        break L2;
                      } else {
                        if (var4.field_n[var2].field_f == 0) {
                          stackIn_14_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (null == var4.field_s[var2]) {
                        break L3;
                      } else {
                        if (var4.field_s[var2].field_f != 0) {
                          break L3;
                        } else {
                          stackIn_18_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), "fb.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    public static void d(int param0) {
        field_jb = null;
        if (param0 != 4) {
            java.awt.Component var2 = (java.awt.Component) null;
            fb.a((java.awt.Component) null, (byte) 105);
        }
        field_pb = null;
        field_lb = null;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            if (param1 >= -26) {
                fb.d(35);
            }
            param0.addMouseListener(nj.field_o);
            param0.addMouseMotionListener(nj.field_o);
            param0.addFocusListener(nj.field_o);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "fb.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fb() {
        super(0L, (ih) null);
    }

    final static String a(byte param0, String param1, String param2, gk param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -7) {
                break L1;
              } else {
                fb.d(2);
                break L1;
              }
            }
            if (!param3.c(102)) {
              stackIn_5_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param2 + " - " + param3.b(param4, (byte) -100) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("fb.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_nb = false;
        field_pb = new eh(2, 4, 4, 0);
    }
}
