/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vsa extends dg {
    private faa[][] field_q;
    private int field_p;
    static vna field_m;
    private int field_r;
    private int field_s;
    private int field_n;
    private int field_t;
    private lpa field_o;

    final int k(byte param0) {
        int var2 = 0;
        if (param0 == -99) {
          if (!this.field_h.j(param0 + 98)) {
            var2 = this.field_t;
            if (var2 != 0) {
              return 3;
            } else {
              return 3;
            }
          } else {
            return 2;
          }
        } else {
          this.field_q = (faa[][]) null;
          if (!this.field_h.j(param0 + 98)) {
            var2 = this.field_t;
            if (var2 == 0) {
              return 3;
            } else {
              return 3;
            }
          } else {
            return 2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var35 = null;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var25 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ufa.a(-76, param1);
              var7_int = param2;
              var8 = -param5 + param1;
              if (-1 < (var8 ^ -1)) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var9 = param1;
            var10 = -param1;
            var11 = var8;
            var12 = -var8;
            var13 = -1;
            var14 = -1;
            var35 = vaa.field_a[param0];
            var16 = param6 + -var8;
            nra.a((byte) -55, param4, var16, var35, param6 - param1);
            var17 = param6 - -var8;
            nra.a((byte) -55, param3, var17, var35, var16);
            nra.a((byte) -55, param4, param6 - -param1, var35, var17);
            L2: while (true) {
              if (var7_int >= var9) {
                break L0;
              } else {
                var13 += 2;
                var14 += 2;
                var10 = var10 + var13;
                var12 = var12 + var14;
                if (var25 == 0) {
                  L3: {
                    if (0 > var12) {
                      break L3;
                    } else {
                      if (-2 >= (var11 ^ -1)) {
                        pqa.field_m[var11] = var7_int;
                        var11--;
                        var12 = var12 - (var11 << 1918626241);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var7_int++;
                    if (var10 >= 0) {
                      L5: {
                        var9--;
                        var10 = var10 - (var9 << -816375967);
                        if (var9 >= var8) {
                          break L5;
                        } else {
                          var28 = vaa.field_a[param0 + var9];
                          var29 = vaa.field_a[-var9 + param0];
                          var20 = pqa.field_m[var9];
                          var21 = param6 - -var7_int;
                          var22 = -var7_int + param6;
                          var23 = param6 - -var20;
                          var24 = param6 + -var20;
                          nra.a((byte) -55, param4, var24, var28, var22);
                          nra.a((byte) -55, param3, var23, var28, var24);
                          nra.a((byte) -55, param4, var21, var28, var23);
                          nra.a((byte) -55, param4, var24, var29, var22);
                          nra.a((byte) -55, param3, var23, var29, var24);
                          nra.a((byte) -55, param4, var21, var29, var23);
                          if (var25 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var30 = vaa.field_a[var9 + param0];
                      var26 = vaa.field_a[-var9 + param0];
                      var19 = var26;
                      var20 = param6 - -var7_int;
                      var21 = param6 - var7_int;
                      nra.a((byte) -55, param4, var20, var30, var21);
                      nra.a((byte) -55, param4, var20, var26, var21);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    L7: {
                      var31 = vaa.field_a[var7_int + param0];
                      var32 = vaa.field_a[-var7_int + param0];
                      var20 = var9 + param6;
                      var21 = param6 - var9;
                      if (var7_int < var8) {
                        break L7;
                      } else {
                        nra.a((byte) -55, param4, var20, var31, var21);
                        nra.a((byte) -55, param4, var20, var32, var21);
                        if (var25 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var7_int > var11) {
                        stackOut_22_0 = pqa.field_m[var7_int];
                        stackIn_23_0 = stackOut_22_0;
                        break L8;
                      } else {
                        stackOut_21_0 = var11;
                        stackIn_23_0 = stackOut_21_0;
                        break L8;
                      }
                    }
                    var22 = stackIn_23_0;
                    var23 = param6 - -var22;
                    var24 = param6 - var22;
                    nra.a((byte) -55, param4, var24, var31, var21);
                    nra.a((byte) -55, param3, var23, var31, var24);
                    nra.a((byte) -55, param4, var20, var31, var23);
                    nra.a((byte) -55, param4, var24, var32, var21);
                    nra.a((byte) -55, param3, var23, var32, var24);
                    nra.a((byte) -55, param4, var20, var32, var23);
                    break L6;
                  }
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "vsa.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(uw param0, int param1) {
        try {
            super.a(param0, 85);
            if (param1 <= 82) {
                field_m = (vna) null;
            }
            this.field_q = (faa[][]) null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0, int param1) {
        this.field_t = param1;
        if (param0 != 80) {
            uw var4 = (uw) null;
            this.a((uw) null, 105);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            super.a(param0, param1, param2);
            if (param0 instanceof lpa) {
              this.field_o = (lpa) ((Object) param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("vsa.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, faa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = this.field_t;
              if (-1 != (var3_int ^ -1)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var3_int = param1.field_b;
                  if (var3_int != 0) {
                    break L4;
                  } else {
                    if (var4 == 0) {
                      param1.field_f = new bua(1, 62);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                if (var3_int == 1) {
                  break L3;
                } else {
                  break L3;
                }
              }
              param1.field_f = new bua(1, 63);
              break L2;
            }
            if (param0) {
              break L0;
            } else {
              this.n((byte) -52);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("vsa.L(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    vsa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        faa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        super.h(19);
        if (this.field_q != null) {
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_p <= var2) {
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_13_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    var3 = stackIn_5_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (this.field_r <= var3) {
                            break L5;
                          } else {
                            var4 = this.field_q[var2][var3];
                            var5 = uja.field_c[var4.field_b];
                            var4.field_e = dfa.a(-var4.field_e + var5, 2048, -31);
                            var4.field_d = -var4.field_d;
                            var3++;
                            if (var6 != 0) {
                              break L4;
                            } else {
                              if (var6 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2++;
                        break L4;
                      }
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_12_0 = param0;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            if (stackIn_13_0 < 0) {
              this.field_q = (faa[][]) null;
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(cn param0, fia param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                hna.field_a = param1;
                aqa.field_c = "";
                af.field_b = param0;
                if (!oj.field_vb.startsWith("win")) {
                  break L2;
                } else {
                  aqa.field_c = aqa.field_c + "windows/";
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (oj.field_vb.startsWith("linux")) {
                  break L3;
                } else {
                  if (!oj.field_vb.startsWith("mac")) {
                    break L1;
                  } else {
                    aqa.field_c = aqa.field_c + "macos/";
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              aqa.field_c = aqa.field_c + "linux/";
              break L1;
            }
            L4: {
              L5: {
                if (hna.field_a.field_p) {
                  break L5;
                } else {
                  L6: {
                    if (oj.field_zb.startsWith("amd64")) {
                      break L6;
                    } else {
                      if (oj.field_zb.startsWith("x86_64")) {
                        break L6;
                      } else {
                        L7: {
                          if (oj.field_zb.startsWith("i386")) {
                            break L7;
                          } else {
                            if (oj.field_zb.startsWith("i486")) {
                              break L7;
                            } else {
                              if (oj.field_zb.startsWith("i586")) {
                                break L7;
                              } else {
                                if (oj.field_zb.startsWith("x86")) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (oj.field_zb.startsWith("ppc")) {
                                      break L8;
                                    } else {
                                      aqa.field_c = aqa.field_c + "universal/";
                                      if (var4 == 0) {
                                        break L4;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  aqa.field_c = aqa.field_c + "ppc/";
                                  if (var4 == 0) {
                                    break L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        aqa.field_c = aqa.field_c + "x86/";
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  aqa.field_c = aqa.field_c + "x86_64/";
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              aqa.field_c = aqa.field_c + "msjava/";
              break L4;
            }
            var3_int = -13 % ((9 - param2) / 41);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("vsa.B(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 29 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(120, param1, param2);
              this.field_t = param2.b((byte) 44, 4);
              if (param0 >= 119) {
                break L1;
              } else {
                this.field_t = -32;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vsa.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final int o(byte param0) {
        int var2 = 68 / ((param0 - 56) / 43);
        return this.field_n;
    }

    final void d(int param0) {
        ac var4 = null;
        fsa var5 = null;
        hca var6 = null;
        fsa var7 = null;
        hca var8 = null;
        fsa var9 = null;
        hca var10 = null;
        super.d(param0);
        if (this.field_o != null) {
          if (!this.field_o.d(false)) {
            var9 = (fsa) ((Object) this.field_h);
            if (var9 != null) {
              var10 = var9.H(param0 ^ 117);
              if (var10 == null) {
                return;
              } else {
                L0: {
                  if (var9.a((byte) 110, var10.e(param0 ^ -9649), var10.d(3), var10.a((byte) 55), var10.c(-40))) {
                    var4 = var10.n((byte) -56);
                    if (var4 == null) {
                      return;
                    } else {
                      ((hf) ((Object) var4)).field_k = 2;
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_n = uca.field_c.a(262144, 0) + -131072;
            this.field_s = -131072 + uca.field_c.a(262144, 0);
            var7 = (fsa) ((Object) this.field_h);
            if (var7 != null) {
              var8 = var7.H(param0 ^ 117);
              if (var8 == null) {
                return;
              } else {
                L1: {
                  if (var7.a((byte) 110, var8.e(param0 ^ -9649), var8.d(3), var8.a((byte) 55), var8.c(-40))) {
                    var4 = var8.n((byte) -56);
                    if (var4 == null) {
                      return;
                    } else {
                      ((hf) ((Object) var4)).field_k = 2;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var5 = (fsa) ((Object) this.field_h);
          if (var5 != null) {
            var6 = var5.H(param0 ^ 117);
            if (var6 == null) {
              return;
            } else {
              L2: {
                if (var5.a((byte) 110, var6.e(param0 ^ -9649), var6.d(3), var6.a((byte) 55), var6.c(-40))) {
                  var4 = var6.n((byte) -56);
                  if (var4 == null) {
                    return;
                  } else {
                    ((hf) ((Object) var4)).field_k = 2;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -59, param1);
            int var3_int = -50 / ((param0 - -8) / 40);
            param1.a((byte) 18, this.field_t, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, uw param1) {
        try {
            if (this.field_q == null) {
                this.n((byte) -128);
            }
            super.b(param0 ^ param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int p(byte param0) {
        int discarded$0 = 0;
        if (param0 < 4) {
            discarded$0 = this.o((byte) 99);
            return this.field_s;
        }
        return this.field_s;
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 > 50) {
              L1: {
                if (null == this.field_q) {
                  break L1;
                } else {
                  var4_int = 0;
                  L2: while (true) {
                    if (this.field_p <= var4_int) {
                      break L1;
                    } else {
                      if (var6 == 0) {
                        var5 = 0;
                        L3: while (true) {
                          L4: {
                            if (this.field_r <= var5) {
                              var4_int++;
                              break L4;
                            } else {
                              param2.a((byte) -125, param1, this.field_q[var4_int][var5]);
                              var5++;
                              if (var6 != 0) {
                                break L4;
                              } else {
                                continue L3;
                              }
                            }
                          }
                          continue L2;
                        }
                      } else {
                        return;
                      }
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("vsa.V(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void n(byte param0) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        faa var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        la var20 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          L1: {
            var19 = TombRacer.field_G ? 1 : 0;
            var20 = this.a(78);
            var3 = this.field_h.d(3);
            var4 = this.field_h.e(9648);
            var5 = this.field_h.c(-56);
            var6 = this.field_h.a((byte) 55);
            if (var5 < var6) {
              break L1;
            } else {
              var6 = 2097152;
              if (var19 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var5 = 2097152;
          break L0;
        }
        this.field_r = var6 / 2097152;
        this.field_p = var5 / 2097152;
        this.field_q = new faa[this.field_p][this.field_r];
        var7 = -(var6 / 2) + var4 + 1048576;
        var9 = 123 % ((param0 - -16) / 56);
        var8 = 0;
        L2: while (true) {
          if (var8 < this.field_r) {
            var10 = 1048576 + (var3 - var5 / 2);
            if (var19 == 0) {
              var11 = 0;
              L3: while (true) {
                L4: {
                  if (var11 >= this.field_p) {
                    stackOut_48_0 = var7;
                    stackOut_48_1 = 2097152;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    break L4;
                  } else {
                    var12 = new faa();
                    this.field_q[var11][var8] = var12;
                    stackOut_10_0 = var11 ^ -1;
                    stackOut_10_1 = -1;
                    stackIn_49_0 = stackOut_10_0;
                    stackIn_49_1 = stackOut_10_1;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L5: {
                        if (stackIn_11_0 >= stackIn_11_1) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          break L5;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L5;
                        }
                      }
                      L6: {
                        var13 = stackIn_14_0;
                        if (var11 >= -1 + this.field_p) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L6;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L6;
                        }
                      }
                      L7: {
                        var14 = stackIn_17_0;
                        if (var8 <= 0) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L7;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L7;
                        }
                      }
                      L8: {
                        var15 = stackIn_20_0;
                        if (var8 >= this.field_r + -1) {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          break L8;
                        } else {
                          stackOut_21_0 = 1;
                          stackIn_23_0 = stackOut_21_0;
                          break L8;
                        }
                      }
                      L9: {
                        var16 = stackIn_23_0;
                        var17 = 0;
                        if (var13 == 0) {
                          break L9;
                        } else {
                          var17++;
                          break L9;
                        }
                      }
                      L10: {
                        if (var14 != 0) {
                          var17++;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (var15 != 0) {
                          var17++;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (var16 == 0) {
                          break L12;
                        } else {
                          var17++;
                          break L12;
                        }
                      }
                      L13: {
                        L14: {
                          var18 = 0;
                          var12.field_c = (vsa) (this);
                          if ((var17 ^ -1) != -2) {
                            break L14;
                          } else {
                            L15: {
                              L16: {
                                if (var15 == 0) {
                                  break L16;
                                } else {
                                  var18 = 1024;
                                  if (var19 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (var14 != 0) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (var16 != 0) {
                                      break L18;
                                    } else {
                                      var18 = 512;
                                      if (var19 == 0) {
                                        break L15;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var18 = 0;
                                  if (var19 == 0) {
                                    break L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              var18 = -512;
                              break L15;
                            }
                            var12.field_b = 0;
                            if (var19 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L19: {
                          L20: {
                            if (var14 == 0) {
                              break L20;
                            } else {
                              if (var13 == 0) {
                                break L20;
                              } else {
                                var18 = 512;
                                if (var19 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          var18 = 0;
                          break L19;
                        }
                        var12.field_b = 1;
                        break L13;
                      }
                      var12.field_e = dfa.a(var18 + uja.field_c[var12.field_b], 2048, -54);
                      var12.field_a = var7 + -var4;
                      var12.field_d = var10 - var3;
                      discarded$1 = var20.e(true).a(100, 0);
                      var10 = var10 + 2097152;
                      this.a(true, var12);
                      var11++;
                      continue L3;
                    }
                  }
                }
                var7 = stackIn_49_0 + stackIn_49_1;
                var8++;
                continue L2;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        byte stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_q) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    if (this.field_p <= var4_int) {
                      break L2;
                    } else {
                      stackOut_4_0 = 0;
                      stackIn_13_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        var5 = stackIn_5_0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var5 >= this.field_r) {
                                break L6;
                              } else {
                                param1.a(param0, this.field_q[var4_int][var5], (byte) -33);
                                var5++;
                                if (var6 != 0) {
                                  break L5;
                                } else {
                                  if (var6 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var4_int++;
                            break L5;
                          }
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_12_0 = param2;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            if (stackIn_13_0 >= 40) {
              break L0;
            } else {
              this.field_r = 57;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("vsa.FA(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
    }

    public static void q(byte param0) {
        if (param0 >= -121) {
            return;
        }
        field_m = null;
    }

    vsa(int param0) {
        super(param0);
    }

    final static void c(byte param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        rha var6_ref_rha = null;
        int var7 = 0;
        byte[] var8 = null;
        rha var9 = null;
        byte[] var10 = null;
        rha var11 = null;
        byte[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 >= 107) {
              L1: {
                L2: {
                  if (-1 == (oh.field_o ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var2_long = bva.b((byte) -107);
                      var4 = oh.field_o;
                      if (0.0 != sua.field_J) {
                        var4 = (int)((double)var4 + lpa.field_p.nextGaussian() * sua.field_J);
                        if (0 <= var4) {
                          break L3;
                        } else {
                          var4 = 0;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if ((ql.field_k.field_h ^ -1) >= -1) {
                        break L4;
                      } else {
                        var12 = new byte[ql.field_k.field_h];
                        var10 = var12;
                        var8 = var10;
                        var5 = var8;
                        var6 = 0;
                        L5: while (true) {
                          L6: {
                            if (var12.length <= var6) {
                              break L6;
                            } else {
                              var8[var6] = ql.field_k.field_g[var6];
                              var6++;
                              if (var7 != 0) {
                                break L4;
                              } else {
                                if (var7 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var6_ref_rha = new rha(var2_long + (long)var4, ql.field_k.field_h, var12);
                          jla.field_z.b((byte) -71, var6_ref_rha);
                          ql.field_k.field_h = 0;
                          break L4;
                        }
                      }
                    }
                    var9 = (rha) ((Object) jla.field_z.f(-80));
                    var11 = var9;
                    if (var11 == null) {
                      break L2;
                    } else {
                      if (var11.field_f < var2_long) {
                        var11.p(117);
                        var6 = 0;
                        L7: while (true) {
                          L8: {
                            if (var11.field_i <= var6) {
                              break L8;
                            } else {
                              ql.field_k.field_g[var6] = var9.field_g[var6];
                              var6++;
                              if (var7 != 0) {
                                break L1;
                              } else {
                                if (var7 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          ql.field_k.field_h = var11.field_i;
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                bl.a(param1, -1);
                break L1;
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
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "vsa.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, jea param1) {
        RuntimeException runtimeException = null;
        int var3 = 0;
        jea var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (jea) ((Object) param1.field_J.f(-80));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    var4.field_K = 0;
                    var4.field_O = 0;
                    var4.field_T = 0;
                    var4.field_t = 0;
                    var4 = (jea) ((Object) param1.field_J.e(112));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                param1.field_t = 0;
                break L2;
              }
              L4: {
                if (param0 <= -86) {
                  break L4;
                } else {
                  field_m = (vna) null;
                  break L4;
                }
              }
              param1.field_T = 0;
              param1.field_O = 0;
              param1.field_K = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("vsa.J(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_m = new vna();
    }
}
