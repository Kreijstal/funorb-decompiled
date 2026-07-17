/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends am {
    private int field_u;
    private int field_s;
    static int field_t;

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Torquing.field_u;
          if (param0 > 86) {
            break L0;
          } else {
            field_t = -29;
            break L0;
          }
        }
        L1: {
          var3 = ((qo) this).field_l.a(param1, 25657);
          if (!((qo) this).field_l.field_b) {
            break L1;
          } else {
            var4 = ((qo) this).b(0, 0, param1);
            var5 = 0;
            L2: while (true) {
              if (ci.field_c <= var5) {
                break L1;
              } else {
                var6 = var4[var5];
                if (((qo) this).field_s > var6) {
                  var3[var5] = ((qo) this).field_s;
                  var5++;
                  continue L2;
                } else {
                  if (var6 > ((qo) this).field_u) {
                    var3[var5] = ((qo) this).field_u;
                    var5++;
                    continue L2;
                  } else {
                    var3[var5] = var6;
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final static void g() {
        i.field_R = false;
        me.field_a = null;
        ib.field_c = null;
        qh.field_b = null;
        fd.field_k = null;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[][] var34 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var41 = null;
        int[][] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        var15 = Torquing.field_u;
        var42 = ((qo) this).field_r.a(15142, param1);
        var34 = var42;
        var26 = var34;
        var18 = var26;
        var16 = var18;
        var3 = var16;
        if (param0 == -29116) {
          L0: {
            if (!((qo) this).field_r.field_b) {
              break L0;
            } else {
              var41 = ((qo) this).c(param0 + 53182, param1, 0);
              var43 = var41[0];
              var44 = var41[1];
              var45 = var41[2];
              var46 = var42[0];
              var38 = var46;
              var30 = var38;
              var22 = var30;
              var8 = var22;
              var47 = var42[1];
              var39 = var47;
              var31 = var39;
              var23 = var31;
              var9 = var23;
              var48 = var42[2];
              var40 = var48;
              var32 = var40;
              var24 = var32;
              var10 = var24;
              var11 = 0;
              L1: while (true) {
                if (var11 >= ci.field_c) {
                  break L0;
                } else {
                  L2: {
                    var12 = var43[var11];
                    var13 = var44[var11];
                    var14 = var45[var11];
                    if (((qo) this).field_s <= var12) {
                      if (((qo) this).field_u < var12) {
                        var8[var11] = ((qo) this).field_u;
                        break L2;
                      } else {
                        var46[var11] = var12;
                        break L2;
                      }
                    } else {
                      var8[var11] = ((qo) this).field_s;
                      break L2;
                    }
                  }
                  L3: {
                    if (((qo) this).field_s <= var13) {
                      if (var13 > ((qo) this).field_u) {
                        var9[var11] = ((qo) this).field_u;
                        break L3;
                      } else {
                        var47[var11] = var13;
                        break L3;
                      }
                    } else {
                      var9[var11] = ((qo) this).field_s;
                      break L3;
                    }
                  }
                  if (var14 >= ((qo) this).field_s) {
                    if (((qo) this).field_u < var14) {
                      var10[var11] = ((qo) this).field_u;
                      var11++;
                      continue L1;
                    } else {
                      var48[var11] = var14;
                      var11++;
                      continue L1;
                    }
                  } else {
                    var10[var11] = ((qo) this).field_s;
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  ((qo) this).field_u = param0.i(7088);
                  break L1;
                } else {
                  if (2 == var4_int) {
                    L2: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (param0.i((byte) -101) != 1) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L2;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L2;
                      }
                    }
                    ((qo) this).field_p = stackIn_11_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                ((qo) this).field_s = param0.i(param1 + 7053);
                break L1;
              }
            }
            L3: {
              if (param1 == 35) {
                break L3;
              } else {
                int[] discarded$1 = ((qo) this).a((byte) -121, -73);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("qo.H(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        L0: {
          if (-param1 + param4 < kn.field_e) {
            v.a(param2, param4, param0, (byte) 77, param1);
            break L0;
          } else {
            if (param1 + param4 > qg.field_z) {
              v.a(param2, param4, param0, (byte) 77, param1);
              break L0;
            } else {
              if (-param1 + param2 < j.field_q) {
                v.a(param2, param4, param0, (byte) 77, param1);
                break L0;
              } else {
                if (param2 - -param1 > qk.field_p) {
                  v.a(param2, param4, param0, (byte) 77, param1);
                  break L0;
                } else {
                  r.a(param4, param1, -121, param0, param2);
                  break L0;
                }
              }
            }
          }
        }
    }

    public qo() {
        super(1, false);
        ((qo) this).field_u = 4096;
        ((qo) this).field_s = 0;
    }

    final static lh a(int param0, int param1, int param2, fi param3, la param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        Object stackIn_4_0 = null;
        lh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            var6 = param4.a(param0, 100, param1);
            var5 = var6;
            if (var6 != null) {
              stackOut_5_0 = new lh(new fj(var6), param3);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (lh) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5_ref;
            stackOut_7_1 = new StringBuilder().append("qo.A(").append(param0).append(44).append(param1).append(44).append(0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    static {
    }
}
