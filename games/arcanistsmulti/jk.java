/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static int field_u;
    private int[][] field_q;
    byte[][] field_k;
    private int field_w;
    int[] field_h;
    private int[] field_t;
    static qb field_o;
    private byte[] field_x;
    static ll[] field_n;
    int[][] field_e;
    static String field_d;
    static String field_j;
    int[] field_r;
    int[] field_i;
    static ll[] field_m;
    int field_p;
    static int[] field_a;
    static String field_s;
    n[] field_c;
    int field_g;
    int[] field_y;
    int field_f;
    int[] field_b;
    n field_l;
    static String field_v;

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
        wk var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new wk(hb.a(false, param0));
              var4 = var17.e((byte) 31);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      ((jk) this).field_g = var17.d(-10674);
                      break L2;
                    } else {
                      ((jk) this).field_g = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.e((byte) 94);
                    if (0 == (var5 & 1)) {
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
                    if ((2 & var5) == 0) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (7 > var4) {
                      ((jk) this).field_w = var17.n(-98);
                      break L5;
                    } else {
                      ((jk) this).field_w = var17.a((byte) -29);
                      break L5;
                    }
                  }
                  var8 = 0;
                  L6: {
                    ((jk) this).field_r = new int[((jk) this).field_w];
                    var9 = -1;
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (((jk) this).field_w <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.n(-98);
                            var8 = dupTemp$4;
                            ((jk) this).field_r[var10] = dupTemp$4;
                            if (((jk) this).field_r[var10] <= var9) {
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
                        if (((jk) this).field_w <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.a((byte) -29);
                            var8 = dupTemp$5;
                            ((jk) this).field_r[var10] = dupTemp$5;
                            if (var9 >= ((jk) this).field_r[var10]) {
                              break L10;
                            } else {
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
                    ((jk) this).field_f = var9 + 1;
                    ((jk) this).field_e = new int[((jk) this).field_f][];
                    ((jk) this).field_i = new int[((jk) this).field_f];
                    ((jk) this).field_y = new int[((jk) this).field_f];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((jk) this).field_k = new byte[((jk) this).field_f][];
                      break L11;
                    }
                  }
                  L12: {
                    ((jk) this).field_b = new int[((jk) this).field_f];
                    ((jk) this).field_h = new int[((jk) this).field_f];
                    if (var6 != 0) {
                      ((jk) this).field_t = new int[((jk) this).field_f];
                      var10 = 0;
                      L13: while (true) {
                        if (((jk) this).field_f <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((jk) this).field_w) {
                              ((jk) this).field_l = new n(((jk) this).field_t);
                              break L12;
                            } else {
                              ((jk) this).field_t[((jk) this).field_r[var10]] = var17.d(hh.a(12, -10686));
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((jk) this).field_t[var10] = -1;
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
                    if (((jk) this).field_w <= var10) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (((jk) this).field_w <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= ((jk) this).field_w) {
                                  break L16;
                                } else {
                                  ((jk) this).field_y[((jk) this).field_r[var10]] = var17.d(-10674);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a((byte) 45, 0, var21, 64);
                              ((jk) this).field_k[((jk) this).field_r[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (var10 >= ((jk) this).field_w) {
                              break L16;
                            } else {
                              ((jk) this).field_y[((jk) this).field_r[var10]] = var17.d(-10674);
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (7 <= var4) {
                          var10 = 0;
                          L21: while (true) {
                            if (((jk) this).field_w <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (((jk) this).field_w <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((jk) this).field_r[var10];
                                  var12 = ((jk) this).field_b[var11];
                                  var8 = 0;
                                  ((jk) this).field_e[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      L24: {
                                        ((jk) this).field_i[var11] = var13 - -1;
                                        if (1 + var13 == var12) {
                                          ((jk) this).field_e[var11] = null;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        int dupTemp$6 = var8 + var17.a((byte) -29);
                                        var8 = dupTemp$6;
                                        ((jk) this).field_e[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var14++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((jk) this).field_b[((jk) this).field_r[var10]] = var17.a((byte) -29);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (var10 >= ((jk) this).field_w) {
                              var10 = 0;
                              L27: while (true) {
                                if (((jk) this).field_w <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((jk) this).field_r[var10];
                                  var12 = ((jk) this).field_b[var11];
                                  var8 = 0;
                                  ((jk) this).field_e[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var14 >= var12) {
                                      L29: {
                                        ((jk) this).field_i[var11] = 1 + var13;
                                        if (var12 != var13 + 1) {
                                          break L29;
                                        } else {
                                          ((jk) this).field_e[var11] = null;
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        int dupTemp$7 = var8 + var17.n(-98);
                                        var8 = dupTemp$7;
                                        ((jk) this).field_e[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if (var13 >= var15) {
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      var14++;
                                      continue L28;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((jk) this).field_b[((jk) this).field_r[var10]] = var17.n(-98);
                              var10++;
                              continue L26;
                            }
                          }
                        }
                      }
                      L31: {
                        if (var6 != 0) {
                          ((jk) this).field_c = new n[var9 - -1];
                          ((jk) this).field_q = new int[var9 - -1][];
                          var10 = 0;
                          L32: while (true) {
                            if (var10 >= ((jk) this).field_w) {
                              break L31;
                            } else {
                              var11 = ((jk) this).field_r[var10];
                              var12 = ((jk) this).field_b[var11];
                              ((jk) this).field_q[var11] = new int[((jk) this).field_i[var11]];
                              var13 = 0;
                              L33: while (true) {
                                if (var13 >= ((jk) this).field_i[var11]) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var13 >= var12) {
                                      ((jk) this).field_c[var11] = new n(((jk) this).field_q[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (((jk) this).field_e[var11] != null) {
                                          var14 = ((jk) this).field_e[var11][var13];
                                          break L35;
                                        } else {
                                          var14 = var13;
                                          break L35;
                                        }
                                      }
                                      ((jk) this).field_q[var11][var14] = var17.d(hh.a(12, -10686));
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  ((jk) this).field_q[var11][var13] = -1;
                                  var13++;
                                  continue L33;
                                }
                              }
                            }
                          }
                        } else {
                          break L31;
                        }
                      }
                      break L0;
                    } else {
                      ((jk) this).field_h[((jk) this).field_r[var10]] = var17.d(-10674);
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
          L36: {
            var3 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) var3;
            stackOut_98_1 = new StringBuilder().append("jk.D(");
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param0 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L36;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L36;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + ',' + 12 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_a = null;
        field_d = null;
        field_s = null;
        field_n = null;
        field_o = null;
        field_j = null;
        field_v = null;
    }

    final static String a(int param0, jg param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        String stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                var5 = null;
                String discarded$1 = jk.a(-73, (jg) null);
                break L1;
              }
            }
            L2: {
              var2 = null;
              if (param1.field_g != null) {
                L3: {
                  var6 = param1.field_g;
                  if (1 == param1.field_b) {
                    var2 = (Object) (Object) ("<img=0>" + var6);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param1.field_b == 2) {
                  var2 = (Object) (Object) ("<img=1>" + (String) var2);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L4: {
              var3 = "";
              if (param1.field_m != 2) {
                L5: {
                  if (0 != param1.field_m) {
                    break L5;
                  } else {
                    if (!hm.field_c) {
                      break L5;
                    } else {
                      var3 = "[" + lj.field_p + "] ";
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param1.field_m == 1) {
                    var3 = "[" + tj.a(-44, new String[1], ul.field_j) + "] ";
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_m != 4) {
                    break L7;
                  } else {
                    if (null == he.field_d) {
                      break L7;
                    } else {
                      var3 = "[" + he.field_d + "] ";
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param1.field_m == 3) {
                    var3 = "[#" + param1.field_o + "] ";
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (param1.field_i) {
                  break L4;
                } else {
                  var3 = var3 + (String) var2 + ": ";
                  break L4;
                }
              } else {
                if (param1.field_i) {
                  break L4;
                } else {
                  L9: {
                    if (param1.field_d != 0) {
                      break L9;
                    } else {
                      if (0 == param1.field_k) {
                        var3 = tj.a(param0 + -130, new String[1], ge.field_n);
                        break L4;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var3 = tj.a(-18, new String[1], pk.field_f);
                  break L4;
                }
              }
            }
            stackOut_32_0 = (String) var3;
            stackIn_33_0 = stackOut_32_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_34_0 = var2;
            stackOut_34_1 = new StringBuilder().append("jk.F(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_33_0;
    }

    final static void a(int param0, v param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              L2: {
                ob.field_Y = param1;
                if (ob.field_Y == null) {
                  break L2;
                } else {
                  if (ob.field_Y.field_l) {
                    stackOut_4_0 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            li.a(stackIn_5_0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("jk.A(").append(-113).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static boolean b() {
        int var1 = 0;
        return re.a((byte) -68, cd.e(122));
    }

    final static void a() {
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == jb.field_z) {
          return;
        } else {
          L0: {
            if (!jb.field_z.field_i) {
              if ((1 << jb.field_z.field_I & jb.field_z.field_b) == 0) {
                if (jb.field_z.field_b != 0) {
                  ce.field_g[12] = mo.field_g;
                  break L0;
                } else {
                  if ((jb.field_z.field_a | 1 << jb.field_z.field_I) == (1 << jb.field_z.field_V.s(0)) - 1) {
                    ce.field_g[12] = rb.field_m;
                    break L0;
                  } else {
                    ce.field_g[12] = ra.field_n;
                    break L0;
                  }
                }
              } else {
                ce.field_g[12] = eh.field_d;
                break L0;
              }
            } else {
              if ((1 << jb.field_z.field_I & jb.field_z.field_b) != 0) {
                ce.field_g[12] = vm.field_e;
                break L0;
              } else {
                if (0 == jb.field_z.field_b) {
                  if ((1 << jb.field_z.field_I | jb.field_z.field_a) != -1 + (1 << jb.field_z.field_V.s(0))) {
                    ce.field_g[12] = nl.field_Bb;
                    break L0;
                  } else {
                    ce.field_g[12] = so.field_b;
                    break L0;
                  }
                } else {
                  ce.field_g[12] = ng.field_H;
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    jk(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((jk) this).field_p = mj.a(param0.length, (byte) -104, param0);
            if (param1 != ((jk) this).field_p) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != param2.length) {
                    throw new RuntimeException();
                }
                ((jk) this).field_x = nn.a(param0.length, (byte) -93, param0, 0);
                for (var4_int = 0; -65 > var4_int; var4_int++) {
                    if (((jk) this).field_x[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            int discarded$0 = 12;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Game Options";
        field_s = "Your email address is used to identify this account";
        field_a = new int[]{2, 3, 4, 5, 6};
        field_d = "Not enough wands to buy (";
        field_v = "This is the Book of Underdark. Underdark spells focus on stealing health and turning minions into zombies. You require 5 wands to purchase this spellbook; you currently have ";
    }
}
