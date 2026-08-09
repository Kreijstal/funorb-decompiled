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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new ata(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(param0 + -32772), param1.a(-32768), param1.h(255));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gpa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
            int var3 = 0;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_4_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var8 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                if (hpa.field_f) {
                  stackIn_4_0 = 1;
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
                        if (var6 >= var5.length) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if (-1 < (var7 ^ -1)) {
                              break L3;
                            } else {
                              if (var5[var6].substring(0, var7).trim().equals(var2)) {
                                stackIn_11_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackIn_18_0 = 0;
                        break L5;
                      } else {
                        stackIn_18_0 = 1;
                        break L5;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_21_0 = (RuntimeException) (var2_ref2);

                stackIn_21_1 = new StringBuilder().append("gpa.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L6;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L6;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_11_0 != 0;
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
