/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class t extends we {
    boolean field_w;
    private boolean field_A;
    private boolean field_x;
    boolean field_u;
    static pj field_v;
    static String field_y;
    static ta field_z;

    final void e(int param0) {
        we var3;
        if (param0 == 13104) {
          if (this.field_A) {
            this.field_A = false;
            if (this.field_o != null) {
              if (this.field_o instanceof bj) {
                ((bj) ((Object) this.field_o)).a(false, (we) (this), this.field_A);
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
        } else {
          var3 = (we) null;
          this.a(-78, 95, 39, 80, (we) null, -32, 69);
          if (this.field_A) {
            this.field_A = false;
            if (this.field_o != null) {
              if (this.field_o instanceof bj) {
                ((bj) ((Object) this.field_o)).a(false, (we) (this), this.field_A);
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
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
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
              if (!this.field_w) {
                break L1;
              } else {
                if (this.a(param1, param0, param6, param5, (byte) 45)) {
                  L2: {
                    this.a(param4, false);
                    this.field_t = param2;
                    if (this.field_o == null) {
                      break L2;
                    } else {
                      if (this.field_o instanceof jb) {
                        ((jb) ((Object) this.field_o)).a(param6, param1, -29446, param2, param5, (t) (this), param0);
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param3 == -1625) {
                break L3;
              } else {
                this.field_A = false;
                break L3;
              }
            }
            stackIn_12_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("t.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    t(String param0, ml param1, of param2) {
        super(param0, param1, param2);
        this.field_w = true;
        this.field_A = false;
        this.field_x = true;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            return false;
        }
        return this.field_A;
    }

    t(String param0, of param1) {
        this(param0, hi.field_b.field_i, param1);
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -48);
              if (this.field_t == 0) {
                break L1;
              } else {
                if (this.field_t != ni.field_a) {
                  L2: {
                    if (!this.a(ei.field_a, param1, param2, p.field_a, (byte) 45)) {
                      break L2;
                    } else {
                      if (0 == ni.field_a) {
                        this.b(-93, ei.field_a + -param2, -param1 + p.field_a, this.field_t);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a(param1, ei.field_a, param0, p.field_a, 0, param2);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param3 < -13) {
              break L0;
            } else {
              this.field_u = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("t.E(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param2, (byte) -125, param3, param1)) {
                break L1;
              } else {
                L2: {
                  this.a(param2, param3, param1, -108);
                  if (this.field_u) {
                    discarded$2 = param1.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (this.field_w) {
                  break L1;
                } else {
                  discarded$3 = param1.append(" disabled");
                  break L1;
                }
              }
            }
            if (!param0) {
              stackIn_10_0 = (StringBuilder) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("t.T(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        we var6;
        if (param0 <= -23) {
          if (null != this.field_o) {
            if (!(this.field_o instanceof ql)) {
              return;
            } else {
              ((ql) ((Object) this.field_o)).a(param2, param3, param1, 7, (t) (this));
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = (we) null;
          this.a((we) null, 14, 64, (byte) 66);
          if (null != this.field_o) {
            if (!(this.field_o instanceof ql)) {
              return;
            } else {
              ((ql) ((Object) this.field_o)).a(param2, param3, param1, 7, (t) (this));
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        try {
            if (this.field_o != null) {
                if (!(!(this.field_o instanceof jb))) {
                    ((jb) ((Object) this.field_o)).a((byte) -14, param0, param1, param5, param3, (t) (this));
                }
            }
            this.field_t = param4;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "t.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void i(int param0) {
        me var1;
        int var2;
        hb var3;
        var1 = (me) ((Object) af.field_a.a((byte) -117));
        var2 = -29 % ((-53 - param0) / 58);
        if (var1 == null) {
          gk.a(-1);
          return;
        } else {
          var3 = MonkeyPuzzle2.field_D;
          var3.e(-86);
          var3.e(126);
          var3.e(-46);
          var3.e(127);
          var1.c(-19822);
          return;
        }
    }

    public static void j(int param0) {
        field_v = null;
        field_z = null;
        field_y = null;
        if (param0 > -26) {
            t.i(28);
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
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
              if (!this.b((byte) 96)) {
                break L1;
              } else {
                L2: {
                  if ((param2 ^ -1) == -85) {
                    break L2;
                  } else {
                    if (param2 == 83) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                this.b(-64, -1, -1, 1);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var5_int = 58 % ((param3 - 37) / 50);
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("t.V(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    boolean a(we param0, boolean param1) {
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
              if (!this.field_w) {
                break L1;
              } else {
                if (!this.field_x) {
                  break L1;
                } else {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      this.e(-62);
                      break L2;
                    }
                  }
                  L3: {
                    param0.e(13104);
                    this.field_A = true;
                    if (this.field_o == null) {
                      break L3;
                    } else {
                      if (this.field_o instanceof bj) {
                        ((bj) ((Object) this.field_o)).a(false, (we) (this), this.field_A);
                        break L3;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("t.AA(");

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
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    protected t() {
        this.field_w = true;
        this.field_A = false;
        this.field_x = true;
        this.field_h = hi.field_b.field_g;
    }

    static {
        field_v = new pj();
        field_y = "Waiting for sound effects";
    }
}
