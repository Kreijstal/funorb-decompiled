/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wp extends pk {
    int field_B;
    static String field_A;
    private boolean field_y;
    private boolean field_D;
    boolean field_C;
    static boolean[] field_z;
    boolean field_x;

    boolean a(pk param0, byte param1) {
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
            if (!this.field_x) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_y) {
                param0.c((byte) 122);
                if (param1 == 61) {
                  L1: {
                    this.field_D = true;
                    if (this.field_o == null) {
                      break L1;
                    } else {
                      if (!(this.field_o instanceof fc)) {
                        break L1;
                      } else {
                        ((fc) ((Object) this.field_o)).a(this.field_D, (pk) (this), -112);
                        break L1;
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("wp.Q(");

            if (param0 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
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

    final void c(byte param0) {
        int var2;
        var2 = 61 / ((param0 - 64) / 51);
        if (this.field_D) {
          this.field_D = false;
          if (null != this.field_o) {
            if (this.field_o instanceof fc) {
              ((fc) ((Object) this.field_o)).a(this.field_D, (pk) (this), -76);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
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
              if (param2 >= 9) {
                break L1;
              } else {
                this.c((byte) -47);
                break L1;
              }
            }
            if (!this.d(-1)) {
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if ((param3 ^ -1) == -85) {
                  break L2;
                } else {
                  if ((param3 ^ -1) == -84) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
              this.b(1, -1, true, -1);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("wp.KA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    wp(int param0, int param1, int param2, int param3, mh param4, qm param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_D = false;
        this.field_B = 0;
        this.field_y = true;
        this.field_x = true;
    }

    final static f a(fr param0, int param1, int param2, byte[] param3, boolean param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        f stackIn_7_0 = null;
        f stackIn_10_0 = null;
        f stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6 > 105) {
                break L1;
              } else {
                wp.a((byte) 46);
                break L1;
              }
            }
            L2: {
              if (param0.field_Cc) {
                break L2;
              } else {
                L3: {
                  if (!rm.a(param2, -105)) {
                    break L3;
                  } else {
                    if (!rm.a(param1, -103)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param0.field_C) {
                  stackIn_12_0 = new f(param0, 34037, param5, param2, param1, param4, param3, param7);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_10_0 = new f(param0, param5, param2, param1, hn.a(false, param2), hn.a(false, param1), param3, param7);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_7_0 = new f(param0, 3553, param5, param2, param1, param4, param3, param7);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("wp.K(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    wp(String param0, qm param1) {
        this(param0, ks.field_x.field_h, param1);
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param1) {
            return;
        }
        try {
            if (null != this.field_o && this.field_o instanceof wu) {
                ((wu) ((Object) this.field_o)).a(param5, param2, param3, param4, (wp) (this), -21726);
            }
            this.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wp.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        pk var9 = null;
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
            L1: {
              if (param1 <= -42) {
                break L1;
              } else {
                var9 = (pk) null;
                this.a((pk) null, 108, 43, 75, 47, -24, -60);
                break L1;
              }
            }
            if (!this.field_x) {
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.b(param5, -1, param4, param2, param6)) {
                L2: {
                  this.a(param0, (byte) 61);
                  this.field_l = param3;
                  if (null == this.field_o) {
                    break L2;
                  } else {
                    if (this.field_o instanceof wu) {
                      ((wu) ((Object) this.field_o)).a(param5, param3, param4, (wp) (this), param2, param6, false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("wp.R(");

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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param0, param1, -121, param2)) {
                break L1;
              } else {
                L2: {
                  this.a(param0, (byte) -128, param2, param1);
                  if (!this.field_C) {
                    break L2;
                  } else {
                    discarded$2 = param2.append(" active");
                    break L2;
                  }
                }
                if (this.field_x) {
                  break L1;
                } else {
                  discarded$3 = param2.append(" disabled");
                  break L1;
                }
              }
            }
            L3: {
              if (param3 == 0) {
                break L3;
              } else {
                this.field_B = 96;
                break L3;
              }
            }
            stackIn_8_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("wp.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    void a(int param0, int param1, pk param2, int param3) {
        try {
            int var5_int = -37 % ((-25 - param1) / 45);
            super.a(param0, 49, param2, param3);
            this.field_B = 0;
            if (this.field_l != 0) {
                if (this.field_l == ar.field_G) {
                    return;
                }
                if (this.b(ko.field_p, -1, param0, pi.field_e, param3) && 0 == ar.field_G) {
                    this.b(this.field_l, ko.field_p - param0, true, pi.field_e - param3);
                }
                this.a(param2, false, param0, pi.field_e, ko.field_p, param3);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wp.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_z = null;
        field_A = null;
        int var1 = 124 % ((param0 - -16) / 53);
    }

    wp(String param0, mh param1, qm param2) {
        super(param0, param1, param2);
        this.field_D = false;
        this.field_B = 0;
        this.field_y = true;
        this.field_x = true;
    }

    final boolean d(int param0) {
        if (param0 != -1) {
            this.field_x = false;
            return this.field_D;
        }
        return this.field_D;
    }

    void b(int param0, int param1, boolean param2, int param3) {
        L0: {
          this.field_B = param0;
          if (this.field_o == null) {
            break L0;
          } else {
            if (this.field_o instanceof ai) {
              ((ai) ((Object) this.field_o)).a(param0, 710, (wp) (this), param1, param3);
              break L0;
            } else {
              if (param2) {
                return;
              } else {
                this.field_y = true;
                return;
              }
            }
          }
        }
        if (!param2) {
          this.field_y = true;
          return;
        } else {
          return;
        }
    }

    public wp() {
        this.field_D = false;
        this.field_B = 0;
        this.field_y = true;
        this.field_x = true;
        this.field_w = ks.field_x.field_n;
    }

    static {
        field_A = "Return to main menu";
        field_z = new boolean[64];
    }
}
