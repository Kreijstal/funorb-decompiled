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
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var3 = (String) null;
                ue.a((String) null, -83);
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param0);
            stackIn_3_0 = tia.field_b.equals(jd.a(1, var4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ue.V(");

            if (param0 == null) {
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
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1.a((ue) (this), (byte) 76)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = this.field_u;
                if (var3_int == 0) {
                  param1.g(62, 106);
                  break L1;
                } else {
                  if (-2 != (var3_int ^ -1)) {
                    if (var3_int == 2) {
                      param1.g(64, 115);
                      break L1;
                    } else {
                      if (3 == var3_int) {
                        param1.g(65, 123);
                        break L1;
                      } else {
                        param1.g(63, -74);
                        break L1;
                      }
                    }
                  } else {
                    param1.g(63, 110);
                    break L1;
                  }
                }
              }
              if (param0 <= -114) {
                L2: {
                  var3_int = this.field_u;
                  if (var3_int == 0) {
                    if (param1.x(-70)) {
                      break L2;
                    } else {
                      param1.a(this.field_g.b(125), (byte) -102, 58982, 1);
                      this.c(false);
                      stackIn_27_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    if (-2 != (var3_int ^ -1)) {
                      if (-3 == (var3_int ^ -1)) {
                        param1.a(this.field_g, false, 1);
                        this.c(false);
                        stackIn_31_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        if (-4 == (var3_int ^ -1)) {
                          if (!param1.x(49)) {
                            param1.a(this.field_g, false, 2);
                            param1.a(this.field_g.b(-77), (byte) -120, 52428, 0);
                            this.c(false);
                            stackIn_35_0 = 1;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            break L2;
                          }
                        } else {
                          return false;
                        }
                      }
                    } else {
                      param1.a(this.field_g, false, 0);
                      stackIn_29_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackIn_37_0 = 0;
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                stackIn_18_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("ue.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L3;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_27_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    return stackIn_37_0 != 0;
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
