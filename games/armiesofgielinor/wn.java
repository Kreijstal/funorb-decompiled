/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends ih {
    private boolean field_cb;
    private int[] field_fb;
    private int field_ib;
    static je field_kb;
    static String field_db;
    static String field_gb;
    private int[] field_S;
    static String[] field_eb;
    static mq field_jb;
    private vk field_hb;
    static String field_bb;

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param0.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      int discarded$2 = 0;
                      var4 = k.a(param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (rs.a(var4.charAt(0), (byte) -111)) {
                              break L3;
                            } else {
                              if (rs.a(var4.charAt(var4.length() - 1), (byte) -74)) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param0.length()) {
                                    if (var5 <= 0) {
                                      stackOut_33_0 = 1;
                                      stackIn_34_0 = stackOut_33_0;
                                      break L0;
                                    } else {
                                      stackOut_31_0 = 0;
                                      stackIn_32_0 = stackOut_31_0;
                                      return stackIn_32_0 != 0;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param0.charAt(var6);
                                      if (rs.a((char) var7, (byte) -42)) {
                                        var5++;
                                        break L5;
                                      } else {
                                        var5 = 0;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (2 > var5) {
                                        break L6;
                                      } else {
                                        if (param2) {
                                          break L6;
                                        } else {
                                          stackOut_27_0 = 0;
                                          stackIn_28_0 = stackOut_27_0;
                                          return stackIn_28_0 != 0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("wn.AB(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + 1 + ',' + param2 + ')');
        }
        return stackIn_34_0 != 0;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (-1 == param1) {
            ((wn) this).field_ib = param0;
            return;
        }
        super.a(param0, param1, (byte) -28);
        ((wn) this).field_S[param1] = param0 << 12;
        if (param2 > -13) {
            Object var5 = null;
            ((wn) this).a(true, (byte) 40, true, (um) null);
        }
    }

    public wn() {
        ((wn) this).field_fb = new int[16];
        ((wn) this).field_ib = 256;
        ((wn) this).field_S = new int[16];
        int discarded$0 = 3933;
        this.k();
    }

    final static void a(int param0, wk[] param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param2 > 0) {
                  var6_int = param1[0].field_A;
                  var7 = param1[2].field_A;
                  var8 = param1[1].field_A;
                  param1[0].b(param3, param4, param0);
                  param1[2].b(-var7 + param2 + param3, param4, param0);
                  qn.b(an.field_H);
                  qn.b(var6_int + param3, param4, param3 + param2 + -var7, param1[1].field_x + param4);
                  var9 = var6_int + param3;
                  var10 = -var7 + param2 + param3;
                  param3 = var9;
                  L2: while (true) {
                    if (var10 <= param3) {
                      qn.a(an.field_H);
                      break L0;
                    } else {
                      param1[1].b(param3, param4, param0);
                      param3 = param3 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("wn.VA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + -3225 + ')');
        }
    }

    public static void c(byte param0) {
        field_kb = null;
        field_jb = null;
        field_eb = null;
        field_bb = null;
        field_db = null;
        field_gb = null;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = ((wn) this).i(4096);
              ((wn) this).f(-87, ((wn) this).field_ib * var4_int >> 8);
              super.b(param0, param1, param2);
              if (!((wn) this).field_cb) {
                var5 = 1;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 16) {
                    if (var5 != 0) {
                      ((wn) this).field_cb = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L3: {
                      var7 = ((wn) this).field_fb[var6];
                      if (0 != var7) {
                        L4: {
                          ((wn) this).field_S[var6] = ((wn) this).field_S[var6] + var7 * param2;
                          var8 = ((wn) this).field_hb.field_a[var6];
                          if (var7 <= 0) {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            break L4;
                          } else {
                            stackOut_8_0 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            break L4;
                          }
                        }
                        L5: {
                          stackOut_10_0 = stackIn_10_0;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (((wn) this).field_S[var6] >> 12 >= var8) {
                            stackOut_12_0 = stackIn_12_0;
                            stackOut_12_1 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L5;
                          } else {
                            stackOut_11_0 = stackIn_11_0;
                            stackOut_11_1 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L5;
                          }
                        }
                        L6: {
                          if ((stackIn_13_0 ^ stackIn_13_1) != 0) {
                            ((wn) this).field_fb[var6] = 0;
                            ((wn) this).field_S[var6] = var8 << 12;
                            break L6;
                          } else {
                            var5 = 0;
                            break L6;
                          }
                        }
                        super.a(((wn) this).field_S[var6] >> 12, var6, (byte) -123);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            ((wn) this).f(-54, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("wn.E(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(int param0, vk param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ((wn) this).field_hb = param1;
            var4_int = 0;
            L1: while (true) {
              if (16 <= var4_int) {
                break L0;
              } else {
                this.c(param0, var4_int, -128, ((wn) this).field_hb.field_a[var4_int]);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("wn.WA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -20751 + ')');
        }
    }

    private final synchronized void c(int param0, int param1, int param2, int param3) {
        ((wn) this).field_cb = false;
        if (!(null != ((wn) this).field_hb)) {
            ((wn) this).field_hb = new vk();
        }
        ((wn) this).field_hb.field_a[param1] = param3;
        int var5 = ((wn) this).field_S[param1];
        int var6 = (((wn) this).field_hb.field_a[param1] << 12) + -var5;
        int var7 = 0;
        int var8 = 0;
        if (!(var6 >= 0)) {
            var6 = -var6;
            var8 = 1;
        }
        if (!(var6 <= 0)) {
            var7 = (1 + var6) / (param0 - -1);
        }
        ((wn) this).field_fb[param1] = var8 != 0 ? -var7 : var7;
    }

    wn(ih param0) {
        super(param0);
        ((wn) this).field_fb = new int[16];
        ((wn) this).field_ib = 256;
        ((wn) this).field_S = new int[16];
        try {
            int discarded$0 = 3933;
            this.k();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (32 >= te.field_n) {
            jf.b(0, 99);
        } else {
            var1 = te.field_n % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            jf.b(te.field_n - var1, 108);
        }
    }

    final synchronized void a(boolean param0, byte param1, boolean param2, um param3) {
        try {
            if (param1 > -78) {
                ((wn) this).field_hb = null;
            }
            int discarded$0 = 3933;
            this.k();
            super.a(param0, (byte) -110, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wn.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(byte param0, int param1, vk param2) {
        int var4_int = 0;
        try {
            var4_int = param1 * rc.field_d / 1000;
            int var5 = 58 / ((9 - param0) / 36);
            int discarded$0 = -20751;
            this.a(var4_int, param2);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wn.BB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void k() {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = 0; var2 < 16; var2++) {
            ((wn) this).field_S[var2] = 1048576;
        }
        super.a(256, -1, (byte) -20);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Move here";
        field_eb = new String[]{"tutorial.lev", "tutorial2.lev"};
        field_bb = "This unit cannot use ranged weapons.";
    }
}
