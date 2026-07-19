/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    lh field_e;
    static int field_d;
    static boolean field_b;
    static int field_f;
    private lh field_c;
    static int field_a;
    static String field_g;

    final lh c(byte param0) {
        lh var2 = null;
        var2 = this.field_e.field_h;
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_h;
          if (param0 != 47) {
            field_b = true;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final lh a(byte param0) {
        int var2 = 0;
        lh var3 = null;
        var2 = 3 / ((28 - param0) / 36);
        var3 = this.field_e.field_a;
        if (this.field_e == var3) {
          return null;
        } else {
          var3.c(-1);
          return var3;
        }
    }

    final void b(boolean param0, lh param1) {
        try {
            if (param1.field_a != null) {
                param1.c(-1);
            }
            param1.field_a = this.field_e;
            param1.field_h = this.field_e.field_h;
            param1.field_a.field_h = param1;
            if (!param0) {
                lh var4 = (lh) null;
                this.a(true, (lh) null);
            }
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "vc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final lh b(int param0) {
        lh var2 = null;
        var2 = this.field_e.field_a;
        if (this.field_e != var2) {
          this.field_c = var2.field_a;
          if (param0 > -33) {
            return (lh) null;
          } else {
            return var2;
          }
        } else {
          this.field_c = null;
          return null;
        }
    }

    final lh b(byte param0) {
        lh var2 = this.field_c;
        if (param0 != -105) {
            field_g = (String) null;
            if (!(var2 != this.field_e)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_h;
            return var2;
        }
        if (!(var2 != this.field_e)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    final static void a(byte param0, rh param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        si var6 = null;
        int[] var7 = null;
        int var8 = 0;
        ih var9 = null;
        ih var10 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var9 = new ih(param1.a(0, "", "logo.fo3d"));
            var10 = var9;
            var3 = var10.e(false);
            var10.k(8);
            fc.field_a = fleas.a(var10, -6383);
            ij.field_F = new si[var3];
            gm.field_kb = new int[var3][];
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var3 <= var4) {
                  var10.m(8);
                  var4 = 17 % ((param0 - 75) / 44);
                  break L2;
                } else {
                  ij.field_F[var4] = d.a(-124, var9);
                  var4++;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              var5 = 0;
              L3: while (true) {
                if (var3 <= var5) {
                  break L0;
                } else {
                  var6 = ij.field_F[var5];
                  var6.a(6, 1, 6, 6, 0);
                  var6.b(-23443);
                  var7 = new int[]{var6.field_m - -var6.field_B >> -547659167, var6.field_e + var6.field_k >> -1483446015, var6.field_A + var6.field_b >> -1092895903};
                  gm.field_kb[var5] = var7;
                  var6.a(-var7[1], -var7[0], -var7[2], (byte) -82);
                  var5++;
                  if (var8 == 0) {
                    continue L3;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("vc.H(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final lh c(int param0) {
        lh var2 = null;
        if (param0 <= 3) {
            field_d = -51;
            var2 = this.field_c;
            if (!(var2 != this.field_e)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_a;
            return var2;
        }
        var2 = this.field_c;
        if (!(var2 != this.field_e)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final void a(boolean param0, lh param1) {
        try {
            if (null != param1.field_a) {
                param1.c(-1);
            }
            if (param0) {
                field_b = false;
            }
            param1.field_h = this.field_e;
            param1.field_a = this.field_e.field_a;
            param1.field_a.field_h = param1;
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "vc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= param0) {
                break L1;
              } else {
                var3_int = param2;
                param2 = param0;
                param0 = var3_int;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (param0 == 0) {
                    break L4;
                  } else {
                    var3_int = param2 % param0;
                    param2 = param0;
                    param0 = var3_int;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (param1 == -1) {
                  break L3;
                } else {
                  stackOut_8_0 = -66;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              stackOut_10_0 = param2;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "vc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final lh e(int param0) {
        lh var2 = null;
        var2 = this.field_e.field_h;
        if (var2 != this.field_e) {
          if (param0 != -22033) {
            return (lh) null;
          } else {
            var2.c(-1);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void f(int param0) {
        lh var2 = null;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              var2 = this.field_e.field_h;
              if (this.field_e == var2) {
                if (var3 != 0) {
                  break L2;
                } else {
                  if (var3 == 0) {
                    break L1;
                  } else {
                    var2.c(-1);
                    break L2;
                  }
                }
              } else {
                var2.c(-1);
                break L2;
              }
            }
            if (var3 == 0) {
              continue L0;
            } else {
              break L1;
            }
          }
          if (param0 != 1) {
            field_a = 42;
            this.field_c = null;
            return;
          } else {
            this.field_c = null;
            return;
          }
        }
    }

    public vc() {
        this.field_e = new lh();
        this.field_e.field_h = this.field_e;
        this.field_e.field_a = this.field_e;
    }

    final boolean a(int param0) {
        lh discarded$10 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1092895903) {
          L0: {
            discarded$10 = this.b((byte) -25);
            if (this.field_e.field_h != this.field_e) {
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
            if (this.field_e.field_h != this.field_e) {
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

    public static void d(int param0) {
        field_g = null;
        if (param0 == -29943) {
            return;
        }
        field_g = (String) null;
    }

    static {
        field_d = 0;
        field_g = "You can quickly switch between left slopes, right slopes and blocks by pressing the keys 1, 2 and 3 respectively";
    }
}
