/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends fc {
    static String[] field_k;
    short[] field_q;
    byte[] field_l;
    private int[] field_n;
    int field_m;
    byte[] field_r;
    uh[] field_p;
    static boolean field_i;
    byte[] field_j;
    ik[] field_o;

    final void f(int param0) {
        if (param0 != 21645) {
            this.f(21);
        }
        this.field_n = null;
    }

    final boolean a(byte[] param0, int[] param1, byte param2, jc param3) {
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 1;
            var6 = 0;
            if (param2 <= -29) {
              var7 = null;
              var8 = 0;
              L1: while (true) {
                if ((var8 ^ -1) <= -129) {
                  stackIn_23_0 = var5_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        if (0 != param0[var8]) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var9 = this.field_n[var8];
                    if (var9 != 0) {
                      L4: {
                        if (var9 == var6) {
                          break L4;
                        } else {
                          L5: {
                            var6 = var9;
                            var9--;
                            if ((var9 & 1) == 0) {
                              var7 = param3.a(param1, false, var9 >> 87380994);
                              break L5;
                            } else {
                              var7 = param3.a(param1, -2059411540, var9 >> -899237790);
                              break L5;
                            }
                          }
                          if (var7 == null) {
                            var5_int = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (var7 != null) {
                        this.field_o[var8] = (ik) (var7);
                        this.field_n[var8] = 0;
                        break L2;
                      } else {
                        break L2;
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
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("mh.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    final static boolean e(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        var1_ref = cj.field_o;
        synchronized (var1_ref) {
          L0: {
            if (lj.field_d != fc.field_d) {
              kg.field_d = mc.field_K[lj.field_d];
              md.field_d = tk.field_o[lj.field_d];
              lj.field_d = 1 + lj.field_d & param0;
              stackIn_5_0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    public static void d(int param0) {
        if (param0 != -24011) {
            field_i = false;
        }
        field_k = null;
    }

    mh(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        uh dupTemp$8 = null;
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
        uh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        uh var15_ref = null;
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
        int var28_int = 0;
        uh var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        be var38 = null;
        byte[] var39 = null;
        uh var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        uh var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        uh var48 = null;
        uh var49 = null;
        uh var50 = null;
        uh var51 = null;
        uh var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        try {
          L0: {
            this.field_r = new byte[128];
            this.field_j = new byte[128];
            this.field_l = new byte[128];
            this.field_q = new short[128];
            this.field_n = new int[128];
            this.field_p = new uh[128];
            this.field_o = new ik[128];
            var38 = new be(param0);
            var3 = 0;
            L1: while (true) {
              if (-1 == (var38.field_j[var3 + var38.field_k] ^ -1)) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    var3++;
                    var38.field_k = var38.field_k + 1;
                    var5 = var38.field_k;
                    var38.field_k = var38.field_k + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_j[var6 + var38.field_k] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= var6) {
                            var38.field_k = var38.field_k + 1;
                            var6++;
                            var8 = var38.field_k;
                            var38.field_k = var38.field_k + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_j[var38.field_k - -var9] == 0) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var38.field_k = var38.field_k + 1;
                                      var9++;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (-2 <= (var9 ^ -1)) {
                                        var12 = var9;
                                        break L7;
                                      } else {
                                        var53[1] = (byte) 1;
                                        var13_int = 1;
                                        var12 = 2;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var9 <= var14) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.h(16383);
                                              if (var15_int != 0) {
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
                                    var13 = new uh[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var13.length <= var14) {
                                        L12: {
                                          var14 = var38.h(16383);
                                          if (0 >= var14) {
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
                                          var14 = var38.h(16383);
                                          if (0 < var14) {
                                            stackIn_42_0 = new byte[var14 * 2];
                                            break L13;
                                          } else {
                                            stackIn_42_0 = null;
                                            break L13;
                                          }
                                        }
                                        var58 = stackIn_42_0;
                                        var47 = var58;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (-1 == (var38.field_j[var38.field_k - -var17] ^ -1)) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var38.field_k = var38.field_k + 1;
                                                var17++;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (var20 >= 128) {
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
                                                              if (var24 >= 128) {
                                                                var20 = 0;
                                                                var21 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (128 <= var25_int) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (-129 >= (var26 ^ -1)) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (128 <= var27) {
                                                                            this.field_m = var38.h(16383) - -1;
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (var15 == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var46.length <= var27) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.f(-128);
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
                                                                                      if (var27 >= var58.length) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.f(-127);
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
                                                                                      if (var27 >= var12) {
                                                                                        L30: {
                                                                                          if (var15 == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.h(16383);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var27 >= var46.length) {
                                                                                                var27 = var46[0];
                                                                                                var28_int = var46[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var27 <= var29) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var46.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (128 <= var30) {
                                                                                                            var15 = null;
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_j[var30] = (byte)(this.field_j[var30] * var28_int - -32 >> 1690542374);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var46[var29];
                                                                                                        var31 = var15[1 + var29];
                                                                                                        var32 = (var30 + -var27) * var28_int - -((-var27 + var30) / 2);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var33 >= var30) {
                                                                                                            var28_int = var31;
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = mf.a(-var27 + var30, 14, var32);
                                                                                                            var32 = var32 + (-var28_int + var31);
                                                                                                            this.field_j[var33] = (byte)(this.field_j[var33] * var34 - -32 >> 1477188902);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_j[var29] = (byte)(this.field_j[var29] * var28_int - -32 >> -920856602);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var19 - -1 + var38.h(16383);
                                                                                                var15[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 != null) {
                                                                                            var19 = var38.h(16383);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var58.length) {
                                                                                                var27 = var58[0];
                                                                                                var28_int = var58[1] << 649052801;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var58.length <= var29) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if ((var30 ^ -1) <= -129) {
                                                                                                            var27 = 0;
                                                                                                            L41: while (true) {
                                                                                                              if (var27 >= var12) {
                                                                                                                break L36;
                                                                                                              } else {
                                                                                                                var13[var27].field_j = var38.h(16383);
                                                                                                                var27++;
                                                                                                                continue L41;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            L42: {
                                                                                                              var31 = (255 & this.field_r[var30]) - -var28_int;
                                                                                                              if (0 <= var31) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            L43: {
                                                                                                              if ((var31 ^ -1) >= -129) {
                                                                                                                break L43;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L43;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_r[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var16[1 + var29] << 1400793761;
                                                                                                        var32 = var28_int * (var30 + -var27) - -((var30 - var27) / 2);
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L44: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var29 += 2;
                                                                                                            var27 = var30;
                                                                                                            var28_int = var31;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L45: {
                                                                                                              var34 = mf.a(-var27 + var30, 14, var32);
                                                                                                              var35 = var34 + (255 & this.field_r[var37]);
                                                                                                              if ((var35 ^ -1) <= -1) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            L46: {
                                                                                                              if (var35 <= 128) {
                                                                                                                break L46;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L46;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_r[var37] = (byte)var35;
                                                                                                            var32 = var32 + (var31 + -var28_int);
                                                                                                            var37++;
                                                                                                            continue L44;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L47: {
                                                                                                      var30 = var28_int + (this.field_r[var29] & 255);
                                                                                                      if (-1 >= (var30 ^ -1)) {
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
                                                                                                    this.field_r[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.h(16383) + var19 - -1;
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
                                                                                                var13[var27].field_j = var38.h(16383);
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
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L53: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (-1 <= (var52.field_h ^ -1)) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var52.field_l = var38.h(16383);
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
                                                                                                      if (0 >= var51.field_a) {
                                                                                                        break L55;
                                                                                                      } else {
                                                                                                        var51.field_h = var38.h(16383);
                                                                                                        break L55;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L52;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_a = var38.h(16383);
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L56: {
                                                                                              var50 = var13[var27];
                                                                                              var28 = var50;
                                                                                              if (var50.field_c == null) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_f = var38.h(16383);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            L57: {
                                                                                              if (null == var50.field_i) {
                                                                                                break L57;
                                                                                              } else {
                                                                                                var28.field_g = var38.h(16383);
                                                                                                break L57;
                                                                                              }
                                                                                            }
                                                                                            L58: {
                                                                                              if (var28.field_j <= 0) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var28.field_k = var38.h(16383);
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
                                                                                          var28 = var49;
                                                                                          if (null == var49.field_c) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L60: while (true) {
                                                                                              if (var29 >= var49.field_c.length) {
                                                                                                break L59;
                                                                                              } else {
                                                                                                var19 = var38.h(16383) + (1 + var19);
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
                                                                                      var28 = var48;
                                                                                      if (null == var48.field_i) {
                                                                                        break L61;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L62: while (true) {
                                                                                          if (var29 >= var48.field_i.length) {
                                                                                            break L61;
                                                                                          } else {
                                                                                            var19 = var19 - -1 + var38.h(16383);
                                                                                            var48.field_i[var29] = (byte)var19;
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
                                                                                  if (var45.field_c == null) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L64: while (true) {
                                                                                      if (var29 >= var45.field_c.length) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        var45.field_c[var29] = var38.f(-126);
                                                                                        var29 += 2;
                                                                                        continue L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L65: {
                                                                                  if (null == var45.field_i) {
                                                                                    break L65;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L66: while (true) {
                                                                                      if (var45.field_i.length - 2 <= var29) {
                                                                                        break L65;
                                                                                      } else {
                                                                                        var45.field_i[var29] = var38.f(-128);
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
                                                                                  if (var21 < var54.length) {
                                                                                    incrementValue$1 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$1];
                                                                                    break L68;
                                                                                  } else {
                                                                                    var20 = -1;
                                                                                    break L68;
                                                                                  }
                                                                                }
                                                                                if (-1 <= (this.field_n[var27] ^ -1)) {
                                                                                  break L67;
                                                                                } else {
                                                                                  var26 = 1 + var38.h(16383);
                                                                                  break L67;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_j[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L69: {
                                                                          if (this.field_n[var26] == 0) {
                                                                            break L69;
                                                                          } else {
                                                                            L70: {
                                                                              if (-1 != (var20 ^ -1)) {
                                                                                break L70;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 >= var57.length) {
                                                                                  var20 = -1;
                                                                                  break L70;
                                                                                } else {
                                                                                  incrementValue$2 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$2];
                                                                                  break L70;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_p[var26] = (uh) (var25);
                                                                            break L69;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L71: {
                                                                      if (0 == this.field_n[var25_int]) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (0 != var20) {
                                                                            break L72;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_j[incrementValue$3] - -16 << -406894174;
                                                                            if (var21 < var56.length) {
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
                                                                        this.field_r[var25_int] = (byte)var24;
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
                                                                  if (-1 == (this.field_n[var24] ^ -1)) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (0 != var20) {
                                                                        break L74;
                                                                      } else {
                                                                        incrementValue$5 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_j[incrementValue$5] - 1;
                                                                        if (var55.length <= var21) {
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
                                                                    var20--;
                                                                    this.field_l[var24] = (byte)var23;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (0 != var20) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var21 < var54.length) {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L76;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.m(127);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_q[var23] = (short)(this.field_q[var23] + tc.a(-1 + var22 << 1195177710, 32768));
                                                            this.field_n[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.h(16383);
                                                        this.field_q[var20] = (short)(this.field_q[var20] + (var19 << -1427565496));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.h(16383);
                                                    this.field_q[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.f(-128);
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
                                          dupTemp$8 = new uh();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.h(16383);
                                          if (var16_int <= 0) {
                                            break L77;
                                          } else {
                                            var15_ref.field_c = new byte[2 * var16_int];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.h(16383);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L78;
                                          } else {
                                            var15_ref.field_i = new byte[2 + 2 * var16_int];
                                            var40.field_i[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.f(-128);
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
                            var7[var8] = var38.f(-128);
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
                    var4[var5] = var38.f(-126);
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

            stackIn_207_1 = new StringBuilder().append("mh.<init>(");

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
          throw sl.a((Throwable) ((Object) stackIn_208_0), stackIn_208_2 + ')');
        }
    }

    static {
        field_k = new String[]{"All scores", "My scores", "Best each"};
        field_i = false;
    }
}
