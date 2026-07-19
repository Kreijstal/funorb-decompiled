/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ae extends vg {
    bja field_l;
    int field_p;
    boolean field_f;
    int field_m;
    String field_o;
    int field_n;
    String field_q;
    int field_t;
    static int field_g;
    static String field_k;
    int field_s;
    int field_i;
    int field_j;
    qc field_h;
    isa field_r;

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$8 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_i).append(",").append(this.field_n).append(" ").append(this.field_m).append("x").append(this.field_p);
              if (this.field_o == null) {
                break L1;
              } else {
                discarded$9 = param1.append(" text=\"").append(this.field_o).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_f) {
                discarded$10 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.b((byte) -34)) {
                discarded$11 = param1.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != this.field_r) {
                L5: {
                  discarded$12 = param1.append(" renderer=");
                  if (!(this.field_r instanceof ae)) {
                    break L5;
                  } else {
                    param1 = this.a(param3 + 1, param2, param1, 0);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                discarded$13 = param1.append(this.field_r);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (this.field_h == null) {
                break L6;
              } else {
                L7: {
                  discarded$14 = param1.append(" listener=");
                  if (this.field_h instanceof ae) {
                    break L7;
                  } else {
                    discarded$15 = param1.append(this.field_h);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param1 = this.a(1 + param3, param2, param1, 0);
                break L6;
              }
            }
            L8: {
              if (param0 == 1) {
                break L8;
              } else {
                field_g = 99;
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
            stackOut_22_1 = new StringBuilder().append("ae.GA(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
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
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        var6 = -82 / ((-38 - param2) / 50);
        if (param0 >= param1 - -this.field_i) {
          if (this.field_n + param4 <= param3) {
            if (param0 < this.field_m + param1 + this.field_i) {
              if (param3 >= this.field_p + (param4 - -this.field_n)) {
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

    final void c(byte param0) {
        int var2 = -39 / ((77 - param0) / 44);
        this.a((byte) -31, this.field_m, this.field_p, this.field_i, this.field_n);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var10 = null;
        String var11 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var4 = this.a(false);
        var5 = 0;
        L0: while (true) {
          if (var4 < var5) {
            if (param0 >= -23) {
              L1: {
                this.field_m = -42;
                var10 = of.a(1);
                if (var10 != null) {
                  afa.field_c.a(var10, vf.field_f, true, mi.field_f);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var11 = of.a(1);
                if (var11 != null) {
                  afa.field_c.a(var11, vf.field_f, true, mi.field_f);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            this.a(param2, param1, 0, var5);
            var5++;
            if (var6 == 0) {
              continue L0;
            } else {
              L3: {
                var7 = of.a(1);
                if (var7 != null) {
                  afa.field_c.a(var7, vf.field_f, true, mi.field_f);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
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
            if (param3) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_k = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("ae.P(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void f(byte param0) {
        int var2 = -8 / ((-38 - param0) / 60);
    }

    boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param6 == -1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("ae.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(byte param0, int param1, char param2) {
        int var4 = 0;
        if (this.b((byte) -34)) {
          if (!this.a(param2, (ae) (this), param1, true)) {
            var4 = param1;
            if (-81 == (var4 ^ -1)) {
              return this.a((ae) (this), false);
            } else {
              var4 = 17 / ((38 - param0) / 57);
              return false;
            }
          } else {
            return true;
          }
        } else {
          var4 = param1;
          if (-81 == (var4 ^ -1)) {
            return this.a((ae) (this), false);
          } else {
            var4 = 17 / ((38 - param0) / 57);
            return false;
          }
        }
    }

    final boolean a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        Object discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5_int = -45 % ((-63 - param0) / 44);
            if (!param2.containsKey(this)) {
              discarded$4 = param2.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("ae.IA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    ae(String param0, qc param1) {
        this(param0, afa.field_c.field_k, param1);
    }

    boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ae.S(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    int a(boolean param0) {
        if (param0) {
            return 28;
        }
        return 0;
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        this.field_i = param3;
        this.field_n = param4;
        this.field_p = param2;
        this.field_m = param1;
        if (param0 != -31) {
            discarded$0 = this.a((byte) 27, -25, '﾿');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == param3) {
            if (this.field_r == null) {
                return;
            }
            this.field_r.a((ae) (this), param0, 16777215, param1, true);
        }
    }

    boolean b(byte param0) {
        if (param0 != -34) {
            this.field_p = 89;
            return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
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
              if (param0 >= 70) {
                break L1;
              } else {
                this.field_f = false;
                break L1;
              }
            }
            if (!this.a(param6, param1, 47, param3, param2)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              this.field_s = param4;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("ae.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    void a(int param0, int param1, ae param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 2097152) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            L2: {
              var5_int = this.a(jba.field_j, param0, -105, sta.field_B, param3) ? 1 : 0;
              if (this.field_f) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5_int != 0) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L3;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L3;
              }
            }
            L4: {
              if (stackIn_8_0 != stackIn_8_1) {
                L5: {
                  stackOut_10_0 = this;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var5_int == 0) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L5;
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L5;
                  }
                }
                ((ae) (this)).field_f = stackIn_13_1 != 0;
                if (this.field_h == null) {
                  break L4;
                } else {
                  if (!(this.field_h instanceof ar)) {
                    break L4;
                  } else {
                    ((ar) ((Object) this.field_h)).a(var5_int != 0, (byte) 113, (ae) (this));
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("ae.A(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (this.a((byte) -122, param0, param1, param2)) {
                this.a(1, param2, param1, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 == 0) {
              stackOut_6_0 = (StringBuilder) (param2);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = (StringBuilder) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("ae.R(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void e(byte param0) {
        int var1 = -111 / ((param0 - 81) / 44);
        field_k = null;
    }

    String d(byte param0) {
        int var2 = 7 % ((param0 - -58) / 60);
        if (!this.field_f) {
            return null;
        }
        return this.field_q;
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        if (param2 == 6100) {
          L0: {
            stackOut_2_0 = qp.a(param0, (byte) 101, param1);
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (0 == (393216 & param0)) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          if (stackIn_5_0 | stackIn_5_1 == 0) {
            if (!vua.e(param0, param1, 13650)) {
              if (tia.b(param1, param2 + -29503, param0)) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        try {
            if (param0 != 59) {
                this.field_q = (String) null;
            }
            this.field_s = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ae.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        boolean discarded$1 = false;
        int var5 = 0;
        int var7 = 0;
        vp var8 = null;
        vp var9 = null;
        vp var10 = null;
        vp var11 = null;
        vp var12 = null;
        vp var13 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        this.a(param2, 2097152, (ae) (this), param0);
        var5 = this.b((byte) -34) ? 1 : 0;
        if (!param1) {
          L0: {
            if (var5 == 0) {
              break L0;
            } else {
              if (-1 != (hf.field_b ^ -1)) {
                this.f((byte) 119);
                break L0;
              } else {
                kca.field_f = ksa.field_p;
                fea.a((byte) -33, this.d((byte) 68));
                if (param3 <= -86) {
                  return param1;
                } else {
                  this.c((byte) -121);
                  return param1;
                }
              }
            }
          }
          kca.field_f = ksa.field_p;
          fea.a((byte) -33, this.d((byte) 68));
          if (param3 <= -86) {
            return param1;
          } else {
            this.c((byte) -121);
            return param1;
          }
        } else {
          if (0 != pg.field_y) {
            if (var5 != 0) {
              L1: {
                discarded$1 = this.a(pg.field_y, param0, param2, sta.field_B, (ae) (this), jba.field_j, -1);
                if (hf.field_b != 0) {
                  L2: {
                    if (this.a(97, param2, param0, lba.field_p, hf.field_b, (ae) (this), jm.field_m)) {
                      break L2;
                    } else {
                      if (var5 != 0) {
                        this.f((byte) -98);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        L3: {
                          if (ksa.field_p != 0) {
                            break L3;
                          } else {
                            if (-1 == (kca.field_f ^ -1)) {
                              break L3;
                            } else {
                              L4: {
                                this.a((byte) 59, (ae) (this), sta.field_B, param2, param0, jba.field_j);
                                var12 = ava.field_f;
                                if (var12 != null) {
                                  if (!(var12.field_h instanceof kja)) {
                                    ava.field_f = null;
                                    break L4;
                                  } else {
                                    ((kja) ((Object) var12.field_h)).a(var12, (byte) 59, (k) null);
                                    ava.field_f = null;
                                    break L4;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                              if (var7 == 0) {
                                break L3;
                              } else {
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  if (-1 != (hf.field_b ^ -1)) {
                                    this.f((byte) 119);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L5: {
                          kca.field_f = ksa.field_p;
                          fea.a((byte) -33, this.d((byte) 68));
                          if (param3 <= -86) {
                            break L5;
                          } else {
                            this.c((byte) -121);
                            break L5;
                          }
                        }
                        return param1;
                      }
                    }
                  }
                  param1 = false;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (ksa.field_p == 0) {
                if (-1 != (kca.field_f ^ -1)) {
                  this.a((byte) 59, (ae) (this), sta.field_B, param2, param0, jba.field_j);
                  var13 = ava.field_f;
                  if (var13 != null) {
                    if (!(var13.field_h instanceof kja)) {
                      ava.field_f = null;
                      if (var7 != 0) {
                        if (var5 != 0) {
                          if (-1 != (hf.field_b ^ -1)) {
                            this.f((byte) 119);
                            kca.field_f = ksa.field_p;
                            fea.a((byte) -33, this.d((byte) 68));
                            if (param3 <= -86) {
                              return param1;
                            } else {
                              this.c((byte) -121);
                              return param1;
                            }
                          } else {
                            kca.field_f = ksa.field_p;
                            fea.a((byte) -33, this.d((byte) 68));
                            if (param3 > -86) {
                              this.c((byte) -121);
                              return param1;
                            } else {
                              return param1;
                            }
                          }
                        } else {
                          kca.field_f = ksa.field_p;
                          fea.a((byte) -33, this.d((byte) 68));
                          if (param3 > -86) {
                            this.c((byte) -121);
                            return param1;
                          } else {
                            return param1;
                          }
                        }
                      } else {
                        kca.field_f = ksa.field_p;
                        fea.a((byte) -33, this.d((byte) 68));
                        if (param3 > -86) {
                          this.c((byte) -121);
                          return param1;
                        } else {
                          return param1;
                        }
                      }
                    } else {
                      ((kja) ((Object) var13.field_h)).a(var13, (byte) 59, (k) null);
                      L6: {
                        ava.field_f = null;
                        if (var7 == 0) {
                          break L6;
                        } else {
                          if (var5 == 0) {
                            break L6;
                          } else {
                            if (-1 != (hf.field_b ^ -1)) {
                              this.f((byte) 119);
                              break L6;
                            } else {
                              kca.field_f = ksa.field_p;
                              fea.a((byte) -33, this.d((byte) 68));
                              if (param3 <= -86) {
                                return param1;
                              } else {
                                this.c((byte) -121);
                                return param1;
                              }
                            }
                          }
                        }
                      }
                      kca.field_f = ksa.field_p;
                      fea.a((byte) -33, this.d((byte) 68));
                      if (param3 <= -86) {
                        return param1;
                      } else {
                        this.c((byte) -121);
                        return param1;
                      }
                    }
                  } else {
                    L7: {
                      if (var7 == 0) {
                        break L7;
                      } else {
                        if (var5 == 0) {
                          break L7;
                        } else {
                          if (-1 != (hf.field_b ^ -1)) {
                            this.f((byte) 119);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    kca.field_f = ksa.field_p;
                    fea.a((byte) -33, this.d((byte) 68));
                    if (param3 > -86) {
                      this.c((byte) -121);
                      return param1;
                    } else {
                      return param1;
                    }
                  }
                } else {
                  kca.field_f = ksa.field_p;
                  fea.a((byte) -33, this.d((byte) 68));
                  if (param3 > -86) {
                    this.c((byte) -121);
                    return param1;
                  } else {
                    return param1;
                  }
                }
              } else {
                kca.field_f = ksa.field_p;
                fea.a((byte) -33, this.d((byte) 68));
                if (param3 > -86) {
                  this.c((byte) -121);
                  return param1;
                } else {
                  return param1;
                }
              }
            } else {
              L8: {
                if (hf.field_b != 0) {
                  L9: {
                    if (this.a(97, param2, param0, lba.field_p, hf.field_b, (ae) (this), jm.field_m)) {
                      break L9;
                    } else {
                      if (var5 != 0) {
                        this.f((byte) -98);
                        if (var7 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      } else {
                        L10: {
                          if (ksa.field_p != 0) {
                            break L10;
                          } else {
                            if (-1 == (kca.field_f ^ -1)) {
                              break L10;
                            } else {
                              L11: {
                                this.a((byte) 59, (ae) (this), sta.field_B, param2, param0, jba.field_j);
                                var10 = ava.field_f;
                                if (var10 != null) {
                                  if (!(var10.field_h instanceof kja)) {
                                    ava.field_f = null;
                                    break L11;
                                  } else {
                                    ((kja) ((Object) var10.field_h)).a(var10, (byte) 59, (k) null);
                                    ava.field_f = null;
                                    break L11;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              if (var7 == 0) {
                                break L10;
                              } else {
                                if (var5 == 0) {
                                  break L10;
                                } else {
                                  if (-1 != (hf.field_b ^ -1)) {
                                    this.f((byte) 119);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L12: {
                          kca.field_f = ksa.field_p;
                          fea.a((byte) -33, this.d((byte) 68));
                          if (param3 <= -86) {
                            break L12;
                          } else {
                            this.c((byte) -121);
                            break L12;
                          }
                        }
                        return param1;
                      }
                    }
                  }
                  param1 = false;
                  break L8;
                } else {
                  break L8;
                }
              }
              L13: {
                if (ksa.field_p != 0) {
                  break L13;
                } else {
                  if (-1 == (kca.field_f ^ -1)) {
                    break L13;
                  } else {
                    this.a((byte) 59, (ae) (this), sta.field_B, param2, param0, jba.field_j);
                    var11 = ava.field_f;
                    if (var11 != null) {
                      if (!(var11.field_h instanceof kja)) {
                        L14: {
                          ava.field_f = null;
                          if (var7 == 0) {
                            break L14;
                          } else {
                            if (var5 == 0) {
                              break L14;
                            } else {
                              if (-1 != (hf.field_b ^ -1)) {
                                this.f((byte) 119);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L15: {
                          kca.field_f = ksa.field_p;
                          fea.a((byte) -33, this.d((byte) 68));
                          if (param3 <= -86) {
                            break L15;
                          } else {
                            this.c((byte) -121);
                            break L15;
                          }
                        }
                        return param1;
                      } else {
                        ((kja) ((Object) var11.field_h)).a(var11, (byte) 59, (k) null);
                        L16: {
                          ava.field_f = null;
                          if (var7 == 0) {
                            break L16;
                          } else {
                            if (var5 == 0) {
                              break L16;
                            } else {
                              if (-1 != (hf.field_b ^ -1)) {
                                this.f((byte) 119);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        L17: {
                          kca.field_f = ksa.field_p;
                          fea.a((byte) -33, this.d((byte) 68));
                          if (param3 <= -86) {
                            break L17;
                          } else {
                            this.c((byte) -121);
                            break L17;
                          }
                        }
                        return param1;
                      }
                    } else {
                      L18: {
                        if (var7 == 0) {
                          break L18;
                        } else {
                          if (var5 == 0) {
                            break L18;
                          } else {
                            if (-1 != (hf.field_b ^ -1)) {
                              this.f((byte) 119);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      L19: {
                        kca.field_f = ksa.field_p;
                        fea.a((byte) -33, this.d((byte) 68));
                        if (param3 <= -86) {
                          break L19;
                        } else {
                          this.c((byte) -121);
                          break L19;
                        }
                      }
                      return param1;
                    }
                  }
                }
              }
              kca.field_f = ksa.field_p;
              fea.a((byte) -33, this.d((byte) 68));
              if (param3 > -86) {
                this.c((byte) -121);
                return param1;
              } else {
                return param1;
              }
            }
          } else {
            L20: {
              if (hf.field_b != 0) {
                L21: {
                  if (this.a(97, param2, param0, lba.field_p, hf.field_b, (ae) (this), jm.field_m)) {
                    break L21;
                  } else {
                    if (var5 != 0) {
                      this.f((byte) -98);
                      if (var7 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    } else {
                      L22: {
                        if (ksa.field_p != 0) {
                          break L22;
                        } else {
                          if (-1 == (kca.field_f ^ -1)) {
                            break L22;
                          } else {
                            L23: {
                              this.a((byte) 59, (ae) (this), sta.field_B, param2, param0, jba.field_j);
                              var8 = ava.field_f;
                              if (var8 != null) {
                                if (!(var8.field_h instanceof kja)) {
                                  ava.field_f = null;
                                  break L23;
                                } else {
                                  ((kja) ((Object) var8.field_h)).a(var8, (byte) 59, (k) null);
                                  ava.field_f = null;
                                  break L23;
                                }
                              } else {
                                break L23;
                              }
                            }
                            if (var7 == 0) {
                              break L22;
                            } else {
                              if (var5 == 0) {
                                break L22;
                              } else {
                                if (-1 != (hf.field_b ^ -1)) {
                                  this.f((byte) 119);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                      }
                      L24: {
                        kca.field_f = ksa.field_p;
                        fea.a((byte) -33, this.d((byte) 68));
                        if (param3 <= -86) {
                          break L24;
                        } else {
                          this.c((byte) -121);
                          break L24;
                        }
                      }
                      return param1;
                    }
                  }
                }
                param1 = false;
                break L20;
              } else {
                break L20;
              }
            }
            L25: {
              if (ksa.field_p != 0) {
                break L25;
              } else {
                if (-1 == (kca.field_f ^ -1)) {
                  break L25;
                } else {
                  this.a((byte) 59, (ae) (this), sta.field_B, param2, param0, jba.field_j);
                  var9 = ava.field_f;
                  if (var9 != null) {
                    if (!(var9.field_h instanceof kja)) {
                      L26: {
                        ava.field_f = null;
                        if (var7 == 0) {
                          break L26;
                        } else {
                          if (var5 == 0) {
                            break L26;
                          } else {
                            if (-1 != (hf.field_b ^ -1)) {
                              this.f((byte) 119);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                      L27: {
                        kca.field_f = ksa.field_p;
                        fea.a((byte) -33, this.d((byte) 68));
                        if (param3 <= -86) {
                          break L27;
                        } else {
                          this.c((byte) -121);
                          break L27;
                        }
                      }
                      return param1;
                    } else {
                      ((kja) ((Object) var9.field_h)).a(var9, (byte) 59, (k) null);
                      L28: {
                        ava.field_f = null;
                        if (var7 == 0) {
                          break L28;
                        } else {
                          if (var5 == 0) {
                            break L28;
                          } else {
                            if (-1 != (hf.field_b ^ -1)) {
                              this.f((byte) 119);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                      L29: {
                        kca.field_f = ksa.field_p;
                        fea.a((byte) -33, this.d((byte) 68));
                        if (param3 <= -86) {
                          break L29;
                        } else {
                          this.c((byte) -121);
                          break L29;
                        }
                      }
                      return param1;
                    }
                  } else {
                    L30: {
                      if (var7 == 0) {
                        break L30;
                      } else {
                        if (var5 == 0) {
                          break L30;
                        } else {
                          if (-1 != (hf.field_b ^ -1)) {
                            this.f((byte) 119);
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    L31: {
                      kca.field_f = ksa.field_p;
                      fea.a((byte) -33, this.d((byte) 68));
                      if (param3 <= -86) {
                        break L31;
                      } else {
                        this.c((byte) -121);
                        break L31;
                      }
                    }
                    return param1;
                  }
                }
              }
            }
            kca.field_f = ksa.field_p;
            fea.a((byte) -33, this.d((byte) 68));
            if (param3 > -86) {
              this.c((byte) -121);
              return param1;
            } else {
              return param1;
            }
          }
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    protected ae() {
        this.field_t = 0;
        this.field_j = 0;
    }

    ae(String param0, isa param1, qc param2) {
        RuntimeException runtimeException = null;
        oaa var4 = null;
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
        this.field_t = 0;
        this.field_j = 0;
        try {
          L0: {
            L1: {
              this.field_r = param1;
              this.field_o = param0;
              this.field_h = param2;
              if (!(this.field_r instanceof oaa)) {
                break L1;
              } else {
                var4 = (oaa) ((Object) this.field_r);
                this.field_m = var4.a(3459, (ae) (this));
                this.field_p = var4.b((byte) -79, (ae) (this));
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
            stackOut_4_1 = new StringBuilder().append("ae.<init>(");
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
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    ae(int param0, int param1, int param2, int param3, isa param4, qc param5) {
        this.field_t = 0;
        this.field_j = 0;
        try {
            this.field_i = param0;
            this.field_r = param4;
            this.field_h = param5;
            this.field_p = param3;
            this.field_m = param2;
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ae.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Members";
    }
}
