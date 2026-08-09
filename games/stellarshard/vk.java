/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vk {
    static int field_b;
    uj[] field_a;
    static cg field_d;
    static String field_c;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, byte param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = stellarshard.field_B;
        try {
          L0: {
            L1: while (true) {
              param8--;
              if (param8 < 0) {
                L2: {
                  if (param5 >= 44) {
                    break L2;
                  } else {
                    vk.a((byte) -20);
                    break L2;
                  }
                }
                break L0;
              } else {
                var17 = param4;
                var10 = var17;
                var11 = param6;
                var12 = param7;
                var13 = param0;
                var14 = param2;
                var15 = (var17[var11] & 16711422) >> -1968481535;
                var10[var11] = var15 + ((sa.a(var13, 33423701) >> -1640011927) + (sa.a(var12, 33423361) >> 1247872321) + (sa.a(33520910, var14) >> -1728532623));
                param2 = param2 + param1;
                param7 = param7 + param9;
                param0 = param0 + param3;
                param6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("vk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final int b(int param0, int param1) {
        uj var5 = null;
        int var4 = 0;
        int var6 = stellarshard.field_B;
        uj[] var7 = this.field_a;
        uj[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_a.length <= param0)) {
                return var5.field_a[param0];
            }
            param0 = param0 - (var5.field_a.length + -1);
        }
        var4 = -13 % ((param1 - -80) / 45);
        return 0;
    }

    final int a(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 17201) {
            break L0;
          } else {
            field_d = (cg) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_a) {
              break L2;
            } else {
              if (-1 > (this.field_a.length ^ -1)) {
                stackIn_7_0 = this.field_a[this.field_a.length - 1].field_c - this.field_a[0].field_b;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(String param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = stellarshard.field_B;
        try {
          L0: {
            var5_int = 0;
            var6 = param1 ? 1 : 0;
            var7 = param0.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if (var5_int <= 0) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_15_0 = param2 - param3 << 1616124776;
                  stackIn_15_1 = var5_int;
                  stackIn_16_0 = stackIn_15_0 / stackIn_15_1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param0.charAt(var8);
                  if ((var9 ^ -1) != -61) {
                    if (62 != var9) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  } else {
                    var6 = 1;
                    break L2;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("vk.I(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        uj var4 = null;
        int var5 = stellarshard.field_B;
        if (param0 <= 47) {
            return 15;
        }
        for (var3 = 0; this.field_a.length > var3; var3++) {
            var4 = this.field_a[var3];
            if (var4.field_a.length > param1) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_a.length);
        }
        return this.field_a.length;
    }

    final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        uj var6;
        int var7;
        int var8;
        L0: {
          var8 = stellarshard.field_B;
          if (null == this.field_a) {
            break L0;
          } else {
            if (-1 == (this.field_a.length ^ -1)) {
              break L0;
            } else {
              if (this.field_a[0].field_b > param2) {
                break L0;
              } else {
                if (param2 <= this.field_a[this.field_a.length + -1].field_c) {
                  if (-2 == (this.field_a.length ^ -1)) {
                    return this.field_a[0].a(param0, (byte) -127);
                  } else {
                    var4 = 0;
                    if (param1 == -53) {
                      var5 = 0;
                      L1: while (true) {
                        if (var5 >= this.field_a.length) {
                          return -1;
                        } else {
                          L2: {
                            var6 = this.field_a[var5];
                            if (var6.field_b > param2) {
                              break L2;
                            } else {
                              if (param2 <= var6.field_c) {
                                var7 = var6.a(param0, (byte) -125);
                                if (-1 == var7) {
                                  return -1;
                                } else {
                                  return var4 - -var7;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          var4 = var4 + (var6.field_a.length + -1);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -68;
                    }
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    final int a(boolean param0) {
        int var2;
        uj[] var3;
        int var4;
        uj var5;
        int var7;
        int[] var8;
        int var6;
        L0: {
          var7 = stellarshard.field_B;
          if (!param0) {
            break L0;
          } else {
            var8 = (int[]) null;
            vk.a(67, 4, 37, 82, (int[]) null, (byte) 83, 103, -77, 12, -12);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null != this.field_a) {
            var3 = this.field_a;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(83);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final static void a(byte param0, boolean param1) {
        al.field_f.a(param1, true);
        int var2 = 101 % ((param0 - -86) / 33);
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        nf var4 = null;
        hk var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = stellarshard.field_B;
        try {
          L0: {
            var4 = (nf) ((Object) wb.field_f.b(-77));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 < -104) {
                    break L2;
                  } else {
                    vk.a((byte) -101, false);
                    break L2;
                  }
                }
                var5 = (hk) ((Object) id.field_g.b(-91));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    pd.a(param1, var5, 77);
                    var5 = (hk) ((Object) id.field_g.b((byte) -121));
                    continue L3;
                  }
                }
              } else {
                ea.a(param1, var4, (byte) 80);
                var4 = (nf) ((Object) wb.field_f.b((byte) 120));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "vk.G(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 < 103) {
            vk.a((byte) 93);
        }
    }

    static {
        field_b = -1;
        field_d = new cg();
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
