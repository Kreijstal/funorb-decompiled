/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;

abstract class qq implements nib {
    private int field_e;
    private boolean field_g;
    private int field_f;
    private int field_a;
    private int field_c;
    jp field_d;
    private int field_b;
    private jaclib.memory.heap.NativeHeapBuffer field_h;

    private final void d(int param0) {
        if (param0 == 0) {
          if (((qq) this).field_a < 0) {
            if (((qq) this).field_d.field_Hc) {
              jaggl.OpenGL.glGenBuffersARB(1, lkb.field_a, 0);
              ((qq) this).field_a = lkb.field_a[0];
              jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
              return;
            } else {
              ((qq) this).field_a = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0) {
        Object var3 = null;
        if (!((qq) this).field_d.field_Hc) {
          if (param0 != 54) {
            var3 = null;
            boolean discarded$4 = ((qq) this).a((byte) 60, (jaggl.MapBuffer) null);
            return;
          } else {
            return;
          }
        } else {
          jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
          if (param0 == 54) {
            return;
          } else {
            var3 = null;
            boolean discarded$5 = ((qq) this).a((byte) 60, (jaggl.MapBuffer) null);
            return;
          }
        }
    }

    final boolean a(byte param0, jaggl.MapBuffer param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
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
              if (param0 < -36) {
                break L1;
              } else {
                ((qq) this).field_h = null;
                break L1;
              }
            }
            L2: {
              var3_int = 1;
              if (0 != ((qq) this).field_e) {
                L3: {
                  if (0 < ((qq) this).field_a) {
                    jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
                    if (((qq) this).field_e == 1) {
                      jaggl.OpenGL.glBufferSubDataARBa(((qq) this).field_b, 0, ((qq) this).field_f, ((qq) this).field_d.field_m.b());
                      break L3;
                    } else {
                      L4: {
                        if (!param1.a()) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          break L4;
                        } else {
                          stackOut_8_0 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          break L4;
                        }
                      }
                      var3_int = stackIn_10_0;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                ((qq) this).field_e = 0;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_13_0 = var3_int;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("qq.I(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static boolean a(int param0, boolean param1) {
        return param0 < 14;
    }

    final long c(int param0) {
        long stackIn_4_0 = 0L;
        long stackIn_8_0 = 0L;
        long stackOut_7_0 = 0L;
        long stackOut_6_0 = 0L;
        long stackOut_3_0 = 0L;
        long stackOut_2_0 = 0L;
        if (param0 != 2) {
          L0: {
            boolean discarded$10 = qq.a(127, true);
            if (0 != ((qq) this).field_a) {
              stackOut_7_0 = 0L;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ((qq) this).field_h.b();
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (0 != ((qq) this).field_a) {
              stackOut_3_0 = 0L;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((qq) this).field_h.b();
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    protected final void finalize() throws Throwable {
        ((qq) this).a(-106);
        super.finalize();
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (null == fwa.field_g) {
                break L1;
              } else {
                var3_int = 0;
                var4 = param1;
                L2: while (true) {
                  if (var4 >= 56) {
                    break L1;
                  } else {
                    L3: {
                      if (!fwa.field_g.c(var4, (byte) 34)) {
                        var4++;
                        break L3;
                      } else {
                        if (param2 <= var3_int) {
                          stackOut_9_0 = var4;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0;
                        } else {
                          var3_int++;
                          var4++;
                          break L3;
                        }
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              }
            }
            stackOut_16_0 = param1 - -param2;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "qq.M(" + 1 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_17_0;
    }

    void a(int param0) {
        if (((qq) this).field_a <= 0) {
          if (param0 >= -84) {
            return;
          } else {
            return;
          }
        } else {
          ((qq) this).field_d.b(((qq) this).field_a, ((qq) this).field_c, false);
          ((qq) this).field_a = -1;
          if (param0 < -84) {
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        Object stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        Object stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        Object stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        Object stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        Object stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        Object stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        if (param0 != 25427) {
          this.d(-59);
          if (((qq) this).field_f < param1) {
            this.d(0);
            if (((qq) this).field_a > 0) {
              L0: {
                jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
                stackOut_15_0 = ((qq) this).field_b;
                stackOut_15_1 = param1;
                stackOut_15_2 = null;
                stackOut_15_3 = 0;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                stackIn_16_3 = stackOut_15_3;
                if (((qq) this).field_g) {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = stackIn_17_2;
                  stackOut_17_3 = stackIn_17_3;
                  stackOut_17_4 = 35040;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  stackIn_18_3 = stackOut_17_3;
                  stackIn_18_4 = stackOut_17_4;
                  break L0;
                } else {
                  stackOut_16_0 = stackIn_16_0;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2;
                  stackOut_16_3 = stackIn_16_3;
                  stackOut_16_4 = 35044;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_18_3 = stackOut_16_3;
                  stackIn_18_4 = stackOut_16_4;
                  break L0;
                }
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_18_0, stackIn_18_1, (byte[]) (Object) stackIn_18_2, stackIn_18_3, stackIn_18_4);
              ((qq) this).field_d.field_ob = ((qq) this).field_d.field_ob + (param1 - ((qq) this).field_f);
              ((qq) this).field_f = param1;
              ((qq) this).field_c = param1;
              return;
            } else {
              ((qq) this).field_h = ((qq) this).field_d.a(false, 127, param1);
              ((qq) this).field_f = param1;
              ((qq) this).field_c = param1;
              return;
            }
          } else {
            ((qq) this).field_c = param1;
            return;
          }
        } else {
          L1: {
            if (((qq) this).field_f < param1) {
              L2: {
                this.d(0);
                if (((qq) this).field_a > 0) {
                  L3: {
                    jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
                    stackOut_5_0 = ((qq) this).field_b;
                    stackOut_5_1 = param1;
                    stackOut_5_2 = null;
                    stackOut_5_3 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    if (((qq) this).field_g) {
                      stackOut_7_0 = stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = stackIn_7_2;
                      stackOut_7_3 = stackIn_7_3;
                      stackOut_7_4 = 35040;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      stackIn_8_4 = stackOut_7_4;
                      break L3;
                    } else {
                      stackOut_6_0 = stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = stackIn_6_2;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = 35044;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_8_4 = stackOut_6_4;
                      break L3;
                    }
                  }
                  jaggl.OpenGL.glBufferDataARBub(stackIn_8_0, stackIn_8_1, (byte[]) (Object) stackIn_8_2, stackIn_8_3, stackIn_8_4);
                  ((qq) this).field_d.field_ob = ((qq) this).field_d.field_ob + (param1 - ((qq) this).field_f);
                  break L2;
                } else {
                  ((qq) this).field_h = ((qq) this).field_d.a(false, 127, param1);
                  break L2;
                }
              }
              ((qq) this).field_f = param1;
              break L1;
            } else {
              break L1;
            }
          }
          ((qq) this).field_c = param1;
          return;
        }
    }

    final jaclib.memory.Buffer a(boolean param0, boolean param1, jaggl.MapBuffer param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_9_0 = null;
        jaggl.MapBuffer stackIn_14_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        jaclib.memory.heap.NativeHeapBuffer stackOut_15_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackOut_8_0 = null;
        jaggl.MapBuffer stackOut_13_0 = null;
        Object stackOut_17_0 = null;
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
            L1: {
              if (((qq) this).field_e != 0) {
                break L1;
              } else {
                this.d(0);
                if (((qq) this).field_a <= 0) {
                  ((qq) this).field_e = 2;
                  stackOut_15_0 = ((qq) this).field_h;
                  stackIn_16_0 = stackOut_15_0;
                  return (jaclib.memory.Buffer) (Object) stackIn_16_0;
                } else {
                  L2: {
                    jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
                    if (param1) {
                      L3: {
                        stackOut_4_0 = ((qq) this).field_b;
                        stackOut_4_1 = ((qq) this).field_f;
                        stackOut_4_2 = null;
                        stackOut_4_3 = 0;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_6_1 = stackOut_4_1;
                        stackIn_6_2 = stackOut_4_2;
                        stackIn_6_3 = stackOut_4_3;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        if (!((qq) this).field_g) {
                          stackOut_6_0 = stackIn_6_0;
                          stackOut_6_1 = stackIn_6_1;
                          stackOut_6_2 = stackIn_6_2;
                          stackOut_6_3 = stackIn_6_3;
                          stackOut_6_4 = 35044;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          stackIn_7_2 = stackOut_6_2;
                          stackIn_7_3 = stackOut_6_3;
                          stackIn_7_4 = stackOut_6_4;
                          break L3;
                        } else {
                          stackOut_5_0 = stackIn_5_0;
                          stackOut_5_1 = stackIn_5_1;
                          stackOut_5_2 = stackIn_5_2;
                          stackOut_5_3 = stackIn_5_3;
                          stackOut_5_4 = 35040;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          stackIn_7_3 = stackOut_5_3;
                          stackIn_7_4 = stackOut_5_4;
                          break L3;
                        }
                      }
                      jaggl.OpenGL.glBufferDataARBub(stackIn_7_0, stackIn_7_1, (byte[]) (Object) stackIn_7_2, stackIn_7_3, stackIn_7_4);
                      if (((qq) this).field_d.field_m.d < ((qq) this).field_c) {
                        break L2;
                      } else {
                        ((qq) this).field_e = 1;
                        stackOut_8_0 = ((qq) this).field_d.field_m;
                        stackIn_9_0 = stackOut_8_0;
                        return (jaclib.memory.Buffer) (Object) stackIn_9_0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (param2.b()) {
                    break L1;
                  } else {
                    if (param2.a(((qq) this).field_b, ((qq) this).field_c, 35001)) {
                      ((qq) this).field_e = 2;
                      stackOut_13_0 = (jaggl.MapBuffer) param2;
                      stackIn_14_0 = stackOut_13_0;
                      return (jaclib.memory.Buffer) (Object) stackIn_14_0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            boolean discarded$2 = qq.a(7, true);
            stackOut_17_0 = null;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("qq.N(").append(0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return (jaclib.memory.Buffer) (Object) stackIn_18_0;
    }

    qq(jp param0, int param1, boolean param2) {
        ((qq) this).field_a = -1;
        ((qq) this).field_e = 0;
        try {
            ((qq) this).field_d = param0;
            ((qq) this).field_b = param1;
            ((qq) this).field_g = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
    }
}
