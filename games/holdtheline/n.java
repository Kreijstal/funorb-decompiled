/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class n extends hl {
    static gn field_w;
    static uf field_j;
    int field_y;
    boolean field_p;
    String field_z;
    static uf field_r;
    tb field_t;
    int field_o;
    lm field_i;
    int field_u;
    dh field_l;
    static String field_s;
    int field_k;
    int field_v;
    int field_x;
    int field_m;
    String field_q;
    static volatile long field_n;

    final boolean b(int param0, byte param1, int param2, int param3, int param4) {
        String discarded$1 = null;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 == -105) {
          if (this.field_k + param0 <= param2) {
            if (param3 - -this.field_o > param4) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param2 >= this.field_x + this.field_k + param0) {
                    break L1;
                  } else {
                    if (param4 >= this.field_u + this.field_o + param3) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          discarded$1 = this.toString();
          if (this.field_k + param0 <= param2) {
            if (param3 - -this.field_o <= param4) {
              if (param2 < this.field_x + this.field_k + param0) {
                if (param4 >= this.field_u + this.field_o + param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        int discarded$2 = 0;
        if (param1 != 122) {
          discarded$2 = this.d((byte) -120);
          this.field_o = param2;
          this.field_u = param3;
          this.field_x = param4;
          this.field_k = param0;
          return;
        } else {
          this.field_o = param2;
          this.field_u = param3;
          this.field_x = param4;
          this.field_k = param0;
          return;
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 111 % ((57 - param2) / 45);
        if (this.c((byte) -20)) {
          if (!this.a((n) (this), param0, (byte) -78, param1)) {
            var5 = param0;
            if ((var5 ^ -1) == -81) {
              return this.a((n) (this), -25823);
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          var5 = param0;
          if ((var5 ^ -1) != -81) {
            return false;
          } else {
            return this.a((n) (this), -25823);
          }
        }
    }

    boolean a(int param0, n param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param6 == -24898) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_w = (gn) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("n.KB(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean c(byte param0) {
        if (param0 != -20) {
            return false;
        }
        return false;
    }

    int d(byte param0) {
        if (param0 >= -66) {
            this.field_y = 63;
            return 0;
        }
        return 0;
    }

    void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_v = 0;
              if (param4 == -9) {
                break L1;
              } else {
                this.field_q = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("n.SA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != 25) {
            return;
        }
        field_w = null;
        field_j = null;
        field_r = null;
        field_s = null;
    }

    String f(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        if (!this.field_p) {
            return null;
        }
        return this.field_z;
    }

    n(String param0, tb param1) {
        this(param0, pc.field_b.field_r, param1);
    }

    void a(int param0, n param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var5_int = this.b(param0, (byte) -105, nc.field_g, param2, rf.field_X) ? 1 : 0;
              if (var5_int != 0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (this.field_p ? 1 : 0)) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5_int == 0) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((n) (this)).field_p = stackIn_8_1 != 0;
                if (this.field_t == null) {
                  break L2;
                } else {
                  if (this.field_t instanceof qc) {
                    ((qc) ((Object) this.field_t)).a((n) (this), (byte) 118, var5_int != 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (param3 == -3) {
                break L4;
              } else {
                this.field_z = (String) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("n.JA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!this.a(20720, param2, param3, param0)) {
                break L1;
              } else {
                this.a(param2, param0, true, param3);
                break L1;
              }
            }
            var5_int = 127 / ((param1 - 0) / 49);
            stackOut_2_0 = (StringBuilder) (param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("n.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    void e(int param0) {
        if (param0 <= 15) {
            this.field_k = 102;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == -9532) {
          if (param3 == 0) {
            if (null == this.field_l) {
              return;
            } else {
              this.field_l.a(true, param2, -67, (n) (this), param1);
              return;
            }
          } else {
            return;
          }
        } else {
          field_r = (uf) null;
          if (param3 != 0) {
            return;
          } else {
            L0: {
              if (null != this.field_l) {
                this.field_l.a(true, param2, -67, (n) (this), param1);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == -108) {
                break L1;
              } else {
                this.field_x = -39;
                break L1;
              }
            }
            if (!this.b(param0, (byte) -105, param5, param2, param1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              this.field_v = param6;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("n.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        var4 = this.d((byte) -110);
        var5_int = 0;
        L0: while (true) {
          if (var4 < var5_int) {
            if (param0 == -81) {
              var5 = qb.a(100);
              if (var5 != null) {
                pc.field_b.a(7829367, var5, ac.field_e, em.field_l);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            this.a(-9532, param1, param2, var5_int);
            var5_int++;
            if (var6 == 0) {
              continue L0;
            } else {
              var5 = qb.a(100);
              if (var5 != null) {
                pc.field_b.a(7829367, var5, ac.field_e, em.field_l);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$4 = null;
        Object discarded$5 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 20720) {
                break L1;
              } else {
                this.field_k = 91;
                break L1;
              }
            }
            if (param1.containsKey(this)) {
              discarded$4 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param1.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("n.FC(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        boolean discarded$19 = false;
        boolean discarded$20 = false;
        boolean discarded$21 = false;
        boolean discarded$22 = false;
        boolean discarded$23 = false;
        boolean discarded$24 = false;
        boolean discarded$25 = false;
        boolean discarded$26 = false;
        boolean discarded$27 = false;
        boolean discarded$28 = false;
        boolean discarded$29 = false;
        boolean discarded$30 = false;
        boolean discarded$31 = false;
        boolean discarded$32 = false;
        boolean discarded$33 = false;
        boolean discarded$34 = false;
        boolean discarded$35 = false;
        boolean discarded$36 = false;
        boolean discarded$37 = false;
        int var5 = 0;
        int var7 = 0;
        jd var8 = null;
        jd var9 = null;
        jd var10 = null;
        jd var11 = null;
        jd var12 = null;
        jd var13 = null;
        var7 = HoldTheLine.field_D;
        this.a(param0, (n) (this), param1, (byte) -3);
        var5 = this.c((byte) -20) ? 1 : 0;
        if (!param2) {
          if (var5 != 0) {
            if (gg.field_J != 0) {
              this.e(117);
              if (var7 != 0) {
                L0: {
                  if (-1 == (vg.field_T ^ -1)) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      break L0;
                    } else {
                      discarded$19 = this.a(param0, (n) (this), vg.field_T, param1, rf.field_X, nc.field_g, -24898);
                      break L0;
                    }
                  }
                }
                if (-1 != (gg.field_J ^ -1)) {
                  L1: {
                    L2: {
                      if (this.a(param0, jb.field_U, param1, (n) (this), (byte) -108, lb.field_x, gg.field_J)) {
                        break L2;
                      } else {
                        if (var5 != 0) {
                          this.e(47);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          L3: {
                            if (0 != rd.field_f) {
                              break L3;
                            } else {
                              if (0 == qj.field_L) {
                                break L3;
                              } else {
                                this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                                var12 = ig.field_q;
                                if (var12 != null) {
                                  if (!(var12.field_t instanceof c)) {
                                    L4: {
                                      ig.field_q = null;
                                      if (!param3) {
                                        break L4;
                                      } else {
                                        discarded$20 = this.a(19, 'ￚ', (byte) -73);
                                        break L4;
                                      }
                                    }
                                    qj.field_L = rd.field_f;
                                    ba.a(this.f(0), 0);
                                    return param2;
                                  } else {
                                    ((c) ((Object) var12.field_t)).a(var12, (byte) -3, (pg) null);
                                    L5: {
                                      ig.field_q = null;
                                      if (!param3) {
                                        break L5;
                                      } else {
                                        discarded$21 = this.a(19, 'ￚ', (byte) -73);
                                        break L5;
                                      }
                                    }
                                    qj.field_L = rd.field_f;
                                    ba.a(this.f(0), 0);
                                    return param2;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          if (param3) {
                            discarded$22 = this.a(19, 'ￚ', (byte) -73);
                            qj.field_L = rd.field_f;
                            ba.a(this.f(0), 0);
                            return param2;
                          } else {
                            qj.field_L = rd.field_f;
                            ba.a(this.f(0), 0);
                            return param2;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L1;
                  }
                  L6: {
                    if (0 != rd.field_f) {
                      break L6;
                    } else {
                      if (0 == qj.field_L) {
                        break L6;
                      } else {
                        this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                        var13 = ig.field_q;
                        if (var13 != null) {
                          if (!(var13.field_t instanceof c)) {
                            ig.field_q = null;
                            if (param3) {
                              discarded$23 = this.a(19, 'ￚ', (byte) -73);
                              qj.field_L = rd.field_f;
                              ba.a(this.f(0), 0);
                              return param2;
                            } else {
                              qj.field_L = rd.field_f;
                              ba.a(this.f(0), 0);
                              return param2;
                            }
                          } else {
                            ((c) ((Object) var13.field_t)).a(var13, (byte) -3, (pg) null);
                            ig.field_q = null;
                            if (param3) {
                              discarded$24 = this.a(19, 'ￚ', (byte) -73);
                              qj.field_L = rd.field_f;
                              ba.a(this.f(0), 0);
                              return param2;
                            } else {
                              qj.field_L = rd.field_f;
                              ba.a(this.f(0), 0);
                              return param2;
                            }
                          }
                        } else {
                          if (param3) {
                            discarded$25 = this.a(19, 'ￚ', (byte) -73);
                            qj.field_L = rd.field_f;
                            ba.a(this.f(0), 0);
                            return param2;
                          } else {
                            qj.field_L = rd.field_f;
                            ba.a(this.f(0), 0);
                            return param2;
                          }
                        }
                      }
                    }
                  }
                  if (!param3) {
                    qj.field_L = rd.field_f;
                    ba.a(this.f(0), 0);
                    return param2;
                  } else {
                    discarded$26 = this.a(19, 'ￚ', (byte) -73);
                    qj.field_L = rd.field_f;
                    ba.a(this.f(0), 0);
                    return param2;
                  }
                } else {
                  L7: {
                    if (0 != rd.field_f) {
                      break L7;
                    } else {
                      if (0 == qj.field_L) {
                        break L7;
                      } else {
                        this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                        var11 = ig.field_q;
                        if (var11 != null) {
                          if (!(var11.field_t instanceof c)) {
                            ig.field_q = null;
                            break L7;
                          } else {
                            ((c) ((Object) var11.field_t)).a(var11, (byte) -3, (pg) null);
                            ig.field_q = null;
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    if (!param3) {
                      break L8;
                    } else {
                      discarded$27 = this.a(19, 'ￚ', (byte) -73);
                      break L8;
                    }
                  }
                  qj.field_L = rd.field_f;
                  ba.a(this.f(0), 0);
                  return param2;
                }
              } else {
                if (param3) {
                  discarded$28 = this.a(19, 'ￚ', (byte) -73);
                  qj.field_L = rd.field_f;
                  ba.a(this.f(0), 0);
                  return param2;
                } else {
                  qj.field_L = rd.field_f;
                  ba.a(this.f(0), 0);
                  return param2;
                }
              }
            } else {
              if (param3) {
                discarded$29 = this.a(19, 'ￚ', (byte) -73);
                qj.field_L = rd.field_f;
                ba.a(this.f(0), 0);
                return param2;
              } else {
                qj.field_L = rd.field_f;
                ba.a(this.f(0), 0);
                return param2;
              }
            }
          } else {
            if (param3) {
              discarded$30 = this.a(19, 'ￚ', (byte) -73);
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            } else {
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            }
          }
        } else {
          L9: {
            if (-1 == (vg.field_T ^ -1)) {
              break L9;
            } else {
              if (var5 == 0) {
                break L9;
              } else {
                discarded$31 = this.a(param0, (n) (this), vg.field_T, param1, rf.field_X, nc.field_g, -24898);
                break L9;
              }
            }
          }
          if (-1 != (gg.field_J ^ -1)) {
            L10: {
              L11: {
                if (this.a(param0, jb.field_U, param1, (n) (this), (byte) -108, lb.field_x, gg.field_J)) {
                  break L11;
                } else {
                  if (var5 != 0) {
                    this.e(47);
                    if (var7 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  } else {
                    L12: {
                      if (0 != rd.field_f) {
                        break L12;
                      } else {
                        if (0 == qj.field_L) {
                          break L12;
                        } else {
                          this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                          var9 = ig.field_q;
                          if (var9 != null) {
                            if (!(var9.field_t instanceof c)) {
                              ig.field_q = null;
                              break L12;
                            } else {
                              ((c) ((Object) var9.field_t)).a(var9, (byte) -3, (pg) null);
                              ig.field_q = null;
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      if (!param3) {
                        break L13;
                      } else {
                        discarded$32 = this.a(19, 'ￚ', (byte) -73);
                        break L13;
                      }
                    }
                    qj.field_L = rd.field_f;
                    ba.a(this.f(0), 0);
                    return param2;
                  }
                }
              }
              param2 = false;
              break L10;
            }
            L14: {
              if (0 != rd.field_f) {
                break L14;
              } else {
                if (0 == qj.field_L) {
                  break L14;
                } else {
                  this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                  var10 = ig.field_q;
                  if (var10 != null) {
                    if (!(var10.field_t instanceof c)) {
                      L15: {
                        ig.field_q = null;
                        if (!param3) {
                          break L15;
                        } else {
                          discarded$33 = this.a(19, 'ￚ', (byte) -73);
                          break L15;
                        }
                      }
                      qj.field_L = rd.field_f;
                      ba.a(this.f(0), 0);
                      return param2;
                    } else {
                      ((c) ((Object) var10.field_t)).a(var10, (byte) -3, (pg) null);
                      L16: {
                        ig.field_q = null;
                        if (!param3) {
                          break L16;
                        } else {
                          discarded$34 = this.a(19, 'ￚ', (byte) -73);
                          break L16;
                        }
                      }
                      qj.field_L = rd.field_f;
                      ba.a(this.f(0), 0);
                      return param2;
                    }
                  } else {
                    L17: {
                      if (!param3) {
                        break L17;
                      } else {
                        discarded$35 = this.a(19, 'ￚ', (byte) -73);
                        break L17;
                      }
                    }
                    qj.field_L = rd.field_f;
                    ba.a(this.f(0), 0);
                    return param2;
                  }
                }
              }
            }
            if (param3) {
              discarded$36 = this.a(19, 'ￚ', (byte) -73);
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            } else {
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            }
          } else {
            L18: {
              if (0 != rd.field_f) {
                break L18;
              } else {
                if (0 == qj.field_L) {
                  break L18;
                } else {
                  this.a(nc.field_g, (n) (this), param1, param0, (byte) -9, rf.field_X);
                  var8 = ig.field_q;
                  if (var8 != null) {
                    if (!(var8.field_t instanceof c)) {
                      ig.field_q = null;
                      break L18;
                    } else {
                      ((c) ((Object) var8.field_t)).a(var8, (byte) -3, (pg) null);
                      ig.field_q = null;
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
              }
            }
            L19: {
              if (!param3) {
                break L19;
              } else {
                discarded$37 = this.a(19, 'ￚ', (byte) -73);
                break L19;
              }
            }
            qj.field_L = rd.field_f;
            ba.a(this.f(0), 0);
            return param2;
          }
        }
    }

    final void a(Hashtable param0, int param1, boolean param2, StringBuilder param3) {
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        boolean discarded$17 = false;
        RuntimeException var5 = null;
        int var6 = 0;
        n var7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              discarded$9 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_k).append(",").append(this.field_o).append(" ").append(this.field_x).append("x").append(this.field_u);
              if (null == this.field_q) {
                break L1;
              } else {
                discarded$10 = param3.append(" text=\"").append(this.field_q).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_p) {
                discarded$11 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.c((byte) -20)) {
                discarded$12 = param3.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == this.field_l) {
                break L4;
              } else {
                L5: {
                  discarded$13 = param3.append(" renderer=");
                  if (this.field_l instanceof n) {
                    break L5;
                  } else {
                    discarded$14 = param3.append(this.field_l);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param3 = this.a(param1 + 1, (byte) -61, param0, param3);
                break L4;
              }
            }
            L6: {
              if (this.field_t != null) {
                L7: {
                  discarded$15 = param3.append(" listener=");
                  if (!(this.field_t instanceof n)) {
                    break L7;
                  } else {
                    param3 = this.a(1 + param1, (byte) 106, param0, param3);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                discarded$16 = param3.append(this.field_t);
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (param2) {
                break L8;
              } else {
                var7 = (n) null;
                discarded$17 = this.a((n) null, 89, (byte) -105, '8');
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("n.DC(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final void g(int param0) {
        if (param0 < 72) {
            return;
        }
        this.a(this.field_k, (byte) 122, this.field_o, this.field_u, this.field_x);
    }

    public final String toString() {
        return this.a(0, (byte) -67, new Hashtable(), new StringBuilder()).toString();
    }

    boolean a(n param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == -25823) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_t = (tb) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("n.NB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param2 == -78) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_m = 116;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("n.T(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    protected n() {
        this.field_y = 0;
        this.field_m = 0;
    }

    n(String param0, dh param1, tb param2) {
        RuntimeException runtimeException = null;
        vc var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        this.field_y = 0;
        this.field_m = 0;
        try {
          L0: {
            L1: {
              this.field_l = param1;
              this.field_t = param2;
              this.field_q = param0;
              if (!(this.field_l instanceof vc)) {
                break L1;
              } else {
                var4 = (vc) ((Object) this.field_l);
                this.field_x = var4.b((byte) -36, (n) (this));
                this.field_u = var4.a((n) (this), -95);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("n.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    n(int param0, int param1, int param2, int param3, dh param4, tb param5) {
        this.field_y = 0;
        this.field_m = 0;
        try {
            this.field_k = param0;
            this.field_l = param4;
            this.field_u = param3;
            this.field_o = param1;
            this.field_t = param5;
            this.field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "n.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = null;
        field_n = 0L;
    }
}
