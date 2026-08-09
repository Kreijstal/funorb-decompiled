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
        int statePc = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
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
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var7.b(sn.field_Mb, 320, 300, 16777215, 0);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var8 = ng.field_e;
                    var9 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (sf.field_b <= var9) {
                        statePc = 33;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var25 = 6;
                    var24 = this.field_d;
                    if (var18 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var24 != var25) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var24 != var25) {
                        statePc = 34;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 == this.field_n) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var9 = this.field_n;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var9 != -1) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    var19 = var2;
                    var20 = this.g(0, var9);
                    var20.a(110, 140);
                    var6.a(var19[var9], 260, 105, 300, 85, 0, 0, 1, 2, 35);
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
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (ra.field_n[var9] > var17) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    of.field_k.g(var17 * (of.field_k.field_z >> -873579583) + var11, 2 + -of.field_k.field_u + var12);
                    var17++;
                    if (var18 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    if (var18 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                case 21: {
                    if (this.h(var9, 86)) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var18 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (!this.f(-1, var9)) {
                        statePc = 32;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var10 = this.field_m[var9];
                    var11 = this.field_s[var9];
                    if (this.field_t == var9) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    oo.b(-3 + var10, -3 + var11, 38, 38, 6, 0, 128);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (this.field_n != var9) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    oo.b(var10 + -3, var11 + -3, 38, 38, 6, 16777215);
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    var21 = this.g(0, var9);
                    var21.b(var10, var11);
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    var22 = this.g(0, var9);
                    var22.b(var10, var11);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var9++;
                    if (var18 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var7.b(kb.field_E, 320, var8 - -72, 16777215, 0);
                    var7.b(vk.field_G, 320, 18 + (40 + (var8 + 32)), 14540083, 0);
                    var9 = -1;
                    if (this.field_t == -1) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var9 = this.field_t;
                    if (var18 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-1 == this.field_n) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var9 = this.field_n;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var9 != -1) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 39: {
                    var23 = this.g(0, var9);
                    var23.a(110, 140);
                    var6.a(var19[var9], 260, 105, 300, 85, 0, 0, 1, 2, 35);
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
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (ra.field_n[var9] > var17) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    return;
                }
                case 42: {
                    of.field_k.g(var17 * (of.field_k.field_z >> -873579583) + var11, 2 + -of.field_k.field_u + var12);
                    var17++;
                    if (var18 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    return;
                }
                case 44: {
                    if (var18 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    super.a(0, param1, param2);
                    this.field_m = new int[sf.field_b];
                    this.field_s = new int[sf.field_b];
                    this.field_t = -1;
                    this.field_n = -1;
                    var4 = 0;
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var5 >= sf.field_b) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this.f(-1, var5);
                    stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var11 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var5++;
                    if (var11 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    sf.field_a = (640 - (sf.field_g - 8) * var4 - (var4 - 1) * (-sf.field_g + sf.field_e)) / 2;
                    var5 = sf.field_a;
                    stackIn_8_0 = ng.field_e;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var6 = stackIn_8_0;
                    var7 = param0;
                    var8 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var8 < sf.field_b) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    if (var11 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    if (this.f(param0 ^ -1, var8)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var15 = this.field_m;
                    var10 = var8;
                    this.field_s[var8] = -100;
                    var15[var10] = -100;
                    if (var11 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var9 = var5;
                    var10 = var6;
                    this.field_m[var8] = var9;
                    if ((var7 % 2 ^ -1) != -2) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10 += 24;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    var7++;
                    this.field_s[var8] = var10;
                    var5 = var5 + (sf.field_e - 8);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    var7++;
                    this.field_s[var8] = var10;
                    var5 = var5 + (sf.field_e - 8);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        if (-7 == (this.field_d ^ -1)) {
          L0: {
            if (-1 == (param1 ^ -1)) {
              stackIn_5_0 = 100;
              break L0;
            } else {
              stackIn_5_0 = 350;
              break L0;
            }
          }
          return stackIn_5_0;
        } else {
          if (param0 == -118) {
            if (wc.j(108)) {
              L1: {
                if (0 != param1) {
                  stackIn_13_0 = 470;
                  break L1;
                } else {
                  stackIn_13_0 = 50;
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
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.equals("B")) {
              if (param0.equals("I")) {
                stackIn_6_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.equals("S")) {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.equals("J")) {
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackIn_21_0 = Float.TYPE;
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
                            stackIn_31_0 = Class.forName(param0);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_29_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_26_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("mq.A(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
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
        int[] var3;
        int[] var4;
        int[] stackIn_4_0 = null;
        int[] stackIn_8_0 = null;
        if (param1 <= 10) {
          L0: {
            field_l = (cj) null;
            if (this.field_d == 6) {
              stackIn_8_0 = fc.field_m;
              break L0;
            } else {
              stackIn_8_0 = k.field_n;
              break L0;
            }
          }
          var4 = stackIn_8_0;
          var3 = var4;
          return fq.a(param0, 127, var4);
        } else {
          L1: {
            if (this.field_d == 6) {
              stackIn_4_0 = fc.field_m;
              break L1;
            } else {
              stackIn_4_0 = k.field_n;
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
        if (param0 == -1) {
          if (!this.h(param1, 119)) {
            if (!this.e(-17, param1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_n = -73;
          if (this.h(param1, 119)) {
            return true;
          } else {
            L0: {
              if (this.e(-17, param1)) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void a(int param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    super.a(param0);
                    this.field_n = -1;
                    var2 = sf.field_e - sf.field_g >> 39186209;
                    if (ng.field_e < bo.field_d) {
                        statePc = 15;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (this.field_t != this.field_n) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_t = -1;
                    if (var5 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (-1 != this.field_n) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_t = this.field_n;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 11: {
                    if (-1 == this.field_n) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_t = this.field_n;
                    return;
                }
                case 13: {
                    return;
                }
                case 15: {
                    if (ng.field_e - -(2 * sf.field_g) > bo.field_d) {
                        statePc = 30;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    if (this.field_t != this.field_n) {
                        statePc = 26;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_t = -1;
                    if (var5 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    if (-1 != this.field_n) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_t = this.field_n;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 26: {
                    if (-1 == this.field_n) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_t = this.field_n;
                    return;
                }
                case 28: {
                    return;
                }
                case 30: {
                    if (sf.field_a + -var2 < bd.field_g) {
                        statePc = 45;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                case 33: {
                    if (this.field_t != this.field_n) {
                        statePc = 41;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_t = -1;
                    if (var5 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return;
                }
                case 36: {
                    if (-1 != this.field_n) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    this.field_t = this.field_n;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    return;
                }
                case 41: {
                    if (-1 == this.field_n) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    this.field_t = this.field_n;
                    return;
                }
                case 43: {
                    return;
                }
                case 45: {
                    var3 = -1;
                    var4 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var4 < sf.field_b) {
                        statePc = 95;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (sf.field_b <= var3) {
                        statePc = 67;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    this.field_n = var3;
                    if (-7 != (this.field_d ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (this.field_n < 0) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (!this.h(this.field_n, 47)) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.field_n = -1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return;
                }
                case 55: {
                    if (this.field_t != this.field_n) {
                        statePc = 63;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.field_t = -1;
                    if (var5 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                case 58: {
                    if (-1 != this.field_n) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.field_t = this.field_n;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    return;
                }
                case 63: {
                    if (-1 == this.field_n) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.field_t = this.field_n;
                    return;
                }
                case 65: {
                    return;
                }
                case 67: {
                    if (-7 != (this.field_d ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_n < 0) {
                        statePc = 83;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (!this.h(this.field_n, 47)) {
                        statePc = 82;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    return;
                }
                case 72: {
                    if (this.field_t != this.field_n) {
                        statePc = 78;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    this.field_t = -1;
                    if (var5 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (-1 != this.field_n) {
                        statePc = 76;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 76: {
                    this.field_t = this.field_n;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    return;
                }
                case 78: {
                    if (-1 != this.field_n) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    return;
                }
                case 80: {
                    this.field_t = this.field_n;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    return;
                }
                case 82: {
                    this.field_n = -1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    return;
                }
                case 85: {
                    if (this.field_t != this.field_n) {
                        statePc = 91;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    this.field_t = -1;
                    if (var5 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (-1 != this.field_n) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    this.field_t = this.field_n;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    return;
                }
                case 91: {
                    if (-1 != this.field_n) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    return;
                }
                case 93: {
                    this.field_t = this.field_n;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    return;
                }
                case 95: {
                    var7 = bd.field_g ^ -1;
                    var6 = this.field_m[var4] ^ -1;
                    if (var5 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var6 < var7) {
                        statePc = 104;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var6 >= var7) {
                        statePc = 139;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (sf.field_g + this.field_m[var4] <= bd.field_g) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (bo.field_d < this.field_s[var4]) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (bo.field_d >= sf.field_g + this.field_s[var4]) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var3 = var4;
                    if (var5 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var4++;
                    if (var5 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (sf.field_b <= var3) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    this.field_n = var3;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (-7 != (this.field_d ^ -1)) {
                        statePc = 112;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (this.field_n < 0) {
                        statePc = 112;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (!this.h(this.field_n, 47)) {
                        statePc = 111;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 111: {
                    this.field_n = -1;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (this.field_t != this.field_n) {
                        statePc = 117;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    this.field_t = -1;
                    if (var5 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (-1 != this.field_n) {
                        statePc = 119;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 119: {
                    this.field_t = this.field_n;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    return;
                }
                case 121: {
                    if (sf.field_b <= var3) {
                        statePc = 139;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    this.field_n = var3;
                    if (-7 != (this.field_d ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (this.field_n < 0) {
                        statePc = 127;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (!this.h(this.field_n, 47)) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_n = -1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    return;
                }
                case 129: {
                    if (this.field_t != this.field_n) {
                        statePc = 135;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    this.field_t = -1;
                    if (var5 == 0) {
                        statePc = 138;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (-1 != this.field_n) {
                        statePc = 133;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 133: {
                    this.field_t = this.field_n;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    return;
                }
                case 135: {
                    if (-1 != this.field_n) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    return;
                }
                case 137: {
                    this.field_t = this.field_n;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    return;
                }
                case 139: {
                    if (-7 != (this.field_d ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (this.field_n < 0) {
                        statePc = 155;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (!this.h(this.field_n, 47)) {
                        statePc = 154;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 144;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    return;
                }
                case 144: {
                    if (this.field_t != this.field_n) {
                        statePc = 150;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    this.field_t = -1;
                    if (var5 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (-1 != this.field_n) {
                        statePc = 148;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 148: {
                    this.field_t = this.field_n;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    return;
                }
                case 150: {
                    if (-1 != this.field_n) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    return;
                }
                case 152: {
                    this.field_t = this.field_n;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    return;
                }
                case 154: {
                    this.field_n = -1;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (-1 != (kd.field_b ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    return;
                }
                case 157: {
                    if (this.field_t != this.field_n) {
                        statePc = 163;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    this.field_t = -1;
                    if (var5 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (-1 != this.field_n) {
                        statePc = 161;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 161: {
                    this.field_t = this.field_n;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    return;
                }
                case 163: {
                    if (-1 != this.field_n) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    return;
                }
                case 165: {
                    this.field_t = this.field_n;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
