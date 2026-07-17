/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends fj implements ij {
    private boolean field_ub;
    static String field_rb;
    private boolean field_nb;
    static ee field_qb;
    static String field_sb;
    static tr field_pb;
    private mk field_tb;
    static int[][] field_ob;
    static String field_vb;

    final static byte[] a(int param0, byte[] param1, int param2, mi param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param3.c((byte) -96, 16);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.c((byte) -118, 3);
                var6 = (byte)param3.c((byte) -101, 8);
                if (var5 <= 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (byte)(param3.c((byte) -125, var5) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (byte[]) param1;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("oe.SB(").append(12635).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(16).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    public static void p(int param0) {
        field_qb = null;
        field_sb = null;
        field_vb = null;
        field_pb = null;
        field_ob = null;
        if (param0 != 12705) {
            oe.p(83);
        }
        field_rb = null;
    }

    final static boolean q(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 59) {
            break L0;
          } else {
            field_rb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lo.field_k) {
              break L2;
            } else {
              if (bm.field_I != rg.field_d) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void o(int param0) {
        this.a(fn.a(248, true, af.field_J), true, -120);
        if (param0 != 16614) {
            boolean discarded$0 = oe.q(56);
        }
    }

    final boolean j(int param0) {
        ch var2 = null;
        if (param0 != 17) {
            ((oe) this).field_ub = false;
        }
        if (((oe) this).field_I) {
            if (!((oe) this).field_nb) {
                var2 = ar.b(param0 ^ 17);
                if (!(var2 == null)) {
                    this.a(var2, false, param0 ^ -64);
                }
            }
        }
        return super.j(17);
    }

    private final void a(ch param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        rh var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((oe) this).field_nb = true;
              if (param2 < -45) {
                break L1;
              } else {
                field_pb = null;
                break L1;
              }
            }
            L2: {
              if (!param0.field_a) {
                if (param0.field_b == null) {
                  var4_ref = param0.field_j;
                  if (param0.field_h == 248) {
                    L3: {
                      if (param1) {
                        break L3;
                      } else {
                        mr.a(false);
                        break L3;
                      }
                    }
                    ((oe) this).field_ub = true;
                    var4_ref = af.field_J;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4_ref = wa.field_g;
                  if (((oe) this).field_tb != null) {
                    ((oe) this).field_tb.a(-4384);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4_ref = dh.field_c;
                break L2;
              }
            }
            L4: {
              L5: {
                var5 = new rh((fj) this, sg.field_a, var4_ref);
                if (!param0.field_a) {
                  L6: {
                    if (!((oe) this).field_ub) {
                      if (param0.field_h != 5) {
                        var5.a(ap.field_f, -1, -61);
                        break L6;
                      } else {
                        var5.a(jb.field_A, 11, -123);
                        var5.a(jd.field_b, 17, -50);
                        break L6;
                      }
                    } else {
                      d discarded$2 = var5.a(vi.field_x, (uf) this, -116);
                      break L6;
                    }
                  }
                  if (param0.field_h == 3) {
                    var5.a(hb.field_o, 7, -33);
                    break L5;
                  } else {
                    if (param0.field_h == 6) {
                      var5.a(hm.field_H, 9, -26);
                      break L5;
                    } else {
                      ((oe) this).a(false, (iq) (Object) var5);
                      break L4;
                    }
                  }
                } else {
                  if (!param0.field_i) {
                    d discarded$3 = var5.a(vi.field_x, (uf) this, -110);
                    break L5;
                  } else {
                    ((oe) this).a(false, (iq) (Object) new ue((oe) this));
                    return;
                  }
                }
              }
              ((oe) this).a(false, (iq) (Object) var5);
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("oe.UA(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    oe(sd param0, mk param1) {
        super(param0, sg.field_a, ac.field_L, false, false);
        try {
            ((oe) this).field_tb = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "oe.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        if (((oe) this).field_ub) {
            ak.a(true, false, 3);
            return;
        }
        try {
            fj.g((byte) -127);
            ((oe) this).h((byte) 57);
            int var6_int = 112 % ((-63 - param2) / 51);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "oe.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_rb = "TAB - hide chat temporarily";
        field_ob = null;
        field_sb = "Unpacking sound effects";
        field_qb = new ee();
        field_vb = "Instructions";
    }
}
