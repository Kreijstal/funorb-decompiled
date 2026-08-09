/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
          if (-1 < (this.field_a ^ -1)) {
            if (this.field_d.field_Hc) {
              jaggl.OpenGL.glGenBuffersARB(1, lkb.field_a, 0);
              this.field_a = lkb.field_a[0];
              jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
              return;
            } else {
              this.field_a = 0;
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
        jaggl.MapBuffer var3;
        if (!this.field_d.field_Hc) {
          if (param0 != 54) {
            var3 = (jaggl.MapBuffer) null;
            this.a((byte) 60, (jaggl.MapBuffer) null);
            return;
          } else {
            return;
          }
        } else {
          jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
          if (param0 == 54) {
            return;
          } else {
            var3 = (jaggl.MapBuffer) null;
            this.a((byte) 60, (jaggl.MapBuffer) null);
            return;
          }
        }
    }

    final boolean a(byte param0, jaggl.MapBuffer param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -36) {
                break L1;
              } else {
                this.field_h = (jaclib.memory.heap.NativeHeapBuffer) null;
                break L1;
              }
            }
            L2: {
              var3_int = 1;
              if (0 != this.field_e) {
                L3: {
                  if (0 < this.field_a) {
                    jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
                    if (-2 == (this.field_e ^ -1)) {
                      jaggl.OpenGL.glBufferSubDataARBa(this.field_b, 0, this.field_f, this.field_d.field_m.b());
                      break L3;
                    } else {
                      L4: {
                        if (!param1.a()) {
                          stackIn_10_0 = 0;
                          break L4;
                        } else {
                          stackIn_10_0 = 1;
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
                this.field_e = 0;
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_14_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("qq.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
            return true;
        }
        return param0 < 14 ? true : false;
    }

    final long c(int param0) {
        long stackIn_4_0 = 0L;
        long stackIn_8_0 = 0L;
        if (param0 != 2) {
          L0: {
            qq.a(127, true);
            if (0 != this.field_a) {
              stackIn_8_0 = 0L;
              break L0;
            } else {
              stackIn_8_0 = this.field_h.b();
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (0 != this.field_a) {
              stackIn_4_0 = 0L;
              break L1;
            } else {
              stackIn_4_0 = this.field_h.b();
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    protected final void finalize() throws Throwable {
        this.a(-106);
        super.finalize();
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param0) {
              L1: {
                if (null == fwa.field_g) {
                  break L1;
                } else {
                  var3_int = 0;
                  var4 = param1;
                  L2: while (true) {
                    if (-57 >= (var4 ^ -1)) {
                      break L1;
                    } else {
                      L3: {
                        if (!fwa.field_g.c(var4, (byte) 34)) {
                          break L3;
                        } else {
                          if (param2 <= var3_int) {
                            stackIn_11_0 = var4;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var3_int++;
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
              stackIn_16_0 = param1 - -param2;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_3_0 = 55;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "qq.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    void a(int param0) {
        if ((this.field_a ^ -1) >= -1) {
          if (param0 >= -84) {
            this.c(126);
            return;
          } else {
            return;
          }
        } else {
          this.field_d.b(this.field_a, this.field_c, false);
          this.field_a = -1;
          if (param0 < -84) {
            return;
          } else {
            this.c(126);
            return;
          }
        }
    }

    void a(int param0, int param1) {
        int stackIn_7_0;
        int stackIn_7_1;
        Object stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_0;
        int stackIn_8_1;
        Object stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        int stackIn_17_0;
        int stackIn_17_1;
        Object stackIn_17_2;
        int stackIn_17_3;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        Object stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        if (param0 != 25427) {
          this.d(-59);
          if (this.field_f < param1) {
            this.d(0);
            if (-1 > (this.field_a ^ -1)) {
              L0: {
                jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
                stackIn_17_0 = this.field_b;

                stackIn_17_1 = param1;

                stackIn_17_2 = null;

                stackIn_17_3 = 0;

                if (this.field_g) {
                  stackIn_18_0 = stackIn_17_0;
                  stackIn_18_1 = stackIn_17_1;
                  stackIn_18_2 = stackIn_17_2;
                  stackIn_18_3 = stackIn_17_3;
                  stackIn_18_4 = 35040;
                  break L0;
                } else {
                  stackIn_18_0 = stackIn_17_0;
                  stackIn_18_1 = stackIn_17_1;
                  stackIn_18_2 = stackIn_17_2;
                  stackIn_18_3 = stackIn_17_3;
                  stackIn_18_4 = 35044;
                  break L0;
                }
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_18_0, stackIn_18_1, (byte[]) ((Object) stackIn_18_2), stackIn_18_3, stackIn_18_4);
              this.field_d.field_ob = this.field_d.field_ob + (param1 - this.field_f);
              this.field_f = param1;
              this.field_c = param1;
              return;
            } else {
              this.field_h = this.field_d.a(false, 127, param1);
              this.field_f = param1;
              this.field_c = param1;
              return;
            }
          } else {
            this.field_c = param1;
            return;
          }
        } else {
          L1: {
            if (this.field_f < param1) {
              L2: {
                this.d(0);
                if (-1 > (this.field_a ^ -1)) {
                  L3: {
                    jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
                    stackIn_7_0 = this.field_b;

                    stackIn_7_1 = param1;

                    stackIn_7_2 = null;

                    stackIn_7_3 = 0;

                    if (this.field_g) {
                      stackIn_8_0 = stackIn_7_0;
                      stackIn_8_1 = stackIn_7_1;
                      stackIn_8_2 = stackIn_7_2;
                      stackIn_8_3 = stackIn_7_3;
                      stackIn_8_4 = 35040;
                      break L3;
                    } else {
                      stackIn_8_0 = stackIn_7_0;
                      stackIn_8_1 = stackIn_7_1;
                      stackIn_8_2 = stackIn_7_2;
                      stackIn_8_3 = stackIn_7_3;
                      stackIn_8_4 = 35044;
                      break L3;
                    }
                  }
                  jaggl.OpenGL.glBufferDataARBub(stackIn_8_0, stackIn_8_1, (byte[]) ((Object) stackIn_8_2), stackIn_8_3, stackIn_8_4);
                  this.field_d.field_ob = this.field_d.field_ob + (param1 - this.field_f);
                  break L2;
                } else {
                  this.field_h = this.field_d.a(false, 127, param1);
                  break L2;
                }
              }
              this.field_f = param1;
              break L1;
            } else {
              break L1;
            }
          }
          this.field_c = param1;
          return;
        }
    }

    final jaclib.memory.Buffer a(boolean param0, boolean param1, jaggl.MapBuffer param2) {
        RuntimeException var4 = null;
        int stackIn_6_0;
        int stackIn_6_1;
        Object stackIn_6_2;
        int stackIn_6_3;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_9_0 = null;
        jaggl.MapBuffer stackIn_14_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_e != 0) {
                break L1;
              } else {
                this.d(0);
                if (-1 <= (this.field_a ^ -1)) {
                  this.field_e = 2;
                  stackIn_16_0 = this.field_h;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
                    if (param1) {
                      L3: {
                        stackIn_6_0 = this.field_b;

                        stackIn_6_1 = this.field_f;

                        stackIn_6_2 = null;

                        stackIn_6_3 = 0;

                        if (!this.field_g) {
                          stackIn_7_0 = stackIn_6_0;
                          stackIn_7_1 = stackIn_6_1;
                          stackIn_7_2 = stackIn_6_2;
                          stackIn_7_3 = stackIn_6_3;
                          stackIn_7_4 = 35044;
                          break L3;
                        } else {
                          stackIn_7_0 = stackIn_6_0;
                          stackIn_7_1 = stackIn_6_1;
                          stackIn_7_2 = stackIn_6_2;
                          stackIn_7_3 = stackIn_6_3;
                          stackIn_7_4 = 35040;
                          break L3;
                        }
                      }
                      jaggl.OpenGL.glBufferDataARBub(stackIn_7_0, stackIn_7_1, (byte[]) ((Object) stackIn_7_2), stackIn_7_3, stackIn_7_4);
                      if (this.field_d.field_m.d < this.field_c) {
                        break L2;
                      } else {
                        this.field_e = 1;
                        stackIn_9_0 = this.field_d.field_m;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (param2.b()) {
                    break L1;
                  } else {
                    if (param2.a(this.field_b, this.field_c, 35001)) {
                      this.field_e = 2;
                      stackIn_14_0 = (jaggl.MapBuffer) (param2);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (param0) {
              qq.a(7, true);
              stackIn_20_0 = null;
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
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("qq.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jaclib.memory.Buffer) ((Object) stackIn_9_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jaclib.memory.Buffer) ((Object) stackIn_14_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (jaclib.memory.Buffer) ((Object) stackIn_16_0);
            } else {
              return (jaclib.memory.Buffer) ((Object) stackIn_20_0);
            }
          }
        }
    }

    qq(jp param0, int param1, boolean param2) {
        this.field_a = -1;
        this.field_e = 0;
        try {
            this.field_d = param0;
            this.field_b = param1;
            this.field_g = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "qq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
