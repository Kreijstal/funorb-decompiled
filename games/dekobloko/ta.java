/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static qm field_a;
    static boolean field_f;
    private String field_e;
    private boolean field_j;
    private boolean field_c;
    static hn field_i;
    static String field_g;
    static int field_d;
    static dd field_k;
    static int field_b;
    static String field_h;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        field_h = null;
        field_k = null;
        field_g = null;
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = -43 / ((param1 - -74) / 38);
            var3 = param0.length();
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var3) {
                stackIn_5_0 = var4;
                break L0;
              } else {
                var4 = (var4 << -397216347) + (-var4 - -j.a(param0.charAt(var5), (byte) 28));
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ta.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 <= -22) {
            break L0;
          } else {
            ta.a(false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-21 < (ca.field_vb ^ -1)) {
              break L2;
            } else {
              if (!t.i((byte) 124)) {
                break L2;
              } else {
                L3: {
                  if (-1 <= (bb.field_e ^ -1)) {
                    break L3;
                  } else {
                    if (bd.d((byte) 31)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_9_0 = 0;
                break L1;
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static boolean a(ji param0, ji param1, int param2, ji param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.a((byte) 121)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.a("commonui", (byte) -101)) {
                L1: {
                  if (!param1.a((byte) 121)) {
                    break L1;
                  } else {
                    if (!param1.a("commonui", (byte) -117)) {
                      break L1;
                    } else {
                      L2: {
                        if (!param3.a((byte) 121)) {
                          break L2;
                        } else {
                          if (param3.a("button.gif", (byte) -34)) {
                            L3: {
                              if (param2 == -21) {
                                break L3;
                              } else {
                                field_h = (String) null;
                                break L3;
                              }
                            }
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("ta.I(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final static ck[] a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            ta.a(false, 17, -88, -29, -62);
        }
        return ca.a(param3, 1, param4, 1, 1, false, param2, param1, 3);
    }

    final void a(int param0, boolean param1) {
        this.field_j = true;
        this.field_c = param1 ? true : false;
        if (param0 != -21) {
            ta.a(false);
        }
    }

    final boolean b(int param0) {
        if (param0 != -3348) {
            return false;
        }
        return this.field_c;
    }

    final boolean a(int param0) {
        if (param0 < 49) {
            return false;
        }
        return this.field_j;
    }

    ta(String param0) {
        this.field_j = false;
        this.field_c = false;
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0) {
        if (param0 < 59) {
            this.field_j = true;
        }
        return this.field_e;
    }

    static {
        field_i = null;
        field_g = "Fullscreen mode";
        field_d = 0;
        field_a = new qm(1, 2, 2, 0);
        field_h = "Auto-respond to <%0>";
    }
}
