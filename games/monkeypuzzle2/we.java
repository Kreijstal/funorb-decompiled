/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class we extends ug {
    int field_i;
    aa field_q;
    String field_s;
    of field_o;
    ml field_h;
    int field_r;
    static int field_j;
    int field_l;
    int field_t;
    String field_m;
    int field_p;
    static qh field_n;
    int field_k;
    int field_e;
    boolean field_g;
    static le[] field_f;

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
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
        we var7 = null;
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$8 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_r).append(",").append(this.field_e).append(" ").append(this.field_l).append("x").append(this.field_p);
              if (this.field_s != null) {
                discarded$9 = param2.append(" text=\"").append(this.field_s).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 < -1) {
                break L2;
              } else {
                var7 = (we) null;
                this.a((we) null, 84, -2, (byte) -23);
                break L2;
              }
            }
            L3: {
              if (!this.field_g) {
                break L3;
              } else {
                discarded$10 = param2.append(" mouseover");
                break L3;
              }
            }
            L4: {
              if (this.b((byte) 52)) {
                discarded$11 = param2.append(" focused");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != this.field_h) {
                L6: {
                  discarded$12 = param2.append(" renderer=");
                  if (this.field_h instanceof we) {
                    break L6;
                  } else {
                    discarded$13 = param2.append(this.field_h);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                param2 = this.a(false, param2, param0, param1 - -1);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (null == this.field_o) {
                break L7;
              } else {
                L8: {
                  discarded$14 = param2.append(" listener=");
                  if (!(this.field_o instanceof we)) {
                    break L8;
                  } else {
                    param2 = this.a(false, param2, param0, 1 + param1);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                discarded$15 = param2.append(this.field_o);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("we.NA(");
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
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
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
          throw la.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
    }

    StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        boolean discarded$2 = false;
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                discarded$2 = this.a(12, 31, -123, -11, (byte) -73);
                break L1;
              }
            }
            L2: {
              if (!this.a(param2, (byte) -125, param3, param1)) {
                break L2;
              } else {
                this.a(param2, param3, param1, -50);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) (param1);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("we.T(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final void g(int param0) {
        if (param0 != -1) {
            return;
        }
        this.a(this.field_p, param0 + 13362, this.field_r, this.field_l, this.field_e);
    }

    final static cj b(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        cj stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -61) {
                break L1;
              } else {
                field_f = (le[]) null;
                break L1;
              }
            }
            if (ed.field_c != cf.field_b) {
              L2: {
                if (f.field_i != ed.field_c) {
                  break L2;
                } else {
                  if (param0.equals(pi.field_p)) {
                    ed.field_c = di.field_a;
                    stackOut_10_0 = w.field_c;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              ed.field_c = cf.field_b;
              pi.field_p = param0;
              w.field_c = null;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("we.LA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (cj) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (cj) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    public final String toString() {
        return this.a(false, new StringBuilder(), new Hashtable(), 0).toString();
    }

    boolean a(we param0, boolean param1) {
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
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.g(-123);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("we.AA(");
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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
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
              if (param1 < -119) {
                break L1;
              } else {
                this.field_t = 65;
                break L1;
              }
            }
            if (param0.containsKey(this)) {
              discarded$4 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$5 = param0.put(this, this);
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
            stackOut_7_1 = new StringBuilder().append("we.IA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    int f(int param0) {
        StringBuilder discarded$0 = null;
        if (param0 != 0) {
            Hashtable var3 = (Hashtable) null;
            discarded$0 = this.a(false, (StringBuilder) null, (Hashtable) null, -90);
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_e = param4;
        this.field_p = param0;
        this.field_r = param2;
        this.field_l = param3;
        if (param1 != 13361) {
            this.field_r = 7;
        }
    }

    public static void h(int param0) {
        field_f = null;
        field_n = null;
        if (param0 != 0) {
            field_j = -84;
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        if (param1 > 88) {
          if (this.b((byte) 83)) {
            if (!this.a((we) (this), param2, param0, -108)) {
              var4 = param0;
              if (-81 == (var4 ^ -1)) {
                return this.a((we) (this), false);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param0;
            if (-81 == (var4 ^ -1)) {
              return this.a((we) (this), false);
            } else {
              return false;
            }
          }
        } else {
          this.g(38);
          if (this.b((byte) 83)) {
            if (!this.a((we) (this), param2, param0, -108)) {
              var4 = param0;
              if (-81 == (var4 ^ -1)) {
                return this.a((we) (this), false);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param0;
            if (-81 == (var4 ^ -1)) {
              return this.a((we) (this), false);
            } else {
              return false;
            }
          }
        }
    }

    boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
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
            if (param6 < -109) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_k = 0;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("we.F(").append(param0).append(',');
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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        we var7 = null;
        String var8 = null;
        String var11 = null;
        String var12 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = this.f(0);
        var5 = 0;
        L0: while (true) {
          if (var5 > var4) {
            if (param2 < 105) {
              L1: {
                var7 = (we) null;
                this.a(88, 31, (we) null, -103, 118, -124);
                var11 = nd.a((byte) -128);
                if (var11 != null) {
                  hi.field_b.a(nj.field_a, 68, oa.field_G, var11);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var12 = nd.a((byte) -128);
                if (var12 != null) {
                  hi.field_b.a(nj.field_a, 68, oa.field_G, var12);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            this.a(30, var5, param0, param1);
            var5++;
            if (var6 == 0) {
              continue L0;
            } else {
              L3: {
                var8 = nd.a((byte) -128);
                if (var8 != null) {
                  hi.field_b.a(nj.field_a, 68, oa.field_G, var8);
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

    void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        try {
            this.field_t = param4;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "we.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void e(int param0) {
        if (param0 != 13104) {
            this.field_q = (aa) null;
        }
    }

    we(String param0, of param1) {
        this(param0, hi.field_b.field_a, param1);
    }

    String a(byte param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 54) {
          L0: {
            this.field_r = -71;
            if (this.field_g) {
              stackOut_7_0 = this.field_m;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (String) ((Object) stackOut_6_0);
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_g) {
              stackOut_3_0 = this.field_m;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (String) ((Object) stackOut_2_0);
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    void a(we param0, int param1, int param2, byte param3) {
        boolean discarded$2 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
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
              if (param3 <= -13) {
                break L1;
              } else {
                var6 = (StringBuilder) null;
                discarded$2 = this.a((Hashtable) null, (byte) 43, -49, (StringBuilder) null);
                break L1;
              }
            }
            L2: {
              var5_int = this.a(ei.field_a, param1, param2, p.field_a, (byte) 45) ? 1 : 0;
              if (var5_int == (this.field_g ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var5_int == 0) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L3;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L3;
                  }
                }
                ((we) (this)).field_g = stackIn_6_1 != 0;
                if (null == this.field_o) {
                  break L2;
                } else {
                  if (!(this.field_o instanceof jd)) {
                    break L2;
                  } else {
                    ((jd) ((Object) this.field_o)).a(var5_int != 0, (we) (this), 25982);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("we.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = -93 / ((param3 - 37) / 50);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5);
            stackOut_2_1 = new StringBuilder().append("we.V(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 == 45) {
          if (this.field_r + param2 <= param0) {
            if (param3 >= param1 - -this.field_e) {
              if (param0 < this.field_l + this.field_r + param2) {
                if (param3 >= this.field_p + param1 - -this.field_e) {
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
        } else {
          return false;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == 0) {
          if (this.field_h != null) {
            this.field_h.a(true, (we) (this), param2, param3, 30);
            if (param0 != 30) {
              this.field_t = 54;
              return;
            } else {
              return;
            }
          } else {
            if (param0 != 30) {
              this.field_t = 54;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 30) {
            this.field_t = 54;
            return;
          } else {
            return;
          }
        }
    }

    boolean b(byte param0) {
        if (param0 <= 38) {
            field_j = 11;
            return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
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
              if (!this.a(param1, param0, param6, param5, (byte) 45)) {
                break L1;
              } else {
                this.field_t = param2;
                break L1;
              }
            }
            L2: {
              if (param3 == -1625) {
                break L2;
              } else {
                this.a(-27, 48, 40);
                break L2;
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("we.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    protected we() {
        this.field_i = 0;
        this.field_k = 0;
    }

    we(String param0, ml param1, of param2) {
        RuntimeException runtimeException = null;
        ui var4 = null;
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
        this.field_i = 0;
        this.field_k = 0;
        try {
          L0: {
            L1: {
              this.field_o = param2;
              this.field_h = param1;
              this.field_s = param0;
              if (!(this.field_h instanceof ui)) {
                break L1;
              } else {
                var4 = (ui) ((Object) this.field_h);
                this.field_l = var4.a((we) (this), (byte) 103);
                this.field_p = var4.a((we) (this), false);
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
            stackOut_4_1 = new StringBuilder().append("we.<init>(");
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
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    we(int param0, int param1, int param2, int param3, ml param4, of param5) {
        this.field_i = 0;
        this.field_k = 0;
        try {
            this.field_l = param2;
            this.field_h = param4;
            this.field_r = param0;
            this.field_e = param1;
            this.field_o = param5;
            this.field_p = param3;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "we.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        int var5 = 0;
        ee var6 = null;
        int var7 = 0;
        ee var8 = null;
        ee var17 = null;
        ee var21 = null;
        ee var22 = null;
        ee var24 = null;
        ee var29 = null;
        ee var30 = null;
        ee var31 = null;
        ee var32 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.a((we) (this), param1, param0, (byte) -57);
        if (param2) {
          var5 = this.b((byte) 74) ? 1 : 0;
          if (param3) {
            L0: {
              if (0 == ab.field_d) {
                break L0;
              } else {
                if (var5 != 0) {
                  discarded$4 = this.a(p.field_a, (we) (this), ei.field_a, param1, param0, ab.field_d, -118);
                  break L0;
                } else {
                  if (-1 != (kc.field_d ^ -1)) {
                    L1: {
                      if (this.a(param1, qg.field_c, kc.field_d, -1625, (we) (this), ab.field_e, param0)) {
                        param3 = false;
                        break L1;
                      } else {
                        if (var5 == 0) {
                          break L1;
                        } else {
                          this.e(13104);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            param3 = false;
                            if (ni.field_a == 0) {
                              if (0 == q.field_a) {
                                q.field_a = ni.field_a;
                                ef.a(107, this.a((byte) 54));
                                return param3;
                              } else {
                                L2: {
                                  this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                                  var24 = od.field_n;
                                  var6 = var24;
                                  if (var24 != null) {
                                    L3: {
                                      if (var24.field_o instanceof tc) {
                                        ((tc) ((Object) var24.field_o)).a((oa) null, (byte) -27, var24);
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    }
                                    od.field_n = null;
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                                q.field_a = ni.field_a;
                                ef.a(107, this.a((byte) 54));
                                return param3;
                              }
                            } else {
                              q.field_a = ni.field_a;
                              ef.a(107, this.a((byte) 54));
                              return param3;
                            }
                          }
                        }
                      }
                    }
                    if (ni.field_a == 0) {
                      if (0 != q.field_a) {
                        this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                        var29 = od.field_n;
                        var6 = var29;
                        if (var29 == null) {
                          q.field_a = ni.field_a;
                          ef.a(107, this.a((byte) 54));
                          return param3;
                        } else {
                          L4: {
                            if (var29.field_o instanceof tc) {
                              ((tc) ((Object) var29.field_o)).a((oa) null, (byte) -27, var29);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          od.field_n = null;
                          q.field_a = ni.field_a;
                          ef.a(107, this.a((byte) 54));
                          return param3;
                        }
                      } else {
                        q.field_a = ni.field_a;
                        ef.a(107, this.a((byte) 54));
                        return param3;
                      }
                    } else {
                      q.field_a = ni.field_a;
                      ef.a(107, this.a((byte) 54));
                      return param3;
                    }
                  } else {
                    if (ni.field_a == 0) {
                      if (0 != q.field_a) {
                        L5: {
                          this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                          var22 = od.field_n;
                          var6 = var22;
                          if (var22 != null) {
                            L6: {
                              if (var22.field_o instanceof tc) {
                                ((tc) ((Object) var22.field_o)).a((oa) null, (byte) -27, var22);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            od.field_n = null;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        q.field_a = ni.field_a;
                        ef.a(107, this.a((byte) 54));
                        return param3;
                      } else {
                        q.field_a = ni.field_a;
                        ef.a(107, this.a((byte) 54));
                        return param3;
                      }
                    } else {
                      q.field_a = ni.field_a;
                      ef.a(107, this.a((byte) 54));
                      return param3;
                    }
                  }
                }
              }
            }
            if (-1 != (kc.field_d ^ -1)) {
              L7: {
                if (this.a(param1, qg.field_c, kc.field_d, -1625, (we) (this), ab.field_e, param0)) {
                  param3 = false;
                  break L7;
                } else {
                  if (var5 == 0) {
                    break L7;
                  } else {
                    this.e(13104);
                    if (var7 == 0) {
                      break L7;
                    } else {
                      L8: {
                        param3 = false;
                        if (ni.field_a != 0) {
                          break L8;
                        } else {
                          if (0 != q.field_a) {
                            this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                            var31 = od.field_n;
                            var6 = var31;
                            if (var31 != null) {
                              L9: {
                                if (var31.field_o instanceof tc) {
                                  ((tc) ((Object) var31.field_o)).a((oa) null, (byte) -27, var31);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              od.field_n = null;
                              break L8;
                            } else {
                              q.field_a = ni.field_a;
                              ef.a(107, this.a((byte) 54));
                              return param3;
                            }
                          } else {
                            q.field_a = ni.field_a;
                            ef.a(107, this.a((byte) 54));
                            return param3;
                          }
                        }
                      }
                      q.field_a = ni.field_a;
                      ef.a(107, this.a((byte) 54));
                      return param3;
                    }
                  }
                }
              }
              L10: {
                if (ni.field_a != 0) {
                  break L10;
                } else {
                  if (0 != q.field_a) {
                    this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                    var32 = od.field_n;
                    if (var32 != null) {
                      L11: {
                        if (var32.field_o instanceof tc) {
                          ((tc) ((Object) var32.field_o)).a((oa) null, (byte) -27, var32);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      od.field_n = null;
                      break L10;
                    } else {
                      q.field_a = ni.field_a;
                      ef.a(107, this.a((byte) 54));
                      return param3;
                    }
                  } else {
                    q.field_a = ni.field_a;
                    ef.a(107, this.a((byte) 54));
                    return param3;
                  }
                }
              }
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            } else {
              if (ni.field_a == 0) {
                if (0 != q.field_a) {
                  this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                  var30 = od.field_n;
                  var6 = var30;
                  if (var30 != null) {
                    L12: {
                      if (var30.field_o instanceof tc) {
                        ((tc) ((Object) var30.field_o)).a((oa) null, (byte) -27, var30);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    od.field_n = null;
                    q.field_a = ni.field_a;
                    ef.a(107, this.a((byte) 54));
                    return param3;
                  } else {
                    q.field_a = ni.field_a;
                    ef.a(107, this.a((byte) 54));
                    return param3;
                  }
                } else {
                  q.field_a = ni.field_a;
                  ef.a(107, this.a((byte) 54));
                  return param3;
                }
              } else {
                q.field_a = ni.field_a;
                ef.a(107, this.a((byte) 54));
                return param3;
              }
            }
          } else {
            if (var5 != 0) {
              if (kc.field_d != 0) {
                this.e(13104);
                if (var7 != 0) {
                  L13: {
                    if (0 == ab.field_d) {
                      break L13;
                    } else {
                      if (var5 != 0) {
                        discarded$5 = this.a(p.field_a, (we) (this), ei.field_a, param1, param0, ab.field_d, -118);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (-1 != (kc.field_d ^ -1)) {
                      L15: {
                        if (this.a(param1, qg.field_c, kc.field_d, -1625, (we) (this), ab.field_e, param0)) {
                          break L15;
                        } else {
                          if (var5 == 0) {
                            break L14;
                          } else {
                            this.e(13104);
                            if (var7 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      param3 = false;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  if (ni.field_a == 0) {
                    if (0 != q.field_a) {
                      this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                      var21 = od.field_n;
                      if (var21 != null) {
                        L16: {
                          if (var21.field_o instanceof tc) {
                            ((tc) ((Object) var21.field_o)).a((oa) null, (byte) -27, var21);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        od.field_n = null;
                        q.field_a = ni.field_a;
                        ef.a(107, this.a((byte) 54));
                        return param3;
                      } else {
                        q.field_a = ni.field_a;
                        ef.a(107, this.a((byte) 54));
                        return param3;
                      }
                    } else {
                      q.field_a = ni.field_a;
                      ef.a(107, this.a((byte) 54));
                      return param3;
                    }
                  } else {
                    q.field_a = ni.field_a;
                    ef.a(107, this.a((byte) 54));
                    return param3;
                  }
                } else {
                  q.field_a = ni.field_a;
                  ef.a(107, this.a((byte) 54));
                  return param3;
                }
              } else {
                q.field_a = ni.field_a;
                ef.a(107, this.a((byte) 54));
                return param3;
              }
            } else {
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            }
          }
        } else {
          this.field_s = (String) null;
          var5 = this.b((byte) 74) ? 1 : 0;
          if (!param3) {
            if (var5 != 0) {
              if (kc.field_d != 0) {
                this.e(13104);
                if (var7 != 0) {
                  L17: {
                    if (0 == ab.field_d) {
                      break L17;
                    } else {
                      if (var5 != 0) {
                        discarded$6 = this.a(p.field_a, (we) (this), ei.field_a, param1, param0, ab.field_d, -118);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (-1 != (kc.field_d ^ -1)) {
                      L19: {
                        if (this.a(param1, qg.field_c, kc.field_d, -1625, (we) (this), ab.field_e, param0)) {
                          break L19;
                        } else {
                          if (var5 == 0) {
                            break L18;
                          } else {
                            this.e(13104);
                            if (var7 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      param3 = false;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  if (ni.field_a == 0) {
                    if (0 == q.field_a) {
                      q.field_a = ni.field_a;
                      ef.a(107, this.a((byte) 54));
                      return param3;
                    } else {
                      L20: {
                        this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                        var17 = od.field_n;
                        if (var17 != null) {
                          L21: {
                            if (var17.field_o instanceof tc) {
                              ((tc) ((Object) var17.field_o)).a((oa) null, (byte) -27, var17);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          od.field_n = null;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      q.field_a = ni.field_a;
                      ef.a(107, this.a((byte) 54));
                      return param3;
                    }
                  } else {
                    q.field_a = ni.field_a;
                    ef.a(107, this.a((byte) 54));
                    return param3;
                  }
                } else {
                  q.field_a = ni.field_a;
                  ef.a(107, this.a((byte) 54));
                  return param3;
                }
              } else {
                q.field_a = ni.field_a;
                ef.a(107, this.a((byte) 54));
                return param3;
              }
            } else {
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            }
          } else {
            L22: {
              if (0 == ab.field_d) {
                break L22;
              } else {
                if (var5 != 0) {
                  discarded$7 = this.a(p.field_a, (we) (this), ei.field_a, param1, param0, ab.field_d, -118);
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            L23: {
              if (-1 != (kc.field_d ^ -1)) {
                L24: {
                  if (this.a(param1, qg.field_c, kc.field_d, -1625, (we) (this), ab.field_e, param0)) {
                    break L24;
                  } else {
                    if (var5 == 0) {
                      break L23;
                    } else {
                      this.e(13104);
                      if (var7 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                param3 = false;
                break L23;
              } else {
                break L23;
              }
            }
            if (ni.field_a == 0) {
              if (0 == q.field_a) {
                q.field_a = ni.field_a;
                ef.a(107, this.a((byte) 54));
                return param3;
              } else {
                L25: {
                  this.a(param1, ei.field_a, (we) (this), p.field_a, 0, param0);
                  var8 = od.field_n;
                  if (var8 != null) {
                    L26: {
                      if (var8.field_o instanceof tc) {
                        ((tc) ((Object) var8.field_o)).a((oa) null, (byte) -27, var8);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    od.field_n = null;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                q.field_a = ni.field_a;
                ef.a(107, this.a((byte) 54));
                return param3;
              }
            } else {
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            }
          }
        }
    }

    static {
        field_j = 0;
        field_n = new qh();
    }
}
