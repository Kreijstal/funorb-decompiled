/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class t {
    int field_i;
    private int[][] field_c;
    int[] field_k;
    byte[][] field_e;
    int field_v;
    int[][] field_a;
    int[] field_u;
    static df field_h;
    int[] field_j;
    qm[] field_n;
    int[] field_m;
    qm field_r;
    int[] field_d;
    static hl field_q;
    static int field_l;
    static int field_t;
    int field_f;
    static String field_p;
    private int[] field_g;
    private int field_s;
    static hl field_o;
    private byte[] field_b;

    final static de a(boolean param0, byte[] param1) {
        de var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        de stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        de stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_q = (hl) null;
                break L1;
              }
            }
            if (param1 != null) {
              var2 = new de(param1, qa.field_x, i.field_t, je.field_h, sn.field_e, ga.field_a);
              an.b(-100);
              stackOut_5_0 = (de) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("t.D(").append(param0).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (de) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static int a(int param0, int param1, String param2, String[] param3, jb param4) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var14 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var6 = 72 % ((param1 - 53) / 49);
              var5_int = param4.b(param2);
              if (var5_int > param0) {
                break L1;
              } else {
                if (-1 == param2.indexOf("<br>")) {
                  param3[0] = param2;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var7 = (var5_int + param0 - 1) / param0;
            param0 = var5_int / var7;
            var7 = 0;
            var8 = 0;
            var9 = param2.length();
            var10 = 0;
            L2: while (true) {
              if (var9 <= var10) {
                L3: {
                  if (var9 <= var8) {
                    break L3;
                  } else {
                    incrementValue$3 = var7;
                    var7++;
                    param3[incrementValue$3] = param2.substring(var8, var9).trim();
                    break L3;
                  }
                }
                stackOut_22_0 = var7;
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  L5: {
                    var11 = param2.charAt(var10);
                    if (32 == var11) {
                      break L5;
                    } else {
                      if (var11 == 45) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var12 = param2.substring(var8, 1 + var10).trim();
                  var13 = param4.b(var12);
                  if (var13 >= param0) {
                    var8 = var10 - -1;
                    incrementValue$4 = var7;
                    var7++;
                    param3[incrementValue$4] = var12;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (var11 == 62) {
                  L6: {
                    if (param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
                      incrementValue$5 = var7;
                      var7++;
                      param3[incrementValue$5] = param2.substring(var8, -3 + var10).trim();
                      var8 = 1 + var10;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("t.B(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_23_0;
        }
    }

    private final void a(byte[] param0, int param1) {
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] array$9 = null;
        int dupTemp$10 = 0;
        int[] array$11 = null;
        int dupTemp$12 = 0;
        int[] array$13 = null;
        RuntimeException var3 = null;
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
        bh var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        var16 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var17 = new bh(pk.a(param0, (byte) 94));
              var4 = var17.d((byte) -99);
              if (5 > var4) {
                break L1;
              } else {
                if ((var4 ^ -1) >= -8) {
                  L2: {
                    if (-7 >= (var4 ^ -1)) {
                      this.field_f = var17.f(param1 + -128);
                      break L2;
                    } else {
                      this.field_f = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d((byte) -99);
                    if ((1 & var5) == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (var4 < 7) {
                      this.field_s = var17.e(127);
                      break L4;
                    } else {
                      this.field_s = var17.c((byte) -40);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    var9 = -1;
                    this.field_j = new int[this.field_s];
                    if ((var4 ^ -1) > -8) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= this.field_s) {
                          break L6;
                        } else {
                          dupTemp$7 = var8 + var17.e(127);
                          var8 = dupTemp$7;
                          this.field_j[var10] = dupTemp$7;
                          if (var9 < this.field_j[var10]) {
                            var9 = this.field_j[var10];
                            var10++;
                            continue L7;
                          } else {
                            var10++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L8: while (true) {
                        if (this.field_s <= var10) {
                          break L6;
                        } else {
                          dupTemp$8 = var8 + var17.c((byte) -40);
                          var8 = dupTemp$8;
                          this.field_j[var10] = dupTemp$8;
                          if (this.field_j[var10] > var9) {
                            var9 = this.field_j[var10];
                            var10++;
                            continue L8;
                          } else {
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    this.field_i = var9 + 1;
                    this.field_d = new int[this.field_i];
                    if (var7 == 0) {
                      break L9;
                    } else {
                      this.field_e = new byte[this.field_i][];
                      break L9;
                    }
                  }
                  L10: {
                    this.field_u = new int[this.field_i];
                    this.field_a = new int[this.field_i][];
                    this.field_k = new int[this.field_i];
                    this.field_m = new int[this.field_i];
                    if (var6 == 0) {
                      break L10;
                    } else {
                      this.field_g = new int[this.field_i];
                      var10 = 0;
                      L11: while (true) {
                        if (this.field_i <= var10) {
                          var10 = 0;
                          L12: while (true) {
                            if (var10 >= this.field_s) {
                              this.field_r = new qm(this.field_g);
                              break L10;
                            } else {
                              this.field_g[this.field_j[var10]] = var17.f(param1 + -112);
                              var10++;
                              continue L12;
                            }
                          }
                        } else {
                          this.field_g[var10] = -1;
                          var10++;
                          continue L11;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L13: while (true) {
                    if (this.field_s <= var10) {
                      L14: {
                        if (var7 == 0) {
                          break L14;
                        } else {
                          var10 = 0;
                          L15: while (true) {
                            if (this.field_s <= var10) {
                              break L14;
                            } else {
                              var21 = new byte[64];
                              var17.b(64, 0, var21, 126);
                              this.field_e[this.field_j[var10]] = var21;
                              var10++;
                              continue L15;
                            }
                          }
                        }
                      }
                      var10 = param1;
                      L16: while (true) {
                        if (var10 >= this.field_s) {
                          L17: {
                            if ((var4 ^ -1) <= -8) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= this.field_s) {
                                  var10 = 0;
                                  L19: while (true) {
                                    if (this.field_s <= var10) {
                                      break L17;
                                    } else {
                                      var11 = this.field_j[var10];
                                      var8 = 0;
                                      var12 = this.field_m[var11];
                                      var13 = -1;
                                      array$9 = new int[var12];
                                      this.field_a[var11] = array$9;
                                      var14 = 0;
                                      L20: while (true) {
                                        if (var14 >= var12) {
                                          L21: {
                                            this.field_d[var11] = 1 + var13;
                                            if (var12 == var13 - -1) {
                                              this.field_a[var11] = null;
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          var10++;
                                          continue L19;
                                        } else {
                                          L22: {
                                            dupTemp$10 = var8 + var17.c((byte) -40);
                                            var8 = dupTemp$10;
                                            this.field_a[var11][var14] = dupTemp$10;
                                            var15 = dupTemp$10;
                                            if (var15 > var13) {
                                              var13 = var15;
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                          var14++;
                                          continue L20;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_m[this.field_j[var10]] = var17.c((byte) -40);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var10 = 0;
                              L23: while (true) {
                                if (this.field_s <= var10) {
                                  var10 = 0;
                                  L24: while (true) {
                                    if (var10 >= this.field_s) {
                                      break L17;
                                    } else {
                                      var11 = this.field_j[var10];
                                      var8 = 0;
                                      var12 = this.field_m[var11];
                                      var13 = -1;
                                      array$11 = new int[var12];
                                      this.field_a[var11] = array$11;
                                      var14 = 0;
                                      L25: while (true) {
                                        if (var12 <= var14) {
                                          L26: {
                                            this.field_d[var11] = 1 + var13;
                                            if (var12 != var13 - -1) {
                                              break L26;
                                            } else {
                                              this.field_a[var11] = null;
                                              break L26;
                                            }
                                          }
                                          var10++;
                                          continue L24;
                                        } else {
                                          L27: {
                                            dupTemp$12 = var8 + var17.e(127);
                                            var8 = dupTemp$12;
                                            this.field_a[var11][var14] = dupTemp$12;
                                            var15 = dupTemp$12;
                                            if (var13 < var15) {
                                              var13 = var15;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var14++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_m[this.field_j[var10]] = var17.e(127);
                                  var10++;
                                  continue L23;
                                }
                              }
                            }
                          }
                          L28: {
                            if (var6 != 0) {
                              this.field_c = new int[1 + var9][];
                              this.field_n = new qm[1 + var9];
                              var10 = 0;
                              L29: while (true) {
                                if (this.field_s <= var10) {
                                  break L28;
                                } else {
                                  var11 = this.field_j[var10];
                                  var12 = this.field_m[var11];
                                  array$13 = new int[this.field_d[var11]];
                                  this.field_c[var11] = array$13;
                                  var13 = 0;
                                  L30: while (true) {
                                    if (var13 >= this.field_d[var11]) {
                                      var13 = 0;
                                      L31: while (true) {
                                        if (var12 <= var13) {
                                          this.field_n[var11] = new qm(this.field_c[var11]);
                                          var10++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (this.field_a[var11] == null) {
                                              var14 = var13;
                                              break L32;
                                            } else {
                                              var14 = this.field_a[var11][var13];
                                              break L32;
                                            }
                                          }
                                          this.field_c[var11][var14] = var17.f(-124);
                                          var13++;
                                          continue L31;
                                        }
                                      }
                                    } else {
                                      this.field_c[var11][var13] = -1;
                                      var13++;
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L28;
                            }
                          }
                          break L0;
                        } else {
                          this.field_k[this.field_j[var10]] = var17.f(7);
                          var10++;
                          continue L16;
                        }
                      }
                    } else {
                      this.field_u[this.field_j[var10]] = var17.f(param1 + -109);
                      var10++;
                      continue L13;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var3 = decompiledCaughtException;
            stackOut_93_0 = (RuntimeException) (var3);
            stackOut_93_1 = new StringBuilder().append("t.E(");
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param0 == null) {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L33;
            } else {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L33;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_96_0), stackIn_96_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            return;
        }
        fk.field_W = param0;
    }

    final static void b(int param0, int param1) {
        int discarded$4 = bh.h((byte) -47);
        if (param1 != -21901) {
            field_p = (String) null;
        }
    }

    final static void a(boolean param0, ie param1, long param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, String param11, boolean param12, int param13) {
        try {
            de discarded$1 = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            byte[] var16 = null;
            int stackIn_3_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
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
            try {
              L0: {
                L1: {
                  kb.field_q = new bc(param4);
                  nd.field_Lb = new bc(param7);
                  wc.field_I = param3;
                  oi.field_m = param5;
                  if (!param12) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  mc.field_k = stackIn_3_0 != 0;
                  tc.field_s = param2;
                  if (param9 > 29) {
                    break L2;
                  } else {
                    var16 = (byte[]) null;
                    discarded$1 = t.a(false, (byte[]) null);
                    break L2;
                  }
                }
                L3: {
                  pg.field_m = param0;
                  wg.field_c = param10;
                  lm.field_g = param13;
                  ko.field_t = param8;
                  oi.field_l = param1;
                  rl.field_a = param6;
                  pd.field_r = param11;
                  if (oi.field_l.field_f == null) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        sk.field_f = new p(oi.field_l.field_f, 64, 0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) (var15_ref);
                stackOut_10_1 = new StringBuilder().append("t.A(").append(param0).append(',');
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param1 == null) {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              L6: {
                stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param11 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_q = null;
        field_p = null;
        field_o = null;
        if (param0 < 75) {
            field_h = (df) null;
        }
    }

    t(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_v = ti.a(param0, (byte) 103, param0.length);
            if (this.field_v != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_b = qb.a(param0, (byte) -89, param0.length, 0);
                for (var4_int = 0; (var4_int ^ -1) > -65; var4_int++) {
                    if (this.field_b[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new df(3);
        field_p = "Try changing the following settings:  ";
        field_t = 0;
    }
}
