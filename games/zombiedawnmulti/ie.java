/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends al {
    private int field_mb;
    private cf field_kb;
    private int field_rb;
    private int field_lb;
    static int field_nb;
    static String field_ib;
    private int field_gb;
    static long field_sb;
    static int[] field_ob;
    private lf field_pb;
    private int field_qb;
    static cj field_jb;
    private na field_hb;

    public static void l(int param0) {
        if (param0 != 7181) {
            return;
        }
        field_jb = null;
        field_ob = null;
        field_ib = null;
    }

    boolean i(int param0) {
        int fieldTemp$17 = 0;
        boolean discarded$18 = false;
        boolean discarded$19 = false;
        boolean discarded$20 = false;
        boolean discarded$21 = false;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        boolean discarded$24 = false;
        boolean discarded$25 = false;
        boolean discarded$26 = false;
        boolean discarded$27 = false;
        boolean discarded$28 = false;
        boolean discarded$29 = false;
        int fieldTemp$30 = 0;
        boolean discarded$31 = false;
        boolean discarded$32 = false;
        boolean discarded$33 = false;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_pb != null) {
          if (ld.field_Rb != this.field_pb) {
            if (this.field_pb == lf.field_a) {
              fieldTemp$17 = this.field_lb + 1;
              this.field_lb = this.field_lb + 1;
              if (fieldTemp$17 != this.field_gb) {
                this.field_hb.field_E = (this.field_lb << -767149656) / this.field_gb;
                if (param0 == -27388) {
                  return super.i(-27388);
                } else {
                  discarded$18 = this.h(-5);
                  return super.i(-27388);
                }
              } else {
                this.field_hb.field_E = 256;
                this.field_pb = null;
                if (var3 != 0) {
                  this.field_hb.field_E = (this.field_lb << -767149656) / this.field_gb;
                  if (param0 == -27388) {
                    return super.i(-27388);
                  } else {
                    discarded$19 = this.h(-5);
                    return super.i(-27388);
                  }
                } else {
                  if (param0 == -27388) {
                    return super.i(-27388);
                  } else {
                    discarded$20 = this.h(-5);
                    return super.i(-27388);
                  }
                }
              }
            } else {
              if (param0 != -27388) {
                discarded$21 = this.h(-5);
                return super.i(-27388);
              } else {
                return super.i(-27388);
              }
            }
          } else {
            fieldTemp$22 = this.field_lb + 1;
            this.field_lb = this.field_lb + 1;
            if (fieldTemp$22 == this.field_qb) {
              this.field_pb = ll.field_j;
              this.a(this.field_mb, (byte) -112, this.field_rb + (12 - -this.field_kb.field_w), 12 - -this.field_kb.field_n);
              this.field_lb = 0;
              this.field_hb.field_E = 0;
              if (var3 != 0) {
                if (this.field_pb == lf.field_a) {
                  fieldTemp$23 = this.field_lb + 1;
                  this.field_lb = this.field_lb + 1;
                  if (fieldTemp$23 != this.field_gb) {
                    this.field_hb.field_E = (this.field_lb << -767149656) / this.field_gb;
                    if (param0 != -27388) {
                      discarded$24 = this.h(-5);
                      return super.i(-27388);
                    } else {
                      return super.i(-27388);
                    }
                  } else {
                    this.field_hb.field_E = 256;
                    this.field_pb = null;
                    if (var3 == 0) {
                      if (param0 != -27388) {
                        discarded$25 = this.h(-5);
                        return super.i(-27388);
                      } else {
                        return super.i(-27388);
                      }
                    } else {
                      L0: {
                        this.field_hb.field_E = (this.field_lb << -767149656) / this.field_gb;
                        if (param0 == -27388) {
                          break L0;
                        } else {
                          discarded$26 = this.h(-5);
                          break L0;
                        }
                      }
                      return super.i(-27388);
                    }
                  }
                } else {
                  if (param0 != -27388) {
                    discarded$27 = this.h(-5);
                    return super.i(-27388);
                  } else {
                    return super.i(-27388);
                  }
                }
              } else {
                if (param0 != -27388) {
                  discarded$28 = this.h(-5);
                  return super.i(-27388);
                } else {
                  return super.i(-27388);
                }
              }
            } else {
              this.field_hb.field_E = 256 + -((this.field_lb << 1296181800) / this.field_qb);
              if (var3 != 0) {
                this.field_pb = ll.field_j;
                this.a(this.field_mb, (byte) -112, this.field_rb + (12 - -this.field_kb.field_w), 12 - -this.field_kb.field_n);
                this.field_lb = 0;
                this.field_hb.field_E = 0;
                if (var3 == 0) {
                  L1: {
                    if (param0 == -27388) {
                      break L1;
                    } else {
                      discarded$29 = this.h(-5);
                      break L1;
                    }
                  }
                  return super.i(-27388);
                } else {
                  L2: {
                    if (this.field_pb == lf.field_a) {
                      L3: {
                        fieldTemp$30 = this.field_lb + 1;
                        this.field_lb = this.field_lb + 1;
                        if (fieldTemp$30 != this.field_gb) {
                          break L3;
                        } else {
                          this.field_hb.field_E = 256;
                          this.field_pb = null;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_hb.field_E = (this.field_lb << -767149656) / this.field_gb;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (param0 == -27388) {
                      break L4;
                    } else {
                      discarded$31 = this.h(-5);
                      break L4;
                    }
                  }
                  return super.i(-27388);
                }
              } else {
                if (param0 != -27388) {
                  discarded$32 = this.h(-5);
                  return super.i(-27388);
                } else {
                  return super.i(-27388);
                }
              }
            }
          }
        } else {
          if (param0 == -27388) {
            return super.i(-27388);
          } else {
            discarded$33 = this.h(-5);
            return super.i(-27388);
          }
        }
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_hb != null) {
                L1: {
                  if (98 != param0) {
                    break L1;
                  } else {
                    discarded$4 = this.field_hb.a(param2, param3 + 6208);
                    break L1;
                  }
                }
                L2: {
                  if (param0 == 99) {
                    discarded$5 = this.field_hb.a(param2, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("ie.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (null == ki.field_e) {
          if (param1) {
            field_ob = (int[]) null;
            return;
          } else {
            return;
          }
        } else {
          oo.f(oo.field_f, oo.field_e, -oo.field_f + oo.field_g, oo.field_d - oo.field_e);
          ki.field_e.c(param0, -1);
          if (!param1) {
            return;
          } else {
            field_ob = (int[]) null;
            return;
          }
        }
    }

    final void j(byte param0) {
        if (param0 < -70) {
          if (ld.field_Rb == this.field_pb) {
            return;
          } else {
            this.field_pb = lf.field_a;
            this.field_lb = 0;
            this.a(this.field_kb, false);
            this.field_hb.field_E = 0;
            this.field_kb = null;
            return;
          }
        } else {
          field_ob = (int[]) null;
          if (ld.field_Rb == this.field_pb) {
            return;
          } else {
            this.field_pb = lf.field_a;
            this.field_lb = 0;
            this.a(this.field_kb, false);
            this.field_hb.field_E = 0;
            this.field_kb = null;
            return;
          }
        }
    }

    final boolean h(int param0) {
        this.h((byte) 30);
        if (param0 != -6134) {
            return false;
        }
        return super.h(-6134);
    }

    ie(vk param0, cf param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, 12 + (param2 - -param1.field_w));
        try {
            this.field_gb = param3;
            this.field_qb = param3;
            this.field_mb = param4;
            this.field_rb = param2;
            this.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(byte param0) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        if (this.field_pb != null) {
          if (this.field_pb == lf.field_a) {
            this.field_pb = null;
            this.field_hb.field_E = 256;
            super.h((byte) 63);
            if (param0 >= 29) {
              return;
            } else {
              discarded$6 = this.h(-78);
              return;
            }
          } else {
            this.b(12 + this.field_kb.field_n, this.field_kb.field_w + (this.field_rb + 12), 78);
            this.a(this.field_kb, false);
            this.field_pb = null;
            this.field_hb.field_E = 256;
            super.h((byte) 63);
            if (param0 < 29) {
              discarded$7 = this.h(-78);
              return;
            } else {
              return;
            }
          }
        } else {
          super.h((byte) 63);
          if (param0 >= 29) {
            return;
          } else {
            discarded$8 = this.h(-78);
            return;
          }
        }
    }

    void a(cf param0, byte param1) {
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
                this.field_kb = param0;
                var3_int = -11 % ((param1 - 61) / 56);
                if (this.field_pb == ll.field_j) {
                  break L2;
                } else {
                  if (ld.field_Rb == this.field_pb) {
                    break L1;
                  } else {
                    this.field_lb = 0;
                    this.field_pb = ld.field_Rb;
                    if (!ZombieDawnMulti.field_E) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.a(this.field_mb, (byte) -112, 12 - -this.field_rb - -this.field_kb.field_w, this.field_kb.field_n + 12);
              this.field_lb = 0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("ie.FA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void a(cf param0, boolean param1) {
        RuntimeException runtimeException = null;
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
              if (!param1) {
                break L1;
              } else {
                this.field_lb = -61;
                break L1;
              }
            }
            L2: {
              if (null == this.field_hb) {
                break L2;
              } else {
                this.field_hb.a(true);
                break L2;
              }
            }
            L3: {
              L4: {
                if (param0 == null) {
                  break L4;
                } else {
                  param0.b(6, 6 + this.field_rb, 28972, param0.field_n, param0.field_w);
                  this.field_hb = new na(param0);
                  if (!ZombieDawnMulti.field_E) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_hb = new na();
              break L3;
            }
            this.b((byte) 95, this.field_hb);
            this.field_kb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("ie.BA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
