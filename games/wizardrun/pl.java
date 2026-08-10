/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pl extends ub {
    private boolean field_y;
    static ga field_E;
    static int field_A;
    boolean field_B;
    private boolean field_C;
    boolean field_z;
    static boolean field_D;

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
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
              if (!this.a(param3, param0, param2, true)) {
                break L1;
              } else {
                L2: {
                  this.a(115, param2, param0, param3);
                  if (!this.field_z) {
                    break L2;
                  } else {
                    discarded$2 = param3.append(" active");
                    break L2;
                  }
                }
                if (!this.field_B) {
                  discarded$3 = param3.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param1 == 102) {
                break L3;
              } else {
                this.field_C = true;
                break L3;
              }
            }
            stackIn_9_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pl.U(");

            if (param0 == null) {
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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

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
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        try {
            if (this.field_s != null) {
                if (!(!(this.field_s instanceof ja))) {
                    ((ja) ((Object) this.field_s)).a(param0, (pl) (this), param1, param2, true, param3);
                }
            }
            this.field_q = param5;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "pl.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    pl(String param0, ce param1) {
        this(param0, kc.field_H.field_c, param1);
    }

    final static wd a(int param0, String param1) {
        RuntimeException var2 = null;
        wd stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        wd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              if (wc.field_j != field_E) {
                L1: {
                  if (wc.field_j != mi.field_z) {
                    break L1;
                  } else {
                    if (param1.equals(qc.field_I)) {
                      wc.field_j = ej.field_b;
                      stackIn_12_0 = kd.field_a;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                kd.field_a = null;
                qc.field_I = param1;
                wc.field_j = field_E;
                stackIn_10_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (wd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("pl.CB(").append(param0).append(',');

            if (param1 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wd) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (wd) ((Object) stackIn_10_0);
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param0 < -45) {
          if (this.field_s != null) {
            if (!(this.field_s instanceof qd)) {
              return;
            } else {
              ((qd) ((Object) this.field_s)).a(-18905, (pl) (this), param3, param2, param1);
              return;
            }
          } else {
            return;
          }
        } else {
          this.d((byte) -65);
          if (this.field_s == null) {
            return;
          } else {
            L0: {
              if (this.field_s instanceof qd) {
                ((qd) ((Object) this.field_s)).a(-18905, (pl) (this), param3, param2, param1);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    boolean a(ub param0, int param1) {
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
            if (!this.field_B) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_y) {
                L1: {
                  param0.b(false);
                  this.field_C = true;
                  if (this.field_s == null) {
                    break L1;
                  } else {
                    if (this.field_s instanceof ma) {
                      ((ma) ((Object) this.field_s)).a((ub) (this), param1 ^ -19983, this.field_C);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (param1 == 8) {
                    break L2;
                  } else {
                    pl.a(92);
                    break L2;
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

            stackIn_15_1 = new StringBuilder().append("pl.J(");

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
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
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
              var8_int = 16 / ((param1 - 12) / 36);
              if (!this.field_B) {
                break L1;
              } else {
                if (!this.b(param5, param2, 0, param0, param3)) {
                  break L1;
                } else {
                  L2: {
                    this.a(param6, 8);
                    this.field_q = param4;
                    if (this.field_s == null) {
                      break L2;
                    } else {
                      if (this.field_s instanceof ja) {
                        ((ja) ((Object) this.field_s)).a((pl) (this), param4, param5, (byte) -17, param0, param2, param3);
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_9_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var8);

            stackIn_12_1 = new StringBuilder().append("pl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, ub param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (-1 != (this.field_q ^ -1)) {
                if (sh.field_c == this.field_q) {
                    return;
                }
                if (this.b(fi.field_B, pg.field_n, 0, param2, param1)) {
                    if (!(0 != sh.field_c)) {
                        this.b(-88, pg.field_n - param2, -param1 + fi.field_B, this.field_q);
                    }
                }
                this.a(param2, fi.field_B, param1, pg.field_n, param3, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "pl.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 != 53) {
            pl.a(49);
            return this.field_C;
        }
        return this.field_C;
    }

    boolean a(char param0, int param1, byte param2, ub param3) {
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
            if (param2 <= -96) {
              if (!this.d((byte) 53)) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  if (84 == param1) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) == -84) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                this.b(-117, -1, -1, 1);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("pl.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    final static String a(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        if (fi.field_y == field_E) {
            return sf.field_a;
        }
        return lb.field_e;
    }

    final void b(boolean param0) {
        if (!param0) {
          if (this.field_C) {
            this.field_C = false;
            if (this.field_s != null) {
              if (!(this.field_s instanceof ma)) {
                return;
              } else {
                ((ma) ((Object) this.field_s)).a((ub) (this), -19975, this.field_C);
                return;
              }
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

    public static void d(boolean param0) {
        field_E = null;
        if (!param0) {
            pl.a(68);
        }
    }

    protected pl() {
        this.field_y = true;
        this.field_B = true;
        this.field_C = false;
        this.field_w = kc.field_H.field_n;
    }

    pl(String param0, bf param1, ce param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_B = true;
        this.field_C = false;
    }

    static {
        field_A = 0;
        field_D = false;
        field_E = new ga();
    }
}
