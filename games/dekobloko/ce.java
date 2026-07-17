/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class ce extends bh {
    int field_x;
    static w field_A;
    int field_D;
    int field_F;
    static boolean field_w;
    String field_E;
    static int field_r;
    int field_t;
    int field_y;
    gl field_p;
    static String field_z;
    static ck[] field_s;
    int field_o;
    boolean field_q;
    int field_u;
    static qc field_C;
    String field_B;
    cf field_n;
    kg field_v;

    String c(byte param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 113) {
          L0: {
            field_s = null;
            if (((ce) this).field_q) {
              stackOut_7_0 = ((ce) this).field_B;
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
            if (((ce) this).field_q) {
              stackOut_3_0 = ((ce) this).field_B;
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

    boolean a(boolean param0, ce param1) {
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
            if (!param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_A = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ce.EC(").append(param0).append(44);
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
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void f(int param0) {
        if (param0 <= 106) {
          int discarded$2 = ((ce) this).d(52);
          ((ce) this).b(((ce) this).field_y, ((ce) this).field_t, ((ce) this).field_u, ((ce) this).field_D, -16555);
          return;
        } else {
          ((ce) this).b(((ce) this).field_y, ((ce) this).field_t, ((ce) this).field_u, ((ce) this).field_D, -16555);
          return;
        }
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        Object stackOut_1_0 = null;
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
            if (param3) {
              L1: {
                if (((ce) this).a(0, param1, param0, param2)) {
                  ((ce) this).a((byte) 72, param2, param0, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = (StringBuilder) param2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ce.MB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == 0) {
              if (param2.containsKey(this)) {
                StringBuilder discarded$4 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                Object discarded$5 = param2.put(this, this);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
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
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ce.HC(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 0;
        if (!((ce) this).a(true)) {
          var4 = param0;
          if (var4 != 80) {
            if (param2 < 100) {
              return true;
            } else {
              return false;
            }
          } else {
            return ((ce) this).a(false, (ce) this);
          }
        } else {
          if (!((ce) this).a(59, param0, (ce) this, param1)) {
            var4 = param0;
            if (var4 != 80) {
              if (param2 < 100) {
                return true;
              } else {
                return false;
              }
            } else {
              return ((ce) this).a(false, (ce) this);
            }
          } else {
            return true;
          }
        }
    }

    boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
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
            if (!param6) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_C = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("ce.FC(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (param2 != 0) {
            break L0;
          } else {
            if (null != ((ce) this).field_p) {
              ((ce) this).field_p.a(true, param0, param3, (byte) -118, (ce) this);
              break L0;
            } else {
              if (param1 <= -103) {
                return;
              } else {
                ce.a(-50, -124, -49, 105, 114, (String) null, (fd) null, -111, -67);
                return;
              }
            }
          }
        }
        if (param1 <= -103) {
          return;
        } else {
          ce.a(-50, -124, -49, 105, 114, (String) null, (fd) null, -111, -67);
          return;
        }
    }

    ce(String param0, kg param1) {
        this(param0, bf.field_x.field_k, param1);
    }

    final static void a(int param0, byte param1, int param2, String param3, int param4, String param5) {
        uf var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
              var6 = we.field_b;
              var6.f(param0, -4);
              var6.field_n = var6.field_n + 1;
              var7 = var6.field_n;
              var6.a(true, param2);
              if (param1 == -85) {
                break L1;
              } else {
                ce.e(9);
                break L1;
              }
            }
            L2: {
              if (2 == param2) {
                var6.a(0, param3);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param5 != null) {
                int discarded$6 = ij.a(-20539, (wl) (Object) var6, param5);
                break L3;
              } else {
                var6.d(-1, param4);
                if (!client.field_A) {
                  break L3;
                } else {
                  int discarded$7 = ij.a(-20539, (wl) (Object) var6, param5);
                  break L3;
                }
              }
            }
            var6.b(var6.field_n - var7, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6_ref;
            stackOut_12_1 = new StringBuilder().append("ce.NB(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param4).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static void a(int param0, ki param1, int param2) {
        if (param2 != -697) {
            return;
        }
        try {
            cg.field_c.a((bh) (Object) param1, 2777);
            kk.a(param0, -15016, param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ce.GC(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        ((ce) this).field_y = param0;
        ((ce) this).field_t = param1;
        ((ce) this).field_D = param3;
        ((ce) this).field_u = param2;
        if (param4 == -16555) {
          return;
        } else {
          boolean discarded$2 = ((ce) this).a(68, true, -45, 80);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, fd param6, int param7, int param8) {
        cb.field_c = param4;
        fh.field_f = param2;
        bl.field_U = param6;
        gm.field_H = param0;
        hh.field_f = param8;
        pe.field_b = param5;
        cn.field_U = param3;
        if (param7 != 0) {
            return;
        }
        try {
            vm.field_w = param1;
            ta.field_k = (dd) (Object) new qb();
            qb.field_r = new im(param6);
            sc.field_l = new ne(ta.field_k, qb.field_r);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ce.SB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    int d(int param0) {
        int var2 = 7 / ((param0 - 36) / 51);
        return 0;
    }

    final static void e(int param0) {
        String var1 = null;
        String var2 = null;
        L0: {
          if (null != ub.field_c) {
            var2 = ub.field_c;
            var1 = var2;
            jb.a((byte) 107, cm.a((byte) 117, sl.field_d, new String[1]));
            ub.field_c = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > 99) {
          return;
        } else {
          field_C = null;
          return;
        }
    }

    boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
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
              if (!((ce) this).a(param1, (byte) -83, param4, param0, param5)) {
                break L1;
              } else {
                ((ce) this).field_o = param3;
                break L1;
              }
            }
            if (param6 == -55) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              boolean discarded$2 = ((ce) this).a(19, (byte) 11, -125, -81, -78);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("ce.LB(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_5_0 != 0;
    }

    void a(ce param0, int param1, int param2, int param3) {
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
              var5_int = ((ce) this).a(bh.field_g, (byte) -87, param2, pm.field_f, param3) ? 1 : 0;
              if (((ce) this).field_q) {
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
              if (stackIn_3_0 == var5_int) {
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
                ((ce) this).field_q = stackIn_8_1 != 0;
                if (((ce) this).field_v == null) {
                  break L2;
                } else {
                  if (((ce) this).field_v instanceof gj) {
                    ((gj) (Object) ((ce) this).field_v).a(var5_int != 0, (ce) this, true);
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
              if (param1 >= 38) {
                break L4;
              } else {
                field_w = false;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ce.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    void d(byte param0) {
        if (param0 == -95) {
            return;
        }
        ((ce) this).field_B = null;
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var4 = ((ce) this).d(94);
        var5_int = 0;
        if (param2 == -72) {
          L0: while (true) {
            L1: {
              if (var5_int > var4) {
                break L1;
              } else {
                ((ce) this).a(param1, -118, var5_int, param0);
                var5_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = ea.b(true);
              if (var5 != null) {
                bf.field_x.a(var5, param2 + 71, dh.field_e, pa.field_Z);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          ((ce) this).a(-73, -87, 50, 71);
          L3: while (true) {
            L4: {
              if (var5_int > var4) {
                break L4;
              } else {
                ((ce) this).a(param1, -118, var5_int, param0);
                var5_int++;
                if (var6 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var5 = ea.b(true);
              if (var5 != null) {
                bf.field_x.a(var5, param2 + 71, dh.field_e, pa.field_Z);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
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
              ((ce) this).field_o = 0;
              if (param1 == 64) {
                break L1;
              } else {
                String discarded$2 = ((ce) this).toString();
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
            stackOut_3_1 = new StringBuilder().append("ce.IB(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        se var6 = null;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        ((ce) this).a((ce) this, 79, param0, param2);
        var5 = ((ce) this).a(true) ? 1 : 0;
        if (!param1) {
          L0: {
            if (var5 == 0) {
              break L0;
            } else {
              if (ig.field_Yb != 0) {
                ((ce) this).d((byte) -95);
                break L0;
              } else {
                if (param3 == 29166) {
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                } else {
                  ((ce) this).field_D = 110;
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                }
              }
            }
          }
          if (param3 == 29166) {
            tm.field_d = be.field_n;
            sa.a(((ce) this).c((byte) 113), -1);
            return param1;
          } else {
            ((ce) this).field_D = 110;
            tm.field_d = be.field_n;
            sa.a(((ce) this).c((byte) 113), -1);
            return param1;
          }
        } else {
          if (jk.field_c != 0) {
            if (var5 != 0) {
              L1: {
                boolean discarded$1 = ((ce) this).a(pm.field_f, param0, bh.field_g, (ce) this, jk.field_c, param2, false);
                if (ig.field_Yb != 0) {
                  L2: {
                    if (!((ce) this).a(nf.field_h, he.field_S, (ce) this, ig.field_Yb, param0, param2, (byte) -55)) {
                      break L2;
                    } else {
                      param1 = false;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L1;
                  } else {
                    ((ce) this).d((byte) -95);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (be.field_n == 0) {
                if (tm.field_d != 0) {
                  ((ce) this).a(pm.field_f, 64, param2, (ce) this, param0, bh.field_g);
                  var6 = lg.field_Y;
                  if (var6 != null) {
                    if (!(var6.field_v instanceof na)) {
                      L3: {
                        lg.field_Y = null;
                        if (var7 == 0) {
                          break L3;
                        } else {
                          if (var5 == 0) {
                            break L3;
                          } else {
                            if (ig.field_Yb != 0) {
                              ((ce) this).d((byte) -95);
                              break L3;
                            } else {
                              if (param3 != 29166) {
                                ((ce) this).field_D = 110;
                                tm.field_d = be.field_n;
                                sa.a(((ce) this).c((byte) 113), -1);
                                return param1;
                              } else {
                                tm.field_d = be.field_n;
                                sa.a(((ce) this).c((byte) 113), -1);
                                return param1;
                              }
                            }
                          }
                        }
                      }
                      if (param3 != 29166) {
                        ((ce) this).field_D = 110;
                        tm.field_d = be.field_n;
                        sa.a(((ce) this).c((byte) 113), -1);
                        return param1;
                      } else {
                        tm.field_d = be.field_n;
                        sa.a(((ce) this).c((byte) 113), -1);
                        return param1;
                      }
                    } else {
                      ((na) (Object) var6.field_v).a(var6, (id) null, (byte) -128);
                      L4: {
                        lg.field_Y = null;
                        if (var7 == 0) {
                          break L4;
                        } else {
                          if (var5 == 0) {
                            break L4;
                          } else {
                            if (ig.field_Yb != 0) {
                              ((ce) this).d((byte) -95);
                              break L4;
                            } else {
                              if (param3 != 29166) {
                                ((ce) this).field_D = 110;
                                tm.field_d = be.field_n;
                                sa.a(((ce) this).c((byte) 113), -1);
                                return param1;
                              } else {
                                tm.field_d = be.field_n;
                                sa.a(((ce) this).c((byte) 113), -1);
                                return param1;
                              }
                            }
                          }
                        }
                      }
                      if (param3 != 29166) {
                        ((ce) this).field_D = 110;
                        tm.field_d = be.field_n;
                        sa.a(((ce) this).c((byte) 113), -1);
                        return param1;
                      } else {
                        tm.field_d = be.field_n;
                        sa.a(((ce) this).c((byte) 113), -1);
                        return param1;
                      }
                    }
                  } else {
                    L5: {
                      if (var7 == 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          break L5;
                        } else {
                          if (ig.field_Yb != 0) {
                            ((ce) this).d((byte) -95);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (param3 != 29166) {
                      ((ce) this).field_D = 110;
                      tm.field_d = be.field_n;
                      sa.a(((ce) this).c((byte) 113), -1);
                      return param1;
                    } else {
                      tm.field_d = be.field_n;
                      sa.a(((ce) this).c((byte) 113), -1);
                      return param1;
                    }
                  }
                } else {
                  L6: {
                    if (param3 == 29166) {
                      break L6;
                    } else {
                      ((ce) this).field_D = 110;
                      break L6;
                    }
                  }
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                }
              } else {
                if (param3 != 29166) {
                  ((ce) this).field_D = 110;
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                } else {
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                }
              }
            } else {
              L7: {
                if (ig.field_Yb != 0) {
                  L8: {
                    if (!((ce) this).a(nf.field_h, he.field_S, (ce) this, ig.field_Yb, param0, param2, (byte) -55)) {
                      break L8;
                    } else {
                      param1 = false;
                      if (var7 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L7;
                  } else {
                    ((ce) this).d((byte) -95);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              if (be.field_n != 0) {
                if (param3 != 29166) {
                  ((ce) this).field_D = 110;
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                } else {
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                }
              } else {
                if (tm.field_d != 0) {
                  ((ce) this).a(pm.field_f, 64, param2, (ce) this, param0, bh.field_g);
                  var6 = lg.field_Y;
                  if (var6 != null) {
                    if (!(var6.field_v instanceof na)) {
                      L9: {
                        lg.field_Y = null;
                        if (var7 == 0) {
                          break L9;
                        } else {
                          if (var5 == 0) {
                            break L9;
                          } else {
                            if (ig.field_Yb != 0) {
                              ((ce) this).d((byte) -95);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      L10: {
                        if (param3 == 29166) {
                          break L10;
                        } else {
                          ((ce) this).field_D = 110;
                          break L10;
                        }
                      }
                      tm.field_d = be.field_n;
                      sa.a(((ce) this).c((byte) 113), -1);
                      return param1;
                    } else {
                      ((na) (Object) var6.field_v).a(var6, (id) null, (byte) -128);
                      L11: {
                        lg.field_Y = null;
                        if (var7 == 0) {
                          break L11;
                        } else {
                          if (var5 == 0) {
                            break L11;
                          } else {
                            if (ig.field_Yb != 0) {
                              ((ce) this).d((byte) -95);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      L12: {
                        if (param3 == 29166) {
                          break L12;
                        } else {
                          ((ce) this).field_D = 110;
                          break L12;
                        }
                      }
                      tm.field_d = be.field_n;
                      sa.a(((ce) this).c((byte) 113), -1);
                      return param1;
                    }
                  } else {
                    L13: {
                      if (var7 == 0) {
                        break L13;
                      } else {
                        if (var5 == 0) {
                          break L13;
                        } else {
                          if (ig.field_Yb != 0) {
                            ((ce) this).d((byte) -95);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L14: {
                      if (param3 == 29166) {
                        break L14;
                      } else {
                        ((ce) this).field_D = 110;
                        break L14;
                      }
                    }
                    tm.field_d = be.field_n;
                    sa.a(((ce) this).c((byte) 113), -1);
                    return param1;
                  }
                } else {
                  L15: {
                    if (param3 == 29166) {
                      break L15;
                    } else {
                      ((ce) this).field_D = 110;
                      break L15;
                    }
                  }
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                }
              }
            }
          } else {
            L16: {
              if (ig.field_Yb != 0) {
                L17: {
                  if (!((ce) this).a(nf.field_h, he.field_S, (ce) this, ig.field_Yb, param0, param2, (byte) -55)) {
                    break L17;
                  } else {
                    param1 = false;
                    if (var7 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                if (var5 == 0) {
                  break L16;
                } else {
                  ((ce) this).d((byte) -95);
                  break L16;
                }
              } else {
                break L16;
              }
            }
            if (be.field_n != 0) {
              if (param3 != 29166) {
                ((ce) this).field_D = 110;
                tm.field_d = be.field_n;
                sa.a(((ce) this).c((byte) 113), -1);
                return param1;
              } else {
                tm.field_d = be.field_n;
                sa.a(((ce) this).c((byte) 113), -1);
                return param1;
              }
            } else {
              if (tm.field_d != 0) {
                ((ce) this).a(pm.field_f, 64, param2, (ce) this, param0, bh.field_g);
                var6 = lg.field_Y;
                if (var6 != null) {
                  if (!(var6.field_v instanceof na)) {
                    L18: {
                      lg.field_Y = null;
                      if (var7 == 0) {
                        break L18;
                      } else {
                        if (var5 == 0) {
                          break L18;
                        } else {
                          if (ig.field_Yb != 0) {
                            ((ce) this).d((byte) -95);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    L19: {
                      if (param3 == 29166) {
                        break L19;
                      } else {
                        ((ce) this).field_D = 110;
                        break L19;
                      }
                    }
                    tm.field_d = be.field_n;
                    sa.a(((ce) this).c((byte) 113), -1);
                    return param1;
                  } else {
                    ((na) (Object) var6.field_v).a(var6, (id) null, (byte) -128);
                    L20: {
                      lg.field_Y = null;
                      if (var7 == 0) {
                        break L20;
                      } else {
                        if (var5 == 0) {
                          break L20;
                        } else {
                          if (ig.field_Yb != 0) {
                            ((ce) this).d((byte) -95);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    L21: {
                      if (param3 == 29166) {
                        break L21;
                      } else {
                        ((ce) this).field_D = 110;
                        break L21;
                      }
                    }
                    tm.field_d = be.field_n;
                    sa.a(((ce) this).c((byte) 113), -1);
                    return param1;
                  }
                } else {
                  L22: {
                    if (var7 == 0) {
                      break L22;
                    } else {
                      if (var5 == 0) {
                        break L22;
                      } else {
                        if (ig.field_Yb != 0) {
                          ((ce) this).d((byte) -95);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  L23: {
                    if (param3 == 29166) {
                      break L23;
                    } else {
                      ((ce) this).field_D = 110;
                      break L23;
                    }
                  }
                  tm.field_d = be.field_n;
                  sa.a(((ce) this).c((byte) 113), -1);
                  return param1;
                }
              } else {
                L24: {
                  if (param3 == 29166) {
                    break L24;
                  } else {
                    ((ce) this).field_D = 110;
                    break L24;
                  }
                }
                tm.field_d = be.field_n;
                sa.a(((ce) this).c((byte) 113), -1);
                return param1;
              }
            }
          }
        }
    }

    public final String toString() {
        return ((ce) this).a(new Hashtable(), 0, new StringBuilder(), true).toString();
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 <= -29) {
          if (param0 >= param4 + ((ce) this).field_u) {
            if (param2 - -((ce) this).field_D > param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((ce) this).field_t + (((ce) this).field_u + param4) <= param0) {
                    break L1;
                  } else {
                    if (param3 >= ((ce) this).field_y + ((ce) this).field_D + param2) {
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
          ce.a(-81, (byte) -68, -126, (String) null, 93, (String) null);
          if (param0 >= param4 + ((ce) this).field_u) {
            if (param2 - -((ce) this).field_D <= param3) {
              if (((ce) this).field_t + (((ce) this).field_u + param4) > param0) {
                if (param3 >= ((ce) this).field_y + ((ce) this).field_D + param2) {
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

    boolean a(int param0, int param1, ce param2, char param3) {
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
            var5_int = -128 / ((-22 - param0) / 49);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("ce.QA(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 41);
        }
        return stackIn_1_0 != 0;
    }

    public static void c(int param0) {
        field_s = null;
        field_A = null;
        field_C = null;
        field_z = null;
        if (param0 > 52) {
          return;
        } else {
          ce.a(-104, 121, -47, 103, 95, (String) null, (fd) null, -67, -90);
          return;
        }
    }

    final void a(byte param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 72) {
                break L1;
              } else {
                ce.a(80, (byte) -66, 85, (String) null, 114, (String) null);
                break L1;
              }
            }
            L2: {
              StringBuilder discarded$8 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((ce) this).field_u).append(",").append(((ce) this).field_D).append(" ").append(((ce) this).field_t).append("x").append(((ce) this).field_y);
              if (((ce) this).field_E != null) {
                StringBuilder discarded$9 = param1.append(" text=\"").append(((ce) this).field_E).append(34);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!((ce) this).field_q) {
                break L3;
              } else {
                StringBuilder discarded$10 = param1.append(" mouseover");
                break L3;
              }
            }
            L4: {
              if (((ce) this).a(true)) {
                StringBuilder discarded$11 = param1.append(" focused");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != ((ce) this).field_p) {
                L6: {
                  StringBuilder discarded$12 = param1.append(" renderer=");
                  if (!(((ce) this).field_p instanceof ce)) {
                    break L6;
                  } else {
                    param1 = ((ce) this).a(param2, param3 + 1, param1, true);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                StringBuilder discarded$13 = param1.append(((ce) this).field_p);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (((ce) this).field_v != null) {
                L8: {
                  StringBuilder discarded$14 = param1.append(" listener=");
                  if (((ce) this).field_v instanceof ce) {
                    break L8;
                  } else {
                    StringBuilder discarded$15 = param1.append(((ce) this).field_v);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                param1 = ((ce) this).a(param2, 1 + param3, param1, true);
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
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("ce.VB(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param3 + 41);
        }
    }

    boolean a(boolean param0) {
        if (!param0) {
            ce.e(120);
            return false;
        }
        return false;
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4) {
        ck[] var5 = null;
        ck[] var6 = null;
        var6 = new ck[9];
        var5 = var6;
        if (param1 >= -10) {
          L0: {
            field_z = null;
            ck dupTemp$4 = sm.a((byte) -125, param0, param3);
            var6[6] = dupTemp$4;
            var5[3] = dupTemp$4;
            var5[2] = dupTemp$4;
            var5[1] = dupTemp$4;
            var5[0] = dupTemp$4;
            ck dupTemp$5 = sm.a((byte) -109, param0, param2);
            var6[8] = dupTemp$5;
            var5[7] = dupTemp$5;
            var5[5] = dupTemp$5;
            if (0 != param4) {
              var6[4] = sm.a((byte) -121, 64, param4);
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        } else {
          L1: {
            ck dupTemp$6 = sm.a((byte) -125, param0, param3);
            var6[6] = dupTemp$6;
            var5[3] = dupTemp$6;
            var5[2] = dupTemp$6;
            var5[1] = dupTemp$6;
            var5[0] = dupTemp$6;
            ck dupTemp$7 = sm.a((byte) -109, param0, param2);
            var6[8] = dupTemp$7;
            var5[7] = dupTemp$7;
            var5[5] = dupTemp$7;
            if (0 != param4) {
              var6[4] = sm.a((byte) -121, 64, param4);
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
        }
    }

    protected ce() {
        ((ce) this).field_F = 0;
        ((ce) this).field_x = 0;
    }

    ce(String param0, gl param1, kg param2) {
        RuntimeException runtimeException = null;
        nl var4 = null;
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
        ((ce) this).field_F = 0;
        ((ce) this).field_x = 0;
        try {
          L0: {
            L1: {
              ((ce) this).field_v = param2;
              ((ce) this).field_E = param0;
              ((ce) this).field_p = param1;
              if (!(((ce) this).field_p instanceof nl)) {
                break L1;
              } else {
                var4 = (nl) (Object) ((ce) this).field_p;
                ((ce) this).field_t = var4.b((ce) this, 0);
                ((ce) this).field_y = var4.a((ce) this, -49);
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
            stackOut_4_1 = new StringBuilder().append("ce.<init>(");
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
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    ce(int param0, int param1, int param2, int param3, gl param4, kg param5) {
        ((ce) this).field_F = 0;
        ((ce) this).field_x = 0;
        try {
            ((ce) this).field_D = param1;
            ((ce) this).field_y = param3;
            ((ce) this).field_u = param0;
            ((ce) this).field_t = param2;
            ((ce) this).field_p = param4;
            ((ce) this).field_v = param5;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ce.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "To server list";
    }
}
