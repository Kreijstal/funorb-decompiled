/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends ib implements en {
    private vf field_K;
    private String[] field_J;
    static int[] field_I;
    static String field_O;
    static String field_L;
    static String field_N;
    static int field_M;
    private d[] field_H;

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= this.field_J.length) {
                L2: {
                  if (param4 != this.field_H[this.field_J.length]) {
                    break L2;
                  } else {
                    this.field_K.a((byte) 100);
                    break L2;
                  }
                }
                L3: {
                  if (param2 < -22) {
                    break L3;
                  } else {
                    this.a(-93, -52, -108, (byte) -4);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_H[var6_int] == param4) {
                    this.field_K.a(this.field_J[var6_int], (byte) 56);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ri.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 > -69) {
            return false;
        }
        return null != td.field_t ? true : false;
    }

    final void a(byte param0, String[] param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        bb var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_G.c((byte) -95);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == 0) {
                  break L1;
                } else {
                  var3_int = param1.length;
                  this.field_J = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new bb(a.field_u, 0, 1);
                      this.field_H = new d[var3_int - -1];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          this.field_H[var3_int] = new d(sh.field_c, (uh) (this));
                          var5 = 52 / ((-9 - param0) / 59);
                          this.field_H[var3_int].field_l = (ub) ((Object) var4);
                          this.field_H[var3_int].a(15, 0, 16 * (var3_int - -1) + 20, (byte) -119, 100);
                          this.a(this.field_H[var3_int], true);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_H[var5] = new d(this.field_J[var5], (uh) (this));
                          this.field_H[var5].field_l = (ub) ((Object) var4);
                          this.field_H[var5].field_z = aa.field_c;
                          this.field_H[var5].a(15, 0, var5 * 16 + 20, (byte) -119, 80);
                          this.a(this.field_H[var5], true);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_J[var4_int] = ap.a(true, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            this.field_J = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ri.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void h(int param0) {
        if (param0 > -41) {
            return;
        }
        aa.a((byte) 96);
        ko.a(-32120);
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param0 ^ -1) == -99) {
                stackIn_7_0 = this.b(param2, (byte) -60);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 == 99) {
                  stackIn_11_0 = this.a(param2, (byte) -117);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ri.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static byte[] a(byte[] param0, int param1, pi param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param3 == 20) {
              var4_int = param2.c(param1, (byte) -112);
              if (var4_int != 0) {
                L1: {
                  L2: {
                    if (param0 == null) {
                      break L2;
                    } else {
                      if (param0.length == var4_int) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0 = new byte[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param2.c(3, (byte) 98);
                  var6 = (byte)param2.c(8, (byte) 31);
                  if (0 < var5) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param0[var7] = (byte)(var6 + param2.c(var5, (byte) 107));
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
                        param0[var7] = (byte)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (byte[]) (param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("ri.W(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    public static void a(byte param0) {
        field_I = null;
        if (param0 != -83) {
            field_O = (String) null;
        }
        field_O = null;
        field_L = null;
        field_N = null;
    }

    final static void c(boolean param0) {
        int var1 = 0;
        if (ki.field_d < 224) {
            var1 = ki.field_d % 32;
            h.a(13894, ki.field_d + (32 + -var1));
        } else {
            h.a(13894, 256);
        }
        if (!param0) {
            field_M = -128;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        dh var5 = a.field_u;
        if (this.field_J != null) {
            var5.a(i.field_l, param1 - -this.field_o, this.field_w + param0, this.field_t, 20, 16777215, -1, 0, 0, var5.field_P + var5.field_F);
        }
    }

    ri(vf param0) {
        super(0, 0, 0, 0, (ub) null);
        try {
            this.field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_L = "Continue";
        field_O = "Remove <%0> from ignore list";
    }
}
