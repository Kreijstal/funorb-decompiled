/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ur extends hf {
    private pk field_V;
    private int field_W;
    private int field_S;
    static String field_X;
    private in field_P;
    private int field_Z;
    static float field_R;
    static int field_Q;
    private jf field_Y;
    private int field_U;
    private int field_T;
    static int field_O;

    ur(dg param0, pk param1, int param2, int param3, int param4) {
        super(param0, param1.field_q + 12, param1.field_p + (12 + param2));
        try {
            this.field_U = param2;
            this.field_S = param3;
            this.field_T = param3;
            this.field_Z = param4;
            this.b(param1, -125);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ur.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean g(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.field_Y) {
          if (this.field_Y != sr.field_i) {
            if (this.field_Y == mm.field_a) {
              fieldTemp$4 = this.field_W + 1;
              this.field_W = this.field_W + 1;
              if (this.field_S != fieldTemp$4) {
                this.field_P.field_A = (this.field_W << 1474033192) / this.field_S;
                if (param0 == -28778) {
                  return super.g(-28778);
                } else {
                  this.field_T = 19;
                  return super.g(-28778);
                }
              } else {
                this.field_Y = null;
                this.field_P.field_A = 256;
                if (var3 != 0) {
                  this.field_P.field_A = (this.field_W << 1474033192) / this.field_S;
                  if (param0 == -28778) {
                    return super.g(-28778);
                  } else {
                    this.field_T = 19;
                    return super.g(-28778);
                  }
                } else {
                  if (param0 == -28778) {
                    return super.g(-28778);
                  } else {
                    this.field_T = 19;
                    return super.g(-28778);
                  }
                }
              }
            } else {
              if (param0 != -28778) {
                this.field_T = 19;
                return super.g(-28778);
              } else {
                return super.g(-28778);
              }
            }
          } else {
            fieldTemp$5 = this.field_W + 1;
            this.field_W = this.field_W + 1;
            if (fieldTemp$5 == this.field_T) {
              this.field_Y = lw.field_a;
              this.a(false, this.field_U + (12 + this.field_V.field_p), this.field_Z, this.field_V.field_q + 12);
              this.field_W = 0;
              this.field_P.field_A = 0;
              if (var3 != 0) {
                if (this.field_Y == mm.field_a) {
                  fieldTemp$6 = this.field_W + 1;
                  this.field_W = this.field_W + 1;
                  if (this.field_S != fieldTemp$6) {
                    this.field_P.field_A = (this.field_W << 1474033192) / this.field_S;
                    if (param0 != -28778) {
                      this.field_T = 19;
                      return super.g(-28778);
                    } else {
                      return super.g(-28778);
                    }
                  } else {
                    this.field_Y = null;
                    this.field_P.field_A = 256;
                    if (var3 == 0) {
                      if (param0 != -28778) {
                        this.field_T = 19;
                        return super.g(-28778);
                      } else {
                        return super.g(-28778);
                      }
                    } else {
                      L0: {
                        this.field_P.field_A = (this.field_W << 1474033192) / this.field_S;
                        if (param0 == -28778) {
                          break L0;
                        } else {
                          this.field_T = 19;
                          break L0;
                        }
                      }
                      return super.g(-28778);
                    }
                  }
                } else {
                  if (param0 != -28778) {
                    this.field_T = 19;
                    return super.g(-28778);
                  } else {
                    return super.g(-28778);
                  }
                }
              } else {
                if (param0 != -28778) {
                  this.field_T = 19;
                  return super.g(-28778);
                } else {
                  return super.g(-28778);
                }
              }
            } else {
              this.field_P.field_A = 256 + -((this.field_W << -1588147576) / this.field_T);
              if (var3 != 0) {
                this.field_Y = lw.field_a;
                this.a(false, this.field_U + (12 + this.field_V.field_p), this.field_Z, this.field_V.field_q + 12);
                this.field_W = 0;
                this.field_P.field_A = 0;
                if (var3 == 0) {
                  L1: {
                    if (param0 == -28778) {
                      break L1;
                    } else {
                      this.field_T = 19;
                      break L1;
                    }
                  }
                  return super.g(-28778);
                } else {
                  L2: {
                    if (this.field_Y == mm.field_a) {
                      L3: {
                        fieldTemp$7 = this.field_W + 1;
                        this.field_W = this.field_W + 1;
                        if (this.field_S != fieldTemp$7) {
                          break L3;
                        } else {
                          this.field_Y = null;
                          this.field_P.field_A = 256;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_P.field_A = (this.field_W << 1474033192) / this.field_S;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (param0 == -28778) {
                      break L4;
                    } else {
                      this.field_T = 19;
                      break L4;
                    }
                  }
                  return super.g(-28778);
                }
              } else {
                if (param0 != -28778) {
                  this.field_T = 19;
                  return super.g(-28778);
                } else {
                  return super.g(-28778);
                }
              }
            }
          }
        } else {
          if (param0 == -28778) {
            return super.g(-28778);
          } else {
            this.field_T = 19;
            return super.g(-28778);
          }
        }
    }

    final void f(byte param0) {
        if (!(null == this.field_Y)) {
            if (!(mm.field_a == this.field_Y)) {
                this.c(12 + this.field_V.field_q, this.field_V.field_p + (this.field_U + 12), 79);
                this.b(this.field_V, -124);
            }
            this.field_P.field_A = 256;
            this.field_Y = null;
        }
        super.f(param0);
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        this.f((byte) -128);
        return super.h(param0 ^ 0);
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param2 >= 9) {
                break L1;
              } else {
                this.i(96);
                break L1;
              }
            }
            if (!super.a(param0, param1, (byte) 42, param3)) {
              if (this.field_P != null) {
                L2: {
                  if ((param3 ^ -1) == -99) {
                    discarded$4 = this.field_P.a(param0, (byte) 61);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-100 != (param3 ^ -1)) {
                    break L3;
                  } else {
                    discarded$5 = this.field_P.a(param0, (byte) 61);
                    break L3;
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("ur.KA(");
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    private final void b(pk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -16 / ((param1 - -72) / 51);
              if (this.field_P != null) {
                this.field_P.b(false);
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
                  this.field_P = new in();
                  if (!Sumoblitz.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param0.a(107, 6, this.field_U + 6, param0.field_p, param0.field_q);
              this.field_P = new in(param0);
              break L2;
            }
            this.a(this.field_P, 124);
            this.field_V = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ur.DB(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    void b(byte param0, pk param1) {
        RuntimeException var3 = null;
        pk var4 = null;
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
              if (param0 < -87) {
                break L1;
              } else {
                var4 = (pk) null;
                this.b((pk) null, 78);
                break L1;
              }
            }
            L2: {
              L3: {
                this.field_V = param1;
                if (lw.field_a == this.field_Y) {
                  break L3;
                } else {
                  if (this.field_Y == sr.field_i) {
                    break L2;
                  } else {
                    this.field_Y = sr.field_i;
                    this.field_W = 0;
                    if (!Sumoblitz.field_L) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.a(false, this.field_V.field_p + this.field_U + 12, this.field_Z, this.field_V.field_q + 12);
              this.field_W = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ur.E(").append(param0).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != 0) {
            ur.k(65);
            field_X = null;
            return;
        }
        field_X = null;
    }

    final void i(int param0) {
        if (!(this.field_Y != sr.field_i)) {
            return;
        }
        this.field_W = param0;
        this.field_Y = mm.field_a;
        this.b(this.field_V, -124);
        this.field_P.field_A = 0;
        this.field_V = null;
    }

    static {
        field_Q = -1;
        field_X = "Passwords can only contain letters and numbers";
    }
}
