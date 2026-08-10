/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends kd {
    ke[] field_l;
    private int[] field_i;
    static hk field_j;
    byte[] field_n;
    static be field_s;
    byte[] field_q;
    rc[] field_h;
    int field_m;
    static int field_o;
    short[] field_k;
    static String field_p;
    byte[] field_r;

    final void a(int param0) {
        if (param0 >= -81) {
            return;
        }
        this.field_i = null;
    }

    final boolean a(byte[] param0, ja param1, byte param2, int[] param3) {
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            var7 = null;
            var8 = 0;
            L1: while (true) {
              if (128 <= var8) {
                L2: {
                  if (param2 >= 76) {
                    break L2;
                  } else {
                    wj.c(true);
                    break L2;
                  }
                }
                stackIn_22_0 = var5_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param0 == null) {
                      break L4;
                    } else {
                      if (param0[var8] != 0) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_i[var8];
                  if (var9 != 0) {
                    L5: {
                      if (var9 == var6) {
                        break L5;
                      } else {
                        L6: {
                          var6 = var9;
                          var9--;
                          if ((1 & var9) == 0) {
                            var7 = param1.a(-1, param3, var9 >> -1827134814);
                            break L6;
                          } else {
                            var7 = param1.a(var9 >> 1047490754, param3, true);
                            break L6;
                          }
                        }
                        if (var7 == null) {
                          var5_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var7 != null) {
                      this.field_l[var8] = (ke) (var7);
                      this.field_i[var8] = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var8++;
                    continue L1;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("wj.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    public static void c(boolean param0) {
        field_p = null;
        field_j = null;
        if (param0) {
            wj.b(-51);
        }
        field_s = null;
    }

    final static int[] b(int param0) {
        if (param0 != 26770) {
            wj.c(true);
        }
        return new int[8];
    }

    final static void c(int param0) {
        gb.field_d = false;
        ca.field_k = false;
        ni.a(param0 ^ -6357, -1);
        ee.field_c = c.field_m;
        bk.field_c = c.field_m;
        if (param0 != -6399) {
            field_p = (String) null;
        }
    }

    wj(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        rc dupTemp$8 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        String stackIn_208_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        rc[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        rc var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        wf var38 = null;
        byte[] var39 = null;
        rc var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        rc var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        rc var48 = null;
        rc var49 = null;
        rc var50 = null;
        rc var51 = null;
        rc var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        try {
          L0: {
            this.field_l = new ke[128];
            this.field_h = new rc[128];
            this.field_q = new byte[128];
            this.field_n = new byte[128];
            this.field_i = new int[128];
            this.field_r = new byte[128];
            this.field_k = new short[128];
            var38 = new wf(param0);
            var3 = 0;
            L1: while (true) {
              if (0 == var38.field_j[var3 + var38.field_h]) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    var3++;
                    var38.field_h = var38.field_h + 1;
                    var5 = var38.field_h;
                    var38.field_h = var38.field_h + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_j[var38.field_h + var6] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= var6) {
                            var6++;
                            var38.field_h = var38.field_h + 1;
                            var8 = var38.field_h;
                            var38.field_h = var38.field_h + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_j[var9 + var38.field_h] == 0) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var9++;
                                      var38.field_h = var38.field_h + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if ((var9 ^ -1) >= -2) {
                                        var12 = var9;
                                        break L7;
                                      } else {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var9 <= var14) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.d(true);
                                              if (var15_int == 0) {
                                                incrementValue$0 = var12;
                                                var12++;
                                                var13_int = incrementValue$0;
                                                break L9;
                                              } else {
                                                L10: {
                                                  if (var13_int < var15_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              }
                                            }
                                            var11[var14] = (byte)var13_int;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    var13 = new rc[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.d(true);
                                          if (-1 <= (var14 ^ -1)) {
                                            stackIn_39_0 = null;
                                            break L12;
                                          } else {
                                            stackIn_39_0 = new byte[2 * var14];
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var46 = stackIn_39_0;
                                          var15 = var46;
                                          var14 = var38.d(true);
                                          if (var14 <= 0) {
                                            stackIn_42_0 = null;
                                            break L13;
                                          } else {
                                            stackIn_42_0 = new byte[2 * var14];
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (-1 == (var38.field_j[var17 + var38.field_h] ^ -1)) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var17++;
                                                var38.field_h = var38.field_h + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (128 <= var20) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (var23 >= 128) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (-129 >= (var24 ^ -1)) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if ((var25_int ^ -1) <= -129) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if ((var26 ^ -1) <= -129) {
                                                                        var20 = 0;
                                                                        var21 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= 128) {
                                                                            this.field_m = var38.d(true) - -1;
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var12 <= var27) {
                                                                                L24: {
                                                                                  if (null == var15) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var46.length <= var27) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.e(true);
                                                                                        var27 += 2;
                                                                                        continue L25;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if (var16 == null) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L27: while (true) {
                                                                                      if (var27 >= var47.length) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.e(true);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var12 <= var27) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        L30: {
                                                                                          if (var15 == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.d(true);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var46.length <= var27) {
                                                                                                var27 = var46[0];
                                                                                                var28 = var46[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var46.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (128 <= var30) {
                                                                                                            var15 = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_n[var30] = (byte)(var28 * this.field_n[var30] + 32 >> 1870569894);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15[1 + var29];
                                                                                                        var32 = (-var27 + var30) * var28 - -((-var27 + var30) / 2);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = rl.b(-var27 + var30, var32, 25668);
                                                                                                            this.field_n[var33] = (byte)(var34 * this.field_n[var33] - -32 >> 2044572166);
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_n[var29] = (byte)(var28 * this.field_n[var29] - -32 >> -158679418);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.d(true) + var19 + 1;
                                                                                                var15[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 != null) {
                                                                                            var19 = var38.d(true);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var47.length <= var27) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << 1733682753;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var47.length <= var29) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if (var30 >= 128) {
                                                                                                            var27 = 0;
                                                                                                            L41: while (true) {
                                                                                                              if (var27 >= var12) {
                                                                                                                break L36;
                                                                                                              } else {
                                                                                                                var13[var27].field_e = var38.d(true);
                                                                                                                var27++;
                                                                                                                continue L41;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            L42: {
                                                                                                              var31 = var28 + (255 & this.field_q[var30]);
                                                                                                              if (0 <= var31) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            L43: {
                                                                                                              if (-129 <= (var31 ^ -1)) {
                                                                                                                break L43;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L43;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_q[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[var29 - -1] << -1816063903;
                                                                                                        var32 = (var30 - var27) / 2 + (var30 - var27) * var28;
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L44: while (true) {
                                                                                                          if (var37 >= var30) {
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L45: {
                                                                                                              var34 = rl.b(var30 + -var27, var32, 25668);
                                                                                                              var35 = (255 & this.field_q[var37]) - -var34;
                                                                                                              if (var35 >= 0) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            L46: {
                                                                                                              if (128 >= var35) {
                                                                                                                break L46;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L46;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_q[var37] = (byte)var35;
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            var37++;
                                                                                                            continue L44;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L47: {
                                                                                                      var30 = (this.field_q[var29] & 255) + var28;
                                                                                                      if (-1 >= (var30 ^ -1)) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    L48: {
                                                                                                      if (-129 <= (var30 ^ -1)) {
                                                                                                        break L48;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L48;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_q[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.d(true) + var19 - -1;
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                break L36;
                                                                                              } else {
                                                                                                var13[var27].field_e = var38.d(true);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L53: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (-1 <= (var52.field_k ^ -1)) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var52.field_h = var38.d(true);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L53;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L55: {
                                                                                                      var51 = var13[var27];
                                                                                                      if (0 >= var51.field_d) {
                                                                                                        break L55;
                                                                                                      } else {
                                                                                                        var51.field_k = var38.d(true);
                                                                                                        break L55;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L52;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_d = var38.d(true);
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L56: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_c == null) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_j = var38.d(true);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            L57: {
                                                                                              if (null == var50.field_g) {
                                                                                                break L57;
                                                                                              } else {
                                                                                                var50.field_l = var38.d(true);
                                                                                                break L57;
                                                                                              }
                                                                                            }
                                                                                            L58: {
                                                                                              if (-1 <= (var50.field_e ^ -1)) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var50.field_b = var38.d(true);
                                                                                                break L58;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L59: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_c == null) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L60: while (true) {
                                                                                              if (var49.field_c.length <= var29) {
                                                                                                break L59;
                                                                                              } else {
                                                                                                var19 = var38.d(true) + 1 + var19;
                                                                                                var49.field_c[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L60;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L61: {
                                                                                      var48 = var13[var27];
                                                                                      if (var48.field_g == null) {
                                                                                        break L61;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L62: while (true) {
                                                                                          if (var48.field_g.length <= var29) {
                                                                                            break L61;
                                                                                          } else {
                                                                                            var19 = 1 + var19 + var38.d(true);
                                                                                            var48.field_g[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L62;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L63: {
                                                                                  var45 = var13[var27];
                                                                                  if (null == var45.field_c) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L64: while (true) {
                                                                                      if (var29 >= var45.field_c.length) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        var45.field_c[var29] = var38.e(true);
                                                                                        var29 += 2;
                                                                                        continue L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L65: {
                                                                                  if (var45.field_g == null) {
                                                                                    break L65;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L66: while (true) {
                                                                                      if (var29 >= var45.field_g.length - 2) {
                                                                                        break L65;
                                                                                      } else {
                                                                                        var45.field_g[var29] = var38.e(true);
                                                                                        var29 += 2;
                                                                                        continue L66;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L67: {
                                                                              if (var20 != 0) {
                                                                                break L67;
                                                                              } else {
                                                                                L68: {
                                                                                  if (var21 >= var54.length) {
                                                                                    var20 = -1;
                                                                                    break L68;
                                                                                  } else {
                                                                                    incrementValue$1 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$1];
                                                                                    break L68;
                                                                                  }
                                                                                }
                                                                                if (this.field_i[var27] <= 0) {
                                                                                  break L67;
                                                                                } else {
                                                                                  var26 = var38.d(true) + 1;
                                                                                  break L67;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_n[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L69: {
                                                                          if (this.field_i[var26] == 0) {
                                                                            break L69;
                                                                          } else {
                                                                            L70: {
                                                                              if (0 != var20) {
                                                                                break L70;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 < var57.length) {
                                                                                  incrementValue$2 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$2];
                                                                                  break L70;
                                                                                } else {
                                                                                  var20 = -1;
                                                                                  break L70;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_h[var26] = (rc) (var25);
                                                                            break L69;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L71: {
                                                                      if (0 == this.field_i[var25_int]) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (var20 != 0) {
                                                                            break L72;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_j[incrementValue$3] - -16 << -1072087262;
                                                                            if (var56.length <= var21) {
                                                                              var20 = -1;
                                                                              break L72;
                                                                            } else {
                                                                              incrementValue$4 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$4];
                                                                              break L72;
                                                                            }
                                                                          }
                                                                        }
                                                                        this.field_q[var25_int] = (byte)var24;
                                                                        var20--;
                                                                        break L71;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (this.field_i[var24] == 0) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (var20 != 0) {
                                                                        break L74;
                                                                      } else {
                                                                        incrementValue$5 = var5;
                                                                        var5++;
                                                                        var23 = -1 + var38.field_j[incrementValue$5];
                                                                        if (var21 >= var55.length) {
                                                                          var20 = -1;
                                                                          break L74;
                                                                        } else {
                                                                          incrementValue$6 = var21;
                                                                          var21++;
                                                                          var20 = var4[incrementValue$6];
                                                                          break L74;
                                                                        }
                                                                      }
                                                                    }
                                                                    this.field_r[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (var20 != 0) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var54.length > var21) {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L76;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.g((byte) -99);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_k[var23] = (short)(this.field_k[var23] + vg.a(32768, -1 + var22 << -658371602));
                                                            var20--;
                                                            this.field_i[var23] = var22;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.d(true);
                                                        this.field_k[var20] = (short)(this.field_k[var20] + (var19 << 1631847880));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.d(true);
                                                    this.field_k[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.e(true);
                                                var19++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var17++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        L77: {
                                          dupTemp$8 = new rc();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.d(true);
                                          if (var16_int <= 0) {
                                            break L77;
                                          } else {
                                            var15_ref.field_c = new byte[var16_int * 2];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.d(true);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L78;
                                          } else {
                                            var15_ref.field_g = new byte[var16_int * 2 + 2];
                                            var40.field_g[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.e(true);
                                    var11_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            var7[var8] = var38.e(true);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = var38.e(true);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L79: {
            var2 = decompiledCaughtException;
            stackIn_207_0 = (RuntimeException) (var2);

            stackIn_207_1 = new StringBuilder().append("wj.<init>(");

            if (param0 == null) {
              stackIn_208_0 = (RuntimeException) ((Object) stackIn_207_0);
              stackIn_208_1 = (StringBuilder) ((Object) stackIn_207_1);
              stackIn_208_2 = "null";
              break L79;
            } else {
              stackIn_208_0 = (RuntimeException) ((Object) stackIn_207_0);
              stackIn_208_1 = (StringBuilder) ((Object) stackIn_207_1);
              stackIn_208_2 = "{...}";
              break L79;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_208_0), stackIn_208_2 + ')');
        }
    }

    static {
        field_o = 500;
    }
}
