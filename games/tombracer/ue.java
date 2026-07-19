/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends pd {
    static long field_s;
    private int field_u;
    static String field_t;
    static hs field_v;

    final void g(byte param0) {
        if (param0 != 3) {
            this.field_u = 4;
        }
    }

    final static boolean a(String param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 == 0) {
                break L1;
              } else {
                var3 = (String) null;
                discarded$2 = ue.a((String) null, -83);
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param0);
            stackOut_2_0 = tia.field_b.equals(jd.a(1, var4));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ue.V(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void r(int param0) {
        field_t = null;
        field_v = null;
        if (param0 != 0) {
            ue.r(113);
        }
    }

    final int j(byte param0) {
        if (param0 >= -26) {
            return -74;
        }
        return this.field_u;
    }

    ue(la param0, boolean param1) {
        super(param0, param1);
    }

    ue(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_u = param1.b((byte) 44, 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, hca param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1.a((ue) (this), (byte) 76)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      var3_int = this.field_u;
                      if (var3_int == 0) {
                        param1.g(62, 106);
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        L5: {
                          if (-2 != (var3_int ^ -1)) {
                            break L5;
                          } else {
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (var3_int == 2) {
                          break L3;
                        } else {
                          if (3 == var3_int) {
                            break L2;
                          } else {
                            param1.g(63, -74);
                            break L1;
                          }
                        }
                      }
                    }
                    param1.g(63, 110);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                  param1.g(64, 115);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                param1.g(65, 123);
                if (var4 == 0) {
                  break L1;
                } else {
                  param1.g(63, -74);
                  break L1;
                }
              }
              if (param0 <= -114) {
                L6: {
                  var3_int = this.field_u;
                  if (var3_int == 0) {
                    if (param1.x(-70)) {
                      break L6;
                    } else {
                      param1.a(this.field_g.b(125), (byte) -102, 58982, 1);
                      this.c(false);
                      stackOut_32_0 = 1;
                      stackIn_33_0 = stackOut_32_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    L7: {
                      if (-2 != (var3_int ^ -1)) {
                        break L7;
                      } else {
                        if (var4 == 0) {
                          param1.a(this.field_g, false, 0);
                          stackOut_34_0 = 1;
                          stackIn_35_0 = stackOut_34_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (-3 == (var3_int ^ -1)) {
                      param1.a(this.field_g, false, 1);
                      this.c(false);
                      stackOut_36_0 = 1;
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (-4 == (var3_int ^ -1)) {
                        if (!param1.x(49)) {
                          param1.a(this.field_g, false, 2);
                          param1.a(this.field_g.b(-77), (byte) -120, 52428, 0);
                          this.c(false);
                          stackOut_40_0 = 1;
                          stackIn_41_0 = stackOut_40_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          break L6;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
                stackOut_42_0 = 0;
                stackIn_43_0 = stackOut_42_0;
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var3);
            stackOut_44_1 = new StringBuilder().append("ue.L(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L8;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_33_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_35_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_37_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_41_0 != 0;
                  } else {
                    return stackIn_43_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            return;
        }
        this.field_u = param0;
    }

    final int a(boolean param0) {
        if (param0) {
            field_v = (hs) null;
            return 25;
        }
        return 25;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -128, this.field_u, 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ue.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        super.a(param0, param1);
        if (param0) {
          if (0 != this.field_u) {
            return;
          } else {
            this.b(true).a(0, 0, 67, 0, (byte) 6);
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_t = "Enter Tomb";
        field_v = new hs();
    }
}
