/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tg extends fi {
    boolean field_z;
    static wg field_D;
    static int[] field_A;
    private boolean field_E;
    static String field_y;
    private boolean field_B;
    static int field_x;
    boolean field_C;

    tg(String param0, ol param1, cd param2) {
        super(param0, param1, param2);
        this.field_E = false;
        this.field_B = true;
        this.field_C = true;
    }

    final void c(int param0) {
        if (param0 == -1) {
          if (this.field_E) {
            this.field_E = false;
            if (this.field_o != null) {
              if (!(this.field_o instanceof t)) {
                return;
              } else {
                ((t) ((Object) this.field_o)).a(this.field_E, (fi) (this), 97);
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

    void a(int param0, int param1, fi param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, 125, param2, param3);
              if (param1 > 113) {
                break L1;
              } else {
                this.c(-62);
                break L1;
              }
            }
            L2: {
              if (-1 == (this.field_i ^ -1)) {
                break L2;
              } else {
                if (this.field_i != j.field_e) {
                  L3: {
                    if (!this.a(param3, nl.field_u, hk.field_Jb, (byte) 79, param0)) {
                      break L3;
                    } else {
                      if (j.field_e != 0) {
                        break L3;
                      } else {
                        this.b((byte) 48, this.field_i, -param3 + hk.field_Jb, nl.field_u + -param0);
                        break L3;
                      }
                    }
                  }
                  this.a(hk.field_Jb, nl.field_u, param0, param2, param3, 99);
                  break L2;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("tg.E(").append(param0).append(',').append(param1).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    void b(byte param0, int param1, int param2, int param3) {
        int var5;
        if (null != this.field_o) {
          if (!(this.field_o instanceof ta)) {
            var5 = 61 / ((param0 - -33) / 42);
            return;
          } else {
            ((ta) ((Object) this.field_o)).a(12085, (tg) (this), param1, param2, param3);
            var5 = 61 / ((param0 - -33) / 42);
            return;
          }
        } else {
          var5 = 61 / ((param0 - -33) / 42);
          return;
        }
    }

    final boolean f(boolean param0) {
        if (!param0) {
            tg.a((byte) 76);
            return this.field_E;
        }
        return this.field_E;
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        RuntimeException var7 = null;
        StringBuilder var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_o) {
                break L1;
              } else {
                if (!(this.field_o instanceof pk)) {
                  break L1;
                } else {
                  ((pk) ((Object) this.field_o)).a(param0, param1, param4, -20637, (tg) (this), param2);
                  break L1;
                }
              }
            }
            this.field_i = 0;
            if (param5 >= 73) {
              break L0;
            } else {
              var8 = (StringBuilder) null;
              this.a((Hashtable) null, (byte) 73, -4, (StringBuilder) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("tg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.field_C) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_B) {
                param0.c(-1);
                if (param1 == -8515) {
                  L1: {
                    this.field_E = true;
                    if (this.field_o == null) {
                      break L1;
                    } else {
                      if (this.field_o instanceof t) {
                        ((t) ((Object) this.field_o)).a(this.field_E, (fi) (this), 91);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_13_0 = 1;
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("tg.G(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

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
              if (this.a(param0, param2, 34, param3)) {
                L2: {
                  this.a(param2, param0, (byte) 126, param3);
                  if (!this.field_z) {
                    break L2;
                  } else {
                    discarded$2 = param3.append(" active");
                    break L2;
                  }
                }
                if (this.field_C) {
                  break L1;
                } else {
                  discarded$3 = param3.append(" disabled");
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 >= 118) {
                break L3;
              } else {
                this.field_z = true;
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

            stackIn_12_1 = new StringBuilder().append("tg.MA(");

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
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(byte param0) {
        if (param0 >= -51) {
            return;
        }
        field_y = null;
        field_A = null;
        field_D = null;
    }

    boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
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
              if (!this.field_C) {
                break L1;
              } else {
                if (this.a(param5, param6, param4, (byte) 58, param3)) {
                  L2: {
                    this.a(param0, -8515);
                    this.field_i = param1;
                    if (this.field_o == null) {
                      break L2;
                    } else {
                      if (this.field_o instanceof pk) {
                        ((pk) ((Object) this.field_o)).a(param1, (tg) (this), param6, param4, (byte) 111, param5, param3);
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
              if (!param2) {
                break L3;
              } else {
                field_y = (String) null;
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

            stackIn_15_1 = new StringBuilder().append("tg.NA(");

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
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    tg(String param0, cd param1) {
        this(param0, vi.field_g.field_l, param1);
    }

    boolean a(fi param0, char param1, int param2, int param3) {
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
              var5_int = -117 % ((-75 - param3) / 36);
              if (!this.f(true)) {
                break L1;
              } else {
                L2: {
                  if (84 == param2) {
                    break L2;
                  } else {
                    if (83 != param2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.b((byte) -97, 1, -1, -1);
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

            stackIn_10_1 = new StringBuilder().append("tg.AA(");

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
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    protected tg() {
        this.field_E = false;
        this.field_B = true;
        this.field_C = true;
        this.field_w = vi.field_g.field_b;
    }

    static {
        field_x = 0;
        field_y = "Withdraw request to join <%0>'s game";
    }
}
