/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class shb extends ksa {
    int field_i;
    String field_p;
    static byte[] field_o;
    int field_h;
    boolean field_e;
    static String field_m;
    static int field_k;
    int field_f;
    sba field_l;
    wwa field_q;
    ar field_d;
    int field_n;
    int field_r;
    int field_g;
    String field_j;
    int field_s;

    boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
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
            if (param0 == -15834) {
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
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("shb.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    String d(byte param0) {
        if (param0 != 125) {
            this.field_f = -57;
        }
        return !this.field_e ? null : this.field_p;
    }

    final boolean a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 122 % ((58 - param2) / 57);
            if (param0.containsKey(this)) {
              discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param0.put(this, this);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("shb.CB(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.a(uia.field_b, param1, kc.field_b, param0, (byte) 22) ? 1 : 0;
              if (param2 == -981) {
                break L1;
              } else {
                this.field_e = true;
                break L1;
              }
            }
            L2: {
              if (this.field_e) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {


              if (var5_int != 0) {

                stackIn_8_1 = 0;
                break L3;
              } else {

                stackIn_8_1 = 1;
                break L3;
              }
            }
            L4: {
              if (stackIn_5_0 != stackIn_8_1) {
                L5: {
                  stackIn_12_0 = this;

                  if (var5_int == 0) {
                    stackIn_13_0 = this;
                    stackIn_13_1 = 0;
                    break L5;
                  } else {
                    stackIn_13_0 = this;
                    stackIn_13_1 = 1;
                    break L5;
                  }
                }
                ((shb) (this)).field_e = stackIn_13_1 != 0;
                if (this.field_l == null) {
                  break L4;
                } else {
                  if (this.field_l instanceof cfb) {
                    ((cfb) ((Object) this.field_l)).a(var5_int != 0, -18572, (shb) (this));
                    break L4;
                  } else {
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
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("shb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final void a(boolean param0) {
        if (param0) {
            this.field_s = 85;
        }
        this.a(this.field_g, this.field_h, this.field_f, 1, this.field_r);
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param6 < -17) {
              if (!this.a(param2, param1, param0, param5, (byte) 22)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_n = param3;
                return false;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("shb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param2 < 47) {
            this.toString();
        }
        if (-1 == (param1 ^ -1)) {
            if (!(this.field_q == null)) {
                this.field_q.a(95, (shb) (this), param0, param3, true);
            }
        }
    }

    void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        try {
            int var7_int = -47 % ((52 - param0) / 52);
            this.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "shb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4) {
        int stackIn_8_0 = 0;
        L0: {
          if (param4 == 22) {
            break L0;
          } else {
            this.field_s = -9;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 < param1 - -this.field_g) {
              break L2;
            } else {
              if (param0 < this.field_r + param3) {
                break L2;
              } else {
                if (param2 >= this.field_h + this.field_g + param1) {
                  break L2;
                } else {
                  if (param0 >= param3 - (-this.field_r - this.field_f)) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    void f(byte param0) {
        if (param0 != -34) {
            field_m = (String) null;
        }
    }

    boolean e(byte param0) {
        if (param0 != -120) {
            this.a(82, -5, -122, (shb) null, 99, 29, -31);
            return false;
        }
        return false;
    }

    public static void c(byte param0) {
        field_o = null;
        if (param0 <= 61) {
            field_k = -86;
        }
        field_m = null;
    }

    boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
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
            L1: {
              if (param1 == -6006) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("shb.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_r = param4;
        this.field_f = param2;
        this.field_g = param0;
        if (param3 != 1) {
            this.a(123, 5, 45, (shb) null);
        }
        this.field_h = param1;
    }

    shb(String param0, sba param1) {
        this(param0, msa.field_s.field_n, param1);
    }

    final void a(int param0, int param1, int param2) {
        int var5_int = 0;
        int var6 = VoidHunters.field_G;
        int var4 = this.c(param0 ^ 0);
        for (var5_int = param0; var5_int <= var4; var5_int++) {
            this.b(param2, var5_int, param0 + 93, param1);
        }
        String var5 = rm.d((byte) 106);
        if (!(var5 == null)) {
            msa.field_s.a((byte) 27, var5, js.field_r, tmb.field_o);
        }
    }

    boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.a(true, (Hashtable) null, -65, (StringBuilder) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("shb.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param1, param2, (byte) 122, param3)) {
                this.a(95, param2, param1, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.c(103);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("shb.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    int c(int param0) {
        if (param0 != 0) {
            this.a((Hashtable) null, -120, (byte) 105, (StringBuilder) null);
            return 0;
        }
        return 0;
    }

    final boolean a(int param0, int param1, char param2) {
        if (this.e((byte) -120)) {
            if (!(!this.a(-15834, param1, (shb) (this), param2))) {
                return true;
            }
        }
        int var4 = param1;
        if (!((var4 ^ -1) != -81)) {
            return this.a(param0 ^ -9445, (shb) (this));
        }
        if (param0 != -9445) {
            this.a((byte) 31, 104, -76, false);
            return false;
        }
        return false;
    }

    public final String toString() {
        return this.a(false, new Hashtable(), 0, new StringBuilder()).toString();
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_g).append(",").append(this.field_r).append(" ").append(this.field_h).append("x").append(this.field_f);
              if (null != this.field_j) {
                discarded$1 = param3.append(" text=\"").append(this.field_j).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_e) {
                discarded$2 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.e((byte) -120)) {
                break L3;
              } else {
                discarded$3 = param3.append(" focused");
                break L3;
              }
            }
            L4: {
              if (null != this.field_q) {
                discarded$4 = param3.append(" renderer=");
                if (!(this.field_q instanceof shb)) {
                  discarded$5 = param3.append(this.field_q);
                  break L4;
                } else {
                  param3 = this.a(false, param2, 1 + param1, param3);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 >= 59) {
                break L5;
              } else {
                this.a(-49, 49, 80, 34, (byte) -121);
                break L5;
              }
            }
            L6: {
              if (this.field_l == null) {
                break L6;
              } else {
                discarded$6 = param3.append(" listener=");
                if (!(this.field_l instanceof shb)) {
                  discarded$7 = param3.append(this.field_l);
                  break L6;
                } else {
                  param3 = this.a(false, param2, 1 + param1, param3);
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("shb.IB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2, boolean param3) {
        int var5;
        ef var6;
        int var7;
        L0: {
          var7 = VoidHunters.field_G;
          this.a(param2, param1, -981, (shb) (this));
          var5 = this.e((byte) -120) ? 1 : 0;
          if (param3) {
            L1: {
              if (tcb.field_o == 0) {
                break L1;
              } else {
                if (var5 != 0) {
                  this.a(param1, -6006, tcb.field_o, (shb) (this), kc.field_b, param2, uia.field_b);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (pba.field_o != 0) {
                if (!this.a(oq.field_H, param1, qs.field_a, pba.field_o, (shb) (this), param2, (byte) -105)) {
                  if (var5 != 0) {
                    this.f((byte) -34);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  param3 = false;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            if (hu.field_b != 0) {
              break L0;
            } else {
              if (jw.field_b == 0) {
                break L0;
              } else {
                this.a((byte) 118, param1, uia.field_b, param2, (shb) (this), kc.field_b);
                var6 = lb.field_p;
                if (var6 != null) {
                  L3: {
                    if (!(var6.field_l instanceof ol)) {
                      break L3;
                    } else {
                      ((ol) ((Object) var6.field_l)).a((byte) -70, var6, (gga) null);
                      break L3;
                    }
                  }
                  lb.field_p = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            if (var5 == 0) {
              break L0;
            } else {
              if (-1 == (pba.field_o ^ -1)) {
                break L0;
              } else {
                this.f((byte) -34);
                break L0;
              }
            }
          }
        }
        L4: {
          if (param0 == -5) {
            break L4;
          } else {
            this.a(-58, -39, -116);
            break L4;
          }
        }
        jw.field_b = hu.field_b;
        uf.a(this.d((byte) 125), 5757);
        return param3;
    }

    protected shb() {
        this.field_i = 0;
        this.field_s = 0;
    }

    shb(String param0, wwa param1, sba param2) {
        RuntimeException runtimeException = null;
        at var4 = null;
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
        this.field_i = 0;
        this.field_s = 0;
        try {
          L0: {
            L1: {
              this.field_l = param2;
              this.field_j = param0;
              this.field_q = param1;
              if (!(this.field_q instanceof at)) {
                break L1;
              } else {
                var4 = (at) ((Object) this.field_q);
                this.field_h = var4.a(-2, (shb) (this));
                this.field_f = var4.a((shb) (this), (byte) 66);
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

            stackIn_6_1 = new StringBuilder().append("shb.<init>(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    shb(int param0, int param1, int param2, int param3, wwa param4, sba param5) {
        this.field_i = 0;
        this.field_s = 0;
        try {
            this.field_r = param1;
            this.field_q = param4;
            this.field_g = param0;
            this.field_f = param3;
            this.field_h = param2;
            this.field_l = param5;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "shb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new byte[]{(byte)3};
        field_m = "Please send me news and updates (I can unsubscribe at any time)";
        field_k = 0;
    }
}
