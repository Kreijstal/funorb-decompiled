/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class bb extends qa {
    boolean field_G;
    static int field_C;
    boolean field_D;
    static String field_H;
    static String field_I;
    static String field_J;
    static int field_E;
    private boolean field_B;
    private boolean field_F;
    static Boolean field_A;

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 <= -47) {
                break L1;
              } else {
                this.field_D = true;
                break L1;
              }
            }
            L2: {
              if (this.a(param1, 95, param0, param2)) {
                L3: {
                  this.a(param2, 96, param0, param1);
                  if (this.field_G) {
                    discarded$2 = param0.append(" active");
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (this.field_D) {
                  break L2;
                } else {
                  discarded$3 = param0.append(" disabled");
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackIn_10_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("bb.S(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    bb(String param0, ch param1, kd param2) {
        super(param0, param1, param2);
        this.field_D = true;
        this.field_B = true;
        this.field_F = false;
    }

    boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
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
            if (param1) {
              if (!this.field_D) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (this.b(param0, param6, 0, param4, param2)) {
                  L1: {
                    this.a(param3, -117);
                    this.field_v = param5;
                    if (null == this.field_s) {
                      break L1;
                    } else {
                      if (!(this.field_s instanceof dg)) {
                        break L1;
                      } else {
                        ((dg) ((Object) this.field_s)).a(param2, (bb) (this), param5, param4, 769, param0, param6);
                        break L1;
                      }
                    }
                  }
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("bb.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (this.field_s != null) {
          if (this.field_s instanceof da) {
            ((da) ((Object) this.field_s)).a(param0, param2, param3, 248, (bb) (this));
            if (param1 != 84) {
              this.field_B = true;
              return;
            } else {
              return;
            }
          } else {
            if (param1 != 84) {
              this.field_B = true;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != 84) {
            this.field_B = true;
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        if (param3 > -85) {
            return;
        }
        try {
            super.a(param0, param1, param2, (byte) -94);
            if (-1 != (this.field_v ^ -1)) {
                if (this.field_v == kc.field_f) {
                    return;
                }
                if (this.b(param0, param1, 0, ag.field_f, kc.field_b)) {
                    if (!(-1 != (kc.field_f ^ -1))) {
                        this.a(kc.field_b + -param0, 84, -param1 + ag.field_f, this.field_v);
                    }
                }
                this.a((byte) 5, param2, param1, ag.field_f, kc.field_b, param0);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bb.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -2) {
              L1: {
                if (!this.e(param0 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (84 == param1) {
                      break L2;
                    } else {
                      if (-84 != (param1 ^ -1)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a(-1, 84, -1, 1);
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("bb.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    bb(String param0, kd param1) {
        this(param0, nf.field_M.field_p, param1);
    }

    boolean a(qa param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
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
              if (!this.field_D) {
                break L1;
              } else {
                if (!this.field_B) {
                  break L1;
                } else {
                  L2: {
                    param0.f(-1);
                    this.field_F = true;
                    if (this.field_s == null) {
                      break L2;
                    } else {
                      if (this.field_s instanceof p) {
                        ((p) ((Object) this.field_s)).a((qa) (this), this.field_F, (byte) -31);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (param1 < -26) {
                    stackIn_12_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_D = true;
                    return true;
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

            stackIn_15_1 = new StringBuilder().append("bb.A(");

            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        try {
            if (param0 != 5) {
                qa var8 = (qa) null;
                this.a((qa) null, 66);
            }
            if (this.field_s != null) {
                if (!(!(this.field_s instanceof dg))) {
                    ((dg) ((Object) this.field_s)).a(param2, param5, true, (bb) (this), param4, param3);
                }
            }
            this.field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "bb.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_H = null;
        field_I = null;
        if (param0 != -1) {
          field_J = (String) null;
          field_A = null;
          field_J = null;
          return;
        } else {
          field_A = null;
          field_J = null;
          return;
        }
    }

    final void f(int param0) {
        if (this.field_F) {
          this.field_F = false;
          if (this.field_s != null) {
            if (this.field_s instanceof p) {
              ((p) ((Object) this.field_s)).a((qa) (this), this.field_F, (byte) -31);
              if (param0 != -1) {
                field_A = (Boolean) null;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != -1) {
                field_A = (Boolean) null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -1) {
              field_A = (Boolean) null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -1) {
            field_A = (Boolean) null;
            return;
          } else {
            return;
          }
        }
    }

    final boolean e(int param0) {
        qa var3;
        if (param0 != 1) {
          var3 = (qa) null;
          this.a(-92, -95, (qa) null, '');
          return this.field_F;
        } else {
          return this.field_F;
        }
    }

    protected bb() {
        this.field_D = true;
        this.field_B = true;
        this.field_F = false;
        this.field_p = nf.field_M.field_h;
    }

    static {
        field_H = "Show help";
        field_J = "Player names can be up to 12 letters, numbers and underscores";
        field_I = "Next";
    }
}
