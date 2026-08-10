/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static String field_h;
    private int[] field_e;
    static String field_f;
    private int[] field_d;
    static String field_g;
    static int field_b;
    static String field_c;
    private byte[] field_a;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((f.field_a ^ -1) <= -1) {
          L0: {
            var3 = param0 - 135;
            var4 = param1 - 35;
            var5 = 256;
            if (f.field_a < 75) {
              var5 = (f.field_a << 1028906568) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (200 < f.field_a) {
              var5 = (-f.field_a + 250 << 1472587048) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            r.a(0, m.field_w);
            ep.e();
            oo.b();
            rl.a((byte) 125);
            if ((var5 ^ -1) > -257) {
              oo.f(0, 0, oo.field_b, oo.field_l, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ql.a(true);
            if ((f.field_a ^ -1) > -151) {
              m.field_w.f(var3, var4);
              break L3;
            } else {
              qp.field_v.c(15 + var3, var4 - -10, var5);
              break L3;
            }
          }
          if (param2 >= 70) {
            L4: {
              var6 = f.field_a + -125;
              if (0 >= var6) {
                break L4;
              } else {
                if (-51 < (var6 ^ -1)) {
                  if ((var6 ^ -1) <= -21) {
                    if (30 <= var6) {
                      var7 = 256 * (50 + -var6) / 20;
                      kk.field_r.e(var3, var4, var7);
                      break L4;
                    } else {
                      kk.field_r.e(var3, var4, 256);
                      break L4;
                    }
                  } else {
                    var7 = 256 * var6 / 20;
                    kk.field_r.e(var3, var4, var7);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L5: {
              var6 = f.field_a + -140;
              if (-1 > (var6 ^ -1)) {
                L6: {
                  var7 = 256;
                  if ((var6 ^ -1) <= -21) {
                    break L6;
                  } else {
                    var7 = var6 * 256 / 20;
                    break L6;
                  }
                }
                qd.field_s.c(var3 + 15, 10 + var4, var7 * var5 >> 853037672);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static ld a(boolean param0, cj param1, cj param2, cj param3, ob param4) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        ld stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ld[] var11 = null;
        int var12 = 0;
        ob var13_ref_ob = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        tl var16 = null;
        int var17 = 0;
        ob var18 = null;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (param4.field_x != null) {
                  stackIn_7_0 = param4.field_x.length;
                  break L1;
                } else {
                  stackIn_7_0 = 0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null != param4.field_B) {
                  stackIn_10_0 = param4.field_B.length;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var5_int + var6;
                if (!param0) {
                  break L3;
                } else {
                  var18 = (ob) null;
                  eh.a(false, (cj) null, (cj) null, (cj) null, (ob) null);
                  break L3;
                }
              }
              L4: {
                var8 = new String[var7];
                var22 = new char[var7];
                var20 = var22;
                var9 = var20;
                var21 = new int[var7];
                var19 = var21;
                var10 = var19;
                var11 = new ld[var7];
                if (null == param4.field_x) {
                  break L4;
                } else {
                  var12 = 0;
                  L5: while (true) {
                    if (param4.field_x.length <= var12) {
                      break L4;
                    } else {
                      var13_ref_ob = ok.field_p.a(param4.field_x[var12], 32767);
                      var8[var12] = var13_ref_ob.field_s;
                      var9[var12] = param4.field_r[var12];
                      var11[var12] = eh.a(false, param1, param2, param3, var13_ref_ob);
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (param4.field_B == null) {
                  break L6;
                } else {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (param4.field_B.length <= var14) {
                      break L6;
                    } else {
                      L8: {
                        var15 = param4.field_B[var14];
                        if (var15 == -1) {
                          var8[var14 + var12] = le.field_I;
                          var9[var14 + var12] = param4.field_D[var14];
                          var10[var12 + var14] = param4.field_B[var14];
                          break L8;
                        } else {
                          L9: {
                            var16 = bd.field_c.a(var15, -11452);
                            var8[var12 - -var14] = var16.e(-18572);
                            var9[var12 + var14] = param4.field_D[var14];
                            if (var9[var12 + var14] <= 0) {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10[var12 + var14] = param4.field_B[var14];
                          break L8;
                        }
                      }
                      var14++;
                      continue L7;
                    }
                  }
                }
              }
              stackIn_27_0 = new ld(0L, param3, param1, param2, var11, var21, var8, var22);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("eh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_40_2 + ')');
        }
        return stackIn_27_0;
    }

    final static void a(int param0) {
        ja var1 = null;
        ja var2 = null;
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            var1 = new ja(540, 140);
            r.a(0, var1);
            ep.e();
            oo.b();
            f.field_a = 0;
            rl.a((byte) 120);
            var2 = var1.c();
            for (var3 = 0; -16 < (var3 ^ -1); var3++) {
                var2.f(-2, -2, 16777215);
                oo.i(4, 4, 0, 0, 540, 140);
            }
            kk.field_r.a();
            var1.f(0, 0);
            if (param0 != -1741) {
                field_f = (String) null;
            }
            ql.a(true);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "eh.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        field_f = null;
        if (param0 <= 26) {
            ob var2 = (ob) null;
            eh.a(false, (cj) null, (cj) null, (cj) null, (ob) null);
        }
        field_c = null;
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
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
        int stackIn_61_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 != 0) {
              var7_int = 0;
              param0 = param0 + param2;
              var9 = 77 / ((param1 - -1) / 54);
              var8 = param5;
              L1: while (true) {
                L2: {
                  var10 = param3[var8];
                  if ((var10 ^ -1) > -1) {
                    var7_int = this.field_d[var7_int];
                    break L2;
                  } else {
                    var7_int++;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    dupTemp$0 = this.field_d[var7_int];
                    var11 = dupTemp$0;
                    if (dupTemp$0 < 0) {
                      incrementValue$1 = param2;
                      param2++;
                      param4[incrementValue$1] = (byte)(var11 ^ -1);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L4;
                      } else {
                        break L3;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((64 & var10) == 0) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = this.field_d[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    dupTemp$2 = this.field_d[var7_int];
                    var11 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L6;
                    } else {
                      incrementValue$3 = param2;
                      param2++;
                      param4[incrementValue$3] = (byte)(var11 ^ -1);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L7: {
                    if (0 != (32 & var10)) {
                      var7_int = this.field_d[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    dupTemp$4 = this.field_d[var7_int];
                    var11 = dupTemp$4;
                    if (0 <= dupTemp$4) {
                      break L8;
                    } else {
                      incrementValue$5 = param2;
                      param2++;
                      param4[incrementValue$5] = (byte)(var11 ^ -1);
                      if (param2 < param0) {
                        var7_int = 0;
                        break L8;
                      } else {
                        return 1 + (var8 - param5);
                      }
                    }
                  }
                  L9: {
                    if ((16 & var10) != 0) {
                      var7_int = this.field_d[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    dupTemp$6 = this.field_d[var7_int];
                    var11 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      incrementValue$7 = param2;
                      param2++;
                      param4[incrementValue$7] = (byte)(var11 ^ -1);
                      if (param2 >= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if ((var10 & 8) != 0) {
                      var7_int = this.field_d[var7_int];
                      break L11;
                    } else {
                      var7_int++;
                      break L11;
                    }
                  }
                  L12: {
                    dupTemp$8 = this.field_d[var7_int];
                    var11 = dupTemp$8;
                    if (dupTemp$8 >= 0) {
                      break L12;
                    } else {
                      incrementValue$9 = param2;
                      param2++;
                      param4[incrementValue$9] = (byte)(var11 ^ -1);
                      if (param0 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (0 == (4 & var10)) {
                      var7_int++;
                      break L13;
                    } else {
                      var7_int = this.field_d[var7_int];
                      break L13;
                    }
                  }
                  L14: {
                    dupTemp$10 = this.field_d[var7_int];
                    var11 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      incrementValue$11 = param2;
                      param2++;
                      param4[incrementValue$11] = (byte)(var11 ^ -1);
                      if (param0 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var10 & 2) == 0) {
                      var7_int++;
                      break L15;
                    } else {
                      var7_int = this.field_d[var7_int];
                      break L15;
                    }
                  }
                  L16: {
                    dupTemp$12 = this.field_d[var7_int];
                    var11 = dupTemp$12;
                    if (dupTemp$12 >= 0) {
                      break L16;
                    } else {
                      incrementValue$13 = param2;
                      param2++;
                      param4[incrementValue$13] = (byte)(var11 ^ -1);
                      if (param2 >= param0) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (0 != (1 & var10)) {
                      var7_int = this.field_d[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  dupTemp$14 = this.field_d[var7_int];
                  var11 = dupTemp$14;
                  if (dupTemp$14 < 0) {
                    incrementValue$15 = param2;
                    param2++;
                    param4[incrementValue$15] = (byte)(var11 ^ -1);
                    if (param0 <= param2) {
                      break L3;
                    } else {
                      var7_int = 0;
                      var8++;
                      continue L1;
                    }
                  } else {
                    var8++;
                    continue L1;
                  }
                }
                stackIn_61_0 = 1 + (var8 - param5);
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
          L18: {
            var7 = decompiledCaughtException;
            stackIn_64_0 = (RuntimeException) (var7);

            stackIn_64_1 = new StringBuilder().append("eh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L18;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');

            if (param4 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L19;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L19;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_65_0), stackIn_68_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_61_0;
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
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
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 0;
              param0 = param0 + param2;
              var8 = param4 << 1814084963;
              if (param1 == -62) {
                break L1;
              } else {
                this.field_a = (byte[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (param2 >= param0) {
                stackIn_16_0 = (7 + var8 >> -616822749) - param4;
                break L0;
              } else {
                var9 = 255 & param5[param2];
                var10 = this.field_e[var9];
                var11 = this.field_a[var9];
                if (var11 != 0) {
                  var12 = var8 >> -1904571293;
                  var13 = 7 & var8;
                  var7_int = var7_int & -var13 >> -268071617;
                  var14 = (-1 + (var13 - -var11) >> -1655675549) + var12;
                  var8 = var8 + var11;
                  var13 += 24;
                  dupTemp$0 = cr.b(var7_int, var10 >>> var13);
                  var7_int = dupTemp$0;
                  param3[var12] = (byte)dupTemp$0;
                  if (var14 > var12) {
                    var12++;
                    var13 -= 8;
                    var7_int = var10 >>> var13;
                    param3[var12] = (byte)(var10 >>> var13);
                    if (var12 < var14) {
                      var12++;
                      var13 -= 8;
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
                          var7_int = var10 << -var13;
                          param3[var12] = (byte)(var10 << -var13);
                          param2++;
                          continue L2;
                        } else {
                          param2++;
                          continue L2;
                        }
                      } else {
                        param2++;
                        continue L2;
                      }
                    } else {
                      param2++;
                      continue L2;
                    }
                  } else {
                    param2++;
                    continue L2;
                  }
                } else {
                  throw new RuntimeException("" + var9);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var7);

            stackIn_19_1 = new StringBuilder().append("eh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0;
    }

    eh(byte[] param0) {
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
            this.field_e = new int[var2_int];
            this.field_a = param0;
            var17 = new int[33];
            var16 = var17;
            var3 = var16;
            this.field_d = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 + -var6;
                      var8 = var17[var6];
                      this.field_e[var5] = var8;
                      if (-1 == (var7 & var8 ^ -1)) {
                        var10 = var6 + -1;
                        L4: while (true) {
                          L5: {
                            if (var10 < 1) {
                              break L5;
                            } else {
                              var11 = var17[var10];
                              if ((var11 ^ -1) != (var8 ^ -1)) {
                                break L5;
                              } else {
                                var12 = 1 << 32 + -var10;
                                if (-1 == (var11 & var12 ^ -1)) {
                                  var3[var10] = cr.b(var12, var11);
                                  var10--;
                                  continue L4;
                                } else {
                                  var3[var10] = var3[-1 + var10];
                                  break L5;
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
                    var10 = var6 + 1;
                    L6: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var11 >= var6) {
                            L8: {
                              if (var4 > var10) {
                                break L8;
                              } else {
                                var4 = 1 + var10;
                                break L8;
                              }
                            }
                            this.field_d[var10] = var5 ^ -1;
                            break L2;
                          } else {
                            L9: {
                              var12 = -2147483648 >>> var11;
                              if (0 == (var8 & var12)) {
                                var10++;
                                break L9;
                              } else {
                                L10: {
                                  if (this.field_d[var10] != 0) {
                                    break L10;
                                  } else {
                                    this.field_d[var10] = var4;
                                    break L10;
                                  }
                                }
                                var10 = this.field_d[var10];
                                break L9;
                              }
                            }
                            L11: {
                              if (var10 < this.field_d.length) {
                                break L11;
                              } else {
                                var13 = new int[2 * this.field_d.length];
                                var14 = 0;
                                L12: while (true) {
                                  if (var14 >= this.field_d.length) {
                                    this.field_d = var13;
                                    break L11;
                                  } else {
                                    var13[var14] = this.field_d[var14];
                                    var14++;
                                    continue L12;
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
                        L13: {
                          if (var17[var10] != var8) {
                            break L13;
                          } else {
                            var17[var10] = var9;
                            break L13;
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
          L14: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("eh.<init>(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L14;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
    }

    static {
        field_b = 0;
        field_f = "Scamming";
        field_c = "Enter multiplayer lobby";
        field_h = "From only <%0>/month";
        field_g = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
