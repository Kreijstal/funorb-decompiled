/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends ld {
    private int field_ab;
    private wh field_U;
    private int field_db;
    private int field_W;
    private rc field_S;
    private te field_V;
    static int field_T;
    private int field_eb;
    static ef field_Z;
    static String[] field_X;
    private int field_bb;
    static long field_Y;
    static o[] field_fb;
    static s field_cb;

    final boolean e(byte param0) {
        this.e(true);
        if (param0 != 124) {
            return true;
        }
        return super.e((byte) 124);
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
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
            if (!super.a(param0, (byte) -117, param2, param3)) {
              L1: {
                if (null != this.field_V) {
                  L2: {
                    if (param2 != 98) {
                      break L2;
                    } else {
                      discarded$4 = this.field_V.a(-1463, param3);
                      break L2;
                    }
                  }
                  if (99 != param2) {
                    break L1;
                  } else {
                    discarded$5 = this.field_V.a(-1463, param3);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var5_int = 120 / ((param1 - 31) / 56);
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
            stackOut_11_1 = new StringBuilder().append("gf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    gf(i param0, rc param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 - -param2 - -param1.field_x);
        try {
            this.field_eb = param2;
            this.field_W = param4;
            this.field_db = param3;
            this.field_ab = param3;
            this.b(param1, -16777);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void f(byte param0) {
        int var1 = -116 / ((-50 - param0) / 43);
        field_cb = null;
        field_X = null;
        field_Z = null;
        field_fb = null;
    }

    private final void b(rc param0, int param1) {
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
              if (this.field_V != null) {
                this.field_V.c(10);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  break L3;
                } else {
                  this.field_V = new te();
                  if (!SolKnight.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param0.b(param0.field_x, param0.field_t, 6, 0, this.field_eb + 6);
              this.field_V = new te(param0);
              break L2;
            }
            this.a(this.field_V, param1 + 22188);
            if (param1 == -16777) {
              this.field_S = null;
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
            stackOut_11_1 = new StringBuilder().append("gf.M(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(boolean param0) {
        if (this.field_U != null) {
          if (this.field_U == oa.field_j) {
            this.field_V.field_H = 256;
            this.field_U = null;
            super.e(param0);
            return;
          } else {
            this.b(this.field_S.field_t + 12, -2038584927, this.field_eb + 12 - -this.field_S.field_x);
            this.b(this.field_S, -16777);
            this.field_V.field_H = 256;
            this.field_U = null;
            super.e(param0);
            return;
          }
        } else {
          super.e(param0);
          return;
        }
    }

    void c(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -3399) {
                break L1;
              } else {
                field_T = -28;
                break L1;
              }
            }
            L2: {
              L3: {
                this.field_S = param1;
                if (kc.field_I != this.field_U) {
                  break L3;
                } else {
                  this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
                  this.field_bb = 0;
                  if (!SolKnight.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (this.field_U == ah.field_j) {
                break L2;
              } else {
                this.field_U = ah.field_j;
                this.field_bb = 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("gf.NA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void l(int param0) {
        if (ah.field_j == this.field_U) {
          return;
        } else {
          if (param0 != 7107) {
            return;
          } else {
            this.field_U = oa.field_j;
            this.field_bb = 0;
            this.b(this.field_S, param0 ^ -23116);
            this.field_V.field_H = 0;
            this.field_S = null;
            return;
          }
        }
    }

    boolean h(int param0) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        boolean discarded$12 = false;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int var3 = 0;
        rc var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 == 1784) {
          if (this.field_U != null) {
            if (this.field_U == ah.field_j) {
              fieldTemp$8 = this.field_bb + 1;
              this.field_bb = this.field_bb + 1;
              if (this.field_ab == fieldTemp$8) {
                this.field_U = kc.field_I;
                this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
                this.field_bb = 0;
                this.field_V.field_H = 0;
                if (var3 != 0) {
                  this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                  return super.h(param0 + 0);
                } else {
                  return super.h(param0 + 0);
                }
              } else {
                this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                return super.h(param0 + 0);
              }
            } else {
              if (this.field_U == oa.field_j) {
                fieldTemp$9 = this.field_bb + 1;
                this.field_bb = this.field_bb + 1;
                if (fieldTemp$9 == this.field_db) {
                  this.field_U = null;
                  this.field_V.field_H = 256;
                  if (var3 != 0) {
                    fieldTemp$10 = this.field_bb + 1;
                    this.field_bb = this.field_bb + 1;
                    if (this.field_ab == fieldTemp$10) {
                      this.field_U = kc.field_I;
                      this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
                      this.field_bb = 0;
                      this.field_V.field_H = 0;
                      this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                      return super.h(param0 + 0);
                    } else {
                      this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                      return super.h(param0 + 0);
                    }
                  } else {
                    return super.h(param0 + 0);
                  }
                } else {
                  this.field_V.field_H = (this.field_bb << 88565416) / this.field_db;
                  if (var3 != 0) {
                    this.field_U = null;
                    this.field_V.field_H = 256;
                    if (var3 != 0) {
                      fieldTemp$11 = this.field_bb + 1;
                      this.field_bb = this.field_bb + 1;
                      if (this.field_ab == fieldTemp$11) {
                        this.field_U = kc.field_I;
                        this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
                        this.field_bb = 0;
                        this.field_V.field_H = 0;
                        this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                        return super.h(param0 + 0);
                      } else {
                        this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                        return super.h(param0 + 0);
                      }
                    } else {
                      return super.h(param0 + 0);
                    }
                  } else {
                    return super.h(param0 + 0);
                  }
                }
              } else {
                return super.h(param0 + 0);
              }
            }
          } else {
            return super.h(param0 + 0);
          }
        } else {
          var4 = (rc) null;
          discarded$12 = this.a('ﾴ', (byte) -22, -26, (rc) null);
          if (this.field_U != null) {
            if (this.field_U != ah.field_j) {
              if (this.field_U == oa.field_j) {
                L0: {
                  fieldTemp$13 = this.field_bb + 1;
                  this.field_bb = this.field_bb + 1;
                  if (fieldTemp$13 == this.field_db) {
                    break L0;
                  } else {
                    this.field_V.field_H = (this.field_bb << 88565416) / this.field_db;
                    if (var3 != 0) {
                      break L0;
                    } else {
                      return super.h(param0 + 0);
                    }
                  }
                }
                this.field_U = null;
                this.field_V.field_H = 256;
                if (var3 != 0) {
                  fieldTemp$14 = this.field_bb + 1;
                  this.field_bb = this.field_bb + 1;
                  if (this.field_ab == fieldTemp$14) {
                    this.field_U = kc.field_I;
                    this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
                    this.field_bb = 0;
                    this.field_V.field_H = 0;
                    if (var3 != 0) {
                      this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                      return super.h(param0 + 0);
                    } else {
                      return super.h(param0 + 0);
                    }
                  } else {
                    this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                    return super.h(param0 + 0);
                  }
                } else {
                  return super.h(param0 + 0);
                }
              } else {
                return super.h(param0 + 0);
              }
            } else {
              L1: {
                L2: {
                  fieldTemp$15 = this.field_bb + 1;
                  this.field_bb = this.field_bb + 1;
                  if (this.field_ab != fieldTemp$15) {
                    break L2;
                  } else {
                    this.field_U = kc.field_I;
                    this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
                    this.field_bb = 0;
                    this.field_V.field_H = 0;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                break L1;
              }
              return super.h(param0 + 0);
            }
          } else {
            return super.h(param0 + 0);
          }
        }
    }

    static {
        field_Z = new ef();
        field_X = new String[]{"All scores", "My scores", "Best each"};
    }
}
