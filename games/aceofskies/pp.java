/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pp {
    static int field_a;
    co[] field_b;

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        co var6 = null;
        int var7 = 0;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_b == null || 0 == this.field_b.length || param2 < this.field_b[0].field_f) {
            return -1;
        }
        if (!(this.field_b[-1 + this.field_b.length].field_d >= param2)) {
            return -1;
        }
        if (!(1 != this.field_b.length)) {
            return this.field_b[0].a(true, param0);
        }
        int var4 = 0;
        if (param1 < 34) {
            this.a(103);
        }
        for (var5 = 0; this.field_b.length > var5; var5++) {
            var6 = this.field_b[var5];
            if (param2 >= var6.field_f) {
                if (!(var6.field_d < param2)) {
                    var7 = var6.a(true, param0);
                    if (-1 == var7) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (var6.field_h.length + -1);
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        co var4 = null;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 1) {
            return 124;
        }
        for (var3 = 0; var3 < this.field_b.length; var3++) {
            var4 = this.field_b[var3];
            if (!(var4.field_h.length <= param1)) {
                return var3;
            }
            param1 = param1 - (var4.field_h.length - 1);
        }
        return this.field_b.length;
    }

    final int b(int param0, int param1) {
        co var5 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        co[] var7 = this.field_b;
        co[] var3 = var7;
        int var4 = 0;
        if (param1 >= -101) {
            return 7;
        }
        while (var4 < var7.length) {
            var5 = var7[var4];
            if (param0 < var5.field_h.length) {
                return var5.field_h[param0];
            }
            param0 = param0 - (var5.field_h.length - 1);
            var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if ((var5_int ^ -1) < param1) {
                  stackIn_18_0 = (-param3 + param0 << -1233796248) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param2.charAt(var8);
                  if ((var9 ^ -1) == -61) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (var9 != 62) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var6 = 0;
                      break L2;
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
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("pp.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return stackIn_20_0;
        }
    }

    final static void a(String[] args, int param1, String param2, int param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 == 26326) {
              L1: {
                ht.field_k = uk.field_j;
                if (-256 == (param1 ^ -1)) {
                  L2: {
                    stackIn_11_0 = 111;

                    if (-14 >= (sd.field_h ^ -1)) {
                      stackIn_12_0 = stackIn_11_0;
                      stackIn_12_1 = 0;
                      break L2;
                    } else {
                      stackIn_12_0 = stackIn_11_0;
                      stackIn_12_1 = 1;
                      break L2;
                    }
                  }
                  ld.field_c = in.a((byte) stackIn_12_0, stackIn_12_1 != 0);
                  break L1;
                } else {
                  L3: {
                    if ((param1 ^ -1) > -101) {
                      break L3;
                    } else {
                      if (param1 <= 105) {
                        ld.field_c = oq.a((byte) -63, args);
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ld.field_c = dq.a(param1, 32, param2);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("pp.I(");

            if (args == null) {
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
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(byte param0) {
        int var2;
        co[] var3;
        int var4;
        co var5;
        int var7;
        String var8;
        int var6;
        L0: {
          var7 = AceOfSkies.field_G ? 1 : 0;
          var2 = -1;
          if (param0 == 24) {
            break L0;
          } else {
            var8 = (String) null;
            pp.a((String[]) null, -43, (String) null, -67);
            break L0;
          }
        }
        L1: {
          if (null == this.field_b) {
            break L1;
          } else {
            var3 = this.field_b;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(true);
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
          }
        }
        return var2;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.a((byte) 95);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_b == null) {
              break L2;
            } else {
              if (-1 <= (this.field_b.length ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = this.field_b[-1 + this.field_b.length].field_d + -this.field_b[0].field_f;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    static {
    }
}
