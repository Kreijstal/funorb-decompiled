/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh extends gh {
    static boolean field_Wb;
    static String field_Vb;
    gh field_Tb;
    static int field_Yb;
    static ak field_Xb;
    private gh field_Sb;
    static String field_Ub;

    final static int d(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            gi var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_33_0 = 0;
            if (ne.field_N.field_f < 4) {
              try {
                L0: {
                  L1: {
                    if (wh.field_d != 0) {
                      break L1;
                    } else {
                      ha.field_T = km.field_k.a(rl.field_f, ih.field_n, 376255344);
                      wh.field_d = wh.field_d + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != wh.field_d) {
                      break L2;
                    } else {
                      if ((ha.field_T.field_a ^ -1) != -3) {
                        if (ha.field_T.field_a == 1) {
                          wh.field_d = wh.field_d + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_11_0 = gf.a(-1, 16777215);
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (2 != wh.field_d) {
                      break L3;
                    } else {
                      nf.field_c = new sg((java.net.Socket) (ha.field_T.field_c), km.field_k);
                      var2 = new gi(13);
                      s.a(var2, 12, jf.field_ib, rb.field_f, sh.field_a);
                      var2.a((byte) 120, 15);
                      var2.b(true, wn.field_g);
                      nf.field_c.a(13, var2.field_t, -100, 0);
                      wh.field_d = wh.field_d + 1;
                      na.field_f = 30000L + mm.a(-57);
                      break L3;
                    }
                  }
                  L4: {
                    if (param0 <= -65) {
                      break L4;
                    } else {
                      field_Wb = false;
                      break L4;
                    }
                  }
                  L5: {
                    if (-4 == (wh.field_d ^ -1)) {
                      if ((nf.field_c.a(-124) ^ -1) < -1) {
                        var1_int = nf.field_c.b((byte) -94);
                        if (0 == var1_int) {
                          wh.field_d = wh.field_d + 1;
                          break L5;
                        } else {
                          stackOut_28_0 = gf.a(var1_int, 16777215);
                          stackIn_29_0 = stackOut_28_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if (na.field_f < mm.a(40)) {
                          stackOut_25_0 = gf.a(-2, 16777215);
                          stackIn_26_0 = stackOut_25_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (-5 == (wh.field_d ^ -1)) {
                    ne.field_N.a(nf.field_c, fk.field_h, 6);
                    wh.field_d = 0;
                    ha.field_T = null;
                    nf.field_c = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return gf.a(-3, 16777215);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_26_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_29_0;
                  } else {
                    return stackIn_34_0;
                  }
                }
              }
            } else {
              if (ne.field_N.field_t == -1) {
                return 3;
              } else {
                if (ne.field_N.field_t != -2) {
                  return 1;
                } else {
                  return 4;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean discarded$2 = false;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!dn.a(param1, -91)) {
                L1: {
                  var2 = cd.field_b;
                  var3 = 0;
                  if (param0 == -30) {
                    break L1;
                  } else {
                    discarded$2 = qh.a((byte) -42, 'A');
                    break L1;
                  }
                }
                L2: while (true) {
                  if (var3 >= var2.length) {
                    var2 = ua.field_H;
                    var3 = 0;
                    L3: while (true) {
                      if (var2.length <= var3) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param1 == var4) {
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var2[var3];
                    if (param1 != var4) {
                      var3++;
                      continue L2;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "qh.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var4 = -param0;
          var5 = -param0;
          if (null == this.field_Sb) {
            break L0;
          } else {
            var4 = this.field_Sb.g(-2147483648);
            break L0;
          }
        }
        L1: {
          if (null != this.field_Tb) {
            var5 = this.field_Tb.b(-113, -param1 + -param0 + (-var4 + -param1 + this.field_zb));
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = param1 + (param1 - -var4 - (-param0 - var5));
          if (this.field_zb >= var6) {
            break L2;
          } else {
            var5 = var5 + (-var6 + this.field_zb);
            var6 = this.field_zb;
            break L2;
          }
        }
        L3: {
          if (-2 == (this.field_Kb ^ -1)) {
            param1 = param1 + (this.field_zb - var6) / 2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (2 != this.field_Kb) {
            break L4;
          } else {
            param1 = param1 + (this.field_zb - var6);
            break L4;
          }
        }
        L5: {
          if (this.field_Sb == null) {
            break L5;
          } else {
            this.field_Sb.a(0, 0, this.field_Lb, param1, var4);
            this.field_Sb.field_Fb = this.field_Fb;
            break L5;
          }
        }
        L6: {
          if (null == this.field_Tb) {
            break L6;
          } else {
            L7: {
              this.field_Tb.a(0, 0, this.field_Lb, param1 - -var4 - -param0, var5);
              if (this.field_Sb == null) {
                this.field_Tb.field_Kb = this.field_Kb;
                break L7;
              } else {
                this.field_Tb.field_Kb = 0;
                break L7;
              }
            }
            this.field_Tb.field_Fb = this.field_Fb;
            break L6;
          }
        }
        var7 = -115 % ((param2 - -45) / 46);
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = -param1;
        if (param0 < 126) {
            return 116;
        }
        int var5 = -param1;
        if (this.field_Sb != null) {
            var4 = this.field_Sb.g(-2147483648);
        }
        if (!(this.field_Tb == null)) {
            var5 = this.field_Tb.g(-2147483648);
        }
        return var5 + param2 - -var4 - (-param1 + -param2);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var32 = SteelSentinels.field_G;
        try {
          L0: {
            if (-307201 < (pb.field_g.length ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5_int = param3;
                var6 = param1;
                if (1000 <= param0) {
                  break L1;
                } else {
                  param0 = 1000;
                  break L1;
                }
              }
              L2: {
                var7 = param4 * param4;
                var8 = var5_int - param4 >> 1848522148;
                var9 = param2 + var5_int >> 1552010532;
                var10 = var5_int + param4 + 15 >> -1356064668;
                var11 = -param4 + var6 >> 1304757444;
                var12 = var6 - -15 >> 1183681572;
                if ((var10 ^ -1) < -641) {
                  var10 = 640;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var8 < 0) {
                  var8 = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var13 = 15 + param4 + var6 >> 683624612;
                if ((var11 ^ -1) <= -1) {
                  break L4;
                } else {
                  var11 = 0;
                  break L4;
                }
              }
              L5: {
                if (-481 <= (var13 ^ -1)) {
                  break L5;
                } else {
                  var13 = 480;
                  break L5;
                }
              }
              L6: {
                if (var9 >= 0) {
                  break L6;
                } else {
                  var9 = 0;
                  break L6;
                }
              }
              L7: {
                if (640 < var9) {
                  var9 = 640;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (-1 < (var12 ^ -1)) {
                  var12 = 0;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var12 <= 480) {
                  break L9;
                } else {
                  var12 = 480;
                  break L9;
                }
              }
              var14 = (var9 << -884234204) - var5_int;
              var14 = var14 * var14;
              var15 = -var5_int + (1 + var9 << 1996187780);
              var15 = var15 * var15;
              var16 = (var9 + 2 << -770490844) - var5_int;
              var16 = var16 * var16;
              var17 = var15 + -var14;
              var18 = -var15 + var16;
              var19 = var18 - var17;
              var20 = -var6 + (var12 << 706061476);
              var20 = var20 * var20;
              var21 = (1 + var12 << -909378780) + -var6;
              var21 = var21 * var21;
              var22 = -var6 + (2 + var12 << -364001916);
              var22 = var22 * var22;
              var23 = -var20 + var21;
              var24 = var22 + -var21;
              var25 = var24 - var23;
              var26 = 16;
              var27 = var7;
              L10: while (true) {
                if (var7 <= 2147483647 >>> var26) {
                  var28 = var12 * 640 - -var9;
                  var29 = var14 + var20;
                  var30 = var23;
                  var31 = var12;
                  L11: while (true) {
                    if (var31 >= var13) {
                      var28 = 640 * var12 - -var9;
                      var30 = var23;
                      var29 = var20 + var14;
                      var31 = var12 + -1;
                      L12: while (true) {
                        if (var11 > var31) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var30 = var30 - var25;
                          var29 = var29 - var30;
                          var28 -= 640;
                          wl.a(var31, var29, var17, var19, var26, var7, var27, var8, var9, var10, param0, var28, var5_int, var6);
                          var31--;
                          continue L12;
                        }
                      }
                    } else {
                      ig.a((byte) -88, var26, var31, var27, var9, param0, var8, var17, var6, var7, var10, var5_int, var19, var29, var28);
                      var29 = var29 + var30;
                      var28 += 640;
                      var30 = var30 + var25;
                      var31++;
                      continue L11;
                    }
                  }
                } else {
                  var26--;
                  var27 = var27 + 1 >>> 377044545;
                  continue L10;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "qh.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        this.a(0, param5, param0, param3, param1);
        this.a(param4, param2, -96);
        if (param6 < 120) {
            field_Yb = 4;
        }
    }

    qh(long param0, gh param1, gh param2, gh param3, wk param4, String param5) {
        super(param0, param1);
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_Sb = new gh(0L, param2);
                this.field_Sb.field_Pb = param4;
                this.a(this.field_Sb, 119);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_Tb = new gh(0L, param3, param5);
                this.a(this.field_Tb, 119);
                this.h(99);
                break L2;
              } else {
                this.h(99);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var8);
            stackOut_7_1 = new StringBuilder().append("qh.<init>(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final static String k(int param0) {
        if (param0 != 8347) {
            qh.j(-70);
        }
        return rf.field_d.h(param0 ^ 8346);
    }

    public static void j(int param0) {
        boolean discarded$0 = false;
        field_Ub = null;
        field_Vb = null;
        if (param0 != 15) {
            discarded$0 = qh.a((byte) -26, 'ﾳ');
        }
        field_Xb = null;
    }

    static {
        field_Wb = true;
        field_Vb = "This game is full.";
        field_Ub = "ESC - cancel private message";
    }
}
