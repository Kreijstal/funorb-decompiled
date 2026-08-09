/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class d extends oc {
    private boolean field_I;
    static String field_C;
    private boolean field_E;
    static String field_D;
    boolean field_F;
    static String field_G;
    static int field_H;
    boolean field_J;

    public static void g(int param0) {
        if (param0 > -22) {
            return;
        }
        field_G = null;
        field_C = null;
        field_D = null;
    }

    final void b(boolean param0) {
        oc var3;
        if (!param0) {
          if (this.field_E) {
            this.field_E = false;
            if (this.field_i != null) {
              if (this.field_i instanceof gm) {
                ((gm) ((Object) this.field_i)).a(this.field_E, (oc) (this), 19365);
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
          var3 = (oc) null;
          this.a((oc) null, (byte) -52, -45, 104);
          if (this.field_E) {
            this.field_E = false;
            if (this.field_i != null) {
              if (this.field_i instanceof gm) {
                ((gm) ((Object) this.field_i)).a(this.field_E, (oc) (this), 19365);
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

    d(String param0, uh param1) {
        this(param0, bj.field_T.field_q, param1);
    }

    d(String param0, ub param1, uh param2) {
        super(param0, param1, param2);
        this.field_I = true;
        this.field_E = false;
        this.field_J = true;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
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
              if (!this.a(param3, 1595637992, param0, param1)) {
                break L1;
              } else {
                L2: {
                  this.a(param1, param0, 0, param3);
                  if (this.field_F) {
                    discarded$2 = param3.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!this.field_J) {
                  discarded$3 = param3.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param2 == 24) {
                break L3;
              } else {
                this.field_E = true;
                break L3;
              }
            }
            stackIn_10_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("d.UA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
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
              if (!this.field_J) {
                break L1;
              } else {
                if (this.a(param5, param3, param2, param6 + 3, param1)) {
                  L2: {
                    this.a(true, param0);
                    this.field_n = param4;
                    if (this.field_i == null) {
                      break L2;
                    } else {
                      if (this.field_i instanceof ca) {
                        ((ca) ((Object) this.field_i)).a(param2, param4, (d) (this), param5, param1, param3, -13469);
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
            if (param6 == 0) {
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_11_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("d.MA(");

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
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (this.field_i != null) {
          if (this.field_i instanceof en) {
            ((en) ((Object) this.field_i)).a(param0, param1, (byte) -60, param3, (d) (this));
            if (param2 >= -8) {
              this.f(-13);
              return;
            } else {
              return;
            }
          } else {
            if (param2 >= -8) {
              this.f(-13);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 >= -8) {
            this.f(-13);
            return;
          } else {
            return;
          }
        }
    }

    boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        oc stackIn_7_0 = null;
        oc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_J) {
                break L1;
              } else {
                if (!this.field_I) {
                  break L1;
                } else {
                  L2: {
                    stackIn_7_0 = (oc) (param1);

                    if (param0) {
                      stackIn_8_0 = (oc) ((Object) stackIn_7_0);
                      stackIn_8_1 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = (oc) ((Object) stackIn_7_0);
                      stackIn_8_1 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    ((oc) (Object) stackIn_8_0).b(stackIn_8_1 != 0);
                    stackIn_10_0 = this;

                    if (!param0) {
                      stackIn_11_0 = this;
                      stackIn_11_1 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = this;
                      stackIn_11_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    ((d) (this)).field_E = stackIn_11_1 != 0;
                    if (null == this.field_i) {
                      break L4;
                    } else {
                      if (this.field_i instanceof gm) {
                        ((gm) ((Object) this.field_i)).a(this.field_E, (oc) (this), 19365);
                        break L4;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackIn_16_0 = 1;
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("d.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    void a(oc param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (this.field_n != 0 && cb.field_q != this.field_n) {
                if (this.a(po.field_a, param3, param2, param1 + 3, pq.field_k) && -1 == (cb.field_q ^ -1)) {
                    this.a(po.field_a + -param3, this.field_n, -79, -param2 + pq.field_k);
                }
                this.a(po.field_a, pq.field_k, param3, param0, 19223, param2);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "d.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
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
            if (param1 == 110) {
              if (!this.f(-103)) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  if (param0 == 84) {
                    break L1;
                  } else {
                    if (param0 == 83) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                this.a(-1, 1, -18, -1);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
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
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("d.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
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

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        try {
            if (null != this.field_i && this.field_i instanceof ca) {
                ((ca) ((Object) this.field_i)).a((byte) 10, param2, param0, (d) (this), param5, param1);
            }
            if (param4 != 19223) {
                this.f(87);
            }
            this.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "d.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean f(int param0) {
        oc var3;
        if (param0 >= -49) {
          var3 = (oc) null;
          this.a((oc) null, -26, 22, -12, 8, -95, 39);
          return this.field_E;
        } else {
          return this.field_E;
        }
    }

    protected d() {
        this.field_I = true;
        this.field_E = false;
        this.field_J = true;
        this.field_l = bj.field_T.field_r;
    }

    static {
        field_D = "Achievements";
        field_H = 0;
        field_G = "Join <%0>'s game";
    }
}
