/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fw extends kb {
    boolean field_I;
    static int field_C;
    static int[] field_J;
    private boolean field_D;
    static String field_H;
    int field_G;
    static kl field_F;
    private boolean field_E;
    boolean field_K;

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ga.field_g) {
                ga.field_g.field_T.a(100, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == tj.field_C) {
                break L2;
              } else {
                tj.field_C.field_M.a(100, param1);
                break L2;
              }
            }
            if (param0 == -1) {
              break L0;
            } else {
              fw.i(-98);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("fw.GA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    boolean a(int param0, kb param1) {
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
            if (!this.field_I) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_D) {
                L1: {
                  if (param0 == 11) {
                    break L1;
                  } else {
                    field_C = 102;
                    break L1;
                  }
                }
                L2: {
                  param1.f(1);
                  this.field_E = true;
                  if (this.field_x == null) {
                    break L2;
                  } else {
                    if (this.field_x instanceof ie) {
                      ((ie) ((Object) this.field_x)).a((kb) (this), this.field_E, (byte) -41);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_12_0 = 1;
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
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("fw.M(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        try {
            super.a(param0 + 0, param1, param2, param3);
            this.field_G = 0;
            if (param0 != 32722) {
                field_C = -124;
            }
            if (this.field_q != 0) {
                if (this.field_q == ro.field_ub) {
                    return;
                }
                if (this.b(param0 + -32721, param1, ko.field_b, sm.field_d, param2)) {
                    if (!(-1 != (ro.field_ub ^ -1))) {
                        this.a(this.field_q, sm.field_d - param1, ko.field_b - param2, true);
                    }
                }
                this.a(param2, param3, sm.field_d, (byte) -118, ko.field_b, param1);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fw.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    fw(String param0, qo param1) {
        this(param0, t.field_c.field_j, param1);
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
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
              if (!this.a(false)) {
                break L1;
              } else {
                L2: {
                  if (84 == param1) {
                    break L2;
                  } else {
                    if ((param1 ^ -1) == -84) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                this.a(1, -1, -1, true);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            if (param3 == -12215) {
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              field_F = (kl) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("fw.F(");

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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public static void i(int param0) {
        field_H = null;
        field_J = null;
        if (param0 != 0) {
            return;
        }
        field_F = null;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param3, param0, (byte) 106, param1)) {
                break L1;
              } else {
                L2: {
                  this.a(param0, param3, true, param1);
                  if (!this.field_K) {
                    break L2;
                  } else {
                    discarded$2 = param1.append(" active");
                    break L2;
                  }
                }
                if (!this.field_I) {
                  discarded$3 = param1.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param2 == 26477) {
                break L3;
              } else {
                this.a(true);
                break L3;
              }
            }
            stackIn_9_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("fw.OA(").append(param0).append(',');

            if (param1 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return this.field_E;
    }

    void a(int param0, int param1, int param2, boolean param3) {
        this.field_G = param0;
        if (param3) {
          if (null != this.field_x) {
            if (!(this.field_x instanceof he)) {
              return;
            } else {
              ((he) ((Object) this.field_x)).a(param1, 11, param0, param2, (fw) (this));
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    fw(String param0, kh param1, qo param2) {
        super(param0, param1, param2);
        this.field_I = true;
        this.field_D = true;
        this.field_E = false;
        this.field_G = 0;
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        try {
            if (this.field_x != null && this.field_x instanceof qe) {
                ((qe) ((Object) this.field_x)).a(-110, param4, (fw) (this), param5, param0, param2);
            }
            int var7_int = -87 % ((param3 - -58) / 53);
            this.field_q = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fw.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        kb var9 = null;
        int stackIn_6_0 = 0;
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
            L1: {
              if (!this.field_I) {
                break L1;
              } else {
                if (!this.b(1, param1, param5, param0, param2)) {
                  break L1;
                } else {
                  L2: {
                    this.a(11, param4);
                    this.field_q = param6;
                    if (null == this.field_x) {
                      break L2;
                    } else {
                      if (!(this.field_x instanceof qe)) {
                        break L2;
                      } else {
                        ((qe) ((Object) this.field_x)).a((fw) (this), param2, param1, param0, param5, param6, (byte) 110);
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
            if (param3 > 103) {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var9 = (kb) null;
              this.a(67, -21, 92, 52, (kb) null, -105, -128);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("fw.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    fw(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_I = true;
        this.field_D = true;
        this.field_E = false;
        this.field_G = 0;
    }

    final void f(int param0) {
        Hashtable var3;
        if (this.field_E) {
          this.field_E = false;
          if (null != this.field_x) {
            if (!(this.field_x instanceof ie)) {
              if (param0 != 1) {
                var3 = (Hashtable) null;
                this.a(78, (StringBuilder) null, 126, (Hashtable) null);
                return;
              } else {
                return;
              }
            } else {
              ((ie) ((Object) this.field_x)).a((kb) (this), this.field_E, (byte) -41);
              if (param0 != 1) {
                var3 = (Hashtable) null;
                this.a(78, (StringBuilder) null, 126, (Hashtable) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 1) {
              var3 = (Hashtable) null;
              this.a(78, (StringBuilder) null, 126, (Hashtable) null);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 1) {
            var3 = (Hashtable) null;
            this.a(78, (StringBuilder) null, 126, (Hashtable) null);
            return;
          } else {
            return;
          }
        }
    }

    public fw() {
        this.field_I = true;
        this.field_D = true;
        this.field_E = false;
        this.field_G = 0;
        this.field_k = t.field_c.field_q;
    }

    static {
        field_H = "Average rating";
    }
}
