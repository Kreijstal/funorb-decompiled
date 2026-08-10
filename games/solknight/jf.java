/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    le[] field_c;
    static bc field_a;
    static String field_b;

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
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
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 21107) {
                break L1;
              } else {
                var11 = (String) null;
                this.a(-66, 103, -92, (String) null);
                break L1;
              }
            }
            var5_int = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L2: while (true) {
              if (var7 <= var8) {
                if (0 >= var5_int) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_19_0 = (-param0 + param1 << 439492808) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param3.charAt(var8);
                  if ((var9 ^ -1) != -61) {
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
                        continue L2;
                      }
                    }
                  } else {
                    var6 = 1;
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("jf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        le var6;
        int var7;
        int var8;
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          if (this.field_c == null) {
            break L0;
          } else {
            if (0 == this.field_c.length) {
              break L0;
            } else {
              if (param1 < this.field_c[0].field_g) {
                break L0;
              } else {
                if (param1 <= this.field_c[this.field_c.length - 1].field_e) {
                  if (1 != this.field_c.length) {
                    if (param0 == -2592) {
                      var4 = 0;
                      var5 = 0;
                      L1: while (true) {
                        if (var5 >= this.field_c.length) {
                          return -1;
                        } else {
                          L2: {
                            var6 = this.field_c[var5];
                            if (var6.field_g > param1) {
                              break L2;
                            } else {
                              if (var6.field_e >= param1) {
                                var7 = var6.a(param2, false);
                                if (var7 != -1) {
                                  return var7 + var4;
                                } else {
                                  return -1;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          var4 = var4 + (var6.field_c.length - 1);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -51;
                    }
                  } else {
                    return this.field_c[0].a(param2, false);
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

    final int a(int param0, int param1) {
        int var4 = 0;
        le var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        le[] var7 = this.field_c;
        le[] var3 = var7;
        for (var4 = param0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(var5.field_c.length <= param1)) {
                return var5.field_c[param1];
            }
            param1 = param1 - (var5.field_c.length - 1);
        }
        return 0;
    }

    final int b(int param0) {
        int var2;
        le[] var3;
        int var4;
        le var5;
        int var7;
        int var6;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          var2 = -1;
          if (null == this.field_c) {
            break L0;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) 110);
                  if (var2 < var6) {
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
          }
        }
        L2: {
          if (param0 == 62) {
            break L2;
          } else {
            this.a((byte) 22);
            break L2;
          }
        }
        return var2;
    }

    final int a(byte param0) {
        int var2;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var2 = 5 % ((60 - param0) / 43);
            if (this.field_c == null) {
              break L1;
            } else {
              if (this.field_c.length > 0) {
                stackIn_5_0 = -this.field_c[0].field_g + this.field_c[this.field_c.length + -1].field_e;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_5_0 = 0;
          break L0;
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -25616) {
            field_b = (String) null;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        le var4 = null;
        int var5 = SolKnight.field_L ? 1 : 0;
        for (var3 = 0; this.field_c.length > var3; var3++) {
            var4 = this.field_c[var3];
            if ((var4.field_c.length ^ -1) < (param1 ^ -1)) {
                return var3;
            }
            param1 = param1 - (var4.field_c.length - 1);
        }
        if (param0 > -87) {
            field_b = (String) null;
        }
        return this.field_c.length;
    }

    static {
    }
}
