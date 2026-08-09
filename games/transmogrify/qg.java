/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qg extends wf {
    boolean field_g;
    int field_p;
    String field_k;
    int field_o;
    ue field_i;
    String field_j;
    int field_n;
    int field_l;
    int field_r;
    int field_h;
    ui field_q;
    int field_s;
    ma field_m;

    qg(String param0, ma param1) {
        this(param0, vi.field_e.field_q, param1);
    }

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.b(param3, param6, -1, param0, param5)) {
                break L1;
              } else {
                this.field_s = param1;
                break L1;
              }
            }
            if (param4 == -30386) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              this.field_k = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("qg.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_p).append(",").append(this.field_n).append(" ").append(this.field_l).append("x").append(this.field_h);
              if (this.field_k == null) {
                break L1;
              } else {
                discarded$1 = param0.append(" text=\"").append(this.field_k).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_g) {
                discarded$2 = param0.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var5_int = -48 % ((param1 - 22) / 40);
              if (this.b((byte) 121)) {
                discarded$3 = param0.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != this.field_q) {
                L5: {
                  discarded$4 = param0.append(" renderer=");
                  if (!(this.field_q instanceof qg)) {
                    break L5;
                  } else {
                    param0 = this.a(param2 - -1, -109, param0, param3);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                discarded$5 = param0.append(this.field_q);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (this.field_m == null) {
                break L6;
              } else {
                L7: {
                  discarded$6 = param0.append(" listener=");
                  if (this.field_m instanceof qg) {
                    break L7;
                  } else {
                    discarded$7 = param0.append(this.field_m);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param0 = this.a(1 + param2, -115, param0, param3);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("qg.CB(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
    }

    final static void b(boolean param0) {
        if (!(ge.field_x)) {
            throw new IllegalStateException();
        }
        bg.field_n = true;
        n.a(true, param0);
        gl.field_y = 0;
    }

    final static int d(int param0) {
        if (param0 != -20493) {
            return 104;
        }
        return gj.field_l;
    }

    final void c(byte param0) {
        if (param0 <= 14) {
          this.g(100);
          this.a(-96, this.field_n, this.field_p, this.field_l, this.field_h);
          return;
        } else {
          this.a(-96, this.field_n, this.field_p, this.field_l, this.field_h);
          return;
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int var4;
        if (!this.b((byte) 38)) {
          var4 = param2;
          if ((var4 ^ -1) != -81) {
            if (param0 != -81) {
              this.field_p = 19;
              return false;
            } else {
              return false;
            }
          } else {
            return this.a((qg) (this), -106);
          }
        } else {
          if (!this.a(param2, (qg) (this), (byte) -27, param1)) {
            var4 = param2;
            if ((var4 ^ -1) != -81) {
              if (param0 == -81) {
                return false;
              } else {
                this.field_p = 19;
                return false;
              }
            } else {
              return this.a((qg) (this), -106);
            }
          } else {
            return true;
          }
        }
    }

    void e(int param0) {
        if (param0 != -29113) {
            this.a(84, 80, 23, -23, 76);
        }
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -77 % ((65 - param2) / 55);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("qg.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final boolean a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -1) {
                break L1;
              } else {
                this.a(93, 124, 81, -75, -10);
                break L1;
              }
            }
            if (!param1.containsKey(this)) {
              param1.put(this, this);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("qg.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    int g(int param0) {
        if (param0 >= -41) {
            qg.a((byte) 106, -11);
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 112 / ((param0 - -29) / 53);
        this.field_l = param3;
        this.field_h = param4;
        this.field_n = param1;
        this.field_p = param2;
    }

    boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 == -17) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_g = true;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("qg.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, byte param1, qg param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.b(param3, param0, -1, oa.field_j, bk.field_a) ? 1 : 0;
              if (param1 == -12) {
                break L1;
              } else {
                this.field_s = 86;
                break L1;
              }
            }
            L2: {
              if (this.field_g) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {
              if (stackIn_5_0 != var5_int) {
                break L3;
              } else {
                L4: {
                  stackIn_8_0 = this;

                  if (var5_int == 0) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L4;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L4;
                  }
                }
                ((qg) (this)).field_g = stackIn_9_1 != 0;
                if (null == this.field_m) {
                  break L3;
                } else {
                  if (this.field_m instanceof ja) {
                    ((ja) ((Object) this.field_m)).a(var5_int != 0, 5257, (qg) (this));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("qg.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
    }

    String f(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        if (param0 != 4) {
          L0: {
            this.field_s = 3;
            if (this.field_g) {
              stackIn_8_0 = this.field_j;
              break L0;
            } else {
              stackIn_8_0 = null;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_g) {
              stackIn_4_0 = this.field_j;
              break L1;
            } else {
              stackIn_4_0 = null;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_s = 0;
              if (param3 == -1) {
                break L1;
              } else {
                this.g(-118);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("qg.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final String toString() {
        return this.a(0, -21, new StringBuilder(), new Hashtable()).toString();
    }

    boolean b(byte param0) {
        int var2 = 95 / ((param0 - -57) / 46);
        return false;
    }

    boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -11) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("qg.M(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -6 / ((param1 - 17) / 55);
            var3 = (CharSequence) ((Object) param0);
            stackIn_1_0 = kf.field_e.equals(hj.a((byte) -126, var3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("qg.BB(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5;
        var5 = 112 / ((param3 - 77) / 34);
        if (param2 == 0) {
          if (null == this.field_q) {
            return;
          } else {
            this.field_q.a(param0, param1, true, (byte) 110, (qg) (this));
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        if (param2 == -1) {
          if (param3 >= this.field_p + param0) {
            if (param1 - -this.field_n > param4) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param3 >= this.field_l + (param0 - -this.field_p)) {
                    break L1;
                  } else {
                    if (param4 >= this.field_n + param1 + this.field_h) {
                      break L1;
                    } else {
                      stackIn_18_0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_18_0 = 0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.field_o = -25;
          if (param3 >= this.field_p + param0) {
            if (param1 - -this.field_n <= param4) {
              if (param3 < this.field_l + (param0 - -this.field_p)) {
                if (param4 >= this.field_n + param1 + this.field_h) {
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

    final static int a(byte param0, int param1) {
        int var2;
        var2 = 0;
        if (0 <= param1) {
          if (65536 > param1) {
            L0: {
              if (param1 >= 256) {
                var2 += 8;
                param1 = param1 >>> 8;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-17 >= (param1 ^ -1)) {
                var2 += 4;
                param1 = param1 >>> 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < 4) {
                break L2;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L2;
              }
            }
            L3: {
              if (param1 < 1) {
                break L3;
              } else {
                param1 = param1 >>> 1;
                var2++;
                break L3;
              }
            }
            if (param0 < 69) {
              return 21;
            } else {
              return param1 + var2;
            }
          } else {
            L4: {
              param1 = param1 >>> 16;
              var2 += 16;
              if (param1 >= 256) {
                var2 += 8;
                param1 = param1 >>> 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-17 >= (param1 ^ -1)) {
                var2 += 4;
                param1 = param1 >>> 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 < 4) {
                break L6;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L6;
              }
            }
            L7: {
              if (param1 < 1) {
                break L7;
              } else {
                param1 = param1 >>> 1;
                var2++;
                break L7;
              }
            }
            if (param0 < 69) {
              return 21;
            } else {
              return param1 + var2;
            }
          }
        } else {
          L8: {
            param1 = param1 >>> 16;
            var2 += 16;
            if (param1 >= 256) {
              var2 += 8;
              param1 = param1 >>> 8;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (-17 >= (param1 ^ -1)) {
              var2 += 4;
              param1 = param1 >>> 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param1 < 4) {
              break L10;
            } else {
              var2 += 2;
              param1 = param1 >>> 2;
              break L10;
            }
          }
          L11: {
            if (param1 < 1) {
              break L11;
            } else {
              param1 = param1 >>> 1;
              var2++;
              break L11;
            }
          }
          if (param0 < 69) {
            return 21;
          } else {
            return param1 + var2;
          }
        }
    }

    StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a((byte) -103, param3, param2, param0)) {
                this.a(param2, 78, param0, param3);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 <= -20) {
              stackIn_7_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qg.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var7;
        vl var8;
        vl var9;
        vl var14;
        vl var15;
        var7 = Transmogrify.field_A ? 1 : 0;
        this.a(param0, (byte) -12, (qg) (this), param1);
        var5 = this.b((byte) 63) ? 1 : 0;
        if (param3 == 4) {
          L0: {
            if (param2) {
              break L0;
            } else {
              if (var5 != 0) {
                if (0 != tg.field_d) {
                  this.e(-29113);
                  if (var7 != 0) {
                    break L0;
                  } else {
                    hi.field_g = b.field_k;
                    eg.a(this.f(param3 ^ 0), (byte) 126);
                    return param2;
                  }
                } else {
                  hi.field_g = b.field_k;
                  eg.a(this.f(param3 ^ 0), (byte) 126);
                  return param2;
                }
              } else {
                hi.field_g = b.field_k;
                eg.a(this.f(param3 ^ 0), (byte) 126);
                return param2;
              }
            }
          }
          L1: {
            if (-1 == (f.field_a ^ -1)) {
              break L1;
            } else {
              if (var5 != 0) {
                this.a(param1, bk.field_a, (qg) (this), param0, f.field_a, -17, oa.field_j);
                break L1;
              } else {
                L2: {
                  if (tg.field_d == 0) {
                    break L2;
                  } else {
                    if (this.b(ol.field_b, tg.field_d, (qg) (this), param1, -30386, nk.field_c, param0)) {
                      param2 = false;
                      break L2;
                    } else {
                      L3: {
                        if (-1 != (b.field_k ^ -1)) {
                          break L3;
                        } else {
                          if (hi.field_g == 0) {
                            break L3;
                          } else {
                            this.a(param0, oa.field_j, (qg) (this), -1, bk.field_a, param1);
                            var8 = b.field_i;
                            if (var8 == null) {
                              break L3;
                            } else {
                              if (!(var8.field_m instanceof s)) {
                                b.field_i = null;
                                break L3;
                              } else {
                                ((s) ((Object) var8.field_m)).a((g) null, 2089, var8);
                                b.field_i = null;
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      hi.field_g = b.field_k;
                      eg.a(this.f(param3 ^ 0), (byte) 126);
                      return param2;
                    }
                  }
                }
                if (-1 == (b.field_k ^ -1)) {
                  if (hi.field_g != 0) {
                    this.a(param0, oa.field_j, (qg) (this), -1, bk.field_a, param1);
                    var9 = b.field_i;
                    if (var9 != null) {
                      if (!(var9.field_m instanceof s)) {
                        b.field_i = null;
                        hi.field_g = b.field_k;
                        eg.a(this.f(param3 ^ 0), (byte) 126);
                        return param2;
                      } else {
                        ((s) ((Object) var9.field_m)).a((g) null, 2089, var9);
                        b.field_i = null;
                        hi.field_g = b.field_k;
                        eg.a(this.f(param3 ^ 0), (byte) 126);
                        return param2;
                      }
                    } else {
                      hi.field_g = b.field_k;
                      eg.a(this.f(param3 ^ 0), (byte) 126);
                      return param2;
                    }
                  } else {
                    hi.field_g = b.field_k;
                    eg.a(this.f(param3 ^ 0), (byte) 126);
                    return param2;
                  }
                } else {
                  hi.field_g = b.field_k;
                  eg.a(this.f(param3 ^ 0), (byte) 126);
                  return param2;
                }
              }
            }
          }
          L4: {
            if (tg.field_d == 0) {
              break L4;
            } else {
              L5: {
                if (this.b(ol.field_b, tg.field_d, (qg) (this), param1, -30386, nk.field_c, param0)) {
                  break L5;
                } else {
                  if (var5 != 0) {
                    this.e(-29113);
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    if (-1 == (b.field_k ^ -1)) {
                      if (hi.field_g != 0) {
                        this.a(param0, oa.field_j, (qg) (this), -1, bk.field_a, param1);
                        var14 = b.field_i;
                        if (var14 != null) {
                          if (!(var14.field_m instanceof s)) {
                            b.field_i = null;
                            hi.field_g = b.field_k;
                            eg.a(this.f(param3 ^ 0), (byte) 126);
                            return param2;
                          } else {
                            ((s) ((Object) var14.field_m)).a((g) null, 2089, var14);
                            b.field_i = null;
                            hi.field_g = b.field_k;
                            eg.a(this.f(param3 ^ 0), (byte) 126);
                            return param2;
                          }
                        } else {
                          hi.field_g = b.field_k;
                          eg.a(this.f(param3 ^ 0), (byte) 126);
                          return param2;
                        }
                      } else {
                        hi.field_g = b.field_k;
                        eg.a(this.f(param3 ^ 0), (byte) 126);
                        return param2;
                      }
                    } else {
                      hi.field_g = b.field_k;
                      eg.a(this.f(param3 ^ 0), (byte) 126);
                      return param2;
                    }
                  }
                }
              }
              param2 = false;
              break L4;
            }
          }
          if (-1 == (b.field_k ^ -1)) {
            if (hi.field_g != 0) {
              this.a(param0, oa.field_j, (qg) (this), -1, bk.field_a, param1);
              var15 = b.field_i;
              if (var15 != null) {
                if (!(var15.field_m instanceof s)) {
                  b.field_i = null;
                  hi.field_g = b.field_k;
                  eg.a(this.f(param3 ^ 0), (byte) 126);
                  return param2;
                } else {
                  ((s) ((Object) var15.field_m)).a((g) null, 2089, var15);
                  b.field_i = null;
                  hi.field_g = b.field_k;
                  eg.a(this.f(param3 ^ 0), (byte) 126);
                  return param2;
                }
              } else {
                hi.field_g = b.field_k;
                eg.a(this.f(param3 ^ 0), (byte) 126);
                return param2;
              }
            } else {
              hi.field_g = b.field_k;
              eg.a(this.f(param3 ^ 0), (byte) 126);
              return param2;
            }
          } else {
            hi.field_g = b.field_k;
            eg.a(this.f(param3 ^ 0), (byte) 126);
            return param2;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Transmogrify.field_A ? 1 : 0;
        var4 = this.g(-64);
        if (param1 >= -13) {
          return;
        } else {
          var5_int = 0;
          L0: while (true) {
            L1: {
              if (var5_int > var4) {
                break L1;
              } else {
                this.a(param2, param0, var5_int, (byte) 123);
                var5_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = ra.a((byte) 113);
              if (var5 != null) {
                vi.field_e.a(og.field_e, 60, var5, qi.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    protected qg() {
        this.field_r = 0;
        this.field_o = 0;
    }

    qg(String param0, ui param1, ma param2) {
        RuntimeException runtimeException = null;
        m var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_r = 0;
        this.field_o = 0;
        try {
          L0: {
            L1: {
              this.field_m = param2;
              this.field_q = param1;
              this.field_k = param0;
              if (!(this.field_q instanceof m)) {
                break L1;
              } else {
                var4 = (m) ((Object) this.field_q);
                this.field_l = var4.a(-1, (qg) (this));
                this.field_h = var4.b((qg) (this), 228);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("qg.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    qg(int param0, int param1, int param2, int param3, ui param4, ma param5) {
        this.field_r = 0;
        this.field_o = 0;
        try {
            this.field_n = param1;
            this.field_l = param2;
            this.field_q = param4;
            this.field_h = param3;
            this.field_m = param5;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "qg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
