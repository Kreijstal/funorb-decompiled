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
            field_e = (hr[]) null;
            return this.field_j;
        }
        return this.field_j;
    }

    private final int b(boolean param0) {
        int var2;
        int stackIn_4_0 = 0;
        var2 = this.field_d.d(this.field_a, -120) * this.field_g;
        if (param0) {
          return -30;
        } else {
          L0: {
            if (!this.field_f) {
              stackIn_4_0 = var2;
              break L0;
            } else {
              stackIn_4_0 = var2 * 4 / 3;
              break L0;
            }
          }
          return stackIn_4_0;
        }
    }

    final boolean a(boolean param0) {
        int var2;
        if (!param0) {
          if (!this.field_d.field_xc) {
            return false;
          } else {
            var2 = this.b(false);
            this.field_d.a(92, (ht) (this));
            jaggl.OpenGL.glGenerateMipmapEXT(this.field_c);
            this.field_f = true;
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
          if (0 < this.field_j) {
            this.field_d.a(this.field_j, this.b(false), (byte) -10);
            this.field_j = 0;
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
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        if (param1 != 0) {
          L0: {
            this.field_a = 22;
            stackIn_13_0 = param0;

            if (this.field_i) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = 0;
              break L0;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = 1;
              break L0;
            }
          }
          L1: {
            if ((stackIn_14_0 ? 1 : 0) == stackIn_14_1) {
              L2: {
                stackIn_18_0 = this;

                if (!param0) {
                  stackIn_19_0 = this;
                  stackIn_19_1 = 0;
                  break L2;
                } else {
                  stackIn_19_0 = this;
                  stackIn_19_1 = 1;
                  break L2;
                }
              }
              ((ht) (this)).field_i = stackIn_19_1 != 0;
              this.b(param1 ^ -112);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L3: {
            stackIn_3_0 = param0;

            if (this.field_i) {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = 0;
              break L3;
            } else {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = 1;
              break L3;
            }
          }
          L4: {
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              L5: {
                stackIn_8_0 = this;

                if (!param0) {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 0;
                  break L5;
                } else {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 1;
                  break L5;
                }
              }
              ((ht) (this)).field_i = stackIn_9_1 != 0;
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
        Object stackIn_25_0 = null;
        oh stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.length <= var3_int) {
                var4 = 12 % ((param2 - 40) / 55);
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L2: while (true) {
                  if (param0.length <= var5) {
                    L3: {
                      jaggl.OpenGL.glLinkProgramARB(var3_long);
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, kh.field_b, 0);
                      if (kh.field_b[0] == 0) {
                        L4: {
                          if (kh.field_b[0] != 0) {
                            break L4;
                          } else {
                            System.out.println("Shader linking failed:");
                            break L4;
                          }
                        }
                        L5: {
                          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, kh.field_b, 1);
                          if (kh.field_b[1] > 1) {
                            var11 = new byte[kh.field_b[1]];
                            jaggl.OpenGL.glGetInfoLogARB(var3_long, kh.field_b[1], kh.field_b, 0, var11, 0);
                            System.out.println(new String(var11));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        if (-1 == (kh.field_b[0] ^ -1)) {
                          var7 = 0;
                          var5 = var7;
                          L6: while (true) {
                            if (param0.length <= var7) {
                              jaggl.OpenGL.glDeleteObjectARB(var3_long);
                              stackIn_25_0 = null;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              jaggl.OpenGL.glDetachObjectARB(var3_long, param0[var7].field_a);
                              var7++;
                              continue L6;
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    stackIn_27_0 = new oh(param1, var3_long, param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    jaggl.OpenGL.glAttachObjectARB(var3_long, param0[var5].field_a);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (param0[var3_int] != null) {
                  if (param0[var3_int].field_a > 0L) {
                    var3_int++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("ht.P(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oh) ((Object) stackIn_25_0);
        } else {
          return stackIn_27_0;
        }
    }

    private final void b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        this.field_d.a(12, (ht) (this));
        if (param0 > -70) {
          L0: {
            this.field_d = (fr) null;
            if (this.field_i) {
              L1: {
                stackIn_18_0 = this.field_c;

                stackIn_18_1 = 10241;

                if (this.field_f) {
                  stackIn_19_0 = stackIn_18_0;
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = 9987;
                  break L1;
                } else {
                  stackIn_19_0 = stackIn_18_0;
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = 9729;
                  break L1;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_19_0, stackIn_19_1, stackIn_19_2);
              jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9729);
              break L0;
            } else {
              L2: {
                stackIn_14_0 = this.field_c;

                stackIn_14_1 = 10241;

                if (!this.field_f) {
                  stackIn_15_0 = stackIn_14_0;
                  stackIn_15_1 = stackIn_14_1;
                  stackIn_15_2 = 9728;
                  break L2;
                } else {
                  stackIn_15_0 = stackIn_14_0;
                  stackIn_15_1 = stackIn_14_1;
                  stackIn_15_2 = 9984;
                  break L2;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_15_0, stackIn_15_1, stackIn_15_2);
              jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9728);
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (this.field_i) {
              L4: {
                stackIn_8_0 = this.field_c;

                stackIn_8_1 = 10241;

                if (this.field_f) {
                  stackIn_9_0 = stackIn_8_0;
                  stackIn_9_1 = stackIn_8_1;
                  stackIn_9_2 = 9987;
                  break L4;
                } else {
                  stackIn_9_0 = stackIn_8_0;
                  stackIn_9_1 = stackIn_8_1;
                  stackIn_9_2 = 9729;
                  break L4;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_9_0, stackIn_9_1, stackIn_9_2);
              jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9729);
              break L3;
            } else {
              L5: {
                stackIn_4_0 = this.field_c;

                stackIn_4_1 = 10241;

                if (!this.field_f) {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = stackIn_4_1;
                  stackIn_5_2 = 9728;
                  break L5;
                } else {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = stackIn_4_1;
                  stackIn_5_2 = 9984;
                  break L5;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_5_0, stackIn_5_1, stackIn_5_2);
              jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9728);
              break L3;
            }
          }
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        if (!param0) {
          return;
        } else {
          L0: {
            if (param1) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          L1: {


            if (this.field_f) {

              stackIn_7_1 = 0;
              break L1;
            } else {

              stackIn_7_1 = 1;
              break L1;
            }
          }
          L2: {
            if (stackIn_4_0 != stackIn_7_1) {
              var3 = this.b(false);
              this.field_f = true;
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
        this.b((byte) 112);
        super.finalize();
    }

    private final void a(byte param0, int param1) {
        this.field_d.field_p = this.field_d.field_p - param1;
        if (param0 <= 38) {
          return;
        } else {
          this.field_d.field_p = this.field_d.field_p + this.b(false);
          return;
        }
    }

    final static lj c(boolean param0) {
        if (!param0) {
            return (lj) null;
        }
        return new lj(of.c(100), bt.b(77));
    }

    ht(fr param0, int param1, int param2, int param3, boolean param4) {
        this.field_i = false;
        try {
            this.field_g = param3;
            this.field_a = param2;
            this.field_f = param4 ? true : false;
            this.field_d = param0;
            this.field_c = param1;
            jaggl.OpenGL.glGenTextures(1, hg.field_m, 0);
            this.field_j = hg.field_m[0];
            this.a((byte) 78, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ht.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_h = 0;
        field_b = "Confirm Password: ";
    }
}
