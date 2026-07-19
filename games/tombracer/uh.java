/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends vg {
    private int field_q;
    static jea field_h;
    private int field_j;
    private int field_l;
    static it field_k;
    private int field_p;
    private aga field_o;
    private int field_f;
    private int field_n;
    private boolean field_r;
    private boolean field_g;
    static String field_i;
    private int[] field_m;

    public static void d(int param0) {
        field_h = null;
        field_k = null;
        field_i = null;
        if (param0 != 0) {
            field_h = (jea) null;
        }
    }

    final void a(int param0, int param1) {
        int var3 = -39 % ((-18 - param1) / 50);
        this.field_l = param0;
    }

    final int a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.f(1)) {
          return -1;
        } else {
          if (this.field_p != 0) {
            if (this.field_o != null) {
              if (null != this.field_o.field_c) {
                if (0.05000000074505806f < this.field_o.field_c.b(0)) {
                  if (-1 == (this.field_o.field_c.c(-122) ^ -1)) {
                    return -1;
                  } else {
                    var5 = -this.field_j + param1 >> 1011094480;
                    var6 = -this.field_f + param2 >> 1492816464;
                    var7 = -this.field_q + param0 >> 128327984;
                    if (param3 > -33) {
                      field_k = (it) null;
                      return -(var7 * var7 + var5 * var5 - -(var6 * var6) >> -171995262) + this.field_p;
                    } else {
                      return -(var7 * var7 + var5 * var5 - -(var6 * var6) >> -171995262) + this.field_p;
                    }
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final aga a(int param0) {
        int discarded$0 = 0;
        if (param0 <= 4) {
            discarded$0 = this.a(-31, -23, 62, -98);
            return this.field_o;
        }
        return this.field_o;
    }

    final static mu a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        mu var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_10_0 = null;
        mu stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        mu stackOut_14_0 = null;
        Object stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (bla.field_G != null) {
              L1: {
                var7 = (CharSequence) ((Object) param0);
                var2 = jd.a(1, var7);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param0;
                  break L1;
                }
              }
              var3 = (mu) ((Object) bla.field_G.a(-114, (long)var2.hashCode()));
              var4 = -95 / ((param1 - -46) / 54);
              L2: while (true) {
                if (var3 != null) {
                  L3: {
                    var8 = (CharSequence) ((Object) var3.field_tb);
                    var5 = jd.a(1, var8);
                    stackOut_9_0 = null;
                    stackIn_18_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (stackIn_10_0 != var5) {
                          break L4;
                        } else {
                          var5 = var3.field_tb;
                          break L4;
                        }
                      }
                      if (var5.equals(var2)) {
                        stackOut_14_0 = (mu) (var3);
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3 = (mu) ((Object) bla.field_G.b((byte) 99));
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          stackOut_17_0 = null;
                          stackIn_18_0 = stackOut_17_0;
                          break L3;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2_ref);
            stackOut_19_1 = new StringBuilder().append("uh.N(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mu) ((Object) stackIn_18_0);
        } else {
          return stackIn_15_0;
        }
    }

    final void c(int param0, int param1) {
        if (this.field_o != null) {
          if (null != this.field_o.field_c) {
            if (param0 != -10874) {
              field_k = (it) null;
              this.field_o.field_c.a(255, param1);
              return;
            } else {
              this.field_o.field_c.a(255, param1);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(byte param0) {
        boolean discarded$6 = false;
        lqa var1 = null;
        var1 = uv.b(false);
        if (var1 != null) {
          if (param0 == -7) {
            if (!rsa.field_s) {
              if (!var1.field_i) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            discarded$6 = uh.a((byte) -8);
            if (!rsa.field_s) {
              if (!var1.field_i) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final boolean c(int param0) {
        aga discarded$0 = null;
        if (param0 != -1459852242) {
            discarded$0 = this.a(-60);
            return this.field_r;
        }
        return this.field_r;
    }

    final void a(byte param0, int param1) {
        boolean discarded$1 = false;
        int var3 = 0;
        L0: {
          if (this.field_o == null) {
            break L0;
          } else {
            if (this.field_o.field_c != null) {
              this.field_m[0] = this.field_j >> 1456965582;
              this.field_m[1] = -this.field_q >> -1459852242;
              this.field_m[2] = -this.field_f >> -459431602;
              this.field_o.field_c.a(this.field_m[1], this.field_m[0], (byte) -127, this.field_m[2]);
              if (param0 < 21) {
                discarded$1 = uh.a((byte) 98);
                var3 = this.field_o.field_c.a((byte) 107);
                this.field_p = var3 * (var3 * 2);
                this.field_o.a(false, param1 + this.field_n, -1814184927);
                return;
              } else {
                var3 = this.field_o.field_c.a((byte) 107);
                this.field_p = var3 * (var3 * 2);
                this.field_o.a(false, param1 + this.field_n, -1814184927);
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        var3 = 12 / ((40 - param1) / 59);
        if (this.field_o != null) {
          if (null == this.field_o.field_c) {
            return;
          } else {
            this.field_o.field_c.a((byte) 62, param0);
            return;
          }
        } else {
          return;
        }
    }

    final int b(int param0) {
        if (param0 < 104) {
            this.field_j = -79;
            return this.field_l;
        }
        return this.field_l;
    }

    final void a(boolean param0, int param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 != 1011094480) {
          L0: {
            field_k = (it) null;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((uh) (this)).field_g = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((uh) (this)).field_g = stackIn_4_1 != 0;
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 != 1) {
            this.field_n = 64;
            return this.field_g;
        }
        return this.field_g;
    }

    final void e(int param0) {
        this.field_r = true;
        if (param0 != 2) {
            this.field_o = (aga) null;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 82) {
          this.field_o = (aga) null;
          this.field_q = param0;
          this.field_j = param3;
          this.field_f = param2;
          return;
        } else {
          this.field_q = param0;
          this.field_j = param3;
          this.field_f = param2;
          return;
        }
    }

    final void b(int param0, int param1) {
        if (param1 != 0) {
            this.c(-107, 111);
            this.field_n = param0;
            return;
        }
        this.field_n = param0;
    }

    uh(aga param0) {
        this.field_r = false;
        this.field_m = new int[3];
        this.field_g = false;
        try {
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Invite <%0> to this game";
        field_k = new it();
    }
}
