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
          if (-1 < (((qq) this).field_a ^ -1)) {
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
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 < -36) {
          var3 = 1;
          if (0 != ((qq) this).field_e) {
            if (0 < ((qq) this).field_a) {
              jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
              if (-2 == (((qq) this).field_e ^ -1)) {
                jaggl.OpenGL.glBufferSubDataARBa(((qq) this).field_b, 0, ((qq) this).field_f, ((qq) this).field_d.field_m.b());
                ((qq) this).field_e = 0;
                return var3 != 0;
              } else {
                L0: {
                  if (!param1.a()) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                var3 = stackIn_24_0;
                ((qq) this).field_e = 0;
                return var3 != 0;
              }
            } else {
              ((qq) this).field_e = 0;
              return var3 != 0;
            }
          } else {
            return var3 != 0;
          }
        } else {
          ((qq) this).field_h = null;
          var3 = 1;
          if (0 != ((qq) this).field_e) {
            if (0 < ((qq) this).field_a) {
              jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
              if (-2 == (((qq) this).field_e ^ -1)) {
                jaggl.OpenGL.glBufferSubDataARBa(((qq) this).field_b, 0, ((qq) this).field_f, ((qq) this).field_d.field_m.b());
                ((qq) this).field_e = 0;
                return var3 != 0;
              } else {
                L1: {
                  if (!param1.a()) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                var3 = stackIn_10_0;
                ((qq) this).field_e = 0;
                return var3 != 0;
              }
            } else {
              ((qq) this).field_e = 0;
              return var3 != 0;
            }
          } else {
            return var3 != 0;
          }
        }
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (param0) {
          if (null != fwa.field_g) {
            var3 = 0;
            var4 = param1;
            L0: while (true) {
              if (-57 < (var4 ^ -1)) {
                if (!fwa.field_g.c(var4, (byte) 34)) {
                  var4++;
                  var4++;
                  continue L0;
                } else {
                  if (param2 <= var3) {
                    return var4;
                  } else {
                    var3++;
                    var4++;
                    continue L0;
                  }
                }
              } else {
                return param1 - -param2;
              }
            }
          } else {
            return param1 - -param2;
          }
        } else {
          return 55;
        }
    }

    void a(int param0) {
        if ((((qq) this).field_a ^ -1) >= -1) {
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
            if (-1 > (((qq) this).field_a ^ -1)) {
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
                if (-1 > (((qq) this).field_a ^ -1)) {
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
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        Object stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        Object stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        Object stackIn_23_2 = null;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        Object stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        Object stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        Object stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        if (((qq) this).field_e == 0) {
          this.d(0);
          if (-1 > (((qq) this).field_a ^ -1)) {
            jaggl.OpenGL.glBindBufferARB(((qq) this).field_b, ((qq) this).field_a);
            if (param1) {
              L0: {
                stackOut_20_0 = ((qq) this).field_b;
                stackOut_20_1 = ((qq) this).field_f;
                stackOut_20_2 = null;
                stackOut_20_3 = 0;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_22_3 = stackOut_20_3;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                stackIn_21_3 = stackOut_20_3;
                if (!((qq) this).field_g) {
                  stackOut_22_0 = stackIn_22_0;
                  stackOut_22_1 = stackIn_22_1;
                  stackOut_22_2 = stackIn_22_2;
                  stackOut_22_3 = stackIn_22_3;
                  stackOut_22_4 = 35044;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  stackIn_23_3 = stackOut_22_3;
                  stackIn_23_4 = stackOut_22_4;
                  break L0;
                } else {
                  stackOut_21_0 = stackIn_21_0;
                  stackOut_21_1 = stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2;
                  stackOut_21_3 = stackIn_21_3;
                  stackOut_21_4 = 35040;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_23_4 = stackOut_21_4;
                  break L0;
                }
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_23_0, stackIn_23_1, (byte[]) (Object) stackIn_23_2, stackIn_23_3, stackIn_23_4);
              if (((qq) this).field_d.field_m.d < ((qq) this).field_c) {
                if (param2.b()) {
                  if (!param0) {
                    return null;
                  } else {
                    boolean discarded$5 = qq.a(7, true);
                    return null;
                  }
                } else {
                  if (!param2.a(((qq) this).field_b, ((qq) this).field_c, 35001)) {
                    if (!param0) {
                      return null;
                    } else {
                      boolean discarded$6 = qq.a(7, true);
                      return null;
                    }
                  } else {
                    ((qq) this).field_e = 2;
                    return (jaclib.memory.Buffer) (Object) param2;
                  }
                }
              } else {
                ((qq) this).field_e = 1;
                return (jaclib.memory.Buffer) (Object) ((qq) this).field_d.field_m;
              }
            } else {
              if (!param2.b()) {
                if (param2.a(((qq) this).field_b, ((qq) this).field_c, 35001)) {
                  ((qq) this).field_e = 2;
                  return (jaclib.memory.Buffer) (Object) param2;
                } else {
                  if (!param0) {
                    return null;
                  } else {
                    boolean discarded$7 = qq.a(7, true);
                    return null;
                  }
                }
              } else {
                if (!param0) {
                  return null;
                } else {
                  boolean discarded$8 = qq.a(7, true);
                  return null;
                }
              }
            }
          } else {
            ((qq) this).field_e = 2;
            return (jaclib.memory.Buffer) (Object) ((qq) this).field_h;
          }
        } else {
          if (!param0) {
            return null;
          } else {
            boolean discarded$9 = qq.a(7, true);
            return null;
          }
        }
    }

    qq(jp param0, int param1, boolean param2) {
        ((qq) this).field_a = -1;
        ((qq) this).field_e = 0;
        ((qq) this).field_d = param0;
        ((qq) this).field_b = param1;
        ((qq) this).field_g = param2 ? true : false;
    }

    static {
    }
}
