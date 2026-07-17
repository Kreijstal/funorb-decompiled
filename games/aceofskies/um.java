/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends rf {
    kp field_k;
    static tk field_m;
    static boolean field_j;
    static String field_n;
    private hk field_l;
    tp field_i;

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ft var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            ((um) this).field_i.b(param0, param1, param2);
            var6 = (ft) (Object) ((um) this).field_k.d(268435455);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (((um) this).field_l.a(0, var6)) {
                    break L2;
                  } else {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var5 <= var6.field_i) {
                        this.a(var6, (byte) 120, var5, var5 + var4_int, param0, var4_int);
                        var6.field_i = var6.field_i - var5;
                        break L2;
                      } else {
                        this.a(var6, (byte) 121, var6.field_i, var4_int - -var5, param0, var4_int);
                        var4_int = var4_int + var6.field_i;
                        var5 = var5 - var6.field_i;
                        if (((um) this).field_l.a(var5, var4_int, false, var6, param0)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (ft) (Object) ((um) this).field_k.b((byte) 103);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("um.M(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1, ft param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hk stackIn_7_0 = null;
        ft stackIn_7_1 = null;
        hk stackIn_8_0 = null;
        ft stackIn_8_1 = null;
        hk stackIn_9_0 = null;
        ft stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        hk stackOut_6_0 = null;
        ft stackOut_6_1 = null;
        hk stackOut_8_0 = null;
        ft stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        hk stackOut_7_0 = null;
        ft stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (~(4 & ((um) this).field_l.field_G[param2.field_m]) == param0) {
                break L1;
              } else {
                if (0 <= param2.field_p) {
                  break L1;
                } else {
                  var4_int = ((um) this).field_l.field_m[param2.field_m] / tk.field_f;
                  var5 = (var4_int + 1048575 - param2.field_t) / var4_int;
                  param2.field_t = var4_int * param1 + param2.field_t & 1048575;
                  if (var5 <= param1) {
                    L2: {
                      if (((um) this).field_l.field_z[param2.field_m] != 0) {
                        L3: {
                          param2.field_e = su.a(param2.field_x, param2.field_e.l(), 0, param2.field_e.g());
                          stackOut_6_0 = ((um) this).field_l;
                          stackOut_6_1 = (ft) param2;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (param2.field_y.field_n[param2.field_n] >= 0) {
                            stackOut_8_0 = (hk) (Object) stackIn_8_0;
                            stackOut_8_1 = (ft) (Object) stackIn_8_1;
                            stackOut_8_2 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L3;
                          } else {
                            stackOut_7_0 = (hk) (Object) stackIn_7_0;
                            stackOut_7_1 = (ft) (Object) stackIn_7_1;
                            stackOut_7_2 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L3;
                          }
                        }
                        ((hk) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2 != 0, true);
                        break L2;
                      } else {
                        param2.field_e = su.a(param2.field_x, param2.field_e.l(), param2.field_e.i(), param2.field_e.g());
                        break L2;
                      }
                    }
                    L4: {
                      if (param2.field_y.field_n[param2.field_n] >= 0) {
                        break L4;
                      } else {
                        param2.field_e.d(-1);
                        break L4;
                      }
                    }
                    param1 = param2.field_t / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param2.field_e.a(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("um.C(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final int d() {
        return 0;
    }

    final static s a(boolean param0, int param1) {
        dl var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        dl var8 = null;
        jr var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_21_0 = null;
        L0: {
          var7 = AceOfSkies.field_G ? 1 : 0;
          var8 = nm.field_c;
          var2 = var8;
          var3 = var8.g(39);
          m.field_f = 127 & var3;
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          sj.field_b = stackIn_3_0 != 0;
          km.field_b = var8.g(-100);
          pe.field_g = var8.h((byte) 118);
          if (2 == m.field_f) {
            jt.field_t = var8.i((byte) 0);
            ot.field_a = var8.g((byte) -92);
            break L1;
          } else {
            jt.field_t = 0;
            ot.field_a = 0;
            break L1;
          }
        }
        L2: {
          if (1 != var8.g(-89)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          ku.field_g = var8.h(-17883);
          if (var4 != 0) {
            tn.field_t = var8.h(-17883);
            break L3;
          } else {
            tn.field_t = ku.field_g;
            break L3;
          }
        }
        L4: {
          if (1 == m.field_f) {
            int discarded$4 = var8.i((byte) 0);
            String discarded$5 = var8.h(-17883);
            break L4;
          } else {
            if (m.field_f == 4) {
              int discarded$6 = var8.i((byte) 0);
              String discarded$7 = var8.h(-17883);
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (param0) {
          var5 = var8.i((byte) 0);
          try {
            L5: {
              L6: {
                var9 = uk.field_f.a(var5, -43);
                ep.field_x = var9.c((byte) 1);
                if (!tn.field_t.equals((Object) (Object) fj.field_a)) {
                  stackOut_22_0 = var9.field_t;
                  stackIn_23_0 = stackOut_22_0;
                  break L6;
                } else {
                  stackOut_21_0 = null;
                  stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                }
              }
              ku.field_e = stackIn_23_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            v.a("CC1", (byte) -52, (Throwable) (Object) var6);
            ku.field_e = null;
            ep.field_x = null;
            return new s(param0);
          }
          return new s(param0);
        } else {
          ep.field_x = ko.a((rb) (Object) var8, 80, (byte) -114);
          ku.field_e = null;
          return new s(param0);
        }
    }

    final rf b() {
        ft var1 = (ft) (Object) ((um) this).field_k.d(268435455);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_e == null)) {
            return (rf) (Object) var1.field_e;
        }
        return ((um) this).a();
    }

    final void a(int param0) {
        int var2 = 0;
        ft var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        ((um) this).field_i.a(param0);
        var3 = (ft) (Object) ((um) this).field_k.d(268435455);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!((um) this).field_l.a(0, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_i >= var2) {
                    this.a(-1, var2, var3);
                    var3.field_i = var3.field_i - var2;
                    break L1;
                  } else {
                    this.a(-1, var3.field_i, var3);
                    var2 = var2 - var3.field_i;
                    if (((um) this).field_l.a(var2, 0, false, var3, (int[]) null)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (ft) (Object) ((um) this).field_k.b((byte) 103);
            continue L0;
          } else {
            return;
          }
        }
    }

    final rf a() {
        ft var1_ref = null;
        int var2 = AceOfSkies.field_G ? 1 : 0;
        do {
            var1_ref = (ft) (Object) ((um) this).field_k.b((byte) 103);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_e);
        return (rf) (Object) var1_ref.field_e;
    }

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == 1) {
          ss.field_t = false;
          uf.field_e = null;
          if (!nf.field_a) {
            var1 = un.field_c;
            if (var1 > 0) {
              if (var1 == 1) {
                uf.field_e = qk.field_f;
                uf.field_e = od.a(new CharSequence[3], 3);
                ml.field_m.h((byte) 127);
                nj.c(98);
                return;
              } else {
                uf.field_e = sn.a(field_n, 121, new String[1]);
                uf.field_e = od.a(new CharSequence[3], 3);
                ml.field_m.h((byte) 127);
                nj.c(98);
                return;
              }
            } else {
              ml.field_m.h((byte) 127);
              nj.c(98);
              return;
            }
          } else {
            ml.field_m.l(88);
            return;
          }
        } else {
          field_n = null;
          ss.field_t = false;
          uf.field_e = null;
          if (!nf.field_a) {
            var1 = un.field_c;
            if (var1 > 0) {
              if (var1 == 1) {
                uf.field_e = qk.field_f;
                uf.field_e = od.a(new CharSequence[3], 3);
                ml.field_m.h((byte) 127);
                nj.c(98);
                return;
              } else {
                uf.field_e = sn.a(field_n, 121, new String[1]);
                uf.field_e = od.a(new CharSequence[3], 3);
                ml.field_m.h((byte) 127);
                nj.c(98);
                return;
              }
            } else {
              ml.field_m.h((byte) 127);
              nj.c(98);
              return;
            }
          } else {
            ml.field_m.l(88);
            return;
          }
        }
    }

    private final void a(ft param0, byte param1, int param2, int param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        su var11 = null;
        int var12 = 0;
        hk stackIn_11_0 = null;
        ft stackIn_11_1 = null;
        hk stackIn_12_0 = null;
        ft stackIn_12_1 = null;
        hk stackIn_13_0 = null;
        ft stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        hk stackOut_10_0 = null;
        ft stackOut_10_1 = null;
        hk stackOut_12_0 = null;
        ft stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        hk stackOut_11_0 = null;
        ft stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & ((um) this).field_l.field_G[param0.field_m]) == 0) {
                break L1;
              } else {
                if (param0.field_p >= 0) {
                  break L1;
                } else {
                  var7_int = ((um) this).field_l.field_m[param0.field_m] / tk.field_f;
                  L2: while (true) {
                    var8 = (-param0.field_t + (var7_int + 1048575)) / var7_int;
                    if (var8 > param2) {
                      param0.field_t = param0.field_t + param2 * var7_int;
                      break L1;
                    } else {
                      L3: {
                        param0.field_e.b(param4, param5, var8);
                        param2 = param2 - var8;
                        param0.field_t = param0.field_t + (var7_int * var8 + -1048576);
                        param5 = param5 + var8;
                        var9 = tk.field_f / 100;
                        var10 = 262144 / var7_int;
                        if (var10 < var9) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_e;
                        if (((um) this).field_l.field_z[param0.field_m] != 0) {
                          L5: {
                            param0.field_e = su.a(param0.field_x, var11.l(), 0, var11.g());
                            stackOut_10_0 = ((um) this).field_l;
                            stackOut_10_1 = (ft) param0;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (0 <= param0.field_y.field_n[param0.field_n]) {
                              stackOut_12_0 = (hk) (Object) stackIn_12_0;
                              stackOut_12_1 = (ft) (Object) stackIn_12_1;
                              stackOut_12_2 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              break L5;
                            } else {
                              stackOut_11_0 = (hk) (Object) stackIn_11_0;
                              stackOut_11_1 = (ft) (Object) stackIn_11_1;
                              stackOut_11_2 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              break L5;
                            }
                          }
                          ((hk) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0, true);
                          param0.field_e.d(var9, var11.i());
                          break L4;
                        } else {
                          param0.field_e = su.a(param0.field_x, var11.l(), var11.i(), var11.g());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 > param0.field_y.field_n[param0.field_n]) {
                          param0.field_e.d(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.h(var9);
                      var11.b(param4, param5, -param5 + param3);
                      if (!var11.j()) {
                        continue L2;
                      } else {
                        ((um) this).field_i.b((rf) (Object) var11);
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            var7_int = -120 / ((35 - param1) / 48);
            param0.field_e.b(param4, param5, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("um.F(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param5 + 41);
        }
    }

    um(hk param0) {
        ((um) this).field_k = new kp();
        ((um) this).field_i = new tp();
        try {
            ((um) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "um.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = true;
        field_n = "You have <%0> unread messages!";
    }
}
