/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gl extends uf {
    cj field_l;
    static String field_t;
    int field_j;
    int field_y;
    static int field_k;
    static int field_m;
    ld field_q;
    boolean field_s;
    static String field_h;
    static String field_i;
    int field_n;
    String field_x;
    int field_p;
    sc field_r;
    int field_u;
    int field_v;
    int field_w;
    String field_o;

    final static ec b(String param0, int param1) {
        RuntimeException var2 = null;
        ec stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ec stackOut_2_0 = null;
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
              if (param1 == 20) {
                break L1;
              } else {
                gl.a(true);
                break L1;
              }
            }
            stackOut_2_0 = new ec(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("gl.MB(");
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
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    gl(String param0, sc param1) {
        this(param0, vc.field_c.field_t, param1);
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
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
              if (!((gl) this).a(param3, param2, param0, param6, param1)) {
                break L1;
              } else {
                ((gl) this).field_j = param4;
                break L1;
              }
            }
            if (!param0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              boolean discarded$2 = ((gl) this).a(46, -85, true, 48, 3);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("gl.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param6 + 41);
        }
        return stackIn_5_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 <= -106) {
          if (0 == param2) {
            if (((gl) this).field_l == null) {
              return;
            } else {
              ((gl) this).field_l.a(param3, (gl) this, param0, -24381, true);
              return;
            }
          } else {
            return;
          }
        } else {
          ((gl) this).a(65, (byte) -102, 18, -45, 98);
          if (0 == param2) {
            if (((gl) this).field_l == null) {
              return;
            } else {
              ((gl) this).field_l.a(param3, (gl) this, param0, -24381, true);
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean d(int param0) {
        if (param0 > -103) {
            field_t = null;
            return false;
        }
        return false;
    }

    String f(int param0) {
        Object var3 = null;
        if (param0 >= 70) {
          if (!((gl) this).field_s) {
            return null;
          } else {
            return ((gl) this).field_x;
          }
        } else {
          var3 = null;
          ec discarded$5 = gl.b((String) null, 49);
          if (!((gl) this).field_s) {
            return null;
          } else {
            return ((gl) this).field_x;
          }
        }
    }

    boolean a(char param0, gl param1, int param2, int param3) {
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
            if (param2 == 30) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("gl.K(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0 != 0;
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
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
        StringBuilder stackOut_5_0 = null;
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
              if (param0 == 34) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            L2: {
              if (((gl) this).a(param1, param3, -48, param2)) {
                ((gl) this).a(param3, param2, (byte) 27, param1);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param1;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("gl.KA(").append(param0).append(44);
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    void e(int param0) {
        if (param0 > 0) {
            ((gl) this).field_n = 83;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            field_k = 105;
            field_t = null;
            field_h = null;
            return;
        }
        field_t = null;
        field_h = null;
    }

    final boolean a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
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
              if (param2 < -29) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$6 = ((gl) this).a((StringBuilder) null, (Hashtable) null, -39, -117);
                break L1;
              }
            }
            if (param1.containsKey(this)) {
              StringBuilder discarded$7 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              Object discarded$8 = param1.put(this, this);
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
            stackOut_7_1 = new StringBuilder().append("gl.PB(");
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0 != 0;
    }

    boolean a(byte param0, gl param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
            if (param0 > 2) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              var4 = null;
              boolean discarded$2 = ((gl) this).a((gl) null, -124, 106, 49, -92, 11, (byte) 17);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gl.F(").append(param0).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        cb var6 = null;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        ((gl) this).a((gl) this, param2, param1, 85);
        if (param3 >= 111) {
          var5 = ((gl) this).d(-113) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (ma.field_I == 0) {
                ab.field_k = oh.field_f;
                b.a((byte) 16, ((gl) this).f(105));
                return param0;
              } else {
                ((gl) this).e(-31);
                ab.field_k = oh.field_f;
                b.a((byte) 16, ((gl) this).f(105));
                return param0;
              }
            } else {
              ab.field_k = oh.field_f;
              b.a((byte) 16, ((gl) this).f(105));
              return param0;
            }
          } else {
            if (vj.field_P != 0) {
              if (var5 != 0) {
                L0: {
                  boolean discarded$1 = ((gl) this).a((gl) this, param1, vj.field_P, ef.field_j, param2, jb.field_b, (byte) 37);
                  if (ma.field_I == 0) {
                    break L0;
                  } else {
                    L1: {
                      if (!((gl) this).a(false, mm.field_c, param2, param1, ma.field_I, (gl) this, lm.field_c)) {
                        break L1;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L0;
                    } else {
                      ((gl) this).e(-23);
                      break L0;
                    }
                  }
                }
                if (oh.field_f == 0) {
                  if (0 != ab.field_k) {
                    L2: {
                      ((gl) this).a(79, ef.field_j, param2, param1, jb.field_b, (gl) this);
                      var6 = oj.field_w;
                      if (var6 == null) {
                        break L2;
                      } else {
                        if (!(var6.field_r instanceof fe)) {
                          oj.field_w = null;
                          break L2;
                        } else {
                          ((fe) (Object) var6.field_r).a((hj) null, var6, 98);
                          oj.field_w = null;
                          break L2;
                        }
                      }
                    }
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (ma.field_I != 0) {
                          ((gl) this).e(-31);
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, ((gl) this).f(105));
                          return param0;
                        } else {
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, ((gl) this).f(105));
                          return param0;
                        }
                      } else {
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, ((gl) this).f(105));
                        return param0;
                      }
                    } else {
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, ((gl) this).f(105));
                      return param0;
                    }
                  } else {
                    ab.field_k = oh.field_f;
                    b.a((byte) 16, ((gl) this).f(105));
                    return param0;
                  }
                } else {
                  ab.field_k = oh.field_f;
                  b.a((byte) 16, ((gl) this).f(105));
                  return param0;
                }
              } else {
                L3: {
                  if (ma.field_I == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (!((gl) this).a(false, mm.field_c, param2, param1, ma.field_I, (gl) this, lm.field_c)) {
                        break L4;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L3;
                    } else {
                      L5: {
                        ((gl) this).e(-23);
                        if (oh.field_f != 0) {
                          break L5;
                        } else {
                          if (0 == ab.field_k) {
                            break L5;
                          } else {
                            L6: {
                              ((gl) this).a(79, ef.field_j, param2, param1, jb.field_b, (gl) this);
                              var6 = oj.field_w;
                              if (var6 == null) {
                                break L6;
                              } else {
                                if (!(var6.field_r instanceof fe)) {
                                  oj.field_w = null;
                                  break L6;
                                } else {
                                  ((fe) (Object) var6.field_r).a((hj) null, var6, 98);
                                  oj.field_w = null;
                                  break L6;
                                }
                              }
                            }
                            if (var7 == 0) {
                              break L5;
                            } else {
                              if (var5 == 0) {
                                break L5;
                              } else {
                                if (ma.field_I != 0) {
                                  ((gl) this).e(-31);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, ((gl) this).f(105));
                      return param0;
                    }
                  }
                }
                if (oh.field_f == 0) {
                  if (0 != ab.field_k) {
                    ((gl) this).a(79, ef.field_j, param2, param1, jb.field_b, (gl) this);
                    var6 = oj.field_w;
                    if (var6 == null) {
                      if (var7 != 0) {
                        if (var5 != 0) {
                          if (ma.field_I != 0) {
                            ((gl) this).e(-31);
                            ab.field_k = oh.field_f;
                            b.a((byte) 16, ((gl) this).f(105));
                            return param0;
                          } else {
                            ab.field_k = oh.field_f;
                            b.a((byte) 16, ((gl) this).f(105));
                            return param0;
                          }
                        } else {
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, ((gl) this).f(105));
                          return param0;
                        }
                      } else {
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, ((gl) this).f(105));
                        return param0;
                      }
                    } else {
                      if (!(var6.field_r instanceof fe)) {
                        L7: {
                          oj.field_w = null;
                          if (var7 == 0) {
                            break L7;
                          } else {
                            if (var5 == 0) {
                              break L7;
                            } else {
                              if (ma.field_I != 0) {
                                ((gl) this).e(-31);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, ((gl) this).f(105));
                        return param0;
                      } else {
                        ((fe) (Object) var6.field_r).a((hj) null, var6, 98);
                        L8: {
                          oj.field_w = null;
                          if (var7 == 0) {
                            break L8;
                          } else {
                            if (var5 == 0) {
                              break L8;
                            } else {
                              if (ma.field_I != 0) {
                                ((gl) this).e(-31);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, ((gl) this).f(105));
                        return param0;
                      }
                    }
                  } else {
                    ab.field_k = oh.field_f;
                    b.a((byte) 16, ((gl) this).f(105));
                    return param0;
                  }
                } else {
                  ab.field_k = oh.field_f;
                  b.a((byte) 16, ((gl) this).f(105));
                  return param0;
                }
              }
            } else {
              L9: {
                if (ma.field_I == 0) {
                  break L9;
                } else {
                  L10: {
                    if (!((gl) this).a(false, mm.field_c, param2, param1, ma.field_I, (gl) this, lm.field_c)) {
                      break L10;
                    } else {
                      param0 = false;
                      if (var7 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L9;
                  } else {
                    L11: {
                      ((gl) this).e(-23);
                      if (oh.field_f != 0) {
                        break L11;
                      } else {
                        if (0 == ab.field_k) {
                          break L11;
                        } else {
                          L12: {
                            ((gl) this).a(79, ef.field_j, param2, param1, jb.field_b, (gl) this);
                            var6 = oj.field_w;
                            if (var6 == null) {
                              break L12;
                            } else {
                              if (!(var6.field_r instanceof fe)) {
                                oj.field_w = null;
                                break L12;
                              } else {
                                ((fe) (Object) var6.field_r).a((hj) null, var6, 98);
                                oj.field_w = null;
                                break L12;
                              }
                            }
                          }
                          if (var7 == 0) {
                            break L11;
                          } else {
                            if (var5 == 0) {
                              break L11;
                            } else {
                              if (ma.field_I != 0) {
                                ((gl) this).e(-31);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    ab.field_k = oh.field_f;
                    b.a((byte) 16, ((gl) this).f(105));
                    return param0;
                  }
                }
              }
              if (oh.field_f == 0) {
                if (0 != ab.field_k) {
                  ((gl) this).a(79, ef.field_j, param2, param1, jb.field_b, (gl) this);
                  var6 = oj.field_w;
                  if (var6 == null) {
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (ma.field_I == 0) {
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, ((gl) this).f(105));
                          return param0;
                        } else {
                          ((gl) this).e(-31);
                          ab.field_k = oh.field_f;
                          b.a((byte) 16, ((gl) this).f(105));
                          return param0;
                        }
                      } else {
                        ab.field_k = oh.field_f;
                        b.a((byte) 16, ((gl) this).f(105));
                        return param0;
                      }
                    } else {
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, ((gl) this).f(105));
                      return param0;
                    }
                  } else {
                    if (!(var6.field_r instanceof fe)) {
                      L13: {
                        oj.field_w = null;
                        if (var7 == 0) {
                          break L13;
                        } else {
                          if (var5 == 0) {
                            break L13;
                          } else {
                            if (ma.field_I != 0) {
                              ((gl) this).e(-31);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, ((gl) this).f(105));
                      return param0;
                    } else {
                      ((fe) (Object) var6.field_r).a((hj) null, var6, 98);
                      L14: {
                        oj.field_w = null;
                        if (var7 == 0) {
                          break L14;
                        } else {
                          if (var5 == 0) {
                            break L14;
                          } else {
                            if (ma.field_I != 0) {
                              ((gl) this).e(-31);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      ab.field_k = oh.field_f;
                      b.a((byte) 16, ((gl) this).f(105));
                      return param0;
                    }
                  }
                } else {
                  ab.field_k = oh.field_f;
                  b.a((byte) 16, ((gl) this).f(105));
                  return param0;
                }
              } else {
                ab.field_k = oh.field_f;
                b.a((byte) 16, ((gl) this).f(105));
                return param0;
              }
            }
          }
        } else {
          return true;
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        ((gl) this).field_p = param2;
        if (param1 <= 45) {
            return;
        }
        ((gl) this).field_w = param3;
        ((gl) this).field_u = param0;
        ((gl) this).field_n = param4;
    }

    void a(gl param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param3 >= 25) {
              L1: {
                var5_int = ((gl) this).a(param2, param1, false, jb.field_b, ef.field_j) ? 1 : 0;
                stackOut_2_0 = var5_int;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (((gl) this).field_s) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L1;
                }
              }
              L2: {
                if (stackIn_5_0 == stackIn_5_1) {
                  L3: {
                    stackOut_7_0 = this;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5_int == 0) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  ((gl) this).field_s = stackIn_10_1 != 0;
                  if (((gl) this).field_r == null) {
                    break L2;
                  } else {
                    if (!(((gl) this).field_r instanceof de)) {
                      break L2;
                    } else {
                      ((de) (Object) ((gl) this).field_r).a(true, var5_int != 0, (gl) this);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("gl.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
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
              ((gl) this).field_j = 0;
              if (param0 >= 36) {
                break L1;
              } else {
                boolean discarded$2 = ((gl) this).d(18);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gl.HA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param5 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    int d(byte param0) {
        if (param0 < 23) {
            gl.a(false);
            return 0;
        }
        return 0;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        if (((gl) this).d(-115)) {
            if (((gl) this).a(param1, (gl) this, 30, param0)) {
                return true;
            }
            var4 = -56 % ((param2 - -62) / 48);
            var5 = param0;
            if (var5 == 80) {
                return ((gl) this).a((byte) 98, (gl) this);
            }
            return false;
        }
        var4 = -56 % ((param2 - -62) / 48);
        var5 = param0;
        if (!(var5 != 80)) {
            return ((gl) this).a((byte) 98, (gl) this);
        }
        return false;
    }

    public final String toString() {
        return ((gl) this).a(34, new StringBuilder(), 0, new Hashtable()).toString();
    }

    final void c(int param0) {
        if (param0 != 0) {
          ((gl) this).field_j = -18;
          ((gl) this).a(((gl) this).field_u, (byte) 92, ((gl) this).field_p, ((gl) this).field_w, ((gl) this).field_n);
          return;
        } else {
          ((gl) this).a(((gl) this).field_u, (byte) 92, ((gl) this).field_p, ((gl) this).field_w, ((gl) this).field_n);
          return;
        }
    }

    final void a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((gl) this).field_w).append(",").append(((gl) this).field_u).append(" ").append(((gl) this).field_p).append("x").append(((gl) this).field_n);
              if (null != ((gl) this).field_o) {
                StringBuilder discarded$9 = param3.append(" text=\"").append(((gl) this).field_o).append(34);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((gl) this).field_s) {
                StringBuilder discarded$10 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((gl) this).d(-118)) {
                StringBuilder discarded$11 = param3.append(" focused");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 == 27) {
                break L4;
              } else {
                ((gl) this).a(15, (byte) 16, 121, -54, 36);
                break L4;
              }
            }
            L5: {
              if (((gl) this).field_l != null) {
                L6: {
                  StringBuilder discarded$12 = param3.append(" renderer=");
                  if (((gl) this).field_l instanceof gl) {
                    break L6;
                  } else {
                    StringBuilder discarded$13 = param3.append(((gl) this).field_l);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                param3 = ((gl) this).a(34, param3, 1 + param1, param0);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (null != ((gl) this).field_r) {
                L8: {
                  StringBuilder discarded$14 = param3.append(" listener=");
                  if (((gl) this).field_r instanceof gl) {
                    break L8;
                  } else {
                    StringBuilder discarded$15 = param3.append(((gl) this).field_r);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                param3 = ((gl) this).a(34, param3, param1 - -1, param0);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("gl.QB(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        if (param0 <= -18) {
          var4 = ((gl) this).d((byte) 107);
          var5_int = 0;
          L0: while (true) {
            L1: {
              if (var4 < var5_int) {
                break L1;
              } else {
                ((gl) this).a(param1, -116, var5_int, param2);
                var5_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var5 = ml.e(19290);
            if (var5 == null) {
              return;
            } else {
              vc.field_c.b(lb.field_b, var5, ea.field_m, 4473924);
              return;
            }
          }
        } else {
          field_m = -77;
          var4 = ((gl) this).d((byte) 107);
          var5_int = 0;
          L2: while (true) {
            L3: {
              if (var4 < var5_int) {
                break L3;
              } else {
                ((gl) this).a(param1, -116, var5_int, param2);
                var5_int++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var5 = ml.e(19290);
            if (var5 == null) {
              return;
            } else {
              vc.field_c.b(lb.field_b, var5, ea.field_m, 4473924);
              return;
            }
          }
        }
    }

    final static void c(byte param0) {
        if (q.field_Jb != 10) {
          if (mi.a((byte) -108)) {
            da.field_f = true;
            gl.c((byte) -35);
            return;
          } else {
            ag.a(8468);
            q.field_Jb = 11;
            da.field_f = true;
            gl.c((byte) -35);
            return;
          }
        } else {
          ag.a(8468);
          q.field_Jb = 11;
          da.field_f = true;
          gl.c((byte) -35);
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        Object var7 = null;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (!param2) {
          if (param0 - -((gl) this).field_w <= param4) {
            if (param1 + ((gl) this).field_u > param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param4 >= ((gl) this).field_w + (param0 - -((gl) this).field_p)) {
                    break L1;
                  } else {
                    if (param3 >= param1 - -((gl) this).field_u + ((gl) this).field_n) {
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
          var7 = null;
          ec discarded$1 = gl.b((String) null, -102);
          if (param0 - -((gl) this).field_w <= param4) {
            if (param1 + ((gl) this).field_u <= param3) {
              if (param4 < ((gl) this).field_w + (param0 - -((gl) this).field_p)) {
                if (param3 >= param1 - -((gl) this).field_u + ((gl) this).field_n) {
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

    boolean a(gl param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
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
            if (param6 > 6) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              boolean discarded$2 = ((gl) this).a(-57, '�', (byte) 35);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("gl.DB(");
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
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0 != 0;
    }

    protected gl() {
        ((gl) this).field_y = 0;
        ((gl) this).field_v = 0;
    }

    gl(String param0, cj param1, sc param2) {
        RuntimeException runtimeException = null;
        w var4 = null;
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
        ((gl) this).field_y = 0;
        ((gl) this).field_v = 0;
        try {
          L0: {
            L1: {
              ((gl) this).field_o = param0;
              ((gl) this).field_r = param2;
              ((gl) this).field_l = param1;
              if (!(((gl) this).field_l instanceof w)) {
                break L1;
              } else {
                var4 = (w) (Object) ((gl) this).field_l;
                ((gl) this).field_p = var4.a((gl) this, (byte) 102);
                ((gl) this).field_n = var4.b((gl) this, (byte) 116);
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
            stackOut_4_1 = new StringBuilder().append("gl.<init>(");
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
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    gl(int param0, int param1, int param2, int param3, cj param4, sc param5) {
        ((gl) this).field_y = 0;
        ((gl) this).field_v = 0;
        try {
            ((gl) this).field_n = param3;
            ((gl) this).field_w = param0;
            ((gl) this).field_r = param5;
            ((gl) this).field_p = param2;
            ((gl) this).field_l = param4;
            ((gl) this).field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "gl.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_h = "and activate autofire mode";
        field_i = "Difficulty: Easy";
        field_m = 20;
        field_t = "Saving the game will overwrite your previously saved game.";
    }
}
