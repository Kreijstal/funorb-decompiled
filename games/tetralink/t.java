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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = (de) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("t.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
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
                  stackIn_5_0 = 1;
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
                    incrementValue$0 = var7;
                    var7++;
                    param3[incrementValue$0] = param2.substring(var8, var9).trim();
                    break L3;
                  }
                }
                stackIn_23_0 = var7;
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
                    incrementValue$1 = var7;
                    var7++;
                    param3[incrementValue$1] = var12;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (var11 == 62) {
                  L6: {
                    if (param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
                      incrementValue$2 = var7;
                      var7++;
                      param3[incrementValue$2] = param2.substring(var8, -3 + var10).trim();
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
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("t.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_23_0;
        }
    }

    private final void a(byte[] param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
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
                      stackIn_17_0 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = 1;
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
                          dupTemp$0 = var8 + var17.e(127);
                          var8 = dupTemp$0;
                          this.field_j[var10] = dupTemp$0;
                          if ((var9 ^ -1) > (this.field_j[var10] ^ -1)) {
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
                          dupTemp$1 = var8 + var17.c((byte) -40);
                          var8 = dupTemp$1;
                          this.field_j[var10] = dupTemp$1;
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
                                      array$2 = new int[var12];
                                      this.field_a[var11] = array$2;
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
                                            dupTemp$3 = var8 + var17.c((byte) -40);
                                            var8 = dupTemp$3;
                                            dupTemp$4 = this.field_a[var11];
                                            dupTemp$4[var14] = dupTemp$3;
                                            var15 = dupTemp$3;
                                            if ((var15 ^ -1) < (var13 ^ -1)) {
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
                                      array$5 = new int[var12];
                                      this.field_a[var11] = array$5;
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
                                            dupTemp$6 = var8 + var17.e(127);
                                            var8 = dupTemp$6;
                                            dupTemp$7 = this.field_a[var11];
                                            dupTemp$7[var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if ((var13 ^ -1) > (var15 ^ -1)) {
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
                                  array$8 = new int[this.field_d[var11]];
                                  this.field_c[var11] = array$8;
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
            stackIn_95_0 = (RuntimeException) (var3);

            stackIn_95_1 = new StringBuilder().append("t.E(");

            if (param0 == null) {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L33;
            } else {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
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
        bh.h((byte) -47);
        if (param1 != -21901) {
            field_p = (String) null;
        }
    }

    final static void a(boolean param0, ie param1, long param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, String param11, boolean param12, int param13) {
        try {
            int stackIn_3_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            byte[] var16 = null;
            try {
              L0: {
                L1: {
                  kb.field_q = new bc(param4);
                  nd.field_Lb = new bc(param7);
                  wc.field_I = param3;
                  oi.field_m = param5;
                  if (!param12) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
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
                    t.a(false, (byte[]) null);
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
                stackIn_12_0 = (RuntimeException) (var15_ref);

                stackIn_12_1 = new StringBuilder().append("t.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

                if (param11 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param12 + ',' + param13 + ')');
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
