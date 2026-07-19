/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class a extends bi {
    private int field_X;
    private wk field_W;
    private qg field_V;
    static al field_S;
    private int field_ab;
    static int[] field_T;
    private int field_P;
    static int field_Q;
    private int field_U;
    private gl field_Z;
    static boolean field_bb;
    static ti field_R;
    private int field_Y;

    boolean m(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (null != this.field_W) {
          if (this.field_W == uh.field_r) {
            fieldTemp$4 = this.field_ab + 1;
            this.field_ab = this.field_ab + 1;
            if (fieldTemp$4 == this.field_P) {
              this.field_W = ij.field_d;
              this.a(0, 12 - -this.field_V.field_l, this.field_V.field_h + 12 + this.field_U, this.field_Y);
              this.field_ab = 0;
              this.field_Z.field_A = 0;
              if (param0 == 0) {
                return super.m(0);
              } else {
                this.p(-97);
                return super.m(0);
              }
            } else {
              this.field_Z.field_A = -((this.field_ab << 607758824) / this.field_P) + 256;
              if (var3 == 0) {
                if (param0 == 0) {
                  return super.m(0);
                } else {
                  this.p(-97);
                  return super.m(0);
                }
              } else {
                this.field_W = ij.field_d;
                this.a(0, 12 - -this.field_V.field_l, this.field_V.field_h + 12 + this.field_U, this.field_Y);
                this.field_ab = 0;
                this.field_Z.field_A = 0;
                if (param0 == 0) {
                  return super.m(0);
                } else {
                  this.p(-97);
                  return super.m(0);
                }
              }
            }
          } else {
            if (this.field_W == hg.field_b) {
              fieldTemp$5 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (this.field_X != fieldTemp$5) {
                this.field_Z.field_A = (this.field_ab << -1241675192) / this.field_X;
                if (var3 != 0) {
                  fieldTemp$6 = this.field_ab + 1;
                  this.field_ab = this.field_ab + 1;
                  if (fieldTemp$6 == this.field_P) {
                    this.field_W = ij.field_d;
                    this.a(0, 12 - -this.field_V.field_l, this.field_V.field_h + 12 + this.field_U, this.field_Y);
                    this.field_ab = 0;
                    this.field_Z.field_A = 0;
                    if (param0 != 0) {
                      this.p(-97);
                      return super.m(0);
                    } else {
                      return super.m(0);
                    }
                  } else {
                    this.field_Z.field_A = -((this.field_ab << 607758824) / this.field_P) + 256;
                    if (var3 == 0) {
                      if (param0 != 0) {
                        this.p(-97);
                        return super.m(0);
                      } else {
                        return super.m(0);
                      }
                    } else {
                      this.field_W = ij.field_d;
                      this.a(0, 12 - -this.field_V.field_l, this.field_V.field_h + 12 + this.field_U, this.field_Y);
                      this.field_ab = 0;
                      this.field_Z.field_A = 0;
                      if (param0 != 0) {
                        this.p(-97);
                        return super.m(0);
                      } else {
                        return super.m(0);
                      }
                    }
                  }
                } else {
                  if (param0 != 0) {
                    this.p(-97);
                    return super.m(0);
                  } else {
                    return super.m(0);
                  }
                }
              } else {
                this.field_Z.field_A = 256;
                this.field_W = null;
                if (var3 != 0) {
                  L0: {
                    this.field_Z.field_A = (this.field_ab << -1241675192) / this.field_X;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      L1: {
                        fieldTemp$7 = this.field_ab + 1;
                        this.field_ab = this.field_ab + 1;
                        if (fieldTemp$7 == this.field_P) {
                          break L1;
                        } else {
                          this.field_Z.field_A = -((this.field_ab << 607758824) / this.field_P) + 256;
                          break L1;
                        }
                      }
                      this.field_W = ij.field_d;
                      this.a(0, 12 - -this.field_V.field_l, this.field_V.field_h + 12 + this.field_U, this.field_Y);
                      this.field_ab = 0;
                      this.field_Z.field_A = 0;
                      break L0;
                    }
                  }
                  if (param0 != 0) {
                    this.p(-97);
                    return super.m(0);
                  } else {
                    return super.m(0);
                  }
                } else {
                  if (param0 != 0) {
                    this.p(-97);
                    return super.m(0);
                  } else {
                    return super.m(0);
                  }
                }
              }
            } else {
              if (param0 != 0) {
                this.p(-97);
                return super.m(0);
              } else {
                return super.m(0);
              }
            }
          }
        } else {
          if (param0 == 0) {
            return super.m(0);
          } else {
            this.p(-97);
            return super.m(0);
          }
        }
    }

    a(da param0, qg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_h + 12 - -param2);
        try {
            this.field_U = param2;
            this.field_X = param3;
            this.field_P = param3;
            this.field_Y = param4;
            this.a((byte) 97, param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, qg param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null != this.field_Z) {
                this.field_Z.c(5);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 >= 68) {
              L2: {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    param1.a(28, 6 + this.field_U, 6, param1.field_l, param1.field_h);
                    this.field_Z = new gl(param1);
                    if (!Transmogrify.field_A) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_Z = new gl();
                break L2;
              }
              this.a((qg) (this.field_Z), (byte) -88);
              this.field_V = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("a.SB(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(byte param0) {
        if (!(this.field_W != uh.field_r)) {
            return;
        }
        this.field_ab = 0;
        this.field_W = hg.field_b;
        this.a((byte) 101, this.field_V);
        this.field_Z.field_A = 0;
        this.field_V = null;
        if (param0 != -2) {
            qg var3 = (qg) null;
            this.b(-120, (qg) null);
        }
    }

    final void p(int param0) {
        L0: {
          if (this.field_W == null) {
            break L0;
          } else {
            L1: {
              if (hg.field_b != this.field_W) {
                this.a(12 - -this.field_V.field_l, 12 - -this.field_U - -this.field_V.field_h, false);
                this.a((byte) 93, this.field_V);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_W = null;
            this.field_Z.field_A = 256;
            break L0;
          }
        }
        if (param0 != 27830) {
          this.d((byte) 73);
          super.p(param0 + 0);
          return;
        } else {
          super.p(param0 + 0);
          return;
        }
    }

    final boolean a(byte param0) {
        this.p(param0 + 27927);
        if (param0 != -97) {
            return true;
        }
        return super.a((byte) -97);
    }

    void b(int param0, qg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              L2: {
                this.field_V = param1;
                var3_int = 115 % ((param0 - 34) / 54);
                if (ij.field_d != this.field_W) {
                  break L2;
                } else {
                  this.a(0, 12 - -this.field_V.field_l, this.field_U + (12 + this.field_V.field_h), this.field_Y);
                  this.field_ab = 0;
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (uh.field_r == this.field_W) {
                break L1;
              } else {
                this.field_ab = 0;
                this.field_W = uh.field_r;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("a.RB(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
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
              param1.removeKeyListener(el.field_n);
              param1.removeFocusListener(el.field_n);
              j.field_b = -1;
              if (param0 >= 36) {
                break L1;
              } else {
                field_S = (al) null;
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
            stackOut_3_1 = new StringBuilder().append("a.UB(").append(param0).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void e(byte param0) {
        field_T = null;
        field_S = null;
        field_R = null;
        if (param0 != -13) {
            field_T = (int[]) null;
        }
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, (byte) 122, param3)) {
              L1: {
                if (null == this.field_Z) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param0) {
                      break L2;
                    } else {
                      discarded$4 = this.field_Z.a(param1, -90);
                      break L2;
                    }
                  }
                  if (param0 == 99) {
                    discarded$5 = this.field_Z.a(param1, -24);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var5_int = -38 % ((param2 - 65) / 55);
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("a.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    static {
        field_Q = 20;
        field_S = new al(2);
    }
}
