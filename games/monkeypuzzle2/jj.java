/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jj extends t {
    static int field_F;
    static byte[][] field_E;
    private bl field_C;
    private String[] field_D;
    static String field_B;
    private pj field_G;

    void a(we param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1, param2, (byte) -28);
              this.field_C = null;
              if (param3 < -13) {
                break L1;
              } else {
                this.field_D = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_g) {
                var5_int = ei.field_a + (-param2 - this.field_r);
                var6 = -this.field_e + -param1 + p.field_a;
                this.field_C = this.b(var6, var5_int, 2);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("jj.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static cj a(String[] args, boolean param1) {
        cj var2 = null;
        RuntimeException var2_ref = null;
        cj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = new cj(false);
              if (param1) {
                break L1;
              } else {
                jj.d((byte) -44);
                break L1;
              }
            }
            var2.field_g = args;
            stackOut_2_0 = (cj) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("jj.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
            this.a(-61, 36, 65, -22);
        }
        this.a(((ui) ((Object) this.field_h)).a((we) (this), false), 13361, param0, param2, param1);
    }

    boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_F = -112;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("jj.AA(");
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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13361) {
            jj.c((byte) -53);
        }
        super.a(param0, param1 + 0, param2, param3, param4);
        this.a(true);
    }

    final void a(boolean param0) {
        int var2 = 0;
        ui var3 = null;
        aa var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        be var12 = null;
        int var13 = 0;
        int var14 = 0;
        bl var15 = null;
        int var16 = 0;
        String var17 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = MonkeyPuzzle2.field_F ? 1 : 0;
          this.field_G = new pj();
          var2 = 0;
          if (param0) {
            break L0;
          } else {
            var17 = (String) null;
            this.a(true, 111, (String) null);
            break L0;
          }
        }
        var3 = (ui) ((Object) this.field_h);
        var4 = var3.a(-1, (we) (this));
        L1: while (true) {
          var5 = this.field_s.indexOf("<hotspot=", var2);
          stackOut_3_0 = 0;
          stackOut_3_1 = var5 ^ -1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          L2: while (true) {
            L3: {
              if (stackIn_4_0 == stackIn_4_1) {
                break L3;
              } else {
                var7 = this.field_s.indexOf(">", var5);
                var6 = this.field_s.substring(var5 + 9, var7);
                var7 = Integer.parseInt(var6);
                var2 = this.field_s.indexOf("</hotspot>", var5);
                var8 = var4.b(var5, -51);
                var9 = var4.b(var2, -21);
                var10 = null;
                if (var16 != 0) {
                  break L3;
                } else {
                  var11 = var8;
                  L4: while (true) {
                    L5: {
                      if (var11 > var9) {
                        break L5;
                      } else {
                        var12 = var4.field_c[var11];
                        stackOut_8_0 = var8;
                        stackOut_8_1 = var11;
                        stackIn_4_0 = stackOut_8_0;
                        stackIn_4_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var16 != 0) {
                          continue L2;
                        } else {
                          L6: {
                            if (stackIn_9_0 == stackIn_9_1) {
                              stackOut_11_0 = var4.a(-75, var5);
                              stackIn_12_0 = stackOut_11_0;
                              break L6;
                            } else {
                              stackOut_10_0 = var12.field_c[0];
                              stackIn_12_0 = stackOut_10_0;
                              break L6;
                            }
                          }
                          L7: {
                            var13 = stackIn_12_0;
                            if (var11 == var9) {
                              stackOut_16_0 = var4.a(116, var2);
                              stackIn_17_0 = stackOut_16_0;
                              break L7;
                            } else {
                              if (var12 == null) {
                                stackOut_15_0 = 0;
                                stackIn_17_0 = stackOut_15_0;
                                break L7;
                              } else {
                                stackOut_14_0 = var12.field_c[-1 + var12.field_c.length];
                                stackIn_17_0 = stackOut_14_0;
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var14 = stackIn_17_0;
                            var15 = new bl(var7, var13, var12.field_a, -var13 + var14, Math.max(var3.a(2), var12.field_f - var12.field_a));
                            if (var10 != null) {
                              ((bl) (var10)).field_e = var15;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10 = var15;
                          this.field_G.a(-8212, var15);
                          var11++;
                          if (var16 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var16 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void d(byte param0) {
        boolean discarded$0 = false;
        field_E = (byte[][]) null;
        field_B = null;
        if (param0 != 117) {
            discarded$0 = jj.b(true);
        }
    }

    final static boolean a(int param0, ki param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
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
        ki var32_ref_ki = null;
        int var32 = 0;
        int var33 = 0;
        int[] var40 = null;
        int[] var41 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_139_0 = 0;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_143_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_137_0 = 0;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        String stackOut_142_2 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        String stackOut_141_2 = null;
        var33 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param3 = param3 - (-param1.field_I.field_n + nd.field_b.field_n) / 2;
              param2 = param2 - (-param1.field_I.field_m + nd.field_b.field_m) / 2;
              param2 = param2 + nd.field_b.field_r;
              param3 = param3 + nd.field_b.field_q;
              var4_int = sb.field_m.field_r - param2;
              var5 = sb.field_m.field_q - param3;
              var6 = nd.field_b.field_k;
              if (var4_int < var6) {
                stackOut_3_0 = sb.field_m.field_k;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              var8 = nd.field_b.field_j;
              if ((var5 ^ -1) > (var8 ^ -1)) {
                stackOut_6_0 = sb.field_m.field_j;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var9 = stackIn_7_0;
              if (var4_int > 0) {
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var10 = stackIn_10_0;
              if (0 < var5) {
                stackOut_12_0 = var5;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = 0;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var11 = stackIn_13_0;
              var12 = var7 + var4_int;
              if (var12 <= var6) {
                break L5;
              } else {
                var12 = var6;
                break L5;
              }
            }
            L6: {
              var13 = var5 - -var9;
              var12 = var12 - var10;
              if (var8 >= var13) {
                break L6;
              } else {
                var13 = var8;
                break L6;
              }
            }
            L7: {
              var13 = var13 - var11;
              var14 = var10 + var11 * var6;
              if (param0 == -32680) {
                break L7;
              } else {
                field_E = (byte[][]) null;
                break L7;
              }
            }
            var15 = -var12 + var6;
            var16 = var10 + (-var4_int + (-var5 + var11) * var7);
            var17 = var7 - var12;
            var40 = nd.field_b.field_s;
            var41 = sb.field_m.field_s;
            var20 = 0;
            var21 = 0;
            var22 = 0;
            var23 = 0;
            var24 = -1;
            var25 = -1;
            var26 = -1;
            var27 = -1;
            var28 = 0;
            var29 = var13;
            L8: while (true) {
              L9: {
                L10: {
                  if (var29 <= 0) {
                    break L10;
                  } else {
                    stackOut_21_0 = var12;
                    stackIn_47_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var33 != 0) {
                      break L9;
                    } else {
                      var30 = stackIn_22_0;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if (var30 <= 0) {
                              break L13;
                            } else {
                              stackOut_24_0 = 0;
                              stackOut_24_1 = var40[var14];
                              stackIn_45_0 = stackOut_24_0;
                              stackIn_45_1 = stackOut_24_1;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              if (var33 != 0) {
                                break L12;
                              } else {
                                L14: {
                                  if (stackIn_25_0 != stackIn_25_1) {
                                    if (0 != var41[var16]) {
                                      L15: {
                                        var31 = var41[var16];
                                        if (var31 >= 16777212) {
                                          break L15;
                                        } else {
                                          L16: {
                                            var32_ref_ki = e.field_a[-1 + var31];
                                            stackOut_30_0 = var28;
                                            stackIn_32_0 = stackOut_30_0;
                                            stackIn_31_0 = stackOut_30_0;
                                            if ((var32_ref_ki.field_w ^ -1) != -4) {
                                              stackOut_32_0 = stackIn_32_0;
                                              stackOut_32_1 = 0;
                                              stackIn_33_0 = stackOut_32_0;
                                              stackIn_33_1 = stackOut_32_1;
                                              break L16;
                                            } else {
                                              stackOut_31_0 = stackIn_31_0;
                                              stackOut_31_1 = 1;
                                              stackIn_33_0 = stackOut_31_0;
                                              stackIn_33_1 = stackOut_31_1;
                                              break L16;
                                            }
                                          }
                                          var28 = stackIn_33_0 | stackIn_33_1;
                                          jc.a(var32_ref_ki, (byte) -124, param1);
                                          if (var33 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L17: {
                                        if ((var31 ^ -1) == -16777214) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (16777212 == var31) {
                                              break L18;
                                            } else {
                                              L19: {
                                                if (-16777216 != (var31 ^ -1)) {
                                                  break L19;
                                                } else {
                                                  var20++;
                                                  var24 = var16;
                                                  if (var33 == 0) {
                                                    break L14;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              if (16777214 == var31) {
                                                var21++;
                                                var27 = var16;
                                                if (var33 == 0) {
                                                  break L14;
                                                } else {
                                                  break L18;
                                                }
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          var23++;
                                          var26 = var16;
                                          if (var33 == 0) {
                                            break L14;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      var25 = var16;
                                      var22++;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  } else {
                                    break L14;
                                  }
                                }
                                var14++;
                                var16++;
                                var30--;
                                if (var33 == 0) {
                                  continue L11;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var16 = var16 + var17;
                          stackOut_44_0 = var14;
                          stackOut_44_1 = var15;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          break L12;
                        }
                        var14 = stackIn_45_0 + stackIn_45_1;
                        var29--;
                        if (var33 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                stackOut_46_0 = var22;
                stackIn_47_0 = stackOut_46_0;
                break L9;
              }
              L20: {
                L21: {
                  if (stackIn_47_0 > 10) {
                    break L21;
                  } else {
                    if (var23 <= 10) {
                      stackOut_51_0 = 0;
                      stackIn_52_0 = stackOut_51_0;
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                stackOut_50_0 = 1;
                stackIn_52_0 = stackOut_50_0;
                break L20;
              }
              L22: {
                L23: {
                  var29 = stackIn_52_0;
                  if (var20 > 5) {
                    break L23;
                  } else {
                    if (-6 <= (var21 ^ -1)) {
                      stackOut_56_0 = 0;
                      stackIn_57_0 = stackOut_56_0;
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                stackOut_55_0 = 1;
                stackIn_57_0 = stackOut_55_0;
                break L22;
              }
              L24: {
                var30 = stackIn_57_0;
                if (var29 != 0) {
                  break L24;
                } else {
                  if (var30 != 0) {
                    break L24;
                  } else {
                    return false;
                  }
                }
              }
              L25: {
                if (var29 == 0) {
                  break L25;
                } else {
                  if (var30 != 0) {
                    L26: {
                      if ((var20 - -var21 ^ -1) >= (var22 - -var23 ^ -1)) {
                        stackOut_65_0 = 0;
                        stackIn_66_0 = stackOut_65_0;
                        break L26;
                      } else {
                        stackOut_64_0 = 1;
                        stackIn_66_0 = stackOut_64_0;
                        break L26;
                      }
                    }
                    L27: {
                      var30 = stackIn_66_0;
                      if (var30 != 0) {
                        stackOut_68_0 = 0;
                        stackIn_69_0 = stackOut_68_0;
                        break L27;
                      } else {
                        stackOut_67_0 = 1;
                        stackIn_69_0 = stackOut_67_0;
                        break L27;
                      }
                    }
                    var29 = stackIn_69_0;
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
              L28: {
                if (var30 != 0) {
                  L29: {
                    L30: {
                      if (var20 >= var21) {
                        break L30;
                      } else {
                        if (0.0f >= param1.field_D) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    if (0.0f > param1.field_D) {
                      break L28;
                    } else {
                      if (var20 > var21) {
                        L31: {
                          var31 = var24 / sb.field_m.field_k;
                          var32 = var24 + -(var31 * sb.field_m.field_k);
                          if (nh.a(1 + var32, var31, (int)param1.field_q, (int)(param1.field_q + param1.field_D), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                            L32: {
                              if (100.0f > ((float)(-ok.field_b) + param1.field_q) * (param1.field_q - (float)ok.field_b)) {
                                param1.field_q = (float)(ok.field_b + param1.field_y);
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            if (var29 != 0) {
                              break L31;
                            } else {
                              if (((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B) < 100.0f) {
                                param1.field_B = (float)ll.field_a;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                        L33: {
                          L34: {
                            if (param1.field_m != 0) {
                              break L34;
                            } else {
                              param1.field_D = -param1.field_D;
                              if (var33 == 0) {
                                break L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          param1.field_q = param1.field_q - 1.0f;
                          break L33;
                        }
                        if (var33 == 0) {
                          break L28;
                        } else {
                          break L29;
                        }
                      } else {
                        break L28;
                      }
                    }
                  }
                  L35: {
                    var31 = var27 / sb.field_m.field_k;
                    var32 = var27 - sb.field_m.field_k * var31;
                    if (nh.a(var32 - -1, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                      L36: {
                        if ((param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b) < 100.0f) {
                          param1.field_q = (float)(ok.field_b - param1.field_y);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      if (var29 != 0) {
                        break L35;
                      } else {
                        if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                          param1.field_B = (float)ll.field_a;
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                    } else {
                      break L35;
                    }
                  }
                  L37: {
                    if (-1 == (param1.field_m ^ -1)) {
                      break L37;
                    } else {
                      param1.field_q = param1.field_q + 1.0f;
                      if (var33 == 0) {
                        break L28;
                      } else {
                        break L37;
                      }
                    }
                  }
                  param1.field_D = -param1.field_D;
                  break L28;
                } else {
                  break L28;
                }
              }
              L38: {
                if (var29 != 0) {
                  L39: {
                    if ((var22 ^ -1) <= (var23 ^ -1)) {
                      break L39;
                    } else {
                      if (param1.field_v > 0.0f) {
                        break L39;
                      } else {
                        L40: {
                          var31 = var26 / sb.field_m.field_k;
                          var32 = -(var31 * sb.field_m.field_k) + var26 + 80;
                          if (nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), param0 + 27255, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 - 1)) {
                            L41: {
                              if (var30 != 0) {
                                break L41;
                              } else {
                                if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                                  break L41;
                                } else {
                                  param1.field_q = (float)ok.field_b;
                                  break L41;
                                }
                              }
                            }
                            if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                              param1.field_B = (float)(ll.field_a + -param1.field_G);
                              break L40;
                            } else {
                              break L40;
                            }
                          } else {
                            break L40;
                          }
                        }
                        L42: {
                          L43: {
                            if (param1.field_m == 0) {
                              break L43;
                            } else {
                              param1.field_B = param1.field_B + 1.0f;
                              if (var33 == 0) {
                                break L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                          param1.field_v = -param1.field_v;
                          break L42;
                        }
                        if (var33 == 0) {
                          break L38;
                        } else {
                          break L39;
                        }
                      }
                    }
                  }
                  if ((var23 ^ -1) <= (var22 ^ -1)) {
                    break L38;
                  } else {
                    if (param1.field_v >= 0.0f) {
                      L44: {
                        var31 = var25 / sb.field_m.field_k;
                        var32 = 80 + var25 + -(var31 * sb.field_m.field_k);
                        if (!nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 + -1)) {
                          break L44;
                        } else {
                          L45: {
                            if (100.0f > ((float)(-ll.field_a) + param1.field_B) * (param1.field_B - (float)ll.field_a)) {
                              param1.field_B = (float)(ll.field_a - -param1.field_G);
                              break L45;
                            } else {
                              break L45;
                            }
                          }
                          if (var30 != 0) {
                            break L44;
                          } else {
                            if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                              break L44;
                            } else {
                              param1.field_q = (float)ok.field_b;
                              break L44;
                            }
                          }
                        }
                      }
                      L46: {
                        if (-1 != (param1.field_m ^ -1)) {
                          break L46;
                        } else {
                          param1.field_v = -param1.field_v;
                          if (var33 == 0) {
                            break L38;
                          } else {
                            break L46;
                          }
                        }
                      }
                      param1.field_B = param1.field_B - 1.0f;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                } else {
                  break L38;
                }
              }
              L47: {
                if (var28 != 0) {
                  stackOut_138_0 = 0;
                  stackIn_139_0 = stackOut_138_0;
                  break L47;
                } else {
                  stackOut_137_0 = 1;
                  stackIn_139_0 = stackOut_137_0;
                  break L47;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L48: {
            var4 = decompiledCaughtException;
            stackOut_140_0 = (RuntimeException) (var4);
            stackOut_140_1 = new StringBuilder().append("jj.S(").append(param0).append(',');
            stackIn_142_0 = stackOut_140_0;
            stackIn_142_1 = stackOut_140_1;
            stackIn_141_0 = stackOut_140_0;
            stackIn_141_1 = stackOut_140_1;
            if (param1 == null) {
              stackOut_142_0 = (RuntimeException) ((Object) stackIn_142_0);
              stackOut_142_1 = (StringBuilder) ((Object) stackIn_142_1);
              stackOut_142_2 = "null";
              stackIn_143_0 = stackOut_142_0;
              stackIn_143_1 = stackOut_142_1;
              stackIn_143_2 = stackOut_142_2;
              break L48;
            } else {
              stackOut_141_0 = (RuntimeException) ((Object) stackIn_141_0);
              stackOut_141_1 = (StringBuilder) ((Object) stackIn_141_1);
              stackOut_141_2 = "{...}";
              stackIn_143_0 = stackOut_141_0;
              stackIn_143_1 = stackOut_141_1;
              stackIn_143_2 = stackOut_141_2;
              break L48;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_143_0), stackIn_143_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_139_0 != 0;
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        ki var2_ref_ki = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            bd.field_b.a(-8212, new ki(1, 0, 0));
            bd.field_b.a(-8212, new ki(1, 0, 0));
            bd.field_b.a(-8212, new ki(1, 1, 0));
            bd.field_b.a(-8212, new ki(1, 1, 0));
            bd.field_b.a(-8212, new ki(1, 2, 0));
            bd.field_b.a(-8212, new ki(1, 2, 0));
            bd.field_b.a(-8212, new ki(1, 3, 0));
            bd.field_b.a(-8212, new ki(1, 3, 0));
            bd.field_b.a(-8212, new ki(1, 4, 0));
            bd.field_b.a(-8212, new ki(1, 4, 0));
            bd.field_b.a(-8212, new ki(1, 0, 0));
            bd.field_b.a(-8212, new ki(1, 0, 0));
            var1_int = 0;
            var2_ref_ki = (ki) ((Object) bd.field_b.a((byte) -117));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_ref_ki == null) {
                    break L3;
                  } else {
                    var2_ref_ki.field_B = rl.field_c[var1_int][0];
                    var2_ref_ki.field_q = rl.field_c[var1_int][1];
                    var2_ref_ki = (ki) ((Object) bd.field_b.d((byte) 63));
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
                var1_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if ((ii.field_E ^ -1) >= (var1_int ^ -1)) {
                      break L6;
                    } else {
                      ii.field_U[var1_int] = -1;
                      var1_int++;
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  bl.a(50, uh.field_e);
                  break L5;
                }
                var2 = 93 / ((-18 - param0) / 35);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "jj.D(" + param0 + ')');
        }
    }

    final static boolean b(boolean param0) {
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            var1 = (ki) ((Object) hd.field_u.a((byte) -117));
            L2: while (true) {
              L3: {
                L4: {
                  if (var1 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var1.field_E;
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var1 = (ki) ((Object) hd.field_u.d((byte) 63));
                        if (var2 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "jj.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(0 == param1)) {
            return;
        }
        ui var5 = (ui) ((Object) this.field_h);
        bl var6 = this.field_C;
        if (var6 == null) {
        } else {
            var7 = var5.a(param3, (byte) 113, (we) (this));
            var8 = var5.a((we) (this), -94, param2);
            do {
                hk.a(var6.field_l + var7 - 2, -2 + var8 + var6.field_n, 53, 2 + var6.field_i, var6.field_j + 2);
                var6 = var6.field_e;
            } while (var6 != null);
        }
    }

    private final bl b(int param0, int param1, int param2) {
        bl var4 = null;
        bl var5 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = (bl) ((Object) this.field_G.a((byte) -117));
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                if (var6 == 0) {
                  var5 = var4;
                  L3: while (true) {
                    L4: {
                      if (var5 == null) {
                        break L4;
                      } else {
                        stackOut_6_0 = var5.field_l;
                        stackOut_6_1 = param1;
                        stackIn_15_0 = stackOut_6_0;
                        stackIn_15_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          L5: {
                            if (stackIn_7_0 > stackIn_7_1) {
                              break L5;
                            } else {
                              if (var5.field_n > param0) {
                                break L5;
                              } else {
                                if (var5.field_l + var5.field_i <= param1) {
                                  break L5;
                                } else {
                                  if ((param0 ^ -1) < (var5.field_n - -var5.field_j ^ -1)) {
                                    break L5;
                                  } else {
                                    return var4;
                                  }
                                }
                              }
                            }
                          }
                          var5 = var5.field_e;
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var4 = (bl) ((Object) this.field_G.d((byte) 63));
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
            stackOut_14_0 = param2;
            stackOut_14_1 = 2;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L1;
          }
          if (stackIn_15_0 != stackIn_15_1) {
            this.field_G = (pj) null;
            return null;
          } else {
            return null;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        String discarded$0 = null;
        if (param0 >= -23) {
            discarded$0 = this.a((byte) -81);
        }
        super.b(-102, param1, param2, param3);
        int var5 = -this.field_r + param1;
        int var6 = param2 - this.field_e;
        bl var7 = this.b(var6, var5, 2);
        if (var7 != null) {
            if (!(this.field_o == null)) {
                ((u) ((Object) this.field_o)).a(var7.field_h, -21099, (jj) (this), param3);
            }
        }
    }

    final void a(boolean param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_D) {
                  break L2;
                } else {
                  if ((this.field_D.length ^ -1) >= (param1 ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[param1 - -1];
                var8 = var7;
                var4 = var8;
                if (this.field_D == null) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_D.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_D[var5];
                      var5++;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              this.field_D = var8;
              break L1;
            }
            if (!param0) {
              this.field_D[param1] = param2;
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
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("jj.J(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    String a(byte param0) {
        if (param0 != 54) {
            return (String) null;
        }
        if (null == this.field_C) {
            return null;
        }
        if (null == this.field_D) {
            return null;
        }
        if (this.field_C.field_h >= this.field_D.length) {
            return null;
        }
        return this.field_D[this.field_C.field_h];
    }

    jj(String param0, ml param1) {
        super(param0, (of) null);
        this.field_C = null;
        try {
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
    }
}
