/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    d field_a;
    int field_b;

    abstract aja a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        this.aa(param5, param4, param0, param3, param2, 1);
        if (param1 != 120) {
            this.field_b = 8;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        this.s(param2, param1, param0, param4, 1);
        int var6 = -99 % ((47 - param3) / 49);
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        this.a(param1, param2, param5, param0, param3, param6, 1);
        if (param4) {
            this.field_a = (d) null;
        }
    }

    abstract void P(int param0, int param1, int param2, int param3, int param4);

    final void b(int param0) throws jkb {
        int var2 = -72 / ((-30 - param0) / 53);
        this.a(0, 0);
    }

    void a(aja param0, boolean param1) {
        try {
            this.a(this.a(param0, param1 ? this.b(param0.d(), param0.a()) : null));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ha.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void a(float param0, float param1, float param2);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9);

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.b(param4, param5, param0, param3, param2, param1);
    }

    abstract za e(int param0);

    abstract void j();

    abstract boolean r();

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6);

    abstract int[] na(int param0, int param1, int param2, int param3);

    abstract boolean h();

    abstract void c(int param0);

    abstract boolean c();

    abstract void u();

    abstract boolean w();

    abstract void T(int param0, int param1, int param2, int param3);

    abstract void ya();

    final synchronized static ha a(int param0, asb param1, int param2, int param3, d param4, java.awt.Canvas param5, int param6, int param7) {
        RuntimeException var8 = null;
        ha stackIn_3_0 = null;
        ha stackIn_7_0 = null;
        ha stackIn_12_0 = null;
        ha stackIn_16_0 = null;
        ha stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ha stackOut_2_0 = null;
        ha stackOut_6_0 = null;
        ha stackOut_15_0 = null;
        ha stackOut_18_0 = null;
        ha stackOut_11_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (-1 == (param7 ^ -1)) {
              stackOut_2_0 = wmb.a(param4, param0, 42, param5, param3);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param7 ^ -1) == -3) {
                stackOut_6_0 = awa.a((byte) 113, param3, param5, param4, param0);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param6 > 0) {
                    break L1;
                  } else {
                    ha.a(false, -43, -73, 67);
                    break L1;
                  }
                }
                if (param7 != 1) {
                  if (5 == param7) {
                    stackOut_15_0 = pbb.a(param1, param2, -1588388127, param4, param5);
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param7 != 3) {
                      throw new IllegalArgumentException("UM");
                    } else {
                      stackOut_18_0 = jsa.a(param1, param2, 27908, param5, param4);
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_11_0 = sl.a(param4, (byte) 16, param2, param5);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var8);
            stackOut_21_1 = new StringBuilder().append("ha.TA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          L3: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          L4: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                return stackIn_19_0;
              }
            }
          }
        }
    }

    abstract hf a(ekb param0, wib param1);

    abstract boolean m();

    protected void finalize() {
        this.a((byte) 30);
    }

    abstract void ZA(int param0, float param1, float param2, float param3, float param4, float param5);

    abstract void v();

    abstract void a(pw param0);

    abstract int[] Y();

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract boolean q();

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract boolean x();

    abstract void za(int param0, int param1, int param2, int param3, int param4);

    abstract void a(int param0, int param1, int param2, int param3);

    final aja a(int param0, int param1, int[] param2, int param3, byte param4, int param5) {
        RuntimeException var7 = null;
        aja stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        aja stackOut_2_0 = null;
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
              if (param4 >= 18) {
                break L1;
              } else {
                this.a(-25, -48, -23, 85, -120, -118, 69);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param2, param3, param1, param0, param5, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("ha.CB(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    abstract boolean s();

    final boolean a(int param0) {
        boolean discarded$8 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -16) {
          L0: {
            discarded$8 = this.e();
            if (this.t() <= 0) {
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
        } else {
          L1: {
            if (this.t() <= 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract boolean f();

    abstract boolean p();

    abstract void d(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void b(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void a(za param0);

    abstract boolean a();

    abstract boolean n();

    ha(d param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            this.field_a = param0;
            var2_int = -1;
            for (var3 = 0; -9 < (var3 ^ -1); var3++) {
                if (!bqb.field_o[var3]) {
                    bqb.field_o[var3] = true;
                    var2_int = var3;
                    break;
                }
            }
            if (-1 == var2_int) {
                throw new IllegalStateException("NFTI");
            }
            this.field_b = var2_int;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.U(param0, param3, param4, param2, 1);
        if (param1 != -25559) {
            this.j();
        }
    }

    abstract int XA();

    abstract aja a(ima param0, boolean param1);

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 120 / ((param4 - -44) / 63);
        this.za(param2, param3, param1, param0, 1);
    }

    abstract void K(int[] param0);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = -111 / ((-20 - param0) / 57);
        this.d(param4, param1, param2, param5, param3, 1);
    }

    abstract boolean l();

    abstract void o();

    abstract int t();

    abstract void f(int param0, int param1);

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (!uga.field_d) {
          return;
        } else {
          L0: {
            tra.field_o.a(param0, param3 ^ 1329);
            var4 = fkb.field_m.h(-25675) ? 1 : 0;
            if (pba.field_o == 0) {
              break L0;
            } else {
              if (var4 == 0) {
                fj.b(18444);
                param0 = false;
                break L0;
              } else {
                if (param3 == 5) {
                  if (param0) {
                    L1: {
                      fkb.field_m.a(param2, param1, (byte) 115);
                      if (var4 != 0) {
                        tra.field_o.a(param0, param3 ^ 1329);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    var5 = fkb.field_m.k(-4109) - -fkb.field_m.field_M;
                    if (-641 <= (var5 ^ -1)) {
                      if (var5 < 635) {
                        if (-1 <= (ejb.field_p ^ -1)) {
                          return;
                        } else {
                          ejb.field_p = ejb.field_p - 5;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ejb.field_p = ejb.field_p + 5;
                      return;
                    }
                  } else {
                    L2: {
                      if (var4 != 0) {
                        tra.field_o.a(param0, param3 ^ 1329);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var5 = fkb.field_m.k(-4109) - -fkb.field_m.field_M;
                    if (-641 <= (var5 ^ -1)) {
                      if (var5 < 635) {
                        if (-1 <= (ejb.field_p ^ -1)) {
                          return;
                        } else {
                          ejb.field_p = ejb.field_p - 5;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ejb.field_p = ejb.field_p + 5;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (param3 == 5) {
            if (!param0) {
              L3: {
                if (var4 != 0) {
                  tra.field_o.a(param0, param3 ^ 1329);
                  break L3;
                } else {
                  break L3;
                }
              }
              var5 = fkb.field_m.k(-4109) - -fkb.field_m.field_M;
              if (-641 <= (var5 ^ -1)) {
                if (var5 < 635) {
                  if (-1 > (ejb.field_p ^ -1)) {
                    ejb.field_p = ejb.field_p - 5;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ejb.field_p = ejb.field_p + 5;
                return;
              }
            } else {
              L4: {
                fkb.field_m.a(param2, param1, (byte) 115);
                if (var4 != 0) {
                  tra.field_o.a(param0, param3 ^ 1329);
                  break L4;
                } else {
                  break L4;
                }
              }
              var5 = fkb.field_m.k(-4109) - -fkb.field_m.field_M;
              if (-641 <= (var5 ^ -1)) {
                if (var5 < 635) {
                  if (-1 <= (ejb.field_p ^ -1)) {
                    return;
                  } else {
                    ejb.field_p = ejb.field_p - 5;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ejb.field_p = ejb.field_p + 5;
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    abstract void KA(int param0, int param1, int param2, int param3);

    abstract int i();

    abstract void GA(int param0);

    abstract da a(sw param0, ima[] param1, boolean param2);

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    abstract wib b(int param0, int param1);

    abstract ka a(cbb param0, int param1, int param2, int param3, int param4);

    final void a(byte param0) {
        if (param0 != 30) {
            return;
        }
        bqb.field_o[this.field_b] = false;
        this.o();
    }

    abstract aja a(int param0, int param1, boolean param2);

    abstract void a(hf param0);

    abstract void a(int param0, int param1) throws jkb;

    abstract boolean k();

    abstract boolean b();

    abstract void xa(float param0);

    abstract boolean e();

    abstract pw d();

    abstract void s(int param0, int param1, int param2, int param3, int param4);

    static {
    }
}
