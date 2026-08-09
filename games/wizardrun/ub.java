/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ub extends wl {
    static boolean field_m;
    int field_l;
    int field_i;
    bf field_w;
    boolean field_v;
    static kl field_x;
    String field_p;
    int field_q;
    int field_r;
    int field_n;
    String field_k;
    static si field_t;
    int field_o;
    ce field_s;
    int field_j;
    af field_u;

    final boolean a(int param0, int param1, char param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.d((byte) 53)) {
                break L1;
              } else {
                if (!this.a(param2, param1, (byte) -110, (ub) (this))) {
                  break L1;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var4_int = 96 % ((-42 - param0) / 45);
            var5 = param1;
            if (80 == var5) {
              stackIn_10_0 = this.a((ub) (this), 8);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var4), "ub.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
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
              if (null == param0) {
                break L1;
              } else {
                if (param0.length() < ca.field_f) {
                  break L1;
                } else {
                  if (param0.length() > af.field_e) {
                    break L1;
                  } else {
                    L2: {
                      if (param1 > 43) {
                        break L2;
                      } else {
                        ub.a(117, -70);
                        break L2;
                      }
                    }
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_10_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("ub.E(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 8) {
                break L1;
              } else {
                field_x = (kl) null;
                break L1;
              }
            }
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ub.J(");

            if (param0 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_l).append(" ").append(this.field_r).append("x").append(this.field_n);
              if (null == this.field_k) {
                break L1;
              } else {
                discarded$1 = param3.append(" text=\"").append(this.field_k).append('"');
                break L1;
              }
            }
            L2: {
              if (!this.field_v) {
                break L2;
              } else {
                discarded$2 = param3.append(" mouseover");
                break L2;
              }
            }
            L3: {
              if (!this.d((byte) 53)) {
                break L3;
              } else {
                discarded$3 = param3.append(" focused");
                break L3;
              }
            }
            L4: {
              if (this.field_w != null) {
                L5: {
                  discarded$4 = param3.append(" renderer=");
                  if (this.field_w instanceof ub) {
                    break L5;
                  } else {
                    discarded$5 = param3.append(this.field_w);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param3 = this.a(param2, (byte) 102, param1 - -1, param3);
                break L4;
              } else {
                break L4;
              }
            }
            if (param0 > 79) {
              L6: {
                if (null != this.field_s) {
                  L7: {
                    discarded$6 = param3.append(" listener=");
                    if (this.field_s instanceof ub) {
                      break L7;
                    } else {
                      discarded$7 = param3.append(this.field_s);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param3 = this.a(param2, (byte) 102, param1 + 1, param3);
                  break L6;
                } else {
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("ub.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_33_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 102) {
                break L1;
              } else {
                this.field_l = -40;
                break L1;
              }
            }
            L2: {
              if (!this.a(param3, param0, param2, true)) {
                break L2;
              } else {
                this.a(param1 + -2, param2, param0, param3);
                break L2;
              }
            }
            stackIn_7_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ub.U(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_16_2 + ')');
        }
        return stackIn_7_0;
    }

    boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -96) {
                break L1;
              } else {
                this.field_o = 26;
                break L1;
              }
            }
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ub.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(boolean param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var4_int = this.e((byte) 33);
              if (param0) {
                break L1;
              } else {
                this.field_s = (ce) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                if ((var4_int ^ -1) > (var5_int ^ -1)) {
                  break L3;
                } else {
                  this.a(param1, 0, var5_int, param2);
                  var5_int++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var5 = ne.b((byte) -50);
                if (null == var5) {
                  break L4;
                } else {
                  kc.field_H.a(ag.field_u, uc.field_a, var5, 91);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) runtimeException), "ub.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            stackIn_1_0 = this.a(new Hashtable(), (byte) 102, 0, new StringBuilder()).toString();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ub.toString()");
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1) {
        mg var2 = null;
        try {
            var2 = n.field_b;
            var2.c((byte) -96, param1);
            var2.b((byte) 11, 1);
            var2.b((byte) 11, param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ub.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 108) {
                break L1;
              } else {
                field_x = (kl) null;
                break L1;
              }
            }
            this.a(121, this.field_l, this.field_n, this.field_r, this.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ub.A(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_r = param3;
        if (param0 <= 108) {
            return;
        }
        try {
            this.field_o = param4;
            this.field_n = param2;
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ub.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(StringBuilder param0, Hashtable param1, int param2, boolean param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3) {
              if (param1.containsKey(this)) {
                discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                param1.put(this, this);
                stackIn_5_0 = 1;
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
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ub.W(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    void b(boolean param0) {
        try {
            if (param0) {
                this.a((StringBuilder) null, (Hashtable) null, -7, false);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ub.S(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param2 != param1) {
                break L1;
              } else {
                if (this.field_w != null) {
                  this.field_w.a(param0, param3, (ub) (this), true, true);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var5), "ub.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    String c(boolean param0) {
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.a(30, 86, -9, 25, -124);
                break L1;
              }
            }
            L2: {
              if (!this.field_v) {
                stackIn_7_0 = null;
                break L2;
              } else {
                stackIn_7_0 = this.field_p;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ub.V(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static boolean a(int param0, int[] param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_25_0 = 0;
        boolean stackIn_28_0 = false;
        boolean stackIn_30_0 = false;
        int stackIn_35_0 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        hb var4_ref_hb = null;
        int var4 = 0;
        int var5_int = 0;
        hb var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (wh.field_j == hi.field_l) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param0 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var2_long = d.a((byte) 35);
                        if ((ge.field_j ^ -1) == -1) {
                            statePc = 26;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (p.field_W >= 0) {
                            statePc = 26;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_ref_hb = (hb) ((Object) wg.field_c.b((byte) 125));
                        if (var4_ref_hb == null) {
                            statePc = 26;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var2_long ^ -1L) < (var4_ref_hb.field_p ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4_ref_hb.a(false);
                        gd.field_c = var4_ref_hb.field_l.length;
                        nk.field_N.field_m = 0;
                        var5_int = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((gd.field_c ^ -1) >= (var5_int ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        nk.field_N.field_k[var5_int] = var4_ref_hb.field_l[var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var7 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        l.field_P = wizardrun.field_E;
                        wizardrun.field_E = me.field_c;
                        me.field_c = ra.field_k;
                        ra.field_k = var4_ref_hb.field_j;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 26: {
                    try {
                        if (-1 >= (p.field_W ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        nk.field_N.field_m = 0;
                        stackIn_38_0 = hc.a(1, param0 ^ -28266);
                        stackIn_28_0 = stackIn_38_0;
                        if (var7 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_30_0 = stackIn_28_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!stackIn_30_0) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return stackIn_35_0 != 0;
                }
                case 36: {
                    try {
                        p.field_W = nk.field_N.m(45);
                        nk.field_N.field_m = 0;
                        gd.field_c = param1[p.field_W];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = bd.b(52);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0 != 0;
                }
                case 41: {
                    try {
                        if (0 != ge.field_j) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        l.field_P = wizardrun.field_E;
                        wizardrun.field_E = me.field_c;
                        me.field_c = ra.field_k;
                        ra.field_k = p.field_W;
                        p.field_W = -1;
                        stackIn_43_0 = 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0 != 0;
                }
                case 44: {
                    try {
                        var4 = ge.field_j;
                        if (0.0 != dc.field_j) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4 = (int)((double)var4 + oi.field_c.nextGaussian() * dc.field_j);
                        if (0 > var4) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var4 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var5 = new hb((long)var4 + var2_long, p.field_W, new byte[gd.field_c]);
                        var6 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((var6 ^ -1) <= (gd.field_c ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5.field_l[var6] = nk.field_N.field_k[var6];
                        var6++;
                        if (var7 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var7 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        wg.field_c.a(var5, false);
                        p.field_W = -1;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_62_0 = (RuntimeException) (var2);
                    stackIn_60_0 = stackIn_62_0;
                    stackIn_62_1 = new StringBuilder().append("ub.T(").append(param0).append(',');
                    stackIn_60_1 = stackIn_62_1;
                    if (param1 == null) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_63_2 = "{...}";
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackIn_63_2 = "null";
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    throw bd.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.a(-68, -40, -26, -46, (ub) null, -33);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 < param3 - -this.field_o) {
                  break L3;
                } else {
                  if (param0 < this.field_l + param4) {
                    break L3;
                  } else {
                    if (this.field_r + param3 - -this.field_o <= param1) {
                      break L3;
                    } else {
                      if ((this.field_n + (param4 + this.field_l) ^ -1) >= (param0 ^ -1)) {
                        break L3;
                      } else {
                        stackIn_16_0 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_16_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var6), "ub.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_16_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_q = param5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ub.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param5 + ')');
        }
    }

    public static void f(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_x = null;
              if (param0 == 31) {
                break L1;
              } else {
                field_x = (kl) null;
                break L1;
              }
            }
            field_t = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ub.AA(" + param0 + ')');
        }
    }

    int e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 23) {
                break L1;
              } else {
                ub.f((byte) 70);
                break L1;
              }
            }
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ub.I(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    boolean a(ub param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -23023) {
                break L1;
              } else {
                this.a((ub) null, 28, 74, 38, 125, 87, 3);
                break L1;
              }
            }
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("ub.M(");

            if (param0 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        boolean stackIn_48_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        pj var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          L0: {
            this.a(10000536, param3, param2, (ub) (this));
            if (param0 > 124) {
              L1: {
                L2: {
                  var5_int = this.d((byte) 53) ? 1 : 0;
                  if (param1) {
                    break L2;
                  } else {
                    if (var5_int == 0) {
                      break L1;
                    } else {
                      if (0 == w.field_c) {
                        break L1;
                      } else {
                        this.b(false);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L3: {
                  if ((gi.field_c ^ -1) == -1) {
                    break L3;
                  } else {
                    if (var5_int != 0) {
                      this.a((ub) (this), -23023, param2, gi.field_c, fi.field_B, param3, pg.field_n);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((w.field_c ^ -1) == -1) {
                    break L4;
                  } else {
                    L5: {
                      if (this.a(param2, (byte) 93, tf.field_e, param3, w.field_c, dh.field_b, (ub) (this))) {
                        break L5;
                      } else {
                        if (var5_int != 0) {
                          this.b(false);
                          if (var7 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    param1 = false;
                    break L4;
                  }
                }
                if (sh.field_c != 0) {
                  break L1;
                } else {
                  if (0 != il.field_c) {
                    this.a(param2, fi.field_B, param3, pg.field_n, (ub) (this), 0);
                    var6 = tg.field_h;
                    if (var6 == null) {
                      break L1;
                    } else {
                      L6: {
                        if (!(var6.field_s instanceof qg)) {
                          break L6;
                        } else {
                          ((qg) ((Object) var6.field_s)).a(var6, -98, (pd) null);
                          break L6;
                        }
                      }
                      tg.field_h = null;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              il.field_c = sh.field_c;
              d.a(this.c(false), 0);
              stackIn_48_0 = param1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var5), "ub.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_48_0;
        }
    }

    boolean d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 53) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ub.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.b(param5, param2, 0, param0, param3)) {
                break L1;
              } else {
                this.field_q = param4;
                break L1;
              }
            }
            var8_int = -45 % ((param1 - 12) / 36);
            stackIn_4_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("ub.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static void a(int param0, kl param1) {
        RuntimeException stackIn_367_0 = null;
        StringBuilder stackIn_367_1 = null;
        RuntimeException stackIn_368_0 = null;
        StringBuilder stackIn_368_1 = null;
        String stackIn_368_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              va.field_n = param1;
              var2 = uf.a("achievement_names,0", 107);
              if (null != var2) {
                nl.field_t[0] = nf.a((byte) 100, var2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2 = uf.a("achievement_names,1", 111);
              if (null == var2) {
                break L2;
              } else {
                nl.field_t[1] = nf.a((byte) 84, var2);
                break L2;
              }
            }
            L3: {
              var2 = uf.a("achievement_names,2", 122);
              if (var2 != null) {
                nl.field_t[2] = nf.a((byte) 94, var2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = uf.a("achievement_names,3", 111);
              if (null != var2) {
                nl.field_t[3] = nf.a((byte) 125, var2);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var2 = uf.a("achievement_names,4", 120);
              if (null != var2) {
                nl.field_t[4] = nf.a((byte) 113, var2);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var2 = uf.a("achievement_names,5", 122);
              if (null == var2) {
                break L6;
              } else {
                nl.field_t[5] = nf.a((byte) 114, var2);
                break L6;
              }
            }
            L7: {
              var2 = uf.a("achievement_names,6", 110);
              if (var2 != null) {
                nl.field_t[6] = nf.a((byte) 126, var2);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var2 = uf.a("achievement_names,7", 108);
              if (var2 != null) {
                nl.field_t[7] = nf.a((byte) 111, var2);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2 = uf.a("achievement_names,8", 119);
              if (null == var2) {
                break L9;
              } else {
                nl.field_t[8] = nf.a((byte) 86, var2);
                break L9;
              }
            }
            L10: {
              var2 = uf.a("achievement_names,9", 107);
              if (null == var2) {
                break L10;
              } else {
                nl.field_t[9] = nf.a((byte) 93, var2);
                break L10;
              }
            }
            L11: {
              var2 = uf.a("achievement_names,10", 123);
              if (null != var2) {
                nl.field_t[10] = nf.a((byte) 84, var2);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2 = uf.a("achievement_names,11", 119);
              if (var2 == null) {
                break L12;
              } else {
                nl.field_t[11] = nf.a((byte) 109, var2);
                break L12;
              }
            }
            L13: {
              var2 = uf.a("achievement_criteria,0", 120);
              if (null != var2) {
                mh.field_sb[0] = nf.a((byte) 124, var2);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2 = uf.a("achievement_criteria,1", 120);
              if (null == var2) {
                break L14;
              } else {
                mh.field_sb[1] = nf.a((byte) 91, var2);
                break L14;
              }
            }
            L15: {
              var2 = uf.a("achievement_criteria,2", 115);
              if (var2 == null) {
                break L15;
              } else {
                mh.field_sb[2] = nf.a((byte) 104, var2);
                break L15;
              }
            }
            L16: {
              var2 = uf.a("achievement_criteria,3", 122);
              if (null != var2) {
                mh.field_sb[3] = nf.a((byte) 112, var2);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              var2 = uf.a("achievement_criteria,4", 107);
              if (null == var2) {
                break L17;
              } else {
                mh.field_sb[4] = nf.a((byte) 112, var2);
                break L17;
              }
            }
            L18: {
              var2 = uf.a("achievement_criteria,5", 121);
              if (var2 == null) {
                break L18;
              } else {
                mh.field_sb[5] = nf.a((byte) 112, var2);
                break L18;
              }
            }
            L19: {
              var2 = uf.a("achievement_criteria,6", 126);
              if (null == var2) {
                break L19;
              } else {
                mh.field_sb[6] = nf.a((byte) 124, var2);
                break L19;
              }
            }
            L20: {
              var2 = uf.a("achievement_criteria,7", 120);
              if (null != var2) {
                mh.field_sb[7] = nf.a((byte) 88, var2);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var2 = uf.a("achievement_criteria,8", 107);
              if (null == var2) {
                break L21;
              } else {
                mh.field_sb[8] = nf.a((byte) 125, var2);
                break L21;
              }
            }
            L22: {
              var2 = uf.a("achievement_criteria,9", 115);
              if (null == var2) {
                break L22;
              } else {
                mh.field_sb[9] = nf.a((byte) 98, var2);
                break L22;
              }
            }
            L23: {
              var2 = uf.a("achievement_criteria,10", 112);
              if (var2 != null) {
                mh.field_sb[10] = nf.a((byte) 105, var2);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var2 = uf.a("achievement_criteria,11", 108);
              if (null == var2) {
                break L24;
              } else {
                mh.field_sb[11] = nf.a((byte) 109, var2);
                break L24;
              }
            }
            L25: {
              var2 = uf.a("captions,0", 121);
              if (var2 == null) {
                break L25;
              } else {
                l.field_O[0] = nf.a((byte) 88, var2);
                break L25;
              }
            }
            L26: {
              var2 = uf.a("captions,1", 121);
              if (null != var2) {
                l.field_O[1] = nf.a((byte) 91, var2);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2 = uf.a("captions,2", 111);
              if (null != var2) {
                l.field_O[2] = nf.a((byte) 94, var2);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2 = uf.a("captions,3", 118);
              if (var2 == null) {
                break L28;
              } else {
                l.field_O[3] = nf.a((byte) 112, var2);
                break L28;
              }
            }
            L29: {
              var2 = uf.a("gamename", 109);
              if (null == var2) {
                break L29;
              } else {
                vk.field_u = nf.a((byte) 127, var2);
                break L29;
              }
            }
            L30: {
              var2 = uf.a("openmenu", 116);
              if (null != var2) {
                sk.field_C = nf.a((byte) 114, var2);
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              var2 = uf.a("holdtocharge", 118);
              if (var2 != null) {
                oi.field_d = nf.a((byte) 120, var2);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2 = uf.a("firestars", 111);
              if (var2 != null) {
                kj.field_e = nf.a((byte) 103, var2);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              var2 = uf.a("jump", 113);
              if (var2 == null) {
                break L33;
              } else {
                qj.field_a = nf.a((byte) 115, var2);
                break L33;
              }
            }
            L34: {
              var2 = uf.a("movelr", 107);
              if (var2 != null) {
                og.field_P = nf.a((byte) 86, var2);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2 = uf.a("snd", 116);
              if (null != var2) {
                ae.field_b = nf.a((byte) 84, var2);
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              var2 = uf.a("mus", 113);
              if (null != var2) {
                jd.field_a = nf.a((byte) 93, var2);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              var2 = uf.a("musbar", 107);
              if (null != var2) {
                qk.field_i = nf.a((byte) 125, var2);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2 = uf.a("sndbar", 121);
              if (var2 != null) {
                qc.field_N = nf.a((byte) 125, var2);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              var2 = uf.a("holdxspace", 113);
              if (var2 != null) {
                ei.field_m = nf.a((byte) 112, var2);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2 = uf.a("presszup", 113);
              if (var2 == null) {
                break L40;
              } else {
                wb.field_a = nf.a((byte) 111, var2);
                break L40;
              }
            }
            L41: {
              var2 = uf.a("pressxspace", 112);
              if (var2 == null) {
                break L41;
              } else {
                ka.field_g = nf.a((byte) 112, var2);
                break L41;
              }
            }
            L42: {
              var2 = uf.a("gameover", 114);
              if (null != var2) {
                me.field_b = nf.a((byte) 95, var2);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2 = uf.a("starpower", 122);
              if (var2 != null) {
                bb.field_g = nf.a((byte) 91, var2);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              var2 = uf.a("instructiontextl", 111);
              if (null != var2) {
                nf.a((byte) 94, var2);
                break L44;
              } else {
                break L44;
              }
            }
            L45: {
              var2 = uf.a("instructiontextr", 117);
              if (null != var2) {
                nf.a((byte) 117, var2);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2 = uf.a("fgc", 127);
              if (var2 != null) {
                i.field_d = nf.a((byte) 113, var2);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2 = uf.a("andthat", 122);
              if (var2 == null) {
                break L47;
              } else {
                ug.field_P = nf.a((byte) 124, var2);
                break L47;
              }
            }
            L48: {
              var2 = uf.a("dothis", 123);
              if (var2 == null) {
                break L48;
              } else {
                ql.field_a = nf.a((byte) 99, var2);
                break L48;
              }
            }
            L49: {
              var2 = uf.a("todefeattheboss", 114);
              if (var2 != null) {
                jd.field_c = nf.a((byte) 126, var2);
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              var2 = uf.a("threecreatures", 117);
              if (var2 != null) {
                he.field_r = nf.a((byte) 122, var2);
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              var2 = uf.a("lastlevelbeforeboss", 108);
              if (var2 != null) {
                ab.field_b = nf.a((byte) 87, var2);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              var2 = uf.a("becareful", 113);
              if (null == var2) {
                break L52;
              } else {
                sd.field_e = nf.a((byte) 101, var2);
                break L52;
              }
            }
            L53: {
              var2 = uf.a("usingstarpowerisfun", 109);
              if (var2 == null) {
                break L53;
              } else {
                ag.field_w = nf.a((byte) 112, var2);
                break L53;
              }
            }
            L54: {
              var2 = uf.a("charrrrge", 117);
              if (null == var2) {
                break L54;
              } else {
                lc.field_c = nf.a((byte) 117, var2);
                break L54;
              }
            }
            L55: {
              var2 = uf.a("iseecolours", 108);
              if (var2 != null) {
                ld.field_a = nf.a((byte) 103, var2);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2 = uf.a("yummycrystals", 123);
              if (null != var2) {
                cd.field_h = nf.a((byte) 94, var2);
                break L56;
              } else {
                break L56;
              }
            }
            L57: {
              var2 = uf.a("crystalsgrow", 111);
              if (var2 == null) {
                break L57;
              } else {
                vl.field_a = nf.a((byte) 93, var2);
                break L57;
              }
            }
            L58: {
              var2 = uf.a("fallfrombelow", 118);
              if (var2 != null) {
                fa.field_d = nf.a((byte) 100, var2);
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              var2 = uf.a("fallfromabove", 120);
              if (var2 != null) {
                ta.field_f = nf.a((byte) 125, var2);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2 = uf.a("jumpwithz", 125);
              if (var2 != null) {
                pb.field_i = nf.a((byte) 111, var2);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2 = uf.a("pressattack", 127);
              if (null == var2) {
                break L61;
              } else {
                i.field_c = nf.a((byte) 127, var2);
                break L61;
              }
            }
            L62: {
              var2 = uf.a("usearrows", 119);
              if (null == var2) {
                break L62;
              } else {
                r.field_c = nf.a((byte) 115, var2);
                break L62;
              }
            }
            L63: {
              var2 = uf.a("pressenterorclick", 119);
              if (null == var2) {
                break L63;
              } else {
                ol.field_d = nf.a((byte) 84, var2);
                break L63;
              }
            }
            L64: {
              var2 = uf.a("logintoaccess", 124);
              if (null == var2) {
                break L64;
              } else {
                dj.field_c = nf.a((byte) 123, var2);
                break L64;
              }
            }
            L65: {
              var2 = uf.a("psfhs", 111);
              if (var2 == null) {
                break L65;
              } else {
                lf.field_a = nf.a((byte) 91, var2);
                break L65;
              }
            }
            L66: {
              var2 = uf.a("hssu", 121);
              if (var2 == null) {
                break L66;
              } else {
                rd.field_a = nf.a((byte) 119, var2);
                break L66;
              }
            }
            L67: {
              var2 = uf.a("hs4", 123);
              if (var2 != null) {
                ai.field_s = nf.a((byte) 104, var2);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2 = uf.a("hs3", 125);
              if (null != var2) {
                af.field_b = nf.a((byte) 124, var2);
                break L68;
              } else {
                break L68;
              }
            }
            L69: {
              var2 = uf.a("hs2", 125);
              if (null == var2) {
                break L69;
              } else {
                ef.field_G = nf.a((byte) 103, var2);
                break L69;
              }
            }
            L70: {
              var2 = uf.a("hs1", 110);
              if (var2 == null) {
                break L70;
              } else {
                pd.field_G = nf.a((byte) 112, var2);
                break L70;
              }
            }
            L71: {
              var2 = uf.a("compltex", 121);
              if (null == var2) {
                break L71;
              } else {
                q.field_l = nf.a((byte) 119, var2);
                break L71;
              }
            }
            L72: {
              var2 = uf.a("lastscor", 120);
              if (null != var2) {
                nf.a((byte) 86, var2);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              var2 = uf.a("scrtex", 119);
              if (null == var2) {
                break L73;
              } else {
                qj.field_f = nf.a((byte) 124, var2);
                break L73;
              }
            }
            L74: {
              var2 = uf.a("worldstage", 124);
              if (var2 == null) {
                break L74;
              } else {
                nj.field_p = nf.a((byte) 124, var2);
                break L74;
              }
            }
            var2 = uf.a("nametex", 113);
            if (param0 < -33) {
              L75: {
                if (var2 == null) {
                  break L75;
                } else {
                  bb.field_l = nf.a((byte) 90, var2);
                  break L75;
                }
              }
              L76: {
                var2 = uf.a("requirementshidden", 127);
                if (null != var2) {
                  f.field_f = nf.a((byte) 114, var2);
                  break L76;
                } else {
                  break L76;
                }
              }
              L77: {
                var2 = uf.a("loginn", 122);
                if (null != var2) {
                  ue.field_b = nf.a((byte) 100, var2);
                  break L77;
                } else {
                  break L77;
                }
              }
              L78: {
                var2 = uf.a("levelonly", 121);
                if (var2 == null) {
                  break L78;
                } else {
                  oj.field_a = nf.a((byte) 117, var2);
                  break L78;
                }
              }
              L79: {
                var2 = uf.a("levelnotyet", 110);
                if (var2 == null) {
                  break L79;
                } else {
                  si.field_g = nf.a((byte) 89, var2);
                  break L79;
                }
              }
              L80: {
                var2 = uf.a("worldspace", 110);
                if (null != var2) {
                  qj.field_c = nf.a((byte) 109, var2);
                  break L80;
                } else {
                  break L80;
                }
              }
              L81: {
                var2 = uf.a("thedem", 114);
                if (null == var2) {
                  break L81;
                } else {
                  kk.field_vb = nf.a((byte) 85, var2);
                  break L81;
                }
              }
              L82: {
                var2 = uf.a("theice", 120);
                if (null != var2) {
                  wi.field_H = nf.a((byte) 98, var2);
                  break L82;
                } else {
                  break L82;
                }
              }
              L83: {
                var2 = uf.a("thetro", 109);
                if (var2 != null) {
                  de.field_c = nf.a((byte) 99, var2);
                  break L83;
                } else {
                  break L83;
                }
              }
              L84: {
                var2 = uf.a("thepir", 109);
                if (null == var2) {
                  break L84;
                } else {
                  ra.field_l = nf.a((byte) 86, var2);
                  break L84;
                }
              }
              L85: {
                var2 = uf.a("thebea", 117);
                if (var2 == null) {
                  break L85;
                } else {
                  u.field_o = nf.a((byte) 89, var2);
                  break L85;
                }
              }
              L86: {
                var2 = uf.a("thevil", 109);
                if (null != var2) {
                  aa.field_kb = nf.a((byte) 127, var2);
                  break L86;
                } else {
                  break L86;
                }
              }
              L87: {
                var2 = uf.a("worldselect", 116);
                if (null == var2) {
                  break L87;
                } else {
                  uh.field_b = nf.a((byte) 95, var2);
                  break L87;
                }
              }
              L88: {
                var2 = uf.a("scorecolon", 115);
                if (var2 == null) {
                  break L88;
                } else {
                  tf.field_d = nf.a((byte) 111, var2);
                  break L88;
                }
              }
              L89: {
                var2 = uf.a("livescolon", 119);
                if (var2 == null) {
                  break L89;
                } else {
                  hh.field_J = nf.a((byte) 96, var2);
                  break L89;
                }
              }
              L90: {
                var2 = uf.a("tut6", 118);
                if (null != var2) {
                  nf.a((byte) 97, var2);
                  break L90;
                } else {
                  break L90;
                }
              }
              L91: {
                var2 = uf.a("tut5", 110);
                if (null == var2) {
                  break L91;
                } else {
                  nf.a((byte) 122, var2);
                  break L91;
                }
              }
              L92: {
                var2 = uf.a("tut4", 107);
                if (var2 != null) {
                  nf.a((byte) 109, var2);
                  break L92;
                } else {
                  break L92;
                }
              }
              L93: {
                var2 = uf.a("tut3", 113);
                if (var2 != null) {
                  nf.a((byte) 125, var2);
                  break L93;
                } else {
                  break L93;
                }
              }
              L94: {
                var2 = uf.a("tut2", 113);
                if (var2 == null) {
                  break L94;
                } else {
                  nf.a((byte) 123, var2);
                  break L94;
                }
              }
              L95: {
                var2 = uf.a("tut1", 126);
                if (null != var2) {
                  nf.a((byte) 106, var2);
                  break L95;
                } else {
                  break L95;
                }
              }
              L96: {
                var2 = uf.a("pressentertocont", 116);
                if (var2 == null) {
                  break L96;
                } else {
                  nf.a((byte) 127, var2);
                  break L96;
                }
              }
              L97: {
                var2 = uf.a("worldstage1", 120);
                if (var2 == null) {
                  break L97;
                } else {
                  cc.field_b = nf.a((byte) 125, var2);
                  break L97;
                }
              }
              L98: {
                var2 = uf.a("tut", 109);
                if (var2 != null) {
                  l.field_Q = nf.a((byte) 96, var2);
                  break L98;
                } else {
                  break L98;
                }
              }
              L99: {
                var2 = uf.a("introtex", 114);
                if (var2 == null) {
                  break L99;
                } else {
                  ef.field_F = nf.a((byte) 84, var2);
                  break L99;
                }
              }
              L100: {
                var2 = uf.a("stagecolon", 119);
                if (var2 == null) {
                  break L100;
                } else {
                  eh.field_i = nf.a((byte) 127, var2);
                  break L100;
                }
              }
              L101: {
                var2 = uf.a("worldcolon", 113);
                if (var2 != null) {
                  wg.field_f = nf.a((byte) 110, var2);
                  break L101;
                } else {
                  break L101;
                }
              }
              L102: {
                var2 = uf.a("keycode_playerattack", 121);
                if (var2 != null) {
                  hh.field_S = 255 & var2[0];
                  break L102;
                } else {
                  break L102;
                }
              }
              L103: {
                var2 = uf.a("keycode_playerjump", 113);
                if (null == var2) {
                  break L103;
                } else {
                  nf.field_d = var2[0] & 255;
                  break L103;
                }
              }
              va.field_n = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L104: {
            var2_ref = decompiledCaughtException;
            stackIn_367_0 = (RuntimeException) (var2_ref);

            stackIn_367_1 = new StringBuilder().append("ub.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_368_0 = (RuntimeException) ((Object) stackIn_367_0);
              stackIn_368_1 = (StringBuilder) ((Object) stackIn_367_1);
              stackIn_368_2 = "null";
              break L104;
            } else {
              stackIn_368_0 = (RuntimeException) ((Object) stackIn_367_0);
              stackIn_368_1 = (StringBuilder) ((Object) stackIn_367_1);
              stackIn_368_2 = "{...}";
              break L104;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_368_0), stackIn_368_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, ub param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.b(fi.field_B, pg.field_n, 0, param2, param1) ? 1 : 0;
              if (param0 == 10000536) {
                break L1;
              } else {
                ub.a(101, (kl) null);
                break L1;
              }
            }
            L2: {
              stackIn_6_0 = this.field_v;

              if (var5_int != 0) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              if ((stackIn_7_0 ? 1 : 0) == stackIn_7_1) {
                this.field_v = var5_int != 0;
                if (this.field_s == null) {
                  break L3;
                } else {
                  if (this.field_s instanceof ij) {
                    ((ij) ((Object) this.field_s)).a(var5_int != 0, -12361, (ub) (this));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (runtimeException);

            stackIn_20_1 = new StringBuilder().append("ub.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    ub(String param0, ce param1) {
        this(param0, kc.field_H.field_u, param1);
    }

    protected ub() {
        this.field_i = 0;
        this.field_j = 0;
    }

    ub(String param0, bf param1, ce param2) {
        RuntimeException runtimeException = null;
        qe var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_i = 0;
        this.field_j = 0;
        try {
          L0: {
            L1: {
              this.field_s = param2;
              this.field_k = param0;
              this.field_w = param1;
              if (!(this.field_w instanceof qe)) {
                break L1;
              } else {
                var4 = (qe) ((Object) this.field_w);
                this.field_r = var4.b((byte) 95, (ub) (this));
                this.field_n = var4.a((byte) 118, (ub) (this));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ub.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_16_2 + ')');
        }
    }

    ub(int param0, int param1, int param2, int param3, bf param4, ce param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_i = 0;
        this.field_j = 0;
        try {
          L0: {
            this.field_w = param4;
            this.field_s = param5;
            this.field_o = param0;
            this.field_n = param3;
            this.field_r = param2;
            this.field_l = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ub.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ')');
        }
    }

    static {
    }
}
