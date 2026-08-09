/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uj {
    static ei field_a;
    static o[] field_b;
    kp[] field_c;

    final static void a(String param0, int param1, String param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (gn.field_m == null) {
                break L1;
              } else {
                gn.field_m.b(true);
                break L1;
              }
            }
            L2: {
              un.field_k = new pe(param2, param0, false, true, true);
              hb.field_x.c(un.field_k, param1 + 32115);
              if (param1 == -32082) {
                break L2;
              } else {
                uj.a((byte) 16);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("uj.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        kp var5 = null;
        int var6 = Torquing.field_u;
        kp[] var7 = this.field_c;
        kp[] var3 = var7;
        if (param1 > -104) {
            return 123;
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(param0 >= var5.field_b.length)) {
                return var5.field_b[param0];
            }
            param0 = param0 - (var5.field_b.length - 1);
        }
        return 0;
    }

    final int b(int param0, byte param1) {
        kp var4 = null;
        int var5 = Torquing.field_u;
        int var3 = 0;
        if (param1 != 110) {
            return 110;
        }
        while (this.field_c.length > var3) {
            var4 = this.field_c[var3];
            if (param0 < var4.field_b.length) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_b.length);
            var3++;
        }
        return this.field_c.length;
    }

    final static int a(da param0, byte param1, da param2) {
        RuntimeException var3 = null;
        da var4 = null;
        String var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 75) {
                break L1;
              } else {
                var4 = (da) null;
                uj.a((da) null, (byte) 17, (da) null);
                break L1;
              }
            }
            var5 = (String) null;
            stackIn_3_0 = na.a(param2, (String) null, -25978, param0, 0, false, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("uj.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final int b(boolean param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.field_c = (kp[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_c == null) {
              break L2;
            } else {
              if (-1 <= (this.field_c.length ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = -this.field_c[0].field_c + this.field_c[-1 + this.field_c.length].field_a;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1, String param2, int param3) {
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
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 < -107) {
                break L1;
              } else {
                field_b = (o[]) null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                if ((var5_int ^ -1) >= -1) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_19_0 = (-param1 + param3 << 1003063048) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param2.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L3;
                  } else {
                    if (62 != var9) {
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
                    } else {
                      var6 = 0;
                      break L3;
                    }
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

            stackIn_24_1 = new StringBuilder().append("uj.D(").append(param0).append(',').append(param1).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    final int a(boolean param0) {
        int var2;
        kp[] var3;
        int var4;
        kp var5;
        int var7;
        int var6;
        L0: {
          var7 = Torquing.field_u;
          if (param0) {
            break L0;
          } else {
            field_a = (ei) null;
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (this.field_c == null) {
            break L1;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) 115);
                  if (var6 > var2) {
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

    final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        kp var6;
        int var7;
        int var8;
        L0: {
          var8 = Torquing.field_u;
          if (this.field_c == null) {
            break L0;
          } else {
            if (0 == this.field_c.length) {
              break L0;
            } else {
              if (this.field_c[0].field_c > param0) {
                break L0;
              } else {
                if (this.field_c[-1 + this.field_c.length].field_a < param0) {
                  return -1;
                } else {
                  if ((this.field_c.length ^ -1) == -2) {
                    return this.field_c[0].a((byte) -64, param2);
                  } else {
                    L1: {
                      var4 = 0;
                      if (param1 <= -14) {
                        break L1;
                      } else {
                        this.a(-4, (byte) 109);
                        break L1;
                      }
                    }
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= this.field_c.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_c[var5];
                          if (var6.field_c > param0) {
                            break L3;
                          } else {
                            if (var6.field_a >= param0) {
                              var7 = var6.a((byte) -64, param2);
                              if ((var7 ^ -1) != 0) {
                                return var4 - -var7;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_b.length - 1);
                        var5++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    public static void a(byte param0) {
        if (param0 != -54) {
            uj.a((byte) -113);
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new ei();
    }
}
