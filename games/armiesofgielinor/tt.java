/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static int field_c;
    private at[] field_b;
    static String[] field_a;
    static wk[] field_d;

    final String[] a(int param0) {
        int var4_int = 0;
        String[] array$0 = null;
        bb var5_ref_bb = null;
        u var7_ref_u = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var7 = 0;
        int incrementValue$3 = 0;
        int var6 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param0;
        String[][] var3 = new String[this.field_b.length][];
        for (var4_int = 0; this.field_b.length > var4_int; var4_int++) {
            array$0 = new String[this.field_b[var4_int].b(false)];
            var3[var4_int] = array$0;
            var5_ref_bb = new bb(this.field_b[var4_int]);
            var6 = 0;
            var7_ref_u = (u) ((Object) var5_ref_bb.c(50));
            while (var7_ref_u != null) {
                var2++;
                incrementValue$1 = var6;
                var6++;
                var3[var4_int][incrementValue$1] = var7_ref_u.field_m.a(param0 + -124);
                var7_ref_u = (u) ((Object) var5_ref_bb.b(param0 ^ 50));
            }
        }
        String[] var4 = new String[var2 + this.field_b.length];
        int var5 = 0;
        for (var6 = 0; this.field_b.length > var6; var6++) {
            incrementValue$2 = var5;
            var5++;
            var4[incrementValue$2] = "player [" + var6 + "]";
            for (var7 = 0; var3[var6].length > var7; var7++) {
                incrementValue$3 = var5;
                var5++;
                var4[incrementValue$3] = var3[var6][var7];
            }
        }
        return var4;
    }

    final void a(byte param0) {
        int var3 = 0;
        at var4 = null;
        bb var5 = null;
        u var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        at[] var8 = this.field_b;
        at[] var2 = var8;
        for (var3 = 0; var8.length > var3; var3++) {
            var4 = var8[var3];
            var5 = new bb(var4);
            var6 = (u) ((Object) var5.c(50));
            while (var6 != null) {
                if (!(!(var6.field_m instanceof up))) {
                    var6.d(87);
                }
                var6 = (u) ((Object) var5.b(50));
            }
        }
        if (param0 < 4) {
            field_c = -58;
        }
    }

    final static int a(int param0, int param1, int[] param2, boolean param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > 9) {
                break L1;
              } else {
                if (param0 < -10) {
                  break L1;
                } else {
                  if (244 < param1) {
                    break L1;
                  } else {
                    if (244 >= param0) {
                      var4_int = 5;
                      L2: while (true) {
                        if (-1 < (var4_int ^ -1)) {
                          L3: {
                            if (!param3) {
                              break L3;
                            } else {
                              field_d = (wk[]) null;
                              break L3;
                            }
                          }
                          stackIn_24_0 = -1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L4: {
                            var5 = nd.field_d[var4_int];
                            if (bc.field_j[var5].length > param2[var5]) {
                              break L4;
                            } else {
                              param2[var5] = 0;
                              break L4;
                            }
                          }
                          L5: {
                            if (param2[var5] > -1) {
                              if (!bc.field_j[var5][param2[var5]].a(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                                break L5;
                              } else {
                                stackIn_19_0 = var5;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            } else {
                              if (lt.field_h[var5].b(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                                stackIn_16_0 = var5;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4_int--;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -2;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("tt.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              return stackIn_24_0;
            }
          }
        }
    }

    final void b(int param0, int param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var3 = new bb(this.field_b[param1]);
        if (param0 != 244) {
            return;
        }
        u var4 = (u) ((Object) var3.c(50));
        while (var4 != null) {
            if (!(!(var4.field_m instanceof up))) {
                var4.d(-115);
            }
            var4 = (u) ((Object) var3.b(50));
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
            tt.a(true);
        }
    }

    final boolean a(byte param0, int param1) {
        bb var3;
        u var4;
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = new bb(this.field_b[param1]);
        if (param0 <= -49) {
          var4 = (u) ((Object) var3.c(50));
          L0: while (true) {
            if (var4 == null) {
              return false;
            } else {
              if (!var4.field_m.c(-128)) {
                var4 = (u) ((Object) var3.b(50));
                continue L0;
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, int param1) {
        bb var3;
        u var4;
        int var5;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = new bb(this.field_b[param0]);
          var4 = (u) ((Object) var3.c(50));
          if (param1 <= -46) {
            break L0;
          } else {
            this.a(85, 104);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 == null) {
            return false;
          } else {
            if (var4.field_m.b(0)) {
              return true;
            } else {
              var4 = (u) ((Object) var3.b(50));
              continue L1;
            }
          }
        }
    }

    tt(int param0) {
        int var2 = 0;
        this.field_b = new at[param0];
        for (var2 = 0; var2 < this.field_b.length; var2++) {
            this.field_b[var2] = new at();
        }
    }

    final void a(lv param0, byte param1, int param2) {
        try {
            this.field_b[param2].a(750, new u(param0));
            if (param1 < 81) {
                field_a = (String[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tt.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
