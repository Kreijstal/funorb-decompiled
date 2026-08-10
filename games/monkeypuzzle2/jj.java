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
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jj.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (cj) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("jj.B(");

            if (args == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_3_0 = 0;
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
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jj.AA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        ui var3;
        aa var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        be var12;
        int var13;
        int var14;
        bl var15;
        int var16;
        String var17;
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
          if (0 == (var5 ^ -1)) {
            return;
          } else {
            var7 = this.field_s.indexOf(">", var5);
            var6 = this.field_s.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_s.indexOf("</hotspot>", var5);
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
                    stackIn_9_0 = var4.a(-75, var5);
                    break L3;
                  } else {
                    stackIn_9_0 = var12.field_c[0];
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 == var9) {
                    stackIn_14_0 = var4.a(116, var2);
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = var12.field_c[-1 + var12.field_c.length];
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new bl(var7, var13, var12.field_a, -var13 + var14, Math.max(var3.a(2), var12.field_f - var12.field_a));
                  if (var10 != null) {
                    ((bl) (var10)).field_e = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = var15;
                this.field_G.a(-8212, var15);
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    public static void d(byte param0) {
        field_E = (byte[][]) null;
        field_B = null;
        if (param0 != 117) {
            jj.b(true);
        }
    }

    final static boolean a(int param0, ki param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_131_0 = 0;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
        int var32 = 0;
        ki var32_ref_ki = null;
        int var33 = 0;
        int[] var40 = null;
        int[] var41 = null;
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
                stackIn_4_0 = sb.field_m.field_k;
                break L1;
              } else {
                stackIn_4_0 = 0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              var8 = nd.field_b.field_j;
              if (var5 < var8) {
                stackIn_7_0 = sb.field_m.field_j;
                break L2;
              } else {
                stackIn_7_0 = 0;
                break L2;
              }
            }
            L3: {
              var9 = stackIn_7_0;
              if (var4_int > 0) {
                stackIn_10_0 = var4_int;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            L4: {
              var10 = stackIn_10_0;
              if (0 < var5) {
                stackIn_13_0 = var5;
                break L4;
              } else {
                stackIn_13_0 = 0;
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
              if (var29 <= 0) {
                L9: {
                  if (var22 <= 10) {
                    if (var23 > 10) {
                      stackIn_49_0 = 1;
                      break L9;
                    } else {
                      stackIn_49_0 = 0;
                      break L9;
                    }
                  } else {
                    stackIn_49_0 = 1;
                    break L9;
                  }
                }
                L10: {
                  var29 = stackIn_49_0;
                  if (var20 <= 5) {
                    if (-6 > (var21 ^ -1)) {
                      stackIn_55_0 = 1;
                      break L10;
                    } else {
                      stackIn_55_0 = 0;
                      break L10;
                    }
                  } else {
                    stackIn_55_0 = 1;
                    break L10;
                  }
                }
                L11: {
                  var30 = stackIn_55_0;
                  if (var29 != 0) {
                    break L11;
                  } else {
                    if (var30 != 0) {
                      break L11;
                    } else {
                      return false;
                    }
                  }
                }
                L12: {
                  if (var29 == 0) {
                    break L12;
                  } else {
                    if (var30 != 0) {
                      L13: {
                        if (var20 - -var21 <= var22 - -var23) {
                          stackIn_64_0 = 0;
                          break L13;
                        } else {
                          stackIn_64_0 = 1;
                          break L13;
                        }
                      }
                      L14: {
                        var30 = stackIn_64_0;
                        if (var30 != 0) {
                          stackIn_67_0 = 0;
                          break L14;
                        } else {
                          stackIn_67_0 = 1;
                          break L14;
                        }
                      }
                      var29 = stackIn_67_0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  if (var30 != 0) {
                    L16: {
                      if (var20 >= var21) {
                        break L16;
                      } else {
                        if (0.0f >= param1.field_D) {
                          L17: {
                            var31 = var27 / sb.field_m.field_k;
                            var32 = var27 - sb.field_m.field_k * var31;
                            if (nh.a(var32 - -1, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                              L18: {
                                if ((param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b) < 100.0f) {
                                  param1.field_q = (float)(ok.field_b - param1.field_y);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              if (var29 != 0) {
                                break L17;
                              } else {
                                if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                                  param1.field_B = (float)ll.field_a;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                            } else {
                              break L17;
                            }
                          }
                          if (-1 == (param1.field_m ^ -1)) {
                            param1.field_D = -param1.field_D;
                            break L15;
                          } else {
                            param1.field_q = param1.field_q + 1.0f;
                            break L15;
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (0.0f > param1.field_D) {
                      break L15;
                    } else {
                      if (var20 > var21) {
                        L19: {
                          var31 = var24 / sb.field_m.field_k;
                          var32 = var24 + -(var31 * sb.field_m.field_k);
                          if (nh.a(1 + var32, var31, (int)param1.field_q, (int)(param1.field_q + param1.field_D), -5425, var32, (int)(param1.field_v + param1.field_B), (int)param1.field_B, var31)) {
                            L20: {
                              if (100.0f > ((float)(-ok.field_b) + param1.field_q) * (param1.field_q - (float)ok.field_b)) {
                                param1.field_q = (float)(ok.field_b + param1.field_y);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            if (var29 != 0) {
                              break L19;
                            } else {
                              if (((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B) < 100.0f) {
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
                        if (param1.field_m != 0) {
                          param1.field_q = param1.field_q - 1.0f;
                          break L15;
                        } else {
                          param1.field_D = -param1.field_D;
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                  } else {
                    break L15;
                  }
                }
                L21: {
                  if (var29 != 0) {
                    L22: {
                      if (var22 >= var23) {
                        break L22;
                      } else {
                        if (param1.field_v > 0.0f) {
                          break L22;
                        } else {
                          L23: {
                            var31 = var26 / sb.field_m.field_k;
                            var32 = -(var31 * sb.field_m.field_k) + var26 + 80;
                            if (nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), param0 + 27255, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 - 1)) {
                              L24: {
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
                              if (100.0f > ((float)(-ll.field_a) + param1.field_B) * ((float)(-ll.field_a) + param1.field_B)) {
                                param1.field_B = (float)(ll.field_a + -param1.field_G);
                                break L23;
                              } else {
                                break L23;
                              }
                            } else {
                              break L23;
                            }
                          }
                          if (param1.field_m == 0) {
                            param1.field_v = -param1.field_v;
                            break L21;
                          } else {
                            param1.field_B = param1.field_B + 1.0f;
                            break L21;
                          }
                        }
                      }
                    }
                    if (var23 >= var22) {
                      break L21;
                    } else {
                      if (param1.field_v >= 0.0f) {
                        L25: {
                          var31 = var25 / sb.field_m.field_k;
                          var32 = 80 + var25 + -(var31 * sb.field_m.field_k);
                          if (!nh.a(var32, var31, (int)param1.field_q, (int)(param1.field_D + param1.field_q), -5425, var32, (int)(param1.field_B + param1.field_v), (int)param1.field_B, var31 + -1)) {
                            break L25;
                          } else {
                            L26: {
                              if (100.0f > ((float)(-ll.field_a) + param1.field_B) * (param1.field_B - (float)ll.field_a)) {
                                param1.field_B = (float)(ll.field_a - -param1.field_G);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            if (var30 != 0) {
                              break L25;
                            } else {
                              if (100.0f <= (param1.field_q - (float)ok.field_b) * (param1.field_q - (float)ok.field_b)) {
                                break L25;
                              } else {
                                param1.field_q = (float)ok.field_b;
                                break L25;
                              }
                            }
                          }
                        }
                        if (-1 != (param1.field_m ^ -1)) {
                          param1.field_B = param1.field_B - 1.0f;
                          break L21;
                        } else {
                          param1.field_v = -param1.field_v;
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                  } else {
                    break L21;
                  }
                }
                L27: {
                  if (var28 != 0) {
                    stackIn_131_0 = 0;
                    break L27;
                  } else {
                    stackIn_131_0 = 1;
                    break L27;
                  }
                }
                break L0;
              } else {
                var30 = var12;
                L28: while (true) {
                  if (var30 <= 0) {
                    var16 = var16 + var17;
                    var14 = var14 + var15;
                    var29--;
                    continue L8;
                  } else {
                    L29: {
                      if (0 != var40[var14]) {
                        if (0 != var41[var16]) {
                          var31 = var41[var16];
                          if (var31 >= 16777212) {
                            if ((var31 ^ -1) == -16777214) {
                              var25 = var16;
                              var22++;
                              break L29;
                            } else {
                              if (16777212 == var31) {
                                var23++;
                                var26 = var16;
                                break L29;
                              } else {
                                if (-16777216 != (var31 ^ -1)) {
                                  if (16777214 == var31) {
                                    var21++;
                                    var27 = var16;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                } else {
                                  var20++;
                                  var24 = var16;
                                  break L29;
                                }
                              }
                            }
                          } else {
                            L30: {
                              var32_ref_ki = e.field_a[-1 + var31];
                              stackIn_30_0 = var28;

                              if ((var32_ref_ki.field_w ^ -1) != -4) {
                                stackIn_31_0 = stackIn_30_0;
                                stackIn_31_1 = 0;
                                break L30;
                              } else {
                                stackIn_31_0 = stackIn_30_0;
                                stackIn_31_1 = 1;
                                break L30;
                              }
                            }
                            var28 = stackIn_31_0 | stackIn_31_1;
                            jc.a(var32_ref_ki, (byte) -124, param1);
                            break L29;
                          }
                        } else {
                          break L29;
                        }
                      } else {
                        break L29;
                      }
                    }
                    var14++;
                    var16++;
                    var30--;
                    continue L28;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var4 = decompiledCaughtException;
            stackIn_134_0 = (RuntimeException) (var4);

            stackIn_134_1 = new StringBuilder().append("jj.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_135_0 = (RuntimeException) ((Object) stackIn_134_0);
              stackIn_135_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackIn_135_2 = "null";
              break L31;
            } else {
              stackIn_135_0 = (RuntimeException) ((Object) stackIn_134_0);
              stackIn_135_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackIn_135_2 = "{...}";
              break L31;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_135_0), stackIn_135_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_131_0 != 0;
    }

    final static void c(byte param0) {
        int var1_int = 0;
        ki var2_ref_ki = null;
        int var4 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
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
            while (var2_ref_ki != null) {
                var2_ref_ki.field_B = rl.field_c[var1_int][0];
                var2_ref_ki.field_q = rl.field_c[var1_int][1];
                var2_ref_ki = (ki) ((Object) bd.field_b.d((byte) 63));
            }
            var4 = 0;
            var1_int = var4;
            while (ii.field_E > var4) {
                ii.field_U[var4] = -1;
                var4++;
            }
            bl.a(50, uh.field_e);
            int var2 = 93 / ((-18 - param0) / 35);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "jj.D(" + param0 + ')');
        }
    }

    final static boolean b(boolean param0) {
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              if (var1 == null) {
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var1.field_E) {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var1 = (ki) ((Object) hd.field_u.d((byte) 63));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "jj.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
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
        bl var5 = null;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        bl var4 = (bl) ((Object) this.field_G.a((byte) -117));
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (var5.field_l <= param1 && var5.field_n <= param0 && var5.field_l + var5.field_i > param1 && param0 <= var5.field_n - -var5.field_j) {
                    return var4;
                }
                var5 = var5.field_e;
            }
            var4 = (bl) ((Object) this.field_G.d((byte) 63));
        }
        if (param2 == 2) {
            return null;
        }
        this.field_G = (pj) null;
        return null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param0 >= -23) {
            this.a((byte) -81);
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_D) {
                  break L2;
                } else {
                  if (this.field_D.length <= param1) {
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
                      continue L4;
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
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("jj.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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
