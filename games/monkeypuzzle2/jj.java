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
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, (byte) -28);
        ((jj) this).field_C = null;
        if (param3 >= -13) {
            ((jj) this).field_D = null;
        }
        if (!(!((jj) this).field_g)) {
            var5 = ei.field_a + (-param2 - ((jj) this).field_r);
            var6 = -((jj) this).field_e + -param1 + p.field_a;
            ((jj) this).field_C = this.b(var6, var5, 2);
        }
    }

    final static cj a(String[] args, boolean param1) {
        cj var2 = new cj(false);
        if (!param1) {
            jj.d((byte) -44);
        }
        var2.field_g = args;
        return var2;
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
            ((jj) this).a(-61, 36, 65, -22);
        }
        ((jj) this).a(((ui) (Object) ((jj) this).field_h).a((we) this, false), 13361, param0, param2, param1);
    }

    boolean a(we param0, boolean param1) {
        if (param1) {
            field_F = -112;
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 13361) {
            jj.c((byte) -53);
        }
        super.a(param0, param1 + 0, param2, param3, param4);
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
        bl var10 = null;
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
          if (0 == (var5 ^ -1)) {
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
                    var10.field_e = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = var15;
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
        int var4 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_129_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        L0: {
          var33 = MonkeyPuzzle2.field_F ? 1 : 0;
          param3 = param3 - (-param1.field_I.field_n + nd.field_b.field_n) / 2;
          param2 = param2 - (-param1.field_I.field_m + nd.field_b.field_m) / 2;
          param2 = param2 + nd.field_b.field_r;
          param3 = param3 + nd.field_b.field_q;
          var4 = sb.field_m.field_r - param2;
          var5 = sb.field_m.field_q - param3;
          var6 = nd.field_b.field_k;
          if (var4 < var6) {
            stackOut_2_0 = sb.field_m.field_k;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          var8 = nd.field_b.field_j;
          if (var5 < var8) {
            stackOut_5_0 = sb.field_m.field_j;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 0;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var9 = stackIn_6_0;
          if (var4 > 0) {
            stackOut_8_0 = var4;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 0;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var10 = stackIn_9_0;
          if (0 < var5) {
            stackOut_11_0 = var5;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 0;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var11 = stackIn_12_0;
          var12 = var7 + var4;
          if (var12 <= var6) {
            break L4;
          } else {
            var12 = var6;
            break L4;
          }
        }
        L5: {
          var13 = var5 - -var9;
          var12 = var12 - var10;
          if (var8 >= var13) {
            break L5;
          } else {
            var13 = var8;
            break L5;
          }
        }
        L6: {
          var13 = var13 - var11;
          var14 = var10 + var11 * var6;
          if (param0 == -32680) {
            break L6;
          } else {
            field_E = null;
            break L6;
          }
        }
        var15 = -var12 + var6;
        var16 = var10 + (-var4 + (-var5 + var11) * var7);
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
        L7: while (true) {
          if (var29 <= 0) {
            L8: {
              if (var22 <= 10) {
                if (var23 > 10) {
                  stackOut_45_0 = 1;
                  stackIn_47_0 = stackOut_45_0;
                  break L8;
                } else {
                  stackOut_44_0 = 0;
                  stackIn_47_0 = stackOut_44_0;
                  break L8;
                }
              } else {
                stackOut_42_0 = 1;
                stackIn_47_0 = stackOut_42_0;
                break L8;
              }
            }
            L9: {
              var29 = stackIn_47_0;
              if (var20 <= 5) {
                if (-6 > (var21 ^ -1)) {
                  stackOut_51_0 = 1;
                  stackIn_53_0 = stackOut_51_0;
                  break L9;
                } else {
                  stackOut_50_0 = 0;
                  stackIn_53_0 = stackOut_50_0;
                  break L9;
                }
              } else {
                stackOut_48_0 = 1;
                stackIn_53_0 = stackOut_48_0;
                break L9;
              }
            }
            L10: {
              var30 = stackIn_53_0;
              if (var29 != 0) {
                break L10;
              } else {
                if (var30 != 0) {
                  break L10;
                } else {
                  return false;
                }
              }
            }
            L11: {
              if (var29 == 0) {
                break L11;
              } else {
                if (var30 != 0) {
                  L12: {
                    if (var20 - -var21 <= var22 - -var23) {
                      stackOut_61_0 = 0;
                      stackIn_62_0 = stackOut_61_0;
                      break L12;
                    } else {
                      stackOut_60_0 = 1;
                      stackIn_62_0 = stackOut_60_0;
                      break L12;
                    }
                  }
                  L13: {
                    var30 = stackIn_62_0;
                    if (var30 != 0) {
                      stackOut_64_0 = 0;
                      stackIn_65_0 = stackOut_64_0;
                      break L13;
                    } else {
                      stackOut_63_0 = 1;
                      stackIn_65_0 = stackOut_63_0;
                      break L13;
                    }
                  }
                  var29 = stackIn_65_0;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L14: {
              if (var30 != 0) {
                L15: {
                  if (var20 >= var21) {
                    break L15;
                  } else {
                    if (0.0f >= param1.field_D) {
                      L16: {
                        var31 = var27 / sb.field_m.field_k;
                        var32 = var27 - sb.field_m.field_k * var31;
                        if (nh.a(var32 - -1, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                          L17: {
                            if ((param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b) < 100.0f) {
                              param1.field_q = (float)(ok.field_b - param1.field_y);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          if (var29 != 0) {
                            break L16;
                          } else {
                            if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                              param1.field_B = (float)ll.field_a;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      if (-1 == (param1.field_m ^ -1)) {
                        param1.field_D = -param1.field_D;
                        break L14;
                      } else {
                        param1.field_q = param1.field_q + 1.0f;
                        break L14;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                if (0.0f > param1.field_D) {
                  break L14;
                } else {
                  if (var20 > var21) {
                    L18: {
                      var31 = var24 / sb.field_m.field_k;
                      var32 = var24 + -(var31 * sb.field_m.field_k);
                      if (nh.a(1 + var32, var31, (int)param1.field_q, (int)(param1.field_q + param1.field_D), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                        L19: {
                          if (100.0f > ((float)(-ok.field_b) + param1.field_q) * (param1.field_q - (float)ok.field_b)) {
                            param1.field_q = (float)(ok.field_b + param1.field_y);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        if (var29 != 0) {
                          break L18;
                        } else {
                          if (((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B) < 100.0f) {
                            param1.field_B = (float)ll.field_a;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      } else {
                        break L18;
                      }
                    }
                    if (param1.field_m != 0) {
                      param1.field_q = param1.field_q - 1.0f;
                      break L14;
                    } else {
                      param1.field_D = -param1.field_D;
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
              } else {
                break L14;
              }
            }
            L20: {
              if (var29 != 0) {
                L21: {
                  if (var22 >= var23) {
                    break L21;
                  } else {
                    if (param1.field_v > 0.0f) {
                      break L21;
                    } else {
                      L22: {
                        var31 = var26 / sb.field_m.field_k;
                        var32 = -(var31 * sb.field_m.field_k) + var26 + 80;
                        if (nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), param0 + 27255, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 - 1)) {
                          L23: {
                            if (var30 != 0) {
                              break L23;
                            } else {
                              if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                                break L23;
                              } else {
                                param1.field_q = (float)ok.field_b;
                                break L23;
                              }
                            }
                          }
                          if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                            param1.field_B = (float)(ll.field_a + -param1.field_G);
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      if (param1.field_m == 0) {
                        param1.field_v = -param1.field_v;
                        break L20;
                      } else {
                        param1.field_B = param1.field_B + 1.0f;
                        break L20;
                      }
                    }
                  }
                }
                if (var23 >= var22) {
                  break L20;
                } else {
                  if (param1.field_v >= 0.0f) {
                    L24: {
                      var31 = var25 / sb.field_m.field_k;
                      var32 = 80 + var25 + -(var31 * sb.field_m.field_k);
                      if (!nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 + -1)) {
                        break L24;
                      } else {
                        L25: {
                          if (100.0f > ((float)(-ll.field_a) + param1.field_B) * (param1.field_B - (float)ll.field_a)) {
                            param1.field_B = (float)(ll.field_a - -param1.field_G);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        if (var30 != 0) {
                          break L24;
                        } else {
                          if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                            break L24;
                          } else {
                            param1.field_q = (float)ok.field_b;
                            break L24;
                          }
                        }
                      }
                    }
                    if (-1 != (param1.field_m ^ -1)) {
                      param1.field_B = param1.field_B - 1.0f;
                      break L20;
                    } else {
                      param1.field_v = -param1.field_v;
                      break L20;
                    }
                  } else {
                    break L20;
                  }
                }
              } else {
                break L20;
              }
            }
            L26: {
              if (var28 != 0) {
                stackOut_128_0 = 0;
                stackIn_129_0 = stackOut_128_0;
                break L26;
              } else {
                stackOut_127_0 = 1;
                stackIn_129_0 = stackOut_127_0;
                break L26;
              }
            }
            return stackIn_129_0 != 0;
          } else {
            var30 = var12;
            L27: while (true) {
              if (var30 <= 0) {
                var16 = var16 + var17;
                var14 = var14 + var15;
                var29--;
                continue L7;
              } else {
                if (0 != var40[var14]) {
                  if (0 != var41[var16]) {
                    var31 = var41[var16];
                    if (var31 >= 16777212) {
                      if (var31 == -16777214) {
                        var25 = var16;
                        var22++;
                        var14++;
                        var16++;
                        var30--;
                        continue L27;
                      } else {
                        if (16777212 == var31) {
                          var23++;
                          var26 = var16;
                          var14++;
                          var16++;
                          var30--;
                          continue L27;
                        } else {
                          if (-16777216 != var31) {
                            if (16777214 == var31) {
                              var21++;
                              var27 = var16;
                              var14++;
                              var16++;
                              var30--;
                              continue L27;
                            } else {
                              var14++;
                              var16++;
                              var30--;
                              continue L27;
                            }
                          } else {
                            var20++;
                            var24 = var16;
                            var14++;
                            var16++;
                            var30--;
                            continue L27;
                          }
                        }
                      }
                    } else {
                      L28: {
                        var32_ref_ki = e.field_a[-1 + var31];
                        stackOut_27_0 = var28;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if ((var32_ref_ki.field_w ^ -1) != -4) {
                          stackOut_29_0 = stackIn_29_0;
                          stackOut_29_1 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          break L28;
                        } else {
                          stackOut_28_0 = stackIn_28_0;
                          stackOut_28_1 = 1;
                          stackIn_30_0 = stackOut_28_0;
                          stackIn_30_1 = stackOut_28_1;
                          break L28;
                        }
                      }
                      var28 = stackIn_30_0 | stackIn_30_1;
                      jc.a(var32_ref_ki, (byte) -124, param1);
                      var14++;
                      var16++;
                      var30--;
                      continue L27;
                    }
                  } else {
                    var14++;
                    var16++;
                    var30--;
                    continue L27;
                  }
                } else {
                  var14++;
                  var16++;
                  var30--;
                  continue L27;
                }
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        ki var2_ref_ki = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
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
        var1 = 0;
        var2_ref_ki = (ki) (Object) bd.field_b.a((byte) -117);
        L0: while (true) {
          if (var2_ref_ki == null) {
            var4 = 0;
            var1 = var4;
            L1: while (true) {
              if (ii.field_E <= var4) {
                bl.a(50, uh.field_e);
                var2 = 93 / ((-18 - param0) / 35);
                return;
              } else {
                ii.field_U[var4] = -1;
                var4++;
                continue L1;
              }
            }
          } else {
            var2_ref_ki.field_B = rl.field_c[var1][0];
            var2_ref_ki.field_q = rl.field_c[var1][1];
            var2_ref_ki = (ki) (Object) bd.field_b.d((byte) 63);
            continue L0;
          }
        }
    }

    final static boolean b(boolean param0) {
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!param0) {
            field_B = null;
        }
        ki var1 = (ki) (Object) hd.field_u.a((byte) -117);
        while (var1 != null) {
            if (!(var1.field_E)) {
                return false;
            }
            var1 = (ki) (Object) hd.field_u.d((byte) 63);
        }
        return true;
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
        bl var5 = null;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        bl var4 = (bl) (Object) ((jj) this).field_G.a((byte) -117);
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (var5.field_l <= param1) {
                    if (var5.field_n <= param0) {
                        if (var5.field_l + var5.field_i > param1) {
                            if (param0 <= var5.field_n - -var5.field_j) {
                                return var4;
                            }
                        }
                    }
                }
                var5 = var5.field_e;
            }
            var4 = (bl) (Object) ((jj) this).field_G.d((byte) 63);
        }
        if (param2 == 2) {
            return null;
        }
        ((jj) this).field_G = null;
        return null;
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
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != ((jj) this).field_D) {
            // if_icmple L25
        } else {
            var7 = new String[param1 - -1];
            var4 = var7;
            if (((jj) this).field_D != null) {
                for (var5 = 0; var5 < ((jj) this).field_D.length; var5++) {
                    var7[var5] = ((jj) this).field_D[var5];
                }
            }
            ((jj) this).field_D = var4;
        }
        if (param0) {
            return;
        }
        ((jj) this).field_D[param1] = param2;
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
        ((jj) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
    }
}
