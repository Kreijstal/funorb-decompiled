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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1, param2, (byte) -28);
              ((jj) this).field_C = null;
              if (((jj) this).field_g) {
                var5_int = ei.field_a + (-param2 - ((jj) this).field_r);
                var6 = -((jj) this).field_e + -param1 + p.field_a;
                ((jj) this).field_C = this.b(var6, var5_int, 2);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("jj.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + -89 + 41);
        }
    }

    final static cj a(String[] args, boolean param1) {
        cj var2 = null;
        RuntimeException var2_ref = null;
        cj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new cj(false);
            var2.field_g = args;
            stackOut_0_0 = (cj) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("jj.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (args == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 1 + 41);
        }
        return stackIn_1_0;
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
            ((jj) this).a(-61, 36, 65, -22);
        }
        ((jj) this).a(((ui) (Object) ((jj) this).field_h).a((we) this, false), 13361, param0, param2, param1);
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jj.AA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13361) {
            jj.c((byte) -53);
        }
        super.a(param0, param1, param2, param3, param4);
        ((jj) this).a(true);
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
        Object var17 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = MonkeyPuzzle2.field_F ? 1 : 0;
          ((jj) this).field_G = new pj();
          var2 = 0;
          if (param0) {
            break L0;
          } else {
            var17 = null;
            ((jj) this).a(true, 111, (String) null);
            break L0;
          }
        }
        var3 = (ui) (Object) ((jj) this).field_h;
        var4 = var3.a(-1, (we) this);
        L1: while (true) {
          var5 = ((jj) this).field_s.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((jj) this).field_s.indexOf(">", var5);
            var6 = ((jj) this).field_s.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((jj) this).field_s.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, -51);
            var9 = var4.b(var2, -21);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var8 == var11) {
                    stackOut_8_0 = var4.a(-75, var5);
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var12.field_c[0];
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 == var9) {
                    stackOut_13_0 = var4.a(116, var2);
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = var12.field_c[-1 + var12.field_c.length];
                      stackIn_14_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new bl(var7, var13, var12.field_a, -var13 + var14, Math.max(var3.a(2), var12.field_f - var12.field_a));
                  if (var10 != null) {
                    ((bl) var10).field_e = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = (Object) (Object) var15;
                ((jj) this).field_G.a(-8212, (ug) (Object) var15);
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    public static void d(byte param0) {
        field_E = null;
        field_B = null;
        if (param0 != 117) {
            boolean discarded$0 = jj.b(true);
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
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_129_0 = 0;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
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
              if (~var5 > ~var8) {
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
                field_E = null;
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
              if (var29 <= 0) {
                L9: {
                  L10: {
                    if (var22 > 10) {
                      break L10;
                    } else {
                      if (var23 <= 10) {
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  stackOut_46_0 = 1;
                  stackIn_48_0 = stackOut_46_0;
                  break L9;
                }
                L11: {
                  L12: {
                    var29 = stackIn_48_0;
                    if (var20 > 5) {
                      break L12;
                    } else {
                      if (var21 <= 5) {
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  stackOut_51_0 = 1;
                  stackIn_53_0 = stackOut_51_0;
                  break L11;
                }
                L13: {
                  var30 = stackIn_53_0;
                  if (var29 != 0) {
                    break L13;
                  } else {
                    if (var30 != 0) {
                      break L13;
                    } else {
                      return false;
                    }
                  }
                }
                L14: {
                  if (var29 == 0) {
                    break L14;
                  } else {
                    if (var30 != 0) {
                      L15: {
                        if (~(var20 - -var21) >= ~(var22 - -var23)) {
                          stackOut_61_0 = 0;
                          stackIn_62_0 = stackOut_61_0;
                          break L15;
                        } else {
                          stackOut_60_0 = 1;
                          stackIn_62_0 = stackOut_60_0;
                          break L15;
                        }
                      }
                      L16: {
                        var30 = stackIn_62_0;
                        if (var30 != 0) {
                          stackOut_64_0 = 0;
                          stackIn_65_0 = stackOut_64_0;
                          break L16;
                        } else {
                          stackOut_63_0 = 1;
                          stackIn_65_0 = stackOut_63_0;
                          break L16;
                        }
                      }
                      var29 = stackIn_65_0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (var30 != 0) {
                    L18: {
                      if (var20 >= var21) {
                        break L18;
                      } else {
                        if (0.0f >= param1.field_D) {
                          L19: {
                            var31 = var27 / sb.field_m.field_k;
                            var32 = var27 - sb.field_m.field_k * var31;
                            if (nh.a(var32 - -1, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                              L20: {
                                if ((param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b) < 100.0f) {
                                  param1.field_q = (float)(ok.field_b - param1.field_y);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              if (var29 != 0) {
                                break L19;
                              } else {
                                if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                                  param1.field_B = (float)ll.field_a;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                            } else {
                              break L19;
                            }
                          }
                          if (param1.field_m == 0) {
                            param1.field_D = -param1.field_D;
                            break L17;
                          } else {
                            param1.field_q = param1.field_q + 1.0f;
                            break L17;
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    if (0.0f > param1.field_D) {
                      break L17;
                    } else {
                      if (var20 > var21) {
                        L21: {
                          var31 = var24 / sb.field_m.field_k;
                          var32 = var24 + -(var31 * sb.field_m.field_k);
                          if (nh.a(1 + var32, var31, (int)param1.field_q, (int)(param1.field_q + param1.field_D), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                            L22: {
                              if (100.0f > ((float)(-ok.field_b) + param1.field_q) * (param1.field_q - (float)ok.field_b)) {
                                param1.field_q = (float)(ok.field_b + param1.field_y);
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            if (var29 != 0) {
                              break L21;
                            } else {
                              if (((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B) < 100.0f) {
                                param1.field_B = (float)ll.field_a;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          } else {
                            break L21;
                          }
                        }
                        if (param1.field_m != 0) {
                          param1.field_q = param1.field_q - 1.0f;
                          break L17;
                        } else {
                          param1.field_D = -param1.field_D;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  } else {
                    break L17;
                  }
                }
                L23: {
                  if (var29 != 0) {
                    L24: {
                      if (~var22 <= ~var23) {
                        break L24;
                      } else {
                        if (param1.field_v > 0.0f) {
                          break L24;
                        } else {
                          L25: {
                            var31 = var26 / sb.field_m.field_k;
                            var32 = -(var31 * sb.field_m.field_k) + var26 + 80;
                            if (nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), param0 + 27255, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 - 1)) {
                              L26: {
                                if (var30 != 0) {
                                  break L26;
                                } else {
                                  if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                                    break L26;
                                  } else {
                                    param1.field_q = (float)ok.field_b;
                                    break L26;
                                  }
                                }
                              }
                              if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                                param1.field_B = (float)(ll.field_a + -param1.field_G);
                                break L25;
                              } else {
                                break L25;
                              }
                            } else {
                              break L25;
                            }
                          }
                          if (param1.field_m == 0) {
                            param1.field_v = -param1.field_v;
                            break L23;
                          } else {
                            param1.field_B = param1.field_B + 1.0f;
                            break L23;
                          }
                        }
                      }
                    }
                    if (~var23 <= ~var22) {
                      break L23;
                    } else {
                      if (param1.field_v >= 0.0f) {
                        L27: {
                          var31 = var25 / sb.field_m.field_k;
                          var32 = 80 + var25 + -(var31 * sb.field_m.field_k);
                          if (!nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 + -1)) {
                            break L27;
                          } else {
                            L28: {
                              if (100.0f > ((float)(-ll.field_a) + param1.field_B) * (param1.field_B - (float)ll.field_a)) {
                                param1.field_B = (float)(ll.field_a - -param1.field_G);
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            if (var30 != 0) {
                              break L27;
                            } else {
                              if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                                break L27;
                              } else {
                                param1.field_q = (float)ok.field_b;
                                break L27;
                              }
                            }
                          }
                        }
                        if (param1.field_m != 0) {
                          param1.field_B = param1.field_B - 1.0f;
                          break L23;
                        } else {
                          param1.field_v = -param1.field_v;
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                  } else {
                    break L23;
                  }
                }
                L29: {
                  if (var28 != 0) {
                    stackOut_128_0 = 0;
                    stackIn_129_0 = stackOut_128_0;
                    break L29;
                  } else {
                    stackOut_127_0 = 1;
                    stackIn_129_0 = stackOut_127_0;
                    break L29;
                  }
                }
                break L0;
              } else {
                var30 = var12;
                L30: while (true) {
                  if (var30 <= 0) {
                    var16 = var16 + var17;
                    var14 = var14 + var15;
                    var29--;
                    continue L8;
                  } else {
                    L31: {
                      if (0 != var40[var14]) {
                        if (0 != var41[var16]) {
                          var31 = var41[var16];
                          if (var31 >= 16777212) {
                            if (var31 == 16777213) {
                              var25 = var16;
                              var22++;
                              break L31;
                            } else {
                              if (16777212 == var31) {
                                var23++;
                                var26 = var16;
                                break L31;
                              } else {
                                if (var31 != 16777215) {
                                  if (16777214 == var31) {
                                    var21++;
                                    var27 = var16;
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                } else {
                                  var20++;
                                  var24 = var16;
                                  break L31;
                                }
                              }
                            }
                          } else {
                            L32: {
                              var32_ref_ki = e.field_a[-1 + var31];
                              stackOut_28_0 = var28;
                              stackIn_30_0 = stackOut_28_0;
                              stackIn_29_0 = stackOut_28_0;
                              if (var32_ref_ki.field_w != 3) {
                                stackOut_30_0 = stackIn_30_0;
                                stackOut_30_1 = 0;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                break L32;
                              } else {
                                stackOut_29_0 = stackIn_29_0;
                                stackOut_29_1 = 1;
                                stackIn_31_0 = stackOut_29_0;
                                stackIn_31_1 = stackOut_29_1;
                                break L32;
                              }
                            }
                            var28 = stackIn_31_0 | stackIn_31_1;
                            jc.a(var32_ref_ki, (byte) -124, param1);
                            break L31;
                          }
                        } else {
                          break L31;
                        }
                      } else {
                        break L31;
                      }
                    }
                    var14++;
                    var16++;
                    var30--;
                    continue L30;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var4 = decompiledCaughtException;
            stackOut_130_0 = (RuntimeException) var4;
            stackOut_130_1 = new StringBuilder().append("jj.S(").append(param0).append(44);
            stackIn_132_0 = stackOut_130_0;
            stackIn_132_1 = stackOut_130_1;
            stackIn_131_0 = stackOut_130_0;
            stackIn_131_1 = stackOut_130_1;
            if (param1 == null) {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "null";
              stackIn_133_0 = stackOut_132_0;
              stackIn_133_1 = stackOut_132_1;
              stackIn_133_2 = stackOut_132_2;
              break L33;
            } else {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "{...}";
              stackIn_133_0 = stackOut_131_0;
              stackIn_133_1 = stackOut_131_1;
              stackIn_133_2 = stackOut_131_2;
              break L33;
            }
          }
          throw la.a((Throwable) (Object) stackIn_133_0, stackIn_133_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_129_0 != 0;
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        ki var2_ref_ki = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 0, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 0, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 1, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 1, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 2, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 2, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 3, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 3, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 4, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 4, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 0, 0));
            bd.field_b.a(-8212, (ug) (Object) new ki(1, 0, 0));
            var1_int = 0;
            var2_ref_ki = (ki) (Object) bd.field_b.a((byte) -117);
            L1: while (true) {
              if (var2_ref_ki == null) {
                var4 = 0;
                var1_int = var4;
                L2: while (true) {
                  if (ii.field_E <= var4) {
                    bl.a(50, uh.field_e);
                    var2 = 93 / ((-18 - param0) / 35);
                    break L0;
                  } else {
                    ii.field_U[var4] = -1;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                var2_ref_ki.field_B = rl.field_c[var1_int][0];
                var2_ref_ki.field_q = rl.field_c[var1_int][1];
                var2_ref_ki = (ki) (Object) bd.field_b.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "jj.D(" + param0 + 41);
        }
    }

    final static boolean b(boolean param0) {
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1 = (ki) (Object) hd.field_u.a((byte) -117);
            L1: while (true) {
              if (var1 == null) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (!var1.field_E) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  var1 = (ki) (Object) hd.field_u.d((byte) 63);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1_ref, "jj.K(" + 1 + 41);
        }
        return stackIn_9_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(0 == param1)) {
            return;
        }
        ui var5 = (ui) (Object) ((jj) this).field_h;
        bl var6 = ((jj) this).field_C;
        if (var6 == null) {
        } else {
            var7 = var5.a(param3, (byte) 113, (we) this);
            var8 = var5.a((we) this, -94, param2);
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = (bl) (Object) ((jj) this).field_G.a((byte) -117);
        L0: while (true) {
          if (var4 == null) {
            return null;
          } else {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (bl) (Object) ((jj) this).field_G.d((byte) 63);
                continue L0;
              } else {
                L2: {
                  if (var5.field_l > param1) {
                    break L2;
                  } else {
                    if (var5.field_n > param0) {
                      break L2;
                    } else {
                      if (var5.field_l + var5.field_i <= param1) {
                        break L2;
                      } else {
                        if (param0 > var5.field_n - -var5.field_j) {
                          break L2;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_e;
                continue L1;
              }
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param0 >= -23) {
            String discarded$0 = ((jj) this).a((byte) -81);
        }
        super.b(-102, param1, param2, param3);
        int var5 = -((jj) this).field_r + param1;
        int var6 = param2 - ((jj) this).field_e;
        bl var7 = this.b(var6, var5, 2);
        if (var7 != null) {
            if (!(((jj) this).field_o == null)) {
                ((u) (Object) ((jj) this).field_o).a(var7.field_h, -21099, (jj) this, param3);
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((jj) this).field_D) {
                  break L2;
                } else {
                  if (((jj) this).field_D.length <= param1) {
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
                if (((jj) this).field_D == null) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((jj) this).field_D.length) {
                      break L3;
                    } else {
                      var7[var5] = ((jj) this).field_D[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              ((jj) this).field_D = var8;
              break L1;
            }
            if (!param0) {
              ((jj) this).field_D[param1] = param2;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("jj.J(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    String a(byte param0) {
        if (param0 != 54) {
            return null;
        }
        if (null == ((jj) this).field_C) {
            return null;
        }
        if (null == ((jj) this).field_D) {
            return null;
        }
        if (((jj) this).field_C.field_h >= ((jj) this).field_D.length) {
            return null;
        }
        return ((jj) this).field_D[((jj) this).field_C.field_h];
    }

    jj(String param0, ml param1) {
        super(param0, (of) null);
        ((jj) this).field_C = null;
        try {
            ((jj) this).field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "jj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
    }
}
