/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_j;
    static String field_d;
    static String field_f;
    static String field_g;
    private int[] field_h;
    static int field_c;
    private byte[] field_a;
    static wk[] field_i;
    static ru[] field_e;
    private int[] field_b;

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 76 % ((param0 - 52) / 39);
          var3 = param1;
          var4 = param1;
          if (1 == var4) {
            var3 = 2;
            break L0;
          } else {
            if (var4 != 2) {
              if (var4 != 3) {
                if (var4 == 4) {
                  var3 = 3;
                  break L0;
                } else {
                  var3 = param1;
                  break L0;
                }
              } else {
                var3 = 4;
                break L0;
              }
            } else {
              var3 = 1;
              break L0;
            }
          }
        }
        return var3;
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != -1) {
            field_d = (String) null;
        }
        field_i = null;
        field_d = null;
    }

    final static void a(int param0, int param1, String param2, boolean param3, byte param4, int param5) {
        try {
            if (param3) {
                no.field_P.field_y = qn.field_l;
                no.field_P.field_B = qn.field_d;
                no.field_P.field_v = qn.field_g;
                ku.field_J.b();
                qn.b();
                gq.b(bc.field_j[3][0], 0, 0, param1);
                fe.c(jc.a(param2, (byte) 42), uh.field_e[3][0] >> 1294412577, 20 + (uh.field_e[3][1] >> 1909519937), 2, true);
                no.field_P.b();
                ku.field_J.h(param0, param5);
            } else {
                gq.b(bc.field_j[3][0], param0, param5, param1);
                fe.c(jc.a(param2, (byte) 42), (uh.field_e[3][0] >> 1376585217) - -param0, 20 + (uh.field_e[3][1] >> -272940991) + param5, 2, true);
            }
            int var6_int = 67 % ((param4 - 48) / 53);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dq.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 7) {
              stackIn_4_0 = ob.a(10, true, param1, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -59;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("dq.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, byte param5) {
        int dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param4 << 385110691;
            param2 = param2 + param0;
            if (param5 >= 24) {
              L1: while (true) {
                if (param0 >= param2) {
                  stackIn_19_0 = (var8 - -7 >> 1985910691) - param4;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var9 = param1[param0] & 255;
                  var10 = this.field_h[var9];
                  var11 = this.field_a[var9];
                  if (0 == var11) {
                    throw new RuntimeException("" + var9);
                  } else {
                    L2: {
                      var12 = var8 >> -572783453;
                      var13 = var8 & 7;
                      var7_int = var7_int & -var13 >> -21459393;
                      var14 = var12 + (var11 + (var13 + -1) >> -1380689533);
                      var8 = var8 + var11;
                      var13 += 24;
                      dupTemp$0 = oe.c(var7_int, var10 >>> var13);
                      var7_int = dupTemp$0;
                      param3[var12] = (byte)dupTemp$0;
                      if (var12 < var14) {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param3[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                          var13 -= 8;
                          var12++;
                          var7_int = var10 >>> var13;
                          param3[var12] = (byte)(var10 >>> var13);
                          if (var14 > var12) {
                            var13 -= 8;
                            var12++;
                            var7_int = var10 >>> var13;
                            param3[var12] = (byte)(var10 >>> var13);
                            if (var12 < var14) {
                              var13 -= 8;
                              var12++;
                              var7_int = var10 << -var13;
                              param3[var12] = (byte)(var10 << -var13);
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        } else {
                          param0++;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                    param0++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = -2;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("dq.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    dq(byte[] param0) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        try {
          L0: {
            var2_int = param0.length;
            this.field_a = param0;
            this.field_h = new int[var2_int];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_b = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (-1 == (var6 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var17[var6];
                      this.field_h[var5] = var8;
                      if (-1 != (var8 & var7 ^ -1)) {
                        var9 = var3[var6 - 1];
                        break L3;
                      } else {
                        var9 = var8 | var7;
                        var10 = var6 - 1;
                        L4: while (true) {
                          if ((var10 ^ -1) > -2) {
                            break L3;
                          } else {
                            var11 = var17[var10];
                            if ((var8 ^ -1) != (var11 ^ -1)) {
                              break L3;
                            } else {
                              var12 = 1 << -var10 + 32;
                              if ((var11 & var12) == 0) {
                                var3[var10] = oe.c(var11, var12);
                                var10--;
                                continue L4;
                              } else {
                                var3[var10] = var3[-1 + var10];
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    var17[var6] = var9;
                    var10 = 1 + var6;
                    L5: while (true) {
                      if (-33 > (var10 ^ -1)) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var11 >= var6) {
                            L7: {
                              if (var4 > var10) {
                                break L7;
                              } else {
                                var4 = 1 + var10;
                                break L7;
                              }
                            }
                            this.field_b[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if (-1 != (var8 & var12 ^ -1)) {
                                L9: {
                                  if (0 != this.field_b[var10]) {
                                    break L9;
                                  } else {
                                    this.field_b[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = this.field_b[var10];
                                break L8;
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              if (var10 < this.field_b.length) {
                                break L10;
                              } else {
                                var13 = new int[this.field_b.length * 2];
                                var14 = 0;
                                L11: while (true) {
                                  if (var14 >= this.field_b.length) {
                                    this.field_b = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = this.field_b[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var12 = var12 >>> 1;
                            var11++;
                            continue L6;
                          }
                        }
                      } else {
                        L12: {
                          if ((var8 ^ -1) != (var17[var10] ^ -1)) {
                            break L12;
                          } else {
                            var17[var10] = var9;
                            break L12;
                          }
                        }
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("dq.<init>(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    final int a(byte[] param0, int param1, boolean param2, int param3, int param4, byte[] param5) {
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
        int stackIn_3_0 = 0;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  this.field_a = (byte[]) null;
                  break L1;
                }
              }
              param3 = param3 + param4;
              var7_int = 0;
              var8 = param1;
              L2: while (true) {
                L3: {
                  var9 = param0[var8];
                  if (0 > var9) {
                    var7_int = this.field_b[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_b[var7_int];
                    var10 = dupTemp$0;
                    if (-1 >= (dupTemp$0 ^ -1)) {
                      break L5;
                    } else {
                      incrementValue$1 = param4;
                      param4++;
                      param5[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param3 > param4) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_b[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L7;
                    } else {
                      incrementValue$3 = param4;
                      param4++;
                      param5[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param4 < param3) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if ((32 & var9) == 0) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_b[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L9;
                    } else {
                      incrementValue$5 = param4;
                      param4++;
                      param5[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param3 > param4) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if ((var9 & 16) == 0) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_b[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      incrementValue$7 = param4;
                      param4++;
                      param5[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param3 > param4) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-1 != (8 & var9 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_b[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 >= 0) {
                      break L13;
                    } else {
                      incrementValue$9 = param4;
                      param4++;
                      param5[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param4 < param3) {
                        var7_int = 0;
                        break L13;
                      } else {
                        return 1 + (var8 - param1);
                      }
                    }
                  }
                  L14: {
                    if (-1 == (var9 & 4 ^ -1)) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_b[var7_int];
                    var10 = dupTemp$10;
                    if (-1 < (dupTemp$10 ^ -1)) {
                      incrementValue$11 = param4;
                      param4++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param4 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-1 != (2 & var9 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_b[var7_int];
                    var10 = dupTemp$12;
                    if (0 > dupTemp$12) {
                      incrementValue$13 = param4;
                      param4++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param4 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (0 == (var9 & 1)) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_b[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    dupTemp$14 = this.field_b[var7_int];
                    var10 = dupTemp$14;
                    if (-1 < (dupTemp$14 ^ -1)) {
                      incrementValue$15 = param4;
                      param4++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param4 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackIn_66_0 = 1 + (var8 - param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("dq.F(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L20;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L21;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L21;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_66_0;
        }
    }

    static {
        field_c = 0;
        field_d = "Useful items to carry with you. Each unit can only hold one accessory at a time. Equipping a unit with a new accessory will cause whatever accessory that unit is currently holding to be discarded.";
        field_f = "Breaking real-world laws";
        field_j = "Ranged weapons will improve the effectiveness of ranged attacks.";
        field_g = "Click to Scroll";
    }
}
