/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends df implements vb {
    static k field_E;
    private ag field_H;
    private ag field_C;
    static aj field_G;
    static String field_D;
    private ag field_F;

    final static void a(boolean param0, int param1, int param2) {
        vd.field_l = param2;
        to.field_p = param1;
        if (!param0) {
            field_E = (k) null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$1 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 >= -52) {
          return;
        } else {
          var5 = param1 + this.field_n;
          var6 = this.field_j - -param3;
          discarded$1 = ia.field_c.a(qe.field_j, 20 + var5, var6 - -20, this.field_v - 40, -50 + this.field_k, 16777215, -1, 1, 0, ia.field_c.field_C);
          super.a((byte) -60, param1, param2, param3);
          return;
        }
    }

    public td() {
        super(0, 0, 476, 225, (pf) null);
        this.field_C = new ag(ib.field_t, (wc) null);
        this.field_F = new ag(kn.field_rb, (wc) null);
        this.field_H = new ag(rc.field_n, (wc) null);
        mm var1 = new mm();
        this.field_C.field_r = (pf) ((Object) var1);
        this.field_F.field_r = (pf) ((Object) var1);
        this.field_H.field_r = (pf) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1746420001;
        this.field_F.a(30, -var2 + (this.field_k - 48), var4, -var3 + this.field_v >> 409623201, -50);
        this.field_H.a(30, -var2 + (this.field_k - 48), var4, var4 + (-var3 + this.field_v >> -1356454271) + var2, -73);
        this.field_C.a(30, this.field_k - 78 + -(var2 * 2), var3, -var3 + this.field_v >> -951166143, -103);
        this.field_F.field_o = (wc) (this);
        this.field_C.field_o = (wc) (this);
        this.field_C.field_q = dh.field_Bb;
        this.field_H.field_o = (wc) (this);
        this.field_H.field_q = hj.field_c;
        this.c(-102, this.field_F);
        this.c(-109, this.field_C);
        this.c(-76, this.field_H);
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_G = (aj) null;
                break L1;
              }
            }
            if (param4 != this.field_F) {
              if (param4 != this.field_C) {
                if (this.field_H != param4) {
                  break L0;
                } else {
                  oo.g(4);
                  return;
                }
              } else {
                wk.k(970210916);
                return;
              }
            } else {
              bl.d((byte) 109);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("td.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 <= -76) {
          if (null != ch.field_c) {
            if (ob.field_eb != qc.field_c) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          td.a((byte) 111);
          if (null != ch.field_c) {
            if (ob.field_eb != qc.field_c) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        bg var5 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_11_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var3_int = -76 / ((-73 - param1) / 52);
              if (param0 instanceof byte[]) {
                var4 = (byte[]) (param0);
                if (param2) {
                  stackOut_8_0 = dd.a(var4, 0);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_6_0 = (byte[]) (var4);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (!(param0 instanceof bg)) {
                  throw new IllegalArgumentException();
                } else {
                  var5 = (bg) (param0);
                  stackOut_11_0 = var5.b((byte) -43);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("td.J(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void a(byte param0) {
        field_E = null;
        if (param0 != 115) {
            return;
        }
        field_D = null;
        field_G = null;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param1 < -120) {
              if (super.a(param0, (byte) -127, param2, param3)) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-99 == (param3 ^ -1)) {
                  stackOut_9_0 = this.a(param0, 9555);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-100 == (param3 ^ -1)) {
                    stackOut_13_0 = this.b(2, param0);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("td.N(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final static boolean e(boolean param0) {
        if (!param0) {
            return true;
        }
        return qf.field_d >= 2 ? true : false;
    }

    final static void a(int param0, byte param1, int param2, ll param3, int param4, int param5) {
        int incrementValue$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
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
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (-param0 + param2 << 1038936520) / param3.field_g;
              var7 = param3.field_j * var6_int + (param0 << -1363161080);
              param5 = param5 + param3.field_f;
              param4 = param4 + param3.field_j;
              var8 = param4 + param5 * de.field_e;
              var9 = 0;
              var10 = param3.field_c;
              var11 = param3.field_h;
              var12 = de.field_e - var11;
              var13 = 0;
              if (de.field_c > param5) {
                var14 = de.field_c + -param5;
                var8 = var8 + de.field_e * var14;
                var9 = var9 + var11 * var14;
                param5 = de.field_c;
                var10 = var10 - var14;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param4 < de.field_i) {
                var14 = de.field_i - param4;
                var12 = var12 + var14;
                var8 = var8 + var14;
                param4 = de.field_i;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var7 = var7 + var6_int * var14;
                var11 = var11 - var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var10 + param5 <= de.field_k) {
                break L3;
              } else {
                var10 = var10 - (param5 + (var10 + -de.field_k));
                break L3;
              }
            }
            L4: {
              var14 = 127 % ((-32 - param1) / 32);
              if (var11 + param4 <= de.field_h) {
                break L4;
              } else {
                var15 = param4 - (-var11 + de.field_h);
                var13 = var13 + var15;
                var11 = var11 - var15;
                var12 = var12 + var15;
                break L4;
              }
            }
            L5: {
              if (-1 <= (var11 ^ -1)) {
                break L5;
              } else {
                if ((var10 ^ -1) < -1) {
                  param5 = -var10;
                  L6: while (true) {
                    if (0 <= param5) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var15 = var7;
                      param4 = -var11;
                      L7: while (true) {
                        if (-1 >= (param4 ^ -1)) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param5++;
                          continue L6;
                        } else {
                          L8: {
                            var16 = var15 >> -517440856;
                            var15 = var15 + var6_int;
                            var17 = -var16 + 256;
                            if (0 > var16) {
                              var9++;
                              var8++;
                              break L8;
                            } else {
                              L9: {
                                incrementValue$1 = var9;
                                var9++;
                                var18 = param3.field_l[255 & param3.field_m[incrementValue$1]];
                                if (-1 != (var18 ^ -1)) {
                                  if (-256 <= (var16 ^ -1)) {
                                    var19 = de.field_l[var8];
                                    var20 = (16711935 & var18) * var16 + var17 * (var19 & 16711935) >> 2073140680 & 16711935;
                                    de.field_l[var8] = var20 + dg.a(65280, dg.a(65280, var18) * var16 + dg.a(var19, 65280) * var17 >> -1493158680);
                                    break L9;
                                  } else {
                                    de.field_l[var8] = var18;
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8++;
                              break L8;
                            }
                          }
                          param4++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var6);
            stackOut_32_1 = new StringBuilder().append("td.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_D = "Now you will be given every Arcanist's staple spell: Arcane Arrow. This spell is an important addition to any spellbook, providing you with a way of making accurate attacks upon weakened targets.";
        field_G = new aj(4, 1, 1, 1);
    }
}
