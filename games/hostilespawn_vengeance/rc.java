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
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (0 == param4) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 == 17112) {
                param4 = param4 + param0;
                var7_int = 0;
                var8 = param2;
                L1: while (true) {
                  L2: {
                    var9 = param1[var8];
                    if ((var9 ^ -1) <= -1) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = this.field_f[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      dupTemp$0 = this.field_f[var7_int];
                      var10 = dupTemp$0;
                      if (dupTemp$0 >= 0) {
                        break L4;
                      } else {
                        incrementValue$1 = param0;
                        param0++;
                        param5[incrementValue$1] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_f[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      dupTemp$2 = this.field_f[var7_int];
                      var10 = dupTemp$2;
                      if (dupTemp$2 >= 0) {
                        break L6;
                      } else {
                        incrementValue$3 = param0;
                        param0++;
                        param5[incrementValue$3] = (byte)(var10 ^ -1);
                        if (param4 <= param0) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (-1 == (32 & var9 ^ -1)) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = this.field_f[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      dupTemp$4 = this.field_f[var7_int];
                      var10 = dupTemp$4;
                      if (0 > dupTemp$4) {
                        incrementValue$5 = param0;
                        param0++;
                        param5[incrementValue$5] = (byte)(var10 ^ -1);
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
                      if (-1 != (16 & var9 ^ -1)) {
                        var7_int = this.field_f[var7_int];
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    }
                    L10: {
                      dupTemp$6 = this.field_f[var7_int];
                      var10 = dupTemp$6;
                      if (dupTemp$6 < 0) {
                        incrementValue$7 = param0;
                        param0++;
                        param5[incrementValue$7] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_f[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      dupTemp$8 = this.field_f[var7_int];
                      var10 = dupTemp$8;
                      if (dupTemp$8 < 0) {
                        incrementValue$9 = param0;
                        param0++;
                        param5[incrementValue$9] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_f[var7_int];
                        break L13;
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      dupTemp$10 = this.field_f[var7_int];
                      var10 = dupTemp$10;
                      if (-1 >= (dupTemp$10 ^ -1)) {
                        break L14;
                      } else {
                        incrementValue$11 = param0;
                        param0++;
                        param5[incrementValue$11] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_f[var7_int];
                        break L15;
                      }
                    }
                    L16: {
                      dupTemp$12 = this.field_f[var7_int];
                      var10 = dupTemp$12;
                      if (dupTemp$12 < 0) {
                        incrementValue$13 = param0;
                        param0++;
                        param5[incrementValue$13] = (byte)(var10 ^ -1);
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
                        var7_int = this.field_f[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    dupTemp$14 = this.field_f[var7_int];
                    var10 = dupTemp$14;
                    if (0 <= dupTemp$14) {
                      var8++;
                      continue L1;
                    } else {
                      incrementValue$15 = param0;
                      param0++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param4 > param0) {
                        var7_int = 0;
                        var8++;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_66_0 = 1 + var8 + -param2;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = -39;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("rc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L18;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L19;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L19;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_66_0;
          }
        }
    }

    final static void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        uj var3_ref_uj = null;
        m var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        en var9 = null;
        byte[] var13 = null;
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
                  var3 = var9.d(param0 ^ 8193);
                  var4 = (m) ((Object) wk.field_g.g(-90));
                  L2: while (true) {
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if ((var3 ^ -1) == (var4.field_o ^ -1)) {
                          break L3;
                        } else {
                          var4 = (m) ((Object) wk.field_g.a(12684));
                          continue L2;
                        }
                      }
                    }
                    if (var4 == null) {
                      le.c((byte) 60);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4.b(-80);
                      break L1;
                    }
                  }
                }
              } else {
                var3_ref_uj = (uj) ((Object) ve.field_b.g(param0 ^ -65));
                if (var3_ref_uj == null) {
                  le.c((byte) 51);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    var4_int = var9.l(32270);
                    if (-1 == (var4_int ^ -1)) {
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
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_ref_uj.field_j = true;
                    var3_ref_uj.b(120);
                    break L1;
                  }
                }
              }
            }
            if (param0 == 2) {
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              field_e = -123;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "rc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_e = 0;
        field_b = 0;
        field_c = null;
    }
}
