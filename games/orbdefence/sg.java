/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sg extends ta {
    boolean field_A;
    static int field_B;
    static String field_E;
    private sk field_C;
    static String field_F;
    private int field_D;

    private final int e(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          L0: {
            this.field_A = false;
            if (!this.field_A) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (this == this.field_C.k(3469)) {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!this.field_A) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (this == this.field_C.k(3469)) {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final void a(int param0, byte param1, int param2) {
        this.a(ed.field_a + -param2 >> -637529087, lh.field_d + -param0 >> 909497057, param0, (byte) -90, param2);
        if (param1 != -81) {
            field_E = (String) null;
        }
    }

    boolean l(int param0) {
        int discarded$2 = 0;
        if (param0 == 194) {
          this.field_D = this.e(false);
          if (this.field_D == 0) {
            if (this.field_A) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$2 = this.e(true);
          this.field_D = this.e(false);
          if (this.field_D == 0) {
            if (this.field_A) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    boolean d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var2 = this.e(param0);
        var3 = var2 + -this.field_D;
        if (var3 <= 0) {
          if ((var3 ^ -1) > -1) {
            L0: {
              L1: {
                this.field_D = this.field_D + (-16 + (var3 - -1)) / 16;
                if (0 != this.field_D) {
                  break L1;
                } else {
                  if (0 != var2) {
                    break L1;
                  } else {
                    if (this.field_A) {
                      break L1;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      break L0;
                    }
                  }
                }
              }
              stackOut_32_0 = 0;
              stackIn_33_0 = stackOut_32_0;
              break L0;
            }
            return stackIn_33_0 != 0;
          } else {
            L2: {
              L3: {
                if (0 != this.field_D) {
                  break L3;
                } else {
                  if (0 != var2) {
                    break L3;
                  } else {
                    if (this.field_A) {
                      break L3;
                    } else {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L2;
            }
            return stackIn_27_0 != 0;
          }
        } else {
          this.field_D = this.field_D + (var3 - -8 + -1) / 8;
          if ((var3 ^ -1) > -1) {
            this.field_D = this.field_D + (-16 + (var3 - -1)) / 16;
            if (0 == this.field_D) {
              if (0 != var2) {
                return false;
              } else {
                L4: {
                  if (this.field_A) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                return stackIn_18_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (0 == this.field_D) {
              if (0 != var2) {
                return false;
              } else {
                L5: {
                  if (this.field_A) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L5;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L5;
                  }
                }
                return stackIn_8_0 != 0;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void k(int param0) {
        if (param0 != -16) {
          field_E = (String) null;
          ed.a((String) null, param0 + 16, "");
          return;
        } else {
          ed.a((String) null, param0 + 16, "");
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_D != 0) {
          if (this.field_D < 256) {
            if (me.field_f != null) {
              if (this.field_m <= me.field_f.field_o) {
                if (me.field_f.field_k >= this.field_r) {
                  de.a(param2 ^ -1048454, me.field_f);
                  ul.d();
                  this.a(0, 0, -9111);
                  super.a(-param0 - this.field_n, param1, param2, -this.field_s + -param3);
                  oc.g((byte) -105);
                  me.field_f.a(param3 + this.field_s, param0 - -this.field_n, this.field_D);
                  return;
                } else {
                  me.field_f = new hj(this.field_m, this.field_r);
                  de.a(param2 ^ -1048454, me.field_f);
                  ul.d();
                  this.a(0, 0, -9111);
                  super.a(-param0 - this.field_n, param1, param2, -this.field_s + -param3);
                  oc.g((byte) -105);
                  me.field_f.a(param3 + this.field_s, param0 - -this.field_n, this.field_D);
                  return;
                }
              } else {
                me.field_f = new hj(this.field_m, this.field_r);
                de.a(param2 ^ -1048454, me.field_f);
                ul.d();
                this.a(0, 0, -9111);
                super.a(-param0 - this.field_n, param1, param2, -this.field_s + -param3);
                oc.g((byte) -105);
                me.field_f.a(param3 + this.field_s, param0 - -this.field_n, this.field_D);
                return;
              }
            } else {
              me.field_f = new hj(this.field_m, this.field_r);
              de.a(param2 ^ -1048454, me.field_f);
              ul.d();
              this.a(0, 0, -9111);
              super.a(-param0 - this.field_n, param1, param2, -this.field_s + -param3);
              oc.g((byte) -105);
              me.field_f.a(param3 + this.field_s, param0 - -this.field_n, this.field_D);
              return;
            }
          } else {
            if (param1 != 0) {
              return;
            } else {
              this.a(param3 - -this.field_s, param0 + this.field_n, -9111);
              super.a(param0, param1, param2 + 0, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    sg(sk param0, int param1, int param2) {
        super(ed.field_a + -param1 >> -894401855, -param2 + lh.field_d >> 1855598017, param1, param2, (td) null);
        try {
            this.field_C = param0;
            this.field_A = false;
            this.field_D = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    final static boolean c(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          if (hi.field_k >= 10) {
            if (d.field_k) {
              return false;
            } else {
              L0: {
                if (p.a(23236)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static e a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        e var7 = null;
        int var8 = 0;
        e stackIn_4_0 = null;
        e stackIn_8_0 = null;
        e stackIn_13_0 = null;
        e stackIn_17_0 = null;
        e stackIn_19_0 = null;
        e stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        e stackOut_3_0 = null;
        e stackOut_7_0 = null;
        e stackOut_16_0 = null;
        e stackOut_18_0 = null;
        e stackOut_21_0 = null;
        e stackOut_12_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = oc.field_M;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -256) {
                stackOut_7_0 = vj.field_c;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == -1326) {
                    break L1;
                  } else {
                    field_B = -11;
                    break L1;
                  }
                }
                var3 = g.a(-121, '.', param1);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var5 >= var4.length) {
                          break L4;
                        } else {
                          var6 = var4[var5];
                          var7 = eg.b(0, var6);
                          stackOut_16_0 = (e) (var7);
                          stackIn_22_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var8 != 0) {
                            break L3;
                          } else {
                            if (stackIn_17_0 == null) {
                              var5++;
                              if (var8 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            } else {
                              stackOut_18_0 = (e) (var7);
                              stackIn_19_0 = stackOut_18_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                      }
                      stackOut_21_0 = dh.a(var3[-1 + var3.length], (byte) 118);
                      stackIn_22_0 = stackOut_21_0;
                      break L3;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_12_0 = oc.field_M;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("sg.QB(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                return stackIn_19_0;
              }
            }
          }
        }
    }

    final pj b(byte param0) {
        pj var2 = super.b(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (pj) (this);
    }

    public static void a(byte param0) {
        field_F = null;
        field_E = null;
        int var1 = 30 / ((param0 - -17) / 47);
    }

    static {
        field_F = "Passwords must be between 5 and 20 characters long";
    }
}
