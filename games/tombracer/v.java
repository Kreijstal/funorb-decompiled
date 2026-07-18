/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static int field_k;
    private static String[] field_g;
    private bka field_a;
    static jea field_i;
    static String field_j;
    private int field_e;
    private int field_d;
    private vna field_h;
    private boolean field_f;
    private int[] field_b;
    private vi field_c;

    private final void a(byte param0, kh param1, qh param2) {
        lta var4 = null;
        try {
            var4 = new lta();
            this.a((bo) (Object) var4, 112, param1);
            var4.a(param2, true, (v) this);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.P(" + -73 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(qh param0, kh param1, int param2) {
        lf var4 = null;
        try {
            var4 = new lf();
            this.a((bo) (Object) var4, 124, param1);
            var4.a(param0, 0, (v) this);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 93 + ')');
        }
    }

    final void d(int param0, int param1) {
        ap var3 = new ap();
        var3.a(param0, (byte) -119);
        hw.a((byte) -111, 1, param1, (bo) (Object) var3);
    }

    final void a(boolean param0) {
        ((v) this).field_a.c(-79);
        if (!param0) {
            ((v) this).a((byte) -48);
        }
        ((v) this).field_h.d(8);
        ((v) this).field_c.a(0);
        ((v) this).field_f = false;
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
            ((v) this).field_c = null;
        }
        ((v) this).field_a.a((byte) -113, param1);
    }

    private final void a(int param0, kh param1, qh param2) {
        wga var4 = null;
        try {
            var4 = new wga();
            this.a((bo) (Object) var4, -46, param1);
            var4.a(4545315, (v) this, param2);
            int var5 = -6;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.AA(" + -31 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1) {
        if (null == fna.field_j) {
            return;
        }
        int var2 = (int)(1000.0 * qk.field_w[param0]);
        if (!(0 != var2)) {
            var2 = 1;
        }
        ((psa) (Object) ab.field_n.field_n).a(param0, vba.field_x[param0], (byte) -4, var2);
    }

    final boolean b(int param0) {
        if (param0 != 1) {
            vb discarded$0 = v.a(-38, (byte) 20, -69, 62, 48, -77);
        }
        return ((v) this).field_f;
    }

    private final void a(kh param0, int param1) {
        RuntimeException runtimeException = null;
        tt var3 = null;
        int var4 = 0;
        int var5 = 0;
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
            var3 = new tt(((v) this).field_e);
            this.a((bo) (Object) var3, -67, param0);
            var4 = ((v) this).field_c.a((byte) 36, var3) ? 1 : 0;
            var5 = 1;
            if (((v) this).field_d >= 0) {
              if (var3.a(false, ((v) this).field_d)) {
                L1: {
                  if (var4 == 0) {
                    break L1;
                  } else {
                    L2: {
                      if (((v) this).field_h.d((byte) 14)) {
                        break L2;
                      } else {
                        vg discarded$2 = ((v) this).field_h.c(34);
                        var5 = 0;
                        break L2;
                      }
                    }
                    if (var5 != 0) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("v.EA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 0 + ')');
        }
    }

    private final void a(kh param0, qh param1, int param2) {
        cf var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              var4 = new cf(param1.field_k.field_H.length);
              this.a((bo) (Object) var4, 126, param0);
              var4.a(param1, param2 + -93);
              if (param2 == 93) {
                break L1;
              } else {
                ((v) this).field_a = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4_ref;
            stackOut_3_1 = new StringBuilder().append("v.O(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final void c(int param0, int param1) {
        uu var3 = new uu();
        var3.a(param1 + 44, param0);
        hw.a((byte) -111, param1, 72, (bo) (Object) var3);
    }

    final void a(qh param0, int param1) {
        RuntimeException var3 = null;
        tt var4 = null;
        int var4_int = 0;
        int var5 = 0;
        la var5_ref_la = null;
        int var6 = 0;
        int var7 = 0;
        ff var8 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8 = param0.field_k;
            if (param1 == 1) {
              L1: {
                if (param0.d((byte) 94)) {
                  break L1;
                } else {
                  L2: {
                    var4_int = ((v) this).field_h.a((byte) -16);
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var4_int < 15) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((v) this).field_f = stackIn_7_1 != 0;
                  L3: while (true) {
                    if (var4_int >= 15) {
                      break L1;
                    } else {
                      if (((v) this).field_a.b(param1 + -1) < 8) {
                        break L1;
                      } else {
                        L4: {
                          var5_ref_la = var8.a(0, ((v) this).field_d);
                          stackOut_10_0 = this;
                          stackOut_10_1 = -115;
                          stackOut_10_2 = var8.field_A;
                          stackOut_10_3 = var8.c((byte) 115, ((v) this).field_d);
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          stackIn_12_3 = stackOut_10_3;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          stackIn_11_3 = stackOut_10_3;
                          if (var5_ref_la != null) {
                            stackOut_12_0 = this;
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = stackIn_12_2;
                            stackOut_12_3 = stackIn_12_3;
                            stackOut_12_4 = var5_ref_la.q((byte) -82) - -1;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            break L4;
                          } else {
                            stackOut_11_0 = this;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = stackIn_11_2;
                            stackOut_11_3 = stackIn_11_3;
                            stackOut_11_4 = 0;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            break L4;
                          }
                        }
                        this.a(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_13_4, var8.j(0, ((v) this).field_d));
                        var4_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              var4 = this.d(-16);
              L5: while (true) {
                if (var4 == null) {
                  L6: {
                    if (param0.d((byte) 106)) {
                      break L6;
                    } else {
                      if (var8.field_G[((v) this).field_d].b(param1 + -1)) {
                        this.a(var8, (byte) -73);
                        break L6;
                      } else {
                        if (!var8.field_G[((v) this).field_d].e(-31170)) {
                          break L6;
                        } else {
                          this.a(var8, (byte) -73);
                          break L6;
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  var5 = 0;
                  L7: while (true) {
                    if (var8.field_H.length <= var5) {
                      var4 = this.d(param1 + -17);
                      continue L5;
                    } else {
                      L8: {
                        if (((v) this).field_d != var5) {
                          if (!var4.a(false, var5)) {
                            break L8;
                          } else {
                            var6 = 0;
                            L9: while (true) {
                              if (var6 >= 8) {
                                break L8;
                              } else {
                                if (((v) this).field_b[var5] != -1) {
                                  L10: {
                                    if (((v) this).field_b[var5] > 0) {
                                      ((v) this).field_b[var5] = ((v) this).field_b[var5] - 1;
                                      break L10;
                                    } else {
                                      param0.a(var4.a(false, var5, var6), var5, false);
                                      break L10;
                                    }
                                  }
                                  var6++;
                                  continue L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                      var5++;
                      continue L7;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("v.L(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, qh param1, kh param2) {
        nr var4 = null;
        try {
            var4 = new nr();
            this.a((bo) (Object) var4, -66, param2);
            var4.a((byte) -78, param1, (v) this);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.E(" + 16 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(bo param0, int param1, kh param2) {
        try {
            int var4_int = -28 / ((param1 - 61) / 43);
            param0.a(param2, (byte) -19);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, qh param1, kh param2) {
        foa var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4 = new foa();
            this.a((bo) (Object) var4, 112, param2);
            var4.a(param1, -1, (v) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("v.T(").append(-77).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    private final void a(boolean param0, kh param1, qh param2) {
        bqa var4 = null;
        try {
            var4 = new bqa();
            this.a((bo) (Object) var4, -53, param1);
            var4.a((v) this, 0, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.BA(" + true + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int var2 = 32;
        ts.a(0, -121, var2 + 10, "unack: " + ((v) this).field_h.a((byte) -16), 16, kn.field_p, 16777215);
        var2 = 48;
        ts.a(0, -122, 10 + var2, "received: " + ((v) this).field_c.a((byte) 107), param0, kn.field_p, 16777215);
    }

    final boolean a(byte param0, qh param1, kh param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            if (77 == param3) {
              this.a(param2, 0);
              stackOut_35_0 = 1;
              stackIn_36_0 = stackOut_35_0;
              return stackIn_36_0 != 0;
            } else {
              if (param3 != 78) {
                if (param3 != 79) {
                  if (80 == param3) {
                    this.a(param1, param2, false);
                    stackOut_33_0 = 1;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0 != 0;
                  } else {
                    if (param3 == 81) {
                      this.a(param2, param1, 93);
                      stackOut_31_0 = 1;
                      stackIn_32_0 = stackOut_31_0;
                      return stackIn_32_0 != 0;
                    } else {
                      if (82 != param3) {
                        if (83 != param3) {
                          if (90 != param3) {
                            if (param3 == 92) {
                              this.a((byte) -73, param2, param1);
                              stackOut_29_0 = 1;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0 != 0;
                            } else {
                              if (param3 != 91) {
                                if (param3 == 84) {
                                  this.a(-31, param2, param1);
                                  stackOut_27_0 = 1;
                                  stackIn_28_0 = stackOut_27_0;
                                  return stackIn_28_0 != 0;
                                } else {
                                  if (param3 == 93) {
                                    this.a((byte) -77, param1, param2);
                                    stackOut_25_0 = 1;
                                    stackIn_26_0 = stackOut_25_0;
                                    return stackIn_26_0 != 0;
                                  } else {
                                    if (param0 > 40) {
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      break L0;
                                    } else {
                                      stackOut_38_0 = 1;
                                      stackIn_39_0 = stackOut_38_0;
                                      return stackIn_39_0 != 0;
                                    }
                                  }
                                }
                              } else {
                                this.b(param1, param2, 93);
                                stackOut_20_0 = 1;
                                stackIn_21_0 = stackOut_20_0;
                                return stackIn_21_0 != 0;
                              }
                            }
                          } else {
                            this.b((byte) 30, param1, param2);
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0 != 0;
                          }
                        } else {
                          this.a(param1, param2, -1);
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        }
                      } else {
                        this.a(16, param1, param2);
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    }
                  }
                } else {
                  this.a(true, param2, param1);
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                }
              } else {
                this.a(param1, param2, (byte) -98);
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var5;
            stackOut_42_1 = new StringBuilder().append("v.IA(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L1;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L1;
            }
          }
          L2: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L2;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param3 + ')');
        }
        return stackIn_41_0 != 0;
    }

    private final void a(ff param0, byte param1) {
        la var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            while (!((v) this).field_a.b((byte) -26)) {
                var3 = param0.a(0, ((v) this).field_d);
                this.a(-92, param0.field_A, 0, var3 == null ? 0 : var3.q((byte) -82) + 1, 0);
            }
            int var3_int = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.W(" + (param0 != null ? "{...}" : "null") + ',' + -73 + ')');
        }
    }

    private final void a(qh param0, kh param1, boolean param2) {
        uj var4 = null;
        try {
            var4 = new uj(param0.field_k.field_H.length);
            this.a((bo) (Object) var4, 117, param1);
            var4.a(param0, (v) this, (byte) 119);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.CA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    private final void b(byte param0, qh param1, kh param2) {
        ua var4 = null;
        try {
            var4 = new ua();
            this.a((bo) (Object) var4, -99, param2);
            var4.a(2, (v) this, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.H(" + 30 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 97 % ((param1 - -33) / 49);
        return ((v) this).field_b[param0] == 0 ? true : false;
    }

    private final tt d(int param0) {
        if (param0 != -16) {
            return null;
        }
        return ((v) this).field_c.a(true);
    }

    final void a(int param0, byte param1, int param2) {
        ((v) this).field_b[param2] = param0;
        int var4 = -75 % ((param1 - -73) / 32);
        ((v) this).field_b[param2] = ((v) this).field_b[param2] + 8 * ((v) this).field_c.a((byte) 25, param2);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = sda.a(param1, -1, var4).getFile();
                    Object discarded$6 = lb.a(-104, "updatelinks", param1, new Object[2]);
                    Object discarded$7 = lb.a(-121, "updatelinks", param1, new Object[2]);
                    Object discarded$8 = lb.a(-65, "updatelinks", param1, new Object[2]);
                    Object discarded$9 = lb.a(-118, "updatelinks", param1, new Object[2]);
                    Object discarded$10 = lb.a(-76, "updatelinks", param1, new Object[2]);
                    Object discarded$11 = lb.a(-107, "updatelinks", param1, new Object[2]);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("v.K(").append(64).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(qh param0, kh param1, byte param2) {
        vca var4 = null;
        try {
            var4 = new vca();
            this.a((bo) (Object) var4, -4, param1);
            param0.field_k.a((byte) 121, var4.a((byte) 118));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "v.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -98 + ')');
        }
    }

    final void f(int param0) {
        ((v) this).field_h.d(8);
        ((v) this).field_a.c(param0 + -134);
        ((v) this).field_b[((v) this).field_d] = 0;
        if (param0 != 10) {
            field_i = null;
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
            return;
        }
        field_g = null;
        field_i = null;
        field_j = null;
    }

    final static vb a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        if (null == bia.field_J) {
            return null;
        }
        if (param1 > -24) {
            field_g = null;
        }
        u var6 = bia.field_J[param3];
        if (var6 == null) {
            fea.a(false, param3);
            var6 = bia.field_J[param3];
        }
        if (!(param4 <= 0)) {
            return um.a(param2, param4, var6, -6455, param5);
        }
        return ql.a(param0, var6, (byte) 108, param5, param2);
    }

    final void a(int param0) {
        if (!(null != ql.field_k)) {
            return;
        }
        if (param0 != 6418) {
            vb discarded$0 = v.a(125, (byte) 41, 101, 81, 77, 14);
        }
        ql.field_k.k(81, -2988);
    }

    private final void a(qh param0, kh param1, int param2) {
        vra var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4 = new vra();
            this.a((bo) (Object) var4, 114, param1);
            var4.a(param0, (byte) -123, (v) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("v.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        if (param0 >= -80) {
            Object var9 = null;
            this.a((kh) null, (qh) null, 41);
        }
        ea var6 = new ea();
        for (var7 = 0; var7 < 8; var7++) {
            var6.a(17, var7, ((v) this).field_a.a(-44));
        }
        var6.a(-2767, param4);
        var6.b(8469, param3);
        var6.a(param1, (byte) -113);
        ((v) this).field_h.b((byte) -104, (vg) (Object) var6);
        hw.a((byte) -111, 0, 71, (bo) (Object) var6);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 125) {
            return;
        }
        for (var2 = 0; var2 < ((v) this).field_b.length; var2++) {
            ((v) this).field_b[var2] = -1;
        }
    }

    v(int param0, int param1) {
        ((v) this).field_a = new bka();
        ((v) this).field_h = new vna();
        ((v) this).field_d = param0;
        ((v) this).field_e = param1;
        ((v) this).field_c = new vi();
        ((v) this).field_b = new int[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Please select options in the following rows:  ";
        field_g = new String[6];
        field_g[3] = "Door 4x1 Left";
        field_g[4] = "Door 4x1 Right";
        field_g[5] = "Door 4x1 Lintel";
        field_g[2] = "Door 3x1 Lintel";
        field_g[0] = "Door 3x1 Left";
        field_g[1] = "Door 3x1 Right";
        field_k = 0;
    }
}
