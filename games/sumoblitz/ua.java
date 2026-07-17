/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;

abstract class ua implements ot {
    on field_f;
    private int field_b;
    private int field_e;
    private boolean field_j;
    static tg field_n;
    private int field_l;
    private int field_c;
    private jaclib.memory.heap.NativeHeapBuffer field_m;
    private int field_k;
    static int[] field_h;
    static String field_i;
    static int field_a;
    static hr[] field_g;
    static int field_d;

    final static wb[] a(int param0, int param1) {
        wb[] var3 = new wb[9];
        wb[] var2 = var3;
        var3[4] = wg.a(64, param0, 3);
        if (param1 >= -114) {
            wb[] discarded$0 = ua.a(63, -120);
        }
        return var2;
    }

    final jaclib.memory.Buffer a(boolean param0, int param1, jaggl.MapBuffer param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_4_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        Object stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_13_0 = null;
        jaggl.MapBuffer stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        Object stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackOut_12_0 = null;
        jaggl.MapBuffer stackOut_17_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackOut_3_0 = null;
        Object stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (((ua) this).field_b == 0) {
                this.d(0);
                if (((ua) this).field_c > 0) {
                  L2: {
                    jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
                    if (param0) {
                      L3: {
                        stackOut_7_0 = ((ua) this).field_k;
                        stackOut_7_1 = ((ua) this).field_e;
                        stackOut_7_2 = null;
                        stackOut_7_3 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        if (((ua) this).field_j) {
                          stackOut_9_0 = stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = stackIn_9_2;
                          stackOut_9_3 = stackIn_9_3;
                          stackOut_9_4 = 35040;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          stackIn_10_3 = stackOut_9_3;
                          stackIn_10_4 = stackOut_9_4;
                          break L3;
                        } else {
                          stackOut_8_0 = stackIn_8_0;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = stackIn_8_2;
                          stackOut_8_3 = stackIn_8_3;
                          stackOut_8_4 = 35044;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_10_3 = stackOut_8_3;
                          stackIn_10_4 = stackOut_8_4;
                          break L3;
                        }
                      }
                      jaggl.OpenGL.glBufferDataARBub(stackIn_10_0, stackIn_10_1, (byte[]) (Object) stackIn_10_2, stackIn_10_3, stackIn_10_4);
                      if (((ua) this).field_l <= ((ua) this).field_f.field_z.c) {
                        ((ua) this).field_b = 1;
                        stackOut_12_0 = ((ua) this).field_f.field_z;
                        stackIn_13_0 = stackOut_12_0;
                        return (jaclib.memory.Buffer) (Object) stackIn_13_0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (param2.a()) {
                    break L1;
                  } else {
                    if (param2.a(((ua) this).field_k, ((ua) this).field_l, 35001)) {
                      ((ua) this).field_b = 2;
                      stackOut_17_0 = (jaggl.MapBuffer) param2;
                      stackIn_18_0 = stackOut_17_0;
                      return (jaclib.memory.Buffer) (Object) stackIn_18_0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  ((ua) this).field_b = 2;
                  stackOut_3_0 = ((ua) this).field_m;
                  stackIn_4_0 = stackOut_3_0;
                  return (jaclib.memory.Buffer) (Object) stackIn_4_0;
                }
              } else {
                break L1;
              }
            }
            if (param1 != 2) {
              var5 = null;
              jaclib.memory.Buffer discarded$2 = ((ua) this).a(true, 66, (jaggl.MapBuffer) null);
              stackOut_21_0 = null;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("ua.O(").append(param0).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return (jaclib.memory.Buffer) (Object) stackIn_22_0;
    }

    final static void a(int param0, ah param1) {
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
              kf.field_u = param1;
              im.field_b = new jn();
              up.field_a = fi.a(640, he.field_o, (byte) -96) << 8;
              cv.field_E = fi.a(480, he.field_o, (byte) -96) << 8;
              sr.d(22030);
              if (param0 == 35040) {
                break L1;
              } else {
                wb[] discarded$2 = ua.a(116, -119);
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
            stackOut_3_1 = new StringBuilder().append("ua.M(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void d(int param0) {
        if (((ua) this).field_c >= 0) {
            return;
        }
        if (!((ua) this).field_f.field_Nc) {
            ((ua) this).field_c = 0;
        } else {
            jaggl.OpenGL.glGenBuffersARB(1, jp.field_k, 0);
            ((ua) this).field_c = jp.field_k[0];
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
        }
        field_n = null;
    }

    void b(int param0) {
        if (0 < ((ua) this).field_c) {
            ((ua) this).field_f.a((byte) -99, ((ua) this).field_l, ((ua) this).field_c);
            ((ua) this).field_c = -1;
        }
        if (param0 != 12001) {
            ((ua) this).field_e = 82;
        }
    }

    final long c(int param0) {
        if (param0 != -24168) {
            return 1L;
        }
        return ((ua) this).field_c == 0 ? ((ua) this).field_m.c() : 0L;
    }

    final static void f(int param0) {
        if (!(null != vv.field_b)) {
            throw new IllegalStateException("NGR");
        }
        if (param0 != -5812) {
            field_n = null;
        }
        vv.field_b.field_g = true;
        jl.a(param0 + 5837, 1);
    }

    final static String a(byte param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_4_0 = null;
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
              if (param0 >= 5) {
                break L1;
              } else {
                ua.f(77);
                break L1;
              }
            }
            if (en.field_h.startsWith("win")) {
              stackOut_10_0 = param1 + ".dll";
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              if (!en.field_h.startsWith("linux")) {
                if (en.field_h.startsWith("mac")) {
                  stackOut_8_0 = "lib" + param1 + ".dylib";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  return null;
                }
              } else {
                stackOut_4_0 = "lib" + param1 + ".so";
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("ua.N(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_11_0;
    }

    void a(byte param0, int param1) {
        if (param1 > ((ua) this).field_e) {
            this.d(0);
            if (((ua) this).field_c > 0) {
                jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
                jaggl.OpenGL.glBufferDataARBub(((ua) this).field_k, param1, (byte[]) null, 0, ((ua) this).field_j ? 35040 : 35044);
                ((ua) this).field_f.field_o = ((ua) this).field_f.field_o + (-((ua) this).field_e + param1);
            } else {
                ((ua) this).field_m = ((ua) this).field_f.a(false, false, param1);
            }
            ((ua) this).field_e = param1;
        }
        ((ua) this).field_l = param1;
        if (param0 >= -67) {
            ((ua) this).e(-122);
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, pl param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
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
        byte[] stackOut_15_0 = null;
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param3.b(param0, (byte) -87);
            if (var4_int != param1) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (var4_int != param2.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param2 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.b(3, (byte) -94);
                var6 = (byte)param3.b(8, (byte) -117);
                if (var5 > 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param2[var7] = (byte)(var6 + param3.b(var5, (byte) -127));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (byte[]) param2;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ua.V(").append(param0).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
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
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    protected final void finalize() throws Throwable {
        ((ua) this).b(12001);
        super.finalize();
    }

    final void e(int param0) {
        if (param0 != 1175993800) {
            Object var3 = null;
            boolean discarded$0 = ((ua) this).a((jaggl.MapBuffer) null, (byte) 48);
        }
        if (!(!((ua) this).field_f.field_Nc)) {
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
        }
    }

    ua(on param0, int param1, boolean param2) {
        ((ua) this).field_b = 0;
        ((ua) this).field_c = -1;
        try {
            ((ua) this).field_j = param2 ? true : false;
            ((ua) this).field_f = param0;
            ((ua) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ua.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -96;
        field_h = null;
        field_g = null;
        field_n = null;
    }

    final boolean a(jaggl.MapBuffer param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
              var3_int = 1;
              if (((ua) this).field_b == 0) {
                break L1;
              } else {
                L2: {
                  if (((ua) this).field_c <= 0) {
                    break L2;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
                    if (1 != ((ua) this).field_b) {
                      L3: {
                        if (!param0.b()) {
                          stackOut_6_0 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          break L3;
                        } else {
                          stackOut_5_0 = 1;
                          stackIn_7_0 = stackOut_5_0;
                          break L3;
                        }
                      }
                      var3_int = stackIn_7_0;
                      break L2;
                    } else {
                      jaggl.OpenGL.glBufferSubDataARBa(((ua) this).field_k, 0, ((ua) this).field_e, ((ua) this).field_f.field_z.c());
                      break L2;
                    }
                  }
                }
                ((ua) this).field_b = 0;
                break L1;
              }
            }
            L4: {
              if (param1 == 92) {
                break L4;
              } else {
                ((ua) this).field_f = null;
                break L4;
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
            stackOut_13_1 = new StringBuilder().append("ua.R(");
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
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new tg();
        field_h = new int[8192];
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = 0;
    }
}
