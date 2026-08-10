/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class s extends pj {
    static int field_x;
    static sh field_A;
    private boolean field_z;
    private boolean field_B;
    static String[] field_E;
    static dj field_y;
    boolean field_D;
    boolean field_F;
    static mg field_C;

    public static void i(int param0) {
        field_y = null;
        field_A = null;
        if (param0 <= 7) {
          field_x = -57;
          field_E = null;
          field_C = null;
          return;
        } else {
          field_E = null;
          field_C = null;
          return;
        }
    }

    final void h(int param0) {
        StringBuilder var3;
        if (param0 == 0) {
          if (this.field_z) {
            this.field_z = false;
            if (null != this.field_h) {
              if (!(this.field_h instanceof sb)) {
                return;
              } else {
                ((sb) ((Object) this.field_h)).a((pj) (this), this.field_z, param0 ^ -119);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var3 = (StringBuilder) null;
          this.a((byte) 0, (Hashtable) null, -79, (StringBuilder) null);
          if (this.field_z) {
            this.field_z = false;
            if (null != this.field_h) {
              if (!(this.field_h instanceof sb)) {
                return;
              } else {
                ((sb) ((Object) this.field_h)).a((pj) (this), this.field_z, param0 ^ -119);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(9882, param3, param2, param1)) {
                L2: {
                  this.a(param2, (byte) -122, param1, param3);
                  if (this.field_D) {
                    discarded$2 = param3.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (this.field_F) {
                  break L1;
                } else {
                  discarded$3 = param3.append(" disabled");
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param0 < -23) {
              stackIn_11_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("s.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final boolean d(int param0) {
        if (param0 != -81) {
            return true;
        }
        return this.field_z;
    }

    s(String param0, td param1, ag param2) {
        super(param0, param1, param2);
        this.field_B = true;
        this.field_z = false;
        this.field_F = true;
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param0 == 84) {
          if (null != this.field_h) {
            if (!(this.field_h instanceof ai)) {
              return;
            } else {
              ((ai) ((Object) this.field_h)).a((byte) -115, param3, param1, (s) (this), param2);
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_F = true;
          if (null == this.field_h) {
            return;
          } else {
            L0: {
              if (this.field_h instanceof ai) {
                ((ai) ((Object) this.field_h)).a((byte) -115, param3, param1, (s) (this), param2);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        if (this.field_h != null && this.field_h instanceof gh) {
            ((gh) ((Object) this.field_h)).a(param5, 4071, param0, param4, param1, (s) (this));
        }
        if (param2 >= -91) {
            return;
        }
        try {
            this.field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "s.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        pj var9 = null;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -115) {
                break L1;
              } else {
                var9 = (pj) null;
                this.a((byte) -30, (pj) null, 51, 84);
                break L1;
              }
            }
            L2: {
              if (!this.field_F) {
                break L2;
              } else {
                if (!this.a((byte) 3, param5, param4, param6, param3)) {
                  break L2;
                } else {
                  L3: {
                    this.a(-81, param1);
                    this.field_v = param2;
                    if (null == this.field_h) {
                      break L3;
                    } else {
                      if (this.field_h instanceof gh) {
                        ((gh) ((Object) this.field_h)).a(param2, param5, param4, (s) (this), param3, param6, (byte) 1);
                        break L3;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_11_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("s.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (-1 != (this.field_v ^ -1)) {
                if (this.field_v == of.field_G) {
                    return;
                }
                if (this.a((byte) 3, ua.field_a, vl.field_d, param3, param2) && 0 == of.field_G) {
                    this.b(84, vl.field_d - param3, this.field_v, -param2 + ua.field_a);
                }
                this.a(param3, ua.field_a, (byte) -103, param1, param2, vl.field_d);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "s.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                this.field_B = true;
                break L1;
              }
            }
            L2: {
              if (!this.d(-81)) {
                break L2;
              } else {
                L3: {
                  if (84 == param1) {
                    break L3;
                  } else {
                    if (param1 != 83) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.b(param3 ^ 84, -1, 1, -1);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_9_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_F) {
                break L1;
              } else {
                if (!this.field_B) {
                  break L1;
                } else {
                  if (param0 == -81) {
                    L2: {
                      param1.h(0);
                      this.field_z = true;
                      if (this.field_h == null) {
                        break L2;
                      } else {
                        if (!(this.field_h instanceof sb)) {
                          break L2;
                        } else {
                          ((sb) ((Object) this.field_h)).a((pj) (this), this.field_z, 22);
                          break L2;
                        }
                      }
                    }
                    stackIn_12_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_7_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("s.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    s(String param0, ag param1) {
        this(param0, mb.field_a.field_l, param1);
    }

    protected s() {
        this.field_B = true;
        this.field_z = false;
        this.field_F = true;
        this.field_j = mb.field_a.field_c;
    }

    static {
        field_A = null;
        field_E = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
