/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ht implements ft {
    int field_j;
    private boolean field_f;
    fr field_d;
    int field_a;
    private int field_g;
    int field_c;
    static volatile int field_h;
    static String field_b;
    private boolean field_i;
    static hr[] field_e;

    final int c(int param0) {
        if (param0 > -97) {
            field_e = null;
            return ((ht) this).field_j;
        }
        return ((ht) this).field_j;
    }

    private final int b(boolean param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = ((ht) this).field_d.d(((ht) this).field_a, -120) * ((ht) this).field_g;
        if (param0) {
          return -30;
        } else {
          L0: {
            if (!((ht) this).field_f) {
              stackOut_3_0 = var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = var2 * 4 / 3;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0;
        }
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        if (!param0) {
          if (!((ht) this).field_d.field_xc) {
            return false;
          } else {
            var2 = this.b(false);
            ((ht) this).field_d.a(92, (ht) this);
            jaggl.OpenGL.glGenerateMipmapEXT(((ht) this).field_c);
            ((ht) this).field_f = true;
            this.b(-71);
            this.a((byte) 86, var2);
            return true;
          }
        } else {
          return false;
        }
    }

    final void b(byte param0) {
        L0: {
          if (0 < ((ht) this).field_j) {
            ((ht) this).field_d.a(((ht) this).field_j, this.b(false), (byte) -10);
            ((ht) this).field_j = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 84) {
          field_h = -53;
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -81) {
            ht.a((byte) 94);
            field_e = null;
            field_b = null;
            return;
        }
        field_e = null;
        field_b = null;
    }

    final void a(boolean param0, int param1) {
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        if (param1 != 0) {
          L0: {
            ((ht) this).field_a = 22;
            stackOut_11_0 = param0;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (((ht) this).field_i) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          L1: {
            if ((stackIn_14_0 ? 1 : 0) == stackIn_14_1) {
              L2: {
                stackOut_16_0 = this;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (!param0) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L2;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L2;
                }
              }
              ((ht) this).field_i = stackIn_19_1 != 0;
              this.b(param1 ^ -112);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L3: {
            stackOut_1_0 = param0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((ht) this).field_i) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L3;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L3;
            }
          }
          L4: {
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              L5: {
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (!param0) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L5;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L5;
                }
              }
              ((ht) this).field_i = stackIn_9_1 != 0;
              this.b(param1 ^ -112);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final static oh a(qj[] param0, on param1, byte param2) {
        int var3_int = 0;
        long var3 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3_int = 0;
        L0: while (true) {
          if (param0.length <= var3_int) {
            var4 = 12 % ((param2 - 40) / 55);
            var3 = jaggl.OpenGL.glCreateProgramObjectARB();
            var5 = 0;
            L1: while (true) {
              if (param0.length <= var5) {
                jaggl.OpenGL.glLinkProgramARB(var3);
                jaggl.OpenGL.glGetObjectParameterivARB(var3, 35714, kh.field_b, 0);
                if (kh.field_b[0] == 0) {
                  if (kh.field_b[0] != 0) {
                    L2: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, kh.field_b, 1);
                      if (kh.field_b[1] > 1) {
                        var13 = new byte[kh.field_b[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var3, kh.field_b[1], kh.field_b, 0, var13, 0);
                        System.out.println(new String(var13));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (-1 != (kh.field_b[0] ^ -1)) {
                      return new oh(param1, var3, param0);
                    } else {
                      var7 = 0;
                      var5 = var7;
                      L3: while (true) {
                        if (param0.length <= var7) {
                          jaggl.OpenGL.glDeleteObjectARB(var3);
                          return null;
                        } else {
                          jaggl.OpenGL.glDetachObjectARB(var3, param0[var7].field_a);
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L4: {
                      System.out.println("Shader linking failed:");
                      jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, kh.field_b, 1);
                      if (kh.field_b[1] > 1) {
                        var12 = new byte[kh.field_b[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var3, kh.field_b[1], kh.field_b, 0, var12, 0);
                        System.out.println(new String(var12));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (-1 == (kh.field_b[0] ^ -1)) {
                      var7 = 0;
                      var5 = var7;
                      L5: while (true) {
                        if (param0.length <= var7) {
                          jaggl.OpenGL.glDeleteObjectARB(var3);
                          return null;
                        } else {
                          jaggl.OpenGL.glDetachObjectARB(var3, param0[var7].field_a);
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      return new oh(param1, var3, param0);
                    }
                  }
                } else {
                  return new oh(param1, var3, param0);
                }
              } else {
                jaggl.OpenGL.glAttachObjectARB(var3, param0[var5].field_a);
                var5++;
                continue L1;
              }
            }
          } else {
            if (param0[var3_int] != null) {
              if (param0[var3_int].field_a > 0L) {
                var3_int++;
                var3_int++;
                continue L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        }
    }

    private final void b(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        ((ht) this).field_d.a(12, (ht) this);
        if (param0 > -70) {
          L0: {
            ((ht) this).field_d = null;
            if (((ht) this).field_i) {
              L1: {
                stackOut_16_0 = ((ht) this).field_c;
                stackOut_16_1 = 10241;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (((ht) this).field_f) {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 9987;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L1;
                } else {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = 9729;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L1;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_19_0, stackIn_19_1, stackIn_19_2);
              jaggl.OpenGL.glTexParameteri(((ht) this).field_c, 10240, 9729);
              break L0;
            } else {
              L2: {
                stackOut_12_0 = ((ht) this).field_c;
                stackOut_12_1 = 10241;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (!((ht) this).field_f) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = 9728;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L2;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = 9984;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L2;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_15_0, stackIn_15_1, stackIn_15_2);
              jaggl.OpenGL.glTexParameteri(((ht) this).field_c, 10240, 9728);
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (((ht) this).field_i) {
              L4: {
                stackOut_6_0 = ((ht) this).field_c;
                stackOut_6_1 = 10241;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (((ht) this).field_f) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = 9987;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = 9729;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_9_0, stackIn_9_1, stackIn_9_2);
              jaggl.OpenGL.glTexParameteri(((ht) this).field_c, 10240, 9729);
              break L3;
            } else {
              L5: {
                stackOut_2_0 = ((ht) this).field_c;
                stackOut_2_1 = 10241;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (!((ht) this).field_f) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 9728;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L5;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 9984;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L5;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_5_0, stackIn_5_1, stackIn_5_2);
              jaggl.OpenGL.glTexParameteri(((ht) this).field_c, 10240, 9728);
              break L3;
            }
          }
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (!param0) {
          return;
        } else {
          L0: {
            if (param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (((ht) this).field_f) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          L2: {
            if (stackIn_7_0 != stackIn_7_1) {
              var3 = this.b(false);
              ((ht) this).field_f = true;
              this.b(-119);
              this.a((byte) 45, var3);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    protected final void finalize() throws Throwable {
        ((ht) this).b((byte) 112);
        super.finalize();
    }

    private final void a(byte param0, int param1) {
        ((ht) this).field_d.field_p = ((ht) this).field_d.field_p - param1;
        if (param0 <= 38) {
          return;
        } else {
          ((ht) this).field_d.field_p = ((ht) this).field_d.field_p + this.b(false);
          return;
        }
    }

    final static lj c(boolean param0) {
        if (!param0) {
            return null;
        }
        return new lj(of.c(100), bt.b(77));
    }

    ht(fr param0, int param1, int param2, int param3, boolean param4) {
        ((ht) this).field_i = false;
        ((ht) this).field_g = param3;
        ((ht) this).field_a = param2;
        ((ht) this).field_f = param4 ? true : false;
        ((ht) this).field_d = param0;
        ((ht) this).field_c = param1;
        jaggl.OpenGL.glGenTextures(1, hg.field_m, 0);
        ((ht) this).field_j = hg.field_m[0];
        this.a((byte) 78, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_b = "Confirm Password: ";
    }
}
