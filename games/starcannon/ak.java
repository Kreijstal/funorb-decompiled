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
        var16 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var17 = new rb(hc.a((byte) 51, param0));
              var4 = var17.j(7909);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((ak) this).field_q = 0;
                      break L2;
                    } else {
                      ((ak) this).field_q = var17.f((byte) -84);
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
                      ((ak) this).field_o = var17.i(-1174051992);
                      break L4;
                    } else {
                      ((ak) this).field_o = var17.e(113);
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
                    ((ak) this).field_g = new int[((ak) this).field_o];
                    var9 = -1;
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (((ak) this).field_o <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.i(-1174051992);
                            var8 = dupTemp$4;
                            ((ak) this).field_g[var10] = dupTemp$4;
                            if (~var9 > ~((ak) this).field_g[var10]) {
                              var9 = ((ak) this).field_g[var10];
                              break L8;
                            } else {
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
                        if (~var10 <= ~((ak) this).field_o) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.e(90);
                            var8 = dupTemp$5;
                            ((ak) this).field_g[var10] = dupTemp$5;
                            if (~((ak) this).field_g[var10] >= ~var9) {
                              break L10;
                            } else {
                              var9 = ((ak) this).field_g[var10];
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
                    ((ak) this).field_m = var9 + 1;
                    ((ak) this).field_c = new int[((ak) this).field_m];
                    ((ak) this).field_d = new int[((ak) this).field_m];
                    ((ak) this).field_i = new int[((ak) this).field_m];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((ak) this).field_p = new byte[((ak) this).field_m][];
                      break L11;
                    }
                  }
                  L12: {
                    ((ak) this).field_k = new int[((ak) this).field_m][];
                    ((ak) this).field_j = new int[((ak) this).field_m];
                    if (var6 != 0) {
                      ((ak) this).field_r = new int[((ak) this).field_m];
                      var10 = 0;
                      L13: while (true) {
                        if (~((ak) this).field_m >= ~var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (~((ak) this).field_o >= ~var10) {
                              ((ak) this).field_l = new dl(((ak) this).field_r);
                              break L12;
                            } else {
                              ((ak) this).field_r[((ak) this).field_g[var10]] = var17.f((byte) -109);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((ak) this).field_r[var10] = -1;
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
                    if (~((ak) this).field_o >= ~var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (~((ak) this).field_o >= ~var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(64, (byte) 88, var21, 0);
                              ((ak) this).field_p[((ak) this).field_g[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((ak) this).field_o) {
                          L19: {
                            if (7 > var4) {
                              var10 = 0;
                              L20: while (true) {
                                if (~var10 <= ~((ak) this).field_o) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((ak) this).field_o) {
                                      break L19;
                                    } else {
                                      var11 = ((ak) this).field_g[var10];
                                      var8 = 0;
                                      var12 = ((ak) this).field_i[var11];
                                      ((ak) this).field_k[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (~var12 >= ~var14) {
                                          L23: {
                                            ((ak) this).field_j[var11] = 1 + var13;
                                            if (var12 != var13 - -1) {
                                              break L23;
                                            } else {
                                              ((ak) this).field_k[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.i(-1174051992);
                                            var8 = dupTemp$6;
                                            ((ak) this).field_k[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (~var13 > ~var15) {
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
                                  ((ak) this).field_i[((ak) this).field_g[var10]] = var17.i(-1174051992);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((ak) this).field_o) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (~((ak) this).field_o >= ~var10) {
                                      break L19;
                                    } else {
                                      var11 = ((ak) this).field_g[var10];
                                      var8 = 0;
                                      var12 = ((ak) this).field_i[var11];
                                      var13 = -1;
                                      ((ak) this).field_k[var11] = new int[var12];
                                      var14 = 0;
                                      L27: while (true) {
                                        if (~var14 <= ~var12) {
                                          L28: {
                                            ((ak) this).field_j[var11] = 1 + var13;
                                            if (1 + var13 == var12) {
                                              ((ak) this).field_k[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.e(74);
                                            var8 = dupTemp$7;
                                            ((ak) this).field_k[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (~var15 >= ~var13) {
                                              break L29;
                                            } else {
                                              var13 = var15;
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
                                  ((ak) this).field_i[((ak) this).field_g[var10]] = var17.e(-116);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 == 0) {
                              break L30;
                            } else {
                              ((ak) this).field_s = new dl[var9 + 1];
                              ((ak) this).field_a = new int[var9 + 1][];
                              var10 = 0;
                              L31: while (true) {
                                if (((ak) this).field_o <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((ak) this).field_g[var10];
                                  var12 = ((ak) this).field_i[var11];
                                  ((ak) this).field_a[var11] = new int[((ak) this).field_j[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (var13 >= ((ak) this).field_j[var11]) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (~var12 >= ~var13) {
                                          ((ak) this).field_s[var11] = new dl(((ak) this).field_a[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null == ((ak) this).field_k[var11]) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = ((ak) this).field_k[var11][var13];
                                              break L34;
                                            }
                                          }
                                          ((ak) this).field_a[var11][var14] = var17.f((byte) -108);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((ak) this).field_a[var11][var13] = -1;
                                      var13++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          ((ak) this).field_d[((ak) this).field_g[var10]] = var17.f((byte) -115);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((ak) this).field_c[((ak) this).field_g[var10]] = var17.f((byte) -107);
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
          L35: {
            var3 = decompiledCaughtException;
            stackOut_93_0 = (RuntimeException) var3;
            stackOut_93_1 = new StringBuilder().append("ak.C(");
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
          throw sd.a((Throwable) (Object) stackIn_96_0, stackIn_96_2 + 44 + -111 + 41);
        }
    }

    final static void a(int param0) {
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
        RuntimeException decompiledCaughtException = null;
        var27 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var1_int = 0;
              var2 = se.field_p;
              var3 = var2.j(7909);
              if (var3 == 0) {
                var4 = var2.i(-1174051992);
                var5 = (vc) (Object) ne.field_c.c(-3905);
                L2: while (true) {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var4 == var5.field_i) {
                        break L3;
                      } else {
                        var5 = (vc) (Object) ne.field_c.a(-16913);
                        continue L2;
                      }
                    }
                  }
                  if (var5 == null) {
                    ec.a((byte) 27);
                    return;
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
                            String[][] dupTemp$6 = new String[3][var7];
                            var5.field_n = dupTemp$6;
                            var9 = dupTemp$6;
                            var10 = new String[3][var7];
                            long[][] dupTemp$7 = new long[3][var7];
                            var5.field_g = dupTemp$7;
                            var11 = dupTemp$7;
                            int[][] dupTemp$8 = new int[3][var8 * var7];
                            var5.field_o = dupTemp$8;
                            var12 = dupTemp$8;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                            var19 = var2.j(7909);
                            if (var19 <= 0) {
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
                                          int incrementValue$9 = var16;
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
                                            int incrementValue$10 = var17;
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
                                            int incrementValue$11 = var18;
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
                  var7_ref_re = (re) (Object) s.field_e.c(-3905);
                  L14: while (true) {
                    L15: {
                      if (var7_ref_re == null) {
                        break L15;
                      } else {
                        if (var7_ref_re.field_g != var4) {
                          var7_ref_re = (re) (Object) s.field_e.a(-16913);
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
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "ak.A(" + 70 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        L0: {
          var43 = StarCannon.field_A;
          if (param2 < 0) {
            break L0;
          } else {
            if (~param0 <= ~gl.field_a) {
              break L0;
            } else {
              L1: {
                if (param1 >= 0) {
                  break L1;
                } else {
                  if (param13 >= 0) {
                    break L1;
                  } else {
                    if (param12 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (gl.field_f > param1) {
                  break L2;
                } else {
                  if (~gl.field_f < ~param13) {
                    break L2;
                  } else {
                    if (~gl.field_f >= ~param12) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var35 = 3 % ((2 - param5) / 40);
                var34 = param2 - param0;
                if (param0 == param4) {
                  L4: {
                    if (~param2 == ~param0) {
                      var18 = param13 << 16;
                      var28 = 0;
                      var29 = param8;
                      var20 = 0;
                      var24 = 0;
                      var31 = 0;
                      var17_int = param1 << 16;
                      var26 = param10;
                      var25 = param9;
                      var23 = 0;
                      var27 = 0;
                      var30 = param7;
                      var32 = 0;
                      var19 = 0;
                      var22 = param11;
                      var21 = param15;
                      break L4;
                    } else {
                      var36 = -param4 + param2;
                      if (param1 >= param13) {
                        var21 = param11 << 16;
                        var22 = param15 << 16;
                        var30 = param8 << 16;
                        var19 = (-param13 + param12 << 16) / var36;
                        var23 = (param16 + -param11 << 16) / var36;
                        var29 = param7 << 16;
                        var18 = param1 << 16;
                        var26 = param9 << 16;
                        var27 = (-param10 + param14 << 16) / var36;
                        var24 = (param16 + -param15 << 16) / var34;
                        var28 = (-param9 + param14 << 16) / var34;
                        var17_int = param13 << 16;
                        var25 = param10 << 16;
                        var31 = (-param7 + param3 << 16) / var36;
                        var20 = (-param1 + param12 << 16) / var34;
                        var32 = (-param8 + param3 << 16) / var34;
                        break L4;
                      } else {
                        var23 = (-param15 + param16 << 16) / var34;
                        var28 = (-param10 + param14 << 16) / var36;
                        var30 = param7 << 16;
                        var24 = (param16 + -param11 << 16) / var36;
                        var26 = param10 << 16;
                        var17_int = param1 << 16;
                        var25 = param9 << 16;
                        var29 = param8 << 16;
                        var19 = (param12 - param1 << 16) / var34;
                        var32 = (param3 + -param7 << 16) / var36;
                        var18 = param13 << 16;
                        var22 = param11 << 16;
                        var27 = (param14 - param9 << 16) / var34;
                        var31 = (-param8 + param3 << 16) / var34;
                        var21 = param15 << 16;
                        var20 = (param12 + -param13 << 16) / var36;
                        break L4;
                      }
                    }
                  }
                  var33 = 0;
                  if (0 <= param0) {
                    break L3;
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
                    break L3;
                  }
                } else {
                  L5: {
                    var18 = param1 << 16;
                    var17_int = param1 << 16;
                    var22 = param15 << 16;
                    var21 = param15 << 16;
                    var26 = param9 << 16;
                    var25 = param9 << 16;
                    var30 = param8 << 16;
                    var29 = param8 << 16;
                    var36 = -param0 + param4;
                    var19 = (param13 + -param1 << 16) / var36;
                    var20 = (-param1 + param12 << 16) / var34;
                    if (~var19 <= ~var20) {
                      var23 = (-param15 + param16 << 16) / var34;
                      var33 = 1;
                      var24 = (-param15 + param11 << 16) / var36;
                      var32 = (-param8 + param7 << 16) / var36;
                      var31 = (-param8 + param3 << 16) / var34;
                      var37 = var19;
                      var19 = var20;
                      var20 = var37;
                      var28 = (-param9 + param10 << 16) / var36;
                      var27 = (-param9 + param14 << 16) / var34;
                      break L5;
                    } else {
                      var32 = (-param8 + param3 << 16) / var34;
                      var31 = (-param8 + param7 << 16) / var36;
                      var27 = (-param9 + param10 << 16) / var36;
                      var24 = (param16 + -param15 << 16) / var34;
                      var28 = (-param9 + param14 << 16) / var34;
                      var23 = (param11 - param15 << 16) / var36;
                      var33 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param0 >= 0) {
                        break L7;
                      } else {
                        if (param4 >= 0) {
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
                          break L7;
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
                          break L6;
                        }
                      }
                    }
                    var37 = gl.field_c[param0];
                    L8: while (true) {
                      if (~param0 <= ~param4) {
                        break L6;
                      } else {
                        L9: {
                          var38 = var17_int >> 16;
                          if (gl.field_f <= var38) {
                            break L9;
                          } else {
                            var39 = -(var17_int >> 16) + (var18 >> 16);
                            if (var39 == 0) {
                              if (var38 < 0) {
                                break L9;
                              } else {
                                if (~var38 <= ~gl.field_f) {
                                  break L9;
                                } else {
                                  hb.a(0, var38 - -var37, 0, var29, var25, 68, var39, param6, var21, 0);
                                  break L9;
                                }
                              }
                            } else {
                              L10: {
                                var40 = (-var21 + var22) / var39;
                                var41 = (-var25 + var26) / var39;
                                var42 = (-var29 + var30) / var39;
                                if (gl.field_f <= var39 + var38) {
                                  var39 = gl.field_f - var38 - 1;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var38 >= 0) {
                                hb.a(var42, var37 + var38, var40, var29, var25, -18, var39, param6, var21, var41);
                                break L9;
                              } else {
                                hb.a(var42, var37, var40, var29 + -(var42 * var38), -(var38 * var41) + var25, -39, var38 + var39, param6, var21 - var38 * var40, var41);
                                break L9;
                              }
                            }
                          }
                        }
                        param0++;
                        if (~param0 <= ~gl.field_a) {
                          return;
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
                          continue L8;
                        }
                      }
                    }
                  }
                  var37 = -param4 + param2;
                  if (var37 != 0) {
                    L11: {
                      var38 = param12 << 16;
                      var39 = param16 << 16;
                      var40 = param14 << 16;
                      if (var33 == 0) {
                        var25 = param10 << 16;
                        var29 = param7 << 16;
                        var17_int = param13 << 16;
                        var21 = param11 << 16;
                        break L11;
                      } else {
                        var22 = param11 << 16;
                        var30 = param7 << 16;
                        var26 = param10 << 16;
                        var18 = param13 << 16;
                        break L11;
                      }
                    }
                    var41 = param3 << 16;
                    var24 = (var39 + -var22) / var37;
                    var28 = (-var26 + var40) / var37;
                    var23 = (var39 + -var21) / var37;
                    var27 = (-var25 + var40) / var37;
                    var19 = (-var17_int + var38) / var37;
                    var32 = (var41 - var30) / var37;
                    var20 = (var38 + -var18) / var37;
                    var31 = (var41 + -var29) / var37;
                    break L3;
                  } else {
                    var28 = 0;
                    var23 = 0;
                    var20 = 0;
                    var31 = 0;
                    var27 = 0;
                    var32 = 0;
                    var24 = 0;
                    var19 = 0;
                    break L3;
                  }
                }
              }
              L12: {
                if (0 <= param0) {
                  break L12;
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
                  break L12;
                }
              }
              var36 = gl.field_c[param0];
              L13: while (true) {
                if (~param0 <= ~param2) {
                  return;
                } else {
                  L14: {
                    var37 = var17_int >> 16;
                    if (~gl.field_f < ~var37) {
                      var38 = (var18 >> 16) - (var17_int >> 16);
                      if (var38 == 0) {
                        if (var37 < 0) {
                          break L14;
                        } else {
                          if (~gl.field_f < ~var37) {
                            hb.a(0, var37 + var36, 0, var29, var25, 77, var38, param6, var21, 0);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      } else {
                        L15: {
                          var39 = (var22 - var21) / var38;
                          var40 = (-var25 + var26) / var38;
                          var41 = (-var29 + var30) / var38;
                          if (var37 + var38 >= gl.field_f) {
                            var38 = gl.field_f + -var37 - 1;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if (var37 >= 0) {
                          hb.a(var41, var36 + var37, var39, var29, var25, -22, var38, param6, var21, var40);
                          break L14;
                        } else {
                          hb.a(var41, var36, var39, -(var37 * var41) + var29, var25 - var40 * var37, -58, var38 + var37, param6, -(var37 * var39) + var21, var40);
                          break L14;
                        }
                      }
                    } else {
                      break L14;
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
                    continue L13;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    ak(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((ak) this).field_b = mg.a(param0.length, param0, (byte) -67);
            if (param1 != ((ak) this).field_b) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((ak) this).field_n = bd.a(param0.length, param0, (byte) 70, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((ak) this).field_n[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, -111);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ak.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new hl(270, 70);
        field_h = 480;
    }
}
