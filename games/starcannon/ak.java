/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    int[] field_g;
    int field_q;
    int field_b;
    private byte[] field_n;
    int[] field_j;
    int[] field_i;
    private int[][] field_a;
    dl field_l;
    int[][] field_k;
    int[] field_c;
    byte[][] field_p;
    int[] field_d;
    private int[] field_r;
    static hl field_f;
    static int field_e;
    int field_m;
    static int field_h;
    dl[] field_s;
    private int field_o;

    public static void a(byte param0) {
        field_f = null;
        int var1 = -101 / ((param0 - 41) / 44);
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
        rb var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var17 = new rb(hc.a((byte) 51, param0));
              var4 = var17.j(7909);
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if (-8 > (var4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if ((var4 ^ -1) > -7) {
                      this.field_q = 0;
                      break L2;
                    } else {
                      this.field_q = var17.f((byte) -84);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.j(7909);
                    if ((var5 & 1) == 0) {
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
                      this.field_o = var17.i(-1174051992);
                      break L4;
                    } else {
                      this.field_o = var17.e(113);
                      break L4;
                    }
                  }
                  L5: {
                    if ((2 & var5) == 0) {
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
                    if (param1 < -84) {
                      break L6;
                    } else {
                      ak.a((byte) -37);
                      break L6;
                    }
                  }
                  L7: {
                    this.field_g = new int[this.field_o];
                    var9 = -1;
                    if (7 > var4) {
                      var10 = 0;
                      L8: while (true) {
                        if (this.field_o <= var10) {
                          break L7;
                        } else {
                          L9: {
                            dupTemp$7 = var8 + var17.i(-1174051992);
                            var8 = dupTemp$7;
                            this.field_g[var10] = dupTemp$7;
                            if (var9 < this.field_g[var10]) {
                              var9 = this.field_g[var10];
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10++;
                          continue L8;
                        }
                      }
                    } else {
                      var10 = 0;
                      L10: while (true) {
                        if (var10 >= this.field_o) {
                          break L7;
                        } else {
                          dupTemp$8 = var8 + var17.e(90);
                          var8 = dupTemp$8;
                          this.field_g[var10] = dupTemp$8;
                          if (this.field_g[var10] > var9) {
                            var9 = this.field_g[var10];
                            var10++;
                            continue L10;
                          } else {
                            var10++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    this.field_m = var9 + 1;
                    this.field_c = new int[this.field_m];
                    this.field_d = new int[this.field_m];
                    this.field_i = new int[this.field_m];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_p = new byte[this.field_m][];
                      break L11;
                    }
                  }
                  L12: {
                    this.field_k = new int[this.field_m][];
                    this.field_j = new int[this.field_m];
                    if (var6 != 0) {
                      this.field_r = new int[this.field_m];
                      var10 = 0;
                      L13: while (true) {
                        if (this.field_m <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (this.field_o <= var10) {
                              this.field_l = new dl(this.field_r);
                              break L12;
                            } else {
                              this.field_r[this.field_g[var10]] = var17.f((byte) -109);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_r[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (this.field_o <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_o <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(64, (byte) 88, var21, 0);
                              this.field_p[this.field_g[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= this.field_o) {
                          L19: {
                            if (7 > var4) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= this.field_o) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= this.field_o) {
                                      break L19;
                                    } else {
                                      var11 = this.field_g[var10];
                                      var8 = 0;
                                      var12 = this.field_i[var11];
                                      array$9 = new int[var12];
                                      this.field_k[var11] = array$9;
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            this.field_j[var11] = 1 + var13;
                                            if (var12 != var13 - -1) {
                                              break L23;
                                            } else {
                                              this.field_k[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            dupTemp$10 = var8 + var17.i(-1174051992);
                                            var8 = dupTemp$10;
                                            this.field_k[var11][var14] = dupTemp$10;
                                            var15 = dupTemp$10;
                                            if (var13 < var15) {
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
                                  this.field_i[this.field_g[var10]] = var17.i(-1174051992);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= this.field_o) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (this.field_o <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_g[var10];
                                      var8 = 0;
                                      var12 = this.field_i[var11];
                                      var13 = -1;
                                      array$11 = new int[var12];
                                      this.field_k[var11] = array$11;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            this.field_j[var11] = 1 + var13;
                                            if (1 + var13 == var12) {
                                              this.field_k[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          dupTemp$12 = var8 + var17.e(74);
                                          var8 = dupTemp$12;
                                          this.field_k[var11][var14] = dupTemp$12;
                                          var15 = dupTemp$12;
                                          if (var15 > var13) {
                                            var13 = var15;
                                            var14++;
                                            continue L27;
                                          } else {
                                            var14++;
                                            continue L27;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_i[this.field_g[var10]] = var17.e(-116);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L29: {
                            if (var6 == 0) {
                              break L29;
                            } else {
                              this.field_s = new dl[var9 + 1];
                              this.field_a = new int[var9 + 1][];
                              var10 = 0;
                              L30: while (true) {
                                if (this.field_o <= var10) {
                                  break L29;
                                } else {
                                  var11 = this.field_g[var10];
                                  var12 = this.field_i[var11];
                                  array$13 = new int[this.field_j[var11]];
                                  this.field_a[var11] = array$13;
                                  var13 = 0;
                                  L31: while (true) {
                                    if (var13 >= this.field_j[var11]) {
                                      var13 = 0;
                                      L32: while (true) {
                                        if (var12 <= var13) {
                                          this.field_s[var11] = new dl(this.field_a[var11]);
                                          var10++;
                                          continue L30;
                                        } else {
                                          L33: {
                                            if (null == this.field_k[var11]) {
                                              var14 = var13;
                                              break L33;
                                            } else {
                                              var14 = this.field_k[var11][var13];
                                              break L33;
                                            }
                                          }
                                          this.field_a[var11][var14] = var17.f((byte) -108);
                                          var13++;
                                          continue L32;
                                        }
                                      }
                                    } else {
                                      this.field_a[var11][var13] = -1;
                                      var13++;
                                      continue L31;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          this.field_d[this.field_g[var10]] = var17.f((byte) -115);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      this.field_c[this.field_g[var10]] = var17.f((byte) -107);
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) (var3);
            stackOut_95_1 = new StringBuilder().append("ak.C(");
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param0 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L34;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L34;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var1_int = 0;
        ia var2 = null;
        int var3 = 0;
        int var4 = 0;
        vc var5 = null;
        long var5_long = 0L;
        int var6 = 0;
        re var7_ref_re = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String[][] var9 = null;
        String[][] var10 = null;
        long[][] var11 = null;
        int[][] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        String var22 = null;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var27 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var1_int = -2 % ((param0 - -38) / 55);
              var2 = se.field_p;
              var3 = var2.j(7909);
              if (var3 == 0) {
                var4 = var2.i(-1174051992);
                var5 = (vc) ((Object) ne.field_c.c(-3905));
                L2: while (true) {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var4 == var5.field_i) {
                        break L3;
                      } else {
                        var5 = (vc) ((Object) ne.field_c.a(-16913));
                        continue L2;
                      }
                    }
                  }
                  if (var5 == null) {
                    ec.a((byte) 27);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L4: {
                      var6 = var2.j(7909);
                      if (var6 != 0) {
                        var7 = var5.field_h;
                        ok.field_rb[0].field_f = null;
                        ok.field_rb[0].field_a = we.field_i;
                        var8 = var5.field_l;
                        ok.field_rb[0].field_e = false;
                        var9_int = 1;
                        L5: while (true) {
                          if (var6 <= var9_int) {
                            dupTemp$6 = new String[3][var7];
                            var5.field_n = dupTemp$6;
                            var9 = dupTemp$6;
                            var10 = new String[3][var7];
                            dupTemp$7 = new long[3][var7];
                            var5.field_g = dupTemp$7;
                            var11 = dupTemp$7;
                            dupTemp$8 = new int[3][var8 * var7];
                            var5.field_o = dupTemp$8;
                            var12 = dupTemp$8;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                            var19 = var2.j(7909);
                            if (-1 <= (var19 ^ -1)) {
                              break L4;
                            } else {
                              var20 = 0;
                              L6: while (true) {
                                if (var19 <= var20) {
                                  break L4;
                                } else {
                                  L7: {
                                    var21 = var2.j(7909);
                                    var22 = ok.field_rb[var21].field_a;
                                    var23 = var2.c((byte) 5);
                                    var25 = var2.field_g;
                                    if (var7 > var20) {
                                      var9[0][var13] = var22;
                                      var10[0][var13] = ok.field_rb[var21].field_f;
                                      var11[0][var13] = var23;
                                      var13++;
                                      var26 = 0;
                                      L8: while (true) {
                                        if (var8 <= var26) {
                                          break L7;
                                        } else {
                                          incrementValue$9 = var16;
                                          var16++;
                                          var12[0][incrementValue$9] = var2.f((byte) -101);
                                          var26++;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    if (var22 == null) {
                                      break L9;
                                    } else {
                                      if (mc.a(var22, 0)) {
                                        var9[1][var14] = we.field_i;
                                        var10[1][var14] = null;
                                        var11[1][var14] = var23;
                                        var2.field_g = var25;
                                        var14++;
                                        var26 = 0;
                                        L10: while (true) {
                                          if (var8 <= var26) {
                                            break L9;
                                          } else {
                                            incrementValue$10 = var17;
                                            var17++;
                                            var12[1][incrementValue$10] = var2.f((byte) -94);
                                            var26++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var15 >= var7) {
                                      break L11;
                                    } else {
                                      if (ok.field_rb[var21].field_e) {
                                        break L11;
                                      } else {
                                        ok.field_rb[var21].field_e = true;
                                        var9[2][var15] = var22;
                                        var10[2][var15] = ok.field_rb[var21].field_f;
                                        var11[2][var15] = var23;
                                        var15++;
                                        var2.field_g = var25;
                                        var26 = 0;
                                        L12: while (true) {
                                          if (var26 >= var8) {
                                            break L11;
                                          } else {
                                            incrementValue$11 = var18;
                                            var18++;
                                            var12[2][incrementValue$11] = var2.f((byte) -99);
                                            var26++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var20++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            L13: {
                              ok.field_rb[var9_int].field_a = var2.a(-24);
                              ok.field_rb[var9_int].field_e = false;
                              if (1 != var2.j(7909)) {
                                ok.field_rb[var9_int].field_f = null;
                                break L13;
                              } else {
                                ok.field_rb[var9_int].field_f = var2.a(-33);
                                break L13;
                              }
                            }
                            var9_int++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var5.field_j = true;
                    var5.b(4);
                    break L1;
                  }
                }
              } else {
                if (var3 != 1) {
                  hc.a((Throwable) null, "HS1: " + oe.a(-109), (byte) 70);
                  ec.a((byte) 27);
                  break L1;
                } else {
                  var4 = var2.i(-1174051992);
                  var5_long = var2.c((byte) 5);
                  var7_ref_re = (re) ((Object) s.field_e.c(-3905));
                  L14: while (true) {
                    L15: {
                      if (var7_ref_re == null) {
                        break L15;
                      } else {
                        if (var7_ref_re.field_g != var4) {
                          var7_ref_re = (re) ((Object) s.field_e.a(-16913));
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var7_ref_re != null) {
                      var7_ref_re.field_k = var5_long;
                      var7_ref_re.b(4);
                      break L1;
                    } else {
                      ec.a((byte) 27);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ak.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        RuntimeException var17 = null;
        int var17_int = 0;
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
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var43 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -1) {
                break L1;
              } else {
                if (param0 >= gl.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (-1 >= (param1 ^ -1)) {
                      break L2;
                    } else {
                      if (param13 >= 0) {
                        break L2;
                      } else {
                        if (-1 >= (param12 ^ -1)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (gl.field_f > param1) {
                      break L3;
                    } else {
                      if (gl.field_f > param13) {
                        break L3;
                      } else {
                        if (gl.field_f <= param12) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var35 = 3 % ((2 - param5) / 40);
                    var34 = param2 - param0;
                    if (param0 == param4) {
                      L5: {
                        if (param2 == param0) {
                          var18 = param13 << -696537104;
                          var28 = 0;
                          var29 = param8;
                          var20 = 0;
                          var24 = 0;
                          var31 = 0;
                          var17_int = param1 << -189363472;
                          var26 = param10;
                          var25 = param9;
                          var23 = 0;
                          var27 = 0;
                          var30 = param7;
                          var32 = 0;
                          var19 = 0;
                          var22 = param11;
                          var21 = param15;
                          break L5;
                        } else {
                          var36 = -param4 + param2;
                          if (param1 >= param13) {
                            var21 = param11 << -866068016;
                            var22 = param15 << -1175133840;
                            var30 = param8 << 1433556976;
                            var19 = (-param13 + param12 << 702761776) / var36;
                            var23 = (param16 + -param11 << 1299947120) / var36;
                            var29 = param7 << 1229241104;
                            var18 = param1 << 1889839856;
                            var26 = param9 << -1938459248;
                            var27 = (-param10 + param14 << -1953199472) / var36;
                            var24 = (param16 + -param15 << -1432157936) / var34;
                            var28 = (-param9 + param14 << 118413840) / var34;
                            var17_int = param13 << 949506480;
                            var25 = param10 << -903855952;
                            var31 = (-param7 + param3 << 150148752) / var36;
                            var20 = (-param1 + param12 << 1766238352) / var34;
                            var32 = (-param8 + param3 << -1922842192) / var34;
                            break L5;
                          } else {
                            var23 = (-param15 + param16 << -2114686864) / var34;
                            var28 = (-param10 + param14 << -1324215088) / var36;
                            var30 = param7 << -486505104;
                            var24 = (param16 + -param11 << 1483410160) / var36;
                            var26 = param10 << -367489744;
                            var17_int = param1 << 1614647184;
                            var25 = param9 << -1208807856;
                            var29 = param8 << 1316735536;
                            var19 = (param12 - param1 << 1319671696) / var34;
                            var32 = (param3 + -param7 << 1644594832) / var36;
                            var18 = param13 << -1198781840;
                            var22 = param11 << -372490416;
                            var27 = (param14 - param9 << 2106508112) / var34;
                            var31 = (-param8 + param3 << -503690576) / var34;
                            var21 = param15 << -291021648;
                            var20 = (param12 + -param13 << -368646992) / var36;
                            break L5;
                          }
                        }
                      }
                      var33 = 0;
                      if (0 <= param0) {
                        break L4;
                      } else {
                        param0 = Math.min(-param0, param4 - param0);
                        var30 = var30 + var32 * param0;
                        var18 = var18 + param0 * var20;
                        var17_int = var17_int + var19 * param0;
                        var22 = var22 + param0 * var24;
                        var21 = var21 + var23 * param0;
                        var26 = var26 + var28 * param0;
                        var29 = var29 + param0 * var31;
                        var25 = var25 + param0 * var27;
                        param0 = 0;
                        break L4;
                      }
                    } else {
                      L6: {
                        var18 = param1 << 1880032176;
                        var17_int = param1 << 1880032176;
                        var22 = param15 << 1430941360;
                        var21 = param15 << 1430941360;
                        var26 = param9 << 961864848;
                        var25 = param9 << 961864848;
                        var30 = param8 << -436093072;
                        var29 = param8 << -436093072;
                        var36 = -param0 + param4;
                        var19 = (param13 + -param1 << 1984726384) / var36;
                        var20 = (-param1 + param12 << -406512848) / var34;
                        if (var19 >= var20) {
                          var23 = (-param15 + param16 << -980114224) / var34;
                          var33 = 1;
                          var24 = (-param15 + param11 << 469594512) / var36;
                          var32 = (-param8 + param7 << -1270080976) / var36;
                          var31 = (-param8 + param3 << 753144560) / var34;
                          var37 = var19;
                          var19 = var20;
                          var20 = var37;
                          var28 = (-param9 + param10 << 253378064) / var36;
                          var27 = (-param9 + param14 << -1557940912) / var34;
                          break L6;
                        } else {
                          var32 = (-param8 + param3 << -2011544240) / var34;
                          var31 = (-param8 + param7 << -1048086384) / var36;
                          var27 = (-param9 + param10 << -2021694864) / var36;
                          var24 = (param16 + -param15 << 1530257232) / var34;
                          var28 = (-param9 + param14 << 1120008016) / var34;
                          var23 = (param11 - param15 << -1061558672) / var36;
                          var33 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (-1 >= (param0 ^ -1)) {
                            break L8;
                          } else {
                            if (-1 >= (param4 ^ -1)) {
                              param0 = -param0;
                              var17_int = var17_int + var19 * param0;
                              var18 = var18 + var20 * param0;
                              var21 = var21 + var23 * param0;
                              var26 = var26 + var28 * param0;
                              var25 = var25 + var27 * param0;
                              var22 = var22 + param0 * var24;
                              var29 = var29 + var31 * param0;
                              var30 = var30 + param0 * var32;
                              param0 = 0;
                              break L8;
                            } else {
                              param0 = param4 - param0;
                              var26 = var26 + var28 * param0;
                              var17_int = var17_int + var19 * param0;
                              var30 = var30 + param0 * var32;
                              var25 = var25 + var27 * param0;
                              var29 = var29 + var31 * param0;
                              var18 = var18 + var20 * param0;
                              var22 = var22 + param0 * var24;
                              var21 = var21 + var23 * param0;
                              param0 = param4;
                              break L7;
                            }
                          }
                        }
                        var37 = gl.field_c[param0];
                        L9: while (true) {
                          if (param0 >= param4) {
                            break L7;
                          } else {
                            L10: {
                              var38 = var17_int >> 1047896464;
                              if (gl.field_f <= var38) {
                                break L10;
                              } else {
                                var39 = -(var17_int >> -862826448) + (var18 >> -500177232);
                                if (var39 == 0) {
                                  if (var38 < 0) {
                                    break L10;
                                  } else {
                                    if (var38 >= gl.field_f) {
                                      break L10;
                                    } else {
                                      hb.a(0, var38 - -var37, 0, var29, var25, 68, var39, param6, var21, 0);
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    var40 = (-var21 + var22) / var39;
                                    var41 = (-var25 + var26) / var39;
                                    var42 = (-var29 + var30) / var39;
                                    if (gl.field_f <= var39 + var38) {
                                      var39 = gl.field_f - var38 - 1;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if ((var38 ^ -1) <= -1) {
                                    hb.a(var42, var37 + var38, var40, var29, var25, -18, var39, param6, var21, var41);
                                    break L10;
                                  } else {
                                    hb.a(var42, var37, var40, var29 + -(var42 * var38), -(var38 * var41) + var25, -39, var38 + var39, param6, var21 - var38 * var40, var41);
                                    break L10;
                                  }
                                }
                              }
                            }
                            param0++;
                            if (param0 >= gl.field_a) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var29 = var29 + var31;
                              var22 = var22 + var24;
                              var37 = var37 + ki.field_j;
                              var25 = var25 + var27;
                              var21 = var21 + var23;
                              var30 = var30 + var32;
                              var26 = var26 + var28;
                              var17_int = var17_int + var19;
                              var18 = var18 + var20;
                              continue L9;
                            }
                          }
                        }
                      }
                      var37 = -param4 + param2;
                      if (var37 != 0) {
                        L12: {
                          var38 = param12 << 775833232;
                          var39 = param16 << -2139707024;
                          var40 = param14 << 582831152;
                          if (var33 == 0) {
                            var25 = param10 << -2028421392;
                            var29 = param7 << -1986891792;
                            var17_int = param13 << 1185722096;
                            var21 = param11 << 488798512;
                            break L12;
                          } else {
                            var22 = param11 << -208223600;
                            var30 = param7 << 795414576;
                            var26 = param10 << -18704176;
                            var18 = param13 << -1910714448;
                            break L12;
                          }
                        }
                        var41 = param3 << 1198360752;
                        var24 = (var39 + -var22) / var37;
                        var28 = (-var26 + var40) / var37;
                        var23 = (var39 + -var21) / var37;
                        var27 = (-var25 + var40) / var37;
                        var19 = (-var17_int + var38) / var37;
                        var32 = (var41 - var30) / var37;
                        var20 = (var38 + -var18) / var37;
                        var31 = (var41 + -var29) / var37;
                        break L4;
                      } else {
                        var28 = 0;
                        var23 = 0;
                        var20 = 0;
                        var31 = 0;
                        var27 = 0;
                        var32 = 0;
                        var24 = 0;
                        var19 = 0;
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (0 <= param0) {
                      break L13;
                    } else {
                      param0 = -param0;
                      var22 = var22 + param0 * var24;
                      var17_int = var17_int + param0 * var19;
                      var26 = var26 + var28 * param0;
                      var21 = var21 + var23 * param0;
                      var25 = var25 + var27 * param0;
                      var29 = var29 + var31 * param0;
                      var30 = var30 + param0 * var32;
                      var18 = var18 + var20 * param0;
                      param0 = 0;
                      break L13;
                    }
                  }
                  var36 = gl.field_c[param0];
                  L14: while (true) {
                    if (param0 >= param2) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L15: {
                        var37 = var17_int >> -1967238096;
                        if (gl.field_f > var37) {
                          var38 = (var18 >> 2044761712) - (var17_int >> -946723696);
                          if (var38 == 0) {
                            if (-1 < (var37 ^ -1)) {
                              break L15;
                            } else {
                              if (gl.field_f > var37) {
                                hb.a(0, var37 + var36, 0, var29, var25, 77, var38, param6, var21, 0);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          } else {
                            L16: {
                              var39 = (var22 - var21) / var38;
                              var40 = (-var25 + var26) / var38;
                              var41 = (-var29 + var30) / var38;
                              if (var37 + var38 >= gl.field_f) {
                                var38 = gl.field_f + -var37 - 1;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            if (-1 >= (var37 ^ -1)) {
                              hb.a(var41, var36 + var37, var39, var29, var25, -22, var38, param6, var21, var40);
                              break L15;
                            } else {
                              hb.a(var41, var36, var39, -(var37 * var41) + var29, var25 - var40 * var37, -58, var38 + var37, param6, -(var37 * var39) + var21, var40);
                              break L15;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      param0++;
                      if (param0 < gl.field_a) {
                        var36 = var36 + ki.field_j;
                        var21 = var21 + var23;
                        var18 = var18 + var20;
                        var26 = var26 + var28;
                        var22 = var22 + var24;
                        var25 = var25 + var27;
                        var29 = var29 + var31;
                        var30 = var30 + var32;
                        var17_int = var17_int + var19;
                        continue L14;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var17 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var17);
            stackOut_74_1 = new StringBuilder().append("ak.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param6 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L17;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L17;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    ak(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_b = mg.a(param0.length, param0, (byte) -67);
            if (param1 != this.field_b) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_n = bd.a(param0.length, param0, (byte) 70, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != this.field_n[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, -111);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new hl(270, 70);
        field_h = 480;
    }
}
