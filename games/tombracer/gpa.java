/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gpa {
    static int field_b;
    private boolean field_c;
    static ft field_a;
    int field_d;

    final static void a(int param0) {
        rg.a((byte) -114);
        oo.a(vda.field_m[0].field_n, (byte) -104, mna.field_d, io.field_a, wg.field_i, di.field_a);
        if (param0 < 50) {
            gpa.a(76);
        }
    }

    final boolean b(int param0) {
        if (param0 != 59) {
            field_b = 33;
            return this.field_c;
        }
        return this.field_c;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = (ft) null;
        }
    }

    public final String toString() {
        return "SwitchableID: " + this.field_d + " dud: " + this.field_c;
    }

    gpa(int param0) {
        this.field_d = param0;
    }

    final static ata a(int param0, uia param1) {
        RuntimeException var2 = null;
        ata stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ata stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                gpa.a(true);
                break L1;
              }
            }
            stackOut_2_0 = new ata(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(param0 + -32772), param1.a(-32768), param1.h(255));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("gpa.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(byte param0) {
        if (param0 < 13) {
            return 49;
        }
        return this.field_d;
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_4_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var8 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                if (hpa.field_f) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      var3 = 46 / ((param0 - 67) / 33);
                      var2 = "tuhstatbut";
                      var4 = (String) (lb.b(param1, 2864, "getcookies"));
                      var5 = rga.a(32287, var4, ';');
                      var6 = 0;
                      L2: while (true) {
                        L3: {
                          if (var6 >= var5.length) {
                            break L3;
                          } else {
                            var7 = var5[var6].indexOf('=');
                            stackOut_7_0 = -1;
                            stackIn_19_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var8 != 0) {
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              L4: {
                                if (stackIn_8_0 < (var7 ^ -1)) {
                                  break L4;
                                } else {
                                  if (var5[var6].substring(0, var7).trim().equals(var2)) {
                                    stackOut_11_0 = 1;
                                    stackIn_12_0 = stackOut_11_0;
                                    decompiledRegionSelector0 = 2;
                                    break L1;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var6++;
                              if (var8 == 0) {
                                continue L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (decompiledRegionSelector0 == 0) {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L6;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L6;
                      }
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        break L6;
                      } else {
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) (var2_ref);
                stackOut_20_1 = new StringBuilder().append("gpa.B(").append(param0).append(',');
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L7;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L7;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_12_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new ft(4);
    }
}
