/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pt extends wda {
    private int field_o;
    static bb field_p;
    static String field_q;

    final void a(int param0, fsa param1) {
        try {
            if (param0 < 35) {
                this.field_o = 28;
            }
            super.a(89, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pt.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
          field_p = (bb) null;
          param1 = fs.a((byte) 61, param1, this.field_o);
          return param1;
        } else {
          param1 = fs.a((byte) 61, param1, this.field_o);
          return param1;
        }
    }

    final void b(int param0) {
        if (param0 == 1) {
            return;
        }
        upa discarded$0 = pt.a(-81, 90, 108, 113);
    }

    final int c(int param0) {
        if (param0 != 1) {
            return -52;
        }
        return 7;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var3 = -78 % ((56 - param0) / 63);
          if ((458752 & param1) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == 0 | mg.a((byte) -53, param2, param1)) {
          if (so.a(param1, (byte) 90, param2)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          return stackIn_6_0 != 0;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        hca var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = 93 / ((-69 - param0) / 42);
        var3 = this.field_n.H(-122);
        if (!var3.u(-25561)) {
          var4 = var3.d(3) - this.field_n.d(3);
          var5 = var3.e(9648) - this.field_n.e(9648);
          var6 = qva.a((byte) -118, var5, var4);
          var7 = -this.field_n.g(-25787) + var6;
          if (0 < this.field_o) {
            L0: while (true) {
              if (4095 >= (var7 ^ -1)) {
                L1: while (true) {
                  if (var7 > 4096) {
                    var7 -= 8192;
                    if (var8 != 0) {
                      if (var7 < -this.field_o) {
                        var7 = -this.field_o;
                        this.field_n.c(false, var7);
                        return;
                      } else {
                        this.field_n.c(false, var7);
                        return;
                      }
                    } else {
                      continue L1;
                    }
                  } else {
                    L2: {
                      if (var7 <= this.field_o) {
                        break L2;
                      } else {
                        var7 = this.field_o;
                        if (var8 == 0) {
                          this.field_n.c(false, var7);
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var7 < -this.field_o) {
                      var7 = -this.field_o;
                      this.field_n.c(false, var7);
                      return;
                    } else {
                      this.field_n.c(false, var7);
                      return;
                    }
                  }
                }
              } else {
                var7 += 8192;
                if (var8 == 0) {
                  continue L0;
                } else {
                  L3: {
                    if (var7 <= this.field_o) {
                      break L3;
                    } else {
                      var7 = this.field_o;
                      break L3;
                    }
                  }
                  if (var7 < -this.field_o) {
                    var7 = -this.field_o;
                    this.field_n.c(false, var7);
                    return;
                  } else {
                    this.field_n.c(false, var7);
                    return;
                  }
                }
              }
            }
          } else {
            this.field_n.c(false, var7);
            return;
          }
        } else {
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 4096) {
                break L1;
              } else {
                field_p = (bb) null;
                break L1;
              }
            }
            var4 = new byte[param1];
            var3 = var4;
            lua.a(param0, 0, var4, 0, param1);
            stackOut_2_0 = (byte[]) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("pt.M(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1) {
        if (param1 < 123) {
            fsa var4 = (fsa) null;
            this.a(101, (fsa) null);
            this.field_o = param0;
            return;
        }
        this.field_o = param0;
    }

    final static void b(int param0, byte param1) {
        boolean discarded$2 = false;
        if (param1 != 65) {
          discarded$2 = pt.a(-7, 14, 68);
          ub.field_b = sra.field_u[param0];
          hra.field_c = wha.field_K[param0];
          voa.field_s = nl.field_e[param0];
          return;
        } else {
          ub.field_b = sra.field_u[param0];
          hra.field_c = wha.field_K[param0];
          voa.field_s = nl.field_e[param0];
          return;
        }
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != 0) {
            field_p = (bb) null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    pt(la param0, boolean param1) {
        super(param0, param1);
        try {
            this.field_o = 16;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    pt(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_o = bla.a(true, 12, param1.b((byte) 44, 12));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(kh param0, byte param1) {
        upa discarded$2 = null;
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
              super.a(param0, (byte) -124);
              param0.a((byte) 37, dqa.a(true, this.field_o, 12), 12);
              if (param1 <= -78) {
                break L1;
              } else {
                discarded$2 = pt.a(-12, 90, -68, 66);
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
            stackOut_3_1 = new StringBuilder().append("pt.R(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static upa a(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        upa var4_ref = null;
        int var5 = 0;
        var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == 22578) {
          var4_ref = (upa) ((Object) ina.field_d.f(-80));
          L0: while (true) {
            if (var4_ref != null) {
              if (var5 == 0) {
                if (param3 != var4_ref.field_n) {
                  var4_ref = (upa) ((Object) ina.field_d.e(param0 + -22454));
                  continue L0;
                } else {
                  return var4_ref;
                }
              } else {
                return var4_ref;
              }
            } else {
              var4_ref = new upa();
              var4_ref.field_n = param3;
              var4_ref.field_k = param2;
              ina.field_d.b((byte) -49, var4_ref);
              ip.a(var4_ref, param1, 2147);
              return var4_ref;
            }
          }
        } else {
          field_p = (bb) null;
          var4_ref = (upa) ((Object) ina.field_d.f(-80));
          L1: while (true) {
            if (var4_ref != null) {
              if (var5 == 0) {
                if (param3 != var4_ref.field_n) {
                  var4_ref = (upa) ((Object) ina.field_d.e(param0 + -22454));
                  continue L1;
                } else {
                  return var4_ref;
                }
              } else {
                return var4_ref;
              }
            } else {
              var4_ref = new upa();
              var4_ref.field_n = param3;
              var4_ref.field_k = param2;
              ina.field_d.b((byte) -49, var4_ref);
              ip.a(var4_ref, param1, 2147);
              return var4_ref;
            }
          }
        }
    }

    static {
        field_q = "Hans";
        field_p = null;
    }
}
