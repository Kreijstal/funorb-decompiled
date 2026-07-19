/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends ak {
    private bc field_E;
    static int[] field_A;
    static String[] field_D;
    static String field_B;

    final void d(byte param0) {
        int var4 = Bounce.field_N;
        ea var2 = new ea(this.field_E);
        if (param0 <= 109) {
            field_A = (int[]) null;
        }
        ri var3 = (ri) ((Object) var2.a(22092));
        while (var3 != null) {
            if (!(!var3.e((byte) 21))) {
                var3.c(2);
            }
            var3 = (ri) ((Object) var2.c(-124));
        }
        this.field_x = (lk) ((Object) this.a(false));
    }

    public static void j(int param0) {
        field_B = null;
        if (param0 != -1) {
            field_A = (int[]) null;
        }
        field_A = null;
        field_D = null;
    }

    final void l(int param0) {
        int var4 = Bounce.field_N;
        if (param0 != -26623) {
            return;
        }
        ea var2 = new ea(this.field_E);
        ri var3 = (ri) ((Object) var2.a(22092));
        while (var3 != null) {
            if (var3.f((byte) -33)) {
                var3.c(param0 ^ -26621);
            }
            var3 = (ri) ((Object) var2.c(-102));
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 128) {
                break L1;
              } else {
                field_A = (int[]) null;
                break L1;
              }
            }
            var3 = bc.a(param2, -123);
            if (-1 != param1.indexOf(param2)) {
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-1 == param1.indexOf(var3)) {
                L2: {
                  L3: {
                    if (param1.startsWith(param2)) {
                      break L3;
                    } else {
                      if (param1.startsWith(var3)) {
                        break L3;
                      } else {
                        if (param1.endsWith(param2)) {
                          break L3;
                        } else {
                          if (!param1.endsWith(var3)) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("pf.B(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final ri a(boolean param0) {
        ea var2 = null;
        ri var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          var2 = new ea(this.field_E);
          var3 = (ri) ((Object) var2.a(22092));
          if (!param0) {
            break L0;
          } else {
            this.a(43, 120, -50, -123);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_D) {
              var3 = (ri) ((Object) var2.c(-109));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void k(int param0) {
        int var4 = Bounce.field_N;
        ea var2 = new ea(this.field_E);
        ri var3 = (ri) ((Object) var2.a(22092));
        while (var3 != null) {
            var3.field_D = false;
            var3 = (ri) ((Object) var2.c(-85));
        }
        if (param0 != -20281) {
            field_D = (String[]) null;
        }
        this.field_x = null;
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        String var3 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_30_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_9_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (param0.equals("B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.equals("I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param0.equals("S")) {
                  if (param0.equals("J")) {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if (param1 == -1) {
                        break L1;
                      } else {
                        var3 = (String) null;
                        discarded$2 = pf.a(-115, (String) null, (String) null);
                        break L1;
                      }
                    }
                    if (param0.equals("Z")) {
                      stackOut_19_0 = Boolean.TYPE;
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!param0.equals("F")) {
                        if (param0.equals("D")) {
                          stackOut_26_0 = Double.TYPE;
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param0.equals("C")) {
                            stackOut_30_0 = Character.TYPE;
                            stackIn_31_0 = stackOut_30_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        }
                      } else {
                        stackOut_22_0 = Float.TYPE;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("pf.O(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      return stackIn_31_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = Bounce.field_N;
        if (!(null == this.field_j)) {
            this.field_j.a(param1, (lk) (this), (byte) 3, true, param3);
        }
        if (param2 < 33) {
            field_B = (String) null;
        }
        ea var5 = new ea(this.field_E);
        lk var6 = (lk) ((Object) var5.e(50));
        while (var6 != null) {
            var6.a(param0, param1 - -this.field_i, 68, param3 - -this.field_r);
            var6 = (lk) ((Object) var5.a((byte) 33));
        }
    }

    final void b(lk param0, boolean param1) {
        ri var3 = null;
        boolean discarded$0 = false;
        try {
            if (!(param0 instanceof ri)) {
                throw new IllegalArgumentException();
            }
            var3 = (ri) ((Object) param0);
            this.field_E.a((byte) 83, (ai) (var3));
            var3.field_D = true;
            discarded$0 = var3.a((lk) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "pf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final lk a(int param0) {
        ea var2 = null;
        ri var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          var2 = new ea(this.field_E);
          if (param0 == 0) {
            break L0;
          } else {
            this.d((byte) -47);
            break L0;
          }
        }
        var3 = (ri) ((Object) var2.a(22092));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_D) {
              var3 = (ri) ((Object) var2.c(-119));
              continue L1;
            } else {
              return var3.d((byte) 99);
            }
          } else {
            return null;
          }
        }
    }

    public pf() {
        super(0, 0, ob.field_a, gi.field_e, (fc) null, (sk) null);
        this.field_E = new bc();
    }

    static {
        field_A = new int[128];
        field_D = new String[]{"Showing by rating", "Showing by win percentage"};
        field_B = "Please try again in a few minutes.";
    }
}
