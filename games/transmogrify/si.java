/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends wf {
    private int[] field_o;
    static int field_l;
    byte[] field_p;
    hb[] field_j;
    static j field_i;
    nh[] field_m;
    short[] field_k;
    int field_h;
    byte[] field_g;
    byte[] field_n;

    final void d(int param0) {
        if (param0 <= 56) {
            field_i = (j) null;
        }
        this.field_o = null;
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 < 74) {
            field_i = (j) null;
        }
    }

    final boolean a(bl param0, int[] param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == -1) {
              var5_int = 1;
              var6 = 0;
              var7 = null;
              var8 = 0;
              L1: while (true) {
                if ((var8 ^ -1) <= -129) {
                  stackIn_22_0 = var5_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      if (param3 == null) {
                        break L3;
                      } else {
                        if (param3[var8] != 0) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var9 = this.field_o[var8];
                    if (0 != var9) {
                      L4: {
                        if (var6 != var9) {
                          L5: {
                            var6 = var9;
                            var9--;
                            if ((1 & var9) == 0) {
                              var7 = param0.a(param1, var9 >> -2035343518, (byte) 17);
                              break L5;
                            } else {
                              var7 = param0.a(param2 + 1673501265, var9 >> 16721986, param1);
                              break L5;
                            }
                          }
                          if (var7 != null) {
                            break L4;
                          } else {
                            var5_int = 0;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      if (var7 == null) {
                        break L2;
                      } else {
                        this.field_j[var8] = (hb) (var7);
                        this.field_o[var8] = 0;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("si.A(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_22_0 != 0;
        }
    }

    si(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        nh dupTemp$8 = null;
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
        nh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        nh var15_ref = null;
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
        oa var38 = null;
        byte[] var39 = null;
        nh var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        nh var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        nh var48 = null;
        nh var49 = null;
        nh var50 = null;
        nh var51 = null;
        nh var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        try {
          L0: {
            this.field_p = new byte[128];
            this.field_o = new int[128];
            this.field_k = new short[128];
            this.field_n = new byte[128];
            this.field_j = new hb[128];
            this.field_g = new byte[128];
            this.field_m = new nh[128];
            var38 = new oa(param0);
            var3 = 0;
            L1: while (true) {
              if (-1 == (var38.field_g[var3 + var38.field_h] ^ -1)) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var38.field_h = var38.field_h + 1;
                    var3++;
                    var5 = var38.field_h;
                    var38.field_h = var38.field_h + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_g[var38.field_h - -var6] == 0) {
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
                              if (-1 == (var38.field_g[var38.field_h - -var9] ^ -1)) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var38.field_h = var38.field_h + 1;
                                      var9++;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (-2 <= (var9 ^ -1)) {
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
                                              var15_int = var38.d((byte) 72);
                                              if (var15_int != 0) {
                                                L10: {
                                                  if (var15_int > var13_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              } else {
                                                incrementValue$0 = var12;
                                                var12++;
                                                var13_int = incrementValue$0;
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
                                    var13 = new nh[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.d((byte) 91);
                                          if (var14 > 0) {
                                            stackIn_39_0 = new byte[2 * var14];
                                            break L12;
                                          } else {
                                            stackIn_39_0 = null;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var58 = stackIn_39_0;
                                          var46 = var58;
                                          var15 = var46;
                                          var14 = var38.d((byte) 87);
                                          if ((var14 ^ -1) >= -1) {
                                            stackIn_42_0 = null;
                                            break L13;
                                          } else {
                                            stackIn_42_0 = new byte[var14 * 2];
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (var38.field_g[var17 + var38.field_h] == 0) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var17 <= var19) {
                                                var17++;
                                                var38.field_h = var38.field_h + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (128 <= var20) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if ((var20 ^ -1) <= -129) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (128 <= var23) {
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
                                                                  if (var25_int >= 128) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var26) {
                                                                        var20 = 0;
                                                                        var21 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (-129 >= (var27 ^ -1)) {
                                                                            this.field_h = 1 + var38.d((byte) 22);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var12 <= var27) {
                                                                                L24: {
                                                                                  if (var15 == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var58.length <= var27) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.b(true);
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
                                                                                        var16[var27] = var38.b(true);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        L30: {
                                                                                          if (null == var15) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.d((byte) 99);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var58.length <= var27) {
                                                                                                var27 = var58[0];
                                                                                                var28 = var58[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var29 >= var58.length) {
                                                                                                        var15 = null;
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (-129 >= (var30 ^ -1)) {
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_n[var30] = (byte)(this.field_n[var30] * var28 + 32 >> 965878374);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var15[var29 - -1];
                                                                                                        var32 = (-var27 + var30) / 2 + var28 * (var30 - var27);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            var28 = var31;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = dh.b(15, var30 + -var27, var32);
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            this.field_n[var33] = (byte)(32 + var34 * this.field_n[var33] >> -440579962);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_n[var29] = (byte)(this.field_n[var29] * var28 + 32 >> 1824374406);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.d((byte) 98) + var19 + 1;
                                                                                                var15[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 != null) {
                                                                                            var19 = var38.d((byte) 53);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var47.length) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << 1109827777;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var47.length <= var29) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if (128 <= var30) {
                                                                                                            var27 = 0;
                                                                                                            L41: while (true) {
                                                                                                              if (var12 <= var27) {
                                                                                                                break L36;
                                                                                                              } else {
                                                                                                                var13[var27].field_k = var38.d((byte) 90);
                                                                                                                var27++;
                                                                                                                continue L41;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            L42: {
                                                                                                              var31 = var28 + (255 & this.field_p[var30]);
                                                                                                              if (-1 >= (var31 ^ -1)) {
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
                                                                                                            this.field_p[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[1 + var29] << -1713192063;
                                                                                                        var32 = (var30 + -var27) * var28 + (var30 - var27) / 2;
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L44: while (true) {
                                                                                                          if (var37 >= var30) {
                                                                                                            var28 = var31;
                                                                                                            var29 += 2;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L45: {
                                                                                                              var34 = dh.b(15, -var27 + var30, var32);
                                                                                                              var35 = var34 + (255 & this.field_p[var37]);
                                                                                                              if ((var35 ^ -1) <= -1) {
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
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            this.field_p[var37] = (byte)var35;
                                                                                                            var37++;
                                                                                                            continue L44;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L47: {
                                                                                                      var30 = var28 + (255 & this.field_p[var29]);
                                                                                                      if (var30 >= 0) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    L48: {
                                                                                                      if (128 >= var30) {
                                                                                                        break L48;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L48;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_p[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.d((byte) 38) + var19 - -1;
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                break L36;
                                                                                              } else {
                                                                                                var13[var27].field_k = var38.d((byte) 90);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if (var12 <= var27) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var27 >= var12) {
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
                                                                                                          if (var52.field_e <= 0) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var52.field_i = var38.d((byte) 92);
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
                                                                                                      if (var51.field_a <= 0) {
                                                                                                        break L55;
                                                                                                      } else {
                                                                                                        var51.field_e = var38.d((byte) 125);
                                                                                                        break L55;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L52;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_a = var38.d((byte) 113);
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L56: {
                                                                                              var50 = var13[var27];
                                                                                              if (var50.field_g == null) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_f = var38.d((byte) 50);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            L57: {
                                                                                              if (null == var50.field_c) {
                                                                                                break L57;
                                                                                              } else {
                                                                                                var50.field_d = var38.d((byte) 125);
                                                                                                break L57;
                                                                                              }
                                                                                            }
                                                                                            L58: {
                                                                                              if (var50.field_k <= 0) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var50.field_b = var38.d((byte) 22);
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
                                                                                          if (null == var49.field_g) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L60: while (true) {
                                                                                              if (var29 >= var49.field_g.length) {
                                                                                                break L59;
                                                                                              } else {
                                                                                                var19 = 1 + var19 - -var38.d((byte) 71);
                                                                                                var49.field_g[var29] = (byte)var19;
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
                                                                                      if (var48.field_c == null) {
                                                                                        break L61;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L62: while (true) {
                                                                                          if (var48.field_c.length <= var29) {
                                                                                            break L61;
                                                                                          } else {
                                                                                            var19 = var19 + (1 - -var38.d((byte) 86));
                                                                                            var48.field_c[var29] = (byte)var19;
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
                                                                                  if (null == var45.field_g) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L64: while (true) {
                                                                                      if (var45.field_g.length <= var29) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        var45.field_g[var29] = var38.b(true);
                                                                                        var29 += 2;
                                                                                        continue L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L65: {
                                                                                  if (null == var45.field_c) {
                                                                                    break L65;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L66: while (true) {
                                                                                      if (var45.field_c.length - 2 <= var29) {
                                                                                        break L65;
                                                                                      } else {
                                                                                        var45.field_c[var29] = var38.b(true);
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
                                                                              if (-1 != (var20 ^ -1)) {
                                                                                break L67;
                                                                              } else {
                                                                                L68: {
                                                                                  if (var54.length <= var21) {
                                                                                    var20 = -1;
                                                                                    break L68;
                                                                                  } else {
                                                                                    incrementValue$1 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$1];
                                                                                    break L68;
                                                                                  }
                                                                                }
                                                                                if (-1 <= (this.field_o[var27] ^ -1)) {
                                                                                  break L67;
                                                                                } else {
                                                                                  var26 = var38.d((byte) 99) + 1;
                                                                                  break L67;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_n[var27] = (byte)var26;
                                                                            var20--;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L69: {
                                                                          if (-1 == (this.field_o[var26] ^ -1)) {
                                                                            break L69;
                                                                          } else {
                                                                            L70: {
                                                                              if (var20 != 0) {
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
                                                                            this.field_m[var26] = (nh) (var25);
                                                                            break L69;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L71: {
                                                                      if (this.field_o[var25_int] == 0) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (var20 != 0) {
                                                                            break L72;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_g[incrementValue$3] + 16 << 967768098;
                                                                            if (var56.length > var21) {
                                                                              incrementValue$4 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$4];
                                                                              break L72;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L72;
                                                                            }
                                                                          }
                                                                        }
                                                                        this.field_p[var25_int] = (byte)var24;
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
                                                                  if (this.field_o[var24] == 0) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (var20 != 0) {
                                                                        break L74;
                                                                      } else {
                                                                        L75: {
                                                                          if (var55.length > var21) {
                                                                            incrementValue$5 = var21;
                                                                            var21++;
                                                                            var20 = var4[incrementValue$5];
                                                                            break L75;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L75;
                                                                          }
                                                                        }
                                                                        incrementValue$6 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_g[incrementValue$6] + -1;
                                                                        break L74;
                                                                      }
                                                                    }
                                                                    this.field_g[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L76: {
                                                              if (var20 != 0) {
                                                                break L76;
                                                              } else {
                                                                L77: {
                                                                  if (var54.length <= var21) {
                                                                    var20 = -1;
                                                                    break L77;
                                                                  } else {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L77;
                                                                  }
                                                                }
                                                                var22 = var38.i(17783);
                                                                break L76;
                                                              }
                                                            }
                                                            this.field_k[var23] = (short)(this.field_k[var23] + (vg.c(2, var22 + -1) << -524218994));
                                                            this.field_o[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.d((byte) 56);
                                                        this.field_k[var20] = (short)(this.field_k[var20] + (var19 << -2087784504));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.d((byte) 45);
                                                    this.field_k[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.b(true);
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
                                        L78: {
                                          dupTemp$8 = new nh();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.d((byte) 63);
                                          if (0 >= var16_int) {
                                            break L78;
                                          } else {
                                            var15_ref.field_g = new byte[var16_int * 2];
                                            break L78;
                                          }
                                        }
                                        L79: {
                                          var16_int = var38.d((byte) 90);
                                          if (var16_int <= 0) {
                                            break L79;
                                          } else {
                                            var15_ref.field_c = new byte[2 + var16_int * 2];
                                            var40.field_c[1] = (byte)64;
                                            break L79;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.b(true);
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
                            var7[var8] = var38.b(true);
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
                    var4[var5] = var38.b(true);
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
          L80: {
            var2 = decompiledCaughtException;
            stackIn_207_0 = (RuntimeException) (var2);

            stackIn_207_1 = new StringBuilder().append("si.<init>(");

            if (param0 == null) {
              stackIn_208_0 = (RuntimeException) ((Object) stackIn_207_0);
              stackIn_208_1 = (StringBuilder) ((Object) stackIn_207_1);
              stackIn_208_2 = "null";
              break L80;
            } else {
              stackIn_208_0 = (RuntimeException) ((Object) stackIn_207_0);
              stackIn_208_1 = (StringBuilder) ((Object) stackIn_207_1);
              stackIn_208_2 = "{...}";
              break L80;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_208_0), stackIn_208_2 + ')');
        }
    }

    static {
        field_i = new j(8, 161, 247);
    }
}
