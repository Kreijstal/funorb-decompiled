/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class an extends ga {
    static dj field_B;
    private boolean field_A;
    static String field_y;
    boolean field_x;
    int field_z;
    private boolean field_D;
    boolean field_C;

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        try {
            if (param1 <= 1) {
                ga var8 = (ga) null;
                this.a((ga) null, (byte) -127, 26, -100);
            }
            if (null != this.field_v) {
                if (!(!(this.field_v instanceof pe))) {
                    ((pe) ((Object) this.field_v)).a(param0, param2, param4, param3, (an) (this), (byte) -121);
                }
            }
            this.field_m = 0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "an.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void a(ga param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, (byte) 104, param2, param3);
            this.field_z = 0;
            int var5_int = -49 % ((param1 - 46) / 42);
            if (this.field_m != 0) {
                if (this.field_m == kc.field_R) {
                    return;
                }
                if (this.b(ei.field_K, 21224, param2, param3, ha.field_b)) {
                    if (!(kc.field_R != 0)) {
                        this.b(-param3 + ha.field_b, 103, -param2 + ei.field_K, this.field_m);
                    }
                }
                this.a(param3, 25, ha.field_b, ei.field_K, param2, param0);
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "an.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void f(int param0) {
        field_y = null;
        field_B = null;
        if (param0 >= -110) {
            an.f(114);
        }
    }

    an(String param0, sk param1) {
        this(param0, se.field_j.field_a, param1);
    }

    final boolean e(int param0) {
        if (param0 != -17741) {
            return false;
        }
        return this.field_A;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
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
              if (!this.field_C) {
                break L1;
              } else {
                if (!this.b(param3, 21224, param2, param4, param0)) {
                  break L1;
                } else {
                  L2: {
                    this.a((byte) 107, param6);
                    this.field_m = param5;
                    if (null == this.field_v) {
                      break L2;
                    } else {
                      if (!(this.field_v instanceof pe)) {
                        break L2;
                      } else {
                        ((pe) ((Object) this.field_v)).a(false, param2, (an) (this), param0, param4, param5, param3);
                        break L2;
                      }
                    }
                  }
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param1 == 1) {
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("an.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static vn[] a(int param0, int param1, int param2, dj param3) {
        RuntimeException var4 = null;
        vn[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vn[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 > 118) {
              if (ph.a(param0, 31043, param1, param3)) {
                stackIn_7_0 = dn.f((byte) 43);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (vn[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("an.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vn[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    an(String param0, io param1, sk param2) {
        super(param0, param1, param2);
        this.field_A = false;
        this.field_z = 0;
        this.field_D = true;
        this.field_C = true;
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = -108 % ((-83 - param0) / 32);
              if (!this.e(-17741)) {
                break L1;
              } else {
                L2: {
                  if ((param1 ^ -1) == -85) {
                    break L2;
                  } else {
                    if (param1 != 83) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.b(-1, -113, -1, 1);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("an.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
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
            if (!this.field_C) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_D) {
                L1: {
                  param1.c((byte) 57);
                  if (param0 > 67) {
                    break L1;
                  } else {
                    this.field_A = false;
                    break L1;
                  }
                }
                L2: {
                  this.field_A = true;
                  if (this.field_v == null) {
                    break L2;
                  } else {
                    if (!(this.field_v instanceof ef)) {
                      break L2;
                    } else {
                      ((ef) ((Object) this.field_v)).a(this.field_A, (ga) (this), (byte) 15);
                      break L2;
                    }
                  }
                }
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("an.B(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static void a(int param0, ec param1, Object param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1.field_x == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param0;
              L1: while (true) {
                L2: {
                  if (-51 >= (var3_int ^ -1)) {
                    break L2;
                  } else {
                    if (null == param1.field_x.peekEvent()) {
                      break L2;
                    } else {
                      ld.a(1L, (byte) 71);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param2 == null) {
                        break L4;
                      } else {
                        param1.field_x.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("an.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        dj var3;
        if (this.field_A) {
          this.field_A = false;
          if (this.field_v != null) {
            if (!(this.field_v instanceof ef)) {
              if (param0 != 57) {
                var3 = (dj) null;
                an.a(-59, -128, -24, (dj) null);
                return;
              } else {
                return;
              }
            } else {
              ((ef) ((Object) this.field_v)).a(this.field_A, (ga) (this), (byte) 15);
              if (param0 != 57) {
                var3 = (dj) null;
                an.a(-59, -128, -24, (dj) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 57) {
              var3 = (dj) null;
              an.a(-59, -128, -24, (dj) null);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 57) {
            var3 = (dj) null;
            an.a(-59, -128, -24, (dj) null);
            return;
          } else {
            return;
          }
        }
    }

    an(int param0, int param1, int param2, int param3, io param4, sk param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_A = false;
        this.field_z = 0;
        this.field_D = true;
        this.field_C = true;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
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
            if (param2) {
              L1: {
                if (!this.a(param0, param1, 11098, param3)) {
                  break L1;
                } else {
                  L2: {
                    this.a(param0, param3, 123, param1);
                    if (this.field_x) {
                      discarded$2 = param1.append(" active");
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (!this.field_C) {
                    discarded$3 = param1.append(" disabled");
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_11_0 = (StringBuilder) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("an.NA(");

            if (param0 == null) {
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


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_11_0;
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        int var5;
        this.field_z = param3;
        if (null != this.field_v) {
          if (!(this.field_v instanceof hh)) {
            var5 = -25 / ((-12 - param1) / 56);
            return;
          } else {
            ((hh) ((Object) this.field_v)).a(param2, -6, (an) (this), param3, param0);
            var5 = -25 / ((-12 - param1) / 56);
            return;
          }
        } else {
          var5 = -25 / ((-12 - param1) / 56);
          return;
        }
    }

    public an() {
        this.field_A = false;
        this.field_z = 0;
        this.field_D = true;
        this.field_C = true;
        this.field_h = se.field_j.field_d;
    }

    static {
        field_y = "FROM ONLY";
    }
}
