/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class csa extends vg implements noa, qn, fo, gma, lj, ew {
    int field_m;
    private int field_q;
    int field_k;
    int field_j;
    mka[] field_t;
    private boolean field_v;
    private int field_h;
    private csa field_u;
    bca field_z;
    int field_l;
    static int field_n;
    static int field_g;
    la field_o;
    private gpa field_w;
    static su field_y;
    int field_p;
    private int field_f;
    private gpa field_s;
    int field_r;
    static int[] field_i;
    boolean field_x;

    public final int e(byte param0) {
        csa var3 = null;
        if (param0 >= -86) {
          var3 = (csa) null;
          this.a((csa) null, -115, (byte) -23);
          return this.g((byte) 115);
        } else {
          return this.g((byte) 115);
        }
    }

    final void a(boolean param0, int param1) {
        boolean discarded$1 = false;
        int var3 = 0;
        int var5 = 0;
        csa var6 = null;
        csa var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(param0, param1)) {
          return;
        } else {
          this.x(8);
          var3 = 0;
          if (!param0) {
            discarded$1 = this.s(-56);
            L0: while (true) {
              if (var3 < this.field_t.length) {
                var7 = this.field_t[var3].a(108);
                if (var5 == 0) {
                  L1: {
                    if (var7 != null) {
                      var7.a(param0, param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L2: while (true) {
              if (var3 < this.field_t.length) {
                var6 = this.field_t[var3].a(108);
                if (var5 == 0) {
                  L3: {
                    if (var6 != null) {
                      var6.a(param0, param1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3++;
                  continue L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        csa var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_2_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        this.w(-124);
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_t.length) {
            if (param0) {
              return;
            } else {
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              field_y = (su) ((Object) stackIn_10_0);
              return;
            }
          } else {
            var3 = this.field_t[var2].a(94);
            stackOut_2_0 = null;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (var4 == 0) {
              L1: {
                if (stackIn_4_0 != var3) {
                  var3.c(true);
                  break L1;
                } else {
                  break L1;
                }
              }
              var2++;
              continue L0;
            } else {
              field_y = (su) ((Object) stackIn_3_0);
              return;
            }
          }
        }
    }

    private final mka a(int param0, int param1) {
        boolean discarded$2 = false;
        csa var4 = null;
        if (param1 != 8192) {
          var4 = (csa) null;
          discarded$2 = this.a(false, -41, (csa) null);
          return this.field_t[param0];
        } else {
          return this.field_t[param0];
        }
    }

    final static void a(boolean param0) {
        L0: {
          hk.field_e = new jea(0L, (jea) null);
          if (rca.field_p) {
            hk.field_e.b(-127, lva.field_t);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          field_n = -21;
          hk.field_e.b(-127, rra.field_e);
          oca.field_b = new lla(cla.field_o, hk.field_e);
          nra.field_a = new jea(0L, (jea) null);
          nra.field_a.b(-122, oca.field_b.field_a);
          nra.field_a.b(-128, st.field_j);
          re.a(-29040);
          return;
        } else {
          hk.field_e.b(-127, rra.field_e);
          oca.field_b = new lla(cla.field_o, hk.field_e);
          nra.field_a = new jea(0L, (jea) null);
          nra.field_a.b(-122, oca.field_b.field_a);
          nra.field_a.b(-128, st.field_j);
          re.a(-29040);
          return;
        }
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        gpa discarded$0 = null;
        if (param0 < 68) {
            discarded$0 = this.i((byte) -75);
            return false;
        }
        return false;
    }

    public final ew h(byte param0) {
        int discarded$0 = 0;
        if (param0 < 105) {
            discarded$0 = this.r(70);
            return (ew) ((Object) this.o((byte) -34));
        }
        return (ew) ((Object) this.o((byte) -34));
    }

    public final boolean h(int param0) {
        mka discarded$0 = null;
        if (param0 != 18407) {
            discarded$0 = this.a(20, 6);
            return false;
        }
        return false;
    }

    public final int k(int param0) {
        if (param0 != -21185) {
            this.field_l = -20;
            return this.field_p;
        }
        return this.field_p;
    }

    public final la f(byte param0) {
        int var2 = -126 / ((param0 - 0) / 61);
        return this.field_o;
    }

    public final int b(byte param0) {
        int var2 = -53 / ((param0 - -23) / 53);
        return this.d(3);
    }

    void x(int param0) {
        if (param0 == 8) {
            return;
        }
        this.field_r = -107;
    }

    private final void m(byte param0) {
        boolean discarded$5 = false;
        mka[] var2 = null;
        int var3 = 0;
        mka var4 = null;
        int var5 = 0;
        mka[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = this.field_t;
        var2 = var6;
        if (param0 == -24) {
          var3 = 0;
          L0: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              var4.a(this.field_f, (byte) -61, this.field_o, this.field_h);
              var3++;
              if (var5 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          discarded$5 = this.d((byte) -51);
          var3 = 0;
          L1: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              var4.a(this.field_f, (byte) -61, this.field_o, this.field_h);
              var3++;
              if (var5 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    private final boolean p(byte param0) {
        int var2 = -18 / ((param0 - -28) / 57);
        return this.field_o.o((byte) -82);
    }

    final void a(boolean param0, int param1, ui param2, ui param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        csa var6 = null;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != null) {
                this.field_w = param2.a(86, false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 6) {
                break L2;
              } else {
                this.field_f = -31;
                break L2;
              }
            }
            L3: {
              if (param3 == null) {
                break L3;
              } else {
                this.field_s = param3.a(104, false);
                break L3;
              }
            }
            var5_int = 0;
            L4: while (true) {
              if (this.field_t.length <= var5_int) {
                break L0;
              } else {
                var6 = this.field_t[var5_int].a(120);
                if (var7 == 0) {
                  L5: {
                    if (var6 == null) {
                      break L5;
                    } else {
                      var6.a(param0, 6, param2, param3);
                      break L5;
                    }
                  }
                  var5_int++;
                  continue L4;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("csa.T(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    public final boolean l(int param0) {
        if (param0 == 0) {
          if (null == this.field_u) {
            if (this.field_o.o((byte) -82)) {
              if (this.b(true, this.field_o.i(6029))) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (!this.field_u.l(0)) {
              if (this.field_o.o((byte) -82)) {
                if (this.b(true, this.field_o.i(6029))) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final boolean a(boolean param0, int param1, csa param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        csa var5 = null;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param1;
            L1: while (true) {
              L2: {
                if (this.field_t.length <= var4_int) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var5 = this.field_t[var4_int].a(param1 ^ -103);
                      if (var5 != null) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param2 != var5) {
                      if (!param0) {
                        break L3;
                      } else {
                        if (var5.a(param0, 0, param2)) {
                          stackOut_12_0 = 1;
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  var4_int++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("csa.HB(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    public final int c(int param0) {
        if (param0 > -11) {
            this.field_u = (csa) null;
            return this.field_l;
        }
        return this.field_l;
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != 110) {
          this.field_s = (gpa) null;
          return io.a(param4, this.e(9648), (byte) -62, param3, this.d(3), param1, this.field_k, this.field_l, param2);
        } else {
          return io.a(param4, this.e(9648), (byte) -62, param3, this.d(3), param1, this.field_k, this.field_l, param2);
        }
    }

    void a(la param0, int param1) {
        RuntimeException runtimeException = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
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
              if (param1 == 1) {
                break L1;
              } else {
                this.field_k = -87;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != this.field_u) {
                  break L3;
                } else {
                  this.field_j = param0.a(this.field_j, (byte) 71);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_j = -this.field_j;
              break L2;
            }
            L4: {
              this.field_r = dfa.a(-this.field_r, 8192, -85);
              this.d(true);
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (this.field_v) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L4;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L4;
              }
            }
            ((csa) (this)).field_v = stackIn_9_1 != 0;
            this.m((byte) -24);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("csa.BB(");
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param0 != 9648) {
          return 20;
        } else {
          L0: {
            var2 = this.field_p;
            if (null == this.field_u) {
              break L0;
            } else {
              var3 = this.field_j >> 1034964488;
              var4 = var2 >> -937468920;
              var2 = var3 * (this.field_u.field_f >> -1075285880) + var4 * (this.field_u.field_h >> -190151128);
              var2 = var2 + this.field_u.e(9648);
              break L0;
            }
          }
          return var2;
        }
    }

    public static void j(byte param0) {
        g[] var2 = null;
        field_i = null;
        if (param0 != -107) {
          var2 = (g[]) null;
          csa.a(104, -8, 16, (g[]) null);
          field_y = null;
          return;
        } else {
          field_y = null;
          return;
        }
    }

    public final void f(int param0) {
        if (param0 == -4366) {
            return;
        }
        boolean discarded$0 = this.a((byte) -31, 116, -25, -38, 120);
    }

    public final int i(int param0) {
        if (param0 <= 90) {
            return 61;
        }
        return this.field_j;
    }

    abstract lj u(int param0);

    final void a(byte param0, mka[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_t = param1;
              if (param0 > 64) {
                break L1;
              } else {
                this.m(-58);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (param1.length <= var3_int) {
                break L0;
              } else {
                this.field_t[var3_int].a(-34, var3_int, (csa) (this));
                var3_int++;
                if (var4 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("csa.PB(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final csa a(int param0, boolean param1, boolean param2) {
        csa var8 = null;
        csa var20 = null;
        csa var29 = null;
        csa var32 = null;
        csa var33 = null;
        csa var34 = null;
        int var4 = 0;
        csa var6 = null;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param1) {
            if (param0 == this.field_s.a((byte) 111)) {
                return (csa) (this);
            }
            if (param2) {
                this.field_r = 111;
                var4 = 0;
                do {
                    if (this.field_t.length <= var4) {
                        return null;
                    }
                    var8 = this.field_t[var4].a(-92);
                    if (var8 != null) {
                        var6 = var8.a(param0, param1, false);
                        if (!(var6 == null)) {
                            return var6;
                        }
                    }
                    var4++;
                } while (var7 == 0);
                return null;
            }
            var4 = 0;
            do {
                if (this.field_t.length <= var4) {
                    return null;
                }
                var20 = this.field_t[var4].a(-92);
                if (var20 != null) {
                    var6 = var20.a(param0, param1, false);
                    if (!(var6 == null)) {
                        return var6;
                    }
                }
                var4++;
            } while (var7 == 0);
            return null;
        }
        if (!param1) {
            if (param0 == this.field_w.a((byte) 88)) {
                return (csa) (this);
            }
            if (param2) {
                this.field_r = 111;
                var4 = 0;
                do {
                    if (this.field_t.length <= var4) {
                        return null;
                    }
                    var29 = this.field_t[var4].a(-92);
                    if (var29 != null) {
                        var6 = var29.a(param0, param1, false);
                        if (!(var6 == null)) {
                            return var6;
                        }
                    }
                    var4++;
                } while (var7 == 0);
                return null;
            }
            var4 = 0;
            do {
                if (this.field_t.length <= var4) {
                    return null;
                }
                var32 = this.field_t[var4].a(-92);
                if (var32 != null) {
                    var6 = var32.a(param0, param1, false);
                    if (!(var6 == null)) {
                        return var6;
                    }
                }
                var4++;
            } while (var7 == 0);
            return null;
        }
        if (param2) {
            this.field_r = 111;
            var4 = 0;
            do {
                if (this.field_t.length <= var4) {
                    return null;
                }
                var33 = this.field_t[var4].a(-92);
                if (var33 != null) {
                    var6 = var33.a(param0, param1, false);
                    if (!(var6 == null)) {
                        return var6;
                    }
                }
                var4++;
            } while (var7 == 0);
            return null;
        }
        var4 = 0;
        do {
            if (this.field_t.length <= var4) {
                return null;
            }
            var34 = this.field_t[var4].a(-92);
            if (var34 != null) {
                var6 = var34.a(param0, param1, false);
                if (!(var6 == null)) {
                    return var6;
                }
            }
            var4++;
        } while (var7 == 0);
        return null;
    }

    final csa a(int param0, boolean param1, int param2) {
        fsa var5 = null;
        if (param2 == 20) {
          if (!param1) {
            return this.field_o.a(param1, param0, param2 ^ 18);
          } else {
            return this.a(param0, param1, false);
          }
        } else {
          var5 = (fsa) null;
          this.a(true, false, (la) null, 109, -103, 35, (fsa) null);
          if (!param1) {
            return this.field_o.a(param1, param0, param2 ^ 18);
          } else {
            return this.a(param0, param1, false);
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        if (param0 != 1434528720) {
          discarded$2 = this.g(113);
          this.field_j = param2;
          this.field_p = param1;
          return;
        } else {
          this.field_j = param2;
          this.field_p = param1;
          return;
        }
    }

    csa(la param0, int param1, kh param2, csa param3) {
        this(param0, param1);
        RuntimeException var5 = null;
        int var5_int = 0;
        csa var6 = null;
        int var7 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_22_0 = 0;
        boolean stackOut_26_0 = false;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_u = param3;
              if (param3 != null) {
                break L1;
              } else {
                L2: {
                  if ((param0.field_E ^ -1) < -21) {
                    break L2;
                  } else {
                    this.field_j = bla.a(true, 12, param2.b((byte) 44, 12)) << 555277520;
                    this.field_p = bla.a(true, 12, param2.b((byte) 44, 12)) << 743325648;
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_j = 1048576 * bla.a(true, 8, param2.b((byte) 44, 8));
                this.field_p = 1048576 * bla.a(true, 8, param2.b((byte) 44, 8));
                break L1;
              }
            }
            L3: {
              if (!this.v(555277520)) {
                break L3;
              } else {
                L4: {
                  if (20 < param0.field_E) {
                    break L4;
                  } else {
                    this.field_l = param2.b((byte) 44, 10) << 1434528720;
                    this.field_k = param2.b((byte) 44, 10) << 2128485232;
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_l = 2097152 * param2.b((byte) 44, 6);
                this.field_k = 2097152 * param2.b((byte) 44, 6);
                break L3;
              }
            }
            L5: {
              if (!this.n((byte) -122)) {
                break L5;
              } else {
                this.field_r = oo.a(4, 8192, 0, param2.b((byte) 44, 4));
                break L5;
              }
            }
            L6: {
              if (20 > param0.field_E) {
                break L6;
              } else {
                if (!this.a(6)) {
                  break L6;
                } else {
                  L7: {
                    stackOut_13_0 = this;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if ((param2.b((byte) 44, 1) ^ -1) != -2) {
                      stackOut_15_0 = this;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L7;
                    } else {
                      stackOut_14_0 = this;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L7;
                    }
                  }
                  ((csa) (this)).field_x = stackIn_16_1 != 0;
                  break L6;
                }
              }
            }
            L8: {
              this.field_z = new bca(param0.field_E, param2);
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if ((param2.b((byte) 44, 1) ^ -1) != -2) {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L8;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L8;
              }
            }
            ((csa) (this)).field_v = stackIn_20_1 != 0;
            var5_int = 0;
            L9: while (true) {
              L10: {
                L11: {
                  if (this.field_t.length <= var5_int) {
                    break L11;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_27_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var7 != 0) {
                      break L10;
                    } else {
                      L12: {
                        if (stackIn_23_0 != param2.b((byte) 44, 1)) {
                          break L12;
                        } else {
                          var6 = vha.field_c.a(param2, param0, (byte) -7, (csa) (this));
                          var6.a(1434528720, this.field_t[var5_int].c((byte) 126).field_d << 136544272, this.field_t[var5_int].c((byte) 111).field_f << 1434159056);
                          this.field_t[var5_int].a(var6, 126);
                          break L12;
                        }
                      }
                      var5_int++;
                      if (var7 == 0) {
                        continue L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                stackOut_26_0 = this.field_v;
                stackIn_27_0 = stackOut_26_0 ? 1 : 0;
                break L10;
              }
              L13: {
                if (stackIn_27_0 != 0) {
                  this.m((byte) -24);
                  this.d(true);
                  break L13;
                } else {
                  this.d(true);
                  break L13;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var5);
            stackOut_31_1 = new StringBuilder().append("csa.<init>(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L14;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L14;
            }
          }
          L15: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L15;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L15;
            }
          }
          L16: {
            stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param3 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L16;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L16;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
    }

    void a(int param0, boolean param1) {
        this.field_j = this.field_j + param0;
        if (!param1) {
          this.field_w = (gpa) null;
          this.field_p = this.field_p + param0;
          return;
        } else {
          this.field_p = this.field_p + param0;
          return;
        }
    }

    public final boolean b(boolean param0) {
        if (!param0) {
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, g[] param3) {
        g var5 = null;
        if (param1 != 2097152) {
            field_g = -32;
        }
        if (!(param0 != param2)) {
            return;
        }
        try {
            var5 = param3[param2];
            g var4 = var5;
            param3[param2] = param3[param0];
            param3[param0] = var5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "csa.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(csa param0, int param1, byte param2) {
        try {
            this.field_q = param1;
            if (param2 != -52) {
                this.field_r = -73;
            }
            this.field_u = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "csa.OB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, uw param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!this.p((byte) -94)) {
                break L1;
              } else {
                param1.a((byte) -116, this.t(8), (fo) (this));
                break L1;
              }
            }
            L2: {
              if (param0 == -1704) {
                break L2;
              } else {
                field_n = 90;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("csa.GB(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public final boolean j(int param0) {
        int discarded$0 = 0;
        if (param0 != -1) {
            discarded$0 = this.e((byte) 109);
            return false;
        }
        return false;
    }

    abstract boolean s(int param0);

    public final void m(int param0) {
        int var2 = -58 % ((param0 - 28) / 49);
        if (!(this.s(-15254))) {
            return;
        }
        this.field_x = !this.field_x ? true : false;
    }

    public final void a(int param0, iq param1) {
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
              if (param0 > 103) {
                break L1;
              } else {
                this.field_r = -82;
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
            stackOut_3_1 = new StringBuilder().append("csa.DB(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final int g(byte param0) {
        if (param0 != 115) {
            return -84;
        }
        return 0;
    }

    void w(int param0) {
        if (param0 < -122) {
            return;
        }
        this.x(71);
    }

    abstract boolean v(int param0);

    public final int c(byte param0) {
        if (param0 <= 91) {
            return -114;
        }
        return this.e(9648);
    }

    public final boolean d(byte param0) {
        int discarded$0 = 0;
        if (param0 != 48) {
            discarded$0 = this.g(-122);
            return false;
        }
        return false;
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
            this.field_o = (la) null;
            return this.field_w;
        }
        return this.field_w;
    }

    final int r(int param0) {
        if (param0 != 12) {
            return 114;
        }
        return this.field_m;
    }

    public final gpa i(byte param0) {
        if (param0 != 84) {
            return (gpa) null;
        }
        return this.field_s;
    }

    abstract boolean n(byte param0);

    public final lj a(int param0, int param1, boolean param2) {
        if (param0 != 28672) {
            this.c(false);
            return (lj) ((Object) this.a(param1, param2, 20));
        }
        return (lj) ((Object) this.a(param1, param2, 20));
    }

    boolean a(int param0) {
        if (param0 != 6) {
            return false;
        }
        return this.s(-15254);
    }

    final static void a(int param0, kra param1) {
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
              nma.field_m = param1;
              if (param0 == 1048576) {
                break L1;
              } else {
                csa.a(true);
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
            stackOut_3_1 = new StringBuilder().append("csa.QA(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        csa var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_f = hua.a((byte) 106, -this.g(-25787) >> -432399614);
        this.field_h = bua.a(0, -this.g(-25787) >> 276614786);
        var2 = 0;
        L0: while (true) {
          if (this.field_t.length <= var2) {
            if (!param0) {
              this.field_t = (mka[]) null;
              return;
            } else {
              return;
            }
          } else {
            this.field_t[var2].a(this.field_f, this.field_h, (byte) 98);
            var3 = this.field_t[var2].a(-122);
            if (var4 == 0) {
              L1: {
                if (var3 == null) {
                  break L1;
                } else {
                  var3.d(true);
                  break L1;
                }
              }
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    private final boolean b(boolean param0, int param1) {
        if (!param0) {
            this.m(-109);
            return this.field_z.a(param1, 14530);
        }
        return this.field_z.a(param1, 14530);
    }

    public final int a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 55) {
            discarded$0 = this.p((byte) -128);
            return this.field_k;
        }
        return this.field_k;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 28 / ((-12 - param0) / 54);
        this.field_l = param1;
        this.field_k = param2;
    }

    final boolean k(byte param0) {
        if (param0 > -52) {
            return true;
        }
        if (!(this.field_o.w(0) != null)) {
            return true;
        }
        return this.field_o.w(0).a((csa) (this), true, true);
    }

    public final int d(int param0) {
        gpa discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param0 != 3) {
          L0: {
            discarded$1 = this.n(107);
            var2 = this.field_j;
            if (null != this.field_u) {
              var3 = var2 >> 1212617992;
              var4 = this.field_p >> -952897912;
              var2 = (this.field_u.field_h >> 1607227240) * var3 - (this.field_u.field_f >> -900438360) * var4;
              var2 = var2 + this.field_u.d(3);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = this.field_j;
            if (null != this.field_u) {
              var3 = var2 >> 1212617992;
              var4 = this.field_p >> -952897912;
              var2 = (this.field_u.field_h >> 1607227240) * var3 - (this.field_u.field_f >> -900438360) * var4;
              var2 = var2 + this.field_u.d(3);
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    public final int g(int param0) {
        int var2 = 0;
        if (param0 != -25787) {
          L0: {
            this.field_f = -1;
            var2 = this.field_r;
            if (null == this.field_u) {
              break L0;
            } else {
              var2 = var2 + (this.field_u.g(-25787) + this.field_u.a(this.field_q, param0 ^ -17595).a(false));
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = this.field_r;
            if (null == this.field_u) {
              break L1;
            } else {
              var2 = var2 + (this.field_u.g(-25787) + this.field_u.a(this.field_q, param0 ^ -17595).a(false));
              break L1;
            }
          }
          return var2;
        }
    }

    final csa o(byte param0) {
        boolean discarded$3 = false;
        if (param0 < -17) {
          if (this.field_u != null) {
            return this.field_u.o((byte) -84);
          } else {
            return (csa) (this);
          }
        } else {
          discarded$3 = this.p((byte) 101);
          if (this.field_u != null) {
            return this.field_u.o((byte) -84);
          } else {
            return (csa) (this);
          }
        }
    }

    public final int b(int param0) {
        int var2 = -69 % ((param0 - 1) / 45);
        return 0;
    }

    void a(boolean param0, kh param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        csa var4 = null;
        int var5 = 0;
        kh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        kh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        kh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        kh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        kh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        kh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        kh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        kh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        kh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        kh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_u != null) {
                break L1;
              } else {
                param1.a((byte) -128, dqa.a(true, this.field_j / 1048576, 8), 8);
                param1.a((byte) -125, dqa.a(true, this.field_p / 1048576, 8), 8);
                break L1;
              }
            }
            L2: {
              if (this.v(555277520)) {
                param1.a((byte) 80, this.field_l / 2097152, 6);
                param1.a((byte) -127, this.field_k / 2097152, 6);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.n((byte) -122)) {
                param1.a((byte) 8, cn.a((byte) 103, this.field_r, 8192, 4), 4);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!this.a(6)) {
                break L4;
              } else {
                L5: {
                  stackOut_10_0 = (kh) (param1);
                  stackOut_10_1 = 116;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (this.field_x) {
                    stackOut_12_0 = (kh) ((Object) stackIn_12_0);
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L5;
                  } else {
                    stackOut_11_0 = (kh) ((Object) stackIn_11_0);
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L5;
                  }
                }
                ((kh) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2, 1);
                break L4;
              }
            }
            L6: {
              this.field_z.a((byte) -97, param1);
              stackOut_14_0 = (kh) (param1);
              stackOut_14_1 = 79;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (!this.field_v) {
                stackOut_16_0 = (kh) ((Object) stackIn_16_0);
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L6;
              } else {
                stackOut_15_0 = (kh) ((Object) stackIn_15_0);
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                break L6;
              }
            }
            ((kh) (Object) stackIn_17_0).a((byte) stackIn_17_1, stackIn_17_2, 1);
            var3_int = 0;
            if (!param0) {
              L7: while (true) {
                if (var3_int >= this.field_t.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = this.field_t[var3_int].a(86);
                  if (var5 == 0) {
                    L8: {
                      if (var4 != null) {
                        param1.a((byte) -42, 1, 1);
                        vha.field_c.a(var4, -16097, param1);
                        break L8;
                      } else {
                        param1.a((byte) -127, 0, 1);
                        if (var5 == 0) {
                          break L8;
                        } else {
                          param1.a((byte) -42, 1, 1);
                          vha.field_c.a(var4, -16097, param1);
                          break L8;
                        }
                      }
                    }
                    var3_int++;
                    continue L7;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("csa.V(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract int t(int param0);

    void q(byte param0) {
        if (param0 == -128) {
            return;
        }
        this.d(false);
    }

    abstract void a(boolean param0, boolean param1, la param2, int param3, int param4, int param5, fsa param6);

    csa(la param0, int param1) {
        this.field_t = new mka[]{};
        this.field_z = new bca();
        this.field_x = true;
        try {
            this.field_o = param0;
            this.field_m = param1;
            this.field_w = param0.d(-31957).a(-54, false);
            this.q((byte) -128);
            this.d(true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "csa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_y = new su(2, 4, 4, 0);
        field_i = new int[1000];
    }
}
