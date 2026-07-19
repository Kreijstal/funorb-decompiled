/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr extends ch implements tb {
    private static int field_O;
    static int field_R;
    private fe field_Z;
    static int[] field_P;
    static String field_N;
    private fe field_U;
    static String field_X;
    static int field_Q;
    static int field_V;
    static String field_db;
    static boolean field_T;
    static int field_Y;
    private fe field_W;
    private static int field_cb;
    private static int field_ab;
    static boolean field_bb;
    static int field_S;
    static int field_eb;

    final static String a(String[] args, int param1, String param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String stackIn_2_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            var3_int = param2.length();
            if (param1 == -1) {
              var4 = var3_int;
              var5 = 0;
              L1: while (true) {
                var6_int = param2.indexOf("<%", var5);
                if ((var6_int ^ -1) > -1) {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  L2: while (true) {
                    var8 = param2.indexOf("<%", var5);
                    if (-1 >= (var8 ^ -1)) {
                      var5 = var8 - -2;
                      L3: while (true) {
                        L4: {
                          if (var5 >= var3_int) {
                            break L4;
                          } else {
                            if (!kh.a(param2.charAt(var5), (byte) 57)) {
                              break L4;
                            } else {
                              var5++;
                              continue L3;
                            }
                          }
                        }
                        var9 = param2.substring(var8 - -2, var5);
                        if (!ka.a(10, (CharSequence) ((Object) var9))) {
                          continue L2;
                        } else {
                          if (var5 >= var3_int) {
                            continue L2;
                          } else {
                            if (param2.charAt(var5) == 62) {
                              var5++;
                              var10 = kq.a((byte) 88, (CharSequence) ((Object) var9));
                              discarded$3 = var6.append(param2.substring(var7, var8));
                              var7 = var5;
                              discarded$4 = var6.append(args[var10]);
                              continue L2;
                            } else {
                              continue L2;
                            }
                          }
                        }
                      }
                    } else {
                      discarded$5 = var6.append(param2.substring(var7));
                      stackOut_26_0 = var6.toString();
                      stackIn_27_0 = stackOut_26_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  var5 = var6_int + 2;
                  L5: while (true) {
                    L6: {
                      if (var5 >= var3_int) {
                        break L6;
                      } else {
                        if (!kh.a(param2.charAt(var5), (byte) 71)) {
                          break L6;
                        } else {
                          var5++;
                          continue L5;
                        }
                      }
                    }
                    var7_ref_String = param2.substring(var6_int - -2, var5);
                    if (!ka.a(10, (CharSequence) ((Object) var7_ref_String))) {
                      continue L1;
                    } else {
                      if (var5 >= var3_int) {
                        continue L1;
                      } else {
                        if (param2.charAt(var5) == 62) {
                          var5++;
                          var8 = kq.a((byte) 89, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (-var5 + var6_int + args[var8].length());
                          continue L1;
                        } else {
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("nr.B(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (args == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          L8: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_27_0;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var6 = 83 / ((param1 - -42) / 53);
        int var5 = this.field_C + param2;
        int var7 = this.field_D + param3;
        int discarded$0 = lc.field_O.a(vm.field_m, 20 + var5, 20 + var7, this.field_l - 40, this.field_y + -50, 16777215, -1, 1, 0, lc.field_O.field_C);
        super.a(param0, (byte) 92, param2, param3);
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        fe var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param3 != this.field_U) {
                if (param3 == this.field_W) {
                  br.f(35);
                  break L1;
                } else {
                  if (this.field_Z == param3) {
                    al.m(4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                mb.b(3);
                break L1;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                var8 = (fe) null;
                this.a(true, 17, 40, (fe) null, 32);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("nr.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    public nr() {
        super(0, 0, 476, 225, (fp) null);
        this.field_W = new fe(ad.field_t, (cc) null);
        this.field_U = new fe(lc.field_Q, (cc) null);
        this.field_Z = new fe(va.field_O, (cc) null);
        ng var1 = new ng();
        this.field_W.field_z = (fp) ((Object) var1);
        this.field_U.field_z = (fp) ((Object) var1);
        this.field_Z.field_z = (fp) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -2136841343;
        this.field_U.a(var4, this.field_l + -var3 >> -552547199, 30, false, -var2 + this.field_y - 48);
        this.field_Z.a(var4, var2 + (this.field_l + -var3 >> 269173825) + var4, 30, false, -var2 + (-48 + this.field_y));
        this.field_W.a(var3, this.field_l + -var3 >> 977788801, 30, false, -78 + (this.field_y + -(2 * var2)));
        this.field_U.field_t = (cc) (this);
        this.field_W.field_t = (cc) (this);
        this.field_W.field_p = fc.field_d;
        this.field_Z.field_t = (cc) (this);
        this.field_Z.field_p = lh.field_h;
        this.a(true, this.field_U);
        this.a(true, this.field_W);
        this.a(true, this.field_Z);
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if ((param1 ^ -1) != -99) {
                if (-100 == (param1 ^ -1)) {
                  stackOut_8_0 = this.b(param3, 0);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = this.a(param3, 3);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("nr.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void a(int param0) {
        String discarded$0 = null;
        field_N = null;
        field_X = null;
        if (param0 != 20868) {
            String var2 = (String) null;
            discarded$0 = nr.a((String[]) null, 118, (String) null);
        }
        field_P = null;
        field_db = null;
    }

    static {
        field_T = false;
        field_ab = 4;
        field_O = 6;
        field_cb = 5;
        field_R = 1 << field_cb;
        field_V = 1 << field_O;
        field_Q = 1 << field_ab;
        field_db = "You must be a member to play with the current options.";
        field_Y = field_Q | field_R | field_V;
    }
}
