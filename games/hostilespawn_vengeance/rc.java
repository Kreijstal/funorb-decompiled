/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static int field_d;
    private int[] field_f;
    static int field_e;
    static b field_c;
    static ub field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 != 8281) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    private rc() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (0 == param4) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param3 == 17112) {
                param4 = param4 + param0;
                var7_int = 0;
                var8 = param2;
                L1: while (true) {
                  L2: {
                    var9 = param1[var8];
                    if (var9 >= 0) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = ((rc) this).field_f[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = ((rc) this).field_f[var7_int];
                      if (((rc) this).field_f[var7_int] >= 0) {
                        break L4;
                      } else {
                        int incrementValue$8 = param0;
                        param0++;
                        param5[incrementValue$8] = (byte)(~var10);
                        if (param4 <= param0) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if ((64 & var9) == 0) {
                        var7_int++;
                        break L5;
                      } else {
                        var7_int = ((rc) this).field_f[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      var10 = ((rc) this).field_f[var7_int];
                      if (((rc) this).field_f[var7_int] >= 0) {
                        break L6;
                      } else {
                        int incrementValue$9 = param0;
                        param0++;
                        param5[incrementValue$9] = (byte)var10;
                        if (param4 <= param0) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (-1 == (32 & var9)) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = ((rc) this).field_f[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      var10 = ((rc) this).field_f[var7_int];
                      if (0 > ((rc) this).field_f[var7_int]) {
                        int incrementValue$10 = param0;
                        param0++;
                        param5[incrementValue$10] = (byte)var10;
                        if (param0 < param4) {
                          var7_int = 0;
                          break L8;
                        } else {
                          break L3;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (-1 != (16 & var9)) {
                        var7_int = ((rc) this).field_f[var7_int];
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    }
                    L10: {
                      var10 = ((rc) this).field_f[var7_int];
                      if (((rc) this).field_f[var7_int] < 0) {
                        int incrementValue$11 = param0;
                        param0++;
                        param5[incrementValue$11] = (byte)(~var10);
                        if (param0 >= param4) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((8 & var9) != 0) {
                        var7_int = ((rc) this).field_f[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      var10 = ((rc) this).field_f[var7_int];
                      if (((rc) this).field_f[var7_int] < 0) {
                        int incrementValue$12 = param0;
                        param0++;
                        param5[incrementValue$12] = (byte)(~var10);
                        if (param0 < param4) {
                          var7_int = 0;
                          break L12;
                        } else {
                          return 1 + var8 + -param2;
                        }
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if ((4 & var9) != 0) {
                        var7_int = ((rc) this).field_f[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = ((rc) this).field_f[var7_int];
                      if (((rc) this).field_f[var7_int] >= 0) {
                        break L14;
                      } else {
                        int incrementValue$13 = param0;
                        param0++;
                        param5[incrementValue$13] = (byte)(~var10);
                        if (param0 >= param4) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if ((2 & var9) == 0) {
                        var7_int++;
                        break L15;
                      } else {
                        var7_int = ((rc) this).field_f[var7_int];
                        break L15;
                      }
                    }
                    L16: {
                      var10 = ((rc) this).field_f[var7_int];
                      if (((rc) this).field_f[var7_int] < 0) {
                        int incrementValue$14 = param0;
                        param0++;
                        param5[incrementValue$14] = (byte)(~var10);
                        if (param0 >= param4) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (0 != (1 & var9)) {
                        var7_int = ((rc) this).field_f[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    var10 = ((rc) this).field_f[var7_int];
                    if (0 <= ((rc) this).field_f[var7_int]) {
                      var8++;
                      continue L1;
                    } else {
                      int incrementValue$15 = param0;
                      param0++;
                      param5[incrementValue$15] = (byte)(~var10);
                      if (param4 > param0) {
                        var7_int = 0;
                        var8++;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_65_0 = 1 + var8 + -param2;
                  stackIn_66_0 = stackOut_65_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = -39;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("rc.C(").append(param0).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L18;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L18;
            }
          }
          L19: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L19;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L19;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 41);
        }
        return stackIn_66_0;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        uj var3_ref_uj = null;
        int var3 = 0;
        m var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        en var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = sc.field_g;
              var2 = var9.l(32270);
              if (var2 != 0) {
                if (var2 != 1) {
                  ic.a((byte) -119, "A1: " + gf.a((byte) -122), (Throwable) null);
                  le.c((byte) 117);
                  break L1;
                } else {
                  var3 = var9.d(8195);
                  var4 = (m) (Object) wk.field_g.g(-90);
                  L2: while (true) {
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (var3 == var4.field_o) {
                          break L3;
                        } else {
                          var4 = (m) (Object) wk.field_g.a(12684);
                          continue L2;
                        }
                      }
                    }
                    if (var4 == null) {
                      le.c((byte) 60);
                      return;
                    } else {
                      var4.b(-80);
                      break L1;
                    }
                  }
                }
              } else {
                var3_ref_uj = (uj) (Object) ve.field_b.g(-67);
                if (var3_ref_uj == null) {
                  le.c((byte) 51);
                  return;
                } else {
                  L4: {
                    var4_int = var9.l(32270);
                    if (var4_int == 0) {
                      var5 = null;
                      break L4;
                    } else {
                      var13 = new byte[var4_int];
                      var9.a(var4_int, 0, var13, -18181);
                      break L4;
                    }
                  }
                  var9.field_i = var9.field_i + 4;
                  if (!var9.c((byte) -4)) {
                    le.c((byte) 119);
                    return;
                  } else {
                    var3_ref_uj.field_j = true;
                    var3_ref_uj.b(120);
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "rc.B(" + 2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_b = 0;
        field_c = null;
    }
}
