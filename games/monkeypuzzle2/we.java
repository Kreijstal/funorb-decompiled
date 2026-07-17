/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

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
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
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
              StringBuilder discarded$8 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((we) this).field_r).append(",").append(((we) this).field_e).append(" ").append(((we) this).field_l).append("x").append(((we) this).field_p);
              if (((we) this).field_s != null) {
                StringBuilder discarded$9 = param2.append(" text=\"").append(((we) this).field_s).append(34);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 < -1) {
                break L2;
              } else {
                var7 = null;
                ((we) this).a((we) null, 84, -2, (byte) -23);
                break L2;
              }
            }
            L3: {
              if (!((we) this).field_g) {
                break L3;
              } else {
                StringBuilder discarded$10 = param2.append(" mouseover");
                break L3;
              }
            }
            L4: {
              if (((we) this).b((byte) 52)) {
                StringBuilder discarded$11 = param2.append(" focused");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != ((we) this).field_h) {
                L6: {
                  StringBuilder discarded$12 = param2.append(" renderer=");
                  if (((we) this).field_h instanceof we) {
                    break L6;
                  } else {
                    StringBuilder discarded$13 = param2.append(((we) this).field_h);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                param2 = ((we) this).a(false, param2, param0, param1 - -1);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (null == ((we) this).field_o) {
                break L7;
              } else {
                L8: {
                  StringBuilder discarded$14 = param2.append(" listener=");
                  if (!(((we) this).field_o instanceof we)) {
                    break L8;
                  } else {
                    param2 = ((we) this).a(false, param2, param0, 1 + param1);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                StringBuilder discarded$15 = param2.append(((we) this).field_o);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("we.NA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param1).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw la.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param3 + 41);
        }
    }

    StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
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
                boolean discarded$2 = ((we) this).a(12, 31, -123, -11, (byte) -73);
                break L1;
              }
            }
            L2: {
              if (!((we) this).a(param2, (byte) -125, param3, param1)) {
                break L2;
              } else {
                ((we) this).a(param2, param3, param1, -50);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param1;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("we.T(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
    }

    final void g(int param0) {
        if (param0 != -1) {
            return;
        }
        ((we) this).a(((we) this).field_p, param0 + 13362, ((we) this).field_r, ((we) this).field_l, ((we) this).field_e);
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
                field_f = null;
                break L1;
              }
            }
            if (ed.field_c != cf.field_b) {
              L2: {
                if (f.field_i != ed.field_c) {
                  break L2;
                } else {
                  if (param0.equals((Object) (Object) pi.field_p)) {
                    ed.field_c = di.field_a;
                    stackOut_10_0 = w.field_c;
                    stackIn_11_0 = stackOut_10_0;
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
              return (cj) (Object) stackIn_9_0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (cj) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("we.LA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
    }

    public final String toString() {
        return ((we) this).a(false, new StringBuilder(), new Hashtable(), 0).toString();
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
                ((we) this).g(-123);
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("we.AA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
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
                ((we) this).field_t = 65;
                break L1;
              }
            }
            if (param0.containsKey(this)) {
              StringBuilder discarded$4 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              Object discarded$5 = param0.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("we.IA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    int f(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            StringBuilder discarded$0 = ((we) this).a(false, (StringBuilder) null, (Hashtable) null, -90);
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        ((we) this).field_e = param4;
        ((we) this).field_p = param0;
        ((we) this).field_r = param2;
        ((we) this).field_l = param3;
        if (param1 != 13361) {
            ((we) this).field_r = 7;
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
          if (((we) this).b((byte) 83)) {
            if (!((we) this).a((we) this, param2, param0, -108)) {
              var4 = param0;
              if (var4 == 80) {
                return ((we) this).a((we) this, false);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param0;
            if (var4 == 80) {
              return ((we) this).a((we) this, false);
            } else {
              return false;
            }
          }
        } else {
          ((we) this).g(38);
          if (((we) this).b((byte) 83)) {
            if (!((we) this).a((we) this, param2, param0, -108)) {
              var4 = param0;
              if (var4 == 80) {
                return ((we) this).a((we) this, false);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param0;
            if (var4 == 80) {
              return ((we) this).a((we) this, false);
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
              ((we) this).field_k = 0;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("we.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = ((we) this).f(0);
        var5_int = 0;
        L0: while (true) {
          if (var5_int > var4) {
            if (param2 < 105) {
              L1: {
                var7 = null;
                ((we) this).a(88, 31, (we) null, -103, 118, -124);
                var5 = nd.a((byte) -128);
                if (var5 != null) {
                  hi.field_b.a(nj.field_a, 68, oa.field_G, var5);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var5 = nd.a((byte) -128);
                if (var5 != null) {
                  hi.field_b.a(nj.field_a, 68, oa.field_G, var5);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            ((we) this).a(30, var5_int, param0, param1);
            var5_int++;
            if (var6 == 0) {
              continue L0;
            } else {
              L3: {
                var5 = nd.a((byte) -128);
                if (var5 != null) {
                  hi.field_b.a(nj.field_a, 68, oa.field_G, var5);
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
            ((we) this).field_t = param4;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "we.I(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    void e(int param0) {
        if (param0 != 13104) {
            ((we) this).field_q = null;
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
            ((we) this).field_r = -71;
            if (((we) this).field_g) {
              stackOut_7_0 = ((we) this).field_m;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (String) (Object) stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((we) this).field_g) {
              stackOut_3_0 = ((we) this).field_m;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (String) (Object) stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    void a(we param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
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
                var6 = null;
                boolean discarded$2 = ((we) this).a((Hashtable) null, (byte) 43, -49, (StringBuilder) null);
                break L1;
              }
            }
            L2: {
              var5_int = ((we) this).a(ei.field_a, param1, param2, p.field_a, (byte) 45) ? 1 : 0;
              if (var5_int == (((we) this).field_g ? 1 : 0)) {
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
                ((we) this).field_g = stackIn_6_1 != 0;
                if (null == ((we) this).field_o) {
                  break L2;
                } else {
                  if (!(((we) this).field_o instanceof jd)) {
                    break L2;
                  } else {
                    ((jd) (Object) ((we) this).field_o).a(var5_int != 0, (we) this, 25982);
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
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("we.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("we.V(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 == 45) {
          if (((we) this).field_r + param2 <= param0) {
            if (param3 >= param1 - -((we) this).field_e) {
              if (param0 < ((we) this).field_l + ((we) this).field_r + param2) {
                if (param3 >= ((we) this).field_p + param1 - -((we) this).field_e) {
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
          if (((we) this).field_h != null) {
            ((we) this).field_h.a(true, (we) this, param2, param3, 30);
            if (param0 != 30) {
              ((we) this).field_t = 54;
              return;
            } else {
              return;
            }
          } else {
            if (param0 != 30) {
              ((we) this).field_t = 54;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 30) {
            ((we) this).field_t = 54;
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
              if (!((we) this).a(param1, param0, param6, param5, (byte) 45)) {
                break L1;
              } else {
                ((we) this).field_t = param2;
                break L1;
              }
            }
            L2: {
              if (param3 == -1625) {
                break L2;
              } else {
                ((we) this).a(-27, 48, 40);
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
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("we.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_5_0 != 0;
    }

    protected we() {
        ((we) this).field_i = 0;
        ((we) this).field_k = 0;
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
        ((we) this).field_i = 0;
        ((we) this).field_k = 0;
        try {
          L0: {
            L1: {
              ((we) this).field_o = param2;
              ((we) this).field_h = param1;
              ((we) this).field_s = param0;
              if (!(((we) this).field_h instanceof ui)) {
                break L1;
              } else {
                var4 = (ui) (Object) ((we) this).field_h;
                ((we) this).field_l = var4.a((we) this, (byte) 103);
                ((we) this).field_p = var4.a((we) this, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("we.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    we(int param0, int param1, int param2, int param3, ml param4, of param5) {
        ((we) this).field_i = 0;
        ((we) this).field_k = 0;
        try {
            ((we) this).field_l = param2;
            ((we) this).field_h = param4;
            ((we) this).field_r = param0;
            ((we) this).field_e = param1;
            ((we) this).field_o = param5;
            ((we) this).field_p = param3;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "we.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        ee var6 = null;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        ((we) this).a((we) this, param1, param0, (byte) -57);
        if (param2) {
          var5 = ((we) this).b((byte) 74) ? 1 : 0;
          if (param3) {
            L0: {
              if (0 == ab.field_d) {
                break L0;
              } else {
                if (var5 != 0) {
                  boolean discarded$4 = ((we) this).a(p.field_a, (we) this, ei.field_a, param1, param0, ab.field_d, -118);
                  break L0;
                } else {
                  if (kc.field_d != 0) {
                    L1: {
                      if (((we) this).a(param1, qg.field_c, kc.field_d, -1625, (we) this, ab.field_e, param0)) {
                        param3 = false;
                        break L1;
                      } else {
                        if (var5 == 0) {
                          break L1;
                        } else {
                          ((we) this).e(13104);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            param3 = false;
                            if (ni.field_a == 0) {
                              if (0 == q.field_a) {
                                q.field_a = ni.field_a;
                                ef.a(107, ((we) this).a((byte) 54));
                                return param3;
                              } else {
                                L2: {
                                  ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                                  var6 = od.field_n;
                                  if (var6 != null) {
                                    L3: {
                                      if (var6.field_o instanceof tc) {
                                        ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
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
                                ef.a(107, ((we) this).a((byte) 54));
                                return param3;
                              }
                            } else {
                              q.field_a = ni.field_a;
                              ef.a(107, ((we) this).a((byte) 54));
                              return param3;
                            }
                          }
                        }
                      }
                    }
                    if (ni.field_a == 0) {
                      if (0 != q.field_a) {
                        ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                        var6 = od.field_n;
                        if (var6 == null) {
                          q.field_a = ni.field_a;
                          ef.a(107, ((we) this).a((byte) 54));
                          return param3;
                        } else {
                          L4: {
                            if (var6.field_o instanceof tc) {
                              ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          od.field_n = null;
                          q.field_a = ni.field_a;
                          ef.a(107, ((we) this).a((byte) 54));
                          return param3;
                        }
                      } else {
                        q.field_a = ni.field_a;
                        ef.a(107, ((we) this).a((byte) 54));
                        return param3;
                      }
                    } else {
                      q.field_a = ni.field_a;
                      ef.a(107, ((we) this).a((byte) 54));
                      return param3;
                    }
                  } else {
                    if (ni.field_a == 0) {
                      if (0 != q.field_a) {
                        L5: {
                          ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                          var6 = od.field_n;
                          if (var6 != null) {
                            L6: {
                              if (var6.field_o instanceof tc) {
                                ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
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
                        ef.a(107, ((we) this).a((byte) 54));
                        return param3;
                      } else {
                        q.field_a = ni.field_a;
                        ef.a(107, ((we) this).a((byte) 54));
                        return param3;
                      }
                    } else {
                      q.field_a = ni.field_a;
                      ef.a(107, ((we) this).a((byte) 54));
                      return param3;
                    }
                  }
                }
              }
            }
            if (kc.field_d != 0) {
              L7: {
                if (((we) this).a(param1, qg.field_c, kc.field_d, -1625, (we) this, ab.field_e, param0)) {
                  param3 = false;
                  break L7;
                } else {
                  if (var5 == 0) {
                    break L7;
                  } else {
                    ((we) this).e(13104);
                    if (var7 == 0) {
                      break L7;
                    } else {
                      L8: {
                        param3 = false;
                        if (ni.field_a != 0) {
                          break L8;
                        } else {
                          if (0 != q.field_a) {
                            ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                            var6 = od.field_n;
                            if (var6 != null) {
                              L9: {
                                if (var6.field_o instanceof tc) {
                                  ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              od.field_n = null;
                              break L8;
                            } else {
                              q.field_a = ni.field_a;
                              ef.a(107, ((we) this).a((byte) 54));
                              return param3;
                            }
                          } else {
                            q.field_a = ni.field_a;
                            ef.a(107, ((we) this).a((byte) 54));
                            return param3;
                          }
                        }
                      }
                      q.field_a = ni.field_a;
                      ef.a(107, ((we) this).a((byte) 54));
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
                    ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                    var6 = od.field_n;
                    if (var6 != null) {
                      L11: {
                        if (var6.field_o instanceof tc) {
                          ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      od.field_n = null;
                      break L10;
                    } else {
                      q.field_a = ni.field_a;
                      ef.a(107, ((we) this).a((byte) 54));
                      return param3;
                    }
                  } else {
                    q.field_a = ni.field_a;
                    ef.a(107, ((we) this).a((byte) 54));
                    return param3;
                  }
                }
              }
              q.field_a = ni.field_a;
              ef.a(107, ((we) this).a((byte) 54));
              return param3;
            } else {
              if (ni.field_a == 0) {
                if (0 != q.field_a) {
                  ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                  var6 = od.field_n;
                  if (var6 != null) {
                    L12: {
                      if (var6.field_o instanceof tc) {
                        ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    od.field_n = null;
                    q.field_a = ni.field_a;
                    ef.a(107, ((we) this).a((byte) 54));
                    return param3;
                  } else {
                    q.field_a = ni.field_a;
                    ef.a(107, ((we) this).a((byte) 54));
                    return param3;
                  }
                } else {
                  q.field_a = ni.field_a;
                  ef.a(107, ((we) this).a((byte) 54));
                  return param3;
                }
              } else {
                q.field_a = ni.field_a;
                ef.a(107, ((we) this).a((byte) 54));
                return param3;
              }
            }
          } else {
            if (var5 != 0) {
              if (kc.field_d != 0) {
                ((we) this).e(13104);
                if (var7 != 0) {
                  L13: {
                    if (0 == ab.field_d) {
                      break L13;
                    } else {
                      if (var5 != 0) {
                        boolean discarded$5 = ((we) this).a(p.field_a, (we) this, ei.field_a, param1, param0, ab.field_d, -118);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (kc.field_d != 0) {
                      L15: {
                        if (((we) this).a(param1, qg.field_c, kc.field_d, -1625, (we) this, ab.field_e, param0)) {
                          break L15;
                        } else {
                          if (var5 == 0) {
                            break L14;
                          } else {
                            ((we) this).e(13104);
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
                      ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                      var6 = od.field_n;
                      if (var6 != null) {
                        L16: {
                          if (var6.field_o instanceof tc) {
                            ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        od.field_n = null;
                        q.field_a = ni.field_a;
                        ef.a(107, ((we) this).a((byte) 54));
                        return param3;
                      } else {
                        q.field_a = ni.field_a;
                        ef.a(107, ((we) this).a((byte) 54));
                        return param3;
                      }
                    } else {
                      q.field_a = ni.field_a;
                      ef.a(107, ((we) this).a((byte) 54));
                      return param3;
                    }
                  } else {
                    q.field_a = ni.field_a;
                    ef.a(107, ((we) this).a((byte) 54));
                    return param3;
                  }
                } else {
                  q.field_a = ni.field_a;
                  ef.a(107, ((we) this).a((byte) 54));
                  return param3;
                }
              } else {
                q.field_a = ni.field_a;
                ef.a(107, ((we) this).a((byte) 54));
                return param3;
              }
            } else {
              q.field_a = ni.field_a;
              ef.a(107, ((we) this).a((byte) 54));
              return param3;
            }
          }
        } else {
          ((we) this).field_s = null;
          var5 = ((we) this).b((byte) 74) ? 1 : 0;
          if (!param3) {
            if (var5 != 0) {
              if (kc.field_d != 0) {
                ((we) this).e(13104);
                if (var7 != 0) {
                  L17: {
                    if (0 == ab.field_d) {
                      break L17;
                    } else {
                      if (var5 != 0) {
                        boolean discarded$6 = ((we) this).a(p.field_a, (we) this, ei.field_a, param1, param0, ab.field_d, -118);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (kc.field_d != 0) {
                      L19: {
                        if (((we) this).a(param1, qg.field_c, kc.field_d, -1625, (we) this, ab.field_e, param0)) {
                          break L19;
                        } else {
                          if (var5 == 0) {
                            break L18;
                          } else {
                            ((we) this).e(13104);
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
                      ef.a(107, ((we) this).a((byte) 54));
                      return param3;
                    } else {
                      L20: {
                        ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                        var6 = od.field_n;
                        if (var6 != null) {
                          L21: {
                            if (var6.field_o instanceof tc) {
                              ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
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
                      ef.a(107, ((we) this).a((byte) 54));
                      return param3;
                    }
                  } else {
                    q.field_a = ni.field_a;
                    ef.a(107, ((we) this).a((byte) 54));
                    return param3;
                  }
                } else {
                  q.field_a = ni.field_a;
                  ef.a(107, ((we) this).a((byte) 54));
                  return param3;
                }
              } else {
                q.field_a = ni.field_a;
                ef.a(107, ((we) this).a((byte) 54));
                return param3;
              }
            } else {
              q.field_a = ni.field_a;
              ef.a(107, ((we) this).a((byte) 54));
              return param3;
            }
          } else {
            L22: {
              if (0 == ab.field_d) {
                break L22;
              } else {
                if (var5 != 0) {
                  boolean discarded$7 = ((we) this).a(p.field_a, (we) this, ei.field_a, param1, param0, ab.field_d, -118);
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            L23: {
              if (kc.field_d != 0) {
                L24: {
                  if (((we) this).a(param1, qg.field_c, kc.field_d, -1625, (we) this, ab.field_e, param0)) {
                    break L24;
                  } else {
                    if (var5 == 0) {
                      break L23;
                    } else {
                      ((we) this).e(13104);
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
                ef.a(107, ((we) this).a((byte) 54));
                return param3;
              } else {
                L25: {
                  ((we) this).a(param1, ei.field_a, (we) this, p.field_a, 0, param0);
                  var6 = od.field_n;
                  if (var6 != null) {
                    L26: {
                      if (var6.field_o instanceof tc) {
                        ((tc) (Object) var6.field_o).a((oa) null, (byte) -27, var6);
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
                ef.a(107, ((we) this).a((byte) 54));
                return param3;
              }
            } else {
              q.field_a = ni.field_a;
              ef.a(107, ((we) this).a((byte) 54));
              return param3;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_n = new qh();
    }
}
