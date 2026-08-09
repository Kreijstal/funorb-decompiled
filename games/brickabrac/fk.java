/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    private byte[] field_i;
    static String[] field_h;
    private int[] field_j;
    static vl field_f;
    static int field_g;
    static double field_b;
    static String field_c;
    private int[] field_a;
    static jp field_e;
    static String field_d;

    final static boolean a(mf param0, mf param1, mf param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.a((byte) -127)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.a("commonui", -28138)) {
                if (param3 <= -63) {
                  L1: {
                    if (!param0.a((byte) -127)) {
                      break L1;
                    } else {
                      if (param0.a("commonui", -28138)) {
                        L2: {
                          if (!param2.a((byte) -127)) {
                            break L2;
                          } else {
                            if (param2.a("button.gif", -28138)) {
                              stackIn_19_0 = 1;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("fk.E(");

            if (param0 == null) {
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


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
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
          L5: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_29_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_19_0 != 0;
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = ld.field_t;
        if (param1 == 77) {
          L0: {
            if ((var3 ^ -1) <= -6) {
              if (105 > var3) {
                var2 = (-40960 + var3 * 16384) / 220;
                break L0;
              } else {
                if (120 > var3) {
                  var3 = 120 - var3;
                  var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var2 = var3 * (var3 * 8192) / 1100;
              break L0;
            }
          }
          L1: {
            var4 = 1;
            var5 = 0;
            if (-4 == (param0 ^ -1)) {
              var4 = -1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((param0 ^ -1) != -2) {
              break L2;
            } else {
              var5 = 1;
              break L2;
            }
          }
          L3: {
            if (4 == param0) {
              var5 = 1;
              var4 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param0 != 5) {
              break L4;
            } else {
              var4 = -1;
              var5 = 1;
              break L4;
            }
          }
          L5: {
            if (param0 == 6) {
              var4 = 1;
              var5 = -1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            L7: {
              if (-8 == (param0 ^ -1)) {
                break L7;
              } else {
                if ((param0 ^ -1) == -9) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            var4 = -1;
            var5 = -1;
            break L6;
          }
          L8: {
            if (param0 != 11) {
              break L8;
            } else {
              var4 = -1;
              break L8;
            }
          }
          L9: {
            if (param0 != 12) {
              break L9;
            } else {
              var5 = -1;
              var4 = -1;
              break L9;
            }
          }
          L10: {
            if (13 != param0) {
              break L10;
            } else {
              var5 = -1;
              var4 = 1;
              break L10;
            }
          }
          L11: {
            if ((param0 ^ -1) == -15) {
              var5 = 1;
              var4 = -1;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (-16 != (param0 ^ -1)) {
              break L12;
            } else {
              var4 = 1;
              var5 = 1;
              break L12;
            }
          }
          ld.field_w = e.a(var4 * var2, 0, var2 * var5);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, og param1) {
        if (!(param1 != null)) {
            return;
        }
        try {
            hd.field_a = param1;
            if (param0 != 105) {
                String var3 = (String) null;
                fk.a((byte) 84, (java.applet.Applet) null, (String) null, false);
            }
            wd.field_w.field_bb.c((byte) -72);
            wd.field_w.a(hd.field_a, 0);
            nq.field_p = true;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "fk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0, int param1, int param2, byte[] param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            param1 = param1 + param2;
            var8 = param4 << 214554147;
            L1: while (true) {
              if (param2 >= param1) {
                L2: {
                  if (param0 < -91) {
                    break L2;
                  } else {
                    fk.a(-104, (byte) 88);
                    break L2;
                  }
                }
                stackIn_19_0 = (7 + var8 >> -466134301) + -param4;
                break L0;
              } else {
                var9 = param5[param2] & 255;
                var10 = this.field_a[var9];
                var11 = this.field_i[var9];
                if ((var11 ^ -1) == -1) {
                  throw new RuntimeException("" + var9);
                } else {
                  var12 = var8 >> -1172185181;
                  var13 = var8 & 7;
                  var7_int = var7_int & -var13 >> -1381413057;
                  var14 = var12 - -(var13 + (var11 - 1) >> -163513405);
                  var8 = var8 + var11;
                  var13 += 24;
                  dupTemp$0 = ud.d(var7_int, var10 >>> var13);
                  var7_int = dupTemp$0;
                  param3[var12] = (byte)dupTemp$0;
                  if (var14 > var12) {
                    L3: {
                      var12++;
                      var13 -= 8;
                      var7_int = var10 >>> var13;
                      param3[var12] = (byte)(var10 >>> var13);
                      if (var14 > var12) {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param3[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                          var12++;
                          var13 -= 8;
                          var7_int = var10 >>> var13;
                          param3[var12] = (byte)(var10 >>> var13);
                          if (var12 < var14) {
                            var12++;
                            var13 -= 8;
                            var7_int = var10 << -var13;
                            param3[var12] = (byte)(var10 << -var13);
                            break L3;
                          } else {
                            param2++;
                            continue L1;
                          }
                        } else {
                          param2++;
                          continue L1;
                        }
                      } else {
                        break L3;
                      }
                    }
                    param2++;
                    continue L1;
                  } else {
                    param2++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("fk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        return stackIn_19_0;
    }

    final static void a(int param0) {
        int fieldTemp$2 = 0;
        pi var1 = null;
        int var2 = 0;
        int var3 = 0;
        mf var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 14114) {
                break L1;
              } else {
                var4 = (mf) null;
                fk.a((mf) null, (mf) null, (mf) null, -121);
                break L1;
              }
            }
            var1 = k.field_h;
            L2: while (true) {
              if (!ik.a(104)) {
                break L0;
              } else {
                var1.e(-13413, 8);
                fieldTemp$2 = var1.field_l + 1;
                var1.field_l = var1.field_l + 1;
                var2 = fieldTemp$2;
                ah.a(var1, (byte) 9);
                k.field_h.d((byte) 118, -var2 + var1.field_l);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "fk.H(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != -94) {
            fk.a(119, (byte) 34);
        }
        field_d = null;
    }

    final int a(int param0, int param1, int param2, boolean param3, byte[] param4, byte[] param5) {
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
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (0 == param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3) {
                  break L1;
                } else {
                  fk.a((byte) 104);
                  break L1;
                }
              }
              param0 = param0 + param1;
              var7_int = 0;
              var8 = param2;
              L2: while (true) {
                L3: {
                  var9 = param5[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_j[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_j[var7_int];
                    var10 = dupTemp$0;
                    if (0 <= dupTemp$0) {
                      break L5;
                    } else {
                      incrementValue$1 = param1;
                      param1++;
                      param4[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param1 < param0) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (0 != (64 & var9)) {
                      var7_int = this.field_j[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_j[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 < 0) {
                      incrementValue$3 = param1;
                      param1++;
                      param4[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param1 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-1 == (32 & var9 ^ -1)) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = this.field_j[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_j[var7_int];
                    var10 = dupTemp$4;
                    if (0 > dupTemp$4) {
                      incrementValue$5 = param1;
                      param1++;
                      param4[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param0 <= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((16 & var9) == 0) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = this.field_j[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_j[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      incrementValue$7 = param1;
                      param1++;
                      param4[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param0 <= param1) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (0 == (var9 & 8)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = this.field_j[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_j[var7_int];
                    var10 = dupTemp$8;
                    if (-1 < (dupTemp$8 ^ -1)) {
                      incrementValue$9 = param1;
                      param1++;
                      param4[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param1 < param0) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((var9 & 4) != 0) {
                      var7_int = this.field_j[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_j[var7_int];
                    var10 = dupTemp$10;
                    if (-1 < (dupTemp$10 ^ -1)) {
                      incrementValue$11 = param1;
                      param1++;
                      param4[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param1 < param0) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return -param2 + (1 + var8);
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if ((2 & var9) == 0) {
                      var7_int++;
                      break L16;
                    } else {
                      var7_int = this.field_j[var7_int];
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_j[var7_int];
                    var10 = dupTemp$12;
                    if (-1 < (dupTemp$12 ^ -1)) {
                      incrementValue$13 = param1;
                      param1++;
                      param4[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param1 >= param0) {
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
                      var7_int = this.field_j[var7_int];
                      break L18;
                    }
                  }
                  dupTemp$14 = this.field_j[var7_int];
                  var10 = dupTemp$14;
                  if (dupTemp$14 < 0) {
                    incrementValue$15 = param1;
                    param1++;
                    param4[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param1 < param0) {
                      var7_int = 0;
                      var8++;
                      continue L2;
                    } else {
                      break L4;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
                stackIn_68_0 = -param2 + (1 + var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("fk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L19;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');

            if (param5 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L20;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L20;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_72_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_68_0;
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            int var4_int = 0;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            StringBuilder stackIn_13_1 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            java.net.MalformedURLException var5 = null;
            try {
              L0: {
                L1: {
                  var4_int = 60 / ((1 - param0) / 62);
                  if (!tg.field_b.startsWith("win")) {
                    break L1;
                  } else {
                    if (ie.a(param2, false)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L2: {
                    param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var5 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    rk.a("MGR1: " + param2, (Throwable) null, 77);
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var4);

                stackIn_10_1 = new StringBuilder().append("fk.D(").append(param0).append(',');

                if (param1 == null) {
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


                stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

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
              throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fk(byte[] param0) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
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
            this.field_i = param0;
            this.field_a = new int[var2_int];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_j = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (var6 == 0) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var17[var6];
                      this.field_a[var5] = var8;
                      if ((var8 & var7) == 0) {
                        var9 = var7 | var8;
                        var10 = var6 + -1;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var17[var10];
                            if ((var8 ^ -1) != (var11 ^ -1)) {
                              break L3;
                            } else {
                              var12 = 1 << 32 - var10;
                              if (-1 != (var12 & var11 ^ -1)) {
                                var3[var10] = var3[var10 + -1];
                                break L3;
                              } else {
                                var3[var10] = ud.d(var12, var11);
                                var10--;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var9 = var3[var6 + -1];
                        break L3;
                      }
                    }
                    var17[var6] = var9;
                    var10 = var6 - -1;
                    L5: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var6 <= var11) {
                            this.field_j[var10] = var5 ^ -1;
                            if (var10 < var4) {
                              break L2;
                            } else {
                              var4 = 1 + var10;
                              break L2;
                            }
                          } else {
                            L7: {
                              var12 = -2147483648 >>> var11;
                              if ((var8 & var12 ^ -1) == -1) {
                                var10++;
                                break L7;
                              } else {
                                L8: {
                                  if (-1 != (this.field_j[var10] ^ -1)) {
                                    break L8;
                                  } else {
                                    this.field_j[var10] = var4;
                                    break L8;
                                  }
                                }
                                var10 = this.field_j[var10];
                                break L7;
                              }
                            }
                            L9: {
                              if (this.field_j.length > var10) {
                                break L9;
                              } else {
                                var13 = new int[this.field_j.length * 2];
                                var14 = 0;
                                L10: while (true) {
                                  if (this.field_j.length <= var14) {
                                    this.field_j = var13;
                                    break L9;
                                  } else {
                                    var13[var14] = this.field_j[var14];
                                    var14++;
                                    continue L10;
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
                        L11: {
                          if (var8 != var17[var10]) {
                            break L11;
                          } else {
                            var17[var10] = var9;
                            break L11;
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
          L12: {
            var2 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var2);

            stackIn_37_1 = new StringBuilder().append("fk.<init>(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
    }

    static {
        field_f = new vl();
        field_c = "Passwords can only contain letters and numbers";
        field_b = 0.0;
        field_d = "Age:";
    }
}
