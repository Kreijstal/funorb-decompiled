/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc extends ofa {
    private sla field_M;
    static int[] field_N;
    private int field_R;
    private int field_O;
    private int field_Q;
    static String field_L;
    private rg field_P;
    private int field_S;
    private ae field_T;
    private int field_U;

    private final void a(boolean param0, ae param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        ae var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (null != this.field_P) {
                this.field_P.p(83);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  break L3;
                } else {
                  param1.a((byte) -31, param1.field_m, param1.field_p, 6, this.field_S + 6);
                  this.field_P = new rg(param1);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_P = new rg();
              break L2;
            }
            L4: {
              this.a(this.field_P, -1);
              this.field_T = null;
              if (!param0) {
                break L4;
              } else {
                var4 = (ae) null;
                discarded$2 = this.a('￁', (ae) null, 57, true);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("lc.E(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void c(boolean param0) {
        if (this.field_M != null) {
          if (this.field_M == nr.field_a) {
            this.field_P.field_y = 256;
            this.field_M = null;
            super.c(param0);
            return;
          } else {
            this.c(-11560, this.field_T.field_p + (this.field_S + 12), 12 + this.field_T.field_m);
            this.a(false, this.field_T);
            this.field_P.field_y = 256;
            this.field_M = null;
            super.c(param0);
            return;
          }
        } else {
          super.c(param0);
          return;
        }
    }

    void a(int param0, ae param1) {
        RuntimeException var3 = null;
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
              L2: {
                this.field_T = param1;
                if (this.field_M != us.field_e) {
                  break L2;
                } else {
                  this.a(this.field_Q, this.field_T.field_m + 12, this.field_T.field_p + this.field_S + 12, (byte) -105);
                  this.field_R = 0;
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (bj.field_p != this.field_M) {
                this.field_M = bj.field_p;
                this.field_R = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 > 67) {
                break L3;
              } else {
                this.field_R = -128;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("lc.F(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    boolean a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_M) {
          if (this.field_M != bj.field_p) {
            if (nr.field_a == this.field_M) {
              fieldTemp$4 = this.field_R + 1;
              this.field_R = this.field_R + 1;
              if (this.field_U != fieldTemp$4) {
                this.field_P.field_y = (this.field_R << 446193096) / this.field_U;
                if (param0 > 126) {
                  return super.a(127);
                } else {
                  this.field_T = (ae) null;
                  return super.a(127);
                }
              } else {
                this.field_M = null;
                this.field_P.field_y = 256;
                if (var3 != 0) {
                  this.field_P.field_y = (this.field_R << 446193096) / this.field_U;
                  if (param0 > 126) {
                    return super.a(127);
                  } else {
                    this.field_T = (ae) null;
                    return super.a(127);
                  }
                } else {
                  if (param0 > 126) {
                    return super.a(127);
                  } else {
                    this.field_T = (ae) null;
                    return super.a(127);
                  }
                }
              }
            } else {
              if (param0 <= 126) {
                this.field_T = (ae) null;
                return super.a(127);
              } else {
                return super.a(127);
              }
            }
          } else {
            fieldTemp$5 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$5 == this.field_O) {
              this.field_M = us.field_e;
              this.a(this.field_Q, this.field_T.field_m + 12, this.field_T.field_p + (this.field_S + 12), (byte) -103);
              this.field_R = 0;
              this.field_P.field_y = 0;
              if (var3 != 0) {
                if (nr.field_a == this.field_M) {
                  fieldTemp$6 = this.field_R + 1;
                  this.field_R = this.field_R + 1;
                  if (this.field_U != fieldTemp$6) {
                    this.field_P.field_y = (this.field_R << 446193096) / this.field_U;
                    if (param0 <= 126) {
                      this.field_T = (ae) null;
                      return super.a(127);
                    } else {
                      return super.a(127);
                    }
                  } else {
                    this.field_M = null;
                    this.field_P.field_y = 256;
                    if (var3 == 0) {
                      if (param0 <= 126) {
                        this.field_T = (ae) null;
                        return super.a(127);
                      } else {
                        return super.a(127);
                      }
                    } else {
                      L0: {
                        this.field_P.field_y = (this.field_R << 446193096) / this.field_U;
                        if (param0 > 126) {
                          break L0;
                        } else {
                          this.field_T = (ae) null;
                          break L0;
                        }
                      }
                      return super.a(127);
                    }
                  }
                } else {
                  if (param0 <= 126) {
                    this.field_T = (ae) null;
                    return super.a(127);
                  } else {
                    return super.a(127);
                  }
                }
              } else {
                if (param0 <= 126) {
                  this.field_T = (ae) null;
                  return super.a(127);
                } else {
                  return super.a(127);
                }
              }
            } else {
              this.field_P.field_y = 256 + -((this.field_R << 1909569320) / this.field_O);
              if (var3 != 0) {
                this.field_M = us.field_e;
                this.a(this.field_Q, this.field_T.field_m + 12, this.field_T.field_p + (this.field_S + 12), (byte) -103);
                this.field_R = 0;
                this.field_P.field_y = 0;
                if (var3 == 0) {
                  L1: {
                    if (param0 > 126) {
                      break L1;
                    } else {
                      this.field_T = (ae) null;
                      break L1;
                    }
                  }
                  return super.a(127);
                } else {
                  L2: {
                    if (nr.field_a == this.field_M) {
                      L3: {
                        fieldTemp$7 = this.field_R + 1;
                        this.field_R = this.field_R + 1;
                        if (this.field_U != fieldTemp$7) {
                          break L3;
                        } else {
                          this.field_M = null;
                          this.field_P.field_y = 256;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_P.field_y = (this.field_R << 446193096) / this.field_U;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (param0 > 126) {
                      break L4;
                    } else {
                      this.field_T = (ae) null;
                      break L4;
                    }
                  }
                  return super.a(127);
                }
              } else {
                if (param0 <= 126) {
                  this.field_T = (ae) null;
                  return super.a(127);
                } else {
                  return super.a(127);
                }
              }
            }
          }
        } else {
          if (param0 > 126) {
            return super.a(127);
          } else {
            this.field_T = (ae) null;
            return super.a(127);
          }
        }
    }

    public static void e(boolean param0) {
        field_N = null;
        if (param0) {
            lc.e(false);
            field_L = null;
            return;
        }
        field_L = null;
    }

    final void d(int param0) {
        if (this.field_M != bj.field_p) {
          this.field_M = nr.field_a;
          if (param0 > -20) {
            this.field_R = 19;
            this.field_R = 0;
            this.a(false, this.field_T);
            this.field_P.field_y = 0;
            this.field_T = null;
            return;
          } else {
            this.field_R = 0;
            this.a(false, this.field_T);
            this.field_P.field_y = 0;
            this.field_T = null;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (null != this.field_P) {
                L1: {
                  if (param2 != 98) {
                    break L1;
                  } else {
                    discarded$4 = this.field_P.a(param1, false);
                    break L1;
                  }
                }
                L2: {
                  if ((param2 ^ -1) == -100) {
                    discarded$5 = this.field_P.a(param1, false);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
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
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("lc.P(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    lc(jta param0, ae param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param1.field_p + param2 + 12);
        try {
            this.field_U = param3;
            this.field_O = param3;
            this.field_Q = param4;
            this.field_S = param2;
            this.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0) {
        if (param0 > -53) {
            return false;
        }
        this.c(true);
        return super.a((byte) -120);
    }

    static {
        field_N = new int[1];
        field_L = "Score";
    }
}
