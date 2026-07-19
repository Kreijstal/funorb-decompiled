/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends nc {
    static cj field_l;
    static String field_q;
    static String field_p;
    static int field_r;
    static String field_o;
    private int field_n;
    private int field_t;
    private int[] field_s;
    private int[] field_m;

    final int d(int param0, int param1) {
        if (param0 < -65) {
          if (wc.j(106)) {
            if (this.field_d != 6) {
              if (-1 == (param1 ^ -1)) {
                return 350 + this.a((byte) -118, param1);
              } else {
                return 100 + this.a((byte) -118, param1);
              }
            } else {
              return this.a((byte) -118, param1) - -this.field_k;
            }
          } else {
            return this.a((byte) -118, param1) - -this.field_k;
          }
        } else {
          field_p = (String) null;
          if (wc.j(106)) {
            if (this.field_d != 6) {
              if (-1 == (param1 ^ -1)) {
                return 350 + this.a((byte) -118, param1);
              } else {
                return 100 + this.a((byte) -118, param1);
              }
            } else {
              return this.a((byte) -118, param1) - -this.field_k;
            }
          } else {
            return this.a((byte) -118, param1) - -this.field_k;
          }
        }
    }

    final void a(boolean param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        String[] var2 = null;
        String[] var3 = null;
        String var4 = null;
        String var5 = null;
        sl var6 = null;
        ef var7 = null;
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
        String[] var19 = null;
        ri var20 = null;
        ri var21 = null;
        ri var22 = null;
        ri var23 = null;
        int var24 = 0;
        int var25 = 0;
        L0: {
          var18 = ZombieDawnMulti.field_E ? 1 : 0;
          super.a(param0);
          var19 = dg.field_G;
          var2 = var19;
          var3 = ih.field_e;
          var4 = vg.field_n;
          var5 = nk.field_q;
          var6 = ah.field_e;
          var7 = pb.field_e;
          if (this.field_d == 6) {
            var7.b(sn.field_Mb, 320, 300, 16777215, 0);
            break L0;
          } else {
            break L0;
          }
        }
        var8 = ng.field_e;
        var9 = 0;
        L1: while (true) {
          L2: {
            L3: {
              L4: {
                if (sf.field_b <= var9) {
                  var7.b(kb.field_E, 320, var8 - -72, 16777215, 0);
                  var7.b(vk.field_G, 320, 18 + (40 + (var8 + 32)), 14540083, 0);
                  var9 = -1;
                  if (this.field_t == -1) {
                    break L3;
                  } else {
                    break L4;
                  }
                } else {
                  var25 = 6;
                  var24 = this.field_d;
                  if (var18 != 0) {
                    if (var24 != var25) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 == this.field_n) {
                          break L5;
                        } else {
                          var9 = this.field_n;
                          break L5;
                        }
                      }
                      if (var9 != -1) {
                        var19 = var2;
                        var20 = this.g(0, var9);
                        var20.a(110, 140);
                        discarded$2 = var6.a(var19[var9], 260, 105, 300, 85, 0, 0, 1, 2, 35);
                        var11 = 280;
                        var12 = 200;
                        var13 = 280;
                        var14 = 100;
                        var15 = var7.field_C - -var7.field_r;
                        var16 = var15 * var7.a(var3[var9], var11, var12, var13, var14, 16777215, 0, 0, 0, var15);
                        var12 = var12 + (var16 - (-var15 + -6));
                        var7.c(var5 + 100 * ra.field_n[var9], var11, var12, 16777215, 0);
                        var12 = var12 + (6 + var15);
                        var7.c(var4, var11, var12, 16777215, 0);
                        var11 = var11 + var7.a(var4);
                        var17 = 0;
                        L6: while (true) {
                          if (ra.field_n[var9] > var17) {
                            of.field_k.g(var17 * (of.field_k.field_z >> -873579583) + var11, 2 + -of.field_k.field_u + var12);
                            var17++;
                            if (var18 == 0) {
                              continue L6;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    L7: {
                      L8: {
                        if (var24 != var25) {
                          break L8;
                        } else {
                          if (this.h(var9, 86)) {
                            break L8;
                          } else {
                            if (var18 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (!this.f(-1, var9)) {
                        break L7;
                      } else {
                        L9: {
                          var10 = this.field_m[var9];
                          var11 = this.field_s[var9];
                          if (this.field_t == var9) {
                            oo.b(-3 + var10, -3 + var11, 38, 38, 6, 0, 128);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        if (this.field_n != var9) {
                          var21 = this.g(0, var9);
                          var21.b(var10, var11);
                          break L7;
                        } else {
                          oo.b(var10 + -3, var11 + -3, 38, 38, 6, 16777215);
                          var22 = this.g(0, var9);
                          var22.b(var10, var11);
                          break L7;
                        }
                      }
                    }
                    var9++;
                    continue L1;
                  }
                }
              }
              var9 = this.field_t;
              if (var18 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
            if (-1 == this.field_n) {
              break L2;
            } else {
              var9 = this.field_n;
              break L2;
            }
          }
          if (var9 != -1) {
            var23 = this.g(0, var9);
            var23.a(110, 140);
            discarded$3 = var6.a(var19[var9], 260, 105, 300, 85, 0, 0, 1, 2, 35);
            var11 = 280;
            var12 = 200;
            var13 = 280;
            var14 = 100;
            var15 = var7.field_C - -var7.field_r;
            var16 = var15 * var7.a(var3[var9], var11, var12, var13, var14, 16777215, 0, 0, 0, var15);
            var12 = var12 + (var16 - (-var15 + -6));
            var7.c(var5 + 100 * ra.field_n[var9], var11, var12, 16777215, 0);
            var12 = var12 + (6 + var15);
            var7.c(var4, var11, var12, 16777215, 0);
            var11 = var11 + var7.a(var4);
            var17 = 0;
            L10: while (true) {
              if (ra.field_n[var9] > var17) {
                of.field_k.g(var17 * (of.field_k.field_z >> -873579583) + var11, 2 + -of.field_k.field_u + var12);
                var17++;
                if (var18 == 0) {
                  continue L10;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var15 = null;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_7_0 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(0, param1, param2);
        this.field_m = new int[sf.field_b];
        this.field_s = new int[sf.field_b];
        this.field_t = -1;
        this.field_n = -1;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var5 >= sf.field_b) {
                break L2;
              } else {
                stackOut_2_0 = this.f(-1, var5);
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var11 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0) {
                      var4++;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5++;
                  if (var11 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            sf.field_a = (640 - (sf.field_g - 8) * var4 - (var4 - 1) * (-sf.field_g + sf.field_e)) / 2;
            var5 = sf.field_a;
            stackOut_7_0 = ng.field_e;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          var6 = stackIn_8_0;
          var7 = param0;
          var8 = 0;
          L4: while (true) {
            if (var8 < sf.field_b) {
              if (var11 == 0) {
                L5: {
                  L6: {
                    if (this.f(param0 ^ -1, var8)) {
                      break L6;
                    } else {
                      var15 = this.field_m;
                      var10 = var8;
                      this.field_s[var8] = -100;
                      var15[var10] = -100;
                      if (var11 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = var5;
                  var10 = var6;
                  this.field_m[var8] = var9;
                  if ((var7 % 2 ^ -1) != -2) {
                    var7++;
                    this.field_s[var8] = var10;
                    var5 = var5 + (sf.field_e - 8);
                    break L5;
                  } else {
                    var10 += 24;
                    var7++;
                    this.field_s[var8] = var10;
                    var5 = var5 + (sf.field_e - 8);
                    break L5;
                  }
                }
                var8++;
                continue L4;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (-7 == (this.field_d ^ -1)) {
          L0: {
            if (-1 == (param1 ^ -1)) {
              stackOut_4_0 = 100;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 350;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_5_0;
        } else {
          if (param0 == -118) {
            if (wc.j(108)) {
              L1: {
                if (0 != param1) {
                  stackOut_12_0 = 470;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  stackOut_11_0 = 50;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
              }
              return stackIn_13_0;
            } else {
              return 320 - (this.field_k >> 186654753);
            }
          } else {
            return 51;
          }
        }
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_5_0 = null;
        Class stackOut_9_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_30_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (!param0.equals("B")) {
              if (param0.equals("I")) {
                stackOut_5_0 = Integer.TYPE;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.equals("S")) {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.equals("J")) {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackOut_20_0 = Float.TYPE;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L1: {
                          if (param1 < -16) {
                            break L1;
                          } else {
                            mq.e(-4);
                            break L1;
                          }
                        }
                        if (!param0.equals("D")) {
                          if (!param0.equals("C")) {
                            stackOut_30_0 = Class.forName(param0);
                            stackIn_31_0 = stackOut_30_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackOut_28_0 = Character.TYPE;
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackOut_25_0 = Double.TYPE;
                          stackIn_26_0 = stackOut_25_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("mq.A(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        field_p = null;
        if (param0 != 22324) {
            mq.e(-115);
        }
    }

    private final ri g(int param0, int param1) {
        if (this.h(param1, 29)) {
            return la.field_l[param1];
        }
        if (param0 != 0) {
            return (ri) null;
        }
        return wl.field_l;
    }

    private final boolean h(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int[] stackIn_4_0 = null;
        int[] stackIn_8_0 = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_2_0 = null;
        if (param1 <= 10) {
          L0: {
            field_l = (cj) null;
            if (this.field_d == 6) {
              stackOut_7_0 = fc.field_m;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = k.field_n;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var4 = stackIn_8_0;
          var3 = var4;
          return fq.a(param0, 127, var4);
        } else {
          L1: {
            if (this.field_d == 6) {
              stackOut_3_0 = fc.field_m;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = k.field_n;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var4 = stackIn_4_0;
          var3 = var4;
          return fq.a(param0, 127, var4);
        }
    }

    mq(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_n = -1;
        this.field_t = -1;
    }

    private final boolean e(int param0, int param1) {
        if (param0 == -17) {
          if (-14 != (param1 ^ -1)) {
            if ((param1 ^ -1) == -17) {
              if (le.b(0, (byte) -70)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          mq.e(-71);
          if (-14 != (param1 ^ -1)) {
            if ((param1 ^ -1) == -17) {
              if (le.b(0, (byte) -70)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    private final boolean f(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -1) {
          if (!this.h(param1, 119)) {
            if (!this.e(-17, param1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_n = -73;
          if (this.h(param1, 119)) {
            return true;
          } else {
            L0: {
              if (this.e(-17, param1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        this.field_n = -1;
        var2 = sf.field_e - sf.field_g >> 39186209;
        if (ng.field_e < bo.field_d) {
          if (ng.field_e - -(2 * sf.field_g) > bo.field_d) {
            if (sf.field_a + -var2 < bd.field_g) {
              var3 = -1;
              var4 = 0;
              L0: while (true) {
                if (var4 < sf.field_b) {
                  L1: {
                    L2: {
                      var7 = bd.field_g ^ -1;
                      var6 = this.field_m[var4] ^ -1;
                      if (var5 != 0) {
                        if (var6 >= var7) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        L3: {
                          if (var6 < var7) {
                            break L3;
                          } else {
                            if (sf.field_g + this.field_m[var4] <= bd.field_g) {
                              break L3;
                            } else {
                              if (bo.field_d < this.field_s[var4]) {
                                break L3;
                              } else {
                                if (bo.field_d >= sf.field_g + this.field_s[var4]) {
                                  break L3;
                                } else {
                                  var3 = var4;
                                  if (var5 == 0) {
                                    if (sf.field_b <= var3) {
                                      break L1;
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4++;
                        continue L0;
                      }
                    }
                    L4: {
                      this.field_n = var3;
                      if (-7 != (this.field_d ^ -1)) {
                        break L4;
                      } else {
                        if (this.field_n < 0) {
                          break L4;
                        } else {
                          if (!this.h(this.field_n, 47)) {
                            this.field_n = -1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (-1 != (kd.field_b ^ -1)) {
                      L5: {
                        if (this.field_t != this.field_n) {
                          if (-1 != this.field_n) {
                            this.field_t = this.field_n;
                            break L5;
                          } else {
                            return;
                          }
                        } else {
                          this.field_t = -1;
                          if (var5 == 0) {
                            break L5;
                          } else {
                            L6: {
                              if (-1 != this.field_n) {
                                this.field_t = this.field_n;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                  L7: {
                    if (-7 != (this.field_d ^ -1)) {
                      break L7;
                    } else {
                      if (this.field_n < 0) {
                        break L7;
                      } else {
                        if (!this.h(this.field_n, 47)) {
                          this.field_n = -1;
                          break L7;
                        } else {
                          if (-1 != (kd.field_b ^ -1)) {
                            L8: {
                              if (this.field_t != this.field_n) {
                                if (-1 != this.field_n) {
                                  this.field_t = this.field_n;
                                  break L8;
                                } else {
                                  return;
                                }
                              } else {
                                this.field_t = -1;
                                if (var5 == 0) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (-1 != this.field_n) {
                                      this.field_t = this.field_n;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  if (-1 != (kd.field_b ^ -1)) {
                    L10: {
                      if (this.field_t != this.field_n) {
                        if (-1 != this.field_n) {
                          this.field_t = this.field_n;
                          break L10;
                        } else {
                          return;
                        }
                      } else {
                        this.field_t = -1;
                        if (var5 == 0) {
                          break L10;
                        } else {
                          L11: {
                            if (-1 != this.field_n) {
                              this.field_t = this.field_n;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (sf.field_b <= var3) {
                    L12: {
                      if (-7 != (this.field_d ^ -1)) {
                        break L12;
                      } else {
                        if (this.field_n < 0) {
                          break L12;
                        } else {
                          if (!this.h(this.field_n, 47)) {
                            this.field_n = -1;
                            break L12;
                          } else {
                            if (-1 != (kd.field_b ^ -1)) {
                              L13: {
                                if (this.field_t != this.field_n) {
                                  if (-1 != this.field_n) {
                                    this.field_t = this.field_n;
                                    break L13;
                                  } else {
                                    return;
                                  }
                                } else {
                                  this.field_t = -1;
                                  if (var5 == 0) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (-1 != this.field_n) {
                                        this.field_t = this.field_n;
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    if (-1 != (kd.field_b ^ -1)) {
                      L15: {
                        if (this.field_t != this.field_n) {
                          if (-1 != this.field_n) {
                            this.field_t = this.field_n;
                            break L15;
                          } else {
                            return;
                          }
                        } else {
                          this.field_t = -1;
                          if (var5 == 0) {
                            break L15;
                          } else {
                            L16: {
                              if (-1 != this.field_n) {
                                this.field_t = this.field_n;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L17: {
                      this.field_n = var3;
                      if (-7 != (this.field_d ^ -1)) {
                        break L17;
                      } else {
                        if (this.field_n < 0) {
                          break L17;
                        } else {
                          if (!this.h(this.field_n, 47)) {
                            this.field_n = -1;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    if (-1 != (kd.field_b ^ -1)) {
                      if (this.field_t != this.field_n) {
                        if (-1 == this.field_n) {
                          return;
                        } else {
                          this.field_t = this.field_n;
                          return;
                        }
                      } else {
                        this.field_t = -1;
                        if (var5 != 0) {
                          L18: {
                            if (-1 != this.field_n) {
                              this.field_t = this.field_n;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              if (-1 != (kd.field_b ^ -1)) {
                if (this.field_t != this.field_n) {
                  if (-1 == this.field_n) {
                    return;
                  } else {
                    this.field_t = this.field_n;
                    return;
                  }
                } else {
                  this.field_t = -1;
                  if (var5 != 0) {
                    L19: {
                      if (-1 != this.field_n) {
                        this.field_t = this.field_n;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            if (-1 != (kd.field_b ^ -1)) {
              if (this.field_t != this.field_n) {
                if (-1 == this.field_n) {
                  return;
                } else {
                  this.field_t = this.field_n;
                  return;
                }
              } else {
                this.field_t = -1;
                if (var5 != 0) {
                  L20: {
                    if (-1 != this.field_n) {
                      this.field_t = this.field_n;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          if (-1 != (kd.field_b ^ -1)) {
            if (this.field_t != this.field_n) {
              if (-1 == this.field_n) {
                return;
              } else {
                this.field_t = this.field_n;
                return;
              }
            } else {
              this.field_t = -1;
              if (var5 != 0) {
                L21: {
                  if (-1 != this.field_n) {
                    this.field_t = this.field_n;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        field_r = 500;
        field_o = "Select a human or enemy zombie!";
        field_p = "Accept <%0> into this game";
        field_q = "Click";
    }
}
