/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;

abstract class ua implements kt {
    private int field_k;
    jc field_a;
    private int field_m;
    private int field_i;
    static float[] field_c;
    static int[] field_h;
    private boolean field_e;
    private int field_b;
    private jaclib.memory.heap.NativeHeapBuffer field_f;
    static String field_j;
    private int field_n;
    static bs field_d;
    static int[][] field_l;
    static pa[] field_g;

    final jaclib.memory.Buffer a(jaggl.MapBuffer param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_4_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_11_0 = null;
        jaggl.MapBuffer stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackOut_10_0 = null;
        jaggl.MapBuffer stackOut_15_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackOut_3_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (((ua) this).field_m == 0) {
              this.f(-1);
              if (((ua) this).field_k > 0) {
                L1: {
                  jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                  if (!param1) {
                    break L1;
                  } else {
                    L2: {
                      stackOut_6_0 = ((ua) this).field_b;
                      stackOut_6_1 = ((ua) this).field_i;
                      stackOut_6_2 = null;
                      stackOut_6_3 = 0;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      if (((ua) this).field_e) {
                        stackOut_8_0 = stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = stackIn_8_2;
                        stackOut_8_3 = stackIn_8_3;
                        stackOut_8_4 = 35040;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        stackIn_9_4 = stackOut_8_4;
                        break L2;
                      } else {
                        stackOut_7_0 = stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = stackIn_7_2;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = 35044;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_9_4 = stackOut_7_4;
                        break L2;
                      }
                    }
                    jaggl.OpenGL.glBufferDataARBub(stackIn_9_0, stackIn_9_1, (byte[]) (Object) stackIn_9_2, stackIn_9_3, stackIn_9_4);
                    if (((ua) this).field_n > ((ua) this).field_a.field_Q.c) {
                      break L1;
                    } else {
                      ((ua) this).field_m = 1;
                      stackOut_10_0 = ((ua) this).field_a.field_Q;
                      stackIn_11_0 = stackOut_10_0;
                      return (jaclib.memory.Buffer) (Object) stackIn_11_0;
                    }
                  }
                }
                if (param0.a()) {
                  break L0;
                } else {
                  if (param0.a(((ua) this).field_b, ((ua) this).field_n, 35001)) {
                    ((ua) this).field_m = 2;
                    stackOut_15_0 = (jaggl.MapBuffer) param0;
                    stackIn_16_0 = stackOut_15_0;
                    return (jaclib.memory.Buffer) (Object) stackIn_16_0;
                  } else {
                    break L0;
                  }
                }
              } else {
                ((ua) this).field_m = 2;
                stackOut_3_0 = ((ua) this).field_f;
                stackIn_4_0 = stackOut_3_0;
                return (jaclib.memory.Buffer) (Object) stackIn_4_0;
              }
            } else {
              break L0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ua.D(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + -10386 + ')');
        }
    }

    final void b(int param0) {
        if (((ua) this).field_a.field_Cc) {
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
        }
        if (param0 != -17310) {
            Object var3 = null;
            boolean discarded$0 = ((ua) this).a((jaggl.MapBuffer) null, (byte) 10);
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_l = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_c = null;
        int var1 = -51;
    }

    final static short[] a(dl param0, short[] param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param0.b((byte) 103, 16);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param0.b((byte) -95, 4);
                var6 = (short)param0.b((byte) 89, 16);
                if (0 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (short)(param0.b((byte) 96, var5) + var6);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param1[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (short[]) param1;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ua.L(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 0 + ',' + 16 + ')');
        }
        return stackIn_16_0;
    }

    final boolean a(jaggl.MapBuffer param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -115) {
                break L1;
              } else {
                this.f(53);
                break L1;
              }
            }
            L2: {
              var3_int = 1;
              if (((ua) this).field_m == 0) {
                break L2;
              } else {
                L3: {
                  if (0 >= ((ua) this).field_k) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                    if (((ua) this).field_m == 1) {
                      jaggl.OpenGL.glBufferSubDataARBa(((ua) this).field_b, 0, ((ua) this).field_i, ((ua) this).field_a.field_Q.a());
                      break L3;
                    } else {
                      L4: {
                        if (!param0.b()) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          break L4;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          break L4;
                        }
                      }
                      var3_int = stackIn_8_0;
                      break L3;
                    }
                  }
                }
                ((ua) this).field_m = 0;
                break L2;
              }
            }
            stackOut_11_0 = var3_int;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ua.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    void a(int param0, int param1) {
        if (param0 != -12880) {
            return;
        }
        if (((ua) this).field_i < param1) {
            this.f(-1);
            if (((ua) this).field_k > 0) {
                jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                jaggl.OpenGL.glBufferDataARBub(((ua) this).field_b, param1, (byte[]) null, 0, !((ua) this).field_e ? 35044 : 35040);
                ((ua) this).field_a.field_j = ((ua) this).field_a.field_j + (-((ua) this).field_i + param1);
            } else {
                ((ua) this).field_f = ((ua) this).field_a.a((byte) -77, param1, false);
            }
            ((ua) this).field_i = param1;
        }
        ((ua) this).field_n = param1;
    }

    void a(int param0) {
        if (((ua) this).field_k > 0) {
            ((ua) this).field_a.a(((ua) this).field_n, 9841, ((ua) this).field_k);
            ((ua) this).field_k = -1;
        }
        if (param0 != 4665) {
            field_d = null;
        }
    }

    protected final void finalize() throws Throwable {
        ((ua) this).a(4665);
        super.finalize();
    }

    final static void e() {
        Object var2 = null;
        ub.a("", (String) null, -89);
    }

    private final void f(int param0) {
        if (~((ua) this).field_k <= param0) {
            return;
        }
        if (!((ua) this).field_a.field_Cc) {
            ((ua) this).field_k = 0;
        } else {
            jaggl.OpenGL.glGenBuffersARB(1, ci.field_m, 0);
            ((ua) this).field_k = ci.field_m[0];
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
        }
    }

    final long b(byte param0) {
        if (param0 <= 29) {
            return -98L;
        }
        return ((ua) this).field_k == 0 ? ((ua) this).field_f.a() : 0L;
    }

    final static void c(int param0) {
        oj.a(26099, bm.m(124));
    }

    final static void a(String param0, boolean param1, byte param2) {
        try {
            int var3_int = 117 % ((16 - param2) / 58);
            ae.field_f = param1 ? true : false;
            ss.field_t = true;
            ml.field_m = new oo(vn.field_f, b.field_c, param0, nf.field_a, ae.field_f);
            vn.field_f.a((ea) (Object) ml.field_m, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ua.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ua(jc param0, int param1, boolean param2) {
        ((ua) this).field_m = 0;
        ((ua) this).field_k = -1;
        try {
            ((ua) this).field_e = param2 ? true : false;
            ((ua) this).field_b = param1;
            ((ua) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
        field_h = new int[4096];
        for (var0 = 0; var0 < 4096; var0++) {
            field_h[var0] = it.a(var0, -1);
        }
        field_d = new bs();
        field_l = new int[8][];
    }
}
