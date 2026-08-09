/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wi extends fd {
    static String field_x;
    private boolean field_D;
    static boolean field_B;
    private boolean field_w;
    static uv field_v;
    boolean field_y;
    static boolean[] field_z;
    static int field_C;
    boolean field_A;

    wi(String param0, gj param1, jv param2) {
        super(param0, param1, param2);
        this.field_D = false;
        this.field_w = true;
        this.field_y = true;
    }

    final static void a(String param0, String param1, int param2, int param3, String param4, int param5) {
        tv var6 = null;
        try {
            if (param5 >= -112) {
                field_x = (String) null;
            }
            var6 = new tv(param3, param1, param2, param0, param4);
            ec.a(true, var6);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wi.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
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
              if (!this.field_y) {
                break L1;
              } else {
                if (!this.a((byte) 47, param5, param1, param2, param4)) {
                  break L1;
                } else {
                  L2: {
                    this.a(param3, 0);
                    this.field_p = param6;
                    if (null == this.field_k) {
                      break L2;
                    } else {
                      if (this.field_k instanceof nf) {
                        ((nf) ((Object) this.field_k)).a(param4, param6, param2, param5, (wi) (this), (byte) -32, param1);
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
            if (param0) {
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_10_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("wi.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 <= 40) {
            field_z = (boolean[]) null;
        }
        field_x = null;
        field_v = null;
        field_z = null;
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
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
              if (param1 < -60) {
                break L1;
              } else {
                this.field_w = true;
                break L1;
              }
            }
            if (!this.b(97)) {
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param3 == 84) {
                  break L2;
                } else {
                  if ((param3 ^ -1) == -84) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
              this.b(1, -1, -1, -1);
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

            stackIn_12_1 = new StringBuilder().append("wi.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final boolean b(int param0) {
        if (param0 < 10) {
            return false;
        }
        return this.field_D;
    }

    final void g(int param0) {
        if (this.field_D) {
            this.field_D = false;
            if (null != this.field_k) {
                if (!(!(this.field_k instanceof ab))) {
                    ((ab) ((Object) this.field_k)).a(this.field_D, (fd) (this), -9307);
                }
            }
        }
        if (param0 != 84) {
            fd var3 = (fd) null;
            this.a('￱', (byte) 74, (fd) null, -102);
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        try {
            if (null != this.field_k) {
                if (!(!(this.field_k instanceof nf))) {
                    ((nf) ((Object) this.field_k)).a((wi) (this), param2, param4 + -31878, param1, param0, param5);
                }
            }
            if (param4 != -1) {
                this.field_A = false;
            }
            this.field_p = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wi.T(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    wi(String param0, jv param1) {
        this(param0, nb.field_i.field_l, param1);
    }

    void a(byte param0, fd param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (this.field_p != 0 && this.field_p != nl.field_p) {
                if (this.a((byte) -70, param2, param3, el.field_A, n.field_m)) {
                    if (!(0 != nl.field_p)) {
                        this.b(this.field_p, -param2 + el.field_A, n.field_m + -param3, -1);
                    }
                }
                this.a(param3, n.field_m, el.field_A, param1, param0 + -13, param2);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wi.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(fd param0, int param1) {
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
            L1: {
              if (!this.field_y) {
                break L1;
              } else {
                if (!this.field_w) {
                  break L1;
                } else {
                  if (param1 == 0) {
                    L2: {
                      param0.g(84);
                      this.field_D = true;
                      if (this.field_k == null) {
                        break L2;
                      } else {
                        if (this.field_k instanceof ab) {
                          ((ab) ((Object) this.field_k)).a(this.field_D, (fd) (this), param1 ^ -9307);
                          break L2;
                        } else {
                          return true;
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("wi.HA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
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

    final static StringBuilder a(int param0, int[] param1) {
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -31182) {
                break L1;
              } else {
                var5 = (String) null;
                wi.a((String) null, (String) null, -61, -57, (String) null, 83);
                break L1;
              }
            }
            var2 = new StringBuilder("int[] {");
            var3 = 0;
            L2: while (true) {
              if (var3 >= param1.length) {
                stackIn_9_0 = var2.append('}');
                break L0;
              } else {
                L3: {
                  discarded$10 = var2.append(var3);
                  if (-1 + param1.length <= var3) {
                    break L3;
                  } else {
                    discarded$11 = var2.append(',');
                    break L3;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("wi.M(").append(param0).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
            this.b(117, -8, -51, -115);
        }
        if (this.field_k != null) {
            if (!(!(this.field_k instanceof vh))) {
                ((vh) ((Object) this.field_k)).a(param1, (wi) (this), param2, (byte) 99, param0);
            }
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param0 + -17882, param3, param2, param1)) {
                L2: {
                  this.b(param1, param3, param2, -18568);
                  if (this.field_A) {
                    discarded$2 = param3.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!this.field_y) {
                  discarded$3 = param3.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == 17883) {
                break L3;
              } else {
                field_C = -75;
                break L3;
              }
            }
            stackIn_11_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("wi.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    protected wi() {
        this.field_D = false;
        this.field_w = true;
        this.field_y = true;
        this.field_r = nb.field_i.field_n;
    }

    static {
        field_x = "You are invited to <%0>'s game.";
        field_C = -1;
    }
}
