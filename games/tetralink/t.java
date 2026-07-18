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
        Object stackIn_2_0 = null;
        de stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        de stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new de(param1, qa.field_x, i.field_t, je.field_h, sn.field_e, ga.field_a);
              an.b(-100);
              stackOut_3_0 = (de) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (de) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("t.D(").append(false).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static int a(int param0, int param1, String param2, String[] param3, jb param4) {
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
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                  param3[0] = (String) (Object) param3;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
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
                    int incrementValue$2 = var7;
                    var7++;
                    param3[incrementValue$2] = param2.substring(var8, var9).trim();
                    break L3;
                  }
                }
                stackOut_19_0 = var7;
                stackIn_20_0 = stackOut_19_0;
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
                    int incrementValue$3 = var7;
                    var7++;
                    param3[incrementValue$3] = var12;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var11 != 62) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("t.B(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_20_0;
    }

    private final void a(byte[] param0) {
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
                if (var4 <= 7) {
                  L2: {
                    if (var4 >= 6) {
                      ((t) this).field_f = var17.f(-128);
                      break L2;
                    } else {
                      ((t) this).field_f = 0;
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
                      ((t) this).field_s = var17.e(127);
                      break L4;
                    } else {
                      ((t) this).field_s = var17.c((byte) -40);
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
                    ((t) this).field_j = new int[((t) this).field_s];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((t) this).field_s) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.e(127);
                            var8 = dupTemp$4;
                            ((t) this).field_j[var10] = dupTemp$4;
                            if (~var9 <= ~((t) this).field_j[var10]) {
                              break L8;
                            } else {
                              var9 = ((t) this).field_j[var10];
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (((t) this).field_s <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.c((byte) -40);
                            var8 = dupTemp$5;
                            ((t) this).field_j[var10] = dupTemp$5;
                            if (((t) this).field_j[var10] <= var9) {
                              break L10;
                            } else {
                              var9 = ((t) this).field_j[var10];
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    ((t) this).field_i = var9 + 1;
                    ((t) this).field_d = new int[((t) this).field_i];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((t) this).field_e = new byte[((t) this).field_i][];
                      break L11;
                    }
                  }
                  L12: {
                    ((t) this).field_u = new int[((t) this).field_i];
                    ((t) this).field_a = new int[((t) this).field_i][];
                    ((t) this).field_k = new int[((t) this).field_i];
                    ((t) this).field_m = new int[((t) this).field_i];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((t) this).field_g = new int[((t) this).field_i];
                      var10 = 0;
                      L13: while (true) {
                        if (((t) this).field_i <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((t) this).field_s) {
                              ((t) this).field_r = new qm(((t) this).field_g);
                              break L12;
                            } else {
                              ((t) this).field_g[((t) this).field_j[var10]] = var17.f(-112);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((t) this).field_g[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((t) this).field_s <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (((t) this).field_s <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.b(64, 0, var21, 126);
                              ((t) this).field_e[((t) this).field_j[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((t) this).field_s) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((t) this).field_s) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (~((t) this).field_s >= ~var10) {
                                      break L19;
                                    } else {
                                      var11 = ((t) this).field_j[var10];
                                      var8 = 0;
                                      var12 = ((t) this).field_m[var11];
                                      var13 = -1;
                                      ((t) this).field_a[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            ((t) this).field_d[var11] = 1 + var13;
                                            if (var12 == var13 - -1) {
                                              ((t) this).field_a[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.c((byte) -40);
                                            var8 = dupTemp$6;
                                            ((t) this).field_a[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (~var15 < ~var13) {
                                              var13 = var15;
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                          var14++;
                                          continue L22;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((t) this).field_m[((t) this).field_j[var10]] = var17.c((byte) -40);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (~((t) this).field_s >= ~var10) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= ((t) this).field_s) {
                                      break L19;
                                    } else {
                                      var11 = ((t) this).field_j[var10];
                                      var8 = 0;
                                      var12 = ((t) this).field_m[var11];
                                      var13 = -1;
                                      ((t) this).field_a[var11] = new int[var12];
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            ((t) this).field_d[var11] = 1 + var13;
                                            if (~var12 != ~(var13 - -1)) {
                                              break L28;
                                            } else {
                                              ((t) this).field_a[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.e(127);
                                            var8 = dupTemp$7;
                                            ((t) this).field_a[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (~var13 > ~var15) {
                                              var13 = var15;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var14++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((t) this).field_m[((t) this).field_j[var10]] = var17.e(127);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 != 0) {
                              ((t) this).field_c = new int[1 + var9][];
                              ((t) this).field_n = new qm[1 + var9];
                              var10 = 0;
                              L31: while (true) {
                                if (~((t) this).field_s >= ~var10) {
                                  break L30;
                                } else {
                                  var11 = ((t) this).field_j[var10];
                                  var12 = ((t) this).field_m[var11];
                                  ((t) this).field_c[var11] = new int[((t) this).field_d[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (var13 >= ((t) this).field_d[var11]) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (~var12 >= ~var13) {
                                          ((t) this).field_n[var11] = new qm(((t) this).field_c[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (((t) this).field_a[var11] == null) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = ((t) this).field_a[var11][var13];
                                              break L34;
                                            }
                                          }
                                          ((t) this).field_c[var11][var14] = var17.f(-124);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((t) this).field_c[var11][var13] = -1;
                                      var13++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L30;
                            }
                          }
                          break L0;
                        } else {
                          ((t) this).field_k[((t) this).field_j[var10]] = var17.f(7);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((t) this).field_u[((t) this).field_j[var10]] = var17.f(-109);
                      var10++;
                      continue L15;
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
          L35: {
            var3 = decompiledCaughtException;
            stackOut_93_0 = (RuntimeException) var3;
            stackOut_93_1 = new StringBuilder().append("t.E(");
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param0 == null) {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L35;
            } else {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L35;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_96_0, stackIn_96_2 + ',' + 0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        fk.field_W = param0;
    }

    final static void b(int param0) {
        int discarded$0 = -47;
        int discarded$1 = bh.h();
    }

    final static void a(boolean param0, ie param1, long param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, String param11, boolean param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
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
                L1: {
                  kb.field_q = new bc(5000);
                  nd.field_Lb = new bc(5000);
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
                  if (!param0) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  pg.field_m = stackIn_6_0 != 0;
                  wg.field_c = param10;
                  lm.field_g = param13;
                  ko.field_t = param8;
                  oi.field_l = param1;
                  rl.field_a = param6;
                  pd.field_r = param11;
                  if (oi.field_l.field_f == null) {
                    break L3;
                  } else {
                    {
                      L4: {
                        sk.field_f = new p(oi.field_l.field_f, 64, 0);
                        break L4;
                      }
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
                stackOut_11_0 = (RuntimeException) var15_ref;
                stackOut_11_1 = new StringBuilder().append("t.A(").append(param0).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(5000).append(',').append(param5).append(',').append(param6).append(',').append(5000).append(',').append(param8).append(',').append(118).append(',').append(param10).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param11 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param12 + ',' + param13 + ')');
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
            field_h = null;
        }
    }

    t(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((t) this).field_v = ti.a(param0, (byte) 103, param0.length);
            if (((t) this).field_v != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((t) this).field_b = qb.a(param0, (byte) -89, param0.length, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((t) this).field_b[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            int discarded$0 = 0;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "t.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new df(3);
        field_p = "Try changing the following settings:  ";
        field_t = 0;
    }
}
