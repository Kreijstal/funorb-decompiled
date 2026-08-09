/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ep {
    static int[] field_f;
    static int field_k;
    ml[] field_c;
    static volatile int field_g;
    static String field_e;
    static int field_i;
    static jp field_j;
    static jp field_h;
    static float field_a;
    static String field_d;
    static jp field_b;

    final int a(int param0, boolean param1) {
        int var3 = 0;
        ml var4 = null;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!param1) {
            ep.a(false);
        }
        for (var3 = 0; this.field_c.length > var3; var3++) {
            var4 = this.field_c[var3];
            if (!(var4.field_g.length <= param0)) {
                return var3;
            }
            param0 = param0 - (var4.field_g.length - 1);
        }
        return this.field_c.length;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.a(-90, true, 49);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_c) {
              break L2;
            } else {
              if (this.field_c.length <= 0) {
                break L2;
              } else {
                stackIn_6_0 = -this.field_c[0].field_d + this.field_c[this.field_c.length - 1].field_a;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        ml var5 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (param1 >= -33) {
            return -38;
        }
        ml[] var7 = this.field_c;
        ml[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5.field_g.length > param0) {
                return var5.field_g[param0];
            }
            param0 = param0 - (var5.field_g.length + -1);
        }
        return 0;
    }

    final int a(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        ml var6;
        int var7;
        int var8;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          if (this.field_c == null) {
            break L0;
          } else {
            if (0 == this.field_c.length) {
              break L0;
            } else {
              if (this.field_c[0].field_d > param2) {
                break L0;
              } else {
                if (this.field_c[-1 + this.field_c.length].field_a >= param2) {
                  if ((this.field_c.length ^ -1) != -2) {
                    L1: {
                      if (!param1) {
                        break L1;
                      } else {
                        field_d = (String) null;
                        break L1;
                      }
                    }
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= this.field_c.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_c[var5];
                          if (param2 < var6.field_d) {
                            break L3;
                          } else {
                            if (var6.field_a >= param2) {
                              var7 = var6.a((byte) -95, param0);
                              if (0 == (var7 ^ -1)) {
                                return -1;
                              } else {
                                return var7 + var4;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_g.length);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return this.field_c[0].a((byte) -95, param0);
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

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            field_b = (jp) null;
        }
        field_b = null;
        field_e = null;
        field_h = null;
        field_j = null;
        field_d = null;
    }

    final int b(int param0) {
        int var2;
        ml[] var3;
        int var4;
        ml var5;
        int var7;
        int var6;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 31458) {
          L0: {
            var2 = -1;
            if (null != this.field_c) {
              var3 = this.field_c;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.b((byte) 56);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return 12;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = wj.a(-1, param2, '_', "");
              if (param1 == 73) {
                break L1;
              } else {
                ep.a(true);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = w.a(10, param2);
                if (0 != (param0.indexOf(param2) ^ -1)) {
                  break L3;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("ep.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final int a(int param0, int param1, String param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                L2: {
                  if (param3) {
                    break L2;
                  } else {
                    field_k = 66;
                    break L2;
                  }
                }
                if (var5_int <= 0) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_19_0 = (param0 - param1 << -1617102104) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param2.charAt(var8);
                  if (60 == var9) {
                    var6 = 1;
                    break L3;
                  } else {
                    if (var9 == 62) {
                      var6 = 0;
                      break L3;
                    } else {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("ep.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    static {
        field_f = new int[8192];
        field_g = -1;
        field_d = "Logging in...";
    }
}
