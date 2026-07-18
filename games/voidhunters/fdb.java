/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fdb extends hbb {
    private int[] field_R;
    static String field_T;
    static String field_S;
    private boolean field_P;
    private int field_Q;
    private int[] field_J;
    private cl field_U;

    public static void g(int param0) {
        field_S = null;
        if (param0 != 0) {
            fdb.g(-2);
        }
        field_T = null;
    }

    final synchronized void a(kka param0, boolean param1, int param2, boolean param3) {
        try {
            this.f(-17);
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "fdb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        for (var2 = 0; var2 < 16; var2++) {
            ((fdb) this).field_R[var2] = 1048576;
        }
        super.b(256, (byte) 18, -1);
    }

    fdb(hbb param0) {
        super(param0);
        ((fdb) this).field_Q = 256;
        ((fdb) this).field_J = new int[16];
        ((fdb) this).field_R = new int[16];
        try {
            this.f(-17);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "fdb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, byte param3) {
        llb stackIn_4_0 = null;
        llb stackIn_5_0 = null;
        llb stackIn_6_0 = null;
        llb stackIn_7_0 = null;
        llb stackIn_8_0 = null;
        llb stackIn_9_0 = null;
        llb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        llb stackIn_11_0 = null;
        llb stackIn_12_0 = null;
        llb stackIn_13_0 = null;
        llb stackIn_14_0 = null;
        llb stackIn_15_0 = null;
        llb stackIn_16_0 = null;
        llb stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        llb stackIn_18_0 = null;
        llb stackIn_19_0 = null;
        llb stackIn_20_0 = null;
        llb stackIn_21_0 = null;
        llb stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        llb stackOut_3_0 = null;
        llb stackOut_4_0 = null;
        llb stackOut_5_0 = null;
        llb stackOut_6_0 = null;
        llb stackOut_7_0 = null;
        llb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        llb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        llb stackOut_10_0 = null;
        llb stackOut_11_0 = null;
        llb stackOut_12_0 = null;
        llb stackOut_13_0 = null;
        llb stackOut_14_0 = null;
        llb stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        llb stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        llb stackOut_17_0 = null;
        llb stackOut_18_0 = null;
        llb stackOut_19_0 = null;
        llb stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        llb stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          moa.a(true);
          if (0 > tg.field_q) {
            nna.field_v.field_R = null;
            break L0;
          } else {
            nna.field_v.field_R = isa.a(gcb.field_t, new String[1], 78);
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_3_0 = tb.field_a;
            stackIn_9_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param0) {
              break L2;
            } else {
              stackOut_4_0 = (llb) (Object) stackIn_4_0;
              stackIn_9_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param1) {
                break L2;
              } else {
                stackOut_5_0 = (llb) (Object) stackIn_5_0;
                stackIn_9_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (bv.field_d) {
                  break L2;
                } else {
                  stackOut_6_0 = (llb) (Object) stackIn_6_0;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (lqa.field_o != null) {
                    break L2;
                  } else {
                    stackOut_7_0 = (llb) (Object) stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (null != ohb.field_o) {
                      break L2;
                    } else {
                      stackOut_8_0 = (llb) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_9_0 = (llb) (Object) stackIn_9_0;
          stackOut_9_1 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          break L1;
        }
        L3: {
          L4: {
            ((llb) (Object) stackIn_10_0).a(stackIn_10_1 != 0, 1332);
            stackOut_10_0 = bqa.field_d;
            stackIn_16_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (!param0) {
              break L4;
            } else {
              stackOut_11_0 = (llb) (Object) stackIn_11_0;
              stackIn_16_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (param1) {
                break L4;
              } else {
                stackOut_12_0 = (llb) (Object) stackIn_12_0;
                stackIn_16_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (bv.field_d) {
                  break L4;
                } else {
                  stackOut_13_0 = (llb) (Object) stackIn_13_0;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (null != lqa.field_o) {
                    break L4;
                  } else {
                    stackOut_14_0 = (llb) (Object) stackIn_14_0;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (null != ohb.field_o) {
                      break L4;
                    } else {
                      stackOut_15_0 = (llb) (Object) stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_16_0 = (llb) (Object) stackIn_16_0;
          stackOut_16_1 = 0;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          break L3;
        }
        L5: {
          L6: {
            ((llb) (Object) stackIn_17_0).a(stackIn_17_1 != 0, 1332);
            stackOut_17_0 = dd.field_o;
            stackIn_21_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (!param0) {
              break L6;
            } else {
              stackOut_18_0 = (llb) (Object) stackIn_18_0;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (param1) {
                break L6;
              } else {
                stackOut_19_0 = (llb) (Object) stackIn_19_0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (!bv.field_d) {
                  break L6;
                } else {
                  stackOut_20_0 = (llb) (Object) stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L5;
                }
              }
            }
          }
          stackOut_21_0 = (llb) (Object) stackIn_21_0;
          stackOut_21_1 = 0;
          stackIn_22_0 = stackOut_21_0;
          stackIn_22_1 = stackOut_21_1;
          break L5;
        }
        L7: {
          ((llb) (Object) stackIn_22_0).a(stackIn_22_1 != 0, 1332);
          lc.field_b.field_a.i(10000);
          if (gmb.field_c.field_o == 0) {
            break L7;
          } else {
            nwa.field_d = true;
            break L7;
          }
        }
        L8: {
          if (gha.field_p.field_o == 0) {
            break L8;
          } else {
            if (ufa.field_o) {
              w.a(param2, (byte) 92);
              break L8;
            } else {
              if (hcb.field_o > 0) {
                w.a(param2, (byte) 92);
                break L8;
              } else {
                if (go.field_p < 2) {
                  break L8;
                } else {
                  if (!si.field_o[12]) {
                    break L8;
                  } else {
                    w.a(param2, (byte) 92);
                    break L8;
                  }
                }
              }
            }
          }
        }
        L9: {
          if (0 == oib.field_a.field_o) {
            break L9;
          } else {
            L10: {
              if (ieb.field_o.length != 1) {
                break L10;
              } else {
                if (sha.field_w == ieb.field_o[0]) {
                  break L10;
                } else {
                  sha.field_w = ieb.field_o[0];
                  break L10;
                }
              }
            }
            eaa.a((byte) 127, true, vva.field_u, 0, sha.field_w, param2);
            break L9;
          }
        }
        L11: {
          if (ss.field_o.field_o != 0) {
            bv.field_d = false;
            break L11;
          } else {
            break L11;
          }
        }
    }

    final synchronized void b(int param0, byte param1, int param2) {
        if (!(param2 != -1)) {
            ((fdb) this).field_Q = param0;
            return;
        }
        super.b(param0, param1, param2);
        ((fdb) this).field_R[param2] = param0 << 12;
    }

    final synchronized void a(byte param0, int param1, cl param2) {
        int var4_int = 0;
        try {
            var4_int = vka.field_s * param1 / 1000;
            this.a(-91, param2, var4_int);
            int var5 = 76 % ((param0 - 80) / 33);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "fdb.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public fdb() {
        ((fdb) this).field_Q = 256;
        ((fdb) this).field_J = new int[16];
        ((fdb) this).field_R = new int[16];
        this.f(-17);
    }

    private final synchronized void b(int param0, int param1, int param2, byte param3) {
        ((fdb) this).field_P = false;
        if (!(((fdb) this).field_U != null)) {
            ((fdb) this).field_U = new cl();
        }
        ((fdb) this).field_U.field_a[param1] = param2;
        int var5 = ((fdb) this).field_R[param1];
        int var6 = -var5 + (((fdb) this).field_U.field_a[param1] << 12);
        int var7 = 0;
        int var8 = 0;
        if (!(0 <= var6)) {
            var6 = -var6;
            var8 = 1;
        }
        if (var6 > 0) {
            var7 = (1 + var6) / (param0 + 1);
        }
        ((fdb) this).field_J[param1] = var8 != 0 ? -var7 : var7;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = ((fdb) this).e(127);
              ((fdb) this).b(((fdb) this).field_Q * var4_int >> 8, (byte) 14);
              super.a(param0, param1, param2);
              if (((fdb) this).field_P) {
                break L1;
              } else {
                var5 = 1;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 16) {
                    if (var5 == 0) {
                      break L1;
                    } else {
                      ((fdb) this).field_P = true;
                      break L1;
                    }
                  } else {
                    L3: {
                      var7 = ((fdb) this).field_J[var6];
                      if (0 != var7) {
                        L4: {
                          ((fdb) this).field_R[var6] = ((fdb) this).field_R[var6] + param2 * var7;
                          var8 = ((fdb) this).field_U.field_a[var6];
                          if (((fdb) this).field_R[var6] >> 12 >= var8) {
                            stackOut_8_0 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            break L4;
                          } else {
                            stackOut_7_0 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            break L4;
                          }
                        }
                        L5: {
                          stackOut_9_0 = stackIn_9_0;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var7 <= 0) {
                            stackOut_11_0 = stackIn_11_0;
                            stackOut_11_1 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L5;
                          } else {
                            stackOut_10_0 = stackIn_10_0;
                            stackOut_10_1 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            break L5;
                          }
                        }
                        L6: {
                          if ((stackIn_12_0 ^ stackIn_12_1) == 0) {
                            var5 = 0;
                            break L6;
                          } else {
                            ((fdb) this).field_J[var6] = 0;
                            ((fdb) this).field_R[var6] = var8 << 12;
                            break L6;
                          }
                        }
                        super.b(((fdb) this).field_R[var6] >> 12, (byte) 18, var6);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            ((fdb) this).b(var4_int, (byte) 14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("fdb.E(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(int param0, cl param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            ((fdb) this).field_U = param1;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= 16) {
                break L0;
              } else {
                this.b(param2, var4_int, ((fdb) this).field_U.field_a[var4_int], (byte) -48);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("fdb.F(").append(-91).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "Bullfrog chassis";
        field_T = "Get your turret to the escape zone";
    }
}
