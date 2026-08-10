/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private uh field_e;
    static boolean field_b;
    private oa field_l;
    private pj field_f;
    static int field_h;
    private java.math.BigInteger field_g;
    private be[] field_d;
    private java.math.BigInteger field_j;
    static int[] field_k;
    private cd field_c;
    static int field_i;
    static String field_a;

    dk(uh param0, cd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static kk a(String param0, long param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        ac stackIn_5_0 = null;
        bd stackIn_9_0 = null;
        wj stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 >= 7) {
                break L1;
              } else {
                dk.a((byte) 119);
                break L1;
              }
            }
            L2: {
              if (-1L != (param1 ^ -1L)) {
                break L2;
              } else {
                if (param0 == null) {
                  break L2;
                } else {
                  stackIn_5_0 = new ac(param0, param3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param2) {
              stackIn_9_0 = new bd(param1, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_11_0 = new wj(param1, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("dk.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kk) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (kk) ((Object) stackIn_9_0);
          } else {
            return (kk) ((Object) stackIn_11_0);
          }
        }
    }

    final static void a(int param0, ti[] param1, int param2, int param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if ((param5 ^ -1) >= -1) {
                  break L1;
                } else {
                  if ((param0 ^ -1) >= -1) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param1[3]) {
                        stackIn_10_0 = 0;
                        break L2;
                      } else {
                        stackIn_10_0 = param1[3].field_r;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null != param1[5]) {
                        stackIn_13_0 = param1[5].field_r;
                        break L3;
                      } else {
                        stackIn_13_0 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null == param1[1]) {
                        stackIn_16_0 = 0;
                        break L4;
                      } else {
                        stackIn_16_0 = param1[1].field_s;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (null == param1[7]) {
                        stackIn_19_0 = 0;
                        break L5;
                      } else {
                        stackIn_19_0 = param1[7].field_s;
                        break L5;
                      }
                    }
                    var9 = stackIn_19_0;
                    var10 = param5 + param3;
                    if (param2 == -28018) {
                      L6: {
                        var11 = param4 + param0;
                        var12 = var6_int + param3;
                        var13 = var10 - var7;
                        var14 = param4 - -var8;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if (var16 > var17) {
                          var17 = param5 * var6_int / (var6_int + var7) + param3;
                          var16 = param5 * var6_int / (var6_int + var7) + param3;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        sb.a(cc.field_d);
                        if (var19 >= var18) {
                          break L7;
                        } else {
                          var19 = param4 - -(param0 * var8 / (var8 - -var9));
                          var18 = param4 - -(param0 * var8 / (var8 - -var9));
                          break L7;
                        }
                      }
                      L8: {
                        if (param1[0] != null) {
                          sb.g(param3, param4, var16, var18);
                          param1[0].c(param3, param4);
                          sb.b(cc.field_d);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (null != param1[2]) {
                          sb.g(var17, param4, var10, var18);
                          param1[2].c(var13, param4);
                          sb.b(cc.field_d);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (null != param1[6]) {
                          sb.g(param3, var19, var16, var11);
                          param1[6].c(param3, var15);
                          sb.b(cc.field_d);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (null != param1[8]) {
                          sb.g(var17, var19, var10, var11);
                          param1[8].c(var13, var15);
                          sb.b(cc.field_d);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (param1[1] == null) {
                          break L12;
                        } else {
                          if (-1 == (param1[1].field_r ^ -1)) {
                            break L12;
                          } else {
                            sb.g(var16, param4, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var20 >= var13) {
                                sb.b(cc.field_d);
                                break L12;
                              } else {
                                param1[1].c(var20, param4);
                                var20 = var20 + param1[1].field_r;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (param1[7] == null) {
                          break L14;
                        } else {
                          if (-1 == (param1[7].field_r ^ -1)) {
                            break L14;
                          } else {
                            sb.g(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var13 <= var20) {
                                sb.b(cc.field_d);
                                break L14;
                              } else {
                                param1[7].c(var20, var15);
                                var20 = var20 + param1[7].field_r;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (null == param1[3]) {
                          break L16;
                        } else {
                          if (-1 == (param1[3].field_s ^ -1)) {
                            break L16;
                          } else {
                            sb.g(param3, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var15 <= var20) {
                                sb.b(cc.field_d);
                                break L16;
                              } else {
                                param1[3].c(param3, var20);
                                var20 = var20 + param1[3].field_s;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (null == param1[5]) {
                          break L18;
                        } else {
                          if (0 == param1[5].field_s) {
                            break L18;
                          } else {
                            sb.g(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var20 >= var15) {
                                sb.b(cc.field_d);
                                break L18;
                              } else {
                                param1[5].c(var13, var20);
                                var20 = var20 + param1[5].field_s;
                                continue L19;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (null == param1[4]) {
                          break L20;
                        } else {
                          if (param1[4].field_r == 0) {
                            break L20;
                          } else {
                            if (-1 == (param1[4].field_s ^ -1)) {
                              break L20;
                            } else {
                              sb.g(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var20 >= var15) {
                                  sb.b(cc.field_d);
                                  break L20;
                                } else {
                                  var21 = var12;
                                  L22: while (true) {
                                    if (var13 <= var21) {
                                      var20 = var20 + param1[4].field_s;
                                      continue L21;
                                    } else {
                                      param1[4].c(var21, var20);
                                      var21 = var21 + param1[4].field_r;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
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
          L23: {
            var6 = decompiledCaughtException;
            stackIn_75_0 = (RuntimeException) (var6);

            stackIn_75_1 = new StringBuilder().append("dk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L23;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L23;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final be a(int param0, boolean param1, int param2, ak param3, ak param4) {
        be stackIn_9_0 = null;
        be stackIn_13_0 = null;
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
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        be var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_l == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (-1 < (param0 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_d.length <= param0) {
                    break L1;
                  } else {
                    if (null == this.field_d[param0]) {
                      L2: {
                        this.field_l.field_h = 6 + 72 * param0;
                        var6_int = this.field_l.c((byte) -112);
                        var7 = this.field_l.c((byte) -108);
                        var13 = new byte[64];
                        this.field_l.a(64, 2, var13, 0);
                        if (param2 == 24108) {
                          break L2;
                        } else {
                          field_b = true;
                          break L2;
                        }
                      }
                      var9 = new be(param0, param4, param3, this.field_e, this.field_c, var6_int, var13, var7, param1);
                      this.field_d[param0] = var9;
                      stackIn_13_0 = (be) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_9_0 = this.field_d[param0];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("dk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    private dk(uh param0, cd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_j = param3;
            this.field_e = param0;
            this.field_g = param2;
            this.field_c = param1;
            if (!this.field_e.b(6)) {
                this.field_f = this.field_e.a(255, false, true, (byte) 0, 255);
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "dk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        oa var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (this.field_l != null) {
          return true;
        } else {
          L0: {
            if (null == this.field_f) {
              if (!this.field_e.b(6)) {
                this.field_f = this.field_e.a(255, false, true, (byte) 0, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_f.field_m) {
            var10 = new oa(this.field_f.e(256));
            var10.field_h = 5;
            var3 = var10.d((byte) 30);
            var10.field_h = var10.field_h + var3 * 72;
            var13 = new byte[var10.field_g.length + -var10.field_h];
            var11 = var13;
            var4 = var11;
            var10.a(var13.length, 2, var13, 0);
            if (!param0) {
              L1: {
                L2: {
                  if (this.field_g == null) {
                    break L2;
                  } else {
                    if (null == this.field_j) {
                      break L2;
                    } else {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_j);
                      var5 = var7_ref_java_math_BigInteger.toByteArray();
                      break L1;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if ((var5.length ^ -1) != -66) {
                throw new RuntimeException();
              } else {
                var15 = n.a(var10.field_g, -5 + (-var13.length + var10.field_h), -5705, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 >= (var7 ^ -1)) {
                    this.field_l = var10;
                    this.field_d = new be[var3];
                    return true;
                  } else {
                    if (var15[var7] != var5[var7 - -1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_a = null;
        int var1 = 45 % ((67 - param0) / 36);
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        ak var4;
        be stackIn_15_0 = null;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            var4 = (ak) null;
            this.a(-91, false, 38, (ak) null, (ak) null);
            break L0;
          }
        }
        if (this.field_d == null) {
          return;
        } else {
          var2 = 0;
          L1: while (true) {
            if (this.field_d.length <= var2) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_d.length) {
                  return;
                } else {
                  if (null != this.field_d[var2]) {
                    stackIn_15_0 = this.field_d[var2];
                    ((be) (Object) stackIn_15_0).b((byte) 126);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (this.field_d[var2] != null) {
                this.field_d[var2].d(23881);
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        field_b = false;
        field_i = 0;
        field_a = "Next";
    }
}
