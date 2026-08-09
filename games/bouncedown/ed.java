/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ed {
    static ec field_c;
    static int field_b;
    static int field_d;
    bh[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 19599) {
            field_d = 21;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        bh var5 = null;
        int var6 = Bounce.field_N;
        bh[] var7 = this.field_a;
        bh[] var3 = var7;
        if (param1 <= 69) {
            ed.a((byte) 121);
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_a.length > param0) {
                return var5.field_a[param0];
            }
            param0 = param0 - (var5.field_a.length - 1);
        }
        return 0;
    }

    final static tg[] a(int param0, int param1, int param2, int param3) {
        if (param2 <= 60) {
            ed.a(7);
        }
        return kg.a(param1, 1, param3, -2147483648, param0);
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        int var5 = Bounce.field_N;
        for (var3 = param1; this.field_a.length > var3; var3++) {
            var4 = this.field_a[var3];
            if (!(var4.field_a.length <= param0)) {
                return var3;
            }
            param0 = param0 - (var4.field_a.length - 1);
        }
        return this.field_a.length;
    }

    final int b(int param0) {
        int var2;
        bh[] var3;
        int var4;
        bh var5;
        int var7;
        int var6;
        var7 = Bounce.field_N;
        var2 = -1;
        if (param0 > 73) {
          L0: {
            if (this.field_a != null) {
              var3 = this.field_a;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a((byte) -62);
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
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return 107;
        }
    }

    final static void a(byte param0) {
        il.a(6);
        if (param0 != -127) {
            field_b = -84;
        }
    }

    final int b(byte param0) {
        int var2;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var2 = -59 % ((param0 - -51) / 35);
            if (this.field_a == null) {
              break L1;
            } else {
              if (this.field_a.length > 0) {
                stackIn_5_0 = -this.field_a[0].field_f + this.field_a[this.field_a.length + -1].field_b;
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

    private final static lb[] a(int param0, si param1) {
        lb[] stackIn_3_0 = null;
        lb[] stackIn_10_0 = null;
        lb[] stackIn_13_0 = null;
        lb[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        lb[] var4 = null;
        int var5 = 0;
        lb var6 = null;
        int var7 = 0;
        mk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            if (param1.a((byte) 53)) {
              var8 = param1.c((byte) 5);
              L1: while (true) {
                if (var8.field_f != 0) {
                  if ((var8.field_f ^ -1) == -3) {
                    stackIn_10_0 = new lb[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var10 = (int[]) (var8.field_e);
                    var9 = var10;
                    var3 = var9;
                    if (param0 == 10) {
                      var4 = new lb[var10.length >> -1679031710];
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          stackIn_18_0 = (lb[]) (var4);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var6 = new lb();
                          var4[var5] = var6;
                          var6.field_d = var3[var5 << 508978434];
                          var6.field_e = var3[1 + (var5 << -494393854)];
                          var6.field_a = var3[(var5 << -1549120510) - -2];
                          var6.field_f = var3[(var5 << -1084009118) - -3];
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_13_0 = (lb[]) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  wh.a(10L, param0 + 19396);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = new lb[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("ed.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    final static java.awt.Frame a(int param0, si param1, int param2, int param3, int param4, int param5) {
        Object stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lb[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        lb[] var10 = null;
        mk var11 = null;
        var9 = Bounce.field_N;
        try {
          L0: {
            if (param1.a((byte) 53)) {
              L1: {
                if (param2 == 0) {
                  var10 = ed.a(10, param1);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_26_0 = null;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        if (param4 == var10[var8].field_d) {
                          if (var10[var8].field_e == param5) {
                            L3: {
                              L4: {
                                if (param3 == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_f == param3) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_a > param2) {
                                    break L5;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              param2 = var10[var8].field_a;
                              var7_int = 1;
                              break L3;
                            }
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param1.a(param2, param4, param3, param5, 314572800);
              L6: while (true) {
                if (0 != var11.field_f) {
                  var7 = (java.awt.Frame) (var11.field_e);
                  if (var7 != null) {
                    if (var11.field_f != 2) {
                      L7: {
                        if (param0 == 4147) {
                          break L7;
                        } else {
                          field_c = (ec) null;
                          break L7;
                        }
                      }
                      stackIn_39_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      ib.a(param1, var7, (byte) 115);
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_32_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  wh.a(10L, 19406);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var6_ref);

            stackIn_42_1 = new StringBuilder().append("ed.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L8;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L8;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_26_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_32_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_35_0);
            } else {
              return stackIn_39_0;
            }
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        bh var6 = null;
        int var7 = 0;
        int var8 = Bounce.field_N;
        if (null == this.field_a || 0 == this.field_a.length || this.field_a[0].field_f > param2) {
            return -1;
        }
        if (!(param2 <= this.field_a[this.field_a.length - 1].field_b)) {
            return -1;
        }
        if (!(-2 != (this.field_a.length ^ -1))) {
            return this.field_a[0].a(param0, (byte) 110);
        }
        if (param1 >= -92) {
            ed.a(-47, (byte) 83, -109);
        }
        int var4 = 0;
        for (var5 = 0; this.field_a.length > var5; var5++) {
            var6 = this.field_a[var5];
            if (param2 >= var6.field_f && param2 <= var6.field_b) {
                var7 = var6.a(param0, (byte) 91);
                if ((var7 ^ -1) == 0) {
                    return -1;
                }
                return var4 + var7;
            }
            var4 = var4 + (-1 + var6.field_a.length);
        }
        return -1;
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ja.field_c.length) {
                L2: {
                  if (param2 < -45) {
                    break L2;
                  } else {
                    ed.a(85, -86, -63, -63);
                    break L2;
                  }
                }
                break L0;
              } else {
                param3 = ja.field_c[var5_int];
                var6 = var5_int << -1850038044;
                L3: while (true) {
                  incrementValue$4 = param3;
                  param3--;
                  if (incrementValue$4 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$5 = var6;
                    var6++;
                    param1 = lb.field_c[incrementValue$5];
                    dupTemp$6 = param4[param1];
                    dupTemp$7 = param0[dupTemp$6];
                    param0[dupTemp$6] = dupTemp$7 + 1;
                    lb.field_c[dupTemp$7] = param1;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ed.G(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            if (param1 < -50) {
              L1: {
                if (param0 < param2) {
                  var3_int = param0;
                  param0 = param2;
                  param2 = var3_int;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: while (true) {
                if (0 == param2) {
                  stackIn_10_0 = param0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = param0 % param2;
                  param0 = param2;
                  param2 = var3_int;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 106;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "ed.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final int a(int param0, int param1, int param2, String param3) {
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
        var10 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              if (param2 < -122) {
                break L1;
              } else {
                field_b = 40;
                break L1;
              }
            }
            L2: while (true) {
              if (var7 <= var8) {
                if ((var5_int ^ -1) < -1) {
                  stackIn_19_0 = (-param0 + param1 << 1568978088) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param3.charAt(var8);
                  if (-61 == (var9 ^ -1)) {
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
                          var8++;
                          continue L2;
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
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

            stackIn_24_1 = new StringBuilder().append("ed.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw ii.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    static {
    }
}
