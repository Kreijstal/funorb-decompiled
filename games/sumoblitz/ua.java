/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
        wb[] discarded$2 = null;
        wb[] var2 = null;
        wb[] var3 = null;
        var3 = new wb[9];
        var2 = var3;
        var3[4] = wg.a(64, param0, 3);
        if (param1 >= -114) {
          discarded$2 = ua.a(63, -120);
          return var2;
        } else {
          return var2;
        }
    }

    final jaclib.memory.Buffer a(boolean param0, int param1, jaggl.MapBuffer param2) {
        jaclib.memory.Buffer discarded$2 = null;
        RuntimeException var4 = null;
        jaggl.MapBuffer var5 = null;
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
        int decompiledRegionSelector0 = 0;
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
              if (this.field_b == 0) {
                this.d(0);
                if (this.field_c > 0) {
                  L2: {
                    jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
                    if (param0) {
                      L3: {
                        stackOut_7_0 = this.field_k;
                        stackOut_7_1 = this.field_e;
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
                        if (this.field_j) {
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
                      jaggl.OpenGL.glBufferDataARBub(stackIn_10_0, stackIn_10_1, (byte[]) ((Object) stackIn_10_2), stackIn_10_3, stackIn_10_4);
                      if (this.field_l <= this.field_f.field_z.c) {
                        this.field_b = 1;
                        stackOut_12_0 = this.field_f.field_z;
                        stackIn_13_0 = stackOut_12_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
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
                    if (param2.a(this.field_k, this.field_l, 35001)) {
                      this.field_b = 2;
                      stackOut_17_0 = (jaggl.MapBuffer) (param2);
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  this.field_b = 2;
                  stackOut_3_0 = this.field_m;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            if (param1 != 2) {
              var5 = (jaggl.MapBuffer) null;
              discarded$2 = this.a(true, 66, (jaggl.MapBuffer) null);
              stackOut_21_0 = null;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("ua.O(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jaclib.memory.Buffer) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jaclib.memory.Buffer) ((Object) stackIn_13_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (jaclib.memory.Buffer) ((Object) stackIn_18_0);
            } else {
              return (jaclib.memory.Buffer) ((Object) stackIn_22_0);
            }
          }
        }
    }

    final static void a(int param0, ah param1) {
        wb[] discarded$2 = null;
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
              up.field_a = fi.a(640, he.field_o, (byte) -96) << -247536376;
              cv.field_E = fi.a(480, he.field_o, (byte) -96) << 1175993800;
              sr.d(22030);
              if (param0 == 35040) {
                break L1;
              } else {
                discarded$2 = ua.a(116, -119);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ua.M(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void d(int param0) {
        if (-1 < (this.field_c ^ -1)) {
          if (this.field_f.field_Nc) {
            jaggl.OpenGL.glGenBuffersARB(1, jp.field_k, 0);
            this.field_c = jp.field_k[0];
            jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
            if (param0 == 0) {
              return;
            } else {
              field_n = (tg) null;
              return;
            }
          } else {
            this.field_c = 0;
            if (!Sumoblitz.field_L) {
              if (param0 != 0) {
                field_n = (tg) null;
                return;
              } else {
                return;
              }
            } else {
              jaggl.OpenGL.glGenBuffersARB(1, jp.field_k, 0);
              this.field_c = jp.field_k[0];
              jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
              if (param0 == 0) {
                return;
              } else {
                field_n = (tg) null;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    void b(int param0) {
        if (0 >= this.field_c) {
          if (param0 != 12001) {
            this.field_e = 82;
            return;
          } else {
            return;
          }
        } else {
          this.field_f.a((byte) -99, this.field_l, this.field_c);
          this.field_c = -1;
          if (param0 == 12001) {
            return;
          } else {
            this.field_e = 82;
            return;
          }
        }
    }

    final long c(int param0) {
        if (param0 != -24168) {
            return 1L;
        }
        return this.field_c == 0 ? this.field_m.c() : 0L;
    }

    final static void f(int param0) {
        if (null == vv.field_b) {
          throw new IllegalStateException("NGR");
        } else {
          if (param0 != -5812) {
            field_n = (tg) null;
            vv.field_b.field_g = true;
            jl.a(param0 + 5837, 1);
            return;
          } else {
            vv.field_b.field_g = true;
            jl.a(param0 + 5837, 1);
            return;
          }
        }
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (!en.field_h.startsWith("linux")) {
                if (en.field_h.startsWith("mac")) {
                  stackOut_8_0 = "lib" + param1 + ".dylib";
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackOut_4_0 = "lib" + param1 + ".so";
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("ua.N(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    void a(byte param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        Object stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        Object stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        Object stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        if (param1 <= this.field_e) {
          this.field_l = param1;
          if (param0 >= -67) {
            this.e(-122);
            return;
          } else {
            return;
          }
        } else {
          L0: {
            this.d(0);
            if ((this.field_c ^ -1) >= -1) {
              break L0;
            } else {
              L1: {
                jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
                stackOut_2_0 = this.field_k;
                stackOut_2_1 = param1;
                stackOut_2_2 = null;
                stackOut_2_3 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                if (!this.field_j) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = stackIn_4_3;
                  stackOut_4_4 = 35044;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  stackIn_5_4 = stackOut_4_4;
                  break L1;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = stackIn_3_2;
                  stackOut_3_3 = stackIn_3_3;
                  stackOut_3_4 = 35040;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  stackIn_5_4 = stackOut_3_4;
                  break L1;
                }
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_5_0, stackIn_5_1, (byte[]) ((Object) stackIn_5_2), stackIn_5_3, stackIn_5_4);
              this.field_f.field_o = this.field_f.field_o + (-this.field_e + param1);
              if (!Sumoblitz.field_L) {
                this.field_e = param1;
                this.field_l = param1;
                if (param0 < -67) {
                  return;
                } else {
                  this.e(-122);
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          this.field_m = this.field_f.a(false, false, param1);
          this.field_e = param1;
          this.field_l = param1;
          if (param0 < -67) {
            return;
          } else {
            this.e(-122);
            return;
          }
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
        byte[] stackIn_18_0 = null;
        byte[] stackIn_21_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        byte[] stackOut_20_0 = null;
        Object stackOut_2_0 = null;
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
                L4: {
                  L5: {
                    var5 = param3.b(3, (byte) -94);
                    var6 = (byte)param3.b(8, (byte) -117);
                    if (-1 > (var5 ^ -1)) {
                      break L5;
                    } else {
                      var7 = 0;
                      L6: while (true) {
                        if (var7 >= var4_int) {
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          param2[var7] = (byte)var6;
                          var7++;
                          if (var8 != 0) {
                            break L4;
                          } else {
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L7: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      stackOut_17_0 = (byte[]) (param2);
                      stackIn_21_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        stackIn_18_0[var7] = (byte)(var6 + param3.b(var5, (byte) -127));
                        var7++;
                        continue L7;
                      }
                    }
                  }
                }
                stackOut_20_0 = (byte[]) (param2);
                stackIn_21_0 = stackOut_20_0;
                break L3;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("ua.V(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_21_0;
        }
    }

    protected final void finalize() throws Throwable {
        this.b(12001);
        super.finalize();
    }

    final void e(int param0) {
        boolean discarded$8 = false;
        jaggl.MapBuffer var3 = null;
        if (param0 != 1175993800) {
          L0: {
            var3 = (jaggl.MapBuffer) null;
            discarded$8 = this.a((jaggl.MapBuffer) null, (byte) 48);
            if (this.field_f.field_Nc) {
              jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_f.field_Nc) {
              jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    ua(on param0, int param1, boolean param2) {
        this.field_b = 0;
        this.field_c = -1;
        try {
            this.field_j = param2 ? true : false;
            this.field_f = param0;
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -96 / ((param0 - -61) / 57);
        field_h = null;
        field_g = null;
        field_n = null;
    }

    final boolean a(jaggl.MapBuffer param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
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
            L1: {
              var3_int = 1;
              if (this.field_b == 0) {
                break L1;
              } else {
                L2: {
                  if (-1 <= (this.field_c ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
                      if (1 != this.field_b) {
                        break L3;
                      } else {
                        jaggl.OpenGL.glBufferSubDataARBa(this.field_k, 0, this.field_e, this.field_f.field_z.c());
                        if (!Sumoblitz.field_L) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
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
                    break L2;
                  }
                }
                this.field_b = 0;
                break L1;
              }
            }
            L5: {
              if (param1 == 92) {
                break L5;
              } else {
                this.field_f = (on) null;
                break L5;
              }
            }
            stackOut_12_0 = var3_int;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("ua.R(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    static {
        field_n = new tg();
        field_h = new int[8192];
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = 0;
    }
}
