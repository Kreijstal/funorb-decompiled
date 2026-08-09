/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends am {
    private int field_u;
    private int field_s;
    static int field_t;

    final int[] a(byte param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
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
          var3 = this.field_l.a(param1, 25657);
          if (!this.field_l.field_b) {
            break L1;
          } else {
            var4 = this.b(0, 0, param1);
            var5 = 0;
            L2: while (true) {
              if (ci.field_c <= var5) {
                break L1;
              } else {
                var6 = var4[var5];
                if (this.field_s > var6) {
                  var3[var5] = this.field_s;
                  var5++;
                  continue L2;
                } else {
                  if (var6 > this.field_u) {
                    var3[var5] = this.field_u;
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

    final static void g(byte param0) {
        i.field_R = false;
        me.field_a = null;
        ib.field_c = null;
        qh.field_b = null;
        if (param0 != -68) {
            la var2 = (la) null;
            qo.a(47, -32, -37, (fi) null, (la) null);
        }
        fd.field_k = null;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        int[] var30;
        int[] var31;
        int[] var32;
        int[][] var37;
        int[] var38;
        int[] var39;
        int[] var40;
        var15 = Torquing.field_u;
        var26 = this.field_r.a(15142, param1);
        var18 = var26;
        var16 = var18;
        var3 = var16;
        if (param0 == -29116) {
          L0: {
            if (!this.field_r.field_b) {
              break L0;
            } else {
              var37 = this.c(param0 + 53182, param1, 0);
              var38 = var37[0];
              var39 = var37[1];
              var40 = var37[2];
              var30 = var26[0];
              var22 = var30;
              var8 = var22;
              var31 = var26[1];
              var23 = var31;
              var9 = var23;
              var32 = var26[2];
              var24 = var32;
              var10 = var24;
              var11 = 0;
              L1: while (true) {
                if (var11 >= ci.field_c) {
                  break L0;
                } else {
                  L2: {
                    var12 = var38[var11];
                    var13 = var39[var11];
                    var14 = var40[var11];
                    if (this.field_s <= var12) {
                      if (this.field_u < var12) {
                        var8[var11] = this.field_u;
                        break L2;
                      } else {
                        var30[var11] = var12;
                        break L2;
                      }
                    } else {
                      var8[var11] = this.field_s;
                      break L2;
                    }
                  }
                  L3: {
                    if (this.field_s <= var13) {
                      if (var13 > this.field_u) {
                        var9[var11] = this.field_u;
                        break L3;
                      } else {
                        var31[var11] = var13;
                        break L3;
                      }
                    } else {
                      var9[var11] = this.field_s;
                      break L3;
                    }
                  }
                  if (var14 >= this.field_s) {
                    if (this.field_u < var14) {
                      var10[var11] = this.field_u;
                      var11++;
                      continue L1;
                    } else {
                      var32[var11] = var14;
                      var11++;
                      continue L1;
                    }
                  } else {
                    var10[var11] = this.field_s;
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  this.field_u = param0.i(7088);
                  break L1;
                } else {
                  if (2 == var4_int) {
                    L2: {
                      stackIn_10_0 = this;

                      if (-2 != (param0.i((byte) -101) ^ -1)) {
                        stackIn_11_0 = this;
                        stackIn_11_1 = 0;
                        break L2;
                      } else {
                        stackIn_11_0 = this;
                        stackIn_11_1 = 1;
                        break L2;
                      }
                    }
                    ((qo) (this)).field_p = stackIn_11_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                this.field_s = param0.i(param1 + 7053);
                break L1;
              }
            }
            L3: {
              if (param1 == 35) {
                break L3;
              } else {
                this.a((byte) -121, -73);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("qo.H(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
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
        L1: {
          if (param3 == -95) {
            break L1;
          } else {
            qo.g((byte) 86);
            break L1;
          }
        }
    }

    public qo() {
        super(1, false);
        this.field_u = 4096;
        this.field_s = 0;
    }

    final static lh a(int param0, int param1, int param2, fi param3, la param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        lh stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        lh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = param4.a(param0, param2 + 100, param1);
            var5 = var6;
            if (param2 == 0) {
              if (var6 != null) {
                stackIn_7_0 = new lh(new fj(var6), param3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (lh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("qo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (lh) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    static {
    }
}
