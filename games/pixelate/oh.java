/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int field_e;
    private int[] field_f;
    static int[] field_g;
    private byte[] field_a;
    static String field_d;
    private int[] field_c;
    static int field_b;

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, boolean param5) {
        int dupTemp$0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
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
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 0;
              var8 = param0 << 1314838659;
              if (!param5) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            param1 = param1 + param3;
            L2: while (true) {
              if (param1 <= param3) {
                stackIn_16_0 = (7 + var8 >> -1153508893) + -param0;
                break L0;
              } else {
                var9 = 255 & param4[param3];
                var10 = this.field_f[var9];
                var11 = this.field_a[var9];
                if ((var11 ^ -1) != -1) {
                  L3: {
                    var12 = var8 >> 1196724291;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 1193059231;
                    var14 = (var11 + var13 + -1 >> -517084765) + var12;
                    var13 += 24;
                    dupTemp$0 = bq.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$0;
                    param2[var12] = (byte)dupTemp$0;
                    if (var14 <= var12) {
                      break L3;
                    } else {
                      var13 -= 8;
                      var12++;
                      var7_int = var10 >>> var13;
                      param2[var12] = (byte)(var10 >>> var13);
                      if (var12 < var14) {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param2[var12] = (byte)(var10 >>> var13);
                        if (var12 >= var14) {
                          break L3;
                        } else {
                          var13 -= 8;
                          var12++;
                          var7_int = var10 >>> var13;
                          param2[var12] = (byte)(var10 >>> var13);
                          if (var14 > var12) {
                            var12++;
                            var13 -= 8;
                            var7_int = var10 << -var13;
                            param2[var12] = (byte)(var10 << -var13);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8 = var8 + var11;
                  param3++;
                  continue L2;
                } else {
                  throw new RuntimeException("" + var9);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var7);

            stackIn_19_1 = new StringBuilder().append("oh.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param5 + ')');
        }
        return stackIn_16_0;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_g = null;
        field_d = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        wi var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        im var3 = pc.a(param2, param0, (byte) 113);
        if (var3 != null) {
            eg.field_n.b(false, (byte) -98);
            var4 = eg.field_n;
            var5_ref_String = op.field_q;
            var4.field_b.a(var5_ref_String, (byte) -68, 5);
            var4 = eg.field_n;
            var5 = uo.field_a;
            var6 = ji.field_c;
            var4.field_b.b(0, var5, 115, var6, 0);
        }
        vf.a(param0, param1, param2);
    }

    oh(byte[] param0) {
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
            this.field_f = new int[var2_int];
            this.field_a = param0;
            this.field_c = new int[8];
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
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
                      this.field_f[var5] = var8;
                      if ((var8 & var7) == 0) {
                        var10 = var6 + -1;
                        L4: while (true) {
                          L5: {
                            if (var10 < 1) {
                              break L5;
                            } else {
                              var11 = var17[var10];
                              if (var11 != var8) {
                                break L5;
                              } else {
                                var12 = 1 << 32 + -var10;
                                if (-1 != (var12 & var11 ^ -1)) {
                                  var3[var10] = var3[var10 - 1];
                                  break L5;
                                } else {
                                  var3[var10] = bq.a(var12, var11);
                                  var10--;
                                  continue L4;
                                }
                              }
                            }
                          }
                          var9 = var8 | var7;
                          break L3;
                        }
                      } else {
                        var9 = var3[-1 + var6];
                        break L3;
                      }
                    }
                    var17[var6] = var9;
                    var10 = 1 + var6;
                    L6: while (true) {
                      if (32 < var10) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var6 <= var11) {
                            this.field_c[var10] = var5 ^ -1;
                            if (var10 < var4) {
                              break L2;
                            } else {
                              var4 = var10 + 1;
                              break L2;
                            }
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if (0 != (var8 & var12)) {
                                L9: {
                                  if (this.field_c[var10] != 0) {
                                    break L9;
                                  } else {
                                    this.field_c[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = this.field_c[var10];
                                break L8;
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              if (var10 < this.field_c.length) {
                                break L10;
                              } else {
                                var13 = new int[this.field_c.length * 2];
                                var14 = 0;
                                L11: while (true) {
                                  if (this.field_c.length <= var14) {
                                    this.field_c = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = this.field_c[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var12 = var12 >>> 1;
                            var11++;
                            continue L7;
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
                        continue L6;
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

            stackIn_38_1 = new StringBuilder().append("oh.<init>(");

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
          throw aa.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, byte param4, java.awt.Component param5, cb param6, vi param7) {
        try {
            if (param4 > -91) {
                oh.a('ﾢ', 24);
            }
            mm.a(param1, param2, 10);
            to.field_t = mm.a(param6, param5, 0, param3);
            ib.field_h = mm.a(param6, param5, 1, param0);
            wi.field_d = new vj();
            ba.field_f = param0;
            ib.field_h.b(wi.field_d);
            ri.field_a = param7;
            ri.field_a.a(wn.field_u, (byte) 2);
            to.field_t.b(ri.field_a);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "oh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (!(!dd.a(param0, (byte) 126))) {
            return true;
        }
        int var2 = -37 % ((-11 - param1) / 41);
        if (param0 != 45 && param0 != 160 && 32 != param0 && param0 != 95) {
            return false;
        }
        return true;
    }

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
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
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param0 == (param1 ^ -1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param1 = param1 + param3;
              var7_int = 0;
              var8 = param4;
              L1: while (true) {
                L2: {
                  var9 = param2[var8];
                  if (0 > var9) {
                    var7_int = this.field_c[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    dupTemp$0 = this.field_c[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L4;
                    } else {
                      incrementValue$1 = param3;
                      param3++;
                      param5[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param1 <= param3) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L5;
                    } else {
                      var7_int++;
                      break L5;
                    }
                  }
                  L6: {
                    dupTemp$2 = this.field_c[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L6;
                    } else {
                      incrementValue$3 = param3;
                      param3++;
                      param5[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param3 < param1) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L7: {
                    if ((32 & var9) == 0) {
                      var7_int++;
                      break L7;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L7;
                    }
                  }
                  L8: {
                    dupTemp$4 = this.field_c[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L8;
                    } else {
                      incrementValue$5 = param3;
                      param3++;
                      param5[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param3 >= param1) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (-1 != (16 & var9 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    dupTemp$6 = this.field_c[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 >= 0) {
                      break L10;
                    } else {
                      incrementValue$7 = param3;
                      param3++;
                      param5[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param1 > param3) {
                        var7_int = 0;
                        break L10;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L11: {
                    if ((8 & var9) != 0) {
                      var7_int = this.field_c[var7_int];
                      break L11;
                    } else {
                      var7_int++;
                      break L11;
                    }
                  }
                  L12: {
                    dupTemp$8 = this.field_c[var7_int];
                    var10 = dupTemp$8;
                    if (0 > dupTemp$8) {
                      incrementValue$9 = param3;
                      param3++;
                      param5[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param1 <= param3) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (0 != (var9 & 4)) {
                      var7_int = this.field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    dupTemp$10 = this.field_c[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 >= 0) {
                      break L14;
                    } else {
                      incrementValue$11 = param3;
                      param3++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param1 > param3) {
                        var7_int = 0;
                        break L14;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L15: {
                    if (0 == (var9 & 2)) {
                      var7_int++;
                      break L15;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L15;
                    }
                  }
                  L16: {
                    dupTemp$12 = this.field_c[var7_int];
                    var10 = dupTemp$12;
                    if (-1 >= (dupTemp$12 ^ -1)) {
                      break L16;
                    } else {
                      incrementValue$13 = param3;
                      param3++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param1 > param3) {
                        var7_int = 0;
                        break L16;
                      } else {
                        return -param4 + (1 + var8);
                      }
                    }
                  }
                  L17: {
                    if (-1 != (var9 & 1 ^ -1)) {
                      var7_int = this.field_c[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    dupTemp$14 = this.field_c[var7_int];
                    var10 = dupTemp$14;
                    if (0 > dupTemp$14) {
                      incrementValue$15 = param3;
                      param3++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param1 > param3) {
                        var7_int = 0;
                        break L18;
                      } else {
                        break L3;
                      }
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackIn_63_0 = -param4 + (1 + var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var7);

            stackIn_66_1 = new StringBuilder().append("oh.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L19;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L20;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L20;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_67_0), stackIn_70_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_63_0;
        }
    }

    static {
        field_d = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = 500;
    }
}
